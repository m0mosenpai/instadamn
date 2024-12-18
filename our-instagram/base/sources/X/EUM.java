package X;

import com.instagram.actionbar.ActionButton;
import com.instagram.igds.components.form.IgFormField;
import java.util.Map;

/* loaded from: classes6.dex */
public final class EUM extends C1P1 {
    public final String A00;
    public final /* synthetic */ C36578GBc A01;

    public EUM(C36578GBc c36578GBc, String str) {
        this.A01 = c36578GBc;
        this.A00 = str;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int i;
        int A0N = AbstractC167017dG.A0N(abstractC115105If, 332766306);
        super.onFail(abstractC115105If);
        C36578GBc c36578GBc = this.A01;
        if (c36578GBc.A00) {
            i = -846626450;
        } else {
            C32200ECv c32200ECv = (C32200ECv) abstractC115105If.A00();
            if (c32200ECv != null) {
                C36578GBc.A00(c36578GBc, c32200ECv, "check_username_response_fail");
            } else {
                C32278EJo c32278EJo = c36578GBc.A01;
                AbstractC167007dF.A0x(c32278EJo.A00);
                AbstractC31180DnO.A18(c32278EJo.A02);
            }
            i = -213300634;
        }
        C0f9.A0A(i, A0N);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(2011093030);
        super.onFinish();
        C0f9.A0A(-467291225, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(-1716127625);
        super.onStart();
        C0f9.A0A(1754225763, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        CharSequence charSequence;
        int i;
        int A03 = C0f9.A03(767993984);
        C32200ECv c32200ECv = (C32200ECv) obj;
        int A0N = AbstractC167017dG.A0N(c32200ECv, -645637936);
        C36578GBc c36578GBc = this.A01;
        Map map = c36578GBc.A02;
        String str = this.A00;
        map.put(str, c32200ECv);
        if (c36578GBc.A00) {
            i = 1672155598;
        } else {
            C32278EJo c32278EJo = c36578GBc.A01;
            IgFormField igFormField = c32278EJo.A03;
            if (igFormField != null) {
                charSequence = igFormField.getText();
            } else {
                charSequence = null;
            }
            if (C14360o3.A0K(str, String.valueOf(charSequence))) {
                boolean z = c32200ECv.A02;
                AbstractC167007dF.A0x(c32278EJo.A00);
                if (z) {
                    AbstractC31180DnO.A18(c32278EJo.A02);
                } else {
                    ActionButton actionButton = c32278EJo.A02;
                    if (actionButton != null) {
                        actionButton.setEnabled(false);
                    }
                    C36578GBc.A00(c36578GBc, c32200ECv, "not_equal_to_proposed_username");
                }
            }
            i = -110586504;
        }
        C0f9.A0A(i, A0N);
        C0f9.A0A(1228795797, A03);
    }
}
