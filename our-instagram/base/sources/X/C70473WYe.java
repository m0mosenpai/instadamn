package X;

import android.graphics.RectF;
import android.opengl.GLES20;
import android.opengl.Matrix;
import com.facebook.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.WYe, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70473WYe implements C81A {
    public int A00;
    public C179877yd A01;
    public boolean A02;
    public C180337zN A03;
    public final C71189Wpb A04;
    public final Map A05;
    public final C180327zM A06;
    public final float[] A07;

    @Override // X.C81A
    public final void Dr3(int i, int i2) {
    }

    @Override // X.C81A
    public final void Dr8(RectF rectF) {
    }

    @Override // X.C81A
    public final void DrA() {
        this.A01 = null;
        this.A05.clear();
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
        return false;
    }

    @Override // X.C81A
    public final Integer BIA() {
        return C05F.A00;
    }

    @Override // X.C81A
    public final boolean DCH(C201278vB c201278vB, long j) {
        String str;
        C179877yd c179877yd;
        int i;
        int i2;
        GLES20.glClear(16640);
        C71189Wpb c71189Wpb = this.A04;
        if (c71189Wpb.A01 != c201278vB.A05()) {
            this.A05.clear();
            c71189Wpb.A01 = c201278vB.A05();
        }
        GLES20.glDisable(3042);
        GLES20.glDisable(2929);
        GLES20.glDisable(2884);
        if (this.A01 != null) {
            Map map = this.A05;
            C81H c81h = (C81H) map.get(c71189Wpb);
            if (c81h == null) {
                Integer num = c71189Wpb.A00;
                if (num == C05F.A00) {
                    int i3 = this.A00;
                    try {
                        if (i3 != 6) {
                            if (i3 != 7) {
                                c179877yd = this.A01;
                                i = R.raw.lite_copy_vs;
                                i2 = R.raw.copy_fs;
                            } else {
                                c81h = this.A01.A02(R.raw.video_transcode_vs_color_convert, R.raw.video_transcode_fs_hlg_rgba_color_convert, this.A02);
                            }
                        } else {
                            c81h = this.A01.A02(R.raw.video_transcode_vs_color_convert, R.raw.video_transcode_fs_rgba_color_convert, this.A02);
                        }
                    } catch (Exception unused) {
                        c81h = this.A01.A02(R.raw.lite_copy_vs, R.raw.copy_fs, this.A02);
                    }
                    map.put(c71189Wpb.A00(), c81h);
                } else if (num == C05F.A01) {
                    c179877yd = this.A01;
                    i = R.raw.lite_copy_vs;
                    i2 = R.raw.copy_bgra_fs;
                } else {
                    String A00 = AbstractC111324zv.A00(704);
                    if (num != null) {
                        if (1 - num.intValue() != 0) {
                            str = "DEFAULT";
                        } else {
                            str = "BGRA";
                        }
                    } else {
                        str = "null";
                    }
                    throw AbstractC167007dF.A0c(A00, str);
                }
                c81h = c179877yd.A02(i, i2, this.A02);
                map.put(c71189Wpb.A00(), c81h);
            }
            C9K4 A01 = c81h.A01();
            A01.A04("uSTMatrix", c201278vB.A04);
            A01.A04("uConstMatrix", c201278vB.A05);
            A01.A04("uSceneMatrix", c201278vB.A03);
            A01.A04("uContentTransform", c201278vB.A02);
            A01.A03("sTexture", c201278vB.A00());
            A01.A01(this.A03);
            AbstractC180237zD.A02(AbstractC111324zv.A00(850), new Object[0]);
            return true;
        }
        throw new RuntimeException("cannot be null");
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, X.Wpb] */
    public C70473WYe(boolean z) {
        this.A02 = false;
        C180327zM c180327zM = new C180327zM(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
        this.A06 = c180327zM;
        this.A00 = 0;
        this.A05 = new HashMap();
        Integer num = C05F.A00;
        ?? obj = new Object();
        obj.A00 = num;
        obj.A01 = true;
        this.A04 = obj;
        float[] fArr = new float[16];
        this.A07 = fArr;
        Matrix.setIdentityM(fArr, 0);
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        hashMap.put("aPosition", c180327zM);
        arrayList.add("aPosition");
        this.A03 = AbstractC65703TsZ.A0B(hashMap, arrayList, new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
        this.A02 = z;
    }

    @Override // X.C81A
    public final void Dr7(C179877yd c179877yd) {
        this.A01 = c179877yd;
    }

    public C70473WYe() {
        this(true);
    }
}
