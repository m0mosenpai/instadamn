package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.ui.emptystaterow.EmptyStateView;

/* renamed from: X.HIx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39099HIx extends AbstractC66422zJ {
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C14360o3.A0B(c3oo, 1);
        EmptyStateView emptyStateView = (EmptyStateView) AbstractC166997dE.A0R(c3oo.itemView, R.id.highlights_archive_empty_state_view);
        EnumC153216up enumC153216up = EnumC153216up.A02;
        emptyStateView.A0R(enumC153216up, R.drawable.empty_state_private);
        emptyStateView.A0T(enumC153216up, 2131963593);
        emptyStateView.A0S(enumC153216up, 2131963592);
        emptyStateView.A0I();
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C3OO(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_highlights_archive_empty_state, false));
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C39083HIh.class;
    }
}
