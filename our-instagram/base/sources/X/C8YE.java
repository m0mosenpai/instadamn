package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewStub;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

/* renamed from: X.8YE, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8YE implements C8YF {
    public AKB A00;
    public C8YH A01;
    public Runnable A02;
    public final Context A04;
    public final C18920wW A06;
    public final UserSession A07;
    public final C1GL A08;
    public final C8YD A09;
    public final C8YA A0A;
    public final Handler A05 = new Handler(Looper.getMainLooper());
    public String A03 = UUID.randomUUID().toString();
    public final Runnable A0B = new Runnable() { // from class: X.8YG
        @Override // java.lang.Runnable
        public final void run() {
            C8YE c8ye = C8YE.this;
            C8YE.A02(c8ye, null);
            C8YE.A00(c8ye);
        }
    };

    public static final void A03(C8YE c8ye, String str) {
        if (c8ye.A09 != null) {
            Context context = c8ye.A04;
            String string = context.getString(2131968928);
            C14360o3.A07(string);
            String string2 = context.getString(2131968929);
            C14360o3.A07(string2);
            String string3 = context.getString(2131968931);
            String string4 = context.getString(2131968932);
            C14360o3.A07(string4);
            c8ye.A06(EnumC222569rx.A02, EnumC222649s5.A02, str, string2, string3, string4, string);
            c8ye.A0A.E1n();
        }
    }

    public final void A07(List list) {
        C14360o3.A0B(list, 0);
        AKB akb = this.A00;
        if (akb != null) {
            C18C.A0F(!akb.A03);
            akb.A09.A01(list);
        }
    }

    public static final void A00(C8YE c8ye) {
        C8YH c8yh = c8ye.A01;
        if (c8yh != null) {
            c8yh.A02();
        }
        c8ye.A0A.E1m();
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [X.A33, java.lang.Object] */
    public static final void A01(C8YE c8ye, EnumC222569rx enumC222569rx, EnumC222649s5 enumC222649s5, final Runnable runnable) {
        C3DO c3do = C3DN.A00;
        Context context = c8ye.A04;
        C189478aR A00 = F86.A00(c3do.A01(context));
        C1YB A002 = C8YB.A00();
        if (A002.A00 == null) {
            A002.A00 = new Object();
        }
        UserSession userSession = c8ye.A07;
        String AbY = c8ye.A0A.AbY();
        boolean z = false;
        if (A00 != null) {
            z = true;
        }
        C24210AoX c24210AoX = new C24210AoX();
        AbstractC167027dH.A13(enumC222649s5, enumC222569rx, AbY);
        C26785Bs9 c26785Bs9 = new C26785Bs9();
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession.token);
        A0b.putSerializable("warning_type", enumC222649s5);
        A0b.putSerializable(MSV.A00(419), enumC222569rx);
        A0b.putString("action_source", AbY);
        A0b.putString("text_language", null);
        A0b.putBoolean(MSV.A00(218), z);
        c26785Bs9.setArguments(A0b);
        c26785Bs9.A00 = c24210AoX;
        C189448aO c189448aO = new C189448aO(userSession);
        c189448aO.A0X = new AbstractC86353t7() { // from class: X.9pu
            @Override // X.AbstractC86353t7, X.InterfaceC86363t8
            public final void DB6() {
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        };
        if (A00 != null) {
            A00.A0F(c26785Bs9, c189448aO);
        } else {
            c189448aO.A00().A03(context, c26785Bs9);
        }
    }

    public static final void A02(C8YE c8ye, String str) {
        C18920wW c18920wW = c8ye.A06;
        C8YA c8ya = c8ye.A0A;
        String AbY = c8ya.AbY();
        String str2 = c8ye.A03;
        HashMap hashMap = new HashMap();
        hashMap.put("nav_chain", C1QM.A00.A02.A00);
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "instagram_wellbeing_warning_system_success_creation");
        A00.AAP("source_of_action", AbY);
        A00.AAP("text_language", str);
        A00.A7v("is_offensive", true);
        A00.AAP(AbstractC50532MSl.A01(197, 10, 82), str2);
        A00.A9M("extra_values", hashMap);
        A00.Cht();
        c8ya.E4v();
    }

    public final void A04() {
        C1OL c1ol;
        C1ON A01;
        String str;
        C8YD c8yd = this.A09;
        if (c8yd != null) {
            UserSession userSession = this.A07;
            if (c8yd.EiG(userSession)) {
                C8YA c8ya = this.A0A;
                c8ya.CzK();
                AKB akb = this.A00;
                if (akb != null) {
                    boolean Ej8 = c8yd.Ej8(userSession);
                    int BoD = c8yd.BoD(userSession);
                    C18C.A0F(!akb.A03);
                    C13400mQ c13400mQ = akb.A09;
                    if (c13400mQ.A02) {
                        Handler handler = c13400mQ.A05;
                        Runnable runnable = c13400mQ.A07;
                        handler.removeCallbacks(runnable);
                        runnable.run();
                    }
                    akb.A03 = true;
                    boolean z = akb.A04;
                    if (z || akb.A00 != null) {
                        if (Ej8) {
                            C1OK c1ok = akb.A00;
                            if (c1ok != null) {
                                c1ok.A00();
                                akb.A00 = null;
                            }
                            akb.A01 = new C22895A7p(false, null);
                        } else {
                            if (z) {
                                C1OK c1ok2 = akb.A00;
                                if (c1ok2 != null) {
                                    c1ok2.A00();
                                    akb.A00 = null;
                                }
                                AKB.A01(akb);
                            }
                            if (BoD <= 0) {
                                return;
                            }
                            akb.A05.postDelayed(akb.A0B, BoD);
                            return;
                        }
                    }
                    AKB.A00(akb);
                    return;
                }
                int BoD2 = c8yd.BoD(userSession);
                C1OK c1ok3 = null;
                if (BoD2 > 0) {
                    c1ok3 = new C1OK();
                    c1ol = c1ok3.A00;
                } else {
                    c1ol = null;
                }
                List content = c8ya.getContent();
                C52228N9r c52228N9r = new C52228N9r(c1ol, userSession, new C24208AoV(this), C05F.A01);
                if (!c8yd.CZ0()) {
                    if (!content.isEmpty()) {
                        str = (String) content.get(0);
                    } else {
                        str = "";
                    }
                    A01 = AbstractC23052AEi.A00(c1ol, userSession, str);
                } else {
                    A01 = AbstractC23052AEi.A01(c1ol, userSession, content);
                }
                A01.A00 = c52228N9r;
                this.A08.schedule(A01);
                if (BoD2 <= 0) {
                    return;
                }
                RunnableC24714Awv runnableC24714Awv = new RunnableC24714Awv(c1ok3, this);
                this.A02 = runnableC24714Awv;
                this.A05.postDelayed(runnableC24714Awv, BoD2);
                return;
            }
        }
        this.A0A.E4v();
    }

    public final void A05() {
        this.A05.removeCallbacks(this.A0B);
        AKB akb = this.A00;
        if (akb != null) {
            akb.A09.A00();
        }
        this.A03 = null;
    }

    public final void A06(EnumC222569rx enumC222569rx, EnumC222649s5 enumC222649s5, String str, String str2, String str3, String str4, String str5) {
        C193328hC c193328hC = new C193328hC(this.A04);
        c193328hC.A05 = str5;
        c193328hC.A0r("");
        c193328hC.A0d(new AOK(this, str), str2);
        c193328hC.A0c(new AOL(this, str), str4);
        c193328hC.A0g(new DialogInterfaceOnDismissListenerC23182AOv(this));
        c193328hC.A0s(false);
        if (str3 != null) {
            c193328hC.A0b(new AOZ(this, enumC222569rx, enumC222649s5, str), str3);
        }
        C0fJ.A00(c193328hC.A02());
        C18920wW c18920wW = this.A06;
        String AbY = this.A0A.AbY();
        String str6 = this.A03;
        HashMap hashMap = new HashMap();
        hashMap.put("nav_chain", C1QM.A00.A02.A00);
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, AbstractC43591JPw.A00(1094));
        A00.AAP("source_of_action", AbY);
        A00.AAP("text_language", str);
        A00.A7v("is_offensive", true);
        A00.AAP(AbstractC50532MSl.A00(), str6);
        A00.A9M("extra_values", hashMap);
        A00.Cht();
    }

    @Override // X.C8YF
    public final void DOg() {
        C18920wW c18920wW = this.A06;
        C8YA c8ya = this.A0A;
        ALg.A00(c18920wW, c8ya.AbY(), null, this.A03);
        A01(this, EnumC222569rx.A02, EnumC222649s5.A02, new RunnableC24512AtV(this));
        c8ya.DOg();
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, X.8YH] */
    public C8YE(Context context, ViewStub viewStub, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C1GL c1gl, C8YD c8yd, C8YA c8ya) {
        this.A07 = userSession;
        this.A04 = context;
        this.A08 = c1gl;
        this.A09 = c8yd;
        this.A0A = c8ya;
        this.A06 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
        if (viewStub != null) {
            C8YB.A00();
            ?? obj = new Object();
            obj.A02 = false;
            obj.A01 = viewStub;
            this.A01 = obj;
        }
        if (c8yd != null && c8yd.Ej9(userSession)) {
            this.A00 = new AKB(userSession, c1gl, new A6I(this), c8yd.BfT(userSession), c8yd.CZ0());
        }
    }

    @Override // X.C8YF
    public final void Dw9() {
        A00(this);
        this.A05.removeCallbacks(this.A0B);
        C18920wW c18920wW = this.A06;
        C8YA c8ya = this.A0A;
        ALg.A02(c18920wW, c8ya.AbY(), null, this.A03);
        c8ya.Dw9();
    }
}
