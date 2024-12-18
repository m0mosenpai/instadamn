package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.instagram.api.schemas.ProfileBannerType;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.user.model.User;

/* renamed from: X.Ivy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42760Ivy implements AnonymousClass749 {
    public Drawable A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public final Context A05;
    public final InterfaceC11380iw A06;
    public final UserSession A07;
    public final MWW A08;
    public final C8G6 A09;
    public final AnonymousClass737 A0A;
    public final User A0B;

    @Override // X.AnonymousClass749
    public final void D3R(boolean z) {
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
        return 0L;
    }

    @Override // X.AnonymousClass749
    public final boolean BDo() {
        return false;
    }

    @Override // X.AnonymousClass749
    public final Drawable BEl() {
        return this.A00;
    }

    @Override // X.AnonymousClass749
    public final String BH9() {
        return "impression_music_banner";
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

    public C42760Ivy(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, MWW mww, AnonymousClass737 anonymousClass737, User user) {
        this.A05 = context;
        this.A07 = userSession;
        this.A06 = interfaceC11380iw;
        this.A0B = user;
        this.A08 = mww;
        this.A0A = anonymousClass737;
        int color = context.getColor(AbstractC53242c7.A08(context));
        C8G4 c8g4 = new C8G4(context);
        c8g4.A04 = AbstractC37301Gc2.A0T(context.getResources(), R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size);
        c8g4.A09 = AbstractC37301Gc2.A0T(context.getResources(), R.dimen.account_group_management_clickable_width);
        c8g4.A0B = Integer.valueOf(AbstractC167017dG.A04(context));
        c8g4.A0A = AbstractC25227BEk.A0p();
        c8g4.A08 = Integer.valueOf(color);
        c8g4.A02(context.getResources().getDimensionPixelSize(R.dimen.achievements_only_you_top_margin));
        c8g4.A01(color);
        C8G6 A00 = c8g4.A00();
        this.A09 = A00;
        MusicAssetModel musicAssetModel = mww.A02;
        String str = musicAssetModel.A0E;
        C14360o3.A07(str);
        this.A02 = str;
        this.A01 = ProfileBannerType.A0B.A00;
        this.A00 = A00;
        String str2 = musicAssetModel.A0I;
        C14360o3.A07(str2);
        this.A04 = str2;
        this.A03 = musicAssetModel.A0D;
    }

    @Override // X.AnonymousClass749
    public final int BEo() {
        return R.drawable.instagram_music_pano_outline_24;
    }
}
