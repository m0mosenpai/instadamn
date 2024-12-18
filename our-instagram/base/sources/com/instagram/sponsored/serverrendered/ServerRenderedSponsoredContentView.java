package com.instagram.sponsored.serverrendered;

import X.AbstractC09440dt;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25229BEm;
import X.AbstractC25233BEq;
import X.AbstractC37415Gdv;
import X.BOJ;
import X.C06090Tz;
import X.C0w9;
import X.C138956Rc;
import X.C139336So;
import X.C139366Sr;
import X.C14360o3;
import X.C147416kR;
import X.C16930sl;
import X.C18950wb;
import X.C18U;
import X.C1LE;
import X.C25617BUf;
import X.C25618BUg;
import X.C25626BUo;
import X.C25627BUp;
import X.C29066Crt;
import X.C29071Cry;
import X.C29373Cx6;
import X.C40971v4;
import X.C50802Vb;
import X.C62862tP;
import X.C64Z;
import X.C6QC;
import X.C9C9;
import X.CQ3;
import X.InterfaceC09390do;
import X.InterfaceC104804nl;
import X.InterfaceC150336ph;
import X.InterfaceC31041Dkf;
import X.InterfaceC43583JMr;
import X.InterfaceC58682mR;
import X.JIL;
import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.showreel.IgShowreelComposition;
import com.instagram.model.showreelnative.IgShowreelNativeAnimationIntf;
import com.instagram.showreel.composition.ui.IgShowreelCompositionView;
import com.instagram.showreelnative.ui.common.ShowreelNativeMediaView;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class ServerRenderedSponsoredContentView extends FrameLayout implements JIL {
    public InterfaceC43583JMr A00;
    public IgImageView A01;
    public IgShowreelCompositionView A02;
    public ShowreelNativeMediaView A03;
    public C147416kR A04;
    public C25626BUo A05;
    public InterfaceC31041Dkf A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ServerRenderedSponsoredContentView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    public final void A01(Activity activity, CQ3 cq3, C139336So c139336So, UserSession userSession, C40971v4 c40971v4, boolean z) {
        ShowreelNativeMediaView showreelNativeMediaView;
        ShowreelNativeMediaView showreelNativeMediaView2;
        IgShowreelNativeAnimationIntf Bx7;
        C14360o3.A0B(userSession, 1);
        View view = this.A02;
        if (view != null) {
            removeView(view);
            this.A02 = null;
            View view2 = this.A01;
            if (view2 != null) {
                removeView(view2);
                this.A01 = null;
            }
        }
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36315748080684559L)) {
            setVisibility(0);
        }
        if (this.A03 == null) {
            if (activity != null && C18U.A06(c06090Tz, userSession, 36315571985321378L)) {
                showreelNativeMediaView2 = A00(activity).A01;
            } else {
                showreelNativeMediaView2 = new ShowreelNativeMediaView(AbstractC166997dE.A0L(this), getIntegrationPoint(), (C64Z) null, getConfigProvider());
            }
            this.A03 = showreelNativeMediaView2;
            if (showreelNativeMediaView2 != null) {
                C25626BUo c25626BUo = new C25626BUo(showreelNativeMediaView2);
                this.A05 = c25626BUo;
                c25626BUo.A02 = this.A04;
                addView(showreelNativeMediaView2);
                if (C18U.A06(c06090Tz, userSession, 36313686494742725L)) {
                    showreelNativeMediaView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
                }
                showreelNativeMediaView2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
                if (c139336So != null) {
                    showreelNativeMediaView2.A0G.A00(c139336So.A00);
                }
                if (C18U.A06(c06090Tz, userSession, 36315571985452452L)) {
                    C138956Rc c138956Rc = new C138956Rc(new C139366Sr(c40971v4.A0S, c40971v4.A0j), 0, 0, 1, 0);
                    InterfaceC104804nl interfaceC104804nl = c40971v4.A06;
                    if (interfaceC104804nl != null && (Bx7 = interfaceC104804nl.Bx7()) != null) {
                        showreelNativeMediaView2.setShowreelAnimation(AbstractC37415Gdv.A00(Bx7), c138956Rc, null, C16930sl.A00, null, null, null, null);
                    } else {
                        throw AbstractC166997dE.A0g();
                    }
                }
            }
        }
        ShowreelNativeMediaView showreelNativeMediaView3 = this.A03;
        if (showreelNativeMediaView3 != null) {
            showreelNativeMediaView3.A03 = cq3;
        }
        if (z && this.A04 == null) {
            IgImageView igImageView = new IgImageView(AbstractC166997dE.A0L(this));
            BOJ.A00(igImageView, C1LE.A07(userSession));
            this.A01 = igImageView;
            addView(igImageView);
        }
        if (C18U.A06(c06090Tz, userSession, 36313686494808262L) && (showreelNativeMediaView = this.A03) != null && !C14360o3.A0K(showreelNativeMediaView.getParent(), this)) {
            AbstractC166987dD.A1T(C18950wb.A01, "not attached view detected", 817902173);
        }
    }

    @Override // X.JIL
    public final void EJY(UserSession userSession, boolean z, boolean z2, boolean z3) {
        C25626BUo c25626BUo;
        C147416kR c147416kR;
        C147416kR c147416kR2;
        C14360o3.A0B(userSession, 0);
        ShowreelNativeMediaView showreelNativeMediaView = this.A03;
        if (showreelNativeMediaView != null) {
            showreelNativeMediaView.reset();
        }
        if (z3 && (c147416kR2 = this.A04) != null) {
            c147416kR2.A03();
        }
        if (!z2 && (c147416kR = this.A04) != null) {
            c147416kR.A02();
        }
        this.A06 = null;
        C06090Tz c06090Tz = C06090Tz.A05;
        if ((!C18U.A06(c06090Tz, userSession, 36315748080815633L) || this.A03 != null) && (c25626BUo = this.A05) != null) {
            c25626BUo.A04 = false;
            c25626BUo.A06.removeCallbacks(c25626BUo.A09);
            c25626BUo.A00 = 0;
            c25626BUo.A05 = false;
            c25626BUo.A03 = null;
        }
        if (z && C18U.A06(c06090Tz, userSession, 36315748080684559L)) {
            setVisibility(8);
        }
    }

    @Override // X.JIL
    public void setTransformation(C40971v4 c40971v4, UserSession userSession, C62862tP c62862tP, InterfaceC31041Dkf interfaceC31041Dkf) {
        IgShowreelCompositionView igShowreelCompositionView;
        IgShowreelComposition Bx5;
        IgShowreelNativeAnimationIntf Bx7;
        boolean A1b = AbstractC25233BEq.A1b(c40971v4, userSession, c62862tP);
        if (c40971v4.A06()) {
            this.A06 = interfaceC31041Dkf;
            C138956Rc c138956Rc = new C138956Rc(new C139366Sr(c40971v4.A0S, c40971v4.A0j), 0, 0, A1b ? 1 : 0, 0);
            if (c40971v4.A08()) {
                C25626BUo c25626BUo = this.A05;
                if (c25626BUo != null) {
                    c25626BUo.A03 = new C25627BUp(this, interfaceC31041Dkf);
                }
                ShowreelNativeMediaView showreelNativeMediaView = this.A03;
                if (showreelNativeMediaView != null) {
                    InterfaceC104804nl interfaceC104804nl = c40971v4.A06;
                    if (interfaceC104804nl != null && (Bx7 = interfaceC104804nl.Bx7()) != null) {
                        showreelNativeMediaView.setShowreelAnimation(AbstractC37415Gdv.A00(Bx7), c138956Rc, null, C16930sl.A00, null, null, this.A05, null);
                        return;
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                return;
            }
            if (!c40971v4.A07() || (igShowreelCompositionView = this.A02) == null) {
                return;
            }
            InterfaceC104804nl interfaceC104804nl2 = c40971v4.A06;
            if (interfaceC104804nl2 != null && (Bx5 = interfaceC104804nl2.Bx5()) != null) {
                igShowreelCompositionView.setShowreelAnimation(userSession, Bx5, c138956Rc, c62862tP, new C29066Crt(interfaceC31041Dkf, A1b ? 1 : 0), null, null);
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
    }

    private final C29071Cry getConfigProvider() {
        return (C29071Cry) this.A07.getValue();
    }

    private final C9C9 getIntegrationPoint() {
        return (C9C9) this.A08.getValue();
    }

    @Override // X.JIL
    public final void COJ(UserSession userSession, String str, boolean z) {
        C29373Cx6 c29373Cx6 = new C29373Cx6(this, z);
        if (this.A04 == null) {
            C147416kR c147416kR = new C147416kR(AbstractC166997dE.A0L(this), userSession, c29373Cx6, str, "clips_viewer_clips_tab");
            this.A04 = c147416kR;
            c147416kR.A00 = null;
            C25626BUo c25626BUo = this.A05;
            if (c25626BUo != null) {
                c25626BUo.A02 = c147416kR;
            }
        }
    }

    @Override // X.JIL
    public final void Dzk() {
        IgShowreelCompositionView igShowreelCompositionView = this.A02;
        if (igShowreelCompositionView != null) {
            igShowreelCompositionView.getCompositionController().Dzk();
        }
    }

    @Override // X.JIL
    public final void Dzl() {
        IgShowreelCompositionView igShowreelCompositionView = this.A02;
        if (igShowreelCompositionView != null) {
            igShowreelCompositionView.getCompositionController().Dzl();
        }
    }

    @Override // X.JIL
    public final void Dzm() {
        IgShowreelCompositionView igShowreelCompositionView = this.A02;
        if (igShowreelCompositionView != null) {
            igShowreelCompositionView.getCompositionController().Dzm();
        }
    }

    @Override // X.JIL
    public final boolean EKf() {
        C147416kR c147416kR;
        String str;
        C147416kR c147416kR2;
        String str2;
        C25626BUo c25626BUo = this.A05;
        if (c25626BUo != null && c25626BUo.A05) {
            ShowreelNativeMediaView showreelNativeMediaView = this.A03;
            if (showreelNativeMediaView != null) {
                showreelNativeMediaView.EKd();
            }
            C25626BUo c25626BUo2 = this.A05;
            if (c25626BUo2 != null && c25626BUo2.A08.isPlaying()) {
                C147416kR c147416kR3 = c25626BUo2.A02;
                if (c147416kR3 != null && !c147416kR3.A08() && (c147416kR2 = c25626BUo2.A02) != null && (str2 = c147416kR2.A01) != null) {
                    C147416kR.A00(c147416kR2, str2);
                }
                C25626BUo.A01(c25626BUo2);
            }
        }
        if (this.A02 != null && (c147416kR = this.A04) != null && (str = c147416kR.A01) != null) {
            C147416kR.A00(c147416kR, str);
        }
        return isPlaying();
    }

    @Override // X.JIL
    public final void EhI(float f, int i) {
        C147416kR c147416kR = this.A04;
        if (c147416kR != null) {
            c147416kR.A05(f);
        }
    }

    @Override // X.JIL
    public int getCurrentPositionMs() {
        ShowreelNativeMediaView showreelNativeMediaView = this.A03;
        if (showreelNativeMediaView == null) {
            return 0;
        }
        return (int) (showreelNativeMediaView.getProgress() * ((float) TimeUnit.SECONDS.toMillis(showreelNativeMediaView.getDurationSeconds())));
    }

    @Override // X.JIL
    public C6QC getVideoView() {
        IgShowreelCompositionView igShowreelCompositionView = this.A02;
        if (igShowreelCompositionView != null) {
            return igShowreelCompositionView.getCompositionController().getVideoView();
        }
        return null;
    }

    @Override // X.JIL
    public final boolean isPlaying() {
        ShowreelNativeMediaView showreelNativeMediaView;
        C25626BUo c25626BUo = this.A05;
        if (c25626BUo != null && c25626BUo.A05 && (showreelNativeMediaView = this.A03) != null && showreelNativeMediaView.isPlaying()) {
            return true;
        }
        return false;
    }

    @Override // X.JIL
    public final void pause() {
        ShowreelNativeMediaView showreelNativeMediaView = this.A03;
        if (showreelNativeMediaView != null) {
            showreelNativeMediaView.pause();
        }
        C147416kR c147416kR = this.A04;
        if (c147416kR != null) {
            c147416kR.A01();
        }
    }

    @Override // X.JIL
    public final void seekTo(int i) {
        ShowreelNativeMediaView showreelNativeMediaView = this.A03;
        if (showreelNativeMediaView != null) {
            long millis = TimeUnit.SECONDS.toMillis(showreelNativeMediaView.getDurationSeconds());
            if (millis > 0) {
                float f = (i * 1.0f) / ((float) millis);
                InterfaceC58682mR keyframesAnimatable = showreelNativeMediaView.A0J.getKeyframesAnimatable();
                if (keyframesAnimatable != null) {
                    keyframesAnimatable.EMk(f);
                }
            }
            C147416kR c147416kR = this.A04;
            if (c147416kR != null) {
                c147416kR.A06(i);
            }
        }
    }

    public void setTrackDuration(long j) {
        C25626BUo c25626BUo = this.A05;
        if (c25626BUo != null) {
            c25626BUo.A01 = (int) j;
        }
    }

    @Override // X.JIL
    public final void stop() {
        ShowreelNativeMediaView showreelNativeMediaView = this.A03;
        if (showreelNativeMediaView != null) {
            showreelNativeMediaView.stop();
        }
    }

    public static final IgShowreelView A00(Activity activity) {
        LayoutInflater layoutInflater = activity.getLayoutInflater();
        C14360o3.A07(layoutInflater);
        View A00 = C50802Vb.A00(layoutInflater, new ViewGroup.LayoutParams(-1, -1), null, R.layout.showreel_view, 0, false, true);
        C14360o3.A0C(A00, "null cannot be cast to non-null type com.instagram.sponsored.serverrendered.IgShowreelView");
        return (IgShowreelView) A00;
    }

    @Override // X.JIL
    public final void ADb(InterfaceC43583JMr interfaceC43583JMr, String str) {
        InterfaceC150336ph interfaceC150336ph;
        boolean A1Y = AbstractC25229BEm.A1Y(str);
        this.A00 = interfaceC43583JMr;
        C147416kR c147416kR = this.A04;
        if (c147416kR != null) {
            C25626BUo c25626BUo = this.A05;
            if (c25626BUo != null) {
                interfaceC150336ph = c25626BUo.A07;
            } else {
                interfaceC150336ph = null;
            }
            c147416kR.A07(interfaceC43583JMr, interfaceC150336ph, str, A1Y);
        }
    }

    public final IgImageView getAudioIconView() {
        return this.A01;
    }

    @Override // android.view.View
    public final void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null) {
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("setTag (key = [");
            A1C.append(i);
            A1C.append("], tag = [");
            A1C.append(obj);
            C0w9.A03("ServerRenderedSponsoredContentView#setTag(2)", AbstractC167017dG.A0n(this, "]) on ", A1C));
        }
    }

    public final void setAudioIconView(IgImageView igImageView) {
        this.A01 = igImageView;
    }

    public /* synthetic */ ServerRenderedSponsoredContentView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @Override // android.view.View
    public void setTag(Object obj) {
        super.setTag(obj);
        if (obj == null) {
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("setTag (tag = [");
            A1C.append(obj);
            C0w9.A03("ServerRenderedSponsoredContentView#setTag(1)", AbstractC167017dG.A0n(this, "]) on ", A1C));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServerRenderedSponsoredContentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A08 = AbstractC09440dt.A01(C25617BUf.A00);
        this.A07 = AbstractC09440dt.A01(C25618BUg.A00);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ServerRenderedSponsoredContentView(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }
}
