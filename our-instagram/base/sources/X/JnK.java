package X;

/* loaded from: classes8.dex */
public final class JnK extends AbstractC65412xd {
    public final int A00;

    public JnK(int i) {
        this.A00 = i;
    }

    @Override // X.AbstractC65412xd
    public final /* bridge */ /* synthetic */ boolean areItemsTheSame(Object obj, Object obj2) {
        if (this.A00 != 0) {
            C32062E6o c32062E6o = (C32062E6o) obj;
            C32062E6o c32062E6o2 = (C32062E6o) obj2;
            AbstractC167017dG.A1N(c32062E6o, c32062E6o2);
            return C14360o3.A0K(c32062E6o.A03, c32062E6o2.A03);
        }
        Object obj3 = (MNF) obj;
        Object obj4 = (MNF) obj2;
        AbstractC167017dG.A1N(obj3, obj4);
        if ((obj3 instanceof K2N) && (obj4 instanceof K2N)) {
            obj3 = ((K2N) obj3).A00.A06;
            obj4 = ((K2N) obj4).A00.A06;
        }
        return C14360o3.A0K(obj3, obj4);
    }

    @Override // X.AbstractC65412xd
    public final /* bridge */ /* synthetic */ boolean areContentsTheSame(Object obj, Object obj2) {
        AbstractC167017dG.A1N(obj, obj2);
        return obj.equals(obj2);
    }
}
