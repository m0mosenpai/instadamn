package X;

import android.content.Context;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

/* renamed from: X.7UD, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7UD extends C7VK {
    public final C161907Na A00;
    public final C7UB A01;
    public final C7F3 A02;
    public final C161967Ng A03;
    public final InterfaceC16820sZ A04;
    public final C05A A05;
    public final C0UO A06;
    public final InterfaceC41501vz A07;
    public final InterfaceC41501vz A08;
    public final UserSession A09;
    public final C162017Nl A0A;
    public final InterfaceC09390do A0B;

    public C7UD(Context context, UserSession userSession, C7UB c7ub, InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(context, 1);
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(c7ub, 3);
        C14360o3.A0B(interfaceC16820sZ, 4);
        this.A09 = userSession;
        this.A01 = c7ub;
        this.A04 = interfaceC16820sZ;
        C008002u c008002u = new C008002u(new C9BR(C05F.A00, 1, false));
        this.A05 = c008002u;
        this.A06 = c008002u;
        this.A00 = new C161907Na(new C7NX(context, userSession, C18U.A01(C06090Tz.A05, userSession, 36600843714629655L)));
        this.A03 = new C161967Ng(userSession, c7ub);
        this.A02 = new C7F3(userSession);
        this.A0B = AbstractC09440dt.A01(C161987Ni.A00);
        this.A07 = new InterfaceC41501vz() { // from class: X.7Nj
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                EnumC161927Nc enumC161927Nc;
                int A03 = C0f9.A03(-1112797440);
                C162027Nm c162027Nm = (C162027Nm) obj;
                int A032 = C0f9.A03(1791750378);
                C14360o3.A0B(c162027Nm, 0);
                C161907Na c161907Na = C7UD.this.A00;
                int intValue = c162027Nm.A00.intValue();
                if (intValue != 0) {
                    if (intValue != 1) {
                        enumC161927Nc = EnumC161927Nc.A05;
                    } else {
                        enumC161927Nc = EnumC161927Nc.A07;
                    }
                } else {
                    enumC161927Nc = EnumC161927Nc.A06;
                }
                c161907Na.A01(enumC161927Nc);
                C0f9.A0A(-710392555, A032);
                C0f9.A0A(1502231497, A03);
            }
        };
        this.A08 = new InterfaceC41501vz() { // from class: X.7Nk
            /* JADX WARN: Code restructure failed: missing block: B:63:0x00ba, code lost:
            
                if (r3 != null) goto L28;
             */
            /* JADX WARN: Code restructure failed: missing block: B:65:0x00b6, code lost:
            
                if (r3 != null) goto L25;
             */
            /* JADX WARN: Removed duplicated region for block: B:36:0x0093 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:52:0x007b A[SYNTHETIC] */
            @Override // X.InterfaceC41501vz
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final /* bridge */ /* synthetic */ void onEvent(java.lang.Object r13) {
                /*
                    r12 = this;
                    r0 = 262072933(0xf9eea65, float:1.5670288E-29)
                    int r6 = X.C0f9.A03(r0)
                    X.2Io r13 = (X.C2Io) r13
                    r0 = 1755186112(0x689e03c0, float:5.9696246E24)
                    int r5 = X.C0f9.A03(r0)
                    r0 = 0
                    X.C14360o3.A0B(r13, r0)
                    X.7UD r4 = X.C7UD.this
                    java.util.List r0 = r13.A02
                    r11 = 0
                    if (r0 == 0) goto Lc1
                    java.util.ArrayList r3 = new java.util.ArrayList
                    r3.<init>()
                    java.util.Iterator r2 = r0.iterator()
                L24:
                    boolean r0 = r2.hasNext()
                    if (r0 == 0) goto L39
                    java.lang.Object r1 = r2.next()
                    r0 = r1
                    X.3nh r0 = (X.C83403nh) r0
                    X.7BW r0 = r0.A0Q
                    if (r0 == 0) goto L24
                    r3.add(r1)
                    goto L24
                L39:
                    boolean r0 = r3.isEmpty()
                    if (r0 != 0) goto Lc1
                    java.util.Iterator r10 = r3.iterator()
                L43:
                    boolean r0 = r10.hasNext()
                    if (r0 == 0) goto Lc1
                    java.lang.Object r0 = r10.next()
                    X.3nh r0 = (X.C83403nh) r0
                    X.7BW r3 = r0.A0Q
                    if (r3 == 0) goto Lbf
                    java.lang.Integer r2 = r3.A02
                L55:
                    java.lang.Integer r0 = X.C05F.A01
                    r1 = 0
                    if (r2 != r0) goto L5b
                    r1 = 1
                L5b:
                    if (r3 == 0) goto Lb5
                    X.Mtb r0 = r3.A00
                    if (r0 == 0) goto Lb5
                    int r0 = r0.A01
                    java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
                L67:
                    X.Mtb r0 = r3.A00
                    if (r0 == 0) goto Lb9
                    int r0 = r0.A00
                    java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
                L71:
                    X.Mtb r0 = r3.A00
                    if (r0 == 0) goto Lbd
                    java.lang.Object r7 = r0.A02
                    java.lang.Integer r7 = (java.lang.Integer) r7
                L79:
                    if (r1 == 0) goto L93
                    if (r9 == 0) goto L43
                    if (r8 == 0) goto L43
                    X.7Na r0 = r4.A00
                    int r3 = r9.intValue()
                    int r2 = r8.intValue()
                    X.7Nc r1 = X.EnumC161927Nc.A03
                    r0.A01 = r1
                    X.7Nb r0 = r0.A05
                    r0.A04(r1, r7, r3, r2)
                    goto L43
                L93:
                    X.7Na r1 = r4.A00
                    boolean r0 = r1.A03
                    if (r0 == 0) goto L43
                    X.7Nc r3 = X.EnumC161927Nc.A04
                    r1.A01 = r3
                    if (r9 == 0) goto Laf
                    if (r8 == 0) goto Laf
                    X.7Nb r2 = r1.A05
                    int r1 = r9.intValue()
                    int r0 = r8.intValue()
                    r2.A04(r3, r7, r1, r0)
                    goto L43
                Laf:
                    X.7Nb r0 = r1.A05
                    r0.A03(r3)
                    goto L43
                Lb5:
                    r9 = r11
                    if (r3 == 0) goto Lb9
                    goto L67
                Lb9:
                    r8 = r11
                    if (r3 == 0) goto Lbd
                    goto L71
                Lbd:
                    r7 = r11
                    goto L79
                Lbf:
                    r2 = r11
                    goto L55
                Lc1:
                    r0 = 792345139(0x2f3a3a33, float:1.6937278E-10)
                    X.C0f9.A0A(r0, r5)
                    r0 = -1652635859(0xffffffff9d7ec72d, float:-3.3719592E-21)
                    X.C0f9.A0A(r0, r6)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C162007Nk.onEvent(java.lang.Object):void");
            }
        };
        this.A0A = new C162017Nl(this);
    }

    public final String A00() {
        Object value = this.A0B.getValue();
        C14360o3.A07(value);
        return (String) value;
    }

    @Override // X.AbstractC52922bZ
    public final void onCleared() {
        C161907Na c161907Na = this.A00;
        ViewGroup viewGroup = c161907Na.A00;
        if (viewGroup != null) {
            c161907Na.A00(viewGroup);
        }
        if (c161907Na.A04) {
            c161907Na.A06.A01();
        }
        C161917Nb c161917Nb = c161907Na.A05;
        c161917Nb.A01 = null;
        c161917Nb.A00 = new C206289Bl(null, null, null, null, 63);
        c161907Na.A04 = false;
        c161907Na.A00 = null;
        c161907Na.A03 = false;
        C05A c05a = this.A05;
        C9BR c9br = (C9BR) c05a.getValue();
        Integer num = C05F.A00;
        boolean z = c9br.A02;
        C14360o3.A0B(num, 0);
        c05a.Egh(new C9BR(num, 1, z));
    }

    @Override // X.C7VK, X.InterfaceC65626Tpm
    public final void onPause(C07X c07x) {
        C161907Na c161907Na = this.A00;
        if (c161907Na.A04) {
            c161907Na.A06.A00();
        }
        C162017Nl c162017Nl = this.A0A;
        C14360o3.A0B(c162017Nl, 0);
        c161907Na.A05.A06.remove(c162017Nl);
        C05A c05a = this.A05;
        Integer num = (Integer) ((C9BR) c05a.getValue()).A01;
        C14360o3.A0B(num, 0);
        c05a.Egh(new C9BR(num, 1, true));
        C25671My A00 = AbstractC25651Mw.A00(this.A09);
        A00.A02(this.A07, C162027Nm.class);
        A00.A02(this.A08, C2Io.class);
    }

    @Override // X.C7VK, X.InterfaceC65626Tpm
    public final void onResume(C07X c07x) {
        C70167WEj c70167WEj;
        C161907Na c161907Na = this.A00;
        C162017Nl c162017Nl = this.A0A;
        C14360o3.A0B(c162017Nl, 0);
        c161907Na.A05.A06.add(c162017Nl);
        if (c161907Na.A04 && (c70167WEj = c161907Na.A06.A01) != null) {
            c70167WEj.A0D[c70167WEj.A00 % 2].A00();
        }
        C05A c05a = this.A05;
        Integer num = (Integer) ((C9BR) c05a.getValue()).A01;
        C14360o3.A0B(num, 0);
        c05a.Egh(new C9BR(num, 1, false));
        C25671My A00 = AbstractC25651Mw.A00(this.A09);
        A00.A01(this.A07, C162027Nm.class);
        A00.A01(this.A08, C2Io.class);
    }
}
