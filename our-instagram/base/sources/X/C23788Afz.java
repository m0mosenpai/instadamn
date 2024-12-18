package X;

import android.content.Intent;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.creation.capture.quickcapture.analytics.common.ShareMediaLoggingInfo;
import java.util.ArrayList;

/* renamed from: X.Afz, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23788Afz implements InterfaceC58031PoH {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C8YR A01;
    public final /* synthetic */ ArrayList A02;

    @Override // X.InterfaceC58031PoH
    public final void onBottomSheetPositionChanged(int i, int i2) {
        float f = i;
        float f2 = this.A00;
        float min = Math.min(1.0f, Math.max(f / f2, 0.0f));
        if (f == 0.0f) {
            this.A01.A0G.A0K();
        }
        C8YR c8yr = this.A01;
        if (!c8yr.A0I.CV5()) {
            min = Math.min(1.0f, Math.max((f - ((1.0f - min) * c8yr.A00)) / f2, 0.0f));
        }
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = c8yr.A07;
        touchInterceptorFrameLayout.setScaleX(min);
        touchInterceptorFrameLayout.setScaleY(min);
    }

    public C23788Afz(C8YR c8yr, ArrayList arrayList, int i) {
        this.A01 = c8yr;
        this.A02 = arrayList;
        this.A00 = i;
    }

    @Override // X.InterfaceC58031PoH
    public final void Dlo(Intent intent, boolean z) {
        C8DK c8dk;
        C8YR c8yr = this.A01;
        boolean z2 = c8yr.A08.A08.A00 instanceof C81T;
        if (z && !z2) {
            C8YR.A02(intent, (ShareMediaLoggingInfo) AbstractC166997dE.A0k(this.A02), c8yr);
        }
        if (c8yr.A0L.A18 != null && (c8dk = c8yr.A0E.A1l) != null) {
            c8dk.Ede(true);
        }
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = c8yr.A07;
        touchInterceptorFrameLayout.setScaleX(1.0f);
        touchInterceptorFrameLayout.setScaleY(1.0f);
        ((C1809981b) c8yr.A0Y).A01.A04(new C8VM(intent, z));
        C8X5.A00(c8yr.A0P);
        c8yr.A0E.D2U(true);
        Integer num = c8yr.A0K.A02.A01.A0B;
        C14360o3.A07(num);
        if (num == C05F.A0C) {
            c8yr.A0B.A0c.A0C(true, false);
        }
    }
}
