package X;

import java.io.DataInput;
import java.io.DataOutput;

/* renamed from: X.0RF, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0RF extends C0CF {
    @Override // X.C0CF
    public final long A00() {
        return 4345974300167284411L;
    }

    @Override // X.C0CF
    public final /* bridge */ /* synthetic */ void A01(AbstractC02960Bu abstractC02960Bu, DataOutput dataOutput) {
        C05680Rs c05680Rs = (C05680Rs) abstractC02960Bu;
        C14360o3.A0B(c05680Rs, 0);
        C14360o3.A0B(dataOutput, 1);
        dataOutput.writeLong(c05680Rs.A00);
        dataOutput.writeLong(c05680Rs.A01);
    }

    @Override // X.C0CF
    public final /* bridge */ /* synthetic */ boolean A02(AbstractC02960Bu abstractC02960Bu, DataInput dataInput) {
        C05680Rs c05680Rs = (C05680Rs) abstractC02960Bu;
        C14360o3.A0B(c05680Rs, 0);
        C14360o3.A0B(dataInput, 1);
        c05680Rs.A00 = dataInput.readLong();
        c05680Rs.A01 = dataInput.readLong();
        return true;
    }
}
