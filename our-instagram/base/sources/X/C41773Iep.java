package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.api.schemas.MediaOptionStyle;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.Iep, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41773Iep {
    public InterfaceC50122Sb A00;
    public final int A01;
    public final Context A02;
    public final Fragment A03;
    public final UserSession A04;
    public final InterfaceC114705Ga A05;
    public final C38321qM A06;
    public final InterfaceC60442pS A07;
    public final C75113Zb A08;
    public final AnonymousClass341 A09;
    public final C57332k8 A0A;
    public final C1M1 A0B;
    public final WEz A0C;
    public final InterfaceC09390do A0D = AbstractC09440dt.A01(new J7K(this, 32));
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;

    public static final void A00(MediaOptionStyle mediaOptionStyle, C41773Iep c41773Iep, EnumC39627Hel enumC39627Hel, CharSequence charSequence, ArrayList arrayList) {
        C14360o3.A0B(charSequence, 2);
        MediaOptionStyle mediaOptionStyle2 = MediaOptionStyle.A06;
        if (mediaOptionStyle != null) {
            mediaOptionStyle2 = mediaOptionStyle;
        }
        arrayList.add(new IGU(mediaOptionStyle2, enumC39627Hel, charSequence));
        c41773Iep.A0C(enumC39627Hel, C05F.A01);
    }

    public static final void A01(C41773Iep c41773Iep, EnumC39627Hel enumC39627Hel, ArrayList arrayList, int i) {
        A00(MediaOptionStyle.A06, c41773Iep, enumC39627Hel, AbstractC166997dE.A0p(c41773Iep.A02, i), arrayList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004c, code lost:
    
        if (X.AbstractC75373a4.A02(r3) != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(X.C41773Iep r5, java.util.ArrayList r6) {
        /*
            com.instagram.common.session.UserSession r3 = r5.A04
            X.1qM r4 = r5.A06
            boolean r2 = r4.Cff()
            boolean r1 = r4.A5A()
            java.lang.String r0 = X.AbstractC25233BEq.A0o(r4)
            if (r2 == 0) goto L1a
            if (r1 == 0) goto L1a
            boolean r0 = X.C2TN.A05(r3, r0)
            if (r0 == 0) goto L2c
        L1a:
            boolean r0 = X.C2TN.A02(r3, r4)
            if (r0 != 0) goto L55
            boolean r0 = X.AbstractC75373a4.A08(r3, r4)
            if (r0 != 0) goto L2c
            boolean r0 = X.AbstractC75373a4.A0A(r3, r4)
            if (r0 == 0) goto L55
        L2c:
            r1 = 1
        L2d:
            boolean r0 = r4.CdW()
            if (r0 != 0) goto L54
            if (r1 == 0) goto L54
            X.Hel r1 = X.EnumC39627Hel.A2U
            r0 = 2131976739(0x7f136223, float:1.9590607E38)
            A01(r5, r1, r6, r0)
            X.Hel r2 = X.EnumC39627Hel.A2T
            boolean r0 = X.AbstractC75373a4.A04(r3)
            if (r0 != 0) goto L4e
            boolean r1 = X.AbstractC75373a4.A02(r3)
            r0 = 2131954790(0x7f130c66, float:1.954609E38)
            if (r1 == 0) goto L51
        L4e:
            r0 = 2131965996(0x7f13382c, float:1.9568818E38)
        L51:
            A01(r5, r2, r6, r0)
        L54:
            return
        L55:
            r1 = 0
            goto L2d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41773Iep.A02(X.Iep, java.util.ArrayList):void");
    }

    public static final void A03(C41773Iep c41773Iep, ArrayList arrayList) {
        EnumC39627Hel enumC39627Hel = EnumC39627Hel.A0Q;
        if (c41773Iep.A0B(enumC39627Hel)) {
            if (c41773Iep.A06.A4o()) {
                enumC39627Hel = EnumC39627Hel.A0P;
            }
            A01(c41773Iep, enumC39627Hel, arrayList, 2131956837);
        }
    }

    public static final void A04(C41773Iep c41773Iep, ArrayList arrayList) {
        EnumC39627Hel enumC39627Hel = EnumC39627Hel.A1G;
        if (c41773Iep.A0B(enumC39627Hel) && AbstractC54241NyM.A00(c41773Iep.A04)) {
            A01(c41773Iep, enumC39627Hel, arrayList, 2131971201);
        }
    }

    public static final void A05(C41773Iep c41773Iep, ArrayList arrayList) {
        if (!c41773Iep.A06.A5h()) {
            EnumC39627Hel enumC39627Hel = EnumC39627Hel.A1n;
            if (c41773Iep.A0B(enumC39627Hel)) {
                A01(c41773Iep, enumC39627Hel, arrayList, 2131973727);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0027 A[EDGE_INSN: B:39:0x0027->B:40:0x0027 BREAK  A[LOOP:0: B:14:0x0039->B:35:0x0039], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A06(X.C41773Iep r6, java.util.ArrayList r7) {
        /*
            X.1qM r4 = r6.A06
            com.instagram.common.session.UserSession r3 = r6.A04
            boolean r0 = X.C37855Gl9.A0C(r3, r4)
            if (r0 == 0) goto L34
            boolean r0 = r4.A5x()
            if (r0 == 0) goto L74
            X.Hel r1 = X.EnumC39627Hel.A0J
            r0 = 2131972163(0x7f135043, float:1.9581326E38)
        L15:
            A01(r6, r1, r7, r0)
        L18:
            X.2Sb r0 = r6.A00
            if (r0 != 0) goto L27
            boolean r0 = r7 instanceof java.util.Collection
            r5 = 1
            if (r0 == 0) goto L35
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L35
        L27:
            X.2pS r2 = r6.A07
            X.Hih r1 = X.EnumC39652Hih.A09
            X.3Zb r0 = r6.A08
            int r0 = r0.getPosition()
            X.AbstractC37670Gi3.A0Q(r1, r3, r4, r2, r0)
        L34:
            return
        L35:
            java.util.Iterator r2 = r7.iterator()
        L39:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L27
            java.lang.Object r0 = r2.next()
            X.IGU r0 = (X.IGU) r0
            X.Hel r1 = r0.A01
            X.Hel r0 = X.EnumC39627Hel.A1u
            if (r1 != r0) goto L39
            boolean r0 = r4.A5x()
            if (r0 == 0) goto L39
            X.1rF r0 = r4.A0C
            X.3p3 r0 = r0.BPh()
            if (r0 == 0) goto L39
            java.lang.Boolean r0 = r0.CXN()
            boolean r0 = X.AbstractC166997dE.A1Z(r0, r5)
            if (r0 == 0) goto L39
            java.lang.String r2 = r4.A2u()
            if (r2 == 0) goto L8c
            androidx.fragment.app.Fragment r1 = r6.A03
            java.lang.String r0 = "feed_media_prefetch"
            X.2Sa r0 = X.C41738IeA.A02(r1, r3, r2, r0)
            r6.A00 = r0
            goto L27
        L74:
            boolean r0 = r4.A5c()
            if (r0 == 0) goto L80
            X.Hel r1 = X.EnumC39627Hel.A0J
            r0 = 2131972168(0x7f135048, float:1.9581336E38)
            goto L15
        L80:
            boolean r0 = r4.A5P()
            if (r0 == 0) goto L18
            X.Hel r1 = X.EnumC39627Hel.A0J
            r0 = 2131972157(0x7f13503d, float:1.9581314E38)
            goto L15
        L8c:
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41773Iep.A06(X.Iep, java.util.ArrayList):void");
    }

    public static final void A07(C41773Iep c41773Iep, ArrayList arrayList) {
        InterfaceC84163p3 BPh;
        InterfaceC84163p3 A1P;
        InterfaceC84163p3 A1P2;
        C4GI BZr;
        C38321qM c38321qM = c41773Iep.A06;
        if (c38321qM.A65()) {
            if (!c38321qM.A5x()) {
                if (c38321qM.Cff()) {
                    if (!C18U.A06(C06090Tz.A05, c41773Iep.A04, 36327438979971661L)) {
                        return;
                    }
                } else {
                    return;
                }
            }
            Context context = c41773Iep.A02;
            UserSession userSession = c41773Iep.A04;
            AbstractC226039yM.A00(context, userSession);
            A01(c41773Iep, EnumC39627Hel.A1u, arrayList, 2131966895);
            if ((arrayList instanceof Collection) && arrayList.isEmpty()) {
                return;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((IGU) it.next()).A01 == EnumC39627Hel.A0J && ((c38321qM.A5P() && (((A1P = c38321qM.A1P()) != null && C14360o3.A0K(A1P.CXM(), true)) || ((A1P2 = c38321qM.A1P()) != null && (BZr = A1P2.BZr()) != null && C14360o3.A0K(BZr.CXM(), true)))) || (c38321qM.A5x() && (BPh = c38321qM.A0C.BPh()) != null && C14360o3.A0K(BPh.CXM(), true)))) {
                    String A2u = c38321qM.A2u();
                    if (A2u != null) {
                        c41773Iep.A00 = C41738IeA.A02(c41773Iep.A03, userSession, A2u, "feed_media_prefetch");
                        return;
                    }
                    throw AbstractC166997dE.A0g();
                }
            }
        }
    }

    public static final void A08(C41773Iep c41773Iep, ArrayList arrayList) {
        EnumC124565kK enumC124565kK;
        UserSession userSession = c41773Iep.A04;
        C38321qM c38321qM = c41773Iep.A06;
        if (C124575kL.A02(userSession, c38321qM)) {
            String moduleName = c41773Iep.A07.getModuleName();
            String A2u = c38321qM.A2u();
            if (c38321qM.A5P()) {
                enumC124565kK = EnumC124565kK.REEL;
            } else {
                enumC124565kK = EnumC124565kK.POST;
            }
            AbstractC86593tX.A0e(enumC124565kK, c38321qM.A1J(), userSession, null, moduleName, MSV.A00(453), A2u);
            A01(c41773Iep, EnumC39627Hel.A0n, arrayList, 2131952641);
        }
    }

    public static final void A09(C41773Iep c41773Iep, ArrayList arrayList, boolean z) {
        if (z && c41773Iep.A08.A27) {
            A01(c41773Iep, EnumC39627Hel.A1Z, arrayList, 2131972401);
        }
    }

    public static final boolean A0A(C41773Iep c41773Iep) {
        if (c41773Iep.A06.CdW()) {
            return false;
        }
        return AbstractC31177DnL.A1U(C06090Tz.A05, c41773Iep.A04, 36312170371941311L);
    }

    private final boolean A0B(EnumC39627Hel enumC39627Hel) {
        boolean z;
        C38321qM c38321qM = this.A06;
        UserSession userSession = this.A04;
        User A2E = c38321qM.A2E(userSession);
        if (A2E != null && (A2E.A0M() == C05F.A01 || A2E.equals(AbstractC166987dD.A10(userSession)) || enumC39627Hel == EnumC39627Hel.A0Q || enumC39627Hel == EnumC39627Hel.A0P || enumC39627Hel == EnumC39627Hel.A1n || enumC39627Hel == EnumC39627Hel.A1G)) {
            z = true;
        } else {
            z = false;
        }
        return IAK.A00(userSession, c38321qM, z);
    }

    public C41773Iep(Context context, Fragment fragment, UserSession userSession, InterfaceC114705Ga interfaceC114705Ga, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, C75113Zb c75113Zb, AnonymousClass341 anonymousClass341, C57332k8 c57332k8, C1M1 c1m1, WEz wEz, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A06 = c38321qM;
        this.A08 = c75113Zb;
        this.A09 = anonymousClass341;
        this.A0A = c57332k8;
        this.A0C = wEz;
        this.A0B = c1m1;
        this.A05 = interfaceC114705Ga;
        this.A07 = interfaceC60442pS;
        this.A04 = userSession;
        this.A02 = context;
        this.A03 = fragment;
        this.A0E = z;
        this.A01 = i;
        this.A0H = z2;
        this.A0G = z3;
        this.A0F = z4;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000a. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b7  */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.0Zx, X.MnJ] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0C(X.EnumC39627Hel r9, java.lang.Integer r10) {
        /*
            r8 = this;
            int r1 = r9.ordinal()
            r0 = 157(0x9d, float:2.2E-43)
            java.lang.String r7 = X.AbstractC111324zv.A00(r0)
            switch(r1) {
                case 18: goto L68;
                case 28: goto L95;
                case 44: goto L98;
                case 45: goto L9b;
                case 46: goto L68;
                case 47: goto Le;
                case 49: goto L1b;
                case 51: goto L1b;
                case 52: goto L43;
                case 53: goto L43;
                case 57: goto L9e;
                default: goto Ld;
            }
        Ld:
            return
        Le:
            java.lang.Integer r0 = X.C05F.A01
            if (r10 != r0) goto Ld
            com.instagram.common.session.UserSession r6 = r8.A04
            X.82G r5 = X.C82G.A0F
            X.MU0 r4 = X.MU0.UNAVAILABLE
            X.MU1 r3 = X.MU1.FEED
            goto L4f
        L1b:
            java.lang.Integer r0 = X.C05F.A00
            if (r10 != r0) goto L38
            com.instagram.common.session.UserSession r6 = r8.A04
            X.82G r5 = X.C82G.A0U
            X.MU0 r4 = X.MU0.SHARE_CLICK
        L25:
            X.MU1 r3 = X.MU1.REELS
            X.MnJ r2 = new X.MnJ
            r2.<init>()
            X.1qM r0 = r8.A06
            java.lang.String r1 = r0.getId()
            java.lang.String r0 = "media_id"
            r2.A06(r0, r1)
            goto L64
        L38:
            java.lang.Integer r0 = X.C05F.A01
            if (r10 != r0) goto Ld
            com.instagram.common.session.UserSession r6 = r8.A04
            X.82G r5 = X.C82G.A0U
            X.MU0 r4 = X.MU0.VIEW
            goto L25
        L43:
            java.lang.Integer r0 = X.C05F.A01
            if (r10 != r0) goto Ld
            com.instagram.common.session.UserSession r6 = r8.A04
            X.82G r5 = X.C82G.A0U
            X.MU0 r4 = X.MU0.UNAVAILABLE
            X.MU1 r3 = X.MU1.REELS
        L4f:
            X.MnJ r2 = new X.MnJ
            r2.<init>()
            X.1qM r0 = r8.A06
            java.lang.String r1 = r0.getId()
            java.lang.String r0 = "media_id"
            r2.A06(r0, r1)
            java.lang.String r0 = "unavailable_reason"
            r2.A06(r0, r7)
        L64:
            X.AbstractC50568MTz.A00(r4, r3, r5, r2, r6)
            return
        L68:
            java.lang.Integer r0 = X.C05F.A00
            if (r10 != r0) goto L8a
            com.instagram.common.session.UserSession r6 = r8.A04
            X.82G r5 = X.C82G.A0F
            X.MU0 r4 = X.MU0.SHARE_CLICK
        L72:
            X.MU1 r3 = X.MU1.FEED
            X.MnJ r2 = new X.MnJ
            r2.<init>()
            X.1qM r0 = r8.A06
            java.lang.String r1 = r0.getId()
            java.lang.String r0 = "media_id"
            r2.A06(r0, r1)
            X.AbstractC50568MTz.A00(r4, r3, r5, r2, r6)
        L87:
            java.lang.String r5 = "share"
            goto La0
        L8a:
            java.lang.Integer r0 = X.C05F.A01
            if (r10 != r0) goto L87
            com.instagram.common.session.UserSession r6 = r8.A04
            X.82G r5 = X.C82G.A0F
            X.MU0 r4 = X.MU0.VIEW
            goto L72
        L95:
            java.lang.String r5 = "copy_link"
            goto La0
        L98:
            java.lang.String r5 = "messenger"
            goto La0
        L9b:
            java.lang.String r5 = "whatsapp"
            goto La0
        L9e:
            java.lang.String r5 = "system_share_sheet"
        La0:
            int r1 = r10.intValue()
            r0 = 0
            if (r1 == r0) goto Lb7
            com.instagram.common.session.UserSession r3 = r8.A04
            X.2pS r2 = r8.A07
            X.1qM r0 = r8.A06
            java.lang.String r1 = r0.getId()
            java.lang.String r0 = "feed_action_sheet"
            X.AbstractC73317Y7a.A0E(r2, r3, r1, r0, r5)
            return
        Lb7:
            com.instagram.common.session.UserSession r2 = r8.A04
            X.2pS r1 = r8.A07
            X.1qM r0 = r8.A06
            java.lang.String r3 = r0.getId()
            java.lang.String r6 = X.AbstractC25226BEj.A1G(r0)
            java.lang.String r4 = "feed_action_sheet"
            X.AbstractC73317Y7a.A0G(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41773Iep.A0C(X.Hel, java.lang.Integer):void");
    }
}
