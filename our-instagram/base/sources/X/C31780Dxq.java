package X;

import android.R;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: X.Dxq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31780Dxq extends LinearLayout implements InterfaceC72038XGg {
    public static final int[] A03 = {R.attr.state_checked};
    public boolean A00;
    public boolean A01;
    public final java.util.Set A02;

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

    public C31780Dxq(Context context) {
        super(context);
        this.A02 = new LinkedHashSet(1);
        AbstractC25228BEl.A0P(this).inflate(com.facebook.R.layout.birthday_row, (ViewGroup) this, true);
        setGravity(16);
        setPadding(0, 0, 0, getResources().getDimensionPixelSize(com.facebook.R.dimen.asset_picker_static_sticker_last_row_padding));
        setOnClickListener(new ViewOnClickListenerC35667Fp2(this, 28));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.A01;
    }

    public final void setPrimaryText(String str) {
        AbstractC31176DnK.A1F(this, str, com.facebook.R.id.primary_text);
    }

    public final void setSecondaryText(String str) {
        AbstractC31176DnK.A1F(this, str, com.facebook.R.id.secondary_text);
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        if (!isChecked()) {
            setChecked(!this.A01);
        }
    }
}
