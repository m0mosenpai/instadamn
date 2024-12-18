package X;

import com.facebook.R;
import com.instagram.api.schemas.FanClubNextStepsCompletionState;
import com.instagram.api.schemas.FanClubNextStepsRecommendationsType;
import com.instagram.common.session.UserSession;

/* renamed from: X.OVf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55002OVf {
    public final UserSession A00;
    public final C99694dm A01;
    public final String A02;

    public final C56476P5q A01(InterfaceC58224PrU interfaceC58224PrU, Integer num, InterfaceC16660sJ interfaceC16660sJ) {
        int i;
        C14360o3.A0B(interfaceC58224PrU, 0);
        C51783Mun c51783Mun = (C51783Mun) interfaceC58224PrU;
        FanClubNextStepsRecommendationsType fanClubNextStepsRecommendationsType = c51783Mun.A01;
        if (fanClubNextStepsRecommendationsType != FanClubNextStepsRecommendationsType.A0J) {
            A00(this, num, fanClubNextStepsRecommendationsType.toString());
            BQO A00 = MVZ.A00(c51783Mun.A0B);
            BQO A002 = MVZ.A00(c51783Mun.A09);
            C52520NLn c52520NLn = new C52520NLn(c51783Mun.A0A);
            FanClubNextStepsCompletionState fanClubNextStepsCompletionState = c51783Mun.A00;
            int ordinal = fanClubNextStepsCompletionState.ordinal();
            if (ordinal != 1) {
                if (ordinal != 3 && ordinal != 0) {
                    if (ordinal != 2) {
                        throw B4Z.A00();
                    }
                } else {
                    i = R.attr.igds_color_primary_icon;
                }
            } else {
                i = R.attr.igds_color_success;
            }
            return new C56476P5q(new ViewOnClickListenerC31591DuJ(7, interfaceC58224PrU, interfaceC16660sJ), A00, A002, c52520NLn, i, AbstractC167007dF.A1X(fanClubNextStepsCompletionState, FanClubNextStepsCompletionState.A04));
        }
        return null;
    }

    public static final void A00(C55002OVf c55002OVf, Integer num, String str) {
        C99694dm c99694dm = c55002OVf.A01;
        String str2 = c55002OVf.A02;
        C14360o3.A0B(str, 2);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c99694dm.A00, "ig_fan_club_settings_recommendations_recommendation_impression");
        AbstractC31171DnF.A1I(A0f, F7L.A00(num));
        AbstractC31178DnM.A17(A0f, c99694dm.A01.userId);
        A0f.AAP("origin", str2);
        A0f.AAP("settings_recommendation_type", str);
        A0f.Cht();
    }

    public /* synthetic */ C55002OVf(UserSession userSession, String str) {
        C99694dm A00 = AbstractC99684dl.A00(userSession);
        AbstractC167027dH.A13(userSession, str, A00);
        this.A00 = userSession;
        this.A02 = str;
        this.A01 = A00;
    }
}
