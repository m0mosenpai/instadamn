package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.session.UserSession;
import com.instagram.contentnotes.ui.immersivereply.ImmersiveReplyControlMenuViewBinder;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.User;
import go.Seq;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.ClG, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ViewOnClickListenerC28668ClG implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public ViewOnClickListenerC28668ClG(C38321qM c38321qM, C25448BNn c25448BNn, int i) {
        this.A00 = i;
        switch (i) {
            case 37:
            case 39:
                this.A02 = c25448BNn;
                this.A01 = c38321qM;
                break;
            case 38:
            default:
                this.A01 = c38321qM;
                this.A02 = c25448BNn;
                break;
        }
    }

    public static void A02(View view, int i, Object obj, Object obj2) {
        C0fQ.A00(new ViewOnClickListenerC28668ClG(i, obj, obj2), view);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        ArrayList A0U;
        C26072Bg1 c26072Bg1;
        boolean z;
        int i;
        String str;
        int A052;
        ArrayList A0U2;
        C26072Bg1 c26072Bg12;
        boolean z2;
        int i2;
        C05A c05a;
        C9BK c9bk;
        Object value;
        Object obj;
        int i3;
        long j;
        Long A0j;
        String str2;
        switch (this.A00) {
            case 0:
                A052 = C0f9.A05(-1412487007);
                C26804BsS c26804BsS = (C26804BsS) this.A02;
                InterfaceC56362iU interfaceC56362iU = (InterfaceC56362iU) this.A01;
                InterfaceC09390do interfaceC09390do = c26804BsS.A05;
                AbstractC25226BEj.A0n(interfaceC09390do).A05();
                AbstractC25226BEj.A0q(c26804BsS.A02).A0M(AbstractC25225BEi.A15(c26804BsS.A03), C25879Bce.A03(interfaceC09390do), "advanced_settings_creation");
                C26012Bf0 c26012Bf0 = (C26012Bf0) AbstractC25226BEj.A0n(interfaceC09390do).A0O.getValue();
                C25879Bce A0n = AbstractC25226BEj.A0n(interfaceC09390do);
                C05A c05a2 = A0n.A04;
                Object value2 = c05a2.getValue();
                if (value2 != null) {
                    C26072Bg1 c26072Bg13 = (C26072Bg1) value2;
                    Object value3 = A0n.A07.getValue();
                    if (value3 != null) {
                        C26012Bf0 c26012Bf02 = (C26012Bf0) value3;
                        int i4 = c26012Bf02.A00;
                        List list = c26072Bg13.A02;
                        if (i4 == -1) {
                            A0U2 = AbstractC001800i.A0T(c26012Bf02.A01, list);
                        } else {
                            A0U2 = AbstractC001800i.A0U(list);
                            A0U2.set(i4, c26012Bf02.A01);
                        }
                        C26072Bg1 c26072Bg14 = (C26072Bg1) c05a2.getValue();
                        if (c26072Bg14 != null) {
                            c26072Bg12 = C26072Bg1.A02(c26072Bg14, A0U2);
                        } else {
                            c26072Bg12 = null;
                        }
                        c05a2.Egh(c26072Bg12);
                        AbstractC25226BEj.A1P(c26804BsS);
                        if (c26012Bf0 != null) {
                            z2 = c26012Bf0.A04;
                        } else {
                            z2 = false;
                        }
                        interfaceC56362iU.ARk(0, z2);
                        i2 = -615509812;
                        C0f9.A0C(i2, A052);
                        return;
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                throw AbstractC166987dD.A14("Required value was null.");
            case 1:
                A052 = C0f9.A05(786239882);
                C26812Bsa c26812Bsa = (C26812Bsa) this.A02;
                C29898DGm c29898DGm = new C29898DGm(30, this.A01, c26812Bsa);
                C26012Bf0 c26012Bf03 = (C26012Bf0) AbstractC25226BEj.A0o(c26812Bsa.A05).A0F.getValue();
                if (c26012Bf03 != null) {
                    boolean z3 = c26012Bf03.A05;
                    boolean z4 = c26012Bf03.A06;
                    if (z3 && z4) {
                        InterfaceC09390do interfaceC09390do2 = c26812Bsa.A02;
                        C25531Mh A02 = C28484Chc.A02(interfaceC09390do2);
                        if (AbstractC25226BEj.A1Z(A02)) {
                            A02.A0k("thread_view_add_example_dialogue_submit_for_review_dialog_shown");
                            A02.Cht();
                        }
                        CCf.A00(c26812Bsa.requireContext(), AbstractC25226BEj.A0q(interfaceC09390do2), "in_thread_add_example_dialogue", C29909DGx.A01(c29898DGm, 32));
                        i2 = -425234373;
                        C0f9.A0C(i2, A052);
                        return;
                    }
                }
                c29898DGm.invoke();
                i2 = -425234373;
                C0f9.A0C(i2, A052);
                return;
            case 2:
                A05 = C0f9.A05(376320903);
                C26806BsU c26806BsU = (C26806BsU) this.A02;
                InterfaceC56362iU interfaceC56362iU2 = (InterfaceC56362iU) this.A01;
                InterfaceC09390do interfaceC09390do3 = c26806BsU.A05;
                AbstractC25226BEj.A0o(interfaceC09390do3).A06();
                AbstractC25226BEj.A0q(c26806BsU.A02).A0M(AbstractC25225BEi.A15(c26806BsU.A03), C25878Bcd.A02(interfaceC09390do3), "advanced_settings_editing");
                C26012Bf0 c26012Bf04 = (C26012Bf0) AbstractC25226BEj.A0o(interfaceC09390do3).A0F.getValue();
                C25878Bcd A0o = AbstractC25226BEj.A0o(interfaceC09390do3);
                C05A c05a3 = A0o.A02;
                Object value4 = c05a3.getValue();
                if (value4 != null) {
                    C26072Bg1 c26072Bg15 = (C26072Bg1) value4;
                    Object value5 = A0o.A05.getValue();
                    if (value5 != null) {
                        C26012Bf0 c26012Bf05 = (C26012Bf0) value5;
                        int i5 = c26012Bf05.A00;
                        List list2 = c26072Bg15.A02;
                        if (i5 == -1) {
                            A0U = AbstractC001800i.A0T(c26012Bf05.A01, list2);
                        } else {
                            A0U = AbstractC001800i.A0U(list2);
                            A0U.set(i5, c26012Bf05.A01);
                        }
                        C26072Bg1 c26072Bg16 = (C26072Bg1) c05a3.getValue();
                        if (c26072Bg16 != null) {
                            c26072Bg1 = C26072Bg1.A02(c26072Bg16, A0U);
                        } else {
                            c26072Bg1 = null;
                        }
                        c05a3.Egh(c26072Bg1);
                        AbstractC25226BEj.A1P(c26806BsU);
                        if (c26012Bf04 != null) {
                            z = c26012Bf04.A04;
                        } else {
                            z = false;
                        }
                        interfaceC56362iU2.ARk(0, z);
                        i = -736437757;
                        C0f9.A0C(i, A05);
                        return;
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                throw AbstractC166987dD.A14("Required value was null.");
            case 3:
                A05 = C0f9.A05(-227984644);
                C44550Jmu c44550Jmu = (C44550Jmu) this.A02;
                C51733MtG c51733MtG = ((C26687BqU) ((C9A) this.A01)).A00;
                c44550Jmu.A00.A07(Boolean.valueOf(c51733MtG.A05), Boolean.valueOf(c51733MtG.A02), Boolean.valueOf(c51733MtG.A03), Boolean.valueOf(c51733MtG.A04), C05F.A01, C05F.A07, null, null, AbstractC06930Yk.A0E());
                AbstractC166987dD.A1Z(new MCD(c44550Jmu, null, 33), AbstractC141776au.A00(c44550Jmu));
                i = -1278795875;
                C0f9.A0C(i, A05);
                return;
            case 4:
                A05 = C0f9.A05(995578788);
                C44550Jmu.A01(((C26687BqU) ((C9A) this.A01)).A00, null, (C44550Jmu) this.A02);
                i = -2046717638;
                C0f9.A0C(i, A05);
                return;
            case 5:
                A05 = C0f9.A05(-64114186);
                C44550Jmu c44550Jmu2 = (C44550Jmu) this.A02;
                C26688BqV c26688BqV = (C26688BqV) ((C9A) this.A01);
                C51733MtG c51733MtG2 = c26688BqV.A00;
                c44550Jmu2.A00.A07(Boolean.valueOf(c51733MtG2.A05), Boolean.valueOf(c51733MtG2.A02), Boolean.valueOf(c51733MtG2.A03), Boolean.valueOf(c51733MtG2.A04), C05F.A01, C05F.A0j, (Map) c26688BqV.A01.A00, null, AbstractC06930Yk.A0E());
                AbstractC166987dD.A1Z(new MCD(c44550Jmu2, null, 32), AbstractC141776au.A00(c44550Jmu2));
                i = -189117355;
                C0f9.A0C(i, A05);
                return;
            case 6:
                A05 = C0f9.A05(-1351324715);
                C44550Jmu c44550Jmu3 = (C44550Jmu) this.A02;
                C26688BqV c26688BqV2 = (C26688BqV) ((C9A) this.A01);
                C51733MtG c51733MtG3 = c26688BqV2.A00;
                boolean z5 = c51733MtG3.A03;
                boolean z6 = c51733MtG3.A05;
                boolean z7 = c51733MtG3.A02;
                boolean z8 = c51733MtG3.A04;
                Map map = (Map) c26688BqV2.A01.A00;
                LLN lln = c44550Jmu3.A00;
                Integer num = C05F.A01;
                lln.A07(Boolean.valueOf(z6), Boolean.valueOf(z7), Boolean.valueOf(z5), Boolean.valueOf(z8), num, num, map, null, AbstractC06930Yk.A0E());
                AbstractC166987dD.A1Z(new PZ6(c44550Jmu3, map, null, 0, z6, z7), AbstractC141776au.A00(c44550Jmu3));
                i = -1601277134;
                C0f9.A0C(i, A05);
                return;
            case 7:
                A05 = C0f9.A05(1841682031);
                C44550Jmu c44550Jmu4 = (C44550Jmu) this.A02;
                C26688BqV c26688BqV3 = (C26688BqV) ((C9A) this.A01);
                C44550Jmu.A01(c26688BqV3.A00, c26688BqV3.A01, c44550Jmu4);
                i = 522555352;
                C0f9.A0C(i, A05);
                return;
            case 8:
                A05 = C0f9.A05(-1706913137);
                C131845xK.A00((C6FQ) this.A02, C6FW.A01, ((C102884kP) this.A01).A09());
                i = 255397794;
                C0f9.A0C(i, A05);
                return;
            case 9:
                A05 = A01(this, -296471599);
                i = -1041187089;
                C0f9.A0C(i, A05);
                return;
            case 10:
                A05 = A01(this, 73967771);
                i = 1957497182;
                C0f9.A0C(i, A05);
                return;
            case 11:
                A05 = A01(this, 474130194);
                i = -1417621711;
                C0f9.A0C(i, A05);
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A05 = A01(this, -1642100165);
                i = 1727538431;
                C0f9.A0C(i, A05);
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A05 = A01(this, 388694354);
                i = -992658588;
                C0f9.A0C(i, A05);
                return;
            case 14:
                A05 = A01(this, 2134294651);
                i = 1909947583;
                C0f9.A0C(i, A05);
                return;
            case Process.SIGTERM /* 15 */:
                A05 = A01(this, -1059990619);
                i = 822243736;
                C0f9.A0C(i, A05);
                return;
            case 16:
                A05 = C0f9.A05(-1612807254);
                Fragment fragment = (Fragment) this.A01;
                UserSession userSession = (UserSession) this.A02;
                C26816Bse c26816Bse = new C26816Bse();
                Bundle A0b = AbstractC166987dD.A0b();
                AbstractC60492pY.A04(A0b, userSession);
                c26816Bse.setArguments(A0b);
                C3DO c3do = C3DN.A00;
                C3DN A00 = c3do.A00(fragment.getActivity());
                if (A00 != null && ((C3DP) A00).A0h) {
                    C189478aR A0x = AbstractC25228BEl.A0x(fragment.getActivity(), c3do);
                    if (A0x != null) {
                        C189448aO A0y = AbstractC25225BEi.A0y(userSession);
                        AbstractC25225BEi.A1Q(A0y, true);
                        A0y.A03 = 0.7f;
                        A0x.A0F(c26816Bse, A0y);
                    }
                } else {
                    C14240no c14240no = new C14240no(fragment.getParentFragmentManager());
                    Object parent = fragment.requireView().getParent();
                    C14360o3.A0C(parent, AbstractC111324zv.A00(2));
                    c14240no.A0A(c26816Bse, ((View) parent).getId());
                    Map map2 = C0YZ.A03;
                    c14240no.A0I(AbstractC13230m9.A01(C26816Bse.class));
                    c14240no.A00();
                }
                i = -1108308119;
                C0f9.A0C(i, A05);
                return;
            case 17:
                A05 = C0f9.A05(-612574214);
                C28218CcI c28218CcI = C28218CcI.A00;
                CWE cwe = (CWE) this.A01;
                C26603Bp0 c26603Bp0 = (C26603Bp0) this.A02;
                c28218CcI.A01(c26603Bp0.A02, c26603Bp0.A03, cwe);
                C25814BbV c25814BbV = c26603Bp0.A01;
                CWE cwe2 = c26603Bp0.A00.A00;
                if ((cwe2 instanceof C2I) && ((C2I) cwe2).A01) {
                    if (cwe2.A06) {
                        c05a = c25814BbV.A0N;
                        c9bk = new C9BK(cwe2.A03, 1);
                    } else if (cwe2.A05) {
                        c05a = c25814BbV.A0N;
                        c9bk = new C9BK(cwe2.A03, 0);
                    }
                    c05a.Egh(c9bk);
                }
                i = 361717210;
                C0f9.A0C(i, A05);
                return;
            case 18:
                A05 = C0f9.A05(434015278);
                ImmersiveReplyControlMenuViewBinder immersiveReplyControlMenuViewBinder = (ImmersiveReplyControlMenuViewBinder) this.A02;
                if (immersiveReplyControlMenuViewBinder.A04.A02.A00) {
                    AbstractC166987dD.A1Z(new MCK(this.A01, immersiveReplyControlMenuViewBinder, (InterfaceC23621Ds) null, 43), immersiveReplyControlMenuViewBinder.A05);
                }
                i = -651464168;
                C0f9.A0C(i, A05);
                return;
            case Process.SIGSTOP /* 19 */:
                A05 = C0f9.A05(107308727);
                AbstractC25231BEo.A1G(EnumC27377C6g.A03, (InterfaceC24901Jp) this.A01);
                i = 389358421;
                C0f9.A0C(i, A05);
                return;
            case 20:
                A05 = C0f9.A05(-1775171433);
                AbstractC25231BEo.A1G(EnumC27377C6g.A04, (InterfaceC24901Jp) this.A01);
                i = 1300576898;
                C0f9.A0C(i, A05);
                return;
            case 21:
                A05 = C0f9.A05(-1443287352);
                AbstractC25231BEo.A1G(EnumC27377C6g.A05, (InterfaceC24901Jp) this.A01);
                i = 291726248;
                C0f9.A0C(i, A05);
                return;
            case 22:
                A05 = C0f9.A05(-1858535929);
                C29238Cuh c29238Cuh = (C29238Cuh) this.A02;
                C05A c05a4 = c29238Cuh.A06.A00;
                c05a4.Egh(new C50526MSf(((C50526MSf) c05a4.getValue()).A00, false, 5));
                AbstractC166987dD.A1Y(((InterfaceC30940Diu) this.A01).AYl().A02);
                AnonymousClass229.A01(c29238Cuh.A04).A1Y(c29238Cuh.A02);
                i = -1574160173;
                C0f9.A0C(i, A05);
                return;
            case 23:
                A05 = C0f9.A05(1833471740);
                ((InterfaceC30941Div) this.A01).CuR(((C29157CtO) this.A02).A00);
                i = 2050377710;
                C0f9.A0C(i, A05);
                return;
            case 24:
                A05 = C0f9.A05(214509665);
                C26733BrE c26733BrE = (C26733BrE) this.A02;
                C26907BuA c26907BuA = (C26907BuA) c26733BrE.A05.getValue();
                long j2 = ((C26853BtF) this.A01).A00;
                C05A c05a5 = c26907BuA.A08;
                do {
                    value = c05a5.getValue();
                } while (!c05a5.AIi(value, C26074Bg3.A00(null, null, null, null, null, (C26074Bg3) value, Long.valueOf(j2), null, null, null, 8167, true)));
                AbstractC25226BEj.A1Q(c26733BrE);
                i = -1310641424;
                C0f9.A0C(i, A05);
                return;
            case 25:
                A05 = C0f9.A05(-1556058779);
                if (((C38688GzT) this.A01).A00 == C05F.A0N) {
                    android.net.Uri build = new Uri.Builder().scheme("instagram").authority("creator_agent_suggested_replies").appendQueryParameter("entrypoint", "collapsed_sr").build();
                    C14H A002 = C14H.A03.A00();
                    C7VL c7vl = (C7VL) this.A02;
                    View view2 = c7vl.A00;
                    if (view2 == null) {
                        str = "header";
                        C14360o3.A0F(str);
                        throw C00O.createAndThrow();
                    }
                    Context A0L = AbstractC166997dE.A0L(view2);
                    C14360o3.A0A(build);
                    C12260kU.A08(c7vl.A0B.requireActivity(), A002.A04(A0L, build), 108);
                } else {
                    C7VL.A00((C7VL) this.A02).onContainerExpanded(false);
                }
                i = 1939128263;
                C0f9.A0C(i, A05);
                return;
            case 26:
                A05 = C0f9.A05(-301740033);
                ((C64P) this.A01).setPrimaryActionIsLoading(true);
                ((C44510JmG) ((C26800BsO) this.A02).A03.getValue()).A00();
                i = -1371590653;
                C0f9.A0C(i, A05);
                return;
            case 27:
                A05 = C0f9.A05(-951525249);
                C25930BdX c25930BdX = (C25930BdX) this.A02;
                int i6 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                c25930BdX.A02.invoke(((C26171Bhw) this.A01).A00);
                i = 622405225;
                C0f9.A0C(i, A05);
                return;
            case 28:
                A052 = C0f9.A05(160400075);
                C45496KCl c45496KCl = ((C27068Bwr) this.A02).A01;
                String id = ((C29161CtS) this.A01).A01.A00.getId();
                if (id != null) {
                    C25840Bbv c25840Bbv = (C25840Bbv) c45496KCl.A04.getValue();
                    Iterator it = c25840Bbv.A02.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            String id2 = ((C29161CtS) obj).A01.A00.getId();
                            if (id2 != null) {
                                if (id2.equals(id)) {
                                }
                            } else {
                                throw AbstractC166997dE.A0g();
                            }
                        } else {
                            obj = null;
                        }
                    }
                    C29161CtS c29161CtS = (C29161CtS) obj;
                    if (c29161CtS != null) {
                        int i7 = c29161CtS.A00;
                        List list3 = c25840Bbv.A03;
                        if (i7 == -1) {
                            list3.add(c29161CtS);
                            c25840Bbv.A00.A8r(new C9NH(new GalleryItem(c29161CtS.A00()), null));
                            c29161CtS.A00 = AbstractC25226BEj.A05(list3);
                        } else {
                            list3.remove(c29161CtS);
                            c29161CtS.A00 = -1;
                            c25840Bbv.A00.EFS(new GalleryItem(c29161CtS.A00()));
                            int i8 = 0;
                            for (Object obj2 : list3) {
                                int i9 = i8 + 1;
                                if (i8 < 0) {
                                    AbstractC16960so.A1U();
                                    throw C00O.createAndThrow();
                                }
                                ((C29161CtS) obj2).A00 = i8;
                                i8 = i9;
                            }
                        }
                        AbstractC166987dD.A1Z(new D4v(c25840Bbv, null, 20), AbstractC141776au.A00(c25840Bbv));
                    }
                    i2 = -557624902;
                    C0f9.A0C(i2, A052);
                    return;
                }
                throw AbstractC166997dE.A0g();
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                A05 = C0f9.A05(135631967);
                InterfaceC31036Dka interfaceC31036Dka = (InterfaceC31036Dka) this.A01;
                CQV cqv = (CQV) this.A02;
                interfaceC31036Dka.D3K(cqv.A00, cqv.A01);
                i = -511628118;
                C0f9.A0C(i, A05);
                return;
            case 30:
                A05 = C0f9.A05(-305631032);
                AnonymousClass414 anonymousClass414 = (AnonymousClass414) this.A01;
                ((InterfaceC16620sF) anonymousClass414.A02.A00).invoke(this.A02, anonymousClass414);
                i = 1731738110;
                C0f9.A0C(i, A05);
                return;
            case 31:
                A05 = C0f9.A05(-863317774);
                InterfaceC16620sF interfaceC16620sF = ((C26641Bpc) this.A02).A06;
                C14360o3.A0A(view);
                interfaceC16620sF.invoke(view, this.A01);
                i = 1951949864;
                C0f9.A0C(i, A05);
                return;
            case 32:
                A05 = C0f9.A05(1257140630);
                ((InterfaceC16660sJ) this.A01).invoke(((C29342Cwb) ((InterfaceC30829Dh4) this.A02)).A01);
                i = -705925730;
                C0f9.A0C(i, A05);
                return;
            case 33:
                A052 = C0f9.A05(875856195);
                C26768Brp c26768Brp = (C26768Brp) this.A02;
                InterfaceC09390do interfaceC09390do4 = c26768Brp.A04;
                Collection<C26172Bhx> values = ((C25849Bc4) interfaceC09390do4.getValue()).A03.A05.values();
                C14360o3.A07(values);
                ArrayList A0q = AbstractC167017dG.A0q(values);
                for (C26172Bhx c26172Bhx : values) {
                    String str3 = c26172Bhx.A06;
                    Integer num2 = c26172Bhx.A04;
                    if (num2 != null) {
                        i3 = num2.intValue();
                    } else {
                        i3 = -1;
                    }
                    A0q.add(new C32071E6x(str3, i3, 16));
                }
                InterfaceC09390do interfaceC09390do5 = c26768Brp.A02;
                C36291Fzl c36291Fzl = (C36291Fzl) interfaceC09390do5.getValue();
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c36291Fzl.A02, AbstractC111324zv.A00(26));
                if (A0f.isSampled()) {
                    AbstractC25233BEq.A16(A0f);
                    AbstractC25232BEp.A1K(A0f, "done_button");
                    C36291Fzl.A00(A0f, c36291Fzl, "edit_pinned_channels_success");
                    A0f.A7v("is_test_user", false);
                    A0f.A9M("extra", AbstractC167007dF.A0n("channels", A0q.toString()));
                    A0f.AAP(AbstractC58410Puo.A00(), c36291Fzl.A00);
                    A0f.Cht();
                }
                ((C25849Bc4) interfaceC09390do4.getValue()).A00();
                ((InterfaceC56362iU) this.A01).setIsLoading(true);
                C8SB c8sb = c26768Brp.A00;
                if (c8sb == null) {
                    str = "itemTouchHelper";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                c8sb.A0A(null);
                AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(interfaceC09390do4);
                AbstractC23641Du.A05(AbstractC25231BEo.A0e(C12L.A00), new PZ1(A0Z, ((C36291Fzl) interfaceC09390do5.getValue()).A00, null, 17), AbstractC141776au.A00(A0Z));
                C56352iT.A0t.A03(c26768Brp.getActivity()).A0T();
                i2 = -1336979531;
                C0f9.A0C(i2, A052);
                return;
            case 34:
                A05 = C0f9.A05(-285268477);
                C54445O3z c54445O3z = (C54445O3z) this.A01;
                AbstractC151906sa abstractC151906sa = (AbstractC151906sa) this.A02;
                C56765PHi c56765PHi = c54445O3z.A00.A00;
                if (c56765PHi != null) {
                    c56765PHi.A00(abstractC151906sa);
                }
                i = 644541980;
                C0f9.A0C(i, A05);
                return;
            case 35:
                A05 = C0f9.A05(881915044);
                C28218CcI c28218CcI2 = C28218CcI.A00;
                CWE cwe3 = (CWE) this.A01;
                C26959Bv0 c26959Bv0 = (C26959Bv0) this.A02;
                c28218CcI2.A01(c26959Bv0.A00, c26959Bv0.A01, cwe3);
                OHW ohw = c26959Bv0.A02;
                if (ohw != null) {
                    C14360o3.A0A(view);
                    ohw.A00(cwe3);
                }
                i = -1281454267;
                C0f9.A0C(i, A05);
                return;
            case 36:
                A05 = C0f9.A05(1661793611);
                C26960Bv1 c26960Bv1 = (C26960Bv1) this.A02;
                UserSession userSession2 = c26960Bv1.A01;
                C26026BfF c26026BfF = (C26026BfF) this.A01;
                C8V c8v = C8V.FEED;
                InterfaceC11380iw interfaceC11380iw = c26960Bv1.A00;
                AbstractC167007dF.A1F(userSession2, 0, interfaceC11380iw);
                InterfaceC02590Ai A0f2 = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession2), "cross_app_feedback_tap");
                if (A0f2.isSampled()) {
                    A0f2.AAP("feedback_surface", "IG_PRODUCER_PLAYS_AND_LIKES_ROW");
                    String str4 = c26026BfF.A01;
                    if (str4 != null && (A0j = AbstractC166997dE.A0j(str4)) != null) {
                        j = A0j.longValue();
                    } else {
                        j = 0;
                    }
                    AbstractC25225BEi.A1N(A0f2, AbstractC25234BEr.A0e(c8v, A0f2, j));
                    A0f2.A9K("th_reaction_count", Long.valueOf(c26026BfF.A00));
                    A0f2.Cht();
                }
                C34487FHz c34487FHz = c26960Bv1.A02;
                if (c34487FHz != null) {
                    String str5 = c26026BfF.A02;
                    C14360o3.A0B(str5, 0);
                    ENZ enz = c34487FHz.A00;
                    if (enz.A05 != null) {
                        C35265Fh0.A04(enz.requireActivity(), AbstractC166987dD.A0r(enz.A0T), str5, "likes_list_unified_feedback", null);
                    }
                }
                i = -142030824;
                C0f9.A0C(i, A05);
                return;
            case 37:
                A05 = C0f9.A05(-347723531);
                C25448BNn c25448BNn = (C25448BNn) this.A02;
                UserSession userSession3 = c25448BNn.A04;
                InterfaceC60442pS interfaceC60442pS = c25448BNn.A06;
                C120985dq c120985dq = c25448BNn.A02;
                C38321qM c38321qM = c120985dq.A02;
                if (c38321qM != null) {
                    str2 = c38321qM.A2u();
                } else {
                    str2 = null;
                }
                AbstractC37670Gi3.A0V(c120985dq, userSession3, interfaceC60442pS, null, str2, false);
                c25448BNn.A07.DS7((C38321qM) this.A01);
                i = 499582559;
                C0f9.A0C(i, A05);
                return;
            case 38:
                A05 = C0f9.A05(-1240363035);
                C38321qM c38321qM2 = (C38321qM) this.A01;
                if (AbstractC166987dD.A1b(c38321qM2.A3Z())) {
                    ((C25448BNn) this.A02).A07.DnT(c38321qM2);
                }
                i = -741675508;
                C0f9.A0C(i, A05);
                return;
            case 39:
                A05 = C0f9.A05(-1510711304);
                ((C25448BNn) this.A02).A07.Dvb((C38321qM) this.A01);
                i = 87740271;
                C0f9.A0C(i, A05);
                return;
            case 40:
                A05 = C0f9.A05(-1478648951);
                C25448BNn c25448BNn2 = (C25448BNn) this.A02;
                c25448BNn2.A07.DoU(c25448BNn2.A02, (User) this.A01);
                i = -1601887635;
                C0f9.A0C(i, A05);
                return;
            case Seq.NULL_REFNUM /* 41 */:
                A05 = A00(this, 1328785571);
                i = -1118767048;
                C0f9.A0C(i, A05);
                return;
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                A05 = A00(this, -1059622036);
                i = -785583142;
                C0f9.A0C(i, A05);
                return;
            case 43:
                A05 = A00(this, -2015560599);
                i = 1700913556;
                C0f9.A0C(i, A05);
                return;
            case 44:
                A05 = A00(this, 1615161292);
                i = 1665688278;
                C0f9.A0C(i, A05);
                return;
            case 45:
                A05 = A00(this, 1701929313);
                i = -1523537512;
                C0f9.A0C(i, A05);
                return;
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                A05 = A00(this, 1326010719);
                i = -1551177402;
                C0f9.A0C(i, A05);
                return;
            case 47:
                A05 = A00(this, 2106708690);
                i = 932629504;
                C0f9.A0C(i, A05);
                return;
            case 48:
                A05 = A00(this, 776009735);
                i = -1017596899;
                C0f9.A0C(i, A05);
                return;
            case 49:
                A05 = A00(this, -260592846);
                i = 1324019695;
                C0f9.A0C(i, A05);
                return;
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                A05 = C0f9.A05(496502353);
                ((C25898Bcz) this.A02).A09.invoke(((C26928BuV) ((AbstractC29162CtT) this.A01)).A05);
                i = 1746109201;
                C0f9.A0C(i, A05);
                return;
            case 51:
                A05 = A00(this, 663744905);
                i = -2105899252;
                C0f9.A0C(i, A05);
                return;
            case 52:
                A05 = C0f9.A05(-590208227);
                C5W c5w = (C5W) this.A02;
                int i10 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                c5w.A05.invoke(this.A01);
                i = -1896663327;
                C0f9.A0C(i, A05);
                return;
            case 53:
                A05 = C0f9.A05(-616318507);
                C5W c5w2 = (C5W) this.A02;
                int i11 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                AbstractC25227BEk.A1P(this.A01, c5w2.A06, c5w2.getPosition());
                i = -820092623;
                C0f9.A0C(i, A05);
                return;
            default:
                return;
        }
    }

    public static int A00(ViewOnClickListenerC28668ClG viewOnClickListenerC28668ClG, int i) {
        int A05 = C0f9.A05(i);
        ((C25898Bcz) viewOnClickListenerC28668ClG.A02).A08.invoke(viewOnClickListenerC28668ClG.A01);
        return A05;
    }

    public static int A01(ViewOnClickListenerC28668ClG viewOnClickListenerC28668ClG, int i) {
        int A05 = C0f9.A05(i);
        ((C25814BbV) viewOnClickListenerC28668ClG.A01).A0P((InterfaceC30799Dga) viewOnClickListenerC28668ClG.A02);
        return A05;
    }

    public ViewOnClickListenerC28668ClG(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }
}
