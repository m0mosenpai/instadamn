package X;

import android.content.Intent;
import android.os.CountDownTimer;
import android.os.SystemClock;
import androidx.fragment.app.Fragment;
import com.facebook.smartcapture.logging.SelfieCaptureLogger;
import com.facebook.smartcapture.logging.SelfieCaptureLoggingEvents;
import com.facebook.smartcapture.logging.SelfieCaptureStep;
import com.facebook.smartcapture.view.BaseSelfieCaptureActivity;
import com.facebook.smartcapture.view.SelfieTimeoutActivity;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;

/* loaded from: classes10.dex */
public final class Q3R extends CountDownTimer {
    public final int A00 = 1;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q3R(InterfaceC74953Yl interfaceC74953Yl, long j) {
        super(j, 1000L);
        this.A01 = interfaceC74953Yl;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        C47H c47h;
        switch (this.A00) {
            case 0:
                C63962Swn c63962Swn = ((C62576SHb) this.A01).A02;
                c63962Swn.A0L.logEvent(SelfieCaptureLoggingEvents.SELFIE_TIMER_ELAPSED);
                C23432Aa5 c23432Aa5 = (C23432Aa5) c63962Swn.A0C.get();
                if (c23432Aa5 != null) {
                    c23432Aa5.A02();
                }
                SN3 sn3 = (SN3) c63962Swn.A0D.get();
                if (sn3 != null) {
                    sn3.A00();
                }
                Object obj = (InterfaceC65372Tj4) c63962Swn.A0P.get();
                if (obj == null) {
                    return;
                }
                BaseSelfieCaptureActivity baseSelfieCaptureActivity = (BaseSelfieCaptureActivity) obj;
                Intent A08 = MSW.A08(baseSelfieCaptureActivity, SelfieTimeoutActivity.class);
                A08.putExtra("selfie_capture_config", baseSelfieCaptureActivity.A02());
                A08.putExtra(SelfieCaptureLogger.ARG_PREVIOUS_STEP, SelfieCaptureStep.CAPTURE);
                BaseSelfieCaptureActivity.A00(baseSelfieCaptureActivity).nextStep = SelfieCaptureStep.TIMEOUT;
                baseSelfieCaptureActivity.startActivityForResult(A08, 1);
                return;
            case 1:
                return;
            case 2:
                C45814KPt c45814KPt = (C45814KPt) this.A01;
                IgdsBottomButtonLayout igdsBottomButtonLayout = c45814KPt.A01;
                if (igdsBottomButtonLayout != null) {
                    igdsBottomButtonLayout.setPrimaryButtonEnabled(true);
                }
                IgdsBottomButtonLayout igdsBottomButtonLayout2 = c45814KPt.A01;
                if (igdsBottomButtonLayout2 == null) {
                    return;
                }
                igdsBottomButtonLayout2.setPrimaryActionText(c45814KPt.getString(2131961830));
                return;
            case 3:
                C3DN A00 = C3DN.A00.A00(((Fragment) this.A01).getActivity());
                if (A00 == null) {
                    return;
                }
                A00.A0B();
                return;
            default:
                C41699IdS c41699IdS = (C41699IdS) this.A01;
                c41699IdS.A07 = true;
                if (c41699IdS.A06 && (c47h = c41699IdS.A00) != null && !c47h.CDj().A26() && c41699IdS.A09) {
                    C41699IdS.A01(c47h, c41699IdS);
                    return;
                }
                return;
        }
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        InterfaceC65611To2 interfaceC65611To2;
        AbstractC46362Kfk abstractC46362Kfk;
        switch (this.A00) {
            case 0:
                long elapsedRealtime = SystemClock.elapsedRealtime();
                C62576SHb c62576SHb = (C62576SHb) this.A01;
                long A0L = AbstractC166987dD.A0L(elapsedRealtime - c62576SHb.A00);
                long j2 = 25 - A0L;
                if (j2 < 0) {
                    j2 = 0;
                }
                int i = (int) j2;
                if (A0L <= 5) {
                    interfaceC65611To2 = c62576SHb.A03;
                    abstractC46362Kfk = C45346K5b.A00;
                } else {
                    long j3 = i;
                    interfaceC65611To2 = c62576SHb.A03;
                    if (j3 <= 5) {
                        abstractC46362Kfk = new K5Z(i);
                    } else {
                        abstractC46362Kfk = C45345K5a.A00;
                    }
                }
                interfaceC65611To2.D7p(abstractC46362Kfk);
                return;
            case 1:
                ((InterfaceC74953Yl) this.A01).Egh(C23831Eq.A02(j));
                return;
            case 2:
                long A0L2 = AbstractC166987dD.A0L((int) j);
                C45814KPt c45814KPt = (C45814KPt) this.A01;
                IgdsBottomButtonLayout igdsBottomButtonLayout = c45814KPt.A01;
                if (igdsBottomButtonLayout == null) {
                    return;
                }
                igdsBottomButtonLayout.setPrimaryActionText(c45814KPt.getString(2131961831, String.valueOf(A0L2)));
                return;
            default:
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q3R(C45814KPt c45814KPt) {
        super(31000L, 1000L);
        this.A01 = c45814KPt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q3R(C62576SHb c62576SHb) {
        super(25000L, 250L);
        this.A01 = c62576SHb;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q3R(C41699IdS c41699IdS) {
        super(7000L, 7000L);
        this.A01 = c41699IdS;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q3R(C38947HCw c38947HCw) {
        super(500L, 500L);
        this.A01 = c38947HCw;
    }
}
