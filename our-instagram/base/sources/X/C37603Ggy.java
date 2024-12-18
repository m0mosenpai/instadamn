package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ggy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37603Ggy {
    public final UserSession A00;
    public final InterfaceC60442pS A01;
    public final Context A02;

    public static final float A00(C37603Ggy c37603Ggy, Float f) {
        if (f != null) {
            return AbstractC13880nE.A01(c37603Ggy.A02, f.floatValue());
        }
        return 0.0f;
    }

    public static final void A01(MUW muw, C37603Ggy c37603Ggy, C120985dq c120985dq, String str, InterfaceC16660sJ interfaceC16660sJ) {
        C11520jB A01;
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            InterfaceC60442pS interfaceC60442pS = c37603Ggy.A01;
            C82713mZ A04 = AbstractC82703mY.A04(c120985dq, interfaceC60442pS, "gesture");
            A04.A7T = muw.A02;
            A04.A2X = Double.valueOf(A00(c37603Ggy, (Float) muw.A00));
            A04.A2Y = Double.valueOf(A00(c37603Ggy, (Float) muw.A01));
            UserSession userSession = c37603Ggy.A00;
            A04.A0G(userSession, c38321qM);
            if (str == null) {
                str = interfaceC60442pS.getModuleName();
            }
            A04.A7A = str;
            A02(c37603Ggy, A04);
            A04.A1C = Boolean.valueOf(c38321qM.CdW());
            if (AbstractC37647Ghg.A00(c120985dq) && (A01 = BTP.A01(userSession, c120985dq.A06().A0N, muw.A03)) != null) {
                A04.A0q = A01;
            }
            interfaceC16660sJ.invoke(A04);
            C32U.A0H(userSession, A04, interfaceC60442pS);
        }
    }

    public static final void A02(C37603Ggy c37603Ggy, C82713mZ c82713mZ) {
        Context context = c37603Ggy.A02;
        float A00 = A00(c37603Ggy, Float.valueOf(AbstractC13880nE.A0A(context)));
        float A002 = A00(c37603Ggy, Float.valueOf(AbstractC13880nE.A09(context)));
        c82713mZ.A2W = Double.valueOf(A00);
        c82713mZ.A2V = Double.valueOf(A002);
    }

    public final void A03(MUW muw, C120985dq c120985dq, String str) {
        A01(muw, this, c120985dq, str, C37908Gm5.A00);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, X.5vh] */
    public final void A04(C120985dq c120985dq, Boolean bool, Boolean bool2, Double d, Double d2, Float f, Float f2, Float f3, String str, String str2, String str3, InterfaceC16660sJ interfaceC16660sJ, float f4, float f5, float f6, float f7, float f8, float f9) {
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            float A00 = A00(this, Float.valueOf(f4));
            float A002 = A00(this, Float.valueOf(f5));
            float A003 = A00(this, Float.valueOf(f6));
            float A004 = A00(this, Float.valueOf(f7));
            ?? obj = new Object();
            obj.A02 = A00;
            obj.A03 = A002;
            obj.A00 = A003;
            obj.A01 = A004;
            obj.A04 = f8;
            obj.A05 = f9;
            InterfaceC60442pS interfaceC60442pS = this.A01;
            C82713mZ A04 = AbstractC82703mY.A04(c120985dq, interfaceC60442pS, "gesture");
            A04.A7T = str;
            A04.A7A = "primary";
            A04.A12 = obj;
            A04.A18 = bool;
            A04.A5T = str2;
            A04.A5U = str3;
            A04.A19 = bool2;
            A04.A2j = Float.valueOf(A00(this, f));
            A04.A2k = Float.valueOf(A00(this, f2));
            UserSession userSession = this.A00;
            A04.A0G(userSession, c38321qM);
            A02(this, A04);
            A04.A1C = Boolean.valueOf(c38321qM.CdW());
            if (d != null) {
                A04.A2Z = AbstractC37302Gc3.A0S(d.doubleValue());
            }
            if (d2 != null) {
                A04.A01 = d2.doubleValue() / 1000.0d;
            }
            if (f3 != null) {
                A04.A2i = Float.valueOf(f3.floatValue() / 1000.0f);
            }
            if (interfaceC16660sJ != null) {
                interfaceC16660sJ.invoke(A04);
            }
            C32U.A0H(userSession, A04, interfaceC60442pS);
        }
    }

    public final void A05(C120985dq c120985dq, String str, String str2) {
        C38321qM c38321qM;
        if (c120985dq != null && (c38321qM = c120985dq.A02) != null) {
            String A0i = AnonymousClass001.A0i(AbstractC111324zv.A00(764), str, str2, '_');
            InterfaceC60442pS interfaceC60442pS = this.A01;
            C82713mZ A04 = AbstractC82703mY.A04(c120985dq, interfaceC60442pS, "gesture");
            UserSession userSession = this.A00;
            A04.A0G(userSession, c38321qM);
            A04.A7A = "bottom_sheet";
            A04.A7T = A0i;
            C32U.A0H(userSession, A04, interfaceC60442pS);
        }
    }

    public C37603Ggy(Context context, UserSession userSession, InterfaceC60442pS interfaceC60442pS) {
        AbstractC167027dH.A13(context, userSession, interfaceC60442pS);
        this.A02 = context;
        this.A00 = userSession;
        this.A01 = interfaceC60442pS;
    }
}
