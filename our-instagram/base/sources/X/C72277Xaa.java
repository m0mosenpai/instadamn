package X;

import android.graphics.Color;
import android.graphics.Point;
import android.opengl.GLES20;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.Xaa, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72277Xaa extends AbstractC73478YFb {
    public final YQ3[] A00;

    @Override // X.YQ3
    public final void CNp(C22978ABc c22978ABc) {
        Y13 y13;
        C14360o3.A0B(c22978ABc, 0);
        YQ3[] yq3Arr = this.A00;
        int i = 0;
        do {
            yq3Arr[i].CNp(c22978ABc);
            i++;
        } while (i < 3);
        String glGetString = GLES20.glGetString(7939);
        boolean z = true;
        if (glGetString != null && AbstractC001900j.A0a(glGetString, "GL_BLEND_EQUATION_EXT", false)) {
            y13 = Y13.A07;
        } else {
            z = false;
            y13 = Y13.A08;
        }
        EQL(y13);
        if (!z) {
            YQ3 yq3 = yq3Arr[1];
            C14360o3.A0C(yq3, "null cannot be cast to non-null type com.instagram.ui.widget.drawing.gl.brush.BackedBrush");
            C72278Xab c72278Xab = (C72278Xab) yq3;
            c72278Xab.A00 = 0.6f;
            C73480YFd c73480YFd = c72278Xab.A02;
            if (c73480YFd != null) {
                c73480YFd.A01 = c72278Xab.A03;
                c73480YFd.A00 = 0.6f;
            }
            yq3Arr[2].EPb(128);
        }
    }

    @Override // X.AbstractC73478YFb, X.YQ3
    public final void EQD(Point point) {
        C14360o3.A0B(point, 0);
        super.EQD(point);
        YQ3[] yq3Arr = this.A00;
        int i = 0;
        do {
            yq3Arr[i].EQD(point);
            i++;
        } while (i < 3);
    }

    @Override // X.AbstractC73478YFb, X.YQ3
    public final void ERe(int i) {
        int HSVToColor;
        int HSVToColor2;
        float[] fArr = new float[3];
        Color.RGBToHSV(Color.red(i), Color.green(i), Color.blue(i), fArr);
        float f = fArr[1];
        if (AbstractC167007dF.A1N((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1))) && fArr[2] == 0.0f) {
            HSVToColor = Color.HSVToColor(new float[]{279.0f, 1.0f, 0.8f});
            HSVToColor2 = i;
            Color.HSVToColor(new float[]{fArr[0], fArr[1], Math.min(fArr[2] + 0.1f, 1.0f)});
        } else {
            float f2 = 0.8f;
            if (AbstractC167007dF.A1N((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1))) && fArr[2] == 1.0f) {
                fArr[0] = 230.0f;
                fArr[1] = 0.1f;
                fArr[2] = 0.8f;
            }
            HSVToColor = Color.HSVToColor(new float[]{fArr[0], fArr[1], Math.min(fArr[2] + 0.2f, 1.0f)});
            float f3 = fArr[1];
            float[] fArr2 = new float[3];
            fArr2[0] = fArr[0];
            if (f3 == 0.0f) {
                fArr2[1] = 0.05f;
            } else {
                fArr2[1] = 0.15f;
                f2 = 0.99f;
            }
            fArr2[2] = f2;
            HSVToColor2 = Color.HSVToColor(fArr2);
        }
        YQ3[] yq3Arr = this.A00;
        yq3Arr[2].ERe(HSVToColor2);
        yq3Arr[1].ERe(HSVToColor);
        this.A03 = i;
    }

    @Override // X.YQ3
    public final void EYc(float[] fArr) {
        C14360o3.A0B(fArr, 0);
        this.A07 = fArr;
        YQ3[] yq3Arr = this.A00;
        int i = 0;
        do {
            yq3Arr[i].EYc(fArr);
            i++;
        } while (i < 3);
    }

    @Override // X.AbstractC73478YFb, X.YQ3
    public final YRN AMV() {
        C72280Xad c72280Xad = new C72280Xad(this);
        c72280Xad.A01(this);
        return c72280Xad;
    }

    @Override // X.YQ3
    public final C22978ABc ArF() {
        return this.A00[0].ArF();
    }

    @Override // X.AbstractC73478YFb, X.YQ3
    public final boolean isValid() {
        C14360o3.A0B(this.A00, 0);
        Iterable c17u = new C17u(0, 2);
        if (!(c17u instanceof Collection) || !((Collection) c17u).isEmpty()) {
            Iterator it = c17u.iterator();
            while (it.hasNext()) {
                if (!r3[((AbstractC16880sg) it).A00()].isValid()) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72277Xaa() {
        super("Neon");
        C71070WnS c71070WnS = new C71070WnS(0.1f, 0.8f);
        C72297Xau c72297Xau = new C72297Xau(c71070WnS);
        int i = 0;
        YQ3[] yq3Arr = {new C72296Xat(c71070WnS), new C72298Xav(c71070WnS), c72297Xau};
        do {
            YQ3 yq3 = yq3Arr[i];
            yq3Arr[i] = new C72278Xab(yq3, yq3.Aia());
            i++;
        } while (i < 3);
        this.A00 = yq3Arr;
    }
}
