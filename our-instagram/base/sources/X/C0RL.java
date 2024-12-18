package X;

import java.io.DataInput;
import java.io.DataOutput;

/* renamed from: X.0RL, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0RL extends C0CF {
    @Override // X.C0CF
    public final long A00() {
        return -2479634339626480691L;
    }

    @Override // X.C0CF
    public final /* bridge */ /* synthetic */ void A01(AbstractC02960Bu abstractC02960Bu, DataOutput dataOutput) {
        C06130Ud c06130Ud = (C06130Ud) abstractC02960Bu;
        C14360o3.A0B(c06130Ud, 0);
        C14360o3.A0B(dataOutput, 1);
        dataOutput.writeLong(c06130Ud.A00);
        dataOutput.writeLong(c06130Ud.A01);
        dataOutput.writeLong(c06130Ud.A02);
        dataOutput.writeLong(c06130Ud.A03);
    }

    @Override // X.C0CF
    public final /* bridge */ /* synthetic */ boolean A02(AbstractC02960Bu abstractC02960Bu, DataInput dataInput) {
        C06130Ud c06130Ud = (C06130Ud) abstractC02960Bu;
        C14360o3.A0B(c06130Ud, 0);
        C14360o3.A0B(dataInput, 1);
        c06130Ud.A00 = dataInput.readLong();
        c06130Ud.A01 = dataInput.readLong();
        c06130Ud.A02 = dataInput.readLong();
        c06130Ud.A03 = dataInput.readLong();
        return true;
    }
}
