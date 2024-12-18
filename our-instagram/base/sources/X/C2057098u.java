package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.notes.NotesRepository;
import com.instagram.direct.store.InboxNetworkSource;
import java.util.Map;

/* renamed from: X.98u, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2057098u implements InterfaceC12870lZ, InterfaceC13000lm {
    public static final IntentFilter A0J = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final BroadcastReceiver A06 = new BroadcastReceiver() { // from class: X.990
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            int A01 = C0f9.A01(1290725005);
            C0fM.A01(this, context, intent);
            C14360o3.A0B(context, 0);
            C14360o3.A0B(intent, 1);
            C2057098u c2057098u = C2057098u.this;
            C2057098u.A02(c2057098u, C05F.A02, c2057098u.A00, false, false, true, false);
            C0f9.A0E(1211219713, A01, intent);
        }
    };
    public final Context A07;
    public final UserSession A08;
    public final InboxNetworkSource A09;
    public final InboxNetworkSource A0A;
    public final Map A0B;
    public final InterfaceC09390do A0C;
    public final boolean A0D;
    public final C25671My A0E;
    public final C218914p A0F;
    public final AnonymousClass991 A0G;
    public final AnonymousClass992 A0H;
    public final C2DS A0I;

    public static final void A00(C2057098u c2057098u) {
        c2057098u.A02 = true;
        A02(c2057098u, C05F.A02, false, false, false, false, false);
        if (c2057098u.A01) {
            c2057098u.A07.unregisterReceiver(c2057098u.A06);
            c2057098u.A01 = false;
        }
        c2057098u.A0I.ELj();
    }

    public final synchronized void A03() {
        if (this.A00 && this.A03 && (this.A04 || this.A05)) {
            this.A09.A06(AbstractC001800i.A0a(C4I4.A00(this.A08).A00));
        }
    }

    public final synchronized void A04(Integer num) {
        if (this.A00 && this.A03 && (this.A04 || this.A05)) {
            this.A09.A05(num, false, false, false);
        }
    }

    @Override // X.InterfaceC13000lm
    public final synchronized void onSessionWillEnd() {
        if (this.A01) {
            this.A07.unregisterReceiver(this.A06);
            this.A01 = false;
        }
        C218914p.A06(this);
        C25671My c25671My = this.A0E;
        c25671My.A02(this.A0G, C2Im.class);
        c25671My.A02(this.A0H, C4HA.class);
        synchronized (this.A09) {
        }
        synchronized (this.A0A) {
        }
        this.A0B.clear();
    }

    public static final void A01(C2057098u c2057098u) {
        A02(c2057098u, C05F.A0j, true, false, true, false, false);
        if (!c2057098u.A01) {
            boolean z = false;
            if (C0DJ.A00(c2057098u.A06, c2057098u.A07, A0J) != null) {
                z = true;
            }
            c2057098u.A01 = z;
        }
    }

    public static final void A02(C2057098u c2057098u, Integer num, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean A0E;
        UserSession userSession = c2057098u.A08;
        C06090Tz c06090Tz = C06090Tz.A05;
        boolean A06 = C18U.A06(c06090Tz, userSession, 36318033004992344L);
        Context context = c2057098u.A07;
        if (A06) {
            A0E = AbstractC15820qc.A0F(context);
        } else {
            A0E = AbstractC15820qc.A0E(context);
        }
        C28741aC c28741aC = ((C2DU) c2057098u.A0I).A0H;
        boolean z6 = c28741aC.A0F;
        boolean z7 = c28741aC.A0I;
        if (z) {
            if (!c2057098u.A03 && A0E && C18U.A06(c06090Tz, userSession, 36326300813637436L)) {
                NotesRepository A00 = C4A5.A00(userSession);
                A00.A06.A0W(true);
                C19L c19l = ((C4A7) A00).A01;
                C206649Cv c206649Cv = new C206649Cv(A00, null, 12);
                AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c206649Cv, c19l);
            }
            if ((!c2057098u.A03 || ((!c2057098u.A00 && c2057098u.A02) || !c2057098u.A04)) && A0E && (z6 || z7)) {
                if (!z2) {
                    c2057098u.A09.A05(num, z3, z4, z5);
                }
                synchronized (c2057098u) {
                    long currentTimeMillis = System.currentTimeMillis() - AbstractC2056298m.A00(userSession).A00.getLong(AnonymousClass001.A0O("broadcast_channel_inbox_last_synced_time_millis_", 3), 0L);
                    long A01 = C18U.A01(c06090Tz, userSession, 36597321842756388L);
                    if (C18U.A06(c06090Tz, userSession, 36319377327070507L) && currentTimeMillis >= A01 * 1000) {
                        c2057098u.A09.A03();
                    }
                }
                if (z5 && C18U.A06(c06090Tz, userSession, 36316053021659043L) && C18U.A06(c06090Tz, userSession, 36323178372475961L) && C18U.A06(c06090Tz, userSession, 36323178372541498L)) {
                    C4A5.A00(userSession).A0D();
                }
            }
        }
        c2057098u.A03 = A0E;
        c2057098u.A00 = z;
        c2057098u.A04 = z6;
        c2057098u.A05 = z7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.992, X.1vz] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.1vz, X.991] */
    public C2057098u(Context context, C25671My c25671My, C218914p c218914p, UserSession userSession, InboxNetworkSource inboxNetworkSource, InboxNetworkSource inboxNetworkSource2, C2DS c2ds, Map map) {
        this.A07 = context;
        this.A08 = userSession;
        this.A0E = c25671My;
        this.A09 = inboxNetworkSource;
        this.A0A = inboxNetworkSource2;
        this.A0B = map;
        this.A0F = c218914p;
        this.A0I = c2ds;
        C14360o3.A0B(userSession, 0);
        this.A0D = C18U.A06(C06090Tz.A05, userSession, 36328186305002808L);
        ?? r3 = new InterfaceC41501vz() { // from class: X.991
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int A03 = C0f9.A03(-1402639509);
                int A032 = C0f9.A03(-129061016);
                C2057098u c2057098u = C2057098u.this;
                boolean z = c2057098u.A00;
                boolean z2 = false;
                if (c2057098u.A0D) {
                    z2 = true;
                }
                C2057098u.A02(c2057098u, C05F.A0u, z, z2, false, false, true);
                C0f9.A0A(-1987420664, A032);
                C0f9.A0A(-930006163, A03);
            }
        };
        this.A0G = r3;
        ?? r2 = new InterfaceC41501vz() { // from class: X.992
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int A03 = C0f9.A03(335912216);
                int A032 = C0f9.A03(-1088937888);
                C2057098u c2057098u = C2057098u.this;
                boolean z = c2057098u.A00;
                boolean z2 = false;
                if (c2057098u.A0D) {
                    z2 = true;
                }
                C2057098u.A02(c2057098u, C05F.A0u, z, z2, false, false, true);
                C0f9.A0A(515300433, A032);
                C0f9.A0A(380607031, A03);
            }
        };
        this.A0H = r2;
        this.A03 = true;
        this.A0C = AbstractC09440dt.A00(EnumC09460dv.A02, AnonymousClass993.A00);
        C218914p.A03(EnumC220415e.A03, this);
        if (!C218914p.A08()) {
            onAppForegrounded();
        }
        c25671My.A01(r3, C2Im.class);
        c25671My.A01(r2, C4HA.class);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        int A03 = C0f9.A03(-1985926746);
        if (((Boolean) AbstractC15930qn.A02.A03.invoke()).booleanValue()) {
            AbstractC23641Du.A05(C12L.A00.CPG(1769849310, 3), new MC2(this, null, 15), (C19L) this.A0C.getValue());
        } else {
            A00(this);
        }
        C0f9.A0A(-1834968834, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        int A03 = C0f9.A03(-755579146);
        if (((Boolean) AbstractC15930qn.A02.A03.invoke()).booleanValue()) {
            C19L c19l = (C19L) this.A0C.getValue();
            AbstractC23641Du.A03(C05F.A00, C12L.A00.CPG(1769849310, 3), new C206629Ct(this, null, 23), c19l);
        } else {
            A01(this);
        }
        C0f9.A0A(-74090785, A03);
    }
}
