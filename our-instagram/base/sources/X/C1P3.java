package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1P3, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1P3 extends C1IB implements InterfaceC13050lr {
    public final Map A00;
    public final Map A01;
    public final EnumC23071Am A02;
    public final UserSession A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1P3(UserSession userSession) {
        super(userSession);
        C14360o3.A0B(userSession, 1);
        this.A03 = userSession;
        this.A01 = new HashMap();
        this.A00 = new HashMap();
        this.A02 = EnumC23071Am.A05;
    }

    public static final synchronized void A00(C1P3 c1p3, InterfaceC23511Cn interfaceC23511Cn, C1P1 c1p1, C1P1 c1p12, C1ON c1on, C1ON c1on2, String str, long j, boolean z, boolean z2) {
        synchronized (c1p3) {
            if (c1on2 != null) {
                if (c1p3.A03(str, j, z)) {
                    InterfaceC14020nS A00 = C14120nc.A00();
                    C14360o3.A07(A00);
                    new C98974cH(null, c1on2, A00).A00(new C37400Gdg(c1p3, interfaceC23511Cn, c1p12, c1p1, c1on, str, z2));
                    interfaceC23511Cn.EpC(c1on2);
                }
            }
            if (c1on != null && (!z2 || c1p3.A02())) {
                A01(c1p3, interfaceC23511Cn, c1p1, c1p12, c1on, str);
            }
        }
    }

    public static final synchronized void A01(final C1P3 c1p3, InterfaceC23511Cn interfaceC23511Cn, final C1P1 c1p1, final C1P1 c1p12, C1ON c1on, final String str) {
        synchronized (c1p3) {
            C1P1 c1p13 = new C1P1(c1p3) { // from class: X.4cG
                public final /* synthetic */ C1P3 A00;

                {
                    this.A00 = c1p3;
                }

                @Override // X.C1P1
                public final void onFail(AbstractC115105If abstractC115105If) {
                    int A03 = C0f9.A03(903785432);
                    C14360o3.A0B(abstractC115105If, 0);
                    C1P3 c1p32 = this.A00;
                    Map map = c1p32.A01;
                    String str2 = str;
                    map.remove(str2);
                    ((C1IB) c1p32).A02.remove(str2);
                    C1P1 c1p14 = c1p1;
                    if (c1p14 != null) {
                        c1p14.onFail(abstractC115105If);
                    }
                    C0f9.A0A(1601019593, A03);
                }

                @Override // X.C1P1
                public final void onFailInBackground(AbstractC115105If abstractC115105If) {
                    int A03 = C0f9.A03(1990619315);
                    C14360o3.A0B(abstractC115105If, 0);
                    C1P1 c1p14 = c1p1;
                    if (c1p14 != null) {
                        c1p14.onFailInBackground(abstractC115105If);
                    }
                    C0f9.A0A(673865053, A03);
                }

                @Override // X.C1P1
                public final void onFinish() {
                    int A03 = C0f9.A03(1523419461);
                    C1P1 c1p14 = c1p1;
                    if (c1p14 != null) {
                        c1p14.onFinish();
                    }
                    C0f9.A0A(1434457994, A03);
                }

                @Override // X.C1P1
                public final void onStart() {
                    int A03 = C0f9.A03(-1026455589);
                    C1P1 c1p14 = c1p1;
                    if (c1p14 != null) {
                        c1p14.onStart();
                    }
                    C0f9.A0A(1476725209, A03);
                }

                @Override // X.C1P1
                public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                    int A03 = C0f9.A03(575968929);
                    int A032 = C0f9.A03(1913159823);
                    C14360o3.A0B(obj, 0);
                    C1P3 c1p32 = this.A00;
                    Map map = c1p32.A01;
                    String str2 = str;
                    map.remove(str2);
                    ((C1IB) c1p32).A02.remove(str2);
                    C1P1 c1p14 = c1p1;
                    if (c1p14 != null) {
                        c1p14.onSuccess(obj);
                    }
                    C0f9.A0A(2085566934, A032);
                    C0f9.A0A(-789204179, A03);
                }

                @Override // X.C1P1
                public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
                    int A03 = C0f9.A03(-124195727);
                    int A032 = C0f9.A03(-567833014);
                    C14360o3.A0B(obj, 0);
                    C1P1 c1p14 = c1p1;
                    if (c1p14 != null) {
                        c1p14.onSuccessInBackground(obj);
                    }
                    C0f9.A0A(-1364065412, A032);
                    C0f9.A0A(799803739, A03);
                }
            };
            InterfaceC14020nS A00 = C14120nc.A00();
            C14360o3.A07(A00);
            C98974cH c98974cH = new C98974cH(c1p13, c1on, A00);
            c98974cH.A00(new C1P1(c1p3) { // from class: X.4cJ
                public final /* synthetic */ C1P3 A00;

                {
                    this.A00 = c1p3;
                }

                @Override // X.C1P1
                public final void onFail(AbstractC115105If abstractC115105If) {
                    int A03 = C0f9.A03(-879138043);
                    C14360o3.A0B(abstractC115105If, 0);
                    super.onFail(abstractC115105If);
                    C1P3 c1p32 = this.A00;
                    Map map = c1p32.A01;
                    String str2 = str;
                    map.remove(str2);
                    ((C1IB) c1p32).A02.remove(str2);
                    C1P1 c1p14 = c1p12;
                    if (c1p14 != null) {
                        c1p14.onFail(abstractC115105If);
                    }
                    C0f9.A0A(1447216247, A03);
                }

                @Override // X.C1P1
                public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                    int i;
                    int A03 = C0f9.A03(1762729053);
                    InterfaceC55612h1 interfaceC55612h1 = (InterfaceC55612h1) obj;
                    int A032 = C0f9.A03(-1634823466);
                    C14360o3.A0B(interfaceC55612h1, 0);
                    C1P1 c1p14 = c1p12;
                    if (c1p14 != null && !c1p14.isValidResponseData(interfaceC55612h1)) {
                        i = -992917130;
                    } else {
                        super.onSuccess(interfaceC55612h1);
                        long currentTimeMillis = System.currentTimeMillis();
                        C1P3 c1p32 = this.A00;
                        C1ID c1id = ((C1IB) c1p32).A00;
                        String str2 = str;
                        c1id.A02(str2, currentTimeMillis);
                        java.util.Set set = ((C1IB) c1p32).A02;
                        c1id.A03(str2, set.contains(str2));
                        C1ID.A00(c1id);
                        InterfaceC14020nS A002 = C14120nc.A00();
                        C14360o3.A07(A002);
                        c1p32.A00.put(str2, new C99074cU(interfaceC55612h1, A002, currentTimeMillis));
                        c1p32.A01.remove(str2);
                        set.remove(str2);
                        if (c1p14 != null) {
                            c1p14.onSuccess(interfaceC55612h1);
                        }
                        i = 498939249;
                    }
                    C0f9.A0A(i, A032);
                    C0f9.A0A(1993178070, A03);
                }

                @Override // X.C1P1
                public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
                    int A03 = C0f9.A03(-797268161);
                    int A032 = C0f9.A03(-1303132465);
                    C14360o3.A0B(obj, 0);
                    C1P1 c1p14 = c1p12;
                    if (c1p14 != null) {
                        c1p14.onSuccessInBackground(obj);
                    }
                    C0f9.A0A(838125897, A032);
                    C0f9.A0A(-1023860789, A03);
                }
            });
            c1p3.A01.put(str, c98974cH);
            interfaceC23511Cn.EpC(c98974cH);
        }
    }

    public final synchronized Integer A05(C1P1 c1p1, C1GL c1gl, String str, long j, boolean z, boolean z2) {
        C99074cU c99074cU;
        Integer num;
        C14360o3.A0B(str, 0);
        Object obj = this.A00.get(str);
        C98974cH c98974cH = null;
        if (obj instanceof C99074cU) {
            c99074cU = (C99074cU) obj;
        } else {
            c99074cU = null;
        }
        Object obj2 = this.A01.get(str);
        if (obj2 instanceof C98974cH) {
            c98974cH = (C98974cH) obj2;
        }
        num = C05F.A0C;
        if (c98974cH != null) {
            c1gl.schedule(new C99084cV(c1p1, c98974cH));
            num = C05F.A00;
            super.A02.add(str);
        } else if (c99074cU != null && A03(str, j, z)) {
            if (z2) {
                c1gl.schedule(new AnonymousClass560(c1p1, c99074cU));
            } else {
                c1p1.onStart();
                c99074cU.A02.ATO(new C37830Gkk(c1p1, c99074cU));
                c1p1.onFinish();
                c1p1.onSuccess(c99074cU.A01);
            }
            num = C05F.A01;
        }
        if (num == C05F.A01) {
            C1ID c1id = super.A00;
            c1id.A03(str, true);
            C1ID.A00(c1id);
        }
        return num;
    }

    public final synchronized Integer A06(String str, long j, boolean z) {
        Integer num;
        C14360o3.A0B(str, 0);
        if (A09(str)) {
            num = C05F.A00;
        } else if (((C99074cU) this.A00.get(str)) != null && A03(str, j, z)) {
            num = C05F.A01;
        } else {
            num = C05F.A0C;
        }
        return num;
    }

    public final synchronized Long A07(String str) {
        Long l;
        C99074cU c99074cU = (C99074cU) this.A00.get(str);
        if (c99074cU != null) {
            l = Long.valueOf(c99074cU.A00);
        } else {
            C1IH c1ih = (C1IH) super.A00.A00.get(str);
            if (c1ih != null) {
                l = Long.valueOf(c1ih.A00);
            } else {
                l = null;
            }
        }
        return l;
    }

    public final synchronized void A08(String str) {
        Map map = this.A01;
        C98974cH c98974cH = (C98974cH) map.get(str);
        if (c98974cH != null) {
            c98974cH.A07.cancel();
            map.remove(str);
            super.A02.remove(str);
        }
    }

    public final synchronized boolean A09(String str) {
        return this.A01.containsKey(str);
    }

    @Override // X.C1IB
    public final EnumC23071Am A04() {
        return this.A02;
    }

    @Override // X.InterfaceC13050lr
    public final void onUserSessionWillEnd(boolean z) {
        C11T.A02(new RunnableC43081J2w(this));
    }
}
