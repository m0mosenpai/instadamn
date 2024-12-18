package X;

import android.content.Context;
import com.instagram.igds.components.form.IgFormField;
import java.util.regex.Pattern;

/* loaded from: classes6.dex */
public final class FQE {
    public C34448FGm A00;
    public boolean A01;
    public final Context A02;
    public final IgFormField A03;
    public final IgFormField A04;

    public FQE(Context context, IgFormField igFormField, IgFormField igFormField2) {
        int A07 = AbstractC25230BEn.A07(2, igFormField, igFormField2);
        this.A02 = context;
        this.A04 = igFormField;
        this.A03 = igFormField2;
        igFormField.setRuleChecker(new G8J(this, 2));
        igFormField.A0H(new Em2(this, 4));
        IgFormField igFormField3 = this.A03;
        igFormField3.setRuleChecker(new G8J(this, A07));
        igFormField3.A0H(new Em2(this, 5));
    }

    public final String A00() {
        Context context;
        int i;
        IgFormField igFormField = this.A04;
        String A0x = AbstractC31174DnI.A0x(igFormField);
        String A0x2 = AbstractC31174DnI.A0x(this.A03);
        Pattern pattern = AbstractC13670mt.A01;
        if (A0x != null && A0x.length() >= 6 && A0x2 != null && A0x2.length() >= 6) {
            if (!A0x.equals(A0x2)) {
                context = igFormField.getContext();
                i = 2131969379;
            } else {
                return null;
            }
        } else {
            context = igFormField.getContext();
            i = 2131969374;
        }
        return context.getString(i);
    }
}
