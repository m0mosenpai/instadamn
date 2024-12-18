package com.instagram.quicksnap.capture.viewmodel;

import X.AbstractC141776au;
import X.AbstractC191128dA;
import X.AbstractC23641Du;
import X.AbstractC52922bZ;
import X.AnonymousClass057;
import X.AnonymousClass191;
import X.AnonymousClass195;
import X.BA0;
import X.C008002u;
import X.C05A;
import X.C05F;
import X.C06090Tz;
import X.C0UO;
import X.C0YR;
import X.C10M;
import X.C141796aw;
import X.C14360o3;
import X.C16930sl;
import X.C18U;
import X.C191138dB;
import X.C23031Ai;
import X.C24001Akf;
import X.C51705Msa;
import X.C9BR;
import X.C9D1;
import X.C9D4;
import X.EnumC223409tX;
import X.InterfaceC06180Ui;
import X.InterfaceC16530ry;
import X.InterfaceC19390xP;
import X.InterfaceC23621Ds;
import X.InterfaceC57843Pl9;
import X.P7X;
import X.PZB;
import X.PZX;
import com.instagram.common.session.UserSession;
import com.instagram.quicksnap.data.repository.QuickSnapArchiveRepository;
import com.instagram.quicksnap.data.repository.QuickSnapRepository;
import com.instagram.quicksnap.util.QuickSnapMediaSaver;
import com.instagram.quicksnap.util.QuickSnapRecapVideoGenerator;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes4.dex */
public final class QuickSnapArchiveViewModel extends AbstractC52922bZ {
    public Long A00;
    public List A01;
    public AnonymousClass195 A02;
    public AnonymousClass195 A03;
    public final int A04;
    public final UserSession A05;
    public final C23031Ai A06;
    public final C191138dB A07;
    public final QuickSnapArchiveRepository A08;
    public final QuickSnapRepository A09;
    public final QuickSnapMediaSaver A0A;
    public final QuickSnapRecapVideoGenerator A0B;
    public final Integer A0C;
    public final InterfaceC19390xP A0D;
    public final InterfaceC06180Ui A0E;
    public final C05A A0F;
    public final C05A A0G;
    public final C0UO A0H;

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(com.instagram.quicksnap.capture.viewmodel.QuickSnapArchiveViewModel r6, X.InterfaceC23621Ds r7) {
        /*
            r0 = 2
            boolean r0 = X.PXD.A03(r7, r0)
            if (r0 == 0) goto L5b
            r5 = r7
            X.PXD r5 = (X.PXD) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5b
            int r2 = r2 - r1
            r5.A00 = r2
        L15:
            java.lang.Object r4 = r5.A02
            X.1JX r3 = X.C1JX.A02
            int r0 = r5.A00
            r2 = 1
            if (r0 == 0) goto L49
            if (r0 != r2) goto L61
            java.lang.Object r6 = r5.A01
            com.instagram.quicksnap.capture.viewmodel.QuickSnapArchiveViewModel r6 = (com.instagram.quicksnap.capture.viewmodel.QuickSnapArchiveViewModel) r6
            X.AbstractC09560e7.A00(r4)
        L27:
            java.lang.String r4 = (java.lang.String) r4
            X.195 r1 = r6.A03
            if (r1 == 0) goto L31
            r0 = 0
            r1.AGH(r0)
        L31:
            r1 = 0
            X.NRw r0 = new X.NRw
            r0.<init>(r1)
            A01(r0, r6)
            if (r4 == 0) goto L46
            java.lang.Long r1 = r6.A00
            X.P7Y r0 = new X.P7Y
            r0.<init>(r4, r1)
            A01(r0, r6)
        L46:
            X.0eB r3 = X.C0eB.A00
            return r3
        L49:
            X.AbstractC09560e7.A00(r4)
            com.instagram.quicksnap.util.QuickSnapRecapVideoGenerator r1 = r6.A0B
            java.util.List r0 = r6.A01
            r5.A01 = r6
            r5.A00 = r2
            java.lang.Object r4 = r1.A00(r0, r5)
            if (r4 != r3) goto L27
            return r3
        L5b:
            X.PXD r5 = new X.PXD
            r5.<init>(r7)
            goto L15
        L61:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.quicksnap.capture.viewmodel.QuickSnapArchiveViewModel.A00(com.instagram.quicksnap.capture.viewmodel.QuickSnapArchiveViewModel, X.1Ds):java.lang.Object");
    }

    public /* synthetic */ QuickSnapArchiveViewModel(UserSession userSession, C23031Ai c23031Ai, QuickSnapArchiveRepository quickSnapArchiveRepository, QuickSnapRepository quickSnapRepository, QuickSnapMediaSaver quickSnapMediaSaver, QuickSnapRecapVideoGenerator quickSnapRecapVideoGenerator, Integer num, int i) {
        C191138dB A00 = AbstractC191128dA.A00(userSession);
        C14360o3.A0B(quickSnapRepository, 3);
        C14360o3.A0B(c23031Ai, 6);
        C14360o3.A0B(num, 8);
        C14360o3.A0B(A00, 9);
        this.A05 = userSession;
        this.A08 = quickSnapArchiveRepository;
        this.A09 = quickSnapRepository;
        this.A04 = i;
        this.A0B = quickSnapRecapVideoGenerator;
        this.A06 = c23031Ai;
        this.A0A = quickSnapMediaSaver;
        this.A0C = num;
        this.A07 = A00;
        this.A0G = new C008002u(new C9BR());
        C16930sl c16930sl = C16930sl.A00;
        this.A01 = c16930sl;
        C008002u c008002u = new C008002u(new C51705Msa(c16930sl, 0, false, false, true, false, false, false, false, false, false, false));
        this.A0F = c008002u;
        this.A0H = c008002u;
        Integer num2 = C05F.A00;
        AnonymousClass057 A002 = C10M.A00(num2, 0, 0);
        this.A0E = A002;
        this.A0D = A002;
        C141796aw A003 = AbstractC141776au.A00(this);
        AbstractC23641Du.A03(num2, AnonymousClass191.A00, new C9D1(this, null, 2), A003);
    }

    public static final void A02(QuickSnapArchiveViewModel quickSnapArchiveViewModel) {
        C05A c05a = quickSnapArchiveViewModel.A0G;
        do {
        } while (!c05a.AIi(c05a.getValue(), new C9BR(new LinkedHashSet(), false)));
        A01(C24001Akf.A00, quickSnapArchiveViewModel);
    }

    public static final boolean A03(QuickSnapArchiveViewModel quickSnapArchiveViewModel) {
        if (quickSnapArchiveViewModel.A01.size() >= 5) {
            if (C18U.A06(C06090Tz.A05, quickSnapArchiveViewModel.A05, 36325484770243689L)) {
                return true;
            }
        }
        return false;
    }

    public final void A05() {
        Object value;
        C51705Msa c51705Msa;
        boolean z;
        boolean z2;
        List list;
        boolean A03;
        boolean A06;
        if (this.A0C != C05F.A01) {
            C23031Ai c23031Ai = this.A06;
            InterfaceC16530ry interfaceC16530ry = c23031Ai.A6n;
            C0YR[] c0yrArr = C23031Ai.A8c;
            if (((Number) interfaceC16530ry.CES(c23031Ai, c0yrArr[519])).intValue() > 0) {
                interfaceC16530ry.Egi(c23031Ai, 3, c0yrArr[519]);
            }
        }
        C05A c05a = this.A0F;
        do {
            value = c05a.getValue();
            c51705Msa = (C51705Msa) value;
            z = true;
            if (c51705Msa.A02 || (c51705Msa.A01.isEmpty() && !c51705Msa.A04)) {
                z2 = true;
            } else {
                z2 = false;
            }
            list = c51705Msa.A01;
            if (!list.isEmpty() || c51705Msa.A04) {
                z = false;
            }
            A03 = A03(this);
            A06 = C18U.A06(C06090Tz.A05, this.A05, 2342168493984330863L);
        } while (!c05a.AIi(value, new C51705Msa(list, c51705Msa.A00, z2, z, c51705Msa.A04, A03, true, A06, c51705Msa.A05, c51705Msa.A0B, c51705Msa.A07, c51705Msa.A06)));
        A02(this);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.Pl9, java.lang.Object] */
    public final void A06() {
        C191138dB.A01(EnumC223409tX.GENERATE_RECAP_VIDEO, this.A07, null);
        if (this.A01.size() > 20) {
            A01(new Object(), this);
            return;
        }
        A01(new P7X(true), this);
        AnonymousClass195 anonymousClass195 = this.A02;
        if (anonymousClass195 != null) {
            anonymousClass195.AGH(null);
        }
        C141796aw A00 = AbstractC141776au.A00(this);
        PZB pzb = new PZB(this, (InterfaceC23621Ds) null, 36);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        this.A02 = AbstractC23641Du.A04(anonymousClass191, pzb, A00);
        AnonymousClass195 anonymousClass1952 = this.A03;
        if (anonymousClass1952 != null) {
            anonymousClass1952.AGH(null);
        }
        this.A03 = AbstractC23641Du.A04(anonymousClass191, new PZX(this, null, 41), AbstractC141776au.A00(this));
    }

    public static final void A01(InterfaceC57843Pl9 interfaceC57843Pl9, QuickSnapArchiveViewModel quickSnapArchiveViewModel) {
        C141796aw A00 = AbstractC141776au.A00(quickSnapArchiveViewModel);
        C9D4 c9d4 = new C9D4(interfaceC57843Pl9, quickSnapArchiveViewModel, (InterfaceC23621Ds) null, 21);
        AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, c9d4, A00);
    }

    public final void A04() {
        C141796aw A00 = AbstractC141776au.A00(this);
        AbstractC23641Du.A05(AnonymousClass191.A00, new PZB(this, (InterfaceC23621Ds) null, 35), A00);
        QuickSnapRepository.A00(this.A09, BA0.A00);
    }
}
