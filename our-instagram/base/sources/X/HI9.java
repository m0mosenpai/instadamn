package X;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;

/* loaded from: classes7.dex */
public final class HI9 extends AbstractC66412zI {
    public final HCI A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new C38418Gut(AbstractC25226BEj.A0R(AbstractC25231BEo.A0O(viewGroup), viewGroup, R.layout.full_screen_text_only_empty_state, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C39090HIo c39090HIo = (C39090HIo) interfaceC66482zP;
        C38418Gut c38418Gut = (C38418Gut) c3oo;
        AbstractC167017dG.A1N(c39090HIo, c38418Gut);
        IgTextView igTextView = c38418Gut.A00;
        Resources resources = igTextView.getResources();
        C14360o3.A07(resources);
        igTextView.setText(VSL.A00(resources, c39090HIo.A00));
        HCI hci = this.A00;
        I6J.A00(AbstractC166987dD.A0r(hci.A0K)).A03(AbstractC25225BEi.A15(hci.A0C));
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C39090HIo.class;
    }

    public HI9(HCI hci) {
        this.A00 = hci;
    }
}
