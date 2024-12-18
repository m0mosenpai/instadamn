package X;

import android.content.Context;
import com.facebook.R;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import java.util.BitSet;

/* loaded from: classes5.dex */
public final class BS9 extends AbstractC51572Yf {
    public final float A00;
    public final float A01;
    public final int A02;
    public final AbstractC50812Vc A03;
    public final Integer A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        AbstractC50812Vc A0P;
        int color;
        C14360o3.A0B(c76223bS, 0);
        BSB bsb = new BSB(c76223bS.A05, new BSA());
        float f = this.A01;
        BSA bsa = bsb.A01;
        C2XH c2xh = ((AbstractC77733dx) bsb).A02;
        bsa.A00 = c2xh.A00(f);
        int i = this.A02;
        bsa.A02 = i;
        bsa.A01 = c2xh.A00(this.A00);
        bsa.A0C = true;
        AbstractC50812Vc abstractC50812Vc = this.A03;
        BSA bsa2 = bsb.A01;
        if (abstractC50812Vc == null) {
            A0P = null;
        } else {
            A0P = abstractC50812Vc.A0P();
        }
        bsa2.A07 = A0P;
        BitSet bitSet = bsb.A02;
        bitSet.set(0);
        Context context = ((AbstractC77733dx) bsb).A01.A0C;
        if (this.A08 && context != null) {
            Integer num = this.A04;
            boolean z = this.A05;
            boolean z2 = this.A07;
            boolean z3 = this.A06;
            if (num != null) {
                color = num.intValue();
            } else {
                boolean A03 = C1H6.A03();
                int i2 = R.color.design_dark_default_color_on_background;
                if (A03) {
                    i2 = R.color.cds_white_a20;
                }
                color = context.getColor(i2);
            }
            bsa.A01 = c2xh.A00(0.0f);
            bsa.A00 = c2xh.A00(0.0f);
            bsa.A02 = 0;
            EnumC77763e0 enumC77763e0 = EnumC77763e0.TOP;
            int A00 = c2xh.A00(4.0f);
            AbstractC50792Va abstractC50792Va = ((AbstractC77733dx) bsb).A00;
            abstractC50792Va.A0a().E3E(enumC77763e0, A00);
            abstractC50792Va.A0a().A0K(context.getResources().getDimensionPixelSize(R.dimen.audio_page_audio_filter_tooltip_vertical_offset));
            abstractC50792Va.A0a().E3E(EnumC77763e0.BOTTOM, c2xh.A00(10.0f));
            abstractC50792Va.A0a().A0T(EnumC77763e0.START, c2xh.A00(5.0f));
            abstractC50792Va.A0a().A0T(EnumC77763e0.END, c2xh.A00(5.0f));
            C50952Vr A02 = C50932Vp.A02(abstractC50792Va.A0a());
            A02.A0F |= OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_FINISHED;
            A02.A0g = false;
            C50952Vr A022 = C50932Vp.A02(abstractC50792Va.A0a());
            A022.A0F |= 8388608;
            A022.A0f = false;
            bsa.A08 = true;
            bsa.A09 = true;
            bsa.A0A = true;
            bsa.A0B = true;
            bsb.A05(new C25565BSc(context, i, color, 626, z, false, z2, z3));
        }
        AbstractC77733dx.A00(bitSet, bsb.A03, 1);
        bsb.A03();
        return bsa;
    }

    public BS9(AbstractC50812Vc abstractC50812Vc, Integer num, float f, float f2, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A01 = f;
        this.A00 = f2;
        this.A03 = abstractC50812Vc;
        this.A02 = i;
        this.A04 = num;
        this.A08 = z;
        this.A05 = z2;
        this.A07 = z3;
        this.A06 = z4;
    }
}
