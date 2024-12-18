package X;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.fundraiser.NewFundraiserInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public final class PJC implements InterfaceC58005Pnp {
    public long A00;
    public long A01;
    public long A02;
    public C51723Mt0 A03;
    public N3J A04;
    public EnumC53324Ni1 A05;
    public C56806PIx A06;
    public C56806PIx A07;
    public C56806PIx A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public HashMap A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public final InterfaceC174767qC A0O;
    public final InterfaceC11380iw A0P;
    public final InterfaceC41501vz A0Q;
    public final UserSession A0R;
    public final OL4 A0S;
    public final C56805PIw A0T;
    public final C55085Oah A0U;
    public final NYV A0V;
    public final AbstractC147826l7 A0W;
    public final C53021Nct A0X;
    public final String A0Y;
    public final List A0Z;
    public final FragmentActivity A0a;
    public final C17280tP A0b;
    public final C23031Ai A0c;
    public final C147896lL A0d;

    public final void A01(EnumC53324Ni1 enumC53324Ni1) {
        C14360o3.A0B(enumC53324Ni1, 0);
        EnumC53324Ni1 enumC53324Ni12 = this.A05;
        this.A05 = enumC53324Ni1;
        C56806PIx c56806PIx = this.A07;
        if (c56806PIx != null) {
            boolean z = true;
            switch (enumC53324Ni1.ordinal()) {
                case 2:
                    OL4 ol4 = c56806PIx.A09;
                    UserSession userSession = ol4.A06;
                    Context context = ol4.A03;
                    if (MSY.A1T(context, userSession)) {
                        C37101o8.A00(AbstractC195888lY.A00()).A00(context, userSession, C24069AmC.A00, "sup:SupDelegate|SupLiveDelegate_PLAY_TTS_ON_ENTER_LIVE");
                        break;
                    }
                    break;
                case 3:
                case 8:
                    c56806PIx.A0E.A01 = false;
                    break;
                case 5:
                    c56806PIx.A0E.A01 = true;
                    c56806PIx.A0F.A00();
                    c56806PIx.A0C.A0J = true;
                    break;
                case 6:
                    Bundle A0b = AbstractC166987dD.A0b();
                    AbstractC31173DnH.A1C(A0b, c56806PIx.A06);
                    A0b.putString("live_visibility_mode", c56806PIx.A0A.A01);
                    PJC pjc = c56806PIx.A0C;
                    C56805PIw.A0B(pjc.A0T, C05F.A0d);
                    pjc.A0K = true;
                    break;
                case 7:
                    C54801OJv c54801OJv = c56806PIx.A00;
                    if (c54801OJv != null) {
                        c54801OJv.A09.unregisterLifecycleListener(c54801OJv.A02);
                    }
                    c56806PIx.A00 = null;
                    break;
                case 9:
                case 10:
                    OMc oMc = c56806PIx.A0F;
                    oMc.A01();
                    c56806PIx.A0E.A01 = true;
                    oMc.A00();
                    PJC pjc2 = c56806PIx.A0C;
                    if (pjc2.A0H) {
                        boolean equals = "copyrighted_music_matched".equals(pjc2.A0B);
                        OW8 ow8 = c56806PIx.A0D;
                        int i = 2131964105;
                        if (equals) {
                            i = 2131964082;
                        }
                        Context context2 = ow8.A0C;
                        String string = context2.getString(i);
                        View inflate = ow8.A0E.inflate();
                        TextView A0T = AbstractC166997dE.A0T(inflate, R.id.body);
                        View requireViewById = inflate.requireViewById(R.id.finish_button);
                        requireViewById.getLayoutParams().width = AbstractC13880nE.A0A(context2) / 2;
                        Ok4.A00(requireViewById.requireViewById(R.id.finish_button), 70, ow8);
                        A0T.setText(string);
                    } else {
                        UserSession userSession2 = c56806PIx.A06;
                        if (!AbstractC109224vo.A03(userSession2)) {
                            if (enumC53324Ni1 != EnumC53324Ni1.A0C) {
                                z = false;
                            }
                            final String str = pjc2.A09;
                            if (str != null) {
                                final OW8 ow82 = c56806PIx.A0D;
                                final String str2 = pjc2.A0A;
                                final String str3 = pjc2.A0D;
                                final boolean z2 = pjc2.A0I;
                                final boolean z3 = pjc2.A0F;
                                final boolean z4 = pjc2.A0L;
                                final long j = pjc2.A00;
                                final String str4 = pjc2.A0Y;
                                final long j2 = pjc2.A01;
                                final List list = pjc2.A0Z;
                                final boolean A1a = MSZ.A1a(MSX.A0W(OYB.A02(userSession2)).A08);
                                OYB.A02(userSession2).A01.getValue();
                                ow82.A07 = str;
                                final boolean z5 = z;
                                ow82.A01.post(new Runnable() { // from class: X.PU1
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        OW8 ow83 = OW8.this;
                                        String str5 = str;
                                        String str6 = str2;
                                        String str7 = str3;
                                        long j3 = j;
                                        OW8.A00(ow83, null, str5, str6, str7, str4, list, j3, j2, z2, z3, z4, z5, A1a);
                                    }
                                });
                            }
                        }
                    }
                    C25531Mh A02 = C56805PIw.A02(pjc2.A0T, C05F.A0H);
                    A02.A0O("has_share_toggle", false);
                    A02.Cht();
                    c56806PIx.A0E.A04.setOnTouchListener(null);
                    break;
                case 11:
                    c56806PIx.A0F.A01();
                    c56806PIx.A0E.A04.setOnTouchListener(null);
                    break;
            }
        }
        this.A0W.A02().A06.Egh(enumC53324Ni1);
        switch (enumC53324Ni1.ordinal()) {
            case 2:
                C53021Nct c53021Nct = this.A0X;
                C54732OFj c54732OFj = c53021Nct.A0c;
                Location location = null;
                String str5 = c54732OFj.A03;
                NewFundraiserInfo newFundraiserInfo = c54732OFj.A01;
                C1VW c1vw = C1VW.A00;
                if (c1vw != null) {
                    location = c1vw.getLastLocation(((AbstractC55102ObF) c53021Nct).A07, "IgLiveStreamingController");
                }
                UserSession userSession3 = ((AbstractC55102ObF) c53021Nct).A07;
                String str6 = c53021Nct.A0D.A0C;
                C25621Ms A0c = AbstractC167017dG.A0c(userSession3);
                A0c.A0L("live/%s/start/", str6);
                A0c.A0P(null, C52088N2o.class, OQJ.class, true);
                if (location != null) {
                    A0c.A9s(com.facebook.location.platform.api.Location.LATITUDE, String.valueOf(location.getLatitude()));
                    A0c.A9s("longitude", String.valueOf(location.getLongitude()));
                }
                if (str5 != null) {
                    A0c.A9s("fundraiser_id", str5);
                }
                if (newFundraiserInfo != null) {
                    A0c.A9s("new_fundraiser_info", OY1.A00(newFundraiserInfo));
                }
                C1ON A0N = A0c.A0N();
                C50689MZh.A00(A0N, c53021Nct, 33);
                C56805PIw c56805PIw = c53021Nct.A0a;
                C25531Mh A03 = C56805PIw.A03(c56805PIw, C05F.A0N);
                A03.A0P("response_time", MSZ.A0g(SystemClock.elapsedRealtime() - c56805PIw.A01));
                AbstractC55113ObX.A02(c56805PIw.A0K, A03);
                A03.Cht();
                C1GJ.A00(((AbstractC55102ObF) c53021Nct).A05, c53021Nct.A0V, A0N);
                A01(EnumC53324Ni1.A07);
                return;
            case 9:
            case 10:
            case 11:
                if (enumC53324Ni12.A01()) {
                    return;
                }
                this.A0X.A0K();
                return;
            default:
                return;
        }
    }

    public PJC(FragmentActivity fragmentActivity, InterfaceC174767qC interfaceC174767qC, InterfaceC11380iw interfaceC11380iw, C25671My c25671My, UserSession userSession, C17280tP c17280tP, C23031Ai c23031Ai, OL4 ol4, C56805PIw c56805PIw, C55085Oah c55085Oah, NYV nyv, AbstractC147826l7 abstractC147826l7, C147896lL c147896lL, C53021Nct c53021Nct, String str, List list) {
        C14360o3.A0B(c17280tP, 9);
        AbstractC25232BEp.A1P(c23031Ai, c25671My);
        this.A0a = fragmentActivity;
        this.A0P = interfaceC11380iw;
        this.A0R = userSession;
        this.A0T = c56805PIw;
        this.A0X = c53021Nct;
        this.A0O = interfaceC174767qC;
        this.A0S = ol4;
        this.A0U = c55085Oah;
        this.A0b = c17280tP;
        this.A0c = c23031Ai;
        this.A0Y = str;
        this.A0Z = list;
        this.A0d = c147896lL;
        this.A0W = abstractC147826l7;
        this.A0V = nyv;
        C56034Ou6 A00 = C56034Ou6.A00(this, 34);
        this.A0Q = A00;
        this.A05 = EnumC53324Ni1.A05;
        this.A03 = new C51723Mt0();
        ((AbstractC55102ObF) c53021Nct).A02 = this;
        c53021Nct.A0E = this;
        this.A0N = AbstractC167017dG.A1b(c23031Ai, c23031Ai.A21, C23031Ai.A8c, 151);
        c25671My.A01(A00, AbstractC55960Oss.class);
    }

    public final void A00() {
        if (!this.A05.A01()) {
            this.A0X.A0K();
        }
        OL4 ol4 = this.A0S;
        UserSession userSession = ol4.A06;
        Context context = ol4.A03;
        if (MSY.A1T(context, userSession)) {
            C37101o8.A00(AbstractC195888lY.A00()).A00(context, userSession, PH4.A00, "sup:SupLiveDelegate");
        }
        C56805PIw.A04(this.A0T, C05F.A1F).Cht();
    }

    public final void A02(Integer num, String str, boolean z) {
        EnumC53324Ni1 enumC53324Ni1;
        if (!this.A05.A01()) {
            if (num == C05F.A15) {
                enumC53324Ni1 = EnumC53324Ni1.A0C;
            } else if (z) {
                enumC53324Ni1 = EnumC53324Ni1.A0D;
            } else {
                enumC53324Ni1 = EnumC53324Ni1.A0B;
            }
            A01(enumC53324Ni1);
            C56805PIw c56805PIw = this.A0T;
            C56805PIw.A0A(c56805PIw);
            C25531Mh A03 = C56805PIw.A03(c56805PIw, C05F.A1I);
            AbstractC50523MSb.A15(A03, OQV.A00(num), str);
            Boolean valueOf = Boolean.valueOf(c56805PIw.A0B);
            A03.A0O("allow_cobroadcast_invite", valueOf);
            A03.A0Q("disconnect_count", MSY.A0Z(c56805PIw.A0Y));
            A03.A0Q("total_questions_answered_count", MSY.A0Z(c56805PIw.A0c));
            A03.Cht();
            c56805PIw.A0G = false;
            c56805PIw.A0L.removeCallbacks(c56805PIw.A0S);
            C56805PIw.A0A(c56805PIw);
            C25531Mh A032 = C56805PIw.A03(c56805PIw, C05F.A02);
            A032.A0Q("max_viewer_count", MSY.A0Z(c56805PIw.A0b));
            A032.A0Q("total_viewer_count", MSY.A0Z(c56805PIw.A0k));
            A032.A0Q("total_like_shown_count", MSY.A0Z(c56805PIw.A0i));
            A032.A0Q("total_burst_like_shown_count", MSY.A0Z(c56805PIw.A0e));
            A032.A0Q("total_user_comment_shown_count", MSY.A0Z(c56805PIw.A0l));
            A032.A0Q("total_system_comment_shown_count", MSY.A0Z(c56805PIw.A0j));
            Long A0d = AbstractC167007dF.A0d();
            A032.A0Q("is_published", A0d);
            A032.A0Q("total_battery_drain", AbstractC31171DnF.A0V(c56805PIw.A00));
            A032.A0O("allow_cobroadcast_invite", valueOf);
            A032.A0P("total_cobroadcast_duration", MSZ.A0g(c56805PIw.A0p.get()));
            A032.A0Q("total_unique_guest_count", AbstractC31171DnF.A0V(c56805PIw.A0T.size()));
            A032.A0Q("total_guest_invite_attempt", MSY.A0Z(c56805PIw.A0h));
            A032.A0Q("sup_state", Long.valueOf(c56805PIw.A04));
            C54667OCt c54667OCt = c56805PIw.A06;
            if (c54667OCt != null) {
                C0Zx c0Zx = new C0Zx();
                long j = 0;
                c0Zx.A05("button_tap_count", A0d);
                if (c54667OCt.A04) {
                    j = 1;
                }
                c0Zx.A05("button_was_shown", Long.valueOf(j));
                c0Zx.A05("face_effect_off_tap_count", A0d);
                c0Zx.A05("num_effects_in_tray", A0d);
                C19260xA c19260xA = new C19260xA();
                Iterator A0k = AbstractC167007dF.A0k(c54667OCt.A00);
                if (A0k.hasNext()) {
                    A0k.next();
                    throw AbstractC166987dD.A15("getNumTimesSelected");
                }
                HashMap A033 = AbstractC11490j8.A03(c19260xA);
                ArrayList A17 = AbstractC25225BEi.A17(A033.size());
                Iterator A14 = AbstractC166997dE.A14(A033);
                while (A14.hasNext()) {
                    Map.Entry A1K = AbstractC166987dD.A1K(A14);
                    A17.add(AbstractC167007dF.A0n(A1K.getKey(), A1K.getValue()));
                }
                c0Zx.A07("selected_effect_usage_stats", A17);
                c0Zx.A05("supports_face_filters", A0d);
                c0Zx.A05("tray_dismissed_with_active_effect_count", A0d);
                c0Zx.A07("selected_face_effect_session_ids", Collections.unmodifiableList(c54667OCt.A01));
                A032.A0N(c0Zx, "face_effect_usage_stats");
            }
            A032.Cht();
        }
    }

    @Override // X.InterfaceC58005Pnp
    public final void DCi(long j) {
        C147856lA c147856lA = this.A0W.A03;
        c147856lA.A01.A00 = j;
        c147856lA.A04.Egh(Long.valueOf(j));
        this.A00 = j;
        long j2 = this.A02;
        if (j2 > 0) {
            if (j2 - j < 0 && !this.A0M) {
                if (!this.A05.A01()) {
                    A02(C05F.A0j, null, true);
                }
                this.A0M = true;
            }
            if (!this.A0N && j > 1000) {
                C23031Ai c23031Ai = this.A0c;
                AbstractC167007dF.A1L(c23031Ai, c23031Ai.A21, C23031Ai.A8c, 151, true);
                this.A0N = true;
            }
        }
    }
}
