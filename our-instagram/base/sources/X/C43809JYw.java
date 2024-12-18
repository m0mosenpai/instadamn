package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.JYw, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43809JYw extends C98O {
    public AbstractC46972Dl A00;
    public Long A01;
    public List A02;
    public boolean A03;
    public boolean A04;
    public final C69613Av A05;
    public final C69613Av A06;
    public final C69613Av A07;
    public final C69613Av A08;
    public final C69613Av A09;
    public final C69613Av A0A;
    public final boolean A0B;
    public final boolean A0C;

    @Override // X.JQS
    public final void A0L() {
        C69613Av c69613Av;
        if (C18U.A06(C06090Tz.A05, ((C98O) this).A07, 36323968647245555L) && !this.A03 && !this.A04 && (c69613Av = this.A08) != null) {
            c69613Av.A03();
        }
        super.A0L();
    }

    @Override // X.JQS
    public final boolean A0R() {
        return !this.A0B;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43809JYw(UserSession userSession, AbstractC46972Dl abstractC46972Dl, Boolean bool, boolean z, boolean z2, boolean z3) {
        super(userSession, "threads", 31784971, z, false);
        C69613Av c69613Av;
        C69613Av c69613Av2;
        C69613Av c69613Av3;
        C14360o3.A0B(userSession, 1);
        this.A0B = z2;
        this.A0C = z3;
        this.A00 = abstractC46972Dl;
        if (z3 && bool != null && !bool.booleanValue()) {
            c69613Av = new C69613Av(this, "msys_db_access");
            ((AbstractC69603Au) this).A06.add(c69613Av);
        } else {
            c69613Av = null;
        }
        this.A09 = c69613Av;
        if (bool != null && !bool.booleanValue()) {
            c69613Av2 = A02("first_threads_snapshot");
        } else {
            c69613Av2 = null;
        }
        this.A06 = c69613Av2;
        this.A05 = A02("awaiting_iris_deltas");
        C69613Av c69613Av4 = new C69613Av(this, "on_view_created");
        ((AbstractC69603Au) this).A06.add(c69613Av4);
        this.A0A = c69613Av4;
        UserSession userSession2 = ((C98O) this).A07;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession2, 36323968647245555L)) {
            c69613Av3 = A02("mem_offline_sync");
        } else {
            c69613Av3 = null;
        }
        this.A08 = c69613Av3;
        this.A07 = C18U.A06(c06090Tz, userSession2, 36323968647245555L) ? A02("iris_sub_message_sync") : null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c2, code lost:
    
        if (r1 == null) goto L39;
     */
    @Override // X.C98O, X.AbstractC69603Au
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A05() {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43809JYw.A05():void");
    }

    public final void A0S(long j) {
        C69613Av c69613Av;
        A0I("total_delta_count", Long.valueOf(j));
        if (j == 0 && (c69613Av = this.A07) != null) {
            c69613Av.A05();
        }
    }
}
