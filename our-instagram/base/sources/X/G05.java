package X;

import android.os.SystemClock;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectShareTargetLoggingInfo;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public final class G05 implements InterfaceC13050lr {
    public long A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public boolean A0C;
    public boolean A0D;
    public final InterfaceC11380iw A0E;
    public final C006802i A0F;
    public final C18920wW A0G;
    public final UserSession A0H;
    public final C34548FKi A0I;
    public final Map A0J;
    public final Map A0K;
    public final Map A0L;
    public final Map A0M;
    public final Map A0N;
    public final Map A0O;
    public final Map A0P;
    public final boolean A0Q;
    public final boolean A0R;
    public final boolean A0S;

    public G05(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        AbstractC167007dF.A1D(userSession, 1, interfaceC11380iw);
        this.A0S = C18U.A06(C06090Tz.A05, userSession, 36312870450955636L);
        C006802i c006802i = C006802i.A0p;
        C14360o3.A07(c006802i);
        this.A0F = c006802i;
        this.A0I = (C34548FKi) userSession.A01(C34548FKi.class, new MHR(userSession, 49));
        this.A0G = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
        this.A00 = -1L;
        this.A0H = userSession;
        this.A0E = interfaceC11380iw;
        this.A0D = true;
        this.A0A = AbstractC167017dG.A0j();
        this.A0K = new C71665WyH();
        this.A0L = new C71665WyH();
        this.A0O = new C71665WyH();
        this.A0P = new C71665WyH();
        this.A0N = new C71665WyH();
        this.A0J = new C71665WyH();
        this.A0M = new C71665WyH();
        this.A0R = AbstractC167007dF.A1W(this.A0B);
        this.A0Q = this.A09 != null;
    }

    public static void A01(InterfaceC02590Ai interfaceC02590Ai, G05 g05, DirectShareTarget directShareTarget, int i) {
        interfaceC02590Ai.AAP("query_session_id", g05.A0A);
        interfaceC02590Ai.A8R(AbstractC35248Fgh.A03(i, true), "ui_section");
        interfaceC02590Ai.AAk("data_sources", AbstractC35248Fgh.A06(directShareTarget.A08));
        interfaceC02590Ai.AAP("sub_query_session_id", g05.A09);
    }

    public static void A03(C0Zx c0Zx, G05 g05, DirectShareTarget directShareTarget) {
        Integer A04 = directShareTarget.A04(g05.A0H.userId, false);
        C14360o3.A07(A04);
        c0Zx.A01(AbstractC35248Fgh.A01(A04), "result_type");
    }

    public final void A0A(EnumC33491ErQ enumC33491ErQ, InterfaceC11380iw interfaceC11380iw, UserSession userSession, DirectShareTarget directShareTarget, String str, String str2, String str3, String str4, String str5, int i, long j, long j2, long j3, boolean z) {
        Map map;
        C25531Mh A00;
        C83693oE A02;
        Double d;
        C14360o3.A0B(userSession, 0);
        AbstractC167007dF.A1I(directShareTarget, 1, enumC33491ErQ);
        C14360o3.A0B(interfaceC11380iw, 11);
        if (this.A0C) {
            int ordinal = enumC33491ErQ.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1 && ordinal != 3) {
                    if (ordinal != 2 && ordinal != 4) {
                        return;
                    }
                    if (this.A0R) {
                        this.A0P.put(directShareTarget, A00(enumC33491ErQ, userSession, directShareTarget, str, str2, str3, i, j, j2, j3));
                    }
                    if (this.A09 == null || str4 == null || !C18U.A06(AbstractC166997dE.A0U(userSession), userSession, 36328409642581497L)) {
                        return;
                    }
                    map = this.A0N;
                    C25531Mh A0A = AbstractC31171DnF.A0A(AbstractC166987dD.A0f(this.A0G, "share_sheet_search_impressions"), 377);
                    A00 = null;
                    r1 = null;
                    String str6 = null;
                    if (AbstractC25226BEj.A1Z(A0A)) {
                        C0Zx c0Zx = new C0Zx();
                        c0Zx.A06("query_string", str4);
                        AbstractC31176DnK.A1N(c0Zx, j2);
                        A03(c0Zx, this, directShareTarget);
                        A0A.A0N(c0Zx, "search_result");
                        A0A.A0R("query_session_id", this.A0A);
                        A0A.A0M(AbstractC35248Fgh.A03(i, true), "ui_section");
                        A0A.A0S("data_sources", AbstractC35248Fgh.A06(directShareTarget.A08));
                        A0A.A0O("impression_selected", Boolean.valueOf(z));
                        A0A.A0R("sub_query_session_id", this.A09);
                        A0A.A0Q("query_length", AbstractC31171DnF.A0V(str4.length()));
                        A0A.A0Q("ui_section_index", Long.valueOf(j));
                        if (str5 != null) {
                            C32019E4v A002 = C32019E4v.A00(str5);
                            DirectShareTargetLoggingInfo directShareTargetLoggingInfo = directShareTarget.A08;
                            if (directShareTargetLoggingInfo != null && (d = directShareTargetLoggingInfo.A01) != null) {
                                A002.A04("final_score", d);
                            }
                            A0A.A0N(A002, "mnet_request");
                        }
                        A0A.A0M(AbstractC35248Fgh.A02(AbstractC31179DnN.A0P(directShareTarget)), TraceFieldType.TransportType);
                        InterfaceC83733oI A05 = AbstractC140946Yw.A05(AbstractC31171DnF.A0O(directShareTarget));
                        if (A05 != null && (A02 = AbstractC1345466e.A02(A05)) != null) {
                            str6 = A02.A00;
                        }
                        A0A.A0R(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str6);
                        A0A.A0S("recipient_id", directShareTarget.A0C());
                        A00 = A0A;
                    }
                    map.put(directShareTarget, A00);
                }
                if (!this.A0R) {
                    return;
                } else {
                    map = this.A0O;
                }
            } else {
                map = this.A0K;
            }
            A00 = A00(enumC33491ErQ, userSession, directShareTarget, str, str2, str3, i, j, j2, j3);
            map.put(directShareTarget, A00);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, X.1Mh, X.0Aj] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.List] */
    public final void A0B(EnumC33491ErQ enumC33491ErQ, UserSession userSession, DirectShareTarget directShareTarget, EnumC40111tc enumC40111tc, String str, String str2, String str3, String str4, int i, long j, long j2, boolean z) {
        String str5;
        ?? A1E;
        EnumC33471Er6 enumC33471Er6;
        Long l;
        AbstractC25229BEm.A1I(userSession, 0, str2);
        if (this.A0C || this.A0R) {
            ?? A0A = AbstractC31171DnF.A0A(AbstractC166987dD.A0f(this.A0G, "direct_share_media"), 149);
            if (AbstractC25226BEj.A1Z(A0A)) {
                A0A.A0R(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str2);
                A0A.A0R("share_sheet_session_id", this.A0A);
                if (str == null) {
                    str = this.A0B;
                }
                A0A.A0R("query_session_id", str);
                A0A.A0M(enumC33491ErQ, "sheet_state");
                InterfaceC83713oG A0O = AbstractC31171DnF.A0O(directShareTarget);
                if (A0O instanceof C83693oE) {
                    str5 = ((C83693oE) A0O).A00;
                } else {
                    str5 = null;
                }
                A0A.A0R(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str5);
                if (AbstractC31172DnG.A18(directShareTarget).isEmpty()) {
                    Long A0j = AbstractC25231BEo.A0j(0, userSession.userId);
                    if (A0j != null) {
                        C0Zx c0Zx = new C0Zx();
                        c0Zx.A05("recipient_id", A0j);
                        c0Zx.A01(EnumC33471Er6.INSTAGRAM, "interop_user_type");
                        A1E = AbstractC166987dD.A1J(c0Zx);
                    } else {
                        A1E = C16930sl.A00;
                    }
                } else {
                    A1E = AbstractC166987dD.A1E();
                    Iterator A13 = AbstractC31174DnI.A13(directShareTarget.A0Q);
                    while (A13.hasNext()) {
                        PendingRecipient A0p = AbstractC31172DnG.A0p(A13);
                        Long A0j2 = AbstractC166997dE.A0j(A0p.getId());
                        if (A0j2 != null) {
                            C0Zx c0Zx2 = new C0Zx();
                            c0Zx2.A05("recipient_id", A0j2);
                            if (A0p.A01 == 0) {
                                enumC33471Er6 = EnumC33471Er6.INSTAGRAM;
                            } else {
                                enumC33471Er6 = EnumC33471Er6.FACEBOOK;
                            }
                            c0Zx2.A01(enumC33471Er6, "interop_user_type");
                            A1E.add(c0Zx2);
                        }
                    }
                }
                A0A.A0S("recipient_info", A1E);
                A0A.A0R("section_type", AbstractC34051F1e.A00(i));
                if (enumC40111tc != null) {
                    l = AbstractC31171DnF.A0V(enumC40111tc.A00);
                } else {
                    l = null;
                }
                A0A.A0Q("media_type", l);
                A0A.A0R(TraceFieldType.RequestID, str3);
                A0A.A0Q("relative_position", Long.valueOf(j));
                A0A.A0Q("position", Long.valueOf(j2));
                A0A.A0R("send_type", str4);
                A0A.A0R("super_share_channels", String.valueOf(z ? 1 : 0));
                if (this.A0S && AbstractC166997dE.A0Y(userSession).A04() != 1 && !directShareTarget.A0E()) {
                    A0A.A0R(TraceFieldType.TransportType, AbstractC140946Yw.A00(AbstractC31171DnF.A0O(directShareTarget)).A00);
                }
                this.A0J.put(directShareTarget, A0A);
            }
        }
    }

    public final void A0D(String str, String str2, String str3) {
        C14360o3.A0B(str, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A0G, "direct_group_create_button_select");
        if (A0f.isSampled()) {
            AbstractC31171DnF.A1G(A0f, str);
            A0f.AAP("share_sheet_session_id", this.A0A);
            A0f.AAP("media_id", str2);
            A0f.AAP("ranking_info_token", str3);
            A0f.Cht();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.1Mh, X.0Aj] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.List] */
    private final C25531Mh A00(EnumC33491ErQ enumC33491ErQ, UserSession userSession, DirectShareTarget directShareTarget, String str, String str2, String str3, int i, long j, long j2, long j3) {
        String str4;
        ?? A1E;
        EnumC33471Er6 enumC33471Er6;
        Long A13;
        ?? A0A = AbstractC31171DnF.A0A(AbstractC166987dD.A0f(this.A0G, "direct_suggested_recipient_impression"), 150);
        Long l = null;
        if (!AbstractC25226BEj.A1Z(A0A)) {
            return null;
        }
        A0A.A0R(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "DIRECT_RESHARE_SHEET");
        A0A.A00.A9T("e_counter_channel", "");
        A0A.A0R("share_sheet_session_id", this.A0A);
        A0A.A0R("query_session_id", this.A0B);
        A0A.A0M(enumC33491ErQ, "sheet_state");
        InterfaceC83713oG A0O = AbstractC31171DnF.A0O(directShareTarget);
        if (A0O instanceof C83693oE) {
            str4 = ((C83693oE) A0O).A00;
        } else {
            str4 = null;
        }
        A0A.A0R(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str4);
        if (AbstractC31172DnG.A18(directShareTarget).isEmpty()) {
            Long A0j = AbstractC25231BEo.A0j(0, userSession.userId);
            if (A0j != null) {
                C0Zx c0Zx = new C0Zx();
                c0Zx.A05("recipient_id", A0j);
                c0Zx.A01(EnumC33471Er6.INSTAGRAM, "interop_user_type");
                A1E = AbstractC166987dD.A1J(c0Zx);
            } else {
                A1E = C16930sl.A00;
            }
        } else {
            A1E = AbstractC166987dD.A1E();
            Iterator A132 = AbstractC31174DnI.A13(directShareTarget.A0Q);
            while (A132.hasNext()) {
                PendingRecipient A0p = AbstractC31172DnG.A0p(A132);
                Long A0j2 = AbstractC166997dE.A0j(A0p.getId());
                if (A0j2 != null) {
                    C0Zx c0Zx2 = new C0Zx();
                    c0Zx2.A05("recipient_id", A0j2);
                    if (A0p.A01 == 0) {
                        enumC33471Er6 = EnumC33471Er6.INSTAGRAM;
                    } else {
                        enumC33471Er6 = EnumC33471Er6.FACEBOOK;
                    }
                    c0Zx2.A01(enumC33471Er6, "interop_user_type");
                    C42321xM A02 = C41951wl.A00(userSession).A02(A0p.getId());
                    if (A02 != null) {
                        c0Zx2.A05("last_active_time", Long.valueOf((System.currentTimeMillis() - A02.A01) / StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS));
                    }
                    A1E.add(c0Zx2);
                }
            }
        }
        A0A.A0S("recipient_info", A1E);
        A0A.A0R("section_type", AbstractC34051F1e.A00(i));
        if (j3 != -1) {
            l = Long.valueOf(j3);
        }
        A0A.A0Q("media_type", l);
        A0A.A0R(TraceFieldType.RequestID, str);
        A0A.A0Q("relative_position", Long.valueOf(j));
        A0A.A0Q("position", Long.valueOf(j2));
        A0A.A0R("send_type", str2);
        A0A.A0O("is_recent_thread", AbstractC166997dE.A0a());
        A0A.A0R("inventory_source", str3);
        A0A.A0O("is_recipient_metaai", Boolean.valueOf(directShareTarget.A0Q()));
        if (this.A0S && AbstractC166997dE.A0Y(userSession).A04() != 1 && !directShareTarget.A0E()) {
            A0A.A0R(TraceFieldType.TransportType, AbstractC140946Yw.A00(AbstractC31171DnF.A0O(directShareTarget)).A00);
        }
        if (directShareTarget.A0Q()) {
            A0A.A0R("media_id", this.A01);
            String str5 = this.A03;
            if (str5 != null && (A13 = AbstractC25228BEl.A13(str5)) != null) {
                A0A.A0Q("media_author_id", A13);
            }
        }
        return A0A;
    }

    public static void A02(InterfaceC02590Ai interfaceC02590Ai, G05 g05, Long l, Long l2) {
        interfaceC02590Ai.AAP("module", g05.A0E.getModuleName());
        interfaceC02590Ai.A9K("media_id", l);
        interfaceC02590Ai.A9K("media_author_id", l2);
        interfaceC02590Ai.AAP("inventory_source", g05.A02);
        interfaceC02590Ai.AAP("ranking_request_id", g05.A08);
        interfaceC02590Ai.AAP("media_type", g05.A05);
        interfaceC02590Ai.AAP("share_sheet_session_id", g05.A0A);
    }

    public final String A04() {
        if (this.A0C) {
            A08();
        }
        String A0n = AbstractC166997dE.A0n();
        this.A0A = A0n;
        this.A0C = true;
        this.A00 = SystemClock.elapsedRealtime();
        return A0n;
    }

    public final void A05() {
        if (!this.A0C) {
            A04();
        }
        if (this.A0Q) {
            A07();
        }
        this.A09 = AbstractC166997dE.A0n();
    }

    public final void A06() {
        if (!this.A0C) {
            A04();
        }
        if (this.A0R) {
            A09();
        }
        this.A0B = AbstractC166997dE.A0n();
    }

    public final void A07() {
        Map map = this.A0N;
        Iterator A16 = AbstractC166997dE.A16(map);
        while (A16.hasNext()) {
            C0Ah c0Ah = (C0Ah) A16.next();
            if (c0Ah != null) {
                c0Ah.Cht();
            }
        }
        this.A09 = null;
        map.clear();
    }

    public final void A09() {
        Map map = this.A0O;
        FV2.A01(map.values());
        Map map2 = this.A0P;
        FV2.A01(map2.values());
        this.A0B = null;
        map.clear();
        map2.clear();
    }

    public final void A08() {
        String str;
        A09();
        Map map = this.A0K;
        for (Object obj : map.keySet()) {
            AbstractC02600Aj abstractC02600Aj = (AbstractC02600Aj) map.get(obj);
            C34546FKg c34546FKg = (C34546FKg) this.A0L.get(obj);
            if (abstractC02600Aj != null && c34546FKg != null) {
                if (c34546FKg.A02 == C05F.A00) {
                    c34546FKg.A01 += SystemClock.elapsedRealtime() - c34546FKg.A00;
                }
                abstractC02600Aj.A0P("dwell_time_s", Double.valueOf(Math.round((c34546FKg.A01 / 1000.0d) * 100.0d) / 100.0d));
            }
        }
        FV2.A01(map.values());
        Map map2 = this.A0J;
        Iterator it = map2.keySet().iterator();
        while (it.hasNext()) {
            DirectShareTarget A0m = AbstractC31172DnG.A0m(it);
            AbstractC02600Aj abstractC02600Aj2 = (AbstractC02600Aj) map2.get(A0m);
            if (abstractC02600Aj2 != null) {
                InterfaceC83713oG A0O = AbstractC31171DnF.A0O(A0m);
                if (A0O instanceof C83693oE) {
                    abstractC02600Aj2.A0R(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, ((C83693oE) A0O).A00);
                }
                this.A0D = false;
                abstractC02600Aj2.Cht();
            }
        }
        if (this.A00 != -1) {
            double elapsedRealtime = (SystemClock.elapsedRealtime() - r4) / 1000.0d;
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A0G, "direct_reshare_sheet_time_spent");
            if (C18U.A06(C06090Tz.A05, this.A0H, 36323856977571485L)) {
                str = null;
            } else {
                str = this.A04;
            }
            if (A0f.isSampled()) {
                A0f.AAP("media_id", str);
                A0f.AAP("ranking_info_token", this.A07);
                A0f.A8I("time_spent", Double.valueOf(elapsedRealtime));
                A0f.AAP("inventory_source", this.A02);
                A0f.AAP("share_sheet_session_id", this.A0A);
                A0f.AAP("ranking_request_id", this.A08);
                AbstractC25232BEp.A1L(A0f, "media_type", this.A05);
            }
        }
        C34548FKi c34548FKi = this.A0I;
        c34548FKi.A01.markerEnd(276892616, (short) 2);
        c34548FKi.A00 = null;
        this.A00 = -1L;
        this.A0D = true;
        map.clear();
        this.A0L.clear();
        map2.clear();
        this.A0M.clear();
    }

    public final void A0C(InterfaceC11380iw interfaceC11380iw, EnumC40111tc enumC40111tc, String str, String str2, List list) {
        String str3;
        boolean A1Y = AbstractC25229BEm.A1Y(str);
        if (!(!this.A0J.isEmpty()) && this.A0D) {
            UserSession userSession = this.A0H;
            String str4 = this.A0A;
            ArrayList A1E = AbstractC166987dD.A1E();
            ArrayList A1E2 = AbstractC166987dD.A1E();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                DirectShareTarget A0m = AbstractC31172DnG.A0m(it);
                InterfaceC83713oG A0O = AbstractC31171DnF.A0O(A0m);
                if (A0O instanceof C83693oE) {
                    A1E2.add(((C83693oE) A0O).A00);
                }
                Iterator it2 = AbstractC31175DnJ.A0f(A0m).iterator();
                while (it2.hasNext()) {
                    A1E.add(AbstractC31176DnK.A0s(it2));
                }
            }
            C12210kP c12210kP = new C12210kP(userSession);
            c12210kP.A00 = interfaceC11380iw;
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c12210kP.A00(), "direct_reshare_exit_flow");
            if (A0f.isSampled()) {
                A0f.A9T("e_counter_channel", "");
                A0f.A9T("recipient_ids", A1E);
                A0f.A9T("thread_ids", A1E2);
                A0f.AAP(AbstractC111324zv.A00(5391), str);
                A0f.AAP("share_sheet_session_id", str4);
                A0f.AAP("ranking_request_id", str2);
                if (enumC40111tc != null) {
                    str3 = enumC40111tc.name();
                } else {
                    str3 = null;
                }
                AbstractC25232BEp.A1L(A0f, "media_type", str3);
            }
            this.A0D = A1Y;
        }
    }

    @Override // X.InterfaceC13050lr
    public final void onUserSessionWillEnd(boolean z) {
        A08();
    }
}
