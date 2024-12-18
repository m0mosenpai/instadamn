package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes11.dex */
public final class UDT extends UBK implements X9f {
    public UvK A00;
    public final View.OnClickListener A01;

    @Override // X.X9f
    public void setViewModel(UvK uvK) {
        boolean booleanValue;
        C14360o3.A0B(uvK, 0);
        this.A00 = uvK;
        Boolean bool = (Boolean) uvK.A05.A02();
        if (bool == null) {
            booleanValue = false;
        } else {
            booleanValue = bool.booleanValue();
        }
        setChecked(booleanValue);
        UvK uvK2 = this.A00;
        if (uvK2 != null) {
            setEnabled(uvK2.A08);
            UvK uvK3 = this.A00;
            if (uvK3 != null) {
                setText(uvK3.A01);
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                if ((getLayoutParams() instanceof ViewGroup.MarginLayoutParams) && layoutParams != null) {
                    TypedValue typedValue = new TypedValue();
                    Context context = getContext();
                    context.getTheme().resolveAttribute(R.attr.fbpay_hub_checkbox_item_margin_top, typedValue, true);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.setMargins(marginLayoutParams.leftMargin, (int) typedValue.getDimension(AbstractC167007dF.A0K(context)), marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                    requestLayout();
                }
                Integer num = C05F.A0C;
                Context context2 = getContext();
                UvK uvK4 = this.A00;
                if (uvK4 != null) {
                    AbstractC69838VwO.A01(this, num, context2.getString(uvK4.A00));
                    UvK uvK5 = this.A00;
                    if (uvK5 != null) {
                        if (uvK5.A03) {
                            setCheckMarkDrawable((Drawable) null);
                            setCompoundDrawablesWithIntrinsicBounds(getCheckBoxDrawable(), (Drawable) null, (Drawable) null, (Drawable) null);
                        }
                        setOnClickListener(this.A01);
                        return;
                    }
                }
            }
        }
        C14360o3.A0F("viewModel");
        throw C00O.createAndThrow();
    }

    private final StateListDrawable getCheckBoxDrawable() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        int[] iArr = {android.R.attr.state_checked};
        W5t A0A = C2FP.A0A();
        Context context = getContext();
        C14360o3.A07(context);
        stateListDrawable.addState(iArr, A0A.A04(context, 23, 9));
        stateListDrawable.addState(new int[]{-16842912}, C2FP.A0A().A04(context, 24, 36));
        return stateListDrawable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UDT(Context context) {
        super(new ContextThemeWrapper(context, R.style.FbPayUICheckbox), null);
        C2FP.A0A();
        WF7.A02(this, VEP.A0D);
        setCheckMarkDrawable(getCheckBoxDrawable());
        this.A01 = new WNN(this, 15);
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z) {
        setClickable(z);
        float f = 0.3f;
        if (z) {
            f = 1.0f;
        }
        setAlpha(f);
    }
}
