package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;

/* renamed from: X.VlC, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69304VlC {
    public C42663IuK A00;
    public final View A01;
    public final TextView A02;
    public final ColorFilterAlphaImageView A03;
    public final C69019Vfv A04;

    public C69304VlC(View view, Context context) {
        this.A01 = view.requireViewById(R.id.footer_cta);
        this.A02 = (TextView) view.requireViewById(R.id.footer_main_action_text);
        this.A03 = (ColorFilterAlphaImageView) view.requireViewById(R.id.footer_glyph);
        this.A04 = new C69019Vfv(context.getColor(R.color.badge_color), context.getColor(R.color.cta_highlight_background_color));
    }
}
