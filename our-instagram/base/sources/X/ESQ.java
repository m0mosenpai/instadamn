package X;

import com.instagram.api.schemas.HallpassDetailsDictImpl;
import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class ESQ extends C1P1 {
    public final /* synthetic */ C61252qn A00;

    public ESQ(C61252qn c61252qn) {
        this.A00 = c61252qn;
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-2081197796);
        EAI eai = (EAI) obj;
        int A032 = C0f9.A03(310104663);
        C14360o3.A0B(eai, 0);
        ReelStore A04 = C1OU.A04(this.A00.A07);
        E7q e7q = eai.A00;
        if (e7q == null) {
            AbstractC31171DnF.A0w();
            throw C00O.createAndThrow();
        }
        List list = e7q.A00;
        A04.A04 = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            E7m e7m = (E7m) ((InterfaceC37242Gar) it.next());
            String str = e7m.A03;
            Reel reel = new Reel((C1NB) null, AnonymousClass001.A0R("election:hallpass", str), false);
            new C1DY((C1DV) new C37761pD(null), 6, false);
            String str2 = e7m.A04;
            String str3 = e7m.A02;
            List list2 = e7m.A05;
            AbstractC31180DnO.A0w(6);
            AbstractC31180DnO.A0w(6);
            reel.A08 = new HallpassDetailsDictImpl(str3, str, str2, list2);
            reel.A0r = str2;
            A04.A04.add(reel);
        }
        if (list.isEmpty()) {
            C23031Ai A00 = AbstractC23021Ah.A00(A04.A09);
            long currentTimeMillis = System.currentTimeMillis();
            InterfaceC19610xo A0w = AbstractC166987dD.A0w(A00);
            A0w.E7G(AbstractC111324zv.A00(4523), currentTimeMillis);
            A0w.apply();
        }
        AbstractC25651Mw.A00(A04.A09).A05(new C3DH(null, A04.A0U(false), -1, false));
        C0f9.A0A(-122175754, A032);
        C0f9.A0A(-1004299721, A03);
    }
}
