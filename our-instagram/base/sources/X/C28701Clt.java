package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ViewSwitcher;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.Clt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28701Clt implements ViewSwitcher.ViewFactory {
    public final /* synthetic */ Context A00;

    public C28701Clt(Context context) {
        this.A00 = context;
    }

    @Override // android.widget.ViewSwitcher.ViewFactory
    public final View makeView() {
        Context context = this.A00;
        IgTextView igTextView = new IgTextView(context);
        igTextView.setTextSize(0, context.getResources().getDimension(R.dimen.abc_text_size_menu_header_material));
        AbstractC166987dD.A1O(context, igTextView, R.color.audio_bar_action_color_enabled);
        igTextView.setGravity(16);
        igTextView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return igTextView;
    }
}
