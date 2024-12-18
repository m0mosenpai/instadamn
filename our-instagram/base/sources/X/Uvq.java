package X;

import android.content.Context;
import com.facebookpay.form.view.FormLayout;

/* loaded from: classes11.dex */
public final class Uvq extends FormLayout implements X9f {
    public AbstractC129455t8 A00;
    public final InterfaceC58362lv A01;

    public Uvq(Context context) {
        super(context, null);
        this.A01 = new C70302WQh(this, 37);
    }

    public AbstractC129455t8 getViewModel() {
        return this.A00;
    }

    @Override // X.X9f
    public void setViewModel(AbstractC129455t8 abstractC129455t8) {
        this.A00 = abstractC129455t8;
        abstractC129455t8.A03.A09(this.A01);
    }

    @Override // com.facebookpay.form.view.FormLayout, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int A06 = C0f9.A06(-2054195638);
        super.onAttachedToWindow();
        C0f9.A0D(15793888, A06);
    }

    @Override // com.facebookpay.form.view.FormLayout, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(1917710127);
        super.onDetachedFromWindow();
        this.A00.A03.A08(this.A01);
        C0f9.A0D(-610178429, A06);
    }
}
