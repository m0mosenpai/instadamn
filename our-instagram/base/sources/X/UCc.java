package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import java.util.Iterator;

/* loaded from: classes11.dex */
public class UCc extends LinearLayout implements X9f {
    public ImageView A00;
    public TextView A01;
    public UvT A02;
    public final InterfaceC58362lv A03;

    @Override // X.X9f
    public void setViewModel(UvT uvT) {
        int paddingTop;
        int paddingBottom;
        Integer num;
        this.A02 = uvT;
        TextView textView = this.A01;
        Context context = getContext();
        String str = uvT.A07;
        int i = uvT.A03;
        if (i != 0) {
            str = context.getString(i);
        }
        str.getClass();
        C60613RDi A00 = SSE.A00(context, uvT.A06, str);
        WbO wbO = new WbO(1, context, uvT);
        int i2 = 0;
        C14360o3.A0B(wbO, 0);
        textView.setText(A00.A00(wbO, false));
        textView.setMovementMethod(new LinkMovementMethod());
        boolean z = this instanceof UvR;
        if (z) {
            TextView textView2 = this.A01;
            ViewGroup.MarginLayoutParams A0H = AbstractC31177DnL.A0H(textView2);
            A0H.topMargin = 0;
            A0H.bottomMargin = 0;
            C14360o3.A06(textView2);
            WFM.A02(textView2, null, null, 0, 0);
            int i3 = this.A02.A04;
            if (i3 != 0) {
                num = WFM.A01(this, i3);
            } else {
                num = null;
            }
            int i4 = this.A02.A00;
            if (i4 == 0) {
                i4 = R.attr.fbpay_payment_method_header_cell_item_margin_bottom;
            }
            WFM.A03(this, null, null, num, WFM.A01(this, i4));
        } else {
            int i5 = this.A02.A04;
            if (i5 != 0) {
                WFM.A03(this, null, null, WFM.A01(this, i5), null);
            }
            int i6 = this.A02.A00;
            if (i6 != 0) {
                WFM.A03(this.A01, null, null, null, WFM.A01(this, i6));
            }
        }
        UvT uvT2 = this.A02;
        int i7 = uvT2.A05;
        int i8 = uvT2.A01;
        if (i7 != 0) {
            C14360o3.A07(context);
            paddingTop = WFM.A00(context, i7);
        } else {
            paddingTop = textView.getPaddingTop();
        }
        if (i8 != 0) {
            C14360o3.A07(context);
            paddingBottom = WFM.A00(context, i8);
        } else {
            paddingBottom = textView.getPaddingBottom();
        }
        textView.setPadding(0, paddingTop, 0, paddingBottom);
        int i9 = this.A02.A02;
        ImageView imageView = this.A00;
        if (i9 != 0) {
            imageView.setImageDrawable(C2FP.A0A().A04(context, this.A02.A02, 0));
        } else {
            i2 = 8;
        }
        imageView.setVisibility(i2);
        if (z) {
            UvT uvT3 = this.A02;
            C14360o3.A0C(uvT3, "null cannot be cast to non-null type com.facebookpay.form.cell.label.paymentmethod.PaymentMethodLabelCellViewModel");
            View requireViewById = View.inflate(context, R.layout.hub_cell_header_card_icons, this).requireViewById(R.id.card_icon_list);
            C14360o3.A0C(requireViewById, AbstractC111324zv.A00(4));
            ViewGroup viewGroup = (ViewGroup) requireViewById;
            Iterator it = ((UvS) uvT3).A00.iterator();
            while (it.hasNext()) {
                Drawable drawable = context.getDrawable(AbstractC167007dF.A0B(it));
                View A0A = AbstractC31172DnG.A0A(LayoutInflater.from(context), viewGroup, R.layout.hub_cell_header_card_icon);
                View requireViewById2 = A0A.requireViewById(R.id.card_icon);
                C14360o3.A0C(requireViewById2, AbstractC111324zv.A00(34));
                ((ImageView) requireViewById2).setImageDrawable(drawable);
                viewGroup.addView(A0A);
            }
        }
    }

    public UCc(Context context, int i) {
        super(context);
        this.A03 = new C70302WQh(this, 38);
        setOrientation(0);
        Context context2 = getContext();
        View inflate = View.inflate(context2, i, this);
        inflate.getClass();
        TextView textView = (TextView) inflate.requireViewById(R.id.label);
        this.A01 = textView;
        textView.setLinkTextColor(C2FP.A0A().A02(context2, 5));
        if (AbstractC010103p.A00(this.A01) == null) {
            AbstractC69838VwO.A00(this.A01, true, C05F.A00, null, null);
        }
        View inflate2 = View.inflate(context2, R.layout.hub_cell_label_icon, this);
        inflate2.getClass();
        this.A00 = (ImageView) inflate2.requireViewById(R.id.icon);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int A06 = C0f9.A06(248368016);
        super.onAttachedToWindow();
        ((AbstractC129435t5) this.A02).A07.A09(this.A03);
        C0f9.A0D(-774681924, A06);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(-13871934);
        super.onDetachedFromWindow();
        ((AbstractC129435t5) this.A02).A07.A08(this.A03);
        C0f9.A0D(1673500309, A06);
    }
}
