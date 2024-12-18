package X;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: X.Mci, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50812Mci extends LinearLayout implements InterfaceC72038XGg {
    public static final int[] A03 = {R.attr.state_checked};
    public boolean A00;
    public boolean A01;
    public final java.util.Set A02;

    public C50812Mci(Context context) {
        super(context);
        this.A02 = new LinkedHashSet(1);
        AbstractC50522MSa.A0y(AbstractC25228BEl.A0P(this).inflate(com.facebook.R.layout.new_user_activation_privacy_checkable, (ViewGroup) this, true));
        setGravity(16);
        setOrientation(0);
        Resources resources = getResources();
        setPadding(resources.getDimensionPixelSize(com.facebook.R.dimen.account_discovery_bottom_gap), resources.getDimensionPixelSize(com.facebook.R.dimen.ab_test_media_thumbnail_preview_item_internal_padding), resources.getDimensionPixelSize(com.facebook.R.dimen.account_discovery_bottom_gap), resources.getDimensionPixelSize(com.facebook.R.dimen.ab_test_media_thumbnail_preview_item_internal_padding));
        setOnClickListener(new ViewOnClickListenerC55462OkH(this, 2));
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

    public final void setLeftIcon(int i) {
        AbstractC31173DnH.A0I(this, com.facebook.R.id.checkbox_image).setImageResource(i);
    }

    public final void setSubTitleText(int i) {
        AbstractC166997dE.A0T(this, com.facebook.R.id.checkbox_subtitle).setText(i);
    }

    public final void setTitleText(int i) {
        AbstractC166997dE.A0T(this, com.facebook.R.id.checkbox_title).setText(i);
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        if (!isChecked()) {
            setChecked(!this.A01);
        }
    }
}
