package X;

import android.opengl.GLES20;
import android.opengl.Matrix;
import com.facebook.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Deprecated;

/* renamed from: X.9eB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C214119eB extends AbstractC201618vq implements InterfaceC201628vr {
    public C179877yd A00;
    public final C24236Ap3 A01;
    public final Map A02;
    public final C180337zN A06;
    public final C180327zM A07;
    public final float[] A09;
    public final boolean A08 = true;
    public final float A03 = 0.02f;
    public final float A04 = 0.2f;
    public final float A05 = 0.05f;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.Ap3, java.lang.Object] */
    public C214119eB() {
        Integer num = C05F.A00;
        ?? obj = new Object();
        obj.A00 = num;
        obj.A01 = true;
        this.A01 = obj;
        this.A02 = AbstractC166987dD.A1G();
        float[] fArr = new float[16];
        this.A09 = fArr;
        C180327zM c180327zM = new C180327zM(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
        this.A07 = c180327zM;
        Matrix.setIdentityM(fArr, 0);
        HashMap A1G = AbstractC166987dD.A1G();
        ArrayList A1E = AbstractC166987dD.A1E();
        A1G.put("aPosition", c180327zM);
        A1E.add("aPosition");
        A1G.put("aTextureCoord", new C180327zM(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f}));
        A1E.add("aTextureCoord");
        this.A06 = new C180337zN(A1E, A1G);
    }

    @Override // X.C81A
    public final boolean DCH(C201278vB c201278vB, long j) {
        String str;
        C14360o3.A0B(c201278vB, 0);
        C24236Ap3 c24236Ap3 = this.A01;
        if (c24236Ap3.A01 != c201278vB.A05()) {
            if (!this.A08) {
                Map map = this.A02;
                Iterator A16 = AbstractC166997dE.A16(map);
                while (A16.hasNext()) {
                    C81H c81h = (C81H) A16.next();
                    C14360o3.A0A(c81h);
                    c81h.A02();
                }
                map.clear();
            }
            c24236Ap3.A01 = c201278vB.A05();
        }
        GLES20.glDisable(3042);
        GLES20.glDisable(2929);
        GLES20.glDisable(2884);
        if (this.A00 != null) {
            Map map2 = this.A02;
            C81H c81h2 = (C81H) map2.get(c24236Ap3);
            if (c81h2 == null) {
                int intValue = c24236Ap3.A00.intValue();
                if (intValue != 0) {
                    if (intValue != 1) {
                        String A00 = AbstractC111324zv.A00(704);
                        if (2 - intValue != 0) {
                            str = "DEFAULT";
                        } else {
                            str = "YUV_GL3";
                        }
                        throw AbstractC167007dF.A0c(A00, str);
                    }
                    throw AbstractC166987dD.A1D("BGRA format is not supported in EnhanceRenderer");
                }
                C179877yd c179877yd = this.A00;
                C14360o3.A0A(c179877yd);
                c81h2 = c179877yd.A02(R.raw.copy_vs, R.raw.enhance_fs, c24236Ap3.A01);
                map2.put(c24236Ap3.clone(), c81h2);
            }
            C14360o3.A0A(c81h2);
            C9K4 A01 = c81h2.A01();
            C14360o3.A07(A01);
            A01.A04("uSurfaceTransformMatrix", c201278vB.A04);
            A01.A04("uVideoTransformMatrix", c201278vB.A05);
            A01.A04("uSceneTransformMatrix", c201278vB.A03);
            A01.A02("uBrightness", this.A03);
            A01.A02("uContrast", this.A04);
            A01.A02("uSaturation", this.A05);
            A01.A03("sTexture", c201278vB.A00());
            A01.A01(this.A06);
            AbstractC180237zD.A02(AbstractC111324zv.A00(850), new Object[0]);
            return true;
        }
        throw AbstractC166987dD.A14("Called without a program factory");
    }

    @Override // X.C81A
    public final void Dr7(C179877yd c179877yd) {
        C14360o3.A0B(c179877yd, 0);
        this.A00 = c179877yd;
    }

    @Override // X.C81A
    public final void DrA() {
        this.A00 = null;
        Map map = this.A02;
        Iterator A16 = AbstractC166997dE.A16(map);
        while (A16.hasNext()) {
            C81H c81h = (C81H) A16.next();
            C14360o3.A0A(c81h);
            c81h.A02();
        }
        map.clear();
    }

    @Override // X.C81A
    public final void EPl(X9R x9r) {
    }

    @Override // X.InterfaceC201628vr
    public final void ESB(Integer num) {
        C14360o3.A0B(num, 0);
        this.A01.A00 = num;
    }

    @Override // X.C81A
    @Deprecated(message = "")
    public final boolean Ejv() {
        return false;
    }

    @Override // X.C81A
    public final boolean isEnabled() {
        return true;
    }

    @Override // X.C81A
    public final Integer BIA() {
        return C05F.A00;
    }
}
