package X;

import android.view.Choreographer;
import java.util.ArrayDeque;

/* renamed from: X.Seu, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63192Seu {
    public static C63192Seu A05;
    public int A00;
    public SBN A01;
    public boolean A02;
    public final ArrayDeque[] A03;
    public final Choreographer.FrameCallback A04;

    public final void A02(Choreographer.FrameCallback frameCallback, EnumC61159RgK enumC61159RgK) {
        C14360o3.A0B(frameCallback, 1);
        ArrayDeque[] arrayDequeArr = this.A03;
        synchronized (arrayDequeArr) {
            arrayDequeArr[enumC61159RgK.A00].addLast(frameCallback);
            boolean z = true;
            int i = this.A00 + 1;
            this.A00 = i;
            if (i <= 0) {
                z = false;
            }
            AbstractC05810Sj.A02(z);
            A01(this);
        }
    }

    public static final void A00(C63192Seu c63192Seu) {
        AbstractC05810Sj.A02(MSY.A1R(c63192Seu.A00));
        if (c63192Seu.A00 == 0 && c63192Seu.A02) {
            SBN sbn = c63192Seu.A01;
            if (sbn != null) {
                Choreographer.FrameCallback frameCallback = c63192Seu.A04;
                C14360o3.A0B(frameCallback, 0);
                sbn.A00.removeFrameCallback(frameCallback);
            }
            c63192Seu.A02 = false;
        }
    }

    public static final void A01(C63192Seu c63192Seu) {
        if (!c63192Seu.A02) {
            SBN sbn = c63192Seu.A01;
            if (sbn == null) {
                C63255SgD.A01(new RunnableC64573TKk(c63192Seu));
                return;
            }
            Choreographer.FrameCallback frameCallback = c63192Seu.A04;
            C14360o3.A0B(frameCallback, 0);
            sbn.A00.postFrameCallback(frameCallback);
            c63192Seu.A02 = true;
        }
    }

    public final void A03(Choreographer.FrameCallback frameCallback, EnumC61159RgK enumC61159RgK) {
        ArrayDeque[] arrayDequeArr = this.A03;
        synchronized (arrayDequeArr) {
            if (arrayDequeArr[enumC61159RgK.A00].removeFirstOccurrence(frameCallback)) {
                this.A00--;
                A00(this);
            } else {
                C0I2.A03("ReactNative", "Tried to remove non-existent frame callback");
            }
        }
    }

    public C63192Seu(STY sty) {
        int size = EnumC61159RgK.A01.size();
        ArrayDeque[] arrayDequeArr = new ArrayDeque[size];
        for (int i = 0; i < size; i++) {
            arrayDequeArr[i] = new ArrayDeque();
        }
        this.A03 = arrayDequeArr;
        this.A04 = new WKp(this, 1);
        C63255SgD.A01(new RunnableC64632TNo(sty, this));
    }
}
