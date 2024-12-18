package X;

import android.view.MotionEvent;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;

/* renamed from: X.33K, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C33K {
    public WeakReference A00;
    public WeakReference A01;
    public boolean A02;
    public final UserSession A03;
    public final boolean A04;

    public final boolean A00(MotionEvent motionEvent) {
        C30E c30e;
        if (!this.A02 && !AbstractC61242qm.A00(this.A03).A0H) {
            WeakReference weakReference = this.A00;
            C3FQ c3fq = null;
            if (weakReference == null || (c30e = (C30E) weakReference.get()) == null || c30e.A06 == C05F.A00) {
                WeakReference weakReference2 = this.A01;
                if (weakReference2 != null) {
                    c3fq = (C3FQ) weakReference2.get();
                }
                if (motionEvent != null && c3fq != null && this.A04) {
                    float rawX = motionEvent.getRawX();
                    float rawY = motionEvent.getRawY();
                    int[] iArr = new int[2];
                    int B6q = c3fq.B6q();
                    int BM3 = c3fq.BM3();
                    if (B6q <= BM3) {
                        while (true) {
                            View AnW = c3fq.AnW(B6q);
                            if (AnW != null && (AnW.getTag() instanceof C3OS)) {
                                AnW.getLocationOnScreen(iArr);
                                int i = iArr[0];
                                int i2 = iArr[1];
                                int width = AnW.getWidth() + i;
                                int height = AnW.getHeight() + i2;
                                if (rawX >= i && rawX <= width && rawY >= i2 && rawY <= height) {
                                    break;
                                }
                            }
                            if (B6q == BM3) {
                                break;
                            }
                            B6q++;
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public C33K(UserSession userSession) {
        this.A03 = userSession;
        this.A04 = C33L.A01(userSession);
    }
}
