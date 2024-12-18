package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.instagram.api.schemas.ProfileBannerType;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.UpcomingEvent;
import com.instagram.user.model.User;

/* renamed from: X.Ivx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42759Ivx implements AnonymousClass749 {
    public long A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public final Context A05;
    public final UserSession A06;
    public final C73H A07;
    public final UpcomingEvent A08;
    public final User A09;

    public C42759Ivx(Context context, UserSession userSession, C73H c73h, UpcomingEvent upcomingEvent, User user) {
        long startTime;
        C14360o3.A0B(upcomingEvent, 4);
        this.A05 = context;
        this.A06 = userSession;
        this.A09 = user;
        this.A08 = upcomingEvent;
        this.A07 = c73h;
        this.A02 = upcomingEvent.getId();
        this.A01 = ProfileBannerType.A0G.A00;
        this.A04 = upcomingEvent.getTitle();
        this.A03 = AbstractC54244NyP.A00(userSession, C13920nI.A00, upcomingEvent).A00(context, EnumC53260Ngy.A0D);
        Long B24 = upcomingEvent.B24();
        if (B24 != null) {
            startTime = B24.longValue();
        } else {
            startTime = upcomingEvent.getStartTime();
        }
        this.A00 = startTime;
    }

    @Override // X.AnonymousClass749
    public final void DLA() {
    }

    @Override // X.AnonymousClass749
    public final /* synthetic */ void Der() {
    }

    @Override // X.AnonymousClass749
    public final String AZw() {
        return this.A01;
    }

    @Override // X.AnonymousClass749
    public final long B37() {
        return this.A00;
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
    public final String BH9() {
        return "impression_upcoming_event_banner";
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
    public final void D3R(boolean z) {
        this.A07.Dwu(this.A08, this.A09);
    }

    @Override // X.AnonymousClass749
    public final String getId() {
        return this.A02;
    }

    @Override // X.AnonymousClass749
    public final String getSubtitle() {
        return this.A03;
    }

    @Override // X.AnonymousClass749
    public final String getTitle() {
        return this.A04;
    }

    @Override // X.AnonymousClass749
    public final int BEo() {
        return R.drawable.instagram_calendar_pano_outline_16;
    }
}
