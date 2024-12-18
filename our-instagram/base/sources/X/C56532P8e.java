package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.P8e, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56532P8e implements InterfaceC63982vJ, JHJ {
    public User A00;
    public final Activity A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;
    public final IM7 A04;
    public final UserDetailFragment A05;
    public final C38E A06;
    public final List A07;
    public final boolean A08;

    public C56532P8e(InterfaceC11380iw interfaceC11380iw, UserSession userSession, IM7 im7, UserDetailFragment userDetailFragment) {
        C14360o3.A0B(userSession, 1);
        this.A03 = userSession;
        this.A05 = userDetailFragment;
        this.A02 = interfaceC11380iw;
        this.A04 = im7;
        this.A01 = userDetailFragment.requireActivity();
        this.A06 = new C38E(userDetailFragment, userSession, new C38C(userDetailFragment));
        this.A08 = AbstractC166997dE.A0Y(userSession).A2M();
        this.A07 = AbstractC166987dD.A1E();
    }

    @Override // X.InterfaceC63982vJ
    public final /* synthetic */ void DHC(Reel reel, C6X4 c6x4) {
    }

    @Override // X.InterfaceC63982vJ
    public final /* synthetic */ void Ddi(Reel reel) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0078, code lost:
    
        if (r10 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007a, code lost:
    
        X.C0w9.A03("ProfileReelGridDelegate", X.AbstractC111324zv.A00(3725));
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0085, code lost:
    
        return;
     */
    @Override // X.JHJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void De9(com.instagram.ui.widget.spinner.SpinnerImageView r24, java.lang.String r25, int r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56532P8e.De9(com.instagram.ui.widget.spinner.SpinnerImageView, java.lang.String, int, int, int):void");
    }

    @Override // X.InterfaceC63982vJ
    public final /* synthetic */ void DeI(Reel reel) {
    }

    public static final void A00(C56532P8e c56532P8e, String str) {
        String str2;
        C1571673v c1571673v = C1571673v.A00;
        UserSession userSession = c56532P8e.A03;
        InterfaceC11380iw interfaceC11380iw = c56532P8e.A02;
        EnumC1571773w enumC1571773w = EnumC1571773w.A05;
        String str3 = userSession.userId;
        if (c56532P8e.A08) {
            str2 = "forced_migration";
        } else {
            str2 = "opt_in";
        }
        c1571673v.A0D(interfaceC11380iw, userSession, enumC1571773w, str, str3, str2, null);
    }

    @Override // X.JHJ
    public final void DeB(String str, int i) {
        UserSession userSession = this.A03;
        Reel A0R = MSY.A0R(userSession, str);
        if (A0R != null && A0R.A0W != null) {
            Activity activity = this.A01;
            UserDetailFragment userDetailFragment = this.A05;
            new C55173Odc(activity, userDetailFragment, userDetailFragment, userSession, A0R).A04(new C55849Oqz(A0R, this, str), C05F.A01);
        }
    }
}
