package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: X.05U, reason: invalid class name */
/* loaded from: classes.dex */
public final class C05U extends C0UG {
    public static final /* synthetic */ AtomicIntegerFieldUpdater A02 = AtomicIntegerFieldUpdater.newUpdater(C05U.class, "consumed$volatile");
    public final boolean A00;
    public final InterfaceC24751Is A01;
    public volatile /* synthetic */ int consumed$volatile;

    @Override // X.C0UG
    public final Object A00(InterfaceC71543Iw interfaceC71543Iw, InterfaceC23621Ds interfaceC23621Ds) {
        Object A01 = AbstractC07080Za.A01(interfaceC23621Ds, this.A01, new C14830ox(interfaceC71543Iw), this.A00);
        if (A01 != C1JX.A02) {
            return C0eB.A00;
        }
        return A01;
    }

    @Override // X.C0UG
    public final String A01() {
        StringBuilder sb = new StringBuilder();
        sb.append("channel=");
        sb.append(this.A01);
        return sb.toString();
    }

    @Override // X.C0UG
    public final InterfaceC24751Is A02(C19L c19l) {
        if (this.A00 && A02.getAndSet(this, 1) != 0) {
            throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
        }
        if (super.A00 == -3) {
            return this.A01;
        }
        return super.A02(c19l);
    }

    @Override // X.C0UG
    public final InterfaceC19390xP A03() {
        InterfaceC24751Is interfaceC24751Is = this.A01;
        boolean z = this.A00;
        return new C05U(C05F.A00, AnonymousClass191.A00, interfaceC24751Is, -3, z);
    }

    @Override // X.C0UG
    public final C0UG A04(Integer num, C12W c12w, int i) {
        return new C05U(num, c12w, this.A01, i, this.A00);
    }

    @Override // X.C0UG, X.InterfaceC19390xP
    public final Object collect(InterfaceC19960yQ interfaceC19960yQ, InterfaceC23621Ds interfaceC23621Ds) {
        Object collect;
        if (super.A00 == -3) {
            boolean z = this.A00;
            if (z && A02.getAndSet(this, 1) != 0) {
                throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
            }
            collect = AbstractC07080Za.A01(interfaceC23621Ds, this.A01, interfaceC19960yQ, z);
        } else {
            collect = super.collect(interfaceC19960yQ, interfaceC23621Ds);
        }
        if (collect != C1JX.A02) {
            return C0eB.A00;
        }
        return collect;
    }

    public C05U(Integer num, C12W c12w, InterfaceC24751Is interfaceC24751Is, int i, boolean z) {
        super(num, c12w, i);
        this.A01 = interfaceC24751Is;
        this.A00 = z;
        this.consumed$volatile = 0;
    }
}
