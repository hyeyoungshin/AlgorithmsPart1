public class QuickUnionTwoPass
{
    private int[] id;

    public QuickUnionTwoPass(int N)
    {
	id = new int[N};
	for (int i = 0; i < N; i++)
	{
	    id[i] = i;
	}
    }

    private int root(int i)
    {
	int root = i;
	while(root != id[i]) root = id[i];
        while(i != id[i]) id[i] = root;
	return root;
    }

    public boolean connected(int p, int q)
    {
	return root(p) == root(q);
    }

    public void union(int p, int q)
    {
	int rootP = root(p);
	int rootQ = root(q);

	id[rootP] = rootQ;
    }
}
