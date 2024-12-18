package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.instagram.api.schemas.ProfileBannerType;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Ivw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42758Ivw implements AnonymousClass749 {
    public long A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public final Context A05;
    public final InterfaceC43571JMf A06;
    public final UserSession A07;
    public final C73E A08;
    public final User A09;

    public C42758Ivw(Context context, InterfaceC43571JMf interfaceC43571JMf, UserSession userSession, C73E c73e, User user) {
        C14360o3.A0B(interfaceC43571JMf, 4);
        this.A05 = context;
        this.A07 = userSession;
        this.A09 = user;
        this.A06 = interfaceC43571JMf;
        this.A08 = c73e;
        this.A02 = interfaceC43571JMf.getFundraiserId();
        this.A01 = ProfileBannerType.A09.A00;
        this.A04 = interfaceC43571JMf.getFundraiserTitle();
        String formattedFundraiserProgressInfoText = interfaceC43571JMf.getFormattedFundraiserProgressInfoText();
        C14360o3.A0B(formattedFundraiserProgressInfoText, 0);
        this.A03 = formattedFundraiserProgressInfoText;
        this.A00 = interfaceC43571JMf.getEndTime();
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
        return "impression_fundraiser_banner";
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
        C73E c73e = this.A08;
        InterfaceC43571JMf interfaceC43571JMf = this.A06;
        c73e.DIk(interfaceC43571JMf.getFundraiserId(), interfaceC43571JMf.getOwnerUsername(), interfaceC43571JMf.getCanViewerDonate(), "USER_PROFILE");
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
        return R.drawable.instagram_donations_outline_16;
    }
}
