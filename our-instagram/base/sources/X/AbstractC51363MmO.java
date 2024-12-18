package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* renamed from: X.MmO, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC51363MmO extends C3OO {
    public ImageView A00;
    public TextView A01;
    public final View A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC51363MmO(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A02 = view;
    }

    public final ImageView A00() {
        if (this instanceof NXU) {
            return ((NXU) this).A01;
        }
        ImageView imageView = this.A00;
        if (imageView != null) {
            return imageView;
        }
        C14360o3.A0F("button");
        throw C00O.createAndThrow();
    }

    public final TextView A01() {
        if (this instanceof NXU) {
            return ((NXU) this).A02;
        }
        TextView textView = this.A01;
        if (textView != null) {
            return textView;
        }
        C14360o3.A0F("labelView");
        throw C00O.createAndThrow();
    }
}
