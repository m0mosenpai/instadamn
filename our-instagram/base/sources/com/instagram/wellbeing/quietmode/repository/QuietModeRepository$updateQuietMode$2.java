package com.instagram.wellbeing.quietmode.repository;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC23611Dp;
import X.AbstractC25225BEi;
import X.AbstractC31171DnF;
import X.AbstractC31178DnM;
import X.AbstractC43592JPx;
import X.AnonymousClass280;
import X.B4Z;
import X.C06090Tz;
import X.C0eB;
import X.C14360o3;
import X.C18U;
import X.C194848jk;
import X.C1JX;
import X.C25621Ms;
import X.C3NX;
import X.C54811OKk;
import X.InterfaceC16660sJ;
import X.InterfaceC19610xo;
import X.InterfaceC23621Ds;
import X.InterfaceC58007Pnr;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.TimeZone;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.json.JSONArray;
import org.json.JSONObject;

@DebugMetadata(c = "com.instagram.wellbeing.quietmode.repository.QuietModeRepository$updateQuietMode$2", f = "QuietModeRepository.kt", i = {}, l = {26}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class QuietModeRepository$updateQuietMode$2 extends AbstractC23611Dp implements InterfaceC16660sJ {
    public int A00;
    public final /* synthetic */ User A01;
    public final /* synthetic */ InterfaceC58007Pnr A02;
    public final /* synthetic */ C54811OKk A03;
    public final /* synthetic */ boolean A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuietModeRepository$updateQuietMode$2(User user, InterfaceC58007Pnr interfaceC58007Pnr, C54811OKk c54811OKk, InterfaceC23621Ds interfaceC23621Ds, boolean z) {
        super(1, interfaceC23621Ds);
        this.A03 = c54811OKk;
        this.A04 = z;
        this.A01 = user;
        this.A02 = interfaceC58007Pnr;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(InterfaceC23621Ds interfaceC23621Ds) {
        return new QuietModeRepository$updateQuietMode$2(this.A01, this.A02, this.A03, interfaceC23621Ds, this.A04);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((QuietModeRepository$updateQuietMode$2) create((InterfaceC23621Ds) obj)).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C0eB c0eB;
        C1JX c1jx = C1JX.A02;
        if (this.A00 != 0) {
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            UserSession userSession = this.A03.A01;
            boolean z = this.A04;
            this.A00 = 1;
            InterfaceC19610xo ARD = AnonymousClass280.A01.A06(userSession).ARD();
            ARD.E77("HAS_EVER_ENABLED_QUIET_MODE", true);
            ARD.apply();
            C25621Ms A0c = AbstractC167017dG.A0c(userSession);
            A0c.A0B("mental_well_being/update_quiet_time_window/");
            A0c.A0I("quiet_mode_enabled", z);
            C06090Tz c06090Tz = C06090Tz.A05;
            long A01 = C18U.A01(c06090Tz, userSession, 36597454984186702L);
            long A012 = C18U.A01(c06090Tz, userSession, 36597454984055629L);
            JSONArray A0p = AbstractC31171DnF.A0p();
            JSONObject A0q = AbstractC31171DnF.A0q();
            A0q.put(TraceFieldType.StartTime, A01);
            A0q.put("end_time", A012);
            A0p.put(A0q);
            A0c.A9s("quiet_time_windows", AbstractC166987dD.A19(A0p));
            String id = TimeZone.getDefault().getID();
            C14360o3.A07(id);
            obj = AbstractC31178DnM.A0K(A0c, "last_seen_timezone", id).A00(1440554863, this);
            if (obj == c1jx) {
                return c1jx;
            }
        }
        User user = this.A01;
        boolean z2 = this.A04;
        InterfaceC58007Pnr interfaceC58007Pnr = this.A02;
        C0eB c0eB2 = null;
        if (obj instanceof C3NX) {
            user.A1A(z2);
            if (interfaceC58007Pnr != null) {
                interfaceC58007Pnr.DqJ(z2);
                c0eB = C0eB.A00;
            } else {
                c0eB = null;
            }
            obj = AbstractC25225BEi.A0z(c0eB);
        } else if (!(obj instanceof C194848jk)) {
            throw B4Z.A00();
        }
        if (!(obj instanceof C3NX)) {
            if (obj instanceof C194848jk) {
                if (interfaceC58007Pnr != null) {
                    c0eB2 = C0eB.A00;
                }
                return AbstractC43592JPx.A0p(c0eB2);
            }
            throw B4Z.A00();
        }
        return obj;
    }
}
