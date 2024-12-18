package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

/* renamed from: X.Beq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26002Beq extends C0T6 {
    public final ImageUrl A00;
    public final Reel A01;
    public final FollowStatus A02;
    public final User A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public C26002Beq(ImageUrl imageUrl, Reel reel, FollowStatus followStatus, User user, String str, String str2, String str3) {
        C14360o3.A0B(followStatus, 5);
        this.A00 = imageUrl;
        this.A05 = str;
        this.A06 = str2;
        this.A04 = str3;
        this.A02 = followStatus;
        this.A03 = user;
        this.A01 = reel;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26002Beq) {
                C26002Beq c26002Beq = (C26002Beq) obj;
                if (!C14360o3.A0K(this.A00, c26002Beq.A00) || !C14360o3.A0K(this.A05, c26002Beq.A05) || !C14360o3.A0K(this.A06, c26002Beq.A06) || !C14360o3.A0K(this.A04, c26002Beq.A04) || this.A02 != c26002Beq.A02 || !C14360o3.A0K(this.A03, c26002Beq.A03) || !C14360o3.A0K(this.A01, c26002Beq.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A03, AbstractC166997dE.A0J(this.A02, (((AbstractC166997dE.A0K(this.A05, AbstractC166987dD.A0G(this.A00)) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31)) + AbstractC166997dE.A0I(this.A01);
    }
}
