package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import com.facebook.R;
import com.facebook.systrace.Systrace;
import com.instagram.feed.widget.IgProgressImageView;

/* renamed from: X.3tL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC86483tL {
    public static ColorDrawable A00;

    public static final void A00(C9BD c9bd, C75113Zb c75113Zb, IgProgressImageView igProgressImageView, InterfaceC74323Vo interfaceC74323Vo, EnumC74373Vt enumC74373Vt) {
        C14360o3.A0B(interfaceC74323Vo, 0);
        C14360o3.A0B(enumC74373Vt, 2);
        C14360o3.A0B(c9bd, 3);
        C14360o3.A0B(c75113Zb, 4);
        boolean A0E = Systrace.A0E(1L);
        if (A0E) {
            C0fO.A01("FeedVideoBinder#bindView", -585765627);
        }
        if (c9bd.A04) {
            if ((enumC74373Vt != EnumC74373Vt.A0C || c75113Zb.A0l.A00()) && enumC74373Vt != EnumC74373Vt.A03) {
                if (enumC74373Vt != EnumC74373Vt.A05 && enumC74373Vt != EnumC74373Vt.A06) {
                    igProgressImageView.setVisibility(0);
                } else {
                    igProgressImageView.setVisibility(8);
                    c75113Zb.A30 = false;
                }
            } else {
                if (!c9bd.A01 && !c9bd.A03) {
                    interfaceC74323Vo.EcU(c75113Zb.A0Y, true);
                } else {
                    interfaceC74323Vo.setShouldShowCountdownTimer(false);
                }
                igProgressImageView.setVisibility(8);
            }
            igProgressImageView.setEnableProgressBar(false);
            if (!c9bd.A02) {
                if (enumC74373Vt == EnumC74373Vt.A08) {
                    interfaceC74323Vo.EJr();
                }
                interfaceC74323Vo.setVideoIconState(enumC74373Vt);
            }
            Context context = igProgressImageView.getContext();
            C14360o3.A07(context);
            ColorDrawable colorDrawable = A00;
            if (colorDrawable == null) {
                colorDrawable = new ColorDrawable(context.getColor(R.color.design_dark_default_color_on_background));
                A00 = colorDrawable;
            }
            igProgressImageView.setBackground(colorDrawable);
        } else {
            igProgressImageView.setEnableProgressBar(true);
            igProgressImageView.setVisibility(0);
            igProgressImageView.A06(R.id.listener_id_for_media_video_binder);
            igProgressImageView.setBackground(null);
            interfaceC74323Vo.setVideoIconState(EnumC74373Vt.A05);
        }
        if (A0E) {
            C0fO.A00(-2098327494);
        }
    }
}
