package com.meta.metaai.components.voice.animation.ui.view;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC25226BEj;
import X.AbstractC25229BEm;
import X.AbstractC25235BEs;
import X.AbstractC25236BEt;
import X.AnonymousClass195;
import X.C07T;
import X.C07X;
import X.C0UO;
import X.C0eR;
import X.C0f9;
import X.C14360o3;
import X.C25735BYv;
import X.C29715D8l;
import X.C29896DGk;
import X.C57168PZm;
import X.ChoreographerFrameCallbackC28588CjT;
import X.EnumC53181Nfd;
import X.InterfaceC19390xP;
import X.InterfaceC23621Ds;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.view.View;
import java.util.Random;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class MetaAIListeningIndicatorView extends View implements C07X {
    public static final RadialGradient A0M;
    public static final RadialGradient A0N;
    public static final RadialGradient A0O;
    public static final RadialGradient A0P;
    public static final RadialGradient A0Q;
    public static final RadialGradient A0R;
    public static final RadialGradient A0S;
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public int A05;
    public int A06;
    public long A07;
    public AnonymousClass195 A08;
    public boolean A09;
    public final Paint A0A;
    public final RectF A0B;
    public final RectF A0C;
    public final RectF A0D;
    public final RectF A0E;
    public final RectF A0F;
    public final RectF A0G;
    public final RectF A0H;
    public final C07T A0I;
    public final C0eR A0J;
    public final ChoreographerFrameCallbackC28588CjT A0K;
    public final Random A0L;

    static {
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        A0R = new RadialGradient(0.0f, 0.0f, 100.0f, new int[]{-16738616, 38600}, new float[]{0.0f, 1.0f}, tileMode);
        A0Q = new RadialGradient(0.0f, 0.0f, 100.0f, new int[]{-5902106, 10875110}, new float[]{0.0f, 1.0f}, tileMode);
        A0S = new RadialGradient(0.0f, 0.0f, 100.0f, new int[]{-14298266, 2478950}, new float[]{0.0f, 1.0f}, tileMode);
        A0M = new RadialGradient(0.0f, 0.0f, 100.0f, new int[]{-9546271, 7230945}, new float[]{0.0f, 1.0f}, tileMode);
        A0P = new RadialGradient(0.0f, 0.0f, 100.0f, new int[]{-7900161, 8877055}, new float[]{0.0f, 1.0f}, tileMode);
        A0O = new RadialGradient(0.0f, 0.0f, 100.0f, new int[]{-353321, 16423895}, new float[]{0.0f, 1.0f}, tileMode);
        A0N = new RadialGradient(0.0f, 0.0f, 100.0f, new int[]{-7691, 1090511349, 16769525}, new float[]{0.0f, 0.4f, 1.0f}, tileMode);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetaAIListeningIndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
        this.A0L = new Random();
        this.A02 = 1.0f;
        this.A00 = 1.0f;
        this.A03 = 1.0f;
        this.A0A = AbstractC166987dD.A0R();
        this.A01 = 1.0f;
        this.A04 = 1.0f;
        this.A0G = AbstractC166987dD.A0X();
        this.A0F = AbstractC166987dD.A0X();
        this.A0H = AbstractC166987dD.A0X();
        this.A0B = AbstractC166987dD.A0X();
        this.A0E = AbstractC166987dD.A0X();
        this.A0D = AbstractC166987dD.A0X();
        this.A0C = AbstractC166987dD.A0X();
        this.A0K = new ChoreographerFrameCallbackC28588CjT(this);
        C0eR c0eR = new C0eR(this);
        this.A0J = c0eR;
        this.A0I = c0eR;
    }

    public static final void A00(Canvas canvas, RadialGradient radialGradient, MetaAIListeningIndicatorView metaAIListeningIndicatorView, float f, float f2, float f3, float f4) {
        metaAIListeningIndicatorView.A0A.setShader(radialGradient);
        int[] iArr = C25735BYv.A0b;
        AbstractC25235BEs.A1D(canvas, new C29715D8l(canvas, metaAIListeningIndicatorView, f, f2, f3, f4));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        super.onDraw(canvas);
        int[] iArr = C25735BYv.A0b;
        AbstractC25235BEs.A1D(canvas, C29896DGk.A00(canvas, this, 7));
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        C14360o3.A0B(view, 0);
        super.onVisibilityChanged(view, i);
        if (i != 4 && i != 8) {
            if (!this.A09) {
                Choreographer.getInstance().postFrameCallback(this.A0K);
                this.A09 = true;
                return;
            }
            return;
        }
        if (!this.A09) {
            return;
        }
        Choreographer.getInstance().removeFrameCallback(this.A0K);
        this.A09 = false;
    }

    public final void setUpdateVolumeFlow(C0UO c0uo, InterfaceC19390xP interfaceC19390xP) {
        AbstractC167017dG.A1N(c0uo, interfaceC19390xP);
        AnonymousClass195 anonymousClass195 = this.A08;
        if (anonymousClass195 != null) {
            anonymousClass195.AGH(null);
        }
        this.A08 = null;
        this.A08 = AbstractC25226BEj.A1L(new C57168PZm(c0uo, interfaceC19390xP, this, (InterfaceC23621Ds) null, 47), AbstractC25229BEm.A0a(this));
    }

    public final void A01(EnumC53181Nfd enumC53181Nfd, float f, boolean z) {
        boolean z2;
        float f2;
        if (z || (enumC53181Nfd != EnumC53181Nfd.A06 && enumC53181Nfd != EnumC53181Nfd.A02)) {
            z2 = true;
        } else {
            z2 = false;
        }
        float min = Math.min(Math.max((f - 0.7f) / 0.3f, 0.0f), 1.0f);
        if (z2) {
            f2 = 0.0f;
        } else {
            f2 = (min * 1.0f) + 0.3f;
        }
        this.A06 = (int) (Math.min(Math.max(f2, 0.0f), 0.5f) * 255.0f);
        this.A04 = Math.min(Math.max(f2 + 1.0f, 1.0f), 1.5f);
        invalidate();
    }

    @Override // X.C07X
    public C07T getLifecycle() {
        return this.A0I;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = C0f9.A06(1507169481);
        super.onSizeChanged(i, i2, i3, i4);
        float A07 = (AbstractC166987dD.A07(this) * 4.0f) / 5.0f;
        float A08 = (AbstractC166987dD.A08(this) * 0.5f) / 2.0f;
        float f = (A07 * 2.0f) / 3.0f;
        this.A0G.set((-A07) / 3.0f, AbstractC166987dD.A08(this) - A08, f, AbstractC166987dD.A08(this) + A08);
        float f2 = A07 / 2.0f;
        this.A0F.set((AbstractC166987dD.A07(this) / 2.0f) - f2, AbstractC166987dD.A08(this) - A08, (AbstractC166987dD.A07(this) / 2.0f) + f2, AbstractC166987dD.A08(this) + A08);
        this.A0H.set(AbstractC166987dD.A07(this) - f, AbstractC166987dD.A08(this) - A08, AbstractC166987dD.A07(this) + ((A07 * 1.0f) / 3.0f), AbstractC166987dD.A08(this) + A08);
        float A072 = AbstractC166987dD.A07(this) * 1.2f;
        float f3 = A072 / 2.0f;
        float A082 = ((AbstractC166987dD.A08(this) * 5.0f) / 10.0f) / 2.0f;
        this.A0B.set((AbstractC166987dD.A07(this) / 2.0f) - f3, AbstractC166987dD.A08(this) - A082, (AbstractC166987dD.A07(this) / 2.0f) + f3, AbstractC166987dD.A08(this) + A082);
        AbstractC25236BEt.A0g(this.A0E, this, f3, (AbstractC166987dD.A08(this) * 4.0f) / 10.0f);
        AbstractC25236BEt.A0g(this.A0D, this, f3, AbstractC166987dD.A08(this) * 0.18f);
        AbstractC25236BEt.A0g(this.A0C, this, f3, AbstractC166987dD.A08(this) * 0.083f);
        C0f9.A0D(2081272947, A06);
    }

    public /* synthetic */ MetaAIListeningIndicatorView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MetaAIListeningIndicatorView(Context context) {
        this(context, null);
        C14360o3.A0B(context, 1);
    }
}
