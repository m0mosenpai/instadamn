package X;

import android.app.Activity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgView;

/* renamed from: X.Wo7, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71110Wo7 implements InterfaceC59892oW {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C07T A01;
    public final /* synthetic */ ViewOnTouchListenerC60632pm A02;
    public final /* synthetic */ IgView A03;
    public final /* synthetic */ C61342qw A04;
    public final /* synthetic */ C3CE A05;
    public final /* synthetic */ boolean A06;

    public C71110Wo7(Activity activity, C07T c07t, ViewOnTouchListenerC60632pm viewOnTouchListenerC60632pm, IgView igView, C61342qw c61342qw, C3CE c3ce, boolean z) {
        this.A05 = c3ce;
        this.A00 = activity;
        this.A03 = igView;
        this.A02 = viewOnTouchListenerC60632pm;
        this.A06 = z;
        this.A04 = c61342qw;
        this.A01 = c07t;
    }

    @Override // X.InterfaceC59892oW
    public final void Dnp(int i, int i2) {
        int i3;
        C3CE c3ce = this.A05;
        int i4 = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        UserSession userSession = c3ce.A01;
        Activity activity = this.A00;
        IgView igView = this.A03;
        ViewOnTouchListenerC60632pm viewOnTouchListenerC60632pm = this.A02;
        int A0G = AbstractC53242c7.A0G(activity, R.attr.actionBarButtonWidth);
        if (C57992lC.A03()) {
            i3 = C57992lC.A01();
        } else {
            i3 = 0;
        }
        boolean z = this.A06;
        C14360o3.A0B(igView, 3);
        V8L v8l = new V8L(activity, viewOnTouchListenerC60632pm, userSession, AbstractC166987dD.A1J(igView), A0G + i3, z);
        c3ce.A00 = v8l;
        C61342qw c61342qw = this.A04;
        C07T c07t = this.A01;
        c61342qw.EDY(v8l);
        c07t.A09(v8l);
    }
}
