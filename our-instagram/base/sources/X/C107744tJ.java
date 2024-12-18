package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.4tJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C107744tJ extends C0T6 implements InterfaceC107754tK {
    public final String A00;
    public final String A01;
    public final String A02;

    @Override // X.InterfaceC107754tK
    public final C107744tJ Eu9() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C107744tJ) {
                C107744tJ c107744tJ = (C107744tJ) obj;
                if (!C14360o3.A0K(this.A00, c107744tJ.A00) || !C14360o3.A0K(this.A01, c107744tJ.A01) || !C14360o3.A0K(this.A02, c107744tJ.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A00;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.A01;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A02;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // X.InterfaceC107754tK
    public final String BlW() {
        return this.A01;
    }

    @Override // X.InterfaceC107754tK
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTHighlightsAttributionDict", BFM.A00(this));
    }

    @Override // X.InterfaceC107754tK
    public final String getMediaId() {
        return this.A00;
    }

    @Override // X.InterfaceC107754tK
    public final String getTitle() {
        return this.A02;
    }

    public C107744tJ(String str, String str2, String str3) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
    }
}
