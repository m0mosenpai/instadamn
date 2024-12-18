package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.facebook.R;
import com.facebookpay.form.view.BaseAutoCompleteTextView;

/* renamed from: X.Uvo */
/* loaded from: classes11.dex */
public final class C67676Uvo extends AbstractC67779Uxv implements X9f {
    public C5t6 A00;
    public final View.OnClickListener A01;
    public final C70302WQh A02;

    @Override // X.X9f
    public void setViewModel(C5t6 c5t6) {
        C14360o3.A0B(c5t6, 0);
        this.A00 = c5t6;
        ((AbstractC67779Uxv) this).A06 = c5t6.A04;
        setDescendantFocusability(393216);
        BaseAutoCompleteTextView inputText = getInputText();
        View.OnClickListener onClickListener = this.A01;
        inputText.setOnClickListener(onClickListener);
        getInputText().setLongClickable(false);
        C2FP.A0A();
        Context A0L = AbstractC166997dE.A0L(this);
        Drawable drawable = A0L.getDrawable(W6b.A02(A0L, R.attr.fbpay_input_field_right_chevron));
        if (drawable != null) {
            C2FP.A0A();
            AbstractC31173DnH.A0y(A0L, drawable, R.color.igds_secondary_icon);
            A0O(drawable, onClickListener, Integer.valueOf(R.dimen.abc_select_dialog_padding_start_material));
            setHint(getExistingLabel());
            C5t6 c5t62 = this.A00;
            if (c5t62 != null) {
                setId(((AbstractC129435t5) c5t62).A03);
                AbstractC69838VwO.A01(getInputText(), C05F.A0N, null);
                getIcon().setImportantForAccessibility(2);
                getInputText().setImportantForAutofill(2);
                getInputText().A01 = 0;
                C5t6 c5t63 = this.A00;
                if (c5t63 != null) {
                    if (c5t63.A04) {
                        A0N();
                        int A00 = (int) W6b.A00(A0L, R.attr.fbpay_condensed_input_field_vertical_padding);
                        int A002 = (int) W6b.A00(A0L, R.attr.fbpay_condensed_input_field_horizontal_padding);
                        setPadding(A002, A00, A002, A00);
                        return;
                    }
                    return;
                }
            }
            C14360o3.A0F("viewModel");
            throw C00O.createAndThrow();
        }
        throw AbstractC166997dE.A0g();
    }

    public final String getExistingLabel() {
        C5t6 c5t6 = this.A00;
        if (c5t6 == null) {
            C14360o3.A0F("viewModel");
            throw C00O.createAndThrow();
        }
        int i = c5t6.A01;
        if (i != 0) {
            return getContext().getString(i);
        }
        return c5t6.A03;
    }

    public C67676Uvo(Context context) {
        super(context);
        this.A02 = new C70302WQh(this, 39);
        this.A01 = new WNN(this, 18);
    }

    public static final /* synthetic */ String A00(C67676Uvo c67676Uvo) {
        return c67676Uvo.getExistingLabel();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int A06 = C0f9.A06(-1654133525);
        super.onAttachedToWindow();
        C5t6 c5t6 = this.A00;
        if (c5t6 == null) {
            C14360o3.A0F("viewModel");
            throw C00O.createAndThrow();
        }
        ((AbstractC129435t5) c5t6).A05.A09(this.A02);
        C0f9.A0D(-387456190, A06);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(1890333737);
        super.onDetachedFromWindow();
        C5t6 c5t6 = this.A00;
        if (c5t6 == null) {
            C14360o3.A0F("viewModel");
            throw C00O.createAndThrow();
        }
        ((AbstractC129435t5) c5t6).A05.A08(this.A02);
        C0f9.A0D(786468615, A06);
    }
}
