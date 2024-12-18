package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.GFk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36689GFk implements InterfaceC169507hQ, InterfaceC169357h9 {
    public FPY A00;
    public C36686GFh A01;
    public C36687GFi A02;
    public C36690GFl A03;
    public Object A04;
    public String A06;
    public boolean A08;
    public boolean A09;
    public InterfaceC169507hQ A0A;
    public final C1GL A0B;
    public final C35035Fc8 A0C;
    public final InterfaceC169357h9 A0D;
    public final InterfaceC169357h9 A0E;
    public final InterfaceC169357h9 A0F;
    public final boolean A0G;
    public final UserSession A0H;
    public final FGP A0I;
    public final FGQ A0J;
    public final FNV A0K;
    public final Integer A0L;
    public final String A0M;
    public final String A0N;
    public final List A0O;
    public final boolean A0P;
    public HashMap A07 = AbstractC166987dD.A1G();
    public Object A05 = AbstractC166987dD.A1E();

    @Override // X.InterfaceC169517hR
    public final void DEw() {
    }

    @Override // X.InterfaceC169507hQ
    public final void DcI(InterfaceC169517hR interfaceC169517hR) {
        InterfaceC169357h9 interfaceC169357h9;
        String str;
        Object obj;
        Object obj2;
        C65911TwI c65911TwI;
        Comparable valueOf;
        String str2;
        C14360o3.A0B(interfaceC169517hR, 0);
        InterfaceC169357h9 interfaceC169357h92 = this.A0F;
        if (C14360o3.A0K(interfaceC169357h92.BjQ(), this.A06) && ((interfaceC169357h9 = this.A0E) == null || C14360o3.A0K(interfaceC169357h9.BjQ(), this.A06))) {
            C36687GFi c36687GFi = this.A02;
            Object obj3 = null;
            if ((c36687GFi == null || C14360o3.A0K(c36687GFi.A02, this.A06)) && (str = this.A06) != null && str.length() != 0) {
                Object Bov = interfaceC169357h92.Bov();
                if (interfaceC169357h9 != null) {
                    obj = interfaceC169357h9.Bov();
                } else {
                    obj = null;
                }
                if (c36687GFi != null) {
                    obj2 = c36687GFi.A01;
                } else {
                    obj2 = null;
                }
                C36686GFh c36686GFh = this.A01;
                if (c36686GFh != null) {
                    obj3 = c36686GFh.A01;
                }
                Object B3l = interfaceC169357h92.B3l();
                if (B3l != null) {
                    HashMap hashMap = this.A07;
                    C14360o3.A0C(B3l, MSV.A00(1453));
                    hashMap.putAll((HashMap) B3l);
                }
                if (obj != null) {
                    C35035Fc8 c35035Fc8 = this.A0C;
                    HashMap hashMap2 = this.A07;
                    List Bri = interfaceC169357h92.Bri();
                    List<InterfaceC37096GWf> list = (List) obj;
                    C14360o3.A0B(hashMap2, 0);
                    C14360o3.A0B(list, 1);
                    for (InterfaceC37096GWf interfaceC37096GWf : list) {
                        if (interfaceC37096GWf instanceof C36439G5o) {
                            valueOf = Integer.valueOf(((C36439G5o) interfaceC37096GWf).A00);
                            str2 = "message_content";
                        } else if (interfaceC37096GWf instanceof C36440G5p) {
                            C36440G5p c36440G5p = (C36440G5p) interfaceC37096GWf;
                            if (c36440G5p.A02) {
                                valueOf = c36440G5p.A00;
                                str2 = "reshared_content";
                            }
                        }
                        hashMap2.put(str2, valueOf);
                    }
                    DirectShareTarget directShareTarget = null;
                    if (c35035Fc8.A0J && (c65911TwI = c35035Fc8.A02) != null && c65911TwI.A00() != null) {
                        directShareTarget = c65911TwI.A00();
                        C14360o3.A0C(directShareTarget, "null cannot be cast to non-null type T of com.instagram.direct.search.provider.InteropProviderDelegateImpl");
                    }
                    c35035Fc8.A04 = directShareTarget;
                    if (directShareTarget != null) {
                        hashMap2.put("meta_ai_agent", directShareTarget);
                    }
                    if (Bri != null) {
                        hashMap2.put("section_order", Bri);
                    }
                    this.A07 = hashMap2;
                }
                C35035Fc8 c35035Fc82 = this.A0C;
                Object obj4 = this.A04;
                String str3 = this.A06;
                if (str3 == null) {
                    str3 = "";
                }
                this.A05 = c35035Fc82.A01(obj4, Bov, obj, obj2, obj3, str3);
                boolean CXh = interfaceC169357h92.CXh();
                String A00 = AbstractC111324zv.A00(12);
                if (CXh) {
                    C14360o3.A0C(interfaceC169357h92.Bov(), A00);
                    c35035Fc82.A02(2, 0, ((List) r0).size());
                }
                FPY fpy = this.A00;
                if (fpy != null) {
                    Object Bov2 = interfaceC169357h92.Bov();
                    C14360o3.A0C(Bov2, A00);
                    fpy.A00(true, ((List) Bov2).size());
                }
                A00(this);
            }
        }
        InterfaceC169357h9 interfaceC169357h93 = this.A0D;
        if (interfaceC169357h93 != null && (interfaceC169517hR instanceof C221249po) && ((AbstractC169347h8) interfaceC169517hR).A06) {
            this.A09 = false;
            HashMap hashMap3 = this.A07;
            Object Bov3 = interfaceC169357h93.Bov();
            C14360o3.A0B(hashMap3, 0);
            if (Bov3 != null) {
                hashMap3.put("ibc_chats_context_lines", Bov3);
            }
            this.A07 = hashMap3;
            A00(this);
        }
    }

    @Override // X.InterfaceC169517hR
    public final void ERL(List list) {
        InterfaceC169357h9 interfaceC169357h9;
        C14360o3.A0B(list, 0);
        if ((!list.isEmpty()) && !this.A09 && (interfaceC169357h9 = this.A0D) != null && !interfaceC169357h9.CXh()) {
            this.A09 = true;
            this.A0B.schedule(new G0E(2, this, list), 301436582, 2, false, false);
        }
    }

    public static final void A00(C36689GFk c36689GFk) {
        InterfaceC169507hQ interfaceC169507hQ = c36689GFk.A0A;
        if (interfaceC169507hQ != null) {
            interfaceC169507hQ.DcI(c36689GFk);
        }
    }

    @Override // X.InterfaceC169517hR
    public final String Bo9() {
        String Bo9;
        String str = this.A06;
        if (str == null || str.length() == 0 || (Bo9 = this.A0F.Bo9()) == null) {
            C35035Fc8 c35035Fc8 = this.A0C;
            if (str != null && str.length() != 0) {
                return c35035Fc8.A07;
            }
            return c35035Fc8.A06;
        }
        return Bo9;
    }

    @Override // X.InterfaceC169517hR
    public final boolean CUG() {
        InterfaceC169357h9 interfaceC169357h9;
        InterfaceC169357h9 interfaceC169357h92 = this.A0F;
        if (interfaceC169357h92.CUG()) {
            this.A0C.A02(2, 2, 0L);
            FPY fpy = this.A00;
            if (fpy != null) {
                fpy.A00(true, 0);
            }
        }
        if (!interfaceC169357h92.CUG() && ((interfaceC169357h9 = this.A0E) == null || !interfaceC169357h9.CUG())) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC169517hR
    public final boolean CXh() {
        InterfaceC169357h9 interfaceC169357h9 = this.A0F;
        String BjQ = interfaceC169357h9.BjQ();
        if (BjQ == null || BjQ.length() == 0) {
            return true;
        }
        return interfaceC169357h9.CXh();
    }

    @Override // X.InterfaceC169517hR
    public final void EKu() {
        this.A0F.EKu();
        InterfaceC169357h9 interfaceC169357h9 = this.A0E;
        if (interfaceC169357h9 != null) {
            interfaceC169357h9.EKu();
        }
    }

    @Override // X.InterfaceC169517hR
    public final void EYJ(InterfaceC169507hQ interfaceC169507hQ) {
        if (this.A0A != interfaceC169507hQ) {
            this.A0A = interfaceC169507hQ;
        }
    }

    @Override // X.InterfaceC169517hR
    public final void Eby(String str) {
        ArrayList A1E;
        this.A06 = str;
        C35035Fc8 c35035Fc8 = this.A0C;
        this.A05 = AbstractC166987dD.A1E();
        this.A08 = true;
        C36687GFi c36687GFi = this.A02;
        if (c36687GFi != null) {
            c36687GFi.A01 = AbstractC166987dD.A1E();
            InterfaceC169507hQ interfaceC169507hQ = c36687GFi.A00;
            if (interfaceC169507hQ != null) {
                interfaceC169507hQ.DcI(c36687GFi);
            }
        }
        C36686GFh c36686GFh = this.A01;
        if (c36686GFh != null) {
            c36686GFh.A01 = C16930sl.A00;
            InterfaceC169507hQ interfaceC169507hQ2 = c36686GFh.A00;
            if (interfaceC169507hQ2 != null) {
                interfaceC169507hQ2.DcI(c36686GFh);
            }
        }
        String str2 = this.A06;
        if (str2 != null && str2.length() != 0) {
            this.A0B.schedule(new G0D(this, str));
            return;
        }
        C36690GFl c36690GFl = this.A03;
        if (c36690GFl != null) {
            c36690GFl.Eby(str);
            this.A0F.Eby(str);
            c36690GFl.EYJ(this);
        } else {
            if (this.A0G) {
                this.A08 = true;
                this.A0B.schedule(new G0A(this, str), 301436582, 2, false, false);
                return;
            }
            if (!c35035Fc8.A09) {
                C5e4 c5e4 = c35035Fc8.A03;
                if (c5e4 == null) {
                    A1E = AbstractC166987dD.A1E();
                    this.A05 = A1E;
                    HashMap hashMap = this.A07;
                    c35035Fc8.A03(hashMap);
                    this.A07 = hashMap;
                    C14360o3.A0C(this.A05, AbstractC111324zv.A00(12));
                    c35035Fc8.A02(1, 0, ((List) r1).size());
                    this.A0F.Eby(str);
                } else {
                    C35035Fc8.A00(c5e4, c35035Fc8);
                }
            }
            A1E = AbstractC166987dD.A1E();
            List list = c35035Fc8.A08;
            if (list != null) {
                A1E.addAll(list);
            }
            this.A05 = A1E;
            HashMap hashMap2 = this.A07;
            c35035Fc8.A03(hashMap2);
            this.A07 = hashMap2;
            C14360o3.A0C(this.A05, AbstractC111324zv.A00(12));
            c35035Fc8.A02(1, 0, ((List) r1).size());
            this.A0F.Eby(str);
        }
        this.A08 = false;
        A00(this);
    }

    @Override // X.InterfaceC169517hR
    public final boolean isLoading() {
        InterfaceC169357h9 interfaceC169357h9;
        if (!this.A08 && !this.A0F.isLoading() && ((interfaceC169357h9 = this.A0E) == null || !interfaceC169357h9.isLoading())) {
            return false;
        }
        return true;
    }

    public C36689GFk(UserSession userSession, C1GL c1gl, C35035Fc8 c35035Fc8, FGP fgp, FGQ fgq, FNV fnv, InterfaceC169357h9 interfaceC169357h9, InterfaceC169357h9 interfaceC169357h92, InterfaceC169357h9 interfaceC169357h93, boolean z) {
        this.A0H = userSession;
        this.A0B = c1gl;
        this.A0F = interfaceC169357h9;
        this.A0E = interfaceC169357h92;
        this.A0D = interfaceC169357h93;
        this.A0C = c35035Fc8;
        this.A0K = fnv;
        this.A0J = fgq;
        this.A0I = fgp;
        this.A0G = z;
        this.A0N = interfaceC169357h9.Bk6();
        this.A0M = c35035Fc8.A05;
        this.A0O = interfaceC169357h9.Bri();
        this.A0P = interfaceC169357h9.BC6();
        this.A06 = interfaceC169357h9.BjQ();
        this.A0L = interfaceC169357h9.BmK();
        if (fnv != null) {
            this.A03 = new C36690GFl(fnv, new C47460Kxp(this));
        }
        if (fgq != null) {
            this.A02 = new C36687GFi(userSession, fgq);
        }
        if (fgp != null) {
            this.A01 = new C36686GFh(fgp);
        }
        if (C18U.A06(AbstractC25225BEi.A0j(userSession, 0), userSession, 36320382348894619L)) {
            this.A00 = C37058GUs.A00(userSession);
        }
    }

    @Override // X.InterfaceC169517hR
    public final String An8() {
        return this.A0M;
    }

    @Override // X.InterfaceC169517hR
    public final /* bridge */ /* synthetic */ Object B3l() {
        return this.A07;
    }

    @Override // X.InterfaceC169517hR
    public final boolean BC6() {
        return this.A0P;
    }

    @Override // X.InterfaceC169517hR
    public final String BjQ() {
        return this.A06;
    }

    @Override // X.InterfaceC169517hR
    public final String Bk6() {
        return this.A0N;
    }

    @Override // X.InterfaceC169357h9
    public final Integer BmK() {
        return this.A0L;
    }

    @Override // X.InterfaceC169517hR
    public final Object Bov() {
        return this.A05;
    }

    @Override // X.InterfaceC169357h9, X.InterfaceC169517hR
    public final List Bri() {
        return this.A0O;
    }

    @Override // X.InterfaceC169517hR
    public final boolean CZV() {
        return this.A09;
    }
}
