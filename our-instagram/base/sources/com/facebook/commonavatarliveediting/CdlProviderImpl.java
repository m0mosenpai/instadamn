package com.facebook.commonavatarliveediting;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC25225BEi;
import X.AbstractC25226BEj;
import X.AbstractC25233BEq;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AnonymousClass001;
import X.AnonymousClass195;
import X.C05F;
import X.C06090Tz;
import X.C0JO;
import X.C0K8;
import X.C0eB;
import X.C12T;
import X.C14360o3;
import X.C19L;
import X.C1JX;
import X.C223016j;
import X.C44909JuN;
import X.C51653Mrk;
import X.C51737MtK;
import X.C55001OVe;
import X.EnumC53208Ng6;
import X.EnumC53217NgF;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import X.InterfaceC58017Po2;
import X.MBg;
import X.MSY;
import X.MVR;
import X.O1H;
import X.OBR;
import com.facebook.cdl.gltfmemorypointerholder.GltfMemoryPointerWrapper;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class CdlProviderImpl implements InterfaceC58017Po2 {
    public OBR A00;
    public C51737MtK A01;
    public C223016j A02;
    public final C0JO A03;
    public final C51653Mrk A04;
    public final HashMap A05;
    public final InterfaceC16620sF A06;
    public final C12T A07;
    public final C12T A08;
    public final C19L A09;
    public final O1H A0A;

    public CdlProviderImpl(O1H o1h, C0JO c0jo, C51653Mrk c51653Mrk, InterfaceC16620sF interfaceC16620sF, C12T c12t, C12T c12t2, C19L c19l) {
        AbstractC25233BEq.A0x(3, c12t, c12t2, o1h);
        C14360o3.A0B(c51653Mrk, 6);
        this.A03 = c0jo;
        this.A09 = c19l;
        this.A07 = c12t;
        this.A08 = c12t2;
        this.A0A = o1h;
        this.A04 = c51653Mrk;
        this.A06 = interfaceC16620sF;
        UserSession userSession = o1h.A00;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (AbstractC25225BEi.A07(c06090Tz, userSession, 36599121431498180L) > 0 && c51653Mrk.A00 == EnumC53208Ng6.A05) {
            this.A02 = new C223016j(AbstractC25225BEi.A07(c06090Tz, userSession, 36599121431498180L), AbstractC25225BEi.A07(c06090Tz, userSession, 36599121431498180L), 0);
        }
        this.A05 = AbstractC166987dD.A1G();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(X.AbstractC53424NkD r11, com.facebook.commonavatarliveediting.CdlProviderImpl r12, java.lang.String r13, java.lang.String r14, X.InterfaceC23621Ds r15, X.InterfaceC16620sF r16, long r17) {
        /*
            r5 = 0
            boolean r0 = X.C50630MWr.A01(r15, r5)
            if (r0 == 0) goto L9e
            r2 = r15
            X.MWr r2 = (X.C50630MWr) r2
            int r3 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L9e
            int r3 = r3 - r1
            r2.A00 = r3
        L15:
            java.lang.Object r6 = r2.A04
            X.1JX r3 = X.C1JX.A02
            int r0 = r2.A00
            r1 = 1
            java.lang.String r4 = "CdlProviderImpl"
            if (r0 == 0) goto L31
            if (r0 != r1) goto La5
            java.lang.Object r12 = r2.A02
            com.facebook.commonavatarliveediting.CdlProviderImpl r12 = (com.facebook.commonavatarliveediting.CdlProviderImpl) r12
            X.AbstractC09560e7.A00(r6)
        L29:
            X.0JO r0 = r12.A03
            r0.now()
            X.0eB r3 = X.C0eB.A00
            return r3
        L31:
            X.AbstractC09560e7.A00(r6)
            boolean r0 = r11 instanceof X.C51469MoG
            r10 = r14
            if (r0 == 0) goto L77
            X.16j r4 = r12.A02
            if (r4 == 0) goto L45
            r0 = r11
            X.MoG r0 = (X.C51469MoG) r0
            com.facebook.cdl.gltfmemorypointerholder.GltfMemoryPointerWrapper r0 = r0.A00
            r4.A06(r14, r0)
        L45:
            X.MoG r11 = (X.C51469MoG) r11
            com.facebook.cdl.gltfmemorypointerholder.GltfMemoryPointerWrapper r0 = r11.A00
            X.MoN r4 = new X.MoN
            r4.<init>(r0, r13, r5)
        L4e:
            java.util.HashMap r5 = r12.A05
            boolean r0 = r5.containsKey(r13)
            if (r0 == 0) goto L29
            r5.remove(r13)
            if (r4 != 0) goto L64
            java.lang.Integer r5 = X.C05F.A0N
            java.lang.String r0 = "unknown error during CDL avatar generation"
            X.JuN r4 = new X.JuN
            r4.<init>(r13, r5, r0)
        L64:
            r2.A02 = r12
            r2.A03 = r13
            r5 = r17
            r2.A01 = r5
            r2.A00 = r1
            r0 = r16
            java.lang.Object r0 = r0.invoke(r4, r2)
            if (r0 != r3) goto L29
            return r3
        L77:
            boolean r0 = r11 instanceof X.C51468MoF
            if (r0 == 0) goto L9c
            java.lang.String r5 = "cdl generateAvatar error w/ revisionId : "
            X.Mrk r0 = r12.A04
            java.lang.String r6 = r0.A0B
            r0 = 227(0xe3, float:3.18E-43)
            java.lang.String r7 = X.AbstractC43591JPw.A00(r0)
            X.MoF r11 = (X.C51468MoF) r11
            java.lang.String r8 = r11.A00
            java.lang.String r9 = " config: "
            java.lang.String r0 = X.AnonymousClass001.A13(r5, r6, r7, r8, r9, r10)
            X.C0K8.A0C(r4, r0)
            java.lang.Integer r0 = X.C05F.A01
            X.JuN r4 = new X.JuN
            r4.<init>(r13, r0, r8)
            goto L4e
        L9c:
            r4 = 0
            goto L4e
        L9e:
            X.MWr r2 = new X.MWr
            r2.<init>(r12, r15, r5)
            goto L15
        La5:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.commonavatarliveediting.CdlProviderImpl.A00(X.NkD, com.facebook.commonavatarliveediting.CdlProviderImpl, java.lang.String, java.lang.String, X.1Ds, X.0sF, long):java.lang.Object");
    }

    public static final synchronized void A03(CdlProviderImpl cdlProviderImpl, String str) {
        synchronized (cdlProviderImpl) {
            AnonymousClass195 anonymousClass195 = (AnonymousClass195) cdlProviderImpl.A05.get(str);
            if (anonymousClass195 != null) {
                anonymousClass195.AGH(null);
            }
            OBR obr = cdlProviderImpl.A00;
            if (obr != null) {
                C14360o3.A0B(str, 0);
                C55001OVe c55001OVe = obr.A01;
                JSONObject A0q = AbstractC31171DnF.A0q();
                A0q.put("requestId", str);
                C55001OVe.A00(c55001OVe, "cdl_cancel_any", A0q);
                obr.A00.cancelRequest(str);
            }
        }
    }

    @Override // X.InterfaceC58017Po2
    public final synchronized void AWn(Boolean bool, Integer num, String str, Map map, InterfaceC16620sF interfaceC16620sF) {
        GltfMemoryPointerWrapper gltfMemoryPointerWrapper;
        C14360o3.A0B(str, 0);
        ArrayList A0k = MSY.A0k(map);
        Iterator A15 = AbstractC166997dE.A15(map);
        while (A15.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A15);
            A0k.add(AnonymousClass001.A0T(AbstractC31172DnG.A17(A1K), (String) A1K.getValue(), ':'));
        }
        String A1H = AbstractC25226BEj.A1H(", ", A0k, null);
        C223016j c223016j = this.A02;
        if (c223016j != null && (gltfMemoryPointerWrapper = (GltfMemoryPointerWrapper) c223016j.A02(A1H)) != null) {
            AbstractC166987dD.A1Z(new MVR(interfaceC16620sF, this, gltfMemoryPointerWrapper, str, (InterfaceC23621Ds) null, 0), this.A09);
        } else {
            this.A05.put(str, AbstractC25226BEj.A1L(new MBg(this, bool, num, str, A1H, map, null, interfaceC16620sF), this.A09));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(com.facebook.commonavatarliveediting.CdlProviderImpl r7, java.lang.String r8, X.InterfaceC23621Ds r9, X.InterfaceC16620sF r10) {
        /*
            r3 = 28
            boolean r0 = X.MAN.A02(r9, r3)
            if (r0 == 0) goto L64
            r5 = r9
            X.MAN r5 = (X.MAN) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L64
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r1 = r5.A02
            X.1JX r4 = X.C1JX.A02
            int r0 = r5.A00
            r6 = 2
            r3 = 1
            if (r0 == 0) goto L2d
            if (r0 == r3) goto L48
            if (r0 != r6) goto L6a
            X.AbstractC09560e7.A00(r1)
        L27:
            r3 = 0
        L28:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            return r4
        L2d:
            X.AbstractC09560e7.A00(r1)
            X.OBR r0 = r7.A00
            if (r0 != 0) goto L28
            java.lang.Integer r2 = X.C05F.A0C
            java.lang.String r1 = "CDL library is still not available"
            X.JuN r0 = new X.JuN
            r0.<init>(r8, r2, r1)
            r5.A01 = r7
            r5.A00 = r3
            java.lang.Object r0 = r10.invoke(r0, r5)
            if (r0 != r4) goto L4f
            return r4
        L48:
            java.lang.Object r7 = r5.A01
            com.facebook.commonavatarliveediting.CdlProviderImpl r7 = (com.facebook.commonavatarliveediting.CdlProviderImpl) r7
            X.AbstractC09560e7.A00(r1)
        L4f:
            r0 = 0
            r5.A01 = r0
            r5.A00 = r6
            X.0sF r2 = r7.A06
            r1 = 14
            X.Td4 r0 = new X.Td4
            r0.<init>(r7, r1)
            java.lang.Object r0 = r2.invoke(r0, r5)
            if (r0 != r4) goto L27
            return r4
        L64:
            X.MAN r5 = new X.MAN
            r5.<init>(r7, r9, r3)
            goto L16
        L6a:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.commonavatarliveediting.CdlProviderImpl.A01(com.facebook.commonavatarliveediting.CdlProviderImpl, java.lang.String, X.1Ds, X.0sF):java.lang.Object");
    }

    public static final Object A02(CdlProviderImpl cdlProviderImpl, String str, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16620sF interfaceC16620sF) {
        HashMap hashMap = cdlProviderImpl.A05;
        if (hashMap.containsKey(str)) {
            C0K8.A0C("CdlProviderImpl", AnonymousClass001.A0R("handleRequestCancellation ", str));
            hashMap.remove(str);
            Object invoke = interfaceC16620sF.invoke(new C44909JuN(str, C05F.A00, "request task has been cancelled"), interfaceC23621Ds);
            if (invoke == C1JX.A02) {
                return invoke;
            }
        }
        return C0eB.A00;
    }

    @Override // X.InterfaceC58017Po2
    public final void EbY(List list, int i) {
        OBR obr = this.A00;
        if (obr != null) {
            C55001OVe c55001OVe = obr.A01;
            JSONObject A0q = AbstractC31171DnF.A0q();
            for (EnumC53217NgF enumC53217NgF : EnumC53217NgF.values()) {
                if (enumC53217NgF.A00 == i) {
                    A0q.put("priority", enumC53217NgF.toString());
                    A0q.put("choice_ids", new JSONArray((Collection) list));
                    C55001OVe.A00(c55001OVe, "set_priority", A0q);
                    obr.A00.setPriority(list, i);
                    return;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
    }
}
