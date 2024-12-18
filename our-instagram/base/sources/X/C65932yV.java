package X;

/* renamed from: X.2yV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C65932yV implements InterfaceC65942yW {
    public static Boolean A00;
    public static Boolean A01;

    @Override // X.InterfaceC65952yX
    public final /* bridge */ /* synthetic */ boolean EjD(Object obj) {
        C3XG c3xg = (C3XG) obj;
        C14360o3.A0B(c3xg, 0);
        C1XV c1xv = c3xg.A06;
        if (c1xv == C1XV.A0Y) {
            C38321qM A02 = C3XH.A02(c3xg.A05);
            if (A02 == null || A02.A6H() || A02.CdW() || A02.A61()) {
                return false;
            }
        } else if (c1xv != C1XV.A0V && (c1xv == C1XV.A0F || c1xv == C1XV.A0E || c1xv == C1XV.A0D)) {
            return false;
        }
        return true;
    }
}
