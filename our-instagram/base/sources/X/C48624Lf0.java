package X;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import java.util.Map;
import java.util.Random;

/* renamed from: X.Lf0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48624Lf0 implements InterfaceC25184BCh {
    public View A00;
    public IgFrameLayout A01;
    public IgSimpleImageView A02;
    public IgTextView A03;
    public String A04;
    public Map A05;
    public C5SW A06;
    public EnumC46218Kcu A07;
    public final Activity A08;
    public final Context A09;
    public final View A0A;
    public final UserSession A0B;
    public final C24149AnY A0C;
    public final InterfaceC1810081c A0D;
    public final InteractiveDrawableContainer A0E;
    public final InterfaceC09390do A0F;
    public final InterfaceC09390do A0G;
    public final View A0H;
    public final ViewStub A0I;
    public final C8NX A0J;
    public final Random A0K = new Random();

    public static final void A00(C48624Lf0 c48624Lf0) {
        int i;
        int i2;
        Random random = c48624Lf0.A0K;
        float nextFloat = random.nextFloat();
        if (nextFloat < 0.5f) {
            nextFloat = 0.5f;
        }
        View view = c48624Lf0.A00;
        if (view != null) {
            i = view.getWidth();
        } else {
            i = 0;
        }
        float f = (nextFloat * i) / 2.0f;
        float f2 = -1.0f;
        if (new Random().nextBoolean()) {
            f2 = 1.0f;
        }
        float f3 = f * f2;
        View view2 = c48624Lf0.A00;
        if (view2 != null) {
            i2 = view2.getHeight();
        } else {
            i2 = 0;
        }
        int i3 = i2 / 2;
        float nextInt = random.nextInt(360);
        IgTextView igTextView = new IgTextView(c48624Lf0.A09);
        igTextView.setText(c48624Lf0.A07.A03);
        igTextView.setTextSize(0, AbstractC167027dH.A01(c48624Lf0.A0G));
        igTextView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        igTextView.setRotation(nextInt);
        IgFrameLayout igFrameLayout = c48624Lf0.A01;
        if (igFrameLayout == null) {
            C14360o3.A0F("animationContainer");
            throw C00O.createAndThrow();
        }
        igFrameLayout.addView(igTextView, 0);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(1700L);
        ofFloat.addUpdateListener(new LM8(igTextView, c48624Lf0, f3, nextInt, i3));
        ofFloat.addListener(new C46073KaU(0, igTextView, c48624Lf0));
        ofFloat.start();
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.9f, 1.0f);
        ofFloat2.setDuration(500L);
        ofFloat2.setInterpolator(new OvershootInterpolator());
        LMA.A01(ofFloat2, c48624Lf0, 15);
        ofFloat2.start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
    
        if (r1 == null) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(X.C48624Lf0 r4, X.EnumC46218Kcu r5) {
        /*
            r0 = 0
            r4.A04 = r0
            r4.A07 = r5
            com.instagram.common.ui.base.IgSimpleImageView r2 = r4.A02
            if (r2 != 0) goto L13
            java.lang.String r3 = "stickerView"
        Lb:
            X.C14360o3.A0F(r3)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L13:
            android.content.Context r1 = r4.A09
            int r0 = r5.A01
            X.AbstractC166997dE.A19(r1, r2, r0)
            java.util.Map r0 = r4.A05
            java.lang.Object r0 = r0.get(r5)
            X.E6x r0 = (X.C32071E6x) r0
            r2 = 0
            java.lang.String r3 = "likeCount"
            if (r0 == 0) goto L38
            int r0 = r0.A00
            com.instagram.common.ui.base.IgTextView r1 = r4.A03
            if (r0 <= 0) goto L30
            if (r1 != 0) goto L4a
            goto Lb
        L30:
            if (r1 == 0) goto Lb
            r0 = 8
            r1.setVisibility(r0)
            return
        L38:
            com.instagram.common.ui.base.IgTextView r1 = r4.A03
            if (r1 == 0) goto Lb
            java.lang.String r0 = r5.name()
            int r0 = r0.hashCode()
            int r0 = r0 % 100
            int r0 = java.lang.Math.abs(r0)
        L4a:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.setText(r0)
            com.instagram.common.ui.base.IgTextView r0 = r4.A03
            if (r0 == 0) goto Lb
            r0.setVisibility(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48624Lf0.A02(X.Lf0, X.Kcu):void");
    }

    public static final void A01(C48624Lf0 c48624Lf0) {
        ViewGroup viewGroup;
        View view = c48624Lf0.A00;
        if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
            C5SW c5sw = c48624Lf0.A06;
            if (c5sw != null) {
                c5sw.A08(false);
            }
            Context context = c48624Lf0.A09;
            String str = c48624Lf0.A04;
            if (str == null) {
                str = c48624Lf0.A07.A03;
            }
            C5SU c5su = new C5SU(context, viewGroup, new C149686oL(str));
            IgSimpleImageView igSimpleImageView = c48624Lf0.A02;
            if (igSimpleImageView == null) {
                C14360o3.A0F("stickerView");
                throw C00O.createAndThrow();
            }
            c5su.A03(igSimpleImageView);
            c5su.A02();
            c5su.A0A = false;
            c5su.A0B = false;
            c5su.A04 = new EfP(c48624Lf0, 2);
            C5SW A00 = c5su.A00();
            c48624Lf0.A06 = A00;
            A00.A06();
        }
    }

    @Override // X.InterfaceC25184BCh
    public final void DDv(Object obj) {
        if (this.A00 == null) {
            this.A00 = this.A0I.inflate();
        }
        C8NW c8nw = (C8NW) this.A0J;
        C150956qv.A09(new View[]{c8nw.A1j}, false);
        c8nw.A1Q(true);
        AbstractC125325le.A07(new View[]{this.A0H, this.A00}, false);
        View view = this.A00;
        if (view != null) {
            view.postDelayed(new M08(this), 500L);
        }
    }

    @Override // X.InterfaceC25184BCh
    public final void DEy() {
        View view = this.A00;
        if (view != null) {
            AbstractC125325le.A05(new View[]{this.A0H, view}, false);
        }
        C24149AnY c24149AnY = this.A0C;
        c24149AnY.A07.A0v(c24149AnY);
        this.A0J.Dog(new C24018Akw(this.A07, this.A04), AbstractC111324zv.A00(4710));
    }

    public C48624Lf0(Activity activity, View view, UserSession userSession, InterfaceC1810081c interfaceC1810081c, C8NX c8nx, InteractiveDrawableContainer interactiveDrawableContainer) {
        this.A08 = activity;
        this.A0B = userSession;
        this.A0A = view;
        this.A0E = interactiveDrawableContainer;
        this.A0D = interfaceC1810081c;
        this.A0J = c8nx;
        this.A09 = AbstractC166997dE.A0L(view);
        this.A0H = AbstractC166997dE.A0S(view, R.id.text_overlay_edit_text_container);
        ViewStub A0M = AbstractC167007dF.A0M(view, R.id.instapal_sticker_editor_stub);
        this.A0I = A0M;
        this.A0C = new C24149AnY(interactiveDrawableContainer);
        this.A0G = AbstractC09440dt.A01(new B8R(this, 0));
        this.A0F = AbstractC09440dt.A01(new B8T(this, 49));
        this.A05 = AbstractC166987dD.A1I();
        this.A07 = EnumC46218Kcu.A08;
        A0M.setOnInflateListener(new ViewStubOnInflateListenerC48087LQn(this, 1));
    }
}
