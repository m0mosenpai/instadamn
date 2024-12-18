package X;

import android.content.Context;
import com.facebook.R;

/* renamed from: X.6Qr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C138866Qr {
    public static C138866Qr A0N;
    public static final C6Qs A0O = new Object();
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final int A0F;
    public final int A0G;
    public final int A0H;
    public final int A0I;
    public final int A0J;
    public final String A0K;
    public final String A0L;
    public final boolean A0M;

    public C138866Qr(Context context) {
        this.A0M = C143726eF.A0B(context);
        int A00 = A00(context);
        this.A0F = A00;
        int A02 = C143726eF.A02(context);
        this.A0E = A02;
        this.A0J = context.getResources().getDimensionPixelSize(R.dimen.asset_picker_redesign_sticker_height);
        this.A01 = context.getResources().getDimensionPixelSize(R.dimen.action_button_min_width);
        this.A00 = C143726eF.A00(context);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
        this.A0G = dimensionPixelSize;
        this.A0D = context.getResources().getDimensionPixelSize(R.dimen.album_preview_add_item_margin);
        context.getResources().getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material);
        this.A05 = A02 - (context.getResources().getDimensionPixelSize(R.dimen.avatar_sticker_max_height) * 2);
        this.A09 = A00 - (context.getResources().getDimensionPixelSize(R.dimen.ai_agent_share_profile_sticker_padding) * 2);
        this.A08 = (context.getResources().getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding) * 3) + (context.getResources().getDimensionPixelSize(R.dimen.auth_credential_title_text_size) * 3);
        this.A07 = context.getResources().getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding) / 2;
        this.A06 = (context.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap) * 3) + (context.getResources().getDimensionPixelSize(R.dimen.abc_text_size_menu_header_material) * 2);
        String string = context.getString(2131954794);
        C14360o3.A07(string);
        this.A0K = string;
        String string2 = context.getString(2131961704);
        C14360o3.A07(string2);
        this.A0L = string2;
        this.A0C = A00 - context.getResources().getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material);
        this.A0A = context.getResources().getDimensionPixelSize(R.dimen.abc_list_item_height_material);
        this.A0B = context.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap) + dimensionPixelSize;
        this.A0H = context.getResources().getDimensionPixelSize(R.dimen.achievements_only_you_top_margin) * 2;
        this.A0I = context.getResources().getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material) * 2;
        this.A03 = context.getResources().getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material);
        this.A02 = context.getResources().getDimensionPixelSize(R.dimen.abc_dialog_padding_material);
        this.A04 = context.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
    }

    public static final int A00(Context context) {
        if (C143726eF.A0C(context)) {
            return (int) (0.5625f * C143726eF.A02(context));
        }
        return AbstractC13890nF.A01(context);
    }
}
