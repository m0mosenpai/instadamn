package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes4.dex */
public final class AA5 {
    public final Context A00;
    public final View A01;
    public final TextView A02;
    public final FragmentActivity A03;
    public final InterfaceC11380iw A04;
    public final UserSession A05;
    public final ViewStub A06;

    public AA5(Context context, ViewStub viewStub, FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        C14360o3.A0B(viewStub, 2);
        this.A00 = context;
        this.A06 = viewStub;
        this.A05 = userSession;
        this.A04 = interfaceC11380iw;
        this.A03 = fragmentActivity;
        View inflate = viewStub.inflate();
        C14360o3.A07(inflate);
        this.A01 = inflate;
        this.A02 = AbstractC167007dF.A0N(inflate, R.id.professional_hmps_limited_composer_content);
    }
}
