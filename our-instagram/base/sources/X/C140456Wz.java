package X;

import android.content.Context;
import com.instagram.api.schemas.IntentAwareAdsInfo;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import instagram.features.stories.fragment.ReelViewerFragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.Deprecated;

@Deprecated(message = "Sync all changes with the Kotlin implementation of @ReelSponsoredContentInjectorKt")
/* renamed from: X.6Wz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C140456Wz implements InterfaceC671131c {
    public final UserSession A04;
    public final InterfaceC114805Gn A05;
    public final boolean A09;
    public final Context A0A;
    public final ReelViewerFragment A0B;
    public final boolean A0C;
    public final java.util.Set A07 = new HashSet();
    public final java.util.Set A08 = new HashSet();
    public int A01 = -1;
    public int A02 = -1;
    public final LinkedList A06 = new LinkedList();
    public int A03 = -1;
    public int A00 = 0;

    @Override // X.InterfaceC671231d
    public final void DrH() {
    }

    @Override // X.InterfaceC671231d
    public final void E6u(String str, List list, int i, int i2, int i3, int i4) {
    }

    @Override // X.InterfaceC671231d
    public final List AGp() {
        EnumC26291Pk enumC26291Pk;
        ArrayList arrayList = new ArrayList();
        Iterator it = ((C146226iL) this.A05).A0C.A02.iterator();
        while (it.hasNext()) {
            Reel reel = ((C41551w4) it.next()).A0H;
            IntentAwareAdsInfo intentAwareAdsInfo = reel.A0B;
            if (intentAwareAdsInfo != null && intentAwareAdsInfo.A04 != null) {
                enumC26291Pk = EnumC26291Pk.A02;
            } else if (!reel.CdW() && !reel.A0m()) {
                enumC26291Pk = EnumC26291Pk.A03;
            } else {
                enumC26291Pk = EnumC26291Pk.A04;
            }
            arrayList.add(enumC26291Pk);
        }
        return arrayList;
    }

    @Override // X.InterfaceC671231d
    public final /* bridge */ /* synthetic */ void AHZ(Object obj) {
        C41551w4 c41551w4 = (C41551w4) obj;
        if (C18U.A06(C06090Tz.A05, this.A04, 36310538288365740L)) {
            c41551w4.A0H.A0X = null;
        }
    }

    @Override // X.InterfaceC671131c
    public final List ANb() {
        return new ArrayList();
    }

    @Override // X.InterfaceC671131c
    public final boolean ARW() {
        return C18U.A06(C06090Tz.A05, this.A04, 36330767579628556L);
    }

    @Override // X.InterfaceC671231d
    public final float Aug() {
        if (this.A0B.mViewPager == null) {
            return 0.0f;
        }
        return ((C147256kA) r0).A04.A08;
    }

    @Override // X.InterfaceC671231d
    public final List BZU() {
        List unmodifiableList = Collections.unmodifiableList(((C146226iL) this.A05).A0C.A01);
        C14360o3.A07(unmodifiableList);
        return unmodifiableList;
    }

    @Override // X.InterfaceC671231d
    public final int Bee() {
        return this.A01;
    }

    @Override // X.InterfaceC671231d
    public final int Bef() {
        return this.A02;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0107  */
    @Override // X.InterfaceC671231d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Integer COV(X.InterfaceC42381xS r12, X.C1PZ r13, int r14) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C140456Wz.COV(X.1xS, X.1PZ, int):java.lang.Integer");
    }

    @Override // X.InterfaceC671231d
    public final /* bridge */ /* synthetic */ boolean CWc(Object obj) {
        java.util.Set set;
        String A0V;
        Reel reel = ((C41551w4) obj).A0H;
        if (reel.A0m()) {
            set = this.A08;
            A0V = reel.A0G();
        } else if (reel.CdW()) {
            if (reel.A0I != null) {
                return reel.A13(this.A04);
            }
            set = this.A07;
            UserSession userSession = this.A04;
            A0V = reel.A0A(userSession, 0).A0V(userSession);
        } else {
            return false;
        }
        return set.contains(A0V);
    }

    @Override // X.InterfaceC671231d
    public final InterfaceC42381xS Cpq() {
        return (InterfaceC42381xS) this.A06.peekLast();
    }

    @Override // X.InterfaceC671231d
    public final /* bridge */ /* synthetic */ void E6t(Object obj) {
        C40861ut c40861ut = ((C41551w4) obj).A0H.A0b;
        if (c40861ut != null) {
            c40861ut.A0C(this.A09);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0067 A[EDGE_INSN: B:26:0x0067->B:24:0x0067 BREAK  A[LOOP:0: B:18:0x004e->B:25:?], SYNTHETIC] */
    @Override // X.InterfaceC671231d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ boolean F9C(java.lang.Object r8, java.lang.String r9, java.util.Map r10) {
        /*
            r7 = this;
            X.1w4 r8 = (X.C41551w4) r8
            X.5Gn r1 = r7.A05
            int r0 = r1.CNR(r8)
            r6 = 1
            int r0 = r0 + 1
            X.1w4 r4 = r1.Blt(r0)
            if (r4 == 0) goto L75
            com.instagram.model.reels.Reel r5 = r4.A0H
            X.1qM r0 = r5.A0F
            if (r0 == 0) goto L75
            if (r9 == 0) goto L23
            java.lang.String r0 = r0.getId()
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L75
        L23:
            X.6iL r1 = (X.C146226iL) r1
            X.6iR r0 = r1.A0C
            boolean r0 = r0.A02(r4)
            if (r0 == 0) goto L32
            int r0 = r7.A00
            int r0 = r0 - r6
            r7.A00 = r0
        L32:
            java.util.LinkedList r0 = r7.A06
            java.util.Iterator r3 = r0.iterator()
            boolean r0 = r5.CdW()
            if (r0 == 0) goto L68
            java.util.Set r2 = r7.A07
            com.instagram.common.session.UserSession r1 = r7.A04
            r0 = 0
            X.1vS r0 = r5.A0A(r1, r0)
            java.lang.String r0 = r0.A0V(r1)
        L4b:
            r2.remove(r0)
        L4e:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L67
            java.lang.Object r0 = r3.next()
            X.1xS r0 = (X.InterfaceC42381xS) r0
            java.lang.Object r0 = r0.BUM()
            boolean r0 = X.C2I7.A00(r0, r4)
            if (r0 == 0) goto L4e
            r3.remove()
        L67:
            return r6
        L68:
            boolean r0 = r5.A0m()
            if (r0 == 0) goto L4e
            java.util.Set r2 = r7.A08
            java.lang.String r0 = r5.A0G()
            goto L4b
        L75:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C140456Wz.F9C(java.lang.Object, java.lang.String, java.util.Map):boolean");
    }

    @Override // X.InterfaceC671231d
    public final InterfaceC42381xS F9D() {
        InterfaceC42381xS interfaceC42381xS;
        int i;
        java.util.Set set;
        String A0V;
        LinkedList linkedList = this.A06;
        if (!linkedList.isEmpty() && (interfaceC42381xS = (InterfaceC42381xS) linkedList.pollLast()) != null) {
            C41551w4 c41551w4 = (C41551w4) interfaceC42381xS.BUM();
            InterfaceC114805Gn interfaceC114805Gn = this.A05;
            if (interfaceC114805Gn.CNR(c41551w4) >= 0) {
                C14360o3.A0B(c41551w4, 0);
                if (((C146226iL) interfaceC114805Gn).A0C.A02(c41551w4)) {
                    this.A00--;
                }
                interfaceC114805Gn.CtM();
                Reel reel = c41551w4.A0H;
                if (reel.CdW()) {
                    UserSession userSession = this.A04;
                    if (reel.A13(userSession)) {
                        set = this.A07;
                        C41181vS A0A = reel.A0A(userSession, 0);
                        if (A0A.A0e == EnumC41231vY.A02) {
                            A0V = A0A.A0k;
                        } else {
                            A0V = null;
                        }
                    } else {
                        if (reel.A0I == null) {
                            set = this.A07;
                            A0V = reel.A0A(userSession, 0).A0V(userSession);
                        }
                        i = this.A01;
                    }
                    set.remove(A0V);
                    i = this.A01;
                } else {
                    if (reel.A0m()) {
                        this.A08.remove(reel.A0G());
                        i = this.A02;
                    }
                    return interfaceC42381xS;
                }
                this.A03 = i;
                return interfaceC42381xS;
            }
            return null;
        }
        return null;
    }

    public C140456Wz(Context context, UserSession userSession, InterfaceC114805Gn interfaceC114805Gn, ReelViewerFragment reelViewerFragment, boolean z, boolean z2) {
        this.A0A = context;
        this.A04 = userSession;
        this.A05 = interfaceC114805Gn;
        this.A0B = reelViewerFragment;
        this.A09 = z;
        this.A0C = z2;
        if (!C18U.A06(C06090Tz.A05, userSession, 36321670838888108L)) {
            C18U.A06(C06090Tz.A06, userSession, 36321619299280520L);
        }
    }

    @Override // X.InterfaceC671231d
    public final List BZa() {
        return Collections.emptyList();
    }

    @Override // X.InterfaceC671231d
    public final /* bridge */ /* synthetic */ Object BUP(int i) {
        return null;
    }
}
