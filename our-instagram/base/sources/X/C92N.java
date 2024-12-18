package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.api.schemas.LimitedInteractionsVersions;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.UUID;

/* renamed from: X.92N, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C92N {
    public LimitedInteractionsVersions A00;
    public final Context A01;
    public final FragmentActivity A02;
    public final InterfaceC11380iw A03;
    public final C1P1 A04;
    public final UserSession A05;
    public final C92Q A06;
    public final C92R A07;
    public final C92S A08;
    public final String A09;

    /* JADX WARN: Type inference failed for: r0v4, types: [X.92Q] */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.92R] */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.92S] */
    public C92N(Context context, FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this.A05 = userSession;
        this.A01 = context;
        this.A03 = interfaceC11380iw;
        this.A02 = fragmentActivity;
        String obj = UUID.randomUUID().toString();
        C14360o3.A07(obj);
        this.A09 = obj;
        this.A00 = LimitedInteractionsVersions.A05;
        this.A04 = new C1P1() { // from class: X.92P
            @Override // X.C1P1
            public final /* bridge */ /* synthetic */ void onSuccess(Object obj2) {
                C193328hC c193328hC;
                int i;
                int A03 = C0f9.A03(-963741723);
                C92T c92t = (C92T) obj2;
                int A032 = C0f9.A03(-765085451);
                C14360o3.A0B(c92t, 0);
                InterfaceC124365js interfaceC124365js = c92t.A01;
                if (interfaceC124365js == null) {
                    C14360o3.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE);
                    throw C00O.createAndThrow();
                }
                C124355jr c124355jr = (C124355jr) interfaceC124365js;
                if (c124355jr.A03) {
                    C92N c92n = C92N.this;
                    LimitedInteractionsVersions limitedInteractionsVersions = c124355jr.A02;
                    if (limitedInteractionsVersions == null) {
                        limitedInteractionsVersions = LimitedInteractionsVersions.A05;
                    }
                    c92n.A00 = limitedInteractionsVersions;
                    int i2 = c124355jr.A00;
                    boolean z = false;
                    if (limitedInteractionsVersions != LimitedInteractionsVersions.A05) {
                        z = true;
                    }
                    C124545kG c124545kG = c124355jr.A01;
                    FragmentActivity fragmentActivity2 = c92n.A02;
                    if (!fragmentActivity2.isFinishing() && !fragmentActivity2.isDestroyed()) {
                        if (z) {
                            C18920wW A02 = AbstractC12220kQ.A02(c92n.A05);
                            String str = c92n.A09;
                            boolean z2 = false;
                            if (c92n.A00 == LimitedInteractionsVersions.A06) {
                                z2 = true;
                            }
                            C55079OaZ.A00(A02, str, "reminder", z2);
                            c193328hC = new C193328hC((Activity) fragmentActivity2);
                            Context context2 = c92n.A01;
                            c193328hC.A0k(context2.getDrawable(R.drawable.ig_illustrations_illo_limits_refresh));
                            c193328hC.A0A(2131965183);
                            String string = context2.getString(2131965181);
                            C14360o3.A07(string);
                            c193328hC.A0Z(new AO8(c92n), EnumC193348hE.A03, string, true);
                            String string2 = context2.getString(2131965182);
                            C14360o3.A07(string2);
                            c193328hC.A0b(new AO9(c92n), string2);
                            if (c124545kG != null) {
                                if (c124545kG.A01) {
                                    i = 2131965184;
                                } else {
                                    boolean z3 = c124545kG.A02;
                                    if (z3 && c124545kG.A00) {
                                        i = 2131965187;
                                    } else {
                                        i = 2131965186;
                                        if (z3) {
                                            i = 2131965185;
                                        }
                                    }
                                }
                                c193328hC.A0r(context2.getString(i));
                            }
                        } else {
                            new OKY(c92n.A03, c92n.A05, c92n.A09).A00(C05F.A0C);
                            c193328hC = new C193328hC((Activity) fragmentActivity2);
                            Context context3 = c92n.A01;
                            c193328hC.A0k(context3.getDrawable(R.drawable.ig_illustrations_illo_limited_interactions_refresh));
                            Resources resources = context3.getResources();
                            Integer valueOf = Integer.valueOf(i2);
                            c193328hC.A05 = resources.getQuantityString(R.plurals.limited_interactions_reminder_dialog_title_day, i2, valueOf, valueOf);
                            c193328hC.A09(2131965146);
                            String string3 = context3.getString(2131965147);
                            C14360o3.A07(string3);
                            c193328hC.A0e(new AOA(c92n), string3);
                            String string4 = context3.getString(2131965148);
                            C14360o3.A07(string4);
                            c193328hC.A0b(new AOB(c92n), string4);
                        }
                        C0fJ.A00(c193328hC.A02());
                    }
                }
                C0f9.A0A(-1320701352, A032);
                C0f9.A0A(975842942, A03);
            }
        };
        this.A06 = new C1P1() { // from class: X.92Q
            @Override // X.C1P1
            public final void onFail(AbstractC115105If abstractC115105If) {
                int A03 = C0f9.A03(1911051230);
                C9GR.A0B(C92N.this.A01, AbstractC43591JPw.A00(14));
                C0f9.A0A(-1573751809, A03);
            }

            @Override // X.C1P1
            public final /* bridge */ /* synthetic */ void onSuccess(Object obj2) {
                int A03 = C0f9.A03(-517893973);
                int A032 = C0f9.A03(-681852773);
                C92N c92n = C92N.this;
                OKY oky = new OKY(c92n.A03, c92n.A05, c92n.A09);
                HashMap hashMap = new HashMap();
                String str = C1QM.A00.A02.A00;
                if (str != null) {
                    hashMap.put("nav_chain", str);
                }
                C18920wW c18920wW = oky.A00;
                InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, MSV.A00(1316));
                A00.AAP(AbstractC50532MSl.A00(), oky.A01);
                A00.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, "turn_off");
                A00.A9M("extra_values", hashMap);
                A00.Cht();
                C9GR.A07(c92n.A01, 2131965142);
                C0f9.A0A(-205437721, A032);
                C0f9.A0A(1132827105, A03);
            }
        };
        this.A07 = new C1P1() { // from class: X.92R
            @Override // X.C1P1
            public final void onFail(AbstractC115105If abstractC115105If) {
                int A03 = C0f9.A03(-1059469354);
                C9GR.A0B(C92N.this.A01, AbstractC43591JPw.A00(14));
                C0f9.A0A(-1518119963, A03);
            }

            @Override // X.C1P1
            public final /* bridge */ /* synthetic */ void onSuccess(Object obj2) {
                int A03 = C0f9.A03(741548337);
                N3F n3f = (N3F) obj2;
                int A032 = C0f9.A03(-482926111);
                C14360o3.A0B(n3f, 0);
                C55079OaZ c55079OaZ = C55079OaZ.A00;
                C92N c92n = C92N.this;
                UserSession userSession2 = c92n.A05;
                C18920wW A02 = AbstractC12220kQ.A02(userSession2);
                String str = c92n.A09;
                boolean z = false;
                if (c92n.A00 == LimitedInteractionsVersions.A06) {
                    z = true;
                }
                C55079OaZ.A00(A02, str, "reminder_toast", z);
                c55079OaZ.A02(c92n.A00, AbstractC12220kQ.A02(userSession2), str, false);
                C146106i8 c146106i8 = new C146106i8();
                c146106i8.A06();
                Context context2 = c92n.A01;
                c146106i8.A0D = context2.getString(2131965174);
                c146106i8.A0I = context2.getString(2131965175);
                String string = context2.getString(2131965176);
                C14360o3.A07(string);
                c146106i8.A0G = string;
                c146106i8.A0A(new P3H(n3f, c92n));
                c146106i8.A01();
                C41451vu.A01.E4s(new C3KD(c146106i8.A00()));
                C0f9.A0A(355014462, A032);
                C0f9.A0A(1178597485, A03);
            }
        };
        this.A08 = new C1P1() { // from class: X.92S
            @Override // X.C1P1
            public final void onFail(AbstractC115105If abstractC115105If) {
                int A03 = C0f9.A03(-671590205);
                C9GR.A0B(C92N.this.A01, AbstractC43591JPw.A00(14));
                C0f9.A0A(-869611009, A03);
            }

            @Override // X.C1P1
            public final /* bridge */ /* synthetic */ void onSuccess(Object obj2) {
                int A03 = C0f9.A03(109967903);
                int A032 = C0f9.A03(-1746433450);
                C92N c92n = C92N.this;
                C18920wW A02 = AbstractC12220kQ.A02(c92n.A05);
                String str = c92n.A09;
                boolean z = false;
                if (c92n.A00 == LimitedInteractionsVersions.A06) {
                    z = true;
                }
                C55079OaZ.A00(A02, str, "reminder_toast", z);
                C146106i8 c146106i8 = new C146106i8();
                c146106i8.A06();
                Context context2 = c92n.A01;
                c146106i8.A0D = context2.getString(2131965177);
                c146106i8.A0I = context2.getString(2131965178);
                String string = context2.getString(2131965179);
                C14360o3.A07(string);
                c146106i8.A0G = string;
                c146106i8.A0A(new P3F(c92n));
                c146106i8.A01();
                C41451vu.A01.E4s(new C3KD(c146106i8.A00()));
                C0f9.A0A(-2081225415, A032);
                C0f9.A0A(-1938542163, A03);
            }
        };
    }
}
