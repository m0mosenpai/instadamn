package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* loaded from: classes6.dex */
public final class EZI extends IgFrameLayout {
    public final IgTextView A00;
    public final IgImageView A01;
    public final boolean A02;

    public EZI(Context context) {
        super(context, null, 0);
        boolean A1P = AbstractC167007dF.A1P(context.getResources().getConfiguration().uiMode & 48, 32);
        this.A02 = A1P;
        LayoutInflater.from(context).inflate(R.layout.prompt_pill, (ViewGroup) this, true);
        View findViewById = findViewById(R.id.pill_layout);
        Drawable drawable = A1P ? context.getDrawable(R.drawable.text_view_rounded_corner_dark_mode) : context.getDrawable(R.drawable.text_view_rounded_corner);
        if (findViewById != null) {
            findViewById.setBackground(drawable);
        }
        this.A00 = AbstractC31172DnG.A0Y(this, R.id.pill_text);
        this.A01 = AbstractC31172DnG.A0a(this, R.id.pill_image);
    }

    public final void setText(String str) {
        C14360o3.A0B(str, 0);
        this.A00.setText(str);
    }

    public final void setImage(int i) {
        Drawable drawable = getContext().getDrawable(i);
        if (this.A02 && drawable != null) {
            AbstractC25228BEl.A1H(PorterDuff.Mode.SRC_IN, drawable.mutate(), -1);
        }
        this.A01.setImageDrawable(drawable);
    }
}
