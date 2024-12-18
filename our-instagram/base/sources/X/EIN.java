package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.switchbutton.IgdsSwitch;

/* loaded from: classes6.dex */
public final class EIN extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "DeleteRevampBottomSheetFragment";
    public UserSession A00;
    public IgTextView A01;
    public IgTextView A02;
    public IgdsSwitch A03;
    public CharSequence A04;
    public String A05;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "delete_revamp_bottom_sheet";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        IgTextView A0X = AbstractC31172DnG.A0X(view, R.id.delete_revamp_bottom_sheet_content_text);
        C14360o3.A0B(A0X, 0);
        this.A01 = A0X;
        CharSequence charSequence = this.A04;
        if (charSequence == null) {
            str = "contentText";
        } else {
            A0X.setText(charSequence);
            IgTextView A0X2 = AbstractC31172DnG.A0X(view, R.id.delete_revamp_bottom_sheet_switch_text);
            C14360o3.A0B(A0X2, 0);
            this.A02 = A0X2;
            String str2 = this.A05;
            if (str2 == null) {
                str = "switchText";
            } else {
                A0X2.setText(str2);
                IgdsSwitch igdsSwitch = (IgdsSwitch) view.requireViewById(R.id.delete_revamp_bottom_sheet_switch);
                C14360o3.A0B(igdsSwitch, 0);
                this.A03 = igdsSwitch;
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        UserSession userSession = this.A00;
        if (userSession != null) {
            return userSession;
        }
        AbstractC31171DnF.A0u();
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1873535517);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        CharSequence charSequence = requireArguments.getCharSequence("content_text_key");
        AbstractC153636vY.A03(requireArguments, charSequence, "content_text_key");
        this.A04 = charSequence;
        this.A05 = AbstractC31173DnH.A0k(requireArguments, "switch_text_key");
        this.A00 = AbstractC31171DnF.A0G(requireArguments);
        C0f9.A09(-1609082243, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(846488644);
        C14360o3.A0B(layoutInflater, 0);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.delete_revamp_bottom_sheet_layout, viewGroup, false);
        C0f9.A09(106135688, A02);
        return inflate;
    }
}
