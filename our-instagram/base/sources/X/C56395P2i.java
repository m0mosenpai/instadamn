package X;

import android.os.Handler;
import com.instagram.filterkit.filter.intf.IgFilter;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: X.P2i, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56395P2i implements InterfaceC58048PoZ {
    public final Object A00;
    public final Queue A01;
    public final O2O A02;
    public final InterfaceC58176Pqg A03;
    public final C55003OVg A04;
    public volatile IgFilter A05;
    public volatile InterfaceC197718oi A06;
    public volatile YRL A07;
    public volatile Integer A08;
    public volatile Integer A09;

    @Override // X.InterfaceC58048PoZ
    public final C55003OVg C4J() {
        return this.A04;
    }

    @Override // X.InterfaceC58048PoZ
    public final void EGV() {
        while (true) {
            Queue queue = this.A01;
            if (!queue.isEmpty()) {
                Object remove = queue.remove();
                if (remove != null) {
                    ((Runnable) remove).run();
                } else {
                    throw AbstractC166997dE.A0g();
                }
            } else {
                if (this.A06 != null) {
                    if (this.A05 != null) {
                        if (this.A07 != null) {
                            Integer num = this.A08;
                            Integer num2 = this.A09;
                            if (num2 != null && num != null) {
                                YRL yrl = this.A07;
                                if (yrl != null) {
                                    yrl.EcX(num2.intValue(), num.intValue());
                                } else {
                                    throw AbstractC166997dE.A0g();
                                }
                            }
                            P09 p09 = this.A02.A00;
                            C197268nx c197268nx = p09.A0I;
                            c197268nx.A02.A00(c197268nx.A01);
                            IgFilter igFilter = this.A05;
                            if (igFilter != null) {
                                YPq Bob = this.A03.Bob();
                                InterfaceC197718oi interfaceC197718oi = this.A06;
                                if (interfaceC197718oi != null) {
                                    YRL yrl2 = this.A07;
                                    if (yrl2 != null) {
                                        igFilter.EGY(Bob, interfaceC197718oi, yrl2);
                                        synchronized (this.A00) {
                                        }
                                        if (!p09.A05 && p09.A02 != null) {
                                            p09.A05 = true;
                                            Handler handler = p09.A0D;
                                            final MYS mys = p09.A0F;
                                            mys.getClass();
                                            handler.post(new Runnable() { // from class: X.PML
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    C11T.A02(new RunnableC56868PLn(MYS.this.A01));
                                                }
                                            });
                                            return;
                                        }
                                        return;
                                    }
                                    throw AbstractC166997dE.A0g();
                                }
                                throw AbstractC166997dE.A0g();
                            }
                            throw AbstractC166997dE.A0g();
                        }
                        throw AbstractC166997dE.A0g();
                    }
                    throw AbstractC166997dE.A0g();
                }
                throw AbstractC166987dD.A18("Input surface was null.");
            }
        }
    }

    public C56395P2i(O2O o2o, InterfaceC58176Pqg interfaceC58176Pqg, C55003OVg c55003OVg) {
        AbstractC167027dH.A13(interfaceC58176Pqg, o2o, c55003OVg);
        this.A03 = interfaceC58176Pqg;
        this.A02 = o2o;
        this.A04 = c55003OVg;
        this.A01 = new ConcurrentLinkedQueue();
        this.A00 = new Object();
    }
}
