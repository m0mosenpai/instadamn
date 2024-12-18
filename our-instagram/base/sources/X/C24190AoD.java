package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* renamed from: X.AoD, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24190AoD implements InterfaceC25213BDl {
    public int A00;
    public int A01;
    public C9RO A02;
    public AnonymousClass815 A03;
    public C23015ACp A04;
    public boolean A05;
    public final Context A06;
    public final UserSession A07;
    public final C22979ABd A08;
    public final HashMap A09 = AbstractC166987dD.A1G();
    public final List A0A;
    public final Map A0B;

    @Override // X.InterfaceC25213BDl
    public final int BlX() {
        return this.A0A.size();
    }

    @Override // X.InterfaceC25213BDl
    public final void EEC(int i) {
        AnonymousClass810 anonymousClass810;
        C5NJ c5nj = (C5NJ) this.A0A.get(i);
        C5NP c5np = c5nj.A03;
        if (c5np == C5NP.A08 || c5np == C5NP.A06 || c5np == C5NP.A05) {
            Object obj = this.A09.get(c5nj);
            obj.getClass();
            C9RO c9ro = ((AbstractC224299vE) obj).A00;
            if (c9ro != null && (anonymousClass810 = c9ro.A05.A04) != null) {
                anonymousClass810.A01();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, X.BCH] */
    @Override // X.InterfaceC25213BDl
    public final InterfaceC179447xu EGf(C199758sR c199758sR, C199758sR c199758sR2, int i) {
        AnonymousClass815 anonymousClass815;
        int i2;
        if (!this.A05) {
            this.A05 = true;
            for (C5NJ c5nj : this.A0A) {
                TreeSet treeSet = new TreeSet(c5nj.A07);
                this.A0B.put(c5nj, treeSet);
                if (c5nj.A03 == C5NP.A09) {
                    C23015ACp c23015ACp = new C23015ACp(this.A06, c199758sR, c199758sR2, this.A07, this.A08, new Object());
                    this.A04 = c23015ACp;
                    Object floor = treeSet.floor(new Object());
                    floor.getClass();
                    c23015ACp.A02(c5nj, (C5NO) floor);
                }
            }
        }
        C5NJ c5nj2 = (C5NJ) this.A0A.get(i);
        C22880A7a c22880A7a = c5nj2.A02;
        if (c22880A7a == null || (c22880A7a.A01 <= (i2 = this.A01) && i2 <= c22880A7a.A00)) {
            if (c5nj2.A03 == C5NP.A09) {
                int i3 = this.A01;
                if (c22880A7a != null) {
                    i3 = Math.max(i3 - c22880A7a.A01, 0);
                }
                C23015ACp c23015ACp2 = this.A04;
                c23015ACp2.getClass();
                c23015ACp2.A01(c5nj2, i3);
                InterfaceC58163PqS interfaceC58163PqS = this.A04.A01;
                if (interfaceC58163PqS == null) {
                    C14360o3.A0F("videoOutputSurface");
                    throw C00O.createAndThrow();
                }
                int i4 = ((UMF) interfaceC58163PqS).A03;
                if (this.A02 == null) {
                    Drawable A00 = this.A08.A00(c5nj2);
                    AnonymousClass811 anonymousClass811 = new AnonymousClass811("VideoOverlay");
                    anonymousClass811.A01 = i4;
                    anonymousClass811.A03 = 36197;
                    anonymousClass811.A00 = 6408;
                    anonymousClass811.A04 = A00.getIntrinsicWidth();
                    anonymousClass811.A02 = A00.getIntrinsicHeight();
                    AnonymousClass810 anonymousClass810 = new AnonymousClass810(anonymousClass811);
                    C9RO c9ro = new C9RO(new C179387xo());
                    this.A02 = c9ro;
                    c9ro.A00 = false;
                    AnonymousClass812 anonymousClass812 = anonymousClass810.A02;
                    int i5 = anonymousClass812.A01;
                    int i6 = anonymousClass812.A00;
                    c9ro.FBE(i5, i6, i5, i6, 0, 0, 0, false);
                    this.A02.A00(anonymousClass810);
                }
                return this.A02;
            }
            HashMap hashMap = this.A09;
            Object obj = hashMap.get(c5nj2);
            if (obj == null) {
                C5NP c5np = c5nj2.A03;
                int ordinal = c5np.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1 && ordinal != 3) {
                        if (ordinal == 2) {
                            obj = new C221809qj(this.A07, this.A08);
                        } else {
                            throw AbstractC166987dD.A1D(AbstractC167017dG.A0n(c5np, "Invalid ReelImageRegions type: ", AbstractC166987dD.A1C()));
                        }
                    } else {
                        obj = new C68103VBh(this.A06, this.A07);
                    }
                } else {
                    obj = new C221799qi(this.A07, this.A06);
                }
                hashMap.put(c5nj2, obj);
            }
            AbstractC224299vE abstractC224299vE = (AbstractC224299vE) obj;
            if ((abstractC224299vE instanceof C221809qj) && (anonymousClass815 = this.A03) != null) {
                ((C221809qj) abstractC224299vE).A02 = anonymousClass815;
            }
            return abstractC224299vE.A01(c5nj2, this.A01, this.A00);
        }
        return null;
    }

    @Override // X.InterfaceC25213BDl
    public final void EbJ(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }

    @Override // X.InterfaceC25213BDl
    public final void cleanup() {
        AnonymousClass815 anonymousClass815 = this.A03;
        if (anonymousClass815 != null) {
            C80Q c80q = anonymousClass815.A00;
            if (c80q != null) {
                c80q.cleanup();
            }
            this.A03 = null;
        }
        if (this.A05) {
            for (C5NJ c5nj : this.A0A) {
                if (c5nj.A03 == C5NP.A09) {
                    C23015ACp c23015ACp = this.A04;
                    if (c23015ACp != null) {
                        c23015ACp.A00();
                    }
                } else {
                    AbstractC224299vE abstractC224299vE = (AbstractC224299vE) this.A09.get(c5nj);
                    if (abstractC224299vE != null) {
                        abstractC224299vE.A02();
                    }
                }
            }
            this.A08.A00.clear();
        }
    }

    public C24190AoD(Context context, UserSession userSession, C22979ABd c22979ABd, List list, Map map) {
        this.A03 = null;
        this.A06 = context;
        this.A0A = list;
        this.A0B = map;
        this.A07 = userSession;
        this.A08 = c22979ABd;
        C06090Tz c06090Tz = C06090Tz.A06;
        if (C18U.A06(c06090Tz, userSession, 36323075293391778L) || C18U.A06(c06090Tz, userSession, 36323075293785000L)) {
            this.A03 = new AnonymousClass815(userSession, context, false);
        }
    }
}
