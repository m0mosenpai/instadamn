package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.facepile.IgdsFacepile;

/* renamed from: X.3kC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C81423kC extends C3OO {
    public ViewGroup A00;
    public TextView A01;
    public TextView A02;
    public String A03;
    public final ViewGroup A04;
    public final ViewGroup A05;
    public final ImageView A06;
    public final TextView A07;
    public final TextView A08;
    public final TextView A09;
    public final IgImageView A0A;
    public final IgdsFacepile A0B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C81423kC(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        View requireViewById = view.requireViewById(R.id.dismiss_button);
        C14360o3.A07(requireViewById);
        ImageView imageView = (ImageView) requireViewById;
        this.A06 = imageView;
        View findViewById = view.findViewById(R.id.megaphone_content);
        if (findViewById != null) {
            this.A04 = (ViewGroup) findViewById;
            imageView.getDrawable().mutate().setColorFilter(C3DY.A00(view.getContext().getColor(R.color.grey_5)));
            View findViewById2 = view.findViewById(R.id.title);
            if (findViewById2 != null) {
                this.A09 = (TextView) findViewById2;
                View findViewById3 = view.findViewById(R.id.message);
                if (findViewById3 != null) {
                    this.A07 = (TextView) findViewById3;
                    View findViewById4 = view.findViewById(R.id.megaphone_icon);
                    if (findViewById4 != null) {
                        this.A0A = (IgImageView) findViewById4;
                        View findViewById5 = view.findViewById(R.id.megaphone_social_context_facepile);
                        if (findViewById5 != null) {
                            this.A0B = (IgdsFacepile) findViewById5;
                            View findViewById6 = view.findViewById(R.id.megaphone_social_context_text);
                            if (findViewById6 != null) {
                                this.A08 = (TextView) findViewById6;
                                View findViewById7 = view.findViewById(R.id.button_placeholder);
                                if (findViewById7 != null) {
                                    ViewGroup viewGroup = (ViewGroup) findViewById7;
                                    this.A05 = viewGroup;
                                    TextView textView = null;
                                    ViewGroup A00 = VVS.A00(this.A04, viewGroup, null, null, VE7.A0A);
                                    this.A00 = A00;
                                    if (A00 != null) {
                                        this.A01 = (TextView) A00.findViewById(R.id.primary_button);
                                        textView = (TextView) A00.findViewById(R.id.secondary_button);
                                    } else {
                                        this.A01 = null;
                                    }
                                    this.A02 = textView;
                                    return;
                                }
                                throw new IllegalStateException("Required value was null.");
                            }
                            throw new IllegalStateException("Required value was null.");
                        }
                        throw new IllegalStateException("Required value was null.");
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }
}
