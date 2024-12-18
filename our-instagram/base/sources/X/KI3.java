package X;

import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes8.dex */
public final class KI3 extends AbstractC66412zI {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final String A02;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C44657Jq1(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.appreciation_creator_insights_info_row, false));
    }

    public KI3(FragmentActivity fragmentActivity, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = fragmentActivity;
        this.A02 = C45515KDg.__redex_internal_original_name;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C45198Jze c45198Jze = (C45198Jze) interfaceC66482zP;
        C44657Jq1 c44657Jq1 = (C44657Jq1) c3oo;
        boolean A1a = AbstractC167017dG.A1a(c45198Jze, c44657Jq1);
        c44657Jq1.A01.setText(c45198Jze.A01);
        FragmentActivity fragmentActivity = this.A00;
        UserSession userSession = this.A01;
        String str = this.A02;
        TextView textView = c44657Jq1.A00;
        String str2 = c45198Jze.A00;
        List<MUW> list = c45198Jze.A02;
        C14360o3.A0B(fragmentActivity, 0);
        AbstractC167027dH.A0a(A1a ? 1 : 0, userSession, str, textView, str2);
        SpannableStringBuilder A0H = AbstractC25225BEi.A0H(str2);
        if (list != null) {
            for (MUW muw : list) {
                String str3 = muw.A02;
                int A07 = AbstractC001900j.A07(str2, str3, str2.length() - 1);
                if (A07 >= 0) {
                    C44396JjZ c44396JjZ = new C44396JjZ(fragmentActivity, muw, userSession, str);
                    Pattern pattern = AbstractC13670mt.A06;
                    A0H.setSpan(c44396JjZ, A07, AbstractC167007dF.A0A(str3) + A07, 33);
                }
            }
        }
        AbstractC31176DnK.A1G(textView, A0H);
        textView.setHighlightColor(0);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C45198Jze.class;
    }
}
