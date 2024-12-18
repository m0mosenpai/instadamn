package X;

import android.widget.PopupWindow;
import com.facebook.R;

/* loaded from: classes11.dex */
public final class WP3 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ InterfaceC154386wo A00;
    public final /* synthetic */ C153496vJ A01;

    public WP3(InterfaceC154386wo interfaceC154386wo, C153496vJ c153496vJ) {
        this.A00 = interfaceC154386wo;
        this.A01 = c153496vJ;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.A00.setEndIcon(this.A01.A02.getDrawable(R.drawable.instagram_chevron_down_pano_filled_12));
    }
}
