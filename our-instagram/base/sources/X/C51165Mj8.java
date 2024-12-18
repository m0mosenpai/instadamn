package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Mj8, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51165Mj8 extends C2UU {
    public int A00;
    public NI6 A01;
    public InterfaceC58200Pr6 A02;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final Context A0B;
    public final InterfaceC16820sZ A0D;
    public final int A0E;
    public final boolean A0F;
    public final boolean A0G;
    public List A03 = AbstractC166987dD.A1E();
    public final InterfaceC09390do A0C = C57521Pfv.A00(this, 3);

    public final void A02(List list, boolean z) {
        List list2 = this.A03;
        this.A03 = list;
        if (!z) {
            AbstractC66552zX.A00(new C51088Mhn(list2, list, false)).A03(this);
        } else {
            MSW.A09(this.A0C).post(new PQ7(this, list2));
        }
    }

    @Override // X.C2UU
    public final void onBindViewHolder(C3OO c3oo, int i) {
        C52421NHr c52421NHr;
        int i2;
        C52421NHr c52421NHr2;
        View view;
        int i3;
        View A06;
        int i4;
        C14360o3.A0B(c3oo, 0);
        if (c3oo instanceof C51274Mkx) {
            O7N o7n = (O7N) AbstractC001800i.A0O(this.A03, i);
            if (o7n instanceof C52419NHp) {
                A06 = AbstractC31171DnF.A06(c3oo);
                i4 = ((C52419NHp) o7n).A00;
            } else {
                if (o7n instanceof C52420NHq) {
                    A06 = AbstractC31171DnF.A06(c3oo);
                    i4 = ((C52420NHq) o7n).A00;
                }
                view = c3oo.itemView;
                i3 = 2;
            }
            AbstractC13880nE.A0g(A06, i4);
            view = c3oo.itemView;
            i3 = 2;
        } else {
            if (!(c3oo instanceof NID)) {
                return;
            }
            if (AbstractC001800i.A0O(this.A03, i) instanceof C52422NHs) {
                C51832Mva A00 = A00(i);
                if (A00 != null) {
                    NID nid = (NID) c3oo;
                    nid.A00(A00, this.A00);
                    int i5 = A00.A00;
                    TextView textView = nid.A00;
                    AbstractC31177DnL.A0x(textView, AbstractC167017dG.A06(((AbstractC51365MmQ) nid).A00) + i5, textView.getPaddingTop());
                }
            } else {
                Object A0O = AbstractC001800i.A0O(this.A03, i);
                if ((A0O instanceof C52421NHr) && (c52421NHr = (C52421NHr) A0O) != null) {
                    C51831MvZ c51831MvZ = c52421NHr.A01;
                    NID nid2 = (NID) c3oo;
                    Object A0O2 = AbstractC001800i.A0O(this.A03, i);
                    if ((A0O2 instanceof C52421NHr) && (c52421NHr2 = (C52421NHr) A0O2) != null) {
                        i2 = c52421NHr2.A00;
                    } else {
                        i2 = 0;
                    }
                    nid2.A00(c51831MvZ, i2);
                }
            }
            view = c3oo.itemView;
            i3 = 3;
        }
        ViewOnClickListenerC55460OkF.A00(view, i3, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x008a, code lost:
    
        if (r13.A07 != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008f, code lost:
    
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0092, code lost:
    
        if (r13.A0F == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0094, code lost:
    
        r8 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0095, code lost:
    
        r9 = r13.A05;
        r10 = r13.A06;
        r11 = r13.A04;
        r12 = r13.A0G;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009f, code lost:
    
        if (r13.A0F == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a1, code lost:
    
        r6 = X.EnumC53277NhF.A09;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a8, code lost:
    
        return new X.NID(r4, r5, r6, r7, r8, r9, r10, r11, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a9, code lost:
    
        r6 = X.EnumC53277NhF.A0A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008d, code lost:
    
        if (r1 == false) goto L37;
     */
    @Override // X.C2UU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C3OO onCreateViewHolder(android.view.ViewGroup r14, int r15) {
        /*
            r13 = this;
            r4 = 0
            X.C14360o3.A0B(r14, r4)
            if (r15 == 0) goto L5b
            r0 = 1
            if (r15 == r0) goto L58
            r0 = 2
            if (r15 == r0) goto L55
            r0 = 3
            if (r15 != r0) goto Lac
            java.lang.Integer r0 = X.C05F.A0N
        L11:
            int r1 = r0.intValue()
            r0 = 1
            if (r1 == r0) goto L7b
            r3 = 2
            if (r1 == r3) goto L7b
            r0 = 3
            if (r1 == r0) goto L63
            if (r1 != r4) goto L5e
            int r0 = X.C3OO.FLAG_ADAPTER_FULLUPDATE
            android.content.Context r2 = r14.getContext()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r2)
            r0 = 2131627382(0x7f0e0d76, float:1.8882027E38)
            android.view.View r1 = X.AbstractC25226BEj.A0R(r1, r14, r0, r4)
            X.0sZ r0 = r13.A0D
            X.Mkx r3 = new X.Mkx
            r3.<init>(r1, r0, r4)
            boolean r0 = r13.A0G
            if (r0 == 0) goto L50
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131165305(0x7f070079, float:1.7944823E38)
            float r0 = r1.getDimension(r0)
            int r1 = (int) r0
        L48:
            android.view.View r0 = X.AbstractC31171DnF.A06(r3)
            X.AbstractC13880nE.A0W(r0, r1)
            return r3
        L50:
            int r1 = X.AbstractC50522MSa.A06(r2)
            goto L48
        L55:
            java.lang.Integer r0 = X.C05F.A0C
            goto L11
        L58:
            java.lang.Integer r0 = X.C05F.A01
            goto L11
        L5b:
            java.lang.Integer r0 = X.C05F.A00
            goto L11
        L5e:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L63:
            int r0 = X.C3OO.FLAG_ADAPTER_FULLUPDATE
            android.view.LayoutInflater r1 = X.AbstractC25228BEl.A0P(r14)
            r0 = 2131627382(0x7f0e0d76, float:1.8882027E38)
            android.view.View r2 = X.AbstractC25226BEj.A0R(r1, r14, r0, r4)
            int r1 = r13.A0E
            int r1 = r1 / r3
            X.0sZ r0 = r13.A0D
            X.Mkx r3 = new X.Mkx
            r3.<init>(r2, r0, r1)
            return r3
        L7b:
            int r0 = X.C3OO.FLAG_ADAPTER_FULLUPDATE
            android.content.Context r4 = X.AbstractC166997dE.A0L(r14)
            X.Pr6 r5 = r13.A02
            boolean r1 = r13.A08
            if (r1 != 0) goto L8c
            boolean r0 = r13.A07
            r7 = 1
            if (r0 == 0) goto L8f
        L8c:
            r7 = 0
            if (r1 != 0) goto L94
        L8f:
            boolean r0 = r13.A0F
            r8 = 1
            if (r0 == 0) goto L95
        L94:
            r8 = 0
        L95:
            boolean r9 = r13.A05
            boolean r10 = r13.A06
            boolean r11 = r13.A04
            boolean r12 = r13.A0G
            boolean r0 = r13.A0F
            if (r0 == 0) goto La9
            X.NhF r6 = X.EnumC53277NhF.A09
        La3:
            X.NID r3 = new X.NID
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r3
        La9:
            X.NhF r6 = X.EnumC53277NhF.A0A
            goto La3
        Lac:
            java.lang.String r0 = "Not valid type: "
            java.lang.IllegalArgumentException r0 = X.AbstractC25230BEn.A0n(r0, r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51165Mj8.onCreateViewHolder(android.view.ViewGroup, int):X.3OO");
    }

    public final C51832Mva A00(int i) {
        C52422NHs c52422NHs;
        Object A0O = AbstractC001800i.A0O(this.A03, i);
        if (!(A0O instanceof C52422NHs) || (c52422NHs = (C52422NHs) A0O) == null) {
            return null;
        }
        return c52422NHs.A04;
    }

    public final void A01(int i, int i2, int i3) {
        C52422NHs c52422NHs;
        int i4 = (i * 2) + 2;
        if (i4 < this.A03.size()) {
            ArrayList A0U = AbstractC001800i.A0U(this.A03);
            C51832Mva A00 = A00(i4);
            if (A00 != null) {
                C51832Mva A02 = A00.A02(i2, i3, i2, i3);
                Object A0O = AbstractC001800i.A0O(this.A03, i4);
                if ((A0O instanceof C52422NHs) && (c52422NHs = (C52422NHs) A0O) != null) {
                    A0U.set(i4, new C52422NHs(A02, c52422NHs.A00, c52422NHs.A01, c52422NHs.A02, c52422NHs.A03));
                }
                this.A03 = A0U;
            }
        }
    }

    public C51165Mj8(Context context, InterfaceC16820sZ interfaceC16820sZ, int i, boolean z, boolean z2) {
        this.A0B = context;
        this.A0E = i;
        this.A0D = interfaceC16820sZ;
        this.A0G = z;
        this.A0F = z2;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(1989907495);
        int size = this.A03.size();
        C0f9.A0A(-502932744, A03);
        return size;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        int i2;
        int A03 = C0f9.A03(1652837810);
        O7N o7n = (O7N) AbstractC001800i.A0O(this.A03, i);
        if (o7n != null) {
            i2 = o7n.A00;
        } else {
            i2 = -1;
        }
        C0f9.A0A(652516717, A03);
        return i2;
    }
}
