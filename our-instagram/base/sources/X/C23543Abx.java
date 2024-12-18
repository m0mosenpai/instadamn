package X;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.lang.ref.ReferenceQueue;

/* renamed from: X.Abx, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23543Abx implements InterfaceC200208tP {
    public final C95394Qz A00;
    public final SettableFuture A01;
    public volatile InterfaceC200208tP A02;

    @Override // X.InterfaceC200208tP
    public final InterfaceC200208tP AKt(InterfaceC200438tm queue, Object value, ReferenceQueue entry) {
        return this;
    }

    @Override // X.InterfaceC200208tP
    public final InterfaceC200438tm B2N() {
        return null;
    }

    @Override // X.InterfaceC200208tP
    public final boolean isLoading() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [X.1Ke, java.lang.Object] */
    public final ListenableFuture A00(AbstractC200978ue abstractC200978ue, Object obj) {
        SettableFuture settableFuture;
        Object obj2;
        try {
            this.A00.A02();
            obj2 = this.A02.get();
        } catch (Throwable th) {
            SettableFuture settableFuture2 = this.A01;
            boolean exception = settableFuture2.setException(th);
            SettableFuture settableFuture3 = settableFuture2;
            if (!exception) {
                ?? obj3 = new Object();
                obj3.setException(th);
                settableFuture3 = obj3;
            }
            settableFuture = settableFuture3;
            if (th instanceof InterruptedException) {
                Thread.currentThread().interrupt();
                settableFuture = settableFuture3;
            }
        }
        if (obj2 == null) {
            Object A01 = abstractC200978ue.A01(obj);
            SettableFuture settableFuture4 = this.A01;
            boolean z = settableFuture4.set(A01);
            settableFuture = settableFuture4;
            if (!z) {
                return C2OD.A02(A01);
            }
            return settableFuture;
        }
        return AbstractRunnableC133325zz.A02(new C23524Abe(this, 0), abstractC200978ue.A00(obj, obj2), C1M8.A01);
    }

    @Override // X.InterfaceC200208tP
    public final int CHT() {
        return this.A02.CHT();
    }

    @Override // X.InterfaceC200208tP
    public final void CtT(Object newValue) {
        if (newValue != null) {
            this.A01.set(newValue);
        } else {
            this.A02 = ConcurrentMapC200188tN.A0L;
        }
    }

    @Override // X.InterfaceC200208tP
    public final Object FDs() {
        return AbstractC53362cK.A00(this.A01);
    }

    @Override // X.InterfaceC200208tP
    public final Object get() {
        return this.A02.get();
    }

    @Override // X.InterfaceC200208tP
    public final boolean isActive() {
        return this.A02.isActive();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    public C23543Abx(InterfaceC200208tP oldValue) {
        this.A01 = new Object();
        this.A00 = new C95394Qz();
        this.A02 = oldValue;
    }

    public C23543Abx() {
        this(ConcurrentMapC200188tN.A0L);
    }
}
