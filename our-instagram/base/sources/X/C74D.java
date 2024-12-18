package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.instagram.api.schemas.ProfileBannerType;
import com.instagram.user.model.User;

/* renamed from: X.74D, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C74D implements AnonymousClass749 {
    public String A00;
    public String A01;
    public String A02;
    public final Context A03;
    public final InterfaceC110324y3 A04;
    public final User A05;
    public final AnonymousClass738 A06;

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
        return "impression_facebook_page_banner";
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
        this.A06.DFZ(this.A05, z);
    }

    @Override // X.AnonymousClass749
    public final void Der() {
        this.A06.Df4();
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

    public C74D(Context context, InterfaceC110324y3 interfaceC110324y3, AnonymousClass738 anonymousClass738, User user) {
        String string;
        String id;
        this.A03 = context;
        this.A04 = interfaceC110324y3;
        this.A05 = user;
        this.A06 = anonymousClass738;
        this.A01 = (interfaceC110324y3 == null || (id = interfaceC110324y3.getId()) == null) ? "facebook_page" : id;
        this.A00 = ProfileBannerType.A07.A00;
        InterfaceC110324y3 interfaceC110324y32 = this.A04;
        if (interfaceC110324y32 == null || (string = interfaceC110324y32.getName()) == null) {
            string = this.A03.getString(2131970200);
            C14360o3.A07(string);
        }
        this.A02 = string;
    }

    @Override // X.AnonymousClass749
    public final int BEo() {
        return R.drawable.instagram_facebook_circle_pano_outline_24;
    }
}
