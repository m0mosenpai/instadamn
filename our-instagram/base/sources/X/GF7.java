package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes6.dex */
public final class GF7 implements GZN {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ Fragment A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C38321qM A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;

    @Override // X.GZN
    public final void onCancel() {
        throw C00O.createAndThrow();
    }

    public GF7(Activity activity, Fragment fragment, UserSession userSession, C38321qM c38321qM, String str, String str2, boolean z) {
        this.A02 = userSession;
        this.A00 = activity;
        this.A01 = fragment;
        this.A03 = c38321qM;
        this.A06 = z;
        this.A05 = str;
        this.A04 = str2;
    }

    @Override // X.GZN
    public final void DlA(List list) {
        UserSession userSession = this.A02;
        Activity activity = this.A00;
        Fragment fragment = this.A01;
        C38321qM c38321qM = this.A03;
        boolean z = this.A06;
        String str = this.A05;
        boolean A1a = AbstractC166987dD.A1a(list.get(0));
        String str2 = this.A04;
        if (!z) {
            AbstractC63248Sg4.A02(fragment.getParentFragmentManager());
        }
        if (c38321qM.A63()) {
            C121275eQ A03 = AbstractC50633MWu.A03(activity, userSession, AbstractC50633MWu.A05(activity, c38321qM, "ReelMemoriesShareHelper", A1a, false));
            A03.A00 = new EZ7(activity, fragment, userSession, c38321qM, str, str2);
            C1GJ.A03(A03);
        } else {
            AbstractC70197WGf.A05(activity, c38321qM.A1q(activity), new G0K(activity, fragment, userSession, c38321qM, str, str2), C50472Tr.A01(), AbstractC31173DnH.A02(activity), false);
        }
    }
}
