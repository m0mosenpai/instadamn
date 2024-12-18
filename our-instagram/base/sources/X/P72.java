package X;

import android.view.LayoutInflater;
import android.view.View;
import com.instagram.archive.fragment.ArchiveReelFragment;
import com.instagram.music.search.MusicOverlayResultsListController;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public final class P72 implements InterfaceC55012g0 {
    public final int A00;
    public final Object A01;

    public static void A00(C54922fr c54922fr, Object obj, int i) {
        c54922fr.A04 = new P72(obj, i);
        c54922fr.A0B = false;
    }

    public P72(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC55012g0
    public final void DSU(C4NL c4nl) {
        C4NJ c4nj;
        String str;
        InterfaceC55362gb interfaceC55362gb;
        View Csl;
        C4NJ c4nj2;
        String str2;
        String str3;
        C52672NRt c52672NRt;
        C4NJ c4nj3;
        C51341Mm2 c51341Mm2;
        N86 A00;
        switch (this.A00) {
            case 0:
                C52196N8l c52196N8l = ((ArchiveReelFragment) this.A01).A00;
                C4NJ c4nj4 = (C4NJ) c4nl;
                N93 n93 = c52196N8l.A07;
                if (n93 == null || c4nj4 == null || (interfaceC55362gb = c52196N8l.A01) == null) {
                    return;
                }
                n93.A00 = interfaceC55362gb;
                n93.A01 = c4nj4;
                c52196N8l.A0C();
                return;
            case 1:
                N6N n6n = (N6N) this.A01;
                if (c4nl instanceof C4NJ) {
                    c4nj = (C4NJ) c4nl;
                } else {
                    c4nj = null;
                }
                n6n.A04 = c4nj;
                C66082yk c66082yk = new C66082yk(n6n, AbstractC166987dD.A0r(n6n.A0C));
                int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
                InterfaceC56392iX interfaceC56392iX = n6n.A03;
                if (interfaceC56392iX == null) {
                    str = "qpView";
                } else {
                    C81423kC c81423kC = new C81423kC(interfaceC56392iX.getView());
                    C64842wi c64842wi = n6n.A05;
                    if (c64842wi == null) {
                        str = "quickPromotionPresenter";
                    } else {
                        C4NJ c4nj5 = n6n.A04;
                        if (c4nj5 != null) {
                            c66082yk.ADw(c64842wi, c4nj5, c81423kC);
                            return;
                        }
                        throw AbstractC166997dE.A0g();
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 2:
                C14360o3.A0B(c4nl, 0);
                C52200N8p c52200N8p = ((C52171N7a) this.A01).A00;
                if (c52200N8p == null) {
                    str = "listAdapter";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                if (c4nl == c52200N8p.A00) {
                    return;
                }
                c52200N8p.A00 = c4nl;
                C52200N8p.A00(c52200N8p);
                return;
            case 3:
                C14360o3.A0B(c4nl, 0);
                C4NJ c4nj6 = (C4NJ) c4nl;
                C7YB c7yb = (C7YB) this.A01;
                C162307Os c162307Os = (C162307Os) c7yb.A0D.invoke();
                C55732hE c55732hE = c7yb.A00;
                if (c162307Os == null || c55732hE == null) {
                    return;
                }
                if ("condensed_megaphone".equals(c4nj6.A09.A00)) {
                    C66102ym c66102ym = new C66102ym(c7yb.A03);
                    LayoutInflater A06 = AbstractC31175DnJ.A06(c7yb.A01);
                    C14360o3.A07(A06);
                    Csl = c66102ym.Csl(A06, null);
                    c66102ym.ADw((AbstractC55352ga) c7yb.A0B.getValue(), c4nj6, new C81403kA(Csl));
                } else {
                    C66082yk c66082yk2 = new C66082yk(c7yb.A03, c7yb.A04);
                    LayoutInflater A062 = AbstractC31175DnJ.A06(c7yb.A01);
                    C14360o3.A07(A062);
                    Csl = c66082yk2.Csl(A062, null);
                    c66082yk2.AE0((AbstractC55352ga) c7yb.A0B.getValue(), c4nj6, new C81423kC(Csl), c55732hE.A00);
                }
                c162307Os.A03(Csl);
                return;
            case 4:
                C14360o3.A0B(c4nl, 0);
                if (!(c4nl instanceof C52672NRt) || (c4nj2 = (C4NJ) c4nl) == null) {
                    return;
                }
                C52166N6v c52166N6v = (C52166N6v) this.A01;
                String str4 = c4nj2.A09.A00;
                InterfaceC56392iX interfaceC56392iX2 = c52166N6v.A02;
                if (interfaceC56392iX2 == null) {
                    str = "qpMegaphoneViewStubber";
                } else {
                    if (!interfaceC56392iX2.CWW()) {
                        int hashCode = str4.hashCode();
                        if (hashCode != -1300165181) {
                            if (hashCode != -303268285) {
                                if (hashCode == 336609433) {
                                    str3 = "audio_browser_condensed_megaphone_ig";
                                }
                                throw AbstractC167007dF.A0c("Unsupported template: ", str4);
                            }
                            str3 = "standard_megaphone_ig";
                        } else {
                            str3 = "audio_browser_standard_megaphone_ig";
                        }
                        if (str4.equals(str3)) {
                            int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                            c52166N6v.A08 = new C51341Mm2(interfaceC56392iX2.getView());
                        }
                        throw AbstractC167007dF.A0c("Unsupported template: ", str4);
                    }
                    int hashCode2 = str4.hashCode();
                    if (hashCode2 != -1300165181) {
                        if (hashCode2 != -303268285) {
                            if (hashCode2 == 336609433) {
                                str2 = "audio_browser_condensed_megaphone_ig";
                            }
                            throw AbstractC167007dF.A0c("Unsupported template: ", str4);
                        }
                        str2 = "standard_megaphone_ig";
                    } else {
                        str2 = "audio_browser_standard_megaphone_ig";
                    }
                    if (str4.equals(str2)) {
                        P7P p7p = new P7P(c52166N6v);
                        C51341Mm2 c51341Mm22 = c52166N6v.A08;
                        if (c51341Mm22 != null) {
                            C64842wi c64842wi2 = c52166N6v.A07;
                            if (c64842wi2 == null) {
                                str = "quickPromotionDelegate";
                            } else {
                                p7p.ADw(c64842wi2, c4nj2, c51341Mm22);
                                return;
                            }
                        } else {
                            throw AbstractC166997dE.A0g();
                        }
                    }
                    throw AbstractC167007dF.A0c("Unsupported template: ", str4);
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 5:
                C14360o3.A0B(c4nl, 0);
                if (!(c4nl instanceof C52672NRt) || (c52672NRt = (C52672NRt) c4nl) == null) {
                    return;
                }
                MusicOverlayResultsListController musicOverlayResultsListController = (MusicOverlayResultsListController) this.A01;
                C50979Mfm c50979Mfm = musicOverlayResultsListController.A0F;
                C64842wi c64842wi3 = musicOverlayResultsListController.A05;
                C05A c05a = c50979Mfm.A0C;
                ArrayList A0w = MSZ.A0w(c05a);
                A0w.add(new HMB(c52672NRt, c64842wi3, c52672NRt.A0D));
                c05a.Egh(A0w);
                return;
            case 6:
                C14360o3.A0B(c4nl, 0);
                if (!(c4nl instanceof C52672NRt) || (c4nj3 = (C4NJ) c4nl) == null) {
                    return;
                }
                C54691ODr c54691ODr = (C54691ODr) this.A01;
                InterfaceC56392iX interfaceC56392iX3 = c54691ODr.A05;
                if (!interfaceC56392iX3.CWW() || (c51341Mm2 = c54691ODr.A01) == null) {
                    int i3 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                    c51341Mm2 = new C51341Mm2(interfaceC56392iX3.getView());
                    c54691ODr.A01 = c51341Mm2;
                }
                P7P p7p2 = new P7P(c54691ODr.A03);
                c54691ODr.A02 = p7p2;
                if (c51341Mm2 != null) {
                    C64842wi c64842wi4 = c54691ODr.A00;
                    if (c64842wi4 != null) {
                        p7p2.ADw(c64842wi4, c4nj3, c51341Mm2);
                        return;
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                throw AbstractC166987dD.A14("Required value was null.");
            case 7:
                C14360o3.A0B(c4nl, 0);
                if (!(c4nl instanceof C4NJ)) {
                    return;
                }
                A00 = C26777Bry.A00((C26777Bry) this.A01);
                do {
                } while (!MSX.A1Z(c4nl, A00.A08));
                return;
            case 8:
                C14360o3.A0B(c4nl, 0);
                if (!(c4nl instanceof C4NJ)) {
                    return;
                }
                A00 = (N86) ((C26872BtZ) this.A01).A0H.getValue();
                do {
                } while (!MSX.A1Z(c4nl, A00.A08));
                return;
            default:
                MUI mui = (MUI) this.A01;
                C4NL c4nl2 = null;
                if (c4nl instanceof C4NJ) {
                    c4nl2 = c4nl;
                }
                mui.A04.Egh(c4nl2);
                return;
        }
    }
}
