package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import com.facebook.R;
import com.facebook.systrace.Systrace;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.mediaactions.ScrubberPreviewThumbnailView;

/* renamed from: X.3it, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC80643it {
    public static final void A00(Context context, InterfaceC80063hv interfaceC80063hv, C86183sp c86183sp, boolean z, boolean z2, boolean z3, boolean z4) {
        int i;
        View A01;
        View A012;
        C14360o3.A0B(interfaceC80063hv, 5);
        C86013sY c86013sY = c86183sp.A01;
        if (!z4 && (A012 = c86013sY.A03.A01()) != null) {
            AbstractC56932jR.A04(A012, 4);
        }
        if (z) {
            if (z4 && (A01 = c86013sY.A03.A01()) != null) {
                AbstractC56932jR.A04(A01, 4);
            }
            c86013sY.A02 = true;
            c86013sY.A01 = interfaceC80063hv;
            Resources resources = context.getResources();
            if (z3) {
                i = R.dimen.caption_overlay_offset_with_social_bubble;
                if (z2) {
                    i = R.dimen.caption_overlay_offset_with_social_bubble_and_uas;
                }
            } else {
                i = R.dimen.action_bar_item_spacing_right;
                if (z2) {
                    i = R.dimen.abc_alert_dialog_button_dimen;
                }
            }
            c86013sY.A00 = resources.getDimensionPixelSize(i);
        } else {
            c86013sY.A01 = null;
            c86013sY.A02 = false;
        }
        AbstractC86533tR.A00(c86013sY);
    }

    public static final void A01(SeekBar.OnSeekBarChangeListener onSeekBarChangeListener, C79553h6 c79553h6, C86033sa c86033sa) {
        C14360o3.A0B(c79553h6, 1);
        C14360o3.A0B(onSeekBarChangeListener, 2);
        if (c79553h6.A04) {
            InterfaceC09390do interfaceC09390do = c86033sa.A03;
            ProgressBar progressBar = (ProgressBar) interfaceC09390do.getValue();
            Context context = progressBar.getContext();
            C14360o3.A07(context);
            int A04 = (int) AbstractC13880nE.A04(context, (int) c79553h6.A00);
            progressBar.setMax((int) c79553h6.A01);
            progressBar.setPadding(progressBar.getPaddingLeft(), A04, progressBar.getPaddingRight(), progressBar.getPaddingBottom());
            C75363a3 c75363a3 = c79553h6.A02;
            if (c75363a3 != null) {
                ((ScrubberPreviewThumbnailView) c86033sa.A05.getValue()).A01(c75363a3);
            }
            View view = (View) interfaceC09390do.getValue();
            if (view.isLaidOut() && !view.isLayoutRequested()) {
                Context context2 = ((View) interfaceC09390do.getValue()).getContext();
                C14360o3.A07(context2);
                int A042 = (int) AbstractC13880nE.A04(context2, 16);
                AbstractC010103p.A0H((View) interfaceC09390do.getValue(), AbstractC16960so.A1Q(new Rect(0, 0, A042, view.getHeight()), new Rect(view.getWidth() - A042, 0, view.getWidth(), view.getHeight())));
            } else {
                view.addOnLayoutChangeListener(new LQ8(c86033sa));
            }
            ((SeekBar) interfaceC09390do.getValue()).setOnSeekBarChangeListener(new C28699Clr(onSeekBarChangeListener, c79553h6, c86033sa));
            ((View) c86033sa.A01.getValue()).setVisibility(0);
            return;
        }
        c86033sa.A00();
    }

    public static final void A02(InterfaceC59152nG interfaceC59152nG, InterfaceC60442pS interfaceC60442pS, C80143i3 c80143i3, InterfaceC79883hd interfaceC79883hd, C75113Zb c75113Zb, IgProgressImageView igProgressImageView, String str, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, boolean z) {
        int color;
        C14360o3.A0B(c80143i3, 1);
        C14360o3.A0B(c75113Zb, 2);
        C14360o3.A0B(interfaceC79883hd, 4);
        C14360o3.A0B(interfaceC59152nG, 6);
        boolean A0E = Systrace.A0E(1L);
        if (A0E) {
            C0fO.A01("MediaViewBinder#bindImageMedia", -33197817);
        }
        if (str != null) {
            color = Color.parseColor(str);
        } else {
            Context context = igProgressImageView.getContext();
            color = context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_primary_background));
        }
        igProgressImageView.setPlaceHolderColor(new ColorDrawable(color));
        igProgressImageView.setAlpha(255.0f);
        igProgressImageView.getIgImageView().clearColorFilter();
        igProgressImageView.A0A(new C37311GcD(c75113Zb, interfaceC16660sJ), R.id.listener_id_for_media_view_binder);
        igProgressImageView.setOnFallbackListener(new C37312GcE(interfaceC79883hd));
        igProgressImageView.A0D.put(R.id.listener_id_for_media_view_binder, new C37313GcF(c75113Zb));
        igProgressImageView.setPostProcessor(interfaceC59152nG);
        igProgressImageView.setProgressiveImageConfig(new C80673iw());
        c75113Zb.A0U = 0;
        AbstractC80683ix.A01(interfaceC60442pS, c80143i3, igProgressImageView, z, false);
        interfaceC16660sJ2.invoke(igProgressImageView);
        if (A0E) {
            C0fO.A00(89972057);
        }
    }
}
