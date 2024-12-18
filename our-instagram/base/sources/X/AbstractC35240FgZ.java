package X;

import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.FgZ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35240FgZ {
    public static final InterfaceC37119GXe A00 = new G6R();

    public static final C114675Fx A00(AbstractC115105If abstractC115105If) {
        C14360o3.A0B(abstractC115105If, 0);
        return A01(abstractC115105If, A00);
    }

    public static final C114675Fx A01(AbstractC115105If abstractC115105If, InterfaceC37119GXe interfaceC37119GXe) {
        Throwable A01 = abstractC115105If.A01();
        InterfaceC40821up A0L = AbstractC31172DnG.A0L(abstractC115105If);
        if (A01 != null) {
            return A03(A01);
        }
        if (A0L != null) {
            return interfaceC37119GXe.AWh(A0L, "http");
        }
        if ("http".equals("http")) {
            return C114675Fx.A0R;
        }
        return C114675Fx.A0U;
    }

    public static final C114675Fx A02(EnumC81843l3 enumC81843l3, String str, String str2, String str3, String str4, int i, boolean z, boolean z2, boolean z3) {
        if ((i < 400 || i >= 500) && !A04(str4)) {
            if (i >= 500) {
                return new C114675Fx(enumC81843l3, EnumC46247KdO.A0D, String.valueOf(i), str4, str, null, str2, str3, AbstractC166987dD.A1I(), AbstractC25229BEm.A1a(enumC81843l3, EnumC81843l3.A04), true, z, z2, z3, false);
            }
            C0w9.A03("SendError_unsupported_status_code", AnonymousClass001.A05(i, "Unsupported HTTP status code: statusCode=", " message=", str2));
            if (str.equals("http")) {
                return C114675Fx.A0R;
            }
            return C114675Fx.A0U;
        }
        return new C114675Fx(enumC81843l3, EnumC46247KdO.A0D, String.valueOf(i), str4, str, null, str2, str3, AbstractC166987dD.A1I(), false, false, z, z2, z3, false);
    }

    public static final C114675Fx A03(Throwable th) {
        EnumC46247KdO enumC46247KdO;
        String str;
        C14360o3.A0B(th, 0);
        String format = String.format(Locale.US, AbstractC111324zv.A00(560), Arrays.copyOf(new Object[]{th.getClass().getName(), th.getMessage()}, 2));
        C14360o3.A07(format);
        if (th instanceof C53093Ne6) {
            enumC46247KdO = EnumC46247KdO.A0D;
            str = String.valueOf(((C53093Ne6) th).A00);
        } else {
            enumC46247KdO = EnumC46247KdO.A0C;
            str = "5";
        }
        return new C114675Fx(enumC46247KdO, str, "http", format, true, true);
    }

    public static final boolean A04(String str) {
        if (str != null) {
            if (str.equals("1545119") || str.equals("1545120") || str.equals("1545121") || str.equals("4076001")) {
                return true;
            }
            return false;
        }
        return false;
    }
}
