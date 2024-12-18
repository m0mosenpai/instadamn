package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.5wf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C131485wf extends View {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public Shader A05;
    public boolean A06;
    public final Paint A07;
    public final Paint A08;
    public final Paint A09;
    public final RectF A0A;
    public final ArrayList A0B;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ca, code lost:
    
        if (r16.A04 >= r16.A01) goto L27;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDraw(android.graphics.Canvas r17) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C131485wf.onDraw(android.graphics.Canvas):void");
    }

    public final void setProgressShader(Shader shader) {
        C14360o3.A0B(shader, 0);
        this.A05 = shader;
    }

    public final void setSegments(C84B c84b) {
        int BsL;
        C14360o3.A0B(c84b, 0);
        ArrayList arrayList = this.A0B;
        arrayList.clear();
        this.A04 = 0;
        this.A03 = 0;
        Iterator it = c84b.A05().iterator();
        while (it.hasNext()) {
            AbstractC115485Ki abstractC115485Ki = (AbstractC115485Ki) it.next();
            if (abstractC115485Ki instanceof C115475Kh) {
                double abs = (r5.A08 - r5.A09) * Math.abs(r5.A00);
                C115525Km c115525Km = ((C115475Kh) abstractC115485Ki).A0G;
                BsL = (int) Math.ceil((abs * c115525Km.A06) / (c115525Km.A02 - c115525Km.A03));
            } else {
                BsL = abstractC115485Ki.BsL();
            }
            arrayList.add(Integer.valueOf(BsL));
            this.A04 = AbstractC001800i.A02(arrayList);
        }
    }

    public final int getProgressRingMaxDurationMs() {
        return this.A01;
    }

    public final int getRetakeSegmentIndex() {
        return this.A02;
    }

    public final ArrayList getSegmentArray() {
        return this.A0B;
    }

    public final int getTotalElapsedDurationMs() {
        return this.A04;
    }

    public C131485wf(Context context) {
        super(context);
        this.A07 = new Paint(1);
        this.A08 = new Paint(1);
        this.A09 = new Paint(1);
        this.A0A = new RectF();
        this.A05 = new Shader();
        this.A01 = 15000;
        this.A0B = new ArrayList();
        this.A02 = -1;
    }

    public final void setProgressRingMaxDurationMs(int i) {
        this.A01 = i;
    }

    public final void setRetakeSegmentIndex(int i) {
        this.A02 = i;
    }

    public final void setStrokeWidth(float f) {
        this.A00 = f;
    }

    public final void setTargetDuration(int i) {
        this.A03 = i;
    }

    public final void setTotalElapsedDurationMs(int i) {
        this.A04 = i;
    }
}
