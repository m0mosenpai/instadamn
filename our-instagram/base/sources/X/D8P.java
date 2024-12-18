package X;

import android.content.Context;
import android.widget.PopupWindow;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.api.schemas.AdFormatType;
import com.instagram.common.session.UserSession;
import com.instagram.creation.drafts.model.clips.ClipsDraftPreviewItemRepository;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.User;
import java.lang.ref.WeakReference;

/* loaded from: classes5.dex */
public final class D8P extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D8P(int i, Object obj, Object obj2, Object obj3) {
        super(0);
        this.A00 = i;
        this.A02 = obj;
        this.A03 = obj2;
        this.A01 = obj3;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        WeakReference weakReference;
        int i;
        WeakReference A16;
        C43742JWb c43742JWb;
        Object obj;
        C25454BNt c25454BNt;
        InterfaceC74253Vg interfaceC74253Vg;
        C43743JWc c43743JWc;
        ClipsDraftPreviewItemRepository clipsDraftPreviewItemRepository;
        String id;
        Object obj2;
        int i2;
        switch (this.A00) {
            case 0:
                C75113Zb c75113Zb = ((C25454BNt) this.A03).A02;
                c75113Zb.A0W((InterfaceC74253Vg) this.A01);
                Object obj3 = this.A02;
                C14360o3.A0B(obj3, 0);
                WeakReference weakReference2 = c75113Zb.A1Z;
                if (weakReference2 != null && weakReference2.get() == obj3) {
                    c75113Zb.A0U(null);
                }
                return C0eB.A00;
            case 1:
                C25454BNt c25454BNt2 = (C25454BNt) this.A03;
                C75113Zb c75113Zb2 = c25454BNt2.A02;
                InterfaceC74253Vg interfaceC74253Vg2 = (InterfaceC74253Vg) this.A01;
                c75113Zb2.A0U(interfaceC74253Vg2);
                Object obj4 = this.A02;
                if (obj4 != null) {
                    weakReference = AbstractC25225BEi.A16(obj4);
                } else {
                    weakReference = null;
                }
                c75113Zb2.A1a = weakReference;
                C23479Aas c23479Aas = c75113Zb2.A0t;
                if (c23479Aas != null) {
                    c23479Aas.A04 = weakReference;
                    C55982hj c55982hj = c23479Aas.A0A;
                    if (!c55982hj.A0C()) {
                        c23479Aas.Dnm(c55982hj);
                    }
                }
                i = 0;
                interfaceC74253Vg = interfaceC74253Vg2;
                c25454BNt = c25454BNt2;
                obj = obj4;
                return AbstractC25225BEi.A0f(new D8P(i, obj, c25454BNt, interfaceC74253Vg));
            case 2:
                return new BRR((C2XI) this.A02, (C2XI) this.A03, (C2XI) this.A01);
            case 3:
                C43742JWb c43742JWb2 = (C43742JWb) ((C15370ps) this.A01).A00;
                c43742JWb2.A00 = null;
                BN9 bn9 = (BN9) this.A03;
                C75113Zb c75113Zb3 = bn9.A01;
                UserSession userSession = bn9.A00;
                boolean A06 = C18U.A06(AbstractC25225BEi.A0j(userSession, 0), userSession, 36325944331351574L);
                WeakReference weakReference3 = c75113Zb3.A1Y;
                if (weakReference3 != null && weakReference3.get() == c43742JWb2) {
                    c75113Zb3.A1Y = null;
                    if (A06 && (c43743JWc = c75113Zb3.A0g) != null) {
                        c43743JWc.A01 = null;
                    }
                }
                c75113Zb3.A0M((C33R) this.A02, null, false);
                return C0eB.A00;
            case 4:
                BN9 bn92 = (BN9) this.A03;
                C75113Zb c75113Zb4 = bn92.A01;
                C15370ps c15370ps = (C15370ps) this.A01;
                Object obj5 = c15370ps.A00;
                if (obj5 == null) {
                    A16 = null;
                } else {
                    A16 = AbstractC25225BEi.A16(obj5);
                }
                c75113Zb4.A1Y = A16;
                if (A16 != null && (c43742JWb = (C43742JWb) A16.get()) != null) {
                    C43743JWc c43743JWc2 = c75113Zb4.A0g;
                    if (c43743JWc2 == null) {
                        c43743JWc2 = new C43743JWc();
                        c75113Zb4.A0g = c43743JWc2;
                    }
                    c43743JWc2.A01 = c43742JWb;
                }
                C33R c33r = (C33R) this.A02;
                c75113Zb4.A0L(c33r, null, false);
                i = 3;
                interfaceC74253Vg = c15370ps;
                c25454BNt = bn92;
                obj = c33r;
                return AbstractC25225BEi.A0f(new D8P(i, obj, c25454BNt, interfaceC74253Vg));
            case 5:
                C75113Zb c75113Zb5 = ((BN2) this.A03).A00;
                c75113Zb5.A0V((InterfaceC74253Vg) this.A01);
                c75113Zb5.A0Y((C37681GiI) this.A02);
                return C0eB.A00;
            case 6:
                BN2 bn2 = (BN2) this.A03;
                C75113Zb c75113Zb6 = bn2.A00;
                InterfaceC74253Vg interfaceC74253Vg3 = (InterfaceC74253Vg) this.A01;
                c75113Zb6.A0T(interfaceC74253Vg3);
                C37681GiI c37681GiI = (C37681GiI) this.A02;
                c75113Zb6.A0X(c37681GiI);
                i = 5;
                interfaceC74253Vg = interfaceC74253Vg3;
                c25454BNt = bn2;
                obj = c37681GiI;
                return AbstractC25225BEi.A0f(new D8P(i, obj, c25454BNt, interfaceC74253Vg));
            case 7:
                return new C25237BEv((C2XI) this.A02, (C2XI) this.A03, (C2XI) this.A01, 3);
            case 8:
                C45124Jxt c45124Jxt = (C45124Jxt) this.A02;
                AbstractC86533tR.A00((C86013sY) c45124Jxt.A04);
                ((BKZ) this.A03).A07.A0Z(false, null);
                ((PopupWindow) this.A01).dismiss();
                c45124Jxt.A00 = true;
                return C0eB.A00;
            case 9:
                clipsDraftPreviewItemRepository = (ClipsDraftPreviewItemRepository) this.A01;
                id = ((C38321qM) this.A02).getId();
                if (id != null) {
                    obj2 = this.A03;
                    i2 = 20;
                    clipsDraftPreviewItemRepository.A02(id, DRX.A00(obj2, i2));
                    return C0eB.A00;
                }
                throw AbstractC166997dE.A0g();
            case 10:
                clipsDraftPreviewItemRepository = (ClipsDraftPreviewItemRepository) this.A01;
                id = ((C38321qM) this.A02).getId();
                if (id != null) {
                    obj2 = this.A03;
                    i2 = 21;
                    clipsDraftPreviewItemRepository.A02(id, DRX.A00(obj2, i2));
                    return C0eB.A00;
                }
                throw AbstractC166997dE.A0g();
            case 11:
                BLI bli = (BLI) this.A03;
                return new C5Z(bli.A07, bli.A0H, (AbstractC25398BLp) this.A01, (C54650OCc) this.A02);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                BP3 bp3 = (BP3) BP3.A03.getValue();
                C75113Zb c75113Zb7 = (C75113Zb) this.A02;
                C14360o3.A0B(c75113Zb7, 0);
                bp3.A01(c75113Zb7);
                RunnableC29579D1g runnableC29579D1g = new RunnableC29579D1g(bp3, c75113Zb7);
                AbstractC25227BEk.A1O(runnableC29579D1g, bp3.A02, c75113Zb7.hashCode());
                bp3.A01.post(runnableC29579D1g);
                c75113Zb7.A3V.A00(c75113Zb7, true);
                BLI bli2 = (BLI) this.A03;
                InterfaceC60442pS interfaceC60442pS = bli2.A0C;
                UserSession userSession2 = bli2.A0A;
                C120985dq c120985dq = bli2.A06;
                C11520jB c11520jB = (C11520jB) this.A01;
                C14360o3.A0B(interfaceC60442pS, 0);
                AbstractC167007dF.A1D(userSession2, 1, c120985dq);
                if (c11520jB != null) {
                    InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC60442pS, userSession2), "instagram_ad_midscene_dismiss");
                    if (A0f.isSampled()) {
                        A0f.A9K("ad_id", AbstractC25231BEo.A0j(0, AbstractC25226BEj.A1E(c120985dq)));
                        AbstractC25236BEt.A0n(A0f, c120985dq, c11520jB, userSession2);
                        AbstractC25236BEt.A0p(A0f, c11520jB);
                        A0f.Cht();
                    }
                }
                return C0eB.A00;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                InterfaceC31137Dmc interfaceC31137Dmc = ((BLI) this.A03).A0H;
                interfaceC31137Dmc.Cxv();
                interfaceC31137Dmc.EKl();
                AbstractC25398BLp abstractC25398BLp = (AbstractC25398BLp) this.A01;
                boolean z = abstractC25398BLp.A05;
                BWT bwt = abstractC25398BLp.A04;
                if (z) {
                    if (bwt != null) {
                        bwt.A01();
                    }
                    abstractC25398BLp.A05 = false;
                } else {
                    if (bwt != null) {
                        bwt.A00();
                    }
                    abstractC25398BLp.A05 = true;
                }
                InterfaceC19610xo A0w = AbstractC166987dD.A0w(((BLG) this.A02).A04);
                A0w.E77("clips_mute_button_text_clicked", true);
                A0w.apply();
                return C0eB.A00;
            case 14:
                AbstractC25232BEp.A1O(this.A01);
                ((C51762Yz) this.A02).A00();
                ((C75113Zb) this.A03).A0Z(C05F.A00);
                return C0eB.A00;
            case Process.SIGTERM /* 15 */:
                BLI bli3 = (BLI) this.A03;
                InterfaceC30855DhU interfaceC30855DhU = (InterfaceC30855DhU) bli3.A0N.BR5().A04;
                C120985dq c120985dq2 = bli3.A06;
                if (c120985dq2.A0F()) {
                    AdFormatType adFormatType = AdFormatType.A04;
                    AdFormatType adFormatType2 = c120985dq2.A0E;
                    Context A0P = AbstractC25226BEj.A0P(this.A02);
                    if (adFormatType == adFormatType2) {
                        UserSession userSession3 = bli3.A0A;
                        InterfaceC60442pS interfaceC60442pS2 = bli3.A0C;
                        C37644Ghd c37644Ghd = bli3.A08;
                        C75113Zb c75113Zb8 = (C75113Zb) this.A01;
                        AbstractC25234BEr.A1R(userSession3, interfaceC60442pS2, c37644Ghd, c75113Zb8, interfaceC30855DhU);
                        if (C18U.A06(C06090Tz.A05, userSession3, 36321713790133984L)) {
                            return new C5E(A0P, c120985dq2, c37644Ghd, interfaceC60442pS2, userSession3, c75113Zb8, interfaceC30855DhU);
                        }
                        return new C5E(A0P, c120985dq2, c37644Ghd, interfaceC60442pS2, userSession3, c75113Zb8, interfaceC30855DhU);
                    }
                    return new C25673BWj(A0P, c120985dq2, bli3.A08, bli3.A0C, bli3.A0A, (C75113Zb) this.A01, interfaceC30855DhU);
                }
                boolean A00 = AbstractC25397BLo.A00(c120985dq2);
                Context A0P2 = AbstractC25226BEj.A0P(this.A02);
                if (A00) {
                    UserSession userSession4 = bli3.A0A;
                    return new C5D(A0P2, c120985dq2, bli3.A08, bli3.A09, bli3.A0C, userSession4, (C75113Zb) this.A01, bli3.A0H, interfaceC30855DhU);
                }
                return new BNN(A0P2, c120985dq2, bli3.A08, bli3.A0C, bli3.A0A, (C75113Zb) this.A01, interfaceC30855DhU);
            case 16:
                BLI bli4 = (BLI) this.A03;
                UserSession userSession5 = bli4.A0A;
                C120985dq c120985dq3 = bli4.A06;
                if (C76493bt.A0V(userSession5, c120985dq3.A02, AbstractC37647Ghg.A01(c120985dq3.A01), c120985dq3.CdW())) {
                    C76223bS c76223bS = (C76223bS) this.A02;
                    return new C57(AbstractC77363dM.A00(c76223bS), c120985dq3, (BOX) this.A01, userSession5, new C27922CSh(userSession5, AbstractC77363dM.A00(c76223bS)), bli4.A08.A06());
                }
                BOX box = (BOX) this.A01;
                if (box != null) {
                    box.A02 = null;
                    box.A01 = null;
                    box.A00 = null;
                    return null;
                }
                return null;
            case 17:
                Context A0N = AbstractC25229BEm.A0N(this.A01);
                BLI bli5 = (BLI) this.A03;
                UserSession userSession6 = bli5.A0A;
                InterfaceC31137Dmc interfaceC31137Dmc2 = bli5.A0H;
                C120985dq c120985dq4 = bli5.A06;
                JPb jPb = bli5.A07;
                C54650OCc c54650OCc = (C54650OCc) this.A02;
                AbstractC25234BEr.A0j(2, userSession6, interfaceC31137Dmc2, c120985dq4, jPb);
                return new ScaleGestureDetectorOnScaleGestureListenerC65851TvC(A0N, null, c120985dq4, jPb, userSession6, interfaceC31137Dmc2, c54650OCc);
            case 18:
                UserSession userSession7 = (UserSession) this.A03;
                InterfaceC60442pS interfaceC60442pS3 = (InterfaceC60442pS) this.A01;
                return new YFV(C129645tT.A00(userSession7, (C1M6) this.A02), new C129635tS(userSession7, new C37343Gcl(userSession7, interfaceC60442pS3, 4), EnumC64222vh.A08));
            case Process.SIGSTOP /* 19 */:
                C141596ac c141596ac = (C141596ac) this.A02;
                if (c141596ac.A0B < 1.0f && c141596ac.A18) {
                    C7Uo c7Uo = new C7Uo(((C143416dg) this.A03).A00);
                    String id2 = ((User) this.A01).getId();
                    C7Uo.A03(c7Uo, AbstractC06930Yk.A0C(C7Uo.A01(c7Uo), AbstractC167007dF.A0o(id2, AbstractC167017dG.A0K((Number) C7Uo.A01(c7Uo).get(id2)) + 1)));
                    C7Uo.A02(c7Uo, AbstractC06930Yk.A0C(C7Uo.A00(c7Uo), AbstractC166987dD.A1L(id2, Long.valueOf(System.currentTimeMillis()))));
                }
                return C0eB.A00;
            case 20:
                ((C146956jX) this.A03).A02.DFX((C41181vS) this.A01, (C41551w4) this.A02);
                return C0eB.A00;
            default:
                ((C146956jX) this.A03).A02.E1z((C41181vS) this.A01, (C41551w4) this.A02);
                return C0eB.A00;
        }
    }
}
