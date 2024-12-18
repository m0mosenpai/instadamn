package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.leadgen.core.ui.LeadGenCreativesSectionHeaderRow;

/* loaded from: classes9.dex */
public final class NOG extends AbstractC51215Mk0 {
    public final IgLinearLayout A00;
    public final IgdsButton A01;
    public final LeadGenCreativesSectionHeaderRow A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NOG(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A02 = (LeadGenCreativesSectionHeaderRow) AbstractC166997dE.A0R(view, R.id.header_row);
        this.A00 = (IgLinearLayout) AbstractC166997dE.A0R(view, R.id.section_items_container);
        this.A01 = (IgdsButton) AbstractC166997dE.A0R(view, R.id.see_all_button);
    }
}
