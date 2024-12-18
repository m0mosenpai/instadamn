package com.instagram.wellbeing.quietmode.repository;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC23611Dp;
import X.AbstractC25225BEi;
import X.AbstractC31171DnF;
import X.AbstractC31177DnL;
import X.AbstractC43591JPw;
import X.AbstractC43592JPx;
import X.AnonymousClass280;
import X.B4Z;
import X.C0eB;
import X.C14360o3;
import X.C194848jk;
import X.C1JX;
import X.C25621Ms;
import X.C3NX;
import X.C54811OKk;
import X.InterfaceC16660sJ;
import X.InterfaceC19610xo;
import X.InterfaceC23621Ds;
import X.InterfaceC58092PpH;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.json.JSONArray;
import org.json.JSONObject;

@DebugMetadata(c = "com.instagram.wellbeing.quietmode.repository.QuietModeRepository$updateQuietModeWithWindows$2", f = "QuietModeRepository.kt", i = {}, l = {48}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class QuietModeRepository$updateQuietModeWithWindows$2 extends AbstractC23611Dp implements InterfaceC16660sJ {
    public int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ User A03;
    public final /* synthetic */ InterfaceC58092PpH A04;
    public final /* synthetic */ C54811OKk A05;
    public final /* synthetic */ Long A06;
    public final /* synthetic */ Long A07;
    public final /* synthetic */ List A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuietModeRepository$updateQuietModeWithWindows$2(User user, InterfaceC58092PpH interfaceC58092PpH, C54811OKk c54811OKk, Long l, Long l2, List list, InterfaceC23621Ds interfaceC23621Ds, long j, long j2, boolean z, boolean z2) {
        super(1, interfaceC23621Ds);
        this.A05 = c54811OKk;
        this.A0A = z;
        this.A02 = j;
        this.A01 = j2;
        this.A09 = z2;
        this.A07 = l;
        this.A06 = l2;
        this.A08 = list;
        this.A03 = user;
        this.A04 = interfaceC58092PpH;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(InterfaceC23621Ds interfaceC23621Ds) {
        C54811OKk c54811OKk = this.A05;
        boolean z = this.A0A;
        long j = this.A02;
        long j2 = this.A01;
        boolean z2 = this.A09;
        return new QuietModeRepository$updateQuietModeWithWindows$2(this.A03, this.A04, c54811OKk, this.A07, this.A06, this.A08, interfaceC23621Ds, j, j2, z, z2);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((QuietModeRepository$updateQuietModeWithWindows$2) create((InterfaceC23621Ds) obj)).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        JSONObject A0q;
        C0eB c0eB;
        Object obj2 = obj;
        C1JX c1jx = C1JX.A02;
        if (this.A00 != 0) {
            AbstractC09560e7.A00(obj2);
        } else {
            AbstractC09560e7.A00(obj2);
            UserSession userSession = this.A05.A01;
            boolean z = this.A0A;
            long j = this.A02;
            long j2 = this.A01;
            boolean z2 = this.A09;
            Long l = this.A07;
            Long l2 = this.A06;
            List list = this.A08;
            this.A00 = 1;
            InterfaceC19610xo ARD = AnonymousClass280.A01.A06(userSession).ARD();
            ARD.E77("HAS_EVER_ENABLED_QUIET_MODE", true);
            ARD.apply();
            JSONArray A0p = AbstractC31171DnF.A0p();
            if (list != null) {
                JSONArray A0p2 = AbstractC31171DnF.A0p();
                A0q = AbstractC31171DnF.A0q();
                A0q.put(TraceFieldType.StartTime, j);
                A0q.put("end_time", j2);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    A0p2.put(it.next());
                }
                A0q.put("days", A0p2);
            } else {
                A0q = AbstractC31171DnF.A0q();
                A0q.put(TraceFieldType.StartTime, j);
                A0q.put("end_time", j2);
            }
            A0p.put(A0q);
            String A19 = AbstractC166987dD.A19(A0p);
            C25621Ms A0c = AbstractC167017dG.A0c(userSession);
            A0c.A0B("mental_well_being/update_quiet_time_window/");
            A0c.A0I("quiet_mode_enabled", z);
            A0c.A9s("quiet_time_windows", A19);
            String id = TimeZone.getDefault().getID();
            C14360o3.A07(id);
            A0c.A9s("last_seen_timezone", id);
            if (l != null && l2 != null) {
                long longValue = l.longValue();
                long longValue2 = l2.longValue();
                JSONObject A0q2 = AbstractC31171DnF.A0q();
                A0q2.put("start_timestamp", longValue);
                A0q2.put(AbstractC43591JPw.A00(38), longValue2);
                A0c.A9s("pause_window", AbstractC166987dD.A19(A0q2));
                A0c.A0I("cancel_pause_window", z2);
            }
            obj2 = AbstractC31177DnL.A0Q(A0c).A00(1440554863, this);
            if (obj2 == c1jx) {
                return c1jx;
            }
        }
        Object obj3 = obj2;
        User user = this.A03;
        boolean z3 = this.A0A;
        InterfaceC58092PpH interfaceC58092PpH = this.A04;
        long j3 = this.A02;
        long j4 = this.A01;
        Long l3 = this.A07;
        Long l4 = this.A06;
        C0eB c0eB2 = null;
        if (obj2 instanceof C3NX) {
            user.A1A(z3);
            if (interfaceC58092PpH != null) {
                interfaceC58092PpH.DqU(l3, l4, j3, j4, z3);
                c0eB = C0eB.A00;
            } else {
                c0eB = null;
            }
            obj3 = AbstractC25225BEi.A0z(c0eB);
        } else if (!(obj2 instanceof C194848jk)) {
            throw B4Z.A00();
        }
        if (!(obj3 instanceof C3NX)) {
            if (obj3 instanceof C194848jk) {
                if (interfaceC58092PpH != null) {
                    interfaceC58092PpH.DEO(l3, l4, j3, j4, !z3);
                    c0eB2 = C0eB.A00;
                }
                return AbstractC43592JPx.A0p(c0eB2);
            }
            throw B4Z.A00();
        }
        return obj3;
    }
}
