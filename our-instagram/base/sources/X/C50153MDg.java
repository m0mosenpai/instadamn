package X;

import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.List;

/* renamed from: X.MDg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C50153MDg extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50153MDg(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        String str;
        C05A c05a;
        C45098JxS c45098JxS;
        C73 c73;
        C48733Lh1 c48733Lh1;
        C45104JxY c45104JxY;
        Integer num;
        List list;
        switch (this.A00) {
            case 0:
                return ((WjI) this.A01).A04.findViewById(R.id.row_thread_composer_voice);
            case 1:
                return AbstractC34063F1q.A00(((AbstractC32348EMv) this.A01).getSession());
            case 2:
            case 5:
            case 10:
            case Process.SIGTERM /* 15 */:
            case 24:
            case 26:
            case 33:
            case 36:
                return this.A01;
            case 3:
                return ((C31826Dyk) this.A01).A02;
            case 4:
                return C7FP.A00(AbstractC31171DnF.A0D("prompt_naming_suggestions_view_model"), (UserSession) this.A01);
            case 6:
            case 11:
            case 16:
            case 34:
            case 37:
                return AbstractC25226BEj.A1C(this.A01);
            case 7:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case 17:
            case 35:
            case 38:
            default:
                return AbstractC167027dH.A0B(this.A01);
            case 8:
                EnumC33421Eps enumC33421Eps = ((C32238EHw) this.A01).A01;
                if (enumC33421Eps != null) {
                    return new C32559EVj(enumC33421Eps);
                }
                str = "initialOption";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 9:
                return AbstractC34063F1q.A00(AbstractC166987dD.A0r(((EKR) this.A01).A04));
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                EnumC33423Epu enumC33423Epu = ((C32241EHz) this.A01).A01;
                if (enumC33423Epu != null) {
                    return new EW5(enumC33423Epu);
                }
                str = "initialOption";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 14:
                UserSession userSession = (UserSession) this.A01;
                return new JUI(AbstractC25651Mw.A00(userSession), userSession, C1AT.A01(userSession).A03(C1AV.A2e));
            case 18:
                return new C26999Bve(AbstractC166987dD.A0r(((C26770Brr) this.A01).A00));
            case Process.SIGSTOP /* 19 */:
                return C7Ok.A00(AbstractC166987dD.A0r(((C45518KDj) this.A01).A0I));
            case 20:
                L5W l5w = (L5W) this.A01;
                Capabilities capabilities = l5w.A05;
                if (capabilities == null) {
                    return null;
                }
                return AnonymousClass988.A1Z.A00(l5w.A04, capabilities);
            case 21:
                return C36294Fzo.A00(AbstractC166987dD.A0r(((EK5) this.A01).A0A));
            case 22:
            case 25:
            case 27:
                return ((InterfaceC018407e) this.A01).getViewModelStore();
            case 23:
                return ((C07N) ((InterfaceC018407e) this.A01)).getDefaultViewModelProviderFactory();
            case 28:
                return new C36276FzT((UserSession) this.A01);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return AbstractC166997dE.A0c(C06090Tz.A05, AbstractC166987dD.A0o(((ELb) this.A01).A07), 36331330220344569L);
            case 30:
                return new C148696me(AbstractC166987dD.A0r(((KD6) this.A01).A0e));
            case 31:
                UserSession userSession2 = ((KD6) this.A01).A08;
                if (userSession2 == null) {
                    str = "userSession";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                return new C45564KFd(userSession2);
            case 32:
                KD6 kd6 = (KD6) this.A01;
                AbstractC43592JPx.A0M(kd6.A0c).A05(kd6.A0b);
                return C0eB.A00;
            case 39:
                ((L48) this.A01).A03.A03();
                return C0eB.A00;
            case 40:
                C48733Lh1 c48733Lh12 = ((L4U) this.A01).A03;
                C45104JxY c45104JxY2 = c48733Lh12.A09;
                if (c48733Lh12.A0a) {
                    list = c45104JxY2.A01;
                } else {
                    list = C16930sl.A00;
                }
                C48733Lh1.A02(c48733Lh12, C45104JxY.A00(c45104JxY2.A00, c45104JxY2.A02, c45104JxY2.A04, c45104JxY2.A03, list, c45104JxY2.A05, c45104JxY2.A08, c45104JxY2.A0A, c48733Lh12.A0W, c45104JxY2.A09, c45104JxY2.A07, c45104JxY2.A06));
                c48733Lh12.A0N.A02();
                return C0eB.A00;
            case Seq.NULL_REFNUM /* 41 */:
                L4U l4u = (L4U) this.A01;
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(l4u.A01, l4u.A02), "direct_custom_cutout_sticker_tap");
                if (A0f.isSampled()) {
                    A0f.AAP("target", "custom_cutout_sticker_see_more");
                    A0f.Cht();
                }
                C48733Lh1 c48733Lh13 = l4u.A03;
                UserSession userSession3 = c48733Lh13.A0G;
                AbstractC46702KlL.A00(new MUW(C05F.A0C, (Integer) null, "sticker", (String) null, 12), AbstractC31176DnK.A0O(userSession3, "ig_direct_expression_tray"), userSession3, c48733Lh13.A0S, c48733Lh13.A0U);
                C47933LFf c47933LFf = c48733Lh13.A0J.A00.A00;
                if (c47933LFf != null) {
                    KCW A00 = C47933LFf.A00(c47933LFf);
                    C45493KCi c45493KCi = new C45493KCi();
                    C14240no A0F = AbstractC43593JPy.A0F(A00);
                    A0F.A0I(null);
                    AbstractC43593JPy.A1D(c45493KCi, A0F);
                }
                return C0eB.A00;
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                c48733Lh1 = ((L4U) this.A01).A03;
                UserSession userSession4 = c48733Lh1.A0G;
                AbstractC46702KlL.A00(new MUW(C05F.A0C, (Integer) null, "sticker", (String) null, 12), AbstractC31176DnK.A0O(userSession4, "ig_direct_expression_tray"), userSession4, c48733Lh1.A0S, c48733Lh1.A0U);
                c45104JxY = c48733Lh1.A09;
                num = C05F.A0N;
                C48733Lh1.A03(c48733Lh1, c45104JxY, num, c45104JxY.A02, c45104JxY.A04);
                return C0eB.A00;
            case 43:
                c48733Lh1 = ((L4U) this.A01).A03;
                c45104JxY = c48733Lh1.A09;
                num = C05F.A0Y;
                C48733Lh1.A03(c48733Lh1, c45104JxY, num, c45104JxY.A02, c45104JxY.A04);
                return C0eB.A00;
            case 44:
                c48733Lh1 = ((L4U) this.A01).A03;
                c45104JxY = c48733Lh1.A09;
                num = C05F.A0j;
                C48733Lh1.A03(c48733Lh1, c45104JxY, num, c45104JxY.A02, c45104JxY.A04);
                return C0eB.A00;
            case 45:
                return Integer.valueOf(AbstractC167017dG.A0E(AbstractC31172DnG.A07(this.A01)));
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return Integer.valueOf(AbstractC167017dG.A03(AbstractC31172DnG.A07(this.A01)));
            case 47:
                L6D l6d = ((KCS) this.A01).A07;
                if (l6d != null) {
                    l6d.A00();
                }
                return C0eB.A00;
            case 48:
                KCS kcs = (KCS) this.A01;
                InterfaceC09390do interfaceC09390do = kcs.A0J;
                str = "uiController";
                if (((C45098JxS) ((C44527JmX) interfaceC09390do.getValue()).A05.getValue()).A01 == C73.A02 && !((C44527JmX) interfaceC09390do.getValue()).A01()) {
                    C47987LJp c47987LJp = kcs.A08;
                    if (c47987LJp != null) {
                        c47987LJp.A04(((C45098JxS) ((C44527JmX) interfaceC09390do.getValue()).A05.getValue()).A03);
                        if (((C45098JxS) ((C44527JmX) interfaceC09390do.getValue()).A05.getValue()).A01 == C73.A07) {
                        }
                        c05a = ((C44527JmX) interfaceC09390do.getValue()).A04;
                        c45098JxS = (C45098JxS) c05a.getValue();
                        c73 = C73.A06;
                        boolean z = c45098JxS.A05;
                        String str2 = c45098JxS.A03;
                        String str3 = c45098JxS.A02;
                        boolean z2 = c45098JxS.A06;
                        KzF kzF = c45098JxS.A00;
                        String str4 = c45098JxS.A04;
                        C14360o3.A0B(str2, 2);
                        c05a.Egh(new C45098JxS(kzF, c73, str2, str3, str4, z, z2));
                    }
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                C47987LJp c47987LJp2 = kcs.A08;
                if (c47987LJp2 != null) {
                    c47987LJp2.A03();
                    if (((C45098JxS) ((C44527JmX) interfaceC09390do.getValue()).A05.getValue()).A01 == C73.A07 && !((C44527JmX) interfaceC09390do.getValue()).A01()) {
                        c05a = ((C44527JmX) interfaceC09390do.getValue()).A04;
                        c45098JxS = (C45098JxS) c05a.getValue();
                        c73 = C73.A05;
                    } else {
                        c05a = ((C44527JmX) interfaceC09390do.getValue()).A04;
                        c45098JxS = (C45098JxS) c05a.getValue();
                        c73 = C73.A06;
                    }
                    boolean z3 = c45098JxS.A05;
                    String str22 = c45098JxS.A03;
                    String str32 = c45098JxS.A02;
                    boolean z22 = c45098JxS.A06;
                    KzF kzF2 = c45098JxS.A00;
                    String str42 = c45098JxS.A04;
                    C14360o3.A0B(str22, 2);
                    c05a.Egh(new C45098JxS(kzF2, c73, str22, str32, str42, z3, z22));
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
                return C0eB.A00;
            case 49:
                C44527JmX c44527JmX = (C44527JmX) ((KCS) this.A01).A0J.getValue();
                C05A c05a2 = c44527JmX.A04;
                String str5 = ((C45098JxS) c05a2.getValue()).A03;
                C47297Kv8 c47297Kv8 = c44527JmX.A01;
                str = "randomizedGhostPrompts";
                if (c47297Kv8 != null) {
                    List list2 = c47297Kv8.A00;
                    C50722Ut c50722Ut = AbstractC50712Us.A00;
                    while (true) {
                        String str6 = ((KzF) AbstractC001800i.A0G(list2, c50722Ut)).A01;
                        if (str6 != null) {
                            if (C14360o3.A0K(str5, str6)) {
                                C47297Kv8 c47297Kv82 = c44527JmX.A01;
                                if (c47297Kv82 != null) {
                                    list2 = c47297Kv82.A00;
                                }
                            } else {
                                C45098JxS c45098JxS2 = (C45098JxS) c05a2.getValue();
                                C73 c732 = C73.A02;
                                boolean z4 = c45098JxS2.A05;
                                String str7 = c45098JxS2.A02;
                                boolean z5 = c45098JxS2.A06;
                                KzF kzF3 = c45098JxS2.A00;
                                String str8 = c45098JxS2.A04;
                                C14360o3.A0B(c732, 0);
                                c05a2.Egh(new C45098JxS(kzF3, c732, str6, str7, str8, z4, z5));
                                return C0eB.A00;
                            }
                        } else {
                            str = "prompt";
                        }
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
        }
    }
}
