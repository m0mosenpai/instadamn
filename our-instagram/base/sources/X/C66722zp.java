package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.R;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.instagram.common.session.UserSession;
import java.util.Arrays;

/* renamed from: X.2zp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C66722zp extends AbstractC65632xz {
    public C65082x6 A00;
    public final Context A01;
    public final UserSession A02;

    public C66722zp(Context context, UserSession userSession) {
        C14360o3.A0B(context, 1);
        this.A01 = context;
        this.A02 = userSession;
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final String getBinderGroupName() {
        return "IgShimmer";
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final void onViewAttachedToWindow(View view, int i, Object obj, Object obj2) {
        C65082x6 c65082x6;
        C14360o3.A0B(view, 0);
        C14360o3.A0B(obj, 2);
        if (i == 8 && (c65082x6 = this.A00) != null) {
            C61442r7.A02(c65082x6.A00, "SHIMMER_START");
        }
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        Integer num;
        C84593q8 c84593q8 = (C84593q8) obj;
        C14360o3.A0B(anonymousClass306, 0);
        C14360o3.A0B(c84593q8, 1);
        switch (c84593q8.A00.intValue()) {
            case 5:
                num = C05F.A0Y;
                break;
            case 6:
                num = C05F.A0N;
                break;
            default:
                num = C05F.A1F;
                break;
        }
        anonymousClass306.A7a(num.intValue());
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getIdentifier(int i, Object obj, Object obj2) {
        if (i == 9) {
            return Integer.MAX_VALUE;
        }
        return Arrays.hashCode(new Object[]{Integer.valueOf(i)});
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getViewModelHash(int i, Object obj, Object obj2) {
        C84603q9 c84603q9 = (C84603q9) obj2;
        if (c84603q9 == null) {
            return 0;
        }
        return Arrays.hashCode(new Object[]{Boolean.valueOf(c84603q9.A00)});
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return C05F.A00(11).length;
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final String getViewTypeName(int i) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("IgShimmer");
        sb.append('[');
        switch (C05F.A00(11)[i].intValue()) {
            case 1:
                str = "hashtag_header";
                break;
            case 2:
                str = "profile_header";
                break;
            case 3:
                str = "two_by_two_grid";
                break;
            case 4:
                str = "one_by_one_grid";
                break;
            case 5:
                str = "newsfeed";
                break;
            case 6:
                str = "product_hscroll";
                break;
            case 7:
                str = "merchant_hscroll";
                break;
            case 8:
                str = "mainfeed";
                break;
            case 9:
                str = "immersive_media";
                break;
            case 10:
                str = "full_height_media";
                break;
            default:
                str = "refinements_header";
                break;
        }
        sb.append(str);
        sb.append(']');
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    @Override // X.InterfaceC65642y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void bindView(int r5, android.view.View r6, java.lang.Object r7, java.lang.Object r8) {
        /*
            r4 = this;
            r0 = -731796323(0xffffffffd461ac9d, float:-3.8770544E12)
            int r3 = X.C0f9.A03(r0)
            r0 = 1
            X.C14360o3.A0B(r6, r0)
            r2 = 3
            X.C14360o3.A0B(r8, r2)
            r0 = 10
            if (r5 != r0) goto L3f
            java.lang.Object r1 = r6.getTag()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.igds.components.shimmer.IgShimmerViewBinder.Holder"
            X.C14360o3.A0C(r1, r0)
            X.3q9 r8 = (X.C84603q9) r8
            X.C14360o3.A0B(r8, r2)
        L21:
            r1 = 0
            r0 = 1
            X.C14360o3.A0B(r8, r0)
        L26:
            com.facebook.shimmer.ShimmerFrameLayout r6 = (com.facebook.shimmer.ShimmerFrameLayout) r6
            boolean r0 = r8.A00
            if (r0 == 0) goto L39
            r6.A02()
        L2f:
            r6.setVisibility(r1)
            r0 = -1681215643(0xffffffff9bcaaf65, float:-3.3531443E-22)
            X.C0f9.A0A(r0, r3)
            return
        L39:
            r6.A03()
            r1 = 8
            goto L2f
        L3f:
            r0 = 9
            X.3q9 r8 = (X.C84603q9) r8
            if (r5 != r0) goto L21
            r2 = 0
            r0 = 1
            X.C14360o3.A0B(r8, r0)
            android.view.ViewGroup$LayoutParams r1 = r6.getLayoutParams()
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L59
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            if (r1 == 0) goto L59
            r1.setMargins(r2, r2, r2, r2)
        L59:
            r1 = 0
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66722zp.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0017. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v37, types: [X.3OO, java.lang.Object, X.9UU] */
    /* JADX WARN: Type inference failed for: r2v10, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r2v12, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r2v17, types: [android.view.View, java.lang.Object, com.facebook.shimmer.ShimmerFrameLayout, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r2v20, types: [android.view.View, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r5v11, types: [X.3qU] */
    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        final Context context;
        boolean z;
        AbstractC84813qV abstractC84813qV;
        int dimensionPixelSize;
        int i2;
        int i3;
        ViewGroup.LayoutParams layoutParams;
        View view;
        ShimmerFrameLayout shimmerFrameLayout;
        AbstractC84813qV abstractC84813qV2;
        ShimmerFrameLayout shimmerFrameLayout2;
        U19 u19;
        ShimmerFrameLayout shimmerFrameLayout3;
        ShimmerFrameLayout shimmerFrameLayout4;
        int A03 = C0f9.A03(1815243537);
        C14360o3.A0B(viewGroup, 1);
        switch (C05F.A00(11)[i].intValue()) {
            case 0:
                shimmerFrameLayout4 = C84733qM.A00.A02(this.A01, viewGroup);
                C0f9.A0A(-1514389372, A03);
                return shimmerFrameLayout4;
            case 1:
                context = this.A01;
                z = false;
                C14360o3.A0B(context, 0);
                abstractC84813qV = new AbstractC84813qV(context) { // from class: X.9oI
                    public float A00;
                    public final float A01;
                    public final float A02;
                    public final float A03;
                    public final float A04;
                    public final float A05;
                    public final float A06;
                    public final float A07;
                    public final float A08;
                    public final float A09;
                    public final int A0A;
                    public final Paint A0B;
                    public final RectF A0C;

                    {
                        super(context, null);
                        Paint A0R = AbstractC166987dD.A0R();
                        this.A0B = A0R;
                        this.A0C = AbstractC166987dD.A0X();
                        Resources resources = getResources();
                        this.A07 = (resources.getDimension(R.dimen.direct_standard_xma_grid_view_height) / 2.0f) + resources.getDimension(R.dimen.account_recs_header_image_margin);
                        this.A06 = resources.getDimension(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
                        this.A01 = resources.getDimension(R.dimen.account_discovery_bottom_gap);
                        this.A02 = resources.getDimension(R.dimen.abc_action_bar_elevation_material);
                        this.A03 = resources.getDimension(R.dimen.hashtag_feed_header_follow_button_placeholder_width);
                        this.A0A = AbstractC53242c7.A0G(context, R.attr.igdsButtonHeight);
                        this.A05 = resources.getDimension(R.dimen.avatar_reel_ring_size_xxxxlarge);
                        this.A04 = resources.getDimension(R.dimen.hashtag_feed_header_followers_placeholder_height);
                        this.A09 = resources.getDimension(R.dimen.hashtag_feed_header_top_posts_placeholder_width);
                        this.A08 = resources.getDimension(R.dimen.account_discovery_bottom_gap);
                        this.A00 = resources.getDimension(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
                        AbstractC166987dD.A1N(context, A0R, AbstractC53242c7.A04(context));
                    }

                    @Override // android.view.View
                    public final void onDraw(Canvas canvas) {
                        C14360o3.A0B(canvas, 0);
                        float f = this.A06;
                        float f2 = this.A07;
                        float f3 = f + f2;
                        float A07 = (AbstractC166987dD.A07(this) - (2.0f * f3)) - f;
                        canvas.drawCircle(f3, f3, f2, this.A0B);
                        A00(canvas, this.A05, this.A04, f3, A07);
                        A00(canvas, this.A03, this.A0A, f3, A07);
                        A00(canvas, this.A09, this.A08, f3, A07);
                        this.A00 = getResources().getDimension(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
                    }

                    private final void A00(Canvas canvas, float f, float f2, float f3, float f4) {
                        float f5 = ((f3 * 2.0f) + (f4 / 2.0f)) - (f / 2.0f);
                        RectF rectF = this.A0C;
                        float f6 = this.A00;
                        rectF.set(f5, f6, f + f5, f6 + f2);
                        float f7 = this.A02;
                        canvas.drawRoundRect(rectF, f7, f7, this.A0B);
                        this.A00 += f2 + this.A01;
                    }
                };
                dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.avatar_sticker_max_height);
                View inflate = LayoutInflater.from(context).inflate(R.layout.shimmer_header_layout, viewGroup, z);
                C14360o3.A0C(inflate, "null cannot be cast to non-null type com.facebook.shimmer.ShimmerFrameLayout");
                ?? r2 = (ViewGroup) inflate;
                abstractC84813qV.setLayoutParams(new ViewGroup.LayoutParams(-1, dimensionPixelSize));
                r2.addView(abstractC84813qV);
                shimmerFrameLayout4 = r2;
                C0f9.A0A(-1514389372, A03);
                return shimmerFrameLayout4;
            case 2:
                context = this.A01;
                z = false;
                C14360o3.A0B(context, 0);
                abstractC84813qV = new AbstractC84813qV(context) { // from class: X.9oJ
                    public float A00;
                    public float A01;
                    public final float A02;
                    public final float A03;
                    public final float A04;
                    public final float A05;
                    public final float A06;
                    public final float A07;
                    public final float A08;
                    public final Paint A09;
                    public final RectF A0A;
                    public final float A0B;
                    public final float A0C;
                    public final float A0D;
                    public final float A0E;
                    public final float A0F;
                    public final float A0G;

                    {
                        super(context, null);
                        Paint A0R = AbstractC166987dD.A0R();
                        this.A09 = A0R;
                        this.A0A = AbstractC166987dD.A0X();
                        Resources resources = getResources();
                        this.A0G = resources.getDimension(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
                        this.A0F = resources.getDimension(R.dimen.achievements_only_you_bottom_margin);
                        this.A06 = resources.getDimension(R.dimen.audience_lists_text_in_badge_horizontal_margin_right);
                        this.A05 = resources.getDimension(R.dimen.abc_action_bar_elevation_material);
                        this.A07 = resources.getDimension(R.dimen.bottomsheet_action_button_row_icon_margin_end);
                        this.A0B = resources.getDimension(R.dimen.comment_input_row_avatar_suggestion_vertical_padding);
                        this.A02 = resources.getDimension(R.dimen.filter_label_text_bottom);
                        this.A03 = resources.getDimension(R.dimen.abc_control_corner_material);
                        this.A08 = resources.getDimension(R.dimen.direct_composer_redesign_background_height);
                        this.A0D = resources.getDimension(R.dimen.audio_dubbing_gen_ai_gif_size);
                        this.A0C = resources.getDimension(R.dimen.ai_agent_embodiment_video_container_size);
                        this.A0E = resources.getDimension(R.dimen.album_music_sticker_text_vertical_padding);
                        this.A04 = resources.getDimension(R.dimen.failed_upload_indicator_size_xlarge);
                        AbstractC166987dD.A1N(context, A0R, AbstractC53242c7.A04(context));
                    }

                    @Override // android.view.View
                    public final void onDraw(Canvas canvas) {
                        C14360o3.A0B(canvas, 0);
                        float f = this.A0G;
                        this.A01 = f;
                        float f2 = this.A0F;
                        this.A00 = f2;
                        float f3 = this.A08;
                        Paint paint = this.A09;
                        canvas.drawCircle(f2 + f3, f + f3, f3, paint);
                        this.A01 += (f3 * 2.0f) + this.A07;
                        this.A00 -= this.A06;
                        A00(canvas, this.A0D);
                        A00(canvas, this.A0C);
                        float A07 = AbstractC166987dD.A07(this);
                        float f4 = this.A00 - this.A05;
                        this.A00 = f4;
                        float f5 = this.A01 + this.A02;
                        this.A01 = f5;
                        RectF rectF = this.A0A;
                        rectF.set(f4, f5, (A07 - (f4 * 2.0f)) + f4, this.A04 + f5);
                        float f6 = this.A03;
                        canvas.drawRoundRect(rectF, f6, f6, paint);
                    }

                    private final void A00(Canvas canvas, float f) {
                        RectF rectF = this.A0A;
                        float f2 = this.A00;
                        float f3 = this.A01;
                        float f4 = this.A0E;
                        rectF.set(f2, f3, f + f2, f4 + f3);
                        float f5 = this.A03;
                        canvas.drawRoundRect(rectF, f5, f5, this.A09);
                        this.A01 += f4 + this.A0B;
                    }
                };
                dimensionPixelSize = Resources.getSystem().getDisplayMetrics().heightPixels;
                View inflate2 = LayoutInflater.from(context).inflate(R.layout.shimmer_header_layout, viewGroup, z);
                C14360o3.A0C(inflate2, "null cannot be cast to non-null type com.facebook.shimmer.ShimmerFrameLayout");
                ?? r22 = (ViewGroup) inflate2;
                abstractC84813qV.setLayoutParams(new ViewGroup.LayoutParams(-1, dimensionPixelSize));
                r22.addView(abstractC84813qV);
                shimmerFrameLayout4 = r22;
                C0f9.A0A(-1514389372, A03);
                return shimmerFrameLayout4;
            case 3:
                shimmerFrameLayout4 = C84733qM.A00.A01(this.A01, viewGroup);
                C0f9.A0A(-1514389372, A03);
                return shimmerFrameLayout4;
            case 4:
                Context context2 = this.A01;
                C14360o3.A0B(context2, 0);
                ShimmerFrameLayout A00 = C84733qM.A00(context2, viewGroup);
                U19 u192 = new U19(context2);
                u192.setLayoutType(EnumC38183Gqo.A0B);
                i2 = -1;
                i3 = Resources.getSystem().getDisplayMetrics().heightPixels;
                shimmerFrameLayout3 = A00;
                u19 = u192;
                layoutParams = new ViewGroup.LayoutParams(i2, i3);
                shimmerFrameLayout2 = shimmerFrameLayout3;
                abstractC84813qV2 = u19;
                abstractC84813qV2.setLayoutParams(layoutParams);
                shimmerFrameLayout = shimmerFrameLayout2;
                view = abstractC84813qV2;
                shimmerFrameLayout.addView(view);
                shimmerFrameLayout4 = shimmerFrameLayout;
                C0f9.A0A(-1514389372, A03);
                return shimmerFrameLayout4;
            case 5:
                final Context context3 = this.A01;
                C14360o3.A0B(context3, 0);
                ShimmerFrameLayout A002 = C84733qM.A00(context3, viewGroup);
                AbstractC84813qV abstractC84813qV3 = new AbstractC84813qV(context3) { // from class: X.9oK
                    public static final float[] A0L = {1.0f, 1.21f, 1.11f, 0.82f};
                    public float A00;
                    public final float A01;
                    public final float A02;
                    public final float A03;
                    public final float A04;
                    public final float A05;
                    public final float A06;
                    public final float A07;
                    public final float A08;
                    public final float A09;
                    public final float A0A;
                    public final float A0B;
                    public final float A0C;
                    public final Paint A0D;
                    public final RectF A0E;
                    public final float A0F;
                    public final float A0G;
                    public final float A0H;
                    public final float A0I;
                    public final float A0J;
                    public final float A0K;

                    {
                        super(context3, null);
                        this.A0E = AbstractC166987dD.A0X();
                        Paint A0R = AbstractC166987dD.A0R();
                        this.A0D = A0R;
                        Resources resources = getResources();
                        this.A0I = resources.getDimension(R.dimen.news_feed_placeholder_profile_radius);
                        this.A0K = resources.getDimension(R.dimen.abc_control_corner_material);
                        this.A03 = resources.getDimension(R.dimen.abc_action_bar_elevation_material);
                        this.A02 = resources.getDimension(R.dimen.canvas_colour_wheel_offset_y);
                        this.A01 = resources.getDimension(R.dimen.add_account_icon_circle_radius);
                        this.A06 = resources.getDimension(R.dimen.alert_dialog_margin_horizontal);
                        this.A0F = resources.getDimension(R.dimen.abc_button_inset_vertical_material);
                        this.A0G = resources.getDimension(R.dimen.album_preview_add_item_margin);
                        this.A04 = resources.getDimension(R.dimen.fb_polling_background_corner_radius);
                        this.A0C = resources.getDimension(R.dimen.bottom_button_divider_margin_small);
                        this.A05 = resources.getDimension(R.dimen.bottom_button_divider_margin_medium);
                        this.A0J = resources.getDimension(R.dimen.account_discovery_bottom_gap);
                        this.A09 = resources.getDimension(R.dimen.boost_guidance_preview_width);
                        this.A0A = resources.getDimension(R.dimen.news_feed_placeholder_text_short_width);
                        this.A0B = resources.getDimension(R.dimen.news_feed_placeholder_standard_paragraph_text_width);
                        this.A07 = resources.getDimension(R.dimen.news_feed_placeholder_section_three_long_rect_width);
                        this.A08 = resources.getDimension(R.dimen.news_feed_placeholder_section_three_short_rect_width);
                        this.A0H = resources.getDimension(R.dimen.news_feed_placeholder_text_position);
                        AbstractC166987dD.A1N(context3, A0R, AbstractC53242c7.A04(context3));
                    }

                    @Override // android.view.View
                    public final void onDraw(Canvas canvas) {
                        C14360o3.A0B(canvas, 0);
                        this.A00 = this.A0G;
                        int i4 = 0;
                        do {
                            A00(canvas);
                            A01(canvas, this.A09);
                            A01(canvas, this.A0A);
                            float f = this.A00;
                            float f2 = this.A04;
                            this.A00 = f + f2;
                            float A07 = AbstractC166987dD.A07(this);
                            A00(canvas);
                            float f3 = this.A05;
                            float f4 = this.A06;
                            float f5 = (A07 - f3) - f4;
                            float f6 = this.A00 - this.A0C;
                            RectF rectF = this.A0E;
                            rectF.set(f5, f6, f5 + f4, f4 + f6);
                            Paint paint = this.A0D;
                            canvas.drawRect(rectF, paint);
                            float[] fArr = A0L;
                            int i5 = 0;
                            do {
                                A01(canvas, fArr[i5] * this.A0B);
                                i5++;
                            } while (i5 < 4);
                            this.A00 += f2;
                            float A072 = AbstractC166987dD.A07(this);
                            A00(canvas);
                            float f7 = this.A02;
                            float f8 = (A072 - f3) - f7;
                            float f9 = this.A00;
                            rectF.set(f8, f9, f7 + f8, this.A01 + f9);
                            float f10 = this.A03;
                            canvas.drawRoundRect(rectF, f10, f10, paint);
                            A01(canvas, this.A07);
                            A01(canvas, this.A08);
                            this.A00 += f2;
                            i4++;
                        } while (i4 < 3);
                    }

                    private final void A00(Canvas canvas) {
                        float f = this.A05;
                        float f2 = this.A0I;
                        canvas.drawCircle(f + f2, this.A00, f2, this.A0D);
                        this.A00 += this.A0C - f2;
                    }

                    private final void A01(Canvas canvas, float f) {
                        RectF rectF = this.A0E;
                        float f2 = this.A0H;
                        float f3 = this.A00;
                        float f4 = this.A0J;
                        rectF.set(f2, f3, f + f2, f4 + f3);
                        float f5 = this.A0K;
                        canvas.drawRoundRect(rectF, f5, f5, this.A0D);
                        this.A00 += f4 + this.A0F;
                    }
                };
                layoutParams = new ViewGroup.LayoutParams(-1, Resources.getSystem().getDisplayMetrics().heightPixels);
                shimmerFrameLayout2 = A002;
                abstractC84813qV2 = abstractC84813qV3;
                abstractC84813qV2.setLayoutParams(layoutParams);
                shimmerFrameLayout = shimmerFrameLayout2;
                view = abstractC84813qV2;
                shimmerFrameLayout.addView(view);
                shimmerFrameLayout4 = shimmerFrameLayout;
                C0f9.A0A(-1514389372, A03);
                return shimmerFrameLayout4;
            case 6:
                Context context4 = this.A01;
                C14360o3.A0B(context4, 0);
                View inflate3 = LayoutInflater.from(context4).inflate(R.layout.shimmer_header_layout, viewGroup, false);
                C14360o3.A0C(inflate3, "null cannot be cast to non-null type com.facebook.shimmer.ShimmerFrameLayout");
                View inflate4 = LayoutInflater.from(context4).inflate(R.layout.shopping_loading_placeholder, viewGroup, false);
                View requireViewById = inflate4.requireViewById(R.id.container);
                C14360o3.A07(requireViewById);
                LinearLayout linearLayout = (LinearLayout) requireViewById;
                linearLayout.setOrientation(1);
                linearLayout.addView(LayoutInflater.from(context4).inflate(R.layout.product_hscroll_loading_placeholder, (ViewGroup) linearLayout, false));
                inflate4.setTag(new C3OO(inflate4));
                shimmerFrameLayout = (ViewGroup) inflate3;
                view = inflate4;
                shimmerFrameLayout.addView(view);
                shimmerFrameLayout4 = shimmerFrameLayout;
                C0f9.A0A(-1514389372, A03);
                return shimmerFrameLayout4;
            case 7:
                Context context5 = this.A01;
                C14360o3.A0B(context5, 0);
                View inflate5 = LayoutInflater.from(context5).inflate(R.layout.shimmer_header_layout, viewGroup, false);
                C14360o3.A0C(inflate5, "null cannot be cast to non-null type com.facebook.shimmer.ShimmerFrameLayout");
                shimmerFrameLayout = (ViewGroup) inflate5;
                view = VVA.A00(context5, viewGroup, false);
                shimmerFrameLayout.addView(view);
                shimmerFrameLayout4 = shimmerFrameLayout;
                C0f9.A0A(-1514389372, A03);
                return shimmerFrameLayout4;
            case 8:
                Context context6 = this.A01;
                C14360o3.A0B(context6, 0);
                ShimmerFrameLayout A003 = C84733qM.A00(context6, viewGroup);
                i2 = -1;
                A003.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                ?? c84803qU = new C84803qU(context6, viewGroup);
                i3 = c84803qU.A0G;
                shimmerFrameLayout3 = A003;
                u19 = c84803qU;
                layoutParams = new ViewGroup.LayoutParams(i2, i3);
                shimmerFrameLayout2 = shimmerFrameLayout3;
                abstractC84813qV2 = u19;
                abstractC84813qV2.setLayoutParams(layoutParams);
                shimmerFrameLayout = shimmerFrameLayout2;
                view = abstractC84813qV2;
                shimmerFrameLayout.addView(view);
                shimmerFrameLayout4 = shimmerFrameLayout;
                C0f9.A0A(-1514389372, A03);
                return shimmerFrameLayout4;
            case 9:
                Context context7 = this.A01;
                C14360o3.A0B(context7, 0);
                ?? inflate6 = LayoutInflater.from(context7).inflate(R.layout.shimmer_immersive_media_layout, viewGroup, false);
                C14360o3.A07(inflate6);
                shimmerFrameLayout4 = inflate6;
                C0f9.A0A(-1514389372, A03);
                return shimmerFrameLayout4;
            case 10:
                final Context context8 = this.A01;
                C14360o3.A0B(context8, 0);
                ?? A004 = C84733qM.A00(context8, viewGroup);
                C14360o3.A0C(A004, "null cannot be cast to non-null type android.view.ViewGroup");
                AbstractC84813qV abstractC84813qV4 = new AbstractC84813qV(context8) { // from class: X.9oG
                    public float A00;
                    public final float A01;
                    public final float A02;
                    public final float A03;
                    public final float A04;
                    public final float A05;
                    public final float A06;
                    public final float A07;
                    public final float A08;
                    public final float A09;
                    public final float A0A;
                    public final float A0B;
                    public final Paint A0C;
                    public final RectF A0D;

                    {
                        super(context8, null);
                        Paint A0R = AbstractC166987dD.A0R();
                        this.A0C = A0R;
                        this.A0D = AbstractC166987dD.A0X();
                        Resources resources = getResources();
                        this.A00 = resources.getDimension(R.dimen.abc_edit_text_inset_top_material);
                        this.A08 = resources.getDimension(R.dimen.account_discovery_bottom_gap);
                        this.A07 = resources.getDimension(R.dimen.abc_dropdownitem_icon_width);
                        this.A0A = resources.getDimension(R.dimen.abc_edit_text_inset_top_material);
                        this.A0B = resources.getDimension(R.dimen.clips_editor_timeline_v3_single_segment_drawer_height);
                        this.A09 = resources.getDimension(R.dimen.action_bar_item_spacing_right);
                        this.A03 = resources.getDimension(R.dimen.abc_dialog_padding_top_material);
                        float dimension = resources.getDimension(R.dimen.abc_edit_text_inset_top_material);
                        this.A01 = dimension;
                        float dimension2 = resources.getDimension(R.dimen.ai_sticker_creation_suggested_prompt_pill_height);
                        this.A05 = resources.getDimension(R.dimen.full_height_media_shimmer_comment_width);
                        float dimension3 = resources.getDimension(R.dimen.action_bar_item_spacing_right);
                        this.A02 = dimension3;
                        this.A06 = resources.getDimension(R.dimen.abc_dropdownitem_icon_width);
                        this.A04 = dimension2 + dimension3 + dimension + dimension3;
                        AbstractC166987dD.A1N(context8, A0R, AbstractC53242c7.A0D(context8));
                        setBackgroundResource(AbstractC53242c7.A04(context8));
                    }

                    @Override // android.view.View
                    public final void onDraw(Canvas canvas) {
                        C14360o3.A0B(canvas, 0);
                        float f = this.A07;
                        float f2 = f / 2.0f;
                        float f3 = this.A00;
                        float f4 = 0.0f + this.A08 + f2;
                        Paint paint = this.A0C;
                        canvas.drawCircle(f3 + f2, f4, f2, paint);
                        float f5 = f3 + f + this.A0A;
                        float f6 = this.A09;
                        float f7 = f4 - (f6 / 2.0f);
                        RectF rectF = this.A0D;
                        rectF.set(f5, f7, this.A0B + f5, f6 + f7);
                        float f8 = this.A06;
                        canvas.drawRoundRect(rectF, f8, f8, paint);
                        float f9 = this.A03;
                        float measuredHeight = 0.0f + (getMeasuredHeight() - this.A04);
                        float f10 = this.A05 + f9;
                        float f11 = this.A02;
                        float f12 = f11 + measuredHeight;
                        rectF.set(f9, measuredHeight, f10, f12);
                        canvas.drawRoundRect(rectF, f8, f8, paint);
                        float f13 = f12 + this.A01;
                        rectF.set(f9, f13, f10, f13 + f11);
                        canvas.drawRoundRect(rectF, f8, f8, paint);
                    }
                };
                abstractC84813qV4.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                A004.addView(abstractC84813qV4);
                ?? c3oo = new C3OO(A004);
                c3oo.A00 = A004;
                A004.setTag(c3oo);
                shimmerFrameLayout4 = A004;
                C0f9.A0A(-1514389372, A03);
                return shimmerFrameLayout4;
            default:
                RuntimeException runtimeException = new RuntimeException();
                C0f9.A0A(-1017447189, A03);
                throw runtimeException;
        }
    }
}
