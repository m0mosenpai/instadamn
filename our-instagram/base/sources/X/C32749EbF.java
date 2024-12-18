package X;

import com.instagram.model.direct.gifs.DirectAnimatedMedia;

/* renamed from: X.EbF, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32749EbF extends FKR {
    public final DirectAnimatedMedia A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32749EbF) {
                C32749EbF c32749EbF = (C32749EbF) obj;
                if (!C14360o3.A0K(this.A01, c32749EbF.A01) || !C14360o3.A0K(this.A00, c32749EbF.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public C32749EbF(DirectAnimatedMedia directAnimatedMedia, String str) {
        super(C2EY.A0K, str);
        this.A01 = str;
        this.A00 = directAnimatedMedia;
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0O(this.A01) * 31) + AbstractC166997dE.A0I(this.A00);
    }
}
