package X;

import android.os.Handler;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class U70 {
    public static U71 A0K;
    public float A00;
    public float A01;
    public int A03;
    public long A06;
    public long A09;
    public static final Object A0M = new Object();
    public static final ArrayList A0N = new ArrayList();
    public static final ArrayList A0Q = new ArrayList();
    public static final ArrayList A0O = new ArrayList();
    public static final ArrayList A0P = new ArrayList();
    public static final ArrayList A0R = new ArrayList();
    public static final Interpolator A0S = new AccelerateDecelerateInterpolator();
    public static final W5O A0L = new W5O(64);
    public long A08 = -1;
    public int A02 = 0;
    public boolean A0H = false;
    public int A04 = 0;
    public boolean A0F = false;
    public boolean A0G = false;
    public boolean A0E = false;
    public long A07 = 300;
    public int A05 = 0;
    public ArrayList A0C = null;
    public Interpolator A0A = A0S;
    public ArrayList A0B = null;
    public float[] A0I = new float[2];
    public float[] A0J = new float[2];
    public boolean A0D = true;

    /* JADX WARN: Type inference failed for: r0v8, types: [android.os.Handler, X.U71] */
    public final void A05() {
        long j;
        U71 u71;
        if (Looper.myLooper() != null) {
            this.A02 = 0;
            this.A04 = 0;
            this.A0G = true;
            this.A0H = false;
            A0Q.add(this);
            if (this.A0E && this.A04 != 0) {
                j = AnimationUtils.currentAnimationTimeMillis() - this.A09;
            } else {
                j = 0;
            }
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            if (this.A04 != 1) {
                this.A08 = j;
                int i = 0;
                if (this.A0E) {
                    i = 2;
                }
                this.A04 = i;
            }
            this.A09 = currentAnimationTimeMillis - j;
            this.A0E = true;
            A02(this, currentAnimationTimeMillis);
            this.A0F = true;
            ArrayList arrayList = this.A0B;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((XD0) arrayList.get(i2)).Cwh(this);
                }
            }
            synchronized (A0M) {
                U71 u712 = A0K;
                u71 = u712;
                if (u712 == null) {
                    ?? handler = new Handler();
                    A0K = handler;
                    u71 = handler;
                }
            }
            u71.sendEmptyMessage(0);
            return;
        }
        throw new AndroidRuntimeException("Animators may only be run on Looper threads");
    }

    public static U70 A00(float f, float f2) {
        U70 u70 = (U70) A0L.A00();
        if (u70 == null) {
            u70 = new U70();
        }
        u70.A03 = 2;
        float[] fArr = u70.A0I;
        fArr[0] = 0.0f;
        float[] fArr2 = u70.A0J;
        fArr2[0] = f;
        fArr[1] = 1.0f;
        fArr2[1] = f2;
        u70.A0E = false;
        return u70;
    }

    public static void A01(U70 u70) {
        A0N.remove(u70);
        A0Q.remove(u70);
        A0O.remove(u70);
        u70.A04 = 0;
        u70.A0G = false;
        if (u70.A0F) {
            u70.A0F = false;
            ArrayList arrayList = u70.A0B;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((XD0) u70.A0B.get(i)).CwZ(u70);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        if (r1 >= 1.0f) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A02(X.U70 r10, long r11) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U70.A02(X.U70, long):boolean");
    }

    public final void A03() {
        ArrayList arrayList;
        if (this.A04 != 0 || A0Q.contains(this) || A0O.contains(this)) {
            if (this.A0F && (arrayList = this.A0B) != null) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((XD0) this.A0B.get(i)).CwV(this);
                }
            }
            A01(this);
        }
    }

    public final void A04() {
        ArrayList arrayList = this.A0B;
        if (arrayList != null) {
            arrayList.clear();
        }
        ArrayList arrayList2 = this.A0C;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        this.A09 = 0L;
        this.A08 = -1L;
        this.A02 = 0;
        this.A0H = false;
        this.A06 = 0L;
        this.A04 = 0;
        this.A0F = false;
        this.A0G = false;
        this.A0E = false;
        this.A07 = 300L;
        this.A05 = 0;
        this.A0A = A0S;
        this.A00 = 0.0f;
        this.A0D = true;
        A0L.A02(this);
    }

    public final void A06(long j) {
        if (j >= 0) {
            this.A07 = j;
            return;
        }
        throw new IllegalArgumentException(AnonymousClass001.A0Q("Animators cannot have negative duration: ", j));
    }

    public final void A07(XD0 xd0) {
        ArrayList arrayList = this.A0B;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.A0B = arrayList;
        }
        arrayList.add(xd0);
    }

    public final void A08(X91 x91) {
        ArrayList arrayList = this.A0C;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.A0C = arrayList;
        }
        arrayList.add(x91);
    }
}
