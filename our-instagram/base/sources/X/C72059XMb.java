package X;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.XMb, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72059XMb implements InterfaceC42071wx, InterfaceC41801wU {
    public static final C72102XNw[] A04 = new C72102XNw[0];
    public static final C72102XNw[] A05 = new C72102XNw[0];
    public final AtomicReference A01;
    public final AtomicReference A03 = new AtomicReference();
    public final AtomicReference A02 = new AtomicReference(A04);
    public final AtomicBoolean A00 = new AtomicBoolean();

    public final void A00(C72102XNw c72102XNw) {
        AtomicReference atomicReference;
        C72102XNw[] c72102XNwArr;
        C72102XNw[] c72102XNwArr2;
        do {
            atomicReference = this.A02;
            c72102XNwArr = (C72102XNw[]) atomicReference.get();
            int length = c72102XNwArr.length;
            if (length != 0) {
                int i = 0;
                while (!c72102XNwArr[i].equals(c72102XNw)) {
                    i++;
                    if (i >= length) {
                        return;
                    }
                }
                if (i >= 0) {
                    if (length == 1) {
                        c72102XNwArr2 = A04;
                    } else {
                        c72102XNwArr2 = new C72102XNw[length - 1];
                        System.arraycopy(c72102XNwArr, 0, c72102XNwArr2, 0, i);
                        System.arraycopy(c72102XNwArr, i + 1, c72102XNwArr2, i, (length - i) - 1);
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        } while (!C1EM.A00(c72102XNwArr, c72102XNwArr2, atomicReference));
    }

    @Override // X.InterfaceC42071wx
    public final void DVo(Object obj) {
        for (C72102XNw c72102XNw : (C72102XNw[]) this.A02.get()) {
            c72102XNw.A00.DVo(obj);
        }
    }

    @Override // X.InterfaceC42071wx
    public final void Dpc(InterfaceC41801wU interfaceC41801wU) {
        C6KP.A03(interfaceC41801wU, this.A03);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC41801wU
    public final void dispose() {
        AtomicReference atomicReference = this.A02;
        C72102XNw[] c72102XNwArr = A05;
        if (atomicReference.getAndSet(c72102XNwArr) != c72102XNwArr) {
            C1EM.A00(this, null, this.A01);
            C6KP.A01(this.A03);
        }
    }

    @Override // X.InterfaceC42071wx
    public final void onComplete() {
        C1EM.A00(this, null, this.A01);
        for (C72102XNw c72102XNw : (C72102XNw[]) this.A02.getAndSet(A05)) {
            c72102XNw.A00.onComplete();
        }
    }

    @Override // X.InterfaceC42071wx
    public final void onError(Throwable th) {
        C1EM.A00(this, null, this.A01);
        C72102XNw[] c72102XNwArr = (C72102XNw[]) this.A02.getAndSet(A05);
        int length = c72102XNwArr.length;
        if (length != 0) {
            int i = 0;
            do {
                c72102XNwArr[i].A00.onError(th);
                i++;
            } while (i < length);
            return;
        }
        AbstractC142886co.A02(th);
    }

    public C72059XMb(AtomicReference atomicReference) {
        this.A01 = atomicReference;
    }
}
