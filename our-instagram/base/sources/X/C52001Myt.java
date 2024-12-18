package X;

import com.facebook.rsys.callmanager.callclient.gen.CallClient;
import com.facebook.rsys.callmanager.callclient.gen.CallManagerCallClientCallbacks;
import com.instagram.rtc.rsys.tslog.IgRadioTsLoggerEngine;
import java.util.Timer;

/* renamed from: X.Myt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52001Myt extends CallManagerCallClientCallbacks {
    public final /* synthetic */ C54739OFq A00;

    @Override // com.facebook.rsys.callmanager.callclient.gen.CallManagerCallClientCallbacks
    public final void onCallAdded(CallClient callClient) {
        C14360o3.A0B(callClient, 0);
        C54739OFq c54739OFq = this.A00;
        C54551O8d c54551O8d = c54739OFq.A00;
        if (c54551O8d != null && AbstractC25231BEo.A1a(callClient, c54551O8d.A00)) {
            c54739OFq.A00 = null;
            return;
        }
        if (callClient instanceof C52000Myq) {
            O4Z o4z = c54739OFq.A07;
            C52000Myq c52000Myq = (C52000Myq) callClient;
            C14360o3.A0B(c52000Myq, 0);
            C55207OeK c55207OeK = o4z.A00;
            java.util.Set set = c55207OeK.A0P;
            if (set.add(c52000Myq)) {
                OXE.A00.A00("RtcRsysInteractor", AnonymousClass001.A0O("Call Added, total: ", set.size()));
            }
            C52000Myq c52000Myq2 = c55207OeK.A02;
            if (c52000Myq2 != null && (C14360o3.A0K(c52000Myq2.A0A, c52000Myq.A0A) || !C55207OeK.A05(c55207OeK.A02, c55207OeK))) {
                return;
            }
            c55207OeK.A02 = c52000Myq;
            return;
        }
        throw AbstractC31172DnG.A0u();
    }

    @Override // com.facebook.rsys.callmanager.callclient.gen.CallManagerCallClientCallbacks
    public final void onCallRemoved(CallClient callClient) {
        C14360o3.A0B(callClient, 0);
        if (callClient instanceof C52000Myq) {
            O4Z o4z = this.A00.A07;
            C52000Myq c52000Myq = (C52000Myq) callClient;
            C14360o3.A0B(c52000Myq, 0);
            C55207OeK c55207OeK = o4z.A00;
            java.util.Set set = c55207OeK.A0P;
            set.remove(c52000Myq);
            OXE.A00.A00("RtcRsysInteractor", AnonymousClass001.A0O("Call Removed, total: ", set.size()));
            if (C14360o3.A0K(c55207OeK.A02, c52000Myq)) {
                c55207OeK.A02 = null;
            }
            C54996OUf c54996OUf = c52000Myq.A01;
            if (C18U.A06(C06090Tz.A05, c54996OUf.A0E, 36313596300363947L)) {
                C51996Myi c51996Myi = c54996OUf.A09;
                OHJ ohj = c54996OUf.A0G;
                C14360o3.A0B(ohj, 0);
                c51996Myi.A09.A00.A03.remove(ohj);
            }
            C52023Mzj c52023Mzj = c54996OUf.A0P;
            if (c52023Mzj.A00 != null) {
                C1GD.A01.remove(c52023Mzj);
                c52023Mzj.A00 = null;
            }
            c54996OUf.A0g.shutdown();
            c54996OUf.A0Z.A00 = null;
            c54996OUf.A09.A01 = null;
            N00 n00 = c54996OUf.A0d;
            C54615OAq c54615OAq = n00.A01;
            if (c54615OAq != null) {
                IgRadioTsLoggerEngine igRadioTsLoggerEngine = c54615OAq.A00;
                if (igRadioTsLoggerEngine != null) {
                    igRadioTsLoggerEngine.stop();
                }
                Timer timer = c54615OAq.A01;
                timer.cancel();
                timer.purge();
            }
            n00.A01 = null;
            n00.A00 = null;
            c54996OUf.A0O.stop();
        }
    }

    public C52001Myt(C54739OFq c54739OFq) {
        this.A00 = c54739OFq;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0085, code lost:
    
        if (r6 != null) goto L29;
     */
    /* JADX WARN: Type inference failed for: r22v0, types: [java.lang.Object, X.Nws] */
    @Override // com.facebook.rsys.callmanager.callclient.gen.CallManagerCallClientCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.rsys.callmanager.callclient.gen.CallClient createCallClient(java.lang.String r37, com.facebook.rsys.callmanager.gen.UserContext r38, com.facebook.rsys.callcontext.gen.CallContext r39) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52001Myt.createCallClient(java.lang.String, com.facebook.rsys.callmanager.gen.UserContext, com.facebook.rsys.callcontext.gen.CallContext):com.facebook.rsys.callmanager.callclient.gen.CallClient");
    }
}
