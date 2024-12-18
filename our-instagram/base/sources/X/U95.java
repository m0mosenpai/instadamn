package X;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.search.common.analytics.SearchContext;
import com.instagram.ui.mediaactions.LikeActionView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;
import java.lang.ref.WeakReference;

/* loaded from: classes11.dex */
public final class U95 extends Handler {
    public WeakReference A00;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i;
        WKs wKs = (WKs) this.A00.get();
        if (wKs != null && message.what == 0) {
            int i2 = WKs.A05;
            C68763Vbg c68763Vbg = wKs.A02;
            wKs.A00.getClass();
            ViewOnTouchListenerC67974V4p viewOnTouchListenerC67974V4p = c68763Vbg.A00;
            InterfaceC56002hn interfaceC56002hn = viewOnTouchListenerC67974V4p.A03;
            if (interfaceC56002hn != null) {
                interfaceC56002hn.COs(viewOnTouchListenerC67974V4p);
                viewOnTouchListenerC67974V4p.A03.setFocusable(true);
                viewOnTouchListenerC67974V4p.A0B = true;
                C69297Vl5 c69297Vl5 = viewOnTouchListenerC67974V4p.A0J;
                Context context = viewOnTouchListenerC67974V4p.A0D;
                UserSession userSession = viewOnTouchListenerC67974V4p.A0G;
                View view = viewOnTouchListenerC67974V4p.A02;
                C38321qM c38321qM = viewOnTouchListenerC67974V4p.A04;
                EnumC74373Vt enumC74373Vt = EnumC74373Vt.A03;
                C75113Zb BRZ = viewOnTouchListenerC67974V4p.BRZ(c38321qM);
                InterfaceC86223st interfaceC86223st = viewOnTouchListenerC67974V4p.A0L;
                C69656Vsx c69656Vsx = (C69656Vsx) AbstractC31172DnG.A0x(view);
                LinearLayout linearLayout = c69656Vsx.A05;
                TouchInterceptorFrameLayout touchInterceptorFrameLayout = c69656Vsx.A07;
                MSY.A10(linearLayout, touchInterceptorFrameLayout.getWidth(), touchInterceptorFrameLayout.getHeight() * 2);
                C76293bZ c76293bZ = new C76293bZ(null, null, new SearchContext(null, null, null, null, null, null, null, null), C05F.A01, "", false, false, false, false, false);
                C85793s8 c85793s8 = c69297Vl5.A04;
                C81283jy c81283jy = c69656Vsx.A08;
                C75563aN c75563aN = c69297Vl5.A03;
                InterfaceC76863cY A04 = c75563aN.A04(context, c38321qM, viewOnTouchListenerC67974V4p, c76293bZ, BRZ, null);
                C77043cq c77043cq = new C77043cq(c75563aN);
                if (BRZ.A0p()) {
                    i = BRZ.getPosition();
                } else {
                    i = -1;
                }
                c85793s8.A06(viewOnTouchListenerC67974V4p, c77043cq, c81283jy, A04, BRZ, i);
                AbstractC167007dF.A0x(c81283jy.A04);
                ((View) c81283jy.A0f.getValue()).setVisibility(8);
                ((View) c81283jy.A0g.getValue()).setVisibility(8);
                C81303k0 c81303k0 = c69656Vsx.A09;
                MediaFrameLayout mediaFrameLayout = c81303k0.A0T;
                mediaFrameLayout.setOnTouchListener(new ViewOnTouchListenerC70254WNz(c38321qM, c69656Vsx, c69297Vl5, interfaceC86223st, BRZ));
                float f = c69656Vsx.A02;
                if (f == 0.0f) {
                    int width = touchInterceptorFrameLayout.getWidth();
                    int height = touchInterceptorFrameLayout.getHeight();
                    int height2 = c81283jy.A0E.getHeight();
                    f = (width - (context.getResources().getDimensionPixelOffset(R.dimen.abc_select_dialog_padding_start_material) * 2)) / ((height - height2) - ((int) c69656Vsx.A00()));
                    c69656Vsx.A02 = f;
                }
                mediaFrameLayout.A00 = Math.max(f, AbstractC22727A0x.A00(c38321qM));
                IgProgressImageView igProgressImageView = c81303k0.A0N;
                igProgressImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                C80113i0 c80113i0 = c69297Vl5.A00;
                if (c80113i0 == null) {
                    c80113i0 = new C80113i0(userSession);
                    c69297Vl5.A00 = c80113i0;
                }
                AbstractC80683ix.A00(viewOnTouchListenerC67974V4p, c80113i0.A00(c69297Vl5.A01, c38321qM), igProgressImageView);
                AbstractC86483tL.A00(new C86473tK(userSession).A00(c38321qM, viewOnTouchListenerC67974V4p.getModuleName()), BRZ, igProgressImageView, c81303k0.A0S, enumC74373Vt);
                C75113Zb c75113Zb = c81303k0.A04;
                if (c75113Zb != null && c75113Zb != BRZ) {
                    LikeActionView likeActionView = c81303k0.A0R;
                    c75113Zb.A0V(likeActionView);
                    c81303k0.A04.A0Y(likeActionView);
                    c81303k0.A04.A0S(c81303k0.A01.A01());
                }
                c81303k0.A04 = BRZ;
                LikeActionView likeActionView2 = c81303k0.A0R;
                BRZ.A0T(likeActionView2);
                c81303k0.A04.A0X(likeActionView2);
                AbstractC86593tX.A0f(new C9BS(null, 2, false, c38321qM.A6d(userSession)), c81303k0.A01, BRZ);
                igProgressImageView.setContentDescription(AbstractC79753hQ.A01(igProgressImageView.getContext(), igProgressImageView.getResources(), viewOnTouchListenerC67974V4p, userSession, c38321qM, null, false));
                ViewOnTouchListenerC67974V4p.A03(viewOnTouchListenerC67974V4p);
                C71068WnQ c71068WnQ = viewOnTouchListenerC67974V4p.A07;
                c71068WnQ.A09 = new WOH(2, c71068WnQ, new RunnableC71358WsT(c68763Vbg));
                c71068WnQ.A0H.getViewTreeObserver().addOnGlobalLayoutListener(c71068WnQ.A09);
                viewOnTouchListenerC67974V4p.A02.setBackgroundDrawable(AbstractC669130i.A00(context, viewOnTouchListenerC67974V4p.A03.ACp()));
                LinearLayout linearLayout2 = viewOnTouchListenerC67974V4p.A06.A05;
                linearLayout2.setTranslationY(0.0f);
                linearLayout2.setScaleX(0.8f);
                linearLayout2.setScaleY(0.8f);
                viewOnTouchListenerC67974V4p.A0I.A01(viewOnTouchListenerC67974V4p.A04, viewOnTouchListenerC67974V4p.A01, viewOnTouchListenerC67974V4p.A00);
                if (ViewOnTouchListenerC67974V4p.A00(viewOnTouchListenerC67974V4p.A04, viewOnTouchListenerC67974V4p.A00).Cff()) {
                    C4AG.A00(userSession).A01(new C4AD(ViewOnTouchListenerC67974V4p.A00(viewOnTouchListenerC67974V4p.A04, viewOnTouchListenerC67974V4p.A00).CFR(), viewOnTouchListenerC67974V4p.getModuleName()));
                }
                viewOnTouchListenerC67974V4p.A0F.A03();
                viewOnTouchListenerC67974V4p.A0A = C05F.A0C;
                wKs.A01 = false;
            }
        }
    }
}
