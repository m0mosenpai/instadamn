package X;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.fbpay.w3c.CardDetails;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes10.dex */
public final class Q5H extends LinearLayout implements InterfaceC72038XGg {
    public static final int[] A04 = {R.attr.state_checked};
    public CardDetails A00;
    public boolean A01;
    public boolean A02;
    public final java.util.Set A03;

    public final void A00(CardDetails cardDetails) {
        Integer valueOf;
        int i;
        this.A00 = cardDetails;
        TextView A0T = AbstractC166997dE.A0T(this, com.facebook.R.id.card_info_line_1);
        String str = C63156Se5.A01(cardDetails.A05).A03;
        Resources resources = getResources();
        A0T.setText(resources.getString(2131969391, str, cardDetails.A0A));
        TextView A0T2 = AbstractC166997dE.A0T(this, com.facebook.R.id.card_info_line_2);
        Integer num = cardDetails.A04;
        if (num == null) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(num.intValue() % 100);
        }
        A0T2.setText(resources.getString(2131969392, cardDetails.A03, valueOf));
        IgImageView igImageView = (IgImageView) requireViewById(com.facebook.R.id.autofill_payment_item_icon);
        String str2 = cardDetails.A06;
        if (str2 != null) {
            igImageView.setUrl(new SimpleImageUrl(str2), new InterfaceC11380iw() { // from class: X.TEu
                public static final String __redex_internal_original_name = "AutofillCardInfoRadioButton$$ExternalSyntheticLambda0";

                @Override // X.InterfaceC11380iw
                public final String getModuleName() {
                    return "autofill";
                }
            });
            return;
        }
        Context context = getContext();
        switch (EnumC61219RhJ.A06.A02(this.A00.A07).ordinal()) {
            case 0:
                i = com.facebook.R.drawable.checkout_acceptance_amex;
                break;
            case 1:
                i = com.facebook.R.drawable.checkout_acceptance_discover;
                break;
            case 2:
                i = com.facebook.R.drawable.checkout_acceptance_jcb;
                break;
            case 3:
                i = com.facebook.R.drawable.checkout_acceptance_mastercard;
                break;
            case 4:
                i = com.facebook.R.drawable.checkout_acceptance_rupay;
                break;
            case 5:
                i = com.facebook.R.drawable.checkout_acceptance_visa;
                break;
            default:
                i = com.facebook.R.drawable.rectangular_placeholder;
                break;
        }
        AbstractC166997dE.A19(context, igImageView, i);
    }

    @Override // X.InterfaceC72038XGg
    public final void A9c(InterfaceC57999Pnj interfaceC57999Pnj) {
        this.A03.add(interfaceC57999Pnj);
    }

    @Override // X.InterfaceC72038XGg
    public final void EFv(InterfaceC57999Pnj interfaceC57999Pnj) {
        this.A03.remove(interfaceC57999Pnj);
    }

    public CardDetails getCardDetails() {
        return this.A00;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.A02;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, A04);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.A02 != z) {
            this.A02 = z;
            refreshDrawableState();
            if (!this.A01) {
                this.A01 = true;
                Iterator it = this.A03.iterator();
                while (it.hasNext()) {
                    ((InterfaceC57999Pnj) it.next()).D2t(this, this.A02);
                }
                this.A01 = false;
            }
        }
    }

    public Q5H(Context context) {
        super(context);
        this.A03 = new LinkedHashSet(1);
        LayoutInflater.from(getContext()).inflate(com.facebook.R.layout.layout_autofill_payment_item, (ViewGroup) this, true);
        setGravity(16);
        Resources resources = getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(com.facebook.R.dimen.abc_edit_text_inset_top_material);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(com.facebook.R.dimen.abc_select_dialog_padding_start_material);
        setPadding(dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize);
        setId(View.generateViewId());
        setOnClickListener(ViewOnClickListenerC63508Sob.A00(this, 8));
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        if (!isChecked()) {
            setChecked(!this.A02);
        }
    }
}
