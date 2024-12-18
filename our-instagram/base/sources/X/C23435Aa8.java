package X;

import android.graphics.Point;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.creation.capture.FocusIndicatorView;
import com.instagram.creation.capture.RotateLayout;

/* renamed from: X.Aa8, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23435Aa8 implements InterfaceC198408pp {
    public final int A00;
    public final Object A01;

    public C23435Aa8(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC198408pp
    public final void DHd(Point point, Integer num) {
        long j;
        if (this.A00 != 0) {
            ViewOnClickListenerC44269JhH viewOnClickListenerC44269JhH = (ViewOnClickListenerC44269JhH) this.A01;
            int intValue = num.intValue();
            if (intValue != 0) {
                if (intValue != 5) {
                    if (intValue != 1) {
                        if (intValue != 3) {
                            if (intValue == 4) {
                                viewOnClickListenerC44269JhH.A0b.A00();
                                return;
                            }
                            return;
                        }
                        viewOnClickListenerC44269JhH.A0b.A02();
                        return;
                    }
                } else {
                    C0f5 AEp = C18950wb.A01.AEp(AbstractC43591JPw.A00(646), 817904119);
                    AEp.ABW(DialogModule.KEY_MESSAGE, "Exception when focusing camera.");
                    AEp.report();
                }
                viewOnClickListenerC44269JhH.A0b.setBackground(null);
                return;
            }
            C174747qA c174747qA = viewOnClickListenerC44269JhH.A0Y.A0H;
            int min = Math.min(c174747qA.A00().getWidth(), c174747qA.A00().getHeight()) / 4;
            FocusIndicatorView focusIndicatorView = viewOnClickListenerC44269JhH.A0b;
            focusIndicatorView.getLayoutParams().width = min;
            focusIndicatorView.getLayoutParams().height = min;
            focusIndicatorView.requestLayout();
            point.getClass();
            float[] fArr = {point.x, point.y};
            if (AbstractC13620mo.A02(viewOnClickListenerC44269JhH.getContext())) {
                fArr[0] = AbstractC166987dD.A07(viewOnClickListenerC44269JhH) - fArr[0];
            }
            float f = fArr[0];
            RotateLayout rotateLayout = viewOnClickListenerC44269JhH.A0c;
            int height = (int) (fArr[1] - (rotateLayout.getHeight() / 2));
            AbstractC13880nE.A0e(rotateLayout, (int) (f - (rotateLayout.getWidth() / 2)));
            AbstractC13880nE.A0f(rotateLayout, height);
            focusIndicatorView.A01();
            return;
        }
        C208789Lm c208789Lm = (C208789Lm) this.A01;
        if (c208789Lm.A0d) {
            return;
        }
        if (c208789Lm.A0C) {
            j = 4000;
        } else {
            j = 2000;
        }
        synchronized (c208789Lm) {
            C208789Lm.A07(c208789Lm);
            c208789Lm.A0c = c208789Lm.A0R.A02("reset_focus", new CallableC209549Op(c208789Lm, 5), j);
        }
    }
}
