package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.IyV, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42917IyV implements JHS {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C38321qM A02;
    public final /* synthetic */ InterfaceC60442pS A03;
    public final /* synthetic */ C189478aR A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;

    public C42917IyV(FragmentActivity fragmentActivity, UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, C189478aR c189478aR, String str, boolean z) {
        this.A04 = c189478aR;
        this.A06 = z;
        this.A00 = fragmentActivity;
        this.A01 = userSession;
        this.A05 = str;
        this.A03 = interfaceC60442pS;
        this.A02 = c38321qM;
    }

    @Override // X.JHS
    public final void FC9(InterfaceC60442pS interfaceC60442pS, String str, int i) {
        if (this.A06) {
            C189478aR c189478aR = this.A04;
            FragmentActivity fragmentActivity = this.A00;
            c189478aR.A0K(I7U.A00(fragmentActivity, new ViewOnClickListenerC41995IjQ(fragmentActivity, this.A03, this.A01, this.A02, this.A05, 5), Integer.valueOf(i)), true);
        }
    }

    @Override // X.JHS
    public final void FCc(String str) {
        this.A04.A0M(str);
    }
}
