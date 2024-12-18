package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;

/* renamed from: X.Wh9, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70796Wh9 implements InterfaceC66482zP {
    public final double A00;
    public final long A01;
    public final ImageUrl A02;
    public final Reel A03;
    public final User A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A05;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C70796Wh9 c70796Wh9 = (C70796Wh9) obj;
        C14360o3.A0B(c70796Wh9, 0);
        if (C14360o3.A0K(this.A04, c70796Wh9.A04) && this.A00 == c70796Wh9.A00 && this.A01 == c70796Wh9.A01 && C14360o3.A0K(this.A02, c70796Wh9.A02) && this.A07 == c70796Wh9.A07 && C14360o3.A0K(this.A03, c70796Wh9.A03) && this.A06 == c70796Wh9.A06) {
            return true;
        }
        return false;
    }

    public C70796Wh9(ImageUrl imageUrl, Reel reel, User user, String str, double d, long j, boolean z, boolean z2) {
        AbstractC167017dG.A1P(str, user);
        C14360o3.A0B(imageUrl, 5);
        this.A05 = str;
        this.A04 = user;
        this.A00 = d;
        this.A01 = j;
        this.A02 = imageUrl;
        this.A07 = z;
        this.A03 = reel;
        this.A06 = z2;
    }
}
