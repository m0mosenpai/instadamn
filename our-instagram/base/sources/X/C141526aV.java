package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.6aV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C141526aV {
    public H8N A00;
    public InterfaceC41501vz A01;
    public C141596ac A02;
    public Integer A03;
    public final long A04;
    public final InterfaceC11380iw A05;
    public final UserSession A06;
    public final String A07;
    public final AtomicBoolean A08;

    public C141526aV(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(str, 2);
        this.A06 = userSession;
        this.A07 = str;
        this.A05 = interfaceC11380iw;
        this.A08 = new AtomicBoolean(false);
        this.A04 = (long) (C18U.A00(C06090Tz.A06, userSession, 37168105813705171L) * 1000.0d);
        this.A03 = C05F.A00;
    }

    public static final void A00(C141526aV c141526aV) {
        OIq oIq;
        C141596ac c141596ac = c141526aV.A02;
        if (c141596ac != null && (oIq = c141596ac.A0R) != null && oIq.A02 == C05F.A01) {
            long j = oIq.A01;
            if (c141526aV.A03 == C05F.A00) {
                j -= c141526aV.A04;
                if (j < 0) {
                    j = 0;
                }
            }
            H8N h8n = c141526aV.A00;
            if (h8n != null) {
                h8n.Cm9(j);
            }
        }
    }

    public final void A01() {
        C141596ac c141596ac = this.A02;
        if (c141596ac != null) {
            c141596ac.A0R = null;
        }
        this.A02 = null;
        InterfaceC41501vz interfaceC41501vz = this.A01;
        if (interfaceC41501vz != null) {
            AbstractC25651Mw.A00(this.A06).A02(interfaceC41501vz, C42237InN.class);
        }
        this.A01 = null;
    }
}
