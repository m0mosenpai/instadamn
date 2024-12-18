package X;

import com.instagram.common.session.UserSession;
import java.io.StringWriter;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.4nE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C104484nE implements InterfaceC12870lZ, InterfaceC13000lm {
    public final C25301Lk A00;
    public final UserSession A01;
    public final InterfaceC14020nS A02;
    public final Map A03;
    public final C19L A04;
    public final boolean A05;

    public /* synthetic */ C104484nE(final UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36312917695530539L)) {
            linkedHashMap.put(EnumC104494nF.A02, new C104524nI(userSession, EnumC104514nH.A07, new AbstractC104504nG(userSession) { // from class: X.9QB
                public final int A00;
                public final int A01;
                public final int A02;
                public final UserSession A03;

                @Override // X.AbstractC104504nG
                public final int A00() {
                    return this.A00;
                }

                @Override // X.AbstractC104504nG
                public final int A01() {
                    long j;
                    boolean z = C23051Ak.A05;
                    UserSession userSession2 = this.A03;
                    boolean A00 = C23061Al.A00(userSession2).A00(EnumC23071Am.A0C);
                    C06090Tz c06090Tz2 = C06090Tz.A06;
                    if (A00) {
                        j = 36594392672569039L;
                    } else {
                        j = 36594392672503502L;
                    }
                    return (int) C18U.A01(c06090Tz2, userSession2, j);
                }

                @Override // X.AbstractC104504nG
                public final int A02() {
                    return 18;
                }

                @Override // X.AbstractC104504nG
                public final int A03() {
                    return this.A01;
                }

                @Override // X.AbstractC104504nG
                public final int A04() {
                    return this.A02;
                }

                {
                    this.A03 = userSession;
                    C06090Tz c06090Tz2 = C06090Tz.A06;
                    this.A02 = (int) C18U.A01(c06090Tz2, userSession, 36594392672437965L);
                    this.A01 = (int) C18U.A01(c06090Tz2, userSession, 36594392672372428L);
                    this.A00 = (int) C18U.A01(c06090Tz2, userSession, 36594392672634576L);
                }
            }, 12, 18));
        }
        if (C18U.A06(c06090Tz, userSession, 36319248477330538L)) {
            linkedHashMap.put(EnumC104494nF.A03, new C104524nI(userSession, EnumC104514nH.A08, new C104554nL(userSession), 4, 4));
        }
        C0o0 A00 = AbstractC14350nz.A00();
        A00.A01 = "PersonalizationControl";
        C18240vB c18240vB = new C18240vB(A00);
        C25301Lk c25301Lk = new C25301Lk(userSession.deviceSession.A06(), new InterfaceC25281Li() { // from class: X.4nM
            @Override // X.InterfaceC25281Li
            public final /* bridge */ /* synthetic */ Object E3T(String str) {
                C14360o3.A0B(str, 0);
                A6F parseFromJson = C9QF.parseFromJson(C16V.A00(str));
                C14360o3.A07(parseFromJson);
                return parseFromJson;
            }

            @Override // X.InterfaceC25281Li
            public final /* bridge */ /* synthetic */ String EOt(Object obj) {
                A6F a6f = (A6F) obj;
                C14360o3.A0B(a6f, 0);
                StringWriter stringWriter = new StringWriter();
                C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
                A0A.A0d();
                if (a6f.A00 != null) {
                    C16V.A03(A0A, AbstractC111324zv.A00(5375));
                    for (C22885A7f c22885A7f : a6f.A00) {
                        if (c22885A7f != null) {
                            A0A.A0d();
                            String str = c22885A7f.A01;
                            if (str != null) {
                                A0A.A0S("key", str);
                            }
                            String str2 = c22885A7f.A00;
                            if (str2 != null) {
                                A0A.A0S("data", str2);
                            }
                            A0A.A0a();
                        }
                    }
                    A0A.A0Z();
                }
                A0A.A0a();
                A0A.close();
                String obj2 = stringWriter.toString();
                C14360o3.A07(obj2);
                return obj2;
            }
        }, 1640735657);
        C19K A02 = AnonymousClass194.A02(new C12M(c18240vB).AOT(251381144, 3));
        boolean z = C18U.A06(c06090Tz, userSession, 36312917695596076L) || C18U.A06(c06090Tz, userSession, 36319248477330538L);
        C14360o3.A0B(A02, 5);
        this.A01 = userSession;
        this.A03 = linkedHashMap;
        this.A02 = c18240vB;
        this.A00 = c25301Lk;
        this.A04 = A02;
        this.A05 = z;
        if (z) {
            C218914p.A04(EnumC220415e.A02, this, false, false);
            if (this.A05) {
                C19L c19l = this.A04;
                AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, new C206629Ct(this, null, 40), c19l);
            }
        }
    }

    public final InterfaceC104464nC A00(EnumC104494nF enumC104494nF) {
        if (this.A05) {
            Map map = this.A03;
            if (map.containsKey(enumC104494nF)) {
                Object obj = map.get(enumC104494nF);
                C14360o3.A0C(obj, "null cannot be cast to non-null type T of com.instagram.signal.IgSignalManager.getDecisionMaker");
                return (InterfaceC104464nC) obj;
            }
            throw new IllegalStateException(AnonymousClass001.A0R("cannot get surface signal for ", enumC104494nF.name()));
        }
        throw new IllegalStateException("IgSignalManager is not enabled");
    }

    public final void A01(C104744ne c104744ne) {
        if (this.A05) {
            C19L c19l = this.A04;
            C9D1 c9d1 = new C9D1(c104744ne, this, null, 4);
            AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c9d1, c19l);
        }
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        int A03 = C0f9.A03(988533240);
        if (this.A05) {
            C19L c19l = this.A04;
            C206629Ct c206629Ct = new C206629Ct(this, null, 41);
            AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c206629Ct, c19l);
        }
        C0f9.A0A(749110750, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        C0f9.A0A(1331415526, C0f9.A03(-109057298));
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        C218914p.A07(this);
    }
}
