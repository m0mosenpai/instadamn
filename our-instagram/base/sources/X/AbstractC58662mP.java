package X;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.facebook.common.callercontext.CallerContext;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: X.2mP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC58662mP extends AbstractC58672mQ implements InterfaceC58682mR {
    public static final String __redex_internal_original_name = "KeyframesNetworkDrawableBase";
    public InterfaceC58682mR A00;
    public final C58782mb A01;
    public final List A02;

    @Override // X.AbstractC58672mQ, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // X.InterfaceC58682mR
    public final InterfaceC58682mR A8x(Animator.AnimatorListener animatorListener) {
        InterfaceC58682mR interfaceC58682mR = this.A00;
        if (interfaceC58682mR == null) {
            interfaceC58682mR = this.A01;
        }
        return interfaceC58682mR.A8x(animatorListener);
    }

    @Override // X.InterfaceC58682mR
    public final InterfaceC58682mR AAi(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        InterfaceC58682mR interfaceC58682mR = this.A00;
        if (interfaceC58682mR == null) {
            interfaceC58682mR = this.A01;
        }
        return interfaceC58682mR.AAi(animatorUpdateListener);
    }

    @Override // X.InterfaceC58682mR
    public final InterfaceC58682mR ABF(boolean z) {
        InterfaceC58682mR interfaceC58682mR = this.A00;
        if (interfaceC58682mR == null) {
            interfaceC58682mR = this.A01;
        }
        return interfaceC58682mR.ABF(z);
    }

    @Override // X.InterfaceC58682mR
    public final void ABL(float f) {
        InterfaceC58682mR interfaceC58682mR = this.A00;
        if (interfaceC58682mR == null) {
            interfaceC58682mR = this.A01;
        }
        interfaceC58682mR.ABL(f);
    }

    @Override // X.InterfaceC58682mR
    public final void APX() {
        InterfaceC58682mR interfaceC58682mR = this.A00;
        if (interfaceC58682mR == null) {
            interfaceC58682mR = this.A01;
        }
        interfaceC58682mR.APX();
    }

    @Override // X.InterfaceC58682mR
    public final InterfaceC58682mR AWO(String str) {
        InterfaceC58682mR interfaceC58682mR = this.A00;
        if (interfaceC58682mR == null) {
            interfaceC58682mR = this.A01;
        }
        return interfaceC58682mR.AWO(str);
    }

    @Override // X.InterfaceC58682mR
    public final float Aze() {
        InterfaceC58682mR interfaceC58682mR = this.A00;
        if (interfaceC58682mR == null) {
            interfaceC58682mR = this.A01;
        }
        return interfaceC58682mR.Aze();
    }

    @Override // X.InterfaceC58682mR
    public final float BiI() {
        InterfaceC58682mR interfaceC58682mR = this.A00;
        if (interfaceC58682mR == null) {
            interfaceC58682mR = this.A01;
        }
        return interfaceC58682mR.BiI();
    }

    @Override // X.InterfaceC58682mR
    public final int Bmx() {
        InterfaceC58682mR interfaceC58682mR = this.A00;
        if (interfaceC58682mR == null) {
            interfaceC58682mR = this.A01;
        }
        return interfaceC58682mR.Bmx();
    }

    @Override // X.InterfaceC58682mR
    public final C27859CPw CN4(String[] strArr, float f, float f2) {
        InterfaceC58682mR interfaceC58682mR = this.A00;
        if (interfaceC58682mR == null) {
            interfaceC58682mR = this.A01;
        }
        return interfaceC58682mR.CN4(strArr, f, f2);
    }

    @Override // X.InterfaceC58682mR
    public final void E4S() {
        InterfaceC58682mR interfaceC58682mR = this.A00;
        if (interfaceC58682mR == null) {
            interfaceC58682mR = this.A01;
        }
        interfaceC58682mR.E4S();
    }

    @Override // X.InterfaceC58682mR
    public final void EEv() {
        InterfaceC58682mR interfaceC58682mR = this.A00;
        if (interfaceC58682mR == null) {
            interfaceC58682mR = this.A01;
        }
        interfaceC58682mR.EEv();
    }

    @Override // X.InterfaceC58682mR
    public final void EFV(Animator.AnimatorListener animatorListener) {
        InterfaceC58682mR interfaceC58682mR = this.A00;
        if (interfaceC58682mR == null) {
            interfaceC58682mR = this.A01;
        }
        interfaceC58682mR.EFV(animatorListener);
    }

    @Override // X.InterfaceC58682mR
    public final InterfaceC58682mR EH0(int i) {
        InterfaceC58682mR interfaceC58682mR = this.A00;
        if (interfaceC58682mR == null) {
            interfaceC58682mR = this.A01;
        }
        return interfaceC58682mR.EH0(i);
    }

    @Override // X.InterfaceC58682mR
    public final InterfaceC58682mR EH1() {
        InterfaceC58682mR interfaceC58682mR = this.A00;
        if (interfaceC58682mR == null) {
            interfaceC58682mR = this.A01;
        }
        return interfaceC58682mR.EH1();
    }

    @Override // X.InterfaceC58682mR
    public final InterfaceC58682mR EMk(float f) {
        InterfaceC58682mR interfaceC58682mR = this.A00;
        if (interfaceC58682mR == null) {
            interfaceC58682mR = this.A01;
        }
        return interfaceC58682mR.EMk(f);
    }

    @Override // X.InterfaceC58682mR
    public final InterfaceC58682mR EWJ(TimeInterpolator timeInterpolator) {
        InterfaceC58682mR interfaceC58682mR = this.A00;
        if (interfaceC58682mR == null) {
            interfaceC58682mR = this.A01;
        }
        return interfaceC58682mR.EWJ(timeInterpolator);
    }

    @Override // X.InterfaceC58682mR
    @Deprecated
    public final InterfaceC58682mR FEB(float f, float f2) {
        InterfaceC58682mR interfaceC58682mR = this.A00;
        if (interfaceC58682mR == null) {
            interfaceC58682mR = this.A01;
        }
        return interfaceC58682mR.FEB(f, f2);
    }

    @Override // android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ Drawable.ConstantState getConstantState() {
        return super.A00;
    }

    @Override // X.AbstractC58672mQ, android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        C58752mY c58752mY = (C58752mY) super.A00;
        AbstractC56582ir A00 = c58752mY.A00();
        if (A00 == null) {
            return ((C58692mS) c58752mY.A02).A00;
        }
        return (int) A00.A04[A00.A00].A03.A00;
    }

    @Override // X.AbstractC58672mQ, android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        C58752mY c58752mY = (C58752mY) super.A00;
        AbstractC56582ir A00 = c58752mY.A00();
        if (A00 == null) {
            return ((C58692mS) c58752mY.A02).A01;
        }
        return (int) A00.A04[A00.A00].A03.A01;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, AbstractC55922hc.A1e);
        String string = obtainAttributes.getString(4);
        String string2 = obtainAttributes.getString(3);
        String string3 = obtainAttributes.getString(0);
        float f = obtainAttributes.getFloat(2, 0.0f);
        float f2 = obtainAttributes.getFloat(1, 0.0f);
        obtainAttributes.recycle();
        CallerContext A00 = CallerContext.A00(getClass());
        if (string2 != null && string3 != null) {
            C58692mS c58692mS = (C58692mS) super.A00.A02;
            synchronized (c58692mS) {
                c58692mS.A01 = (int) (f + 0.5f);
                c58692mS.A00 = (int) (f2 + 0.5f);
                ((AbstractC58702mT) c58692mS).A01 = string;
                ((AbstractC58702mT) c58692mS).A00 = A00;
                c58692mS.A02 = AnonymousClass001.A0T(string2, string3, '_');
            }
        }
    }

    @Override // X.InterfaceC58682mR
    public final boolean isFinished() {
        InterfaceC58682mR interfaceC58682mR = this.A00;
        if (interfaceC58682mR == null) {
            interfaceC58682mR = this.A01;
        }
        return interfaceC58682mR.isFinished();
    }

    @Override // X.InterfaceC58682mR
    public final boolean isPlaying() {
        InterfaceC58682mR interfaceC58682mR = this.A00;
        if (interfaceC58682mR == null) {
            interfaceC58682mR = this.A01;
        }
        return interfaceC58682mR.isPlaying();
    }

    @Override // X.InterfaceC58682mR
    public final void pause() {
        InterfaceC58682mR interfaceC58682mR = this.A00;
        if (interfaceC58682mR == null) {
            interfaceC58682mR = this.A01;
        }
        interfaceC58682mR.pause();
    }

    @Override // X.InterfaceC58682mR
    public final void stop() {
        InterfaceC58682mR interfaceC58682mR = this.A00;
        if (interfaceC58682mR == null) {
            interfaceC58682mR = this.A01;
        }
        interfaceC58682mR.stop();
    }

    public AbstractC58662mP(C58752mY c58752mY) {
        super(c58752mY);
        this.A02 = new ArrayList();
        this.A01 = new C58782mb();
    }

    @Override // X.AbstractC58672mQ, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Object obj = this.A00;
        if (obj != null) {
            ((Drawable) obj).setBounds(rect);
        }
    }

    @Override // X.AbstractC58672mQ, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Object obj = this.A00;
        if (obj != null) {
            ((Drawable) obj).setVisible(z, z2);
        }
        return visible;
    }
}
