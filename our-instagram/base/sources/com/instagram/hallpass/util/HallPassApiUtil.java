package com.instagram.hallpass.util;

import X.AbstractC31177DnL;
import X.C07510aQ;
import X.C14360o3;
import X.C1ON;
import X.C25591Mp;
import X.C25611Mr;
import X.C25621Ms;
import X.C41313IQj;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class HallPassApiUtil {
    public static final HallPassApiUtil A00 = new Object();

    public static final C1ON A00(UserSession userSession, String str) {
        C14360o3.A0B(userSession, 0);
        C25621Ms A0M = AbstractC31177DnL.A0M(userSession);
        A0M.A0B("stories/hallpass/hallpass_add_people_search/");
        A0M.A0H("query", str);
        A0M.A02 = new C25591Mp(new C07510aQ(userSession), new C25611Mr(null), C41313IQj.class, false);
        return A0M.A0N();
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0098, code lost:
    
        if (r0 == r2) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(com.instagram.common.session.UserSession r8, java.lang.String r9, java.lang.String r10, java.util.List r11, X.InterfaceC23621Ds r12) {
        /*
            r7 = this;
            r4 = 5
            boolean r0 = X.PX9.A03(r12, r4)
            if (r0 == 0) goto L9b
            r3 = r12
            X.PX9 r3 = (X.PX9) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L9b
            int r2 = r2 - r1
            r3.A00 = r2
        L15:
            java.lang.Object r0 = r3.A01
            X.1JX r2 = X.C1JX.A02
            int r1 = r3.A00
            r5 = 1
            if (r1 == 0) goto L56
            if (r1 != r5) goto La9
            X.AbstractC09560e7.A00(r0)
        L23:
            r2 = r0
            X.3NY r2 = (X.C3NY) r2
            boolean r0 = r2 instanceof X.C3NX
            if (r0 == 0) goto L3c
            X.3NX r2 = (X.C3NX) r2
            java.lang.Object r0 = r2.A00
            X.EAH r0 = (X.EAH) r0
            X.Muq r0 = r0.A00
            if (r0 != 0) goto L45
            X.AbstractC31171DnF.A0w()
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L3c:
            boolean r0 = r2 instanceof X.C194848jk
            if (r0 != 0) goto L49
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L45:
            X.3NX r2 = X.AbstractC25225BEi.A0z(r0)
        L49:
            boolean r0 = r2 instanceof X.C3NX
            if (r0 != 0) goto L9a
            boolean r0 = r2 instanceof X.C194848jk
            if (r0 == 0) goto La4
            X.8jk r2 = X.AbstractC25227BEk.A0h()
            return r2
        L56:
            X.AbstractC09560e7.A00(r0)
            org.json.JSONArray r6 = X.AbstractC31171DnF.A0p()
            java.util.Iterator r1 = r11.iterator()
        L61:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L6b
            X.AbstractC31172DnG.A1W(r1, r6)
            goto L61
        L6b:
            X.1Ms r4 = X.AbstractC167017dG.A0c(r8)
            java.lang.String r0 = "stories/hallpass/create/"
            r4.A0B(r0)
            java.lang.String r0 = "name"
            r4.A9s(r0, r9)
            java.lang.String r1 = r6.toString()
            java.lang.String r0 = "member_ids"
            r4.A9s(r0, r1)
            java.lang.String r0 = "color"
            r4.A9s(r0, r10)
            java.lang.Class<X.EAH> r1 = X.EAH.class
            java.lang.Class<X.FSR> r0 = X.FSR.class
            X.1ON r1 = X.AbstractC25227BEk.A0e(r4, r1, r0)
            r3.A00 = r5
            r0 = 266501256(0xfe27c88, float:2.2333288E-29)
            java.lang.Object r0 = r1.A00(r0, r3)
            if (r0 != r2) goto L23
        L9a:
            return r2
        L9b:
            r0 = 42
            X.PX9 r3 = new X.PX9
            r3.<init>(r7, r12, r4, r0)
            goto L15
        La4:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        La9:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.hallpass.util.HallPassApiUtil.A01(com.instagram.common.session.UserSession, java.lang.String, java.lang.String, java.util.List, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ae, code lost:
    
        if (r0 == r2) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A02(com.instagram.common.session.UserSession r9, java.lang.String r10, java.util.List r11, java.util.List r12, X.InterfaceC23621Ds r13) {
        /*
            r8 = this;
            r4 = 4
            boolean r0 = X.PX9.A03(r13, r4)
            if (r0 == 0) goto Lb1
            r3 = r13
            X.PX9 r3 = (X.PX9) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lb1
            int r2 = r2 - r1
            r3.A00 = r2
        L15:
            java.lang.Object r0 = r3.A01
            X.1JX r2 = X.C1JX.A02
            int r1 = r3.A00
            r5 = 1
            if (r1 == 0) goto L56
            if (r1 != r5) goto Lbf
            X.AbstractC09560e7.A00(r0)
        L23:
            r2 = r0
            X.3NY r2 = (X.C3NY) r2
            boolean r0 = r2 instanceof X.C3NX
            if (r0 == 0) goto L3c
            X.3NX r2 = (X.C3NX) r2
            java.lang.Object r0 = r2.A00
            X.EAu r0 = (X.C32147EAu) r0
            X.PrY r0 = r0.A00
            if (r0 != 0) goto L45
            X.AbstractC31171DnF.A0w()
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L3c:
            boolean r0 = r2 instanceof X.C194848jk
            if (r0 != 0) goto L49
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L45:
            X.3NX r2 = X.AbstractC25225BEi.A0z(r0)
        L49:
            boolean r0 = r2 instanceof X.C3NX
            if (r0 != 0) goto Lb0
            boolean r0 = r2 instanceof X.C194848jk
            if (r0 == 0) goto Lba
            X.8jk r2 = X.AbstractC25227BEk.A0h()
            return r2
        L56:
            X.AbstractC09560e7.A00(r0)
            org.json.JSONArray r7 = X.AbstractC31171DnF.A0p()
            org.json.JSONArray r6 = X.AbstractC31171DnF.A0p()
            java.util.Iterator r1 = r11.iterator()
        L65:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L6f
            X.AbstractC31172DnG.A1W(r1, r7)
            goto L65
        L6f:
            java.util.Iterator r1 = r12.iterator()
        L73:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L7d
            X.AbstractC31172DnG.A1W(r1, r6)
            goto L73
        L7d:
            X.1Ms r4 = X.AbstractC167017dG.A0c(r9)
            java.lang.String r0 = "stories/hallpass/bulk_update_members/"
            r4.A0B(r0)
            java.lang.String r0 = "hallpass_id"
            r4.A9s(r0, r10)
            java.lang.String r1 = r7.toString()
            java.lang.String r0 = "added_user_ids"
            r4.A9s(r0, r1)
            java.lang.String r1 = r6.toString()
            java.lang.String r0 = "removed_user_ids"
            r4.A9s(r0, r1)
            java.lang.Class<X.EAu> r1 = X.C32147EAu.class
            java.lang.Class<X.FSS> r0 = X.FSS.class
            X.1ON r1 = X.AbstractC25227BEk.A0e(r4, r1, r0)
            r3.A00 = r5
            r0 = 2081267221(0x7c0d9e15, float:2.9412806E36)
            java.lang.Object r0 = r1.A00(r0, r3)
            if (r0 != r2) goto L23
        Lb0:
            return r2
        Lb1:
            r0 = 42
            X.PX9 r3 = new X.PX9
            r3.<init>(r8, r13, r4, r0)
            goto L15
        Lba:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        Lbf:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.hallpass.util.HallPassApiUtil.A02(com.instagram.common.session.UserSession, java.lang.String, java.util.List, java.util.List, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x007b, code lost:
    
        if (r0 == r4) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A03(com.instagram.common.session.UserSession r7, java.lang.String r8, X.InterfaceC23621Ds r9) {
        /*
            r6 = this;
            r3 = 6
            boolean r0 = X.PX9.A03(r9, r3)
            if (r0 == 0) goto L7e
            r5 = r9
            X.PX9 r5 = (X.PX9) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7e
            int r2 = r2 - r1
            r5.A00 = r2
        L15:
            java.lang.Object r0 = r5.A01
            X.1JX r4 = X.C1JX.A02
            int r1 = r5.A00
            r3 = 1
            if (r1 == 0) goto L56
            if (r1 != r3) goto L8b
            X.AbstractC09560e7.A00(r0)
        L23:
            r4 = r0
            X.3NY r4 = (X.C3NY) r4
            boolean r0 = r4 instanceof X.C3NX
            if (r0 == 0) goto L3c
            X.3NX r4 = (X.C3NX) r4
            java.lang.Object r0 = r4.A00
            X.EAa r0 = (X.C32127EAa) r0
            X.E7p r0 = r0.A00
            if (r0 != 0) goto L45
            X.AbstractC31171DnF.A0w()
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L3c:
            boolean r0 = r4 instanceof X.C194848jk
            if (r0 != 0) goto L49
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L45:
            X.3NX r4 = X.AbstractC25225BEi.A0z(r0)
        L49:
            boolean r0 = r4 instanceof X.C3NX
            if (r0 != 0) goto L7d
            boolean r0 = r4 instanceof X.C194848jk
            if (r0 == 0) goto L86
            X.8jk r4 = X.AbstractC25227BEk.A0h()
            return r4
        L56:
            X.AbstractC09560e7.A00(r0)
            X.1Ms r2 = X.AbstractC31177DnL.A0M(r7)
            java.lang.String r0 = "stories/hallpass/hallpass_participation/"
            r2.A0B(r0)
            r1 = 0
            X.Ft3 r0 = new X.Ft3
            r0.<init>(r8, r1)
            r2.A04 = r0
            java.lang.Class<X.EAa> r1 = X.C32127EAa.class
            java.lang.Class<X.FST> r0 = X.FST.class
            X.1ON r1 = X.AbstractC25227BEk.A0e(r2, r1, r0)
            r5.A00 = r3
            r0 = 62624287(0x3bb921f, float:1.102442E-36)
            java.lang.Object r0 = r1.A00(r0, r5)
            if (r0 != r4) goto L23
        L7d:
            return r4
        L7e:
            r0 = 42
            X.PX9 r5 = new X.PX9
            r5.<init>(r6, r9, r3, r0)
            goto L15
        L86:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L8b:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.hallpass.util.HallPassApiUtil.A03(com.instagram.common.session.UserSession, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0080, code lost:
    
        if (r0 == r3) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A04(com.instagram.common.session.UserSession r7, java.lang.String r8, X.InterfaceC23621Ds r9) {
        /*
            r6 = this;
            r3 = 7
            boolean r0 = X.PX9.A03(r9, r3)
            if (r0 == 0) goto L83
            r4 = r9
            X.PX9 r4 = (X.PX9) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L83
            int r2 = r2 - r1
            r4.A00 = r2
        L15:
            java.lang.Object r0 = r4.A01
            X.1JX r3 = X.C1JX.A02
            int r1 = r4.A00
            r5 = 1
            if (r1 == 0) goto L56
            if (r1 != r5) goto L90
            X.AbstractC09560e7.A00(r0)
        L23:
            r3 = r0
            X.3NY r3 = (X.C3NY) r3
            boolean r0 = r3 instanceof X.C3NX
            if (r0 == 0) goto L3c
            X.3NX r3 = (X.C3NX) r3
            java.lang.Object r0 = r3.A00
            X.EAu r0 = (X.C32147EAu) r0
            X.PrY r0 = r0.A00
            if (r0 != 0) goto L45
            X.AbstractC31171DnF.A0w()
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L3c:
            boolean r0 = r3 instanceof X.C194848jk
            if (r0 != 0) goto L49
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L45:
            X.3NX r3 = X.AbstractC25225BEi.A0z(r0)
        L49:
            boolean r0 = r3 instanceof X.C3NX
            if (r0 != 0) goto L82
            boolean r0 = r3 instanceof X.C194848jk
            if (r0 == 0) goto L8b
            X.8jk r3 = X.AbstractC25227BEk.A0h()
            return r3
        L56:
            X.AbstractC09560e7.A00(r0)
            X.1Ms r2 = X.AbstractC31177DnL.A0M(r7)
            java.lang.String r1 = "stories/hallpass/"
            java.lang.String r0 = "/members/"
            java.lang.String r0 = X.AnonymousClass001.A0g(r1, r8, r0)
            r2.A0B(r0)
            X.Ft3 r0 = new X.Ft3
            r0.<init>(r8, r5)
            r2.A04 = r0
            java.lang.Class<X.EAu> r1 = X.C32147EAu.class
            java.lang.Class<X.FSS> r0 = X.FSS.class
            X.1ON r1 = X.AbstractC25227BEk.A0e(r2, r1, r0)
            r4.A00 = r5
            r0 = 197584665(0xbc6e719, float:7.661454E-32)
            java.lang.Object r0 = r1.A00(r0, r4)
            if (r0 != r3) goto L23
        L82:
            return r3
        L83:
            r0 = 42
            X.PX9 r4 = new X.PX9
            r4.<init>(r6, r9, r3, r0)
            goto L15
        L8b:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L90:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.hallpass.util.HallPassApiUtil.A04(com.instagram.common.session.UserSession, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A05(com.instagram.common.session.UserSession r6, java.lang.String r7, X.InterfaceC23621Ds r8) {
        /*
            r5 = this;
            r3 = 9
            boolean r0 = X.PX9.A03(r8, r3)
            if (r0 == 0) goto L50
            r4 = r8
            X.PX9 r4 = (X.PX9) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L50
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r0 = r4.A01
            X.1JX r3 = X.C1JX.A02
            int r1 = r4.A00
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L5d
            X.AbstractC09560e7.A00(r0)
        L24:
            r3 = r0
            boolean r1 = r0 instanceof X.C3NX
            if (r1 != 0) goto L31
            boolean r0 = r0 instanceof X.C194848jk
            if (r0 == 0) goto L58
            X.8jk r3 = X.AbstractC25227BEk.A0h()
        L31:
            return r3
        L32:
            X.AbstractC09560e7.A00(r0)
            X.1Ms r1 = X.AbstractC167017dG.A0c(r6)
            java.lang.String r0 = "stories/hallpass/remove_self/"
            r1.A0B(r0)
            java.lang.String r0 = "hallpass_id"
            X.1ON r1 = X.AbstractC31178DnM.A0K(r1, r0, r7)
            r4.A00 = r2
            r0 = 858569580(0x332cbb6c, float:4.021733E-8)
            java.lang.Object r0 = r1.A00(r0, r4)
            if (r0 != r3) goto L24
            return r3
        L50:
            r0 = 42
            X.PX9 r4 = new X.PX9
            r4.<init>(r5, r8, r3, r0)
            goto L16
        L58:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L5d:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.hallpass.util.HallPassApiUtil.A05(com.instagram.common.session.UserSession, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0098, code lost:
    
        if (r0 == r4) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A06(com.instagram.common.session.UserSession r7, X.InterfaceC23621Ds r8) {
        /*
            r6 = this;
            r3 = 38
            boolean r0 = X.MAH.A01(r8, r3)
            if (r0 == 0) goto L9b
            r5 = r8
            X.MAH r5 = (X.MAH) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L9b
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r0 = r5.A02
            X.1JX r4 = X.C1JX.A02
            int r1 = r5.A00
            r3 = 1
            if (r1 == 0) goto L75
            if (r1 != r3) goto La7
            java.lang.Object r7 = r5.A01
            com.instagram.common.session.UserSession r7 = (com.instagram.common.session.UserSession) r7
            X.AbstractC09560e7.A00(r0)
        L28:
            r4 = r0
            X.3NY r4 = (X.C3NY) r4
            boolean r0 = r4 instanceof X.C3NX
            if (r0 == 0) goto L41
            X.3NX r4 = (X.C3NX) r4
            java.lang.Object r0 = r4.A00
            X.EAI r0 = (X.EAI) r0
            X.E7q r3 = r0.A00
            if (r3 != 0) goto L4a
            X.AbstractC31171DnF.A0w()
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L41:
            boolean r0 = r4 instanceof X.C194848jk
            if (r0 != 0) goto L68
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L4a:
            X.1Ai r1 = X.AbstractC23021Ah.A00(r7)
            java.util.List r0 = r3.A00
            int r2 = r0.size()
            X.0xo r1 = X.AbstractC166987dD.A0w(r1)
            r0 = 2432(0x980, float:3.408E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            r1.E7D(r0, r2)
            r1.apply()
            X.3NX r4 = X.AbstractC25225BEi.A0z(r3)
        L68:
            boolean r0 = r4 instanceof X.C3NX
            if (r0 != 0) goto L9a
            boolean r0 = r4 instanceof X.C194848jk
            if (r0 == 0) goto La2
            X.8jk r4 = X.AbstractC25227BEk.A0h()
            return r4
        L75:
            X.AbstractC09560e7.A00(r0)
            X.1Ms r2 = X.AbstractC31177DnL.A0M(r7)
            r0 = 3140(0xc44, float:4.4E-42)
            java.lang.String r0 = X.AbstractC111324zv.A00(r0)
            r2.A0B(r0)
            java.lang.Class<X.EAI> r1 = X.EAI.class
            java.lang.Class<X.FSU> r0 = X.FSU.class
            X.1ON r1 = X.AbstractC25227BEk.A0e(r2, r1, r0)
            r5.A01 = r7
            r5.A00 = r3
            r0 = 1241356902(0x49fd9a66, float:2077516.8)
            java.lang.Object r0 = r1.A00(r0, r5)
            if (r0 != r4) goto L28
        L9a:
            return r4
        L9b:
            X.MAH r5 = new X.MAH
            r5.<init>(r6, r8, r3)
            goto L16
        La2:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        La7:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.hallpass.util.HallPassApiUtil.A06(com.instagram.common.session.UserSession, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0074, code lost:
    
        if (r0 == r4) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A07(com.instagram.common.session.UserSession r7, X.InterfaceC23621Ds r8) {
        /*
            r6 = this;
            r3 = 8
            boolean r0 = X.PX9.A03(r8, r3)
            if (r0 == 0) goto L77
            r5 = r8
            X.PX9 r5 = (X.PX9) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L77
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r0 = r5.A01
            X.1JX r4 = X.C1JX.A02
            int r1 = r5.A00
            r3 = 1
            if (r1 == 0) goto L57
            if (r1 != r3) goto L84
            X.AbstractC09560e7.A00(r0)
        L24:
            r4 = r0
            X.3NY r4 = (X.C3NY) r4
            boolean r0 = r4 instanceof X.C3NX
            if (r0 == 0) goto L3d
            X.3NX r4 = (X.C3NX) r4
            java.lang.Object r0 = r4.A00
            X.EAJ r0 = (X.EAJ) r0
            X.PrZ r0 = r0.A00
            if (r0 != 0) goto L46
            X.AbstractC31171DnF.A0w()
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L3d:
            boolean r0 = r4 instanceof X.C194848jk
            if (r0 != 0) goto L4a
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L46:
            X.3NX r4 = X.AbstractC25225BEi.A0z(r0)
        L4a:
            boolean r0 = r4 instanceof X.C3NX
            if (r0 != 0) goto L76
            boolean r0 = r4 instanceof X.C194848jk
            if (r0 == 0) goto L7f
            X.8jk r4 = X.AbstractC25227BEk.A0h()
            return r4
        L57:
            X.AbstractC09560e7.A00(r0)
            X.1Ms r2 = X.AbstractC31177DnL.A0M(r7)
            java.lang.String r0 = "stories/hallpass/suggested_users/"
            r2.A0B(r0)
            java.lang.Class<X.EAJ> r1 = X.EAJ.class
            java.lang.Class<X.FSV> r0 = X.FSV.class
            X.1ON r1 = X.AbstractC25227BEk.A0e(r2, r1, r0)
            r5.A00 = r3
            r0 = 210658095(0xc8e632f, float:2.1938258E-31)
            java.lang.Object r0 = r1.A00(r0, r5)
            if (r0 != r4) goto L24
        L76:
            return r4
        L77:
            r0 = 42
            X.PX9 r5 = new X.PX9
            r5.<init>(r6, r8, r3, r0)
            goto L16
        L7f:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L84:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.hallpass.util.HallPassApiUtil.A07(com.instagram.common.session.UserSession, X.1Ds):java.lang.Object");
    }
}
