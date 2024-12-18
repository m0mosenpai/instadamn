package X;

/* renamed from: X.02r, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C007702r extends AnonymousClass057 implements C0UO {
    public final void A0D(int i) {
        synchronized (this) {
            Object[] objArr = this.A04;
            C14360o3.A0A(objArr);
            F8m(Integer.valueOf(((Number) objArr[(objArr.length - 1) & ((int) ((((AnonymousClass057) this).A03 + ((int) ((Math.min(((AnonymousClass057) this).A02, r2) + ((AnonymousClass057) this).A00) - r2))) - 1))]).intValue() + i));
        }
    }

    @Override // X.C0UO
    public final /* bridge */ /* synthetic */ Object getValue() {
        Integer valueOf;
        synchronized (this) {
            Object[] objArr = this.A04;
            C14360o3.A0A(objArr);
            valueOf = Integer.valueOf(((Number) objArr[(objArr.length - 1) & ((int) ((((AnonymousClass057) this).A03 + ((int) ((Math.min(((AnonymousClass057) this).A02, r2) + ((AnonymousClass057) this).A00) - r2))) - 1))]).intValue());
        }
        return valueOf;
    }
}
