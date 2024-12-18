package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.facebook.R;

/* renamed from: X.MdX, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50840MdX extends Fragment {
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        String string;
        Bundle bundle2;
        String string2;
        C14360o3.A0B(view, 0);
        TextView A0T = AbstractC166997dE.A0T(requireView(), R.id.prompt_participation_friction_title);
        Bundle bundle3 = this.mArguments;
        String str3 = null;
        if (bundle3 != null) {
            str = bundle3.getString("ARG_TITLE_TEXT");
        } else {
            str = null;
        }
        A0T.setText(str);
        TextView A0T2 = AbstractC166997dE.A0T(requireView(), R.id.prompt_participation_friction_body_1);
        Bundle bundle4 = this.mArguments;
        if (bundle4 != null) {
            str2 = bundle4.getString("ARG_BODY_ONE_TEXT");
        } else {
            str2 = null;
        }
        A0T2.setText(str2);
        TextView A0N = AbstractC167007dF.A0N(requireView(), R.id.prompt_participation_friction_body_2);
        Bundle bundle5 = this.mArguments;
        if (bundle5 != null && (string = bundle5.getString("ARG_IS_BODY_TWO_LINK_URL")) != null && (bundle2 = this.mArguments) != null && (string2 = bundle2.getString("ARG_BODY_TWO_TEXT")) != null) {
            android.net.Uri parse = android.net.Uri.parse(string);
            C14360o3.A07(parse);
            AnonymousClass773.A01(parse, A0N, string2, string2);
        } else {
            Bundle bundle6 = this.mArguments;
            if (bundle6 != null) {
                str3 = bundle6.getString("ARG_BODY_TWO_TEXT");
            }
            A0N.setText(str3);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1744731633);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.prompt_participation_friction_fragment, false);
        C0f9.A09(88150235, A02);
        return A0R;
    }
}
