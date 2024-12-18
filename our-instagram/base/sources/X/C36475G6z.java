package X;

import android.app.Dialog;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.G6z, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36475G6z implements InterfaceC37198Ga9 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ Fragment A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ FPL A04;
    public final /* synthetic */ C35066Fcd A05;
    public final /* synthetic */ Integer A06;
    public final /* synthetic */ String A07;

    public C36475G6z(Context context, Fragment fragment, UserSession userSession, FPL fpl, C35066Fcd c35066Fcd, Integer num, String str, int i) {
        this.A00 = i;
        this.A02 = fragment;
        this.A03 = userSession;
        this.A05 = c35066Fcd;
        this.A06 = num;
        this.A01 = context;
        this.A04 = fpl;
        this.A07 = str;
    }

    @Override // X.InterfaceC37198Ga9
    public final void DP8() {
        Dialog dialog = this.A04.A00;
        if (dialog == null) {
            C14360o3.A0F("dialog");
            throw C00O.createAndThrow();
        }
        dialog.dismiss();
        Context context = this.A01;
        UserSession userSession = this.A03;
        AbstractC31177DnL.A0u(context, userSession, C2Fb.A1y, this.A07);
        FVE.A00(userSession, C05F.A00, C05F.A0Y, this.A06);
    }

    @Override // X.InterfaceC37198Ga9
    public final void Dar() {
        int i = this.A00;
        Fragment fragment = this.A02;
        UserSession userSession = this.A03;
        if (i == 3) {
            FVD.A01(fragment, userSession, C05F.A0N);
            C35066Fcd.A01(userSession);
        } else {
            FVD.A01(fragment, userSession, C05F.A01);
        }
        FVE.A00(userSession, C05F.A01, C05F.A0Y, this.A06);
    }

    @Override // X.InterfaceC37198Ga9
    public final void Dja() {
        Integer num;
        int i = this.A00;
        if (i == 3) {
            UserSession userSession = this.A03;
            C35066Fcd.A01(userSession);
            C140966Yy A0P = AbstractC31173DnH.A0P(this.A02.requireActivity(), userSession);
            A0P.A0D(F78.A00().A00.A00(this.A01, userSession, C05F.A0u));
            A0P.A04();
        }
        UserSession userSession2 = this.A03;
        if (i == 3) {
            num = C05F.A0N;
        } else {
            num = C05F.A0C;
        }
        FVE.A00(userSession2, num, C05F.A0Y, this.A06);
    }

    @Override // X.InterfaceC37198Ga9
    public final void onCancel() {
        if (this.A00 == 3) {
            UserSession userSession = this.A03;
            InterfaceC19630xq A0x = AbstractC166987dD.A0x(userSession);
            AbstractC167017dG.A1L(A0x.ARD(), A0x, "hidden_word_spam_scam_consent", 0);
            if (A0x.getInt("hidden_word_spam_scam_consent", 0) >= 2) {
                FVD.A01(this.A02, userSession, C05F.A0N);
            }
        }
        FVE.A00(this.A03, C05F.A0C, C05F.A0Y, this.A06);
    }
}
