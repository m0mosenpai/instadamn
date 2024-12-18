package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.GeR, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37447GeR implements InterfaceC669530m {
    public int A00;
    public int A01;
    public C1ON A02;
    public InterfaceC669830p A03;
    public InterfaceC670130s A04;
    public Integer A05;
    public java.util.Set A06;
    public boolean A07;
    public int A08;
    public boolean A09;
    public final int A0A;
    public final Context A0B;
    public final UserSession A0C;
    public final AnonymousClass318 A0D;
    public final C26191Pa A0E;
    public final InterfaceC671231d A0F;
    public final C31E A0G;
    public final C1PY A0H;
    public final InterfaceC101974iC A0I;
    public final InterfaceC61432r6 A0J;
    public final C37473Ger A0K;
    public final AbstractC39675Hj7 A0L;
    public final String A0M;
    public final InterfaceC16590sC A0N;

    @Override // X.InterfaceC669530m
    public final boolean A7S(AnonymousClass320 anonymousClass320, InterfaceC669830p interfaceC669830p, InterfaceC670130s interfaceC670130s) {
        boolean A1b = AbstractC25233BEq.A1b(interfaceC670130s, interfaceC669830p, anonymousClass320);
        this.A09 = A1b;
        this.A04 = interfaceC670130s;
        this.A03 = interfaceC669830p;
        C1PY c1py = this.A0H;
        InterfaceC101974iC interfaceC101974iC = this.A0I;
        if (interfaceC101974iC != null) {
            List list = c1py.A00;
            if (!list.contains(interfaceC101974iC)) {
                list.add(interfaceC101974iC);
            }
        }
        C26191Pa c26191Pa = this.A0E;
        c26191Pa.A04 = false;
        c26191Pa.A06 = A1b;
        if (!c26191Pa.A02(new C37476Geu(4, this.A0K, A1b), null, null)) {
            A00(anonymousClass320.A03, anonymousClass320.A01);
        }
        return A1b;
    }

    @Override // X.InterfaceC669630n
    public final /* synthetic */ void CKM(C206209Bd c206209Bd, List list) {
    }

    @Override // X.InterfaceC669530m
    public final void Co5() {
    }

    @Override // X.InterfaceC669530m
    public final void CoL(AnonymousClass320 anonymousClass320, EnumC37671p4 enumC37671p4, boolean z) {
    }

    @Override // X.InterfaceC669530m
    public final void CoN(int i) {
    }

    @Override // X.InterfaceC669530m
    public final void Dtv(int i) {
    }

    @Override // X.InterfaceC669530m
    public final void deactivate() {
        this.A09 = false;
        C1PY c1py = this.A0H;
        c1py.A00.remove(this.A0I);
        C1ON c1on = this.A02;
        if (c1on != null) {
            c1on.cancel();
        }
        this.A02 = null;
        C26191Pa c26191Pa = this.A0E;
        c26191Pa.A04 = false;
        c26191Pa.A06 = false;
    }

    public /* synthetic */ C37447GeR(Context context, UserSession userSession, AnonymousClass318 anonymousClass318, C26191Pa c26191Pa, InterfaceC671231d interfaceC671231d, C31E c31e, C1PY c1py, InterfaceC61432r6 interfaceC61432r6, AbstractC39675Hj7 abstractC39675Hj7, String str, int i) {
        String str2;
        J7J j7j = new J7J(C1GJ.A00, 4);
        this.A0C = userSession;
        this.A0B = context;
        this.A0A = i;
        this.A0M = str;
        this.A0F = interfaceC671231d;
        this.A0H = c1py;
        this.A0G = c31e;
        this.A0D = anonymousClass318;
        this.A0N = j7j;
        this.A0L = abstractC39675Hj7;
        this.A0J = interfaceC61432r6;
        this.A0E = c26191Pa;
        this.A03 = new C669730o();
        this.A05 = C05F.A00;
        this.A00 = i;
        this.A07 = true;
        this.A0I = new C37482Gf0(this, 1);
        C37477Gev c37477Gev = new C37477Gev(this, 2);
        if (abstractC39675Hj7 instanceof C39491HcJ) {
            str2 = ((C39491HcJ) abstractC39675Hj7).A01;
        } else {
            str2 = null;
        }
        this.A0K = new C37473Ger(c37477Gev, userSession, str, str2, abstractC39675Hj7 instanceof C39490HcI ? ((C39490HcI) abstractC39675Hj7).A02 : null, i, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A00(java.util.List r29, int r30) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37447GeR.A00(java.util.List, int):void");
    }

    public static final boolean A01(C37447GeR c37447GeR, int i) {
        if (c37447GeR.A09) {
            int i2 = c37447GeR.A01;
            C37473Ger c37473Ger = c37447GeR.A0K;
            if (i2 <= c37473Ger.A00 && i >= c37473Ger.A01 && c37447GeR.A05 == C05F.A00) {
                if (!C18U.A06(C06090Tz.A05, c37447GeR.A0C, 36315808211275348L) || c37473Ger.A01 != -1) {
                    c37447GeR.A00(c37447GeR.A0F.BZa(), i);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // X.InterfaceC669530m
    public final /* synthetic */ boolean AFs() {
        return false;
    }

    @Override // X.InterfaceC669530m
    public final /* synthetic */ C51G AND() {
        return new C43000Izq();
    }

    @Override // X.InterfaceC669630n
    public final /* synthetic */ String B5L() {
        return "";
    }

    @Override // X.InterfaceC669530m
    public final int BX5() {
        return 0;
    }

    @Override // X.InterfaceC669530m
    public final int Bg5() {
        return this.A08;
    }

    @Override // X.InterfaceC669530m
    public final boolean CUl() {
        return AbstractC25229BEm.A1a(this.A05, C05F.A00);
    }

    @Override // X.InterfaceC669530m
    public final void Cnx(boolean z) {
        H9Z h9z;
        if (C18U.A06(C06090Tz.A05, this.A0C, 36315808211275348L) && (this.A0L instanceof C39491HcJ) && (h9z = this.A0K.A03) != null) {
            this.A0E.A00(h9z);
        }
    }

    @Override // X.InterfaceC669530m
    public final boolean D7a(int i, int i2) {
        this.A00 = i;
        return A01(this, i);
    }

    @Override // X.InterfaceC669630n
    public final /* synthetic */ java.util.Set Bts() {
        return AbstractC166987dD.A1H();
    }

    @Override // X.InterfaceC669530m
    public final /* synthetic */ void CoM(C9C3 c9c3, AnonymousClass320 anonymousClass320, EnumC37671p4 enumC37671p4, String str, String str2, double d, boolean z) {
        AbstractC167017dG.A1Q(anonymousClass320, enumC37671p4);
    }
}
