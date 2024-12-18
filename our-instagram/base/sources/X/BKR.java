package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.model.venue.Venue;
import com.instagram.reels.prompt.model.PromptStickerModel;
import com.instagram.search.common.analytics.SearchContext;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;

/* loaded from: classes5.dex */
public final class BKR implements InterfaceC31076DlJ {
    public final UserSession A00;
    public final InterfaceC60442pS A01;
    public final SearchContext A02;
    public final InterfaceC43589JPu A03;
    public final IG5 A04;
    public final Context A05;
    public final Fragment A06;
    public final FragmentActivity A07;
    public final C38X A08;
    public final InterfaceC31137Dmc A09;
    public final INA A0A;
    public final BKA A0B;

    @Override // X.InterfaceC31076DlJ
    public final void D5R(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        Fragment fragment = this.A06;
        InterfaceC60442pS interfaceC60442pS = this.A01;
        UserSession userSession = this.A00;
        AbstractC55229Oez.A0C(fragment, userSession, c38321qM, interfaceC60442pS, fragment.getString(2131975629), c38321qM.A3u(userSession));
    }

    @Override // X.InterfaceC31076DlJ
    public final void DwK(C38321qM c38321qM, C75113Zb c75113Zb, Integer num, boolean z) {
        C14360o3.A0B(num, 2);
        this.A09.Cx8(C128085qc.A02(c38321qM), num, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0049, code lost:
    
        if (r3 == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        if (r2 != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x008f, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
    
        if (r1 <= 1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        r2 = r15.A07;
        r3 = r15.A0C;
        r1 = new X.C50674MYs(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
    
        if (r0 != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
    
        r0 = 2131954707;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:
    
        if (r5.isEmpty() == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0066, code lost:
    
        r0 = 2131961693;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0069, code lost:
    
        r1.A00(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006c, code lost:
    
        if (r6 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006e, code lost:
    
        r4 = r6.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0076, code lost:
    
        if (r4.hasNext() == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0078, code lost:
    
        r12 = (com.instagram.feed.media.EffectPreviewIntf) r4.next();
        r1.A0B(r12.getName(), new X.ViewOnClickListenerC28654Cl2(2, r11, r12, r17, r18, r15));
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0099, code lost:
    
        r7 = r5.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a1, code lost:
    
        if (r7.hasNext() == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a3, code lost:
    
        r6 = (X.EnumC25546BRi) r7.next();
        r1.A03(new X.ViewOnClickListenerC38053Gog(65, r6, r15), r6.A01);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e5, code lost:
    
        if (r8 == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e7, code lost:
    
        r0 = r17.A27();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00eb, code lost:
    
        if (r0 == null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ed, code lost:
    
        r5 = r0.A00.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f3, code lost:
    
        if (r5 != null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f5, code lost:
    
        r5 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f7, code lost:
    
        r1.A0B(r5, new X.ViewOnClickListenerC28665ClD(13, r17, r18, r15));
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0138, code lost:
    
        throw X.AbstractC166997dE.A0g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0101, code lost:
    
        r4 = r15.A0D;
        X.AbstractC37670Gi3.A0R(X.EnumC39652Hih.A0E, r3, r17, r4, r15.A0J.CGJ(), r15.A0Z.A00, r18.getPosition());
        new X.C31727DwY(r1).A05(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0122, code lost:
    
        r2 = X.EnumC37860GlF.A04;
        r1 = r15.A0e;
        r15.AGM(r1.A09(r1.A03()), r2, X.EnumC37861GlG.A0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0133, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ba, code lost:
    
        if (X.AbstractC166987dD.A1b(r5) == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00bc, code lost:
    
        r12 = r5.get(0);
        X.C14360o3.A07(r12);
        r9 = r15.A07;
        r11 = r15.A0C;
        X.AbstractC37834Gko.A02(r9, r15.A0D, r11, (X.EnumC25546BRi) r12, r17, X.AbstractC41770Iem.A03(r17));
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d3, code lost:
    
        if (r6 == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d9, code lost:
    
        if (X.AbstractC166987dD.A1b(r6) == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00db, code lost:
    
        X.C37675GiC.A06(r11, (com.instagram.feed.media.EffectPreviewIntf) r6.get(0), r17, r18, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x004d, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x008c, code lost:
    
        if (r3 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0031, code lost:
    
        if (X.AbstractC166987dD.A1b(r6) == false) goto L9;
     */
    @Override // X.InterfaceC31076DlJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DwV(X.C38321qM r17, X.C75113Zb r18) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BKR.DwV(X.1qM, X.3Zb):void");
    }

    @Override // X.InterfaceC31076DlJ
    @Deprecated(message = "This is being migrated to UnifiedVideoActionHandler for MVVM")
    public final void DwX(C38321qM c38321qM, C75113Zb c75113Zb, boolean z, boolean z2) {
        Long l;
        C14360o3.A0B(c38321qM, 0);
        this.A0B.A0D(c38321qM, z, z2);
        InterfaceC60442pS interfaceC60442pS = this.A01;
        long position = c75113Zb.getPosition();
        C3x9 A0u = AbstractC25226BEj.A0u(c38321qM);
        if (A0u != null) {
            l = AbstractC117245Sj.A04(A0u);
        } else {
            l = null;
        }
        UserSession userSession = this.A00;
        OOQ.A01(interfaceC60442pS, userSession, c38321qM, this.A02, this.A03, l, this.A04.A00, position);
        ArrayList A3Q = c38321qM.A3Q();
        String A0t = AbstractC25231BEo.A0t(c38321qM.A2E(userSession));
        if (A3Q != null && !A3Q.isEmpty() && OWJ.A00.A01(userSession, A0t, c38321qM.A5P()) && !z) {
            ArrayList A1E = AbstractC166987dD.A1E();
            ArrayList A3M = c38321qM.A3M();
            if (A3M != null) {
                A1E.addAll(A3M);
            }
            A1E.addAll(A3Q);
            if (AbstractC25226BEj.A1b(A1E)) {
                AnonymousClass426.A00.A08(userSession, c38321qM.getId(), AbstractC166997dE.A0o(), AbstractC111324zv.A00(178), A1E);
            }
        }
    }

    public BKR(Context context, Fragment fragment, FragmentActivity fragmentActivity, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C38X c38x, SearchContext searchContext, InterfaceC43589JPu interfaceC43589JPu, InterfaceC31137Dmc interfaceC31137Dmc, INA ina, BKA bka, IG5 ig5) {
        C14360o3.A0B(searchContext, 9);
        this.A05 = context;
        this.A09 = interfaceC31137Dmc;
        this.A06 = fragment;
        this.A07 = fragmentActivity;
        this.A00 = userSession;
        this.A01 = interfaceC60442pS;
        this.A04 = ig5;
        this.A03 = interfaceC43589JPu;
        this.A02 = searchContext;
        this.A0A = ina;
        this.A08 = c38x;
        this.A0B = bka;
    }

    @Override // X.InterfaceC31076DlJ
    public final void D5J(C38321qM c38321qM, C75113Zb c75113Zb) {
        this.A0B.A07(c38321qM);
    }

    @Override // X.InterfaceC31076DlJ
    public final void DFC(C38321qM c38321qM) {
        this.A0B.A04(c38321qM);
    }

    @Override // X.InterfaceC31076DlJ
    public final void DJ4(C38321qM c38321qM) {
        AbstractC86593tX.A0e(EnumC124565kK.REEL, c38321qM.A1J(), this.A00, null, this.A01.getModuleName(), AbstractC111324zv.A00(420), c38321qM.A2u());
        this.A0B.A03(c38321qM);
    }

    @Override // X.InterfaceC31076DlJ
    public final void DOH() {
        this.A0B.A01();
    }

    @Override // X.InterfaceC31076DlJ
    public final void DTX(C38321qM c38321qM) {
        this.A0B.A0C(c38321qM);
    }

    @Override // X.InterfaceC31076DlJ
    public final void DX3(C38321qM c38321qM, C75113Zb c75113Zb) {
        this.A0B.A08(c38321qM);
    }

    @Override // X.InterfaceC31076DlJ
    public final void DwL(C38321qM c38321qM) {
        this.A0B.A05(c38321qM);
    }

    @Override // X.InterfaceC31076DlJ
    public final void DwM(C38321qM c38321qM) {
        this.A0B.A06(c38321qM);
    }

    @Override // X.InterfaceC31076DlJ
    public final void DwP() {
        BKA bka = this.A0B;
        AbstractC27614CGk.A00(bka.A01, bka.A04);
    }

    @Override // X.InterfaceC31076DlJ
    public final void DwQ(C38321qM c38321qM) {
        this.A0B.A09(c38321qM);
    }

    @Override // X.InterfaceC31076DlJ
    public final void DwR(List list, String str) {
        IQ5.A00(this.A07, this.A05, this.A00, str);
    }

    @Override // X.InterfaceC31076DlJ
    public final void DwS(C38321qM c38321qM) {
        InterfaceC31137Dmc interfaceC31137Dmc = this.A09;
        C120985dq A02 = C128085qc.A02(c38321qM);
        C37675GiC c37675GiC = (C37675GiC) interfaceC31137Dmc;
        HCm hCm = new HCm();
        hCm.A00 = A02;
        c37675GiC.A0V.A00(null, hCm, c37675GiC.A07.getApplicationContext().getString(2131972562), true);
    }

    @Override // X.InterfaceC31076DlJ
    public final void DwT(C38321qM c38321qM) {
        this.A0B.A0A(c38321qM);
    }

    @Override // X.InterfaceC31076DlJ
    public final void DwU(C38321qM c38321qM) {
        this.A0B.A0B(c38321qM);
    }

    @Override // X.InterfaceC31076DlJ
    public final void DwW(C38321qM c38321qM, C75113Zb c75113Zb) {
        InterfaceC60442pS interfaceC60442pS = this.A01;
        UserSession userSession = this.A00;
        String A0j = AbstractC167017dG.A0j();
        EnumC39652Hih enumC39652Hih = EnumC39652Hih.A0E;
        Venue A27 = c38321qM.A27();
        if (A27 != null) {
            String A05 = A27.A05();
            C14360o3.A07(A05);
            AbstractC37670Gi3.A0O(enumC39652Hih, interfaceC60442pS, userSession, c38321qM, A0j, A05, c75113Zb.getPosition());
            BKA bka = this.A0B;
            Venue A272 = c38321qM.A27();
            if (A272 != null) {
                AbstractC37834Gko.A05(bka.A01, bka.A04, A272);
                return;
            }
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC31076DlJ
    public final void DwZ(C38321qM c38321qM, C75113Zb c75113Zb) {
        this.A0A.A01(c38321qM, c75113Zb, null);
    }

    @Override // X.InterfaceC31076DlJ
    public final void Dwa(C38321qM c38321qM) {
        InterfaceC110104xf AdG;
        String templateMediaId;
        BKA bka = this.A0B;
        UserSession userSession = bka.A04;
        InterfaceC110214xq A1R = c38321qM.A1R();
        if (A1R != null && (AdG = A1R.AdG()) != null && (templateMediaId = AdG.getTemplateMediaId()) != null) {
            AbstractC37834Gko.A06(bka.A01, userSession, templateMediaId);
        }
    }

    @Override // X.InterfaceC31076DlJ
    public final void Dwb(C38321qM c38321qM) {
        BKA bka = this.A0B;
        AbstractC27715CKi.A00(bka.A01, Nj6.REELS, bka.A04, c38321qM);
    }

    @Override // X.InterfaceC31076DlJ
    public final void D8f(C38321qM c38321qM) {
        PromptStickerModel A00 = C37759GjY.A00(c38321qM);
        if (A00 != null) {
            this.A08.A04(C8JW.A0C, c38321qM, A00, this.A03.CGJ());
        }
    }

    @Override // X.InterfaceC31076DlJ
    public final void Djp(C38321qM c38321qM) {
        C66277U6x A01 = C66277U6x.A01(AbstractC111324zv.A00(814), AbstractC166987dD.A1G());
        FragmentActivity fragmentActivity = this.A07;
        IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig(this.A00);
        igBloksScreenConfig.A0U = fragmentActivity.getString(2131956194);
        igBloksScreenConfig.A0P = C05F.A01;
        A01.A04(fragmentActivity, igBloksScreenConfig);
    }
}
