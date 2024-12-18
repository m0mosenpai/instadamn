package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.instagram.api.schemas.ProfileBannerType;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class GBS implements AnonymousClass749 {
    public String A00;
    public String A01 = ProfileBannerType.A0E.A00;
    public String A02;
    public String A03;
    public final C73G A04;

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
        this.A04.Dst();
    }

    public GBS(Context context, UserSession userSession, C73G c73g, Integer num, String str, boolean z) {
        this.A04 = c73g;
        this.A02 = str;
        this.A03 = str;
        if (!z && num != null && num.intValue() > 0 && C151366re.A06(userSession)) {
            this.A00 = AbstractC167007dF.A0f(context, num, 2131970161);
        }
    }

    @Override // X.AnonymousClass749
    public final String AZw() {
        return this.A01;
    }

    @Override // X.AnonymousClass749
    public final long B37() {
        return 0L;
    }

    @Override // X.AnonymousClass749
    public final int BEo() {
        return R.drawable.instagram_app_threads_pano_outline_24;
    }

    @Override // X.AnonymousClass749
    public final String BH9() {
        return "impression_threads_banner";
    }

    @Override // X.AnonymousClass749
    public final String getId() {
        return this.A02;
    }

    @Override // X.AnonymousClass749
    public final String getSubtitle() {
        return this.A00;
    }

    @Override // X.AnonymousClass749
    public final String getTitle() {
        return this.A03;
    }
}
