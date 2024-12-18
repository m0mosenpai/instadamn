package X;

import java.io.DataInput;
import java.io.DataOutput;

/* renamed from: X.0RO, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0RO extends C0CF {
    @Override // X.C0CF
    public final long A00() {
        return 2353414016265691865L;
    }

    @Override // X.C0CF
    public final /* bridge */ /* synthetic */ void A01(AbstractC02960Bu abstractC02960Bu, DataOutput dataOutput) {
        C0WB c0wb = (C0WB) abstractC02960Bu;
        C14360o3.A0B(c0wb, 0);
        C14360o3.A0B(dataOutput, 1);
        dataOutput.writeDouble(c0wb.A03);
        dataOutput.writeDouble(c0wb.A02);
        dataOutput.writeDouble(c0wb.A01);
        dataOutput.writeDouble(c0wb.A00);
    }

    @Override // X.C0CF
    public final /* bridge */ /* synthetic */ boolean A02(AbstractC02960Bu abstractC02960Bu, DataInput dataInput) {
        C0WB c0wb = (C0WB) abstractC02960Bu;
        C14360o3.A0B(c0wb, 0);
        C14360o3.A0B(dataInput, 1);
        c0wb.A03 = dataInput.readDouble();
        c0wb.A02 = dataInput.readDouble();
        c0wb.A01 = dataInput.readDouble();
        c0wb.A00 = dataInput.readDouble();
        return true;
    }
}
