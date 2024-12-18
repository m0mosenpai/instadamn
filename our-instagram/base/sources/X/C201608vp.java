package X;

import android.opengl.GLES20;
import android.opengl.Matrix;
import com.facebook.R;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.8vp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C201608vp extends AbstractC201618vq implements InterfaceC201628vr {
    public C179877yd A00;
    public C180337zN A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final C201638vs A05;
    public final Map A06;
    public final C180327zM A07;
    public final boolean A08;
    public final float[] A09;

    public final void A00(float[] fArr) {
        boolean z = false;
        if (fArr.length == 8) {
            z = true;
        }
        C0J8.A08(z, "Positional data must contain 8 elements");
        FloatBuffer floatBuffer = this.A07.A01;
        floatBuffer.put(fArr);
        floatBuffer.position(0);
    }

    @Override // X.C81A
    public final void DrA() {
        this.A00 = null;
        Map map = this.A06;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((C81H) it.next()).A02();
        }
        map.clear();
    }

    @Override // X.C81A
    public final void EPl(X9R x9r) {
    }

    @Override // X.C81A
    @Deprecated
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

    @Override // X.C81A
    public final boolean DCH(C201278vB c201278vB, long j) {
        int i;
        C201638vs c201638vs = this.A05;
        if (c201638vs.A01 != c201278vB.A05()) {
            if (!this.A08) {
                Map map = this.A06;
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    ((C81H) it.next()).A02();
                }
                map.clear();
            }
            c201638vs.A01 = c201278vB.A05();
        }
        if (this.A02) {
            GLES20.glDisable(3042);
        }
        if (this.A04) {
            GLES20.glDisable(2929);
        }
        if (this.A03) {
            GLES20.glDisable(2884);
        }
        C0J8.A03(this.A00, "Called without a program factory");
        Map map2 = this.A06;
        C81H c81h = (C81H) map2.get(c201638vs);
        if (c81h == null) {
            int i2 = R.raw.copy_vs;
            int intValue = c201638vs.A00.intValue();
            if (intValue != 0) {
                if (intValue != 1) {
                    if (intValue == 2) {
                        i = R.raw.copy_fs_nv12_gl3;
                        i2 = R.raw.copy_vs_gl3;
                    } else {
                        throw new IllegalArgumentException(AnonymousClass001.A0R(AbstractC111324zv.A00(704), "DEFAULT"));
                    }
                } else {
                    i = R.raw.copy_bgra_fs;
                }
            } else {
                i = R.raw.copy_fs;
            }
            c81h = this.A00.A02(i2, i, c201638vs.A01);
            map2.put(c201638vs.A00(), c81h);
        }
        C9K4 A01 = c81h.A01();
        A01.A04("uSurfaceTransformMatrix", c201278vB.A04);
        A01.A04("uVideoTransformMatrix", c201278vB.A05);
        A01.A04("uSceneTransformMatrix", c201278vB.A03);
        A01.A03("sTexture", c201278vB.A00());
        A01.A01(this.A01);
        AbstractC180237zD.A02(AbstractC111324zv.A00(850), new Object[0]);
        return true;
    }

    @Override // X.InterfaceC201628vr
    public final void ESB(Integer num) {
        this.A05.A00 = num;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.8vs, java.lang.Object] */
    public C201608vp(boolean z) {
        C180327zM c180327zM = new C180327zM(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
        this.A07 = c180327zM;
        this.A02 = true;
        this.A04 = true;
        this.A03 = true;
        this.A08 = z;
        this.A06 = new HashMap();
        Integer num = C05F.A00;
        ?? obj = new Object();
        obj.A00 = num;
        obj.A01 = true;
        this.A05 = obj;
        float[] fArr = new float[16];
        this.A09 = fArr;
        Matrix.setIdentityM(fArr, 0);
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        hashMap.put("aPosition", c180327zM);
        arrayList.add("aPosition");
        hashMap.put("aTextureCoord", new C180327zM(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f}));
        arrayList.add("aTextureCoord");
        this.A01 = new C180337zN(arrayList, hashMap);
    }

    @Override // X.C81A
    public final void Dr7(C179877yd c179877yd) {
        this.A00 = c179877yd;
    }

    public C201608vp() {
        this(false);
    }
}
