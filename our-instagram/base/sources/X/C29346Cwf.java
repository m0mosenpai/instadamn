package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.instagram.api.schemas.ProfileBannerType;

/* renamed from: X.Cwf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29346Cwf implements AnonymousClass749 {
    public String A00 = ProfileBannerType.A0D.A00;
    public String A01;
    public final Context A02;
    public final C73A A03;

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
        return true;
    }

    @Override // X.AnonymousClass749
    public final void DLA() {
    }

    @Override // X.AnonymousClass749
    public final /* synthetic */ void Der() {
    }

    @Override // X.AnonymousClass749
    public final String getSubtitle() {
        return null;
    }

    @Override // X.AnonymousClass749
    public final void D3R(boolean z) {
        this.A03.CvZ();
    }

    public C29346Cwf(Context context, C73A c73a) {
        this.A02 = context;
        this.A03 = c73a;
        this.A01 = AbstractC166997dE.A0p(context, 2131968968);
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
        return R.drawable.instagram_add_pano_filled_24;
    }

    @Override // X.AnonymousClass749
    public final String BH9() {
        return "impression_add_school_banner";
    }

    @Override // X.AnonymousClass749
    public final String getId() {
        return "add_school_banner";
    }

    @Override // X.AnonymousClass749
    public final String getTitle() {
        return this.A01;
    }
}
