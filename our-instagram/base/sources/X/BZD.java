package X;

import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.facebook.common.callercontext.ContextChain;

/* loaded from: classes5.dex */
public final class BZD extends ImageView {
    public Rect A00;
    public C6Bb A01;
    public C5GG A02;
    public C27771Wf A03;
    public InterfaceC59172nI A04;
    public Object A05;
    public ContextChain A06;

    public static final void A00(BZD bzd) {
        C5FC c5fc;
        C2nP c2nP = null;
        InterfaceC59172nI interfaceC59172nI = bzd.A04;
        if (interfaceC59172nI != null) {
            Rect rect = bzd.A00;
            if (rect != null) {
                C27771Wf c27771Wf = bzd.A03;
                if (c27771Wf != null) {
                    if ((c27771Wf.A0Z && c27771Wf.A0Y) || c27771Wf.A0U) {
                        C27811Wj c27811Wj = new C27811Wj(c27771Wf);
                        int width = rect.width();
                        int height = rect.height();
                        if (width > 0 && height > 0) {
                            c5fc = new C5FC(width, height);
                        } else {
                            c5fc = null;
                        }
                        c27811Wj.A0L = c5fc;
                        c27771Wf = new C27771Wf(c27811Wj);
                    }
                } else {
                    c27771Wf = null;
                }
                C27651Vs A01 = C59232nO.A01();
                Resources resources = bzd.getResources();
                C14360o3.A07(resources);
                c2nP = A01.A02(resources, c27771Wf, interfaceC59172nI, false);
            }
            C1WN A00 = C59232nO.A00();
            Object drawable = bzd.getDrawable();
            C14360o3.A0C(drawable, MSV.A00(59));
            Object obj = bzd.A05;
            A00.AUt(rect, bzd.A06, bzd.A01, null, (InterfaceC59242nQ) drawable, c2nP, null, bzd.A02, obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setFrescoDrawable(InterfaceC59242nQ interfaceC59242nQ) {
        C14360o3.A0B(interfaceC59242nQ, 0);
        setImageDrawable((Drawable) interfaceC59242nQ);
    }

    public final Object getCallerContext() {
        return this.A05;
    }

    public final ContextChain getContextChain() {
        return this.A06;
    }

    public final InterfaceC59242nQ getFrescoDrawable() {
        Object drawable = getDrawable();
        C14360o3.A0C(drawable, MSV.A00(59));
        return (InterfaceC59242nQ) drawable;
    }

    public final C5GG getImageListener() {
        return this.A02;
    }

    public final C6Bb getPerfDataListener() {
        return this.A01;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        int A06 = C0f9.A06(357778360);
        super.onAttachedToWindow();
        A00(this);
        Drawable drawable = getDrawable();
        String A00 = MSV.A00(59);
        C14360o3.A0C(drawable, A00);
        C14360o3.A0C(getDrawable(), A00);
        C0f9.A0D(-1951583753, A06);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        boolean z;
        Animatable animatable;
        int A06 = C0f9.A06(-1087528758);
        super.onDetachedFromWindow();
        C27771Wf c27771Wf = this.A03;
        if (c27771Wf != null) {
            z = c27771Wf.A0T;
        } else {
            z = true;
        }
        String A00 = MSV.A00(59);
        if (z) {
            Object drawable = getDrawable();
            C14360o3.A0C(drawable, A00);
            Object AZ0 = ((InterfaceC59242nQ) drawable).AZ0();
            if ((AZ0 instanceof Animatable) && (animatable = (Animatable) AZ0) != null) {
                animatable.stop();
            }
        }
        C14360o3.A0C(getDrawable(), A00);
        C14360o3.A0C(getDrawable(), A00);
        C1WN A002 = C59232nO.A00();
        Object drawable2 = getDrawable();
        C14360o3.A0C(drawable2, A00);
        A002.EEG((InterfaceC59242nQ) drawable2);
        C0f9.A0D(816161132, A06);
    }

    public final void setCallerContext(Object obj) {
        this.A05 = obj;
    }

    public final void setContextChain(ContextChain contextChain) {
        this.A06 = contextChain;
    }

    public final void setImageListener(C5GG c5gg) {
        this.A02 = c5gg;
    }

    public final void setPerfDataListener(C6Bb c6Bb) {
        this.A01 = c6Bb;
    }
}
