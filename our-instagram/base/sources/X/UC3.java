package X;

import android.content.Context;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes11.dex */
public final class UC3 extends FrameLayout implements X9f {
    public View A00;
    public ImageView A01;
    public TextView A02;
    public TextView A03;
    public UvK A04;
    public boolean A05;
    public final View.OnClickListener A06;

    public UC3(Context context) {
        super(context, null, 0);
        String str;
        this.A05 = true;
        View.inflate(context, R.layout.ecp_custom_checkbox, this);
        this.A00 = AbstractC166987dD.A0c(this, R.id.checkbox_container);
        TextView A0Q = AbstractC25230BEn.A0Q(this, R.id.primary_text);
        this.A02 = A0Q;
        if (A0Q == null) {
            str = "primaryTextView";
        } else {
            WF7.A02(A0Q, VEP.A0s);
            TextView A0Q2 = AbstractC25230BEn.A0Q(this, R.id.secondary_text);
            this.A03 = A0Q2;
            if (A0Q2 == null) {
                str = "secondaryTextView";
            } else {
                WF7.A02(A0Q2, VEP.A14);
                ImageView imageView = (ImageView) AbstractC166987dD.A0c(this, R.id.image);
                this.A01 = imageView;
                if (imageView == null) {
                    str = "imageView";
                } else {
                    imageView.setBackground(getCheckBoxDrawable());
                    this.A06 = new WNN(this, 16);
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.X9f
    public void setViewModel(UvK uvK) {
        boolean booleanValue;
        String str;
        C14360o3.A0B(uvK, 0);
        this.A04 = uvK;
        Boolean bool = (Boolean) uvK.A05.A02();
        if (bool == null) {
            booleanValue = false;
        } else {
            booleanValue = bool.booleanValue();
        }
        this.A05 = booleanValue;
        setEnabled(uvK.A08);
        TextView textView = this.A02;
        if (textView == null) {
            str = "primaryTextView";
        } else {
            Context context = getContext();
            AbstractC166987dD.A1P(context, textView, uvK.A01);
            TextView textView2 = this.A03;
            str = "secondaryTextView";
            if (textView2 != null) {
                textView2.setText(uvK.A02);
                textView2.setVisibility(AbstractC167007dF.A05(this.A05 ? 1 : 0));
                ImageView imageView = this.A01;
                if (imageView == null) {
                    str = "imageView";
                } else {
                    int i = -16842912;
                    if (this.A05) {
                        i = android.R.attr.state_checked;
                    }
                    imageView.setImageState(new int[]{i}, true);
                    AbstractC69838VwO.A01(this, C05F.A0C, context.getString(uvK.A00));
                    View view = this.A00;
                    if (view == null) {
                        str = "containerView";
                    } else {
                        view.setOnClickListener(this.A06);
                        return;
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    private final StateListDrawable getCheckBoxDrawable() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        int[] iArr = {android.R.attr.state_checked};
        W5t A0A = C2FP.A0A();
        Context context = getContext();
        C14360o3.A07(context);
        stateListDrawable.addState(iArr, A0A.A04(context, 23, 9));
        stateListDrawable.addState(new int[]{-16842912}, C2FP.A0A().A04(context, 24, 51));
        return stateListDrawable;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        setClickable(z);
        float f = 0.3f;
        if (z) {
            f = 1.0f;
        }
        setAlpha(f);
    }
}
