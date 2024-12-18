package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.2l5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C57922l5 {
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public ViewGroup A04;
    public ViewGroup A05;
    public ViewStub A06;
    public InterfaceC56392iX A07;
    public InterfaceC56392iX A08;
    public Map A09;

    public final ViewGroup A00() {
        ViewStub viewStub = this.A06;
        if (viewStub != null) {
            if (viewStub.getParent() != null) {
                ViewStub viewStub2 = this.A06;
                if (viewStub2 != null) {
                    View inflate = viewStub2.inflate();
                    C14360o3.A0C(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
                    this.A05 = (ViewGroup) inflate.findViewById(R.id.ls_nav_bar);
                    this.A03 = inflate.findViewById(R.id.ls_nav_bar_shadow);
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            ViewGroup viewGroup = this.A05;
            if (viewGroup != null) {
                return viewGroup;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final ViewGroup A01(UserSession userSession, int i) {
        if (userSession != null && AbstractC52812bN.A02(AbstractC52892bV.A00(i))) {
            return A00();
        }
        ViewGroup viewGroup = this.A04;
        if (viewGroup != null) {
            return viewGroup;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
