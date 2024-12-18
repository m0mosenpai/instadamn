package X;

import com.instagram.api.schemas.MusicPageTabType;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.feed.media.CreativeConfigIntf;
import com.instagram.feed.media.EffectPreviewIntf;
import com.instagram.spotlight.fetch.SpotlightFetchRepository;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.GhL, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37626GhL implements JIH {
    public static final float[] A07 = {0.25f, 0.5f, 0.75f};
    public C37628GhN A00;
    public float A01;
    public final AbstractC59962oe A02;
    public final ClipsViewerConfig A03;
    public final UserSession A04;
    public final C37716Gir A05;
    public final InterfaceC16820sZ A06;

    public C37626GhL(AbstractC59962oe abstractC59962oe, ClipsViewerConfig clipsViewerConfig, UserSession userSession, C37716Gir c37716Gir, InterfaceC16820sZ interfaceC16820sZ) {
        AbstractC25233BEq.A0x(1, userSession, c37716Gir, clipsViewerConfig);
        this.A04 = userSession;
        this.A02 = abstractC59962oe;
        this.A06 = interfaceC16820sZ;
        this.A05 = c37716Gir;
        this.A03 = clipsViewerConfig;
    }

    @Override // X.JIH
    public final void D8r(C120985dq c120985dq, List list) {
    }

    @Override // X.JIH
    public final void Dbv(C25370BKn c25370BKn, boolean z) {
    }

    @Override // X.JIH
    public final void Dby(C120985dq c120985dq, int i, int i2, boolean z) {
        List B0S;
        EffectPreviewIntf effectPreviewIntf;
        String effectId;
        C14360o3.A0B(c120985dq, 0);
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            UserSession userSession = this.A04;
            C37813GkT A00 = AbstractC37802GkH.A00(MusicPageTabType.A04, userSession);
            float f = (i * 1.0f) / i2;
            float[] fArr = A07;
            int i3 = 0;
            do {
                float f2 = fArr[i3];
                if (this.A01 <= f2 && f2 <= f) {
                    C3x9 clipsMetadata = c38321qM.A0C.getClipsMetadata();
                    AbstractC59962oe abstractC59962oe = this.A02;
                    A00.A01(clipsMetadata, userSession, "loop_playback_25_percent", abstractC59962oe.getModuleName());
                    CreativeConfigIntf Asm = c38321qM.A0C.Asm();
                    if (Asm != null && (B0S = Asm.B0S()) != null && (effectPreviewIntf = (EffectPreviewIntf) AbstractC001800i.A0J(B0S)) != null && (effectId = effectPreviewIntf.getEffectId()) != null) {
                        BME.A00(userSession).A00(userSession, "loop_playback_25_percent", effectId, abstractC59962oe.getModuleName());
                    }
                }
                i3++;
            } while (i3 < 3);
            this.A01 = f;
        }
    }

    @Override // X.JIH
    public final void DzO(C120985dq c120985dq, C37644Ghd c37644Ghd, C37563GgJ c37563GgJ, C25370BKn c25370BKn, boolean z) {
        AbstractC167027dH.A12(c25370BKn, c37563GgJ, c120985dq);
        C14360o3.A0B(c37644Ghd, 3);
        UserSession userSession = this.A04;
        ((C26T) userSession.A01(C26T.class, C26S.A00)).A00(c120985dq.A0D());
        if (!c25370BKn.A02().A0N && !z) {
            c25370BKn.A02().A0E = new C37804GkJ(c120985dq, c37644Ghd, c37563GgJ, this, c25370BKn);
            return;
        }
        C57782kr A00 = C57782kr.A00(userSession);
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null) {
            A00.A0O(c38321qM.A2u(), this.A03.A0n);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.JIH
    public final void DzP(C120985dq c120985dq, Integer num, int i) {
        C38321qM c38321qM;
        C06090Tz c06090Tz;
        OV4 ov4;
        String moduleName;
        C0eR c0eR;
        long j;
        List list;
        EnumC124255jf enumC124255jf;
        C14360o3.A0B(c120985dq, 0);
        UserSession userSession = this.A04;
        ((C26T) userSession.A01(C26T.class, C26S.A00)).A00(c120985dq.A0D());
        C57782kr A00 = C57782kr.A00(userSession);
        C38321qM c38321qM2 = c120985dq.A02;
        if (c38321qM2 != null) {
            String A2u = c38321qM2.A2u();
            ClipsViewerConfig clipsViewerConfig = this.A03;
            A00.A0O(A2u, clipsViewerConfig.A0n);
            String A0h = AbstractC37301Gc2.A0h(c120985dq.A02);
            ClipsViewerSource clipsViewerSource = clipsViewerConfig.A0J;
            if (clipsViewerSource == ClipsViewerSource.A2R && A0h != null) {
                SpotlightFetchRepository A002 = AbstractC92994Ew.A00(userSession);
                HashSet hashSet = A002.A04;
                boolean add = hashSet.add(A0h);
                C26084BgD c26084BgD = (C26084BgD) A002.A05.getValue();
                if (add && c26084BgD != null) {
                    List list2 = (List) c26084BgD.A02;
                    ArrayList A1E = AbstractC166987dD.A1E();
                    ArrayList A1E2 = AbstractC166987dD.A1E();
                    for (Object obj : list2) {
                        if (hashSet.contains(((C50559MTq) obj).A04)) {
                            A1E.add(obj);
                        } else {
                            A1E2.add(obj);
                        }
                    }
                    SpotlightFetchRepository.A01(A002, A1E, A1E2);
                }
            }
            C38321qM c38321qM3 = c120985dq.A02;
            if (c38321qM3 != null) {
                int intValue = c120985dq.A03.intValue();
                if (intValue != 2) {
                    if (intValue == 1) {
                        enumC124255jf = EnumC124255jf.A03;
                    }
                } else {
                    enumC124255jf = EnumC124255jf.A04;
                }
                AbstractC124235jd.A00(userSession).A00(enumC124255jf, C05F.A00, AbstractC166987dD.A1J(c38321qM3));
            }
            C37628GhN c37628GhN = this.A00;
            if (c37628GhN != null) {
                c37628GhN.A0E(false);
            }
            if (clipsViewerSource == ClipsViewerSource.A0C) {
                MVK mvk = (MVK) this.A06.invoke();
                UserSession userSession2 = mvk.A03;
                if (AbstractC2056998t.A00(userSession2).booleanValue() && C18U.A06(C06090Tz.A05, userSession2, 2342172548432937358L)) {
                    C23031Ai A003 = AbstractC23021Ah.A00(userSession2);
                    if (A003.A01.getInt(AbstractC43591JPw.A00(131), 0) < 1 && C23031Ai.A07(A003, MSV.A00(984), 1L) && !mvk.A00) {
                        mvk.A00 = true;
                        AbstractC166987dD.A1Z(new PXT(mvk, null, 12), mvk.A04);
                    }
                }
            }
            if (AbstractC37655Gho.A03(c120985dq) && (list = c120985dq.A0R) != null) {
                c38321qM = (C38321qM) AbstractC001800i.A0O(list, AbstractC167017dG.A0K(num));
            } else {
                c38321qM = c120985dq.A02;
            }
            if (c38321qM != null) {
                InterfaceC131055vt BfV = c38321qM.A0C.BfV();
                if (BfV != null && AbstractC166997dE.A1Z(BfV.BvG(), true)) {
                    c06090Tz = C06090Tz.A05;
                    if (C18U.A06(c06090Tz, userSession, 36318694426745251L)) {
                        ov4 = OV4.A00;
                        AbstractC59962oe abstractC59962oe = this.A02;
                        moduleName = abstractC59962oe.getModuleName();
                        c0eR = abstractC59962oe.mLifecycleRegistry;
                        C14360o3.A07(c0eR);
                        j = 36600169403518717L;
                        ov4.A00(c0eR, userSession, c38321qM, moduleName, i, C18U.A01(c06090Tz, userSession, j));
                    }
                }
                c06090Tz = C06090Tz.A05;
                if (C18U.A06(c06090Tz, userSession, 36318694426548642L)) {
                    ov4 = OV4.A00;
                    AbstractC59962oe abstractC59962oe2 = this.A02;
                    moduleName = abstractC59962oe2.getModuleName();
                    c0eR = abstractC59962oe2.mLifecycleRegistry;
                    C14360o3.A07(c0eR);
                    j = 36600169403322108L;
                    ov4.A00(c0eR, userSession, c38321qM, moduleName, i, C18U.A01(c06090Tz, userSession, j));
                }
            }
            C37628GhN c37628GhN2 = this.A00;
            if (c37628GhN2 != null) {
                c37628GhN2.A0D(false);
                return;
            }
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.JIH
    public final void E1U(C120985dq c120985dq, InterfaceC31077DlK interfaceC31077DlK, boolean z) {
        C3x9 A0u;
        int i;
        C14360o3.A0B(c120985dq, 1);
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null && z && AbstractC76643c9.A0H(this.A04, c38321qM)) {
            C37716Gir c37716Gir = this.A05;
            C38321qM c38321qM2 = c120985dq.A02;
            if (c38321qM2 != null && (A0u = AbstractC25226BEj.A0u(c38321qM2)) != null) {
                if (A0u.BZw() != null) {
                    i = 2131955336;
                } else if (A0u.BVc() == null) {
                    return;
                } else {
                    i = 2131955827;
                }
                Integer valueOf = Integer.valueOf(i);
                if (valueOf != null) {
                    int intValue = valueOf.intValue();
                    EnumC141996bI enumC141996bI = EnumC141996bI.A04;
                    C146106i8 A0K = AbstractC31171DnF.A0K();
                    A0K.A0C = enumC141996bI;
                    A0K.A0H = "";
                    AbstractC25226BEj.A1N(c37716Gir.A02, A0K, intValue);
                    A0K.A06();
                    AbstractC25233BEq.A1F(A0K);
                }
            }
        }
    }

    @Override // X.JIH
    public final void DzL(C120985dq c120985dq, int i) {
        C37628GhN c37628GhN = this.A00;
        if (c37628GhN != null) {
            c37628GhN.A0E(true);
        }
        C37628GhN c37628GhN2 = this.A00;
        if (c37628GhN2 != null) {
            c37628GhN2.A0D(true);
        }
    }

    @Override // X.JIH
    public final void E1V() {
        C37628GhN c37628GhN = this.A00;
        if (c37628GhN != null) {
            c37628GhN.A09();
        }
    }

    @Override // X.JIH
    public final void DzC(C120985dq c120985dq, int i, int i2) {
        C38321qM A0G = AbstractC37301Gc2.A0G(c120985dq);
        if (A0G != null) {
            UserSession userSession = this.A04;
            C37813GkT A00 = AbstractC37802GkH.A00(MusicPageTabType.A04, userSession);
            C3x9 A0u = AbstractC25226BEj.A0u(A0G);
            AbstractC59962oe abstractC59962oe = this.A02;
            A00.A01(A0u, userSession, "loop_playback_25_percent", abstractC59962oe.getModuleName());
            AbstractC37303Gc4.A1A(abstractC59962oe, userSession, A0G, "loop_playback_25_percent");
        }
    }

    @Override // X.JIH
    public final void DzJ(C120985dq c120985dq, int i) {
    }
}
