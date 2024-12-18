package X;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import com.instagram.igds.components.button.IgdsButton;

/* loaded from: classes9.dex */
public final class NG3 extends AbstractC13100lw {
    public final int A00;
    public final Object A01;

    public NG3(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.AbstractC13100lw, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        if (this.A00 != 0) {
            super.afterTextChanged(editable);
        } else {
            C14360o3.A0B(editable, 0);
            ((LYZ) this.A01).A08();
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.AbstractC13100lw, android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        IgdsButton igdsButton;
        String obj;
        switch (this.A00) {
            case 0:
                C14360o3.A0B(charSequence, 0);
                super.onTextChanged(charSequence, i, i2, i3);
                return;
            case 1:
                C14360o3.A0B(charSequence, 0);
                super.onTextChanged(charSequence, i, i2, i3);
                igdsButton = ((UJS) this.A01).A04;
                igdsButton.setEnabled(AbstractC167007dF.A1O(charSequence.length()));
                return;
            case 2:
                C14360o3.A0B(charSequence, 0);
                super.onTextChanged(charSequence, i, i2, i3);
                C51026MgZ A00 = C56162OwU.A00((C56162OwU) this.A01);
                String obj2 = charSequence.toString();
                C14360o3.A0B(obj2, 0);
                C51026MgZ.A00(null, A00, obj2, 15, false, false, false);
                return;
            case 3:
                C14360o3.A0B(charSequence, 0);
                super.onTextChanged(charSequence, i, i2, i3);
                OJp oJp = (OJp) this.A01;
                C50939Mf8 c50939Mf8 = (C50939Mf8) oJp.A08.getValue();
                SpannableStringBuilder A0H = AbstractC25225BEi.A0H(charSequence);
                if (((AbstractC190598cH) oJp.A05).A03.size() >= 20) {
                    return;
                }
                if (AbstractC001900j.A07(A0H, "@", A0H.length() - 1) != -1 && (obj = A0H.subSequence(AbstractC001900j.A07(A0H, "@", A0H.length() - 1) + 1, A0H.length()).toString()) != null && !AbstractC001900j.A0a(obj, " ", false)) {
                    PZ1.A01(c50939Mf8, obj, AbstractC141776au.A00(c50939Mf8), 35);
                    C190458c3 c190458c3 = c50939Mf8.A03;
                    c190458c3.A00();
                    if (obj.length() != 0) {
                        c190458c3.A01();
                    }
                    AbstractC166997dE.A1Y(c50939Mf8.A04.A0L, true);
                    return;
                }
                C57164PZi.A03(c50939Mf8, AbstractC141776au.A00(c50939Mf8), 36);
                return;
            default:
                C14360o3.A0B(charSequence, 0);
                super.onTextChanged(charSequence, i, i2, i3);
                igdsButton = ((C52837NZu) this.A01).A02;
                if (igdsButton == null) {
                    return;
                }
                igdsButton.setEnabled(AbstractC167007dF.A1O(charSequence.length()));
                return;
        }
    }
}
