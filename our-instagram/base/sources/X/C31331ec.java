package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.pendingmedia.model.constants.ShareType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* renamed from: X.1ec, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31331ec implements InterfaceC29301b7, InterfaceC31091eE {
    public static final C0KV A07 = new C0KV() { // from class: X.1ed
        @Override // X.C0KV
        public final Object AXR(final UserSession userSession) {
            return new C31331ec(userSession, AbstractC28761aE.A00(userSession), AbstractC09440dt.A01(new InterfaceC16820sZ() { // from class: X.B2y
                @Override // X.InterfaceC16820sZ
                public final Object invoke() {
                    return C25A.A00(UserSession.this);
                }
            }), AbstractC09440dt.A01(new InterfaceC16820sZ() { // from class: X.M8f
                @Override // X.InterfaceC16820sZ
                public final Object invoke() {
                    return AnonymousClass257.A00(UserSession.this);
                }
            }));
        }
    };
    public final UserSession A00;
    public final C2DS A01;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06 = AbstractC09440dt.A01(new InterfaceC16820sZ() { // from class: X.M8g
        @Override // X.InterfaceC16820sZ
        public final Object invoke() {
            return C70343Ds.A00(AbstractC12290kX.A00, C31331ec.this.A00);
        }
    });
    public final InterfaceC09390do A02 = AbstractC09440dt.A00(EnumC09460dv.A02, new InterfaceC16820sZ() { // from class: X.M8h
        @Override // X.InterfaceC16820sZ
        public final Object invoke() {
            return AbstractC120045c2.A00(C31331ec.this.A00);
        }
    });

    private void A00(InterfaceC37261GbE interfaceC37261GbE, C31311ea c31311ea, C47Z c47z, Class cls, Class cls2) {
        EnumC53323Ni0 enumC53323Ni0;
        C211689Zc c211689Zc;
        Long l;
        C45541KEg c45541KEg = new C45541KEg(this, c31311ea);
        UserSession userSession = this.A00;
        JTa jTa = ((C1OW) c31311ea).A02;
        boolean A11 = c47z.A11();
        if (A01(userSession, c47z)) {
            enumC53323Ni0 = EnumC53323Ni0.A0L;
        } else {
            enumC53323Ni0 = EnumC53323Ni0.A0N;
        }
        C25621Ms A01 = C55230Of1.A01(c47z.A0i, c47z.A13, userSession, enumC53323Ni0, c47z.A3t, c47z.A3v, C16030qx.A00(AbstractC12290kX.A00), null, null, c47z.A4R, A11, false, false, false);
        A01.A0S(cls, cls2);
        A01.A9s("client_context", c31311ea.A06());
        A01.A9s("mutation_token", ((C1OW) c31311ea).A05);
        if (jTa.A09) {
            A01.A9s("sampled", "true");
        }
        String str = jTa.A04;
        if (str != null) {
            A01.A9s("send_attribution", str);
        }
        A01.A0J("is_shh_mode", jTa.A07);
        L1W l1w = jTa.A00;
        if (l1w != null && (l = l1w.A01) != null) {
            long longValue = l.longValue();
            if (longValue > 0) {
                A01.A0E("ephemeral_duration_sec", longValue);
            }
        }
        String str2 = c31311ea.A04;
        if (!AbstractC13670mt.A0B(str2)) {
            A01.A9s("reshare_mode", str2);
        }
        String str3 = C1QM.A00.A02.A02;
        if (str3 != null) {
            A01.A9s("nav_chain", str3);
        }
        List C7R = c31311ea.C7R();
        C14360o3.A0B(C7R, 1);
        JSONArray jSONArray = new JSONArray();
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(C7R, 10));
        Iterator it = C7R.iterator();
        while (it.hasNext()) {
            String str4 = ((DirectThreadKey) it.next()).A00;
            if (str4 != null) {
                jSONArray.put(str4);
            } else {
                str4 = null;
            }
            arrayList.add(str4);
        }
        A01.A9s("thread_ids", jSONArray.toString());
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : C7R) {
            if (((DirectThreadKey) obj).A00 == null) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(AbstractC06950Ym.A1E(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            List list = ((DirectThreadKey) it2.next()).A02;
            if (list != null) {
                arrayList3.add(AbstractC001800i.A0P(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, "[", "]", list, null));
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        A01.A9s("recipient_users", AbstractC001800i.A0P(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, "[", "]", arrayList3, null));
        if (c31311ea.A07() != null) {
            c211689Zc = c31311ea.A07();
        } else {
            C55h c55h = c47z.A1R;
            if (c55h != null) {
                c211689Zc = new C211689Zc(c55h.A02, c55h.A01, null, null, null, null, false, null);
            } else {
                c211689Zc = new C211689Zc(null, null, null, null, null, null, false, null);
            }
        }
        C14360o3.A0B(c211689Zc, 1);
        String str5 = c211689Zc.A06;
        String str6 = c211689Zc.A03;
        String str7 = c211689Zc.A05;
        if (str5 == null) {
            str5 = "replayable";
        }
        A01.A9s("view_mode", str5);
        if (str6 != null) {
            A01.A9s("reply_type", str6);
        }
        if (str7 != null) {
            A01.A9s("reply_to_media_id", str7);
        }
        if (A01(userSession, c47z)) {
            Long l2 = c47z.A2I;
            l2.getClass();
            A01.A9s("attachment_fbid", l2.toString());
        }
        C55230Of1.A0J(A01, userSession, AbstractC54080Nve.A00(c47z), c47z.A0g, c47z.A11());
        AbstractC55161OdP.A02(A01, ShareType.A0F);
        AbstractC55161OdP.A01(A01, userSession, AbstractC55161OdP.A00(c47z, !C18U.A06(C06090Tz.A05, userSession, 36311654975210178L)), c47z.A0e, A11);
        AnonymousClass442 anonymousClass442 = c31311ea.A00;
        if (anonymousClass442 != null) {
            A01.A9s("replied_to_action_source", anonymousClass442.A0Q);
            A01.A9s("replied_to_client_context", anonymousClass442.A0R);
            A01.A9s("replied_to_item_id", anonymousClass442.A0T);
            A01.A9s("replied_to_target_type", anonymousClass442.A0F.A00);
            A01.A9s("replied_to_user_id", anonymousClass442.A0U);
        }
        if (c31311ea.A08) {
            A01.A9s("should_skip_genai_eval", "true");
        }
        String str8 = c31311ea.A02;
        if (str8 != null) {
            A01.A9s("ai_assistant_extras", str8);
        }
        List list2 = c31311ea.A07;
        if (list2 != null) {
            A01.A9s("ai_generated_attachment_fbids", new JSONArray((Collection) list2).toString());
        }
        C1ON A0N = A01.A0N();
        A0N.A00 = new C32226EDz(c45541KEg, userSession, interfaceC37261GbE);
        ((C120055c3) this.A02.getValue()).A01(((C1OW) c31311ea).A05);
        C1GJ.A03(A0N);
    }

    public static boolean A01(UserSession userSession, C47Z c47z) {
        if (c47z.A5D) {
            return false;
        }
        if (c47z.A6C) {
            return true;
        }
        if (c47z.A0D() != ShareType.A0F || !C18U.A06(C06090Tz.A05, userSession, 36314167533308392L)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x0275, code lost:
    
        if (r7 == X.EnumC40111tc.A0B) goto L95;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01fd  */
    @Override // X.InterfaceC31091eE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void AJE(X.InterfaceC37261GbE r20, X.C1OW r21, X.C47Z r22) {
        /*
            Method dump skipped, instructions count: 813
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31331ec.AJE(X.GbE, X.1OW, X.47Z):void");
    }

    @Override // X.InterfaceC29301b7
    public final /* bridge */ /* synthetic */ boolean CfR(C1OW c1ow, MNP mnp) {
        C31311ea c31311ea = (C31311ea) c1ow;
        if (c31311ea.A01.A03 != null && LCX.A01(mnp, c31311ea, this.A01)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x009c, code lost:
    
        if (r1 != null) goto L11;
     */
    @Override // X.InterfaceC29301b7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void ENr(X.C19260xA r20, final X.InterfaceC37261GbE r21, X.C1OW r22) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31331ec.ENr(X.0xA, X.GbE, X.1OW):void");
    }

    public C31331ec(final UserSession userSession, C2DS c2ds, InterfaceC09390do interfaceC09390do, InterfaceC09390do interfaceC09390do2) {
        this.A00 = userSession;
        this.A01 = c2ds;
        this.A04 = interfaceC09390do;
        this.A05 = interfaceC09390do2;
        this.A03 = AbstractC09440dt.A01(new InterfaceC16820sZ() { // from class: X.M95
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                return new C47626L1l(this.A00, AbstractC46925Kp6.A00(userSession));
            }
        });
    }
}
