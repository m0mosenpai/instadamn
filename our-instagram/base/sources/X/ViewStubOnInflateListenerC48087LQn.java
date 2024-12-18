package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.LQn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class ViewStubOnInflateListenerC48087LQn implements ViewStub.OnInflateListener {
    public final int A00;
    public final Object A01;

    public ViewStubOnInflateListenerC48087LQn(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // android.view.ViewStub.OnInflateListener
    public final void onInflate(ViewStub viewStub, View view) {
        C56302iJ c56302iJ;
        if (this.A00 != 0) {
            C48624Lf0 c48624Lf0 = (C48624Lf0) this.A01;
            IgSimpleImageView igSimpleImageView = (IgSimpleImageView) view.requireViewById(R.id.sticker_view);
            ViewOnClickListenerC23249ASk.A00(igSimpleImageView, 18, c48624Lf0);
            c48624Lf0.A02 = igSimpleImageView;
            IgTextView A0X = AbstractC31172DnG.A0X(view, R.id.like_count);
            Context context = A0X.getContext();
            Drawable drawable = context.getDrawable(R.drawable.instapal_instapal_heart);
            int A03 = AbstractC167017dG.A03(context);
            if (drawable != null) {
                drawable.setBounds(0, 0, A03, A03);
            }
            A0X.setCompoundDrawables(drawable, null, null, null);
            c48624Lf0.A03 = A0X;
            c48624Lf0.A01 = (IgFrameLayout) view.requireViewById(R.id.play_animation_container);
            ViewOnClickListenerC48063LPo.A00(view.requireViewById(R.id.sticker_option_1), 24, c48624Lf0);
            ViewOnClickListenerC48063LPo.A00(view.requireViewById(R.id.sticker_option_2), 25, c48624Lf0);
            ViewOnClickListenerC48063LPo.A00(view.requireViewById(R.id.sticker_option_3), 26, c48624Lf0);
            ViewOnClickListenerC48063LPo.A00(view.requireViewById(R.id.sticker_option_4), 27, c48624Lf0);
            View requireViewById = view.requireViewById(R.id.drawable_container_bottom_guideline);
            ViewGroup.LayoutParams layoutParams = requireViewById.getLayoutParams();
            if ((layoutParams instanceof C56302iJ) && (c56302iJ = (C56302iJ) layoutParams) != null) {
                c56302iJ.A0W = c48624Lf0.A0A.getHeight() - c48624Lf0.A0E.getHeight();
                requireViewById.setLayoutParams(c56302iJ);
            }
            C48624Lf0.A02(c48624Lf0, EnumC46218Kcu.A07);
            return;
        }
        View A0S = AbstractC166997dE.A0S(view, R.id.no_avatar_nux_button);
        AbstractC45465KBa abstractC45465KBa = (AbstractC45465KBa) this.A01;
        if (C18U.A06(C06090Tz.A05, AbstractC31178DnM.A0M(abstractC45465KBa.A0S), 36325278612206558L)) {
            ImageView A0I = AbstractC31173DnH.A0I(view, R.id.no_avatar_nux_image);
            ViewStub viewStub2 = abstractC45465KBa.A01;
            if (viewStub2 != null) {
                AbstractC166997dE.A19(viewStub2.getContext(), A0I, R.drawable.ig_avatars_style_2_g6_casual_alpha_style2);
            } else {
                C14360o3.A0F("noAvatarNux");
                throw C00O.createAndThrow();
            }
        }
        ViewOnClickListenerC48064LPp.A00(A0S, 15, abstractC45465KBa);
    }
}
