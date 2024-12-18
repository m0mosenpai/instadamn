package X;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.instagram.api.schemas.BrandSafetyContentBlocklistBitmapQLObj;
import com.instagram.api.schemas.MediaControlEventSourceEnum;
import com.instagram.business.activity.BusinessConversionActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: X.36u, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C685736u extends C685836v implements InterfaceC63392uM, InterfaceC686036x, AnonymousClass386 {
    public InterfaceC101004gG A00;
    public InterfaceC101074gN A01;
    public InterfaceC904041a A02;
    public C3VU A03;
    public C41V A04;
    public InterfaceC105254of A05;
    public InterfaceC92434Ca A06;
    public InterfaceC86963uC A07;
    public JG2 A08;
    public InterfaceC909343k A09;
    public InterfaceC75403a7 A0A;
    public InterfaceC690438q A0B;
    public InterfaceC690038m A0C;
    public InterfaceC75453aC A0D;
    public InterfaceC86223st A0E;
    public InterfaceC79883hd A0F;
    public InterfaceC692739n A0G;
    public AnonymousClass388 A0H;
    public InterfaceC75603aR A0I;
    public final UserSession A0J;
    public final InterfaceC60442pS A0K;
    public final C65192xH A0L;
    public final C63762ux A0M;
    public final C1M1 A0N;
    public final C60662pp A0O;
    public final C684936m A0P;
    public final C33A A0Q;
    public final C33F A0R;
    public final InterfaceC670430v A0S;
    public final C61552rI A0T;
    public final C669430l A0U;
    public final C685136o A0V;
    public final InterfaceC61432r6 A0W;
    public final C36X A0X;
    public final C691338z A0Y;
    public final AnonymousClass390 A0Z;
    public final Map A0a;
    public final Map A0b;

    public final void A02(InterfaceC73233Pz interfaceC73233Pz, InterfaceC75123Zc interfaceC75123Zc, int i) {
        C14360o3.A0B(interfaceC73233Pz, 0);
        C63762ux c63762ux = this.A0M;
        C63622uj c63622uj = c63762ux.A01;
        String id = interfaceC73233Pz.getId();
        id.getClass();
        C59062n7 A00 = c63622uj.A00(id);
        if (A00 == C59062n7.A07) {
            c63762ux.A9W(interfaceC73233Pz, interfaceC75123Zc);
            String id2 = interfaceC73233Pz.getId();
            id2.getClass();
            A00 = c63622uj.A00(id2);
        }
        String id3 = interfaceC73233Pz.getId();
        id3.getClass();
        String A0b = AnonymousClass001.A0b(id3, ":", i);
        c63622uj.A01(new C59062n7(A00, interfaceC73233Pz, interfaceC75123Zc, A0b, null), A0b);
    }

    @Override // X.InterfaceC63392uM
    public final void A9W(InterfaceC73233Pz interfaceC73233Pz, InterfaceC75123Zc interfaceC75123Zc) {
        C14360o3.A0B(interfaceC73233Pz, 0);
        C14360o3.A0B(interfaceC75123Zc, 1);
        this.A0M.A9W(interfaceC73233Pz, interfaceC75123Zc);
    }

    @Override // X.InterfaceC63392uM
    public final void EDV(View view, InterfaceC73233Pz interfaceC73233Pz) {
        C14360o3.A0B(interfaceC73233Pz, 0);
        C14360o3.A0B(view, 1);
        this.A0M.EDV(view, interfaceC73233Pz);
    }

    public static final void A01(C685736u c685736u, int i) {
        C1QE.A01(AbstractC43591JPw.A00(820)).A08();
        AbstractC155756z4.A00();
        C60662pp c60662pp = c685736u.A0O;
        Intent intent = new Intent(c60662pp.requireContext(), (Class<?>) BusinessConversionActivity.class);
        Bundle requireArguments = c60662pp.requireArguments();
        requireArguments.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "net_ego");
        requireArguments.putInt(AbstractC111324zv.A00(1029), i);
        requireArguments.putInt(AbstractC43591JPw.A00(314), 0);
        intent.putExtras(requireArguments);
        C12260kU.A06(c60662pp, intent, 11);
    }

    public final void A04(C114385Ef c114385Ef, C47K c47k) {
        C42592ItB c42592ItB = new C42592ItB(c47k, c114385Ef);
        C60662pp c60662pp = this.A0O;
        C50674MYs c50674MYs = new C50674MYs(c60662pp.requireContext(), this.A0J);
        c50674MYs.A03(new ViewOnClickListenerC41956Iin(c114385Ef, c42592ItB, this), 2131963527);
        new C31727DwY(c50674MYs).A07(c60662pp.requireContext());
    }

    @Override // X.C685836v, X.InterfaceC686136y
    public final InterfaceC92434Ca AZI() {
        InterfaceC92434Ca interfaceC92434Ca = this.A06;
        if (interfaceC92434Ca == null) {
            InterfaceC92434Ca AZI = super.AZI();
            UserSession userSession = this.A0J;
            C60662pp c60662pp = this.A0O;
            C65192xH c65192xH = this.A0L;
            C691338z c691338z = this.A0Y;
            C92444Cb c92444Cb = new C92444Cb(c60662pp, this.A0P, userSession, AZI, c65192xH, this.A0V, this.A0X, c691338z);
            this.A06 = c92444Cb;
            return c92444Cb;
        }
        return interfaceC92434Ca;
    }

    @Override // X.C685836v, X.C37O
    public final InterfaceC101004gG Am6() {
        InterfaceC101004gG interfaceC101004gG = this.A00;
        if (interfaceC101004gG == null) {
            final InterfaceC101004gG Am6 = super.Am6();
            final UserSession userSession = this.A0J;
            final AnonymousClass390 anonymousClass390 = this.A0Z;
            InterfaceC101004gG interfaceC101004gG2 = new InterfaceC101004gG(userSession, Am6, anonymousClass390) { // from class: X.4gH
                public final UserSession A00;
                public final InterfaceC101004gG A01;
                public final AnonymousClass390 A02;

                {
                    C14360o3.A0B(Am6, 1);
                    C14360o3.A0B(userSession, 2);
                    C14360o3.A0B(anonymousClass390, 3);
                    this.A01 = Am6;
                    this.A00 = userSession;
                    this.A02 = anonymousClass390;
                }

                @Override // X.InterfaceC101004gG
                public final void DLg(C73083Pj c73083Pj, C905741s c905741s, C38321qM c38321qM, C75113Zb c75113Zb) {
                    C14360o3.A0B(c38321qM, 1);
                    this.A01.DLg(c73083Pj, c905741s, c38321qM, c75113Zb);
                    this.A02.A00(c73083Pj.A02, c38321qM, c73083Pj.A03);
                }

                @Override // X.InterfaceC101004gG
                public final void DRG(C38321qM c38321qM) {
                    C14360o3.A0B(c38321qM, 0);
                    this.A01.DRG(c38321qM);
                }

                @Override // X.C37R
                public final InterfaceC101074gN Am7() {
                    return this.A01.Am7();
                }

                @Override // X.C37P
                public final BC9 AmP() {
                    return this.A01.AmP();
                }

                @Override // X.C37C
                public final C3h2 BRL() {
                    return this.A01.BRL();
                }

                @Override // X.InterfaceC686236z
                public final InterfaceC86303t2 BRj() {
                    return this.A01.BRj();
                }

                @Override // X.AnonymousClass374
                public final InterfaceC86433tG BRk() {
                    return this.A01.BRk();
                }

                @Override // X.C37H
                public final AnonymousClass428 BZ0() {
                    return this.A01.BZ0();
                }

                @Override // X.AnonymousClass379
                public final AnonymousClass421 BZ3() {
                    return this.A01.BZ3();
                }
            };
            this.A00 = interfaceC101004gG2;
            return interfaceC101004gG2;
        }
        return interfaceC101004gG;
    }

    @Override // X.C685836v, X.C37R
    public final InterfaceC101074gN Am7() {
        InterfaceC101074gN interfaceC101074gN = this.A01;
        if (interfaceC101074gN == null) {
            final InterfaceC101074gN Am7 = super.Am7();
            final UserSession userSession = this.A0J;
            final C61552rI c61552rI = this.A0T;
            InterfaceC101074gN interfaceC101074gN2 = new InterfaceC101074gN(userSession, Am7, c61552rI) { // from class: X.4gO
                public final UserSession A00;
                public final InterfaceC101074gN A01;
                public final C61552rI A02;

                {
                    C14360o3.A0B(Am7, 1);
                    C14360o3.A0B(userSession, 2);
                    C14360o3.A0B(c61552rI, 3);
                    this.A01 = Am7;
                    this.A00 = userSession;
                    this.A02 = c61552rI;
                }

                @Override // X.InterfaceC101074gN
                public final void Dmc(C905741s c905741s, C38321qM c38321qM, C37905Gm2 c37905Gm2, C75113Zb c75113Zb, int i, int i2) {
                    C14360o3.A0B(c38321qM, 0);
                    this.A01.Dmc(c905741s, c38321qM, c37905Gm2, c75113Zb, i, i2);
                }

                @Override // X.AnonymousClass370
                public final JG7 BQm() {
                    return this.A01.BQm();
                }

                @Override // X.InterfaceC101074gN
                public final void DBS(C905741s c905741s, C38321qM c38321qM, C37905Gm2 c37905Gm2, C75113Zb c75113Zb, int i) {
                    if (!C57532kS.A00(this.A00).A0N(c38321qM)) {
                        this.A02.A00("LIKE");
                    }
                    this.A01.DBS(c905741s, c38321qM, c37905Gm2, c75113Zb, i);
                }
            };
            this.A01 = interfaceC101074gN2;
            return interfaceC101074gN2;
        }
        return interfaceC101074gN;
    }

    @Override // X.C685836v, X.InterfaceC686337a
    public final InterfaceC904041a AmA() {
        InterfaceC904041a interfaceC904041a = this.A02;
        if (interfaceC904041a == null) {
            final InterfaceC904041a AmA = super.AmA();
            final UserSession userSession = this.A0J;
            final C61552rI c61552rI = this.A0T;
            InterfaceC904041a interfaceC904041a2 = new InterfaceC904041a(userSession, AmA, this, c61552rI) { // from class: X.41c
                public final UserSession A00;
                public final InterfaceC904041a A01;
                public final InterfaceC686136y A02;
                public final C61552rI A03;

                {
                    C14360o3.A0B(AmA, 1);
                    C14360o3.A0B(userSession, 3);
                    C14360o3.A0B(c61552rI, 4);
                    this.A01 = AmA;
                    this.A02 = this;
                    this.A00 = userSession;
                    this.A03 = c61552rI;
                }

                @Override // X.InterfaceC904141b
                public final void DBT(C69228Vjw c69228Vjw, C38321qM c38321qM, C37905Gm2 c37905Gm2, C75113Zb c75113Zb, int i) {
                    C14360o3.A0B(c38321qM, 0);
                    C14360o3.A0B(c75113Zb, 1);
                    if (!C57532kS.A00(this.A00).A0N(c38321qM)) {
                        this.A03.A00("LIKE");
                    }
                    this.A01.DBT(c69228Vjw, c38321qM, c37905Gm2, c75113Zb, i);
                }

                @Override // X.InterfaceC904141b
                public final void Dme(C69228Vjw c69228Vjw, C38321qM c38321qM, C37905Gm2 c37905Gm2, C75113Zb c75113Zb, int i) {
                    C14360o3.A0B(c38321qM, 0);
                    C14360o3.A0B(c75113Zb, 1);
                    this.A01.Dme(c69228Vjw, c38321qM, c37905Gm2, c75113Zb, i);
                }

                @Override // X.AnonymousClass370
                public final JG7 BQm() {
                    return this.A02.BQm();
                }
            };
            this.A02 = interfaceC904041a2;
            return interfaceC904041a2;
        }
        return interfaceC904041a;
    }

    @Override // X.C685836v, X.InterfaceC686136y
    public final C3VU AmF() {
        C3VU c3vu = this.A03;
        if (c3vu == null) {
            final C3VU AmF = super.AmF();
            final C61552rI c61552rI = this.A0T;
            C3VU c3vu2 = new C3VU(AmF, c61552rI) { // from class: X.3VV
                public final C3VU A00;
                public final C61552rI A01;

                {
                    C14360o3.A0B(AmF, 1);
                    C14360o3.A0B(c61552rI, 2);
                    this.A00 = AmF;
                    this.A01 = c61552rI;
                }

                @Override // X.C37M
                public final InterfaceC80083hx Ai8() {
                    return this.A00.Ai8();
                }

                @Override // X.C37O
                public final InterfaceC101004gG Am6() {
                    return this.A00.Am6();
                }

                @Override // X.InterfaceC686337a
                public final InterfaceC904041a AmA() {
                    return this.A00.AmA();
                }

                @Override // X.C37W
                public final InterfaceC904541f AmN() {
                    return this.A00.AmN();
                }

                @Override // X.C37E
                public final C41V AmT() {
                    return this.A00.AmT();
                }

                @Override // X.C37K
                public final InterfaceC86673tf ApH() {
                    return this.A00.ApH();
                }

                @Override // X.AnonymousClass372
                public final C39G Ar3() {
                    return this.A00.Ar3();
                }

                @Override // X.InterfaceC686236z
                public final InterfaceC86303t2 BRj() {
                    throw C00O.createAndThrow();
                }

                @Override // X.C3VU
                public final void Dg6(View view, C38321qM c38321qM, int i) {
                    this.A00.Dg6(view, c38321qM, i);
                }

                @Override // X.C3VU
                public final void EDw(View view, C38321qM c38321qM, C75113Zb c75113Zb, int i) {
                    C14360o3.A0B(c38321qM, 1);
                    this.A00.EDw(view, c38321qM, c75113Zb, i);
                }

                @Override // X.C3VU
                public final void D2a(C38321qM c38321qM, C38321qM c38321qM2, C38321qM c38321qM3, int i, int i2, int i3) {
                    this.A01.A00("CAROUSEL_SWIPE");
                    this.A00.D2a(c38321qM, c38321qM2, c38321qM3, i, i2, i3);
                }
            };
            this.A03 = c3vu2;
            return c3vu2;
        }
        return c3vu;
    }

    @Override // X.C685836v, X.C37S
    public final InterfaceC105254of AmS() {
        InterfaceC105254of interfaceC105254of = this.A05;
        if (interfaceC105254of == null) {
            final InterfaceC105254of AmS = super.AmS();
            final UserSession userSession = this.A0J;
            final C61552rI c61552rI = this.A0T;
            InterfaceC105254of interfaceC105254of2 = new InterfaceC105254of(userSession, AmS, this, c61552rI) { // from class: X.4og
                public final UserSession A00;
                public final InterfaceC105254of A01;
                public final InterfaceC686136y A02;
                public final C61552rI A03;

                {
                    C14360o3.A0B(AmS, 1);
                    C14360o3.A0B(userSession, 3);
                    C14360o3.A0B(c61552rI, 4);
                    this.A01 = AmS;
                    this.A02 = this;
                    this.A00 = userSession;
                    this.A03 = c61552rI;
                }

                @Override // X.InterfaceC105254of
                public final void Dmg(C38321qM c38321qM, C37905Gm2 c37905Gm2, C3Y7 c3y7, C75113Zb c75113Zb, int i, int i2) {
                    C14360o3.A0B(c38321qM, 0);
                    C14360o3.A0B(c75113Zb, 1);
                    this.A01.Dmg(c38321qM, c37905Gm2, c3y7, c75113Zb, i, i2);
                }

                @Override // X.AnonymousClass370
                public final JG7 BQm() {
                    return this.A02.BQm();
                }

                @Override // X.InterfaceC105254of
                public final void DBV(C105184oY c105184oY, C38321qM c38321qM, C37905Gm2 c37905Gm2, C75113Zb c75113Zb, int i) {
                    if (!C57532kS.A00(this.A00).A0N(c38321qM)) {
                        this.A03.A00("LIKE");
                    }
                    this.A01.DBV(c105184oY, c38321qM, c37905Gm2, c75113Zb, i);
                }
            };
            this.A05 = interfaceC105254of2;
            return interfaceC105254of2;
        }
        return interfaceC105254of;
    }

    @Override // X.C685836v, X.C37E
    public final C41V AmT() {
        C41V c41v = this.A04;
        if (c41v == null) {
            final C41V AmT = super.AmT();
            final UserSession userSession = this.A0J;
            final AnonymousClass390 anonymousClass390 = this.A0Z;
            C41V c41v2 = new C41V(userSession, AmT, anonymousClass390) { // from class: X.41W
                public final UserSession A00;
                public final C41V A01;
                public final AnonymousClass390 A02;

                {
                    C14360o3.A0B(AmT, 1);
                    C14360o3.A0B(userSession, 2);
                    C14360o3.A0B(anonymousClass390, 3);
                    this.A01 = AmT;
                    this.A00 = userSession;
                    this.A02 = anonymousClass390;
                }

                @Override // X.C41V
                public final void DLh(C73083Pj c73083Pj, C105184oY c105184oY, C38321qM c38321qM, C75113Zb c75113Zb) {
                    C14360o3.A0B(c38321qM, 1);
                    C14360o3.A0B(c75113Zb, 2);
                    this.A01.DLh(c73083Pj, c105184oY, c38321qM, c75113Zb);
                    this.A02.A00(c73083Pj.A02, c38321qM, c73083Pj.A03);
                }

                @Override // X.C41V
                public final void DRH(C38321qM c38321qM) {
                    C14360o3.A0B(c38321qM, 0);
                    this.A01.DRH(c38321qM);
                }

                @Override // X.C41V
                public final void DXy(C38321qM c38321qM, C3Y7 c3y7, C75113Zb c75113Zb, int i) {
                    C14360o3.A0B(c38321qM, 0);
                    this.A01.DXy(c38321qM, c3y7, c75113Zb, i);
                }

                @Override // X.C37P
                public final BC9 AmP() {
                    return this.A01.AmP();
                }

                @Override // X.C37S
                public final InterfaceC105254of AmS() {
                    return this.A01.AmS();
                }

                @Override // X.C37C
                public final C3h2 BRL() {
                    return this.A01.BRL();
                }

                @Override // X.C37D
                public final InterfaceC80063hv BRf() {
                    return this.A01.BRf();
                }

                @Override // X.InterfaceC686236z
                public final InterfaceC86303t2 BRj() {
                    return this.A01.BRj();
                }

                @Override // X.C37H
                public final AnonymousClass428 BZ0() {
                    return this.A01.BZ0();
                }

                @Override // X.AnonymousClass379
                public final AnonymousClass421 BZ3() {
                    return this.A01.BZ3();
                }
            };
            this.A04 = c41v2;
            return c41v2;
        }
        return c41v;
    }

    @Override // X.C685836v, X.C37A
    public final InterfaceC690038m BDf() {
        InterfaceC690038m interfaceC690038m = this.A0C;
        if (interfaceC690038m == null) {
            final InterfaceC690038m BDf = super.BDf();
            final C65192xH c65192xH = this.A0L;
            InterfaceC690038m interfaceC690038m2 = new InterfaceC690038m(BDf, c65192xH) { // from class: X.3aO
                public final InterfaceC690038m A00;
                public final C65192xH A01;

                {
                    C14360o3.A0B(BDf, 1);
                    C14360o3.A0B(c65192xH, 2);
                    this.A00 = BDf;
                    this.A01 = c65192xH;
                }

                @Override // X.InterfaceC690038m
                public final void DKd(MediaControlEventSourceEnum mediaControlEventSourceEnum, C38321qM c38321qM, EnumC75193Zm enumC75193Zm, C75113Zb c75113Zb) {
                    C14360o3.A0B(c38321qM, 0);
                    C14360o3.A0B(c75113Zb, 1);
                    this.A00.DKd(null, c38321qM, enumC75193Zm, c75113Zb);
                    if (c38321qM.CdW()) {
                        this.A01.A09();
                    }
                }
            };
            this.A0C = interfaceC690038m2;
            return interfaceC690038m2;
        }
        return interfaceC690038m;
    }

    @Override // X.C685836v, X.AnonymousClass373
    public final InterfaceC75453aC BQw() {
        InterfaceC75453aC interfaceC75453aC = this.A0D;
        if (interfaceC75453aC == null) {
            InterfaceC75453aC BQw = super.BQw();
            UserSession userSession = this.A0J;
            C60662pp c60662pp = this.A0O;
            C75523aJ c75523aJ = new C75523aJ(c60662pp, c60662pp, userSession, BQw, this.A0L, this.A0U, this.A0X);
            this.A0D = c75523aJ;
            return c75523aJ;
        }
        return interfaceC75453aC;
    }

    @Override // X.C685836v, X.C37Q
    public final InterfaceC86223st BQy() {
        InterfaceC86223st interfaceC86223st = this.A0E;
        if (interfaceC86223st == null) {
            final InterfaceC86223st BQy = super.BQy();
            final UserSession userSession = this.A0J;
            final C61552rI c61552rI = this.A0T;
            InterfaceC86223st interfaceC86223st2 = new InterfaceC86223st(userSession, this, BQy, c61552rI) { // from class: X.3su
                public final UserSession A00;
                public final InterfaceC686136y A01;
                public final InterfaceC86223st A02;
                public final C61552rI A03;

                {
                    C14360o3.A0B(BQy, 1);
                    C14360o3.A0B(userSession, 3);
                    C14360o3.A0B(c61552rI, 4);
                    this.A02 = BQy;
                    this.A01 = this;
                    this.A00 = userSession;
                    this.A03 = c61552rI;
                }

                @Override // X.InterfaceC86223st
                public final void Dmb(C38321qM c38321qM, C37905Gm2 c37905Gm2, C81303k0 c81303k0, C75113Zb c75113Zb, int i) {
                    C14360o3.A0B(c38321qM, 0);
                    C14360o3.A0B(c75113Zb, 1);
                    this.A03.A00("SINGLE_TAP");
                    this.A02.Dmb(c38321qM, c37905Gm2, c81303k0, c75113Zb, i);
                }

                @Override // X.AnonymousClass370
                public final JG7 BQm() {
                    return this.A01.BQm();
                }

                @Override // X.InterfaceC86223st
                public final void DBR(C38321qM c38321qM, C37905Gm2 c37905Gm2, C81303k0 c81303k0, C75113Zb c75113Zb, int i) {
                    if (!C57532kS.A00(this.A00).A0N(c38321qM)) {
                        this.A03.A00("LIKE");
                    }
                    this.A02.DBR(c38321qM, c37905Gm2, c81303k0, c75113Zb, i);
                }
            };
            this.A0E = interfaceC86223st2;
            return interfaceC86223st2;
        }
        return interfaceC86223st;
    }

    @Override // X.C685836v, X.C37L
    public final AnonymousClass388 BRS() {
        AnonymousClass388 anonymousClass388 = this.A0H;
        if (anonymousClass388 == null) {
            C42809Iwl c42809Iwl = new C42809Iwl(this.A0T, super.BRS(), CCt());
            this.A0H = c42809Iwl;
            return c42809Iwl;
        }
        return anonymousClass388;
    }

    @Override // X.C685836v, X.C37J
    public final InterfaceC86963uC BRs() {
        InterfaceC86963uC interfaceC86963uC = this.A07;
        if (interfaceC86963uC == null) {
            final InterfaceC86963uC BRs = super.BRs();
            final UserSession userSession = this.A0J;
            final C669430l c669430l = this.A0U;
            final C65192xH c65192xH = this.A0L;
            InterfaceC86963uC interfaceC86963uC2 = new InterfaceC86963uC(userSession, BRs, c65192xH, c669430l) { // from class: X.3uD
                public final UserSession A00;
                public final InterfaceC65282xQ A01;
                public final C669430l A02;
                public final InterfaceC86963uC A03;

                {
                    C14360o3.A0B(BRs, 1);
                    C14360o3.A0B(userSession, 2);
                    C14360o3.A0B(c65192xH, 4);
                    this.A03 = BRs;
                    this.A00 = userSession;
                    this.A02 = c669430l;
                    this.A01 = c65192xH;
                }

                @Override // X.InterfaceC86963uC
                public final void D66(InterfaceC16820sZ interfaceC16820sZ) {
                    C14360o3.A0B(interfaceC16820sZ, 0);
                    this.A03.D66(interfaceC16820sZ);
                }

                @Override // X.InterfaceC86963uC
                public final void D67(C38321qM c38321qM, C75113Zb c75113Zb, int i, boolean z) {
                    EnumC222416a enumC222416a;
                    String A2W;
                    C14360o3.A0B(c38321qM, 0);
                    C14360o3.A0B(c75113Zb, 1);
                    this.A03.D67(c38321qM, c75113Zb, i, z);
                    Integer num = C05F.A0C;
                    EnumC71153Hb enumC71153Hb = EnumC71153Hb.A06;
                    C669430l c669430l2 = this.A02;
                    if (c669430l2 != null) {
                        if (c669430l2.A09(c38321qM, c75113Zb, enumC71153Hb, num)) {
                            InterfaceC65282xQ interfaceC65282xQ = this.A01;
                            UserSession userSession2 = this.A00;
                            if ((C18U.A06(C06090Tz.A05, userSession2, 36312866155922778L) || AbstractC61652rS.A08(userSession2, AbstractC23021Ah.A00(userSession2))) && c38321qM.A2W() != null) {
                                A2W = c38321qM.A2W();
                            } else {
                                A2W = c38321qM.getId();
                            }
                            c669430l2.A06(c38321qM, c75113Zb, enumC71153Hb, null, interfaceC65282xQ.BK6(A2W));
                            return;
                        }
                        User CDj = c38321qM.A0C.CDj();
                        if (CDj != null) {
                            enumC222416a = CDj.A0I();
                        } else {
                            enumC222416a = null;
                        }
                        if (!c669430l2.A08(c38321qM, c75113Zb, enumC71153Hb, enumC222416a)) {
                            return;
                        }
                        c669430l2.A05(c38321qM, c75113Zb, enumC71153Hb, this.A01.BK6(c38321qM.getId()));
                    }
                }
            };
            this.A07 = interfaceC86963uC2;
            return interfaceC86963uC2;
        }
        return interfaceC86963uC;
    }

    @Override // X.C685836v, X.C37X
    public final JG2 BRu() {
        JG2 jg2 = this.A08;
        if (jg2 == null) {
            C42498Ird c42498Ird = new C42498Ird(this.A0J, super.BRu(), this.A0T);
            this.A08 = c42498Ird;
            return c42498Ird;
        }
        return jg2;
    }

    @Override // X.C685836v, X.AnonymousClass376
    public final InterfaceC909343k BRw() {
        InterfaceC909343k interfaceC909343k = this.A09;
        if (interfaceC909343k == null) {
            final InterfaceC909343k BRw = super.BRw();
            final C60662pp c60662pp = this.A0O;
            final UserSession userSession = this.A0J;
            final C33F c33f = this.A0R;
            final C691338z c691338z = this.A0Y;
            final C36X c36x = this.A0X;
            InterfaceC909343k interfaceC909343k2 = new InterfaceC909343k(userSession, BRw, c33f, c36x, c691338z, c60662pp) { // from class: X.43l
                public final UserSession A00;
                public final InterfaceC909343k A01;
                public final C33F A02;
                public final C36X A03;
                public final C691338z A04;
                public final C60662pp A05;

                {
                    C14360o3.A0B(BRw, 1);
                    C14360o3.A0B(c60662pp, 2);
                    C14360o3.A0B(userSession, 3);
                    C14360o3.A0B(c691338z, 5);
                    C14360o3.A0B(c36x, 6);
                    this.A01 = BRw;
                    this.A05 = c60662pp;
                    this.A00 = userSession;
                    this.A02 = c33f;
                    this.A04 = c691338z;
                    this.A03 = c36x;
                }

                @Override // X.InterfaceC909343k
                public final void DSS(C38321qM c38321qM, C75113Zb c75113Zb, int i) {
                    C14360o3.A0B(c38321qM, 0);
                    this.A01.DSS(c38321qM, c75113Zb, i);
                }

                @Override // X.InterfaceC909343k
                public final void DlD(C38321qM c38321qM, InterfaceC16820sZ interfaceC16820sZ) {
                    C33F c33f2;
                    C14360o3.A0B(c38321qM, 0);
                    C14360o3.A0B(interfaceC16820sZ, 1);
                    C60662pp c60662pp2 = this.A05;
                    View view = c60662pp2.mView;
                    Context context = c60662pp2.getContext();
                    C3FQ c3fq = c60662pp2.mScrollingViewProxy;
                    if (context != null && view != null && c3fq != null && (c33f2 = this.A02) != null && !c60662pp2.A0Z()) {
                        ViewParent parent = c3fq.getParent();
                        C14360o3.A0C(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                        String string = context.getString(2131971275);
                        C14360o3.A07(string);
                        c33f2.A00((ViewGroup) parent, string, interfaceC16820sZ, 500L, true);
                        return;
                    }
                    this.A01.DlD(c38321qM, interfaceC16820sZ);
                }

                /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
                
                    if (r0.A09(r7, r8, r3, r1) != false) goto L11;
                 */
                /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
                /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
                @Override // X.InterfaceC909343k
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void DlE(X.C38321qM r7, X.C75113Zb r8, int r9) {
                    /*
                        r6 = this;
                        r0 = 0
                        X.C14360o3.A0B(r7, r0)
                        r4 = 1
                        X.C14360o3.A0B(r8, r4)
                        X.43k r0 = r6.A01
                        r0.DlE(r7, r8, r9)
                        X.38z r5 = r6.A04
                        boolean r0 = r5.A01(r7)
                        if (r0 == 0) goto L79
                        java.lang.Integer r1 = X.C05F.A01
                        boolean r0 = r5.A02(r7, r1)
                        if (r0 == 0) goto L79
                        r5.A00(r7, r1)
                        X.36X r2 = r6.A03
                        X.3Hb r3 = X.EnumC71153Hb.A0L
                    L24:
                        X.30l r0 = r2.A03
                        if (r0 == 0) goto L32
                        boolean r0 = r0.A09(r7, r8, r3, r1)
                        if (r0 == 0) goto L32
                    L2e:
                        r0 = 0
                        r2.A01(r7, r8, r3, r0)
                    L32:
                        com.instagram.common.session.UserSession r5 = r6.A00
                        X.0Tz r2 = X.C06090Tz.A05
                        r0 = 36317083813810975(0x8106320000131f, double:3.030408268788212E-306)
                        boolean r0 = X.C18U.A06(r2, r5, r0)
                        if (r0 == 0) goto L76
                        X.0ts r1 = X.C17570ts.A00(r5)
                        java.lang.String r0 = r7.getId()
                        X.0to r1 = r1.A01(r0)
                        if (r1 != 0) goto L6d
                        java.lang.String r3 = r7.getId()
                        if (r3 == 0) goto L96
                        com.instagram.user.model.User r1 = r7.A2E(r5)
                        r0 = 0
                        if (r1 == 0) goto L77
                        java.lang.String r2 = r1.getId()
                    L60:
                        com.instagram.model.mediatype.ProductType r1 = r7.A1z()
                        if (r1 == 0) goto L68
                        java.lang.String r0 = r1.A00
                    L68:
                        X.0to r1 = new X.0to
                        r1.<init>(r3, r2, r0)
                    L6d:
                        r1.A08 = r4
                        X.0ts r0 = X.C17570ts.A00(r5)
                        r0.A05(r1)
                    L76:
                        return
                    L77:
                        r2 = r0
                        goto L60
                    L79:
                        X.36X r2 = r6.A03
                        java.lang.Integer r1 = X.C05F.A00
                        X.3Hb r3 = X.EnumC71153Hb.A0L
                        X.30l r0 = r2.A03
                        if (r0 == 0) goto L8a
                        boolean r0 = r0.A09(r7, r8, r3, r1)
                        if (r0 == 0) goto L8a
                        goto L2e
                    L8a:
                        java.lang.Integer r1 = X.C05F.A01
                        boolean r0 = r5.A02(r7, r1)
                        if (r0 == 0) goto L24
                        r5.A00(r7, r1)
                        goto L24
                    L96:
                        java.lang.String r1 = "Required value was null."
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        r0.<init>(r1)
                        throw r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C43l.DlE(X.1qM, X.3Zb, int):void");
                }

                @Override // X.InterfaceC909343k
                public final void DlK(Rect rect, ViewParent viewParent, C38321qM c38321qM, int i) {
                    C14360o3.A0B(c38321qM, 2);
                    this.A01.DlK(rect, viewParent, c38321qM, i);
                }

                @Override // X.InterfaceC909343k
                public final void DlP(MotionEvent motionEvent, C38321qM c38321qM) {
                    C14360o3.A0B(c38321qM, 1);
                    this.A01.DlP(motionEvent, c38321qM);
                }

                @Override // X.InterfaceC909343k
                public final void DlG(C38321qM c38321qM, C75113Zb c75113Zb, String str, int i) {
                    this.A01.DlG(c38321qM, c75113Zb, str, i);
                }
            };
            this.A09 = interfaceC909343k2;
            return interfaceC909343k2;
        }
        return interfaceC909343k;
    }

    @Override // X.C685836v, X.AnonymousClass377
    public final InterfaceC79883hd BS5() {
        InterfaceC79883hd interfaceC79883hd = this.A0F;
        if (interfaceC79883hd == null) {
            final InterfaceC79883hd BS5 = super.BS5();
            final UserSession userSession = this.A0J;
            final AnonymousClass390 anonymousClass390 = this.A0Z;
            InterfaceC79883hd interfaceC79883hd2 = new InterfaceC79883hd(userSession, BS5, anonymousClass390) { // from class: X.3hg
                public final UserSession A00;
                public final InterfaceC79883hd A01;
                public final AnonymousClass390 A02;

                {
                    C14360o3.A0B(BS5, 1);
                    C14360o3.A0B(userSession, 2);
                    C14360o3.A0B(anonymousClass390, 3);
                    this.A01 = BS5;
                    this.A00 = userSession;
                    this.A02 = anonymousClass390;
                }

                @Override // X.InterfaceC79883hd
                public final void DLe(C73083Pj c73083Pj, C38321qM c38321qM, C75113Zb c75113Zb) {
                    C14360o3.A0B(c38321qM, 1);
                    C14360o3.A0B(c75113Zb, 2);
                    this.A01.DLe(c73083Pj, c38321qM, c75113Zb);
                    this.A02.A00(c73083Pj.A02, c38321qM, c73083Pj.A03);
                }

                @Override // X.InterfaceC79883hd
                public final void DRI(C38321qM c38321qM, IgProgressImageView igProgressImageView) {
                    C14360o3.A0B(c38321qM, 0);
                    this.A01.DRI(c38321qM, igProgressImageView);
                }
            };
            this.A0F = interfaceC79883hd2;
            return interfaceC79883hd2;
        }
        return interfaceC79883hd;
    }

    @Override // X.C685836v, X.InterfaceC686136y
    public final InterfaceC75403a7 BS6() {
        InterfaceC75403a7 interfaceC75403a7 = this.A0A;
        if (interfaceC75403a7 == null) {
            final InterfaceC75403a7 BS6 = super.BS6();
            final UserSession userSession = this.A0J;
            final C65192xH c65192xH = this.A0L;
            InterfaceC75403a7 interfaceC75403a72 = new InterfaceC75403a7(userSession, BS6, c65192xH) { // from class: X.3a8
                public final C65192xH A00;
                public final UserSession A01;
                public final InterfaceC75403a7 A02;
                public final boolean A03;

                {
                    C14360o3.A0B(BS6, 1);
                    C14360o3.A0B(userSession, 2);
                    C14360o3.A0B(c65192xH, 3);
                    this.A02 = BS6;
                    this.A01 = userSession;
                    this.A00 = c65192xH;
                    this.A03 = C18U.A06(C06090Tz.A05, userSession, 2342158602673982900L);
                }

                private final ArrayList A00(int i) {
                    C38321qM A02;
                    BrandSafetyContentBlocklistBitmapQLObj AiW;
                    List Ag9;
                    if (i < 0) {
                        return null;
                    }
                    C65192xH c65192xH2 = this.A00;
                    if (i >= c65192xH2.B5m() || (A02 = C3XH.A02(c65192xH2.A03(i).A05)) == null || (AiW = A02.A0C.AiW()) == null || (Ag9 = AiW.Ag9()) == null) {
                        return null;
                    }
                    return C5IK.A00.A01(Ag9);
                }

                @Override // X.InterfaceC75403a7
                public final void A8A(C79233gU c79233gU, int i) {
                    C14360o3.A0B(c79233gU, 1);
                    this.A02.A8A(c79233gU, i);
                }

                @Override // X.InterfaceC75403a7
                public final void EDq(View view, int i, Object obj, Object obj2) {
                    String str;
                    String str2;
                    String str3;
                    String str4;
                    C38321qM A02;
                    C38321qM A022;
                    Integer num;
                    Integer num2;
                    Integer num3;
                    Integer num4;
                    C38321qM A023;
                    C38321qM A024;
                    C38321qM A025;
                    C38321qM A026;
                    C38321qM A027;
                    C38321qM A028;
                    C14360o3.A0B(obj, 2);
                    C14360o3.A0B(obj2, 3);
                    C38321qM A029 = C3XH.A02(obj);
                    if (A029 != null && A029.CdW()) {
                        C65192xH c65192xH2 = this.A00;
                        C61762rd c61762rd = c65192xH2.A0T;
                        int position = c61762rd.BRZ(A029).getPosition();
                        int i2 = position - 1;
                        if (i2 >= 0 && i2 < c65192xH2.B5m() && (A028 = C3XH.A02(c65192xH2.A03(i2).A05)) != null) {
                            str = A028.getId();
                        } else {
                            str = null;
                        }
                        int i3 = position + 1;
                        if (i3 >= 0 && i3 < c65192xH2.B5m() && (A027 = C3XH.A02(c65192xH2.A03(i3).A05)) != null) {
                            str2 = A027.getId();
                        } else {
                            str2 = null;
                        }
                        C75113Zb BRZ = c61762rd.BRZ(A029);
                        BRZ.A1R = str;
                        BRZ.A1N = str2;
                        if (this.A03) {
                            C75113Zb BRZ2 = c61762rd.BRZ(A029);
                            if (i2 >= 0 && i2 < c65192xH2.B5m() && (A026 = C3XH.A02(c65192xH2.A03(i2).A05)) != null) {
                                num = A026.A2M();
                            } else {
                                num = null;
                            }
                            if (i3 >= 0 && i3 < c65192xH2.B5m() && (A025 = C3XH.A02(c65192xH2.A03(i3).A05)) != null) {
                                num2 = A025.A2M();
                            } else {
                                num2 = null;
                            }
                            BRZ2.A17 = num;
                            BRZ2.A16 = num2;
                            String str5 = null;
                            if (i2 >= 0 && i2 < c65192xH2.B5m() && (A024 = C3XH.A02(c65192xH2.A03(i2).A05)) != null) {
                                str5 = AbstractC77343dK.A00(A024.A0e);
                            }
                            String str6 = null;
                            if (i3 >= 0 && i3 < c65192xH2.B5m() && (A023 = C3XH.A02(c65192xH2.A03(i3).A05)) != null) {
                                str6 = AbstractC77343dK.A00(A023.A0e);
                            }
                            BRZ2.A1Q = str5;
                            BRZ2.A1M = str6;
                            if (i2 >= 0 && i2 < c65192xH2.B5m()) {
                                num3 = c65192xH2.A03(i2).A08;
                            } else {
                                num3 = null;
                            }
                            if (i3 >= 0 && i3 < c65192xH2.B5m()) {
                                num4 = c65192xH2.A03(i3).A08;
                            } else {
                                num4 = null;
                            }
                            BRZ2.A0a(num3, num4);
                            ArrayList A00 = A00(i2);
                            ArrayList A002 = A00(i3);
                            if (A00 != null) {
                                BRZ2.A1h = A00;
                            }
                            if (A002 != null) {
                                BRZ2.A1g = A002;
                            }
                        }
                        if (i2 >= 0 && i2 < c65192xH2.B5m() && (A022 = C3XH.A02(c65192xH2.A03(i2).A05)) != null) {
                            str3 = A022.A0C.BJN();
                        } else {
                            str3 = null;
                        }
                        if (i3 >= 0 && i3 < c65192xH2.B5m() && (A02 = C3XH.A02(c65192xH2.A03(i3).A05)) != null) {
                            str4 = A02.A0C.BJN();
                        } else {
                            str4 = null;
                        }
                        C75113Zb BRZ3 = c61762rd.BRZ(A029);
                        BRZ3.A1P = str3;
                        BRZ3.A1L = str4;
                    }
                    this.A02.EDq(view, i, obj, obj2);
                }

                @Override // X.InterfaceC75403a7
                public final void A87(int i) {
                    this.A02.A87(i);
                }

                @Override // X.InterfaceC75403a7
                public final void A8C(int i) {
                    this.A02.A8C(i);
                }

                @Override // X.InterfaceC75403a7
                public final void A8D(int i) {
                    this.A02.A8D(i);
                }

                @Override // X.InterfaceC75403a7
                public final void A8a(int i) {
                    this.A02.A8a(i);
                }

                @Override // X.InterfaceC75403a7
                public final void A8n(int i) {
                    this.A02.A8n(i);
                }

                @Override // X.InterfaceC75403a7
                public final void AAH(int i) {
                    this.A02.AAH(i);
                }

                @Override // X.InterfaceC75403a7
                public final void E5n(C38321qM c38321qM, C75113Zb c75113Zb) {
                    this.A02.E5n(c38321qM, c75113Zb);
                }

                @Override // X.InterfaceC75403a7
                public final void E5o(C75113Zb c75113Zb, C40971v4 c40971v4) {
                    this.A02.E5o(c75113Zb, c40971v4);
                }

                @Override // X.InterfaceC75403a7
                public final void F9l(View view) {
                    this.A02.F9l(view);
                }
            };
            this.A0A = interfaceC75403a72;
            return interfaceC75403a72;
        }
        return interfaceC75403a7;
    }

    @Override // X.C685836v, X.C37Z
    public final InterfaceC75603aR BxQ() {
        InterfaceC75603aR interfaceC75603aR = this.A0I;
        if (interfaceC75603aR == null) {
            final InterfaceC75603aR BxQ = super.BxQ();
            InterfaceC75603aR interfaceC75603aR2 = new InterfaceC75603aR(BxQ) { // from class: X.3aS
                public final InterfaceC75603aR A00;

                {
                    C14360o3.A0B(BxQ, 1);
                    this.A00 = BxQ;
                }

                @Override // X.InterfaceC75603aR
                public final void DmH(C38321qM c38321qM, C75113Zb c75113Zb) {
                }

                @Override // X.InterfaceC75603aR
                public final void DmJ(String str) {
                    this.A00.DmJ(str);
                }
            };
            this.A0I = interfaceC75603aR2;
            return interfaceC75603aR2;
        }
        return interfaceC75603aR;
    }

    @Override // X.C685836v, X.InterfaceC686136y
    public final InterfaceC690438q C9C() {
        InterfaceC690438q interfaceC690438q = this.A0B;
        if (interfaceC690438q == null) {
            C693139r c693139r = new C693139r(this.A0J, super.C9C(), this.A0Q);
            this.A0B = c693139r;
            return c693139r;
        }
        return interfaceC690438q;
    }

    @Override // X.C685836v, X.AnonymousClass371
    public final InterfaceC692739n C9D() {
        InterfaceC692739n interfaceC692739n = this.A0G;
        if (interfaceC692739n == null) {
            final InterfaceC692739n C9D = super.C9D();
            final UserSession userSession = this.A0J;
            final InterfaceC60442pS interfaceC60442pS = this.A0K;
            final C60662pp c60662pp = this.A0O;
            final C65192xH c65192xH = this.A0L;
            final C1M1 c1m1 = this.A0N;
            final C1Y1 c1y1 = super.A0a;
            InterfaceC692739n interfaceC692739n2 = new InterfaceC692739n(userSession, interfaceC60442pS, C9D, c65192xH, c1y1, c1m1, c60662pp) { // from class: X.39q
                public final InterfaceC60442pS A00;
                public final UserSession A01;
                public final InterfaceC692739n A02;
                public final C65192xH A03;
                public final C1Y1 A04;
                public final C1M1 A05;
                public final C60662pp A06;

                {
                    C14360o3.A0B(C9D, 1);
                    C14360o3.A0B(userSession, 2);
                    C14360o3.A0B(interfaceC60442pS, 3);
                    C14360o3.A0B(c60662pp, 4);
                    C14360o3.A0B(c65192xH, 5);
                    this.A02 = C9D;
                    this.A01 = userSession;
                    this.A00 = interfaceC60442pS;
                    this.A06 = c60662pp;
                    this.A03 = c65192xH;
                    this.A05 = c1m1;
                    this.A04 = c1y1;
                }

                /* JADX WARN: Removed duplicated region for block: B:26:0x00a8  */
                @Override // X.InterfaceC692739n
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void Dm3(X.C38321qM r28, X.C75113Zb r29, java.lang.String r30, boolean r31, boolean r32) {
                    /*
                        Method dump skipped, instructions count: 321
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C693039q.Dm3(X.1qM, X.3Zb, java.lang.String, boolean, boolean):void");
                }

                @Override // X.InterfaceC692739n
                public final void E2W(Integer num) {
                    C14360o3.A0B(num, 0);
                    this.A02.E2W(num);
                }

                @Override // X.InterfaceC692739n
                public final void Eke(C38321qM c38321qM, C75113Zb c75113Zb) {
                    C14360o3.A0B(c75113Zb, 1);
                    this.A02.Eke(c38321qM, c75113Zb);
                }

                @Override // X.InterfaceC692739n
                public final void Ekg(C38321qM c38321qM, C75113Zb c75113Zb) {
                    C14360o3.A0B(c75113Zb, 1);
                    this.A02.Ekg(c38321qM, c75113Zb);
                }

                @Override // X.InterfaceC692739n
                public final void ElV(C38321qM c38321qM, C75113Zb c75113Zb, VG2 vg2, String str) {
                    C14360o3.A0B(vg2, 3);
                    this.A02.ElV(c38321qM, c75113Zb, vg2, str);
                }

                @Override // X.InterfaceC692739n
                public final void ElX(C38321qM c38321qM, C38525Gwl c38525Gwl, C75113Zb c75113Zb, VG2 vg2, String str) {
                    C14360o3.A0B(c75113Zb, 1);
                    C14360o3.A0B(vg2, 3);
                    this.A02.ElX(c38321qM, c38525Gwl, c75113Zb, vg2, str);
                }

                @Override // X.InterfaceC692739n
                public final void F96(C42521Is0 c42521Is0, C42662IuJ c42662IuJ) {
                    C14360o3.A0B(c42521Is0, 0);
                    C14360o3.A0B(c42662IuJ, 1);
                    this.A02.F96(c42521Is0, c42662IuJ);
                }

                @Override // X.InterfaceC692739n
                public final void F97(C4dV c4dV, C119835bh c119835bh) {
                    C14360o3.A0B(c4dV, 0);
                    C14360o3.A0B(c119835bh, 1);
                    this.A02.F97(c4dV, c119835bh);
                }

                @Override // X.InterfaceC692739n
                public final void Cgq(C38321qM c38321qM, String str) {
                    this.A02.Cgq(c38321qM, str);
                }

                @Override // X.InterfaceC692739n
                public final void DB5(C38321qM c38321qM) {
                    this.A02.DB5(c38321qM);
                }

                @Override // X.InterfaceC692739n
                public final void Dth(C1XV c1xv, C38321qM c38321qM, String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, boolean z, boolean z2, boolean z3) {
                    String str7;
                    C19260xA c19260xA;
                    String str8 = str6;
                    C14360o3.A0B(str, 1);
                    if (z && c38321qM != null) {
                        UserSession userSession2 = this.A01;
                        InterfaceC60442pS interfaceC60442pS2 = this.A00;
                        C75113Zb BRZ = this.A03.A0T.BRZ(c38321qM);
                        if (str6 == null) {
                            str8 = AbstractC111324zv.A00(1262);
                        }
                        C1M1 c1m12 = this.A05;
                        if (c1m12 != null) {
                            str7 = c1m12.getSessionId();
                        } else {
                            str7 = null;
                        }
                        if (interfaceC60442pS2 instanceof AnonymousClass309) {
                            c19260xA = ((AnonymousClass309) interfaceC60442pS2).E6Q(c38321qM).A00();
                        } else {
                            c19260xA = null;
                        }
                        C41771Ien.A04(interfaceC60442pS2, c19260xA, userSession2, c38321qM, BRZ, null, str8, str7, str3, str4, null, null, i2, z);
                        return;
                    }
                    this.A02.Dth(c1xv, c38321qM, str, str2, str3, str4, str5, str8, i, i2, z, z2, z3);
                }

                @Override // X.InterfaceC692739n
                public final void E2f(C38321qM c38321qM, C38525Gwl c38525Gwl, C75113Zb c75113Zb) {
                    this.A02.E2f(c38321qM, c38525Gwl, c75113Zb);
                }

                @Override // X.InterfaceC692739n
                public final void El8(C38321qM c38321qM, C75113Zb c75113Zb, String str) {
                    this.A02.El8(c38321qM, c75113Zb, str);
                }
            };
            this.A0G = interfaceC692739n2;
            return interfaceC692739n2;
        }
        return interfaceC692739n;
    }

    @Override // X.AnonymousClass386
    public final void D42(C4dV c4dV, C119835bh c119835bh) {
        A00(new C42592ItB(c4dV, c119835bh), c119835bh, EnumC114405Eh.A02, this);
    }

    public static final void A00(C42592ItB c42592ItB, InterfaceC114395Eg interfaceC114395Eg, EnumC114405Eh enumC114405Eh, C685736u c685736u) {
        interfaceC114395Eg.EVm(enumC114405Eh);
        c42592ItB.A00(c685736u.C9C(), c685736u.A0O.getScrollingViewProxy());
    }

    public final void A03(C38321qM c38321qM, C3YL c3yl) {
        EnumC40111tc BRp = c38321qM.BRp();
        String A38 = c38321qM.A38();
        if (BRp == EnumC40111tc.A0Q || BRp == EnumC40111tc.A0a) {
            Map map = this.A0b;
            List list = (List) map.get(A38);
            if (list == null) {
                list = new LinkedList();
                map.put(A38, list);
            }
            list.add(c3yl);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C685736u(AbstractC10360h2 abstractC10360h2, C684936m c684936m, ViewOnTouchListenerC60632pm viewOnTouchListenerC60632pm, InterfaceC60142ow interfaceC60142ow, C684436h c684436h, UserSession userSession, C57112jm c57112jm, C684636j c684636j, InterfaceC114705Ga interfaceC114705Ga, C36Y c36y, InterfaceC60442pS interfaceC60442pS, C33A c33a, AbstractC61692rW abstractC61692rW, C33F c33f, C33F c33f2, C33F c33f3, C684736k c684736k, C57332k8 c57332k8, C33P c33p, C36Q c36q, C65192xH c65192xH, InterfaceC670430v interfaceC670430v, C61552rI c61552rI, C81063jb c81063jb, C669430l c669430l, C63762ux c63762ux, C1Y1 c1y1, InterfaceC59832oQ interfaceC59832oQ, ViewOnKeyListenerC677333n viewOnKeyListenerC677333n, C64842wi c64842wi, C685136o c685136o, InterfaceC684136e interfaceC684136e, InterfaceC61432r6 interfaceC61432r6, C676533f c676533f, C1M1 c1m1, C36X c36x, C60662pp c60662pp, String str) {
        super(c60662pp, abstractC10360h2, viewOnTouchListenerC60632pm, interfaceC60142ow, c684436h, userSession, c57112jm, c684636j, interfaceC114705Ga, null, c36y, null, interfaceC60442pS, c33a, abstractC61692rW, c65192xH, c33f, c33f2, null, c684736k, c57332k8, c33p, c36q, c81063jb, c1y1, interfaceC59832oQ, viewOnKeyListenerC677333n, null, c64842wi, new AnonymousClass387(c60662pp, userSession, interfaceC60442pS, c1y1, interfaceC684136e, null, c1m1, null, null, false), null, interfaceC61432r6, c676533f, c1m1, null, null, null, str, null, null, null, false, false, false, false);
        C14360o3.A0B(userSession, 9);
        C14360o3.A0B(c1m1, 15);
        this.A0O = c60662pp;
        this.A0K = interfaceC60442pS;
        this.A0Q = c33a;
        this.A0J = userSession;
        this.A0R = c33f3;
        this.A0N = c1m1;
        this.A0T = c61552rI;
        this.A0M = c63762ux;
        this.A0U = c669430l;
        this.A0W = interfaceC61432r6;
        this.A0P = c684936m;
        this.A0V = c685136o;
        this.A0X = c36x;
        this.A0L = c65192xH;
        HashMap hashMap = new HashMap();
        this.A0b = hashMap;
        HashMap hashMap2 = new HashMap();
        this.A0a = hashMap2;
        this.A0S = interfaceC670430v;
        this.A0Y = new C691338z(userSession, c65192xH, interfaceC670430v);
        this.A0Z = new AnonymousClass390(hashMap, hashMap2);
        c33p.A0G.A03 = interfaceC61432r6;
    }
}
