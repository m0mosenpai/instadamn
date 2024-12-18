package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import java.nio.FloatBuffer;
import java.util.Map;

/* loaded from: classes12.dex */
public abstract class XOQ {
    public boolean A00 = false;
    public int[] A01 = new int[1];
    public int[] A02 = new int[4];

    public final void A02(XO3 xo3, YPq yPq, InterfaceC197718oi interfaceC197718oi, YRL yrl, InterfaceC197718oi[] interfaceC197718oiArr) {
        InterfaceC197718oi interfaceC197718oi2;
        if (!(this instanceof C72232XZj)) {
            if (this instanceof XOR) {
                XOR xor = (XOR) this;
                xo3.getClass();
                xo3.A01(C05F.A01, "image");
                float[] fArr = xor.A09;
                fArr[0] = 0.0f;
                fArr[1] = 1.0f;
                XO2 xo2 = xor.A02;
                if (xo2 != null) {
                    float[] fArr2 = xor.A07;
                    xo2.A00(fArr2[0], fArr2[1], fArr2[2], fArr2[3]);
                }
                XO2 xo22 = xor.A04;
                if (xo22 != null) {
                    float[] fArr3 = xor.A0A;
                    xo22.A00(fArr3[0], fArr3[1], fArr3[2], fArr3[3]);
                }
                C72239XZr c72239XZr = xor.A01;
                if (c72239XZr != null) {
                    float f = fArr[0];
                    float f2 = fArr[1];
                    FloatBuffer floatBuffer = c72239XZr.A00;
                    floatBuffer.put(0, f);
                    floatBuffer.put(1, f2);
                    ((AbstractC72243XZy) c72239XZr).A00 = true;
                }
                XO2 xo23 = xor.A03;
                if (xo23 != null) {
                    float[] fArr4 = xor.A08;
                    xo23.A00(fArr4[0], fArr4[1], fArr4[2], fArr4[3]);
                }
                Bitmap bitmap = xor.A00;
                XO8 xo8 = xor.A05;
                if (xo8 != null && bitmap != null) {
                    BitmapFactory.Options options = C209089Mq.A00;
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    int A00 = C209089Mq.A00();
                    GLUtils.texImage2D(3553, 0, bitmap, 0);
                    C197708oh c197708oh = null;
                    if (!C209089Mq.A05(AbstractC111324zv.A00(4860))) {
                        c197708oh = AbstractC197698og.A01(null, A00, width, height);
                    }
                    c197708oh.getClass();
                    xor.A06 = c197708oh;
                    xo3.A02("bitmapBackgroundSampler", c197708oh.getTextureId());
                    GLES20.glActiveTexture(33985);
                    GLES20.glBindTexture(3553, xor.A06.getTextureId());
                    xo8.A00.put(0, 1);
                    ((AbstractC72243XZy) xo8).A00 = true;
                    return;
                }
                return;
            }
            if (this instanceof C72231XZi) {
                C72231XZi c72231XZi = (C72231XZi) this;
                xo3.getClass();
                Integer num = C05F.A01;
                xo3.A01(num, "image");
                xo3.A01(num, "uColorLut");
                XO2 xo24 = c72231XZi.A0C;
                if (xo24 != null) {
                    float width2 = interfaceC197718oi.getWidth();
                    float height2 = interfaceC197718oi.getHeight();
                    xo24.A00(width2, height2, 1.0f / width2, 1.0f / height2);
                }
                XO2 xo25 = c72231XZi.A0D;
                if (xo25 != null && (interfaceC197718oi2 = interfaceC197718oiArr[0]) != null) {
                    float width3 = interfaceC197718oi2.getWidth();
                    float height3 = interfaceC197718oi2.getHeight();
                    xo25.A00(width3, height3, 1.0f / width3, 1.0f / height3);
                }
                XOM xom = c72231XZi.A07;
                if (xom != null) {
                    xom.A00(c72231XZi.A02);
                }
                XOM xom2 = c72231XZi.A09;
                if (xom2 != null) {
                    xom2.A00(0.0f);
                }
                XO2 xo26 = c72231XZi.A0B;
                if (xo26 != null) {
                    float[] fArr5 = c72231XZi.A0H;
                    xo26.A00(fArr5[0], fArr5[1], fArr5[2], fArr5[3]);
                }
                XO2 xo27 = c72231XZi.A0F;
                if (xo27 != null) {
                    float[] fArr6 = c72231XZi.A0J;
                    xo27.A00(fArr6[0], fArr6[1], fArr6[2], fArr6[3]);
                }
                XOM xom3 = c72231XZi.A06;
                if (xom3 != null) {
                    xom3.A00(c72231XZi.A01);
                }
                XOM xom4 = c72231XZi.A08;
                if (xom4 != null) {
                    xom4.A00(c72231XZi.A03);
                }
                XOM xom5 = c72231XZi.A05;
                if (xom5 != null) {
                    xom5.A00(c72231XZi.A00);
                }
                XO2 xo28 = c72231XZi.A0E;
                if (xo28 != null) {
                    float[] fArr7 = c72231XZi.A0I;
                    xo28.A00(fArr7[0], fArr7[1], fArr7[2], fArr7[3]);
                }
                XO2 xo29 = c72231XZi.A0G;
                if (xo29 != null) {
                    float[] fArr8 = c72231XZi.A0K;
                    xo29.A00(fArr8[0], fArr8[1], fArr8[2], fArr8[3]);
                }
                XOM xom6 = c72231XZi.A0A;
                if (xom6 == null) {
                    return;
                }
                xom6.A00(((float) (System.currentTimeMillis() - c72231XZi.A04)) * 0.001f);
                return;
            }
            if (this instanceof C72233XZk) {
                C72233XZk c72233XZk = (C72233XZk) this;
                yPq.getClass();
                C72239XZr c72239XZr2 = c72233XZk.A08;
                if (c72239XZr2 != null) {
                    float width4 = interfaceC197718oi.getWidth();
                    float height4 = interfaceC197718oi.getHeight();
                    FloatBuffer floatBuffer2 = c72239XZr2.A00;
                    floatBuffer2.put(0, width4);
                    floatBuffer2.put(1, height4);
                    ((AbstractC72243XZy) c72239XZr2).A00 = true;
                }
                C72240XZt c72240XZt = c72233XZk.A0D;
                if (c72240XZt != null) {
                    c72240XZt.A00.put(0, 0);
                    ((AbstractC72243XZy) c72240XZt).A00 = true;
                }
                XOM xom7 = c72233XZk.A00;
                if (xom7 != null) {
                    xom7.A00(0.0f);
                }
                XOM xom8 = c72233XZk.A04;
                if (xom8 != null) {
                    xom8.A00(0.8f);
                }
                XOM xom9 = c72233XZk.A05;
                if (xom9 != null) {
                    xom9.A00(0.025f);
                }
                XZs xZs = c72233XZk.A09;
                if (xZs != null) {
                    FloatBuffer floatBuffer3 = xZs.A00;
                    floatBuffer3.put(0, 1.0f);
                    floatBuffer3.put(1, 1.0f);
                    floatBuffer3.put(2, 1.0f);
                    ((AbstractC72243XZy) xZs).A00 = true;
                }
                XOM xom10 = c72233XZk.A03;
                if (xom10 != null) {
                    xom10.A00(0.0f);
                }
                XOM xom11 = c72233XZk.A01;
                if (xom11 != null) {
                    xom11.A00(0.1f);
                }
                XOM xom12 = c72233XZk.A02;
                if (xom12 != null) {
                    xom12.A00(0.2f);
                }
                XO2 xo210 = c72233XZk.A0A;
                if (xo210 != null) {
                    xo210.A00(1.0f, 1.0f, 1.0f, 1.0f);
                }
                XO2 xo211 = c72233XZk.A0B;
                if (xo211 != null) {
                    xo211.A00(0.0f, 0.0f, 0.0f, 0.5f);
                }
                XOM xom13 = c72233XZk.A06;
                if (xom13 != null) {
                    xom13.A00(0.0f);
                }
                XOM xom14 = c72233XZk.A07;
                if (xom14 != null) {
                    xom14.A00(0.0f);
                }
                c72233XZk.A0J = interfaceC197718oi;
                c72233XZk.A0K = yrl;
                double width5 = interfaceC197718oi.getWidth();
                double height5 = interfaceC197718oi.getHeight();
                int i = (int) (width5 * 0.125d);
                int i2 = (int) (height5 * 0.125d);
                c72233XZk.A0G = yPq.Cto((int) (width5 * 0.25d), (int) (height5 * 0.25d));
                c72233XZk.A0H = yPq.Cto(i, i2);
                c72233XZk.A0I = yPq.Cto(i, i2);
                return;
            }
            C72234XZl c72234XZl = (C72234XZl) this;
            if (yPq != null) {
                c72234XZl.A0D = yPq;
                C72239XZr c72239XZr3 = c72234XZl.A06;
                if (c72239XZr3 != null) {
                    float width6 = interfaceC197718oi.getWidth();
                    float height6 = interfaceC197718oi.getHeight();
                    FloatBuffer floatBuffer4 = c72239XZr3.A00;
                    floatBuffer4.put(0, width6);
                    floatBuffer4.put(1, height6);
                    ((AbstractC72243XZy) c72239XZr3).A00 = true;
                }
                XOM xom15 = c72234XZl.A02;
                if (xom15 != null) {
                    xom15.A00(1.66f);
                }
                XOM xom16 = c72234XZl.A04;
                if (xom16 != null) {
                    xom16.A00(0.0f);
                }
                XOM xom17 = c72234XZl.A03;
                if (xom17 != null) {
                    xom17.A00(0.25f);
                }
                XOM xom18 = c72234XZl.A05;
                if (xom18 != null) {
                    xom18.A00(1.0f);
                }
                XOB xob = c72234XZl.A01;
                if (xob != null) {
                    xob.A00(c72234XZl.A0G);
                }
                XOB xob2 = c72234XZl.A00;
                if (xob2 != null) {
                    xob2.A00(false);
                }
                c72234XZl.A0E = interfaceC197718oi;
                c72234XZl.A0F = yrl;
                c72234XZl.A0A = yPq.Cto(yrl.Bmj(), yrl.Bmd());
                c72234XZl.A0B = yPq.Cto(yrl.Bmj() / 4, yrl.Bmd() / 4);
                c72234XZl.A0C = yPq.Cto(yrl.Bmj() / 4, yrl.Bmd() / 4);
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
    }

    public static XO2 A00(Object obj, Map map) {
        return (XO2) ((AbstractC72243XZy) map.get(obj));
    }
}
