package X;

import android.util.SparseLongArray;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* renamed from: X.0eK, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0eK extends C0Z5 {
    public final long A00;
    public final InterfaceC07530aS A01;
    public final InterfaceC07530aS A02;

    public static void A01(InterfaceC07530aS interfaceC07530aS, ObjectOutputStream objectOutputStream) {
        if (interfaceC07530aS == null) {
            objectOutputStream.writeInt(0);
            return;
        }
        int min = Math.min(interfaceC07530aS.size(), 40000);
        objectOutputStream.writeInt(min);
        for (int i = 0; i < min; i++) {
            int keyAt = interfaceC07530aS.keyAt(i);
            long valueAt = interfaceC07530aS.valueAt(i);
            objectOutputStream.writeInt(keyAt);
            objectOutputStream.writeLong(valueAt);
        }
    }

    @Override // X.C0Z5
    public final void A04(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeByte(2);
        objectOutputStream.writeLong(this.A00);
        A01(this.A02, objectOutputStream);
        A01(this.A01, objectOutputStream);
    }

    @Override // X.C0Z5
    public final int A02() {
        InterfaceC07530aS interfaceC07530aS = this.A02;
        int i = 0;
        if (interfaceC07530aS != null) {
            i = 0 + interfaceC07530aS.size();
        }
        InterfaceC07530aS interfaceC07530aS2 = this.A01;
        if (interfaceC07530aS2 != null) {
            return i + interfaceC07530aS2.size();
        }
        return i;
    }

    @Override // X.C0Z5
    public final long A03(int i) {
        int indexOfKey;
        InterfaceC07530aS interfaceC07530aS = this.A01;
        if ((interfaceC07530aS != null && (indexOfKey = interfaceC07530aS.indexOfKey(i)) >= 0) || ((interfaceC07530aS = this.A02) != null && (indexOfKey = interfaceC07530aS.indexOfKey((short) (i >> 16))) >= 0)) {
            return interfaceC07530aS.valueAt(indexOfKey);
        }
        return this.A00;
    }

    public C0eK(InterfaceC07530aS interfaceC07530aS, InterfaceC07530aS interfaceC07530aS2, long j) {
        this.A00 = j;
        this.A02 = interfaceC07530aS;
        this.A01 = interfaceC07530aS2;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [X.0aS, X.0S2, android.util.SparseLongArray] */
    public static C0S2 A00(ObjectInputStream objectInputStream) {
        int readInt = objectInputStream.readInt();
        if (readInt <= 0) {
            return null;
        }
        if (readInt <= 40000) {
            ?? sparseLongArray = new SparseLongArray(readInt);
            int i = 0;
            do {
                sparseLongArray.put(objectInputStream.readInt(), objectInputStream.readLong());
                i++;
            } while (i < readInt);
            return sparseLongArray;
        }
        throw new IOException("Data is corrupted: Metadata config size is exceeding the limit");
    }
}
