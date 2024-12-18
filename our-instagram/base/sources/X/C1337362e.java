package X;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.facebook.litho.LithoView;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

/* renamed from: X.62e, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1337362e extends AbstractC1337162c {
    public BKS A00;
    public InterfaceC31137Dmc A01;
    public C37577GgY A02;
    public InterfaceC31163Dn7 A03;
    public C37614Gh9 A04;
    public InterfaceC31048Dkm A05;
    public List A06;
    public InterfaceC16660sJ A07;
    public InterfaceC16660sJ A08;
    public InterfaceC16660sJ A09;
    public InterfaceC16660sJ A0A;
    public InterfaceC16660sJ A0B;
    public InterfaceC16660sJ A0C;
    public InterfaceC16660sJ A0D;
    public InterfaceC16660sJ A0E;
    public final Activity A0F;
    public final Context A0G;
    public final C2XI A0H;
    public final C62862tP A0I;
    public final InterfaceC43434JGy A0J;
    public final ClipsViewerConfig A0K;
    public final JPb A0L;
    public final InterfaceC31077DlK A0M;
    public final UserSession A0N;
    public final C64052vQ A0O;
    public final C149566o8 A0P;
    public final C9I7 A0Q;
    public final C676533f A0R;
    public final C37526Gfi A0S;
    public final AbstractC37552Gg8 A0T;
    public final C65835Tus A0U;
    public final C25348BJr A0V;
    public final C25359BKc A0W;
    public final C26914BuH A0X;
    public final C41704IdY A0Y;
    public final C37522Gfe A0Z;
    public final C37671Gi4 A0a;
    public final InterfaceC31152Dmw A0b;
    public final InterfaceC31152Dmw A0c;
    public final String A0d;
    public final HashMap A0e;
    public final HashMap A0f;
    public final HashMap A0g;
    public final HashMap A0h;
    public final HashMap A0i;
    public final InterfaceC09390do A0j;
    public final InterfaceC09390do A0k;
    public final boolean A0l;
    public final boolean A0m;
    public final C41217IMg A0n;
    public final BKD A0o;
    public final BKA A0p;
    public final BKE A0q;
    public final C31414DrJ A0r;
    public final C31410DrF A0s;
    public final C31413DrI A0t;
    public final BKF A0u;
    public final CLQ A0v;
    public final C37543Gfz A0w;
    public final C31411DrG A0x;
    public final BKB A0y;

    @Override // X.AbstractC66422zJ
    /* renamed from: A07, reason: merged with bridge method [inline-methods] */
    public final void unbind(C37658Ghr c37658Ghr) {
        String str;
        C41217IMg c41217IMg;
        C14360o3.A0B(c37658Ghr, 0);
        C39690HjM c39690HjM = c37658Ghr.A08;
        if (c39690HjM != null && (c41217IMg = c37658Ghr.A09) != null) {
            c41217IMg.A00.remove(c39690HjM);
        }
        C120985dq c120985dq = c37658Ghr.A01;
        if (c120985dq != null) {
            str = c120985dq.getId();
        } else {
            str = null;
        }
        RoundedCornerFrameLayout roundedCornerFrameLayout = c37658Ghr.A06;
        C14360o3.A0C(roundedCornerFrameLayout, "null cannot be cast to non-null type android.widget.FrameLayout");
        roundedCornerFrameLayout.setTag(null);
        View childAt = roundedCornerFrameLayout.getChildAt(0);
        C14360o3.A0C(childAt, "null cannot be cast to non-null type com.facebook.litho.LithoView");
        ((LithoView) childAt).setComponentTree(null);
        if (str != null) {
            this.A0i.remove(str);
            this.A0e.remove(str);
            this.A0g.remove(str);
            this.A0f.remove(str);
            this.A0h.remove(str);
            c37658Ghr.A0A.clear();
            c37658Ghr.A0B.clear();
            c37658Ghr.A0C.clear();
            c37658Ghr.A0D.clear();
            c37658Ghr.A01 = null;
            C25370BKn c25370BKn = c37658Ghr.A07;
            c37658Ghr.getBindingAdapterPosition();
            c25370BKn.A00 = null;
            c25370BKn.A03 = null;
        }
    }

    public static final C25385BLc A00(C1337362e c1337362e) {
        Object value = c1337362e.A0k.getValue();
        C14360o3.A07(value);
        if (((Boolean) value).booleanValue()) {
            return (C25385BLc) c1337362e.A0j.getValue();
        }
        return A01(c1337362e);
    }

    public static final C25385BLc A01(C1337362e c1337362e) {
        String str;
        C25385BLc A06 = ((BLK) c1337362e.A0W.A00.A0S.getValue()).A06();
        BKA bka = c1337362e.A0p;
        A06.EXJ(new BPU(bka));
        A06.EXP(new BPV(bka));
        A06.EXQ(new BPW(bka));
        A06.EXS(new BPX(bka));
        A06.EXV(new BPY(bka));
        A06.EXW(new BPZ(bka));
        A06.EXX(new C25486BPa(bka));
        A06.EXY(new C25487BPb(bka));
        A06.EY2(new C25488BPc(bka));
        A06.EXa(new C25489BPd(bka));
        A06.EXb(new C25490BPe(bka));
        BKS bks = c1337362e.A00;
        if (bks != null) {
            A06.EXj(bks);
            A06.EXl(new C25491BPf(bka));
            A06.EXn(new C25492BPg(bka));
            A06.EXq(new C25493BPh(bka));
            A06.EXr(new C25494BPi(bka));
            A06.EXu(new C25495BPj(bka));
            A06.EXz(new C25496BPk(bka));
            A06.EXv(new C25497BPl(bka));
            A06.EXw(new C37768Gjj(bka));
            A06.EXx(new C25498BPm(bka));
            A06.EXy(new C25499BPn(bka));
            A06.EY0(new C25500BPo(bka));
            A06.EY1(new C25387BLe(bka));
            A06.EXe(new C37769Gjk(bka));
            A06.EXd(new C25501BPp(bka));
            A06.EXF(new C37770Gjl(bka));
            A06.EXs(new MVY(bka));
            A06.EXc(new C25502BPq(bka));
            A06.EZz(new C37771Gjm(bka));
            A06.EXA(new C25503BPr(c1337362e.A0y));
            C37543Gfz c37543Gfz = c1337362e.A0w;
            A06.EX7(new C37772Gjn(c37543Gfz));
            A06.EXk(new C37773Gjo(c37543Gfz));
            A06.EXZ(new C31416DrL(c1337362e.A0x));
            BKE bke = c1337362e.A0q;
            A06.EXU(new C25504BPs(bke));
            A06.EXR(new C25505BPt(bke));
            A06.EXT(new C31417DrM(c1337362e.A0t));
            C31414DrJ c31414DrJ = c1337362e.A0r;
            A06.EXp(new C31418DrN(c31414DrJ));
            A06.EeE(new C37774Gjp(c31414DrJ));
            A06.Ed0(new C25506BPu(c1337362e.A06()));
            A06.EfO(new C25507BPv(c1337362e.A06()));
            A06.EYZ(new C25508BPw(c1337362e.A06()));
            A06.EXB(new C25509BPx(c1337362e.A0o));
            BKS bks2 = c1337362e.A00;
            if (bks2 != null) {
                A06.EXE(bks2);
                A06.EX9(new C25388BLf(c1337362e.A06()));
                A06.EXG(new C25389BLg(c1337362e.A06()));
                A06.EXH(new C25510BPy(c1337362e.A06()));
                A06.ER9(new C37775Gjq(c1337362e.A06()));
                A06.ET8(new C9BW(40, new C37776Gjr(c1337362e.A06()), new C25511BPz(c1337362e.A06())));
                A06.A01.A00 = new C25391BLi(c1337362e.A06());
                InterfaceC16660sJ interfaceC16660sJ = c1337362e.A08;
                if (interfaceC16660sJ != null) {
                    A06.EX8(interfaceC16660sJ);
                    InterfaceC16660sJ interfaceC16660sJ2 = c1337362e.A09;
                    if (interfaceC16660sJ2 != null) {
                        A06.EXh(interfaceC16660sJ2);
                        InterfaceC16660sJ interfaceC16660sJ3 = c1337362e.A0A;
                        if (interfaceC16660sJ3 != null) {
                            A06.EXi(interfaceC16660sJ3);
                            InterfaceC16660sJ interfaceC16660sJ4 = c1337362e.A0D;
                            if (interfaceC16660sJ4 != null) {
                                A06.EXo(interfaceC16660sJ4);
                                InterfaceC16660sJ interfaceC16660sJ5 = c1337362e.A0B;
                                if (interfaceC16660sJ5 != null) {
                                    A06.EXO(interfaceC16660sJ5);
                                    InterfaceC16660sJ interfaceC16660sJ6 = c1337362e.A07;
                                    if (interfaceC16660sJ6 != null) {
                                        A06.Eds(interfaceC16660sJ6);
                                        InterfaceC16660sJ interfaceC16660sJ7 = c1337362e.A0C;
                                        if (interfaceC16660sJ7 != null) {
                                            A06.EXN(interfaceC16660sJ7);
                                            A06.EfN(new BQ0(c1337362e.A06()));
                                            InterfaceC16660sJ interfaceC16660sJ8 = c1337362e.A0E;
                                            if (interfaceC16660sJ8 != null) {
                                                A06.EfP(interfaceC16660sJ8);
                                                C31410DrF c31410DrF = c1337362e.A0s;
                                                A06.EcM(new C31419DrO(c31410DrF));
                                                A06.Ebh(new C31420DrP(c31410DrF));
                                                A06.EhM(new C37777Gjs(c31410DrF));
                                                A06.Eaa(new C37778Gjt(c31410DrF));
                                                A06.EaZ(new C37779Gju(c31410DrF));
                                                A06.EXf(new BQ1(c1337362e.A0u));
                                                A06.EXg(new C37780Gjv(bka));
                                                return A06;
                                            }
                                            str = "onVisualSearchButtonTap";
                                        } else {
                                            str = "onOpenContentNotesNuxFromShare";
                                        }
                                    } else {
                                        str = "onMotionEventShareSheet";
                                    }
                                } else {
                                    str = "onOpenContentNotesNux";
                                }
                            } else {
                                str = "onOpenShareSheet";
                            }
                        } else {
                            str = "onOpenCommentsFromCount";
                        }
                    } else {
                        str = "onOpenComments";
                    }
                } else {
                    str = "onOpenAudioPage";
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
        }
        str = "onOpenRecipeSheet";
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public final C37658Ghr A05() {
        Context context = this.A0G;
        RoundedCornerFrameLayout roundedCornerFrameLayout = new RoundedCornerFrameLayout(context);
        roundedCornerFrameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        LithoView lithoView = new LithoView(context, (AttributeSet) null);
        roundedCornerFrameLayout.setStrokeColor(0);
        roundedCornerFrameLayout.setCornerBackgroundColor(context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_media_background)));
        roundedCornerFrameLayout.addView(lithoView);
        C25370BKn c25370BKn = new C25370BKn(lithoView, this.A0K, this.A0N, true);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        HashMap hashMap = new HashMap();
        C37658Ghr c37658Ghr = new C37658Ghr(roundedCornerFrameLayout, this.A0H, c25370BKn, this.A0n, hashMap, arrayList2, arrayList, arrayList3);
        roundedCornerFrameLayout.setTag(c37658Ghr);
        return c37658Ghr;
    }

    public final InterfaceC31137Dmc A06() {
        InterfaceC31137Dmc interfaceC31137Dmc = this.A01;
        if (interfaceC31137Dmc != null) {
            return interfaceC31137Dmc;
        }
        C14360o3.A0F("delegate");
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C1337062b.class;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return A05();
    }

    public C1337362e(Activity activity, Context context, C62862tP c62862tP, InterfaceC43434JGy interfaceC43434JGy, ClipsViewerConfig clipsViewerConfig, JPb jPb, InterfaceC31077DlK interfaceC31077DlK, UserSession userSession, C64052vQ c64052vQ, C149566o8 c149566o8, C676533f c676533f, C37526Gfi c37526Gfi, AbstractC37552Gg8 abstractC37552Gg8, C65835Tus c65835Tus, C25348BJr c25348BJr, C25359BKc c25359BKc, C41217IMg c41217IMg, C26914BuH c26914BuH, BKD bkd, BKA bka, BKE bke, C31414DrJ c31414DrJ, C31410DrF c31410DrF, C31413DrI c31413DrI, BKF bkf, CLQ clq, C37543Gfz c37543Gfz, C31411DrG c31411DrG, BKB bkb, C41704IdY c41704IdY, C37522Gfe c37522Gfe, C37671Gi4 c37671Gi4, InterfaceC31152Dmw interfaceC31152Dmw, InterfaceC31152Dmw interfaceC31152Dmw2, boolean z) {
        super(jPb, c25348BJr);
        this.A0F = activity;
        this.A0G = context;
        this.A0W = c25359BKc;
        this.A0Y = c41704IdY;
        this.A0p = bka;
        this.A0y = bkb;
        this.A0v = clq;
        this.A0o = bkd;
        this.A0w = c37543Gfz;
        this.A0x = c31411DrG;
        this.A0q = bke;
        this.A0t = c31413DrI;
        this.A0r = c31414DrJ;
        this.A0s = c31410DrF;
        this.A0u = bkf;
        this.A0L = jPb;
        this.A0M = interfaceC31077DlK;
        this.A0T = abstractC37552Gg8;
        this.A0N = userSession;
        this.A0Z = c37522Gfe;
        this.A0V = c25348BJr;
        this.A0I = c62862tP;
        this.A0K = clipsViewerConfig;
        this.A0n = c41217IMg;
        this.A0P = c149566o8;
        this.A0U = c65835Tus;
        this.A0J = interfaceC43434JGy;
        this.A0S = c37526Gfi;
        this.A0O = c64052vQ;
        this.A0l = z;
        this.A0b = interfaceC31152Dmw;
        this.A0c = interfaceC31152Dmw2;
        this.A0a = c37671Gi4;
        this.A0X = c26914BuH;
        this.A0R = c676533f;
        this.A0i = new HashMap();
        this.A0g = new HashMap();
        this.A0f = new HashMap();
        this.A0e = new HashMap();
        this.A0h = new HashMap();
        String obj = UUID.randomUUID().toString();
        C14360o3.A07(obj);
        this.A0d = obj;
        this.A0H = new C2XI(Float.valueOf(1.0f));
        C006802i c006802i = C006802i.A0p;
        C14360o3.A07(c006802i);
        this.A0Q = new C9I7(c006802i);
        C27451Uy A00 = AbstractC27421Uv.A00(userSession);
        String moduleName = c37522Gfe.getModuleName();
        C14360o3.A0B(moduleName, 0);
        boolean z2 = false;
        if (A00.A00(moduleName, false)) {
            if (C18U.A06(C06090Tz.A05, A00.A05, 36320773191246721L)) {
                z2 = true;
            }
        }
        this.A0m = z2;
        this.A0k = AbstractC09440dt.A01(new C9EN(this, 24));
        this.A0j = AbstractC09440dt.A01(new C9EN(this, 23));
    }
}
