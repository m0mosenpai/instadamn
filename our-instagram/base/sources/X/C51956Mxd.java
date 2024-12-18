package X;

/* renamed from: X.Mxd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51956Mxd extends C0T6 implements InterfaceC57890Plu {
    public final int A00 = 1;
    public final Object A01;

    public C51956Mxd(EnumC50631MWs enumC50631MWs) {
        C14360o3.A0B(enumC50631MWs, 1);
        this.A01 = enumC50631MWs;
    }

    public static boolean A00(Object obj, int i) {
        if ((obj instanceof C51956Mxd) && ((C51956Mxd) obj).A00 == i) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this.A00 != 0) {
            if (this != obj) {
                if (!A00(obj, 1) || !C14360o3.A0K(this.A01, ((C51956Mxd) obj).A01)) {
                    return false;
                }
                return true;
            }
            return true;
        }
        if (this != obj) {
            if (!A00(obj, 0) || this.A01 != ((C51956Mxd) obj).A01) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }

    public C51956Mxd(C120985dq c120985dq) {
        C14360o3.A0B(c120985dq, 1);
        this.A01 = c120985dq;
    }
}
