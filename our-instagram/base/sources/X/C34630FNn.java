package X;

import android.content.res.Resources;
import android.text.TextWatcher;
import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.ui.widget.textview.IgAutoCompleteTextView;

/* renamed from: X.FNn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34630FNn {
    public TextWatcher A00;
    public C34667FPc A01;
    public final View A02;
    public final View A03;
    public final IgLinearLayout A04;
    public final IgAutoCompleteTextView A05;
    public final InterfaceC09390do A06;

    public C34630FNn(View view, C07X c07x, C35768Fr5 c35768Fr5, boolean z) {
        C14360o3.A0B(view, 1);
        View A0U = AbstractC167017dG.A0U(view, z ? R.id.direct_multi_select_bottom_container_stub : R.id.direct_private_share_message_view_stub);
        C14360o3.A0A(A0U);
        this.A02 = A0U;
        this.A04 = (IgLinearLayout) AbstractC166997dE.A0R(view, R.id.sharesheet_write_message_header);
        this.A05 = (IgAutoCompleteTextView) AbstractC166997dE.A0R(view, R.id.direct_private_share_message_box);
        View A0U2 = AbstractC167017dG.A0U(A0U, R.id.layout_suggested_prompts_stub);
        C14360o3.A07(A0U2);
        this.A03 = A0U2;
        InterfaceC52932ba interfaceC52932ba = C31837Dyw.A0D;
        C0YZ A1D = AbstractC25225BEi.A1D(C31837Dyw.class);
        C52992bg c52992bg = new C52992bg(c35768Fr5.getDefaultViewModelCreationExtras());
        c52992bg.A01(Om8.A00, interfaceC52932ba);
        this.A06 = AbstractC25225BEi.A0a(new C50153MDg(c35768Fr5, 22), new C50153MDg(c35768Fr5, 23), new C50153MDg(c52992bg, 24), A1D);
        GSS.A02(c07x, this, C07Y.A00(c07x), 18);
        if (z) {
            Resources resources = A0U.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.ad4ad_button_bottom_margin);
            this.A05.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
        } else {
            int A01 = C1H4.A01(AbstractC13880nE.A04(AbstractC166997dE.A0L(A0U), 12));
            this.A04.setPadding(A01, A01, A01, A01);
        }
        IgAutoCompleteTextView igAutoCompleteTextView = this.A05;
        igAutoCompleteTextView.setHint(this.A02.getContext().getString(2131960653));
        igAutoCompleteTextView.setTextSize(0, r2.getResources().getDimensionPixelSize(R.dimen.account_group_management_row_text_size));
    }
}
