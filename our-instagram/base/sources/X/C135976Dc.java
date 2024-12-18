package X;

import com.instagram.api.schemas.IGAIAgentType;
import com.instagram.api.schemas.ListeningNowResponseInfo;
import com.instagram.api.schemas.MusicInfo;
import com.instagram.api.schemas.MusicNoteResponseInfo;
import com.instagram.api.schemas.NoteActivationType;
import com.instagram.api.schemas.NoteCustomTheme;
import com.instagram.api.schemas.NoteCustomThemeImpl;
import com.instagram.api.schemas.TrackData;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.direct.inbox.notes.NotesRepository;
import com.instagram.direct.inbox.notes.models.NoteAudience;
import com.instagram.direct.inbox.notes.models.NoteStyle;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: X.6Dc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C135976Dc implements InterfaceC13050lr {
    public C22945A9p A00;
    public C152706ty A01;
    public C4F3 A02;
    public Map A03;
    public boolean A04;
    public final C18920wW A05;
    public final UserSession A06;
    public final C6Z0 A07;
    public final NotesRepository A08;
    public final HashMap A09;
    public final HashSet A0A;
    public final HashSet A0B;
    public final List A0C;
    public final List A0D;
    public final InterfaceC09390do A0E;

    public C135976Dc(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A06 = userSession;
        this.A08 = C4A5.A00(userSession);
        this.A05 = AbstractC12220kQ.A02(userSession);
        this.A0C = new ArrayList();
        this.A0B = new HashSet();
        this.A03 = new LinkedHashMap();
        this.A09 = new HashMap();
        this.A0A = new HashSet();
        this.A0D = new ArrayList();
        this.A07 = new C6Z0(new C135986Dd(this));
        this.A0E = AbstractC09440dt.A01(new C206869Dr(this, 15));
    }

    public static final EnumC152196t4 A00(User user) {
        IGAIAgentType Aah;
        if (user == null || (Aah = user.A03.Aah()) == null) {
            return null;
        }
        int ordinal = Aah.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal == 4) {
                        return EnumC152196t4.user_generated_consumer_agent;
                    }
                    return null;
                }
                return EnumC152196t4.official_meta_assistant;
            }
            return EnumC152196t4.meta_generated_consumer_agent;
        }
        return EnumC152196t4.ig_creator;
    }

    public static final void A05(C135976Dc c135976Dc) {
        c135976Dc.A04 = false;
        C6Z0 c6z0 = c135976Dc.A07;
        String str = c6z0.A00;
        if (str == null || str.length() == 0) {
            c6z0.A00 = UUID.randomUUID().toString();
            c6z0.A02();
        }
        NotesRepository notesRepository = c135976Dc.A08;
        HashMap hashMap = c135976Dc.A09;
        C14360o3.A0B(hashMap, 0);
        notesRepository.A03 = hashMap;
        HashSet hashSet = c135976Dc.A0A;
        C14360o3.A0B(hashSet, 0);
        notesRepository.A04 = hashSet;
    }

    public final void A0C(EnumC46303KeZ enumC46303KeZ) {
        Boolean bool = Boolean.FALSE;
        A0F(enumC46303KeZ, null, null, null, bool, bool, null, null, null, null);
    }

    public final void A0D(EnumC46303KeZ enumC46303KeZ) {
        A0F(enumC46303KeZ, null, null, null, Boolean.TRUE, Boolean.FALSE, null, null, null, null);
    }

    public final void A0G(EnumC46303KeZ enumC46303KeZ, EnumC46273Ke5 enumC46273Ke5, Boolean bool, Boolean bool2, String str) {
        A0F(enumC46303KeZ, null, enumC46273Ke5, bool, bool2, Boolean.FALSE, null, str, null, null);
    }

    public final void A0J(EnumC152696tw enumC152696tw, C4FL c4fl) {
        C14360o3.A0B(c4fl, 0);
        this.A01 = new C152706ty(null, enumC152696tw, null, null, null, null, c4fl.A00.getId(), null, null, null, C16930sl.A00, 0, false);
    }

    public final void A0K(EnumC152696tw enumC152696tw, C4F5 c4f5) {
        Long l;
        C14360o3.A0B(c4f5, 0);
        User user = c4f5.A0A;
        String id = user.getId();
        ArrayList A04 = A04(c4f5, false);
        Integer num = c4f5.A02;
        if (num != null) {
            int intValue = num.intValue();
            String str = c4f5.A03;
            String A03 = A03(c4f5);
            if (c4f5.A01 != null) {
                l = Long.valueOf(r0.intValue());
            } else {
                l = null;
            }
            this.A01 = new C152706ty(A00(user), enumC152696tw, null, c4f5.A09, l, A01(c4f5, true), id, str, A03, null, A04, intValue, false);
        }
    }

    public final void A0L(EnumC152186t3 enumC152186t3, C4F5 c4f5) {
        C14360o3.A0B(c4f5, 0);
        EnumC152696tw enumC152696tw = EnumC152696tw.POG;
        String id = c4f5.A0A.getId();
        ArrayList A04 = A04(c4f5, true);
        this.A01 = new C152706ty(null, enumC152696tw, enumC152186t3, c4f5.A09, null, null, id, c4f5.A03, A03(c4f5), null, A04, 0, false);
    }

    public final void A0N(C4F5 c4f5) {
        int i;
        C14360o3.A0B(c4f5, 0);
        String str = this.A07.A00;
        if (str != null) {
            User user = c4f5.A0A;
            DirectShareTarget directShareTarget = new DirectShareTarget(user);
            InterfaceC83713oG interfaceC83713oG = directShareTarget.A09;
            interfaceC83713oG.getClass();
            if (interfaceC83713oG instanceof InterfaceC83703oF) {
                C7YG A00 = C7YF.A00(this.A06);
                InterfaceC83713oG interfaceC83713oG2 = directShareTarget.A09;
                interfaceC83713oG2.getClass();
                List unmodifiableList = Collections.unmodifiableList(directShareTarget.A0Q);
                C14360o3.A07(unmodifiableList);
                A00.A02((InterfaceC83703oF) interfaceC83713oG2, unmodifiableList, new C9G1(this, c4f5, str, 5), false);
                return;
            }
            String id = user.getId();
            ArrayList A04 = A04(c4f5, false);
            String str2 = c4f5.A03;
            Integer num = c4f5.A02;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            this.A00 = new C22945A9p(false, str, id, str2, A04, i);
        }
    }

    public static final Long A01(C4F5 c4f5, boolean z) {
        MusicNoteResponseInfo musicNoteResponseInfo;
        MusicInfo musicInfo;
        TrackData BVV;
        String audioClusterId;
        ListeningNowResponseInfo listeningNowResponseInfo;
        List list = c4f5.A0J;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof C43646JSe) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (C9BI.A00(obj2, 1)) {
                arrayList2.add(obj2);
            }
        }
        if ((!arrayList.isEmpty() || !arrayList2.isEmpty()) && (!z || c4f5.A08 == null)) {
            if (!arrayList2.isEmpty()) {
                C67s c67s = ((C6C9) ((C9BI) AbstractC001800i.A0I(arrayList2)).A01).A0A;
                if (c67s != null && (listeningNowResponseInfo = c67s.A04) != null) {
                    musicInfo = listeningNowResponseInfo.A01;
                    if (musicInfo != null && (BVV = musicInfo.BVV()) != null && (audioClusterId = BVV.getAudioClusterId()) != null) {
                        return AbstractC003100w.A0k(10, audioClusterId);
                    }
                }
            } else {
                C67s c67s2 = ((C43646JSe) AbstractC001800i.A0I(arrayList)).A00.A0A;
                if (c67s2 != null && (musicNoteResponseInfo = c67s2.A07) != null) {
                    musicInfo = musicNoteResponseInfo.A00;
                    if (musicInfo != null) {
                        return AbstractC003100w.A0k(10, audioClusterId);
                    }
                }
            }
        }
        return null;
    }

    public static final String A02() {
        String str = C1QM.A00.A02.A00;
        if (str == null) {
            return "";
        }
        return str;
    }

    public static final String A03(C4F5 c4f5) {
        List list = c4f5.A0J;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof C43654JSm) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof C43646JSe) {
                arrayList2.add(obj2);
            }
        }
        ArrayList A0S = AbstractC001800i.A0S(arrayList2, arrayList);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : list) {
            if (C9BI.A00(obj3, 6)) {
                arrayList3.add(obj3);
            }
        }
        ArrayList A0S2 = AbstractC001800i.A0S(arrayList3, A0S);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj4 : list) {
            if (C9BI.A00(obj4, 4)) {
                arrayList4.add(obj4);
            }
        }
        ArrayList A0S3 = AbstractC001800i.A0S(arrayList4, A0S2);
        ArrayList arrayList5 = new ArrayList();
        for (Object obj5 : list) {
            if (C9BI.A00(obj5, 3)) {
                arrayList5.add(obj5);
            }
        }
        ArrayList A0S4 = AbstractC001800i.A0S(arrayList5, A0S3);
        ArrayList arrayList6 = new ArrayList();
        for (Object obj6 : list) {
            if (C9BI.A00(obj6, 5)) {
                arrayList6.add(obj6);
            }
        }
        ArrayList A0S5 = AbstractC001800i.A0S(arrayList6, A0S4);
        ArrayList arrayList7 = new ArrayList();
        for (Object obj7 : list) {
            if (C9BI.A00(obj7, 1)) {
                arrayList7.add(obj7);
            }
        }
        ArrayList A0S6 = AbstractC001800i.A0S(arrayList7, A0S5);
        if (A0S6.isEmpty()) {
            return null;
        }
        InterfaceC50424MOe interfaceC50424MOe = (InterfaceC50424MOe) AbstractC001800i.A0I(A0S6);
        if (!(interfaceC50424MOe instanceof C43646JSe) && !(interfaceC50424MOe instanceof C43654JSm) && !C9BI.A00(interfaceC50424MOe, 6) && !C9BI.A00(interfaceC50424MOe, 3) && !C9BI.A00(interfaceC50424MOe, 4) && !C9BI.A00(interfaceC50424MOe, 5) && !C9BI.A00(interfaceC50424MOe, 1)) {
            return null;
        }
        return interfaceC50424MOe.BXJ().A0H;
    }

    public static final ArrayList A04(C4F5 c4f5, boolean z) {
        JZA jza;
        JZA jza2;
        ArrayList arrayList = new ArrayList();
        if (c4f5.A0W) {
            arrayList.add(JZA.BIRTHDAY_INDICATOR);
        }
        if (c4f5.A0P) {
            arrayList.add(JZA.ACTIVE_NOW);
        }
        if (c4f5.A08 != null) {
            arrayList.add(JZA.POG_VIDEO);
        }
        if (c4f5.A0T) {
            jza2 = JZA.PROMPT_RESPONSE_NOTE;
        } else if (z) {
            jza2 = JZA.FRIEND_MAP_NOTE;
        } else {
            for (Object obj : c4f5.A0J) {
                if (obj instanceof C43654JSm) {
                    jza = JZA.NOTE;
                } else if (obj instanceof C43646JSe) {
                    jza = JZA.MUSIC_NOTE;
                } else if (C9BI.A00(obj, 2)) {
                    jza = JZA.LOCATION_NOTE;
                } else if (C9BI.A00(obj, 4)) {
                    jza = JZA.PROMPT_NOTE;
                } else if (C9BI.A00(obj, 5)) {
                    jza = JZA.STACKED_PROMPT;
                } else if (C9BI.A00(obj, 3)) {
                    jza = JZA.NOTE_CHAT;
                } else if (C9BI.A00(obj, 1)) {
                    jza = JZA.LISTENING_NOW;
                } else if (C9BI.A00(obj, 0)) {
                    jza = JZA.GIF_NOTE;
                }
                arrayList.add(jza);
            }
            return arrayList;
        }
        arrayList.add(jza2);
        return arrayList;
    }

    public static final void A06(C135976Dc c135976Dc, C4F5 c4f5, String str, double d) {
        int i;
        JZB jzb;
        Long l;
        String str2;
        NoteActivationType AYn;
        C18920wW c18920wW = c135976Dc.A05;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_direct_inbox_v2_item_impression");
        if (A00.isSampled()) {
            A00.AAP("nav_chain", A02());
            User user = c4f5.A0A;
            A00.AAP("target_user_id", user.getId());
            String str3 = null;
            A00.AAk("content", A04(c4f5, false));
            A00.AAP("direct_session_id", str);
            if (c4f5.A02 != null) {
                A00.A9K("position", Long.valueOf(r0.intValue()));
                Integer num = c4f5.A01;
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = 0;
                }
                A00.A9K("note_inventory_count", Long.valueOf(i));
                A00.AAP(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, c4f5.A03);
                A00.AAP("note_id", A03(c4f5));
                A00.A8I("dwell_time_ms", Double.valueOf(d));
                A00.A9K("audio_cluster_id", A01(c4f5, false));
                NoteAudience noteAudience = c4f5.A09;
                if (noteAudience != null) {
                    jzb = AbstractC135966Db.A00(noteAudience);
                } else {
                    jzb = null;
                }
                A00.A8R(jzb, "target_note_audience");
                if (c4f5.A0D != null) {
                    l = Long.valueOf(r0.intValue());
                } else {
                    l = null;
                }
                A00.A9K("num_prompt_responses", l);
                if (c135976Dc.A04) {
                    str2 = "feed_timeline";
                } else {
                    str2 = "direct_inbox";
                }
                A00.AAP("container_module", str2);
                A00.AAP("ranking_session_id", (String) c135976Dc.A08.A0s.getValue());
                A00.A8R(A00(user), "ai_agent_type");
                NoteCustomTheme noteCustomTheme = c4f5.A06;
                if (noteCustomTheme != null && (AYn = noteCustomTheme.AYn()) != null) {
                    str3 = AYn.toString();
                }
                A00.AAP("note_activation_type", str3);
                A00.AAP("canonical_nav_chain", AbstractC25041Ki.A00);
                A00.Cht();
            }
        }
    }

    public final void A07() {
        if (C18U.A06(C06090Tz.A05, this.A06, 36322499767576844L)) {
            HashMap hashMap = this.A09;
            if (!hashMap.isEmpty()) {
                NotesRepository notesRepository = this.A08;
                java.util.Set keySet = hashMap.keySet();
                C14360o3.A07(keySet);
                List A0a = AbstractC001800i.A0a(keySet);
                C19L c19l = ((C4A7) notesRepository).A01;
                C9D3 c9d3 = new C9D3(notesRepository, A0a, (InterfaceC23621Ds) null, 49);
                AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c9d3, c19l);
                this.A0A.addAll(hashMap.keySet());
                hashMap.clear();
            }
        }
    }

    public final void A08() {
        User user;
        JZA jza;
        String str;
        String str2;
        NoteActivationType noteActivationType;
        String str3 = this.A07.A00;
        if (str3 == null && !this.A04) {
            return;
        }
        A07();
        C4F3 c4f3 = this.A02;
        if (c4f3 != null) {
            C18920wW c18920wW = this.A05;
            InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_direct_inbox_v2_item_impression");
            if (A00.isSampled()) {
                A00.AAP("nav_chain", A02());
                A00.AAP("target_user_id", c4f3.A04.getId());
                List singletonList = Collections.singletonList(JZA.FRIEND_MAP_ENTRYPOINT);
                C14360o3.A07(singletonList);
                A00.AAk("content", singletonList);
                A00.AAP("direct_session_id", str3);
                A00.A9K("position", Long.valueOf(c4f3.A00));
                A00.A9K("note_inventory_count", Long.valueOf(c4f3.A01));
                A00.AAP("ranking_session_id", (String) this.A08.A0s.getValue());
                A00.AAP("canonical_nav_chain", AbstractC25041Ki.A00);
                A00.Cht();
            }
        }
        for (Map.Entry entry : this.A03.entrySet()) {
            C4FM c4fm = (C4FM) entry.getKey();
            long longValue = ((Number) entry.getValue()).longValue();
            C18920wW c18920wW2 = this.A05;
            InterfaceC02590Ai A002 = c18920wW2.A00(c18920wW2.A00, "ig_direct_inbox_v2_item_impression");
            if (A002.isSampled()) {
                A002.AAP("nav_chain", A02());
                List list = c4fm.A0D;
                if (list == null || (user = (User) AbstractC001800i.A0J(list)) == null) {
                    user = c4fm.A06;
                }
                A002.AAP("target_user_id", user.getId());
                if (C14360o3.A0K(c4fm.A0C, "media_note_author_stack")) {
                    jza = JZA.MEDIA_NOTES_AUTHOR;
                } else {
                    jza = JZA.MEDIA_NOTES_STACK;
                }
                List singletonList2 = Collections.singletonList(jza);
                C14360o3.A07(singletonList2);
                A002.AAk("content", singletonList2);
                A002.AAP("direct_session_id", str3);
                A002.A9K("position", Long.valueOf(c4fm.A01));
                A002.A9K("note_inventory_count", Long.valueOf(c4fm.A04));
                A002.AAP("ranking_session_id", (String) this.A08.A0s.getValue());
                A002.AAP("note_id", c4fm.A0A);
                A002.A8I("dwell_time_ms", Double.valueOf(longValue));
                if (this.A04) {
                    str = "feed_timeline";
                } else {
                    str = "direct_inbox";
                }
                A002.AAP("container_module", str);
                NoteCustomThemeImpl noteCustomThemeImpl = c4fm.A05;
                if (noteCustomThemeImpl != null && (noteActivationType = noteCustomThemeImpl.A00) != null) {
                    str2 = noteActivationType.toString();
                } else {
                    str2 = null;
                }
                A002.AAP("note_activation_type", str2);
                A002.AAP("canonical_nav_chain", AbstractC25041Ki.A00);
                A002.Cht();
            }
        }
        if (C18U.A06(C06090Tz.A05, this.A06, 36327645138533113L)) {
            this.A0B.clear();
            return;
        }
        Iterator it = this.A0C.iterator();
        while (it.hasNext()) {
            A06(this, (C4F5) ((C09530e4) it.next()).A00, str3, ((Number) r0.A01).longValue());
        }
    }

    public final void A09(EnumC46284KeG enumC46284KeG) {
        C18920wW c18920wW = this.A05;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "direct_notes_create_format_tap_tray");
        if (A00.isSampled()) {
            A00.AAP("action", "");
            A00.A8R(enumC46284KeG, "selection");
            A00.Cht();
        }
    }

    public final void A0A(EnumC33477ErC enumC33477ErC, String str) {
        C18920wW c18920wW = this.A05;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "direct_notes_group_join_chat_button");
        if (A00.isSampled()) {
            A00.A8R(enumC33477ErC, "action");
            A00.AAP("open_thread_id", str);
            A00.Cht();
        }
    }

    public final void A0B(EnumC33457Eqs enumC33457Eqs) {
        C18920wW c18920wW = this.A05;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "direct_notes_group_request_to_join_chat_button");
        if (A00.isSampled()) {
            A00.A8R(enumC33457Eqs, "action");
            A00.Cht();
        }
    }

    public final void A0E(EnumC46303KeZ enumC46303KeZ) {
        C18920wW c18920wW = this.A05;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_direct_inbox_v2_item_interaction");
        if (A00.isSampled()) {
            A00.AAP("nav_chain", A02());
            A00.A8R(enumC46303KeZ, "action");
            A00.AAP("container_module", "feed_timeline");
            A00.AAP("canonical_nav_chain", AbstractC25041Ki.A00);
            A00.Cht();
        }
    }

    public final void A0F(EnumC46303KeZ enumC46303KeZ, JZB jzb, EnumC46273Ke5 enumC46273Ke5, Boolean bool, Boolean bool2, Boolean bool3, Long l, String str, String str2, String str3) {
        List list;
        Long l2;
        String str4;
        boolean z;
        C152706ty c152706ty = this.A01;
        if (c152706ty != null) {
            String str5 = this.A07.A00;
            if (!this.A04 && !c152706ty.A0C && str5 == null && c152706ty.A08 == null) {
                return;
            }
            C18920wW c18920wW = this.A05;
            InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_direct_inbox_v2_item_interaction");
            if (!A00.isSampled()) {
                return;
            }
            A00.AAP("nav_chain", A02());
            A00.A8R(enumC46303KeZ, "action");
            JZB jzb2 = null;
            A00.AAP("direct_session_id", null);
            A00.A8R(c152706ty.A02, AbstractC43591JPw.A00(216));
            if (bool2.equals(true)) {
                list = c152706ty.A0B;
            } else {
                list = null;
            }
            A00.AAk("content", list);
            A00.AAP("target_user_id", c152706ty.A09);
            A00.AAP(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, c152706ty.A0A);
            if (!c152706ty.A0C) {
                l2 = Long.valueOf(c152706ty.A00);
            } else {
                l2 = null;
            }
            A00.A9K("position", l2);
            int ordinal = enumC46303KeZ.ordinal();
            if (ordinal != 15 && ordinal != 11 && ordinal != 36 && ordinal != 8 && ordinal != 13) {
                str4 = c152706ty.A07;
            } else {
                str4 = null;
            }
            A00.AAP("note_id", str4);
            A00.A8R(jzb, "create_note_audience");
            A00.A9K("note_inventory_count", c152706ty.A06);
            if (l == null) {
                l = c152706ty.A05;
            }
            A00.A9K("audio_cluster_id", l);
            if (enumC46303KeZ != EnumC46303KeZ.A0V) {
                bool = null;
            }
            A00.A7v("is_e2ee", bool);
            NoteAudience noteAudience = c152706ty.A04;
            if (noteAudience != null) {
                jzb2 = AbstractC135966Db.A00(noteAudience);
            }
            A00.A8R(jzb2, "target_note_audience");
            A00.AAP(AbstractC43591JPw.A00(454), str);
            A00.A8R(enumC46273Ke5, "reaction_entrypoint");
            A00.A8R(c152706ty.A03, "interaction_source");
            if (str2 == null) {
                if (this.A04) {
                    str2 = "feed_timeline";
                } else {
                    str2 = "direct_inbox";
                }
            }
            A00.AAP("container_module", str2);
            A00.AAP("ranking_session_id", (String) this.A08.A0s.getValue());
            A00.A8R(c152706ty.A01, "ai_agent_type");
            A00.AAP("note_activation_type", str3);
            if (bool3 != null) {
                z = bool3.booleanValue();
            } else {
                z = false;
            }
            A00.A7v("selected_lyrics", Boolean.valueOf(z));
            A00.AAP("canonical_nav_chain", AbstractC25041Ki.A00);
            A00.Cht();
        }
    }

    public final void A0H(EnumC46290KeM enumC46290KeM) {
        C22945A9p c22945A9p = this.A00;
        if (c22945A9p != null) {
            C18920wW c18920wW = this.A05;
            InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_direct_inbox_v2_conversion");
            if (A00.isSampled()) {
                A00.AAP("nav_chain", A02());
                A00.AAP("target_user_id", c22945A9p.A03);
                A00.AAk("content", c22945A9p.A05);
                A00.AAP("direct_session_id", c22945A9p.A02);
                A00.A8R(enumC46290KeM, "conversion_type");
                A00.AAP(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, c22945A9p.A04);
                A00.A9K("position", Long.valueOf(c22945A9p.A00));
                A00.A7v("is_e2ee", c22945A9p.A01);
                A00.Cht();
            }
        }
    }

    public final void A0I(EnumC152696tw enumC152696tw) {
        C152706ty c152706ty;
        C152706ty c152706ty2 = this.A01;
        if (c152706ty2 != null) {
            String str = c152706ty2.A09;
            List list = c152706ty2.A0B;
            int i = c152706ty2.A00;
            String str2 = c152706ty2.A0A;
            String str3 = c152706ty2.A07;
            Long l = c152706ty2.A06;
            Long l2 = c152706ty2.A05;
            NoteAudience noteAudience = c152706ty2.A04;
            String str4 = c152706ty2.A08;
            boolean z = c152706ty2.A0C;
            c152706ty = new C152706ty(c152706ty2.A01, enumC152696tw, c152706ty2.A03, noteAudience, l, l2, str, str2, str3, str4, list, i, z);
        } else {
            c152706ty = null;
        }
        this.A01 = c152706ty;
    }

    public final void A0M(InterfaceC50424MOe interfaceC50424MOe) {
        String str;
        NoteAudience noteAudience;
        User user;
        C6C9 BXJ;
        EnumC152696tw enumC152696tw = EnumC152696tw.NOTE_BUBBLE;
        if (interfaceC50424MOe == null || (BXJ = interfaceC50424MOe.BXJ()) == null || (str = BXJ.A0K) == null) {
            str = this.A06.userId;
        }
        C16930sl c16930sl = C16930sl.A00;
        if (interfaceC50424MOe != null) {
            C6C9 BXJ2 = interfaceC50424MOe.BXJ();
            noteAudience = BFV.A00(Integer.valueOf(BXJ2.A00));
            user = BXJ2.A0D;
        } else {
            noteAudience = NoteAudience.A08;
            user = null;
        }
        this.A01 = new C152706ty(A00(user), enumC152696tw, null, noteAudience, null, null, str, null, null, null, c16930sl, 0, true);
    }

    public final void A0O(C4F5 c4f5, long j) {
        String str = this.A07.A00;
        if (str == null && !this.A04) {
            return;
        }
        String A03 = A03(c4f5);
        if (A03 == null) {
            A03 = c4f5.A0A.getId();
        }
        HashSet hashSet = this.A0B;
        if (hashSet.contains(A03)) {
            return;
        }
        A06(this, c4f5, str, j);
        hashSet.add(A03);
    }

    public final void A0P(C4F5 c4f5, long j) {
        C67s c67s;
        List list = c4f5.A0J;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            C6C9 BXJ = ((InterfaceC50424MOe) obj).BXJ();
            if (!C14360o3.A0K(BXJ.A0D.getId(), this.A06.userId) || ((c67s = BXJ.A0A) != null && c67s.A08 != null)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC06950Ym.A1E(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((InterfaceC50424MOe) it.next()).BXJ().A0H);
        }
        for (Object obj2 : AbstractC001800i.A0W(arrayList2)) {
            if (!this.A0A.contains(obj2)) {
                this.A09.put(obj2, Long.valueOf(j));
            }
        }
    }

    public final void A0Q(NoteStyle noteStyle, boolean z, boolean z2) {
        JZA jza;
        C152706ty c152706ty;
        ArrayList arrayList = new ArrayList();
        switch (noteStyle.ordinal()) {
            case 1:
                if (z) {
                    arrayList.add(JZA.PROMPT_NOTE);
                    jza = JZA.PROMPT_RESPONSE_NOTE;
                    break;
                } else {
                    jza = JZA.NOTE;
                    break;
                }
            case 2:
                jza = JZA.MUSIC_NOTE;
                break;
            case 5:
                jza = JZA.LOCATION_NOTE;
                break;
            case 9:
                jza = JZA.NOTE_CHAT;
                break;
            case 10:
                jza = JZA.LISTENING_NOW;
                break;
            case 11:
                jza = JZA.GIF_NOTE;
                break;
        }
        arrayList.add(jza);
        if (z2) {
            arrayList.add(JZA.FRIEND_MAP_NOTE);
        }
        C152706ty c152706ty2 = this.A01;
        if (c152706ty2 != null) {
            EnumC152696tw enumC152696tw = c152706ty2.A02;
            String str = c152706ty2.A09;
            int i = c152706ty2.A00;
            String str2 = c152706ty2.A0A;
            String str3 = c152706ty2.A07;
            Long l = c152706ty2.A06;
            Long l2 = c152706ty2.A05;
            NoteAudience noteAudience = c152706ty2.A04;
            String str4 = c152706ty2.A08;
            boolean z3 = c152706ty2.A0C;
            c152706ty = new C152706ty(c152706ty2.A01, enumC152696tw, c152706ty2.A03, noteAudience, l, l2, str, str2, str3, str4, arrayList, i, z3);
        } else {
            c152706ty = null;
        }
        this.A01 = c152706ty;
    }

    public final void A0R(Double d, Double d2, Integer num, int i, int i2) {
        String str;
        Long l;
        C18920wW c18920wW = this.A05;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_direct_inbox_v2_impression");
        if (A00.isSampled()) {
            A00.AAP("nav_chain", A02());
            A00.A9K("note_inventory_count", Long.valueOf(i));
            A00.A9K("total_inventory_count", Long.valueOf(i2));
            if (this.A04) {
                str = "feed_timeline";
            } else {
                str = "direct_inbox";
            }
            A00.AAP("container_module", str);
            if (num != null) {
                l = Long.valueOf(num.intValue());
            } else {
                l = null;
            }
            A00.A9K("client_position", l);
            A00.A8I("dwell_time_ms", d);
            A00.A8I("percent_viewed", d2);
            A00.AAP("ranking_session_id", (String) this.A08.A0s.getValue());
            A00.AAP("canonical_nav_chain", AbstractC25041Ki.A00);
            A00.Cht();
        }
    }

    public final void A0S(Long l, String str, double d, long j, boolean z) {
        Double d2;
        C152706ty c152706ty = this.A01;
        if (c152706ty != null) {
            C18920wW c18920wW = this.A05;
            InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_note_reply_sheet_impression");
            if (A00.isSampled()) {
                A00.AAP("container_module", str);
                A00.A8I("dwell_time_ms", Double.valueOf(d));
                A00.A9K("note_id", Long.valueOf(j));
                A00.A9K("target_ig_id", Long.valueOf(Long.parseLong(c152706ty.A09)));
                A00.A9K("note_position", Long.valueOf(c152706ty.A00));
                if (l != null) {
                    d2 = Double.valueOf(d - l.longValue());
                } else {
                    d2 = null;
                }
                A00.A8I("dwell_time_ms_since_first_keystroke", d2);
                A00.A7v("has_try_it", Boolean.valueOf(z));
                A00.AAP("canonical_nav_chain", AbstractC25041Ki.A00);
                A00.Cht();
            }
        }
    }

    public final void A0T(String str, String str2) {
        C18920wW c18920wW = this.A05;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_notes_item_effect_impression");
        if (A00.isSampled()) {
            A00.AAP("trigger", str);
            A00.AAP("visual_effect_type", str2);
            A00.Cht();
        }
    }

    @Override // X.InterfaceC13050lr
    public final void onUserSessionWillEnd(boolean z) {
        C10190gb A00 = C10190gb.A00();
        Object value = this.A0E.getValue();
        if (value != null) {
            A00.A00.remove(value);
        }
        this.A0C.clear();
        this.A09.clear();
        this.A0A.clear();
        this.A0D.clear();
        this.A03.clear();
        this.A00 = null;
        this.A01 = null;
        this.A02 = null;
    }
}
