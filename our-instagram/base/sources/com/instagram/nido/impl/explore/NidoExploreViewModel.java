package com.instagram.nido.impl.explore;

import X.AbstractC001800i;
import X.AbstractC09440dt;
import X.AbstractC141776au;
import X.AbstractC25225BEi;
import X.AbstractC25235BEs;
import X.AbstractC31171DnF;
import X.B4Z;
import X.C008002u;
import X.C05A;
import X.C05F;
import X.C0UO;
import X.C14360o3;
import X.C31690Dvv;
import X.C31691Dvw;
import X.C57531Pg5;
import X.C8CY;
import X.Gt7;
import X.InterfaceC09390do;
import X.MV3;
import X.MZD;
import X.MZE;
import X.PZG;
import com.instagram.common.session.UserSession;
import com.instagram.explore.topiccluster.ExploreTopicCluster;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes9.dex */
public final class NidoExploreViewModel extends Gt7 {
    public String A00;
    public final UserSession A01;
    public final Set A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final C05A A08;
    public final C0UO A09;

    public NidoExploreViewModel(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        C008002u A1H = AbstractC25225BEi.A1H(MZE.A03);
        this.A08 = A1H;
        this.A02 = AbstractC31171DnF.A0l();
        MZD mzd = new MZD(userSession);
        this.A03 = AbstractC09440dt.A01(C57531Pg5.A00(mzd, new C8CY(mzd.A00), 46));
        MV3 mv3 = new MV3(userSession);
        this.A07 = AbstractC09440dt.A01(C57531Pg5.A00(mv3, new C8CY(mv3.A00), 47));
        this.A09 = A1H;
        this.A05 = AbstractC25235BEs.A0t(this, 25);
        this.A04 = AbstractC25235BEs.A0t(this, 22);
        this.A06 = AbstractC25235BEs.A0t(this, 26);
        PZG.A01(this, AbstractC141776au.A00(this), 7);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(com.instagram.nido.impl.explore.NidoExploreViewModel r12, X.InterfaceC23621Ds r13) {
        /*
            r4 = 14
            boolean r0 = X.C57145PWx.A02(r13, r4)
            if (r0 == 0) goto L6e
            r2 = r13
            X.PWx r2 = (X.C57145PWx) r2
            int r3 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L6e
            int r3 = r3 - r1
            r2.A00 = r3
        L16:
            java.lang.Object r4 = r2.A02
            X.1JX r1 = X.C1JX.A02
            int r0 = r2.A00
            r3 = 1
            if (r0 == 0) goto L36
            if (r0 != r3) goto L73
            java.lang.Object r12 = r2.A01
            com.instagram.nido.impl.explore.NidoExploreViewModel r12 = (com.instagram.nido.impl.explore.NidoExploreViewModel) r12
            X.AbstractC09560e7.A00(r4)
        L28:
            X.0do r0 = r12.A03
            java.lang.Object r0 = r0.getValue()
            X.Dvv r0 = (X.C31690Dvv) r0
            r0.A02()
            X.0eB r1 = X.C0eB.A00
            return r1
        L36:
            X.AbstractC09560e7.A00(r4)
            com.instagram.common.session.UserSession r0 = r12.A01
            java.lang.String r0 = r0.userId
            X.500 r7 = new X.500
            r7.<init>(r0)
            X.0do r0 = r12.A07
            java.lang.Object r4 = r0.getValue()
            X.MV2 r4 = (X.MV2) r4
            r5 = 0
            r11 = 0
            X.700 r6 = new X.700
            r6.<init>(r5, r3, r11, r11)
            java.lang.String r8 = "NidoExploreViewModel"
            java.lang.String r9 = "explore"
            r10 = -1
            r4.A03(r5, r6, r7, r8, r9, r10, r11)
            java.lang.Object r0 = r0.getValue()
            X.MV2 r0 = (X.MV2) r0
            X.0xP r0 = r0.A02(r7)
            r2.A01 = r12
            r2.A00 = r3
            java.lang.Object r0 = X.AbstractC209010m.A02(r2, r0)
            if (r0 != r1) goto L28
            return r1
        L6e:
            X.PWx r2 = X.C57145PWx.A00(r12, r13, r4)
            goto L16
        L73:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.nido.impl.explore.NidoExploreViewModel.A00(com.instagram.nido.impl.explore.NidoExploreViewModel, X.1Ds):java.lang.Object");
    }

    public static final void A01(ExploreTopicCluster exploreTopicCluster, NidoExploreViewModel nidoExploreViewModel, Integer num, Integer num2) {
        InterfaceC09390do interfaceC09390do;
        Integer num3;
        int intValue = num2.intValue();
        if (intValue != 0) {
            if (intValue == 1) {
                interfaceC09390do = nidoExploreViewModel.A05;
            } else {
                throw B4Z.A00();
            }
        } else {
            interfaceC09390do = nidoExploreViewModel.A04;
        }
        ArrayList A0U = AbstractC001800i.A0U((Collection) ((C0UO) interfaceC09390do.getValue()).getValue());
        int i = 0;
        Iterator it = A0U.iterator();
        while (it.hasNext()) {
            if (C14360o3.A0K(((C31691Dvw) it.next()).A03, exploreTopicCluster.A09)) {
                if (i != -1) {
                    C31691Dvw c31691Dvw = (C31691Dvw) A0U.get(i);
                    String str = c31691Dvw.A02;
                    String str2 = c31691Dvw.A03;
                    ExploreTopicCluster exploreTopicCluster2 = c31691Dvw.A00;
                    C14360o3.A0B(str2, 1);
                    A0U.set(i, new C31691Dvw(exploreTopicCluster2, num, str, str2));
                    C31690Dvv c31690Dvv = (C31690Dvv) nidoExploreViewModel.A03.getValue();
                    if (intValue != 0) {
                        num3 = C05F.A01;
                    } else {
                        num3 = C05F.A00;
                    }
                    C31690Dvv.A01(c31690Dvv, num3, A0U);
                    return;
                }
                return;
            }
            i++;
        }
    }
}
