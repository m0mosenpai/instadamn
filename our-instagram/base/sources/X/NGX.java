package X;

import com.facebook.common.stringformat.StringFormatUtil;

/* loaded from: classes9.dex */
public final class NGX extends AbstractRunnableC14200nk {
    public final /* synthetic */ int A00;
    public final /* synthetic */ OCA A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NGX(OCA oca, int i) {
        super(842414696, 3, false, false);
        this.A01 = oca;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OCA oca = this.A01;
        int i = this.A00;
        OWf oWf = oca.A03;
        Integer num = C05F.A0C;
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("slider_%d_%d_pct", Integer.valueOf(i), Integer.valueOf(i + 5));
        C14360o3.A07(formatStrLocaleSafe);
        oWf.A02(new PB5(num, null, null, formatStrLocaleSafe));
    }
}
