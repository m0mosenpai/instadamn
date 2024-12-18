package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.OJb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54785OJb {
    public int A00 = -1;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;

    public final C1ON A00(UserSession userSession) {
        String str;
        String str2 = this.A04;
        if (str2 != null) {
            String str3 = this.A01;
            if (str3 != null) {
                String str4 = this.A02;
                if (str4 != null) {
                    return AbstractC54226Ny5.A00(userSession, null, str2, str3, str4, this.A03, this.A05, this.A06, this.A00);
                }
                str = "containerModule";
            } else {
                str = "action";
            }
        } else {
            str = "mediaId";
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
