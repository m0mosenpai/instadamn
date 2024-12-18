package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.HallpassDetailsDict;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* renamed from: X.2vM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C64012vM {
    public C63402uN A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final String A03;
    public final String A04;
    public final java.util.Set A05;
    public final java.util.Set A06;
    public final String A07;
    public final java.util.Set A08;

    public C64012vM(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2, String str3) {
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A03 = str2;
        if (str3 == null) {
            str3 = UUID.randomUUID().toString();
            C14360o3.A07(str3);
        }
        this.A04 = str3;
        this.A07 = str;
        this.A08 = new HashSet();
        this.A06 = new HashSet();
        this.A05 = new HashSet();
    }

    public final void A02(Reel reel, C70873Fz c70873Fz, Boolean bool, Boolean bool2, Integer num, int i) {
        C14360o3.A0B(reel, 0);
        String id = reel.getId();
        C14360o3.A07(id);
        A00(reel, c70873Fz, this, bool, bool2, null, num, id, i);
    }

    public final void A03(C70873Fz c70873Fz, C61252qn c61252qn, Double d, Integer num, long j, boolean z) {
        C14360o3.A0B(num, 4);
        C3R6.A00.A0C(this.A01, this.A02, c70873Fz, c61252qn, d, num, null, this.A04, this.A03, j, z, true);
    }

    public static final void A00(Reel reel, C70873Fz c70873Fz, C64012vM c64012vM, Boolean bool, Boolean bool2, Boolean bool3, Integer num, String str, int i) {
        String str2;
        long j;
        long j2;
        Long l;
        String str3;
        String str4;
        EnumC109104va enumC109104va;
        String id;
        java.util.Set set = c64012vM.A08;
        if (!set.contains(str)) {
            set.add(str);
            Long l2 = null;
            UserSession userSession = c64012vM.A02;
            InterfaceC11380iw interfaceC11380iw = c64012vM.A01;
            String str5 = c64012vM.A04;
            String str6 = c64012vM.A07;
            if (num != null) {
                str2 = AbstractC124135jS.A00(num);
            } else {
                str2 = null;
            }
            String str7 = null;
            C14360o3.A0B(str5, 3);
            C18920wW A00 = AbstractC12220kQ.A00(interfaceC11380iw, C12180kM.A03, userSession);
            InterfaceC02590Ai A002 = A00.A00(A00.A00, "reel_tray_impression");
            if (A002.isSampled()) {
                boolean z = false;
                if (c70873Fz.A01.A01.A02 != 0) {
                    z = true;
                }
                if (z) {
                    j = 1L;
                } else {
                    j = 0L;
                }
                A002.A9K("has_my_reel", j);
                A002.A9K("viewed_reel_count", Long.valueOf(r10.A03));
                A002.A9K("new_reel_count", Long.valueOf(r10.A01));
                A002.A9K("live_reel_count", Long.valueOf(r7.A00.A01));
                A002.A9K("tray_position", Long.valueOf(i));
                A002.AAP("tray_session_id", str5);
                A002.AAP(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str2);
                A002.AAP("reel_id", reel.getId());
                A002.A7v("seen_state_ring", Boolean.valueOf(reel.A1S));
                if (reel.A16(userSession)) {
                    j2 = 0L;
                } else {
                    j2 = 1L;
                }
                A002.A9K("is_new_reel", j2);
                A002.AAP("reel_type", reel.A0H(userSession));
                C1NB c1nb = reel.A0W;
                if (c1nb != null && (id = c1nb.getId()) != null) {
                    l = AbstractC003100w.A0k(10, id);
                } else {
                    l = null;
                }
                A002.A9K("a_pk", l);
                String str8 = null;
                if (reel.A0d()) {
                    C105824pt c105824pt = reel.A0H;
                    if (c105824pt != null) {
                        enumC109104va = c105824pt.A06;
                        if (enumC109104va == null) {
                            enumC109104va = EnumC109104va.A0E;
                        }
                    } else {
                        enumC109104va = null;
                    }
                    if (enumC109104va == EnumC109104va.A04 && c105824pt != null) {
                        str8 = c105824pt.A0e;
                        str8.getClass();
                    }
                }
                A002.AAP("m_pk", str8);
                A002.AAP("shopping_session_id", str6);
                A002.AAP("broadcast_source", null);
                C42557Isb c42557Isb = reel.A0E;
                if (c42557Isb != null) {
                    str7 = c42557Isb.getId();
                }
                A002.AAP("media_preview_id", str7);
                A002.A7v("sifu_end_card", false);
                A002.A7v("is_group_story_pog", bool3);
                if (bool != null) {
                    if (bool.equals(true)) {
                        str4 = "CARDS";
                    } else {
                        str4 = "DEFAULT";
                    }
                    A002.AAP("highlight_cover_size", str4);
                }
                if (C14360o3.A0K(bool2, true)) {
                    A002.A7v("sifu_end_card", true);
                }
                if (!reel.getId().equals("election:rollcall_v2") && !reel.A0o()) {
                    List list = reel.A1p;
                    C14360o3.A07(list);
                    ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(AbstractC003100w.A0k(10, ((User) it.next()).getId()));
                    }
                    A002.AAk("facepile_ids", arrayList);
                } else {
                    List A0O = reel.A0O(userSession);
                    C14360o3.A07(A0O);
                    List A003 = AbstractC28066CYu.A00(A0O);
                    ArrayList arrayList2 = new ArrayList(AbstractC06950Ym.A1E(A003, 10));
                    Iterator it2 = A003.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(AbstractC003100w.A0k(10, ((User) it2.next()).getId()));
                    }
                    A002.AAk("facepile_ids", arrayList2);
                }
                if (C14360o3.A0K(bool3, true)) {
                    HallpassDetailsDict hallpassDetailsDict = reel.A08;
                    if (hallpassDetailsDict != null) {
                        String BAt = hallpassDetailsDict.BAt();
                        str3 = hallpassDetailsDict.getName();
                        if (BAt != null) {
                            l2 = AbstractC003100w.A0k(10, BAt);
                        }
                    } else {
                        str3 = null;
                    }
                    A002.A9K("audience_list_id", l2);
                    A002.AAP("audience_list_name", str3);
                }
                A002.Cht();
            }
        }
    }

    public final void A01(int i) {
        java.util.Set set = this.A08;
        if (!set.contains("spinner")) {
            set.add("spinner");
            C18920wW A01 = AbstractC12220kQ.A01(this.A01, this.A02);
            InterfaceC02590Ai A00 = A01.A00(A01.A00, "reel_tray_impression");
            if (A00.isSampled()) {
                A00.AAP("tray_session_id", this.A04);
                A00.AAP("reel_type", "spinner");
                A00.A9K("tray_position", Long.valueOf(i));
                A00.Cht();
            }
        }
    }

    public final void A04(C70873Fz c70873Fz, C61252qn c61252qn, Integer num, int i, long j, boolean z) {
        C3R6 c3r6 = C3R6.A00;
        UserSession userSession = this.A02;
        c3r6.A0C(this.A01, userSession, c70873Fz, c61252qn, null, num, Integer.valueOf(i), this.A04, this.A03, j, z, false);
    }
}
