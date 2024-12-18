package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;

/* renamed from: X.KSm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45883KSm extends AbstractC162927Rd {
    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return K0S.class;
    }

    @Override // X.AbstractC162927Rd
    /* renamed from: A01 */
    public final C7SP createViewHolder(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C7SP createViewHolder = super.createViewHolder(layoutInflater, viewGroup);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ((C163027Rn) createViewHolder.A07).A00.getLayoutParams();
        if (marginLayoutParams != null) {
            marginLayoutParams.setMarginStart(0);
            marginLayoutParams.setMarginEnd(0);
        }
        return createViewHolder;
    }
}
