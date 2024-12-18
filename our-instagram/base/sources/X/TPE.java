package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.facebook.R;

/* loaded from: classes10.dex */
public final class TPE implements Runnable {
    public final /* synthetic */ ViewStub A00;
    public final /* synthetic */ Rb0 A01;

    public TPE(ViewStub viewStub, Rb0 rb0) {
        this.A00 = viewStub;
        this.A01 = rb0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            View A0E = AbstractC31173DnH.A0E(this.A00, R.layout.simple_web_view);
            C14360o3.A0C(A0E, AbstractC111324zv.A00(1));
            Rb0 rb0 = this.A01;
            Rb0.A01((FrameLayout) A0E, rb0);
            if (rb0.A03 != null) {
                C0f5 AEp = C18950wb.A01.AEp(Rb0.__redex_internal_original_name, 817904145);
                AEp.ABW(Rb0.__redex_internal_original_name, "Inflate SimpleWebViewFragment's Layout succeeded after retry");
                AEp.report();
            }
        } catch (Exception unused) {
            Rb0 rb02 = this.A01;
            if (rb02.A03 != null) {
                C0f5 AEp2 = C18950wb.A01.AEp(Rb0.__redex_internal_original_name, 817904145);
                AEp2.ABW(Rb0.__redex_internal_original_name, "Unable to inflate SimpleWebViewFragment's Layout");
                AEp2.report();
            }
            C9GR.A0F(rb02.requireActivity(), "open_link_generic_error", 2131969213);
        }
    }
}
