package X;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.model.business.BusinessInfo;
import com.instagram.model.business.PublicPhoneContact;
import com.instagram.user.model.User;
import java.util.HashMap;

/* renamed from: X.EUu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32544EUu extends C1P1 {
    public C33177EkO A00;
    public final Context A01;
    public final AbstractC10360h2 A02;
    public final C07270a1 A03;
    public final GY6 A04;
    public final EnumC33445EqI A05;
    public final /* synthetic */ Handler A06;
    public final /* synthetic */ AbstractC59962oe A07;
    public final /* synthetic */ AbstractC12990ll A08;
    public final /* synthetic */ BusinessInfo A09;
    public final /* synthetic */ EnumC33445EqI A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ String A0C;

    public C32544EUu(Context context, Handler handler, AbstractC10360h2 abstractC10360h2, AbstractC59962oe abstractC59962oe, C07270a1 c07270a1, AbstractC12990ll abstractC12990ll, BusinessInfo businessInfo, GY6 gy6, EnumC33445EqI enumC33445EqI, EnumC33445EqI enumC33445EqI2, String str, String str2) {
        this.A08 = abstractC12990ll;
        this.A09 = businessInfo;
        this.A0C = str;
        this.A06 = handler;
        this.A07 = abstractC59962oe;
        this.A0A = enumC33445EqI2;
        this.A0B = str2;
        this.A01 = context;
        this.A03 = c07270a1;
        this.A02 = abstractC10360h2;
        this.A04 = gy6;
        this.A05 = enumC33445EqI;
    }

    public static void A00(C32544EUu c32544EUu, UserSession userSession, EDQ edq) {
        C33177EkO c33177EkO = c32544EUu.A00;
        if (c33177EkO != null) {
            c33177EkO.A08();
        }
        if (edq.A05) {
            synchronized (C35154Few.A00()) {
            }
            AbstractC59962oe abstractC59962oe = c32544EUu.A07;
            C1UC activity = abstractC59962oe.getActivity();
            if (activity instanceof InterfaceC37222GaX) {
                AbstractC31174DnI.A1S((InterfaceC37222GaX) activity);
            }
            AbstractC31525Dt9.A05(abstractC59962oe.requireActivity(), AbstractC08820cl.A03(AnonymousClass001.A0R("instagram://professional_signup_nux?entry_point=", c32544EUu.A0B)), abstractC59962oe, userSession);
            C34907FZt.A00 = null;
            C35146Fen.A02(abstractC59962oe.requireContext());
            return;
        }
        User A10 = AbstractC166987dD.A10(userSession);
        A10.A03.EYn(AbstractC25227BEk.A0p());
        AbstractC31177DnL.A1O(A10);
        c32544EUu.A06.post(new RunnableC36879GNa(c32544EUu, userSession));
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(1940633790);
        EDQ edq = (EDQ) obj;
        int A032 = C0f9.A03(493414084);
        User user = edq.A01;
        user.A03.Edl(edq.A02);
        boolean z = edq.A05;
        C07270a1 c07270a1 = this.A03;
        if (z) {
            String id = user.getId();
            String str = this.A05.A00;
            C14360o3.A0B(c07270a1, 0);
            FD1.A00(c07270a1, null, "done", id, str, "business", null);
        } else {
            String id2 = user.getId();
            String str2 = this.A05.A00;
            AbstractC167017dG.A1N(c07270a1, str2);
            FD7.A00(c07270a1, null, str2, "business", id2, null).Cht();
        }
        String id3 = user.getId();
        AbstractC12990ll abstractC12990ll = this.A08;
        String str3 = null;
        if (C18U.A06(C06090Tz.A05, abstractC12990ll, 36315413071727797L)) {
            BusinessFlowAnalyticsLogger A01 = AbstractC151606s6.A01(EnumC151596s5.A03, abstractC12990ll, "business_account_creation", AbstractC166997dE.A0n());
            BusinessInfo businessInfo = this.A09;
            String str4 = businessInfo.A0J;
            PublicPhoneContact publicPhoneContact = businessInfo.A01;
            if (publicPhoneContact != null) {
                str3 = publicPhoneContact.A02;
            }
            String str5 = businessInfo.A0B;
            String str6 = this.A0C;
            String str7 = businessInfo.A09;
            CallerContext callerContext = C35786FrO.A00;
            HashMap A1G = AbstractC166987dD.A1G();
            A1G.put("email", str5);
            A1G.put("phone", str3);
            A1G.put("page_id", str4);
            A1G.put(AbstractC31190DnZ.A00(), str6);
            A1G.put("category_id", str7);
            A1G.put("personal_ig_id", AbstractC03270Dk.A02(abstractC12990ll));
            A1G.put("new_created_business_ig_id", id3);
            if (A01 != null) {
                C35154Few.A00();
                C35154Few.A00();
                A01.Clu(new Y7A(null, null, null, null, null, null, A1G, null));
            }
        } else {
            C35154Few.A00();
            C35154Few.A00();
            String str8 = this.A0C;
            BusinessInfo businessInfo2 = this.A09;
            String str9 = businessInfo2.A0J;
            PublicPhoneContact publicPhoneContact2 = businessInfo2.A01;
            if (publicPhoneContact2 != null) {
                str3 = publicPhoneContact2.A02;
            }
            String str10 = businessInfo2.A0B;
            String str11 = businessInfo2.A09;
            String A02 = AbstractC03270Dk.A02(abstractC12990ll);
            C19280xC A00 = F0H.A00(C05F.A01);
            A00.A0C(OptSvcAnalyticsStore.LOGGING_KEY_STEP, null);
            A00.A0C(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, null);
            A00.A0C("fb_user_id", null);
            A00.A0C("personal_ig_id", A02);
            A00.A0C("new_created_business_ig_id", id3);
            C19260xA c19260xA = new C19260xA();
            C19260xA.A00(c19260xA, str10, "email");
            C19260xA.A00(c19260xA, str3, "phone");
            C19260xA.A00(c19260xA, null, "address");
            C19260xA.A00(c19260xA, str9, "page_id");
            C19260xA.A00(c19260xA, str8, AbstractC31190DnZ.A00());
            C19260xA.A00(c19260xA, str11, "category_id");
            C19260xA.A00(c19260xA, null, "date_of_birth");
            A00.A05(c19260xA, "selected_values");
            if (abstractC12990ll != null) {
                AbstractC31173DnH.A1S(A00, abstractC12990ll);
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        UserSession A022 = AbstractC31525Dt9.A02(this.A01, null, c07270a1, user, null, false);
        if (edq.A06) {
            C1GJ.A03(new G0B(0, this, A022, edq));
        } else {
            A00(this, A022, edq);
        }
        C0f9.A0A(-1369955861, A032);
        C0f9.A0A(-658391784, A03);
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        String string;
        String string2;
        GY6 gy6;
        Integer num;
        String str;
        int A03 = C0f9.A03(-604137315);
        C33177EkO c33177EkO = this.A00;
        if (c33177EkO != null) {
            c33177EkO.A08();
        }
        if (abstractC115105If instanceof C115115Ig) {
            EDQ edq = (EDQ) abstractC115105If.A00();
            C34939FaP c34939FaP = edq.A00;
            if (c34939FaP != null) {
                string2 = c34939FaP.A01;
            } else {
                string2 = null;
            }
            if (c34939FaP != null) {
                string = c34939FaP.A00;
            } else {
                string = null;
            }
            if (TextUtils.isEmpty(string)) {
                string = edq.mErrorSource;
            }
            if (TextUtils.isEmpty(string)) {
                string = edq.getErrorMessage();
            }
            gy6 = this.A04;
            if (!edq.isFeedbackRequired() && gy6 != null) {
                num = C05F.A01;
                gy6.Eks(string, num);
            }
            C41451vu.A01.E4s(new C36045Fvh(string, C05F.A01));
        } else {
            Context context = this.A01;
            string = context.getString(2131968430);
            string2 = context.getString(2131976159);
            gy6 = this.A04;
            if (gy6 != null) {
                num = C05F.A00;
                gy6.Eks(string, num);
            }
            C41451vu.A01.E4s(new C36045Fvh(string, C05F.A01));
        }
        AbstractC12990ll abstractC12990ll = this.A08;
        C35154Few.A00();
        C35154Few.A00();
        BusinessInfo businessInfo = this.A09;
        String str2 = businessInfo.A0J;
        PublicPhoneContact publicPhoneContact = businessInfo.A01;
        if (publicPhoneContact != null) {
            str = publicPhoneContact.A02;
        } else {
            str = null;
        }
        String str3 = businessInfo.A0B;
        String str4 = businessInfo.A09;
        C19280xC A00 = F0H.A00(C05F.A0C);
        A00.A0C(OptSvcAnalyticsStore.LOGGING_KEY_STEP, null);
        A00.A0C(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, null);
        A00.A0C("fb_user_id", null);
        C19260xA c19260xA = new C19260xA();
        C19260xA.A00(c19260xA, str3, "email");
        C19260xA.A00(c19260xA, str, "phone");
        C19260xA.A00(c19260xA, null, "address");
        C19260xA.A00(c19260xA, str2, "page_id");
        C19260xA.A00(c19260xA, null, AbstractC31190DnZ.A00());
        C19260xA.A00(c19260xA, str4, "category_id");
        C19260xA.A00(c19260xA, null, "date_of_birth");
        A00.A05(c19260xA, "selected_values");
        if (string2 != null && string2.length() != 0) {
            A00.A0C("error_identifier", string);
        }
        if (string != null && string.length() != 0) {
            A00.A0C("error_message", string);
        }
        if (abstractC12990ll != null) {
            AbstractC31173DnH.A1S(A00, abstractC12990ll);
            C0f9.A0A(-1814569248, A03);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(959819418);
        super.onFinish();
        C0f9.A0A(2115904256, A03);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0SG, X.Uzp, X.EkO] */
    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(858135810);
        int A032 = C0f9.A03(-2123151724);
        super.onStart();
        ?? c67858Uzp = new C67858Uzp();
        this.A00 = c67858Uzp;
        c67858Uzp.A0B(this.A02, "ProgressDialog");
        C0f9.A0A(-1645178011, A032);
        C0f9.A0A(-1821353380, A03);
    }
}
