package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.api.schemas.Achievement;
import com.instagram.api.schemas.Challenge;
import com.instagram.api.schemas.ChallengeName;
import com.instagram.api.schemas.ChallengeState;
import com.instagram.api.schemas.GoalsToastInfo;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediatype.ProductType;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1ZE, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1ZE extends C1ZF {
    public CUV A00;

    @Override // X.C1ZF
    public final void A01(FragmentActivity fragmentActivity, Achievement achievement, UserSession userSession, String str, List list, List list2, boolean z, boolean z2) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(fragmentActivity, 1);
        C14360o3.A0B(achievement, 2);
        A00();
        new C189448aO(userSession).A00().A02(fragmentActivity, AbstractC27636CHh.A00(String.valueOf(achievement.A01), null, str, list, list2, z, z2));
    }

    @Override // X.C1ZF
    public final void A02(FragmentActivity fragmentActivity, Challenge challenge, UserSession userSession, CQS cqs, String str) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(fragmentActivity, 1);
        C14360o3.A0B(challenge, 2);
        A00();
        long j = challenge.A02;
        ChallengeName challengeName = challenge.A05;
        ChallengeState challengeState = challenge.A06;
        C14360o3.A0B(challengeName, 1);
        C14360o3.A0B(challengeState, 2);
        C26747BrT c26747BrT = new C26747BrT();
        c26747BrT.setArguments(AbstractC61636Rr0.A00(new C09530e4("CHALLENGE_ID_KEY", Long.valueOf(j)), new C09530e4("CHALLENGE_NAME_KEY", challengeName), new C09530e4("CHALLENGE_STATE_KEY", challengeState), new C09530e4("ENTRY_POINT_KEY", str)));
        AbstractC10360h2 abstractC10360h2 = fragmentActivity.mFragments.A00.A03;
        C14360o3.A07(abstractC10360h2);
        abstractC10360h2.A0u(new C28881Cop(cqs), fragmentActivity, "CHALLENGE_DETAILS_BOTTOMSHEET_REQUEST_KEY");
        new C189448aO(userSession).A00().A02(fragmentActivity, c26747BrT);
    }

    @Override // X.C1ZF
    public final void A03(FragmentActivity fragmentActivity, UserSession userSession, C38321qM c38321qM) {
        C1ON A00;
        C1P1 c26964Bv5;
        InterfaceC43539JKz AYF;
        Integer BXd;
        C14360o3.A0B(fragmentActivity, 0);
        C14360o3.A0B(c38321qM, 2);
        ProductType A1z = c38321qM.A1z();
        if (A1z != null) {
            int ordinal = A1z.ordinal();
            if (ordinal != 13 && ordinal != 1 && ordinal != 16) {
                if (ordinal != 9) {
                    return;
                }
            } else if (c38321qM.A0C.BAB() != null) {
                GoalsToastInfo BAB = c38321qM.A0C.BAB();
                if (BAB == null) {
                    return;
                }
                C146106i8 c146106i8 = new C146106i8();
                c146106i8.A04();
                c146106i8.A0D = BAB.C93();
                c146106i8.A01 = 5000;
                c146106i8.A0J = true;
                c146106i8.A02();
                c146106i8.A04 = fragmentActivity.getDrawable(R.drawable.instagram_bullseye_pano_outline_24);
                c146106i8.A0R = true;
                String Aj7 = BAB.Aj7();
                if (Aj7 != null) {
                    c146106i8.A0G = Aj7;
                }
                c146106i8.A0A(new C42697Ius(fragmentActivity, BAB, userSession, c38321qM));
                c146106i8.A01();
                C41451vu.A01.A01(new C3KD(c146106i8.A00()));
                return;
            }
            InterfaceC43539JKz AYF2 = c38321qM.A0C.AYF();
            if (AYF2 != null && AYF2.getShowAchievements() && (AYF = c38321qM.A0C.AYF()) != null && (BXd = AYF.BXd()) != null && BXd.intValue() > 0) {
                C27957CUb c27957CUb = new C27957CUb(userSession);
                String A2u = c38321qM.A2u();
                if (A2u != null) {
                    A00 = c27957CUb.A00(A2u);
                    c26964Bv5 = new C26963Bv4(fragmentActivity, userSession, this, c38321qM);
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                InterfaceC43539JKz AYF3 = c38321qM.A0C.AYF();
                if (AYF3 == null || !AYF3.Bw6()) {
                    return;
                }
                C27957CUb c27957CUb2 = new C27957CUb(userSession);
                String A2u2 = c38321qM.A2u();
                if (A2u2 != null) {
                    A00 = c27957CUb2.A00(A2u2);
                    c26964Bv5 = new C26964Bv5(fragmentActivity, userSession, this, c38321qM);
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            A00.A00 = c26964Bv5;
            C1GJ.A03(A00);
        }
    }

    @Override // X.C1ZF
    public final void A04(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2, List list) {
        C189478aR c189478aR;
        Fragment fragment;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(fragmentActivity, 1);
        C14360o3.A0B(list, 2);
        if (list.size() == 1) {
            String str3 = (String) list.get(0);
            A00();
            fragment = AbstractC27636CHh.A00(str3, str, str2, null, null, false, false);
            c189478aR = new C189448aO(userSession).A00();
        } else {
            A00();
            C26862BtO c26862BtO = new C26862BtO();
            Bundle bundle = new Bundle();
            bundle.putString("mediaId", str);
            bundle.putStringArrayList("achievementIds", new ArrayList<>(list));
            bundle.putString("entryPoint", str2);
            c26862BtO.setArguments(bundle);
            C189478aR A00 = AbstractC47841LBf.A00(fragmentActivity, userSession);
            c26862BtO.A03 = new C29239Cui(fragmentActivity, userSession, this, A00, str, str2);
            fragment = c26862BtO;
            c189478aR = A00;
        }
        c189478aR.A02(fragmentActivity, fragment);
    }

    @Override // X.C1ZF
    public final void A05(FragmentActivity fragmentActivity, UserSession userSession, String str, List list) {
        C14360o3.A0B(list, 3);
        A00();
        C26756Brd A00 = F1B.A00(null, str, null, list);
        C140966Yy c140966Yy = new C140966Yy(fragmentActivity, userSession);
        c140966Yy.A0B(null, A00);
        c140966Yy.A08();
        c140966Yy.A04();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.CUV, java.lang.Object] */
    @Override // X.C1ZF
    public final CUV A00() {
        CUV cuv = this.A00;
        if (cuv == null) {
            ?? obj = new Object();
            this.A00 = obj;
            return obj;
        }
        return cuv;
    }
}
