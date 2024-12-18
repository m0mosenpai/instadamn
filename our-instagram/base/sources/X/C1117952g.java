package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.52g, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1117952g extends C0T6 implements InterfaceC1118052h {
    public final String A00;
    public final String A01;
    public final boolean A02;

    public C1117952g(boolean z, String str, String str2) {
        C14360o3.A0B(str2, 3);
        this.A02 = z;
        this.A00 = str;
        this.A01 = str2;
    }

    @Override // X.InterfaceC1118052h
    public final C1117952g Et5() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1117952g) {
                C1117952g c1117952g = (C1117952g) obj;
                if (this.A02 != c1117952g.A02 || !C14360o3.A0K(this.A00, c1117952g.A00) || !C14360o3.A0K(this.A01, c1117952g.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1118052h
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTCutoutStickerUser", AbstractC39896Hmj.A00(this));
    }

    @Override // X.InterfaceC1118052h
    public final String getProfilePicUrl() {
        return this.A00;
    }

    @Override // X.InterfaceC1118052h
    public final String getUsername() {
        return this.A01;
    }

    public final int hashCode() {
        int hashCode;
        int i = 1237;
        if (this.A02) {
            i = 1231;
        }
        int i2 = i * 31;
        String str = this.A00;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return ((i2 + hashCode) * 31) + this.A01.hashCode();
    }

    @Override // X.InterfaceC1118052h
    public final boolean isVerified() {
        return this.A02;
    }
}
