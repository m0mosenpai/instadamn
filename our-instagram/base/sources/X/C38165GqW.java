package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.GqW, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38165GqW {
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0007. Please report as an issue. */
    public final C38166GqX A00(Context context, EnumC132885zD enumC132885zD, EnumC132895zE enumC132895zE, boolean z) {
        int i;
        int i2;
        C56302iJ c56302iJ;
        C56302iJ c56302iJ2;
        C56302iJ c56302iJ3;
        C56302iJ c56302iJ4;
        C56302iJ c56302iJ5;
        int i3;
        C56302iJ c56302iJ6;
        C56302iJ c56302iJ7;
        C56302iJ c56302iJ8;
        int i4;
        int i5;
        Resources resources;
        int i6 = 0;
        switch (enumC132885zD.ordinal()) {
            case 0:
                i5 = -2;
                c56302iJ5 = new C56302iJ(-2, -2);
                c56302iJ5.A0s = R.id.overlay;
                Resources resources2 = context.getResources();
                int i7 = R.dimen.ab_test_media_thumbnail_preview_item_internal_padding;
                c56302iJ5.setMarginStart(resources2.getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding));
                ((ViewGroup.MarginLayoutParams) c56302iJ5).topMargin = AbstractC166997dE.A04(context, R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
                if (z) {
                    c56302iJ5.A0G = R.id.text;
                    resources = context.getResources();
                    i7 = R.dimen.abc_control_corner_material;
                } else {
                    c56302iJ5.A0F = R.id.overlay;
                    resources = context.getResources();
                }
                ((ViewGroup.MarginLayoutParams) c56302iJ5).bottomMargin = resources.getDimensionPixelSize(i7);
                c56302iJ6 = new C56302iJ(-2, -2);
                ((ViewGroup.LayoutParams) c56302iJ6).width = 0;
                c56302iJ6.A0s = R.id.icon;
                c56302iJ6.A0M = R.id.overlay;
                c56302iJ6.A0F = R.id.overlay;
                ((ViewGroup.MarginLayoutParams) c56302iJ6).bottomMargin = AbstractC166997dE.A04(context, R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
                c56302iJ6.setMarginEnd(AbstractC166997dE.A04(context, R.dimen.ab_test_media_thumbnail_preview_item_internal_padding));
                i4 = R.drawable.instagram_reels_pano_filled_24;
                i3 = R.style.igds_emphasized_title;
                c56302iJ7 = new C56302iJ(i5, i5);
                c56302iJ8 = new C56302iJ(i5, i5);
                return new C38166GqX(c56302iJ5, c56302iJ6, c56302iJ7, c56302iJ8, 0, 0, i4, i3);
            case 1:
                i5 = -2;
                c56302iJ5 = new C56302iJ(-2, -2);
                c56302iJ5.A0s = R.id.overlay;
                c56302iJ5.setMarginStart(context.getResources().getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding));
                if (z) {
                    c56302iJ5.A0F = R.id.text;
                    c56302iJ5.A0u = R.id.text;
                } else {
                    c56302iJ5.A0F = R.id.overlay;
                    ((ViewGroup.MarginLayoutParams) c56302iJ5).topMargin = AbstractC166997dE.A04(context, R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
                    ((ViewGroup.MarginLayoutParams) c56302iJ5).bottomMargin = AbstractC166997dE.A04(context, R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
                }
                c56302iJ6 = new C56302iJ(-2, -2);
                ((ViewGroup.LayoutParams) c56302iJ6).width = 0;
                c56302iJ6.A0r = R.id.icon;
                c56302iJ6.A0M = R.id.overlay;
                c56302iJ6.A0F = R.id.overlay;
                c56302iJ6.setMarginStart(AbstractC167017dG.A05(context));
                c56302iJ6.setMarginEnd(AbstractC166997dE.A04(context, R.dimen.ab_test_media_thumbnail_preview_item_internal_padding));
                ((ViewGroup.MarginLayoutParams) c56302iJ6).bottomMargin = AbstractC166997dE.A04(context, R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
                ((ViewGroup.MarginLayoutParams) c56302iJ6).topMargin = AbstractC166997dE.A04(context, R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
                i4 = R.drawable.instagram_reels_pano_filled_24;
                i3 = R.style.igds_emphasized_title;
                c56302iJ7 = new C56302iJ(i5, i5);
                c56302iJ8 = new C56302iJ(i5, i5);
                return new C38166GqX(c56302iJ5, c56302iJ6, c56302iJ7, c56302iJ8, 0, 0, i4, i3);
            case 2:
                c56302iJ5 = new C56302iJ(-2, -2);
                c56302iJ5.A0M = R.id.overlay;
                c56302iJ5.A0u = R.id.overlay;
                Resources resources3 = context.getResources();
                EnumC132895zE enumC132895zE2 = EnumC132895zE.A05;
                int i8 = R.dimen.ab_test_media_thumbnail_preview_item_internal_padding;
                if (enumC132895zE == enumC132895zE2) {
                    i8 = R.dimen.abc_button_padding_horizontal_material;
                }
                c56302iJ5.setMarginEnd(resources3.getDimensionPixelSize(i8));
                Resources resources4 = context.getResources();
                int i9 = R.dimen.ab_test_media_thumbnail_preview_item_internal_padding;
                if (enumC132895zE == enumC132895zE2) {
                    i9 = R.dimen.abc_button_padding_horizontal_material;
                }
                ((ViewGroup.MarginLayoutParams) c56302iJ5).topMargin = resources4.getDimensionPixelSize(i9);
                i3 = R.style.ClipsPlaylistExploreTileLabel;
                if (enumC132895zE == enumC132895zE2) {
                    i3 = R.style.igds_emphasized_title;
                }
                c56302iJ6 = new C56302iJ(-2, -2);
                ((ViewGroup.LayoutParams) c56302iJ6).width = 0;
                c56302iJ6.A0s = R.id.overlay;
                c56302iJ6.A0M = R.id.overlay;
                c56302iJ6.A0F = R.id.overlay;
                Resources resources5 = context.getResources();
                int i10 = R.dimen.ab_test_media_thumbnail_preview_item_internal_padding;
                if (enumC132895zE == enumC132895zE2) {
                    i10 = R.dimen.account_discovery_bottom_gap;
                }
                c56302iJ6.setMarginStart(resources5.getDimensionPixelSize(i10));
                Resources resources6 = context.getResources();
                int i11 = R.dimen.ab_test_media_thumbnail_preview_item_internal_padding;
                if (enumC132895zE == enumC132895zE2) {
                    i11 = R.dimen.account_discovery_bottom_gap;
                }
                c56302iJ6.setMarginEnd(resources6.getDimensionPixelSize(i11));
                ((ViewGroup.MarginLayoutParams) c56302iJ6).bottomMargin = AbstractC167017dG.A0E(context);
                c56302iJ7 = new C56302iJ(-2, -2);
                c56302iJ7.A0s = R.id.overlay;
                c56302iJ7.A0G = R.id.text;
                c56302iJ7.setMarginStart(AbstractC167017dG.A03(context));
                ((ViewGroup.MarginLayoutParams) c56302iJ7).bottomMargin = context.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material);
                c56302iJ8 = new C56302iJ(-2, -2);
                ((ViewGroup.LayoutParams) c56302iJ8).width = 0;
                c56302iJ8.A0r = R.id.trending_badge;
                c56302iJ8.A0M = R.id.overlay;
                c56302iJ8.A0G = R.id.text;
                c56302iJ8.A0u = R.id.trending_badge;
                c56302iJ8.setMarginStart(AbstractC166997dE.A04(context, R.dimen.abc_action_bar_elevation_material));
                ((ViewGroup.MarginLayoutParams) c56302iJ8).bottomMargin = AbstractC166997dE.A04(context, R.dimen.abc_action_bar_elevation_material);
                i4 = R.drawable.instagram_reels_pano_filled_24;
                return new C38166GqX(c56302iJ5, c56302iJ6, c56302iJ7, c56302iJ8, 0, 0, i4, i3);
            case 3:
                C56302iJ c56302iJ9 = new C56302iJ(-2, -2);
                C56302iJ c56302iJ10 = new C56302iJ(-2, -2);
                ((ViewGroup.LayoutParams) c56302iJ10).width = 0;
                c56302iJ10.A0s = R.id.overlay;
                c56302iJ10.A0M = R.id.overlay;
                c56302iJ10.A0F = R.id.overlay;
                c56302iJ10.setMarginStart(context.getResources().getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding));
                c56302iJ10.setMarginEnd(AbstractC166997dE.A04(context, R.dimen.ab_test_media_thumbnail_preview_item_internal_padding));
                ((ViewGroup.MarginLayoutParams) c56302iJ10).bottomMargin = AbstractC166997dE.A04(context, R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
                ((ViewGroup.MarginLayoutParams) c56302iJ10).topMargin = AbstractC166997dE.A04(context, R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
                return new C38166GqX(c56302iJ9, c56302iJ10, new C56302iJ(-2, -2), new C56302iJ(-2, -2), 0, 8, R.drawable.instagram_reels_pano_filled_24, R.style.igds_emphasized_title);
            case 4:
                i5 = -2;
                c56302iJ5 = new C56302iJ(-2, -2);
                c56302iJ5.A0M = R.id.overlay;
                c56302iJ5.A0u = R.id.overlay;
                c56302iJ5.setMarginEnd(context.getResources().getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material));
                ((ViewGroup.MarginLayoutParams) c56302iJ5).topMargin = AbstractC166997dE.A04(context, R.dimen.abc_button_inset_vertical_material);
                c56302iJ6 = new C56302iJ(-2, -2);
                ((ViewGroup.LayoutParams) c56302iJ6).width = 0;
                c56302iJ6.A0s = R.id.overlay;
                c56302iJ6.A0M = R.id.overlay;
                c56302iJ6.A0F = R.id.overlay;
                c56302iJ6.setMarginStart(context.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap));
                c56302iJ6.setMarginEnd(AbstractC166997dE.A04(context, R.dimen.account_discovery_bottom_gap));
                ((ViewGroup.MarginLayoutParams) c56302iJ6).bottomMargin = context.getResources().getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material);
                ((ViewGroup.MarginLayoutParams) c56302iJ6).topMargin = AbstractC166997dE.A04(context, R.dimen.abc_button_padding_horizontal_material);
                i4 = R.drawable.instagram_circle_outline_24;
                i3 = R.style.igds_emphasized_title_bold;
                c56302iJ7 = new C56302iJ(i5, i5);
                c56302iJ8 = new C56302iJ(i5, i5);
                return new C38166GqX(c56302iJ5, c56302iJ6, c56302iJ7, c56302iJ8, 0, 0, i4, i3);
            case 5:
                c56302iJ = new C56302iJ(-2, -2);
                c56302iJ.A0M = R.id.overlay;
                c56302iJ.A0u = R.id.overlay;
                i = R.drawable.instagram_reels_filled_32;
                i2 = R.style.igds_emphasized_title;
                c56302iJ2 = new C56302iJ(-2, -2);
                c56302iJ3 = new C56302iJ(-2, -2);
                c56302iJ4 = new C56302iJ(-2, -2);
                return new C38166GqX(c56302iJ, c56302iJ2, c56302iJ3, c56302iJ4, i6, i6, i, i2);
            case 6:
                i6 = 8;
                i = R.drawable.instagram_reels_pano_filled_24;
                i2 = R.style.igds_emphasized_title;
                c56302iJ = new C56302iJ(-2, -2);
                c56302iJ2 = new C56302iJ(-2, -2);
                c56302iJ3 = new C56302iJ(-2, -2);
                c56302iJ4 = new C56302iJ(-2, -2);
                return new C38166GqX(c56302iJ, c56302iJ2, c56302iJ3, c56302iJ4, i6, i6, i, i2);
            default:
                throw B4Z.A00();
        }
    }
}
