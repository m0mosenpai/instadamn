package X;

/* renamed from: X.2NK, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2NK extends C2NB {
    @Override // X.C2NB
    public final int A00() {
        return 7;
    }

    @Override // X.C2NB
    public final boolean A01(C48412Ki c48412Ki) {
        C14360o3.A0B(c48412Ki, 0);
        if (c48412Ki.A0B.A02 != C05F.A0N) {
            return false;
        }
        return true;
    }

    static {
        C14360o3.A07(C48442Kl.A01("NetworkNotRoamingCtrlr"));
    }

    @Override // X.C2NB
    public final /* bridge */ /* synthetic */ boolean A02(Object obj) {
        C50Y c50y = (C50Y) obj;
        C14360o3.A0B(c50y, 0);
        if (c50y.A00 && c50y.A02) {
            return false;
        }
        return true;
    }
}