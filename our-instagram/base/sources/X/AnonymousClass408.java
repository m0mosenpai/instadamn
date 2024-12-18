package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.408, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass408 extends C0T6 implements AnonymousClass409 {
    public final Float A00;
    public final Float A01;

    @Override // X.AnonymousClass409
    public final AnonymousClass408 ErY() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass408) {
                AnonymousClass408 anonymousClass408 = (AnonymousClass408) obj;
                if (!C14360o3.A0K(this.A00, anonymousClass408.A00) || !C14360o3.A0K(this.A01, anonymousClass408.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Float f = this.A00;
        int hashCode = (f == null ? 0 : f.hashCode()) * 31;
        Float f2 = this.A01;
        return hashCode + (f2 != null ? f2.hashCode() : 0);
    }

    @Override // X.AnonymousClass409
    public final Float CI1() {
        return this.A00;
    }

    @Override // X.AnonymousClass409
    public final Float CIa() {
        return this.A01;
    }

    @Override // X.AnonymousClass409
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTCTAStickerCustomPositionInfo", AbstractC39794Hl4.A00(this));
    }

    public AnonymousClass408(Float f, Float f2) {
        this.A00 = f;
        this.A01 = f2;
    }
}
