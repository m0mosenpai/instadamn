package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.CreationSession;
import com.instagram.creation.base.CropInfo;
import com.instagram.creation.base.MediaSession;
import com.instagram.creation.base.VideoSession;
import com.instagram.creation.fragment.AlbumEditFragment;
import com.instagram.creation.photo.edit.effectfilter.PhotoFilter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.MaO, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50723MaO extends AbstractC52922bZ implements C8MA, InterfaceC58110PpZ {
    public C50634MWv A00;
    public NHE A01;
    public NHE A02;
    public WeakReference A03;
    public boolean A04;
    public final InterfaceC193488hT A05;
    public final UserSession A06;
    public final C22C A07;
    public final AnonymousClass841 A08;
    public final C6WI A09;
    public final List A0A;
    public final InterfaceC24731Iq A0B;
    public final InterfaceC24731Iq A0C;
    public final InterfaceC24731Iq A0D;
    public final InterfaceC19390xP A0E;
    public final InterfaceC19390xP A0F;
    public final InterfaceC19390xP A0G;
    public final InterfaceC19390xP A0H;
    public final InterfaceC19390xP A0I;
    public final C05A A0J;
    public final C05A A0K;
    public final C05A A0L;
    public final C05A A0M;
    public final C05A A0N;
    public final C0UO A0O;
    public final C0UO A0P;
    public final C0UO A0Q;
    public final boolean A0R;
    public final AnonymousClass840 A0S;
    public final InterfaceC24731Iq A0T;

    public C50723MaO(UserSession userSession, C22C c22c, AnonymousClass840 anonymousClass840, AnonymousClass841 anonymousClass841, C6WI c6wi, boolean z) {
        MediaSession mediaSession;
        C14360o3.A0B(userSession, 1);
        this.A06 = userSession;
        this.A0S = anonymousClass840;
        this.A08 = anonymousClass841;
        this.A0R = z;
        this.A09 = c6wi;
        this.A07 = c22c;
        AnonymousClass841 anonymousClass8412 = anonymousClass840.A00;
        Integer num = null;
        if (anonymousClass8412 != null && (mediaSession = (MediaSession) AbstractC001800i.A0J(anonymousClass8412.CpK())) != null) {
            num = mediaSession.Btq();
        }
        Integer num2 = C05F.A00;
        C008002u A1H = AbstractC25225BEi.A1H(new C51688MsJ(AbstractC167007dF.A1X(num, num2), 3));
        this.A0L = A1H;
        this.A0Q = A1H;
        C24721Ip c24721Ip = new C24721Ip(0);
        this.A0T = c24721Ip;
        this.A0I = AbstractC07080Za.A03(c24721Ip);
        C24721Ip c24721Ip2 = new C24721Ip(0);
        this.A0D = c24721Ip2;
        C16930sl c16930sl = C16930sl.A00;
        C008002u A00 = C10E.A00(c16930sl);
        this.A0M = A00;
        C008002u A002 = C10E.A00(c16930sl);
        this.A0N = A002;
        C008002u A1H2 = AbstractC25225BEi.A1H(new C51756Mtf(37));
        this.A0K = A1H2;
        this.A0P = A1H2;
        this.A0G = AbstractC07080Za.A03(c24721Ip2);
        this.A0E = AbstractC208910l.A01(new C51589Mqh(c16930sl, c16930sl), AbstractC141776au.A00(this), C10Q.A03(C57199Paj.A00, A00, A002), C10I.A01);
        C24721Ip c24721Ip3 = new C24721Ip(0);
        this.A0B = c24721Ip3;
        this.A0F = AbstractC07080Za.A03(c24721Ip3);
        C008002u A1H3 = AbstractC25225BEi.A1H(new C50627MWo(num2));
        this.A0J = A1H3;
        this.A0O = A1H3;
        this.A00 = new C50634MWv(7, 3, false, false);
        C24721Ip c24721Ip4 = new C24721Ip(0);
        this.A0C = c24721Ip4;
        this.A0H = AbstractC07080Za.A03(c24721Ip4);
        this.A05 = new C48282LYf(this, 1);
        C56228Oxb c56228Oxb = new C56228Oxb(userSession);
        LinkedList<C54629OBe> A003 = AbstractC53888NsK.A00(userSession);
        ArrayList A0q = AbstractC167017dG.A0q(A003);
        for (C54629OBe c54629OBe : A003) {
            UserSession userSession2 = this.A06;
            C14360o3.A0A(c54629OBe);
            A0q.add(new NHE(userSession2, c54629OBe, c56228Oxb));
        }
        this.A0A = A0q;
    }

    public final void A03(Context context, MediaSession mediaSession, InterfaceC189598ae interfaceC189598ae, boolean z, boolean z2) {
        C14360o3.A0B(mediaSession, 0);
        UserSession userSession = this.A06;
        C50713MaC.A01(userSession, context);
        C55105ObK A00 = C50713MaC.A00(userSession);
        A00.A08(this.A0S);
        A00.A09(z);
        if (mediaSession.Btq().intValue() != 0) {
            int A01 = LBN.A01(context, false);
            C43823JZl c43823JZl = new C43823JZl(context, MSW.A0w(context.getExternalFilesDir(null), "icon_zero_frame.jpg"), MSY.A0U(mediaSession, interfaceC189598ae), A00, A01, 4);
            if (z2) {
                AbstractC25231BEo.A1H(c43823JZl, AbstractC141776au.A00(this), 19);
            } else {
                c43823JZl.invoke();
            }
        } else {
            CropInfo AtF = mediaSession.AtF();
            if (AtF != null) {
                A00.A02(context, AtF, mediaSession.B2v().getValue(), false);
                A00.A05(context, mediaSession.B6E());
            }
        }
        CreationSession creationSession = ((MX5) this.A08).A01;
        List list = creationSession.A0E;
        if (!list.contains(mediaSession)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                MediaSession A0R = MSW.A0R(it);
                if (A0R.B6E().equals(mediaSession.B6E())) {
                    list.set(list.indexOf(A0R), mediaSession);
                }
            }
            throw AbstractC166987dD.A14("MediaSession not contained in media session list");
        }
        creationSession.A07 = mediaSession;
        mediaSession.BqI().ELh();
    }

    public final void A06(Integer num, boolean z) {
        C14360o3.A0B(num, 1);
        C05A c05a = this.A0J;
        InterfaceC58189Pqv interfaceC58189Pqv = (InterfaceC58189Pqv) ((C50627MWo) c05a.getValue()).A00;
        if (interfaceC58189Pqv != null) {
            interfaceC58189Pqv.Cvt(z);
        }
        do {
        } while (!c05a.AIi(c05a.getValue(), new C50627MWo(num)));
    }

    @Override // X.InterfaceC58110PpZ
    public final void DtC(C47283Kuu c47283Kuu) {
    }

    @Override // X.InterfaceC58110PpZ
    public final void DtD(C44428Jkf c44428Jkf) {
        PhotoFilter photoFilter;
        C14360o3.A0B(c44428Jkf, 0);
        NHE nhe = this.A02;
        if (nhe == null || (photoFilter = (PhotoFilter) nhe.A01.getValue()) == null) {
            NHE nhe2 = this.A01;
            if (nhe2 != null) {
                photoFilter = (PhotoFilter) nhe2.A01.getValue();
            } else {
                photoFilter = null;
            }
        }
        InterfaceC50490MQs interfaceC50490MQs = c44428Jkf.A05.A01;
        C14360o3.A07(interfaceC50490MQs);
        InterfaceC58189Pqv Arg = interfaceC50490MQs.Arg();
        if (Arg != null && Arg.COP(c44428Jkf, photoFilter)) {
            DtE(c44428Jkf, false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a0, code lost:
    
        if (X.MSX.A04(r12) != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a2, code lost:
    
        if (r13 == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a4, code lost:
    
        r6 = r5.A01.getValue();
        r5 = r11.A0J;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00bb, code lost:
    
        if (r5.AIi(r5.getValue(), new X.C50627MWo(r4, X.C05F.A0C)) == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00bd, code lost:
    
        if (r6 == null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00bf, code lost:
    
        r8.A0N = true;
        r2 = r11.A07;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c7, code lost:
    
        if (r2.A0J() == null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c9, code lost:
    
        X.C22C.A08(X.EnumC50631MWs.A0I, r2, "FEED_COLOR_FILTER_STRENGTH_ALL_CAROUSEL_TAP", false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d0, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00dd, code lost:
    
        if (X.MSX.A04(r12) != 0) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0184 A[LOOP:3: B:57:0x017e->B:59:0x0184, LOOP_END] */
    @Override // X.InterfaceC58110PpZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DtE(X.C44428Jkf r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50723MaO.DtE(X.Jkf, boolean):void");
    }

    public final List A02(InterfaceC189598ae interfaceC189598ae) {
        C47Z BcC;
        List<VideoSession> FDe = this.A08.FDe();
        ArrayList A1E = AbstractC166987dD.A1E();
        for (VideoSession videoSession : FDe) {
            if (interfaceC189598ae != null && (BcC = interfaceC189598ae.BcC(videoSession.A0G)) != null) {
                A1E.add(BcC);
            }
        }
        return A1E;
    }

    public final void A05(Integer num) {
        C05A c05a = this.A0J;
        do {
        } while (!c05a.AIi(c05a.getValue(), new C50627MWo(num)));
        C448724r c448724r = this.A07.A0F;
        InterfaceC02590Ai A0M = MSZ.A0M(c448724r);
        if (A0M.isSampled()) {
            MSW.A1N(C81X.A0e, A0M);
            AbstractC166987dD.A1S(A0M, MSX.A0f(c448724r.A04));
            MSX.A1E(A0M);
            AbstractC167017dG.A1B(A0M);
            MSX.A1C(A0M);
            A0M.Cht();
        }
    }

    public final boolean A07() {
        UserSession userSession = this.A06;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (!C18U.A06(c06090Tz, userSession, 36328491247091266L) && !C18U.A06(c06090Tz, userSession, 36328491247156803L)) {
            return false;
        }
        return true;
    }

    @Override // X.C8MA
    public final void EGV() {
        this.A0T.F8s(new Object());
    }

    public static C50627MWo A00(AlbumEditFragment albumEditFragment) {
        return (C50627MWo) AlbumEditFragment.A03(albumEditFragment).A0O.getValue();
    }

    public static boolean A01(AlbumEditFragment albumEditFragment) {
        return AlbumEditFragment.A03(albumEditFragment).A07();
    }

    public final void A04(InterfaceC189598ae interfaceC189598ae, boolean z) {
        Iterator it = A02(interfaceC189598ae).iterator();
        while (it.hasNext()) {
            AbstractC43592JPx.A0l(it).A5F = z;
        }
    }
}
