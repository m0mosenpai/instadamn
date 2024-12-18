package X;

import android.content.Context;
import com.instagram.common.gallery.RemoteMedia;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.8kf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C195398kf {
    public List A00;
    public InterfaceC16820sZ A01;
    public final Map A02;

    public static final synchronized void A00(RemoteMedia remoteMedia, A8I a8i, C195398kf c195398kf, Integer num) {
        synchronized (c195398kf) {
            c195398kf.A02.put(remoteMedia, new A8I(num, a8i.A02, a8i.A01));
            if (c195398kf.A00.contains(remoteMedia) && !c195398kf.A01(c195398kf.A00) && !c195398kf.A02(c195398kf.A00)) {
                InterfaceC16820sZ interfaceC16820sZ = c195398kf.A01;
                if (interfaceC16820sZ != null) {
                    interfaceC16820sZ.invoke();
                }
                c195398kf.A00 = C16930sl.A00;
                c195398kf.A01 = null;
            }
        }
    }

    private final synchronized boolean A01(List list) {
        boolean z;
        z = true;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!this.A02.containsKey((RemoteMedia) it.next())) {
                    break;
                }
            }
        }
        z = false;
        return z;
    }

    private final synchronized boolean A02(List list) {
        boolean z;
        Integer num;
        z = true;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A8I a8i = (A8I) this.A02.get((RemoteMedia) it.next());
                if (a8i != null) {
                    num = a8i.A00;
                } else {
                    num = null;
                }
                if (num == C05F.A00) {
                    break;
                }
            }
        }
        z = false;
        return z;
    }

    public final synchronized void A03(Context context, final RemoteMedia remoteMedia, final UserSession userSession, final String str, final InterfaceC16660sJ interfaceC16660sJ, final InterfaceC16660sJ interfaceC16660sJ2) {
        C14360o3.A0B(context, 0);
        C14360o3.A0B(userSession, 1);
        final A8I a8i = new A8I(C05F.A00, interfaceC16660sJ, interfaceC16660sJ2);
        this.A02.put(remoteMedia, a8i);
        C121275eQ A03 = AbstractC50633MWu.A03(context, userSession, new OUQ(remoteMedia.A04.CDP(), "RemoteMediaDownloadManager", remoteMedia.A09, false, false));
        A03.A00 = new C2AH() { // from class: X.9h8
            @Override // X.C2AH
            public final void onFail(Exception exc) {
                String str2;
                C14360o3.A0B(exc, 0);
                UserSession userSession2 = userSession;
                C195398kf c195398kf = this;
                C19270xB c19270xB = new C19270xB("RemoteMediaDownloadManager");
                String str3 = str;
                RemoteMedia remoteMedia2 = remoteMedia;
                boolean z = remoteMedia2.A09;
                String CDP = remoteMedia2.A04.CDP();
                String message = exc.getMessage();
                if (z) {
                    str2 = MediaStreamTrack.VIDEO_TRACK_KIND;
                } else {
                    str2 = "photo";
                }
                C09530e4 A1L = AbstractC166987dD.A1L("uri", CDP);
                if (message == null) {
                    message = "";
                }
                AbstractC208329Jr.A08(c19270xB, userSession2, null, null, "error_logging", str3, str2, null, null, AbstractC167017dG.A0u("is_network", "network", A1L, AbstractC166987dD.A1L("error_message", message), AbstractC166987dD.A1L("error_type", "media_download")));
                interfaceC16660sJ2.invoke(exc);
                C195398kf.A00(remoteMedia2, a8i, c195398kf, C05F.A0C);
            }

            @Override // X.C2AH
            public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                C14360o3.A0B(obj, 0);
                interfaceC16660sJ.invoke(obj);
                C195398kf c195398kf = this;
                C195398kf.A00(remoteMedia, a8i, c195398kf, C05F.A01);
            }
        };
        C1GJ.A03(A03);
    }

    public final synchronized void A04(List list, InterfaceC16820sZ interfaceC16820sZ) {
        if (!A01(list) && !A02(list)) {
            this.A01 = null;
            this.A00 = C16930sl.A00;
            interfaceC16820sZ.invoke();
        } else {
            this.A01 = interfaceC16820sZ;
            this.A00 = list;
        }
    }

    public C195398kf(UserSession userSession, boolean z) {
        List A0a;
        this.A02 = new HashMap();
        this.A00 = new ArrayList();
        if (z && userSession != null) {
            synchronized (this) {
                C195428ki A00 = AbstractC195408kg.A00(userSession);
                synchronized (A00) {
                    A0a = AbstractC001800i.A0a(A00.A01.keySet());
                }
                Iterator it = A0a.iterator();
                while (it.hasNext()) {
                    this.A02.put((RemoteMedia) it.next(), new A8I(C05F.A01, B9V.A00, B9W.A00));
                }
            }
        }
    }

    public C195398kf() {
        this(null, false);
    }
}
