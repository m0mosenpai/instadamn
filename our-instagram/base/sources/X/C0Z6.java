package X;

import android.util.SparseIntArray;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.0Z6, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0Z6 {
    public final int A00;
    public final InterfaceC07520aR A01;
    public final InterfaceC07520aR A02;
    public final InterfaceC07520aR A03;

    public static void A02(InterfaceC07520aR interfaceC07520aR, ObjectOutputStream objectOutputStream) {
        if (interfaceC07520aR == null) {
            objectOutputStream.writeInt(0);
            return;
        }
        int min = Math.min(interfaceC07520aR.size(), 40000);
        objectOutputStream.writeInt(min);
        for (int i = 0; i < min; i++) {
            int keyAt = interfaceC07520aR.keyAt(i);
            int valueAt = interfaceC07520aR.valueAt(i);
            objectOutputStream.writeInt(keyAt);
            objectOutputStream.writeInt(valueAt);
        }
    }

    public C0Z6(InterfaceC07520aR interfaceC07520aR, InterfaceC07520aR interfaceC07520aR2, InterfaceC07520aR interfaceC07520aR3, int i) {
        this.A00 = i;
        this.A03 = interfaceC07520aR;
        this.A02 = interfaceC07520aR2;
        this.A01 = interfaceC07520aR3;
    }

    public static C0Z6 A00(ObjectInputStream objectInputStream, AtomicReference atomicReference) {
        int readInt = objectInputStream.readInt();
        if (atomicReference.get() != null) {
            return null;
        }
        C05760Sc A01 = A01(objectInputStream);
        if (atomicReference.get() != null) {
            return null;
        }
        C05760Sc A012 = A01(objectInputStream);
        if (atomicReference.get() != null) {
            return null;
        }
        return new C0Z6(A01, A012, A01(objectInputStream), readInt);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [android.util.SparseIntArray, X.0aR, X.0Sc] */
    public static C05760Sc A01(ObjectInputStream objectInputStream) {
        int readInt = objectInputStream.readInt();
        if (readInt <= 0) {
            return null;
        }
        if (readInt <= 40000) {
            ?? sparseIntArray = new SparseIntArray(readInt);
            int i = 0;
            do {
                sparseIntArray.put(objectInputStream.readInt(), objectInputStream.readInt());
                i++;
            } while (i < readInt);
            return sparseIntArray;
        }
        throw new IOException("Data is corrupted: Sampling size is exceeding the limit");
    }
}
