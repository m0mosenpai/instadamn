package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.quicklog.reliability.UserFlowLoggerImpl;
import com.instagram.api.schemas.MediaControlEventSourceEnum;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.util.BitSet;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Gj9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37734Gj9 {
    public JI9 A00;
    public boolean A01;
    public boolean A02;
    public final Handler A03;
    public final UserSession A04;
    public final Map A05;

    public C37734Gj9(JI9 ji9, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A04 = userSession;
        this.A00 = ji9;
        this.A05 = AbstractC166987dD.A1I();
        this.A03 = AbstractC167007dF.A0J();
    }

    public static final IM4 A00(Context context, C37734Gj9 c37734Gj9, C40971v4 c40971v4, Integer num) {
        String str;
        IM4 im4 = new IM4(context);
        long parseLong = Long.parseLong(c37734Gj9.A04.userId);
        Map map = im4.A04;
        map.put(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, Long.valueOf(parseLong));
        BitSet bitSet = im4.A01;
        bitSet.set(2);
        map.put(AbstractC111324zv.A00(3259), "dwell_reels_see_more_less");
        bitSet.set(1);
        map.put("cti_component", "AfiSeeMoreLessFollowup");
        bitSet.set(0);
        map.put("ad_id", AbstractC25228BEl.A13(c40971v4.A0S));
        C09530e4 A1L = AbstractC166987dD.A1L("afi_id", c37734Gj9.A00.AaQ());
        C09530e4 A1L2 = AbstractC166987dD.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "dwell_reels_see_more_less");
        C09530e4 A1L3 = AbstractC166987dD.A1L("global_position", String.valueOf(c40971v4.A0P));
        C09530e4 A1L4 = AbstractC166987dD.A1L("ad_tracking_token", c40971v4.A0j);
        InterfaceC39271s5 interfaceC39271s5 = c40971v4.A03;
        C09530e4 A1L5 = AbstractC166987dD.A1L("ads_category", interfaceC39271s5 != null ? interfaceC39271s5.AaI() : null);
        C09530e4 A1L6 = AbstractC166987dD.A1L(UserFlowLoggerImpl.SOURCE_ANNOTATION, "ad_dwell");
        if (num.intValue() != 0) {
            str = "see_less";
        } else {
            str = "see_more";
        }
        LinkedHashMap A06 = AbstractC06930Yk.A06(A1L, A1L2, A1L3, A1L4, A1L5, A1L6, AbstractC166987dD.A1L("answer", str));
        if (!A06.isEmpty()) {
            map.put("extra_data", A06);
        }
        return im4;
    }

    public static final void A01(Context context, C37734Gj9 c37734Gj9, MediaControlEventSourceEnum mediaControlEventSourceEnum, C75113Zb c75113Zb, C40971v4 c40971v4, CSJ csj, Integer num, String str, String str2) {
        String str3;
        if (false != c75113Zb.A29) {
            c75113Zb.A29 = false;
            C75113Zb.A00(c75113Zb, 49);
        }
        UserSession userSession = c37734Gj9.A04;
        if (C18U.A06(C06090Tz.A05, userSession, 36319519060401641L)) {
            IM4 A00 = A00(context, c37734Gj9, c40971v4, num);
            IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(userSession);
            A0C.A0R = "com.bloks.www.bloks.ig_contextual_tray_infra_controller.bottom_sheet";
            if (A00.A01.nextClearBit(0) >= 3) {
                C66277U6x A02 = C66277U6x.A02("com.bloks.www.bloks.ig_contextual_tray_infra_controller.bottom_sheet", AbstractC191768eY.A01(A00.A04), A00.A03);
                A02.A00 = 719983200;
                A02.A05 = null;
                A02.A01 = 0L;
                A02.A06 = null;
                A02.A03 = null;
                A02.A02 = null;
                A02.A04 = null;
                A02.A08(A00.A02);
                A02.A05(A00.A00, A0C);
            } else {
                throw AbstractC31173DnH.A0f();
            }
        } else {
            C41451vu c41451vu = C41451vu.A01;
            C146106i8 A0K = AbstractC31171DnF.A0K();
            A0K.A01 = AbstractC31372Dqc.A00();
            A0K.A0D = str;
            A0K.A02();
            A0K.A0L = true;
            A0K.A0R = true;
            AbstractC31175DnJ.A0l(context, A0K, 2131976066);
            A0K.A0A(new C29317CwC(0, context, c37734Gj9, mediaControlEventSourceEnum, csj, num));
            Drawable A022 = AbstractC65877Tvg.A02(context, str2);
            if (A022 != null) {
                AbstractC37304Gc5.A0p(context, A022, A0K);
                AbstractC31178DnM.A1N(c41451vu, A0K);
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        JI9 ji9 = c37734Gj9.A00;
        if (num.intValue() != 0) {
            str3 = "see_less";
        } else {
            str3 = "see_more";
        }
        ji9.ClL(str3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0013, code lost:
    
        if (r1 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
        if (r10 == null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
    
        r10 = "circle_check_pano_outline_24";
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        A01(r12, r11, r13, r14, r15, r16, X.C05F.A01, r9, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(android.content.Context r12, com.instagram.api.schemas.MediaControlEventSourceEnum r13, X.C75113Zb r14, X.C40971v4 r15, X.CSJ r16) {
        /*
            r11 = this;
            r6 = r15
            X.4o6 r1 = r15.A0E
            r2 = r12
            if (r1 == 0) goto Lc
            java.lang.String r9 = r1.BWS()
            if (r9 != 0) goto L15
        Lc:
            r0 = 2131973192(0x7f135448, float:1.9583413E38)
            java.lang.String r9 = X.AbstractC166997dE.A0p(r12, r0)
            if (r1 == 0) goto L1b
        L15:
            java.lang.String r10 = r1.BWR()
            if (r10 != 0) goto L1d
        L1b:
            java.lang.String r10 = "circle_check_pano_outline_24"
        L1d:
            java.lang.Integer r8 = X.C05F.A01
            r3 = r11
            r4 = r13
            r5 = r14
            r7 = r16
            A01(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37734Gj9.A02(android.content.Context, com.instagram.api.schemas.MediaControlEventSourceEnum, X.3Zb, X.1v4, X.CSJ):void");
    }

    public final boolean A03(C120985dq c120985dq) {
        InterfaceC39271s5 interfaceC39271s5;
        UserSession userSession = this.A04;
        if (c120985dq != null && AbstractC37647Ghg.A00(c120985dq) && (interfaceC39271s5 = c120985dq.A06().A03) != null && AbstractC166997dE.A1Z(interfaceC39271s5.Cbh(), true) && new BKG().A00(c120985dq)) {
            C06090Tz c06090Tz = C06090Tz.A05;
            if ((C18U.A06(c06090Tz, userSession, 36319519060336104L) || C18U.A06(c06090Tz, userSession, 36319519060270567L)) && !this.A02 && !C18U.A06(c06090Tz, userSession, 36322302199343231L)) {
                return true;
            }
        }
        return false;
    }
}
