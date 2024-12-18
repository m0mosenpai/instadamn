package X;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.ViewStub;
import android.view.animation.LinearInterpolator;
import android.widget.ScrollView;
import com.facebook.R;
import com.facebook.browser.lite.BrowserLiteFragment;
import com.instagram.api.schemas.IABScreenshotEffectOnUserAction;
import com.instagram.api.schemas.IABScreenshotTransitionTime;
import com.instagram.api.schemas.IGAdsIABScreenshotDataDict;
import com.instagram.api.schemas.IGAdsIABScreenshotVariant;
import com.instagram.common.session.UserSession;
import java.util.Timer;

/* loaded from: classes11.dex */
public final class UM2 extends AbstractC63223SfY implements BEG, InterfaceC65639Tq2, InterfaceC65638Tq1, BCM {
    public View A00;
    public ScrollView A01;
    public SO3 A02;
    public AbstractC59202nL A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final long A09;
    public final IGAdsIABScreenshotDataDict A0A;
    public final UserSession A0B;
    public final Integer A0C;
    public final String A0D;
    public final Timer A0E;
    public final boolean A0F;

    public UM2(IGAdsIABScreenshotDataDict iGAdsIABScreenshotDataDict, UserSession userSession, String str) {
        Integer num;
        IABScreenshotTransitionTime Bqt = iGAdsIABScreenshotDataDict.Bqt();
        if (Bqt != null) {
            int ordinal = Bqt.ordinal();
            if (ordinal != 2) {
                if (ordinal == 3) {
                    num = C05F.A01;
                }
            } else {
                num = C05F.A0C;
            }
            C06090Tz c06090Tz = C06090Tz.A05;
            long A01 = C18U.A01(c06090Tz, userSession, 36605151565714654L);
            C14360o3.A0B(num, 2);
            this.A0D = str;
            this.A0C = num;
            this.A09 = A01;
            this.A0A = iGAdsIABScreenshotDataDict;
            this.A0B = userSession;
            this.A0E = new Timer("IABScreenshotPreviewTimeout");
            this.A0F = C18U.A06(c06090Tz, userSession, 36323676588944877L);
        }
        num = C05F.A00;
        C06090Tz c06090Tz2 = C06090Tz.A05;
        long A012 = C18U.A01(c06090Tz2, userSession, 36605151565714654L);
        C14360o3.A0B(num, 2);
        this.A0D = str;
        this.A0C = num;
        this.A09 = A012;
        this.A0A = iGAdsIABScreenshotDataDict;
        this.A0B = userSession;
        this.A0E = new Timer("IABScreenshotPreviewTimeout");
        this.A0F = C18U.A06(c06090Tz2, userSession, 36323676588944877L);
    }

    public static final C5FF A00(Context context, IABScreenshotEffectOnUserAction iABScreenshotEffectOnUserAction, IGAdsIABScreenshotVariant iGAdsIABScreenshotVariant, Float f) {
        if (f == null) {
            return null;
        }
        float floatValue = f.floatValue();
        if (floatValue == 0.0f) {
            return null;
        }
        if (IGAdsIABScreenshotVariant.A05 != iGAdsIABScreenshotVariant && IABScreenshotEffectOnUserAction.A04 != iABScreenshotEffectOnUserAction) {
            if (IGAdsIABScreenshotVariant.A06 != iGAdsIABScreenshotVariant && IABScreenshotEffectOnUserAction.A05 != iABScreenshotEffectOnUserAction) {
                return null;
            }
            int i = -16777216;
            if (floatValue > 0.0f) {
                i = -1;
            }
            return new UOY(i, Float.valueOf(Math.abs(floatValue)));
        }
        return new UOZ(context, (int) (floatValue * AbstractC65702TsY.A00(context)));
    }

    public final synchronized void A01() {
        ViewPropertyAnimator animate;
        if (this.A08) {
            this.A08 = false;
            SO3 so3 = this.A02;
            if (so3 == null) {
                C14360o3.A0F("logger");
                throw C00O.createAndThrow();
            }
            if (!so3.A00) {
                so3.A00 = true;
                C23016ACq c23016ACq = so3.A03;
                if (c23016ACq != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    boolean z = c23016ACq.A0p;
                    if (z) {
                        c23016ACq.A0U = Long.valueOf(currentTimeMillis);
                    }
                    if (z) {
                        c23016ACq.A0S = false;
                    }
                }
            }
            Timer timer = this.A0E;
            timer.cancel();
            timer.purge();
            C57243PbR c57243PbR = new C57243PbR(this, 2);
            long j = this.A09;
            if (j > 0) {
                View view = this.A00;
                if (view != null && (animate = view.animate()) != null) {
                    animate.setInterpolator(new LinearInterpolator());
                    animate.setDuration(j);
                    animate.alpha(0.0f);
                    animate.setStartDelay(0L);
                    animate.withEndAction(new RunnableC71239WqU(c57243PbR));
                    animate.start();
                }
            } else {
                c57243PbR.invoke();
            }
        }
    }

    @Override // X.AbstractC63223SfY, X.BCM
    public final void DFB(Context context, Intent intent, View view, InterfaceC172717mh interfaceC172717mh, InterfaceC65594Tnc interfaceC65594Tnc, InterfaceC172727mi interfaceC172727mi) {
        C14360o3.A0B(context, 0);
        AbstractC167027dH.A0a(1, intent, view, interfaceC172717mh, interfaceC172727mi);
        this.A02 = new SO3(interfaceC172717mh);
        super.DFB(context, intent, view, interfaceC172717mh, interfaceC65594Tnc, interfaceC172727mi);
        this.A03 = new UN3(this, new UN2(this));
        View view2 = ((BrowserLiteFragment) interfaceC172717mh).A0B;
        if (view2 != null) {
            ViewStub A0M = AbstractC167007dF.A0M(view2, R.id.screenshot_preview_overlay);
            A0M.setLayoutResource(R.layout.iab_screenshot_imageview);
            View inflate = A0M.inflate();
            C14360o3.A0C(inflate, "null cannot be cast to non-null type android.widget.ScrollView");
            ScrollView scrollView = (ScrollView) inflate;
            View A0S = AbstractC166997dE.A0S(scrollView, R.id.iab_screenshot_image_view);
            this.A00 = A0S;
            this.A01 = scrollView;
            IGAdsIABScreenshotDataDict iGAdsIABScreenshotDataDict = this.A0A;
            A02(A0S, A00(context, null, iGAdsIABScreenshotDataDict.Bqv(), iGAdsIABScreenshotDataDict.Bqr()));
            this.A08 = true;
            WNN.A00(A0S, 6, this);
            if (iGAdsIABScreenshotDataDict.BQ3() != null) {
                this.A0E.schedule(new X27(this), ((int) r0.floatValue()) * 1000);
                return;
            }
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.AbstractC63223SfY, X.InterfaceC65639Tq2
    public final void DXW(QF6 qf6, long j) {
        C14360o3.A0B(qf6, 0);
        this.A07 = true;
        if (this.A0C == C05F.A01) {
            A01();
        }
    }

    public final void A02(View view, C5FF c5ff) {
        C27811Wj A00 = C1X4.A00(C27771Wf.A0b);
        A00.A0O = c5ff;
        C27771Wf c27771Wf = new C27771Wf(A00);
        InterfaceC59172nI A002 = C6BY.A00(android.net.Uri.parse(this.A0D), null);
        AbstractC59202nL abstractC59202nL = this.A03;
        if (abstractC59202nL != null) {
            AbstractC59222nN.A00(view, abstractC59202nL, c27771Wf, A002, "IABScreenshotPreviewController");
        } else {
            C14360o3.A0F("imageRequestListener");
            throw C00O.createAndThrow();
        }
    }

    @Override // X.AbstractC63223SfY, X.InterfaceC65638Tq1
    public final void DXT(QF6 qf6, String str) {
        if (this.A0C == C05F.A0C) {
            A01();
        }
    }
}
