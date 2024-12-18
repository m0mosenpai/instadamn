package com.instagram.feed.media.flashmedia;

import X.AbstractC001800i;
import X.AbstractC12960li;
import X.AbstractC14350nz;
import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC24771Iv;
import X.AbstractC31171DnF;
import X.AbstractC31175DnJ;
import X.AbstractC43592JPx;
import X.AbstractC47023Kqg;
import X.AnonymousClass194;
import X.C05A;
import X.C06090Tz;
import X.C0f9;
import X.C0o0;
import X.C12M;
import X.C12N;
import X.C14360o3;
import X.C16930sl;
import X.C18240vB;
import X.C18U;
import X.C19K;
import X.C19L;
import X.C218914p;
import X.C226218q;
import X.C226418s;
import X.C38321qM;
import X.C97c;
import X.EnumC220415e;
import X.EnumC37328GcW;
import X.ILG;
import X.InterfaceC12870lZ;
import X.InterfaceC13000lm;
import X.InterfaceC2053697e;
import X.InterfaceC28041Xi;
import X.InterfaceC43545JLf;
import X.MBp;
import X.OZZ;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* loaded from: classes8.dex */
public final class FlashMediaRepository implements InterfaceC12870lZ, InterfaceC43545JLf, InterfaceC13000lm {
    public C38321qM A00;
    public ILG A01;
    public Integer A02;
    public List A03;
    public Set A04;
    public boolean A05;
    public boolean A06;
    public final C12N A07;
    public final C218914p A08;
    public final UserSession A09;
    public final C18240vB A0A;
    public final FlashMediaLocalDataSource A0B;
    public final OZZ A0C;
    public final Set A0D;
    public final C19L A0E;
    public final C05A A0F;

    public /* synthetic */ FlashMediaRepository(UserSession userSession) {
        FlashMediaLocalDataSource flashMediaLocalDataSource = new FlashMediaLocalDataSource(userSession);
        C0o0 A00 = AbstractC14350nz.A00();
        A00.A01 = "FlashMediaRepository";
        C18240vB c18240vB = new C18240vB(A00);
        C12M c12m = new C12M(c18240vB);
        C218914p c218914p = C218914p.A08;
        C19K A02 = AnonymousClass194.A02(c12m.AOT(749047880, 3));
        AbstractC167007dF.A1G(userSession, 1, c218914p);
        C14360o3.A0B(A02, 6);
        this.A09 = userSession;
        this.A0B = flashMediaLocalDataSource;
        this.A0A = c18240vB;
        this.A07 = c12m;
        this.A08 = c218914p;
        this.A0E = A02;
        this.A0F = AbstractC31171DnF.A0o();
        this.A04 = AbstractC31171DnF.A0l();
        this.A0D = AbstractC31171DnF.A0l();
        this.A03 = AbstractC166987dD.A1E();
        this.A0C = AbstractC47023Kqg.A00(userSession);
        C226418s A01 = C226218q.A01(AbstractC12960li.A00);
        A01.A0P(A01.A02, "REELS_FLASH_CACHE_LOAD_START");
        C218914p.A04(EnumC220415e.A02, this, false, false);
        this.A05 = AbstractC167007dF.A1O((AbstractC31175DnJ.A03(AbstractC166987dD.A0x(userSession), "latest_reels_flash_cache_stored_time") > (System.currentTimeMillis() - 43200000) ? 1 : (AbstractC31175DnJ.A03(AbstractC166987dD.A0x(userSession), "latest_reels_flash_cache_stored_time") == (System.currentTimeMillis() - 43200000) ? 0 : -1)));
        MBp.A01(this, A02, 25);
    }

    @Override // X.InterfaceC43545JLf
    public final void EFk(C38321qM c38321qM, EnumC37328GcW enumC37328GcW) {
        Object value;
        ArrayList arrayList;
        C14360o3.A0B(c38321qM, 1);
        Set set = this.A04;
        if (set == null) {
            C05A c05a = this.A0F;
            do {
                value = c05a.getValue();
                arrayList = new ArrayList();
                for (Object obj : (List) value) {
                    if (!C14360o3.A0K(obj, c38321qM)) {
                        arrayList.add(obj);
                    }
                }
            } while (!c05a.AIi(value, arrayList));
            return;
        }
        set.add(c38321qM);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(com.instagram.feed.media.flashmedia.FlashMediaRepository r9, java.util.List r10, X.InterfaceC23621Ds r11) {
        /*
            r3 = 32
            boolean r0 = X.MAK.A01(r11, r3)
            if (r0 == 0) goto Lca
            r5 = r11
            X.MAK r5 = (X.MAK) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lca
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r1 = r5.A03
            X.1JX r4 = X.C1JX.A02
            int r0 = r5.A00
            r8 = 1
            if (r0 == 0) goto L64
            if (r0 != r8) goto Ld1
            java.lang.Object r10 = r5.A02
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r9 = r5.A01
            com.instagram.feed.media.flashmedia.FlashMediaRepository r9 = (com.instagram.feed.media.flashmedia.FlashMediaRepository) r9
            X.AbstractC09560e7.A00(r1)
        L2c:
            X.05A r1 = r9.A0F
        L2e:
            java.lang.Object r0 = r1.getValue()
            boolean r0 = r1.AIi(r0, r10)
            if (r0 == 0) goto L2e
            java.lang.Object r0 = r1.getValue()
            java.util.List r0 = (java.util.List) r0
            int r0 = r0.size()
            java.lang.Integer r0 = X.AbstractC43592JPx.A0r(r0)
            r9.A02 = r0
            X.0vz r0 = X.AbstractC12960li.A00
            X.18s r4 = X.C226218q.A01(r0)
            int r2 = r10.size()
            java.lang.String r1 = "REELS_FLASH_CACHE_LOAD_END"
            com.facebook.quicklog.LightweightQuickPerformanceLogger r0 = r4.A02
            r4.A0P(r0, r1)
            long r2 = (long) r2
            java.lang.String r1 = "reels_flash_cache_item_count"
            com.facebook.quicklog.LightweightQuickPerformanceLogger r0 = r4.A02
            X.C226418s.A05(r0, r1, r2)
            X.0eB r0 = X.C0eB.A00
            return r0
        L64:
            X.AbstractC09560e7.A00(r1)
            java.util.Set r7 = r9.A04
            r6 = 0
            if (r7 == 0) goto L88
            java.util.ArrayList r3 = X.AbstractC166987dD.A1E()
            java.util.Iterator r2 = r10.iterator()
        L74:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L89
            java.lang.Object r1 = r2.next()
            boolean r0 = r7.contains(r1)
            if (r0 != 0) goto L74
            r3.add(r1)
            goto L74
        L88:
            r3 = r6
        L89:
            r9.A04 = r6
            if (r3 == 0) goto L8e
            r10 = r3
        L8e:
            X.AbstractC31172DnG.A1V(r9, r10, r5, r8)
            java.util.Set r2 = r9.A0D
            java.util.Iterator r1 = r2.iterator()
        L97:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Lab
            java.lang.Object r0 = r1.next()
            X.0e4 r0 = (X.C09530e4) r0
            java.lang.Object r0 = r0.A00
            X.97e r0 = (X.InterfaceC2053697e) r0
            r0.DPr()
            goto L97
        Lab:
            java.util.ArrayList r3 = X.AbstractC166987dD.A1F(r2)
            r2.clear()
            X.12N r0 = r9.A07
            X.12M r0 = (X.C12M) r0
            X.12T r2 = r0.A04
            r1 = 15
            X.MC4 r0 = new X.MC4
            r0.<init>(r3, r10, r6, r1)
            java.lang.Object r0 = X.AbstractC23641Du.A00(r5, r2, r0)
            if (r0 == r4) goto Lc7
            X.0eB r0 = X.C0eB.A00
        Lc7:
            if (r0 != r4) goto L2c
            return r4
        Lca:
            X.MAK r5 = new X.MAK
            r5.<init>(r9, r11, r3)
            goto L16
        Ld1:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.feed.media.flashmedia.FlashMediaRepository.A00(com.instagram.feed.media.flashmedia.FlashMediaRepository, java.util.List, X.1Ds):java.lang.Object");
    }

    @Override // X.InterfaceC43545JLf
    public final C38321qM E3r(EnumC37328GcW enumC37328GcW) {
        return (C38321qM) AbstractC001800i.A0O((List) this.A0F.getValue(), 0);
    }

    @Override // X.InterfaceC43545JLf
    public final void ED1(EnumC37328GcW enumC37328GcW, List list) {
        List list2 = this.A03;
        list2.clear();
        list2.addAll(list);
    }

    @Override // X.InterfaceC43545JLf
    public final void EEw(EnumC37328GcW enumC37328GcW) {
        Set set = this.A04;
        if (set == null) {
            C05A c05a = this.A0F;
            do {
            } while (!c05a.AIi(c05a.getValue(), C16930sl.A00));
        } else {
            set.addAll((Collection) this.A0F.getValue());
        }
    }

    @Override // X.InterfaceC43545JLf
    public final void A9O(EnumC37328GcW enumC37328GcW, List list, boolean z) {
        Object value;
        ArrayList arrayList;
        ArrayList A0U = AbstractC001800i.A0U(list);
        C05A c05a = this.A0F;
        A0U.addAll((Collection) c05a.getValue());
        do {
        } while (!c05a.AIi(c05a.getValue(), AbstractC001800i.A0a(AbstractC001800i.A0j(A0U))));
        if (!z) {
            List<InterfaceC28041Xi> A0a = AbstractC001800i.A0a(this.A03);
            do {
                value = c05a.getValue();
                arrayList = new ArrayList();
                for (Object obj : (List) value) {
                    if (!A0a.isEmpty() && (!(A0a instanceof Collection) || !A0a.isEmpty())) {
                        for (InterfaceC28041Xi interfaceC28041Xi : A0a) {
                            if (interfaceC28041Xi != null && interfaceC28041Xi.apply(obj)) {
                            }
                        }
                    }
                    arrayList.add(obj);
                }
            } while (!c05a.AIi(value, arrayList));
            Integer num = this.A02;
            if (num != null && ((List) c05a.getValue()).size() > num.intValue() + 1) {
                this.A02 = AbstractC43592JPx.A0s((List) c05a.getValue());
                MBp.A01(this, AbstractC24771Iv.A02(749047880, 3), 26);
            }
        }
    }

    @Override // X.InterfaceC43545JLf
    public final void B6V(InterfaceC2053697e interfaceC2053697e, C97c c97c, EnumC37328GcW enumC37328GcW) {
        interfaceC2053697e.DJR();
        if (this.A04 == null) {
            interfaceC2053697e.DJQ();
            c97c.Dh8((Collection) this.A0F.getValue());
        } else {
            interfaceC2053697e.DPs();
            this.A0D.add(AbstractC166987dD.A1L(interfaceC2053697e, c97c));
        }
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        C19L A02;
        int A03 = C0f9.A03(-1464402639);
        if (!C18U.A06(C06090Tz.A06, this.A09, 36331012393550969L)) {
            A02 = this.A0E;
        } else {
            A02 = AbstractC24771Iv.A02(749047880, 3);
        }
        MBp.A01(this, A02, 27);
        C0f9.A0A(953219976, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        C0f9.A0A(-1517158178, C0f9.A03(-1203728563));
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        C218914p.A07(this);
    }
}
