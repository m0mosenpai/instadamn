package X;

import com.instagram.direct.groupinvites.models.InviteLinkShareInfo;

/* renamed from: X.EbP, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32759EbP extends FKR {
    public final InviteLinkShareInfo A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32759EbP) {
                C32759EbP c32759EbP = (C32759EbP) obj;
                if (!C14360o3.A0K(this.A01, c32759EbP.A01) || !C14360o3.A0K(this.A00, c32759EbP.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public C32759EbP(InviteLinkShareInfo inviteLinkShareInfo, String str) {
        super(C2EY.A0S, str);
        this.A01 = str;
        this.A00 = inviteLinkShareInfo;
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0O(this.A01) * 31) + AbstractC166997dE.A0I(this.A00);
    }
}
