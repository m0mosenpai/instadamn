package X;

import com.instagram.save.model.SavedCollection;

/* renamed from: X.EbJ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32753EbJ extends FKR {
    public final SavedCollection A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32753EbJ) {
                C32753EbJ c32753EbJ = (C32753EbJ) obj;
                if (!C14360o3.A0K(this.A01, c32753EbJ.A01) || !C14360o3.A0K(this.A00, c32753EbJ.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public C32753EbJ(SavedCollection savedCollection, String str) {
        super(C2EY.A0a, str);
        this.A01 = str;
        this.A00 = savedCollection;
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0O(this.A01) * 31) + AbstractC166997dE.A0I(this.A00);
    }
}
