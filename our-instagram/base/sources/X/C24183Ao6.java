package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.pendingmedia.model.constants.ShareType;

/* renamed from: X.Ao6, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24183Ao6 implements BD6 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Activity A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ TargetViewSizeProvider A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ InterfaceC16820sZ A07;

    @Override // X.BD6
    public final void DYT(Exception exc) {
    }

    public C24183Ao6(Activity activity, UserSession userSession, TargetViewSizeProvider targetViewSizeProvider, String str, String str2, String str3, InterfaceC16820sZ interfaceC16820sZ, int i) {
        this.A02 = userSession;
        this.A03 = targetViewSizeProvider;
        this.A01 = activity;
        this.A05 = str;
        this.A04 = str2;
        this.A06 = str3;
        this.A00 = i;
        this.A07 = interfaceC16820sZ;
    }

    @Override // X.BD6
    public final void DYU(C183978Ee c183978Ee) {
        UserSession userSession = this.A02;
        C47Z A02 = C9O1.A02(null, userSession, this.A03, null, null, c183978Ee, null, null);
        C14360o3.A07(A02);
        A02.A0T(EnumC40111tc.A0Q);
        A02.A2t = c183978Ee.A06();
        A02.A33 = c183978Ee.A06();
        A02.A3L = c183978Ee.A07();
        int i = c183978Ee.A09;
        A02.A0H = i;
        int i2 = c183978Ee.A06;
        A02.A0G = i2;
        A02.A02 = i / i2;
        A02.A0c(ShareType.A0G);
        AbstractC47127KsM.A00(this.A01, userSession, A02, this.A05, this.A04, this.A06, this.A07, this.A00);
    }
}
