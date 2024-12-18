package X;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import java.util.List;

/* renamed from: X.6BR, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6BR {
    /* JADX WARN: Multi-variable type inference failed */
    public static final android.net.Uri A00(C6FG c6fg, C102884kP c102884kP) {
        String str;
        C14360o3.A0B(c6fg, 0);
        C14360o3.A0B(c102884kP, 1);
        String A0L = c102884kP.A0L(36);
        String A0L2 = c102884kP.A0L(41);
        if (A0L == null || !c6fg.A05) {
            A0L = A0L2;
        }
        android.net.Uri uri = null;
        uri = null;
        if (A0L == null) {
            return null;
        }
        try {
            C6BS c6bs = C6BS.A02;
            android.net.Uri A03 = AbstractC08820cl.A03(A0L);
            C14360o3.A07(A03);
            uri = C6BX.A01(A03, false);
            return uri;
        } catch (SecurityException e) {
            AbstractC25241Le.A00(c6fg, "UriParser", AnonymousClass001.A0g("Parse uri \"", A0L, "\" failed."), e);
            return uri;
        } catch (Exception e2) {
            try {
                Object A00 = C102884kP.A00(c102884kP, 36);
                Object A002 = C102884kP.A00(c102884kP, 41);
                if (A00 != null) {
                    str = A00.toString();
                } else {
                    str = uri;
                }
                String str2 = uri;
                if (A002 != null) {
                    str2 = A002.toString();
                }
                AbstractC25241Le.A00(c6fg, "ImageNodeHelper", AnonymousClass001.A0u("Error getting urls - darkUrl: ", str, ", url: ", str2), e2);
                throw e2;
            } catch (Exception unused) {
                throw e2;
            }
        }
    }

    public static final C5GG A01(C6FG c6fg, C102884kP c102884kP) {
        C139756Ue c139756Ue;
        C139776Ug c139776Ug;
        C14360o3.A0B(c6fg, 0);
        InterfaceC103384lE A0B = c102884kP.A0B(44);
        if (A0B != null) {
            c139756Ue = new C139756Ue(c6fg, c102884kP, A0B);
        } else {
            c139756Ue = null;
        }
        C14360o3.A07(c102884kP.A0O(133));
        if ((!r0.isEmpty()) && (c139776Ug = (C139776Ug) AnonymousClass634.A06(c6fg, c102884kP)) != null) {
            if (c139756Ue != null) {
                C139776Ug c139776Ug2 = new C139776Ug();
                List list = c139776Ug2.A00;
                list.add(c139756Ue);
                list.add(c139776Ug);
                return c139776Ug2;
            }
            return c139776Ug;
        }
        return c139756Ue;
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [X.7Qx, X.UMQ, android.graphics.drawable.Drawable] */
    public static final C27771Wf A02(C6FG c6fg, C102884kP c102884kP) {
        PointF pointF;
        InterfaceC27851Wn interfaceC27851Wn;
        C1X3 c1x3;
        Drawable drawable;
        int A00;
        C14360o3.A0B(c6fg, 0);
        C14360o3.A0B(c102884kP, 1);
        Context context = c6fg.A00;
        boolean A0S = c102884kP.A0S(66, false);
        C102884kP A08 = c102884kP.A08(61);
        if (A08 != null) {
            pointF = new PointF(A08.A02(35, 0.5f), A08.A02(36, 0.5f));
        } else {
            pointF = null;
        }
        C27811Wj A002 = C1X4.A00(C27771Wf.A0b);
        String A0L = c102884kP.A0L(40);
        if (pointF != null) {
            interfaceC27851Wn = InterfaceC27851Wn.A0A;
        } else {
            if (A0L != null) {
                try {
                    int i = C6Bc.A00[C6BE.A0A(A0L).ordinal()];
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                interfaceC27851Wn = InterfaceC27851Wn.A08;
                            }
                        } else {
                            interfaceC27851Wn = InterfaceC27851Wn.A04;
                        }
                    }
                } catch (C41M e) {
                    AbstractC25241Le.A00(null, "ImageNodeHelper", AnonymousClass001.A0R("Error parsing image scale type: ", A0L), e);
                }
            }
            interfaceC27851Wn = InterfaceC27851Wn.A01;
        }
        A002.A00(interfaceC27851Wn);
        C102884kP A082 = c102884kP.A08(35);
        PorterDuffColorFilter porterDuffColorFilter = null;
        if (A082 != null && (A00 = C6BK.A00(c6fg, A082, 0)) != 0) {
            porterDuffColorFilter = new PorterDuffColorFilter(A00, PorterDuff.Mode.SRC_ATOP);
        }
        A002.A06 = porterDuffColorFilter;
        A002.A0S = true;
        A002.A0V = false;
        A002.A0a = A0S;
        A002.A0Z = A0S;
        A002.A0Y = c102884kP.A0S(69, false);
        C102884kP A083 = c102884kP.A08(46);
        if (A083 != null && A083.A0S(41, false)) {
            c1x3 = C1X3.SMALL;
        } else {
            c1x3 = C1X3.DEFAULT;
        }
        ((AbstractC27821Wk) A002).A01 = c1x3;
        A002.A09 = pointF;
        C102884kP A084 = c102884kP.A08(65);
        if (A084 != null) {
            A002.A0R = Integer.valueOf(C6BK.A00(c6fg, A084, 0));
            A002.A03 = 0;
            A002.A0C = null;
        }
        if (C14360o3.A0K(c102884kP.A0L(67), "fade")) {
            A002.A01 = 100;
        }
        if (c102884kP.A0S(76, false)) {
            A002.A0M = C5FE.A01;
        }
        if (c102884kP.A0S(48, false) && (drawable = context.getDrawable(R.drawable.spinner_large)) != null) {
            ?? c162867Qx = new C162867Qx(drawable);
            c162867Qx.A00 = 0.0f;
            c162867Qx.A03 = false;
            c162867Qx.A01 = 850;
            c162867Qx.A02 = true;
            A002.A0D = c162867Qx;
        }
        return new C27771Wf(A002);
    }

    public static final void A03(C6FG c6fg, C102884kP c102884kP, InterfaceC103384lE interfaceC103384lE, String str, long j) {
        C6FX c6fx = new C6FX();
        c6fx.A03(str, 0);
        c6fx.A03(Long.valueOf(j), 1);
        c6fx.A03(c6fg, 2);
        C6FP.A03(c6fg, c102884kP, new C6FW(c6fx.A00), interfaceC103384lE);
    }
}
