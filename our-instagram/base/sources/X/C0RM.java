package X;

import java.io.DataInput;
import java.io.DataOutput;

/* renamed from: X.0RM, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0RM extends C0CF {
    @Override // X.C0CF
    public final long A00() {
        return 6566077622105075903L;
    }

    @Override // X.C0CF
    public final /* bridge */ /* synthetic */ void A01(AbstractC02960Bu abstractC02960Bu, DataOutput dataOutput) {
        C0VK c0vk = (C0VK) abstractC02960Bu;
        C14360o3.A0B(c0vk, 0);
        C14360o3.A0B(dataOutput, 1);
        dataOutput.writeLong(c0vk.A03);
        dataOutput.writeLong(c0vk.A00);
        dataOutput.writeLong(c0vk.A02);
        dataOutput.writeLong(c0vk.A01);
    }

    @Override // X.C0CF
    public final /* bridge */ /* synthetic */ boolean A02(AbstractC02960Bu abstractC02960Bu, DataInput dataInput) {
        C0VK c0vk = (C0VK) abstractC02960Bu;
        C14360o3.A0B(c0vk, 0);
        C14360o3.A0B(dataInput, 1);
        c0vk.A03 = dataInput.readLong();
        c0vk.A00 = dataInput.readLong();
        c0vk.A02 = dataInput.readLong();
        c0vk.A01 = dataInput.readLong();
        return true;
    }
}
