package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.2vD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C63922vD implements InterfaceC63932vE, InterfaceC63942vF {
    public static String A06 = "v1";
    public InterfaceC690438q A00;
    public final Context A01;
    public final AbstractC60672pq A02;
    public final UserSession A03;
    public final InterfaceC60442pS A04;
    public final C63952vG A05;

    @Override // X.InterfaceC63942vF
    public final void DB4(C41232IMx c41232IMx) {
    }

    @Override // X.InterfaceC63932vE
    public final void Dcd(C41222IMn c41222IMn, C41232IMx c41232IMx) {
    }

    @Override // X.InterfaceC63932vE
    public final void Dce(String str, int i) {
    }

    public static final void A00(C42520Irz c42520Irz, C63922vD c63922vD) {
        User user = c42520Irz.A01.A01;
        if (user != null) {
            FragmentActivity requireActivity = c63922vD.A02.requireActivity();
            UserSession userSession = c63922vD.A03;
            C140966Yy c140966Yy = new C140966Yy(requireActivity, userSession);
            c140966Yy.A0D(AbstractC31364DqT.A03().A01.A02(userSession, AbstractC31402Dr6.A01(userSession, user.getId(), "feed_survey", c63922vD.A04.getModuleName()).A03()));
            c140966Yy.A0B = "survey_owner";
            c140966Yy.A04();
        }
    }

    public static final void A01(C42520Irz c42520Irz, C63922vD c63922vD, C42666IuN c42666IuN) {
        if (c63922vD.A00 != null) {
            C42592ItB c42592ItB = new C42592ItB(c42520Irz, c42666IuN);
            C3FQ scrollingViewProxy = c63922vD.A02.getScrollingViewProxy();
            InterfaceC690438q interfaceC690438q = c63922vD.A00;
            if (interfaceC690438q != null) {
                c42592ItB.A00(interfaceC690438q, scrollingViewProxy);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public static final void A02(C42520Irz c42520Irz, C63922vD c63922vD, C42666IuN c42666IuN) {
        c42666IuN.A01 = C05F.A00;
        UserSession userSession = c63922vD.A03;
        InterfaceC60442pS interfaceC60442pS = c63922vD.A04;
        C41232IMx A00 = c42520Irz.A00();
        C82713mZ c82713mZ = new C82713mZ(interfaceC60442pS, AnonymousClass001.A0R("instagram_ad_", AbstractC111324zv.A00(1320)));
        c82713mZ.A7Q = c42520Irz.CAR();
        String str = A00.A03.A03;
        if (str != null) {
            c82713mZ.A6e = str;
            c82713mZ.A8A = AbstractC001800i.A0X(A00.A00());
            c82713mZ.A73 = C1XV.A0K.toString();
            C32U.A0H(userSession, c82713mZ, interfaceC60442pS);
            A01(c42520Irz, c63922vD, c42666IuN);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.InterfaceC63932vE
    public final /* bridge */ /* synthetic */ void DHH(Object obj, Object obj2) {
        C42520Irz c42520Irz = (C42520Irz) obj;
        C42666IuN c42666IuN = (C42666IuN) obj2;
        C14360o3.A0B(c42520Irz, 0);
        C14360o3.A0B(c42666IuN, 1);
        if (!C14360o3.A0K(A06, "v2") && !C14360o3.A0K(A06, "v3")) {
            A02(c42520Irz, this, c42666IuN);
            return;
        }
        C41451vu c41451vu = C41451vu.A01;
        C146106i8 c146106i8 = new C146106i8();
        c146106i8.A0D = this.A01.getString(2131975039);
        c41451vu.E4s(new C3KD(c146106i8.A00()));
        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC71575WwS(c42520Irz, this, c42666IuN), 500L);
    }

    public C63922vD(Context context, AbstractC60672pq abstractC60672pq, UserSession userSession, C57112jm c57112jm, InterfaceC60442pS interfaceC60442pS) {
        this.A01 = context;
        this.A02 = abstractC60672pq;
        this.A03 = userSession;
        this.A04 = interfaceC60442pS;
        this.A05 = new C63952vG(c57112jm, this);
        C06090Tz c06090Tz = C06090Tz.A05;
        boolean A062 = C18U.A06(c06090Tz, userSession, 36318080246290307L);
        boolean A063 = C18U.A06(c06090Tz, userSession, 2342172599972282788L);
        if (A062) {
            A06 = "v2";
        }
        if (A063) {
            A06 = "v3";
        }
    }

    @Override // X.InterfaceC63932vE
    public final /* bridge */ /* synthetic */ void DHF(Object obj, Object obj2) {
    }
}
