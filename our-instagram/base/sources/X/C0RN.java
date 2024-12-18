package X;

import java.io.DataInput;
import java.io.DataOutput;

/* renamed from: X.0RN, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0RN extends C0CF {
    @Override // X.C0CF
    public final long A00() {
        return -2269842438411178483L;
    }

    @Override // X.C0CF
    public final /* bridge */ /* synthetic */ void A01(AbstractC02960Bu abstractC02960Bu, DataOutput dataOutput) {
        C06340Va c06340Va = (C06340Va) abstractC02960Bu;
        C14360o3.A0B(c06340Va, 0);
        C14360o3.A0B(dataOutput, 1);
        dataOutput.writeFloat(c06340Va.A00);
        dataOutput.writeLong(c06340Va.A01);
        dataOutput.writeLong(c06340Va.A02);
    }

    @Override // X.C0CF
    public final /* bridge */ /* synthetic */ boolean A02(AbstractC02960Bu abstractC02960Bu, DataInput dataInput) {
        C06340Va c06340Va = (C06340Va) abstractC02960Bu;
        C14360o3.A0B(c06340Va, 0);
        C14360o3.A0B(dataInput, 1);
        c06340Va.A00 = dataInput.readFloat();
        c06340Va.A01 = dataInput.readLong();
        c06340Va.A02 = dataInput.readLong();
        return true;
    }
}
