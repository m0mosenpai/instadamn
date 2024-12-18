package X;

import android.content.Context;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.facebook.R;
import com.facebook.browser.lite.BrowserLiteFragment;

/* loaded from: classes10.dex */
public final class SDR {
    public final Context A00;
    public final C3O0 A01;

    public SDR(Context context, InterfaceC172717mh interfaceC172717mh) {
        this.A00 = context;
        ViewStub viewStub = new ViewStub(context);
        viewStub.setId(R.id.bwp_snack_bar_stub);
        FrameLayout frameLayout = ((BrowserLiteFragment) interfaceC172717mh).A0D;
        if (frameLayout != null) {
            frameLayout.addView(viewStub);
        }
        C3O0 c3o0 = new C3O0(viewStub, false);
        this.A01 = c3o0;
        c3o0.A06(80);
    }
}
