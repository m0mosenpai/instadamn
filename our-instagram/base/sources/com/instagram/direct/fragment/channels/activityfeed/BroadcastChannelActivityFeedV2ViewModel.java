package com.instagram.direct.fragment.channels.activityfeed;

import X.AbstractC141776au;
import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC208910l;
import X.AbstractC23641Du;
import X.AbstractC25225BEi;
import X.AbstractC25226BEj;
import X.AbstractC25231BEo;
import X.AbstractC28761aE;
import X.AbstractC52922bZ;
import X.AnonymousClass059;
import X.AnonymousClass195;
import X.C008002u;
import X.C05A;
import X.C0UO;
import X.C10E;
import X.C10H;
import X.C10I;
import X.C10Q;
import X.C12L;
import X.C141796aw;
import X.C15150pV;
import X.C16930sl;
import X.C2DS;
import X.C34584FLt;
import X.C36745GHo;
import X.C50530MSj;
import X.C57155PYz;
import X.C57181PaA;
import X.C57182PaB;
import X.EnumC33355Eoo;
import X.FIS;
import X.FIT;
import X.InterfaceC23621Ds;
import X.InterfaceC62602sz;
import android.content.res.Resources;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class BroadcastChannelActivityFeedV2ViewModel extends AbstractC52922bZ {
    public AnonymousClass195 A00;
    public final int A01;
    public final Resources A02;
    public final C34584FLt A03;
    public final C2DS A04;
    public final InterfaceC62602sz A05;
    public final C05A A06;
    public final C05A A07;
    public final C0UO A08;
    public final UserSession A09;
    public final C05A A0A;
    public final C05A A0B;
    public final C05A A0C;
    public final C0UO A0D;

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d5, code lost:
    
        if (r0 != r5) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(com.instagram.direct.fragment.channels.activityfeed.BroadcastChannelActivityFeedV2ViewModel r15, X.InterfaceC23621Ds r16, int r17) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.fragment.channels.activityfeed.BroadcastChannelActivityFeedV2ViewModel.A00(com.instagram.direct.fragment.channels.activityfeed.BroadcastChannelActivityFeedV2ViewModel, X.1Ds, int):java.lang.Object");
    }

    public final void A01() {
        C05A c05a = this.A06;
        if (c05a.getValue() != EnumC33355Eoo.A06) {
            c05a.Egh(EnumC33355Eoo.A02);
            AnonymousClass195 anonymousClass195 = this.A00;
            if (anonymousClass195 != null) {
                anonymousClass195.AGH(null);
            }
            int i = this.A01;
            if (i == 1) {
                this.A00 = AbstractC25226BEj.A1L(new C50530MSj(this, (InterfaceC23621Ds) null, i), AbstractC141776au.A00(this));
                return;
            }
            throw AbstractC166987dD.A12("Invalid fetch mode");
        }
    }

    public final void A02() {
        C05A c05a = this.A06;
        if (c05a.getValue() != EnumC33355Eoo.A02) {
            Object value = c05a.getValue();
            EnumC33355Eoo enumC33355Eoo = EnumC33355Eoo.A04;
            if (value != enumC33355Eoo && A03()) {
                c05a.Egh(enumC33355Eoo);
                AnonymousClass195 anonymousClass195 = this.A00;
                if (anonymousClass195 != null) {
                    anonymousClass195.AGH(null);
                }
                int i = this.A01;
                if (i == 1) {
                    this.A00 = AbstractC23641Du.A04(AbstractC25231BEo.A0e(C12L.A00), new C57155PYz(this, null, i, 20), AbstractC141776au.A00(this));
                    return;
                }
                throw AbstractC166987dD.A12("Invalid fetch mode");
            }
        }
    }

    public final boolean A03() {
        C05A c05a;
        Integer num;
        int i = this.A01;
        if (i != 0) {
            if (i == 1) {
                c05a = this.A0B;
            } else {
                throw AbstractC166987dD.A12("Invalid fetch mode");
            }
        } else {
            c05a = this.A0C;
        }
        FIS fis = (FIS) c05a.getValue();
        if (fis != null && (num = fis.A00) != null && num.intValue() == -1) {
            return false;
        }
        return true;
    }

    public BroadcastChannelActivityFeedV2ViewModel(Resources resources, UserSession userSession, C34584FLt c34584FLt, int i) {
        AbstractC167017dG.A1R(userSession, c34584FLt);
        this.A02 = resources;
        this.A09 = userSession;
        this.A03 = c34584FLt;
        this.A01 = i;
        EnumC33355Eoo enumC33355Eoo = EnumC33355Eoo.A02;
        C008002u A1H = AbstractC25225BEi.A1H(enumC33355Eoo);
        this.A06 = A1H;
        C16930sl c16930sl = C16930sl.A00;
        C008002u A00 = C10E.A00(c16930sl);
        this.A07 = A00;
        C008002u A002 = C10E.A00(c16930sl);
        this.A0A = A002;
        C15150pV A03 = C10Q.A03(new C57181PaA(this, (InterfaceC23621Ds) null, 8), A00, A002);
        C141796aw A003 = AbstractC141776au.A00(this);
        C10H c10h = C10I.A01;
        AnonymousClass059 A01 = AbstractC208910l.A01(c16930sl, A003, A03, c10h);
        this.A0D = A01;
        this.A04 = AbstractC28761aE.A00(userSession);
        this.A0C = C10E.A00(null);
        this.A0B = C10E.A00(null);
        this.A05 = new C36745GHo(this, 2);
        C15150pV A032 = C10Q.A03(new C57182PaB(21, null), A1H, A01);
        this.A08 = AbstractC208910l.A01(new FIT(enumC33355Eoo, c16930sl), AbstractC141776au.A00(this), A032, c10h);
    }
}
