package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;

/* renamed from: X.6tu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C152676tu implements InterfaceC152636tq {
    public final C3G4 A00;
    public final Boolean A01;
    public final Boolean A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;
    public final boolean A08;
    public final UserSession A09;

    public C152676tu(UserSession userSession, C3G4 c3g4, boolean z) {
        String str;
        C14360o3.A0B(c3g4, 1);
        C14360o3.A0B(userSession, 3);
        this.A00 = c3g4;
        this.A08 = z;
        this.A09 = userSession;
        Reel reel = c3g4.A03;
        String str2 = reel.A1o;
        C14360o3.A07(str2);
        this.A05 = str2;
        this.A06 = reel.A0r;
        ImageUrl A07 = reel.A07();
        if (A07 != null) {
            str = A07.getUrl();
        } else {
            str = null;
        }
        this.A03 = str;
        SimpleImageUrl A08 = reel.A08();
        this.A04 = A08 != null ? A08.getUrl() : null;
        this.A01 = Boolean.valueOf(c3g4.A04(userSession));
        this.A07 = c3g4.A00 != null;
        User A0D = reel.A0D();
        this.A02 = Boolean.valueOf(A0D != null && A0D.A2G());
    }
}
