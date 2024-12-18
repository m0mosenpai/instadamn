package com.instagram.showreel.composition.ui;

import X.AbstractC09440dt;
import X.AbstractC115835Lx;
import X.AbstractC127345pD;
import X.AbstractC16490ru;
import X.AbstractC27447C9p;
import X.AbstractC68329VMp;
import X.AnonymousClass001;
import X.BFR;
import X.C138746Qe;
import X.C139406Sv;
import X.C14360o3;
import X.C147376kN;
import X.C17280tP;
import X.C206839Do;
import X.C25732BYs;
import X.C29067Cru;
import X.C40954ICb;
import X.C6FG;
import X.C6QC;
import X.InterfaceC09390do;
import X.InterfaceC127355pE;
import X.InterfaceC138736Qd;
import X.InterfaceC139386St;
import X.InterfaceC31147Dmq;
import X.InterfaceC62872tQ;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.instagram.common.session.UserSession;
import com.instagram.model.showreel.IgShowreelComposition;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class IgShowreelCompositionView extends AbstractC127345pD implements InterfaceC127355pE {
    public int A00;
    public C25732BYs A01;
    public final List A02;
    public final InterfaceC09390do A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgShowreelCompositionView(Context context) {
        super(context, null, 0);
        C14360o3.A0B(context, 1);
        this.A03 = AbstractC09440dt.A01(new C206839Do(this, 4));
        this.A02 = new ArrayList();
    }

    @Override // X.InterfaceC127355pE
    public final void CJk(C139406Sv c139406Sv) {
        String A0p;
        C17280tP A00 = C17280tP.A4E.A00();
        if (!A00.A0d() && !A00.A0e()) {
            C25732BYs c25732BYs = this.A01;
            if (c25732BYs != null) {
                c25732BYs.setVisibility(8);
                return;
            }
            return;
        }
        C25732BYs c25732BYs2 = this.A01;
        if (c25732BYs2 == null) {
            Context context = getContext();
            C14360o3.A07(context);
            c25732BYs2 = new C25732BYs(context);
            this.A01 = c25732BYs2;
            c25732BYs2.setBorderColor(-9826899);
            addView(c25732BYs2, new FrameLayout.LayoutParams(-1, -1, 17));
        }
        c25732BYs2.setVisibility(0);
        c25732BYs2.setBorderEnabled(A00.A0e());
        if (!A00.A0d()) {
            A0p = null;
        } else {
            A0p = AbstractC16490ru.A0p(AnonymousClass001.A11("\n                Client name: ", c139406Sv.A01, "\n                Template name: ", c139406Sv.A04, "\n\n                "));
        }
        c25732BYs2.setInfoText(A0p);
    }

    public void setShowreelAnimation(UserSession userSession, IgShowreelComposition igShowreelComposition, InterfaceC138736Qd interfaceC138736Qd, InterfaceC62872tQ interfaceC62872tQ) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(igShowreelComposition, 1);
        C14360o3.A0B(interfaceC138736Qd, 2);
        C14360o3.A0B(interfaceC62872tQ, 3);
        setShowreelAnimation(userSession, igShowreelComposition, interfaceC138736Qd, interfaceC62872tQ, null, null, null);
    }

    public static /* synthetic */ void setShowreelAnimation$default(IgShowreelCompositionView igShowreelCompositionView, UserSession userSession, IgShowreelComposition igShowreelComposition, InterfaceC138736Qd interfaceC138736Qd, InterfaceC62872tQ interfaceC62872tQ, InterfaceC139386St interfaceC139386St, AbstractC27447C9p abstractC27447C9p, C6FG c6fg, int i, Object obj) {
        if (obj == null) {
            if ((i & 16) != 0) {
                interfaceC139386St = null;
            }
            if ((i & 32) != 0) {
                abstractC27447C9p = null;
            }
            if ((i & 64) != 0) {
                c6fg = null;
            }
            igShowreelCompositionView.setShowreelAnimation(userSession, igShowreelComposition, interfaceC138736Qd, interfaceC62872tQ, interfaceC139386St, abstractC27447C9p, c6fg);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setShowreelAnimation");
    }

    public final void A04() {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            C147376kN c147376kN = ((C40954ICb) it.next()).A00;
            Runnable runnable = c147376kN.A07;
            if (runnable != null) {
                runnable.run();
            }
            c147376kN.A07 = null;
        }
    }

    public final void A05() {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            ((C40954ICb) it.next()).A00.A00();
        }
    }

    @Override // X.InterfaceC127355pE
    public final void DQ8(int i) {
        if (this.A00 != i) {
            this.A00 = i;
            if (i == 3) {
                reset();
            }
            ColorDrawable colorDrawable = ((AbstractC115835Lx) this).A00;
            if (colorDrawable == null || this.A00 == 2) {
                colorDrawable = null;
            }
            setBackground(colorDrawable);
        }
    }

    public BFR getController() {
        return (BFR) this.A03.getValue();
    }

    @Override // X.InterfaceC115845Ly
    public void reset() {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            ((C40954ICb) it.next()).A00.A00();
        }
        getCompositionController().reset();
    }

    @Override // X.AbstractC127345pD
    public final void A03(View view, Integer num, String str, int i, int i2, int i3, int i4) {
        BFR controller = getController();
        String A00 = AbstractC68329VMp.A00(num);
        C138746Qe c138746Qe = controller.A02;
        if (c138746Qe != null) {
            c138746Qe.A0G(A00, i, i2);
        }
        super.A03(view, num, str, i, i2, i3, i4);
    }

    @Override // X.InterfaceC115845Ly
    public final boolean CXh() {
        return getCompositionController().CXh();
    }

    @Override // X.InterfaceC115845Ly
    public void E0c() {
        getCompositionController().E0c();
    }

    @Override // X.InterfaceC115845Ly
    public void E0l() {
        getCompositionController().E0l();
    }

    @Override // X.InterfaceC115845Ly
    public final void E0o() {
        getCompositionController().E0o();
    }

    @Override // X.InterfaceC115845Ly
    public final void E4S() {
        getCompositionController().E4S();
    }

    @Override // X.InterfaceC115845Ly
    public final void EKd() {
        getCompositionController().EKd();
    }

    public InterfaceC31147Dmq getCompositionController() {
        return getController();
    }

    public final C6QC getVideoView() {
        return getCompositionController().getVideoView();
    }

    @Override // X.InterfaceC115845Ly
    public final boolean isPlaying() {
        return getCompositionController().isPlaying();
    }

    @Override // X.InterfaceC115845Ly
    public final void pause() {
        getCompositionController().pause();
    }

    @Override // X.InterfaceC115845Ly
    public final void stop() {
        getCompositionController().stop();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgShowreelCompositionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A03 = AbstractC09440dt.A01(new C206839Do(this, 4));
        this.A02 = new ArrayList();
    }

    public void setShowreelAnimation(UserSession userSession, IgShowreelComposition igShowreelComposition, InterfaceC138736Qd interfaceC138736Qd, InterfaceC62872tQ interfaceC62872tQ, InterfaceC139386St interfaceC139386St, AbstractC27447C9p abstractC27447C9p, C6FG c6fg) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(igShowreelComposition, 1);
        C14360o3.A0B(interfaceC138736Qd, 2);
        C14360o3.A0B(interfaceC62872tQ, 3);
        getController().EeL(userSession, igShowreelComposition, interfaceC138736Qd, interfaceC62872tQ, new C29067Cru(interfaceC139386St, this), null, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgShowreelCompositionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
        this.A03 = AbstractC09440dt.A01(new C206839Do(this, 4));
        this.A02 = new ArrayList();
    }
}
