package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.LruCache;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.compose.ui.Modifier;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.facebook.litho.ComponentTree;
import com.facebook.litho.LithoView;
import com.google.common.collect.ImmutableList;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.direct.locationsharing.service.DirectLiveLocationService;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.rtc.signaling.models.RtcConnectionEntity;
import com.instagram.rtc.signaling.notifications.service.RtcCallActionIntentHandlerService;
import com.instagram.search.common.analytics.SearchContext;
import com.instagram.ui.widget.slideouticon.SlideInAndOutIconView;
import com.instagram.user.follow.FollowButton;
import com.instagram.user.model.User;
import go.Seq;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class DSA extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DSA(int i, Object obj, Object obj2) {
        super(2);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        InterfaceC16820sZ interfaceC16820sZ;
        int i;
        boolean z;
        int i2;
        View view;
        C5Tl c5Tl;
        int i3;
        String str;
        boolean A1W;
        C19L c19l;
        Object obj3;
        InterfaceC23621Ds interfaceC23621Ds;
        int i4;
        Drawable drawable;
        C88513x8 A00;
        int i5;
        int i6;
        C5YU A0a;
        int i7;
        switch (this.A00) {
            case 0:
                c5Tl = (C5Tl) obj;
                if (AbstractC25228BEl.A0B(obj2) != 2 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(483908779, "com.instagram.creator.agent.settings.keyword.KeywordLinkRow.<anonymous> (KeywordResponsesListFragment.kt:225)");
                    }
                    Modifier A09 = AbstractC118175Wb.A09(AbstractC25226BEj.A0X(Modifier.A00, AbstractC25226BEj.A07(c5Tl)), 14.0f);
                    c5Tl.Eno(1828804174);
                    Object obj4 = this.A02;
                    boolean AH4 = c5Tl.AH4(obj4);
                    Object obj5 = this.A01;
                    boolean A1X = AbstractC25225BEi.A1X(c5Tl, obj5, AH4);
                    Object EEc = c5Tl.EEc();
                    if (A1X || EEc == C5UI.A00) {
                        EEc = new C50169MDw(5, obj4, obj5);
                        c5Tl.FBy(EEc);
                    }
                    AbstractC25225BEi.A1V(c5Tl, false);
                    C5WR.A0W(c5Tl, C5XR.A05(A09, null, null, (InterfaceC16820sZ) EEc, true), AbstractC25226BEj.A0g(c5Tl), C5YD.A00(c5Tl, 2131957640), AbstractC25226BEj.A0H(c5Tl));
                    if (C0fH.A02()) {
                        i3 = 1199496535;
                        C0fH.A00(i3);
                    }
                    return C0eB.A00;
                }
                c5Tl.Em9();
                return C0eB.A00;
            case 1:
                c5Tl = (C5Tl) obj;
                if (AbstractC25228BEl.A0B(obj2) != 2 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(-1193008416, "com.instagram.creator.agent.settings.keyword.KeywordLinkRow.<anonymous> (KeywordResponsesListFragment.kt:239)");
                    }
                    QJ0 qj0 = (QJ0) this.A01;
                    String str2 = qj0.A03;
                    String str3 = qj0.A01;
                    Modifier A0X = AbstractC25226BEj.A0X(Modifier.A00, AbstractC25226BEj.A09(c5Tl));
                    c5Tl.Eno(1828820300);
                    Object obj6 = this.A02;
                    boolean A1W2 = AbstractC25230BEn.A1W(c5Tl, obj6, qj0);
                    Object EEc2 = c5Tl.EEc();
                    if (A1W2 || EEc2 == C5UI.A00) {
                        EEc2 = new C50169MDw(6, obj6, qj0);
                        c5Tl.FBy(EEc2);
                    }
                    AbstractC25225BEi.A1V(c5Tl, false);
                    AbstractC25705BXp.A0K(c5Tl, C5XR.A05(A0X, null, null, (InterfaceC16820sZ) EEc2, true), C29198Cu3.A00, str2, str3);
                    if (C0fH.A02()) {
                        i3 = 111877976;
                        C0fH.A00(i3);
                    }
                    return C0eB.A00;
                }
                c5Tl.Em9();
                return C0eB.A00;
            case 2:
                c5Tl = (C5Tl) obj;
                if (AbstractC25228BEl.A0C(obj2) != 2 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(137561514, "com.instagram.creator.commentsinsights.impl.CommentsInsightsOptInFragment.onCreateView.<anonymous>.<anonymous> (CommentsInsightsOptInFragment.kt:75)");
                    }
                    C9U c9u = (C9U) AbstractC25226BEj.A1B(this.A01);
                    if (c9u instanceof C27166Byb) {
                        c5Tl.Eno(-1732396238);
                        CQU cqu = ((C27166Byb) c9u).A00;
                        Object obj7 = this.A02;
                        CIL.A00(c5Tl, cqu, new BIE(obj7, 1), new BIE(obj7, 2), 0);
                    } else if (c9u instanceof C27167Byc) {
                        C1130158n A0N = AbstractC25225BEi.A0N(c5Tl, -1732142596);
                        InterfaceC1127857k A0b = AbstractC25226BEj.A0b(false);
                        int A002 = C5X2.A00(c5Tl);
                        C117505Tk c117505Tk = (C117505Tk) c5Tl;
                        C59P A04 = C117505Tk.A04(c117505Tk);
                        Modifier A01 = C5X3.A01(c5Tl, A0N);
                        AbstractC25233BEq.A11(c5Tl, c117505Tk);
                        AbstractC25231BEo.A12(c5Tl, A0b, A04);
                        InterfaceC16620sF interfaceC16620sF = C5X8.A02;
                        if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                            AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A002);
                        }
                        BIR.A03(c5Tl, A0N, A01);
                    } else {
                        throw AbstractC25233BEq.A0r(c5Tl, 1745229280);
                    }
                    if (AbstractC25230BEn.A1Z(c5Tl, false)) {
                        i3 = -513375583;
                        C0fH.A00(i3);
                    }
                    return C0eB.A00;
                }
                c5Tl.Em9();
                return C0eB.A00;
            case 3:
                c5Tl = (C5Tl) obj;
                if (AbstractC25228BEl.A0B(obj2) != 2 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(1817657390, "com.instagram.direct.fragment.recipientpicker.aistudio.AiStudioRecipientPickerFragment.onCreateView.<anonymous>.<anonymous> (AiStudioRecipientPickerFragment.kt:44)");
                    }
                    C51761Mtk c51761Mtk = (C51761Mtk) AbstractC25226BEj.A1B(this.A01);
                    Object value = ((C26770Brr) this.A02).A01.getValue();
                    boolean A1Z = AbstractC25227BEk.A1Z(c5Tl, value, 1391398426);
                    Object EEc3 = c5Tl.EEc();
                    if (A1Z || EEc3 == C5UI.A00) {
                        EEc3 = AbstractC25230BEn.A0u(c5Tl, value, 12);
                    }
                    AbstractC28477ChV.A04(c5Tl, c51761Mtk, (InterfaceC16660sJ) ((C0YS) EEc3), AbstractC25228BEl.A1W(c5Tl) ? 1 : 0);
                    if (C0fH.A02()) {
                        i3 = 1448333094;
                        C0fH.A00(i3);
                    }
                    return C0eB.A00;
                }
                c5Tl.Em9();
                return C0eB.A00;
            case 4:
                c5Tl = (C5Tl) obj;
                if (AbstractC25228BEl.A0C(obj2) != 2 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(891202221, "com.instagram.direct.fragment.stickertray.aisticker.DirectAiStickerTrayFragment.onViewCreated.<anonymous>.<anonymous> (DirectAiStickerTrayFragment.kt:201)");
                    }
                    KCS kcs = (KCS) this.A02;
                    AbstractC28394Cg0.A01(c5Tl, (C44527JmX) kcs.A0J.getValue(), new C50153MDg(kcs, 48), new C50153MDg(kcs, 49), new C50363MLp(4, this.A01, kcs), 8);
                    if (C0fH.A02()) {
                        i3 = 782199031;
                        C0fH.A00(i3);
                    }
                    return C0eB.A00;
                }
                c5Tl.Em9();
                return C0eB.A00;
            case 5:
                c5Tl = (C5Tl) obj;
                if (AbstractC25228BEl.A0C(obj2) != 2 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(1018089274, "com.instagram.direct.fragment.stickertray.aisticker.DirectAiStickerTrayFragment.onViewCreated.<anonymous> (DirectAiStickerTrayFragment.kt:200)");
                    }
                    KCS kcs2 = (KCS) this.A02;
                    C5VW.A00(c5Tl, AbstractC166987dD.A0o(kcs2.A0L), AbstractC43591JPw.A00(245), C5UA.A01(c5Tl, new DSA(4, this.A01, kcs2), 1844624898));
                    if (C0fH.A02()) {
                        i3 = -1794603315;
                        C0fH.A00(i3);
                    }
                    return C0eB.A00;
                }
                c5Tl.Em9();
                return C0eB.A00;
            case 6:
                c5Tl = (C5Tl) obj;
                if (AbstractC25228BEl.A0B(obj2) != 2 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(-41951683, "com.instagram.direct.fragment.thread.keymanagement.mvvm.ui.EncryptedDeviceList.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EncryptedDeviceList.kt:73)");
                    }
                    Object obj8 = this.A02;
                    Object obj9 = this.A01;
                    C1130158n c1130158n = Modifier.A00;
                    InterfaceC1127857k A02 = AbstractC119595bH.A02(AbstractC118255Wn.A07, c5Tl, C118195Wf.A02, 0);
                    int A003 = C5X2.A00(c5Tl);
                    C117505Tk c117505Tk2 = (C117505Tk) c5Tl;
                    C59P A042 = C117505Tk.A04(c117505Tk2);
                    Modifier A012 = C5X3.A01(c5Tl, c1130158n);
                    AbstractC25233BEq.A11(c5Tl, c117505Tk2);
                    AbstractC25231BEo.A12(c5Tl, A02, A042);
                    InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
                    if (c117505Tk2.A0K || !AbstractC25231BEo.A1O(c5Tl, A003)) {
                        AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A003);
                    }
                    AbstractC25225BEi.A1K(c5Tl, A012);
                    String A004 = AbstractC136736Hc.A00(c5Tl, 2131959094);
                    C118125Vw A0c = AbstractC25226BEj.A0c(c5Tl);
                    long A0M = AbstractC25226BEj.A0M(c5Tl);
                    Modifier A005 = AbstractC118175Wb.A00(new C1333560c(10.0f, 10.0f, 10.0f, 10.0f), AbstractC25228BEl.A0Z(AbstractC118185Wd.A02(C118195Wf.A09, c1130158n), 10.0f, C5XL.A00(c5Tl).A0i));
                    boolean A1W3 = AbstractC25233BEq.A1W(c5Tl, obj8, obj9, 581810092);
                    Object EEc4 = c5Tl.EEc();
                    if (A1W3 || EEc4 == C5UI.A00) {
                        EEc4 = new C37018GSz(23, obj8, obj9);
                        c5Tl.FBy(EEc4);
                    }
                    C5WR.A0R(c5Tl, AbstractC25229BEm.A0T(c117505Tk2, A005, EEc4), A0c, A004, A0M);
                    if (AbstractC25227BEk.A1R(c5Tl)) {
                        i3 = 1921102077;
                        C0fH.A00(i3);
                    }
                    return C0eB.A00;
                }
                c5Tl.Em9();
                return C0eB.A00;
            case 7:
                c5Tl = (C5Tl) obj;
                if (AbstractC25228BEl.A0C(obj2) != 2 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(1135433219, "com.instagram.direct.fragment.thread.threaddetail.metaai.MetaAiVoiceSettingsFragment.onCreateView.<anonymous> (MetaAiVoiceSettingsFragment.kt:44)");
                    }
                    KDN kdn = (KDN) this.A02;
                    InterfaceC74963Ym A022 = C6IB.A02(c5Tl, ((C44480Jlm) kdn.A02.getValue()).A02, 8);
                    c5Tl.Eno(-1695984548);
                    if (kdn.A00 == null) {
                        kdn.A00 = AbstractC28285CdX.A00(c5Tl);
                    }
                    AbstractC25225BEi.A1T(c5Tl);
                    C51760Mtj c51760Mtj = (C51760Mtj) A022.getValue();
                    C50359MLl c50359MLl = new C50359MLl(kdn, 27);
                    C28729CmL c28729CmL = kdn.A00;
                    if (c28729CmL == null) {
                        C14360o3.A0F("scrollState");
                        throw C00O.createAndThrow();
                    }
                    AbstractC28051CYf.A01(c28729CmL, c5Tl, c51760Mtj, c50359MLl, new C50359MLl(this.A01, 28), 8);
                    if (C0fH.A02()) {
                        i3 = 781215066;
                        C0fH.A00(i3);
                    }
                    return C0eB.A00;
                }
                c5Tl.Em9();
                return C0eB.A00;
            case 8:
                File file = (File) obj;
                Medium medium = (Medium) obj2;
                AbstractC167017dG.A1N(file, medium);
                C28214CcD c28214CcD = (C28214CcD) this.A02;
                C8XE c8xe = (C8XE) this.A01;
                C9CK c9ck = new C9CK(CZF.A01(c8xe.A02), c8xe.A07, (String) null, 12);
                String str4 = medium.A0a;
                if (str4 != null) {
                    long j = medium.A03;
                    UserSession userSession = c28214CcD.A01;
                    ClipInfo A023 = MY3.A02(userSession, file, j);
                    AbstractC165967bO.A00(userSession).EOh(c9ck, null, null, null, c28214CcD.A02, A023, null, str4, AbstractC111324zv.A00(3069), null, null, null, c28214CcD.A03, c28214CcD.A04);
                }
                return C0eB.A00;
            case 9:
                C14360o3.A0B(obj, 0);
                StringBuilder A1C = AbstractC166987dD.A1C();
                A1C.append("metadata: ");
                A1C.append(obj);
                A1C.append(", errorMsg: ");
                C0w9.A03("SelfNoteBottomSheetFragment:setNoteVideoPogSimpleVideoLayout", AbstractC166997dE.A0x((String) obj2, A1C));
                KDQ.A04((KDQ) this.A02, (C45838KQt) this.A01);
                return C0eB.A00;
            case 10:
                C14360o3.A0B(obj, 0);
                StringBuilder A1C2 = AbstractC166987dD.A1C();
                A1C2.append("metadata: ");
                A1C2.append(obj);
                A1C2.append(", errorMsg: ");
                C0w9.A03("NoteQuickReplySheetFragment:setNoteVideoPogSimpleVideoLayout", AbstractC166997dE.A0x((String) obj2, A1C2));
                C45487KCc.A04((C45487KCc) this.A02, (C45842KQx) this.A01);
                return C0eB.A00;
            case 11:
                SXJ sxj = (SXJ) obj2;
                C14360o3.A0B(sxj, 1);
                List list = (List) this.A01;
                DirectLiveLocationService directLiveLocationService = (DirectLiveLocationService) this.A02;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    DirectLiveLocationService.A02(directLiveLocationService, sxj, AbstractC166987dD.A0N(it.next()));
                }
                return C0eB.A00;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                SXJ sxj2 = (SXJ) obj2;
                C14360o3.A0B(sxj2, 1);
                List list2 = (List) this.A01;
                DirectLiveLocationService directLiveLocationService2 = (DirectLiveLocationService) this.A02;
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    DirectLiveLocationService.A02(directLiveLocationService2, sxj2, AbstractC166987dD.A0N(it2.next()));
                }
                if (C14360o3.A0K(sxj2.A00, directLiveLocationService2.A05)) {
                    sxj2.A00 = null;
                }
                return C0eB.A00;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                c5Tl = (C5Tl) obj;
                if (AbstractC25228BEl.A0B(obj2) != 2 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(-2129178703, "com.instagram.direct.messagethread.MessageComposableHolder.DecoratedItem.<anonymous> (MessageComposableHolder.kt:68)");
                    }
                    ((C27209BzS) this.A02).A04(c5Tl, (AnonymousClass784) this.A01, 0);
                    if (C0fH.A02()) {
                        i3 = 1687728867;
                        C0fH.A00(i3);
                    }
                    return C0eB.A00;
                }
                c5Tl.Em9();
                return C0eB.A00;
            case 14:
                c5Tl = (C5Tl) obj;
                if (AbstractC25228BEl.A0B(obj2) != 2 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(593764544, "com.instagram.direct.messagethread.MessageComposableHolder.onBindData.<anonymous>.<anonymous>.<anonymous> (MessageComposableHolder.kt:59)");
                    }
                    C27209BzS.A00(c5Tl, (C27209BzS) this.A02, this.A01, 0);
                    if (C0fH.A02()) {
                        i3 = 2014425929;
                        C0fH.A00(i3);
                    }
                    return C0eB.A00;
                }
                c5Tl.Em9();
                return C0eB.A00;
            case Process.SIGTERM /* 15 */:
                c5Tl = (C5Tl) obj;
                if (AbstractC25228BEl.A0B(obj2) != 2 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(-597093484, "com.instagram.direct.messagethread.MessageComposableHolder.onBindData.<anonymous>.<anonymous> (MessageComposableHolder.kt:50)");
                    }
                    C5UP c5up = COE.A05;
                    C27209BzS c27209BzS = (C27209BzS) this.A02;
                    int i8 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                    C160687Ic c160687Ic = c27209BzS.A02;
                    C117685Ud A024 = c5up.A02(c160687Ic.A07);
                    C117685Ud A025 = COE.A04.A02(c160687Ic.A01.getValue());
                    C117685Ud A026 = COE.A00.A02(c160687Ic.A06);
                    C117685Ud A027 = COE.A03.A02(c160687Ic.A02);
                    C117685Ud A028 = COE.A02.A02(c27209BzS.A03);
                    C5UP c5up2 = COE.A01;
                    boolean A1Z2 = AbstractC25227BEk.A1Z(c5Tl, c27209BzS, -458237250);
                    Object EEc5 = c5Tl.EEc();
                    if (A1Z2 || EEc5 == C5UI.A00) {
                        EEc5 = new C27836COz(c27209BzS);
                        c5Tl.FBy(EEc5);
                    }
                    AbstractC25225BEi.A1V(c5Tl, false);
                    C117685Ud A029 = c5up2.A02(EEc5);
                    C5UP c5up3 = C5V2.A0D;
                    C59J c59j = (C59J) c5Tl.AJX(c5up3);
                    C14360o3.A0B(c59j, 0);
                    if (AbstractC25233BEq.A1Y(c5Tl, new DSA(14, this.A01, c27209BzS), new C117685Ud[]{A024, A025, A026, A027, A028, A029, c5up3.A02(new C28846CoG(c59j))}, -568768699)) {
                        i3 = -1095282105;
                        C0fH.A00(i3);
                    }
                    return C0eB.A00;
                }
                c5Tl.Em9();
                return C0eB.A00;
            case 16:
                c5Tl = (C5Tl) obj;
                if (AbstractC25228BEl.A0B(obj2) != 2 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(2748135, "com.instagram.direct.messagethread.MessageComposableHolder.onBindData.<anonymous> (MessageComposableHolder.kt:49)");
                    }
                    C27209BzS c27209BzS2 = (C27209BzS) this.A02;
                    int i9 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                    C160687Ic c160687Ic2 = c27209BzS2.A02;
                    C5VW.A01(c5Tl, c160687Ic2.A04, c160687Ic2.A03.getModuleName(), C5UA.A01(c5Tl, new DSA(15, this.A01, c27209BzS2), 1137840773));
                    if (C0fH.A02()) {
                        i3 = 683359294;
                        C0fH.A00(i3);
                    }
                    return C0eB.A00;
                }
                c5Tl.Em9();
                return C0eB.A00;
            case 17:
                c5Tl = (C5Tl) obj;
                if (AbstractC25228BEl.A0B(obj2) != 2 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(-1777524152, "com.instagram.direct.messagethread.compose.DecoratedMessage.<anonymous>.<anonymous>.<anonymous> (DecoratedMessage.kt:52)");
                    }
                    Modifier A0W = AbstractC25228BEl.A0W();
                    c5Tl.Eno(-1351386207);
                    Object obj10 = this.A01;
                    Object EEc6 = c5Tl.EEc();
                    if (EEc6 == C5UI.A00) {
                        EEc6 = new C50357MLj(obj10, 39);
                        c5Tl.FBy(EEc6);
                    }
                    C117505Tk c117505Tk3 = (C117505Tk) c5Tl;
                    C117505Tk.A0L(c117505Tk3, false);
                    Modifier A013 = AbstractC28010CWi.A01(A0W, (InterfaceC16660sJ) EEc6);
                    InterfaceC16620sF interfaceC16620sF3 = (InterfaceC16620sF) this.A02;
                    InterfaceC1127857k A0f = AbstractC25228BEl.A0f(c5Tl, 0);
                    int A006 = C5X2.A00(c5Tl);
                    C59P A043 = C117505Tk.A04(c117505Tk3);
                    Modifier A014 = C5X3.A01(c5Tl, A013);
                    AbstractC25233BEq.A11(c5Tl, c117505Tk3);
                    AbstractC25231BEo.A12(c5Tl, A0f, A043);
                    InterfaceC16620sF interfaceC16620sF4 = C5X8.A02;
                    if (c117505Tk3.A0K || !AbstractC25231BEo.A1O(c5Tl, A006)) {
                        AbstractC25231BEo.A15(c5Tl, interfaceC16620sF4, A006);
                    }
                    AbstractC25225BEi.A1K(c5Tl, A014);
                    AbstractC25227BEk.A1P(c5Tl, interfaceC16620sF3, 0);
                    if (AbstractC25227BEk.A1R(c5Tl)) {
                        i3 = -1885081092;
                        C0fH.A00(i3);
                    }
                    return C0eB.A00;
                }
                c5Tl.Em9();
                return C0eB.A00;
            case 18:
                CU6 cu6 = (CU6) this.A02;
                if (!cu6.A02.get()) {
                    cu6.A00.removeCallbacksAndMessages(null);
                    ((Runnable) this.A01).run();
                } else {
                    AbstractC12120kG.A0J("MsysMailboxSessionManagerImpl: Timeout waiting for pending messages queue drained", null, AbstractC06930Yk.A0E(), 20134884);
                }
                return C0eB.A00;
            case Process.SIGSTOP /* 19 */:
                str = (String) obj;
                A1W = AbstractC25231BEo.A1W(obj2, str);
                c19l = (C19L) this.A01;
                obj3 = this.A02;
                interfaceC23621Ds = null;
                i4 = 7;
                AbstractC166987dD.A1Z(new PXZ(obj3, str, interfaceC23621Ds, i4, A1W), c19l);
                return C0eB.A00;
            case 20:
                str = (String) obj;
                A1W = AbstractC25231BEo.A1W(obj2, str);
                c19l = (C19L) this.A01;
                obj3 = this.A02;
                interfaceC23621Ds = null;
                i4 = 8;
                AbstractC166987dD.A1Z(new PXZ(obj3, str, interfaceC23621Ds, i4, A1W), c19l);
                return C0eB.A00;
            case 21:
                c5Tl = (C5Tl) obj;
                if (AbstractC25228BEl.A0B(obj2) != 2 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(-1080857132, "com.instagram.fanclub.settings.adapter.FanClubMainRecommendationViewHolder.bind.<anonymous>.<anonymous> (FanClubMainRecommendationViewHolder.kt:43)");
                    }
                    C51852Mvw c51852Mvw = (C51852Mvw) this.A01;
                    String valueOf = String.valueOf(c51852Mvw.A07);
                    String valueOf2 = String.valueOf(c51852Mvw.A04);
                    SimpleImageUrl A0t = AbstractC25225BEi.A0t(c51852Mvw.A05);
                    boolean A1Z3 = AbstractC166997dE.A1Z(c51852Mvw.A01, true);
                    boolean A1Z4 = AbstractC25227BEk.A1Z(c5Tl, c51852Mvw, 1049203520);
                    Object obj11 = this.A02;
                    boolean A1X2 = AbstractC25226BEj.A1X(c5Tl, obj11, A1Z4);
                    Object EEc7 = c5Tl.EEc();
                    if (A1X2 || EEc7 == C5UI.A00) {
                        EEc7 = new C50171MDy(42, c51852Mvw, obj11);
                        c5Tl.FBy(EEc7);
                    }
                    AbstractC27668CIn.A00(c5Tl, A0t, valueOf, valueOf2, (InterfaceC16820sZ) EEc7, AbstractC25228BEl.A1W(c5Tl) ? 1 : 0, A1Z3);
                    if (C0fH.A02()) {
                        i3 = 2043132104;
                        C0fH.A00(i3);
                    }
                    return C0eB.A00;
                }
                c5Tl.Em9();
                return C0eB.A00;
            case 22:
                View view2 = (View) obj;
                AbstractC167017dG.A1N(view2, obj2);
                ((View.OnClickListener) ((InterfaceC16620sF) ((C101044gK) this.A01).A04.A0C).invoke(obj2, ((C26530Bnp) this.A02).A06)).onClick(view2);
                return C0eB.A00;
            case 23:
                int A0H = AbstractC166987dD.A0H(obj);
                User user = (User) obj2;
                C14360o3.A0B(user, 1);
                C51762Yz c51762Yz = (C51762Yz) this.A02;
                ArrayList A0U = AbstractC001800i.A0U((Collection) c51762Yz.A03);
                A0U.remove(user);
                ImmutableList copyOf = ImmutableList.copyOf((Collection) A0U);
                C14360o3.A07(copyOf);
                c51762Yz.A01(copyOf);
                AbstractC31433Drd abstractC31433Drd = (AbstractC31433Drd) this.A01;
                if (abstractC31433Drd != null) {
                    abstractC31433Drd.A09(user, A0H);
                    return C0eB.A00;
                }
                return null;
            case 24:
                Context context = (Context) obj;
                String str5 = (String) obj2;
                boolean A1R = AbstractC167007dF.A1R(0, context, str5);
                CP4 cp4 = ((IM6) this.A02).A02;
                InterfaceC31134DmH interfaceC31134DmH = (InterfaceC31134DmH) this.A01;
                C14360o3.A0B(interfaceC31134DmH, A1R ? 1 : 0);
                C57332k8 c57332k8 = cp4.A00;
                String Big = interfaceC31134DmH.Big();
                LruCache lruCache = c57332k8.A01;
                Object obj12 = lruCache.get(Big);
                if (c57332k8.A00 == null) {
                    Drawable drawable2 = context.getDrawable(R.drawable.instagram_reply_pano_outline_24);
                    if (drawable2 != null) {
                        drawable = drawable2.mutate();
                    } else {
                        drawable = null;
                    }
                    c57332k8.A00 = drawable;
                    if (drawable != null) {
                        drawable.setBounds(0, 0, AbstractC166987dD.A0C(context, 10), AbstractC166987dD.A0C(context, 10));
                    }
                }
                if (obj12 != null) {
                    return obj12;
                }
                List B48 = interfaceC31134DmH.B48();
                if (B48 == null) {
                    B48 = AbstractC166987dD.A1E();
                }
                Drawable A007 = AbstractC89513yr.A00(context, c57332k8.A00, null, C05F.A00, null, null, null, Integer.valueOf(AbstractC167007dF.A09(context, R.attr.igds_color_gradient_pink)), str5, B48, context.getResources().getDimensionPixelSize(R.dimen.asset_picker_cell_margin), A1R, A1R, A1R, A1R, false);
                lruCache.put(Big, A007);
                return A007;
            case 25:
                return Boolean.valueOf(((InterfaceC31057Dkz) this.A01).Dag((String) obj, (String) obj2, AbstractC25233BEq.A0o((C38321qM) this.A02)));
            case 26:
                C120985dq c120985dq = (C120985dq) obj;
                C37644Ghd c37644Ghd = (C37644Ghd) obj2;
                boolean A1a = AbstractC167017dG.A1a(c120985dq, c37644Ghd);
                C38321qM c38321qM = c120985dq.A02;
                if (c38321qM != null) {
                    C75113Zb c75113Zb = c37644Ghd.A0E;
                    if (c75113Zb != null) {
                        UserSession userSession2 = (UserSession) this.A01;
                        if (AbstractC76643c9.A0H(userSession2, c38321qM)) {
                            ((CTA) this.A02).A06.D4z(c38321qM, A1a);
                        } else {
                            boolean A50 = c38321qM.A50();
                            InterfaceC75453aC interfaceC75453aC = ((CTA) this.A02).A06;
                            C8JW c8jw = C8JW.A0N;
                            if (A50) {
                                C128855rz c128855rz = new C128855rz(C41676Id5.A00());
                                c128855rz.A09 = c38321qM.A1K();
                                A00 = c128855rz.A00();
                            } else {
                                A00 = CFT.A00(C1DS.A00(userSession2), AbstractC25236BEt.A0R(c38321qM.A1a()));
                            }
                            interfaceC75453aC.D4x(c8jw, A00, c38321qM, c75113Zb);
                        }
                        return C0eB.A00;
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                throw AbstractC166987dD.A14("Required value was null.");
            case 27:
                Context context2 = (Context) obj;
                InterfaceC11380iw interfaceC11380iw = (InterfaceC11380iw) obj2;
                AbstractC167017dG.A1N(context2, interfaceC11380iw);
                UserSession userSession3 = ((AB8) this.A02).A00;
                OLM olm = new OLM(interfaceC11380iw, userSession3);
                EnumC39589Hdz enumC39589Hdz = EnumC39589Hdz.A0B;
                olm.A02("upsell_permanent_entrypoint", null, "comment_off", "perm_entry_point_tap");
                C37091o7.A00();
                C68094VAo c68094VAo = new C68094VAo((C38321qM) this.A01, null, null, enumC39589Hdz, null);
                C189448aO A0y = AbstractC25225BEi.A0y(userSession3);
                AbstractC25226BEj.A1M(context2, A0y, 2131976333);
                A0y.A00().A03(context2, c68094VAo);
                return C0eB.A00;
            case 28:
                c5Tl = (C5Tl) obj;
                if (AbstractC25228BEl.A0B(obj2) != 2 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(-845327013, "com.instagram.feed.opencarousel.reviewpage.fragment.OpenCarouselReviewPageHeaderFragment.onCreateView.<anonymous>.<anonymous> (OpenCarouselReviewPageHeaderFragment.kt:80)");
                    }
                    InterfaceC118245Wl interfaceC118245Wl = C118195Wf.A02;
                    C26830Bss c26830Bss = (C26830Bss) this.A02;
                    InterfaceC74963Ym interfaceC74963Ym = (InterfaceC74963Ym) this.A01;
                    C1130158n c1130158n2 = Modifier.A00;
                    InterfaceC1127857k A0Z = AbstractC25226BEj.A0Z(c5Tl, interfaceC118245Wl);
                    int A008 = C5X2.A00(c5Tl);
                    C117505Tk c117505Tk4 = (C117505Tk) c5Tl;
                    C59P A044 = C117505Tk.A04(c117505Tk4);
                    Modifier A015 = C5X3.A01(c5Tl, c1130158n2);
                    AbstractC25233BEq.A11(c5Tl, c117505Tk4);
                    AbstractC25231BEo.A12(c5Tl, A0Z, A044);
                    InterfaceC16620sF interfaceC16620sF5 = C5X8.A02;
                    if (c117505Tk4.A0K || !AbstractC25231BEo.A1O(c5Tl, A008)) {
                        AbstractC25231BEo.A15(c5Tl, interfaceC16620sF5, A008);
                    }
                    AbstractC25225BEi.A1K(c5Tl, A015);
                    C26830Bss.A01(c5Tl, (C37838Gks) interfaceC74963Ym.getValue(), c26830Bss, 0);
                    C26830Bss.A00(c5Tl, (C37838Gks) interfaceC74963Ym.getValue(), c26830Bss, 0);
                    C26830Bss.A04(c5Tl, c26830Bss, 0);
                    C26830Bss.A03(c5Tl, c26830Bss, 0);
                    if (AbstractC25227BEk.A1R(c5Tl)) {
                        i3 = 1838577902;
                        C0fH.A00(i3);
                    }
                    return C0eB.A00;
                }
                c5Tl.Em9();
                return C0eB.A00;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                c5Tl = (C5Tl) obj;
                if (AbstractC25228BEl.A0B(obj2) != 2 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(-1871313751, "com.instagram.feed.tifu.ui.TifuHScrollPagerUnit.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TifuHScrollPagerUnit.kt:173)");
                    }
                    Modifier A0W2 = AbstractC25228BEl.A0W();
                    InterfaceC118245Wl interfaceC118245Wl2 = C118195Wf.A00;
                    C6ID A016 = AbstractC118255Wn.A01(16.0f);
                    C132335yC c132335yC = (C132335yC) this.A02;
                    InterfaceC16820sZ interfaceC16820sZ2 = (InterfaceC16820sZ) this.A01;
                    InterfaceC1127857k A017 = AbstractC119595bH.A01(A016, c5Tl, interfaceC118245Wl2);
                    int A009 = C5X2.A00(c5Tl);
                    C117505Tk c117505Tk5 = (C117505Tk) c5Tl;
                    C59P A045 = C117505Tk.A04(c117505Tk5);
                    Modifier A018 = C5X3.A01(c5Tl, A0W2);
                    AbstractC25233BEq.A11(c5Tl, c117505Tk5);
                    AbstractC25231BEo.A12(c5Tl, A017, A045);
                    InterfaceC16620sF interfaceC16620sF6 = C5X8.A02;
                    if (c117505Tk5.A0K || !AbstractC25231BEo.A1O(c5Tl, A009)) {
                        AbstractC25231BEo.A15(c5Tl, interfaceC16620sF6, A009);
                    }
                    AbstractC25225BEi.A1K(c5Tl, A018);
                    c5Tl.Eno(-549860359);
                    boolean z2 = c132335yC.A09;
                    if (!z2) {
                        CXV.A00(c5Tl, null, c132335yC.A05, 32.0f, 384, 10, 0L);
                    }
                    C117505Tk.A0L(c117505Tk5, false);
                    if (z2) {
                        c5Tl.Eno(-549848131);
                        i5 = 2131975617;
                    } else {
                        c5Tl.Eno(-549845317);
                        i5 = 2131975582;
                    }
                    String A0010 = C5YD.A00(c5Tl, i5);
                    C117505Tk.A0L(c117505Tk5, false);
                    AbstractC25235BEs.A1F(c5Tl, AbstractC25226BEj.A0c(c5Tl), A0010);
                    C6GE.A08(c5Tl, C6GD.A03, C6GA.A01(c5Tl), C5YD.A00(c5Tl, 2131975581), interfaceC16820sZ2, 1572864, 412);
                    if (AbstractC25227BEk.A1R(c5Tl)) {
                        i3 = 1983286718;
                        C0fH.A00(i3);
                    }
                    return C0eB.A00;
                }
                c5Tl.Em9();
                return C0eB.A00;
            case 30:
                ((Number) obj2).floatValue();
                C9C6 c9c6 = (C9C6) AbstractC001800i.A0O(((C132335yC) this.A02).A06, 0);
                if (c9c6 != null) {
                    ((InterfaceC16660sJ) this.A01).invoke(c9c6.A03);
                }
                return C0eB.A00;
            case 31:
                c5Tl = (C5Tl) obj;
                if (AbstractC25228BEl.A0B(obj2) != 2 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(1714315353, "com.instagram.feed.tifu.ui.TifuHScrollUnit.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TifuHScrollUnit.kt:262)");
                    }
                    Modifier A0W3 = AbstractC25228BEl.A0W();
                    InterfaceC118245Wl interfaceC118245Wl3 = C118195Wf.A00;
                    C6ID A019 = AbstractC118255Wn.A01(16.0f);
                    C132335yC c132335yC2 = (C132335yC) this.A02;
                    InterfaceC16820sZ interfaceC16820sZ3 = (InterfaceC16820sZ) this.A01;
                    InterfaceC1127857k A0110 = AbstractC119595bH.A01(A019, c5Tl, interfaceC118245Wl3);
                    int A0011 = C5X2.A00(c5Tl);
                    C117505Tk c117505Tk6 = (C117505Tk) c5Tl;
                    C59P A046 = C117505Tk.A04(c117505Tk6);
                    Modifier A0111 = C5X3.A01(c5Tl, A0W3);
                    AbstractC25233BEq.A11(c5Tl, c117505Tk6);
                    AbstractC25231BEo.A12(c5Tl, A0110, A046);
                    InterfaceC16620sF interfaceC16620sF7 = C5X8.A02;
                    if (c117505Tk6.A0K || !AbstractC25231BEo.A1O(c5Tl, A0011)) {
                        AbstractC25231BEo.A15(c5Tl, interfaceC16620sF7, A0011);
                    }
                    AbstractC25225BEi.A1K(c5Tl, A0111);
                    c5Tl.Eno(-1152577506);
                    boolean z3 = c132335yC2.A09;
                    if (!z3) {
                        CXV.A00(c5Tl, null, c132335yC2.A05, 32.0f, 384, 10, 0L);
                    }
                    C117505Tk.A0L(c117505Tk6, false);
                    if (z3) {
                        c5Tl.Eno(-1152565844);
                        i6 = 2131975617;
                    } else {
                        c5Tl.Eno(-1152563094);
                        i6 = 2131975582;
                    }
                    String A0012 = C5YD.A00(c5Tl, i6);
                    C117505Tk.A0L(c117505Tk6, false);
                    AbstractC25235BEs.A1F(c5Tl, AbstractC25226BEj.A0c(c5Tl), A0012);
                    C6GE.A08(c5Tl, C6GD.A03, C6GA.A01(c5Tl), C5YD.A00(c5Tl, 2131975581), interfaceC16820sZ3, 1572864, 412);
                    if (AbstractC25227BEk.A1R(c5Tl)) {
                        i3 = -376543347;
                        C0fH.A00(i3);
                    }
                    return C0eB.A00;
                }
                c5Tl.Em9();
                return C0eB.A00;
            case 32:
                SlideInAndOutIconView slideInAndOutIconView = (SlideInAndOutIconView) obj2;
                C14360o3.A0B(slideInAndOutIconView, 1);
                Drawable drawable3 = (Drawable) this.A01;
                C26642Bpd c26642Bpd = (C26642Bpd) this.A02;
                AbstractC47026Kqj.A00(drawable3, slideInAndOutIconView, c26642Bpd.A04, c26642Bpd.A06, c26642Bpd.A05, c26642Bpd.A01, c26642Bpd.A00, c26642Bpd.A02);
                interfaceC16820sZ = C29789DCh.A00;
                return AbstractC25225BEi.A0q(interfaceC16820sZ);
            case 33:
                String str6 = (String) obj;
                C42520Irz c42520Irz = (C42520Irz) obj2;
                AbstractC167007dF.A1K(str6, c42520Irz);
                C38321qM c38321qM2 = (C38321qM) this.A01;
                if (c38321qM2 != null) {
                    ((C41695IdO) this.A02).A01.Dth(C1XV.A0K, c38321qM2, c42520Irz.getId(), c42520Irz.CAR(), str6, null, null, null, -1, -1, false, false, false);
                }
                return C0eB.A00;
            case 34:
                FollowButton followButton = (FollowButton) obj2;
                AbstractC167007dF.A1K(obj, followButton);
                C77573dh c77573dh = (C77573dh) this.A02;
                UserSession userSession4 = c77573dh.A08;
                boolean z4 = c77573dh.A0S;
                Integer num = c77573dh.A0I;
                boolean z5 = c77573dh.A0N;
                boolean z6 = c77573dh.A0U;
                boolean z7 = c77573dh.A0T;
                boolean z8 = c77573dh.A0R;
                EnumC77553df enumC77553df = c77573dh.A0B;
                AbstractC110594yW.A01(userSession4, enumC77553df, followButton, num, c77573dh.A01, c77573dh.A00, c77573dh.A03, c77573dh.A02, z4, z5, z6, z7, z8, C18U.A06(C06090Tz.A05, userSession4, 36329753967346188L));
                ViewOnAttachStateChangeListenerC110564yT viewOnAttachStateChangeListenerC110564yT = followButton.A0J;
                String str7 = c77573dh.A0L;
                EnumC77563dg enumC77563dg = c77573dh.A0G;
                C38321qM c38321qM3 = c77573dh.A09;
                C19260xA c19260xA = c77573dh.A07;
                SearchContext searchContext = c77573dh.A0A;
                InterfaceC77483dY interfaceC77483dY = c77573dh.A0D;
                InterfaceC77503da interfaceC77503da = c77573dh.A0C;
                InterfaceC77523dc interfaceC77523dc = c77573dh.A0F;
                AbstractC110594yW.A00(c77573dh.A05, c19260xA, userSession4, c38321qM3, searchContext, enumC77553df, interfaceC77503da, interfaceC77483dY, c77573dh.A0E, interfaceC77523dc, enumC77563dg, viewOnAttachStateChangeListenerC110564yT, c77573dh.A0J, str7, c77573dh.A0K, AbstractC25229BEm.A1W((C51762Yz) this.A01), c77573dh.A0O, c77573dh.A0Q, c77573dh.A0P);
                User user2 = c77573dh.A0H;
                InterfaceC11380iw interfaceC11380iw2 = c77573dh.A06;
                viewOnAttachStateChangeListenerC110564yT.A04(interfaceC11380iw2, userSession4, user2);
                viewOnAttachStateChangeListenerC110564yT.A0L = c77573dh.A0M;
                if (C3K8.A01(userSession4) && c38321qM3 != null && (interfaceC11380iw2 instanceof InterfaceC60442pS)) {
                    AbstractC99834e5.A01(followButton, userSession4, c38321qM3, (InterfaceC60442pS) interfaceC11380iw2, false);
                }
                i = 17;
                view = followButton;
                interfaceC16820sZ = new C37015GSu(view, i);
                return AbstractC25225BEi.A0q(interfaceC16820sZ);
            case 35:
                View A0S = AbstractC25228BEl.A0S(obj2);
                TextView A0N2 = AbstractC167007dF.A0N(A0S, R.id.badge_label);
                ImageView imageView = (ImageView) AbstractC166997dE.A0R(A0S, R.id.badge_icon);
                C26632BpT c26632BpT = (C26632BpT) this.A02;
                C3PO c3po = c26632BpT.A00;
                if (c3po == C3PO.A05 || (c3po == C3PO.A04 && c26632BpT.A01)) {
                    z = true;
                } else {
                    z = false;
                }
                if (c3po == C3PO.A0A) {
                    i2 = R.drawable.reel_badge_label_subscribers_background;
                } else {
                    C3PO c3po2 = C3PO.A04;
                    i2 = R.drawable.reel_badge_label_2021_branding_background;
                    if (c3po == c3po2) {
                        i2 = R.drawable.reel_badge_label_close_friends_background;
                    }
                }
                A0N2.setBackgroundResource(i2);
                int i10 = 2131971855;
                if (c26632BpT.A02) {
                    i10 = 2131971857;
                }
                A0N2.setText(i10);
                if (z) {
                    imageView.setVisibility(0);
                    AbstractC166997dE.A19(((C76223bS) this.A01).A05.A0C, imageView, R.drawable.instagram_lock_pano_filled_24);
                } else {
                    imageView.setVisibility(8);
                }
                i = 18;
                view = A0N2;
                interfaceC16820sZ = new C37015GSu(view, i);
                return AbstractC25225BEi.A0q(interfaceC16820sZ);
            case 36:
                ViewGroup viewGroup = (ViewGroup) obj2;
                C14360o3.A0B(viewGroup, 1);
                C26650Bpl c26650Bpl = (C26650Bpl) this.A02;
                SeekBar seekBar = (SeekBar) AbstractC166997dE.A0R(viewGroup, R.id.scrubber);
                seekBar.setProgress(0, AbstractC167007dF.A1Q(seekBar.getProgress(), 0));
                int i11 = c26650Bpl.A00;
                seekBar.setMax(i11);
                seekBar.setThumb((Drawable) this.A01);
                seekBar.setOnSeekBarChangeListener(new C55533OlR(1, c26650Bpl.A01, seekBar, c26650Bpl));
                C26650Bpl.A03(viewGroup, i11, 0);
                i = 22;
                view = seekBar;
                interfaceC16820sZ = new C37015GSu(view, i);
                return AbstractC25225BEi.A0q(interfaceC16820sZ);
            case 37:
                C167957eq c167957eq = (C167957eq) obj2;
                C14360o3.A0B(c167957eq, 1);
                ComponentTree componentTree = (ComponentTree) ((C51762Yz) this.A01).A03;
                C14360o3.A0B(componentTree, 0);
                LithoView lithoView = (LithoView) c167957eq.A00.getValue();
                if (lithoView.A00 != componentTree) {
                    lithoView.A0l(componentTree, true);
                }
                c167957eq.A04(((C167877eh) this.A02).A00);
                i = 24;
                view = c167957eq;
                interfaceC16820sZ = new C37015GSu(view, i);
                return AbstractC25225BEi.A0q(interfaceC16820sZ);
            case 38:
                View A0S2 = AbstractC25228BEl.A0S(obj2);
                if (((C78003eS) this.A02).A08 != null) {
                    A0S2.setBackground((Drawable) this.A01);
                }
                i = 28;
                view = A0S2;
                interfaceC16820sZ = new C37015GSu(view, i);
                return AbstractC25225BEi.A0q(interfaceC16820sZ);
            case 39:
                c5Tl = (C5Tl) obj;
                if (AbstractC25228BEl.A0B(obj2) != 2 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(-2132618050, "com.instagram.newsfeed.compose.ui.StartAvatar.<anonymous>.<anonymous> (NewsfeedStoryRow.kt:215)");
                    }
                    BGC bgc = (BGC) ((InterfaceC31097Dlf) this.A02);
                    ImageUrl imageUrl = bgc.A03;
                    ImageUrl imageUrl2 = bgc.A02;
                    Integer num2 = bgc.A04;
                    c5Tl.Eno(-2093116550);
                    if (num2 == null) {
                        A0a = null;
                    } else {
                        A0a = AbstractC25228BEl.A0a(AbstractC119585bG.A00(c5Tl, num2.intValue()));
                    }
                    boolean A1W4 = AbstractC25228BEl.A1W(c5Tl);
                    BG8.A0B(c5Tl, A0a, bgc.A00, imageUrl, imageUrl2, (InterfaceC16660sJ) this.A01, A1W4 ? 1 : 0, A1W4 ? 1 : 0, bgc.A05, bgc.A07, bgc.A06);
                    if (C0fH.A02()) {
                        i3 = -2114586664;
                        C0fH.A00(i3);
                    }
                    return C0eB.A00;
                }
                c5Tl.Em9();
                return C0eB.A00;
            case 40:
                c5Tl = (C5Tl) obj;
                if (AbstractC25228BEl.A0B(obj2) != 2 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(-1308521509, "com.instagram.newsfeed.followrequests.ui.compose.FollowRequestItemContent.<anonymous> (FollowRequestsCompose.kt:107)");
                    }
                    C26023BfC c26023BfC = (C26023BfC) this.A02;
                    BJ3 A0013 = AbstractC28498Chr.A00(c26023BfC.A05);
                    c5Tl.Eno(1794064361);
                    Object obj13 = this.A01;
                    Object EEc8 = c5Tl.EEc();
                    if (EEc8 == C5UI.A00) {
                        EEc8 = new C57531Pg5(40, obj13, c26023BfC);
                        c5Tl.FBy(EEc8);
                    }
                    AbstractC25225BEi.A1T(c5Tl);
                    AbstractC25276BGq.A00(c5Tl, null, A0013, null, (InterfaceC16820sZ) EEc8, 3072, 6);
                    if (C0fH.A02()) {
                        i3 = 252394816;
                        C0fH.A00(i3);
                    }
                    return C0eB.A00;
                }
                c5Tl.Em9();
                return C0eB.A00;
            case Seq.NULL_REFNUM /* 41 */:
                c5Tl = (C5Tl) obj;
                if (AbstractC25228BEl.A0B(obj2) != 2 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(-460241529, "com.instagram.opal.impl.ui.OpalAudienceSelectorFragment.onCreateView.<anonymous>.<anonymous> (OpalAudienceSelectorFragment.kt:113)");
                    }
                    Object obj14 = this.A02;
                    boolean A1Z5 = AbstractC25227BEk.A1Z(c5Tl, obj14, -2090870983);
                    Object EEc9 = c5Tl.EEc();
                    if (A1Z5 || EEc9 == C5UI.A00) {
                        EEc9 = AbstractC25230BEn.A0u(c5Tl, obj14, 15);
                    }
                    C117505Tk c117505Tk7 = (C117505Tk) c5Tl;
                    C117505Tk.A0L(c117505Tk7, false);
                    InterfaceC16660sJ interfaceC16660sJ = (InterfaceC16660sJ) ((C0YS) EEc9);
                    boolean A1Z6 = AbstractC25227BEk.A1Z(c5Tl, obj14, -2090869283);
                    Object EEc10 = c5Tl.EEc();
                    if (A1Z6 || EEc10 == C5UI.A00) {
                        EEc10 = AbstractC25230BEn.A0u(c5Tl, obj14, 16);
                    }
                    InterfaceC16660sJ A1E = AbstractC25228BEl.A1E(c117505Tk7, EEc10, false);
                    boolean A1Z7 = AbstractC25227BEk.A1Z(c5Tl, obj14, -2090867360);
                    Object EEc11 = c5Tl.EEc();
                    if (A1Z7 || EEc11 == C5UI.A00) {
                        EEc11 = AbstractC25230BEn.A0u(c5Tl, obj14, 17);
                    }
                    InterfaceC16660sJ A1E2 = AbstractC25228BEl.A1E(c117505Tk7, EEc11, false);
                    boolean A1Z8 = AbstractC25227BEk.A1Z(c5Tl, obj14, -2090865509);
                    Object EEc12 = c5Tl.EEc();
                    if (A1Z8 || EEc12 == C5UI.A00) {
                        EEc12 = AbstractC25229BEm.A0t(c5Tl, obj14, 19);
                    }
                    InterfaceC16820sZ A1D = AbstractC25228BEl.A1D(c117505Tk7, EEc12, false);
                    InterfaceC74963Ym interfaceC74963Ym2 = (InterfaceC74963Ym) this.A01;
                    C74 c74 = (C74) AbstractC25225BEi.A0e(interfaceC74963Ym2).A02;
                    C74 c742 = (C74) AbstractC25225BEi.A0e(interfaceC74963Ym2).A04;
                    String str8 = AbstractC25225BEi.A0e(interfaceC74963Ym2).A07;
                    Number number = (Number) AbstractC25225BEi.A0e(interfaceC74963Ym2).A06;
                    if (number != null) {
                        i7 = number.intValue();
                    } else {
                        i7 = 0;
                    }
                    AbstractC28060CYo.A01(c5Tl, c74, c742, str8, (List) AbstractC25225BEi.A0e(interfaceC74963Ym2).A03, A1D, interfaceC16660sJ, A1E, A1E2, i7, 0, AbstractC25225BEi.A0e(interfaceC74963Ym2).A08);
                    if (C0fH.A02()) {
                        i3 = 80969944;
                        C0fH.A00(i3);
                    }
                    return C0eB.A00;
                }
                c5Tl.Em9();
                return C0eB.A00;
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                View view3 = (View) obj;
                MotionEvent motionEvent = (MotionEvent) obj2;
                AbstractC167017dG.A1N(view3, motionEvent);
                if (motionEvent.getAction() == 0) {
                    ((C32279EJq) this.A02).A07.A07(((RecyclerView) this.A01).A0Y(view3));
                }
                return C0eB.A00;
            case 43:
                boolean A1a2 = AbstractC166987dD.A1a(obj);
                GBV gbv = (GBV) this.A02;
                if (A1a2) {
                    View A0R = AbstractC25228BEl.A0R(this.A01);
                    UserDetailFragment userDetailFragment = gbv.A04;
                    C5SW c5sw = userDetailFragment.A0R;
                    if (c5sw == null) {
                        c5sw = AbstractC152466tZ.A01(userDetailFragment.requireActivity(), A0R, EnumC58132lV.A03, userDetailFragment.getString(2131953819), AbstractC167017dG.A0B(userDetailFragment.requireContext()), AbstractC166997dE.A0N(userDetailFragment).getDimensionPixelSize(R.dimen.action_button_min_width));
                        userDetailFragment.A0R = c5sw;
                    }
                    if (!UserDetailFragment.A0i(userDetailFragment) && c5sw != null) {
                        c5sw.A07(userDetailFragment.A0I);
                    }
                } else {
                    C9GR.A0B(gbv.A04.getContext(), AbstractC111324zv.A00(3039));
                }
                return C0eB.A00;
            case 44:
                c5Tl = (C5Tl) obj;
                if (AbstractC25228BEl.A0C(obj2) != 2 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(1327248603, "com.instagram.profile.fragment.ProfileReelTrayController.maybeShowHighlightCardNux.<anonymous>.<anonymous> (ProfileReelTrayController.kt:593)");
                    }
                    C156136zh c156136zh = (C156136zh) this.A02;
                    C5VW.A00(c5Tl, c156136zh.A0A, c156136zh.A09.getModuleName(), C5UA.A01(c5Tl, new C30189DRu(this.A01, 16), 1758953487));
                    if (C0fH.A02()) {
                        i3 = 1113272622;
                        C0fH.A00(i3);
                    }
                    return C0eB.A00;
                }
                c5Tl.Em9();
                return C0eB.A00;
            case 45:
                ((C129025sN) this.A02).A04.A06((C38321qM) this.A01);
                return C0eB.A00;
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                UserSession userSession5 = (UserSession) obj;
                InterfaceC16820sZ interfaceC16820sZ4 = (InterfaceC16820sZ) obj2;
                AbstractC167017dG.A1N(userSession5, interfaceC16820sZ4);
                RtcCallActionIntentHandlerService rtcCallActionIntentHandlerService = (RtcCallActionIntentHandlerService) this.A02;
                rtcCallActionIntentHandlerService.A00.A00(AbstractC166987dD.A0O(rtcCallActionIntentHandlerService), userSession5).A09(OPw.A00((RtcConnectionEntity) this.A01));
                interfaceC16820sZ4.invoke();
                return C0eB.A00;
            case 47:
                C51635MrS c51635MrS = (C51635MrS) obj;
                AbstractC167017dG.A1N(c51635MrS, obj2);
                ((InterfaceC74953Yl) this.A02).Egh(c51635MrS.A04);
                ((InterfaceC16620sF) this.A01).invoke(c51635MrS, obj2);
                return C0eB.A00;
            case 48:
                c5Tl = (C5Tl) obj;
                if (AbstractC25228BEl.A0B(obj2) != 2 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(235226813, "com.instagram.schools.tab.ui.SchoolTabFragment.onCreateView.<anonymous>.<anonymous> (SchoolTabFragment.kt:264)");
                    }
                    C26823Bsl c26823Bsl = (C26823Bsl) this.A02;
                    boolean A1Z9 = AbstractC25227BEk.A1Z(c5Tl, c26823Bsl, -1917345094);
                    Object EEc13 = c5Tl.EEc();
                    if (A1Z9 || EEc13 == C5UI.A00) {
                        EEc13 = AbstractC25230BEn.A0u(c5Tl, c26823Bsl, 27);
                    }
                    C117505Tk c117505Tk8 = (C117505Tk) c5Tl;
                    C117505Tk.A0L(c117505Tk8, false);
                    InterfaceC16660sJ interfaceC16660sJ2 = (InterfaceC16660sJ) ((C0YS) EEc13);
                    boolean A1Z10 = AbstractC25227BEk.A1Z(c5Tl, c26823Bsl, -1917343439);
                    Object EEc14 = c5Tl.EEc();
                    if (A1Z10 || EEc14 == C5UI.A00) {
                        EEc14 = AbstractC25230BEn.A0u(c5Tl, c26823Bsl, 28);
                    }
                    InterfaceC16660sJ A1E3 = AbstractC25228BEl.A1E(c117505Tk8, EEc14, false);
                    boolean A1Z11 = AbstractC25227BEk.A1Z(c5Tl, c26823Bsl, -1917341964);
                    Object EEc15 = c5Tl.EEc();
                    if (A1Z11 || EEc15 == C5UI.A00) {
                        EEc15 = AbstractC25230BEn.A0u(c5Tl, c26823Bsl, 29);
                    }
                    InterfaceC16660sJ A1E4 = AbstractC25228BEl.A1E(c117505Tk8, EEc15, false);
                    boolean A1Z12 = AbstractC25227BEk.A1Z(c5Tl, c26823Bsl, -1917340363);
                    Object EEc16 = c5Tl.EEc();
                    if (A1Z12 || EEc16 == C5UI.A00) {
                        EEc16 = AbstractC25230BEn.A0u(c5Tl, c26823Bsl, 30);
                    }
                    InterfaceC16660sJ A1E5 = AbstractC25228BEl.A1E(c117505Tk8, EEc16, false);
                    Object value2 = c26823Bsl.A0F.getValue();
                    boolean A1Z13 = AbstractC25227BEk.A1Z(c5Tl, value2, -1917338780);
                    Object EEc17 = c5Tl.EEc();
                    if (A1Z13 || EEc17 == C5UI.A00) {
                        EEc17 = AbstractC25230BEn.A0u(c5Tl, value2, 31);
                    }
                    InterfaceC16660sJ A1E6 = AbstractC25228BEl.A1E(c117505Tk8, EEc17, false);
                    boolean A1Z14 = AbstractC25227BEk.A1Z(c5Tl, c26823Bsl, -1917336702);
                    Object EEc18 = c5Tl.EEc();
                    if (A1Z14 || EEc18 == C5UI.A00) {
                        EEc18 = new C57753Pjg(c26823Bsl, 48);
                        c5Tl.FBy(EEc18);
                    }
                    InterfaceC16660sJ A1B = AbstractC25225BEi.A1B(c117505Tk8, EEc18, false);
                    boolean A1Z15 = AbstractC25227BEk.A1Z(c5Tl, c26823Bsl, -1917334760);
                    Object EEc19 = c5Tl.EEc();
                    if (A1Z15 || EEc19 == C5UI.A00) {
                        EEc19 = AbstractC25229BEm.A0s(c5Tl, c26823Bsl, 40);
                    }
                    InterfaceC16620sF A0w = AbstractC25235BEs.A0w(c117505Tk8, EEc19, false);
                    boolean A1Z16 = AbstractC25227BEk.A1Z(c5Tl, c26823Bsl, -1917333135);
                    Object EEc20 = c5Tl.EEc();
                    if (A1Z16 || EEc20 == C5UI.A00) {
                        EEc20 = AbstractC25229BEm.A0t(c5Tl, c26823Bsl, 49);
                    }
                    InterfaceC16820sZ A1D2 = AbstractC25228BEl.A1D(c117505Tk8, EEc20, false);
                    boolean A1Z17 = AbstractC25227BEk.A1Z(c5Tl, c26823Bsl, -1917331743);
                    Object EEc21 = c5Tl.EEc();
                    if (A1Z17 || EEc21 == C5UI.A00) {
                        EEc21 = new X30(c26823Bsl, 10);
                        c5Tl.FBy(EEc21);
                    }
                    InterfaceC16820sZ A1A = AbstractC25225BEi.A1A(c117505Tk8, EEc21, false);
                    boolean A1Z18 = AbstractC25227BEk.A1Z(c5Tl, c26823Bsl, -1917329803);
                    Object EEc22 = c5Tl.EEc();
                    if (A1Z18 || EEc22 == C5UI.A00) {
                        EEc22 = AbstractC25229BEm.A0t(c5Tl, c26823Bsl, 46);
                    }
                    InterfaceC16820sZ A1D3 = AbstractC25228BEl.A1D(c117505Tk8, EEc22, false);
                    boolean A1Z19 = AbstractC25227BEk.A1Z(c5Tl, c26823Bsl, -1917328091);
                    Object EEc23 = c5Tl.EEc();
                    if (A1Z19 || EEc23 == C5UI.A00) {
                        EEc23 = new X30(c26823Bsl, 8);
                        c5Tl.FBy(EEc23);
                    }
                    InterfaceC16820sZ A1A2 = AbstractC25225BEi.A1A(c117505Tk8, EEc23, false);
                    boolean A1Z20 = AbstractC25227BEk.A1Z(c5Tl, c26823Bsl, -1917325718);
                    Object EEc24 = c5Tl.EEc();
                    if (A1Z20 || EEc24 == C5UI.A00) {
                        EEc24 = new X30(c26823Bsl, 9);
                        c5Tl.FBy(EEc24);
                    }
                    InterfaceC16820sZ A1A3 = AbstractC25225BEi.A1A(c117505Tk8, EEc24, false);
                    boolean A1Z21 = AbstractC25227BEk.A1Z(c5Tl, c26823Bsl, -1917323204);
                    Object EEc25 = c5Tl.EEc();
                    if (A1Z21 || EEc25 == C5UI.A00) {
                        EEc25 = new BIE(c26823Bsl, 47);
                        c5Tl.FBy(EEc25);
                    }
                    InterfaceC16820sZ A1D4 = AbstractC25228BEl.A1D(c117505Tk8, EEc25, false);
                    boolean A1Z22 = AbstractC25227BEk.A1Z(c5Tl, c26823Bsl, -1917321091);
                    Object EEc26 = c5Tl.EEc();
                    if (A1Z22 || EEc26 == C5UI.A00) {
                        EEc26 = AbstractC25229BEm.A0t(c5Tl, c26823Bsl, 48);
                    }
                    InterfaceC16820sZ A0y2 = AbstractC25227BEk.A0y(c117505Tk8, EEc26);
                    InterfaceC74963Ym interfaceC74963Ym3 = (InterfaceC74963Ym) this.A01;
                    AbstractC28508Ci2.A05(c5Tl, ((C51725Mt2) interfaceC74963Ym3.getValue()).A00, ((C51725Mt2) interfaceC74963Ym3.getValue()).A01, ((C51725Mt2) interfaceC74963Ym3.getValue()).A03, ((C51725Mt2) interfaceC74963Ym3.getValue()).A04, A1D2, A1A, A1D3, A1A2, A1A3, A1D4, A0y2, interfaceC16660sJ2, A1E3, A1E4, A1E5, A1E6, A1B, A0w, ((C51725Mt2) interfaceC74963Ym3.getValue()).A05, 0, 0, 0, ((C51725Mt2) interfaceC74963Ym3.getValue()).A08, C18U.A06(C06090Tz.A05, AbstractC25230BEn.A0k(c26823Bsl.A0B, 0), 36324685906719121L), AbstractC167007dF.A1Z(c26823Bsl.A06), AbstractC167007dF.A1Z(c26823Bsl.A0C));
                    if (C0fH.A02()) {
                        i3 = -1126385697;
                        C0fH.A00(i3);
                    }
                    return C0eB.A00;
                }
                c5Tl.Em9();
                return C0eB.A00;
            default:
                c5Tl = (C5Tl) obj;
                if (AbstractC25228BEl.A0B(obj2) != 2 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(-1635402838, "com.instagram.settings2.core.view.SettingsScreenFragment.onCreateView.<anonymous> (SettingsScreenFragment.kt:143)");
                    }
                    C50685MZd c50685MZd = (C50685MZd) this.A02;
                    C45119Jxo c45119Jxo = (C45119Jxo) AbstractC25235BEs.A0l(c5Tl, C50685MZd.A00(c50685MZd).A0K, 0);
                    C51752Mtb c51752Mtb = (C51752Mtb) c45119Jxo.A01;
                    C1130158n c1130158n3 = Modifier.A00;
                    C5Hb c5Hb = null;
                    Modifier A0U2 = AbstractC25226BEj.A0U(c1130158n3);
                    InterfaceC1127857k A0Y = AbstractC25229BEm.A0Y(c5Tl, 0);
                    int A0014 = C5X2.A00(c5Tl);
                    C117505Tk c117505Tk9 = (C117505Tk) c5Tl;
                    C59P A047 = C117505Tk.A04(c117505Tk9);
                    Modifier A0112 = C5X3.A01(c5Tl, A0U2);
                    AbstractC25233BEq.A11(c5Tl, c117505Tk9);
                    AbstractC25231BEo.A12(c5Tl, A0Y, A047);
                    InterfaceC16620sF interfaceC16620sF8 = C5X8.A02;
                    if (c117505Tk9.A0K || !AbstractC25231BEo.A1O(c5Tl, A0014)) {
                        AbstractC25231BEo.A15(c5Tl, interfaceC16620sF8, A0014);
                    }
                    AbstractC25225BEi.A1K(c5Tl, A0112);
                    C25707BXs c25707BXs = new C25707BXs(null, 7, 0);
                    Context requireContext = c50685MZd.requireContext();
                    C51759Mti c51759Mti = (C51759Mti) c45119Jxo.A05;
                    C14360o3.A0B(c51759Mti, 1);
                    String str9 = AbstractC25703BXn.A00(AbstractC166997dE.A0M(requireContext), c51759Mti).toString();
                    Modifier A0y3 = AbstractC25232BEp.A0y(c5Tl, c1130158n3);
                    c5Tl.Eno(-196911402);
                    if (c51752Mtb != null) {
                        C2DC A0015 = C5Y7.A00(c5Tl, c51752Mtb.A01, 0);
                        String string = c50685MZd.requireContext().getString(c51752Mtb.A00);
                        boolean A1W5 = AbstractC25233BEq.A1W(c5Tl, c50685MZd, c51752Mtb, -196900157);
                        Object EEc27 = c5Tl.EEc();
                        if (A1W5 || EEc27 == C5UI.A00) {
                            EEc27 = new C57252Pba(29, c51752Mtb, c50685MZd);
                            c5Tl.FBy(EEc27);
                        }
                        c5Hb = C26184Bi9.A00(A0015, string, AbstractC25225BEi.A1A(c117505Tk9, EEc27, false));
                    }
                    C117505Tk.A0L(c117505Tk9, false);
                    AbstractC25708BXt.A02(c5Tl, A0y3, c25707BXs, str9, c5Hb, 6, 24);
                    boolean A1Z23 = AbstractC25227BEk.A1Z(c5Tl, c50685MZd, -196893802);
                    Object EEc28 = c5Tl.EEc();
                    if (A1Z23 || EEc28 == C5UI.A00) {
                        EEc28 = C30482DbR.A00(c50685MZd, 9);
                        c5Tl.FBy(EEc28);
                    }
                    InterfaceC16620sF A1C3 = AbstractC25225BEi.A1C(c117505Tk9, EEc28);
                    C25710BXv c25710BXv = new C25710BXv(c50685MZd);
                    C25712BXx c25712BXx = new C25712BXx(c50685MZd);
                    boolean A1Z24 = AbstractC25227BEk.A1Z(c5Tl, c50685MZd, -196863336);
                    Object EEc29 = c5Tl.EEc();
                    if (A1Z24 || EEc29 == C5UI.A00) {
                        EEc29 = C30482DbR.A00(c50685MZd, 10);
                        c5Tl.FBy(EEc29);
                    }
                    InterfaceC16620sF A1C4 = AbstractC25225BEi.A1C(c117505Tk9, EEc29);
                    boolean A1Z25 = AbstractC25227BEk.A1Z(c5Tl, c50685MZd, -196858747);
                    Object EEc30 = c5Tl.EEc();
                    if (A1Z25 || EEc30 == C5UI.A00) {
                        EEc30 = new JEZ(c50685MZd, 31);
                        c5Tl.FBy(EEc30);
                    }
                    InterfaceC16660sJ A1B2 = AbstractC25225BEi.A1B(c117505Tk9, EEc30, false);
                    C25711BXw c25711BXw = new C25711BXw(c50685MZd);
                    boolean A1Z26 = AbstractC25227BEk.A1Z(c5Tl, c50685MZd, -196841561);
                    Object EEc31 = c5Tl.EEc();
                    if (A1Z26 || EEc31 == C5UI.A00) {
                        EEc31 = new JEZ(c50685MZd, 32);
                        c5Tl.FBy(EEc31);
                    }
                    AbstractC25709BXu.A01(c5Tl, c45119Jxo, c25710BXv, c25712BXx, c25711BXw, C50685MZd.A00(c50685MZd), A1B2, AbstractC25225BEi.A1B(c117505Tk9, EEc31, false), A1C3, A1C4, 0);
                    if (AbstractC25227BEk.A1R(c5Tl)) {
                        i3 = 496205762;
                        C0fH.A00(i3);
                    }
                    return C0eB.A00;
                }
                c5Tl.Em9();
                return C0eB.A00;
        }
    }
}
