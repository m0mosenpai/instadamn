package X;

import com.instagram.direct.groupinvites.models.InviteLinkShareInfo;

/* renamed from: X.EbX, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32767EbX extends FKR {
    public final InviteLinkShareInfo A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32767EbX) {
                C32767EbX c32767EbX = (C32767EbX) obj;
                if (!C14360o3.A0K(this.A01, c32767EbX.A01) || !C14360o3.A0K(this.A00, c32767EbX.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public C32767EbX(InviteLinkShareInfo inviteLinkShareInfo, String str) {
        super(C2EY.A0T, str);
        this.A01 = str;
        this.A00 = inviteLinkShareInfo;
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0O(this.A01) * 31) + AbstractC166997dE.A0I(this.A00);
    }
}
