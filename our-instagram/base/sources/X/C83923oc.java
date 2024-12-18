package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.3oc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C83923oc extends C0T6 implements InterfaceC83933od {
    public final Boolean A00;
    public final Boolean A01;
    public final Integer A02;
    public final String A03;

    @Override // X.InterfaceC83933od
    public final C83923oc Erv() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C83923oc) {
                C83923oc c83923oc = (C83923oc) obj;
                if (!C14360o3.A0K(this.A03, c83923oc.A03) || !C14360o3.A0K(this.A02, c83923oc.A02) || !C14360o3.A0K(this.A00, c83923oc.A00) || !C14360o3.A0K(this.A01, c83923oc.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A03;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.A02;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.A00;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.A01;
        return hashCode3 + (bool2 != null ? bool2.hashCode() : 0);
    }

    @Override // X.InterfaceC83933od
    public final String B4N() {
        return this.A03;
    }

    @Override // X.InterfaceC83933od
    public final Integer B8r() {
        return this.A02;
    }

    @Override // X.InterfaceC83933od
    public final Boolean BwF() {
        return this.A00;
    }

    @Override // X.InterfaceC83933od
    public final Boolean CDd() {
        return this.A01;
    }

    @Override // X.InterfaceC83933od
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTClipsDeliveryParameters", AbstractC37383GdP.A00(this));
    }

    public C83923oc(Boolean bool, Boolean bool2, Integer num, String str) {
        this.A03 = str;
        this.A02 = num;
        this.A00 = bool;
        this.A01 = bool2;
    }
}
