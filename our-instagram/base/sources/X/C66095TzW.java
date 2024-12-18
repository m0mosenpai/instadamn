package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.loadmore.LoadMoreButton;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.TzW, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66095TzW implements InterfaceC65232xL, XG0, InterfaceC65242xM, InterfaceC153776vm, InterfaceC153786vn, InterfaceC71917XAb, InterfaceC43404JFu {
    public V5W A00;
    public C4NJ A01;
    public Long A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public V5X[] A06;
    public V5X[] A07;
    public Long A08;
    public final Context A09;
    public final UserSession A0A;
    public final C194218ig A0B;
    public final VJD A0C;
    public final AbstractC38087GpG A0D;
    public final C66094TzV A0E;
    public final C31204Dnn A0F;
    public final Map A0G;
    public final int A0H;
    public final InterfaceC11380iw A0I;
    public final C66096TzX A0J;
    public final InterfaceC55362gb A0K;
    public final InterfaceC62602sz A0L;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0063, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r19, 36319162577984531L) != false) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [X.2zJ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.VJD, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C66095TzW(android.content.Context r16, X.InterfaceC11380iw r17, X.C66392zG r18, com.instagram.common.session.UserSession r19, X.AbstractC38087GpG r20, X.C5GY r21, X.C66094TzV r22, X.C31204Dnn r23, X.InterfaceC55362gb r24, X.InterfaceC62602sz r25, boolean r26, boolean r27) {
        /*
            r15 = this;
            r2 = 1
            r0 = 2
            r12 = r19
            r4 = r20
            r7 = r25
            X.AbstractC25233BEq.A0w(r0, r7, r4, r12)
            r15.<init>()
            r10 = r16
            r15.A09 = r10
            r15.A0L = r7
            r15.A0D = r4
            r15.A0A = r12
            r0 = r24
            r15.A0K = r0
            r0 = r23
            r15.A0F = r0
            r11 = r17
            r15.A0I = r11
            X.TzX r0 = new X.TzX
            r0.<init>()
            r15.A0J = r0
            X.VJD r1 = new X.VJD
            r1.<init>()
            int r0 = X.AbstractC13880nE.A0A(r10)
            float r0 = (float) r0
            r1.A01 = r0
            r0 = 0
            r1.A00 = r0
            r15.A0C = r1
            android.content.res.Resources r1 = r10.getResources()
            r0 = 2131165208(0x7f070018, float:1.7944627E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r15.A0H = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r15.A0G = r0
            X.TzY r5 = new X.TzY
            r5.<init>(r15)
            if (r27 != 0) goto L65
            X.0Tz r3 = X.C06090Tz.A05
            r0 = 36319162577984531(0x81081600001c13, double:3.0317228876220806E-306)
            boolean r0 = X.C18U.A06(r3, r12, r0)
            r6 = 0
            if (r0 == 0) goto L66
        L65:
            r6 = 1
        L66:
            X.TzZ r0 = new X.TzZ
            r3 = r22
            r0.<init>(r3, r6)
            r8 = r18
            r8.A01(r0)
            X.0Tz r9 = X.C06090Tz.A05
            r0 = 36321232752223474(0x8109f8000024f2, double:3.0330320741467107E-306)
            boolean r0 = X.C18U.A06(r9, r12, r0)
            if (r0 != 0) goto L87
            X.V7g r0 = new X.V7g
            r0.<init>(r6)
            r8.A01(r0)
        L87:
            r1 = 2131625353(0x7f0e0589, float:1.8877912E38)
            r6 = 0
            X.Tsu r0 = new X.Tsu
            r0.<init>(r7, r6, r5, r1)
            r8.A01(r0)
            X.Tzb r0 = new X.Tzb
            r0.<init>()
            r8.A01(r0)
            r0 = r21
            if (r21 == 0) goto La1
            r8.A05 = r0
        La1:
            X.2zD r5 = r8.A00()
            java.lang.Class<X.5qN> r14 = X.AbstractC127945qN.class
            X.Gpn r13 = new X.Gpn
            r13.<init>()
            X.MTQ r9 = new X.MTQ
            r9.<init>(r10, r11, r12, r13, r14)
            if (r26 == 0) goto Lcc
            java.util.Iterator r7 = r4.A04()
        Lb7:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto Lc9
            java.lang.Object r1 = r7.next()
            boolean r0 = r1 instanceof X.AbstractC127945qN
            if (r0 == 0) goto Lb7
            r9.A03(r4, r1)
            goto Lb7
        Lc9:
            r4.EWn(r6, r9)
        Lcc:
            X.8ig r0 = new X.8ig
            r0.<init>(r5)
            r15.A0B = r0
            X.GpG r0 = r15.A0D
            java.util.List r0 = r0.A00
            r0.add(r15)
            r15.A0E = r3
            r15.A05 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66095TzW.<init>(android.content.Context, X.0iw, X.2zG, com.instagram.common.session.UserSession, X.GpG, X.5GY, X.TzV, X.Dnn, X.2gb, X.2sz, boolean, boolean):void");
    }

    public final void A03(String str) {
        C14360o3.A0B(str, 0);
        Map map = this.A0G;
        if (map.containsKey(str)) {
            Object obj = map.get(str);
            C14360o3.A0A(obj);
            int intValue = ((Number) obj).intValue();
            if (intValue != -1) {
                this.A0B.A01.notifyItemChanged(intValue);
            }
        }
    }

    @Override // X.InterfaceC61772re, X.InterfaceC61782rf
    public final C75113Zb BRZ(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        return this.A0J.BRZ(c38321qM);
    }

    @Override // X.InterfaceC153776vm
    public final void CgM(String str, boolean z) {
    }

    @Override // X.InterfaceC153776vm
    public final void EdR(boolean z) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v36, types: [com.instagram.common.recyclerview.ViewModelListUpdate] */
    /* JADX WARN: Type inference failed for: r2v4, types: [X.5qN, X.V7k, java.lang.Object, X.2zP] */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.GdQ] */
    public static final void A00(C66095TzW c66095TzW) {
        VJD vjd;
        int i;
        InterfaceC127925qL c70830Whn;
        float f;
        C4NJ c4nj;
        V5W v5w;
        int length;
        C66096TzX c66096TzX = c66095TzW.A0J;
        c66096TzX.A00.clear();
        c66096TzX.A01.clear();
        c66095TzW.A0G.clear();
        C66114Tzs c66114Tzs = new C66114Tzs();
        V5X[] v5xArr = c66095TzW.A06;
        if (v5xArr != null && (length = v5xArr.length) != 0) {
            int i2 = 0;
            do {
                V5X v5x = v5xArr[i2];
                c66114Tzs.A01.put(v5x, new C66116Tzu(c66095TzW.A0C, v5x.CFo(c66095TzW.A09)));
                c66114Tzs.A00.A00(v5x);
                i2++;
            } while (i2 < length);
            c66095TzW.A01(c66114Tzs);
            c66095TzW.A04 = false;
            return;
        }
        if (c66095TzW.A04 && v5xArr == null) {
            C66094TzV c66094TzV = c66095TzW.A0E;
            if (c66094TzV != null) {
                c66094TzV.A01.A00(0L, "hot");
            }
            c66095TzW.A04 = false;
        }
        V5W v5w2 = c66095TzW.A00;
        if (v5w2 != null) {
            vjd = c66095TzW.A0C;
            i = v5w2.CFo(c66095TzW.A09);
            v5w = v5w2;
        } else {
            InterfaceC55362gb interfaceC55362gb = c66095TzW.A0K;
            if (interfaceC55362gb != null && (c4nj = c66095TzW.A01) != null) {
                ?? abstractC127945qN = new AbstractC127945qN(AbstractC127905qJ.A00(), "megaphone");
                abstractC127945qN.A01 = c4nj;
                abstractC127945qN.A00 = interfaceC55362gb;
                c66114Tzs.A01.put(abstractC127945qN, new C70831Who());
                c66114Tzs.A00.A00(abstractC127945qN);
            }
            Iterator A04 = c66095TzW.A0D.A04();
            C14360o3.A07(A04);
            int i3 = 0;
            while (A04.hasNext()) {
                InterfaceC66482zP interfaceC66482zP = (InterfaceC66482zP) A04.next();
                if (interfaceC66482zP instanceof VA6) {
                    if (C14360o3.A0K(((VA6) interfaceC66482zP).A05, AbstractC111324zv.A00(550))) {
                        c66095TzW.A03 = true;
                        if (c66095TzW.A05) {
                        }
                    }
                    c66095TzW.A02(c66114Tzs, (AbstractC127945qN) interfaceC66482zP, i3);
                } else if (interfaceC66482zP instanceof AbstractC127945qN) {
                    c66095TzW.A02(c66114Tzs, (AbstractC127945qN) interfaceC66482zP, i3);
                    if ((interfaceC66482zP instanceof C50622MWj) && c66095TzW.A03 && !c66095TzW.A05) {
                        ((AbstractC50621MWi) interfaceC66482zP).A00.A00 = i3;
                    }
                } else {
                    if (interfaceC66482zP instanceof InterfaceC71928XAm) {
                        int CFo = ((InterfaceC71928XAm) interfaceC66482zP).CFo(c66095TzW.A09);
                        if (CFo == -1) {
                            f = c66095TzW.A0C.A00;
                        } else {
                            f = CFo;
                        }
                        c70830Whn = new C66116Tzu(c66095TzW.A0C, f);
                    } else if (interfaceC66482zP instanceof X8P) {
                        c70830Whn = new C70830Whn();
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Invalid model: ");
                        sb.append(interfaceC66482zP.getClass());
                        throw AbstractC58320PtC.A0o(". Must implement GridItemViewModel, StaticHeightViewModel, or WrapContentHeightViewModel", sb);
                    }
                    c66114Tzs.A01.put(interfaceC66482zP, c70830Whn);
                    c66114Tzs.A00.A00(interfaceC66482zP);
                }
                i3++;
            }
            InterfaceC62602sz interfaceC62602sz = c66095TzW.A0L;
            if (LoadMoreButton.A03(interfaceC62602sz)) {
                interfaceC62602sz.isLoading();
                ?? A00 = C37384GdQ.A00(interfaceC62602sz);
                vjd = c66095TzW.A0C;
                i = c66095TzW.A0H;
                v5w = A00;
            }
            c66095TzW.A01(c66114Tzs);
        }
        c66114Tzs.A01.put(v5w, new C66116Tzu(vjd, i));
        c66114Tzs.A00.A00(v5w);
        c66095TzW.A01(c66114Tzs);
    }

    private final void A01(C66114Tzs c66114Tzs) {
        if (C14360o3.A0K(this.A0I.getModuleName(), "explore_popular")) {
            UserSession userSession = this.A0A;
            if (C18U.A06(C06090Tz.A05, userSession, 36329638003753429L)) {
                List A0a = AbstractC001800i.A0a(c66114Tzs.A00.A00);
                if (A0a.isEmpty() || !V5X.class.isAssignableFrom(A0a.get(0).getClass())) {
                    Long l = this.A08;
                    if (l == null) {
                        l = AbstractC31173DnH.A0g();
                        this.A08 = l;
                    }
                    AbstractC60912qF.A01(userSession, l, X4Z.A00, new BQB(14, this, c66114Tzs, true), true);
                    return;
                }
            }
        }
        C194218ig c194218ig = this.A0B;
        c194218ig.A01.A05(c66114Tzs.A00);
        c194218ig.A00 = c66114Tzs.A01;
    }

    @Override // X.InterfaceC153786vn
    public final InterfaceC127925qL BAO(int i) {
        InterfaceC127925qL BAO = this.A0B.BAO(i);
        C14360o3.A07(BAO);
        return BAO;
    }

    @Override // X.XG0
    public final int CFG(U0N u0n) {
        String str = u0n.A02;
        Map map = this.A0G;
        if (!map.containsKey(str)) {
            return -1;
        }
        Object obj = map.get(str);
        C14360o3.A0A(obj);
        return ((Number) obj).intValue();
    }

    @Override // X.InterfaceC65242xM
    public final /* bridge */ /* synthetic */ Object getAdapter() {
        return this.A0B.A01;
    }

    @Override // X.XG0, X.InterfaceC65242xM
    public final int getCount() {
        return this.A0B.A01.getItemCount();
    }

    @Override // X.InterfaceC65242xM
    public final Object getItem(int i) {
        Object A04 = this.A0B.A01.A04(i);
        C14360o3.A07(A04);
        return A04;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void A02(C66114Tzs c66114Tzs, AbstractC127945qN abstractC127945qN, int i) {
        String key = abstractC127945qN.getKey();
        Integer valueOf = Integer.valueOf(i);
        Map map = this.A0G;
        map.put(key, valueOf);
        if (abstractC127945qN instanceof InterfaceC127975qQ) {
            InterfaceC127975qQ interfaceC127975qQ = (InterfaceC127975qQ) abstractC127945qN;
            if (interfaceC127975qQ.BQN() != null) {
                String id = interfaceC127975qQ.BQN().getId();
                if (id != null) {
                    map.put(id, valueOf);
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
        }
        c66114Tzs.A00.A00(abstractC127945qN);
    }

    @Override // X.XG0
    public final int AVT(Object obj) {
        int count = getCount();
        for (int i = 0; i < count; i++) {
            if (C14360o3.A0K(getItem(i), obj)) {
                return i;
            }
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
    
        if (X.C3YS.A00(r13.A0A).A05(r6.BQN()) != false) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.XG0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.U0N CFF(int r14) {
        /*
            r13 = this;
            java.lang.Object r6 = r13.getItem(r14)
            boolean r0 = r6 instanceof X.InterfaceC127965qP
            r1 = 0
            if (r0 == 0) goto L1b
            X.5qP r6 = (X.InterfaceC127965qP) r6
            if (r6 == 0) goto L1b
            X.1qM r0 = r6.BQN()
            boolean r0 = r0.Cff()
            if (r0 != 0) goto L1c
            boolean r0 = r6 instanceof X.C38205GrA
            if (r0 != 0) goto L1c
        L1b:
            return r1
        L1c:
            X.1qM r4 = r6.BQN()
            r5 = 0
            X.C14360o3.A0B(r4, r5)
            r7 = 0
            java.lang.String r0 = r4.getId()
            if (r0 == 0) goto L76
            java.lang.String r3 = r6.getId()
            if (r3 == 0) goto L6e
            boolean r0 = r6.CQJ()
            if (r0 == 0) goto L48
            com.instagram.common.session.UserSession r0 = r13.A0A
            X.3YT r1 = X.C3YS.A00(r0)
            X.1qM r0 = r6.BQN()
            boolean r0 = r1.A05(r0)
            r2 = 1
            if (r0 == 0) goto L49
        L48:
            r2 = 0
        L49:
            boolean r0 = r6 instanceof X.AbstractC127945qN
            if (r0 == 0) goto L68
            r1 = r6
            X.5qN r1 = (X.AbstractC127945qN) r1
            X.5qK r9 = r1.A02
            X.GpG r0 = r13.A0D
            X.5qT r8 = r0.BAM(r6)
            X.C14360o3.A0B(r8, r5)
            long r11 = r1.A00()
            java.lang.String r10 = r1.A01()
            X.GqY r7 = new X.GqY
            r7.<init>(r8, r9, r10, r11)
        L68:
            X.U0N r1 = new X.U0N
            r1.<init>(r7, r4, r3, r2)
            return r1
        L6e:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L76:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66095TzW.CFF(int):X.U0N");
    }

    @Override // X.InterfaceC65232xL
    public final void CtR(C38321qM c38321qM) {
        A00(this);
    }

    @Override // X.InterfaceC43404JFu
    public final void Dwz() {
        A00(this);
    }

    @Override // X.InterfaceC153776vm
    public final void update() {
        A00(this);
    }
}
