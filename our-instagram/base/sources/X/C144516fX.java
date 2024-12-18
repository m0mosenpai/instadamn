package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.6fX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C144516fX {
    public final View A00;
    public final AbstractC125325le A01;

    public C144516fX(C57012jc c57012jc) {
        View requireViewById = c57012jc.A01().requireViewById(R.id.polaroid_sticker_cta_container);
        C14360o3.A07(requireViewById);
        this.A00 = requireViewById;
        AbstractC125325le A01 = AbstractC125325le.A01(requireViewById, 1);
        C14360o3.A07(A01);
        this.A01 = A01;
        ((TextView) requireViewById.requireViewById(R.id.polaroid_sticker_cta_text)).setText(requireViewById.getContext().getString(2131969709));
    }

    public final void A00(boolean z) {
        if (!z) {
            this.A00.setVisibility(8);
            return;
        }
        AbstractC125325le abstractC125325le = this.A01;
        abstractC125325le.A0G();
        if (abstractC125325le instanceof C150956qv) {
            throw new UnsupportedOperationException("SpringViewAnimator does not support interpolator config");
        }
        C125335lf c125335lf = (C125335lf) abstractC125325le;
        c125335lf.A01.setStartDelay(300L);
        AbstractC125325le A0C = c125335lf.A0C(1400L);
        A0C.A0I(0.0f);
        A0C.A05 = new C24084AmV(this);
        A0C.A0H();
    }
}
