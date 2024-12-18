package X;

import android.content.Context;
import android.util.SparseArray;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Map;

@Deprecated
/* renamed from: X.AoE, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24191AoE implements InterfaceC25213BDl {
    public ABR A00;
    public C23015ACp A01;
    public boolean A02;
    public int A03;
    public int A04;
    public AnonymousClass815 A05;
    public InterfaceC197718oi A06;
    public final int A07;
    public final Context A08;
    public final UserSession A0A;
    public final C22979ABd A0B;
    public final List A0D;
    public final Map A0E;
    public final SparseArray A09 = new SparseArray();
    public final BCH A0C = new Object();

    @Override // X.InterfaceC25213BDl
    public final int BlX() {
        List list = this.A0D;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // X.InterfaceC25213BDl
    public final void EEC(int i) {
        C9RO c9ro;
        AnonymousClass810 anonymousClass810;
        List list = this.A0D;
        list.getClass();
        C5NP c5np = ((C5NJ) list.get(i)).A03;
        if ((c5np == C5NP.A08 || c5np == C5NP.A06 || c5np == C5NP.A05) && (c9ro = (C9RO) this.A09.get(i)) != null && (anonymousClass810 = c9ro.A05.A04) != null) {
            anonymousClass810.A01();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0136  */
    @Override // X.InterfaceC25213BDl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC179447xu EGf(X.C199758sR r18, X.C199758sR r19, int r20) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24191AoE.EGf(X.8sR, X.8sR, int):X.7xu");
    }

    @Override // X.InterfaceC25213BDl
    public final void EbJ(int i, int i2) {
        this.A04 = i;
        this.A03 = i2;
    }

    @Override // X.InterfaceC25213BDl
    public final void cleanup() {
        C23015ACp c23015ACp;
        AnonymousClass815 anonymousClass815 = this.A05;
        if (anonymousClass815 != null) {
            C80Q c80q = anonymousClass815.A00;
            if (c80q != null) {
                c80q.cleanup();
            }
            this.A05 = null;
        }
        if (this.A02) {
            for (C5NP c5np : C5NP.values()) {
                int ordinal = c5np.ordinal();
                if (ordinal != 0 && ordinal != 1 && ordinal != 2) {
                    if (ordinal == 4 && (c23015ACp = this.A01) != null) {
                        c23015ACp.A00();
                    }
                } else {
                    ABR abr = this.A00;
                    abr.getClass();
                    BDW A00 = abr.A00(c5np);
                    if (A00 != null) {
                        A00.cleanup();
                    }
                }
            }
            this.A0B.A00.clear();
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, X.BCH] */
    public C24191AoE(Context context, UserSession userSession, C22979ABd c22979ABd, List list, Map map, int i) {
        this.A05 = null;
        this.A08 = context;
        this.A0D = list;
        this.A0E = map;
        this.A0A = userSession;
        this.A0B = c22979ABd;
        this.A07 = i;
        C06090Tz c06090Tz = C06090Tz.A06;
        if (C18U.A06(c06090Tz, userSession, 36323075293391778L) || C18U.A06(c06090Tz, userSession, 36323075293785000L)) {
            this.A05 = new AnonymousClass815(userSession, context, false);
        }
    }
}
