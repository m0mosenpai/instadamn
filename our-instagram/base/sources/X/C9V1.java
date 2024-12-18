package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.facebook.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.mediasize.ExtendedImageUrl;

/* renamed from: X.9V1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9V1 extends C3OO {
    public C38321qM A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final Context A0A;
    public final View A0B;
    public final UserSession A0C;
    public final IgImageView A0D;
    public final IgImageView A0E;
    public final int A0F;
    public final int A0G;
    public final int A0H;

    public static void A00(Medium medium, C9V1 c9v1) {
        IgImageView igImageView = c9v1.A0D;
        Context context = c9v1.A0A;
        C38321qM c38321qM = c9v1.A00;
        c38321qM.getClass();
        ExtendedImageUrl A1q = c38321qM.A1q(context);
        int i = c9v1.A06;
        int i2 = c9v1.A0F;
        C8OK c8ok = C8OK.A0A;
        AbstractC167007dF.A1D(context, 1, medium);
        igImageView.setImageDrawable(new C202728xq(context, null, medium, A1q, c8ok, null, i, i2, false, true, false, false));
        igImageView.getLayoutParams().width = c9v1.A0H;
        igImageView.getLayoutParams().height = c9v1.A0G;
    }

    public C9V1(Context context, GradientDrawable gradientDrawable, View view, UserSession userSession) {
        super(view);
        this.A0A = context;
        this.A0C = userSession;
        View requireViewById = view.requireViewById(R.id.canvas_memories_item_container);
        this.A0B = requireViewById;
        this.A0E = (IgImageView) view.requireViewById(R.id.canvas_memories_title_image);
        this.A0D = (IgImageView) view.requireViewById(R.id.canvas_memories_image);
        this.A06 = AbstractC13880nE.A0A(context);
        this.A0F = AbstractC13880nE.A09(context);
        C14360o3.A0B(requireViewById, 0);
        requireViewById.setBackground(gradientDrawable);
        Resources resources = context.getResources();
        this.A08 = resources.getDimensionPixelSize(R.dimen.add_payment_bottom_sheet_row_subtitle_size);
        this.A07 = resources.getDimensionPixelSize(R.dimen.memory_subtitle_text_size);
        this.A09 = AbstractC166997dE.A0A(resources);
        this.A03 = resources.getDimensionPixelSize(R.dimen.alt_text_carousel_card_width);
        this.A02 = resources.getDimensionPixelSize(R.dimen.alt_text_carousel_card_width);
        this.A04 = resources.getDimensionPixelSize(R.dimen.ad_tag_max_width);
        this.A01 = resources.getDimensionPixelOffset(R.dimen.achievements_list_container_height);
        this.A05 = resources.getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_width);
        this.A0H = resources.getDimensionPixelSize(R.dimen.alignment_guide_default_vertical_margin);
        this.A0G = resources.getDimensionPixelSize(R.dimen.browser_error_screen_description_width);
    }
}
