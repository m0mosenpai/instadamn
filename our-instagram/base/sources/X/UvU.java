package X;

import com.facebookpay.form.cell.card.CardCellParams;
import com.facebookpay.form.cell.text.TextCellParams;
import java.util.List;

/* loaded from: classes11.dex */
public final class UvU extends C67664Uuw {
    public int A00;
    public List A01;
    public boolean A02;

    @Override // X.C67664Uuw
    public final TextCellParams A00() {
        super.A00();
        return new CardCellParams(this);
    }
}
