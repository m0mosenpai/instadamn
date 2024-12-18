package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.feed.media.CreativeConfigIntf;
import com.instagram.feed.media.EffectPreviewIntf;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.search.common.analytics.SearchContext;
import com.instagram.user.model.User;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes5.dex */
public final class BLL implements InterfaceC31162Dn6, InterfaceC31059Dl1, InterfaceC31044Dki, InterfaceC31015DkE, InterfaceC30981Djc {
    public InterfaceC16820sZ A00;
    public InterfaceC16620sF A01;
    public InterfaceC16820sZ A02;
    public InterfaceC16820sZ A03;
    public InterfaceC16820sZ A04;
    public InterfaceC16660sJ A05;
    public InterfaceC16660sJ A06;
    public InterfaceC16660sJ A07;
    public InterfaceC16660sJ A08;
    public InterfaceC16660sJ A09;
    public InterfaceC16660sJ A0A;
    public InterfaceC16660sJ A0B;
    public InterfaceC16660sJ A0C;
    public InterfaceC16660sJ A0D;
    public InterfaceC16660sJ A0E;
    public final UserSession A0F;
    public final InterfaceC60442pS A0G;
    public final C37604Ggz A0H;
    public final SearchContext A0I;
    public final BMA A0J;
    public final IG5 A0K;
    public final String A0L;
    public final /* synthetic */ D06 A0M = new Object();
    public final /* synthetic */ BLN A0N;
    public final /* synthetic */ BLO A0O;
    public final /* synthetic */ BLM A0P;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0297, code lost:
    
        if (r4 == null) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x010a, code lost:
    
        if (r5 != r7) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0123, code lost:
    
        if (r15 == null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0125, code lost:
    
        r15 = X.C16930sl.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0127, code lost:
    
        r16 = r12.A27();
        r11 = r2.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x012d, code lost:
    
        if (r11 == null) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x012f, code lost:
    
        X.AbstractC37670Gi3.A0R(X.EnumC39652Hih.A0E, r2.A03, r12, r2.A04, r2.A05.A01, r2.A06.A00, r13.getPosition());
        r11.invoke(r12, r13, r14, r15, r16, r17, X.C8JW.A09, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x011d, code lost:
    
        if (r6 != null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0062, code lost:
    
        if (r4 != null) goto L22;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0011. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02d3  */
    /* JADX WARN: Type inference failed for: r7v0, types: [boolean] */
    @Override // X.InterfaceC31162Dn6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void CK8(X.C120985dq r28, X.BPP r29, int r30) {
        /*
            Method dump skipped, instructions count: 810
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BLL.CK8(X.5dq, X.BPP, int):void");
    }

    @Override // X.InterfaceC31162Dn6
    public final void E5h(C38321qM c38321qM) {
        List B0S;
        EffectPreviewIntf effectPreviewIntf;
        String effectId;
        C14360o3.A0B(c38321qM, 0);
        BMA bma = this.A0J;
        CreativeConfigIntf Asm = c38321qM.A0C.Asm();
        if (Asm != null && (B0S = Asm.B0S()) != null && (effectPreviewIntf = (EffectPreviewIntf) AbstractC001800i.A0J(B0S)) != null && (effectId = effectPreviewIntf.getEffectId()) != null) {
            bma.A00.A00(bma.A01, "on_touch_down", effectId, bma.A02.getModuleName());
        }
    }

    @Override // X.InterfaceC30981Djc
    public final void EXA(InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(interfaceC16660sJ, 0);
        this.A0P.A00 = interfaceC16660sJ;
    }

    @Override // X.InterfaceC31044Dki
    public final void EXJ(InterfaceC16620sF interfaceC16620sF) {
        C14360o3.A0B(interfaceC16620sF, 0);
        this.A0O.A00 = interfaceC16620sF;
    }

    @Override // X.InterfaceC31015DkE
    public final void EXq(InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(interfaceC16660sJ, 0);
        this.A0M.A00 = interfaceC16660sJ;
    }

    @Override // X.InterfaceC31015DkE
    public final void EXr(InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(interfaceC16660sJ, 0);
        this.A0M.A01 = interfaceC16660sJ;
    }

    @Override // X.InterfaceC31059Dl1
    public final void EXs(InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(interfaceC16660sJ, 0);
        this.A0N.A00 = interfaceC16660sJ;
    }

    @Override // X.InterfaceC31059Dl1
    public final void EXv(InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(interfaceC16660sJ, 0);
        this.A0N.A01 = interfaceC16660sJ;
    }

    @Override // X.InterfaceC31059Dl1
    public final void EXw(InterfaceC16610sE interfaceC16610sE) {
        C14360o3.A0B(interfaceC16610sE, 0);
        this.A0N.A04 = interfaceC16610sE;
    }

    @Override // X.InterfaceC31059Dl1
    public final void EXx(InterfaceC16620sF interfaceC16620sF) {
        C14360o3.A0B(interfaceC16620sF, 0);
        this.A0N.A03 = interfaceC16620sF;
    }

    @Override // X.InterfaceC31059Dl1
    public final void EXy(InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(interfaceC16660sJ, 0);
        this.A0N.A02 = interfaceC16660sJ;
    }

    @Override // X.InterfaceC31044Dki
    public final void EY0(InterfaceC16590sC interfaceC16590sC) {
        C14360o3.A0B(interfaceC16590sC, 0);
        this.A0O.A01 = interfaceC16590sC;
    }

    @Override // X.InterfaceC31044Dki
    public final void EY1(C0s8 c0s8) {
        C14360o3.A0B(c0s8, 0);
        this.A0O.A02 = c0s8;
    }

    public static List A01(CreativeConfigIntf creativeConfigIntf, BLO blo) {
        return AbstractC121575f6.A07(blo.A03.deviceSession.A06(), creativeConfigIntf);
    }

    @Override // X.InterfaceC31162Dn6
    public final void CKA(C120985dq c120985dq, BPP bpp, InterfaceC30862Dhb interfaceC30862Dhb, int i) {
        String obj;
        AbstractC25233BEq.A0v(0, bpp, c120985dq, interfaceC30862Dhb);
        if (interfaceC30862Dhb instanceof D07) {
            D07 d07 = (D07) interfaceC30862Dhb;
            CZH.A01(C8i.ATTRIBUTE_IMPRESSION, d07.A00, this.A0F, d07.A01, "reels");
        } else if (!(interfaceC30862Dhb instanceof BQE)) {
            throw B4Z.A00();
        }
        BQL A00 = A00(bpp.A02);
        InterfaceC60442pS interfaceC60442pS = this.A0G;
        UserSession userSession = this.A0F;
        C37604Ggz c37604Ggz = this.A0H;
        C38321qM c38321qM = bpp.A00;
        C75113Zb c75113Zb = bpp.A01;
        AbstractC37670Gi3.A06(EnumC120795dP.A02, A00, c120985dq, interfaceC60442pS, userSession, c38321qM, c37604Ggz, Integer.valueOf(i), c75113Zb.getPosition());
        if (A00 == BQL.A0x) {
            AbstractC41775Ier.A04(interfaceC60442pS, userSession, c38321qM, this.A0L);
        }
        if (A00 == BQL.A0N) {
            String id = c38321qM.getId();
            String str = "";
            if (id == null) {
                id = "";
            }
            C09530e4 A1L = AbstractC166987dD.A1L("post_igid", id);
            InterfaceC84473pq BGH = c38321qM.A0C.BGH();
            String str2 = null;
            if (BGH != null && (obj = Long.valueOf(BGH.BF4()).toString()) != null) {
                str = obj;
            }
            LinkedHashMap A0p = AbstractC25233BEq.A0p("product_id", str, A1L);
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC60442pS, userSession), "ig_ads_conversion_funnel");
            A0f.A8R(EnumC53368NjJ.BIO_IG_REELS, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A0f.AAP("event", "buyer_view_inquiry_cta");
            A0f.AAP("consumer_igid", userSession.userId);
            User A2E = c38321qM.A2E(userSession);
            if (A2E != null) {
                str2 = A2E.getId();
            }
            A0f.AAP("seller_igid", str2);
            A0f.A9M("extra_data", A0p);
            A0f.Cht();
        }
        AnonymousClass426.A00.A09(userSession, c38321qM.getId(), AbstractC76193bO.A04(userSession, c38321qM, c75113Zb));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.D06] */
    public BLL(UserSession userSession, InterfaceC60442pS interfaceC60442pS, SearchContext searchContext, BMA bma, C37604Ggz c37604Ggz, IG5 ig5, String str) {
        this.A0P = new BLM(userSession, interfaceC60442pS, c37604Ggz);
        this.A0N = new BLN(interfaceC60442pS, userSession, searchContext, c37604Ggz, ig5);
        this.A0O = new BLO(userSession, interfaceC60442pS, c37604Ggz, ig5);
        this.A0G = interfaceC60442pS;
        this.A0F = userSession;
        this.A0J = bma;
        this.A0I = searchContext;
        this.A0H = c37604Ggz;
        this.A0L = str;
        this.A0K = ig5;
    }

    public static final BQL A00(EnumC25465BOe enumC25465BOe) {
        switch (enumC25465BOe.ordinal()) {
            case 0:
                return BQL.A02;
            case 1:
                return BQL.A0x;
            case 2:
                return BQL.A0o;
            case 3:
                return BQL.A1J;
            case 4:
                return BQL.A0f;
            case 5:
                return BQL.A0i;
            case 6:
                return BQL.A0p;
            case 7:
                return BQL.A1Z;
            case 8:
                return BQL.A1M;
            case 9:
                return BQL.A1H;
            case 10:
                return BQL.A1T;
            case 11:
            case 16:
            case 17:
                return BQL.A0u;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return BQL.A0Y;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return BQL.A0g;
            case 14:
                return BQL.A0c;
            case Process.SIGTERM /* 15 */:
                return BQL.A0q;
            case 18:
                return BQL.A0j;
            case Process.SIGSTOP /* 19 */:
                return BQL.A0a;
            case 20:
                return BQL.A04;
            case 21:
            case 22:
                return BQL.A1a;
            case 23:
                return BQL.A0N;
            case 24:
                return BQL.A03;
            default:
                throw B4Z.A00();
        }
    }

    @Override // X.InterfaceC31162Dn6
    public final void EXF(InterfaceC16660sJ interfaceC16660sJ) {
        this.A05 = interfaceC16660sJ;
    }

    @Override // X.InterfaceC31162Dn6
    public final void EXP(InterfaceC16620sF interfaceC16620sF) {
        this.A01 = interfaceC16620sF;
    }

    @Override // X.InterfaceC31162Dn6
    public final void EXQ(InterfaceC16820sZ interfaceC16820sZ) {
        this.A00 = interfaceC16820sZ;
    }

    @Override // X.InterfaceC31162Dn6
    public final void EXS(InterfaceC16660sJ interfaceC16660sJ) {
        this.A06 = interfaceC16660sJ;
    }

    @Override // X.InterfaceC31162Dn6
    public final void EXV(InterfaceC16660sJ interfaceC16660sJ) {
        this.A07 = interfaceC16660sJ;
    }

    @Override // X.InterfaceC31162Dn6
    public final void EXW(InterfaceC16660sJ interfaceC16660sJ) {
        this.A08 = interfaceC16660sJ;
    }

    @Override // X.InterfaceC31162Dn6
    public final void EXX(InterfaceC16660sJ interfaceC16660sJ) {
        this.A09 = interfaceC16660sJ;
    }

    @Override // X.InterfaceC31162Dn6
    public final void EXY(InterfaceC16820sZ interfaceC16820sZ) {
        this.A02 = interfaceC16820sZ;
    }

    @Override // X.InterfaceC31162Dn6
    public final void EXa(InterfaceC16820sZ interfaceC16820sZ) {
        this.A03 = interfaceC16820sZ;
    }

    @Override // X.InterfaceC31162Dn6
    public final void EXb(InterfaceC16660sJ interfaceC16660sJ) {
        this.A0A = interfaceC16660sJ;
    }

    @Override // X.InterfaceC31162Dn6
    public final void EXl(InterfaceC16660sJ interfaceC16660sJ) {
        this.A0B = interfaceC16660sJ;
    }

    @Override // X.InterfaceC31162Dn6
    public final void EXn(InterfaceC16820sZ interfaceC16820sZ) {
        this.A04 = interfaceC16820sZ;
    }

    @Override // X.InterfaceC31162Dn6
    public final void EXu(InterfaceC16660sJ interfaceC16660sJ) {
        this.A0C = interfaceC16660sJ;
    }

    @Override // X.InterfaceC31162Dn6
    public final void EXz(InterfaceC16660sJ interfaceC16660sJ) {
        this.A0D = interfaceC16660sJ;
    }

    @Override // X.InterfaceC31162Dn6
    public final void EY2(InterfaceC16660sJ interfaceC16660sJ) {
        this.A0E = interfaceC16660sJ;
    }
}
