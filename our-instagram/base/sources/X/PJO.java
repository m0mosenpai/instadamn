package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.SystemClock;
import android.view.Window;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes9.dex */
public final class PJO implements C6C3 {
    public InterfaceC58142Pq7 A00;
    public C5TA A01;
    public boolean A02;
    public final Activity A03;
    public final C145046gP A04;
    public final Context A05;
    public final UserSession A06;
    public final OOO A07;

    @Override // X.C6C3
    public final void Dza(C4S7 c4s7) {
        InterfaceC58142Pq7 interfaceC58142Pq7;
        C14360o3.A0B(c4s7, 0);
        InterfaceC58104PpT interfaceC58104PpT = (InterfaceC58104PpT) c4s7.A03;
        if (interfaceC58104PpT != null && (interfaceC58142Pq7 = this.A00) != null) {
            interfaceC58142Pq7.DzX(interfaceC58104PpT);
        }
    }

    @Override // X.C6C3
    public final void Dzb(C4S7 c4s7) {
    }

    @Override // X.C6C3
    public final void E0M(int i, int i2) {
    }

    @Override // X.C6C3
    public final void onCompletion() {
    }

    @Override // X.C6C3
    public final void onCues(List list) {
        C14360o3.A0B(list, 0);
        InterfaceC58142Pq7 interfaceC58142Pq7 = this.A00;
        if (interfaceC58142Pq7 != null) {
            interfaceC58142Pq7.onCues(list);
        }
    }

    @Override // X.C6C3
    public final void onLoop(int i) {
    }

    @Override // X.C6C3
    public final void onPrepare(C4S7 c4s7) {
    }

    @Override // X.C6C3
    public final void onProgressStateChanged(boolean z) {
    }

    @Override // X.C6C3
    public final void onStopVideo(String str, boolean z) {
    }

    @Override // X.C6C3
    public final void onVideoPlayerError(C4S7 c4s7, String str) {
    }

    @Override // X.C6C3
    public final /* synthetic */ void onVideoStartedPlaying(C4S7 c4s7) {
    }

    @Override // X.C6C3
    public final void onVideoViewPrepared(C4S7 c4s7) {
        C14360o3.A0B(c4s7, 0);
        InterfaceC58142Pq7 interfaceC58142Pq7 = this.A00;
        if (interfaceC58142Pq7 != null) {
            interfaceC58142Pq7.E0J(c4s7.A00);
        }
    }

    public static final void A00(PJO pjo) {
        Window window;
        if (pjo.A02) {
            Context context = pjo.A03;
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                if (context instanceof Activity) {
                    Activity activity = (Activity) context;
                    if (activity != null && (window = activity.getWindow()) != null) {
                        window.clearFlags(8192);
                    }
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            pjo.A02 = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0123, code lost:
    
        if (r0.A0D() != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0125, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0128, code lost:
    
        if (r0 != null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x011d, code lost:
    
        if (r0 != null) goto L73;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(X.InterfaceC58104PpT r26, X.InterfaceC74623Ww r27, X.C30P r28, java.lang.Boolean r29, java.lang.Integer r30, java.lang.String r31, int r32, boolean r33, boolean r34, boolean r35) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PJO.A01(X.PpT, X.3Ww, X.30P, java.lang.Boolean, java.lang.Integer, java.lang.String, int, boolean, boolean, boolean):void");
    }

    @Override // X.C6C3
    public final void Dz8(C4S7 c4s7) {
        boolean z;
        C145046gP c145046gP = this.A04;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = c145046gP.A01;
        if (j != -1 && SystemClock.elapsedRealtime() - j >= c145046gP.A00) {
            c145046gP.A02 += elapsedRealtime - j;
            z = true;
        } else {
            z = false;
        }
        c145046gP.A01 = elapsedRealtime;
        if (z && c145046gP.A03 >= 2000) {
            AbstractC50522MSa.A1W(c145046gP);
        }
    }

    @Override // X.C6C3
    public final void onProgressUpdate(int i, int i2, boolean z) {
        InterfaceC58142Pq7 interfaceC58142Pq7 = this.A00;
        if (interfaceC58142Pq7 != null) {
            interfaceC58142Pq7.Dbw(i, i2);
        }
    }

    public PJO(Activity activity, Context context, UserSession userSession, OOO ooo) {
        this.A03 = activity;
        this.A05 = context;
        this.A06 = userSession;
        this.A07 = ooo;
        C145046gP c145046gP = new C145046gP();
        this.A04 = c145046gP;
        c145046gP.A00 = 120L;
    }

    @Override // X.C6C3
    public final void onVideoDownloading(C4S7 c4s7) {
    }
}
