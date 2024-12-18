package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Mj7, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51164Mj7 extends C2UU {
    public InterfaceC58200Pr6 A00;
    public List A01;
    public boolean A02;
    public final Context A03;
    public final int A06;
    public final UserSession A07;
    public final InterfaceC16820sZ A08;
    public final InterfaceC16820sZ A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final InterfaceC09390do A05 = C57521Pfv.A00(this, 19);
    public final Runnable A04 = new PM3(this);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C2UU
    public final void onBindViewHolder(C3OO c3oo, int i) {
        C52422NHs A00;
        View A06;
        int i2;
        C14360o3.A0B(c3oo, 0);
        if (c3oo instanceof C51274Mkx) {
            O7N o7n = (O7N) this.A01.get(i);
            if (o7n instanceof C52420NHq) {
                A06 = AbstractC31171DnF.A06(c3oo);
                i2 = ((C52420NHq) o7n).A00;
            } else {
                if (!(o7n instanceof C52419NHp)) {
                    return;
                }
                A06 = AbstractC31171DnF.A06(c3oo);
                i2 = ((C52419NHp) o7n).A00;
            }
            AbstractC13880nE.A0g(A06, i2);
            return;
        }
        if (!(c3oo instanceof InterfaceC58035PoL) || (A00 = A00(i)) == null) {
            return;
        }
        InterfaceC58035PoL interfaceC58035PoL = (InterfaceC58035PoL) c3oo;
        C51832Mva c51832Mva = A00.A04;
        interfaceC58035PoL.FD3(c51832Mva);
        if (c51832Mva.A0A == C05F.A0Y) {
            if (!this.A02) {
                MSW.A09(this.A05).post(this.A04);
                this.A02 = true;
            }
        } else {
            MSW.A09(this.A05).removeCallbacks(this.A04);
            this.A02 = false;
        }
        C51676Ms7 c51676Ms7 = c51832Mva.A08;
        if (c51676Ms7 == null) {
            return;
        }
        interfaceC58035PoL.FCe(c51676Ms7.A00);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    @Override // X.C2UU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C3OO onCreateViewHolder(android.view.ViewGroup r13, int r14) {
        /*
            r12 = this;
            r5 = 0
            X.C14360o3.A0B(r13, r5)
            if (r14 == 0) goto L1c
            r0 = 1
            if (r14 == r0) goto L19
            r0 = 2
            if (r14 == r0) goto L1f
            r0 = 3
            if (r14 == r0) goto L19
            r0 = 4
            if (r14 == r0) goto L1c
            java.lang.String r0 = "Not valid index: "
            java.lang.IllegalArgumentException r0 = X.AbstractC25230BEn.A0n(r0, r14)
            throw r0
        L19:
            java.lang.Integer r4 = X.C05F.A00
            goto L21
        L1c:
            java.lang.Integer r4 = X.C05F.A0C
            goto L21
        L1f:
            java.lang.Integer r4 = X.C05F.A01
        L21:
            int r1 = r4.intValue()
            r0 = 1
            if (r1 != r0) goto L5a
            boolean r1 = r12.A0D
            int r0 = X.C3OO.FLAG_ADAPTER_FULLUPDATE
            android.content.Context r5 = X.AbstractC166997dE.A0L(r13)
            if (r1 == 0) goto L48
            boolean r4 = r12.A0C
            boolean r3 = r12.A0A
            boolean r2 = r12.A0B
            r0 = 2
            X.MWv r1 = new X.MWv
            r1.<init>(r4, r3, r2, r0)
            X.Pr6 r0 = r12.A00
            X.NIE r4 = new X.NIE
            r4.<init>(r5, r1, r0)
        L45:
            X.3OO r4 = (X.C3OO) r4
            return r4
        L48:
            com.instagram.common.session.UserSession r6 = r12.A07
            boolean r8 = r12.A0C
            boolean r9 = r12.A0A
            boolean r10 = r12.A0B
            boolean r11 = r12.A0E
            X.Pr6 r7 = r12.A00
            X.NIF r4 = new X.NIF
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            goto L45
        L5a:
            int r0 = X.C3OO.FLAG_ADAPTER_FULLUPDATE
            android.content.Context r3 = r13.getContext()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r3)
            r0 = 2131627382(0x7f0e0d76, float:1.8882027E38)
            r2 = 0
            android.view.View r1 = X.AbstractC25226BEj.A0R(r1, r13, r0, r5)
            java.lang.Integer r0 = X.C05F.A0C
            if (r4 != r0) goto L74
            int r0 = r12.A06
            int r2 = r0 / 2
        L74:
            X.0sZ r0 = r12.A08
            X.Mkx r4 = new X.Mkx
            r4.<init>(r1, r0, r2)
            boolean r0 = r12.A0E
            if (r0 == 0) goto L93
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131165305(0x7f070079, float:1.7944823E38)
            float r0 = r1.getDimension(r0)
            int r1 = (int) r0
        L8b:
            android.view.View r0 = X.AbstractC31171DnF.A06(r4)
            X.AbstractC13880nE.A0W(r0, r1)
            return r4
        L93:
            int r1 = X.AbstractC50522MSa.A06(r3)
            goto L8b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51164Mj7.onCreateViewHolder(android.view.ViewGroup, int):X.3OO");
    }

    public final C52422NHs A00(int i) {
        Object A0O = AbstractC001800i.A0O(this.A01, i);
        if (A0O instanceof C52422NHs) {
            return (C52422NHs) A0O;
        }
        return null;
    }

    public final void A01(int i, int i2, int i3) {
        int i4 = (i * 2) + 2;
        C52422NHs A00 = A00(i4);
        if (i4 < this.A01.size() && A00 != null) {
            this.A01.set(i4, new C52422NHs(A00.A04.A02(i2, i3, i2, i3), A00.A00, A00.A01, A00.A02, A00.A03));
        }
    }

    public final void A02(List list, boolean z) {
        List list2 = this.A01;
        this.A01 = AbstractC166987dD.A1F(list);
        if (!AbstractC25231BEo.A1b(this.A09)) {
            AbstractC66552zX.A00(new C51088Mhn(list2, this.A01, z)).A03(this);
        } else {
            MSW.A09(this.A05).post(new PSQ(this, list2, z));
        }
    }

    public C51164Mj7(Context context, UserSession userSession, List list, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A03 = context;
        this.A07 = userSession;
        this.A01 = list;
        this.A09 = interfaceC16820sZ;
        this.A0C = z;
        this.A0A = z2;
        this.A0B = z3;
        this.A0E = z4;
        this.A0D = z5;
        this.A06 = i;
        this.A08 = interfaceC16820sZ2;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(-1523185975);
        int size = this.A01.size();
        C0f9.A0A(-1106776409, A03);
        return size;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        int A03 = C0f9.A03(1261473888);
        int i2 = ((O7N) this.A01.get(i)).A00;
        C0f9.A0A(721996629, A03);
        return i2;
    }
}
