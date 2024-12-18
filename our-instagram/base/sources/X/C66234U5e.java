package X;

import android.content.Context;

/* renamed from: X.U5e, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66234U5e extends C2WC {
    public final long A00;
    public final InterfaceC50822Vd A01;
    public final C2WC A02;
    public final String A03;

    @Override // X.C2WC
    public final void A07(Context context, C3h5 c3h5, C79063gD c79063gD, C2WC c2wc, C1LL c1ll, Object obj, Object obj2, Object obj3, boolean z) {
        AbstractC25229BEm.A1I(c2wc, 2, c3h5);
        this.A02.A07(context, c3h5, c79063gD, ((C66234U5e) c2wc).A02, c1ll, obj, obj2, obj3, z);
        super.A07(context, c3h5, c79063gD, c2wc, c1ll, obj, obj2, obj3, z);
    }

    @Override // X.C2WC
    public final void A08(Context context, C3h5 c3h5, C1LL c1ll, Object obj, Object obj2) {
        C14360o3.A0B(c3h5, 3);
        this.A02.A08(context, c3h5, c1ll, obj, obj2);
        super.A08(context, c3h5, c1ll, obj, obj2);
    }

    @Override // X.C2WC
    public final void A09(Context context, C3h5 c3h5, C1LL c1ll, Object obj, Object obj2) {
        C14360o3.A0B(c3h5, 3);
        super.A09(context, c3h5, c1ll, obj, obj2);
        this.A02.A09(context, c3h5, c1ll, obj, obj2);
    }

    @Override // X.C2WC
    public final void A0A(Context context, C3h5 c3h5, C1LL c1ll, Object obj, Object obj2) {
        AbstractC167017dG.A1Q(obj, c3h5);
        this.A02.A0A(context, c3h5, c1ll, obj, obj2);
        super.A0A(context, c3h5, c1ll, obj, obj2);
    }

    @Override // X.C2WC
    public final void A0B(Context context, C3h5 c3h5, C1LL c1ll, Object obj, Object obj2) {
        C14360o3.A0B(c3h5, 3);
        super.A0B(context, c3h5, c1ll, obj, obj2);
        this.A02.A0B(context, c3h5, c1ll, obj, obj2);
    }

    @Override // X.C2WC
    public final void A0C(C77843eC c77843eC) {
        C14360o3.A0B(c77843eC, 0);
        C2WC c2wc = this.A02;
        if (!c2wc.A0F(c77843eC)) {
            super.A0C(c77843eC);
            return;
        }
        throw new IllegalArgumentException(AnonymousClass001.A0u("Binder ", c77843eC.A00.getDescription(), " already exists in the wrapped ", c2wc.A04()));
    }

    @Override // X.C2WC
    public final void A0D(C77843eC c77843eC) {
        C14360o3.A0B(c77843eC, 0);
        C2WC c2wc = this.A02;
        if (!c2wc.A0G(c77843eC)) {
            super.A0D(c77843eC);
            return;
        }
        throw new IllegalArgumentException(AnonymousClass001.A0u("Binder ", c77843eC.A00.getDescription(), " already exists in the wrapped ", c2wc.A04()));
    }

    public C66234U5e(C2WC c2wc, long j) {
        super(c2wc.A04);
        this.A02 = c2wc;
        this.A00 = j;
        this.A01 = c2wc.A0I();
        this.A03 = c2wc.A04();
    }

    @Override // X.C2WC
    public final String A04() {
        return this.A03;
    }

    @Override // X.C2WC
    public final boolean A0E() {
        return this.A02.A0E();
    }

    @Override // X.C2WC
    public final long A0H() {
        return this.A00;
    }

    @Override // X.C2WC
    public final InterfaceC50822Vd A0I() {
        return this.A01;
    }
}
