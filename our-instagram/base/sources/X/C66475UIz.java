package X;

import android.view.View;
import android.widget.FrameLayout;
import com.facebook.R;
import com.instagram.canvas.view.widget.RichTextView;

/* renamed from: X.UIz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66475UIz extends C3OO {
    public final View A00;
    public final FrameLayout A01;
    public final RichTextView A02;

    public C66475UIz(View view) {
        super(view);
        this.A00 = view;
        this.A01 = (FrameLayout) AbstractC166997dE.A0R(this.itemView, R.id.canvas_button);
        this.A02 = (RichTextView) AbstractC166997dE.A0R(this.itemView, R.id.canvas_button_text);
    }
}
