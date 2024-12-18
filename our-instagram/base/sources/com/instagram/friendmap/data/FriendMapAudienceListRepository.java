package com.instagram.friendmap.data;

import X.AbstractC001800i;
import X.AbstractC111324zv;
import X.AbstractC166177bl;
import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC25225BEi;
import X.AbstractC25231BEo;
import X.AbstractC31171DnF;
import X.AbstractC38851rI;
import X.AnonymousClass090;
import X.C008002u;
import X.C05A;
import X.C10E;
import X.C10Q;
import X.C14360o3;
import X.C16910sj;
import X.C16930sl;
import X.C1DS;
import X.C1DU;
import X.C2JS;
import X.C51734MtH;
import X.C51758Mth;
import X.C57181PaA;
import X.C60406Qyu;
import X.C67493Umt;
import X.C67494Umu;
import X.C92694De;
import X.C92964Eq;
import X.EnumC92974Es;
import X.InterfaceC19390xP;
import X.InterfaceC23621Ds;
import X.MSZ;
import X.MZG;
import android.os.Parcelable;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes9.dex */
public final class FriendMapAudienceListRepository {
    public String A00;
    public final C92694De A01 = AbstractC166177bl.A00(MZG.A00);
    public final UserSession A02;
    public final C92964Eq A03;
    public final Set A04;
    public final InterfaceC19390xP A05;
    public final C05A A06;
    public final C05A A07;
    public final EnumC92974Es A08;
    public final Set A09;

    public static final void A00(FriendMapAudienceListRepository friendMapAudienceListRepository, C67494Umu c67494Umu, boolean z, boolean z2) {
        Object value;
        C51734MtH c51734MtH;
        String str;
        List list;
        AbstractCollection A0S;
        ArrayList A1E;
        C05A c05a = friendMapAudienceListRepository.A06;
        do {
            value = c05a.getValue();
            c51734MtH = (C51734MtH) value;
            str = null;
            if (c67494Umu == null || (list = c67494Umu.getOptionalCompactedTreeListField(9, "users", C67493Umt.class, 776072309)) == null) {
                list = C16930sl.A00;
            }
            AbstractCollection A0q = AbstractC167017dG.A0q(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C2JS reinterpretRequired = AbstractC25225BEi.A0l(it).reinterpretRequired(0, C60406Qyu.class, 261567527);
                C1DU A00 = C1DS.A00(friendMapAudienceListRepository.A02);
                Parcelable.Creator creator = User.CREATOR;
                User A01 = AbstractC38851rI.A01(MSZ.A0S(A00), (ImmutablePandoUserDict) reinterpretRequired.reinterpret(ImmutablePandoUserDict.class));
                C14360o3.A07(A01);
                A0q.add(new C51758Mth(A01, ((Set) friendMapAudienceListRepository.A07.getValue()).contains(A01.getId()), 27));
            }
            if (z) {
                if (z2) {
                    A0q = AnonymousClass090.A00(A0q, friendMapAudienceListRepository.A09);
                }
                A0S = A0q;
            } else {
                A0S = AbstractC001800i.A0S(A0q, (Collection) c51734MtH.A01);
            }
            HashSet A1H = AbstractC166987dD.A1H();
            A1E = AbstractC166987dD.A1E();
            for (Object obj : A0S) {
                AbstractC25231BEo.A1F(AbstractC31171DnF.A0g(((C51758Mth) obj).A00), obj, A1H, A1E);
            }
            if (c67494Umu != null) {
                str = c67494Umu.A0C(AbstractC111324zv.A00(237));
            }
        } while (!c05a.AIi(value, new C51734MtH(str, A1E, false, false, c51734MtH.A03, c51734MtH.A06)));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003c A[LOOP:0: B:11:0x0036->B:13:0x003c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009d A[LOOP:1: B:16:0x0097->B:18:0x009d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c6 A[LOOP:2: B:21:0x00c0->B:23:0x00c6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(X.InterfaceC23621Ds r13) {
        /*
            r12 = this;
            r4 = 20
            boolean r0 = X.MAH.A01(r13, r4)
            if (r0 == 0) goto L85
            r2 = r13
            X.MAH r2 = (X.MAH) r2
            int r3 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L85
            int r3 = r3 - r1
            r2.A00 = r3
        L16:
            java.lang.Object r5 = r2.A02
            X.1JX r3 = X.C1JX.A02
            int r0 = r2.A00
            r8 = 1
            if (r0 == 0) goto L4b
            if (r0 != r8) goto Ldf
            java.lang.Object r4 = r2.A01
            com.instagram.friendmap.data.FriendMapAudienceListRepository r4 = (com.instagram.friendmap.data.FriendMapAudienceListRepository) r4
            X.AbstractC09560e7.A00(r5)
        L28:
            X.Mtk r5 = (X.C51761Mtk) r5
            java.lang.Object r0 = r5.A00
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r7 = X.AbstractC167007dF.A0i(r0)
            java.util.Iterator r3 = r0.iterator()
        L36:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L8b
            com.instagram.user.model.User r2 = X.AbstractC25226BEj.A15(r3)
            r1 = 27
            X.Mth r0 = new X.Mth
            r0.<init>(r2, r8, r1)
            r7.add(r0)
            goto L36
        L4b:
            X.AbstractC09560e7.A00(r5)
            X.05A r4 = r12.A06
        L50:
            java.lang.Object r1 = r4.getValue()
            r0 = r1
            X.MtH r0 = (X.C51734MtH) r0
            java.lang.Object r7 = r0.A01
            java.util.List r7 = (java.util.List) r7
            java.lang.String r6 = r0.A02
            boolean r9 = r0.A05
            boolean r10 = r0.A03
            boolean r11 = r0.A06
            r0 = 0
            X.C14360o3.A0B(r7, r0)
            X.MtH r5 = new X.MtH
            r5.<init>(r6, r7, r8, r9, r10, r11)
            boolean r0 = r4.AIi(r1, r5)
            if (r0 == 0) goto L50
            X.4Eq r0 = r12.A03
            X.4Es r1 = r12.A08
            r2.A01 = r12
            r2.A00 = r8
            com.instagram.friendmap.data.FriendMapGraphQLImpl r0 = r0.A00
            java.lang.Object r5 = r0.A04(r1, r2)
            if (r5 != r3) goto L83
            return r3
        L83:
            r4 = r12
            goto L28
        L85:
            X.MAH r2 = new X.MAH
            r2.<init>(r12, r13, r4)
            goto L16
        L8b:
            java.lang.Object r0 = r5.A02
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r6 = X.AbstractC167007dF.A0i(r0)
            java.util.Iterator r5 = r0.iterator()
        L97:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto Lad
            com.instagram.user.model.User r3 = X.AbstractC25226BEj.A15(r5)
            r2 = 0
            r1 = 27
            X.Mth r0 = new X.Mth
            r0.<init>(r3, r2, r1)
            r6.add(r0)
            goto L97
        Lad:
            java.util.Set r1 = r4.A09
            java.util.ArrayList r0 = X.AbstractC001800i.A0S(r6, r7)
            r1.addAll(r0)
            java.util.Set r3 = r4.A04
            java.util.ArrayList r2 = X.AbstractC167007dF.A0i(r7)
            java.util.Iterator r1 = r7.iterator()
        Lc0:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Ld4
            java.lang.Object r0 = r1.next()
            X.Mth r0 = (X.C51758Mth) r0
            java.lang.Object r0 = r0.A00
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            X.AbstractC31173DnH.A1X(r0, r2)
            goto Lc0
        Ld4:
            r3.addAll(r2)
            X.05A r0 = r4.A07
            r0.Egh(r3)
            X.0eB r0 = X.C0eB.A00
            return r0
        Ldf:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.friendmap.data.FriendMapAudienceListRepository.A01(X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A02(X.InterfaceC23621Ds r13) {
        /*
            r12 = this;
            r4 = 21
            boolean r0 = X.MAH.A01(r13, r4)
            if (r0 == 0) goto Lae
            r3 = r13
            X.MAH r3 = (X.MAH) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lae
            int r2 = r2 - r1
            r3.A00 = r2
        L16:
            java.lang.Object r0 = r3.A02
            X.1JX r4 = X.C1JX.A02
            int r1 = r3.A00
            r11 = 1
            if (r1 == 0) goto L5f
            if (r1 != r11) goto Lb5
            java.lang.Object r4 = r3.A01
            com.instagram.friendmap.data.FriendMapAudienceListRepository r4 = (com.instagram.friendmap.data.FriendMapAudienceListRepository) r4
            X.AbstractC09560e7.A00(r0)
        L28:
            X.05A r3 = r4.A06
        L2a:
            java.lang.Object r2 = r3.getValue()
            r1 = r2
            X.MtH r1 = (X.C51734MtH) r1
            r11 = 0
            java.lang.Object r7 = r1.A01
            java.util.List r7 = (java.util.List) r7
            java.lang.String r6 = r1.A02
            boolean r8 = r1.A04
            boolean r9 = r1.A05
            boolean r10 = r1.A03
            X.C14360o3.A0B(r7, r11)
            X.MtH r5 = new X.MtH
            r5.<init>(r6, r7, r8, r9, r10, r11)
            boolean r1 = r3.AIi(r2, r5)
            if (r1 == 0) goto L2a
            if (r0 == 0) goto L5e
            java.util.Set r2 = r4.A04
            r2.clear()
            X.05A r1 = r4.A07
            java.lang.Object r1 = r1.getValue()
            java.util.Collection r1 = (java.util.Collection) r1
            r2.addAll(r1)
        L5e:
            return r0
        L5f:
            X.AbstractC09560e7.A00(r0)
            X.05A r2 = r12.A06
        L64:
            java.lang.Object r1 = r2.getValue()
            r0 = r1
            X.MtH r0 = (X.C51734MtH) r0
            java.lang.Object r7 = r0.A01
            java.util.List r7 = (java.util.List) r7
            java.lang.String r6 = r0.A02
            boolean r8 = r0.A04
            boolean r9 = r0.A05
            boolean r10 = r0.A03
            r0 = 0
            X.C14360o3.A0B(r7, r0)
            X.MtH r5 = new X.MtH
            r5.<init>(r6, r7, r8, r9, r10, r11)
            boolean r0 = r2.AIi(r1, r5)
            if (r0 == 0) goto L64
            X.4Eq r7 = r12.A03
            X.4Es r6 = r12.A08
            X.05A r5 = r12.A07
            java.lang.Iterable r0 = X.AbstractC31172DnG.A0w(r5)
            java.util.Set r1 = r12.A04
            java.util.Set r2 = X.AbstractC001800i.A0m(r0, r1)
            java.lang.Iterable r0 = X.AbstractC31172DnG.A0w(r5)
            java.util.Set r1 = X.AbstractC001800i.A0m(r1, r0)
            r3.A01 = r12
            r3.A00 = r11
            com.instagram.friendmap.data.FriendMapGraphQLImpl r0 = r7.A00
            java.lang.Object r0 = r0.A03(r6, r2, r1, r3)
            if (r0 != r4) goto Lab
            return r4
        Lab:
            r4 = r12
            goto L28
        Lae:
            X.MAH r3 = new X.MAH
            r3.<init>(r12, r13, r4)
            goto L16
        Lb5:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.friendmap.data.FriendMapAudienceListRepository.A02(X.1Ds):java.lang.Object");
    }

    public FriendMapAudienceListRepository(UserSession userSession, C92964Eq c92964Eq, EnumC92974Es enumC92974Es) {
        this.A02 = userSession;
        this.A08 = enumC92974Es;
        this.A03 = c92964Eq;
        C008002u A00 = C10E.A00(C16910sj.A00);
        this.A07 = A00;
        this.A09 = AbstractC31171DnF.A0l();
        this.A04 = AbstractC31171DnF.A0l();
        C008002u A1H = AbstractC25225BEi.A1H(new C51734MtH());
        this.A06 = A1H;
        this.A05 = C10Q.A03(new C57181PaA(this, (InterfaceC23621Ds) null, 10), A1H, A00);
    }
}
