package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.TextPostAppSuggestionCardProfileContextIdentifier;

/* renamed from: X.53n, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1119853n extends C0T6 implements InterfaceC1119953o {
    public final TextPostAppSuggestionCardProfileContextIdentifier A00;
    public final String A01;

    public C1119853n(TextPostAppSuggestionCardProfileContextIdentifier textPostAppSuggestionCardProfileContextIdentifier, String str) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(textPostAppSuggestionCardProfileContextIdentifier, 2);
        this.A01 = str;
        this.A00 = textPostAppSuggestionCardProfileContextIdentifier;
    }

    @Override // X.InterfaceC1119953o
    public final C1119853n F3A() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1119853n) {
                C1119853n c1119853n = (C1119853n) obj;
                if (!C14360o3.A0K(this.A01, c1119853n.A01) || this.A00 != c1119853n.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A01.hashCode() * 31) + this.A00.hashCode();
    }

    @Override // X.InterfaceC1119953o
    public final String Aya() {
        return this.A01;
    }

    @Override // X.InterfaceC1119953o
    public final TextPostAppSuggestionCardProfileContextIdentifier BFD() {
        return this.A00;
    }

    @Override // X.InterfaceC1119953o
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTTextPostAppSuggestionCardProfileContext", AbstractC27531CDb.A00(this));
    }
}
