package com.instagram.direct.store;

import X.AbstractC06950Ym;
import X.AbstractC12220kQ;
import X.AbstractC125565m2;
import X.AbstractC1337462f;
import X.AbstractC16960so;
import X.AbstractC2056298m;
import X.AbstractC2057298w;
import X.AbstractC23641Du;
import X.AbstractC46972Dl;
import X.AbstractC92994Ew;
import X.AnonymousClass001;
import X.AnonymousClass191;
import X.AnonymousClass194;
import X.AnonymousClass777;
import X.AnonymousClass935;
import X.C05F;
import X.C06090Tz;
import X.C11R;
import X.C125575m3;
import X.C12L;
import X.C1337562g;
import X.C1337662h;
import X.C14360o3;
import X.C16930sl;
import X.C18920wW;
import X.C18U;
import X.C19K;
import X.C1GJ;
import X.C1GL;
import X.C1ON;
import X.C2056398n;
import X.C25621Ms;
import X.C25671My;
import X.C2DS;
import X.C2DU;
import X.C2EB;
import X.C2EC;
import X.C44143Jf8;
import X.C45393K8g;
import X.C46922Dg;
import X.C47062Du;
import X.C48022Ip;
import X.C4I3;
import X.C4I4;
import X.C71473Il;
import X.C99P;
import X.C99W;
import X.C9D4;
import X.EnumC46248KdP;
import X.InterfaceC11380iw;
import X.InterfaceC19610xo;
import X.InterfaceC23621Ds;
import X.K8J;
import X.LCO;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.notes.NotesRepository;
import com.instagram.direct.store.InboxNetworkSource;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* loaded from: classes4.dex */
public final class InboxNetworkSource {
    public InterfaceC11380iw A00;
    public String A01;
    public String A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final C25671My A06;
    public final UserSession A07;
    public final AbstractC46972Dl A08;
    public final C46922Dg A09;
    public final C2EB A0A;
    public final C2DS A0B;
    public final NotesRepository A0E;
    public final C1GL A0D = C1GJ.A01();
    public final Set A0C = new HashSet();
    public final List A0F = AbstractC16960so.A1N("ONE_ROW_POGS", "ONE_ROW_POGS_V2", "TWO_ROW_POGS", "CARDS", "HYBRID");

    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(final com.instagram.direct.store.InboxNetworkSource r15, java.util.List r16, X.InterfaceC23621Ds r17) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.store.InboxNetworkSource.A00(com.instagram.direct.store.InboxNetworkSource, java.util.List, X.1Ds):java.lang.Object");
    }

    public final void A04(C4I3 c4i3, List list) {
        C14360o3.A0B(c4i3, 1);
        UserSession userSession = this.A07;
        AbstractC46972Dl abstractC46972Dl = this.A08;
        AnonymousClass777 A00 = C99W.A00(userSession, abstractC46972Dl, null, false, null, null, null, null, this.A02, C99P.A01(userSession, abstractC46972Dl.A01, c4i3), this.A0A.A00, null, UUID.randomUUID().toString(), AbstractC2057298w.A01(list), -1L);
        A00.A00(new C45393K8g(userSession, this, false));
        A01(A00, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.3Il] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public final void A06(List list) {
        ?? r3;
        final UserSession userSession = this.A07;
        if (C18U.A06(C06090Tz.A05, userSession, 36326940763764940L)) {
            C19K A02 = AnonymousClass194.A02(C12L.A00.CPG(431, 3));
            C9D4 c9d4 = new C9D4(list, this, (InterfaceC23621Ds) null, 1);
            AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c9d4, A02);
            return;
        }
        C18920wW A01 = AbstractC12220kQ.A01(this.A00, userSession);
        A01.A00(A01.A00, "direct_http_fetch_pending_request").Cht();
        if (AbstractC1337462f.A0A(userSession, false)) {
            r3 = new ArrayList(AbstractC06950Ym.A1E(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                r3.add(Integer.valueOf(((EnumC46248KdP) it.next()).A00));
            }
        } else {
            r3 = C16930sl.A00;
        }
        String A0g = AnonymousClass001.A0g("[", new C71473Il(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1).A02(r3), "]");
        C25621Ms c25621Ms = new C25621Ms(userSession);
        c25621Ms.A09(C05F.A0N);
        c25621Ms.A0B("direct_v2/async_get_pending_requests_preview/");
        c25621Ms.A0S(C1337562g.class, C1337662h.class);
        c25621Ms.A9s("pending_inbox_filters", A0g);
        c25621Ms.A0U = false;
        C1ON A0N = c25621Ms.A0N();
        A0N.A00 = new AnonymousClass935(userSession) { // from class: X.62i
            @Override // X.AnonymousClass935
            public final /* bridge */ /* synthetic */ void A06(UserSession userSession2, Object obj) {
                int A03 = C0f9.A03(1525574551);
                C1337562g c1337562g = (C1337562g) obj;
                int A032 = C0f9.A03(1414591312);
                C14360o3.A0B(c1337562g, 1);
                InboxNetworkSource.A02(this, c1337562g.A00, c1337562g.A01);
                C0f9.A0A(883672329, A032);
                C0f9.A0A(1386235580, A03);
            }

            @Override // X.AnonymousClass935, X.C1P1
            public final void onFailInBackground(AbstractC115105If abstractC115105If) {
                int A03 = C0f9.A03(493854664);
                C14360o3.A0B(abstractC115105If, 0);
                super.onFailInBackground(abstractC115105If);
                InboxNetworkSource inboxNetworkSource = this;
                C18920wW A012 = AbstractC12220kQ.A01(inboxNetworkSource.A00, inboxNetworkSource.A07);
                A012.A00(A012.A00, "direct_http_fetch_pending_request_fail").Cht();
                C0f9.A0A(-54812339, A03);
            }
        };
        A01(A0N, this);
    }

    public static final void A01(C11R c11r, InboxNetworkSource inboxNetworkSource) {
        inboxNetworkSource.A0D.schedule(c11r, c11r.getRunnableId(), 3, true, false);
    }

    public static final void A02(InboxNetworkSource inboxNetworkSource, int i, int i2) {
        if (AbstractC125565m2.A00(inboxNetworkSource.A0A) == C4I3.A03) {
            C46922Dg c46922Dg = inboxNetworkSource.A09;
            c46922Dg.A0K(i);
            c46922Dg.A0M(C125575m3.A00, i2, 0, false);
        }
        inboxNetworkSource.A06.E4s(new C48022Ip(null, false, false, true));
    }

    public final void A03() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (C2EC c2ec : ((C2DU) this.A0B).A0C.A0G(C47062Du.A00, C2EB.A04, C4I3.A03)) {
            if (c2ec.C7g() == 29) {
                arrayList.add(c2ec.C7I());
                arrayList2.add(Long.valueOf(c2ec.BLF() / 1000));
            }
        }
        if (!arrayList.isEmpty()) {
            UserSession userSession = this.A07;
            C2056398n A00 = AbstractC2056298m.A00(userSession);
            long currentTimeMillis = System.currentTimeMillis();
            InterfaceC19610xo ARD = A00.A00.ARD();
            ARD.E7G(AnonymousClass001.A0O("broadcast_channel_inbox_last_synced_time_millis_", 3), currentTimeMillis);
            ARD.apply();
            Number number = (Number) arrayList2.get(arrayList2.size() - 1);
            C25621Ms c25621Ms = new C25621Ms(userSession);
            c25621Ms.A09(C05F.A0N);
            c25621Ms.A0B("direct_v2/inbox/broadcast/fetch_inbox_updates/");
            c25621Ms.A9s("ig_thread_ids", AnonymousClass001.A0g("[", C71473Il.A00(',').A02(arrayList), "]"));
            c25621Ms.A9s("thread_timestamps_ms", AnonymousClass001.A0g("[", C71473Il.A00(',').A02(arrayList2), "]"));
            c25621Ms.A0E("cursor_timestamp_ms", number.longValue());
            c25621Ms.A0D("inbox_folder", 3);
            c25621Ms.A0S(K8J.class, LCO.class);
            C1ON A0N = c25621Ms.A0N();
            A0N.A00 = new C44143Jf8(userSession, this);
            A01(A0N, this);
        }
    }

    public final void A05(Integer num, boolean z, boolean z2, boolean z3) {
        UserSession userSession = this.A07;
        A06(new ArrayList(C4I4.A00(userSession).A00));
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36316053021659043L) && this.A0F.contains(C18U.A04(c06090Tz, userSession, 36879002975142122L)) && !z && !z2 && (!z3 || !C18U.A06(c06090Tz, userSession, 36323178372410424L))) {
            this.A0E.A0N(num, null, false, true);
        }
        if (this.A0F.contains(C18U.A04(c06090Tz, userSession, 36879002975142122L)) && !z && !z2) {
            AbstractC92994Ew.A00(userSession).A02(false);
        }
    }

    public InboxNetworkSource(C25671My c25671My, UserSession userSession, NotesRepository notesRepository, AbstractC46972Dl abstractC46972Dl, C2EB c2eb, C2DS c2ds) {
        this.A07 = userSession;
        this.A06 = c25671My;
        this.A0B = c2ds;
        this.A0E = notesRepository;
        this.A08 = abstractC46972Dl;
        this.A0A = c2eb;
        this.A09 = ((C2DU) c2ds).A0C;
    }
}
