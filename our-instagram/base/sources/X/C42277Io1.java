package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Io1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42277Io1 implements InterfaceC60602pj {
    public C56352iT A00;
    public InterfaceC42271xH A01;
    public UserSession A02;
    public C41635IbQ A03;
    public User A04;
    public String A05;
    public String A06;
    public final C6FG A07;
    public final C102884kP A08;
    public final InterfaceC09390do A09 = AbstractC09440dt.A01(new C50150MDd(this, 17));
    public final InterfaceC09390do A0A = AbstractC09440dt.A01(new C50150MDd(this, 18));

    public final void A02(UserSession userSession, C1563970j c1563970j) {
        C102884kP c102884kP = this.A08;
        if (!c102884kP.A0S(42, false) && !A03()) {
            SpannableStringBuilder A0H = AbstractC25225BEi.A0H(this.A06);
            User user = this.A04;
            if (user != null && user.isVerified()) {
                C85963sQ.A08(C6BQ.A03(this.A07), A0H, true);
            }
            A01().Efv(A0H);
            return;
        }
        boolean A1Z = AbstractC167007dF.A1Z(this.A0A);
        C41635IbQ c41635IbQ = this.A03;
        if (c41635IbQ == null) {
            String str = this.A05;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            String str3 = this.A06;
            C6FG c6fg = this.A07;
            String moduleName = C6BQ.A07(c6fg).getModuleName();
            String str4 = null;
            String A0F = c102884kP.A0F();
            if (A0F != null) {
                str2 = A0F;
            }
            Fragment A00 = C6BQ.A00(c6fg);
            C14360o3.A0C(A00, AbstractC43591JPw.A00(0));
            AbstractC59962oe abstractC59962oe = (AbstractC59962oe) A00;
            C42872Ixm c42872Ixm = new C42872Ixm(this);
            String A0L = c102884kP.A0L(62);
            if (A0L != null) {
                str4 = A0L;
            }
            AbstractC167007dF.A1H(moduleName, 3, abstractC59962oe);
            c41635IbQ = new C41635IbQ(abstractC59962oe.requireContext(), abstractC59962oe, abstractC59962oe, userSession, c42872Ixm, c1563970j, str, str3, moduleName, str2, str4, A1Z);
            this.A03 = c41635IbQ;
        }
        c41635IbQ.A02(A01());
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void ADK(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void D8S(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onCreate() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onDestroy() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onDestroyView() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onPause() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStart() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStop() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x008e, code lost:
    
        if (r0 == false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C42277Io1 r25) {
        /*
            Method dump skipped, instructions count: 449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42277Io1.A00(X.Io1):void");
    }

    public final C56352iT A01() {
        C56352iT c56352iT = this.A00;
        if (c56352iT != null) {
            return c56352iT;
        }
        C14360o3.A0F("actionBarService");
        throw C00O.createAndThrow();
    }

    public final boolean A03() {
        C102884kP c102884kP = this.A08;
        InterfaceC103384lE A0B = c102884kP.A0B(50);
        if (A0B != null) {
            return C6DZ.A01(C6FP.A03(this.A07, c102884kP, C6FW.A01, A0B));
        }
        return false;
    }

    public C42277Io1(C6FG c6fg, C102884kP c102884kP, UserSession userSession) {
        User user;
        this.A07 = c6fg;
        this.A08 = c102884kP;
        this.A02 = userSession;
        this.A05 = c102884kP.A0E();
        UserSession userSession2 = this.A02;
        if (userSession2 != null) {
            user = AnonymousClass189.A00(userSession2).A02(this.A05);
        } else {
            user = null;
        }
        this.A04 = user;
        String A0L = c102884kP.A0L(59);
        this.A06 = A0L != null ? A0L : null;
    }

    @Override // X.InterfaceC60602pj
    public final void onResume() {
        A01().A0T();
        A00(this);
    }
}
