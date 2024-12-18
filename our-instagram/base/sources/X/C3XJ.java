package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.3XJ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3XJ extends C0T6 implements C3XK {
    public final int A00;
    public final Integer A01;

    @Override // X.C3XK
    public final C3XJ EtW() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3XJ) {
                C3XJ c3xj = (C3XJ) obj;
                if (this.A00 != c3xj.A00 || !C14360o3.A0K(this.A01, c3xj.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.A00 * 31;
        Integer num = this.A01;
        return i + (num == null ? 0 : num.hashCode());
    }

    @Override // X.C3XK
    public final int B8q() {
        return this.A00;
    }

    @Override // X.C3XK
    public final Integer BlL() {
        return this.A01;
    }

    @Override // X.C3XK
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTFeedDeliveryParameters", AbstractC37358Gd0.A00(this));
    }

    public C3XJ(int i, Integer num) {
        this.A00 = i;
        this.A01 = num;
    }
}
