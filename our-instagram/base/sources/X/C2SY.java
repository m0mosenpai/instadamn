package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: X.2SY, reason: invalid class name */
/* loaded from: classes.dex */
public class C2SY {
    public static final /* synthetic */ AtomicIntegerFieldUpdater A01 = AtomicIntegerFieldUpdater.newUpdater(C2SY.class, "_size$volatile");
    public InterfaceC90023zi[] A00;
    public volatile /* synthetic */ int _size$volatile;

    private final void A00(int i, int i2) {
        InterfaceC90023zi[] interfaceC90023ziArr = this.A00;
        C14360o3.A0A(interfaceC90023ziArr);
        InterfaceC90023zi interfaceC90023zi = interfaceC90023ziArr[i2];
        C14360o3.A0A(interfaceC90023zi);
        InterfaceC90023zi interfaceC90023zi2 = interfaceC90023ziArr[i];
        C14360o3.A0A(interfaceC90023zi2);
        interfaceC90023ziArr[i] = interfaceC90023zi;
        interfaceC90023ziArr[i2] = interfaceC90023zi2;
        ((AbstractRunnableC90013zh) interfaceC90023zi).A00 = i;
        ((AbstractRunnableC90013zh) interfaceC90023zi2).A00 = i2;
    }

    public static final void A01(C2SY c2sy, int i) {
        while (i > 0) {
            InterfaceC90023zi[] interfaceC90023ziArr = c2sy.A00;
            C14360o3.A0A(interfaceC90023ziArr);
            int i2 = (i - 1) / 2;
            InterfaceC90023zi interfaceC90023zi = interfaceC90023ziArr[i2];
            C14360o3.A0A(interfaceC90023zi);
            InterfaceC90023zi interfaceC90023zi2 = interfaceC90023ziArr[i];
            C14360o3.A0A(interfaceC90023zi2);
            if (((Comparable) interfaceC90023zi).compareTo(interfaceC90023zi2) > 0) {
                c2sy.A00(i, i2);
                i = i2;
            } else {
                return;
            }
        }
    }

    public final InterfaceC90023zi A02(int i) {
        InterfaceC90023zi[] interfaceC90023ziArr = this.A00;
        C14360o3.A0A(interfaceC90023ziArr);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = A01;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i < atomicIntegerFieldUpdater.get(this)) {
            A00(i, atomicIntegerFieldUpdater.get(this));
            int i2 = (i - 1) / 2;
            if (i > 0) {
                InterfaceC90023zi interfaceC90023zi = interfaceC90023ziArr[i];
                C14360o3.A0A(interfaceC90023zi);
                InterfaceC90023zi interfaceC90023zi2 = interfaceC90023ziArr[i2];
                C14360o3.A0A(interfaceC90023zi2);
                if (((Comparable) interfaceC90023zi).compareTo(interfaceC90023zi2) < 0) {
                    A00(i, i2);
                    A01(this, i2);
                }
            }
            while (true) {
                int i3 = (i * 2) + 1;
                if (i3 >= atomicIntegerFieldUpdater.get(this)) {
                    break;
                }
                InterfaceC90023zi[] interfaceC90023ziArr2 = this.A00;
                C14360o3.A0A(interfaceC90023ziArr2);
                int i4 = i3 + 1;
                if (i4 < atomicIntegerFieldUpdater.get(this)) {
                    InterfaceC90023zi interfaceC90023zi3 = interfaceC90023ziArr2[i4];
                    C14360o3.A0A(interfaceC90023zi3);
                    InterfaceC90023zi interfaceC90023zi4 = interfaceC90023ziArr2[i3];
                    C14360o3.A0A(interfaceC90023zi4);
                    if (((Comparable) interfaceC90023zi3).compareTo(interfaceC90023zi4) < 0) {
                        i3 = i4;
                    }
                }
                InterfaceC90023zi interfaceC90023zi5 = interfaceC90023ziArr2[i];
                C14360o3.A0A(interfaceC90023zi5);
                InterfaceC90023zi interfaceC90023zi6 = interfaceC90023ziArr2[i3];
                C14360o3.A0A(interfaceC90023zi6);
                if (((Comparable) interfaceC90023zi5).compareTo(interfaceC90023zi6) <= 0) {
                    break;
                }
                A00(i, i3);
                i = i3;
            }
        }
        InterfaceC90023zi interfaceC90023zi7 = interfaceC90023ziArr[atomicIntegerFieldUpdater.get(this)];
        C14360o3.A0A(interfaceC90023zi7);
        AbstractRunnableC90013zh abstractRunnableC90013zh = (AbstractRunnableC90013zh) interfaceC90023zi7;
        if (abstractRunnableC90013zh._heap != C2SZ.A01) {
            abstractRunnableC90013zh._heap = null;
            abstractRunnableC90013zh.A00 = -1;
            interfaceC90023ziArr[atomicIntegerFieldUpdater.get(this)] = null;
            return interfaceC90023zi7;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }
}
