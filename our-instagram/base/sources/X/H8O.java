package X;

import com.facebook.quicklog.reliability.UserFlowLoggerImpl;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract class H8O extends AbstractC37585Ggg {
    public Long A00;
    public String A01;
    public final Long A02;
    public final long A03;
    public final InterfaceC11380iw A04;
    public final C18920wW A05;
    public final UserSession A06;
    public final C38321qM A07;
    public final InterfaceC61432r6 A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;

    public H8O(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM, InterfaceC61432r6 interfaceC61432r6, String str, String str2) {
        long j;
        Long l;
        Long A0j;
        C14360o3.A0B(str2, 5);
        this.A06 = userSession;
        this.A0C = str;
        this.A04 = interfaceC11380iw;
        this.A07 = c38321qM;
        this.A0B = str2;
        this.A08 = interfaceC61432r6;
        String A2Y = c38321qM.A2Y();
        this.A09 = A2Y == null ? "" : A2Y;
        String A07 = AbstractC41071vF.A07(userSession, c38321qM);
        if (A07 != null && (A0j = AbstractC166997dE.A0j(A07)) != null) {
            j = A0j.longValue();
        } else {
            j = 0;
        }
        this.A03 = j;
        this.A0A = AbstractC41071vF.A0F(userSession, c38321qM);
        Integer A05 = AbstractC41071vF.A05(userSession, c38321qM);
        if (A05 != null) {
            l = AbstractC25229BEm.A0n(A05);
        } else {
            l = null;
        }
        this.A02 = l;
        this.A05 = AbstractC37302Gc3.A0I(interfaceC11380iw, userSession);
    }

    @Override // X.JI9
    public final void ClL(String str) {
        long longValue;
        C14360o3.A0B(str, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A05, "instagram_ads_feedback_interface_response");
        if (A0f.isSampled()) {
            AbstractC37301Gc2.A0z(A0f, this.A03);
            AbstractC37585Ggg.A01(A0f, this, Long.parseLong(this.A06.userId));
            A0f.AAP("afi_type", this.A0B);
            String str2 = this.A0A;
            if (str2 == null) {
                str2 = "";
            }
            A0f.AAP("ad_tracking_token", str2);
            AbstractC37300Gc1.A0u(A0f, AbstractC167007dF.A0n("ads_category", this.A09));
            A0f.AAP(UserFlowLoggerImpl.SOURCE_ANNOTATION, "ads_overflow_menu");
            AbstractC37302Gc3.A11(A0f, "main_question", str);
            Long l = this.A02;
            if (l == null && (l = this.A00) == null) {
                longValue = -1;
            } else {
                longValue = l.longValue();
            }
            AbstractC37301Gc2.A11(A0f, longValue);
            AbstractC37301Gc2.A19(A0f, this.A0C);
            A00(str, C05F.A00);
        }
    }

    @Override // X.JI9
    public final void Cm9(long j) {
    }

    @Override // X.JI9
    public final void CmG(String str) {
        long longValue;
        C14360o3.A0B(str, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A05, "instagram_ads_feedback_interface_undo");
        if (A0f.isSampled()) {
            AbstractC37301Gc2.A0z(A0f, this.A03);
            AbstractC37585Ggg.A01(A0f, this, Long.parseLong(this.A06.userId));
            A0f.AAP("afi_type", this.A0B);
            String str2 = this.A0A;
            if (str2 == null) {
                str2 = "";
            }
            A0f.AAP("ad_tracking_token", str2);
            AbstractC37300Gc1.A0u(A0f, AbstractC167007dF.A0n("ads_category", this.A09));
            A0f.AAP(UserFlowLoggerImpl.SOURCE_ANNOTATION, "ads_overflow_menu");
            AbstractC37302Gc3.A11(A0f, "main_question", str);
            Long l = this.A02;
            if (l == null && (l = this.A00) == null) {
                longValue = -1;
            } else {
                longValue = l.longValue();
            }
            AbstractC37301Gc2.A11(A0f, longValue);
            AbstractC37301Gc2.A19(A0f, this.A0C);
            A00(str, C05F.A01);
        }
    }

    private final void A00(String str, Integer num) {
        Type type;
        long longValue;
        Object A01;
        String str2;
        Object obj;
        InterfaceC61432r6 interfaceC61432r6 = this.A08;
        if (interfaceC61432r6 != null) {
            try {
                Class<?> cls = interfaceC61432r6.getClass();
                int i = 5;
                while (cls != null) {
                    int i2 = i - 1;
                    if (i > 0) {
                        Type[] genericInterfaces = cls.getGenericInterfaces();
                        C14360o3.A07(genericInterfaces);
                        int length = genericInterfaces.length;
                        int i3 = 0;
                        while (true) {
                            if (i3 < length) {
                                type = genericInterfaces[i3];
                                if (AbstractC001900j.A0a(type.toString(), "RealtimeSignalProvider", false)) {
                                    break;
                                } else {
                                    i3++;
                                }
                            } else {
                                type = null;
                                break;
                            }
                        }
                        if (type instanceof ParameterizedType) {
                            Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
                            if (actualTypeArguments != null && actualTypeArguments.length == 2) {
                                Long l = this.A02;
                                if (l == null && (l = this.A00) == null) {
                                    longValue = -1;
                                } else {
                                    longValue = l.longValue();
                                }
                                Map A0n = AbstractC167007dF.A0n("ads_category", this.A09);
                                String str3 = super.A00;
                                String str4 = this.A0A;
                                if (str4 == null) {
                                    str4 = "";
                                }
                                C6T6 c6t6 = new C6T6(null, new XVS(num, str3, str4, this.A0B, "main_question", "ads_overflow_menu", str, A0n, longValue), "", "");
                                if (C14360o3.A0K(actualTypeArguments[0], C38321qM.class) && C14360o3.A0K(actualTypeArguments[1], C75113Zb.class)) {
                                    C38321qM c38321qM = this.A07;
                                    A01 = AbstractC37303Gc4.A0E(c38321qM);
                                    obj = c38321qM;
                                } else if (C14360o3.A0K(actualTypeArguments[0], C41181vS.class) && C14360o3.A0K(actualTypeArguments[1], C41551w4.class)) {
                                    C38321qM c38321qM2 = this.A07;
                                    User A14 = AbstractC25226BEj.A14(c38321qM2);
                                    if (A14 == null || (str2 = this.A01) == null) {
                                        return;
                                    }
                                    C41181vS c41181vS = new C41181vS(c38321qM2, A14, str2);
                                    A01 = new C41551w4(this.A06, new Reel((C1NB) new C1N9(A14), str2, false), false, null, null, C16910sj.A00, -1, System.currentTimeMillis(), false);
                                    obj = c41181vS;
                                } else {
                                    if (!C14360o3.A0K(actualTypeArguments[0], C120985dq.class) || !C14360o3.A0K(actualTypeArguments[1], C37644Ghd.class)) {
                                        return;
                                    }
                                    C120985dq A04 = C120985dq.A0d.A04(this.A07);
                                    UserSession userSession = this.A06;
                                    A01 = AbstractC37652Ghl.A01(A04, userSession, C3YS.A00(userSession), null, null);
                                    obj = A04;
                                }
                                interfaceC61432r6.DVi(c6t6, AnonymousClass317.A05, obj, A01);
                                return;
                            }
                            return;
                        }
                        if (type instanceof Class) {
                            cls = (Class) type;
                            i = i2;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            } catch (RuntimeException e) {
                C0K8.A0F("AdsOverflowMenuAfiLogger", "Failed to get type arguments", e);
            }
        }
    }

    @Override // X.JI9
    public final void Ck6() {
        long longValue;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A05, "instagram_ads_feedback_interface_impression");
        if (A0f.isSampled()) {
            AbstractC37301Gc2.A0z(A0f, this.A03);
            AbstractC37585Ggg.A01(A0f, this, Long.parseLong(this.A06.userId));
            A0f.AAP("afi_type", this.A0B);
            String str = this.A0A;
            if (str == null) {
                str = "";
            }
            A0f.AAP("ad_tracking_token", str);
            AbstractC37300Gc1.A0u(A0f, AbstractC167007dF.A0n("ads_category", this.A09));
            A0f.AAP(UserFlowLoggerImpl.SOURCE_ANNOTATION, "ads_overflow_menu");
            A0f.AAP("question_id", "main_question");
            Long l = this.A02;
            if (l == null && (l = this.A00) == null) {
                longValue = -1;
            } else {
                longValue = l.longValue();
            }
            AbstractC37301Gc2.A11(A0f, longValue);
            AbstractC37301Gc2.A19(A0f, this.A0C);
        }
    }
}
