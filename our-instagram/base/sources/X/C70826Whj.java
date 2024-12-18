package X;

import android.text.Editable;
import android.view.View;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.Whj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70826Whj implements InterfaceC60152ox {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C70826Whj(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    @Override // X.InterfaceC60152ox
    public final void DOK(int i, boolean z) {
        Editable editable;
        switch (this.A00) {
            case 0:
                View view = (View) this.A01;
                if (i > 0) {
                    view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
                    ((InterfaceC16660sJ) this.A02).invoke(Integer.valueOf(i));
                    return;
                } else {
                    view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), 0);
                    return;
                }
            case 1:
                C15100pQ c15100pQ = (C15100pQ) this.A01;
                int i2 = c15100pQ.A00;
                if (i > i2) {
                    C7VL.A00((C7VL) this.A02).onKeyboardExpanded();
                } else if (i < i2) {
                    C7VL.A00((C7VL) this.A02).onKeyboardCollapsed();
                }
                c15100pQ.A00 = i;
                return;
            default:
                UJS ujs = (UJS) this.A01;
                View view2 = ujs.A00;
                IgEditText igEditText = ujs.A02;
                IgdsButton igdsButton = ujs.A03;
                if (i == 0) {
                    if (igEditText != null) {
                        editable = igEditText.getText();
                    } else {
                        editable = null;
                    }
                    if (String.valueOf(editable).length() == 0) {
                        view2.setVisibility(8);
                        if (igdsButton != null) {
                            igdsButton.setVisibility(0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
