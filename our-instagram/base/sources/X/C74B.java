package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.instagram.aistudio.profile.model.AiStudioProfileBannerPersonaModel;
import com.instagram.api.schemas.ProfileBannerType;

/* renamed from: X.74B, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C74B implements AnonymousClass749 {
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public final AiStudioProfileBannerPersonaModel A04;
    public final C73B A05;

    public C74B(Context context, AiStudioProfileBannerPersonaModel aiStudioProfileBannerPersonaModel, C73B c73b) {
        C14360o3.A0B(aiStudioProfileBannerPersonaModel, 2);
        this.A04 = aiStudioProfileBannerPersonaModel;
        this.A05 = c73b;
        this.A01 = aiStudioProfileBannerPersonaModel.A00;
        this.A00 = ProfileBannerType.A05.A00;
        this.A03 = aiStudioProfileBannerPersonaModel.A01;
        this.A02 = context.getString(2131952728);
    }

    @Override // X.AnonymousClass749
    public final void DLA() {
    }

    @Override // X.AnonymousClass749
    public final /* synthetic */ void Der() {
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
        return false;
    }

    @Override // X.AnonymousClass749
    public final Drawable BEl() {
        return null;
    }

    @Override // X.AnonymousClass749
    public final String BH9() {
        return "impression_aistudio_banner";
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
        C73B c73b = this.A05;
        AiStudioProfileBannerPersonaModel aiStudioProfileBannerPersonaModel = this.A04;
        c73b.Cw8(aiStudioProfileBannerPersonaModel.A00, z, aiStudioProfileBannerPersonaModel.A02);
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

    @Override // X.AnonymousClass749
    public final int BEo() {
        return R.drawable.instagram_gen_ai_pano_outline_24;
    }
}
