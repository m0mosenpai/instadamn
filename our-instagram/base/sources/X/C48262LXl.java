package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.List;

/* renamed from: X.LXl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48262LXl implements InterfaceC11380iw, C7QC {
    public static final String __redex_internal_original_name = "MusicStickerContentDefinition";
    public final UserSession A00;
    public final InterfaceC50515MRs A01;
    public final C162907Rb A02;
    public final boolean A03;

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ C7QD ANU(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        C44786Js7 c44786Js7 = new C44786Js7(AbstractC25227BEk.A0D(layoutInflater, viewGroup, R.layout.igd_music_sticker_layout, false));
        this.A02.A00(c44786Js7);
        return c44786Js7;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void ADy(C7QD c7qd, InterfaceC129555tK interfaceC129555tK) {
        Drawable drawable;
        C44786Js7 c44786Js7 = (C44786Js7) c7qd;
        C45896KSz c45896KSz = (C45896KSz) interfaceC129555tK;
        boolean A1a = AbstractC167017dG.A1a(c44786Js7, c45896KSz);
        C7QY c7qy = c45896KSz.A00;
        AbstractC1583778x abstractC1583778x = c7qy.A0F;
        if (abstractC1583778x instanceof C158737Aj) {
            IgImageView igImageView = c44786Js7.A05;
            ImageUrl imageUrl = ((C158737Aj) abstractC1583778x).A00;
            igImageView.setUrl(imageUrl, this);
            UserSession userSession = this.A00;
            IgImageView igImageView2 = c44786Js7.A07;
            AbstractC167007dF.A1D(igImageView2, A1a ? 1 : 0, imageUrl);
            Drawable drawable2 = igImageView2.getDrawable();
            if (!(drawable2 instanceof C9SH) || !C14360o3.A0K(((C9SH) drawable2).A0E, imageUrl)) {
                igImageView2.setImageDrawable(new C9SH(AbstractC166997dE.A0L(igImageView2), userSession, imageUrl, C05F.A01, "", "", 0.0f, -1, false, false));
            }
        }
        IgImageView igImageView3 = c44786Js7.A06;
        C14360o3.A0B(igImageView3, 0);
        if (!(igImageView3.getDrawable() instanceof C8G6)) {
            Context context = igImageView3.getContext();
            C14360o3.A0A(context);
            C8G4 c8g4 = new C8G4(context);
            c8g4.A06 = 0;
            c8g4.A0C = 0;
            c8g4.A01 = context.getDrawable(R.drawable.instagram_pause_pano_filled_24);
            c8g4.A02(AbstractC167017dG.A03(context));
            c8g4.A01(-1);
            igImageView3.setImageDrawable(c8g4.A00());
        }
        IgTextView igTextView = c44786Js7.A04;
        igTextView.setText(c7qy.A0a);
        IgTextView igTextView2 = c44786Js7.A03;
        igTextView2.setText(c7qy.A0Z);
        this.A02.A02(c44786Js7, c45896KSz);
        this.A01.E0d(c44786Js7, c7qy.A0L);
        ViewGroup viewGroup = c44786Js7.A01;
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        Resources resources = viewGroup.getResources();
        boolean z = this.A03;
        int i = R.dimen.alert_dialog_width;
        if (z) {
            i = R.dimen.challenge_winner_v2_2_winners_submission_width;
        }
        layoutParams.width = resources.getDimensionPixelSize(i);
        int i2 = R.dimen.asset_picker_video_sticker_width;
        if (z) {
            i2 = R.dimen.canvas_colour_wheel_offset_y;
        }
        AbstractC31172DnG.A1F(resources, layoutParams, i2);
        viewGroup.setLayoutParams(layoutParams);
        IgImageView igImageView4 = c44786Js7.A07;
        ViewGroup.LayoutParams layoutParams2 = igImageView4.getLayoutParams();
        int i3 = R.dimen.asset_picker_video_sticker_width;
        if (z) {
            i3 = R.dimen.canvas_colour_wheel_offset_y;
        }
        layoutParams2.width = resources.getDimensionPixelSize(i3);
        int i4 = R.dimen.asset_picker_video_sticker_width;
        if (z) {
            i4 = R.dimen.canvas_colour_wheel_offset_y;
        }
        AbstractC31172DnG.A1F(resources, layoutParams2, i4);
        igImageView4.setLayoutParams(layoutParams2);
        ViewGroup viewGroup2 = c44786Js7.A02;
        ViewGroup.LayoutParams layoutParams3 = viewGroup2.getLayoutParams();
        int i5 = R.dimen.asset_picker_video_sticker_width;
        if (z) {
            i5 = R.dimen.canvas_colour_wheel_offset_y;
        }
        layoutParams3.width = resources.getDimensionPixelSize(i5);
        int i6 = R.dimen.asset_picker_video_sticker_width;
        if (z) {
            i6 = R.dimen.canvas_colour_wheel_offset_y;
        }
        AbstractC31172DnG.A1F(resources, layoutParams3, i6);
        viewGroup2.setLayoutParams(layoutParams3);
        if (z) {
            drawable = viewGroup.getContext().getDrawable(R.drawable.music_sticker_foreground_fade);
        } else {
            drawable = null;
        }
        viewGroup.setForeground(drawable);
        int i7 = 8;
        igTextView.setVisibility(AbstractC31175DnJ.A01(z ? 1 : 0));
        igTextView2.setVisibility(AbstractC31175DnJ.A01(z ? 1 : 0));
        if (!z) {
            i7 = 0;
        }
        igImageView3.setVisibility(i7);
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void F91(C7QD c7qd) {
        C44786Js7 c44786Js7 = (C44786Js7) c7qd;
        C14360o3.A0B(c44786Js7, 0);
        this.A02.A01(c44786Js7);
        this.A01.E0e(c44786Js7);
    }

    public C48262LXl(UserSession userSession, InterfaceC50515MRs interfaceC50515MRs, List list, boolean z) {
        this.A00 = userSession;
        this.A01 = interfaceC50515MRs;
        this.A03 = z;
        this.A02 = new C162907Rb(list);
    }
}
