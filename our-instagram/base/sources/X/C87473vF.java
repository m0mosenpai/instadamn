package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.3vF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C87473vF extends C0T6 implements InterfaceC87483vG {
    public final Boolean A00;
    public final String A01;
    public final String A02;

    @Override // X.InterfaceC87483vG
    public final C87473vF Ezc() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C87473vF) {
                C87473vF c87473vF = (C87473vF) obj;
                if (!C14360o3.A0K(this.A01, c87473vF.A01) || !C14360o3.A0K(this.A02, c87473vF.A02) || !C14360o3.A0K(this.A00, c87473vF.A00)) {
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
        Boolean bool = this.A00;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    @Override // X.InterfaceC87483vG
    public final String AYX() {
        return this.A01;
    }

    @Override // X.InterfaceC87483vG
    public final String AYY() {
        return this.A02;
    }

    @Override // X.InterfaceC87483vG
    public final Boolean CVs() {
        return this.A00;
    }

    @Override // X.InterfaceC87483vG
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTSocialContextActionMetadata", BFK.A00(this));
    }

    public C87473vF(Boolean bool, String str, String str2) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = bool;
    }
}
