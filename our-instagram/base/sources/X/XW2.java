package X;

import android.graphics.Rect;
import com.instagram.ui.widget.textureview.CircularTextureView;
import java.util.UUID;

/* loaded from: classes12.dex */
public final class XW2 extends AbstractC184688Hj {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public XW2(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj;
        this.A03 = obj2;
        this.A02 = obj3;
    }

    @Override // X.AbstractC184688Hj
    public final void A01(final Exception exc) {
        if (this.A00 == 0) {
            AbstractC175037qd.A00(22, 0, exc);
            C208789Lm c208789Lm = (C208789Lm) this.A01;
            C175227qw c175227qw = c208789Lm.A0R;
            UUID uuid = c208789Lm.A0Q.A03;
            final InterfaceC196578mn interfaceC196578mn = (InterfaceC196578mn) this.A03;
            c175227qw.A05(new Runnable() { // from class: X.YHE
                @Override // java.lang.Runnable
                public final void run() {
                    InterfaceC196578mn.this.DEF(exc);
                }
            }, uuid);
            if (!AbstractC176937tp.A02(AbstractC177127u8.A01) || !c208789Lm.A0S.get()) {
                c175227qw.A07("take_photo_exception_restart_preview", new CallableC72062XMf(8, this.A02, this));
            }
        }
    }

    @Override // X.AbstractC184688Hj
    public final /* bridge */ /* synthetic */ void A02(Object obj) {
        C176877tj c176877tj;
        int i;
        int i2;
        int i3;
        if (this.A00 != 0) {
            YP5 yp5 = (YP5) this.A02;
            CircularTextureView Ak1 = yp5.Ak1();
            if (Ak1.A01() && (c176877tj = (C176877tj) this.A03) != null) {
                int i4 = c176877tj.A01;
                int i5 = c176877tj.A02;
                C18C.A0F(Ak1.A01());
                int width = Ak1.getWidth();
                int height = Ak1.getHeight();
                float f = i4 / i5;
                float f2 = width;
                float f3 = height;
                if (f < f2 / f3) {
                    i2 = (int) (f3 / f);
                    i = width;
                } else {
                    i = (int) (f * f2);
                    i2 = height;
                }
                if (i2 != 0 && i != 0) {
                    int i6 = 0;
                    if (i < i2) {
                        i3 = (i2 - height) / 2;
                        Ak1.A00 = i2 / f3;
                    } else {
                        i6 = (i - width) / 2;
                        Ak1.A01 = i / f2;
                        i3 = 0;
                    }
                    Ak1.A02 = new Rect(-i6, -i3, i - i6, i2 - i3);
                    W3I w3i = Ak1.A04;
                    w3i.getClass();
                    Rect rect = Ak1.A02;
                    rect.getClass();
                    w3i.A0A = rect;
                    W3I w3i2 = Ak1.A04;
                    float f4 = Ak1.A00;
                    float f5 = Ak1.A01;
                    if (w3i2.A05 == C05F.A0Y) {
                        C68911VeB c68911VeB = w3i2.A03;
                        c68911VeB.getClass();
                        float[] fArr = c68911VeB.A00.A0B;
                        fArr[0] = f4;
                        fArr[1] = f5;
                        yp5.EQw((InterfaceC174767qC) this.A01);
                        return;
                    }
                    throw new IllegalStateException();
                }
                throw AbstractC166987dD.A12("Invalid media or view size. Can't fit media to view");
            }
        }
    }
}
