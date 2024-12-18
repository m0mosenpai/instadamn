package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.DownloadedTrack;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.OVm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55005OVm {
    public final int A00;
    public final Context A01;
    public final UserSession A02;
    public final List A03 = AbstractC166987dD.A1E();
    public final InterfaceC58037PoN A04;

    /* JADX WARN: Type inference failed for: r3v0, types: [X.0pQ, java.lang.Object] */
    public final void A01(List list) {
        ?? obj = new Object();
        int size = list.size();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AudioOverlayTrack audioOverlayTrack = (AudioOverlayTrack) it.next();
            Context context = this.A01;
            UserSession userSession = this.A02;
            C8KO c8ko = new C8KO(context, userSession, new C189848b3(), 0);
            DownloadedTrack downloadedTrack = audioOverlayTrack.A06;
            if (downloadedTrack != null && MSY.A1Z(downloadedTrack.A02)) {
                if (audioOverlayTrack.A08 == null) {
                    c8ko.A02(context, userSession, new C56482P5w(this, audioOverlayTrack, obj, size), audioOverlayTrack.A0A, audioOverlayTrack.A0B, audioOverlayTrack.A0E);
                } else {
                    this.A03.add(audioOverlayTrack);
                    int i = obj.A00 + 1;
                    obj.A00 = i;
                    A00(this, i, size);
                }
            } else {
                C56485P5z c56485P5z = new C56485P5z(this, audioOverlayTrack, obj, size);
                new C8KO(context, userSession, new C189848b3(), 0).A03(audioOverlayTrack, new C56483P5x(c56485P5z, this, audioOverlayTrack, obj, size), c56485P5z, this.A00, false, true);
            }
        }
    }

    public static final void A00(C55005OVm c55005OVm, int i, int i2) {
        if (i == i2) {
            List list = c55005OVm.A03;
            boolean isEmpty = list.isEmpty();
            InterfaceC58037PoN interfaceC58037PoN = c55005OVm.A04;
            if (isEmpty) {
                interfaceC58037PoN.DBo();
            } else {
                interfaceC58037PoN.DBn(list);
            }
        }
    }

    public C55005OVm(Context context, UserSession userSession, InterfaceC58037PoN interfaceC58037PoN, int i) {
        this.A01 = context;
        this.A02 = userSession;
        this.A00 = i;
        this.A04 = interfaceC58037PoN;
    }
}
