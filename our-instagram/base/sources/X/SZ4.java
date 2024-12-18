package X;

import android.view.MotionEvent;
import android.view.ViewGroup;
import com.facebook.react.uimanager.UIManagerHelper;

/* loaded from: classes10.dex */
public final class SZ4 {
    public final ViewGroup A03;
    public int A00 = -1;
    public final float[] A04 = new float[2];
    public boolean A01 = false;
    public long A02 = Long.MIN_VALUE;
    public final SBQ A05 = new SBQ();

    public static void A00(MotionEvent motionEvent, SZ4 sz4, X9J x9j) {
        if (sz4.A00 == -1) {
            C0I2.A04("ReactNative", "Can't cancel already finished gesture. Is a child View trying to start a gesture from an UP/CANCEL event?");
            return;
        }
        AbstractC05810Sj.A03(!sz4.A01, "Expected to not have already sent a cancel for this gesture");
        int A01 = UIManagerHelper.A01(sz4.A03);
        int i = sz4.A00;
        Integer num = C05F.A0N;
        long j = sz4.A02;
        float[] fArr = sz4.A04;
        x9j.APn(C62798SRs.A00(motionEvent, sz4.A05, num, fArr[0], fArr[1], A01, i, j));
    }

    public final void A01(MotionEvent motionEvent, Q21 q21, X9J x9j) {
        int A01;
        int i;
        Integer num;
        ViewGroup viewGroup;
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            if (this.A00 != -1) {
                C0I2.A03("ReactNative", "Got DOWN touch before receiving UP or CANCEL from last gesture");
            }
            this.A01 = false;
            this.A02 = motionEvent.getEventTime();
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            viewGroup = this.A03;
            this.A00 = C63358SiF.A00(viewGroup, this.A04, x, y);
            UIManagerHelper.A01(viewGroup);
            if (C62856SUd.A00.enableEventEmitterRetentionDuringGesturesOnAndroid() && q21 != null) {
                UIManagerHelper.A03(q21, 2, true);
            }
        } else {
            if (this.A01) {
                return;
            }
            int i2 = this.A00;
            if (i2 == -1) {
                C0I2.A03("ReactNative", "Unexpected state: received touch event but didn't get starting ACTION_DOWN for this gesture before");
                return;
            }
            if (action == 1) {
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                ViewGroup viewGroup2 = this.A03;
                float[] fArr = this.A04;
                C63358SiF.A00(viewGroup2, fArr, x2, y2);
                int A012 = UIManagerHelper.A01(viewGroup2);
                int i3 = this.A00;
                Integer num2 = C05F.A01;
                long j = this.A02;
                x9j.APn(C62798SRs.A00(motionEvent, this.A05, num2, fArr[0], fArr[1], A012, i3, j));
            } else {
                if (action == 2) {
                    float x3 = motionEvent.getX();
                    float y3 = motionEvent.getY();
                    ViewGroup viewGroup3 = this.A03;
                    C63358SiF.A00(viewGroup3, this.A04, x3, y3);
                    A01 = UIManagerHelper.A01(viewGroup3);
                    i = this.A00;
                    num = C05F.A0C;
                } else if (action == 5) {
                    viewGroup = this.A03;
                } else if (action == 6) {
                    A01 = UIManagerHelper.A01(this.A03);
                    i = this.A00;
                    num = C05F.A01;
                } else if (action == 3) {
                    if (this.A05.A00.get((int) motionEvent.getDownTime(), -1) == -1) {
                        C0I2.A03("ReactNative", "Received an ACTION_CANCEL touch event for which we have no corresponding ACTION_DOWN");
                    } else {
                        A00(motionEvent, this, x9j);
                    }
                    UIManagerHelper.A01(this.A03);
                } else {
                    C0I2.A04("ReactNative", AnonymousClass001.A02(action, i2, "Warning : touch event was ignored. Action=", " Target="));
                    return;
                }
                long j2 = this.A02;
                float[] fArr2 = this.A04;
                x9j.APn(C62798SRs.A00(motionEvent, this.A05, num, fArr2[0], fArr2[1], A01, i, j2));
            }
            if (C62856SUd.A00.enableEventEmitterRetentionDuringGesturesOnAndroid() && q21 != null) {
                UIManagerHelper.A03(q21, 2, true);
            }
            this.A00 = -1;
            this.A02 = Long.MIN_VALUE;
            return;
        }
        A01 = UIManagerHelper.A01(viewGroup);
        i = this.A00;
        num = C05F.A00;
        long j22 = this.A02;
        float[] fArr22 = this.A04;
        x9j.APn(C62798SRs.A00(motionEvent, this.A05, num, fArr22[0], fArr22[1], A01, i, j22));
    }

    public SZ4(ViewGroup viewGroup) {
        this.A03 = viewGroup;
    }
}
