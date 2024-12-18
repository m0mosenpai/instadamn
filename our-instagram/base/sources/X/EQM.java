package X;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.R;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.api.schemas.GraphGuardianContent;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediatype.ProductType;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class EQM extends C2US implements InterfaceC65242xM, InterfaceC161877Mx {
    public int A00;
    public int A01;
    public GraphGuardianContent A02;
    public C38321qM A03;
    public InterfaceC1571373s A04;
    public InterfaceC1571373s A05;
    public C161887My A06;
    public User A07;
    public Integer A08;
    public Integer A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public int A0E;
    public FBC A0F;
    public C32427EQc A0G;
    public C26959Bv0 A0H;
    public C26960Bv1 A0I;
    public ENZ A0J;
    public boolean A0K;
    public final Context A0L;
    public final Resources A0M;
    public final UserSession A0N;
    public final InterfaceC1571373s A0O;
    public final ES9 A0P;
    public final ESB A0Q;
    public final List A0R;
    public final java.util.Set A0S;
    public final boolean A0T;
    public final ER6 A0U;
    public final C65662y2 A0V;
    public final N9D A0W;
    public final N9E A0X;
    public final C152996uT A0Y;
    public final C31335Dq0 A0Z;
    public final C31335Dq0 A0a;
    public final C34531FJr A0b;
    public final C168737g7 A0c;
    public final C31545DtV A0d;
    public final InterfaceC62602sz A0e;
    public final C65842yM A0f;
    public final EQR A0g;
    public final C32442EQu A0h;
    public final ES8 A0i;
    public final FMX A0j;
    public final ES6 A0k;
    public final FMZ A0l;
    public final C34481FHt A0m;
    public final ES4 A0n;
    public final String A0o;
    public final boolean A0p;
    public final boolean A0q;
    public final boolean A0r;

    @Override // X.InterfaceC65242xM
    public final Object getAdapter() {
        return this;
    }

    private void A00() {
        C82H c82h;
        C38321qM c38321qM = this.A03;
        N9D n9d = this.A0W;
        InterfaceC62602sz interfaceC62602sz = this.A0e;
        if ((interfaceC62602sz == null || !interfaceC62602sz.CLJ()) && n9d != null && c38321qM != null) {
            UserSession userSession = this.A0N;
            boolean z = this.A0p;
            if (AbstractC196078lx.A01(userSession)) {
                if (!C196058lv.A08.A04(CallerContext.A01("UserListAdapter"), userSession)) {
                    return;
                }
            }
            boolean A00 = C196218mC.A00(userSession);
            if (!z) {
                return;
            }
            if (A00) {
                c82h = C82H.A0t;
            } else {
                c82h = C82H.A0q;
            }
            if (!C197838ou.A03(C82G.A0Y, c82h, userSession)) {
                return;
            }
            if (C18U.A06(C06090Tz.A05, userSession, 36329629413360074L)) {
                C131965xW.A01(userSession, this.A0L, "likes_sheet");
            }
            addModel(new C54622OAx(c38321qM, C180377zR.A07(userSession), C196218mC.A00(userSession)), n9d);
            if (C6WL.A00(userSession).A01.get()) {
                return;
            }
            C6WL.A00(userSession).A01.set(true);
        }
    }

    private void A01() {
        Object c54472O5a;
        C38321qM c38321qM = this.A03;
        N9E n9e = this.A0X;
        UserSession userSession = this.A0N;
        Integer A02 = C79923hh.A02(userSession);
        if (n9e != null && c38321qM != null) {
            if ((A02 == null || A02 == C05F.A00) && A02(c38321qM) && C200108tF.A08(userSession)) {
                c54472O5a = new C54472O5a(c38321qM);
            } else if (A02 == C05F.A01 && A02(c38321qM)) {
                if (C18U.A06(C06090Tz.A05, userSession, 36329629413425611L)) {
                    C196068lw.A00(userSession).A02(CallerContext.A01("UserListAdapter"), null, MSV.A00(255), false);
                }
                c54472O5a = new C54563O8p(c38321qM, false);
            } else if (A02 != C05F.A00 || !A02(c38321qM)) {
                return;
            } else {
                c54472O5a = new C54564O8q(c38321qM);
            }
            addModel(c54472O5a, n9e);
        }
    }

    public final void A04(Collection collection) {
        List list = this.A0R;
        list.addAll(collection);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.A0S.add(AbstractC25226BEj.A15(it).getId());
        }
        A03();
    }

    public final void A05(Collection collection) {
        this.A0R.clear();
        this.A0S.clear();
        A04(collection);
    }

    @Override // X.InterfaceC161877Mx
    public final boolean AJn(String str) {
        return this.A0S.contains(str);
    }

    private boolean A02(C38321qM c38321qM) {
        UserSession userSession;
        User A2E;
        if (c38321qM.A1z() != ProductType.CLIPS || (A2E = c38321qM.A2E((userSession = this.A0N))) == null || !userSession.userId.equals(A2E.getId()) || ((c38321qM.A1m() != EnumC76753cN.A06 && C79923hh.A01(c38321qM) != EnumC31334Dpz.A04) || !(AbstractC50573MUe.A00(c38321qM) instanceof C52740NVi))) {
            return false;
        }
        return AbstractC31176DnK.A1a(C06090Tz.A05, userSession, 36320266384580838L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:153:0x00f2, code lost:
    
        if (X.FYF.A01(r0) != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x011a, code lost:
    
        if (r7.A0E != null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0159, code lost:
    
        if (X.BO2.A02(r1, r6) == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00db, code lost:
    
        if (X.FYF.A01(r0) == false) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0219  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A03() {
        /*
            Method dump skipped, instructions count: 818
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EQM.A03():void");
    }

    @Override // X.InterfaceC161877Mx
    public final void FAg() {
        notifyDataSetChangedSmart();
    }

    @Override // X.C2UT
    public final void updateListView() {
        notifyDataSetChangedSmart();
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [X.FHt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [X.FMX, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [X.FJr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v46, types: [java.lang.Object, X.EQR] */
    /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Object, X.FBC] */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.2y2, java.lang.Object] */
    public EQM(Context context, AbstractC59962oe abstractC59962oe, FKB fkb, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC1571373s interfaceC1571373s, InterfaceC62602sz interfaceC62602sz, GYX gyx, InterfaceC1570173f interfaceC1570173f, OHW ohw, C34487FHz c34487FHz, ENZ enz, ENZ enz2, ENZ enz3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        super(z9);
        ES8 es8;
        N9D n9d;
        N9E n9e;
        this.A0Z = C31335Dq0.A00(2131968490);
        this.A0a = C31335Dq0.A00(2131961208);
        this.A0E = 10;
        this.A0O = new GHN(this, 4);
        this.A00 = 2131968660;
        setHasStableIds(z6);
        this.A0L = context;
        this.A0N = userSession;
        this.A0M = context.getResources();
        this.A0R = AbstractC166987dD.A1E();
        this.A0S = AbstractC166987dD.A1H();
        this.A0J = enz;
        this.A05 = interfaceC1571373s;
        this.A0m = new Object();
        this.A0j = new Object();
        this.A0l = new FMZ(userSession);
        this.A0e = interfaceC62602sz;
        this.A0b = new Object();
        this.A0C = z2;
        this.A0q = z3;
        this.A0T = z4;
        this.A0K = z8;
        this.A0p = z5;
        this.A0r = z7;
        if (z7) {
            this.A0G = new C32427EQc(context);
            this.A0F = new Object();
        }
        this.A0o = interfaceC11380iw.getModuleName();
        ESB esb = new ESB(context, interfaceC11380iw, userSession, interfaceC1570173f, C05F.A00, z, z8);
        this.A0Q = esb;
        esb.A02 = true;
        ER6 er6 = new ER6(context, fkb);
        this.A0U = er6;
        ES9 es9 = new ES9(context, interfaceC11380iw, userSession);
        this.A0P = es9;
        C32442EQu c32442EQu = new C32442EQu(context);
        this.A0h = c32442EQu;
        ES4 es4 = new ES4(context);
        this.A0n = es4;
        ES6 es6 = new ES6(context, userSession);
        this.A0k = es6;
        if (enz != null) {
            es8 = new ES8(context, userSession, enz, z4);
        } else {
            es8 = null;
        }
        this.A0i = es8;
        this.A0H = new C26959Bv0(interfaceC11380iw, userSession, ohw);
        this.A0I = new C26960Bv1(interfaceC11380iw, userSession, c34487FHz);
        C168737g7 c168737g7 = new C168737g7(context);
        this.A0c = c168737g7;
        C31545DtV c31545DtV = new C31545DtV(context);
        this.A0d = c31545DtV;
        C65842yM c65842yM = new C65842yM(context);
        this.A0f = c65842yM;
        C152996uT c152996uT = new C152996uT(context);
        this.A0Y = c152996uT;
        ?? obj = new Object();
        this.A0V = obj;
        if (abstractC59962oe != null && enz2 != null) {
            n9d = new N9D(context, abstractC59962oe, userSession, enz2);
        } else {
            n9d = null;
        }
        this.A0W = n9d;
        if (abstractC59962oe != null && enz3 != null) {
            n9e = new N9E(context, abstractC59962oe, userSession, enz3);
        } else {
            n9e = null;
        }
        this.A0X = n9e;
        obj.A03 = context.getResources().getDimensionPixelSize(R.dimen.bottom_sheet_survey_thanks_vertical_margin);
        ArrayList A0z = AbstractC31174DnI.A0z(esb);
        A0z.add(er6);
        A0z.add(es9);
        A0z.add(c32442EQu);
        A0z.add(es4);
        A0z.add(es6);
        if (es8 != null) {
            A0z.add(es8);
        }
        A0z.add(this.A0H);
        A0z.add(this.A0I);
        A0z.add(c168737g7);
        A0z.add(c31545DtV);
        A0z.add(c65842yM);
        A0z.add(c152996uT);
        A0z.add(obj);
        if (z7) {
            A0z.add(this.A0G);
        }
        if (n9d != null) {
            A0z.add(n9d);
        }
        if (n9e != null) {
            A0z.add(n9e);
        }
        if (gyx != null) {
            ?? obj2 = new Object();
            obj2.A00 = gyx;
            this.A0g = obj2;
            A0z.add(obj2);
        } else {
            this.A0g = null;
        }
        init((InterfaceC65642y0[]) A0z.toArray(new InterfaceC65642y0[A0z.size()]));
        if (!C18U.A06(C06090Tz.A05, userSession, 36329629413425611L)) {
            C196068lw.A00(userSession).A02(CallerContext.A01("UserListAdapter"), null, MSV.A00(255), false);
        }
        this.A06 = new C161887My(context, userSession, this);
        AbstractC25651Mw.A00(userSession).A01(this.A06, C70073Cr.class);
    }
}
