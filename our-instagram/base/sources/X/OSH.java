package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.leadgen.core.api.LeadForm;
import com.instagram.leadgen.core.api.LeadGenInfoFieldData;
import java.util.List;

/* loaded from: classes9.dex */
public abstract class OSH {
    public static final List A00 = AbstractC16960so.A1Q(EnumC53254Ngs.A06, EnumC53254Ngs.A04, EnumC53254Ngs.A07);

    public static final String A00(FragmentActivity fragmentActivity, LeadForm leadForm) {
        C14360o3.A0B(leadForm, 0);
        List<LeadGenInfoFieldData> list = leadForm.A05;
        StringBuilder A1C = AbstractC166987dD.A1C();
        int i = 0;
        for (LeadGenInfoFieldData leadGenInfoFieldData : list) {
            if (leadGenInfoFieldData.A02) {
                i++;
            } else {
                A1C.append(leadGenInfoFieldData.A00);
                A1C.append(", ");
            }
        }
        if (i > 0) {
            A1C.append(AbstractC167017dG.A0k(fragmentActivity.getResources(), i, R.plurals.lead_gen_available_forms_number_of_custom_questions));
        } else {
            A1C.setLength(A1C.length() - 2);
        }
        return AbstractC166987dD.A19(A1C);
    }
}
