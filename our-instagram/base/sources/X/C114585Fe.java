package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.5Fe, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C114585Fe extends C0T6 implements InterfaceC104834np {
    public final Boolean A00;
    public final Integer A01;
    public final Long A02;
    public final String A03;
    public final String A04;

    @Override // X.InterfaceC104834np
    public final C114585Fe EtY() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C114585Fe) {
                C114585Fe c114585Fe = (C114585Fe) obj;
                if (!C14360o3.A0K(this.A01, c114585Fe.A01) || !C14360o3.A0K(this.A02, c114585Fe.A02) || !C14360o3.A0K(this.A00, c114585Fe.A00) || !C14360o3.A0K(this.A03, c114585Fe.A03) || !C14360o3.A0K(this.A04, c114585Fe.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Integer num = this.A01;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Long l = this.A02;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool = this.A00;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.A03;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.A04;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // X.InterfaceC104834np
    public final Integer B21() {
        return this.A01;
    }

    @Override // X.InterfaceC104834np
    public final Long B7T() {
        return this.A02;
    }

    @Override // X.InterfaceC104834np
    public final String Bb3() {
        return this.A03;
    }

    @Override // X.InterfaceC104834np
    public final Boolean CTs() {
        return this.A00;
    }

    @Override // X.InterfaceC104834np
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTFeedEndSceneDict", AbstractC33690Eue.A00(this));
    }

    @Override // X.InterfaceC104834np
    public final String getSubtitle() {
        return this.A04;
    }

    public C114585Fe(Boolean bool, Integer num, Long l, String str, String str2) {
        this.A01 = num;
        this.A02 = l;
        this.A00 = bool;
        this.A03 = str;
        this.A04 = str2;
    }
}
