package X;

import android.opengl.GLES20;
import android.opengl.Matrix;
import com.facebook.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public final class AKR {
    public C179877yd A00;
    public final Map A01 = AbstractC166987dD.A1G();
    public final C180337zN A02;
    public final C224279vB A03;

    public final void A02() {
        this.A00 = null;
        Map map = this.A01;
        Iterator A16 = AbstractC166997dE.A16(map);
        while (A16.hasNext()) {
            ((C81H) A16.next()).A02();
        }
        map.clear();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.9vB, java.lang.Object] */
    public static C9K4 A00(AKR akr, Integer num) {
        int i;
        C18C.A0H(AbstractC167007dF.A1W(akr.A00), "Called without a program factory");
        C224279vB c224279vB = akr.A03;
        c224279vB.A00 = num;
        Map map = akr.A01;
        C81H c81h = (C81H) map.get(c224279vB);
        if (c81h == null) {
            int intValue = num.intValue();
            if (intValue != 0) {
                i = R.raw.echo_fs;
                if (intValue != 1) {
                    i = R.raw.duo_fs;
                }
            } else {
                i = R.raw.copy_fs;
            }
            c81h = akr.A00.A02(R.raw.copy_vs, i, c224279vB.A01);
            Integer num2 = c224279vB.A00;
            boolean z = c224279vB.A01;
            ?? obj = new Object();
            obj.A00 = num2;
            obj.A01 = z;
            map.put(obj, c81h);
        }
        return c81h.A01();
    }

    public static void A01(AKR akr, C201278vB c201278vB) {
        C224279vB c224279vB = akr.A03;
        if (c224279vB.A01 != c201278vB.A05()) {
            Map map = akr.A01;
            Iterator A16 = AbstractC166997dE.A16(map);
            while (A16.hasNext()) {
                ((C81H) A16.next()).A02();
            }
            map.clear();
            c224279vB.A01 = c201278vB.A05();
        }
    }

    public final void A03(C9K4 c9k4, C201278vB c201278vB) {
        GLES20.glDisable(3042);
        GLES20.glDisable(2929);
        GLES20.glDisable(2884);
        c9k4.A04("uSurfaceTransformMatrix", c201278vB.A04);
        c9k4.A04("uVideoTransformMatrix", c201278vB.A05);
        c9k4.A04("uSceneTransformMatrix", c201278vB.A03);
        c9k4.A03("sTexture", c201278vB.A00());
        c9k4.A01(this.A02);
        AbstractC180237zD.A02("BoomerangFramesGLRenderer::draw", new Object[0]);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.9vB, java.lang.Object] */
    public AKR(C179877yd c179877yd) {
        Integer num = C05F.A00;
        ?? obj = new Object();
        obj.A00 = num;
        obj.A01 = true;
        this.A03 = obj;
        Matrix.setIdentityM(new float[16], 0);
        C180327zM c180327zM = new C180327zM(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
        HashMap A1G = AbstractC166987dD.A1G();
        ArrayList A1E = AbstractC166987dD.A1E();
        A1G.put("aPosition", c180327zM);
        A1E.add("aPosition");
        A1G.put("aTextureCoord", new C180327zM(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f}));
        A1E.add("aTextureCoord");
        this.A02 = new C180337zN(A1E, A1G);
        this.A00 = c179877yd;
    }

    public final void A04(C201278vB c201278vB) {
        A01(this, c201278vB);
        A03(A00(this, C05F.A00), c201278vB);
    }
}
