package X;

import android.graphics.PointF;
import android.os.Bundle;
import androidx.compose.ui.Modifier;
import androidx.fragment.app.FragmentActivity;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.creation.genai.magicmod.model.MagicModLaunchParams;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* renamed from: X.DbQ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30481DbQ extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30481DbQ(Object obj, int i) {
        super(2);
        this.A00 = i;
        this.A01 = obj;
    }

    public static C30481DbQ A00(Object obj, int i) {
        return new C30481DbQ(obj, i);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl c5Tl;
        int i;
        float A01;
        InterfaceC74953Yl interfaceC74953Yl;
        Object valueOf;
        String str;
        List list;
        String str2;
        int A0H;
        BJF bjf;
        int i2;
        InterfaceC09390do interfaceC09390do;
        InterfaceC118305Ws interfaceC118305Ws;
        String A00;
        int i3;
        Modifier A0A;
        switch (this.A00) {
            case 0:
                c5Tl = (C5Tl) obj;
                if (AbstractC25228BEl.A0C(obj2) != 2 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(1773817550, "com.instagram.creation.genai.magicmod.bottomsheet.MagicModAttributionBottomSheetFragment.onCreateView.<anonymous> (MagicModAttributionBottomSheetFragment.kt:67)");
                    }
                    if (AbstractC25235BEs.A1a(c5Tl, new C30192DRx(this.A01, 49), -2126904033, AbstractC25226BEj.A0J(c5Tl))) {
                        i = -1844115974;
                        C0fH.A00(i);
                    }
                    return C0eB.A00;
                }
                c5Tl.Em9();
                return C0eB.A00;
            case 1:
                A01 = AbstractC25235BEs.A01(obj, obj2);
                interfaceC74953Yl = (InterfaceC74953Yl) this.A01;
                valueOf = Float.valueOf(A01);
                interfaceC74953Yl.Egh(valueOf);
                return C0eB.A00;
            case 2:
                c5Tl = (C5Tl) obj;
                if (AbstractC25228BEl.A0C(obj2) != 2 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(469247995, "com.instagram.creation.genai.magicmod.common.ui.MagicModGeneratedImageSelectionBar.<anonymous> (MagicModGeneratedImageSelectionBar.kt:60)");
                    }
                    AbstractC28390Cft.A03((InterfaceC16820sZ) this.A01, c5Tl, 0);
                    if (C0fH.A02()) {
                        i = -77699482;
                        C0fH.A00(i);
                    }
                    return C0eB.A00;
                }
                c5Tl.Em9();
                return C0eB.A00;
            case 3:
                c5Tl = (C5Tl) obj;
                if (AbstractC25228BEl.A0C(obj2) != 2 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(-1022020118, "com.instagram.creation.genai.magicmod.common.ui.MagicModToolbar.<anonymous>.<anonymous> (MagicModToolbar.kt:103)");
                    }
                    InterfaceC30815Dgq interfaceC30815Dgq = (InterfaceC30815Dgq) ((C51760Mtj) this.A01).A00;
                    if (!(interfaceC30815Dgq instanceof C29232Cub)) {
                        if (interfaceC30815Dgq instanceof C26193BiJ) {
                            C26193BiJ c26193BiJ = (C26193BiJ) interfaceC30815Dgq;
                            String A002 = AbstractC28309Cdv.A00(c5Tl, c26193BiJ.A01);
                            if (A002 != null && A002.length() != 0) {
                                AbstractC28309Cdv.A02(A002, AbstractC28309Cdv.A00(c5Tl, c26193BiJ.A00), c5Tl, 0);
                            }
                        } else {
                            throw B4Z.A00();
                        }
                    }
                    if (C0fH.A02()) {
                        i = 667725201;
                        C0fH.A00(i);
                    }
                    return C0eB.A00;
                }
                c5Tl.Em9();
                return C0eB.A00;
            case 4:
                float A012 = AbstractC25235BEs.A01(obj, obj2);
                interfaceC74953Yl = (InterfaceC74953Yl) this.A01;
                A01 = A012 * A012 * A012;
                valueOf = Float.valueOf(A01);
                interfaceC74953Yl.Egh(valueOf);
                return C0eB.A00;
            case 5:
                float A013 = AbstractC25235BEs.A01(obj, obj2);
                interfaceC74953Yl = (InterfaceC74953Yl) this.A01;
                PointF pointF = (PointF) ((C25547BRj) interfaceC74953Yl.getValue()).A01;
                C14360o3.A0B(pointF, 0);
                valueOf = new C25547BRj(pointF, A013);
                interfaceC74953Yl.Egh(valueOf);
                return C0eB.A00;
            case 6:
                c5Tl = (C5Tl) obj;
                if (AbstractC25228BEl.A0C(obj2) != 2 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(22418088, "com.instagram.creation.genai.magicmod.fragment.MagicModFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (MagicModFragment.kt:111)");
                    }
                    C26827Bsp c26827Bsp = (C26827Bsp) this.A01;
                    EnumC193878i8 enumC193878i8 = c26827Bsp.A01;
                    if (enumC193878i8 == null) {
                        str = "magicModTool";
                    } else {
                        C28374Cfc c28374Cfc = ((C8CS) c26827Bsp.A08.getValue()).A05;
                        if (c28374Cfc != null) {
                            String str3 = c26827Bsp.A02;
                            C25344BJn c25344BJn = new C25344BJn(c26827Bsp, 22);
                            D5Y d5y = new D5Y(c26827Bsp, 24);
                            C3I9 c3i9 = c26827Bsp.A07;
                            boolean A1O = AbstractC167007dF.A1O(AbstractC25231BEo.A0E(c26827Bsp.A06));
                            C25344BJn c25344BJn2 = new C25344BJn(c26827Bsp, 23);
                            MagicModLaunchParams magicModLaunchParams = c26827Bsp.A00;
                            if (magicModLaunchParams == null) {
                                str = "magicModLaunchParams";
                            } else {
                                CHQ.A00(c5Tl, c3i9, c28374Cfc, magicModLaunchParams, enumC193878i8, null, str3, d5y, c25344BJn, c25344BJn2, 134250560, 0, 1024, A1O, c26827Bsp.A03);
                                if (C0fH.A02()) {
                                    i = -1686301141;
                                    C0fH.A00(i);
                                }
                                return C0eB.A00;
                            }
                        } else {
                            throw AbstractC166987dD.A14("Unable to retrieve MagicModLogger without initializing a session");
                        }
                    }
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                c5Tl.Em9();
                return C0eB.A00;
            case 7:
                c5Tl = (C5Tl) obj;
                if (AbstractC25228BEl.A0C(obj2) != 2 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(-908808162, "com.instagram.creation.genai.magicmod.fragment.MagicModFragment.onCreateView.<anonymous>.<anonymous> (MagicModFragment.kt:103)");
                    }
                    C26827Bsp c26827Bsp2 = (C26827Bsp) this.A01;
                    if (C18U.A06(C06090Tz.A05, AbstractC166987dD.A0o(c26827Bsp2.A09), 36325059568087731L)) {
                        list = AbstractC166987dD.A1J(AbstractC27735CLc.A00.A02(c26827Bsp2));
                    } else {
                        list = C16930sl.A00;
                    }
                    C117685Ud[] c117685UdArr = (C117685Ud[]) list.toArray(new C117685Ud[0]);
                    if (AbstractC25233BEq.A1Y(c5Tl, A00(c26827Bsp2, 6), (C117685Ud[]) Arrays.copyOf(c117685UdArr, c117685UdArr.length), -1239902701)) {
                        i = -1621136746;
                        C0fH.A00(i);
                    }
                    return C0eB.A00;
                }
                c5Tl.Em9();
                return C0eB.A00;
            case 8:
                c5Tl = (C5Tl) obj;
                if (AbstractC25228BEl.A0C(obj2) != 2 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(-957810050, "com.instagram.creation.genai.magicmod.fragment.MagicModFragment.onCreateView.<anonymous> (MagicModFragment.kt:102)");
                    }
                    if (AbstractC25235BEs.A1a(c5Tl, A00(this.A01, 7), 1244115667, C5XL.A00(c5Tl).A0c)) {
                        i = -65660471;
                        C0fH.A00(i);
                    }
                    return C0eB.A00;
                }
                c5Tl.Em9();
                return C0eB.A00;
            case 9:
                AbstractC27126Bxp abstractC27126Bxp = (AbstractC27126Bxp) obj;
                int A0p = AbstractC25232BEp.A0p(obj2, abstractC27126Bxp);
                C25810BbR c25810BbR = (C25810BbR) this.A01;
                if (abstractC27126Bxp instanceof C27124Bxn) {
                    str2 = ((C27124Bxn) abstractC27126Bxp).A02;
                } else if (abstractC27126Bxp instanceof C27125Bxo) {
                    str2 = ((C27125Bxo) abstractC27126Bxp).A03;
                } else {
                    throw B4Z.A00();
                }
                C28374Cfc c28374Cfc2 = c25810BbR.A05;
                c28374Cfc2.A03(A0p, str2);
                Integer num = C05F.A0C;
                InterfaceC74953Yl interfaceC74953Yl2 = c25810BbR.A02;
                C5C3 A0G = AbstractC25233BEq.A0G(interfaceC74953Yl2, str2);
                C14360o3.A0B(A0G, 0);
                interfaceC74953Yl2.Egh(A0G);
                c28374Cfc2.A07(null, num, AbstractC25230BEn.A0p(interfaceC74953Yl2));
                C25810BbR.A01(c25810BbR, 2, false);
                return C0eB.A00;
            case 10:
                c5Tl = (C5Tl) obj;
                if (AbstractC25228BEl.A0B(obj2) != 2 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(1987935659, "com.instagram.creation.genai.memu.settings.MemuSettingsFragment.onCreateView.<anonymous> (MemuSettingsFragment.kt:95)");
                    }
                    C26778Brz c26778Brz = (C26778Brz) this.A01;
                    Object A0l = AbstractC25235BEs.A0l(c5Tl, AbstractC25226BEj.A0x(c26778Brz.A09).A08, 0);
                    boolean A1Y = AbstractC25232BEp.A1Y(c5Tl, A0l, c26778Brz, 75558619);
                    Object EEc = c5Tl.EEc();
                    if (A1Y || EEc == C5UI.A00) {
                        EEc = C30183DRo.A00(c5Tl, c26778Brz, A0l, 23);
                    }
                    AbstractC25225BEi.A1V(c5Tl, false);
                    C6IS.A09(c5Tl, (InterfaceC16660sJ) EEc);
                    if (C0fH.A02()) {
                        i = -633916652;
                        C0fH.A00(i);
                    }
                    return C0eB.A00;
                }
                c5Tl.Em9();
                return C0eB.A00;
            case 11:
                A0H = AbstractC166987dD.A0H(obj);
                bjf = (BJF) obj2;
                i2 = 1;
                C14360o3.A0B(bjf, 1);
                interfaceC09390do = ((C26820Bsi) this.A01).A03;
                C05A c05a = AbstractC25226BEj.A0x(interfaceC09390do).A07;
                ArrayList A0U = AbstractC001800i.A0U((Collection) ((C45124Jxt) c05a.getValue()).A05);
                boolean z = !bjf.A03;
                String str4 = bjf.A01;
                String str5 = bjf.A02;
                AbstractC25230BEn.A15(i2, str4, str5);
                A0U.set(A0H, new BJF(str4, str5, 2, z));
                C45124Jxt c45124Jxt = (C45124Jxt) c05a.getValue();
                c05a.F8m(C45124Jxt.A00((C7T) c45124Jxt.A04, (Boolean) c45124Jxt.A03, AbstractC133095zb.A00(A0U), c45124Jxt.A01, c45124Jxt.A00));
                return C0eB.A00;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A0H = AbstractC166987dD.A0H(obj);
                bjf = (BJF) obj2;
                i2 = 1;
                C14360o3.A0B(bjf, 1);
                interfaceC09390do = ((C26820Bsi) this.A01).A03;
                AbstractC25226BEj.A0x(interfaceC09390do).A01();
                C05A c05a2 = AbstractC25226BEj.A0x(interfaceC09390do).A07;
                ArrayList A0U2 = AbstractC001800i.A0U((Collection) ((C45124Jxt) c05a2.getValue()).A05);
                boolean z2 = !bjf.A03;
                String str42 = bjf.A01;
                String str52 = bjf.A02;
                AbstractC25230BEn.A15(i2, str42, str52);
                A0U2.set(A0H, new BJF(str42, str52, 2, z2));
                C45124Jxt c45124Jxt2 = (C45124Jxt) c05a2.getValue();
                c05a2.F8m(C45124Jxt.A00((C7T) c45124Jxt2.A04, (Boolean) c45124Jxt2.A03, AbstractC133095zb.A00(A0U2), c45124Jxt2.A01, c45124Jxt2.A00));
                return C0eB.A00;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                c5Tl = (C5Tl) obj;
                if (AbstractC25228BEl.A0B(obj2) != 2 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(1221066255, "com.instagram.creation.genai.memu.settings.MemuUploadedPhotosFragment.onCreateView.<anonymous> (MemuUploadedPhotosFragment.kt:72)");
                    }
                    C26820Bsi c26820Bsi = (C26820Bsi) this.A01;
                    C45124Jxt c45124Jxt3 = (C45124Jxt) AbstractC25235BEs.A0l(c5Tl, AbstractC25226BEj.A0x(c26820Bsi.A03).A08, 0);
                    C26820Bsi.A00(c45124Jxt3, c26820Bsi);
                    Object obj3 = c45124Jxt3.A05;
                    C5Hc c5Hc = (C5Hc) obj3;
                    boolean z3 = !c5Hc.isEmpty();
                    if (z3) {
                        interfaceC118305Ws = AbstractC118255Wn.A07;
                    } else {
                        interfaceC118305Ws = AbstractC118255Wn.A02;
                    }
                    C1130158n c1130158n = Modifier.A00;
                    InterfaceC1127857k A02 = AbstractC119595bH.A02(interfaceC118305Ws, c5Tl, C118195Wf.A02, 0);
                    int A003 = C5X2.A00(c5Tl);
                    C117505Tk c117505Tk = (C117505Tk) c5Tl;
                    C59P A04 = C117505Tk.A04(c117505Tk);
                    Modifier A014 = C5X3.A01(c5Tl, c1130158n);
                    AbstractC25233BEq.A11(c5Tl, c117505Tk);
                    AbstractC25231BEo.A12(c5Tl, A02, A04);
                    InterfaceC16620sF interfaceC16620sF = C5X8.A02;
                    if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A003)) {
                        AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A003);
                    }
                    AbstractC25225BEi.A1K(c5Tl, A014);
                    C6GM c6gm = C6GM.A00;
                    if (z3) {
                        c5Tl.Eno(-273942728);
                        AbstractC28303Cdp.A02(c5Tl, null, AbstractC25228BEl.A17(c5Tl, Integer.valueOf(AbstractC167027dH.A01(c26820Bsi.A01)), 2131966260), 0, 2);
                        boolean z4 = c45124Jxt3.A00;
                        boolean A1Z = AbstractC25227BEk.A1Z(c5Tl, c26820Bsi, 268270575);
                        Object EEc2 = c5Tl.EEc();
                        if (A1Z || EEc2 == C5UI.A00) {
                            EEc2 = A00(c26820Bsi, 11);
                            c5Tl.FBy(EEc2);
                        }
                        InterfaceC16620sF A1C = AbstractC25225BEi.A1C(c117505Tk, EEc2);
                        boolean A1Z2 = AbstractC25227BEk.A1Z(c5Tl, c26820Bsi, 268276358);
                        Object EEc3 = c5Tl.EEc();
                        if (A1Z2 || EEc3 == C5UI.A00) {
                            EEc3 = A00(c26820Bsi, 12);
                            c5Tl.FBy(EEc3);
                        }
                        AbstractC28311Cdx.A01(c5Tl, c1130158n, A1C, AbstractC25225BEi.A1C(c117505Tk, EEc3), c5Hc, 384, z4);
                    } else {
                        c5Tl.Eno(-273149345);
                        C5WR.A0Z(c5Tl, AbstractC25235BEs.A0G(c6gm, c1130158n), AbstractC25226BEj.A0e(c5Tl), C5YD.A00(c5Tl, 2131966239), AbstractC25226BEj.A0G(c5Tl));
                    }
                    C117505Tk.A0L(c117505Tk, false);
                    if (!c45124Jxt3.A00) {
                        c5Tl.Eno(-272723033);
                        if (AbstractC166987dD.A1b(c5Hc)) {
                            c5Tl.Eno(-272666768);
                            i3 = 2131966257;
                        } else {
                            c5Tl.Eno(-272518805);
                            i3 = 2131966253;
                        }
                        String A004 = C5YD.A00(c5Tl, i3);
                        C117505Tk.A0L(c117505Tk, false);
                        Modifier A0G2 = AbstractC25235BEs.A0G(c6gm, c1130158n);
                        if (z3) {
                            A0A = AbstractC118175Wb.A0A(AbstractC25226BEj.A0T(c1130158n), 12.0f, 12.0f);
                        } else {
                            A0A = AbstractC118175Wb.A0A(c1130158n, 0.0f, 12.0f);
                        }
                        Modifier Eq3 = A0G2.Eq3(A0A);
                        C25267BGf A0u = AbstractC25225BEi.A0u(c5Tl);
                        boolean A1Y2 = AbstractC25232BEp.A1Y(c5Tl, c45124Jxt3, c26820Bsi, 268323306);
                        Object EEc4 = c5Tl.EEc();
                        if (A1Y2 || EEc4 == C5UI.A00) {
                            EEc4 = DH0.A01(c5Tl, c45124Jxt3, c26820Bsi, 39);
                        }
                        C6GE.A03(c5Tl, Eq3, A0u, A004, AbstractC25225BEi.A1A(c117505Tk, EEc4, false));
                    } else if (z3) {
                        c5Tl.Eno(-271508453);
                        List list2 = (List) obj3;
                        ArrayList A1E = AbstractC166987dD.A1E();
                        for (Object obj4 : list2) {
                            if (((BJF) obj4).A03) {
                                A1E.add(obj4);
                            }
                        }
                        boolean A1b = AbstractC166987dD.A1b(A1E);
                        AbstractC119685bS.A00(c5Tl, c6gm.A00(c1130158n, true));
                        AbstractC28389Cfs.A02(c5Tl, AbstractC118185Wd.A08(AbstractC25227BEk.A0N(AbstractC25226BEj.A0T(c1130158n), 0.0f), 1.0f), 0.0f, 6, 4, AbstractC25226BEj.A0B(c5Tl));
                        if (A1b) {
                            c5Tl.Eno(-271174025);
                            ArrayList A1E2 = AbstractC166987dD.A1E();
                            for (Object obj5 : list2) {
                                if (((BJF) obj5).A03) {
                                    A1E2.add(obj5);
                                }
                            }
                            A00 = AbstractC25228BEl.A17(c5Tl, Integer.valueOf(A1E2.size()), 2131966256);
                        } else {
                            c5Tl.Eno(-270970448);
                            A00 = C5YD.A00(c5Tl, 2131966255);
                        }
                        C117505Tk.A0L(c117505Tk, false);
                        C6N c6n = C6N.A03;
                        Modifier A0G3 = AbstractC25235BEs.A0G(c6gm, c1130158n);
                        boolean A1Z3 = AbstractC25227BEk.A1Z(c5Tl, c26820Bsi, 268366632);
                        Object EEc5 = c5Tl.EEc();
                        if (A1Z3 || EEc5 == C5UI.A00) {
                            EEc5 = DGV.A00(c5Tl, c26820Bsi, 48);
                        }
                        CGM.A00(c5Tl, A0G3, c6n, A00, AbstractC25225BEi.A1A(c117505Tk, EEc5, false), 3072, 0, A1b);
                    } else {
                        c5Tl.Eno(-270519584);
                    }
                    if (AbstractC25230BEn.A1U(c5Tl, c117505Tk, false)) {
                        i = -1130924476;
                        C0fH.A00(i);
                    }
                    return C0eB.A00;
                }
                c5Tl.Em9();
                return C0eB.A00;
            case 14:
                c5Tl = (C5Tl) obj;
                if (AbstractC25228BEl.A0B(obj2) != 2 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(-1869450866, "com.instagram.creation.genai.memu.sticker.edit.MemuStickerEditController.<anonymous>.<anonymous> (MemuStickerEditController.kt:46)");
                    }
                    c5Tl.Eno(1051906851);
                    C56181Owo c56181Owo = (C56181Owo) this.A01;
                    boolean AH6 = c5Tl.AH6(c56181Owo);
                    Object EEc6 = c5Tl.EEc();
                    if (AH6 || EEc6 == C5UI.A00) {
                        EEc6 = new C57242PbQ(c56181Owo, 1);
                        c5Tl.FBy(EEc6);
                    }
                    InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) EEc6;
                    C117505Tk c117505Tk2 = (C117505Tk) c5Tl;
                    C117505Tk.A0L(c117505Tk2, false);
                    boolean A1Z4 = AbstractC25227BEk.A1Z(c5Tl, c56181Owo, 1051911785);
                    Object EEc7 = c5Tl.EEc();
                    if (A1Z4 || EEc7 == C5UI.A00) {
                        EEc7 = AbstractC25230BEn.A0w(c5Tl, c56181Owo, 22);
                    }
                    CYM.A01(c5Tl, c56181Owo.A05, c56181Owo.A07, c56181Owo.A08, interfaceC16820sZ, AbstractC25225BEi.A1B(c117505Tk2, EEc7, false), 0, 0);
                    if (C0fH.A02()) {
                        i = -1569345338;
                        C0fH.A00(i);
                    }
                    return C0eB.A00;
                }
                c5Tl.Em9();
                return C0eB.A00;
            case Process.SIGTERM /* 15 */:
                c5Tl = (C5Tl) obj;
                if (AbstractC25228BEl.A0B(obj2) != 2 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(-571380414, "com.instagram.creation.genai.memu.sticker.edit.MemuStickerEditController.<anonymous> (MemuStickerEditController.kt:45)");
                    }
                    C56181Owo c56181Owo2 = (C56181Owo) this.A01;
                    C5VW.A01(c5Tl, c56181Owo2.A06, "memu_sticker_edit_controller", C5UA.A01(c5Tl, A00(c56181Owo2, 14), 1349249934));
                    if (C0fH.A02()) {
                        i = 783895002;
                        C0fH.A00(i);
                    }
                    return C0eB.A00;
                }
                c5Tl.Em9();
                return C0eB.A00;
            case 16:
                c5Tl = (C5Tl) obj;
                if (AbstractC25228BEl.A0C(obj2) != 2 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(1306620526, "com.instagram.creation.genai.themes.ui.AiThemesScreen.<anonymous>.<anonymous> (AiThemesScreen.kt:70)");
                    }
                    CHZ.A00(((C25870BcR) this.A01).A0K, c5Tl, 0);
                    if (C0fH.A02()) {
                        i = 752466065;
                        C0fH.A00(i);
                    }
                    return C0eB.A00;
                }
                c5Tl.Em9();
                return C0eB.A00;
            case 17:
                String str6 = (String) obj;
                AbstractC167017dG.A1N(str6, obj2);
                N6J n6j = (N6J) this.A01;
                OFX ofx = n6j.A06;
                if (ofx == null) {
                    C14360o3.A0F("viewHolder");
                    throw C00O.createAndThrow();
                }
                ofx.A0A.setText(str6);
                AnonymousClass229.A01(n6j.A0S()).A1d(C81W.A08, n6j.A0C);
                return C0eB.A00;
            case 18:
                boolean A1a = AbstractC166987dD.A1a(obj2);
                P1D p1d = (P1D) this.A01;
                AnonymousClass229.A01(p1d.A05).A1Y(p1d.A03);
                P1D.A02(p1d, A1a);
                return C0eB.A00;
            case Process.SIGSTOP /* 19 */:
                boolean A1a2 = AbstractC166987dD.A1a(obj2);
                UserSession userSession = ((P1D) this.A01).A05;
                AbstractC173537o5.A00(userSession).A01(A1a2);
                C55192Ody.A00.A05(userSession, A1a2);
                return C0eB.A00;
            case 20:
                String str7 = (String) obj2;
                C14360o3.A0B(str7, 1);
                P13 p13 = (P13) this.A01;
                C55904Ort c55904Ort = p13.A07;
                NKA nka = p13.A08;
                c55904Ort.A00((String) obj, str7, nka.A00, nka.A04, nka.A01);
                return C0eB.A00;
            case 21:
                c5Tl = (C5Tl) obj;
                if (AbstractC25228BEl.A0B(obj2) != 2 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(1868255585, "com.instagram.creator.achievements.modules.fragments.AboutAchievementsFragment.onCreateView.<anonymous> (AboutAchievementsFragment.kt:75)");
                    }
                    C26753Bra c26753Bra = (C26753Bra) this.A01;
                    if (AbstractC25235BEs.A1Z(c5Tl, new C30485DbU(44, C6IB.A01(c5Tl, C27137By4.A00, ((C25821Bbc) c26753Bra.A00.getValue()).A02, 0), c26753Bra), 488320799)) {
                        i = 263155996;
                        C0fH.A00(i);
                    }
                    return C0eB.A00;
                }
                c5Tl.Em9();
                return C0eB.A00;
            case 22:
                c5Tl = (C5Tl) obj;
                if (AbstractC25228BEl.A0B(obj2) != 2 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(1660667551, "com.instagram.creator.achievements.modules.fragments.AchievementDetailsFragment.onCreateView.<anonymous> (AchievementDetailsFragment.kt:82)");
                    }
                    C26748BrV c26748BrV = (C26748BrV) this.A01;
                    C6L8.A04(c5Tl, C30485DbU.A00(c5Tl, C6IB.A01(c5Tl, C27141By9.A00, ((C25871BcS) c26748BrV.A00.getValue()).A07, 0), c26748BrV, 45, -888808061));
                    C0eB c0eB = C0eB.A00;
                    boolean A1Z5 = AbstractC25227BEk.A1Z(c5Tl, c26748BrV, -816710049);
                    Object EEc8 = c5Tl.EEc();
                    if (A1Z5 || EEc8 == C5UI.A00) {
                        EEc8 = new MCE(c26748BrV, null, 22);
                        c5Tl.FBy(EEc8);
                    }
                    AbstractC25231BEo.A10(c5Tl, EEc8, c0eB);
                    if (C0fH.A02()) {
                        i = 982020756;
                        C0fH.A00(i);
                    }
                    return C0eB.A00;
                }
                c5Tl.Em9();
                return C0eB.A00;
            case 23:
                c5Tl = (C5Tl) obj;
                if (AbstractC25228BEl.A0B(obj2) != 2 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(183703786, "com.instagram.creator.achievements.modules.fragments.AchievementTiersFragment.onCreateView.<anonymous>.<anonymous> (AchievementTiersFragment.kt:72)");
                    }
                    Modifier A0W = AbstractC25228BEl.A0W();
                    c5Tl.Eno(1246186615);
                    Object obj6 = this.A01;
                    boolean AH62 = c5Tl.AH6(obj6);
                    Object EEc9 = c5Tl.EEc();
                    if (AH62 || EEc9 == C5UI.A00) {
                        EEc9 = AbstractC25235BEs.A17(c5Tl, obj6, 25);
                    }
                    AbstractC25225BEi.A1V(c5Tl, false);
                    C6IS.A06(c5Tl, A0W, (InterfaceC16660sJ) EEc9);
                    if (C0fH.A02()) {
                        i = -735630138;
                        C0fH.A00(i);
                    }
                    return C0eB.A00;
                }
                c5Tl.Em9();
                return C0eB.A00;
            case 24:
                c5Tl = (C5Tl) obj;
                if (AbstractC25228BEl.A0B(obj2) != 2 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(2087253681, "com.instagram.creator.achievements.modules.fragments.AchievementsHubFragment.onCreateView.<anonymous> (AchievementsHubFragment.kt:117)");
                    }
                    C26756Brd c26756Brd = (C26756Brd) this.A01;
                    InterfaceC09390do interfaceC09390do2 = c26756Brd.A01;
                    InterfaceC74963Ym A015 = C6IB.A01(c5Tl, C27144ByC.A00, ((C25876Bcb) interfaceC09390do2.getValue()).A07, 0);
                    Object A0q = AbstractC25227BEk.A0q(c5Tl, 713579226);
                    Object obj7 = C5UI.A00;
                    if (A0q == obj7) {
                        A0q = AbstractC25229BEm.A0Q(c5Tl, new C50161MDo(A015, 42));
                    }
                    C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
                    boolean A1U = AbstractC25231BEo.A1U((InterfaceC74963Ym) A0q);
                    Object value = interfaceC09390do2.getValue();
                    boolean A1Z6 = AbstractC25227BEk.A1Z(c5Tl, value, 713584800);
                    Object EEc10 = c5Tl.EEc();
                    if (A1Z6 || EEc10 == obj7) {
                        EEc10 = AbstractC25229BEm.A0u(c5Tl, value, 53);
                    }
                    C6L8.A04(c5Tl, C5UA.A01(c5Tl, C30487DbW.A00(BGQ.A00(null, c5Tl, AbstractC25228BEl.A1D(A0K, EEc10, false), 0.0f, 0, 60, A1U), c26756Brd, A015, 17), 761366623));
                    InterfaceC15070pN interfaceC15070pN = ((C25876Bcb) interfaceC09390do2.getValue()).A06;
                    boolean A1Z7 = AbstractC25227BEk.A1Z(c5Tl, c26756Brd, 713641210);
                    Object EEc11 = c5Tl.EEc();
                    if (A1Z7 || EEc11 == obj7) {
                        EEc11 = new MCE(c26756Brd, null, 24);
                        c5Tl.FBy(EEc11);
                    }
                    AbstractC25228BEl.A1K(c5Tl, A0K, EEc11, interfaceC15070pN, false);
                    C0eB c0eB2 = C0eB.A00;
                    boolean A1Z8 = AbstractC25227BEk.A1Z(c5Tl, c26756Brd, 713726341);
                    Object EEc12 = c5Tl.EEc();
                    if (A1Z8 || EEc12 == obj7) {
                        EEc12 = AbstractC25235BEs.A0u(c5Tl, c26756Brd, 8);
                    }
                    C117505Tk.A0I(A0K);
                    C5UX.A04(c5Tl, c0eB2, (InterfaceC16620sF) EEc12);
                    if (C0fH.A02()) {
                        i = -1788341049;
                        C0fH.A00(i);
                    }
                    return C0eB.A00;
                }
                c5Tl.Em9();
                return C0eB.A00;
            case 25:
                c5Tl = (C5Tl) obj;
                if (AbstractC25228BEl.A0B(obj2) != 2 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(-1621269056, "com.instagram.creator.achievements.modules.fragments.ChallengeDetailsFragment.onCreateView.<anonymous> (ChallengeDetailsFragment.kt:84)");
                    }
                    C26747BrT c26747BrT = (C26747BrT) this.A01;
                    if (AbstractC25235BEs.A1Z(c5Tl, new C30485DbU(46, C6IB.A01(c5Tl, C27144ByC.A00, ((C25872BcU) c26747BrT.A00.getValue()).A08, 0), c26747BrT), -1129120381)) {
                        i = 559490445;
                        C0fH.A00(i);
                    }
                    return C0eB.A00;
                }
                c5Tl.Em9();
                return C0eB.A00;
            case 26:
                c5Tl = (C5Tl) obj;
                if (AbstractC25228BEl.A0B(obj2) != 2 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(1858705769, "com.instagram.creator.achievements.modules.fragments.ChallengeTiersFragment.onCreateView.<anonymous>.<anonymous> (ChallengeTiersFragment.kt:48)");
                    }
                    Modifier A0W2 = AbstractC25228BEl.A0W();
                    c5Tl.Eno(2001903497);
                    Object obj8 = this.A01;
                    boolean AH63 = c5Tl.AH6(obj8);
                    Object EEc13 = c5Tl.EEc();
                    if (AH63 || EEc13 == C5UI.A00) {
                        EEc13 = AbstractC25235BEs.A17(c5Tl, obj8, 27);
                    }
                    AbstractC25225BEi.A1V(c5Tl, false);
                    C6IS.A06(c5Tl, A0W2, (InterfaceC16660sJ) EEc13);
                    if (C0fH.A02()) {
                        i = 1935782597;
                        C0fH.A00(i);
                    }
                    return C0eB.A00;
                }
                c5Tl.Em9();
                return C0eB.A00;
            case 27:
                c5Tl = (C5Tl) obj;
                if (AbstractC25228BEl.A0B(obj2) != 2 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(546273684, "com.instagram.creator.achievements.modules.fragments.EarnedAchievementsFragment.onCreateView.<anonymous>.<anonymous> (EarnedAchievementsFragment.kt:42)");
                    }
                    C26774Brv c26774Brv = (C26774Brv) this.A01;
                    AbstractC27648CHt.A00(c5Tl, c26774Brv.requireActivity(), AbstractC166987dD.A0r(c26774Brv.A02), AbstractC25225BEi.A15(c26774Brv.A01), (List) c26774Brv.A00.getValue(), 0);
                    if (C0fH.A02()) {
                        i = -1796932718;
                        C0fH.A00(i);
                    }
                    return C0eB.A00;
                }
                c5Tl.Em9();
                return C0eB.A00;
            case 28:
                c5Tl = (C5Tl) obj;
                if (AbstractC25228BEl.A0B(obj2) != 2 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(957109356, "com.instagram.creator.agent.onboarding.fragment.CreatorAICreatorNuxFragment.onCreateView.<anonymous>.<anonymous> (CreatorAICreatorNuxFragment.kt:54)");
                    }
                    Object obj9 = this.A01;
                    boolean A1Z9 = AbstractC25227BEk.A1Z(c5Tl, obj9, -705680146);
                    Object EEc14 = c5Tl.EEc();
                    if (A1Z9 || EEc14 == C5UI.A00) {
                        EEc14 = AbstractC25229BEm.A0u(c5Tl, obj9, 54);
                    }
                    CI9.A00(c5Tl, null, null, (InterfaceC16820sZ) ((C0YS) EEc14), AbstractC25228BEl.A1W(c5Tl) ? 1 : 0, 6);
                    if (C0fH.A02()) {
                        i = 1385981253;
                        C0fH.A00(i);
                    }
                    return C0eB.A00;
                }
                c5Tl.Em9();
                return C0eB.A00;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                c5Tl = (C5Tl) obj;
                if (AbstractC25228BEl.A0B(obj2) != 2 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(1636647591, "com.instagram.creator.agent.onboarding.fragment.CreatorAICreatorNuxFragment.onCreateView.<anonymous> (CreatorAICreatorNuxFragment.kt:43)");
                    }
                    C0eB c0eB3 = C0eB.A00;
                    c5Tl.Eno(986067086);
                    Object obj10 = this.A01;
                    boolean AH64 = c5Tl.AH6(obj10);
                    Object EEc15 = c5Tl.EEc();
                    if (AH64 || EEc15 == C5UI.A00) {
                        EEc15 = D4z.A02(obj10, null, 33);
                        c5Tl.FBy(EEc15);
                    }
                    AbstractC25231BEo.A11(c5Tl, EEc15, c0eB3);
                    if (AbstractC25235BEs.A1Z(c5Tl, A00(obj10, 28), -1604077635)) {
                        i = 1119481192;
                        C0fH.A00(i);
                    }
                    return C0eB.A00;
                }
                c5Tl.Em9();
                return C0eB.A00;
            case 30:
                c5Tl = (C5Tl) obj;
                if (AbstractC25228BEl.A0B(obj2) != 2 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(1614316467, "com.instagram.creator.agent.onboarding.fragment.CreatorAIReadyFragment.onCreateView.<anonymous>.<anonymous> (CreatorAIReadyFragment.kt:53)");
                    }
                    C26789BsD c26789BsD = (C26789BsD) this.A01;
                    InterfaceC74963Ym A022 = C6IB.A02(c5Tl, ((C26903Bu6) c26789BsD.A03.getValue()).A03, 0);
                    String A005 = C5YD.A00(c5Tl, 2131957124);
                    String A006 = C5YD.A00(c5Tl, 2131957123);
                    String A007 = C5YD.A00(c5Tl, 2131957094);
                    boolean z5 = ((C51688MsJ) A022.getValue()).A00;
                    boolean A1Z10 = AbstractC25227BEk.A1Z(c5Tl, c26789BsD, 660656796);
                    Object EEc16 = c5Tl.EEc();
                    if (A1Z10 || EEc16 == C5UI.A00) {
                        EEc16 = AbstractC25229BEm.A0u(c5Tl, c26789BsD, 55);
                    }
                    AbstractC25225BEi.A1V(c5Tl, false);
                    CIA.A00(c5Tl, A005, A006, A007, (InterfaceC16820sZ) ((C0YS) EEc16), 0, z5);
                    if (C0fH.A02()) {
                        i = 862165248;
                        C0fH.A00(i);
                    }
                    return C0eB.A00;
                }
                c5Tl.Em9();
                return C0eB.A00;
            case 31:
                c5Tl = (C5Tl) obj;
                if (AbstractC25228BEl.A0B(obj2) != 2 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(-254950933, "com.instagram.creator.agent.onboarding.fragment.CreatorAIReadyFragment.onCreateView.<anonymous> (CreatorAIReadyFragment.kt:51)");
                    }
                    C0eB c0eB4 = C0eB.A00;
                    c5Tl.Eno(-49148052);
                    Object obj11 = this.A01;
                    boolean AH65 = c5Tl.AH6(obj11);
                    Object EEc17 = c5Tl.EEc();
                    if (AH65 || EEc17 == C5UI.A00) {
                        EEc17 = AbstractC25235BEs.A0u(c5Tl, obj11, 10);
                    }
                    AbstractC25231BEo.A11(c5Tl, EEc17, c0eB4);
                    if (AbstractC25235BEs.A1Z(c5Tl, A00(obj11, 30), -1876998083)) {
                        i = 1604191257;
                        C0fH.A00(i);
                    }
                    return C0eB.A00;
                }
                c5Tl.Em9();
                return C0eB.A00;
            case 32:
                c5Tl = (C5Tl) obj;
                if (AbstractC25228BEl.A0B(obj2) != 2 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(413240917, "com.instagram.creator.agent.onboarding.fragment.CreatorAiPreparationFragment.onCreateView.<anonymous>.<anonymous> (CreatorAiPreparationFragment.kt:47)");
                    }
                    String A008 = C5YD.A00(c5Tl, 2131957118);
                    String A009 = C5YD.A00(c5Tl, 2131957117);
                    String A0010 = C5YD.A00(c5Tl, 2131957093);
                    Object obj12 = this.A01;
                    boolean A1Z11 = AbstractC25227BEk.A1Z(c5Tl, obj12, 812893031);
                    Object EEc18 = c5Tl.EEc();
                    if (A1Z11 || EEc18 == C5UI.A00) {
                        EEc18 = AbstractC25229BEm.A0u(c5Tl, obj12, 56);
                    }
                    AbstractC25225BEi.A1V(c5Tl, false);
                    CIA.A00(c5Tl, A008, A009, A0010, (InterfaceC16820sZ) ((C0YS) EEc18), 3072, false);
                    if (C0fH.A02()) {
                        i = 1384363689;
                        C0fH.A00(i);
                    }
                    return C0eB.A00;
                }
                c5Tl.Em9();
                return C0eB.A00;
            case 33:
                c5Tl = (C5Tl) obj;
                if (AbstractC25228BEl.A0B(obj2) != 2 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(-54288482, "com.instagram.creator.agent.onboarding.fragment.CreatorAiPreparationFragment.onCreateView.<anonymous> (CreatorAiPreparationFragment.kt:45)");
                    }
                    C0eB c0eB5 = C0eB.A00;
                    c5Tl.Eno(216404476);
                    Object obj13 = this.A01;
                    boolean AH66 = c5Tl.AH6(obj13);
                    Object EEc19 = c5Tl.EEc();
                    if (AH66 || EEc19 == C5UI.A00) {
                        EEc19 = AbstractC25235BEs.A0u(c5Tl, obj13, 11);
                    }
                    AbstractC25231BEo.A11(c5Tl, EEc19, c0eB5);
                    if (AbstractC25235BEs.A1Z(c5Tl, A00(obj13, 32), -1541245163)) {
                        i = -1015237656;
                        C0fH.A00(i);
                    }
                    return C0eB.A00;
                }
                c5Tl.Em9();
                return C0eB.A00;
            case 34:
                c5Tl = (C5Tl) obj;
                if (AbstractC25228BEl.A0B(obj2) != 2 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(-2097890832, "com.instagram.creator.agent.settings.audience.AudienceFragment.onCreateView.<anonymous>.<anonymous> (AudienceFragment.kt:91)");
                    }
                    C26876Btd c26876Btd = (C26876Btd) this.A01;
                    InterfaceC09390do interfaceC09390do3 = c26876Btd.A03;
                    C26039BfS c26039BfS = (C26039BfS) AbstractC25235BEs.A0l(c5Tl, ((C26906Bu9) interfaceC09390do3.getValue()).A00.A0B, 0);
                    BP5 bp5 = (BP5) c26876Btd.A01.getValue();
                    Object value2 = interfaceC09390do3.getValue();
                    boolean A1Z12 = AbstractC25227BEk.A1Z(c5Tl, value2, -1580421956);
                    Object EEc20 = c5Tl.EEc();
                    if (A1Z12 || EEc20 == C5UI.A00) {
                        EEc20 = AbstractC25229BEm.A0u(c5Tl, value2, 57);
                    }
                    C0YS c0ys = (C0YS) EEc20;
                    C117505Tk A0K2 = AbstractC25225BEi.A0K(c5Tl, false);
                    boolean A1Z13 = AbstractC25227BEk.A1Z(c5Tl, c26876Btd, -1580420065);
                    Object EEc21 = c5Tl.EEc();
                    if (A1Z13 || EEc21 == C5UI.A00) {
                        EEc21 = AbstractC25229BEm.A0u(c5Tl, c26876Btd, 58);
                    }
                    C0YS A1G = AbstractC25225BEi.A1G(A0K2, EEc21, false);
                    boolean A1Z14 = AbstractC25227BEk.A1Z(c5Tl, c26876Btd, -1580418049);
                    Object EEc22 = c5Tl.EEc();
                    if (A1Z14 || EEc22 == C5UI.A00) {
                        EEc22 = AbstractC25229BEm.A0u(c5Tl, c26876Btd, 59);
                    }
                    InterfaceC16820sZ A1D = AbstractC25228BEl.A1D(A0K2, EEc22, false);
                    InterfaceC16820sZ interfaceC16820sZ2 = (InterfaceC16820sZ) c0ys;
                    boolean A1Z15 = AbstractC25227BEk.A1Z(c5Tl, c26876Btd, -1580427257);
                    Object EEc23 = c5Tl.EEc();
                    if (A1Z15 || EEc23 == C5UI.A00) {
                        EEc23 = AbstractC25235BEs.A17(c5Tl, c26876Btd, 28);
                    }
                    InterfaceC16660sJ A1B = AbstractC25225BEi.A1B(A0K2, EEc23, false);
                    InterfaceC16820sZ interfaceC16820sZ3 = (InterfaceC16820sZ) A1G;
                    boolean A1Z16 = AbstractC25227BEk.A1Z(c5Tl, c26876Btd, -1580416472);
                    Object EEc24 = c5Tl.EEc();
                    if (A1Z16 || EEc24 == C5UI.A00) {
                        EEc24 = C29911DGz.A01(c26876Btd, 37);
                        c5Tl.FBy(EEc24);
                    }
                    CYQ.A01(c5Tl, bp5, c26039BfS, A1D, interfaceC16820sZ2, interfaceC16820sZ3, AbstractC25225BEi.A1A(A0K2, EEc24, false), A1B, 0, 0);
                    if (C0fH.A02()) {
                        i = 1151427740;
                        C0fH.A00(i);
                    }
                    return C0eB.A00;
                }
                c5Tl.Em9();
                return C0eB.A00;
            case 35:
                c5Tl = (C5Tl) obj;
                if (AbstractC25228BEl.A0B(obj2) != 2 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(-1744596142, "com.instagram.creator.agent.settings.audience.AudienceFragment.onCreateView.<anonymous> (AudienceFragment.kt:90)");
                    }
                    if (AbstractC25235BEs.A1Z(c5Tl, A00(this.A01, 34), 1037417767)) {
                        i = 1650094159;
                        C0fH.A00(i);
                    }
                    return C0eB.A00;
                }
                c5Tl.Em9();
                return C0eB.A00;
            case 36:
                c5Tl = (C5Tl) obj;
                if (AbstractC25228BEl.A0B(obj2) != 2 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(-93694140, "com.instagram.creator.agent.settings.audience.ReachabilityFragment.onCreateView.<anonymous>.<anonymous> (ReachabilityFragment.kt:57)");
                    }
                    C26875Btc c26875Btc = (C26875Btc) this.A01;
                    MUG mug = (MUG) AbstractC25235BEs.A0l(c5Tl, ((C26906Bu9) c26875Btc.A02.getValue()).A01.A06, 0);
                    BP5 bp52 = (BP5) c26875Btc.A00.getValue();
                    boolean A1Z17 = AbstractC25227BEk.A1Z(c5Tl, c26875Btc, 1860129380);
                    Object EEc25 = c5Tl.EEc();
                    if (A1Z17 || EEc25 == C5UI.A00) {
                        EEc25 = C29911DGz.A01(c26875Btc, 44);
                        c5Tl.FBy(EEc25);
                    }
                    InterfaceC16820sZ interfaceC16820sZ4 = (InterfaceC16820sZ) EEc25;
                    C117505Tk A0K3 = AbstractC25225BEi.A0K(c5Tl, false);
                    boolean A1Z18 = AbstractC25227BEk.A1Z(c5Tl, c26875Btc, 1860131680);
                    Object EEc26 = c5Tl.EEc();
                    if (A1Z18 || EEc26 == C5UI.A00) {
                        EEc26 = AbstractC25229BEm.A0u(c5Tl, c26875Btc, 60);
                    }
                    CIB.A00(c5Tl, mug, bp52, interfaceC16820sZ4, AbstractC25228BEl.A1D(A0K3, EEc26, false), 0, 0);
                    if (C0fH.A02()) {
                        i = -232581692;
                        C0fH.A00(i);
                    }
                    return C0eB.A00;
                }
                c5Tl.Em9();
                return C0eB.A00;
            case 37:
                c5Tl = (C5Tl) obj;
                if (AbstractC25228BEl.A0B(obj2) != 2 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(684528423, "com.instagram.creator.agent.settings.audience.ReachabilityFragment.onCreateView.<anonymous> (ReachabilityFragment.kt:56)");
                    }
                    if (AbstractC25235BEs.A1Z(c5Tl, A00(this.A01, 36), -1809075007)) {
                        i = -629769594;
                        C0fH.A00(i);
                    }
                    return C0eB.A00;
                }
                c5Tl.Em9();
                return C0eB.A00;
            case 38:
                c5Tl = (C5Tl) obj;
                if (AbstractC25228BEl.A0B(obj2) != 2 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(-2002141478, "com.instagram.creator.agent.settings.audience.SelectAccountsFragment.onCreateView.<anonymous>.<anonymous> (SelectAccountsFragment.kt:91)");
                    }
                    C26877Bte c26877Bte = (C26877Bte) this.A01;
                    InterfaceC09390do interfaceC09390do4 = c26877Bte.A02;
                    C26082BgB c26082BgB = (C26082BgB) AbstractC25235BEs.A0l(c5Tl, ((C26906Bu9) interfaceC09390do4.getValue()).A02.A0D, 0);
                    BP5 bp53 = (BP5) c26877Bte.A01.getValue();
                    Object value3 = interfaceC09390do4.getValue();
                    boolean A1Z19 = AbstractC25227BEk.A1Z(c5Tl, value3, -1765581246);
                    Object EEc27 = c5Tl.EEc();
                    if (A1Z19 || EEc27 == C5UI.A00) {
                        EEc27 = AbstractC25230BEn.A0u(c5Tl, value3, 1);
                    }
                    C117505Tk A0K4 = AbstractC25225BEi.A0K(c5Tl, false);
                    InterfaceC16660sJ interfaceC16660sJ = (InterfaceC16660sJ) ((C0YS) EEc27);
                    boolean A1Z20 = AbstractC25227BEk.A1Z(c5Tl, c26877Bte, -1765580010);
                    Object EEc28 = c5Tl.EEc();
                    if (A1Z20 || EEc28 == C5UI.A00) {
                        EEc28 = AbstractC25229BEm.A0u(c5Tl, c26877Bte, 61);
                    }
                    InterfaceC16820sZ A1D2 = AbstractC25228BEl.A1D(A0K4, EEc28, false);
                    Object value4 = interfaceC09390do4.getValue();
                    boolean A1Z21 = AbstractC25227BEk.A1Z(c5Tl, value4, -1765579129);
                    Object EEc29 = c5Tl.EEc();
                    if (A1Z21 || EEc29 == C5UI.A00) {
                        EEc29 = AbstractC25230BEn.A0u(c5Tl, value4, 2);
                    }
                    InterfaceC16660sJ A1E3 = AbstractC25228BEl.A1E(A0K4, EEc29, false);
                    Object value5 = interfaceC09390do4.getValue();
                    boolean A1Z22 = AbstractC25227BEk.A1Z(c5Tl, value5, -1765577720);
                    Object EEc30 = c5Tl.EEc();
                    if (A1Z22 || EEc30 == C5UI.A00) {
                        EEc30 = AbstractC25229BEm.A0u(c5Tl, value5, 62);
                    }
                    AbstractC28420CgR.A02(c5Tl, c26082BgB, bp53, A1D2, AbstractC25228BEl.A1D(A0K4, EEc30, false), interfaceC16660sJ, A1E3, 0, 0);
                    if (C0fH.A02()) {
                        i = 1254245966;
                        C0fH.A00(i);
                    }
                    return C0eB.A00;
                }
                c5Tl.Em9();
                return C0eB.A00;
            case 39:
                c5Tl = (C5Tl) obj;
                if (AbstractC25228BEl.A0B(obj2) != 2 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(1356365461, "com.instagram.creator.agent.settings.audience.SelectAccountsFragment.onCreateView.<anonymous> (SelectAccountsFragment.kt:90)");
                    }
                    if (AbstractC25235BEs.A1Z(c5Tl, A00(this.A01, 38), -2026620053)) {
                        i = -1499410806;
                        C0fH.A00(i);
                    }
                    return C0eB.A00;
                }
                c5Tl.Em9();
                return C0eB.A00;
            case 40:
                c5Tl = (C5Tl) obj;
                if (AbstractC25228BEl.A0B(obj2) != 2 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(-1093847790, "com.instagram.creator.agent.settings.avoidedtopics.fragment.AvoidedTopicsFragment.onCreateView.<anonymous>.<anonymous> (AvoidedTopicsFragment.kt:108)");
                    }
                    C26769Brq c26769Brq = (C26769Brq) this.A01;
                    InterfaceC09390do interfaceC09390do5 = c26769Brq.A04;
                    InterfaceC74963Ym A023 = C6IB.A02(c5Tl, ((C25823Bbe) interfaceC09390do5.getValue()).A02, 0);
                    List list3 = (List) ((C50627MWo) A023.getValue()).A01;
                    boolean A1Z23 = AbstractC25227BEk.A1Z(c5Tl, c26769Brq, -680607372);
                    Object EEc31 = c5Tl.EEc();
                    if (A1Z23 || EEc31 == C5UI.A00) {
                        EEc31 = AbstractC25235BEs.A17(c5Tl, c26769Brq, 30);
                    }
                    InterfaceC16660sJ interfaceC16660sJ2 = (InterfaceC16660sJ) EEc31;
                    C117505Tk A0K5 = AbstractC25225BEi.A0K(c5Tl, false);
                    Object value6 = interfaceC09390do5.getValue();
                    boolean A1Z24 = AbstractC25227BEk.A1Z(c5Tl, value6, -680577422);
                    Object EEc32 = c5Tl.EEc();
                    if (A1Z24 || EEc32 == C5UI.A00) {
                        EEc32 = AbstractC25230BEn.A0u(c5Tl, value6, 4);
                    }
                    InterfaceC16660sJ A1E4 = AbstractC25228BEl.A1E(A0K5, EEc32, false);
                    boolean A1Z25 = AbstractC25227BEk.A1Z(c5Tl, c26769Brq, -680574849);
                    Object EEc33 = c5Tl.EEc();
                    if (A1Z25 || EEc33 == C5UI.A00) {
                        EEc33 = C29908DGw.A01(c5Tl, c26769Brq, 11);
                    }
                    InterfaceC16820sZ A1A = AbstractC25225BEi.A1A(A0K5, EEc33, false);
                    boolean A1Z26 = AbstractC25227BEk.A1Z(c5Tl, c26769Brq, -680555557);
                    Object EEc34 = c5Tl.EEc();
                    if (A1Z26 || EEc34 == C5UI.A00) {
                        EEc34 = AbstractC25235BEs.A17(c5Tl, c26769Brq, 31);
                    }
                    AbstractC28313Cdz.A02(c5Tl, (C6R) ((C50627MWo) AbstractC25227BEk.A0s(A0K5, A023, false)).A00, list3, A1A, interfaceC16660sJ2, A1E4, (InterfaceC16660sJ) EEc34, 0);
                    if (C0fH.A02()) {
                        i = 1757436081;
                        C0fH.A00(i);
                    }
                    return C0eB.A00;
                }
                c5Tl.Em9();
                return C0eB.A00;
            case Seq.NULL_REFNUM /* 41 */:
                c5Tl = (C5Tl) obj;
                if (AbstractC25228BEl.A0B(obj2) != 2 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(1803634087, "com.instagram.creator.agent.settings.avoidedtopics.fragment.AvoidedTopicsFragment.onCreateView.<anonymous> (AvoidedTopicsFragment.kt:106)");
                    }
                    C0eB c0eB6 = C0eB.A00;
                    c5Tl.Eno(-927335887);
                    Object obj14 = this.A01;
                    boolean AH67 = c5Tl.AH6(obj14);
                    Object EEc35 = c5Tl.EEc();
                    if (AH67 || EEc35 == C5UI.A00) {
                        EEc35 = AbstractC25235BEs.A0u(c5Tl, obj14, 16);
                    }
                    AbstractC25231BEo.A11(c5Tl, EEc35, c0eB6);
                    if (AbstractC25235BEs.A1Y(c5Tl, AbstractC25228BEl.A0W(), A00(obj14, 40), -942901109)) {
                        i = 1666116056;
                        C0fH.A00(i);
                    }
                    return C0eB.A00;
                }
                c5Tl.Em9();
                return C0eB.A00;
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                c5Tl = (C5Tl) obj;
                if (AbstractC25228BEl.A0B(obj2) != 2 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(-152588070, "com.instagram.creator.agent.settings.avoidedtopics.fragment.AvoidedTopicItem.<anonymous> (AvoidedTopicsFragment.kt:203)");
                    }
                    AbstractC25705BXp.A0E(c5Tl, AbstractC25232BEp.A0y(c5Tl, Modifier.A00), C29198Cu3.A00, ((C45116Jxl) this.A01).A02);
                    if (C0fH.A02()) {
                        i = -561978827;
                        C0fH.A00(i);
                    }
                    return C0eB.A00;
                }
                c5Tl.Em9();
                return C0eB.A00;
            case 43:
                c5Tl = (C5Tl) obj;
                if (AbstractC25228BEl.A0B(obj2) != 2 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(-1052304738, "com.instagram.creator.agent.settings.content.sources.fragment.CreatorAISettingsContentFragment.onCreateView.<anonymous> (CreatorAISettingsContentFragment.kt:43)");
                    }
                    C26754Brb c26754Brb = (C26754Brb) this.A01;
                    CYR.A01(c5Tl, null, (BP5) c26754Brb.A00.getValue(), AbstractC25225BEi.A15(c26754Brb.A01), 0, 4);
                    if (C0fH.A02()) {
                        i = 1200084434;
                        C0fH.A00(i);
                    }
                    return C0eB.A00;
                }
                c5Tl.Em9();
                return C0eB.A00;
            case 44:
                c5Tl = (C5Tl) obj;
                if (AbstractC25228BEl.A0B(obj2) != 2 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(1269714093, "com.instagram.creator.agent.settings.facts.fragment.FactsFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FactsFragment.kt:53)");
                    }
                    C26712Bqt c26712Bqt = (C26712Bqt) this.A01;
                    EnumC27380C6j enumC27380C6j = (EnumC27380C6j) c26712Bqt.A02.getValue();
                    String A15 = AbstractC25225BEi.A15(c26712Bqt.A00);
                    String A152 = AbstractC25225BEi.A15(c26712Bqt.A01);
                    boolean A1Z27 = AbstractC25227BEk.A1Z(c5Tl, c26712Bqt, -1885173210);
                    Object EEc36 = c5Tl.EEc();
                    if (A1Z27 || EEc36 == C5UI.A00) {
                        EEc36 = new C29643D5i(c26712Bqt, 0);
                        c5Tl.FBy(EEc36);
                    }
                    AbstractC28441Cgp.A03(c5Tl, enumC27380C6j, A15, A152, (C0s9) ((C0YS) EEc36), AbstractC25228BEl.A1W(c5Tl) ? 1 : 0);
                    if (C0fH.A02()) {
                        i = -484895313;
                        C0fH.A00(i);
                    }
                    return C0eB.A00;
                }
                c5Tl.Em9();
                return C0eB.A00;
            case 45:
                c5Tl = (C5Tl) obj;
                if (AbstractC25228BEl.A0B(obj2) != 2 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(-676779910, "com.instagram.creator.agent.settings.facts.fragment.FactsFragment.onCreateView.<anonymous>.<anonymous> (FactsFragment.kt:45)");
                    }
                    C26712Bqt c26712Bqt2 = (C26712Bqt) this.A01;
                    C1130158n c1130158n2 = Modifier.A00;
                    InterfaceC1127857k A024 = AbstractC119595bH.A02(AbstractC118255Wn.A07, c5Tl, C118195Wf.A02, 0);
                    int A0011 = C5X2.A00(c5Tl);
                    C117505Tk c117505Tk3 = (C117505Tk) c5Tl;
                    C59P A042 = C117505Tk.A04(c117505Tk3);
                    Modifier A016 = C5X3.A01(c5Tl, c1130158n2);
                    AbstractC25233BEq.A11(c5Tl, c117505Tk3);
                    AbstractC25231BEo.A12(c5Tl, A024, A042);
                    InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
                    if (c117505Tk3.A0K || !AbstractC25231BEo.A1O(c5Tl, A0011)) {
                        AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A0011);
                    }
                    AbstractC25225BEi.A1K(c5Tl, A016);
                    c5Tl.Eno(-2079195769);
                    if (c26712Bqt2.A02.getValue() == EnumC27380C6j.A04) {
                        AbstractC25708BXt.A04(c5Tl, new C25707BXs(null, 7, 0), C5YD.A00(c5Tl, 2131957109));
                    }
                    C117505Tk.A0L(c117505Tk3, false);
                    AbstractC25230BEn.A17(c5Tl, CZV.A00.A02(c26712Bqt2.requireActivity()), A00(c26712Bqt2, 44), 572630706);
                    if (AbstractC25227BEk.A1R(c5Tl)) {
                        i = -1344093216;
                        C0fH.A00(i);
                    }
                    return C0eB.A00;
                }
                c5Tl.Em9();
                return C0eB.A00;
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                c5Tl = (C5Tl) obj;
                if (AbstractC25228BEl.A0B(obj2) != 2 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(1767068805, "com.instagram.creator.agent.settings.facts.fragment.FactsFragment.onCreateView.<anonymous> (FactsFragment.kt:44)");
                    }
                    if (AbstractC25235BEs.A1Z(c5Tl, A00(this.A01, 45), 51391100)) {
                        i = -2053398528;
                        C0fH.A00(i);
                    }
                    return C0eB.A00;
                }
                c5Tl.Em9();
                return C0eB.A00;
            case 47:
                c5Tl = (C5Tl) obj;
                if (AbstractC25228BEl.A0B(obj2) != 2 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(215141811, "com.instagram.creator.agent.settings.fragment.CreatorAIDeletionConfirmationBottomSheetFragment.onCreateView.<anonymous>.<anonymous> (CreatorAIDeletionConfirmationBottomSheetFragment.kt:69)");
                    }
                    C0eB c0eB7 = C0eB.A00;
                    c5Tl.Eno(1337120430);
                    Object obj15 = this.A01;
                    boolean AH68 = c5Tl.AH6(obj15);
                    Object EEc37 = c5Tl.EEc();
                    if (AH68 || EEc37 == C5UI.A00) {
                        EEc37 = AbstractC25235BEs.A0u(c5Tl, obj15, 19);
                    }
                    C117505Tk c117505Tk4 = (C117505Tk) c5Tl;
                    boolean A1T = AbstractC25229BEm.A1T(c5Tl, c117505Tk4, c0eB7, (InterfaceC16620sF) EEc37);
                    C1130158n c1130158n3 = Modifier.A00;
                    InterfaceC1127857k A0Y = AbstractC25229BEm.A0Y(c5Tl, A1T ? 1 : 0);
                    int A0012 = C5X2.A00(c5Tl);
                    C59P A043 = C117505Tk.A04(c117505Tk4);
                    Modifier A017 = C5X3.A01(c5Tl, c1130158n3);
                    AbstractC25233BEq.A11(c5Tl, c117505Tk4);
                    AbstractC25231BEo.A12(c5Tl, A0Y, A043);
                    InterfaceC16620sF interfaceC16620sF3 = C5X8.A02;
                    if (c117505Tk4.A0K || !AbstractC25231BEo.A1O(c5Tl, A0012)) {
                        AbstractC25231BEo.A15(c5Tl, interfaceC16620sF3, A0012);
                    }
                    AbstractC25225BEi.A1K(c5Tl, A017);
                    C5WR.A04(c5Tl, AbstractC25225BEi.A0Q(AbstractC118175Wb.A0E(c1130158n3, 0.0f, 0.0f, 0.0f, 12.0f)), AbstractC25225BEi.A0X(c5Tl), C5YD.A00(c5Tl, 2131957075));
                    C5WR.A05(c5Tl, AbstractC118175Wb.A08(c1130158n3, 16.0f), AbstractC25226BEj.A0c(c5Tl), C5YD.A00(c5Tl, 2131957071));
                    C5WR.A05(c5Tl, AbstractC118175Wb.A0E(AbstractC118175Wb.A0A(c1130158n3, 16.0f, 0.0f), 0.0f, 0.0f, 0.0f, 16.0f), AbstractC25226BEj.A0c(c5Tl), C5YD.A00(c5Tl, 2131957072));
                    String A0013 = C5YD.A00(c5Tl, 2131957076);
                    boolean A1Z28 = AbstractC25227BEk.A1Z(c5Tl, obj15, -634802037);
                    Object EEc38 = c5Tl.EEc();
                    if (A1Z28 || EEc38 == C5UI.A00) {
                        EEc38 = C29908DGw.A01(c5Tl, obj15, 24);
                    }
                    InterfaceC16820sZ A1A2 = AbstractC25225BEi.A1A(c117505Tk4, EEc38, A1T);
                    String A0014 = C5YD.A00(c5Tl, 2131957069);
                    boolean A1Z29 = AbstractC25227BEk.A1Z(c5Tl, obj15, -634791329);
                    Object EEc39 = c5Tl.EEc();
                    if (A1Z29 || EEc39 == C5UI.A00) {
                        EEc39 = C29908DGw.A01(c5Tl, obj15, 25);
                    }
                    AbstractC28506Chz.A08(c5Tl, A0013, A0014, A1A2, AbstractC25225BEi.A1A(c117505Tk4, EEc39, A1T));
                    if (AbstractC25227BEk.A1R(c5Tl)) {
                        i = -974734862;
                        C0fH.A00(i);
                    }
                    return C0eB.A00;
                }
                c5Tl.Em9();
                return C0eB.A00;
            case 48:
                c5Tl = (C5Tl) obj;
                if (AbstractC25228BEl.A0B(obj2) != 2 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(-1884153738, "com.instagram.creator.agent.settings.fragment.CreatorAIDeletionConfirmationBottomSheetFragment.onCreateView.<anonymous> (CreatorAIDeletionConfirmationBottomSheetFragment.kt:68)");
                    }
                    if (AbstractC25235BEs.A1Z(c5Tl, A00(this.A01, 47), 861531753)) {
                        i = -1054658735;
                        C0fH.A00(i);
                    }
                    return C0eB.A00;
                }
                c5Tl.Em9();
                return C0eB.A00;
            default:
                int A0H2 = AbstractC166987dD.A0H(obj);
                int A0H3 = AbstractC166987dD.A0H(obj2);
                C26749BrW c26749BrW = (C26749BrW) this.A01;
                FragmentActivity requireActivity = c26749BrW.requireActivity();
                AbstractC12990ll A0o = AbstractC166987dD.A0o(c26749BrW.A04);
                C14360o3.A0B(A0o, 1);
                Bundle A0T = AbstractC167017dG.A0T("creator_ai_total_steps", Integer.valueOf(A0H3), AbstractC166987dD.A1L("creator_ai_steps_completed", Integer.valueOf(A0H2)));
                C26874Btb c26874Btb = new C26874Btb();
                c26874Btb.setArguments(A0T);
                C140966Yy A0r = AbstractC25225BEi.A0r(requireActivity, A0o);
                A0r.A0D(c26874Btb);
                A0r.A04();
                return C0eB.A00;
        }
    }
}
