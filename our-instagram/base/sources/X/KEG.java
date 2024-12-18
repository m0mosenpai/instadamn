package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes8.dex */
public final class KEG extends C2US implements InterfaceC65232xL, InterfaceC152956uP {
    public int A00;
    public Map A01;
    public final YE3 A02;
    public final KEM A03;
    public final KEN A04;
    public final C47271Kui A05;
    public final List A06;
    public final List A07;
    public final AtomicBoolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final UserSession A0B;
    public final Map A0C;

    public KEG(Context context, C47271Kui c47271Kui, InterfaceC11380iw interfaceC11380iw, UserSession userSession, List list, boolean z, boolean z2) {
        C14360o3.A0B(userSession, 1);
        this.A0B = userSession;
        this.A0A = z;
        this.A09 = z2;
        this.A06 = list;
        this.A05 = c47271Kui;
        this.A00 = 3;
        this.A02 = AbstractC151606s6.A02(userSession);
        this.A07 = AbstractC166987dD.A1E();
        this.A03 = new KEM(context);
        this.A04 = new KEN(context);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            this.A07.add(new HFS(interfaceC11380iw, this.A0B, (C53Q) this.A06.get(i), (C38N) this.A06.get(i)));
            ((HFS) this.A07.get(i)).A00 = 1.0f;
        }
        ArrayList A17 = AbstractC25225BEi.A17(3);
        AbstractC15480q3.A00(this.A07.toArray(new HFS[0]), A17);
        A17.add(this.A03);
        A17.add(this.A04);
        init((InterfaceC65642y0[]) A17.toArray(new InterfaceC65642y0[A17.size()]));
        this.A0C = AbstractC166987dD.A1G();
        this.A01 = AbstractC166987dD.A1G();
        this.A08 = new AtomicBoolean();
    }

    @Override // X.InterfaceC152956uP
    public final C153336v2 BQs(String str) {
        C14360o3.A0B(str, 0);
        return AbstractC37304Gc5.A0G(str, this.A0C);
    }

    @Override // X.InterfaceC61772re, X.InterfaceC61782rf
    public final C75113Zb BRZ(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        Map map = this.A01;
        C75113Zb c75113Zb = (C75113Zb) map.get(c38321qM);
        if (c75113Zb == null) {
            C75113Zb A0E = AbstractC37303Gc4.A0E(c38321qM);
            map.put(c38321qM, A0E);
            return A0E;
        }
        return c75113Zb;
    }

    @Override // X.InterfaceC65232xL
    public final void CtR(C38321qM c38321qM) {
    }
}
