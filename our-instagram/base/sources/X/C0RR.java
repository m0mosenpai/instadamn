package X;

import java.io.DataInput;
import java.io.DataOutput;

/* renamed from: X.0RR, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0RR extends C0CF {
    @Override // X.C0CF
    public final long A00() {
        return -5544646103548483595L;
    }

    @Override // X.C0CF
    public final /* bridge */ /* synthetic */ void A01(AbstractC02960Bu abstractC02960Bu, DataOutput dataOutput) {
        C0YK c0yk = (C0YK) abstractC02960Bu;
        C14360o3.A0B(c0yk, 0);
        C14360o3.A0B(dataOutput, 1);
        dataOutput.writeLong(c0yk.A00);
        dataOutput.writeLong(c0yk.A01);
    }

    @Override // X.C0CF
    public final /* bridge */ /* synthetic */ boolean A02(AbstractC02960Bu abstractC02960Bu, DataInput dataInput) {
        C0YK c0yk = (C0YK) abstractC02960Bu;
        C14360o3.A0B(c0yk, 0);
        C14360o3.A0B(dataInput, 1);
        c0yk.A00 = dataInput.readLong();
        c0yk.A01 = dataInput.readLong();
        return true;
    }
}
