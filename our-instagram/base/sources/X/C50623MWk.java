package X;

import android.app.Dialog;
import com.facebook.litho.LithoView;
import com.instagram.rtc.activity.RtcCallActivity;

/* renamed from: X.MWk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50623MWk implements InterfaceC65626Tpm, C07W {
    public final int A00;
    public final Object A01;

    public C50623MWk(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onDestroy(C07X c07x) {
        switch (this.A00) {
            case 1:
                C14360o3.A0B(c07x, 0);
                ((LithoView) this.A01).A0k();
                return;
            case 2:
                P18 p18 = (P18) this.A01;
                AbstractC25651Mw.A00(p18.A05).A02(p18.A04, C55974Ot7.class);
                return;
            case 3:
            case 4:
            case 5:
            default:
                return;
            case 6:
                ((C48103LRd) this.A01).A00.A0B(C07R.ON_DESTROY);
                return;
        }
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onPause(C07X c07x) {
        switch (this.A00) {
            case 3:
                P13 p13 = (P13) this.A01;
                AbstractC25651Mw.A00(p13.A03).A02(p13.A02, C8PB.class);
                return;
            case 4:
                C14360o3.A0B(c07x, 0);
                ((Dialog) this.A01).dismiss();
                return;
            case 5:
                OMR omr = ((RtcCallActivity) this.A01).A02;
                if (omr == null) {
                    C14360o3.A0F("presenterBridge");
                    throw C00O.createAndThrow();
                }
                if (omr.A01 != null) {
                    omr.A04.A03(new PBQ(false));
                    return;
                } else {
                    omr.A03.A7P(new PBQ(false));
                    return;
                }
            default:
                return;
        }
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onResume(C07X c07x) {
        switch (this.A00) {
            case 3:
                if (C55904Ort.A06) {
                    P13 p13 = (P13) this.A01;
                    if (AbstractC38041GoU.A00(p13.A03)) {
                        C55904Ort.A06 = false;
                        C55904Ort c55904Ort = p13.A07;
                        NKA nka = p13.A08;
                        c55904Ort.A00(null, "tag_people_row", nka.A00, nka.A04, nka.A01);
                    }
                }
                P13 p132 = (P13) this.A01;
                AbstractC25651Mw.A00(p132.A03).A01(p132.A02, C8PB.class);
                return;
            case 4:
            default:
                return;
            case 5:
                OMR omr = ((RtcCallActivity) this.A01).A02;
                if (omr == null) {
                    C14360o3.A0F("presenterBridge");
                    throw C00O.createAndThrow();
                }
                if (omr.A01 != null) {
                    omr.A04.A03(new PBQ(true));
                    return;
                } else {
                    omr.A03.A7P(new PBQ(true));
                    return;
                }
        }
    }

    @Override // X.InterfaceC65626Tpm
    public final void onStart(C07X c07x) {
        switch (this.A00) {
            case 0:
                AbstractC195978lm.A02.A01("sup:MediaStreamAppLifecycleListener", "App moved to foreground");
                ((OKR) this.A01).A01.onAppForegrounded();
                return;
            case 1:
            case 2:
            default:
                return;
            case 3:
                P13 p13 = (P13) this.A01;
                OL2 ol2 = p13.A00;
                if (ol2 != null) {
                    if (!ol2.A01.A04()) {
                        return;
                    }
                    OL2 ol22 = p13.A00;
                    if (ol22 != null) {
                        ol22.A01.A0D.A02();
                        return;
                    }
                }
                C14360o3.A0F("tagProductsSection");
                throw C00O.createAndThrow();
        }
    }

    @Override // X.InterfaceC65626Tpm
    public final void onStop(C07X c07x) {
        if (this.A00 == 0) {
            AbstractC195978lm.A02.A01("sup:MediaStreamAppLifecycleListener", "App moved to background");
            ((OKR) this.A01).A01.onAppBackgrounded();
        }
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onCreate(C07X c07x) {
    }
}
