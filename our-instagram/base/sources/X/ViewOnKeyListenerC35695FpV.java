package X;

import android.view.KeyEvent;
import android.view.View;
import com.instagram.common.ui.base.IgEditText;

/* renamed from: X.FpV, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnKeyListenerC35695FpV implements View.OnKeyListener {
    public final /* synthetic */ IgEditText A00;
    public final /* synthetic */ EL4 A01;

    public ViewOnKeyListenerC35695FpV(IgEditText igEditText, EL4 el4) {
        this.A01 = el4;
        this.A00 = igEditText;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (i == 67) {
            EL4 el4 = this.A01;
            if (EL4.A00(el4) == EnumC33330EoP.A03) {
                IgEditText igEditText = this.A00;
                if (C14360o3.A0K(AbstractC167007dF.A0g(igEditText), el4.getString(2131959490))) {
                    igEditText.getText().clear();
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
