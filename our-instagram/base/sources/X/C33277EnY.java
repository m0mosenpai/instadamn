package X;

import android.app.Activity;
import android.content.Context;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.api.schemas.GrowthFrictionInterventionDetailImpl;
import com.instagram.common.session.UserSession;
import com.instagram.search.common.analytics.SearchContext;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.EnY, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33277EnY extends ETP {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C1P1 A01;
    public final /* synthetic */ C38321qM A02;
    public final /* synthetic */ C75113Zb A03;
    public final /* synthetic */ SearchContext A04;
    public final /* synthetic */ C104024mO A05;
    public final /* synthetic */ C129885ts A06;
    public final /* synthetic */ EnumC33402EpZ A07;
    public final /* synthetic */ User A08;
    public final /* synthetic */ Boolean A09;
    public final /* synthetic */ Integer A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ String A0C;
    public final /* synthetic */ String A0D;
    public final /* synthetic */ String A0E;
    public final /* synthetic */ JSONObject A0F;
    public final /* synthetic */ boolean A0G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33277EnY(Context context, C1P1 c1p1, UserSession userSession, C38321qM c38321qM, C75113Zb c75113Zb, SearchContext searchContext, C104024mO c104024mO, C129885ts c129885ts, EnumC33402EpZ enumC33402EpZ, User user, Boolean bool, Integer num, String str, String str2, String str3, String str4, String str5, String str6, JSONObject jSONObject, boolean z) {
        super(userSession, c104024mO, user, str5, false);
        this.A00 = context;
        this.A08 = user;
        this.A05 = c104024mO;
        this.A06 = c129885ts;
        this.A01 = c1p1;
        this.A07 = enumC33402EpZ;
        this.A0F = jSONObject;
        this.A0G = z;
        this.A02 = c38321qM;
        this.A03 = c75113Zb;
        this.A0A = num;
        this.A04 = searchContext;
        this.A0C = str;
        this.A0B = str2;
        this.A09 = bool;
        this.A0E = str3;
        this.A0D = str4;
        AbstractC167007dF.A1F(context, 1, str5);
        C14360o3.A0B(str6, 6);
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        EnumC33422Ept enumC33422Ept;
        String str;
        String str2;
        String str3;
        String message;
        int A03 = C0f9.A03(-132469219);
        C14360o3.A0B(abstractC115105If, 0);
        C129885ts c129885ts = this.A06;
        UserSession userSession = c129885ts.A02;
        FRl A00 = FA7.A00(userSession);
        C154706xL c154706xL = (C154706xL) userSession.A01(C154706xL.class, new GSw(userSession, 24));
        super.onFail(abstractC115105If);
        EnumC33402EpZ enumC33402EpZ = this.A07;
        boolean z = true;
        if (AbstractC129875tr.A02(enumC33402EpZ) && C18U.A06(C06090Tz.A05, userSession, 36327864181734324L)) {
            C104024mO c104024mO = this.A05;
            if (c104024mO != null) {
                c129885ts.A0E(this.A08);
                if (abstractC115105If instanceof C115115Ig) {
                    C57582kX.A00(userSession).A0O(c104024mO);
                }
                c104024mO.A05 = true;
            }
        } else {
            c129885ts.A0E(this.A08);
            C104024mO c104024mO2 = this.A05;
            if (c104024mO2 != null) {
                C57582kX.A00(userSession).A0O(c104024mO2);
            }
        }
        Throwable A01 = abstractC115105If.A01();
        if (A01 == null || (message = A01.getMessage()) == null || message.length() <= 0) {
            z = false;
        }
        if (z) {
            c154706xL.A03 = MSV.A00(354);
            EnumC33422Ept enumC33422Ept2 = EnumC33422Ept.A08;
            if (A01 != null) {
                str3 = A01.getMessage();
            } else {
                str3 = null;
            }
            A00.A05(enumC33422Ept2, TraceFieldType.FailureReason, str3);
        }
        EDR edr = (EDR) abstractC115105If.A00();
        if (edr != null) {
            Context context = this.A00;
            User user = this.A08;
            C1P1 c1p1 = this.A01;
            JSONObject jSONObject = this.A0F;
            boolean z2 = this.A0G;
            C38321qM c38321qM = this.A02;
            C75113Zb c75113Zb = this.A03;
            Integer num = this.A0A;
            SearchContext searchContext = this.A04;
            String str4 = this.A0C;
            String str5 = this.A0B;
            Boolean bool = this.A09;
            String str6 = this.A0E;
            String str7 = this.A0D;
            if (edr.mStatusCode == 400) {
                if (edr.A06) {
                    if (context instanceof Activity) {
                        Activity activity = (Activity) context;
                        if (!activity.isFinishing() && C18U.A06(C06090Tz.A06, userSession, 36323466136399131L)) {
                            C193328hC A0H = AbstractC31171DnF.A0H(activity);
                            AbstractC31172DnG.A1C(context, A0H, 2131966058);
                            AbstractC31177DnL.A0v(context, A0H, user.getUsername(), 2131966057);
                            A0H.A0d(null, AbstractC166997dE.A0p(context, 2131966056));
                            AbstractC166987dD.A1W(A0H);
                        }
                    }
                    str2 = "MaxFollowedFriendshipException";
                } else {
                    if (edr.A05) {
                        C129885ts.A02(context, c1p1, edr, c129885ts);
                        c154706xL.A03 = "PrivatePublicSwitchRestriction";
                        enumC33422Ept = EnumC33422Ept.A08;
                        str = edr.A03;
                    } else {
                        GrowthFrictionInterventionDetailImpl growthFrictionInterventionDetailImpl = edr.A00;
                        if (growthFrictionInterventionDetailImpl != null) {
                            final GT3 gt3 = new GT3(context, c1p1, c38321qM, c75113Zb, searchContext, c129885ts, enumC33402EpZ, user, bool, num, str4, str5, str6, str7, jSONObject, z2);
                            Runnable runnable = new Runnable() { // from class: X.GN4
                                @Override // java.lang.Runnable
                                public final /* synthetic */ void run() {
                                    InterfaceC16820sZ.this.invoke();
                                }
                            };
                            C14360o3.A0B(context, 0);
                            ITB.A00(context, growthFrictionInterventionDetailImpl, userSession, EnumC193348hE.A06, user, C05F.A00, runnable, true);
                            str2 = "GrowthFrictionException";
                        } else if (edr.mSpam) {
                            String str8 = edr.A02;
                            String A002 = AbstractC111324zv.A00(2381);
                            if (str8 != null && str8.equals(A002)) {
                                c154706xL.A03 = "SentryBlockAccess";
                                enumC33422Ept = EnumC33422Ept.A08;
                                str = edr.mFeedbackMessage;
                            }
                        }
                    }
                    A00.A05(enumC33422Ept, TraceFieldType.FailureReason, str);
                }
                c154706xL.A03 = str2;
                A00.A05(EnumC33422Ept.A08, TraceFieldType.FailureReason, str2);
            }
        }
        if (c154706xL.A03 == null) {
            String A003 = MSV.A00(366);
            c154706xL.A03 = A003;
            A00.A05(EnumC33422Ept.A08, TraceFieldType.FailureReason, A003);
        }
        A00.A04(EnumC33422Ept.A08, abstractC115105If.toString());
        A00.A04(EnumC33422Ept.A09, abstractC115105If.toString());
        C1P1 c1p12 = this.A01;
        if (c1p12 != null) {
            c1p12.onFail(abstractC115105If);
        }
        C0f9.A0A(1324660419, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        Boolean Ca4;
        Boolean Ca42;
        int A03 = C0f9.A03(637441075);
        int A0N = AbstractC167017dG.A0N(obj, -1166767832);
        UserSession userSession = this.A06.A02;
        FRl A00 = FA7.A00(userSession);
        super.onSuccess(obj);
        A00.A01(EnumC33422Ept.A08, null);
        A00.A01(EnumC33422Ept.A09, null);
        C1P1 c1p1 = this.A01;
        if (c1p1 != null) {
            c1p1.onSuccess(obj);
        }
        Context context = this.A00;
        EnumC33402EpZ enumC33402EpZ = this.A07;
        User user = this.A08;
        Activity activity = (Activity) AbstractC13320mI.A00(context, Activity.class);
        if (enumC33402EpZ == EnumC33402EpZ.A07 && C1VN.A00 != null && activity != null) {
            AbstractC31282Dp4.A00().A00(activity, userSession, "2022623244751835", AbstractC47112Ks7.A00(user.getId()));
        }
        C06090Tz c06090Tz = C06090Tz.A06;
        if (C18U.A06(c06090Tz, userSession, 36318410958772356L) && enumC33402EpZ == EnumC33402EpZ.A06 && (Ca42 = user.A03.Ca4()) != null && Ca42.booleanValue()) {
            List A04 = C23031Ai.A04(AbstractC23021Ah.A00(userSession), "parenting_accounts_followed");
            if (A04.isEmpty()) {
                A04 = AbstractC166987dD.A1E();
            }
            ArrayList A1F = AbstractC166987dD.A1F(A04);
            if (!A1F.contains(user.getId())) {
                AbstractC31173DnH.A1X(user, A1F);
                C23031Ai.A06(AbstractC23021Ah.A00(userSession), "parenting_accounts_followed", A1F);
                AbstractC31179DnN.A0A(AbstractC12220kQ.A02(userSession), "ig_parent_follows_parenting_account").Cht();
            }
        }
        if (C18U.A06(c06090Tz, userSession, 36318410958772356L) && ((enumC33402EpZ == EnumC33402EpZ.A0A || enumC33402EpZ == EnumC33402EpZ.A05) && (Ca4 = user.A03.Ca4()) != null && Ca4.booleanValue())) {
            List A042 = C23031Ai.A04(AbstractC23021Ah.A00(userSession), "parenting_accounts_followed");
            if (A042.isEmpty()) {
                A042 = AbstractC166987dD.A1E();
            }
            ArrayList A1F2 = AbstractC166987dD.A1F(A042);
            if (A1F2.contains(user.getId())) {
                A1F2.remove(user.getId());
                C23031Ai.A06(AbstractC23021Ah.A00(userSession), "parenting_accounts_followed", A1F2);
            }
            ArrayList A0U = AbstractC001800i.A0U(AbstractC23021Ah.A00(userSession).A0G());
            if (A0U.contains(user.getId())) {
                A0U.remove(user.getId());
                C23031Ai.A06(AbstractC23021Ah.A00(userSession), AbstractC111324zv.A00(2854), A0U);
            }
        }
        C0f9.A0A(867300848, A0N);
        C0f9.A0A(714899983, A03);
    }
}
