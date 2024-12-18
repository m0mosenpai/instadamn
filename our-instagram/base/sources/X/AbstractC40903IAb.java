package X;

import android.content.Context;
import android.graphics.Rect;
import com.instagram.common.session.UserSession;

/* renamed from: X.IAb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40903IAb {
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object, X.5vh] */
    public static void A00(Context context, Rect rect, Rect rect2, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C40971v4 c40971v4, Float f, Float f2, Float f3, Float f4, Float f5, String str, String str2, float f6, float f7) {
        C82713mZ A03 = AbstractC82703mY.A03(userSession, c40971v4.A0K, interfaceC60442pS, "gesture");
        A03.A7T = str;
        float A01 = AbstractC13880nE.A01(context, rect.left);
        float A012 = AbstractC13880nE.A01(context, rect.top);
        float A013 = AbstractC13880nE.A01(context, rect.right);
        float A014 = AbstractC13880nE.A01(context, rect.bottom);
        C11520jB A0B = AbstractC37300Gc1.A0B();
        A0B.A04(C5I8.A6y, str2);
        A0B.A04(C5I8.A8u, Float.valueOf(A01));
        A0B.A04(C5I8.A8v, Float.valueOf(A012));
        A0B.A04(C5I8.A8r, Float.valueOf(A013));
        A0B.A04(C5I8.A8s, Float.valueOf(A014));
        A03.A0u = A0B;
        float A015 = AbstractC13880nE.A01(context, rect2.left);
        float A016 = AbstractC13880nE.A01(context, rect2.top);
        float A017 = AbstractC13880nE.A01(context, rect2.right);
        float A018 = AbstractC13880nE.A01(context, rect2.bottom);
        C11520jB A0B2 = AbstractC37300Gc1.A0B();
        A0B2.A04(C5I8.A7P, Float.valueOf(A015));
        A0B2.A04(C5I8.A7Q, Float.valueOf(A016));
        A0B2.A04(C5I8.A7N, Float.valueOf(A017));
        A0B2.A04(C5I8.A7O, Float.valueOf(A018));
        A03.A0r = A0B2;
        if (f != null && f2 != null && f3 != null && f4 != null && (str.equals("swipe_left") || str.equals("swipe_right"))) {
            float floatValue = f.floatValue();
            float floatValue2 = f2.floatValue();
            float floatValue3 = f3.floatValue();
            float floatValue4 = f4.floatValue();
            ?? obj = new Object();
            obj.A02 = f6;
            obj.A03 = f7;
            obj.A00 = floatValue;
            obj.A01 = floatValue2;
            obj.A04 = floatValue3;
            obj.A05 = floatValue4;
            A03.A12 = obj;
        } else {
            A03.A2X = Double.valueOf(AbstractC13880nE.A01(context, f6));
            A03.A2Y = Double.valueOf(AbstractC13880nE.A01(context, f7));
        }
        if (f5 != null) {
            A03.A01 = f5.floatValue();
        }
        Xik.A00(AbstractC12220kQ.A01(interfaceC60442pS, userSession), A03, interfaceC60442pS);
    }
}
