package X;

import android.view.MotionEvent;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Wep, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70669Wep implements InterfaceC153536vO {
    public final /* synthetic */ C67973V4n A00;

    @Override // X.InterfaceC153536vO
    public final /* synthetic */ void D55(User user) {
    }

    public C70669Wep(C67973V4n c67973V4n) {
        this.A00 = c67973V4n;
    }

    @Override // X.InterfaceC153536vO
    public final void D5T(C120985dq c120985dq, int i) {
        C67973V4n c67973V4n = this.A00;
        C68034V7f c68034V7f = c67973V4n.A05;
        List list = C68034V7f.A00(c68034V7f.A00, c68034V7f).A02;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            it.next();
        }
        UserSession userSession = c67973V4n.A0I;
        C62832tM A00 = AbstractC62822tL.A00(userSession);
        String str = c67973V4n.A0K;
        C125895me c125895me = InterfaceC111084zP.A00;
        W5E w5e = c67973V4n.A09;
        EnumC68206VFy enumC68206VFy = EnumC68206VFy.A05;
        C125905mf A002 = c125895me.A00(w5e.A02(enumC68206VFy));
        A002.A00 = W5E.A00(c67973V4n.A09, enumC68206VFy).A04.A03.A07;
        A00.A03(A002.A00(), EnumC125615m7.A03, str, arrayList, true, true);
        FragmentActivity fragmentActivity = c67973V4n.A0G;
        C116875Qr c116875Qr = new C116875Qr(ClipsViewerSource.A1k, userSession);
        c116875Qr.A1C = AbstractC69973Vyo.A01(c67973V4n.A02);
        C38321qM c38321qM = c120985dq.A02;
        c38321qM.getClass();
        c116875Qr.A1D = c38321qM.getId();
        c116875Qr.A1G = str;
        c116875Qr.A1d = false;
        AbstractC86593tX.A0Y(fragmentActivity, c116875Qr.A00(), userSession);
    }

    @Override // X.InterfaceC153536vO
    public final boolean D5U(MotionEvent motionEvent, View view, C120985dq c120985dq, int i) {
        AbstractC42425IqS abstractC42425IqS = this.A00.A06;
        C38321qM c38321qM = c120985dq.A02;
        c38321qM.getClass();
        return abstractC42425IqS.DSM(motionEvent, view, new C5qT((i - 1) % 3, i / 3), c38321qM);
    }
}
