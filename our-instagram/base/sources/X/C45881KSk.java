package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.KSk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45881KSk extends AbstractC162927Rd {
    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return K0Y.class;
    }

    @Override // X.AbstractC162927Rd
    /* renamed from: A01 */
    public final C7SP createViewHolder(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AbstractC167017dG.A1N(viewGroup, layoutInflater);
        C7SP createViewHolder = super.createViewHolder(layoutInflater, viewGroup);
        AbstractC163037Ro abstractC163037Ro = createViewHolder.A07;
        C14360o3.A0C(abstractC163037Ro, "null cannot be cast to non-null type com.instagram.direct.messagethread.commondecorations.RootSwitcher.Frame");
        AbstractC13880nE.A0U(AbstractC166987dD.A0c(((C163027Rn) abstractC163037Ro).A00, R.id.prompt_xma_message_container), layoutInflater.getContext().getResources().getDimensionPixelSize(R.dimen.asset_picker_section_title_horizontal_padding));
        return createViewHolder;
    }
}
