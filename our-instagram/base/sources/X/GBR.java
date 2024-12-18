package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.instagram.api.schemas.ProfileBannerType;

/* loaded from: classes6.dex */
public final class GBR implements AnonymousClass749 {
    public String A00 = ProfileBannerType.A0H.A00;
    public String A01;
    public final Context A02;

    @Override // X.AnonymousClass749
    public final boolean BDo() {
        return true;
    }

    @Override // X.AnonymousClass749
    public final Drawable BEl() {
        return null;
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
    }

    @Override // X.AnonymousClass749
    public final void DLA() {
    }

    @Override // X.AnonymousClass749
    public final void Der() {
    }

    public GBR(Context context) {
        this.A02 = context;
        this.A01 = AbstractC166997dE.A0p(context, 2131970210);
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
        return R.drawable.instagram_app_whatsapp_pano_outline_24;
    }

    @Override // X.AnonymousClass749
    public final String BH9() {
        return "impression_whatsapp_profile_banner";
    }

    @Override // X.AnonymousClass749
    public final String getId() {
        return "whatsapp_profile";
    }

    @Override // X.AnonymousClass749
    public final String getSubtitle() {
        return "Whatsapp";
    }

    @Override // X.AnonymousClass749
    public final String getTitle() {
        return this.A01;
    }
}
