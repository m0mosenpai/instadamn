package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.3kA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C81403kA extends C3OO {
    public TextView A00;
    public TextView A01;
    public ViewGroup A02;
    public VE7 A03;
    public final ImageView A04;
    public final TextView A05;
    public final TextView A06;
    public final TextView A07;
    public final IgImageView A08;
    public final ViewGroup A09;
    public final ViewGroup A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C81403kA(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        View requireViewById = view.requireViewById(R.id.dismiss_button);
        C14360o3.A07(requireViewById);
        ImageView imageView = (ImageView) requireViewById;
        this.A04 = imageView;
        View requireViewById2 = view.requireViewById(R.id.megaphone_content);
        C14360o3.A07(requireViewById2);
        this.A09 = (ViewGroup) requireViewById2;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.mutate().setColorFilter(C3DY.A00(view.getContext().getColor(R.color.grey_5)));
            this.A07 = (TextView) view.requireViewById(R.id.title);
            this.A05 = (TextView) view.requireViewById(R.id.message);
            this.A08 = (IgImageView) view.requireViewById(R.id.megaphone_icon);
            this.A06 = (TextView) view.requireViewById(R.id.megaphone_social_context_text);
            this.A0A = (ViewGroup) view.requireViewById(R.id.button_placeholder);
            A00(VE7.A09);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void A00(VE7 ve7) {
        ViewGroup viewGroup = this.A02;
        if (viewGroup == null) {
            viewGroup = null;
        }
        ViewGroup A00 = VVS.A00(this.A09, this.A0A, viewGroup, this.A03, ve7);
        if (A00 != null) {
            this.A02 = A00;
            this.A03 = ve7;
            this.A01 = (TextView) A00.findViewById(R.id.secondary_button);
            ViewGroup viewGroup2 = this.A02;
            if (viewGroup2 == null) {
                C14360o3.A0F("buttonLayout");
                throw C00O.createAndThrow();
            }
            TextView textView = (TextView) viewGroup2.requireViewById(R.id.primary_button);
            C14360o3.A0B(textView, 0);
            this.A00 = textView;
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
