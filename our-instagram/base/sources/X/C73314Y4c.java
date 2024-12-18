package X;

import android.os.Looper;
import android.view.Surface;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Y4c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73314Y4c {
    public int A00;
    public int A01;
    public Surface A02;
    public XPQ A03;
    public AbstractC55102ObF A04;
    public C72175XRj A05;
    public boolean A06;
    public final InterfaceC174767qC A07;
    public final C1815383g A08;
    public final HandlerC72131XPd A09;
    public final Map A0A = AbstractC166987dD.A1G();

    public static final void A01(C73314Y4c c73314Y4c) {
        C174757qB c174757qB;
        c73314Y4c.A06 = false;
        Map map = c73314Y4c.A0A;
        Iterator A16 = AbstractC166997dE.A16(map);
        while (A16.hasNext()) {
            InterfaceC185788Ly interfaceC185788Ly = (InterfaceC185788Ly) A16.next();
            C1815383g c1815383g = c73314Y4c.A08;
            C14360o3.A0B(interfaceC185788Ly, 0);
            InterfaceC174857qL interfaceC174857qL = c1815383g.A04.A04;
            if (interfaceC174857qL != null) {
                interfaceC174857qL.EG2(interfaceC185788Ly);
            }
        }
        map.clear();
        C11T.A02(new RunnableC73506YGk(c73314Y4c.A04));
        InterfaceC174767qC interfaceC174767qC = c73314Y4c.A07;
        if ((interfaceC174767qC instanceof C174757qB) && (c174757qB = (C174757qB) interfaceC174767qC) != null) {
            c174757qB.A0C();
        }
    }

    public static final void A00(YQR yqr, C73314Y4c c73314Y4c) {
        AbstractC55102ObF abstractC55102ObF = c73314Y4c.A04;
        Map map = c73314Y4c.A0A;
        C72176XRk c72176XRk = new C72176XRk(abstractC55102ObF, yqr, map.isEmpty());
        InterfaceC174857qL interfaceC174857qL = c73314Y4c.A08.A04.A04;
        if (interfaceC174857qL != null) {
            interfaceC174857qL.A9o(c72176XRk);
        }
        map.put(yqr, c72176XRk);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.8Ly, X.XRj, X.8p4] */
    public static final void A02(C73314Y4c c73314Y4c) {
        int i;
        Surface surface = c73314Y4c.A02;
        if (surface != null) {
            C72175XRj c72175XRj = c73314Y4c.A05;
            if (c72175XRj != null) {
                c72175XRj.A01(surface, c73314Y4c.A01, c73314Y4c.A00);
                return;
            }
            int i2 = c73314Y4c.A01;
            if (i2 <= 0 || (i = c73314Y4c.A00) <= 0) {
                return;
            }
            ?? c197938p4 = new C197938p4(surface, EnumC185798Lz.PREVIEW, i2, i);
            c73314Y4c.A05 = c197938p4;
            InterfaceC174857qL interfaceC174857qL = c73314Y4c.A08.A04.A04;
            if (interfaceC174857qL == 0) {
                return;
            }
            interfaceC174857qL.A9o(c197938p4);
        }
    }

    public C73314Y4c(Looper looper, InterfaceC174767qC interfaceC174767qC, C1815383g c1815383g) {
        this.A08 = c1815383g;
        this.A07 = interfaceC174767qC;
        this.A09 = new HandlerC72131XPd(looper, this);
    }
}
