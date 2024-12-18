package X;

import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.util.Vector;

/* renamed from: X.Xpa, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C72867Xpa {
    public final int A00;
    public final Vector A01;
    public final XO3 A02;

    public C72867Xpa(XO3 xo3, int i) {
        C14360o3.A0B(xo3, 1);
        this.A02 = xo3;
        this.A00 = i;
        this.A01 = new Vector();
    }

    public final void A02(int i, int i2, String str, boolean z, int i3) {
        Vector vector;
        AbstractC72794XnF c72300Xax;
        XO9 xo9 = (XO9) this.A02.A01.get(str);
        if (xo9 != null) {
            if (this instanceof C72301Xay) {
                C72301Xay c72301Xay = (C72301Xay) this;
                ByteBuffer asReadOnlyBuffer = c72301Xay.A00.asReadOnlyBuffer();
                asReadOnlyBuffer.position(i3);
                vector = c72301Xay.A01;
                c72300Xax = new C72299Xaw(xo9, c72301Xay, asReadOnlyBuffer, i, i2, z);
            } else {
                vector = this.A01;
                c72300Xax = new C72300Xax(xo9, this, i, i2, i3, z);
            }
            vector.add(c72300Xax);
        }
    }

    public final void A00() {
        int i;
        Vector vector = this.A01;
        int size = vector.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC72794XnF abstractC72794XnF = (AbstractC72794XnF) vector.get(i2);
            if (abstractC72794XnF instanceof C72300Xax) {
                C72300Xax c72300Xax = (C72300Xax) abstractC72794XnF;
                i = ((AbstractC72794XnF) c72300Xax).A01;
                GLES20.glVertexAttribPointer(i, ((AbstractC72794XnF) c72300Xax).A00, c72300Xax.A02, c72300Xax.A03, c72300Xax.A01.A00, c72300Xax.A00);
            } else {
                C72299Xaw c72299Xaw = (C72299Xaw) abstractC72794XnF;
                i = ((AbstractC72794XnF) c72299Xaw).A01;
                GLES20.glVertexAttribPointer(i, ((AbstractC72794XnF) c72299Xaw).A00, c72299Xaw.A02, c72299Xaw.A03, ((C72867Xpa) c72299Xaw.A01).A00, c72299Xaw.A00);
            }
            GLES20.glEnableVertexAttribArray(i);
        }
    }

    public final void A01() {
        Vector vector = this.A01;
        int size = vector.size();
        for (int i = 0; i < size; i++) {
            GLES20.glDisableVertexAttribArray(((AbstractC72794XnF) vector.get(i)).A01);
        }
    }
}
