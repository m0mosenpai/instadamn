package X;

import com.instagram.debug.devoptions.debughead.util.MemoryUtil;
import java.lang.ref.WeakReference;

/* renamed from: X.1NN, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1NN implements Comparable {
    public final int A00;
    public final int A01;
    public final WeakReference A02;

    public final boolean equals(Object obj) {
        C1NN c1nn;
        return this == obj || (obj != null && C14360o3.A0K(getClass(), obj.getClass()) && (obj instanceof C1NN) && (c1nn = (C1NN) obj) != null && this.A01 == c1nn.A01);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C1NN c1nn = (C1NN) obj;
        C14360o3.A0B(c1nn, 0);
        return this.A01 - c1nn.A01;
    }

    public final int hashCode() {
        return this.A01;
    }

    public C1NN(InterfaceC220315d interfaceC220315d, int i, int i2) {
        this.A00 = i2;
        this.A02 = new WeakReference(interfaceC220315d);
        this.A01 = (i * MemoryUtil.MAX_ALLOC_SIZE) + (interfaceC220315d.hashCode() % MemoryUtil.MAX_ALLOC_SIZE);
        if (i >= -100 && i <= 100) {
        } else {
            throw new IllegalStateException("Priority must be between -100 and 100!");
        }
    }
}
