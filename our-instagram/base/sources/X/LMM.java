package X;

import android.content.DialogInterface;
import java.util.Map;

/* loaded from: classes8.dex */
public final class LMM implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public LMM(KYg kYg, Map map, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A00 = i;
        this.A02 = kYg;
        this.A06 = z;
        this.A03 = z2;
        this.A01 = map;
        this.A04 = z3;
        this.A05 = z4;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.A00;
        KYg kYg = (KYg) this.A02;
        if (i2 != 0) {
            Integer num = C05F.A1I;
            boolean z = this.A06;
            boolean z2 = this.A03;
            Map map = (Map) this.A01;
            boolean z3 = this.A04;
            boolean z4 = this.A05;
            ((LLN) kYg.A01.getValue()).A07(Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3), Boolean.valueOf(z4), C05F.A15, num, map, null, AbstractC06930Yk.A0E());
            return;
        }
        Integer num2 = C05F.A1F;
        boolean z5 = this.A06;
        boolean z6 = this.A03;
        Map map2 = (Map) this.A01;
        boolean z7 = this.A04;
        boolean z8 = this.A05;
        ((LLN) kYg.A01.getValue()).A07(Boolean.valueOf(z5), Boolean.valueOf(z6), Boolean.valueOf(z7), Boolean.valueOf(z8), C05F.A15, num2, map2, null, AbstractC06930Yk.A0E());
        ((C44550Jmu) kYg.A02.getValue()).A04(map2, false, z5, z6, z7, z8);
    }
}
