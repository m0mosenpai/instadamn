package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.TextEntityType;

/* renamed from: X.H6j, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38794H6j extends C0T6 implements InterfaceC43543JLd {
    public final TextEntityType A00;
    public final String A01;
    public final String A02;
    public final String A03;

    @Override // X.InterfaceC43543JLd
    public final C38794H6j F36() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38794H6j) {
                C38794H6j c38794H6j = (C38794H6j) obj;
                if (!C14360o3.A0K(this.A01, c38794H6j.A01) || this.A00 != c38794H6j.A00 || !C14360o3.A0K(this.A02, c38794H6j.A02) || !C14360o3.A0K(this.A03, c38794H6j.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC43543JLd
    public final String Ayb() {
        return this.A01;
    }

    @Override // X.InterfaceC43543JLd
    public final TextEntityType B2K() {
        return this.A00;
    }

    @Override // X.InterfaceC43543JLd
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTTextEntity", AbstractC40401Hvo.A00(this));
    }

    @Override // X.InterfaceC43543JLd
    public final String getId() {
        return this.A02;
    }

    @Override // X.InterfaceC43543JLd
    public final String getUrl() {
        return this.A03;
    }

    public final int hashCode() {
        return ((AbstractC166997dE.A0J(this.A00, AbstractC166987dD.A0J(this.A01)) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC25227BEk.A07(this.A03);
    }

    public C38794H6j(TextEntityType textEntityType, String str, String str2, String str3) {
        AbstractC167017dG.A1P(str, textEntityType);
        this.A01 = str;
        this.A00 = textEntityType;
        this.A02 = str2;
        this.A03 = str3;
    }
}
