package X;

import android.app.Application;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.autocreatedclips.repository.ClipsSoundSyncBeatsInfoRepository;
import com.instagram.creation.capture.quickcapture.autocreatedclips.repository.ClipsSoundSyncMediaImportRepository;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicAssetModel;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/* renamed from: X.Me1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50870Me1 extends C193578hc implements InterfaceC60072op {
    public boolean A00;
    public final int A01;
    public final InterfaceC58362lv A02;
    public final InterfaceC58362lv A03;
    public final UserSession A04;
    public final C14090nZ A05;
    public final C1810981l A06;
    public final C22C A07;
    public final ABW A08;
    public final O20 A09;
    public final C8XO A0A;
    public final AbstractC193598he A0B;
    public final C8JY A0C;
    public final C183348Bh A0D;
    public final ClipsCreationViewModel A0E;
    public final AnonymousClass825 A0F;
    public final C185418Kh A0G;
    public final OX1 A0H;
    public final List A0I;
    public final List A0J;
    public final List A0K;
    public final Queue A0L;
    public final InterfaceC24731Iq A0M;
    public final InterfaceC19390xP A0N;
    public final C05A A0O;
    public final C05A A0P;
    public final C05A A0Q;
    public final C05A A0R;
    public final C05A A0S;
    public final C05A A0T;
    public final C05A A0U;
    public final C0UO A0V;
    public final boolean A0W;
    public final C26086BgF A0X;
    public final C12L A0Y;
    public final C41185IKy A0Z;
    public final ClipsSoundSyncBeatsInfoRepository A0a;
    public final InterfaceC19390xP A0b;
    public final InterfaceC19390xP A0c;

    public static final void A02(AudioOverlayTrack audioOverlayTrack, C50870Me1 c50870Me1) {
        c50870Me1.A0U.Egh(Double.valueOf(0.4d));
        int i = audioOverlayTrack.A03;
        int i2 = audioOverlayTrack.A02 + i;
        int i3 = c50870Me1.A01 + i;
        if (i2 > i3) {
            i2 = i3;
        }
        c50870Me1.A0K.add(AbstractC25226BEj.A1L(new PYh(audioOverlayTrack, c50870Me1, null, i, i2), AbstractC141776au.A00(c50870Me1)));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(com.instagram.api.schemas.MusicCanonicalType r14, X.C50870Me1 r15, java.lang.String r16, X.InterfaceC23621Ds r17, int r18, int r19) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50870Me1.A00(com.instagram.api.schemas.MusicCanonicalType, X.Me1, java.lang.String, X.1Ds, int, int):java.lang.Object");
    }

    public static final void A03(AudioOverlayTrack audioOverlayTrack, C50870Me1 c50870Me1) {
        if (!c50870Me1.A00 && c50870Me1.A0H.A01) {
            c50870Me1.A0L.add(new RunnableC57029PRu(audioOverlayTrack, c50870Me1));
        } else {
            A02(audioOverlayTrack, c50870Me1);
        }
        AbstractC43594JPz.A1T(c50870Me1.A0Q);
    }

    public static final void A04(C50870Me1 c50870Me1) {
        Iterator it = c50870Me1.A0K.iterator();
        while (it.hasNext()) {
            AnonymousClass195 anonymousClass195 = (AnonymousClass195) it.next();
            if (anonymousClass195.isActive()) {
                anonymousClass195.AGH(null);
            }
            it.remove();
        }
    }

    public static final void A05(C50870Me1 c50870Me1) {
        c50870Me1.A0E.A08 = true;
        A04(c50870Me1);
        OX1 ox1 = c50870Me1.A0H;
        AbstractC166997dE.A1Y(ox1.A0G, true);
        if (ox1.A04 == C22P.A3b) {
            if (C18U.A06(C06090Tz.A05, ox1.A07, 36320734536016740L)) {
                ox1.A08.A01(C05F.A0Y, ox1.A03());
                AbstractC166987dD.A1Z(new C57156PZa(c50870Me1, null, 16), AbstractC141776au.A00(c50870Me1));
            }
        }
        ox1.A08.A01(C05F.A00, ox1.A03());
        ox1.A01 = false;
        AbstractC166987dD.A1Z(new C57156PZa(c50870Me1, null, 16), AbstractC141776au.A00(c50870Me1));
    }

    public static final void A06(C50870Me1 c50870Me1, Exception exc) {
        C0f5 AEp = C18950wb.A01.AEp("ClipsSoundSyncViewModel", 817902720);
        String message = exc.getMessage();
        if (message == null) {
            message = "";
        }
        AbstractC167007dF.A15(AEp, DialogModule.KEY_MESSAGE, message, exc);
        D51.A02(c50870Me1, AbstractC141776au.A00(c50870Me1), 42);
    }

    @Override // X.AbstractC52922bZ
    public final void onCleared() {
        C2GT c2gt = this.A0E.A0C;
        c2gt.A08(this.A02);
        c2gt.A08(this.A03);
        OX1 ox1 = this.A0H;
        ClipsCreationViewModel clipsCreationViewModel = ox1.A0A;
        clipsCreationViewModel.A0K.A06.A08(ox1.A03);
        C84B A0N = MSY.A0N(clipsCreationViewModel);
        if (A0N != null) {
            ClipsSoundSyncMediaImportRepository clipsSoundSyncMediaImportRepository = ox1.A08;
            ArrayList A05 = A0N.A05();
            ArrayList A0q = AbstractC167017dG.A0q(A05);
            Iterator it = A05.iterator();
            while (it.hasNext()) {
                A0q.add(AbstractC166987dD.A11(MSX.A0O(it).A0F).getAbsolutePath());
            }
            HashSet hashSet = clipsSoundSyncMediaImportRepository.A0A;
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                File file = (File) it2.next();
                if (!A0q.contains(file.getAbsolutePath())) {
                    file.delete();
                }
            }
            hashSet.clear();
        }
        ox1.A01 = false;
        ox1.A06.A00.D9x();
    }

    public static final void A01(AbstractC193598he abstractC193598he, C50870Me1 c50870Me1, List list, List list2, boolean z) {
        if (list.size() == list2.size()) {
            Iterator it = AbstractC001800i.A0R(list, list2).iterator();
            while (it.hasNext()) {
                C09530e4 A17 = AbstractC43592JPx.A17(it);
                AbstractC115485Ki abstractC115485Ki = (AbstractC115485Ki) A17.A00;
                OLX olx = (OLX) A17.A01;
                if (abstractC115485Ki instanceof C115475Kh) {
                    C115475Kh c115475Kh = (C115475Kh) abstractC115485Ki;
                    c115475Kh.A09 = olx.A01;
                    c115475Kh.A08 = olx.A00;
                } else if (abstractC115485Ki instanceof C52435NIf) {
                    ((C52435NIf) abstractC115485Ki).A00 = olx.A00 - olx.A01;
                } else {
                    throw B4Z.A00();
                }
            }
            ArrayList A0q = AbstractC167017dG.A0q(list);
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                AbstractC166997dE.A1W(A0q, ((AbstractC115485Ki) it2.next()).BsL());
            }
            int A02 = AbstractC001800i.A02(A0q);
            ArrayList A01 = AnonymousClass827.A01(c50870Me1.A04);
            int i = 0;
            while (i < A01.size() - 1 && ((AnonymousClass826) A01.get(i)).A01 < A02) {
                i++;
            }
            AnonymousClass826 anonymousClass826 = (AnonymousClass826) A01.get(i);
            C2GS c2gs = c50870Me1.A0F.A05;
            AnonymousClass826 anonymousClass8262 = (AnonymousClass826) c2gs.A02();
            if (anonymousClass8262 != null) {
                if (anonymousClass826.A01 > anonymousClass8262.A01) {
                    c2gs.A0B(anonymousClass826);
                } else {
                    anonymousClass826 = anonymousClass8262;
                }
                if ((abstractC193598he instanceof C8ZT) && ((AudioOverlayTrack) abstractC193598he.A00()).A08 != null) {
                    AudioOverlayTrack audioOverlayTrack = (AudioOverlayTrack) abstractC193598he.A00();
                    int i2 = anonymousClass826.A01;
                    MusicAssetModel musicAssetModel = audioOverlayTrack.A08;
                    C14360o3.A0A(musicAssetModel);
                    audioOverlayTrack.A02 = Math.min(i2, musicAssetModel.A00);
                }
            }
            c50870Me1.A0E.A0a(abstractC193598he, list, z);
            return;
        }
        throw AbstractC166987dD.A14(AnonymousClass001.A02(list.size(), list2.size(), "segment size mismatch: ", ", "));
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        D51.A02(this, AbstractC141776au.A00(this), 43);
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50870Me1(Application application, C26086BgF c26086BgF, UserSession userSession, C1810981l c1810981l, C41185IKy c41185IKy, ClipsSoundSyncBeatsInfoRepository clipsSoundSyncBeatsInfoRepository, ABW abw, ClipsSoundSyncMediaImportRepository clipsSoundSyncMediaImportRepository, O20 o20, C8XO c8xo, ClipsCreationViewModel clipsCreationViewModel, AnonymousClass825 anonymousClass825, C185418Kh c185418Kh, List list, int i, boolean z) {
        super(application);
        AbstractC25233BEq.A0x(3, c8xo, clipsCreationViewModel, c185418Kh);
        C14360o3.A0B(anonymousClass825, 6);
        AbstractC25232BEp.A1P(abw, c1810981l);
        C14360o3.A0B(c41185IKy, 12);
        C14360o3.A0B(c26086BgF, 14);
        this.A04 = userSession;
        this.A0A = c8xo;
        this.A0E = clipsCreationViewModel;
        this.A0G = c185418Kh;
        this.A0F = anonymousClass825;
        this.A0a = clipsSoundSyncBeatsInfoRepository;
        this.A09 = o20;
        this.A08 = abw;
        this.A06 = c1810981l;
        this.A0Z = c41185IKy;
        this.A01 = i;
        this.A0X = c26086BgF;
        this.A0W = z;
        this.A0J = list;
        AbstractC193598he abstractC193598he = (AbstractC193598he) clipsCreationViewModel.A0K.A06.A02();
        this.A0B = abstractC193598he == null ? C193588hd.A00 : abstractC193598he;
        C84B A0N = MSY.A0N(clipsCreationViewModel);
        List A05 = A0N != null ? A0N.A05() : C16930sl.A00;
        this.A0I = A05;
        C12L c12l = C12L.A00;
        this.A0Y = c12l;
        this.A05 = c12l.AOT(2088859822, 1);
        this.A07 = AnonymousClass229.A01(userSession);
        this.A0D = AbstractC183338Bg.A00(userSession);
        this.A0C = C8JX.A00(userSession);
        C24721Ip c24721Ip = new C24721Ip(0);
        this.A0M = c24721Ip;
        C008002u A00 = C10E.A00(null);
        this.A0T = A00;
        C008002u A1H = AbstractC25225BEi.A1H(false);
        this.A0R = A1H;
        C008002u A1H2 = AbstractC25225BEi.A1H(false);
        this.A0S = A1H2;
        C008002u A1H3 = AbstractC25225BEi.A1H(false);
        this.A0Q = A1H3;
        C008002u A1H4 = AbstractC25225BEi.A1H(false);
        this.A0P = A1H4;
        C008002u A1H5 = AbstractC25225BEi.A1H(Double.valueOf(0.0d));
        this.A0U = A1H5;
        this.A0K = AbstractC166987dD.A1E();
        this.A02 = new MY1(this, 20);
        this.A03 = new MY1(this, 21);
        this.A0N = AbstractC07080Za.A03(c24721Ip);
        C008002u A1H6 = AbstractC25225BEi.A1H(false);
        this.A0O = A1H6;
        this.A0L = new LinkedList();
        clipsCreationViewModel.A0a(C193588hd.A00, C16930sl.A00, false);
        OX1 ox1 = new OX1(application, anonymousClass825.A00, c26086BgF, userSession, (C55U) c1810981l.A08.A00, clipsSoundSyncMediaImportRepository, clipsCreationViewModel, A05, list, AbstractC141776au.A00(this));
        AbstractC25232BEp.A1J(this, new C57156PZa(this, null, 14), ox1.A0F);
        AbstractC25232BEp.A1J(this, new PYw(this, null, 44), ox1.A0H);
        this.A0H = ox1;
        C15150pV A03 = C10Q.A03(new MU8((InterfaceC23621Ds) null, (Object) new C57190PaZ(this, null), 47), C10Q.A00(C57207Par.A00, ox1.A0I, A1H, A1H2), C10Q.A00(C57208Pas.A00, A1H3, A1H4, ox1.A0G));
        this.A0c = A03;
        C15150pV A032 = C10Q.A03(new C57175PZy(this, null), ox1.A0J, A1H5);
        this.A0b = A032;
        this.A0V = AbstractC208910l.A01(new C51663Mru(null, EnumC53101NeE.A08, 0.0d, false), AbstractC141776au.A00(this), C10Q.A01(new C57186PaP(this, null), A03, A00, A032, A1H6), C10I.A01);
    }
}
