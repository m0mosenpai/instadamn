package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.instagram.api.schemas.ProfileBannerType;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.74C, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C74C implements AnonymousClass749 {
    public String A00;
    public String A01;
    public String A02;
    public final Context A03;
    public final C43H A04;
    public final UserSession A05;
    public final User A06;
    public final AnonymousClass739 A07;

    @Override // X.AnonymousClass749
    public final void DLA() {
    }

    @Override // X.AnonymousClass749
    public final String AZw() {
        return this.A00;
    }

    @Override // X.AnonymousClass749
    public final long B37() {
        return 0L;
    }

    @Override // X.AnonymousClass749
    public final boolean BDo() {
        return true;
    }

    @Override // X.AnonymousClass749
    public final Drawable BEl() {
        return null;
    }

    @Override // X.AnonymousClass749
    public final String BH9() {
        return "impression_facebook_profile_banner";
    }

    @Override // X.AnonymousClass749
    public final boolean Bwm() {
        return true;
    }

    @Override // X.AnonymousClass749
    public final boolean CDe() {
        return false;
    }

    @Override // X.AnonymousClass749
    public final void D3R(boolean z) {
        this.A07.DFa(z);
    }

    @Override // X.AnonymousClass749
    public final void Der() {
        this.A07.Df5();
    }

    @Override // X.AnonymousClass749
    public final String getId() {
        return this.A01;
    }

    @Override // X.AnonymousClass749
    public final String getSubtitle() {
        return "Facebook";
    }

    @Override // X.AnonymousClass749
    public final String getTitle() {
        return this.A02;
    }

    public C74C(Context context, C43H c43h, UserSession userSession, AnonymousClass739 anonymousClass739, User user) {
        C43H c43h2;
        String name;
        String id;
        this.A03 = context;
        this.A05 = userSession;
        this.A04 = c43h;
        this.A06 = user;
        this.A07 = anonymousClass739;
        this.A01 = (c43h == null || (id = c43h.getId()) == null) ? "facebook_profile" : id;
        this.A00 = ProfileBannerType.A08.A00;
        String string = this.A03.getString(2131970201);
        C14360o3.A07(string);
        UserSession userSession2 = this.A05;
        C14360o3.A0B(userSession2, 0);
        if (!C18U.A06(C06090Tz.A05, userSession2, 36320090292363314L) && (c43h2 = this.A04) != null && (name = c43h2.getName()) != null) {
            string = name;
        }
        this.A02 = string;
    }

    @Override // X.AnonymousClass749
    public final int BEo() {
        return R.drawable.instagram_facebook_circle_pano_outline_24;
    }
}
