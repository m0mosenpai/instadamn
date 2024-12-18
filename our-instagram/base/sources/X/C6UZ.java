package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.instagram.common.session.UserSession;

/* renamed from: X.6UZ, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6UZ {
    public static final void A00(UserSession userSession, final C41181vS c41181vS, final InterfaceC145516hA interfaceC145516hA, final C6TT c6tt) {
        C14360o3.A0B(c6tt, 1);
        InterfaceC56392iX interfaceC56392iX = c6tt.A07;
        Context context = interfaceC56392iX.getView().getContext();
        A01(c6tt);
        float A01 = (float) C18U.A01(C06090Tz.A05, userSession, 36599503683587673L);
        C14360o3.A0A(context);
        String A06 = AbstractC84863qa.A06(context, userSession, c41181vS);
        if (c6tt.A04 != null) {
            if (A06 != null) {
                c6tt.A01().setText(A06);
            }
            if (A01 > 0.0f) {
                c6tt.A01().setTextSize(A01);
            }
        }
        if (c6tt.A03 != null) {
            c6tt.A00().setOnTouchListener(null);
            c6tt.A00().setClickable(true);
            c6tt.A00().setOnTouchListener(new View.OnTouchListener() { // from class: X.6QF
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    float[] fArr = new float[2];
                    C6TT c6tt2 = c6tt;
                    ImageView A00 = c6tt2.A00();
                    C14360o3.A0A(motionEvent);
                    if (C6UZ.A02(motionEvent, A00, fArr, (int[]) c6tt2.A08.getValue())) {
                        interfaceC145516hA.EIJ(c41181vS, fArr);
                        return false;
                    }
                    return false;
                }
            });
        }
        if (c6tt.A04 != null) {
            c6tt.A01().setOnTouchListener(null);
            c6tt.A01().setClickable(true);
            c6tt.A01().setOnTouchListener(new ATR(c41181vS, interfaceC145516hA, c6tt));
        }
        if (interfaceC56392iX.CWW()) {
            interfaceC56392iX.setVisibility(0);
        }
    }

    public static final void A01(C6TT c6tt) {
        C14360o3.A0B(c6tt, 0);
        InterfaceC56392iX interfaceC56392iX = c6tt.A07;
        if (interfaceC56392iX.CWW()) {
            interfaceC56392iX.setVisibility(8);
        }
        c6tt.A02();
        if (c6tt.A04 != null) {
            c6tt.A01().setText("");
        }
    }

    public static final boolean A02(MotionEvent motionEvent, View view, float[] fArr, int[] iArr) {
        int action = motionEvent.getAction();
        if (action != 0 && action == 1) {
            float rawX = motionEvent.getRawX() - iArr[0];
            float rawY = motionEvent.getRawY() - iArr[1];
            if (0.0f <= rawX && rawX <= view.getWidth() && 0.0f <= rawY && rawY <= view.getHeight()) {
                fArr[0] = motionEvent.getRawX();
                fArr[1] = motionEvent.getRawY();
                return true;
            }
            return false;
        }
        return false;
    }
}
