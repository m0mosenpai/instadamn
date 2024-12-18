package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.H5a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38760H5a extends C0T6 implements InterfaceC43560JLu {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    @Override // X.InterfaceC43560JLu
    public final C38760H5a F0Q() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38760H5a) {
                C38760H5a c38760H5a = (C38760H5a) obj;
                if (!C14360o3.A0K(this.A00, c38760H5a.A00) || !C14360o3.A0K(this.A01, c38760H5a.A01) || !C14360o3.A0K(this.A02, c38760H5a.A02) || !C14360o3.A0K(this.A03, c38760H5a.A03) || !C14360o3.A0K(this.A04, c38760H5a.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC43560JLu
    public final String B4z() {
        return this.A00;
    }

    @Override // X.InterfaceC43560JLu
    public final String B50() {
        return this.A01;
    }

    @Override // X.InterfaceC43560JLu
    public final String B53() {
        return this.A02;
    }

    @Override // X.InterfaceC43560JLu
    public final String B54() {
        return this.A03;
    }

    @Override // X.InterfaceC43560JLu
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTStoryFBTagStickerDict", AbstractC40282Htm.A00(this));
    }

    @Override // X.InterfaceC43560JLu
    public final String getPk() {
        return this.A04;
    }

    public final int hashCode() {
        return (((((((AbstractC167017dG.A0O(this.A00) * 31) + AbstractC167017dG.A0O(this.A01)) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC25227BEk.A07(this.A04);
    }

    public C38760H5a(String str, String str2, String str3, String str4, String str5) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = str4;
        this.A04 = str5;
    }
}
