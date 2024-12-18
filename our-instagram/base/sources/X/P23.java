package X;

import android.app.Activity;
import android.content.Context;
import android.widget.TextView;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim;
import com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController;
import com.instagram.pendingmedia.model.UserStoryTarget;
import java.util.Map;

/* loaded from: classes9.dex */
public final class P23 implements InterfaceC58148PqD {
    public final Context A00;
    public final UserSession A01;
    public final IngestSessionShim A02;
    public final C195918ld A03;
    public final C200018t5 A04;
    public final Map A05;
    public final InterfaceC11380iw A06;
    public final P27 A07;
    public final DirectPrivateStoryRecipientController A08;
    public final Ef3 A09;
    public final InterfaceC58010Pnu A0A;

    @Override // X.InterfaceC58148PqD
    public final void DAS() {
    }

    public static void A00(P23 p23) {
        C35168FfK AXK = p23.A0A.AXK();
        C51690MsL c51690MsL = C51690MsL.A08;
        Context context = p23.A00;
        UserSession userSession = p23.A01;
        UserStoryTarget userStoryTarget = UserStoryTarget.A04;
        AXK.A06(new C56383P1s(context, userSession, p23.A02, userStoryTarget, null, "ig_story_composer", false), c51690MsL);
        p23.A07.DlS(userStoryTarget);
    }

    @Override // X.InterfaceC58148PqD
    public final int BQ4(TextView textView) {
        return this.A07.BPz(textView);
    }

    @Override // X.InterfaceC58148PqD
    public final void Dka() {
        String str;
        String str2;
        UserSession userSession = this.A01;
        CallerContext callerContext = C180377zR.A00;
        C14360o3.A0B(userSession, 0);
        if (!C180377zR.A07(userSession) || !C180377zR.A03(userSession)) {
            EnumC222416a A01 = AbstractC08690cX.A01(userSession);
            if (!AbstractC166997dE.A0Y(userSession).CQw() && (EnumC222416a.A07 == A01 || EnumC222416a.A06 == A01)) {
                AbstractC35174FfR.A00(EnumC72435Xdf.A0L, userSession, "upsell_primary_click");
                DirectPrivateStoryRecipientController directPrivateStoryRecipientController = this.A08;
                AbstractC25651Mw.A00(directPrivateStoryRecipientController.A0B).A01(directPrivateStoryRecipientController.A0y, C211849aB.class);
                this.A09.A06(EnumC72412Xd8.A09.A01(), null);
                return;
            }
        }
        C47Z A03 = C25A.A00(userSession).A03(AbstractC25226BEj.A1I(this.A02.A00, 0));
        if (A03 != null) {
            str = A03.A0H();
            str2 = C70343Ds.A01(A03);
        } else {
            str = null;
            str2 = null;
        }
        AbstractC54107Nw5.A00(userSession, "primary_click", "share_sheet", str2, str, this.A05);
        Context context = this.A00;
        Activity activity = (Activity) AbstractC13320mI.A00(context, Activity.class);
        if (activity != null) {
            C200018t5 c200018t5 = this.A04;
            C54804OJy A00 = AbstractC54221Nxz.A00(activity, C82G.A0j, userSession);
            A00.A05 = new PG7(this, 5);
            A00.A04 = this.A03;
            A00.A0A = str;
            A00.A00 = context;
            c200018t5.A01(null, A00, new PGT(this, 4));
        }
    }

    @Override // X.InterfaceC58148PqD
    public final void Dw9() {
        this.A0A.AXK().A08(C51690MsL.A08);
        this.A07.DwD(UserStoryTarget.A04);
    }

    public P23(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, IngestSessionShim ingestSessionShim, P27 p27, DirectPrivateStoryRecipientController directPrivateStoryRecipientController, Ef3 ef3, C195918ld c195918ld, InterfaceC58010Pnu interfaceC58010Pnu, Map map) {
        this.A00 = context;
        this.A01 = userSession;
        this.A07 = p27;
        this.A0A = interfaceC58010Pnu;
        this.A02 = ingestSessionShim;
        this.A03 = c195918ld;
        this.A09 = ef3;
        this.A06 = interfaceC11380iw;
        this.A08 = directPrivateStoryRecipientController;
        this.A04 = new C200018t5(userSession);
        this.A05 = map;
    }
}
