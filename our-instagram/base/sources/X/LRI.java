package X;

import android.view.View;
import android.view.Window;
import android.widget.PopupWindow;
import androidx.fragment.app.FragmentActivity;
import com.instagram.model.reels.Reel;

/* loaded from: classes8.dex */
public final class LRI implements PopupWindow.OnDismissListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ Reel A02;
    public final /* synthetic */ C47982LJb A03;
    public final /* synthetic */ C3KX A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;

    public LRI(View view, FragmentActivity fragmentActivity, Reel reel, C47982LJb c47982LJb, C3KX c3kx, String str, String str2, boolean z) {
        this.A01 = fragmentActivity;
        this.A00 = view;
        this.A07 = z;
        this.A03 = c47982LJb;
        this.A04 = c3kx;
        this.A02 = reel;
        this.A06 = str;
        this.A05 = str2;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        Window window = this.A01.getWindow();
        C14360o3.A07(window);
        AbstractC56402iY.A07(this.A00, window, this.A07);
        boolean z = this.A03.A00;
        C3KX c3kx = this.A04;
        Reel reel = this.A02;
        if (z) {
            C3KX.A02(reel, C3G2.A1E, c3kx, this.A06, this.A05);
        } else {
            C3KX.A04(reel, c3kx, this.A05);
        }
    }
}
