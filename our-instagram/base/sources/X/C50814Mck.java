package X;

import android.R;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: X.Mck, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50814Mck extends LinearLayout implements InterfaceC72038XGg {
    public static final int[] A03 = {R.attr.state_checked};
    public boolean A00;
    public boolean A01;
    public final java.util.Set A02;

    public C50814Mck(Context context) {
        super(context);
        this.A02 = new LinkedHashSet(1);
        AbstractC50522MSa.A0y(AbstractC25228BEl.A0P(this).inflate(com.facebook.R.layout.layout_cta_selector_radio_button, (ViewGroup) this, true));
        setGravity(16);
        int A05 = AbstractC166997dE.A05(getResources());
        setPadding(A05, 0, A05, 0);
        setOnClickListener(new ViewOnClickListenerC55460OkF(this, 29));
    }

    @Override // X.InterfaceC72038XGg
    public final void A9c(InterfaceC57999Pnj interfaceC57999Pnj) {
        C14360o3.A0B(interfaceC57999Pnj, 0);
        this.A02.add(interfaceC57999Pnj);
    }

    @Override // X.InterfaceC72038XGg
    public final void EFv(InterfaceC57999Pnj interfaceC57999Pnj) {
        C14360o3.A0B(interfaceC57999Pnj, 0);
        this.A02.remove(interfaceC57999Pnj);
    }

    public final void setContentDescription(C5QE c5qe) {
        C14360o3.A0B(c5qe, 0);
        requireViewById(com.facebook.R.id.cta_selector_radio_button_view).setContentDescription(BHX.A00(AbstractC166997dE.A0L(this), c5qe));
    }

    public final void setSubTitleText(C5QE c5qe) {
        C14360o3.A0B(c5qe, 0);
        AbstractC166997dE.A0T(this, com.facebook.R.id.cta_selector_radio_button_subtitle).setText(BHX.A00(AbstractC166997dE.A0L(this), c5qe));
    }

    public final void setTitleText(C5QE c5qe) {
        C14360o3.A0B(c5qe, 0);
        AbstractC166997dE.A0T(this, com.facebook.R.id.cta_selector_radio_button_title).setText(BHX.A00(AbstractC166997dE.A0L(this), c5qe));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.A01;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, A03);
        }
        C14360o3.A0A(onCreateDrawableState);
        return onCreateDrawableState;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.A01 != z) {
            this.A01 = z;
            refreshDrawableState();
            if (!this.A00) {
                this.A00 = true;
                Iterator it = this.A02.iterator();
                while (it.hasNext()) {
                    ((InterfaceC57999Pnj) it.next()).D2t(this, z);
                }
                this.A00 = false;
            }
        }
    }

    public final void setMetadataText(String str) {
        AbstractC31176DnK.A1F(this, str, com.facebook.R.id.cta_selector_radio_button_metadata);
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        if (!isChecked()) {
            setChecked(!this.A01);
        }
    }
}