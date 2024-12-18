package X;

import java.io.File;

/* loaded from: classes4.dex */
public final class AGI {
    public final long A00;
    public final InterfaceC176157sY A01;
    public final File A02;
    public final Integer A03;
    public final Integer A04;
    public final boolean A05;
    public final boolean A06;

    public AGI(AGI agi, Integer num, boolean z) {
        this.A02 = agi.A02;
        this.A06 = agi.A06;
        this.A00 = agi.A00;
        this.A01 = agi.A01;
        this.A04 = agi.A04;
        this.A03 = num;
        this.A05 = z;
    }

    public AGI(InterfaceC176157sY interfaceC176157sY, File file, Boolean bool, Integer num, Long l) {
        long j;
        this.A02 = file;
        this.A06 = AbstractC167007dF.A1T(bool);
        if (l != null) {
            j = l.longValue();
        } else {
            j = Long.MAX_VALUE;
        }
        this.A00 = j;
        this.A01 = interfaceC176157sY;
        this.A04 = num;
        this.A03 = null;
        this.A05 = false;
    }
}
