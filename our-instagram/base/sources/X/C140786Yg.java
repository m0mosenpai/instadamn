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
import java.util.Map;

/* renamed from: X.6Yg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C140786Yg implements InterfaceC671131c {
    public int A00;
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

    /* JADX WARN: Removed duplicated region for block: B:62:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0118  */
    @Override // X.InterfaceC671231d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Integer COV(X.InterfaceC42381xS r12, X.C1PZ r13, int r14) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C140786Yg.COV(X.1xS, X.1PZ, int):java.lang.Integer");
    }

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
        C14360o3.A0B(c41551w4, 0);
        if (C18U.A06(C06090Tz.A05, this.A04, 36310538288365740L)) {
            c41551w4.A0H.A0X = null;
        }
    }

    @Override // X.InterfaceC671131c
    public final List ANb() {
        return C16930sl.A00;
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
        return AbstractC001800i.A0X(unmodifiableList);
    }

    @Override // X.InterfaceC671231d
    public final int Bee() {
        return this.A01;
    }

    @Override // X.InterfaceC671231d
    public final int Bef() {
        return this.A02;
    }

    @Override // X.InterfaceC671231d
    public final /* bridge */ /* synthetic */ boolean CWc(Object obj) {
        C41551w4 c41551w4 = (C41551w4) obj;
        C14360o3.A0B(c41551w4, 0);
        Reel reel = c41551w4.A0H;
        if (reel.A0m()) {
            return this.A08.contains(reel.A0G());
        }
        if (reel.CdW()) {
            if (reel.A0I != null) {
                return reel.A13(this.A04);
            }
            java.util.Set set = this.A07;
            UserSession userSession = this.A04;
            return AbstractC001800i.A0u(set, reel.A0A(userSession, 0).A0V(userSession));
        }
        return false;
    }

    @Override // X.InterfaceC671231d
    public final InterfaceC42381xS Cpq() {
        return (InterfaceC42381xS) this.A06.peekLast();
    }

    @Override // X.InterfaceC671231d
    public final /* bridge */ /* synthetic */ void E6t(Object obj) {
        C41551w4 c41551w4 = (C41551w4) obj;
        C14360o3.A0B(c41551w4, 0);
        C40861ut c40861ut = c41551w4.A0H.A0b;
        if (c40861ut != null) {
            c40861ut.A0C(this.A09);
        }
    }

    @Override // X.InterfaceC671231d
    public final /* bridge */ /* synthetic */ boolean F9C(Object obj, String str, Map map) {
        Reel reel;
        C38321qM c38321qM;
        C41551w4 c41551w4 = (C41551w4) obj;
        C14360o3.A0B(c41551w4, 0);
        InterfaceC114805Gn interfaceC114805Gn = this.A05;
        C41551w4 Blt = interfaceC114805Gn.Blt(interfaceC114805Gn.CNR(c41551w4) + 1);
        if (Blt != null && (c38321qM = (reel = Blt.A0H).A0F) != null) {
            if (str == null || str.equals(c38321qM.getId())) {
                if (((C146226iL) interfaceC114805Gn).A0C.A02(Blt)) {
                    this.A00--;
                }
                Iterator it = this.A06.iterator();
                C14360o3.A07(it);
                if (reel.CdW()) {
                    java.util.Set set = this.A07;
                    UserSession userSession = this.A04;
                    C15500q5.A00(set).remove(reel.A0A(userSession, 0).A0V(userSession));
                } else if (reel.A0m()) {
                    this.A08.remove(reel.A0G());
                }
                while (it.hasNext()) {
                    Object next = it.next();
                    C14360o3.A07(next);
                    if (C14360o3.A0K(((InterfaceC42381xS) next).BUM(), Blt)) {
                        it.remove();
                        return true;
                    }
                }
                return true;
            }
            return false;
        }
        return false;
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
                    C15500q5.A00(set).remove(A0V);
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

    public C140786Yg(Context context, UserSession userSession, InterfaceC114805Gn interfaceC114805Gn, ReelViewerFragment reelViewerFragment, boolean z, boolean z2) {
        this.A0A = context;
        this.A04 = userSession;
        this.A05 = interfaceC114805Gn;
        this.A0B = reelViewerFragment;
        this.A09 = z;
        this.A0C = z2;
    }

    @Override // X.InterfaceC671231d
    public final List BZa() {
        List emptyList = Collections.emptyList();
        C14360o3.A07(emptyList);
        return emptyList;
    }

    @Override // X.InterfaceC671231d
    public final /* bridge */ /* synthetic */ Object BUP(int i) {
        return null;
    }
}
