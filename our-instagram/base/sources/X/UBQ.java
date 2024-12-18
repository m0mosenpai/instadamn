package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes11.dex */
public final class UBQ extends FrameLayout {
    public ImageView A00;
    public LinearLayout A01;
    public TextView A02;
    public final String A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UBQ(Context context, String str) {
        super(context, null, 0);
        C14360o3.A0B(str, 2);
        this.A03 = str;
        addView(LayoutInflater.from(context).inflate(R.layout.ecp_incentive_tag, (ViewGroup) this, false));
        this.A01 = (LinearLayout) findViewById(R.id.container);
        this.A00 = (ImageView) findViewById(R.id.icon);
        TextView textView = (TextView) findViewById(R.id.text);
        this.A02 = textView;
        String str2 = "textView";
        if (textView != null) {
            textView.setText(this.A03);
            TextView textView2 = this.A02;
            if (textView2 != null) {
                W5t A0A = C2FP.A0A();
                Context context2 = getContext();
                C14360o3.A07(context2);
                textView2.setTextColor(A0A.A02(context2, 66));
                ImageView imageView = this.A00;
                str2 = "iconView";
                if (imageView != null) {
                    AbstractC68348VNi.A00(null, imageView, VET.A0d);
                    ImageView imageView2 = this.A00;
                    if (imageView2 != null) {
                        W5t A0A2 = C2FP.A0A();
                        C14360o3.A07(context2);
                        imageView2.setColorFilter(A0A2.A02(context2, 66));
                        LinearLayout linearLayout = this.A01;
                        if (linearLayout == null) {
                            str2 = "container";
                        } else {
                            Drawable background = linearLayout.getBackground();
                            C14360o3.A0C(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
                            C2FP.A0A();
                            ((GradientDrawable) background).setColor(context2.getColor(R.color.igds_separator));
                            return;
                        }
                    }
                }
            }
        }
        C14360o3.A0F(str2);
        throw C00O.createAndThrow();
    }

    public final String getText() {
        return this.A03;
    }
}
