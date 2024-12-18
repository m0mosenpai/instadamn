package com.instagram.creation.capture.quickcapture.cameradestinationpicker.ui;

import X.AbstractC010103p;
import X.AbstractC13600mm;
import X.AbstractC13880nE;
import X.AbstractC23021Ah;
import X.AbstractC56952jT;
import X.AnonymousClass650;
import X.AnonymousClass652;
import X.C06090Tz;
import X.C128535rM;
import X.C14360o3;
import X.C16930sl;
import X.C1811281o;
import X.C1811381p;
import X.C1811481q;
import X.C1811581r;
import X.C18U;
import X.C208509Kk;
import X.C23031Ai;
import X.C55U;
import X.C81Q;
import X.C81R;
import X.C81S;
import X.C81T;
import X.C81V;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.reboundhorizontalscrollview.ReboundHorizontalScrollView;
import com.instagram.creation.capture.quickcapture.cameradestinationpicker.ui.LegacyCameraDestinationScrollView;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class LegacyCameraDestinationScrollView extends FrameLayout {
    public float A00;
    public List A01;
    public boolean A02;
    public UserSession A03;
    public final View A04;
    public final LinearLayout A05;
    public final ReboundHorizontalScrollView A06;
    public final AnonymousClass652 A07;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LegacyCameraDestinationScrollView(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }

    public static final int A00(C55U c55u) {
        C14360o3.A0B(c55u, 0);
        if (c55u.equals(C81S.A00)) {
            return R.id.cam_dest_live;
        }
        if (c55u.equals(C208509Kk.A00)) {
            return R.id.cam_dest_story;
        }
        if (c55u.equals(C81T.A00)) {
            return R.id.cam_dest_direct;
        }
        if (c55u instanceof C81V) {
            return R.id.cam_dest_clips;
        }
        if (c55u.equals(C128535rM.A00)) {
            return R.id.cam_dest_feed;
        }
        if (c55u.equals(C1811281o.A00)) {
            return R.id.cam_dest_igtv;
        }
        if (c55u.equals(C1811381p.A00)) {
            return R.id.cam_dest_template;
        }
        if (c55u.equals(C1811481q.A00)) {
            return R.id.cam_dest_note;
        }
        if (c55u.equals(C1811581r.A00)) {
            return R.id.cam_dest_profile;
        }
        if (c55u.equals(C81Q.A00)) {
            return R.id.cam_dest_potato;
        }
        if (c55u.equals(C81R.A00)) {
            return R.id.cam_dest_quick_snap;
        }
        throw new RuntimeException();
    }

    public final TextView A02(C55U c55u) {
        int i;
        final boolean z = false;
        C14360o3.A0B(c55u, 0);
        final Context context = getContext();
        View inflate = View.inflate(context, R.layout.camera_destination_label, null);
        C14360o3.A0C(inflate, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) inflate;
        Context context2 = textView.getContext();
        C14360o3.A07(context2);
        if (c55u.equals(C81S.A00)) {
            i = 2131954817;
        } else if (c55u.equals(C208509Kk.A00)) {
            i = 2131954822;
        } else if (c55u.equals(C81T.A00)) {
            i = 2131954814;
        } else if (c55u instanceof C81V) {
            i = 2131954813;
        } else if (c55u.equals(C128535rM.A00)) {
            i = 2131954815;
        } else if (c55u.equals(C1811281o.A00)) {
            i = 2131954816;
        } else if (c55u.equals(C1811381p.A00)) {
            i = 2131954823;
        } else if (c55u.equals(C1811481q.A00)) {
            i = 2131954818;
        } else if (c55u.equals(C1811581r.A00)) {
            i = 2131954820;
        } else if (c55u.equals(C81Q.A00)) {
            i = 2131954819;
        } else if (c55u.equals(C81R.A00)) {
            i = 2131954821;
        } else {
            throw new RuntimeException();
        }
        String string = context2.getString(i);
        C14360o3.A07(string);
        String upperCase = string.toUpperCase(Locale.ROOT);
        C14360o3.A07(upperCase);
        final boolean z2 = true;
        if (this.A01.contains(c55u)) {
            AbstractC010103p.A0G(textView, context.getString(2131954812, Integer.valueOf(this.A01.indexOf(c55u) + 1), Integer.valueOf(this.A01.size())));
        } else {
            AbstractC56952jT.A01(textView);
        }
        UserSession userSession = this.A03;
        if (userSession != null && c55u.equals(C81R.A00)) {
            C23031Ai A00 = AbstractC23021Ah.A00(userSession);
            if (!((Boolean) A00.A4i.CES(A00, C23031Ai.A8c[523])).booleanValue()) {
                UserSession userSession2 = this.A03;
                C06090Tz c06090Tz = C06090Tz.A05;
                if (Boolean.valueOf(C18U.A06(c06090Tz, userSession2, 36325484769850468L)).booleanValue() && Boolean.valueOf(C18U.A06(c06090Tz, this.A03, 36325484770374763L)).booleanValue() && C18U.A06(c06090Tz, userSession, 36325484770899059L)) {
                    C14360o3.A07(context);
                    textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, new Drawable(context, z) { // from class: X.9Rt
                        public final TextPaint A00;
                        public final String A01;
                        public final int A02;
                        public final int A03;
                        public final Context A04;
                        public final Paint A05;
                        public final boolean A06;

                        {
                            this.A04 = context;
                            this.A06 = z;
                            this.A01 = AbstractC166997dE.A0p(context, 2131956543);
                            this.A02 = AbstractC167017dG.A04(context);
                            this.A03 = AbstractC167017dG.A07(context);
                            Paint A0R = AbstractC166987dD.A0R();
                            AbstractC166987dD.A1N(context, A0R, AbstractC53242c7.A0H(context, R.attr.igds_color_creation_tools_blue));
                            this.A05 = A0R;
                            TextPaint textPaint = new TextPaint();
                            AbstractC166987dD.A1N(context, textPaint, AbstractC53242c7.A0A(context));
                            textPaint.setTextSize(AbstractC166987dD.A04(context.getResources(), R.dimen.autocomplete_dropdown_header_text_size));
                            textPaint.setAntiAlias(true);
                            this.A00 = textPaint;
                        }

                        @Override // android.graphics.drawable.Drawable
                        public final int getOpacity() {
                            return -3;
                        }

                        @Override // android.graphics.drawable.Drawable
                        public final void setAlpha(int i2) {
                        }

                        @Override // android.graphics.drawable.Drawable
                        public final void draw(Canvas canvas) {
                            Rect A0Q = AbstractC167017dG.A0Q(this, canvas);
                            canvas.save();
                            canvas.rotate(-5.0f, A0Q.exactCenterX(), A0Q.exactCenterY());
                            boolean z3 = this.A06;
                            if (!z3) {
                                canvas.drawRoundRect(A0Q.left, A0Q.top, A0Q.right, A0Q.bottom, 30.0f, 30.0f, this.A05);
                            }
                            TextPaint textPaint = this.A00;
                            String str = this.A01;
                            int measureText = (int) textPaint.measureText(str);
                            float centerX = A0Q.centerX() - (measureText / 2.0f);
                            float centerY = (A0Q.centerY() + (((int) (textPaint.descent() - textPaint.ascent())) / 2.0f)) - textPaint.descent();
                            if (!z3) {
                                canvas.drawText(str, centerX, centerY, textPaint);
                            }
                            canvas.restore();
                        }

                        @Override // android.graphics.drawable.Drawable
                        public final int getIntrinsicHeight() {
                            TextPaint textPaint = this.A00;
                            return ((int) (textPaint.descent() - textPaint.ascent())) + (this.A03 * 2);
                        }

                        @Override // android.graphics.drawable.Drawable
                        public final int getIntrinsicWidth() {
                            return ((int) this.A00.measureText(this.A01)) + (this.A02 * 2);
                        }

                        @Override // android.graphics.drawable.Drawable
                        public final void setColorFilter(ColorFilter colorFilter) {
                            this.A05.setColorFilter(colorFilter);
                            this.A00.setColorFilter(colorFilter);
                        }
                    }, (Drawable) null, new Drawable(context, z2) { // from class: X.9Rt
                        public final TextPaint A00;
                        public final String A01;
                        public final int A02;
                        public final int A03;
                        public final Context A04;
                        public final Paint A05;
                        public final boolean A06;

                        {
                            this.A04 = context;
                            this.A06 = z2;
                            this.A01 = AbstractC166997dE.A0p(context, 2131956543);
                            this.A02 = AbstractC167017dG.A04(context);
                            this.A03 = AbstractC167017dG.A07(context);
                            Paint A0R = AbstractC166987dD.A0R();
                            AbstractC166987dD.A1N(context, A0R, AbstractC53242c7.A0H(context, R.attr.igds_color_creation_tools_blue));
                            this.A05 = A0R;
                            TextPaint textPaint = new TextPaint();
                            AbstractC166987dD.A1N(context, textPaint, AbstractC53242c7.A0A(context));
                            textPaint.setTextSize(AbstractC166987dD.A04(context.getResources(), R.dimen.autocomplete_dropdown_header_text_size));
                            textPaint.setAntiAlias(true);
                            this.A00 = textPaint;
                        }

                        @Override // android.graphics.drawable.Drawable
                        public final int getOpacity() {
                            return -3;
                        }

                        @Override // android.graphics.drawable.Drawable
                        public final void setAlpha(int i2) {
                        }

                        @Override // android.graphics.drawable.Drawable
                        public final void draw(Canvas canvas) {
                            Rect A0Q = AbstractC167017dG.A0Q(this, canvas);
                            canvas.save();
                            canvas.rotate(-5.0f, A0Q.exactCenterX(), A0Q.exactCenterY());
                            boolean z3 = this.A06;
                            if (!z3) {
                                canvas.drawRoundRect(A0Q.left, A0Q.top, A0Q.right, A0Q.bottom, 30.0f, 30.0f, this.A05);
                            }
                            TextPaint textPaint = this.A00;
                            String str = this.A01;
                            int measureText = (int) textPaint.measureText(str);
                            float centerX = A0Q.centerX() - (measureText / 2.0f);
                            float centerY = (A0Q.centerY() + (((int) (textPaint.descent() - textPaint.ascent())) / 2.0f)) - textPaint.descent();
                            if (!z3) {
                                canvas.drawText(str, centerX, centerY, textPaint);
                            }
                            canvas.restore();
                        }

                        @Override // android.graphics.drawable.Drawable
                        public final int getIntrinsicHeight() {
                            TextPaint textPaint = this.A00;
                            return ((int) (textPaint.descent() - textPaint.ascent())) + (this.A03 * 2);
                        }

                        @Override // android.graphics.drawable.Drawable
                        public final int getIntrinsicWidth() {
                            return ((int) this.A00.measureText(this.A01)) + (this.A02 * 2);
                        }

                        @Override // android.graphics.drawable.Drawable
                        public final void setColorFilter(ColorFilter colorFilter) {
                            this.A05.setColorFilter(colorFilter);
                            this.A00.setColorFilter(colorFilter);
                        }
                    });
                }
            }
        }
        textView.setText(upperCase);
        textView.setContentDescription(upperCase);
        textView.setTag(c55u);
        textView.setId(A00(c55u));
        return textView;
    }

    public static final void A01(LegacyCameraDestinationScrollView legacyCameraDestinationScrollView, float f) {
        int dimension;
        View view = legacyCameraDestinationScrollView.A04;
        int i = 4;
        if (f > 0.0f) {
            i = 0;
        }
        view.setVisibility(i);
        view.setAlpha(AbstractC13600mm.A02(f, 0.1f, 0.9f, 0.0f, 1.0f));
        ReboundHorizontalScrollView reboundHorizontalScrollView = legacyCameraDestinationScrollView.A06;
        reboundHorizontalScrollView.setHorizontalFadingEdgeEnabled(true);
        float A02 = AbstractC13600mm.A02(1.0f - f, 0.5f, 1.0f, 0.0f, 1.0f);
        Resources resources = legacyCameraDestinationScrollView.getResources();
        int dimension2 = (int) (resources.getDimension(R.dimen.action_button_settings_height) * A02);
        if (legacyCameraDestinationScrollView.A02) {
            dimension = 0;
        } else {
            dimension = (int) (A02 * resources.getDimension(R.dimen.abc_list_item_height_material));
        }
        if (AbstractC13880nE.A0C(reboundHorizontalScrollView) != dimension) {
            AbstractC13880nE.A0e(reboundHorizontalScrollView, dimension);
            AbstractC13880nE.A0V(reboundHorizontalScrollView, dimension);
        }
        if (reboundHorizontalScrollView.getHorizontalFadingEdgeLength() != dimension2) {
            reboundHorizontalScrollView.setFadingEdgeLength(dimension2);
        }
    }

    public void setLabelBackgroundProgress(float f) {
        this.A00 = f;
        A01(this, f);
    }

    public void setUserSession(UserSession userSession) {
        this.A03 = userSession;
        if (userSession != null && C18U.A06(C06090Tz.A05, userSession, 36321915652351888L)) {
            this.A04.setBackgroundResource(R.drawable.camera_destination_label_background_2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegacyCameraDestinationScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        Context context2 = getContext();
        C14360o3.A07(context2);
        this.A06 = new ReboundHorizontalScrollView(context2, null, 0);
        View view = new View(context2);
        this.A04 = view;
        LinearLayout linearLayout = new LinearLayout(context2);
        this.A05 = linearLayout;
        this.A01 = C16930sl.A00;
        AnonymousClass650 anonymousClass650 = new AnonymousClass650(this);
        this.A07 = anonymousClass650;
        addView(linearLayout);
        ReboundHorizontalScrollView reboundHorizontalScrollView = this.A06;
        addView(reboundHorizontalScrollView);
        linearLayout.addView(view);
        reboundHorizontalScrollView.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() { // from class: X.653
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                LegacyCameraDestinationScrollView legacyCameraDestinationScrollView = LegacyCameraDestinationScrollView.this;
                legacyCameraDestinationScrollView.A05.setScrollX(legacyCameraDestinationScrollView.A06.getScrollX());
            }
        });
        reboundHorizontalScrollView.A0A(anonymousClass650);
        reboundHorizontalScrollView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: X.654
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                LegacyCameraDestinationScrollView legacyCameraDestinationScrollView = LegacyCameraDestinationScrollView.this;
                ReboundHorizontalScrollView reboundHorizontalScrollView2 = legacyCameraDestinationScrollView.A06;
                int childCount = reboundHorizontalScrollView2.getChildCount();
                int i10 = 0;
                for (int i11 = 0; i11 < childCount; i11++) {
                    i10 += reboundHorizontalScrollView2.getChildAt(i11).getWidth();
                }
                Resources resources = legacyCameraDestinationScrollView.getResources();
                int dimensionPixelSize = i10 + resources.getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size);
                View view3 = legacyCameraDestinationScrollView.A04;
                if (view3.getWidth() != dimensionPixelSize) {
                    AbstractC13880nE.A0g(view3, dimensionPixelSize);
                }
                if (view3.getHeight() != dimensionPixelSize2) {
                    AbstractC13880nE.A0W(view3, dimensionPixelSize2);
                }
            }
        });
        view.setBackgroundResource(R.drawable.camera_destination_label_background);
        view.setVisibility(4);
        AbstractC13880nE.A0g(linearLayout, -1);
        AbstractC13880nE.A0W(linearLayout, -1);
        linearLayout.setGravity(17);
        Resources resources = getResources();
        linearLayout.setBackgroundColor(resources.getColor(R.color.fds_transparent));
        AbstractC13880nE.A0g(reboundHorizontalScrollView, -1);
        AbstractC13880nE.A0W(reboundHorizontalScrollView, -1);
        reboundHorizontalScrollView.setGravity(17);
        reboundHorizontalScrollView.setBackgroundColor(resources.getColor(R.color.fds_transparent));
    }

    public /* synthetic */ LegacyCameraDestinationScrollView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LegacyCameraDestinationScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }
}
