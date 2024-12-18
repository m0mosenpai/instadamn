package X;

import android.app.Activity;
import android.content.Context;
import android.widget.TextView;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim;
import com.instagram.pendingmedia.model.AllUserStoryTarget;
import com.instagram.pendingmedia.model.CloseFriendsUserStoryTarget;
import com.instagram.pendingmedia.model.UserStoryTarget;
import com.instagram.pendingmedia.store.PendingMediaStore;

/* loaded from: classes9.dex */
public final class P22 implements InterfaceC58148PqD {
    public final Context A00;
    public final UserSession A01;
    public final IngestSessionShim A02;
    public final C51690MsL A03;
    public final InterfaceC58149PqE A04;
    public final UserStoryTarget A05;
    public final InterfaceC58010Pnu A06;
    public final InterfaceC11380iw A07;
    public final C195918ld A08;
    public final boolean A09;

    @Override // X.InterfaceC58148PqD
    public final void DAS() {
    }

    @Override // X.InterfaceC58148PqD
    public final int BQ4(TextView textView) {
        return this.A04.BPz(textView);
    }

    @Override // X.InterfaceC58148PqD
    public final void Dka() {
        String str;
        Integer num;
        EnumC76383bi enumC76383bi;
        UserSession userSession = this.A01;
        PendingMediaStore A00 = C25A.A00(userSession);
        IngestSessionShim ingestSessionShim = this.A02;
        C47Z A03 = A00.A03((String) AbstractC166987dD.A16(ingestSessionShim.A00));
        if (A03 != null) {
            UserStoryTarget userStoryTarget = this.A05;
            if (userStoryTarget == UserStoryTarget.A02) {
                enumC76383bi = EnumC76383bi.A04;
            } else if (userStoryTarget == UserStoryTarget.A06) {
                enumC76383bi = EnumC76383bi.A0A;
            } else if (userStoryTarget == UserStoryTarget.A09) {
                enumC76383bi = EnumC76383bi.A05;
            }
            A03.A1F = enumC76383bi;
        }
        Context context = this.A00;
        AbstractC13320mI.A00(context, Activity.class);
        String obj = C51690MsL.A07.toString();
        C51690MsL c51690MsL = this.A03;
        if (obj.equals(c51690MsL.toString()) && A03 != null && AbstractC101614hW.A0E(A03.A4b)) {
            AbstractC35234FgS.A04(userSession, context);
            return;
        }
        boolean z = this.A09;
        String str2 = null;
        if (z) {
            if (A03 != null) {
                str = C70343Ds.A01(A03);
                str2 = A03.A0H();
            } else {
                str = null;
            }
            AbstractC54107Nw5.A00(userSession, "primary_click", "share_sheet", str, str2, null);
            if (C196008lp.A00(userSession)) {
                num = C05F.A00;
            } else {
                num = C05F.A0j;
            }
            str2 = AbstractC54206Nxk.A00(num);
        }
        InterfaceC58149PqE interfaceC58149PqE = this.A04;
        if (!interfaceC58149PqE.Ccu()) {
            return;
        }
        C35168FfK AXK = this.A06.AXK();
        UserStoryTarget userStoryTarget2 = this.A05;
        AXK.A06(new C56383P1s(context, userSession, ingestSessionShim, userStoryTarget2, null, str2, z), c51690MsL);
        interfaceC58149PqE.DlS(userStoryTarget2);
    }

    @Override // X.InterfaceC58148PqD
    public final void Dw9() {
        InterfaceC58010Pnu interfaceC58010Pnu = this.A06;
        interfaceC58010Pnu.AXK().A08(this.A03);
        interfaceC58010Pnu.AXK().A08(C51690MsL.A08);
        this.A04.DwD(this.A05);
    }

    public P22(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, IngestSessionShim ingestSessionShim, InterfaceC58149PqE interfaceC58149PqE, UserStoryTarget userStoryTarget, C195918ld c195918ld, InterfaceC58010Pnu interfaceC58010Pnu, boolean z) {
        C51690MsL A01;
        this.A00 = context;
        this.A01 = userSession;
        this.A04 = interfaceC58149PqE;
        this.A06 = interfaceC58010Pnu;
        this.A09 = z;
        this.A05 = userStoryTarget;
        this.A02 = ingestSessionShim;
        if (userStoryTarget instanceof AllUserStoryTarget) {
            A01 = C51690MsL.A03;
        } else if (userStoryTarget instanceof CloseFriendsUserStoryTarget) {
            A01 = C51690MsL.A05;
        } else {
            C51690MsL c51690MsL = C51690MsL.A02;
            A01 = OP5.A01(userStoryTarget);
        }
        this.A03 = A01;
        this.A07 = interfaceC11380iw;
        this.A08 = c195918ld;
    }
}
