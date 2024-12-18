package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.reels.interactive.view.AvatarView;
import com.instagram.ui.widget.base.AspectRatioLinearLayout;

/* renamed from: X.Gwb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38515Gwb extends C3OO implements InterfaceC55932he {
    public View.OnClickListener A00;
    public final GradientDrawable A01;
    public final GradientDrawable A02;
    public final View A03;
    public final View A04;
    public final View A05;
    public final View A06;
    public final TextView A07;
    public final TextView A08;
    public final C3PF A09;
    public final IgImageView A0A;
    public final IgImageView A0B;
    public final IgImageView A0C;
    public final AvatarView A0D;
    public final AspectRatioLinearLayout A0E;

    @Override // X.InterfaceC55932he
    public final void Dnj(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnk(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnl(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnm(C55982hj c55982hj) {
        float f = (float) c55982hj.A09.A00;
        this.itemView.setScaleX(f);
        this.itemView.setScaleY(f);
    }

    public C38515Gwb(View view, int i) {
        super(view);
        int A00;
        int A002;
        int A003;
        Resources A0M = AbstractC25228BEl.A0M(view);
        this.A03 = view.requireViewById(R.id.question_response_item_container);
        AspectRatioLinearLayout aspectRatioLinearLayout = (AspectRatioLinearLayout) view.requireViewById(R.id.question_response_card);
        this.A0E = aspectRatioLinearLayout;
        ViewStub A0G = AbstractC31173DnH.A0G(view, R.id.question_response);
        A0G.setLayoutResource(i);
        this.A05 = A0G.inflate();
        this.A08 = AbstractC166997dE.A0T(view, R.id.question_responder);
        this.A0D = (AvatarView) view.requireViewById(R.id.question_responder_avatar);
        IgImageView A0Z = AbstractC31172DnG.A0Z(view, R.id.question_responder_overflow);
        this.A0C = A0Z;
        if (A0Z.getParent() != null) {
            View view2 = (View) A0Z.getParent();
            int A05 = AbstractC166997dE.A05(A0M);
            Object parent = A0Z.getParent();
            Rect A0U = AbstractC166987dD.A0U();
            View view3 = A0Z;
            A0Z.getHitRect(A0U);
            while (true) {
                Object parent2 = view3.getParent();
                if (parent2 == parent || parent2 == null || !(parent2 instanceof View)) {
                    break;
                }
                view3 = (View) parent2;
                A0U.offset(view3.getLeft(), view3.getTop());
            }
            boolean z = parent instanceof View;
            int i2 = 0;
            if (A05 == -1) {
                if (z) {
                    A00 = A0Z.getLeft();
                    A002 = A0Z.getTop();
                    View view4 = (View) parent;
                    A003 = view4.getWidth() - A0Z.getRight();
                    i2 = view4.getHeight() - A0Z.getBottom();
                } else {
                    A00 = 0;
                    A002 = 0;
                    A003 = 0;
                }
            } else {
                Context context = A0Z.getContext();
                float f = A05;
                A00 = AbstractC69815Vw1.A00(context, f);
                A002 = AbstractC69815Vw1.A00(context, f);
                A003 = AbstractC69815Vw1.A00(context, f);
                i2 = AbstractC69815Vw1.A00(context, f);
            }
            A0U.left -= A00;
            A0U.top -= A002;
            A0U.right += A003;
            A0U.bottom += i2;
            view2.setTouchDelegate(new TouchDelegate(A0U, A0Z));
        }
        this.A04 = view.requireViewById(R.id.question_cta);
        this.A06 = view.requireViewById(R.id.question_unread_dot);
        this.A07 = AbstractC166997dE.A0T(view, R.id.question_cta_text);
        this.A0A = AbstractC31172DnG.A0Z(view, R.id.question_cta_arrow);
        this.A0B = AbstractC31172DnG.A0Z(view, R.id.question_cta_icon);
        C3P9 A0s = AbstractC166987dD.A0s(view);
        A0s.A04 = new C37846Gl0(this, 10);
        A0s.A07 = true;
        A0s.A0D = true;
        C3PF A004 = A0s.A00();
        this.A09 = A004;
        view.setOnTouchListener(A004);
        float dimensionPixelSize = A0M.getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material);
        float[] fArr = {0.0f, 0.0f, 0.0f, 0.0f, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize};
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.A01 = gradientDrawable;
        gradientDrawable.setCornerRadii(fArr);
        gradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        this.A02 = gradientDrawable2;
        gradientDrawable2.setCornerRadii(fArr);
        aspectRatioLinearLayout.setAspectRatio(A0M.getDimensionPixelSize(R.dimen.intent_aware_ad_rifu_card_large_width) / A0M.getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_width));
    }
}
