package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.text.Editable;
import android.text.Layout;
import android.text.StaticLayout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.8jh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C194818jh extends C3PD implements InterfaceC60152ox {
    public long A00;
    public C3PF A01;
    public AbstractC202988yG A02;
    public boolean A03;
    public int A04;
    public int A05;
    public boolean A06;
    public final Handler A07;
    public final UserSession A08;
    public final InterfaceC56392iX A09;
    public final InterfaceC56392iX A0A;
    public final Runnable A0B;
    public final Context A0C;
    public final EditText A0D;
    public final C190398bx A0E;
    public final Runnable A0F;

    public C194818jh(Context context, Handler handler, EditText editText, UserSession userSession, InterfaceC56392iX interfaceC56392iX, InterfaceC56392iX interfaceC56392iX2, C190398bx c190398bx) {
        C14360o3.A0B(context, 1);
        C14360o3.A0B(interfaceC56392iX2, 3);
        C14360o3.A0B(handler, 5);
        C14360o3.A0B(editText, 6);
        this.A0C = context;
        this.A09 = interfaceC56392iX;
        this.A0A = interfaceC56392iX2;
        this.A08 = userSession;
        this.A07 = handler;
        this.A0D = editText;
        this.A0E = c190398bx;
        this.A0F = new Runnable() { // from class: X.8ji
            @Override // java.lang.Runnable
            public final void run() {
                C194818jh.A01(C194818jh.this);
            }
        };
        this.A0B = new Runnable() { // from class: X.8jj
            @Override // java.lang.Runnable
            public final void run() {
                int currentTimeMillis;
                C194818jh c194818jh = C194818jh.this;
                AbstractC202988yG abstractC202988yG = c194818jh.A02;
                if (abstractC202988yG != null) {
                    InterfaceC56392iX interfaceC56392iX3 = c194818jh.A0A;
                    if (interfaceC56392iX3.CWW()) {
                        int A0W = abstractC202988yG.A0W();
                        if (A0W == 0) {
                            currentTimeMillis = 0;
                        } else {
                            currentTimeMillis = (int) ((System.currentTimeMillis() - c194818jh.A00) % A0W);
                        }
                        abstractC202988yG.EUp(currentTimeMillis, abstractC202988yG.getDurationInMs());
                        interfaceC56392iX3.getView().postOnAnimation(c194818jh.A0B);
                    }
                }
            }
        };
        if (!interfaceC56392iX2.CWW()) {
            interfaceC56392iX2.getView();
        }
    }

    public final void A06(View view, boolean z, boolean z2) {
        C14360o3.A0B(view, 0);
        InterfaceC56392iX interfaceC56392iX = this.A09;
        C3P9 c3p9 = new C3P9(interfaceC56392iX.getView());
        c3p9.A04 = this;
        c3p9.A07 = true;
        c3p9.A0D = true;
        this.A01 = c3p9.A00();
        interfaceC56392iX.getView().setActivated(z);
        this.A06 = z;
        A03(z);
        if (interfaceC56392iX.CWW()) {
            this.A07.postDelayed(new RunnableC24784Ay6(view, this, z2), 2000L);
        }
        AbstractC125325le.A04(null, new View[]{interfaceC56392iX.getView()}, false);
    }

    private final void A00() {
        EditText editText = this.A0D;
        editText.setAlpha(1.0f);
        editText.setCursorVisible(true);
        Editable text = editText.getText();
        C14360o3.A07(text);
        C202888y6[] c202888y6Arr = (C202888y6[]) C4GL.A06(text, C202888y6.class);
        for (C202888y6 c202888y6 : c202888y6Arr) {
            c202888y6.A04 = true;
        }
        Editable text2 = editText.getText();
        C14360o3.A07(text2);
        C6S5 A00 = AbstractC190978ct.A00(text2, 0, text2.length());
        Editable text3 = editText.getText();
        C14360o3.A07(text3);
        C190868ci[] c190868ciArr = (C190868ci[]) C4GL.A06(text3, C190868ci.class);
        for (C190868ci c190868ci : c190868ciArr) {
            c190868ci.A03 = 255;
        }
        if (!this.A06 && (A00 == C6S5.A08 || A00 == C6S5.A07)) {
            for (C190868ci c190868ci2 : c190868ciArr) {
                c190868ci2.A04 = true;
            }
        }
        InterfaceC56392iX interfaceC56392iX = this.A0A;
        interfaceC56392iX.setVisibility(8);
        AbstractC202988yG abstractC202988yG = this.A02;
        if (abstractC202988yG != null) {
            abstractC202988yG.A0Y();
        }
        this.A02 = null;
        if (interfaceC56392iX.CWW()) {
            interfaceC56392iX.getView().removeCallbacks(this.A0B);
        }
    }

    public static final void A01(C194818jh c194818jh) {
        EditText editText = c194818jh.A0D;
        editText.setAlpha(0.0f);
        editText.setCursorVisible(false);
        editText.setSelection(editText.length());
        Editable text = editText.getText();
        C14360o3.A07(text);
        C202888y6[] c202888y6Arr = (C202888y6[]) C4GL.A06(text, C202888y6.class);
        for (C202888y6 c202888y6 : c202888y6Arr) {
            c202888y6.A04 = false;
        }
        AbstractC202988yG abstractC202988yG = c194818jh.A02;
        if (abstractC202988yG != null) {
            abstractC202988yG.A0Y();
        }
        C190398bx c190398bx = c194818jh.A0E;
        AbstractC202988yG A02 = C190398bx.A02(c190398bx, null, ((C194918js) c190398bx.A1g.get()).A07());
        c190398bx.A0f(A02);
        AbstractC209689Pe.A0B(A02, ((C202968yE) c190398bx.A1Z.get()).A00);
        StaticLayout staticLayout = A02.A0G;
        if (staticLayout != null) {
            AbstractC209689Pe.A03(staticLayout, A02.A0F, AbstractC23070AFc.A00.A00(A02.A0E), A02.A0b.getTextSize());
        }
        if (A02 instanceof V7F) {
            A02.A0C(0.0f, A02.A0V());
        }
        c194818jh.A02 = A02;
        InterfaceC56392iX interfaceC56392iX = c194818jh.A0A;
        interfaceC56392iX.setVisibility(0);
        AbstractC202988yG abstractC202988yG2 = c194818jh.A02;
        if (abstractC202988yG2 != null) {
            c194818jh.A04 = C1H4.A01(((C6RB) abstractC202988yG2).A00);
            c194818jh.A05 = C1H4.A01(((C6RB) abstractC202988yG2).A01);
            ImageView imageView = (ImageView) interfaceC56392iX.getView().findViewById(R.id.text_animation_preview_view);
            imageView.setImageDrawable(abstractC202988yG2);
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            C14360o3.A0C(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            Layout.Alignment alignment = abstractC202988yG2.A0E;
            C14360o3.A07(alignment);
            int i = AbstractC22789A3h.A00[alignment.ordinal()];
            int i2 = 3;
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        i2 = 5;
                    } else {
                        throw new RuntimeException();
                    }
                }
            } else {
                i2 = 1;
            }
            layoutParams2.gravity = i2;
            AbstractC13880nE.A0q(interfaceC56392iX.getView(), new RunnableC24422As3(c194818jh));
            interfaceC56392iX.getView().requestLayout();
        }
        interfaceC56392iX.getView().requestLayout();
        if (interfaceC56392iX.CWW()) {
            interfaceC56392iX.getView().postOnAnimation(c194818jh.A0B);
        }
        c194818jh.A00 = System.currentTimeMillis();
    }

    public static final void A02(C194818jh c194818jh) {
        InterfaceC56392iX interfaceC56392iX = c194818jh.A0A;
        if (interfaceC56392iX.CGb() == 0) {
            int height = interfaceC56392iX.getView().getHeight();
            EditText editText = c194818jh.A0D;
            interfaceC56392iX.getView().setY(editText.getY() - ((height - editText.getHeight()) / 2));
            interfaceC56392iX.getView().setScaleX(editText.getScaleX());
            interfaceC56392iX.getView().setScaleY(editText.getScaleY());
            interfaceC56392iX.getView().setPadding(editText.getPaddingLeft() - c194818jh.A04, editText.getPaddingTop() - c194818jh.A05, editText.getPaddingRight() - c194818jh.A04, editText.getPaddingBottom() - c194818jh.A05);
        }
    }

    private final void A03(boolean z) {
        if (z) {
            A01(this);
        } else {
            A00();
            this.A07.removeCallbacks(this.A0F);
        }
        C190398bx c190398bx = this.A0E;
        C150286pc c150286pc = c190398bx.A1a;
        if (c150286pc != null && ((C194818jh) c150286pc.get()).A07()) {
            AnonymousClass229.A01(c190398bx.A1J).A1w(((C194918js) c190398bx.A1g.get()).A07().A09);
        }
    }

    public final void A04() {
        InterfaceC56392iX interfaceC56392iX = this.A09;
        if (interfaceC56392iX.CWW()) {
            AbstractC125325le.A05(new View[]{interfaceC56392iX.getView()}, false);
            C3PF c3pf = this.A01;
            if (c3pf != null) {
                c3pf.A03();
            }
        }
        this.A07.removeCallbacksAndMessages(null);
        if (interfaceC56392iX.CWW()) {
            interfaceC56392iX.getView().setActivated(false);
        }
        InterfaceC56392iX interfaceC56392iX2 = this.A0A;
        if (interfaceC56392iX2.CWW()) {
            A03(false);
            interfaceC56392iX2.getView().setBackground(null);
        }
    }

    public final void A05() {
        Handler handler = this.A07;
        Runnable runnable = this.A0F;
        handler.removeCallbacks(runnable);
        if (A07()) {
            handler.postDelayed(runnable, 1000L);
            A00();
        }
    }

    public final boolean A07() {
        InterfaceC56392iX interfaceC56392iX = this.A09;
        if (interfaceC56392iX.CWW() && interfaceC56392iX.getView().isActivated()) {
            return true;
        }
        return false;
    }

    @Override // X.C3PD, X.C3PE
    public final boolean DsE(View view) {
        InterfaceC19610xo ARD = AbstractC19730y1.A00(AbstractC12960li.A00).A00.ARD();
        ARD.E77("has_used_text_animation_button", true);
        ARD.apply();
        InterfaceC56392iX interfaceC56392iX = this.A09;
        interfaceC56392iX.getView().setActivated(!interfaceC56392iX.getView().isActivated());
        boolean isActivated = interfaceC56392iX.getView().isActivated();
        View view2 = interfaceC56392iX.getView();
        Resources resources = interfaceC56392iX.getView().getResources();
        int i = 2131975295;
        if (isActivated) {
            i = 2131975296;
        }
        view2.announceForAccessibility(resources.getString(i));
        this.A06 = interfaceC56392iX.getView().isActivated();
        A03(interfaceC56392iX.getView().isActivated());
        return true;
    }

    @Override // X.InterfaceC60152ox
    public final void DOK(int i, boolean z) {
        A02(this);
    }
}
