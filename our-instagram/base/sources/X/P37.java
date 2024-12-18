package X;

import com.instagram.igds.components.form.IgFormField;
import com.instagram.leadgen.core.ui.LeadGenFormShortAnswerQuestionView;

/* loaded from: classes9.dex */
public final class P37 implements MP8 {
    public final int A00;
    public final Object A01;

    public P37(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.MP8
    public final void DoR(String str) {
        IgFormField igFormField;
        switch (this.A00) {
            case 0:
                C32324ELs c32324ELs = (C32324ELs) this.A01;
                if (!str.equals("removable") || (igFormField = c32324ELs.A0F) == null) {
                    return;
                }
                igFormField.setText("");
                return;
            case 1:
            case 3:
            default:
                if (str.equals("removable")) {
                    igFormField = ((NO5) this.A01).A02;
                    igFormField.setText("");
                    return;
                }
                return;
            case 2:
                if (!str.equals("removable")) {
                    return;
                }
                igFormField = ((NOA) this.A01).A04;
                igFormField.setText("");
                return;
            case 4:
                if (!str.equals("removable")) {
                    return;
                }
                igFormField = ((LeadGenFormShortAnswerQuestionView) this.A01).A01;
                igFormField.setText("");
                return;
        }
    }
}
