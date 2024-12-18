package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fte, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35920Fte implements XCJ {
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ GIF A03;

    public C35920Fte(Bundle bundle, FragmentActivity fragmentActivity, UserSession userSession, GIF gif) {
        this.A03 = gif;
        this.A02 = userSession;
        this.A00 = bundle;
        this.A01 = fragmentActivity;
    }

    @Override // X.XCJ
    public final void DFf() {
        Bundle bundle = this.A00;
        String string = bundle.getString("bundle_param_route");
        if (string != null && string.equals(AbstractC111324zv.A00(596))) {
            GIF gif = this.A03;
            GIF.A01(bundle, this.A01, this.A02, gif);
        } else {
            GIF.A02(this.A01, this.A03);
        }
    }

    @Override // X.XCJ
    public final void DqC(String str) {
        GIF gif = this.A03;
        GIF.A01(this.A00, this.A01, this.A02, gif);
    }
}
