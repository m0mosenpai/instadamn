package X;

import android.text.Editable;
import android.widget.Filter;
import com.instagram.ui.text.ConstrainedEditText;

/* renamed from: X.AnL, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24136AnL implements InterfaceC190628cK {
    public final /* synthetic */ C9NL A00;

    @Override // X.InterfaceC190628cK
    public final boolean DdB(C05R c05r) {
        return false;
    }

    public C24136AnL(C9NL c9nl) {
        this.A00 = c9nl;
    }

    @Override // X.InterfaceC190628cK
    public final void DOI() {
        this.A00.A0J.DOI();
    }

    @Override // X.InterfaceC190628cK
    public final void DkM(ConstrainedEditText constrainedEditText, int i, int i2) {
        Editable text = constrainedEditText.getText();
        if (text.length() != 0) {
            if (i > 0) {
                C9NL c9nl = this.A00;
                ((Filter) c9nl.A0M.getValue()).filter(text);
                c9nl.A0H.A00(constrainedEditText);
                A8C a8c = c9nl.A0I;
                if (!a8c.A01) {
                    a8c.A02.Clg();
                    a8c.A01 = true;
                    return;
                }
                return;
            }
            constrainedEditText.setSelection(1, Math.max(i2, 1));
        }
    }
}
