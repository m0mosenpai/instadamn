package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.Layout;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.34h, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C679334h {
    public int A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final Context A08;
    public final UserSession A09;
    public final InterfaceC60442pS A0A;
    public final AnonymousClass341 A0B;
    public final C57332k8 A0C;
    public final HashMap A0D = new HashMap();
    public final boolean A0E = AbstractC229319v.A00();
    public final int A0F;

    public static void A00(Layout layout, C679334h c679334h) {
        int lineBottom;
        if (c679334h.A00 == 0) {
            if (layout.getLineCount() == 1) {
                lineBottom = layout.getLineBottom(0);
            } else if (layout.getLineCount() <= 1) {
                return;
            } else {
                lineBottom = layout.getLineBottom(0) - c679334h.A0F;
            }
            c679334h.A00 = lineBottom;
        }
    }

    public C679334h(Context context, UserSession userSession, InterfaceC60442pS interfaceC60442pS, AnonymousClass341 anonymousClass341, C57332k8 c57332k8) {
        this.A08 = context;
        this.A0C = c57332k8;
        this.A0B = anonymousClass341;
        this.A06 = context.getResources().getDimensionPixelSize(R.dimen.alert_dialog_button_cell_height);
        this.A03 = context.getResources().getDimensionPixelSize(R.dimen.account_group_management_title_text_horizontal_padding);
        this.A07 = context.getResources().getDimensionPixelSize(R.dimen.audience_selector_pill_layout_height);
        this.A04 = context.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
        Resources resources = context.getResources();
        C14360o3.A0B(resources, 0);
        this.A0F = resources.getDimensionPixelSize(R.dimen.abc_control_corner_material);
        Resources resources2 = context.getResources();
        C14360o3.A0B(resources2, 0);
        this.A05 = resources2.getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material);
        this.A02 = context.getResources().getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
        this.A01 = AbstractC13880nE.A0A(context);
        this.A0A = interfaceC60442pS;
        this.A09 = userSession;
    }
}
