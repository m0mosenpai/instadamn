package X;

import android.R;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: X.Mcj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50813Mcj extends LinearLayout implements InterfaceC72038XGg {
    public static final int[] A03 = {R.attr.state_checked};
    public boolean A00;
    public boolean A01;
    public final java.util.Set A02;

    @Override // X.InterfaceC72038XGg
    public final void A9c(InterfaceC57999Pnj interfaceC57999Pnj) {
        this.A02.add(interfaceC57999Pnj);
    }

    @Override // X.InterfaceC72038XGg
    public final void EFv(InterfaceC57999Pnj interfaceC57999Pnj) {
        this.A02.remove(interfaceC57999Pnj);
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
                    ((InterfaceC57999Pnj) it.next()).D2t(this, this.A01);
                }
                this.A00 = false;
            }
        }
    }

    public C50813Mcj(Context context) {
        super(context);
        this.A02 = new LinkedHashSet(1);
        AbstractC25228BEl.A0P(this).inflate(com.facebook.R.layout.layout_radio_button_with_secondary_text_and_button, (ViewGroup) this, true);
        AbstractC50522MSa.A0y(this);
        setGravity(16);
        int dimensionPixelSize = getResources().getDimensionPixelSize(com.facebook.R.dimen.abc_edit_text_inset_top_material);
        setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        setOnClickListener(new Ok4(this, 5));
    }

    public void setExtraButtonText(String str) {
        AbstractC31176DnK.A1F(this, str, com.facebook.R.id.extra_btn);
    }

    public void setSubtitle(String str) {
        AbstractC31176DnK.A1F(this, str, com.facebook.R.id.subtitle);
    }

    public void setTitle(String str) {
        AbstractC31176DnK.A1F(this, str, com.facebook.R.id.title);
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        if (!isChecked()) {
            setChecked(!this.A01);
        }
    }
}
