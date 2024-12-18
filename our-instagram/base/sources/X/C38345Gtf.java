package X;

/* renamed from: X.Gtf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38345Gtf extends AbstractC65412xd {
    public static final C38345Gtf A00 = new Object();

    @Override // X.AbstractC65412xd
    public final /* bridge */ /* synthetic */ boolean areItemsTheSame(Object obj, Object obj2) {
        C120985dq c120985dq = (C120985dq) obj;
        C120985dq c120985dq2 = (C120985dq) obj2;
        AbstractC167017dG.A1N(c120985dq, c120985dq2);
        return C14360o3.A0K(c120985dq.getId(), c120985dq2.getId());
    }

    @Override // X.AbstractC65412xd
    public final /* bridge */ /* synthetic */ boolean areContentsTheSame(Object obj, Object obj2) {
        AbstractC167017dG.A1N(obj, obj2);
        return obj.equals(obj2);
    }
}
