package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.5F5, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5F5 extends C0T6 implements C5F6 {
    public final Integer A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    @Override // X.C5F6
    public final C5F5 EtL() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C5F5) {
                C5F5 c5f5 = (C5F5) obj;
                if (!C14360o3.A0K(this.A01, c5f5.A01) || !C14360o3.A0K(this.A02, c5f5.A02) || !C14360o3.A0K(this.A03, c5f5.A03) || !C14360o3.A0K(this.A04, c5f5.A04) || !C14360o3.A0K(this.A00, c5f5.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A01;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.A02;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A03;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.A04;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.A00;
        return hashCode4 + (num != null ? num.hashCode() : 0);
    }

    @Override // X.C5F6
    public final String Aqb() {
        return this.A01;
    }

    @Override // X.C5F6
    public final String Btv() {
        return this.A02;
    }

    @Override // X.C5F6
    public final String Btw() {
        return this.A03;
    }

    @Override // X.C5F6
    public final String C0x() {
        return this.A04;
    }

    @Override // X.C5F6
    public final Integer C0y() {
        return this.A00;
    }

    @Override // X.C5F6
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTFBPageCallToActionIXLabelBundle", AbstractC39913Hn1.A00(this));
    }

    public C5F5(Integer num, String str, String str2, String str3, String str4) {
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = str4;
        this.A00 = num;
    }
}
