package X;

import com.instagram.api.schemas.RemoteBooleanSettingId;
import com.instagram.api.schemas.RemoteStringSettingId;

/* loaded from: classes12.dex */
public final class XVa extends C0T6 implements InterfaceC57866PlW {
    public final int A00 = 1;
    public final Object A01;

    public XVa(C51718Msv c51718Msv) {
        this.A01 = c51718Msv;
    }

    public static XVa A00(RemoteBooleanSettingId remoteBooleanSettingId) {
        return new XVa(new C51718Msv(remoteBooleanSettingId));
    }

    public static XVa A01(RemoteStringSettingId remoteStringSettingId) {
        return new XVa(new C51718Msv(remoteStringSettingId));
    }

    public static NVI A02(C51718Msv c51718Msv, AbstractC72483Xel abstractC72483Xel, Class cls, String str) {
        return new NVI(new C51757Mtg(abstractC72483Xel, new XVa(c51718Msv), str), new C0YZ(cls));
    }

    public static boolean A03(Object obj, int i) {
        if ((obj instanceof XVa) && ((XVa) obj).A00 == i) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this.A00 != 0) {
            if (this != obj) {
                if (!A03(obj, 1) || !C14360o3.A0K(this.A01, ((XVa) obj).A01)) {
                    return false;
                }
                return true;
            }
            return true;
        }
        if (this != obj) {
            if (!A03(obj, 0) || this.A01 != ((XVa) obj).A01) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        if (this.A00 != 0) {
            return this.A01.hashCode();
        }
        Integer num = (Integer) this.A01;
        return XjY.A00(num).hashCode() + num.intValue();
    }

    public XVa(Integer num) {
        this.A01 = num;
    }
}
