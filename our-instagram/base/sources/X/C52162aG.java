package X;

import android.content.Context;
import android.content.res.ColorStateList;
import com.facebook.R;

/* renamed from: X.2aG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C52162aG implements InterfaceC52172aH {
    public final int[] A02 = {R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
    public final int[] A04 = {R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
    public final int[] A01 = {R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};
    public final int[] A00 = {R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
    public final int[] A05 = {R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
    public final int[] A03 = {R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};

    public static ColorStateList A00(Context context, int i) {
        int A01 = C3WR.A01(context, R.attr.colorControlHighlight);
        int A00 = C3WR.A00(context, R.attr.colorButtonNormal);
        int[] iArr = C3WR.A02;
        int[] iArr2 = C3WR.A05;
        int A05 = AbstractC56842jH.A05(A01, i);
        return new ColorStateList(new int[][]{iArr, iArr2, C3WR.A04, C3WR.A03}, new int[]{A00, A05, AbstractC56842jH.A05(A01, i), i});
    }
}
