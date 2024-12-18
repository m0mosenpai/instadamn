package X;

import com.instagram.pendingmedia.model.UserStoryTarget;

/* renamed from: X.MsL, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51690MsL extends C0T6 {
    public final Object A00;
    public final String A01;
    public static final C51690MsL A08 = OP5.A01(UserStoryTarget.A04);
    public static final C51690MsL A09 = OP5.A01(UserStoryTarget.A05);
    public static final C51690MsL A05 = OP5.A01(UserStoryTarget.A02);
    public static final C51690MsL A0A = OP5.A01(UserStoryTarget.A06);
    public static final C51690MsL A0C = OP5.A01(UserStoryTarget.A09);
    public static final C51690MsL A07 = OP5.A01(UserStoryTarget.A03);
    public static final C51690MsL A03 = OP5.A01(UserStoryTarget.A01);
    public static final C51690MsL A0B = OP5.A01(UserStoryTarget.A08);
    public static final C51690MsL A04 = new C51690MsL("blast_candidates", "blast_candidates");
    public static final C51690MsL A06 = new C51690MsL("close_friends_blast", "close_friends_blast");
    public static final C51690MsL A02 = new C51690MsL("direct_thread", "add_to_cowatch");

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51690MsL) {
                C51690MsL c51690MsL = (C51690MsL) obj;
                if (!C14360o3.A0K(this.A01, c51690MsL.A01) || !C14360o3.A0K(this.A00, c51690MsL.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0J(this.A01) + AbstractC167017dG.A0M(this.A00);
    }

    public C51690MsL(String str, Object obj) {
        this.A01 = str;
        this.A00 = obj;
    }
}
