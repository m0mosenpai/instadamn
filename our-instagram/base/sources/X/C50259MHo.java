package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.facebook.quicklog.PointEditor;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.BrandedContentGatingInfoIntf;
import com.instagram.api.schemas.BrandedContentProjectAction;
import com.instagram.api.schemas.BrandedContentProjectMetadata;
import com.instagram.api.schemas.BrandedContentProjectMetadataIntf;
import com.instagram.brandedcontent.ui.BrandedContentFeedDisclosureController;
import com.instagram.business.promote.activity.PromoteActivity;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.pendingmedia.model.BrandedContentTag;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.ui.widget.radiogroup.IgRadioGroup;
import go.Seq;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.MHo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C50259MHo extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50259MHo(Object obj, int i) {
        super(1);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2;
        int i;
        Object obj3;
        IgRadioGroup igRadioGroup;
        View findViewWithTag;
        IgRadioGroup igRadioGroup2;
        String str;
        InterfaceC19610xo interfaceC19610xo;
        String str2;
        PointEditor pointEditor;
        String valueOf;
        String str3;
        List list;
        BrandedContentProjectMetadata brandedContentProjectMetadata;
        long j;
        int i2;
        C5TA c5ta;
        InterfaceC74953Yl interfaceC74953Yl;
        Object obj4;
        switch (this.A00) {
            case 0:
                ((C5yI) this.A01).Dcu(AbstractC167027dH.A0Q(obj));
                return C0eB.A00;
            case 1:
            case 6:
                C5AW c5aw = (C5AW) obj;
                C14360o3.A0B(c5aw, 0);
                c5aw.A05((C59W) this.A01, 0.0f, 0, 0);
                return C0eB.A00;
            case 2:
                AbstractC25228BEl.A0b(obj).EPa(AbstractC25232BEp.A01((C5Y1) this.A01));
                return C0eB.A00;
            case 3:
                float A09 = AbstractC166987dD.A09(obj);
                L82 l82 = (L82) this.A01;
                C49684LxF c49684LxF = l82.A05;
                C5TA c5ta2 = c49684LxF.A01;
                if (c5ta2 != null) {
                    i2 = c5ta2.A06.Azm();
                } else {
                    i2 = 0;
                }
                if (i2 == 0) {
                    l82.A00(true);
                } else {
                    C5TA c5ta3 = c49684LxF.A01;
                    if ((c5ta3 != null && c5ta3.A0E()) || ((c5ta = c49684LxF.A01) != null && c5ta.A01)) {
                        interfaceC74953Yl = l82.A02;
                        Object value = interfaceC74953Yl.getValue();
                        obj4 = EnumC27391C6u.A06;
                        if (value != obj4) {
                            c49684LxF.A00(false);
                        }
                        InterfaceC74953Yl interfaceC74953Yl2 = l82.A03;
                        float f = A09 * ((C66625UPn) interfaceC74953Yl2.getValue()).A00;
                        if (((C66625UPn) interfaceC74953Yl2.getValue()).A00 - f > 100.0f) {
                            C5TA c5ta4 = c49684LxF.A01;
                            if (c5ta4 != null) {
                                c5ta4.A02(0.4f, 0);
                            }
                            if (System.currentTimeMillis() - l82.A00 > 100) {
                                C5TA c5ta5 = c49684LxF.A01;
                                if (c5ta5 != null) {
                                    c5ta5.A0B("resume", false);
                                }
                                int i3 = (int) f;
                                C5TA c5ta6 = c49684LxF.A01;
                                if (c5ta6 != null) {
                                    c5ta6.A04(i3, true);
                                }
                                l82.A00 = System.currentTimeMillis();
                                l82.A01 = AbstractC25226BEj.A1L(new MBq(l82, AbstractC25230BEn.A0s(l82.A01), 34), l82.A07);
                            }
                        }
                        interfaceC74953Yl2.Egh(new C66625UPn(A09, f, ((C66625UPn) interfaceC74953Yl2.getValue()).A00, 0));
                        interfaceC74953Yl.Egh(obj4);
                    }
                }
                return C0eB.A00;
            case 4:
                ((List) this.A01).get(AbstractC166987dD.A0H(obj));
                return null;
            case 5:
                AbstractC25228BEl.A0b(obj).Ecx(AbstractC25231BEo.A05((InterfaceC74963Ym) this.A01));
                return C0eB.A00;
            case 7:
                C14360o3.A0B(obj, 0);
                ((InterfaceC74953Yl) this.A01).Egh(obj);
                return C0eB.A00;
            case 8:
                float A092 = AbstractC166987dD.A09(obj);
                interfaceC74953Yl = ((C136946Hx) this.A01).A09;
                obj4 = Float.valueOf(A092);
                interfaceC74953Yl.Egh(obj4);
                return C0eB.A00;
            case 9:
                InterfaceC1128857w A0c = AbstractC25228BEl.A0c(obj);
                A0c.AQd(((CUC) this.A01).A00(A0c), null, C119815bf.A00, C5YC.A01(A0c.Bxc()) / 2.0f, 1.0f, 3, A0c.Amh());
                return C0eB.A00;
            case 10:
                i = 5;
                obj3 = this.A01;
                return new JWG(obj3, i);
            case 11:
                InterfaceC1132159j A0b = AbstractC25228BEl.A0b(obj);
                float A01 = AbstractC25232BEp.A01(((L4R) this.A01).A04);
                A0b.Ed7(A01);
                A0b.Ed8(A01);
                return C0eB.A00;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                float A093 = AbstractC166987dD.A09(obj);
                C57F c57f = (C57F) this.A01;
                c57f.EUc(c57f.B72() + (A093 * 0.9424779f));
                return C0eB.A00;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                float A094 = AbstractC166987dD.A09(obj);
                CS6 cs6 = (CS6) this.A01;
                C57F c57f2 = cs6.A01;
                c57f2.EUc(c57f2.B72() + A094);
                for (L2Q l2q : cs6.A00) {
                    if (l2q.A00 <= c57f2.B72()) {
                        l2q.A00 = c57f2.B72() + LHt.A00(LHt.A00);
                        InterfaceC74953Yl interfaceC74953Yl3 = cs6.A03;
                        Collection collection = (Collection) interfaceC74953Yl3.getValue();
                        C17w c17w = l2q.A03;
                        AbstractC50712Us abstractC50712Us = AbstractC50712Us.A01;
                        float A012 = LHt.A01(c17w, abstractC50712Us.A02());
                        float f2 = l2q.A02;
                        float A013 = LHt.A01(LHt.A03, abstractC50712Us.A02());
                        float f3 = l2q.A01;
                        float B72 = c57f2.B72();
                        C1132359l c1132359l = (C1132359l) AbstractC001800i.A0H((Collection) cs6.A02.getValue(), AbstractC50712Us.A00);
                        if (c1132359l != null) {
                            j = c1132359l.A00;
                        } else {
                            j = C1132359l.A07;
                        }
                        interfaceC74953Yl3.Egh(AbstractC001800i.A0T(new C47704L4l(A012, f2, A013, f3, B72, LHt.A00(LHt.A01), LHt.A00(LHt.A02), j), collection));
                    }
                }
                InterfaceC74953Yl interfaceC74953Yl4 = cs6.A03;
                Iterator A1J = AbstractC25226BEj.A1J(interfaceC74953Yl4.getValue());
                ArrayList arrayList = null;
                while (A1J.hasNext()) {
                    C47704L4l c47704L4l = (C47704L4l) A1J.next();
                    if (c47704L4l.A04 + 1.0f < c57f2.B72()) {
                        if (arrayList != null) {
                            arrayList.add(c47704L4l);
                        } else {
                            arrayList = AbstractC16960so.A1N(c47704L4l);
                        }
                    }
                }
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        interfaceC74953Yl4.Egh(AbstractC001800i.A0f((Iterable) interfaceC74953Yl4.getValue(), it.next()));
                    }
                }
                return C0eB.A00;
            case 14:
                C47686L3t c47686L3t = (C47686L3t) this.A01;
                c47686L3t.A04.Emo();
                c47686L3t.A03.Emo();
                c47686L3t.A05.Emo();
                i = 6;
                obj3 = c47686L3t;
                return new JWG(obj3, i);
            case Process.SIGTERM /* 15 */:
                AbstractC25225BEi.A1U(this.A01, obj);
                return C0eB.A00;
            case 16:
                C14360o3.A0B(obj, 0);
                C5Hc c5Hc = ((C45079Jx9) ((C44508JmE) this.A01).A03.A0I.getValue()).A0I;
                ArrayList A1E = AbstractC166987dD.A1E();
                for (Object obj5 : c5Hc) {
                    if (obj5 instanceof C132305y9) {
                        A1E.add(obj5);
                    }
                }
                Iterator it2 = A1E.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj2 = it2.next();
                        InterfaceC132245y2 interfaceC132245y2 = (InterfaceC132245y2) obj2;
                        if (!(interfaceC132245y2 instanceof C132305y9) || !C14360o3.A0K(interfaceC132245y2.Bet().A07, obj)) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                return Integer.valueOf(A1E.indexOf(obj2));
            case 17:
                Collection collection2 = (Collection) obj;
                C14360o3.A0B(collection2, 0);
                C6FG c6fg = (C6FG) this.A01;
                ArrayList A1E2 = AbstractC166987dD.A1E();
                for (Object obj6 : collection2) {
                    File A11 = AbstractC166987dD.A11((String) obj6);
                    String canonicalPath = c6fg.A00.getCacheDir().getCanonicalPath();
                    C14360o3.A07(canonicalPath);
                    if (MT6.A05(A11, AbstractC166987dD.A11(canonicalPath))) {
                        A1E2.add(obj6);
                    }
                }
                return A1E2;
            case 18:
            case 20:
            case 21:
                List list2 = (List) obj;
                AbstractC43842Ja5 abstractC43842Ja5 = (AbstractC43842Ja5) this.A01;
                C14360o3.A0A(list2);
                abstractC43842Ja5.A0B(list2);
                return C0eB.A00;
            case Process.SIGSTOP /* 19 */:
                return AbstractC25227BEk.A0v((Fragment) this.A01, AbstractC166987dD.A0H(obj));
            case 22:
                ((C51157Mj0) ((C32301EKo) this.A01).A02.getValue()).A00((List) obj);
                return C0eB.A00;
            case 23:
                C6Nu A0T = AbstractC25228BEl.A0T(obj);
                A0T.CgH(null, CNT.A00);
                A0T.CgH(null, CNT.A01);
                List list3 = ((KCF) this.A01).A01;
                AbstractC25227BEk.A15(A0T, new C30750Dfn(list3, 7), null, new C50369MLw(15, list3, MJI.A00), list3.size());
                return C0eB.A00;
            case 24:
                List list4 = (List) obj;
                C66362zD c66362zD = (C66362zD) this.A01;
                ViewModelListUpdate A0E = AbstractC31171DnF.A0E();
                C14360o3.A0A(list4);
                A0E.A01(list4);
                c66362zD.A05(A0E);
                return C0eB.A00;
            case 25:
                N5X n5x = (N5X) this.A01;
                InterfaceC09390do interfaceC09390do = n5x.A06;
                str = "brandedContentTags";
                if (C14360o3.A0K(interfaceC09390do.getValue(), "feed")) {
                    InterfaceC09390do interfaceC09390do2 = n5x.A07;
                    UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do2);
                    OGF ogf = AbstractC54944ORu.A00;
                    UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do2);
                    boolean z = n5x.A03;
                    List list5 = n5x.A02;
                    if (list5 != null) {
                        C50695MZq.A00(A0r, ogf.A00(n5x.A00, n5x.A01, A0r2, null, list5, z, false));
                        LL0.A02(n5x, AbstractC166987dD.A0r(interfaceC09390do2), C05F.A0I, C05F.A00, C05F.A01);
                        return C0eB.A00;
                    }
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                FragmentActivity requireActivity = n5x.requireActivity();
                InterfaceC09390do interfaceC09390do3 = n5x.A07;
                C140966Yy A0c2 = AbstractC25231BEo.A0c(requireActivity, interfaceC09390do3);
                UserSession A0r3 = AbstractC166987dD.A0r(interfaceC09390do3);
                List list6 = n5x.A02;
                if (list6 != null) {
                    BrandedContentProjectMetadataIntf brandedContentProjectMetadataIntf = n5x.A01;
                    BrandedContentGatingInfoIntf brandedContentGatingInfoIntf = n5x.A00;
                    boolean z2 = n5x.A03;
                    String A15 = AbstractC25225BEi.A15(interfaceC09390do);
                    String A152 = AbstractC25225BEi.A15(n5x.A05);
                    AbstractC167007dF.A1H(A0r3, 1, A15);
                    A0c2.A0B(null, AbstractC54944ORu.A00(brandedContentGatingInfoIntf, brandedContentProjectMetadataIntf, A0r3, A152, A15, list6, false, false, false, false, z2));
                    A0c2.A04();
                    return C0eB.A00;
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 26:
                OTH oth = (OTH) obj;
                C14360o3.A0B(oth, 0);
                BrandedContentFeedDisclosureController brandedContentFeedDisclosureController = (BrandedContentFeedDisclosureController) this.A01;
                UserSession userSession = brandedContentFeedDisclosureController.A02;
                OGF ogf2 = AbstractC54944ORu.A00;
                BrandedContentTag brandedContentTag = oth.A01;
                if (brandedContentTag != null) {
                    list = AbstractC166987dD.A1J(brandedContentTag);
                } else {
                    list = C16930sl.A00;
                }
                C51675Ms6 c51675Ms6 = oth.A00;
                if (c51675Ms6 != null) {
                    brandedContentProjectMetadata = new BrandedContentProjectMetadata(null, BrandedContentProjectAction.A04, null, c51675Ms6.A01, c51675Ms6.A02, c51675Ms6.A03, c51675Ms6.A04, c51675Ms6.A05, c51675Ms6.A06);
                } else {
                    brandedContentProjectMetadata = null;
                }
                C50695MZq.A00(userSession, ogf2.A00(null, brandedContentProjectMetadata, userSession, null, list, true, false));
                LL0.A02(brandedContentFeedDisclosureController, userSession, C05F.A0I, C05F.A00, C05F.A01);
                MYZ A014 = MX1.A01(userSession);
                C1QT c1qt = A014.A0A;
                long j2 = A014.A07;
                AHF ahf = new AHF(c1qt);
                ahf.A01 = j2;
                ahf.A04("BRANDED_CONTENT_SUGGESTION_TAPPED");
                return C0eB.A00;
            case 27:
            case 28:
            case 30:
            case 31:
            case 32:
            case 36:
            case 37:
            default:
                pointEditor = (PointEditor) obj;
                C14360o3.A0B(pointEditor, 0);
                valueOf = this.A01.toString();
                str3 = "error_message";
                pointEditor.addPointData(str3, valueOf);
                return C0eB.A00;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                String A0Q = AbstractC167027dH.A0Q(obj);
                C19L c19l = C55203OeE.A01;
                AbstractC167007dF.A15(C18950wb.A01.AEp(MSV.A00(691), 817892340), DialogModule.KEY_MESSAGE, A0Q, null);
                return C0eB.A00;
            case 33:
                pointEditor = (PointEditor) obj;
                C14360o3.A0B(pointEditor, 0);
                pointEditor.addPointData(CacheBehaviorLogger.SOURCE, "TakeScreenshotHelper");
                valueOf = this.A01.toString();
                str3 = "error_message";
                pointEditor.addPointData(str3, valueOf);
                return C0eB.A00;
            case 34:
                pointEditor = (PointEditor) obj;
                C14360o3.A0B(pointEditor, 0);
                valueOf = this.A01.toString();
                str3 = "error";
                pointEditor.addPointData(str3, valueOf);
                return C0eB.A00;
            case 35:
                pointEditor = (PointEditor) obj;
                C14360o3.A0B(pointEditor, 0);
                pointEditor.addPointData(CacheBehaviorLogger.SOURCE, MSV.A00(826));
                valueOf = String.valueOf(C09550e6.A00(this.A01));
                str3 = "error_message";
                pointEditor.addPointData(str3, valueOf);
                return C0eB.A00;
            case 38:
                ((C32307EKu) this.A01).A06 = (List) obj;
                return C0eB.A00;
            case 39:
                Collection collection3 = (Collection) obj;
                java.util.Set set = ((C32308EKv) this.A01).A0A;
                C14360o3.A0A(collection3);
                set.addAll(collection3);
                return C0eB.A00;
            case 40:
                int A0H = AbstractC166987dD.A0H(obj);
                if (A0H != 0) {
                    UDz uDz = (UDz) this.A01;
                    uDz.A00 = Math.min(A0H, uDz.A00);
                    for (C66372UDy c66372UDy : uDz.A01) {
                        int i4 = uDz.A00;
                        UAN uan = c66372UDy.A00;
                        if (uan != null) {
                            UAN.A00(uan, i4);
                        }
                    }
                }
                return C0eB.A00;
            case Seq.NULL_REFNUM /* 41 */:
                interfaceC19610xo = (InterfaceC19610xo) obj;
                C14360o3.A0B(interfaceC19610xo, 0);
                str2 = "ad_account_info";
                interfaceC19610xo.EEj(str2);
                return C0eB.A00;
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                interfaceC19610xo = (InterfaceC19610xo) obj;
                C14360o3.A0B(interfaceC19610xo, 0);
                str2 = "business_account_info";
                interfaceC19610xo.EEj(str2);
                return C0eB.A00;
            case 43:
                interfaceC19610xo = (InterfaceC19610xo) obj;
                C14360o3.A0B(interfaceC19610xo, 0);
                str2 = "fb_page_info";
                interfaceC19610xo.EEj(str2);
                return C0eB.A00;
            case 44:
                interfaceC19610xo = (InterfaceC19610xo) obj;
                C14360o3.A0B(interfaceC19610xo, 0);
                str2 = "ig_professional_identity_cache_id";
                interfaceC19610xo.EEj(str2);
                return C0eB.A00;
            case 45:
                String str4 = (String) obj;
                C14360o3.A0B(str4, 0);
                PromoteActivity promoteActivity = (PromoteActivity) this.A01;
                PromoteData promoteData = promoteActivity.A00;
                if (promoteData != null) {
                    promoteData.A1A = str4;
                    W2Z w2z = (W2Z) promoteActivity.A08.getValue();
                    PromoteData promoteData2 = promoteActivity.A00;
                    str = "promoteData";
                    if (promoteData2 != null) {
                        String str5 = promoteData2.A1K;
                        C14360o3.A06(str5);
                        String str6 = PromoteActivity.A00(promoteActivity).A03;
                        C14360o3.A07(str6);
                        C25531Mh c25531Mh = w2z.A00;
                        c25531Mh.A0k("pro_identity_open_boost_prevalidation_bloks");
                        c25531Mh.A0R(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str5);
                        c25531Mh.A0R("flow_id", str6);
                        c25531Mh.A0R("token_type", null);
                        c25531Mh.Cht();
                        W2Z.A00(w2z).markerPoint(409679146, "pro_identity_launch_boost_prevalidation_bloks");
                        W2Z.A00(w2z).markerAnnotate(409679146, "has_skipped_bloks", false);
                        PromoteData promoteData3 = promoteActivity.A00;
                        if (promoteData3 != null) {
                            if (promoteData3.A1b != null) {
                                PromoteActivity.A00(promoteActivity).A0S("NONNULL_SELECTED_AUDIO_SPEC", "bfa_prevalidation");
                            }
                            C08790ch A00 = AbstractC018607g.A00(promoteActivity);
                            UserSession session = promoteActivity.getSession();
                            PromoteData promoteData4 = promoteActivity.A00;
                            if (promoteData4 != null) {
                                String str7 = promoteData4.A1K;
                                C14360o3.A06(str7);
                                String str8 = PromoteActivity.A00(promoteActivity).A03;
                                C14360o3.A07(str8);
                                Integer num = C05F.A00;
                                PromoteData promoteData5 = promoteActivity.A00;
                                if (promoteData5 != null) {
                                    C1GJ.A00(promoteActivity, A00, AbstractC70133W6h.A01(promoteActivity, session, num, str7, str8, promoteData5.A1b));
                                    return C0eB.A00;
                                }
                            }
                        }
                    }
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                str = "promoteData";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                String A0Q2 = AbstractC167027dH.A0Q(obj);
                PromoteActivity promoteActivity2 = (PromoteActivity) this.A01;
                PromoteData promoteData6 = promoteActivity2.A00;
                if (promoteData6 != null) {
                    promoteData6.A1A = A0Q2;
                    PromoteActivity.A06(promoteActivity2);
                    return C0eB.A00;
                }
                str = "promoteData";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 47:
                String str9 = (String) obj;
                C14360o3.A0B(str9, 0);
                PromoteActivity promoteActivity3 = (PromoteActivity) this.A01;
                PromoteData promoteData7 = promoteActivity3.A00;
                if (promoteData7 != null) {
                    promoteData7.A1A = str9;
                    PromoteActivity.A03(promoteActivity3);
                    V11 A03 = AbstractC155756z4.A00().A02().A03(false);
                    C140966Yy A0r4 = AbstractC25225BEi.A0r(promoteActivity3, promoteActivity3.getSession());
                    A0r4.A0D = false;
                    A0r4.A0D(A03);
                    A0r4.A04();
                    promoteActivity3.A0a();
                    return C0eB.A00;
                }
                str = "promoteData";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 48:
                Boolean bool = (Boolean) obj;
                C52110N4i c52110N4i = (C52110N4i) this.A01;
                View view = c52110N4i.A01;
                int i5 = 0;
                if (view != null) {
                    view.setVisibility(AbstractC167007dF.A05(!bool.booleanValue() ? 1 : 0));
                }
                View view2 = c52110N4i.A00;
                if (view2 != null) {
                    if (!bool.booleanValue()) {
                        i5 = 8;
                    }
                    view2.setVisibility(i5);
                }
                return C0eB.A00;
            case 49:
                KCG kcg = (KCG) this.A01;
                IgdsBottomButtonLayout igdsBottomButtonLayout = kcg.A00;
                if (igdsBottomButtonLayout != null) {
                    igdsBottomButtonLayout.setPrimaryButtonEnabled(AbstractC167007dF.A1W(obj));
                }
                if (obj != null && (igRadioGroup = kcg.A01) != null && (findViewWithTag = igRadioGroup.findViewWithTag(obj)) != null && (igRadioGroup2 = kcg.A01) != null) {
                    igRadioGroup2.A02(findViewWithTag.getId());
                }
                return C0eB.A00;
        }
    }
}
