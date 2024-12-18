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

/* renamed from: X.Weq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70670Weq implements InterfaceC153536vO {
    public final /* synthetic */ V1R A00;

    @Override // X.InterfaceC153536vO
    public final /* synthetic */ void D55(User user) {
    }

    @Override // X.InterfaceC153536vO
    public final void D5T(C120985dq c120985dq, int i) {
        String str;
        C14360o3.A0B(c120985dq, 0);
        V1R v1r = this.A00;
        C68034V7f c68034V7f = v1r.A08;
        if (c68034V7f == null) {
            str = "dataSource";
        } else {
            List list = C68034V7f.A00(c68034V7f.A00, c68034V7f).A02;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                it.next();
            }
            C62832tM A00 = AbstractC62822tL.A00(V1R.A00(v1r));
            String str2 = v1r.A0g;
            C125895me c125895me = InterfaceC111084zP.A00;
            W4b w4b = v1r.A0I;
            str = "feedRequestController";
            if (w4b != null) {
                C125905mf A002 = c125895me.A00(W4b.A00(w4b.A00, w4b).A02.A05());
                W4b w4b2 = v1r.A0I;
                if (w4b2 != null) {
                    A002.A00 = W4b.A00(w4b2.A00, w4b2).A02.A03.A07;
                    A00.A03(A002.A00(), EnumC125615m7.A03, str2, arrayList, true, true);
                    UserSession A003 = V1R.A00(v1r);
                    FragmentActivity requireActivity = v1r.requireActivity();
                    C116875Qr c116875Qr = new C116875Qr(ClipsViewerSource.A1c, V1R.A00(v1r));
                    c116875Qr.A1C = V1R.A01(v1r).A01.getName();
                    C38321qM c38321qM = c120985dq.A02;
                    if (c38321qM != null) {
                        c116875Qr.A1D = c38321qM.getId();
                        c116875Qr.A1G = str2;
                        c116875Qr.A0o = AnonymousClass001.A0D(V1R.A01(v1r).A01.getName(), '#');
                        c116875Qr.A0q = "clips_hashtag";
                        AbstractC86593tX.A0Y(requireActivity, c116875Qr.A00(), A003);
                        return;
                    }
                    throw AbstractC166997dE.A0g();
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public C70670Weq(V1R v1r) {
        this.A00 = v1r;
    }

    @Override // X.InterfaceC153536vO
    public final boolean D5U(MotionEvent motionEvent, View view, C120985dq c120985dq, int i) {
        AbstractC167027dH.A12(c120985dq, view, motionEvent);
        AbstractC42425IqS abstractC42425IqS = this.A00.A0b;
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            return abstractC42425IqS.DSM(motionEvent, view, new C5qT((i - 1) % 3, i / 3), c38321qM);
        }
        throw AbstractC166997dE.A0g();
    }
}
