package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import com.instagram.api.schemas.ProfileBannerType;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.user.model.User;

/* renamed from: X.Gn4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37962Gn4 implements AnonymousClass749 {
    public int A00;
    public int A01;
    public Drawable A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public final Context A07;
    public final C8G6 A08;
    public final User A09;
    public final InterfaceC11380iw A0A;
    public final UserSession A0B;
    public final MWW A0C;
    public final InterfaceC678133v A0D;
    public final AnonymousClass737 A0E;

    @Override // X.AnonymousClass749
    public final /* synthetic */ void Der() {
    }

    @Override // X.AnonymousClass749
    public final String AZw() {
        return this.A03;
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
        return this.A02;
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
    public final void D3R(boolean z) {
        this.A0E.DUC(this.A0C.A02);
    }

    @Override // X.AnonymousClass749
    public final void DLA() {
        long parseLong;
        EnumC39652Hih enumC39652Hih;
        Long A0k;
        C18920wW A01;
        String str;
        UserSession userSession = this.A0B;
        InterfaceC11380iw interfaceC11380iw = this.A0A;
        InterfaceC678133v interfaceC678133v = this.A0D;
        C37964Gn6 A012 = AbstractC37963Gn5.A01(this.A0C.A02);
        if (interfaceC678133v.isPlaying()) {
            if (interfaceC678133v.isPlaying()) {
                interfaceC678133v.pause();
            }
            parseLong = Long.parseLong(A012.getAudioClusterId());
            enumC39652Hih = EnumC39652Hih.A0s;
            A0k = AbstractC25231BEo.A0k(this.A09);
            A01 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
            str = "instagram_organic_pause_button_tapped";
        } else {
            interfaceC678133v.seekTo(this.A01);
            interfaceC678133v.E4S();
            parseLong = Long.parseLong(A012.getAudioClusterId());
            enumC39652Hih = EnumC39652Hih.A0s;
            A0k = AbstractC25231BEo.A0k(this.A09);
            A01 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
            str = "instagram_organic_play_button_tapped";
        }
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(A01, str);
        if (A0f.isSampled()) {
            AbstractC25229BEm.A1A(A0f, interfaceC11380iw);
            AbstractC37301Gc2.A10(A0f, parseLong);
            AbstractC37300Gc1.A0p(A0f, AbstractC166997dE.A0n());
            AbstractC25225BEi.A1M(enumC39652Hih, A0f);
            A0f.A9K("profile_user_ig_id", A0k);
            A0f.Cht();
        }
    }

    @Override // X.AnonymousClass749
    public final String getId() {
        return this.A04;
    }

    @Override // X.AnonymousClass749
    public final String getSubtitle() {
        return this.A05;
    }

    @Override // X.AnonymousClass749
    public final String getTitle() {
        return this.A06;
    }

    public C37962Gn4(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, MWW mww, InterfaceC678133v interfaceC678133v, AnonymousClass737 anonymousClass737, User user) {
        this.A07 = context;
        this.A0B = userSession;
        this.A0A = interfaceC11380iw;
        this.A09 = user;
        this.A0D = interfaceC678133v;
        this.A0C = mww;
        this.A0E = anonymousClass737;
        int color = context.getColor(AbstractC53242c7.A08(context));
        C8G4 c8g4 = new C8G4(context);
        c8g4.A04 = AbstractC37301Gc2.A0T(context.getResources(), R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size);
        c8g4.A06 = Integer.valueOf(context.getColor(AbstractC53242c7.A08(context)));
        c8g4.A0C = Integer.valueOf(context.getColor(AbstractC53242c7.A04(context)));
        c8g4.A08 = Integer.valueOf(color);
        c8g4.A09 = AbstractC37301Gc2.A0T(context.getResources(), R.dimen.account_group_management_clickable_width);
        c8g4.A0B = Integer.valueOf(AbstractC167017dG.A04(context));
        c8g4.A0A = 0;
        c8g4.A02(context.getResources().getDimensionPixelSize(R.dimen.achievements_only_you_top_margin));
        c8g4.A01(color);
        C8G6 A00 = c8g4.A00();
        this.A08 = A00;
        MusicAssetModel musicAssetModel = mww.A02;
        String str = musicAssetModel.A0E;
        C14360o3.A07(str);
        this.A04 = str;
        this.A03 = ProfileBannerType.A0B.A00;
        this.A02 = A00;
        String str2 = musicAssetModel.A0I;
        C14360o3.A07(str2);
        this.A06 = str2;
        this.A05 = musicAssetModel.A0D;
        this.A01 = mww.A01;
        int i = mww.A00;
        int i2 = musicAssetModel.A00;
        this.A00 = i > i2 ? i2 : i;
        interfaceC678133v.ESz(AbstractC37963Gn5.A01(musicAssetModel).BVb(), new JZP(interfaceC678133v, this), mww.A03, 0, -1, -1, false, false);
        if (interfaceC678133v.isPlaying()) {
            A00.A01(C8G5.A05);
            A00.A00((interfaceC678133v.getCurrentPositionMs() - this.A01) / this.A00);
        }
    }

    @Override // X.AnonymousClass749
    public final int BEo() {
        return R.drawable.instagram_music_pano_outline_24;
    }
}
