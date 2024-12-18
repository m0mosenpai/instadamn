package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.util.Map;

/* renamed from: X.0kG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC12120kG {
    public static final void A00(String str, String str2) {
        C14360o3.A0B(str2, 1);
        A04(str, str2, 817901558, null);
    }

    public static final void A01(String str, String str2) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        A07(str, str2, null);
    }

    public static final void A02(String str, String str2) {
        C14360o3.A0B(str2, 1);
        A04(str, str2, 817900249, null);
    }

    public static final void A03(String str, String str2) {
        C14360o3.A0B(str2, 1);
        A0B(str, str2, null);
    }

    public static final void A05(String str, String str2, Throwable th) {
        C14360o3.A0B(str2, 1);
        A04(str, str2, 817902344, th);
    }

    public static final void A06(String str, String str2, Throwable th) {
        C14360o3.A0B(str2, 1);
        A04(str, str2, 817899173, th);
    }

    public static final void A07(String str, String str2, Throwable th) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        A0I(str, th, AbstractC16850sd.A0M(new C09530e4(DialogModule.KEY_MESSAGE, str2)));
    }

    public static final void A08(String str, String str2, Throwable th) {
        C14360o3.A0B(str2, 1);
        A04(str, str2, 817895454, th);
    }

    public static final void A09(String str, String str2, Throwable th) {
        C14360o3.A0B(str2, 1);
        A04(str, str2, 817903028, th);
    }

    public static final void A0A(String str, String str2, Throwable th) {
        C14360o3.A0B(str2, 1);
        A04(str, str2, 817896204, th);
    }

    public static final void A0B(String str, String str2, Throwable th) {
        C14360o3.A0B(str2, 1);
        A04(str, str2, 817893734, th);
    }

    public static final void A0C(String str, String str2, Throwable th) {
        C14360o3.A0B(str2, 1);
        A04(str, str2, 817892527, th);
    }

    public static final void A0D(String str, String str2, Throwable th) {
        C14360o3.A0B(str2, 1);
        A04(str, str2, 817901427, th);
    }

    public static final void A0E(String str, String str2, Throwable th) {
        C14360o3.A0B(str2, 1);
        A04(str, str2, 817903681, th);
    }

    public static final void A0F(String str, String str2, Throwable th) {
        C14360o3.A0B(str2, 1);
        A04(str, str2, 817895516, th);
    }

    public static final void A0G(String str, String str2, Throwable th) {
        C14360o3.A0B(str2, 1);
        A04(str, str2, 817891604, th);
    }

    public static final void A0I(String str, Throwable th, Map map) {
        C14360o3.A0B(str, 0);
        A0J(str, th, map, 817903358);
    }

    public static final void A0H(String str, Throwable th) {
        C16920sk c16920sk = C16920sk.A00;
        C14360o3.A0C(c16920sk, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        A0I(str, th, c16920sk);
    }

    public static final void A0J(String str, Throwable th, Map map, int i) {
        C0f5 AEp = C18950wb.A00.AEp(str, i);
        if (th != null) {
            AEp.ERI(th);
        }
        for (Map.Entry entry : map.entrySet()) {
            AEp.ABW((String) entry.getKey(), (String) entry.getValue());
        }
        AEp.report();
    }

    public static final void A04(String str, String str2, int i, Throwable th) {
        C14360o3.A0B(str2, 2);
        C0f5 AEp = C18950wb.A00.AEp(str, i);
        AEp.ABW(DialogModule.KEY_MESSAGE, str2);
        if (th != null) {
            AEp.ERI(th);
        }
        AEp.report();
    }
}
