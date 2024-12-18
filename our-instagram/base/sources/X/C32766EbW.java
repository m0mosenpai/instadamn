package X;

import com.instagram.model.direct.DirectRoomsXma;

/* renamed from: X.EbW, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32766EbW extends FKR {
    public final DirectRoomsXma A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32766EbW) {
                C32766EbW c32766EbW = (C32766EbW) obj;
                if (!C14360o3.A0K(this.A01, c32766EbW.A01) || !C14360o3.A0K(this.A00, c32766EbW.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public C32766EbW(DirectRoomsXma directRoomsXma, String str) {
        super(C2EY.A1X, str);
        this.A01 = str;
        this.A00 = directRoomsXma;
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0O(this.A01) * 31) + AbstractC166997dE.A0I(this.A00);
    }
}
