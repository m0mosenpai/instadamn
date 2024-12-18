package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.mediaactions.LikeActionView;
import com.instagram.ui.mediaactions.MediaActionsView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout;

/* renamed from: X.Vsx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69656Vsx {
    public final View A03;
    public final LinearLayout A04;
    public final LinearLayout A05;
    public final IgTextView A06;
    public final TouchInterceptorFrameLayout A07;
    public final C81283jy A08;
    public final C81303k0 A09;
    public final RoundedCornerConstraintLayout A0A;
    public final UCG[] A0B;
    public float A02 = 0.0f;
    public float A00 = 0.0f;
    public float A01 = 0.0f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [android.widget.LinearLayout, android.view.View, X.UCG, android.view.ViewGroup] */
    public C69656Vsx(Context context, View view, InterfaceC65702y7 interfaceC65702y7) {
        this.A07 = (TouchInterceptorFrameLayout) view;
        this.A05 = (LinearLayout) view.requireViewById(R.id.peek_container);
        this.A0A = (RoundedCornerConstraintLayout) view.requireViewById(R.id.media_container);
        this.A03 = view.requireViewById(R.id.action_list_drag_bar);
        this.A06 = (IgTextView) view.requireViewById(R.id.swipe_up_prompt);
        View requireViewById = view.requireViewById(R.id.media_header);
        AbstractC31172DnG.A1B(requireViewById.getContext(), requireViewById, AbstractC53242c7.A0D(context));
        this.A08 = AbstractC85893sI.A00(requireViewById);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        MediaFrameLayout mediaFrameLayout = (MediaFrameLayout) view.requireViewById(R.id.media_group);
        IgProgressImageView igProgressImageView = (IgProgressImageView) view.requireViewById(R.id.row_feed_photo_imageview);
        LikeActionView likeActionView = (LikeActionView) view.requireViewById(R.id.like_heart);
        MediaActionsView mediaActionsView = (MediaActionsView) view.requireViewById(R.id.row_feed_media_actions);
        C3W4 c3w4 = new C3W4((ViewStub) view.requireViewById(R.id.audio_icon_view_stub));
        C86013sY c86013sY = new C86013sY((ViewStub) view.findViewById(R.id.media_subtitle_view_stub), false);
        C86073se A00 = AbstractC86053sc.A00((ViewStub) view.findViewById(R.id.media_cover_view_stub));
        AbstractC25233BEq.A0x(3, mediaFrameLayout, igProgressImageView, likeActionView);
        C14360o3.A0B(mediaActionsView, 6);
        C81303k0 c81303k0 = new C81303k0(view, null, null, c3w4, null, null, c86013sY, null, null, null, null, null, null, null, null, null, null, null, null, null, A00, igProgressImageView, null, null, null, null, null, null, null, null, likeActionView, mediaActionsView, mediaFrameLayout);
        this.A09 = c81303k0;
        c81303k0.A0T.setTag(this);
        IgProgressImageView igProgressImageView2 = c81303k0.A0N;
        igProgressImageView2.setPostProcessor(interfaceC65702y7);
        igProgressImageView2.A05();
        igProgressImageView2.setProgressiveImageConfig(new C80673iw());
        this.A04 = (LinearLayout) view.requireViewById(R.id.action_list);
        this.A0B = new UCG[4];
        int i2 = 0;
        while (true) {
            UCG[] ucgArr = this.A0B;
            if (i2 < ucgArr.length) {
                C14360o3.A0B(context, 1);
                ?? linearLayout = new LinearLayout(context, null, 0);
                LayoutInflater.from(context).inflate(R.layout.grid_quick_preview_button_layout, (ViewGroup) linearLayout);
                linearLayout.A00 = (IgTextView) linearLayout.requireViewById(R.id.button_label);
                ucgArr[i2] = linearLayout;
                this.A04.addView(this.A0B[i2]);
                i2++;
            } else {
                return;
            }
        }
    }

    public final float A00() {
        float f = this.A01;
        if (f == 0.0f) {
            LinearLayout linearLayout = this.A04;
            float height = linearLayout.getChildAt(1).getHeight() * 2.5f;
            float f2 = this.A00;
            if (f2 == 0.0f) {
                linearLayout.getChildAt(0).getLayoutParams().getClass();
                f2 = r2.getHeight() + ((ViewGroup.MarginLayoutParams) r0).topMargin;
                this.A00 = f2;
            }
            float f3 = height + f2;
            this.A01 = f3;
            return f3;
        }
        return f;
    }
}
