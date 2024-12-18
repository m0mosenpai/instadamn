package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.1Qv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C26661Qv extends AbstractC26671Qw implements InterfaceC13000lm {
    public static final C1R0 A04;
    public final AbstractC12990ll A00;
    public final InterfaceC19630xq A01;
    public final C102554jo A02;
    public final java.util.Set A03;

    public final void A07() {
        long j;
        try {
        } catch (Exception e) {
            C0w9.A06("IgZeroTokenManager", "Initialization", e);
        }
        synchronized (this) {
            try {
                if (A04() == C05F.A01) {
                    this.A08 = A04;
                    super.A01.A01++;
                    AbstractC26671Qw.A03(this, "token_stale", false);
                }
                C102624jw c102624jw = new C102624jw(this);
                final C102524jl c102524jl = this.A05;
                List list = c102524jl.A01;
                synchronized (list) {
                    try {
                        if (list.isEmpty()) {
                            BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: X.4jy
                                @Override // android.content.BroadcastReceiver
                                public final void onReceive(Context context, Intent intent) {
                                    InterfaceC102634jx[] interfaceC102634jxArr;
                                    String str;
                                    int A01 = C0f9.A01(1780001104);
                                    C0fM.A01(this, context, intent);
                                    List list2 = C102524jl.this.A01;
                                    synchronized (list2) {
                                        interfaceC102634jxArr = (InterfaceC102634jx[]) list2.toArray(new InterfaceC102634jx[list2.size()]);
                                    }
                                    for (InterfaceC102634jx interfaceC102634jx : interfaceC102634jxArr) {
                                        C26661Qv c26661Qv = ((C102624jw) interfaceC102634jx).A00;
                                        synchronized (c26661Qv) {
                                            try {
                                                Integer A042 = c26661Qv.A04();
                                                if (A042 != C05F.A00) {
                                                    int intValue = A042.intValue();
                                                    if (intValue != 0) {
                                                        if (intValue == 1) {
                                                            str = "token_stale";
                                                        } else {
                                                            str = "token_not_found";
                                                        }
                                                        c26661Qv.A08 = C26661Qv.A04;
                                                        ((AbstractC26671Qw) c26661Qv).A01.A01++;
                                                        AbstractC26671Qw.A03(c26661Qv, str, false);
                                                    } else {
                                                        throw new UnsupportedOperationException();
                                                        break;
                                                    }
                                                }
                                            } catch (Exception e2) {
                                                C0w9.A06("IgZeroTokenManager", "Connectivity event handler", e2);
                                            }
                                        }
                                    }
                                    C0f9.A0E(-78595573, A01, intent);
                                }
                            };
                            c102524jl.A00 = broadcastReceiver;
                            C0DJ.A00(broadcastReceiver, AbstractC12290kX.A00, C102524jl.A02);
                        }
                        list.add(c102624jw);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                super.A00 = c102624jw;
                synchronized (this) {
                    C1R0 c1r0 = this.A08;
                    long currentTimeMillis = System.currentTimeMillis() - c1r0.A03;
                    int i = c1r0.A02;
                    if (i == 0) {
                        j = 3600000;
                    } else {
                        j = i * 1000;
                    }
                    if (currentTimeMillis > j || currentTimeMillis < 0) {
                        AbstractC26671Qw.A03(this, "token_expired", false);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // X.InterfaceC13000lm
    public final synchronized void onSessionWillEnd() {
        BroadcastReceiver broadcastReceiver;
        Object obj = super.A03;
        if (obj != null) {
            this.A05.A00(obj);
        }
        C5J3 c5j3 = super.A02;
        if (c5j3 != null) {
            c5j3.A01(new C26701Qz());
            c5j3.A06 = null;
        }
        InterfaceC102634jx interfaceC102634jx = super.A00;
        if (interfaceC102634jx != null) {
            C102524jl c102524jl = this.A05;
            List list = c102524jl.A01;
            synchronized (list) {
                list.remove(interfaceC102634jx);
                if (list.isEmpty() && (broadcastReceiver = c102524jl.A00) != null) {
                    AbstractC12290kX.A00.unregisterReceiver(broadcastReceiver);
                    c102524jl.A00 = null;
                }
            }
            super.A00 = null;
        }
        this.A03.clear();
    }

    static {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(new C26691Qy("^(https?:\\/\\/)(i)(\\.instagram\\.com/.*)$", "$1b.$2$3"));
        } catch (C90143zv unused) {
        }
        A04 = new C1R0(new C26701Qz(), "", "", "", null, "", arrayList, Collections.emptyList(), Collections.emptySet(), Collections.emptySet(), 0, 0, 0, 0L);
    }

    public static synchronized InterfaceC26681Qx A00(AbstractC12990ll abstractC12990ll) {
        C1R1 c1r1;
        synchronized (C26661Qv.class) {
            try {
                if (C18U.A01(C06090Tz.A05, abstractC12990ll, 36594079139628614L) == 0) {
                    synchronized (C1R1.class) {
                        c1r1 = C1R1.A01;
                        if (c1r1 == null) {
                            c1r1 = new C1R1();
                            C1R1.A01 = c1r1;
                        }
                    }
                    return c1r1;
                }
            } catch (Exception unused) {
            }
            C26661Qv c26661Qv = (C26661Qv) abstractC12990ll.A00(C26661Qv.class);
            if (c26661Qv == null) {
                c26661Qv = new C26661Qv(abstractC12990ll, C102524jl.A03);
                c26661Qv.A07();
                abstractC12990ll.A04(C26661Qv.class, c26661Qv);
            }
            return c26661Qv;
        }
    }

    @Override // X.AbstractC26671Qw
    public final void A06() {
        InterfaceC19610xo ARD = this.A01.ARD();
        ARD.AHW();
        ARD.apply();
    }

    @Override // X.InterfaceC26681Qx
    public final void AAd(InterfaceC43641zu interfaceC43641zu) {
        this.A03.add(interfaceC43641zu);
    }

    @Override // X.InterfaceC26681Qx
    public final String BV1() {
        return this.A02.A04;
    }

    @Override // X.InterfaceC26681Qx
    public final void EGT(InterfaceC43641zu interfaceC43641zu) {
        this.A03.remove(interfaceC43641zu);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0JO, java.lang.Object] */
    public C26661Qv(AbstractC12990ll abstractC12990ll, C102524jl c102524jl) {
        super(c102524jl);
        InterfaceC19630xq A01;
        this.A03 = Collections.synchronizedSet(new HashSet());
        this.A02 = new C102554jo(abstractC12990ll);
        this.A00 = abstractC12990ll;
        if (abstractC12990ll instanceof UserSession) {
            A01 = C1AT.A01((UserSession) abstractC12990ll).A03(C1AV.A3e);
        } else {
            A01 = AbstractC19750y3.A01("PrefZeroRatingFilename");
        }
        this.A01 = A01;
        if (!AbstractC102564jp.A00(abstractC12990ll).A00()) {
            super.A02 = new C5J3(new Object(), abstractC12990ll, c102524jl, this);
        }
    }
}
