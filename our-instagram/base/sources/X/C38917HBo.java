package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.io.IOException;

/* renamed from: X.HBo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38917HBo extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "SurveyThanksFragment";
    public UserSession A00;
    public C38896HAs A01;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        String str = this.A01.A05;
        str.getClass();
        return str;
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A00;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1811068186);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A00 = AbstractC31176DnK.A0S(this);
        String string = requireArguments.getString("ARG_SERIALIZED_SURVEY_DATA");
        try {
            string.getClass();
            this.A01 = C41708Ide.parseFromJson(C16V.A00(string));
            C0f9.A09(-808268457, A02);
        } catch (IOException e) {
            RuntimeException runtimeException = new RuntimeException(e);
            C0f9.A09(-2079739854, A02);
            throw runtimeException;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1511996589);
        View A0A = AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.survey_thanks_bottom_sheet_fragment);
        C0f9.A09(1605130934, A02);
        return A0A;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        TextView A0T = AbstractC166997dE.A0T(view, R.id.survey_thanks_title);
        TextView A0T2 = AbstractC166997dE.A0T(view, R.id.survey_thanks_message);
        C41008IEd c41008IEd = this.A01.A01;
        c41008IEd.getClass();
        C38611qr c38611qr = c41008IEd.A00;
        if (c38611qr != null) {
            C105854pw c105854pw = new C105854pw(c38611qr);
            A0T.setText(c105854pw.A03());
            A0T2.setText(c105854pw.A02());
            return;
        }
        C14360o3.A0F("simpleActionDict");
        throw C00O.createAndThrow();
    }
}
