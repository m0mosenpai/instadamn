package X;

import java.io.DataInput;
import java.io.DataOutput;

/* renamed from: X.0RI, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0RI extends C0CF {
    @Override // X.C0CF
    public final long A00() {
        return -7207777727314674541L;
    }

    @Override // X.C0CF
    public final /* bridge */ /* synthetic */ void A01(AbstractC02960Bu abstractC02960Bu, DataOutput dataOutput) {
        C0SO c0so = (C0SO) abstractC02960Bu;
        C14360o3.A0B(c0so, 0);
        C14360o3.A0B(dataOutput, 1);
        dataOutput.writeInt(c0so.A04);
        dataOutput.writeInt(c0so.A05);
        dataOutput.writeLong(c0so.A0D);
        dataOutput.writeLong(c0so.A0C);
        dataOutput.writeInt(c0so.A06);
        dataOutput.writeInt(c0so.A07);
        dataOutput.writeInt(c0so.A00);
        dataOutput.writeInt(c0so.A01);
        dataOutput.writeLong(c0so.A0B);
        dataOutput.writeLong(c0so.A0A);
        dataOutput.writeInt(c0so.A02);
        dataOutput.writeInt(c0so.A03);
        dataOutput.writeInt(c0so.A08);
        dataOutput.writeInt(c0so.A09);
    }

    @Override // X.C0CF
    public final /* bridge */ /* synthetic */ boolean A02(AbstractC02960Bu abstractC02960Bu, DataInput dataInput) {
        C0SO c0so = (C0SO) abstractC02960Bu;
        C14360o3.A0B(c0so, 0);
        C14360o3.A0B(dataInput, 1);
        c0so.A04 = dataInput.readInt();
        c0so.A05 = dataInput.readInt();
        c0so.A0D = dataInput.readLong();
        c0so.A0C = dataInput.readLong();
        c0so.A06 = dataInput.readInt();
        c0so.A07 = dataInput.readInt();
        c0so.A00 = dataInput.readInt();
        c0so.A01 = dataInput.readInt();
        c0so.A0B = dataInput.readLong();
        c0so.A0A = dataInput.readLong();
        c0so.A02 = dataInput.readInt();
        c0so.A03 = dataInput.readInt();
        c0so.A08 = dataInput.readInt();
        c0so.A09 = dataInput.readInt();
        return true;
    }
}
