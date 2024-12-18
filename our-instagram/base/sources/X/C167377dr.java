package X;

import com.instagram.api.schemas.MediaType;
import com.instagram.avatars.common.AvatarInfo;
import com.instagram.common.session.UserSession;

/* renamed from: X.7dr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C167377dr extends AbstractC52922bZ {
    public final C167417dv A00;
    public final C167397dt A01;
    public final UserSession A02;
    public final C05A A03;
    public final C05A A04;
    public final C05A A05;

    public final void A00(C148286ly c148286ly, boolean z) {
        Integer num;
        String str;
        String str2;
        MediaType mediaType;
        C14360o3.A0B(c148286ly, 0);
        this.A01.A02.A01.A01();
        C05A c05a = this.A05;
        if (z) {
            num = C05F.A00;
        } else {
            num = C05F.A01;
        }
        AvatarInfo avatarInfo = c148286ly.A0G;
        String str3 = null;
        if (avatarInfo != null) {
            str3 = avatarInfo.A00;
            str = avatarInfo.A01;
            str2 = avatarInfo.A02;
        } else {
            str = null;
            str2 = null;
        }
        String str4 = c148286ly.A0S;
        String str5 = c148286ly.A0a;
        if (c148286ly.A04() == C05F.A0N) {
            mediaType = MediaType.A04;
        } else {
            mediaType = MediaType.A05;
        }
        c05a.Egh(new C215199fv(new C115925Mi(mediaType, num, str3, str, str2, str4, str5, c148286ly.A0H.getUrl())));
    }

    public /* synthetic */ C167377dr(UserSession userSession) {
        C167397dt c167397dt = new C167397dt(userSession);
        C167417dv c167417dv = new C167417dv(userSession);
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        this.A01 = c167397dt;
        this.A00 = c167417dv;
        this.A05 = C10E.A00(C167427dw.A00);
        this.A04 = C10E.A00(C167447dy.A00);
        this.A03 = C10E.A00(C167457dz.A00);
    }
}
