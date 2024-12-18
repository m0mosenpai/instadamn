package X;

import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.OnLifecycleEvent;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;
import com.instagram.creation.photo.crop.LayoutImageView;

/* renamed from: X.UJo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66486UJo extends C3OO implements C07W {
    public Surface A00;
    public TextureView A01;
    public C195868lW A02;
    public InterfaceC95344Qu A03;
    public String A04;
    public boolean A05;
    public final int A06;
    public final View A07;
    public final ImageView A08;
    public final ConstraintLayout A09;
    public final FragmentActivity A0A;
    public final InterfaceC58362lv A0B;
    public final UserSession A0C;
    public final ColorFilterAlphaImageView A0D;
    public final U7M A0E;
    public final C8IW A0F;
    public final LayoutImageView A0G;
    public final InterfaceC08830cm A0H;

    public static void A00(C66486UJo c66486UJo) {
        InterfaceC95344Qu interfaceC95344Qu = c66486UJo.A03;
        if (interfaceC95344Qu == null) {
            interfaceC95344Qu = (InterfaceC95344Qu) c66486UJo.A0H.get();
            c66486UJo.A03 = interfaceC95344Qu;
        }
        U7M u7m = c66486UJo.A0E;
        C14360o3.A0B(interfaceC95344Qu, 0);
        U7M.A00(u7m);
        u7m.A01.put(interfaceC95344Qu, true);
        C02R.A03(c66486UJo.A03, "should not be null if playing video");
        if (c66486UJo.A04 == null) {
            AbstractC12120kG.A01("LayoutCaptureGridAdapter", "video file path is null during attempt to play video");
            return;
        }
        c66486UJo.A03.reset();
        android.net.Uri A01 = AbstractC08820cl.A01(C66017TyF.A0B, c66486UJo.A04);
        if (A01 != null) {
            c66486UJo.A03.ESy(A01, null, null, "LayoutCaptureGridAdapter", true, false);
        }
        InterfaceC95344Qu interfaceC95344Qu2 = c66486UJo.A03;
        ((C95334Qt) interfaceC95344Qu2).A0M = new C68104VBi(c66486UJo);
        interfaceC95344Qu2.E5Q(null, null);
        Surface surface = c66486UJo.A00;
        if (surface == null) {
            return;
        }
        c66486UJo.A03.setSurface(surface);
    }

    public static void A01(C66486UJo c66486UJo) {
        InterfaceC95344Qu interfaceC95344Qu = c66486UJo.A03;
        if (interfaceC95344Qu != null) {
            C15500q5.A04(c66486UJo.A0E.A01).remove(interfaceC95344Qu);
            c66486UJo.A03.EE5(false);
            c66486UJo.A03 = null;
        }
        Surface surface = c66486UJo.A00;
        if (surface != null) {
            surface.release();
            c66486UJo.A00 = null;
        }
    }

    public static void A02(C66486UJo c66486UJo, AAF aaf) {
        C195868lW c195868lW = aaf.A05;
        if (c195868lW == null) {
            c66486UJo.A08.setVisibility(8);
            return;
        }
        boolean z = c195868lW.A1H;
        int i = R.drawable.instagram_volume_off_outline_16;
        if (z) {
            i = R.drawable.instagram_volume_outline_16;
        }
        c66486UJo.A08.setImageResource(i);
    }

    public final void A03() {
        this.A0D.setVisibility(8);
        this.A08.setVisibility(8);
        this.A07.setVisibility(8);
    }

    public final void A04(boolean z) {
        ColorFilterAlphaImageView colorFilterAlphaImageView = this.A0D;
        if (colorFilterAlphaImageView.getVisibility() == 0) {
            A03();
            return;
        }
        colorFilterAlphaImageView.setVisibility(0);
        this.A08.setVisibility(AbstractC167007dF.A05(z ? 1 : 0));
        View view = this.A07;
        view.animate().cancel();
        FragmentActivity fragmentActivity = this.A0A;
        AbstractC31172DnG.A1B(fragmentActivity, view, AbstractC53242c7.A0H(fragmentActivity, R.attr.igds_color_dimmer));
        view.setAlpha(0.7f);
        view.setVisibility(0);
    }

    @OnLifecycleEvent(C07R.ON_PAUSE)
    public void onPaused() {
        InterfaceC95344Qu interfaceC95344Qu = this.A03;
        if (interfaceC95344Qu != null) {
            interfaceC95344Qu.pause();
        }
    }

    @OnLifecycleEvent(C07R.ON_RESUME)
    public void onResumed() {
        InterfaceC95344Qu interfaceC95344Qu;
        if (!this.A0F.A01 && (interfaceC95344Qu = this.A03) != null) {
            interfaceC95344Qu.start();
        }
    }

    public C66486UJo(View view, FragmentActivity fragmentActivity, UserSession userSession, U7M u7m, C8IW c8iw, InterfaceC08830cm interfaceC08830cm) {
        super(view);
        this.A06 = AbstractC62402sf.A00.getAndIncrement();
        this.A05 = false;
        this.A0A = fragmentActivity;
        this.A09 = (ConstraintLayout) view;
        this.A0G = (LayoutImageView) view.requireViewById(R.id.layout_captured_preview);
        this.A07 = view.requireViewById(R.id.layout_captured_preview_overlay);
        this.A0D = (ColorFilterAlphaImageView) view.requireViewById(R.id.layout_captured_preview_delete_button);
        this.A08 = (ImageView) view.requireViewById(R.id.layout_captured_preview_audio_toggle_button);
        this.A0F = c8iw;
        this.A0E = u7m;
        this.A0H = interfaceC08830cm;
        this.A0C = userSession;
        this.A0B = new C70303WQi(this, 40);
    }
}
