package X;

import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.instagram.api.schemas.ProfileBannerType;

/* renamed from: X.Cwg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29347Cwg implements AnonymousClass749 {
    public String A00 = ProfileBannerType.A0D.A00;
    public String A01;
    public String A02;
    public final InterfaceC128105qe A03;
    public final C73A A04;

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
    public final String getSubtitle() {
        return null;
    }

    @Override // X.AnonymousClass749
    public final void D3R(boolean z) {
        this.A04.DiS();
    }

    public C29347Cwg(InterfaceC128105qe interfaceC128105qe, C73A c73a) {
        this.A03 = interfaceC128105qe;
        this.A04 = c73a;
        this.A01 = AnonymousClass001.A0O(interfaceC128105qe.Bqd(), interfaceC128105qe.BAH());
        this.A02 = CK7.A00(interfaceC128105qe);
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
        return R.drawable.instagram_cap_pano_outline_16;
    }

    @Override // X.AnonymousClass749
    public final String BH9() {
        return "impression_school_banner";
    }

    @Override // X.AnonymousClass749
    public final String getId() {
        return this.A01;
    }

    @Override // X.AnonymousClass749
    public final String getTitle() {
        return this.A02;
    }
}
