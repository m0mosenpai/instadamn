package X;

import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import java.util.Iterator;

/* renamed from: X.EHu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32236EHu extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "AutoConfBottomSheetFragment";
    public String A00;
    public String A01;
    public final InterfaceC09390do A02 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "auto_conf_bottom_sheet";
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int A02 = C0f9.A02(-723194285);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.auto_conf_bottom_sheet_fragment, viewGroup, false);
        String string = requireArguments().getString("AUTO_CONF_SCREEN_TYPE", null);
        if (string != null) {
            this.A00 = string;
            C14360o3.A0A(inflate);
            ViewGroup A0C = AbstractC31176DnK.A0C(inflate, R.id.bottom_sheet_text_list);
            String str = this.A00;
            String str2 = "autoConfScreenType";
            if (str != null) {
                if (str.equals("OPT_OUT")) {
                    this.A01 = getString(2131953355);
                    i = 2131953356;
                } else {
                    int i2 = 2131953343;
                    if (str.equals("CONSENT")) {
                        i2 = 2131953344;
                    }
                    this.A01 = getString(i2);
                    i = 2131953342;
                }
                String string2 = getString(i);
                String str3 = this.A01;
                if (str3 == null) {
                    str2 = "descriptionParagraph1";
                } else if (string2 == null) {
                    str2 = "descriptionParagraph2";
                } else {
                    Iterator it = AbstractC16960so.A1Q(str3, string2).iterator();
                    while (it.hasNext()) {
                        String A1B = AbstractC166987dD.A1B(it);
                        View A0R = AbstractC25226BEj.A0R(layoutInflater, A0C, R.layout.auto_conf_bulleted_list, false);
                        View findViewById = A0R.findViewById(R.id.description_text);
                        if (findViewById != null) {
                            TextView textView = (TextView) findViewById;
                            if (A1B == null) {
                                A1B = "";
                            }
                            textView.setText(Html.fromHtml(A1B));
                            A0C.addView(A0R);
                        } else {
                            throw AbstractC166997dE.A0g();
                        }
                    }
                    C0f9.A09(1636072094, A02);
                    return inflate;
                }
            }
            C14360o3.A0F(str2);
            throw C00O.createAndThrow();
        }
        IllegalStateException A0g = AbstractC166997dE.A0g();
        C0f9.A09(1397608471, A02);
        throw A0g;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(1988305982);
        super.onResume();
        C0f9.A09(1300166305, A02);
    }
}
