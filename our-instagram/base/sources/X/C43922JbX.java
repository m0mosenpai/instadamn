package X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.forker.Process;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.ui.widget.gallery.GalleryView;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.JbX, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43922JbX extends C2AH {
    public final int A00;
    public final Object A01;

    public static Object A00(C43922JbX c43922JbX, Object obj) {
        C14360o3.A0B(obj, 0);
        return c43922JbX.A01;
    }

    public C43922JbX(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A01(C121275eQ c121275eQ, Object obj, int i) {
        c121275eQ.A00 = new C43922JbX(obj, i);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0003. Please report as an issue. */
    @Override // X.C2AH
    public final void onFail(Exception exc) {
        Context context;
        Context context2;
        int i;
        String str;
        String str2;
        switch (this.A00) {
            case 1:
            case 3:
                return;
            case 2:
                L8D l8d = (L8D) A00(this, exc);
                UserSession userSession = l8d.A09;
                AbstractC73317Y7a.A0H(l8d.A07, userSession, userSession.userId, "self_profile_nametag_view", "download_qr_code", exc);
                context = l8d.A03;
                str2 = "SAVE_QR_CODE_error";
                C9GR.A0A(context, str2);
                return;
            case 4:
                context2 = (Context) this.A01;
                i = 2131972759;
                str = "ify_save_media_failed_toast";
                C9GR.A0F(context2, str, i);
                return;
            case 5:
                ((InterfaceC50447MPb) A00(this, exc)).onFailure(exc);
                return;
            case 6:
                InterfaceC25207BDf interfaceC25207BDf = (InterfaceC25207BDf) A00(this, exc);
                if (interfaceC25207BDf == null) {
                    return;
                }
                interfaceC25207BDf.DFi(exc);
                return;
            case 7:
            case 8:
            case 14:
            default:
                super.onFail(exc);
                return;
            case 9:
                C14360o3.A0B(exc, 0);
                KCT kct = (KCT) this.A01;
                if (!kct.A06) {
                    return;
                }
                InterfaceC09390do interfaceC09390do = kct.A0O;
                C49632Pw A00 = AbstractC49622Pv.A00(AbstractC166987dD.A0r(interfaceC09390do));
                String message = exc.getMessage();
                if (message == null) {
                    message = "";
                }
                A00.A00 = A00.A04.A07(message, "", 17642674, A00.A00);
                C43822JZk A002 = AbstractC208269Jl.A00(AbstractC166987dD.A0r(interfaceC09390do));
                String message2 = exc.getMessage();
                C0J8.A01();
                C24Q c24q = A002.A04;
                long j = A002.A00;
                if (message2 == null) {
                    message2 = "gallery_items_load_failed";
                }
                A002.A00 = c24q.A07(message2, "", 585177486, j);
                kct.A06 = false;
                return;
            case 10:
                C14360o3.A0B(exc, 0);
                Context context3 = ((AnonymousClass983) this.A01).A02;
                if (context3 == null) {
                    C14360o3.A0F("context");
                    throw C00O.createAndThrow();
                }
                C9GR.A00(context3, context3.getResources().getString(2131960454), "direct_share_photo_failure", 0);
                C0w9.A03("DirectThreadToggleController", "Unable to parse photo uri.");
                return;
            case 11:
                C14360o3.A0B(exc, 0);
                L3P l3p = (L3P) this.A01;
                l3p.A04.hide();
                if ((exc instanceof IOException) && (exc.getCause() instanceof IllegalArgumentException)) {
                    Context context4 = l3p.A00;
                    C9GR.A00(context4, AbstractC31177DnL.A0a(context4, 1024, 2131957369), "user_input_error", 0);
                    return;
                } else {
                    C9GR.A0E(l3p.A00, "network_error");
                    return;
                }
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                C14360o3.A0B(exc, 0);
                ((JR2) this.A01).A1A = false;
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                C14360o3.A0B(exc, 0);
                ((JR2) this.A01).A1B = false;
                return;
            case Process.SIGTERM /* 15 */:
                C42090Ikx c42090Ikx = (C42090Ikx) A00(this, exc);
                C11T.A03(new RunnableC49896M1p(c42090Ikx));
                UserSession userSession2 = c42090Ikx.A0A;
                InterfaceC60442pS interfaceC60442pS = c42090Ikx.A0F;
                String id = c42090Ikx.A0E.getId();
                if (id != null) {
                    AbstractC73317Y7a.A0H(interfaceC60442pS, userSession2, id, "feed_action_sheet", "nametag", exc);
                    return;
                }
                throw AbstractC166997dE.A0g();
            case 16:
                context = ((C47773L7v) this.A01).A01;
                str2 = "save_profile_card_error";
                C9GR.A0A(context, str2);
                return;
            case 17:
                C55908Orz c55908Orz = (C55908Orz) this.A01;
                C55908Orz.A02(c55908Orz);
                context = c55908Orz.A02;
                str2 = "save_error";
                C9GR.A0A(context, str2);
                return;
            case 18:
                L5I l5i = ((C47936LFk) this.A01).A00;
                C47777L8c c47777L8c = l5i.A04;
                if (c47777L8c != null) {
                    c47777L8c.A00();
                }
                context2 = l5i.A00;
                if (l5i.A06.equals(EnumC40111tc.A0a)) {
                    i = 2131962086;
                    str = "failed_to_load_video_toast";
                } else {
                    i = 2131962085;
                    str = "failed_to_load_photo_toast";
                }
                C9GR.A0F(context2, str, i);
                return;
            case Process.SIGSTOP /* 19 */:
                C2AH c2ah = ((GalleryView) A00(this, exc)).A08;
                if (c2ah == null) {
                    return;
                }
                c2ah.onFail(exc);
                return;
            case 20:
                context2 = (Context) this.A01;
                i = 2131971215;
                str = "qr_unable_to_save_nametag_general_toast";
                C9GR.A0F(context2, str, i);
                return;
            case 21:
                context = ((LLI) this.A01).A04;
                str2 = "SAVE_QR_CODE_error";
                C9GR.A0A(context, str2);
                return;
        }
    }

    @Override // X.C2AH, X.C11R
    public final void onFinish() {
        switch (this.A00) {
            case 6:
                InterfaceC25207BDf interfaceC25207BDf = (InterfaceC25207BDf) this.A01;
                if (interfaceC25207BDf == null) {
                    return;
                }
                interfaceC25207BDf.onFinish();
                return;
            case 18:
                return;
            case Process.SIGSTOP /* 19 */:
                C2AH c2ah = ((GalleryView) this.A01).A08;
                if (c2ah == null) {
                    return;
                }
                c2ah.onFinish();
                return;
            default:
                super.onFinish();
                return;
        }
    }

    @Override // X.C2AH, X.C11R
    public final void onStart() {
        switch (this.A00) {
            case 2:
            case 16:
            case 21:
                return;
            case 6:
                InterfaceC25207BDf interfaceC25207BDf = (InterfaceC25207BDf) this.A01;
                if (interfaceC25207BDf == null) {
                    return;
                }
                interfaceC25207BDf.onStart();
                return;
            case 9:
                KCT kct = (KCT) this.A01;
                if (kct.A06) {
                    return;
                }
                C49632Pw A00 = AbstractC49622Pv.A00(AbstractC166987dD.A0r(kct.A0O));
                String str = kct.A05;
                if (str == null) {
                    str = "";
                }
                long A01 = C18U.A01(C06090Tz.A06, A00.A05, 36601900275143043L) * 1000;
                C24Q c24q = A00.A04;
                long A03 = c24q.A03(17642674, A01);
                A00.A00 = A03;
                c24q.A09(A03, TraceFieldType.TransportType, str);
                kct.A06 = true;
                return;
            case 18:
                C47777L8c c47777L8c = ((C47936LFk) this.A01).A00.A04;
                if (c47777L8c == null) {
                    return;
                }
                c47777L8c.A01();
                return;
            case Process.SIGSTOP /* 19 */:
                C2AH c2ah = ((GalleryView) this.A01).A08;
                if (c2ah == null) {
                    return;
                }
                c2ah.onStart();
                return;
            default:
                super.onStart();
                return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r0v55, types: [X.0bW, java.lang.Object] */
    @Override // X.C2AH
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        Context context;
        int i;
        C43939Jbo A0v;
        String str;
        AnonymousClass195 anonymousClass195;
        int i2;
        String str2;
        int i3;
        String str3;
        C55057OaC c55057OaC;
        int i4;
        String str4;
        Long l;
        switch (this.A00) {
            case 0:
                File file = (File) obj;
                C14360o3.A0B(file, 0);
                try {
                    L2J l2j = (L2J) this.A01;
                    C1825187q c1825187q = l2j.A01;
                    String canonicalPath = file.getCanonicalPath();
                    C14360o3.A07(canonicalPath);
                    c1825187q.A02.A01(0, canonicalPath, false);
                    c1825187q.A00.A0B(new C8A8(AbstractC166997dE.A0b()));
                    JSONObject jSONObject = (JSONObject) l2j.A03.getValue();
                    C14360o3.A0B(jSONObject, 0);
                    c1825187q.A01.A00().A0A(jSONObject);
                    return;
                } catch (IOException unused) {
                    AbstractC166987dD.A1T(C18950wb.A01, "GreenscreenGifPicker: Error getting downloaded GIF", 245701013);
                    return;
                }
            case 1:
                C195868lW c195868lW = (C195868lW) obj;
                C14360o3.A0B(c195868lW, 0);
                C1825187q c1825187q2 = (C1825187q) this.A01;
                c1825187q2.A02.A01(c195868lW.A09, c195868lW.A0k, false);
                c1825187q2.A00.A0B(new C8A8(AbstractC166997dE.A0b()));
                return;
            case 2:
                boolean A1a = AbstractC166987dD.A1a(obj);
                L8D l8d = (L8D) this.A01;
                Context context2 = l8d.A03;
                if (A1a) {
                    i3 = 2131972790;
                    str3 = null;
                } else {
                    i3 = 2131961880;
                    str3 = "SAVE_QR_CODE result is null";
                }
                C9GR.A0F(context2, str3, i3);
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(l8d.A08, "ig_qr_code_download");
                if (!A0f.isSampled()) {
                    return;
                }
                A0f.AAP("color", "na");
                A0f.A9K("entity_id", AbstractC167007dF.A0d());
                A0f.AAP(CacheBehaviorLogger.SOURCE, l8d.A07.getModuleName());
                A0f.Cht();
                return;
            case 3:
                AbstractC50633MWu.A09((Context) this.A01, AbstractC166997dE.A0Z(obj));
                return;
            case 4:
                File A0Z = AbstractC166997dE.A0Z(obj);
                context = (Context) this.A01;
                AbstractC50633MWu.A09(context, A0Z);
                i = 2131972761;
                C9GR.A07(context, i);
                return;
            case 5:
                ((InterfaceC50447MPb) this.A01).DqF(AbstractC25228BEl.A1C(obj));
                return;
            case 6:
                String A0Q = AbstractC167027dH.A0Q(obj);
                InterfaceC25207BDf interfaceC25207BDf = (InterfaceC25207BDf) this.A01;
                if (interfaceC25207BDf == null) {
                    return;
                }
                interfaceC25207BDf.DqC(A0Q);
                return;
            case 7:
                File file2 = (File) obj;
                C14360o3.A0B(file2, 0);
                AbstractC25225BEi.A1U(this.A01, C8IU.A03(file2, 3, 0));
                return;
            case 8:
                C5e4 c5e4 = (C5e4) obj;
                c5e4.A05(AbstractC31171DnF.A0g(A00(this, c5e4)));
                return;
            case 9:
                KCT kct = (KCT) this.A01;
                if (!kct.A06) {
                    return;
                }
                InterfaceC09390do interfaceC09390do = kct.A0O;
                C49632Pw A00 = AbstractC49622Pv.A00(AbstractC166987dD.A0r(interfaceC09390do));
                A00.A00 = A00.A04.A02(17642674, A00.A00);
                LI5.A00(C45820KPz.A00, AbstractC46750Km7.A00(AbstractC166987dD.A0r(interfaceC09390do)));
                AbstractC208269Jl.A00(AbstractC166987dD.A0r(interfaceC09390do)).A02();
                kct.A06 = false;
                return;
            case 10:
                C183978Ee c183978Ee = (C183978Ee) obj;
                AnonymousClass983 anonymousClass983 = (AnonymousClass983) A00(this, c183978Ee);
                if (!AnonymousClass983.A01(anonymousClass983).A0V(null, "DirectThreadFragment.sendPhotoMessage")) {
                    return;
                }
                AnonymousClass983.A01(anonymousClass983).A0J().A02(null, anonymousClass983.A10, null, null, c183978Ee, null, null, null);
                return;
            case 11:
                String str5 = (String) obj;
                C14360o3.A0B(str5, 0);
                L3P l3p = (L3P) this.A01;
                C25621Ms A0M = AbstractC31177DnL.A0M(l3p.A02);
                A0M.A0B("direct_v2/threads/customized_theme_preview/");
                A0M.A0R(K8D.class, LCP.class);
                C1ON A0T = AbstractC31172DnG.A0T(A0M, "theme_image_fbid", str5);
                A0T.A00 = new C45551KEq(str5, l3p, 2);
                C1GJ.A06(A0T, A0T.A04.runnableId, 2, false, false);
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                C65911TwI c65911TwI = (C65911TwI) obj;
                C14360o3.A0B(c65911TwI, 0);
                JR2 jr2 = (JR2) this.A01;
                jr2.A0J = c65911TwI;
                UserSession A0p = jr2.A0p();
                if (!C18U.A06(AbstractC166997dE.A0U(A0p), A0p, 36324767511359945L)) {
                    JR2.A0P(jr2);
                }
                jr2.A1A = false;
                A0v = jr2.A0v();
                str = "init_ai_agent_end";
                A0v.A0E(str);
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                C5e4 c5e42 = (C5e4) obj;
                C14360o3.A0B(c5e42, 0);
                JR2 jr22 = (JR2) this.A01;
                jr22.A0K = c5e42;
                if (C5e4.A02) {
                    C14120nc.A00().ATO(new C31592DuK(jr22, JR2.A00(jr22)));
                }
                C43766JXf c43766JXf = (C43766JXf) jr22.A2P.getValue();
                if (c43766JXf != null) {
                    C92904Eg c92904Eg = C43766JXf.A00(c43766JXf).A04;
                    UserSession userSession = c92904Eg.A04;
                    if (C4AC.A01(userSession) && C18U.A06(C06090Tz.A05, userSession, 36327486225398387L) && ((anonymousClass195 = c92904Eg.A02) == null || !anonymousClass195.isActive())) {
                        c92904Eg.A02 = AbstractC25226BEj.A1L(new C9D0(c92904Eg, c5e42, (InterfaceC23621Ds) null, 42), ((C4A7) c92904Eg).A01);
                    }
                }
                jr22.A1B = false;
                A0v = jr22.A0v();
                str = "init_banyan_end";
                A0v.A0E(str);
                return;
            case 14:
                C65911TwI c65911TwI2 = (C65911TwI) obj;
                ((ViewOnClickListenerC66108Tzj) A00(this, c65911TwI2)).A00 = c65911TwI2;
                return;
            case Process.SIGTERM /* 15 */:
                C47665L2y c47665L2y = (C47665L2y) obj;
                C11T.A03(new M4W((C42090Ikx) A00(this, c47665L2y), c47665L2y));
                return;
            case 16:
                File file3 = (File) obj;
                if (file3 != null) {
                    i2 = 2131972790;
                    str2 = null;
                    C47773L7v c47773L7v = (C47773L7v) this.A01;
                    UserSession userSession2 = c47773L7v.A03;
                    AbstractC73317Y7a.A0K(c47773L7v.A02, userSession2, userSession2.userId, AbstractC111324zv.A00(2916), c47773L7v.A05, "");
                    if (C18U.A06(C06090Tz.A05, userSession2, 36327335901477382L)) {
                        Bundle A0b = AbstractC166987dD.A0b();
                        String str6 = c47773L7v.A04;
                        A0b.putString("android.intent.extra.TEXT", str6);
                        Context context3 = c47773L7v.A01;
                        HashMap hashMap = C58331PtP.A06;
                        AbstractC31510Dsu.A0N(context3, C58331PtP.A01(context3, null, new Object()).A04(file3), A0b, new LXQ(), userSession2, null, "share_to_system_sheet", new HashMap(AbstractC06930Yk.A07(AbstractC166987dD.A1L("android.intent.extra.TEXT", str6))), true, false);
                        return;
                    }
                } else {
                    i2 = 2131961880;
                    str2 = "save_profile_card_error result is null";
                }
                C9GR.A0F(((C47773L7v) this.A01).A01, str2, i2);
                return;
            case 17:
                File file4 = (File) obj;
                C14360o3.A0B(file4, 0);
                C55908Orz c55908Orz = (C55908Orz) this.A01;
                C55908Orz.A02(c55908Orz);
                C38321qM c38321qM = c55908Orz.A08;
                if (c38321qM != null) {
                    JQ0.A1P(AbstractC43592JPx.A0x(file4), c55908Orz.A07, c38321qM);
                }
                Context context4 = c55908Orz.A02;
                AbstractC50633MWu.A09(context4, file4);
                C9GR.A01(context4, "save_error", 2131972833, 0);
                return;
            case 18:
                File A0Z2 = AbstractC166997dE.A0Z(obj);
                C47936LFk c47936LFk = (C47936LFk) this.A01;
                c47936LFk.A00.A08 = A0Z2.getCanonicalPath();
                c47936LFk.A01();
                return;
            case Process.SIGSTOP /* 19 */:
                C189368aD c189368aD = (C189368aD) obj;
                GalleryView galleryView = (GalleryView) A00(this, c189368aD);
                List list = c189368aD.A01;
                ArrayList A1E = AbstractC166987dD.A1E();
                C55057OaC c55057OaC2 = new C55057OaC(AbstractC166997dE.A0p(galleryView.getContext(), 2131958733));
                HashMap A1G = AbstractC166987dD.A1G();
                Iterator it = list.iterator();
                while (true) {
                    C55057OaC c55057OaC3 = null;
                    if (it.hasNext()) {
                        Medium medium = (Medium) it.next();
                        c55057OaC2.A02.add(new GalleryItem.LocalGalleryMedium(medium, String.valueOf(medium.A05)));
                        String str7 = medium.A0O;
                        if (A1G.containsKey(str7)) {
                            c55057OaC = (C55057OaC) A1G.get(str7);
                            if (c55057OaC != null) {
                                c55057OaC.A02.add(new GalleryItem.LocalGalleryMedium(medium, String.valueOf(medium.A05)));
                            }
                        } else if (str7 != null) {
                            c55057OaC = new C55057OaC(str7);
                            A1G.put(str7, c55057OaC);
                            c55057OaC.A02.add(new GalleryItem.LocalGalleryMedium(medium, String.valueOf(medium.A05)));
                        }
                    } else {
                        A1E.add(c55057OaC2);
                        A1E.addAll(A1G.values());
                        C44420JkF c44420JkF = galleryView.A0C;
                        if (c44420JkF != null) {
                            c44420JkF.A03(A1E);
                        }
                        MPK mpk = galleryView.A0E;
                        if (mpk != null) {
                            C44420JkF c44420JkF2 = galleryView.A0C;
                            if (c44420JkF2 != null) {
                                c55057OaC3 = c44420JkF2.A00;
                            }
                            mpk.DIu(c55057OaC3, A1E);
                        }
                        GalleryView.A07(galleryView);
                        C2AH c2ah = galleryView.A08;
                        if (c2ah == null) {
                            return;
                        }
                        c2ah.onSuccess(c189368aD);
                        return;
                    }
                }
            case 20:
                if (!AbstractC166987dD.A1a(obj)) {
                    return;
                }
                context = (Context) this.A01;
                i = 2131968162;
                C9GR.A07(context, i);
                return;
            default:
                boolean A1a2 = AbstractC166987dD.A1a(obj);
                LLI lli = (LLI) this.A01;
                Context context5 = lli.A04;
                if (A1a2) {
                    i4 = 2131972790;
                    str4 = null;
                } else {
                    i4 = 2131961880;
                    str4 = "SAVE_QR_CODE result is null";
                }
                C9GR.A01(context5, str4, i4, 0);
                InterfaceC02590Ai A0f2 = AbstractC166987dD.A0f(lli.A07, "ig_qr_code_download");
                if (A0f2.isSampled() && (l = lli.A0E) != null) {
                    A0f2.AAP("color", StringFormatUtil.formatStrLocaleSafe("#%06X", Integer.valueOf(16777215 & lli.A03.A02[0])));
                    long longValue = l.longValue();
                    if (lli.A0I) {
                        longValue = 0;
                    }
                    A0f2.A9K("entity_id", Long.valueOf(longValue));
                    A0f2.AAP(CacheBehaviorLogger.SOURCE, lli.A06.getModuleName());
                    A0f2.Cht();
                }
                MPL mpl = lli.A0A;
                if (mpl != null) {
                    mpl.Di0();
                    return;
                }
                return;
        }
    }
}
