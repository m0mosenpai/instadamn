package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;

/* renamed from: X.KSl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45882KSl extends AbstractC162927Rd {
    @Override // X.AbstractC162927Rd
    /* renamed from: A01 */
    public final C7SP createViewHolder(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        C7SP createViewHolder = super.createViewHolder(layoutInflater, viewGroup);
        AbstractC163037Ro abstractC163037Ro = createViewHolder.A07;
        C14360o3.A0C(abstractC163037Ro, "null cannot be cast to non-null type com.instagram.direct.messagethread.commondecorations.RootSwitcher.Frame");
        ViewGroup.MarginLayoutParams A0G = AbstractC31177DnL.A0G(((C163027Rn) abstractC163037Ro).A00);
        A0G.setMarginEnd(0);
        A0G.setMarginStart(0);
        return createViewHolder;
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return K0A.class;
    }
}
