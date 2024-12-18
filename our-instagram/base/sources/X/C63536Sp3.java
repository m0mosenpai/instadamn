package X;

import android.view.KeyEvent;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;

/* renamed from: X.Sp3, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63536Sp3 implements TextView.OnEditorActionListener {
    public final int A00;
    public final Object A01;

    public C63536Sp3(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        boolean z;
        switch (this.A00) {
            case 0:
                ((SearchView) this.A01).A0B();
                return true;
            case 1:
                Q8C A0I = ((QEC) this.A01).A0I();
                z = true;
                if ((keyEvent != null && keyEvent.getAction() == 0) || i == 6) {
                    if (A0I.A03.A02() == EnumC61120Rfa.A05) {
                        A0I.A0E();
                        return true;
                    }
                    return z;
                }
                return false;
            case 2:
                Q8D A0I2 = ((QEE) this.A01).A0I();
                z = true;
                if ((keyEvent != null && keyEvent.getAction() == 0) || i == 6) {
                    if (A0I2.A07.A02() == EnumC61121Rfb.A05) {
                        A0I2.A0E();
                        return true;
                    }
                    return z;
                }
                return false;
            default:
                Q8E q8e = ((C58766Q7v) this.A01).A08;
                if (q8e == null) {
                    C14360o3.A0F("viewModel");
                    throw C00O.createAndThrow();
                }
                z = true;
                if ((keyEvent != null && keyEvent.getAction() == 0) || i == 6) {
                    if (q8e.A08.A02() == EnumC61125Rff.A05) {
                        q8e.A0E();
                    }
                    return z;
                }
                return false;
        }
    }
}
