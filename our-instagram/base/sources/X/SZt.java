package X;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Map;

/* loaded from: classes10.dex */
public class SZt {

    @Deprecated
    public static final SZt A0A;
    public static final SZt A0B;
    public final int A00;
    public final int A01;
    public final int A02;
    public final SNB A03;
    public final ImmutableList A04;
    public final ImmutableList A05;
    public final ImmutableList A06;
    public final ImmutableList A07;
    public final ImmutableMap A08;
    public final ImmutableSet A09;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            SZt sZt = (SZt) obj;
            if (this.A02 != sZt.A02 || this.A01 != sZt.A01 || !this.A07.equals(sZt.A07) || !this.A04.equals(sZt.A04) || !this.A05.equals(sZt.A05) || !this.A03.equals(sZt.A03) || !this.A06.equals(sZt.A06) || this.A00 != sZt.A00 || !this.A08.equals(sZt.A08) || !this.A09.equals(sZt.A09)) {
                return false;
            }
        }
        return true;
    }

    static {
        SZt sZt = new SZt(new SOC());
        A0B = sZt;
        A0A = sZt;
    }

    public SZt(SOC soc) {
        this.A02 = soc.A02;
        this.A01 = soc.A01;
        this.A07 = soc.A07;
        this.A04 = soc.A04;
        this.A05 = soc.A05;
        this.A03 = soc.A03;
        this.A06 = soc.A06;
        this.A00 = soc.A00;
        this.A08 = ImmutableMap.copyOf((Map) soc.A08);
        this.A09 = ImmutableSet.A03(soc.A09);
    }

    public int hashCode() {
        return AbstractC166987dD.A0I(this.A09, AbstractC166997dE.A0J(this.A08, AbstractC25225BEi.A05(AbstractC166997dE.A0J(this.A06, AbstractC166997dE.A0J(this.A03, AbstractC166997dE.A0J(this.A05, ((((AbstractC166997dE.A0J(this.A04, AbstractC166997dE.A0J(this.A07, (((1871669920 + this.A02) * 31) + this.A01) * 31) * 31) * 31) + Integer.MAX_VALUE) * 31) + Integer.MAX_VALUE) * 31))), this.A00) * 31 * 31 * 31 * 31));
    }
}
