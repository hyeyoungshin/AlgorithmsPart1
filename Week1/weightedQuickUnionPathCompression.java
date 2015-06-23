class WeightedQuickUnionPathCompression {
    private int[] id;
    private int[] sz;

    public WeightedQuickUnionPathCompression(int N)
    {
	id = new int[N];
	sz = new int[N];
	for(int i = 0; i < N; i++)
	{
	        id[i] = i;
	}
    }

    public boolean connected(int p, int q)
    {
	return root(p) == root(q);
    }

    private int root(int p)
    {
	while(i != id[i])
	   id[i] = id[id[i]]; // make every other node in path point to its grandparent thereby halving path length
	    i = id[i];
	return i;
    }
    
		 
    public void union(int p, int q)
    {
	int rootP = root(p);
	int rootQ = root(q);

	if(id[rootP] == id[rootQ])
	    return;
	if(sz[rootP] < sz[rootQ])
        {
	    id[rootP] = rootQ;
	    sz[rootQ] += sz[rootP];
	}
	else
	{
	    id[rootQ] = rootP;
	    sz[rootP] = rootQ;
	}
    }
