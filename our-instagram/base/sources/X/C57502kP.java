package X;

import android.content.Context;
import android.net.NetworkInfo;
import com.instagram.common.session.UserSession;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.2kP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C57502kP implements InterfaceC13000lm {
    public boolean A00;
    public final UserSession A01;
    public final InterfaceC14020nS A02;
    public final InterfaceC15680qO A03;
    public final Map A04;
    public final C218914p A05;
    public final InterfaceC12870lZ A06;
    public final C1GK A07;

    public C57502kP(C218914p c218914p, UserSession userSession, InterfaceC14020nS interfaceC14020nS) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(c218914p, 3);
        this.A01 = userSession;
        this.A02 = interfaceC14020nS;
        this.A05 = c218914p;
        this.A07 = new C1GK(interfaceC14020nS);
        this.A04 = Collections.synchronizedMap(new HashMap());
        this.A03 = new InterfaceC15680qO() { // from class: X.2kQ
            @Override // X.InterfaceC15680qO
            public final void onConnectionChanged(NetworkInfo networkInfo) {
                if (networkInfo != null) {
                    C57502kP.this.A00();
                }
            }
        };
        InterfaceC12870lZ interfaceC12870lZ = new InterfaceC12870lZ() { // from class: X.2kR
            @Override // X.InterfaceC12870lZ
            public final void onAppBackgrounded() {
                int A03 = C0f9.A03(-178398247);
                C57502kP c57502kP = C57502kP.this;
                c57502kP.A02.ATO(new C38049Goc(c57502kP));
                C0f9.A0A(-363936399, A03);
            }

            @Override // X.InterfaceC12870lZ
            public final void onAppForegrounded() {
                int A03 = C0f9.A03(-1721048085);
                C57502kP c57502kP = C57502kP.this;
                c57502kP.A02.ATO(new C38051Goe(c57502kP));
                C0f9.A0A(1502512009, A03);
            }
        };
        this.A06 = interfaceC12870lZ;
        C218914p.A04(EnumC220415e.A02, interfaceC12870lZ, false, false);
    }

    public final synchronized void A00() {
        this.A02.ATO(new AbstractRunnableC14200nk() { // from class: X.3L7
            {
                super(407, 4, false, false);
            }

            @Override // java.lang.Runnable
            public final void run() {
                Context context = AbstractC12290kX.A00;
                C14360o3.A07(context);
                if (AbstractC15820qc.A0F(context)) {
                    Iterator it = new ArrayList(C57502kP.this.A04.values()).iterator();
                    while (it.hasNext()) {
                        ((AbstractC57542kT) it.next()).A0C();
                    }
                }
            }
        });
    }

    public final void A01(Context context) {
        C14360o3.A0B(context, 0);
        UserSession userSession = this.A01;
        C57532kS A00 = C57532kS.A00(userSession);
        InterfaceC14020nS interfaceC14020nS = this.A02;
        A00.A0D(context, interfaceC14020nS);
        C57582kX.A00(userSession).A0D(context, interfaceC14020nS);
        C57602kZ.A00(userSession).A0D(context, interfaceC14020nS);
        C57652ke.A00(userSession).A0D(context, interfaceC14020nS);
        C57682kh.A00(userSession).A0D(context, interfaceC14020nS);
        C57702kj.A00(userSession).A0D(context, interfaceC14020nS);
        C57722kl.A00(userSession).A0D(context, interfaceC14020nS);
        C57742kn.A00(userSession).A0D(context, interfaceC14020nS);
        C57502kP A002 = AbstractC57492kO.A00(userSession);
        AbstractC57542kT abstractC57542kT = (AbstractC57542kT) A002.A04.get(C57762kp.class);
        if (abstractC57542kT == null) {
            abstractC57542kT = new C57762kp(new C25301Lk(AbstractC12290kX.A00, new InterfaceC25281Li() { // from class: X.2kq
                @Override // X.InterfaceC25281Li
                public final /* bridge */ /* synthetic */ String EOt(Object obj) {
                    C4PI c4pi = (C4PI) obj;
                    StringWriter stringWriter = new StringWriter();
                    C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
                    A0A.A0d();
                    if (c4pi.A00 != null) {
                        C16V.A03(A0A, AbstractC111324zv.A00(2863));
                        for (C34465FHd c34465FHd : c4pi.A00) {
                            if (c34465FHd != null) {
                                A0A.A0d();
                                if (c34465FHd.A00 != null) {
                                    C16V.A03(A0A, "media_ids");
                                    for (String str : c34465FHd.A00) {
                                        if (str != null) {
                                            A0A.A0u(str);
                                        }
                                    }
                                    A0A.A0Z();
                                }
                                A0A.A0a();
                            }
                        }
                        A0A.A0Z();
                    }
                    A0A.A0a();
                    A0A.close();
                    return stringWriter.toString();
                }

                @Override // X.InterfaceC25281Li
                public final /* bridge */ /* synthetic */ Object E3T(String str) {
                    return AbstractC34312FBg.parseFromJson(C16V.A00(str));
                }
            }, 274028206), userSession);
            A002.A03(abstractC57542kT, C57762kp.class);
        }
        abstractC57542kT.A0D(context, interfaceC14020nS);
        C57782kr.A00(userSession).A0E(context, interfaceC14020nS, 3);
        AbstractC57812ku.A00(userSession).A0D(context, interfaceC14020nS);
        AbstractC57842kx.A00(userSession).A0D(context, interfaceC14020nS);
    }

    public final void A02(C1ON c1on) {
        this.A07.schedule(c1on, 434, 4, true, false);
    }

    public final void A03(AbstractC57542kT abstractC57542kT, Class cls) {
        Map map = this.A04;
        C14360o3.A06(map);
        map.put(cls, abstractC57542kT);
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        C15670qN.A00(this.A03);
        C218914p.A07(this.A06);
        this.A02.ATO(new C38049Goc(this));
    }
}
