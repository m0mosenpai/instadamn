package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.instagram.api.schemas.ProfileBannerType;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Drg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31436Drg implements AnonymousClass749 {
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public final Context A04;
    public final C44Q A05;
    public final InterfaceC11380iw A06;
    public final UserSession A07;
    public final C73C A08;
    public final User A09;

    public C31436Drg(Context context, C44Q c44q, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C73C c73c, User user) {
        C14360o3.A0B(c44q, 4);
        this.A04 = context;
        this.A07 = userSession;
        this.A09 = user;
        this.A05 = c44q;
        this.A08 = c73c;
        this.A06 = interfaceC11380iw;
        this.A01 = c44q.C7K();
        this.A00 = ProfileBannerType.A06.A00;
        this.A03 = c44q.getTitle();
        this.A02 = AbstractC31437Drh.A01(AbstractC166997dE.A0M(context), c44q.BYF(), false);
    }

    @Override // X.AnonymousClass749
    public final boolean BDo() {
        return false;
    }

    @Override // X.AnonymousClass749
    public final Drawable BEl() {
        return null;
    }

    @Override // X.AnonymousClass749
    public final boolean Bwm() {
        return false;
    }

    @Override // X.AnonymousClass749
    public final boolean CDe() {
        return false;
    }

    @Override // X.AnonymousClass749
    public final void DLA() {
    }

    @Override // X.AnonymousClass749
    public final /* synthetic */ void Der() {
    }

    @Override // X.AnonymousClass749
    public final void D3R(boolean z) {
        this.A08.D2l(this.A05, this.A06, "user_profile_header");
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
    public final int BEo() {
        return R.drawable.instagram_channels_pano_outline_24;
    }

    @Override // X.AnonymousClass749
    public final String BH9() {
        return "impression_channel_banner";
    }

    @Override // X.AnonymousClass749
    public final String getId() {
        return this.A01;
    }

    @Override // X.AnonymousClass749
    public final String getSubtitle() {
        return this.A02;
    }

    @Override // X.AnonymousClass749
    public final String getTitle() {
        return this.A03;
    }
}
