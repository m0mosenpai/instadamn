package X;

import android.content.Context;
import android.location.Location;
import android.os.Build;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.MediaSession;
import com.instagram.model.creation.MediaCaptureConfig;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes9.dex */
public final class P07 implements InterfaceC58147PqC {
    public boolean A00;
    public boolean A01 = true;
    public final int A02;
    public final Context A03;
    public final UserSession A04;
    public final InterfaceC58030PoG A05;
    public final MediaSession A06;
    public final MXB A07;
    public final AnonymousClass841 A08;
    public final InterfaceC189678am A09;
    public final MediaCaptureConfig A0A;
    public final InterfaceC189598ae A0B;
    public final CountDownLatch A0C;

    @Override // X.InterfaceC58147PqC
    public final void DfF() {
        C0K8.A0C("RenderCompleteListener", "onRenderCancelled():");
        C0K8.A0C("RenderCompleteListener", android.util.Log.getStackTraceString(new Throwable()));
        this.A00 = true;
    }

    @Override // X.InterfaceC58147PqC
    public final void DfI(final List list) {
        C0K8.A0C("RenderCompleteListener", "onRenderFinished(): registering pending media available callback now.");
        this.A0B.EDa(new Runnable() { // from class: X.PQK
            /* JADX WARN: Removed duplicated region for block: B:101:0x0253  */
            /* JADX WARN: Removed duplicated region for block: B:104:0x0275  */
            /* JADX WARN: Removed duplicated region for block: B:107:0x0292  */
            /* JADX WARN: Removed duplicated region for block: B:116:0x02d1  */
            /* JADX WARN: Removed duplicated region for block: B:119:0x02dd  */
            /* JADX WARN: Removed duplicated region for block: B:122:0x02e9  */
            /* JADX WARN: Removed duplicated region for block: B:125:0x02f3  */
            /* JADX WARN: Removed duplicated region for block: B:63:0x0142  */
            /* JADX WARN: Removed duplicated region for block: B:66:0x0154  */
            /* JADX WARN: Removed duplicated region for block: B:71:0x0180  */
            /* JADX WARN: Removed duplicated region for block: B:74:0x01a7  */
            /* JADX WARN: Removed duplicated region for block: B:77:0x01b9  */
            /* JADX WARN: Removed duplicated region for block: B:80:0x01cb  */
            /* JADX WARN: Removed duplicated region for block: B:83:0x01dd  */
            /* JADX WARN: Removed duplicated region for block: B:86:0x01ef  */
            /* JADX WARN: Removed duplicated region for block: B:89:0x0201  */
            /* JADX WARN: Removed duplicated region for block: B:92:0x0213  */
            /* JADX WARN: Removed duplicated region for block: B:95:0x0225  */
            /* JADX WARN: Removed duplicated region for block: B:98:0x0237  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 947
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.PQK.run():void");
            }
        });
    }

    @Override // X.InterfaceC58147PqC
    public final void DfK() {
        C0K8.A0C("RenderCompleteListener", "onRenderStarted()");
    }

    public P07(Context context, UserSession userSession, InterfaceC58030PoG interfaceC58030PoG, MediaSession mediaSession, MXB mxb, AnonymousClass841 anonymousClass841, InterfaceC189678am interfaceC189678am, MediaCaptureConfig mediaCaptureConfig, InterfaceC189598ae interfaceC189598ae, CountDownLatch countDownLatch, int i) {
        this.A03 = context;
        this.A08 = anonymousClass841;
        this.A06 = mediaSession;
        this.A04 = userSession;
        this.A07 = mxb;
        this.A05 = interfaceC58030PoG;
        this.A0A = mediaCaptureConfig;
        this.A02 = i;
        this.A0B = interfaceC189598ae;
        this.A09 = interfaceC189678am;
        this.A0C = countDownLatch;
    }

    @Override // X.InterfaceC58147PqC
    public final void DiC(Map map) {
        Location BOK;
        Iterator A12 = AbstractC43593JPy.A12(map);
        while (A12.hasNext()) {
            OEN oen = (OEN) A12.next();
            if (oen.A02 == EnumC53116NeT.A02) {
                MediaSession mediaSession = this.A06;
                if (mediaSession != null && (BOK = mediaSession.BOK()) != null) {
                    AbstractC209859Pw.A03(BOK, oen.A04);
                }
                if (Build.VERSION.SDK_INT >= 30) {
                    UserSession userSession = this.A04;
                    C14360o3.A0B(userSession, 0);
                    if ((C2J9.A00 && C18U.A06(C06090Tz.A05, userSession, 36315451727940856L)) || C2J9.A04(userSession)) {
                        Context context = this.A03;
                        Object obj = map.get(oen);
                        obj.getClass();
                        AbstractC54108Nw6.A00(context, ((C54791OJj) obj).A08, "image");
                        CountDownLatch countDownLatch = this.A0C;
                        if (countDownLatch != null) {
                            countDownLatch.countDown();
                        }
                    }
                }
            }
        }
    }
}
