package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.2uQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C63432uQ {
    public final UserSession A00;
    public final InterfaceC09390do A01;

    public C63432uQ(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = AbstractC09440dt.A01(new C206839Do(this, 10));
    }

    public final void A02(Integer num, String str) {
        Integer A01;
        C14360o3.A0B(num, 1);
        if (C5IA.A00(this.A00).booleanValue() && AbstractC114975Hn.A02(num) && (A01 = AbstractC63422uP.A01(str)) != null) {
            int intValue = A01.intValue();
            Integer num2 = C05F.A0C;
            C006802i A00 = A00();
            int i = 976033934;
            if (num == num2) {
                i = 976039145;
            }
            A00.markerEnd(i, intValue, (short) 2);
        }
    }

    public final void A04(Integer num, String str, String str2, String str3, String str4) {
        Integer A01;
        int i;
        if (C5IA.A00(this.A00).booleanValue() && AbstractC114975Hn.A02(num) && (A01 = AbstractC63422uP.A01(str)) != null) {
            int intValue = A01.intValue();
            Integer num2 = C05F.A0C;
            C006802i A00 = A00();
            if (num2 == num) {
                A00.markerStartForUserFlow(976039145, intValue, true, 600000L);
                i = 976039145;
                A00().markerPoint(976039145, intValue, "AD_DELIVERY");
                A00().markerAnnotate(976039145, intValue, "AD_ID", str);
                A00().markerAnnotate(976039145, intValue, "MEDIA_ID", str2);
                A00().markerAnnotate(976039145, intValue, "TRACKING_TOKEN", str3);
            } else {
                i = 976033934;
                A00.markerStartForUserFlow(976033934, intValue, true, 600000L);
                A00().markerPoint(976033934, intValue, "NETEGO_DELIVERY");
                A00().markerAnnotate(976033934, intValue, "NETEGO_ID", str);
            }
            A00().markerAnnotate(i, intValue, "CONTAINER_MODULE", str4);
        }
    }

    public final void A05(String str, Integer num, String str2) {
        Integer A01;
        C14360o3.A0B(str2, 2);
        if (C5IA.A00(this.A00).booleanValue() && AbstractC114975Hn.A02(num) && (A01 = AbstractC63422uP.A01(str)) != null) {
            int intValue = A01.intValue();
            Integer num2 = C05F.A0C;
            C006802i A00 = A00();
            int i = 976033934;
            if (num == num2) {
                i = 976039145;
            }
            A00.markerAnnotate(i, intValue, "FAILURE_REASON", str2);
            A00().markerEnd(i, intValue, (short) 7952);
        }
    }

    private final C006802i A00() {
        Object value = this.A01.getValue();
        C14360o3.A07(value);
        return (C006802i) value;
    }

    public final void A01(Integer num, Integer num2, String str) {
        Integer A01;
        if (C5IA.A00(this.A00).booleanValue() && AbstractC114975Hn.A02(num) && (A01 = AbstractC63422uP.A01(str)) != null) {
            int intValue = A01.intValue();
            Integer num3 = C05F.A0C;
            C006802i A00 = A00();
            String A002 = AbstractC72647Xjd.A00(num2);
            int i = 976033934;
            if (num == num3) {
                i = 976039145;
            }
            A00.markerAnnotate(i, intValue, "FAILURE_REASON", A002);
            A00().markerEnd(i, intValue, (short) 3);
        }
    }

    public final void A03(Integer num, String str) {
        Integer A01;
        int i;
        String str2;
        if (C5IA.A00(this.A00).booleanValue() && AbstractC114975Hn.A02(num) && (A01 = AbstractC63422uP.A01(str)) != null) {
            int intValue = A01.intValue();
            Integer num2 = C05F.A0C;
            C006802i A00 = A00();
            if (num == num2) {
                i = 976039145;
                str2 = "AD_INSERTION_SUCCESS";
            } else {
                i = 976033934;
                str2 = "NETEGO_INSERTION_SUCCESS";
            }
            A00.markerPoint(i, intValue, str2);
        }
    }
}
