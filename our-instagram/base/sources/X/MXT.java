package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.CreationSession;
import com.instagram.creation.base.CropInfo;
import com.instagram.creation.base.MediaSession;
import com.instagram.creation.base.PhotoSession;
import com.instagram.creation.base.VideoSession;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes9.dex */
public final class MXT implements InterfaceC58145PqA, InterfaceC197258nw {
    public final /* synthetic */ MXA A00;

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, X.7wv, X.AVn] */
    @Override // X.InterfaceC58145PqA
    public final InterfaceC58165PqV ALt(String str, String str2) {
        C9RK c9rk;
        VideoSession videoSession;
        MXA mxa = this.A00;
        InterfaceC189608af interfaceC189608af = mxa.A06;
        if (interfaceC189608af.Ak4().A00 != null) {
            if (str2 != null) {
                MX5 mx5 = (MX5) interfaceC189608af.Ak4().A00();
                CreationSession creationSession = mx5.A01;
                UserSession userSession = mx5.A00;
                Iterator it = creationSession.A0E.iterator();
                while (true) {
                    if (it.hasNext()) {
                        MediaSession A0R = MSW.A0R(it);
                        C47Z A03 = C25A.A00(userSession).A03(A0R.BcD());
                        if (A0R.Btq() == C05F.A01 && A03 != null && str2.equals(A03.A33)) {
                            videoSession = (VideoSession) A0R;
                            break;
                        }
                    } else {
                        videoSession = null;
                        break;
                    }
                }
                C178267w0 c178267w0 = new C178267w0();
                String obj = c178267w0.toString();
                ?? obj2 = new Object();
                C55603Omk c55603Omk = new C55603Omk(mxa, 0);
                synchronized (obj2) {
                    obj2.A00 = c55603Omk;
                }
                Activity activity = mxa.A02;
                C178577wV A01 = AbstractC23039ADv.A01(activity, obj2, c178267w0, mxa.A03, "instagram_feed_post_capture_cover", obj, null, true, false);
                UserSession CE4 = mxa.A04.CE4();
                OyJ oyJ = new OyJ(mxa);
                C197168nm A00 = MXA.A00(mxa, str2, null);
                if (videoSession != null) {
                    c9rk = new C9RK(activity, A01, null, CE4, videoSession.A0C, interfaceC189608af.Ak4(), oyJ, this, obj2, A00, 0, false);
                    c9rk.A08 = c178267w0;
                    c9rk.A0D = obj;
                } else {
                    throw AbstractC166997dE.A0g();
                }
            } else {
                throw AbstractC166997dE.A0g();
            }
        } else {
            c9rk = null;
        }
        mxa.A09.put(str, new C56207OxG(mxa.A03, c9rk));
        return null;
    }

    @Override // X.InterfaceC58145PqA
    public final synchronized void AP6() {
        Map map = this.A00.A09;
        Iterator it = AbstractC31180DnO.A0n(map).iterator();
        while (it.hasNext()) {
            ((InterfaceC58165PqV) it.next()).DfN();
        }
        map.clear();
    }

    @Override // X.InterfaceC58145PqA
    public final synchronized void destroy() {
        Map map = this.A00.A0A;
        Iterator it = AbstractC31180DnO.A0n(map).iterator();
        while (it.hasNext()) {
            ((InterfaceC197218ns) it.next()).AP5();
        }
        map.clear();
    }

    public MXT(MXA mxa) {
        this.A00 = mxa;
    }

    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, X.7wv, X.AVn] */
    @Override // X.InterfaceC58145PqA
    public final void AMu(OJQ ojq, PhotoSession photoSession, String str) {
        C178267w0 c178267w0 = new C178267w0();
        String obj = c178267w0.toString();
        ?? obj2 = new Object();
        MXA mxa = this.A00;
        Activity activity = mxa.A02;
        C9RK c9rk = new C9RK(activity, AbstractC23039ADv.A01(activity, obj2, c178267w0, mxa.A03, "instagram_feed_post_capture_photo", obj, null, true, false), ojq, mxa.A04.CE4(), photoSession.A05, mxa.A06.Ak4(), new OyJ(mxa), this, obj2, MXA.A00(mxa, str, photoSession.A09), photoSession.A0D.getValue(), photoSession.A0C);
        c9rk.A08 = c178267w0;
        c9rk.A0D = obj;
        mxa.A0A.put(str, c9rk);
    }

    @Override // X.InterfaceC197258nw
    public final void DV1(CropInfo cropInfo, String str, int i) {
        MXA.A01(cropInfo, this.A00, str, i);
    }
}
