package X;

import android.view.ViewGroup;
import android.widget.SeekBar;
import com.facebook.R;

/* renamed from: X.Bpl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26650Bpl extends AbstractC77583di {
    public static final C51532Yb A04 = AbstractC25232BEp.A1B(C29000Cqp.A00);
    public final int A00;
    public final SeekBar.OnSeekBarChangeListener A01;
    public final C2XI A02;
    public final C51722Yv A03;

    public C26650Bpl(SeekBar.OnSeekBarChangeListener onSeekBarChangeListener, C2XI c2xi, C51722Yv c51722Yv, int i) {
        C14360o3.A0B(c2xi, 1);
        this.A02 = c2xi;
        this.A00 = i;
        this.A01 = onSeekBarChangeListener;
        this.A03 = c51722Yv;
    }

    @Override // X.AbstractC77583di
    public final C78053eX A0Y(C77993eR c77993eR) {
        C14360o3.A0B(c77993eR, 0);
        Object A00 = AbstractC77183d4.A00(c77993eR, new C37015GSu(c77993eR, 23), new Object[0]);
        return AbstractC25225BEi.A0g(this.A03, C29059Crm.A00, AbstractC25229BEm.A0c(c77993eR, A04, C29799DCr.A00, new C30184DRp(3, A00, c77993eR, this)));
    }

    public static final void A03(ViewGroup viewGroup, int i, int i2) {
        AbstractC167007dF.A0N(viewGroup, R.id.timer).setText(C23831Eq.A02(i - i2));
    }
}
