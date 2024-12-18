package X;

/* renamed from: X.CtR, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29160CtR implements InterfaceC66482zP {
    public final C32072E6y A00;
    public final C27875CQm A01;
    public final String A02;

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        String str;
        C29160CtR c29160CtR = (C29160CtR) obj;
        String str2 = this.A02;
        if (c29160CtR != null) {
            str = c29160CtR.A02;
        } else {
            str = null;
        }
        if (C14360o3.A0K(str2, str) && C14360o3.A0K(this.A00, c29160CtR.A00)) {
            return true;
        }
        return false;
    }

    public C29160CtR(C32072E6y c32072E6y, C27875CQm c27875CQm, String str) {
        this.A02 = str;
        this.A00 = c32072E6y;
        this.A01 = c27875CQm;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A02;
    }
}
