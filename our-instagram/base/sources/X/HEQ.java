package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public final class HEQ extends C7E1 implements InterfaceC69543Ao, InterfaceC152956uP {
    public final N9H A00;
    public final InterfaceC62602sz A01;
    public final C65842yM A02;
    public final C39143HKw A03;
    public final Map A04;
    public final Map A05;

    /* JADX WARN: Type inference failed for: r0v2, types: [X.HKw, X.2xV] */
    public HEQ(Context context, InterfaceC58021Po7 interfaceC58021Po7, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC62602sz interfaceC62602sz) {
        C14360o3.A0B(userSession, 2);
        N9H n9h = new N9H(context, null, interfaceC58021Po7, interfaceC11380iw, userSession, false, false, false, false);
        this.A00 = n9h;
        C65842yM c65842yM = new C65842yM(context);
        this.A02 = c65842yM;
        this.A01 = interfaceC62602sz;
        this.A03 = new AbstractC65332xV();
        this.A05 = AbstractC166987dD.A1G();
        this.A04 = AbstractC166987dD.A1G();
        A0B(n9h, c65842yM);
    }

    @Override // X.InterfaceC152956uP
    public final /* bridge */ /* synthetic */ C153336v2 BQs(String str) {
        C14360o3.A0B(str, 0);
        Map map = this.A04;
        C153336v2 c153336v2 = (C153336v2) map.get(str);
        if (c153336v2 == null) {
            HLY hly = new HLY(this);
            map.put(str, hly);
            return hly;
        }
        return c153336v2;
    }

    @Override // X.InterfaceC69543Ao
    public final int CNP(Reel reel) {
        C14360o3.A0B(reel, 0);
        Map map = this.A05;
        if (map.containsKey(reel.getId())) {
            Object obj = map.get(reel.getId());
            C14360o3.A0A(obj);
            return AbstractC166987dD.A0H(obj);
        }
        return -1;
    }

    @Override // X.InterfaceC69543Ao
    public final int CNQ(Reel reel, C41181vS c41181vS) {
        C14360o3.A0B(reel, 0);
        return CNP(reel);
    }

    @Override // X.InterfaceC69543Ao
    public final void EcN(List list, boolean z, UserSession userSession) {
    }

    @Override // X.InterfaceC69543Ao
    public final Object Bla(int i) {
        return getItem(i);
    }
}
