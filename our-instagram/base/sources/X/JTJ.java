package X;

import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public final class JTJ extends C4F4 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Integer A03;
    public final Integer A04;
    public final List A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        JTJ jtj = (JTJ) obj;
        if (jtj.A03 == this.A03 && this.A01 == jtj.A01 && this.A05.equals(jtj.A05) && this.A04 == jtj.A04 && this.A00 == jtj.A00 && this.A08 == jtj.A08 && this.A06 == jtj.A06 && this.A07 == jtj.A07 && this.A09 == jtj.A09 && this.A02 == jtj.A02 && this.A0A == jtj.A0A) {
            return true;
        }
        return false;
    }

    public JTJ(JTK jtk) {
        this.A03 = jtk.A0A;
        this.A01 = jtk.A01;
        this.A05 = Collections.unmodifiableList(jtk.A04);
        this.A04 = jtk.A03;
        this.A00 = jtk.A00;
        this.A08 = jtk.A07;
        this.A06 = jtk.A05;
        this.A07 = jtk.A06;
        this.A09 = jtk.A08;
        this.A02 = jtk.A02;
        this.A0A = jtk.A09;
    }
}
