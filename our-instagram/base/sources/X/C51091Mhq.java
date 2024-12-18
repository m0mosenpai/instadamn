package X;

/* renamed from: X.Mhq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51091Mhq extends AbstractC65412xd {
    public static final C51091Mhq A00 = new Object();

    @Override // X.AbstractC65412xd
    public final /* bridge */ /* synthetic */ boolean areContentsTheSame(Object obj, Object obj2) {
        C38687GzS c38687GzS = (C38687GzS) obj;
        C38687GzS c38687GzS2 = (C38687GzS) obj2;
        AbstractC167017dG.A1N(c38687GzS, c38687GzS2);
        return AbstractC167007dF.A1X(c38687GzS.A00, c38687GzS2.A00);
    }

    @Override // X.AbstractC65412xd
    public final /* bridge */ /* synthetic */ boolean areItemsTheSame(Object obj, Object obj2) {
        AbstractC167017dG.A1N(obj, obj2);
        return obj.equals(obj2);
    }
}
