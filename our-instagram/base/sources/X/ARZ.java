package X;

import android.app.Activity;
import android.view.View;
import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public final class ARZ implements View.OnClickListener {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ Callable A01;

    public ARZ(Activity activity, Callable callable) {
        this.A00 = activity;
        this.A01 = callable;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(2139262319);
        try {
            AbstractC167017dG.A0y(this.A00, C3DN.A00);
            this.A01.call();
        } catch (Exception e) {
            AbstractC167017dG.A1J(C18950wb.A01, "DirectPluginImpl: openUrllessLinkInfoShortcutBottomSheet() failed to navigate to web link", e, 20134884);
        }
        C0f9.A0C(9234013, A05);
    }
}
