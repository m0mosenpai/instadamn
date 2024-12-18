package X;

import android.graphics.Color;
import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;

/* renamed from: X.Xam, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC72289Xam extends AbstractC72290Xan {
    public float A00;
    public C70123W5d A04;
    public FloatBuffer A05;
    public final int A06;
    public final int A07;
    public final float[] A08;
    public final /* synthetic */ AbstractC72282Xaf A09;
    public int A02 = 0;
    public int A03 = 0;
    public int A01 = 0;

    public AbstractC72289Xam(AbstractC72282Xaf abstractC72282Xaf, int i) {
        FloatBuffer floatBuffer;
        this.A09 = abstractC72282Xaf;
        this.A07 = i * 4;
        this.A08 = new float[Math.max(4, i)];
        C22978ABc c22978ABc = ((C72283Xag) abstractC72282Xaf).A06;
        c22978ABc.getClass();
        C71071WnT c71071WnT = (C71071WnT) c22978ABc.A00(C71071WnT.class);
        C70123W5d c70123W5d = (C70123W5d) c71071WnT.A01.poll();
        c70123W5d = c70123W5d == null ? new C70123W5d(c71071WnT) : c70123W5d;
        this.A04 = c70123W5d;
        ByteBuffer byteBuffer = c70123W5d.A04;
        if (byteBuffer != null) {
            floatBuffer = byteBuffer.asFloatBuffer();
        } else {
            floatBuffer = null;
        }
        this.A05 = floatBuffer;
        this.A06 = floatBuffer != null ? floatBuffer.remaining() / i : 0;
    }

    public static void A00(AbstractC72289Xam abstractC72289Xam, int i, int i2) {
        if (i2 != 0) {
            Y13 y13 = ((AbstractC72290Xan) abstractC72289Xam).A01;
            y13.getClass();
            y13.A00();
            AbstractC72282Xaf abstractC72282Xaf = abstractC72289Xam.A09;
            C72236XZn c72236XZn = ((C72283Xag) abstractC72282Xaf).A02;
            if (c72236XZn != null) {
                c72236XZn.A00 = FloatBuffer.wrap(abstractC72282Xaf.A07);
                ((AbstractC72243XZy) c72236XZn).A00 = true;
            }
            XOM xom = ((C72283Xag) abstractC72282Xaf).A04;
            if (xom != null) {
                xom.A00(((AbstractC73479YFc) abstractC72289Xam).A01 * abstractC72282Xaf.A00);
            }
            XOM xom2 = ((C72283Xag) abstractC72282Xaf).A03;
            if (xom2 != null) {
                xom2.A00(abstractC72282Xaf.A00);
            }
            XO2 xo2 = ((C72283Xag) abstractC72282Xaf).A05;
            if (xo2 != null) {
                int i3 = ((AbstractC73479YFc) abstractC72289Xam).A02;
                xo2.A00(Color.red(i3) / 255.0f, Color.green(i3) / 255.0f, Color.blue(i3) / 255.0f, ((AbstractC73479YFc) abstractC72289Xam).A00);
            }
            XO3 xo3 = ((AbstractC73478YFb) abstractC72282Xaf).A04;
            xo3.getClass();
            xo3.A00();
            GLES20.glBindBuffer(34962, abstractC72289Xam.A04.A03);
            C72867Xpa c72867Xpa = abstractC72282Xaf.A02;
            c72867Xpa.getClass();
            c72867Xpa.A00();
            C70123W5d c70123W5d = abstractC72289Xam.A04;
            int i4 = abstractC72289Xam.A07;
            c70123W5d.A01(i * i4, i4 * i2);
            GLES20.glDrawArrays(0, i, i2);
            GLES20.glBindBuffer(34962, 0);
            abstractC72282Xaf.A02.A01();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [X.Xam, X.Xal, X.YFc] */
    /* JADX WARN: Type inference failed for: r8v2, types: [X.Xam] */
    /* JADX WARN: Type inference failed for: r8v4, types: [X.Xam, X.Xak, X.YFc] */
    public final void A02() {
        ?? r8;
        int i;
        if (this instanceof C72287Xak) {
            r8 = (C72287Xak) this;
            YQQ yqq = ((AbstractC73478YFb) r8.A00).A05;
            yqq.getClass();
            W5C BuO = yqq.BuO();
            BuO.A03 = r8.A00;
            r8.A01 = Math.min(((int) Math.floor(BuO.A02 / r1)) + 1, r8.A06);
            int i2 = r8.A03;
            while (true) {
                i = r8.A01;
                if (i2 >= i) {
                    break;
                }
                float[] fArr = r8.A08;
                BuO.A01(fArr, i2);
                fArr[4] = i2;
                fArr[5] = r8.A01;
                int i3 = r8.A02;
                fArr[6] = Float.intBitsToFloat(Color.argb(Color.alpha(i3), Color.blue(i3), Color.green(i3), Color.red(i3)));
                FloatBuffer floatBuffer = r8.A05;
                if (floatBuffer != null) {
                    floatBuffer.put(fArr, 0, 7);
                }
                i2++;
            }
        } else {
            r8 = (C72288Xal) this;
            YQQ yqq2 = ((AbstractC73478YFb) r8.A00).A05;
            yqq2.getClass();
            W5C BuO2 = yqq2.BuO();
            BuO2.A03 = r8.A00;
            r8.A01 = Math.min(((int) Math.floor(BuO2.A02 / r1)) + 1, r8.A06);
            int i4 = r8.A03;
            while (true) {
                i = r8.A01;
                if (i4 >= i) {
                    break;
                }
                float[] fArr2 = r8.A08;
                BuO2.A01(fArr2, i4);
                fArr2[2] = i4;
                fArr2[3] = r8.A01;
                int i5 = r8.A02;
                fArr2[4] = Float.intBitsToFloat(Color.argb(Color.alpha(i5), Color.blue(i5), Color.green(i5), Color.red(i5)));
                FloatBuffer floatBuffer2 = r8.A05;
                if (floatBuffer2 != null) {
                    floatBuffer2.put(fArr2, 0, 5);
                }
                i4++;
            }
        }
        r8.A03 = i;
    }

    @Override // X.YP4
    public final void AQO() {
        A00(this, 0, this.A01);
    }

    @Override // X.AbstractC72290Xan, X.AbstractC73479YFc
    public final void A01(YQ3 yq3) {
        float f;
        super.A01(yq3);
        AbstractC73478YFb abstractC73478YFb = (AbstractC73478YFb) yq3;
        boolean z = abstractC73478YFb instanceof AbstractC72282Xaf;
        AbstractC73478YFb abstractC73478YFb2 = abstractC73478YFb;
        if (z) {
            AbstractC72282Xaf abstractC72282Xaf = (AbstractC72282Xaf) abstractC73478YFb;
            C72771Xmo c72771Xmo = abstractC72282Xaf.A01;
            abstractC73478YFb2 = abstractC72282Xaf;
            if (c72771Xmo != null) {
                f = (((AbstractC73478YFb) abstractC72282Xaf).A00 * c72771Xmo.A02) + c72771Xmo.A01;
                float f2 = c72771Xmo.A00;
                if (f < f2) {
                    f = f2;
                } else if (f > Float.MAX_VALUE) {
                    f = Float.MAX_VALUE;
                }
                this.A00 = f * this.A09.A00;
            }
        }
        f = abstractC73478YFb2.A01;
        this.A00 = f * this.A09.A00;
    }
}
