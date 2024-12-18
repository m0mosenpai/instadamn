package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.Gos, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38064Gos {
    public final Drawable A00;
    public final TextView A01;

    public C38064Gos(TextView textView, int i) {
        Drawable mutate;
        C14360o3.A0B(textView, 1);
        Context context = textView.getContext();
        this.A01 = textView;
        textView.setCompoundDrawablePadding(AbstractC167017dG.A05(context));
        Drawable drawable = context.getDrawable(R.drawable.music_explicit);
        this.A00 = drawable;
        if (drawable != null && (mutate = drawable.mutate()) != null) {
            mutate.setColorFilter(i, PorterDuff.Mode.SRC_IN);
        }
    }

    public final void A00(boolean z) {
        TextUtils.TruncateAt truncateAt;
        TextView textView = this.A01;
        if (z) {
            truncateAt = TextUtils.TruncateAt.MARQUEE;
        } else {
            truncateAt = TextUtils.TruncateAt.END;
        }
        textView.setEllipsize(truncateAt);
        textView.setHorizontalFadingEdgeEnabled(z);
        textView.setSelected(z);
    }
}
