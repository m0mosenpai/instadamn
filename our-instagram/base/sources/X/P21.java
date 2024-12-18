package X;

import android.content.Context;
import android.widget.TextView;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim;
import com.instagram.pendingmedia.model.UserStoryTarget;

/* loaded from: classes9.dex */
public final class P21 implements InterfaceC58148PqD {
    public final Context A00;
    public final UserSession A01;
    public final IngestSessionShim A02;
    public final P28 A03;
    public final C54530O7h A04;
    public final InterfaceC58010Pnu A05;

    @Override // X.InterfaceC58148PqD
    public final int BQ4(TextView textView) {
        C14360o3.A0B(textView, 0);
        return this.A03.BPz(textView);
    }

    @Override // X.InterfaceC58148PqD
    public final void DAS() {
    }

    @Override // X.InterfaceC58148PqD
    public final void Dka() {
        C35168FfK AXK = this.A05.AXK();
        C51690MsL c51690MsL = C51690MsL.A09;
        Context context = this.A00;
        UserSession userSession = this.A01;
        UserStoryTarget userStoryTarget = UserStoryTarget.A05;
        AXK.A06(new C56383P1s(context, userSession, this.A02, userStoryTarget, this.A04.A00, "ig_story_composer", false), c51690MsL);
        this.A03.DlS(userStoryTarget);
    }

    @Override // X.InterfaceC58148PqD
    public final void Dw9() {
        this.A05.AXK().A08(C51690MsL.A09);
        this.A03.DwD(UserStoryTarget.A05);
    }

    public P21(Context context, UserSession userSession, IngestSessionShim ingestSessionShim, P28 p28, C54530O7h c54530O7h, InterfaceC58010Pnu interfaceC58010Pnu) {
        AbstractC25234BEr.A1P(context, userSession, ingestSessionShim);
        AbstractC167017dG.A1T(c54530O7h, p28);
        this.A00 = context;
        this.A01 = userSession;
        this.A05 = interfaceC58010Pnu;
        this.A02 = ingestSessionShim;
        this.A04 = c54530O7h;
        this.A03 = p28;
    }
}
