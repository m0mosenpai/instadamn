package X;

import android.app.Application;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Mdz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50868Mdz extends C193578hc {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final C2GS A0B;
    public final UserSession A0C;
    public final C1818484t A0D;
    public final ClipsCreationViewModel A0E;
    public final C187358Sd A0F;
    public final C8NL A0G;
    public final NIW A0H;
    public final NIW A0I;
    public final NIX A0J;
    public final C87H A0K;
    public final C183298Bb A0L;
    public final List A0M;
    public final InterfaceC19390xP A0N;
    public final InterfaceC19390xP A0O;
    public final InterfaceC19390xP A0P;
    public final InterfaceC19390xP A0Q;
    public final InterfaceC19390xP A0R;
    public final InterfaceC19390xP A0S;
    public final InterfaceC06180Ui A0T;
    public final InterfaceC06180Ui A0U;
    public final InterfaceC06180Ui A0V;
    public final InterfaceC06180Ui A0W;
    public final InterfaceC06180Ui A0X;
    public final C05A A0Y;
    public final C05A A0Z;
    public final C05A A0a;
    public final C05A A0b;
    public final C05A A0c;
    public final C05A A0d;
    public final C05A A0e;
    public final InterfaceC15070pN A0f;
    public final InterfaceC15070pN A0g;
    public final InterfaceC15070pN A0h;
    public final C0UO A0i;
    public final C0UO A0j;
    public final C0UO A0k;
    public final boolean A0l;
    public final TargetViewSizeProvider A0m;

    public static final boolean A04(List list, float f) {
        if (f != 0.0f) {
            if (!AbstractC166987dD.A1b(list)) {
                return false;
            }
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((C115475Kh) it.next()).A01 != 0.0f) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public final void A0O(int i, int i2, int i3, boolean z) {
        int i4;
        int i5;
        this.A0A = true;
        ClipsCreationViewModel clipsCreationViewModel = this.A0E;
        C84B A0N = MSY.A0N(clipsCreationViewModel);
        if (A0N != null) {
            int A01 = A0N.A01(i);
            int i6 = 0;
            if (!z) {
                i6 = (i3 - i2) - 1;
            }
            this.A01 = A01 + i6;
            i5 = A0N.A00;
            C115475Kh A0V = MSW.A0V(A0N, i);
            if (A0V != null) {
                if (z) {
                    i4 = A0V.A09 - i2;
                } else {
                    i4 = i3 - A0V.A08;
                }
            } else {
                return;
            }
        } else {
            i4 = 0;
            i5 = 0;
        }
        A0K();
        this.A0K.A07(this.A01);
        clipsCreationViewModel.A0Q.A01(EnumC191648eM.A0g);
        this.A0H.A0T(false, true);
        this.A0I.A0S(false, null);
        if (!ClipsCreationViewModel.A05(clipsCreationViewModel, i, i2, i3)) {
            A0I();
        }
        this.A0J.A0V(i4, i5, z, false, false);
    }

    public final void A0R(EnumC53170NfR enumC53170NfR, int i, int i2) {
        C14360o3.A0B(enumC53170NfR, 0);
        this.A0K.A01();
        AbstractC166987dD.A1Z(new PZ4(enumC53170NfR, this, null, i, i2, 2), AbstractC141776au.A00(this));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r15v0, types: [X.2GT, X.2GS] */
    public C50868Mdz(Application application, UserSession userSession, TargetViewSizeProvider targetViewSizeProvider, ClipsCreationViewModel clipsCreationViewModel, C187358Sd c187358Sd, C8NL c8nl, NIW niw, NIW niw2, NIX nix, C87H c87h, C183298Bb c183298Bb, boolean z) {
        super(application);
        AbstractC25234BEr.A1R(userSession, c187358Sd, clipsCreationViewModel, c87h, c183298Bb);
        AbstractC25233BEq.A0y(7, niw, niw2, nix);
        C14360o3.A0B(targetViewSizeProvider, 10);
        C14360o3.A0B(c8nl, 11);
        this.A0C = userSession;
        this.A0F = c187358Sd;
        this.A0E = clipsCreationViewModel;
        this.A0K = c87h;
        this.A0L = c183298Bb;
        this.A0H = niw;
        this.A0I = niw2;
        this.A0J = nix;
        this.A0m = targetViewSizeProvider;
        this.A0G = c8nl;
        this.A0l = z;
        C008002u A00 = C10E.A00(null);
        this.A0c = A00;
        C008002u A002 = C10E.A00(null);
        this.A0Z = A002;
        C008002u A003 = C10E.A00(null);
        this.A0e = A003;
        Integer num = C05F.A00;
        AnonymousClass057 A004 = C10M.A00(num, 0, 0);
        this.A0T = A004;
        AnonymousClass057 A005 = C10M.A00(num, 0, 0);
        this.A0V = A005;
        AnonymousClass057 A006 = C10M.A00(num, 0, 0);
        this.A0U = A006;
        C008002u A0u = MSY.A0u(0);
        this.A0Y = A0u;
        C008002u A1A = AbstractC25235BEs.A1A(false);
        this.A0b = A1A;
        AnonymousClass057 A007 = C10M.A00(num, 0, 0);
        this.A0X = A007;
        C008002u A0o = AbstractC31171DnF.A0o();
        this.A0d = A0o;
        this.A0B = new C2GT(C193588hd.A00);
        this.A02 = Integer.MIN_VALUE;
        this.A00 = Integer.MIN_VALUE;
        this.A04 = Integer.MIN_VALUE;
        this.A0P = new C15430py(A00);
        this.A0O = new C15430py(A002);
        this.A0Q = new C15430py(A003);
        this.A0f = A004;
        this.A0h = A005;
        this.A0g = A006;
        this.A0S = new C43817JZf(A007, 11);
        this.A0N = A0u;
        this.A0j = A1A;
        C008002u A1H = AbstractC25225BEi.A1H(new C51748MtX(C05F.A0N, true, true, false));
        this.A0a = A1H;
        this.A0i = AbstractC208910l.A02(A1H);
        AnonymousClass057 A008 = C10M.A00(num, 0, 0);
        this.A0W = A008;
        this.A0M = AbstractC166987dD.A1E();
        this.A0R = A008;
        this.A0k = A0o;
        this.A0D = clipsCreationViewModel.A0Q;
        A0K();
    }

    private final C52425NHv A00(Context context, AbstractC187378Sf abstractC187378Sf, List list, int i, boolean z) {
        int i2;
        int i3;
        int i4;
        boolean z2;
        int A04;
        int intValue;
        int i5;
        C187538Sv c187538Sv;
        C115475Kh c115475Kh = (C115475Kh) AbstractC001800i.A0O(list, i);
        int i6 = Integer.MAX_VALUE;
        if (c115475Kh != null) {
            i2 = MSW.A05(c115475Kh);
        } else {
            i2 = Integer.MAX_VALUE;
        }
        int i7 = i + 1;
        C115475Kh c115475Kh2 = (C115475Kh) AbstractC001800i.A0O(list, i7);
        if (c115475Kh2 != null) {
            i6 = MSW.A05(c115475Kh2);
        }
        boolean z3 = false;
        if (i2 < 1000) {
            i2 = 0;
        }
        if (i6 < 1000) {
            i6 = 0;
        }
        float f = 24.0f / 2.0f;
        int min = Math.min((int) AbstractC13880nE.A00(context, f), Math.max(0, (int) ((AbstractC53880NsC.A00(context, i2) - AbstractC13880nE.A00(context, 64.0f)) / 2.0f)));
        int min2 = Math.min((int) AbstractC13880nE.A00(context, f), Math.max(0, (int) ((AbstractC53880NsC.A00(context, i6) - AbstractC13880nE.A00(context, 64.0f)) / 2.0f)));
        C84G c84g = this.A0E.A0O;
        String A00 = c84g.A00(i);
        if (A00 != null) {
            List list2 = AbstractC22785A3d.A00;
            int size = list2.size();
            i3 = 0;
            int i8 = 0;
            while (true) {
                if (i8 >= size) {
                    break;
                }
                if (C14360o3.A0K(((EnumC223059sk) list2.get(i8)).A02, A00)) {
                    i3 = i8 + 1;
                    break;
                }
                i8++;
            }
        } else {
            i3 = 0;
        }
        boolean z4 = abstractC187378Sf instanceof C187538Sv;
        Integer num = null;
        if (z4 && (c187538Sv = (C187538Sv) abstractC187378Sf) != null && ((c187538Sv.A00 - 1) / 2) - 1 == i) {
            z3 = true;
        }
        C0UO c0uo = c84g.A03;
        boolean A02 = AHU.A02((C84B) c0uo.getValue(), i);
        if (abstractC187378Sf instanceof C8TG) {
            i4 = ((C8TG) abstractC187378Sf).A00;
        } else if (abstractC187378Sf instanceof C8TF) {
            i4 = ((C8TF) abstractC187378Sf).A00;
        } else if (abstractC187378Sf instanceof C187528Su) {
            i4 = ((C187528Su) abstractC187378Sf).A00;
        } else {
            if (abstractC187378Sf instanceof C187478Sp) {
                i4 = ((C187478Sp) abstractC187378Sf).A00;
            }
            z2 = true;
            if (!z4 && !(abstractC187378Sf instanceof C187508Ss) && !(abstractC187378Sf instanceof C187518St) && !(abstractC187378Sf instanceof C187528Su) && !(abstractC187378Sf instanceof C52411NHh) && (num == null || (intValue = num.intValue()) == -1 || -1 > (i5 = i - intValue) || i5 >= 1)) {
                A04 = (int) (AbstractC13880nE.A04(context, 44) / AbstractC50522MSa.A00(context, OZQ.A00));
                if (!C14360o3.A0K(A0F(i, A04), true) && !C14360o3.A0K(A0F(i7, A04), true) && AHU.A02((C84B) c0uo.getValue(), i)) {
                    z2 = false;
                }
            }
            return new C52425NHv(i3, min, min2, z3, A02, !z2, z);
        }
        num = Integer.valueOf(i4);
        z2 = true;
        if (!z4) {
            A04 = (int) (AbstractC13880nE.A04(context, 44) / AbstractC50522MSa.A00(context, OZQ.A00));
            if (!C14360o3.A0K(A0F(i, A04), true)) {
                z2 = false;
            }
        }
        return new C52425NHv(i3, min, min2, z3, A02, !z2, z);
    }

    public static final void A01(AbstractC187378Sf abstractC187378Sf, C50868Mdz c50868Mdz) {
        C05A c05a;
        C51748MtX c51748MtX;
        Integer num;
        boolean z;
        Integer num2;
        boolean z2;
        int i;
        if (!(abstractC187378Sf instanceof C8T5) && !(abstractC187378Sf instanceof C8T6) && !(abstractC187378Sf instanceof C8TE) && !(abstractC187378Sf instanceof C8TC) && !(abstractC187378Sf instanceof C8T3) && !(abstractC187378Sf instanceof C8T4) && !(abstractC187378Sf instanceof C187558Sy) && !(abstractC187378Sf instanceof C187568Sz) && !(abstractC187378Sf instanceof C8T1) && !(abstractC187378Sf instanceof C8TF) && !(abstractC187378Sf instanceof C187518St) && !(abstractC187378Sf instanceof C187478Sp) && !(abstractC187378Sf instanceof C187528Su)) {
            if (!(abstractC187378Sf instanceof C8TG) && !(abstractC187378Sf instanceof C52416NHm)) {
                if (abstractC187378Sf instanceof C187548Sw) {
                    c05a = c50868Mdz.A0a;
                    z = true;
                    num2 = C05F.A0C;
                    z2 = false;
                    i = 8;
                } else if (abstractC187378Sf instanceof C187538Sv) {
                    c05a = c50868Mdz.A0a;
                    z = false;
                    num2 = C05F.A00;
                    z2 = true;
                    i = 4;
                } else if (abstractC187378Sf instanceof C187508Ss) {
                    c05a = c50868Mdz.A0a;
                    boolean z3 = ((C187508Ss) abstractC187378Sf).A00;
                    c51748MtX = new C51748MtX(MSX.A0Y(z3 ? 1 : 0), 8, false, !z3, false);
                } else if ((abstractC187378Sf instanceof C52414NHk) || (abstractC187378Sf instanceof C8T7) || (abstractC187378Sf instanceof C8T9) || (abstractC187378Sf instanceof C8Sx) || (abstractC187378Sf instanceof C8T2) || (abstractC187378Sf instanceof AbstractC187488Sq) || (abstractC187378Sf instanceof C8T0) || (abstractC187378Sf instanceof C187368Se)) {
                    return;
                } else {
                    throw B4Z.A00();
                }
                c51748MtX = new C51748MtX(num2, i, z, z, z2);
            } else {
                c05a = c50868Mdz.A0a;
                boolean z4 = c50868Mdz.A05;
                if (!z4 && !c50868Mdz.A09) {
                    num = C05F.A0N;
                } else {
                    num = C05F.A00;
                }
                c51748MtX = new C51748MtX(num, 8, true, !z4, false);
            }
        } else {
            c05a = c50868Mdz.A0a;
            c51748MtX = new C51748MtX(C05F.A00, 8, true, false, false);
        }
        c05a.Egh(c51748MtX);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0019 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A02(X.AbstractC187378Sf r4, float r5, float r6, int r7) {
        /*
            boolean r0 = r4 instanceof X.C8TB
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L26
            X.8TB r4 = (X.C8TB) r4
            X.MtK r0 = r4.A01
            if (r0 != 0) goto L1b
            int r1 = r4.A00
            r0 = -1
            if (r1 != r0) goto L1b
            boolean r0 = r4.A04
            if (r0 != 0) goto L1a
        L15:
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
        L17:
            if (r0 == 0) goto L1a
            r2 = 0
        L1a:
            return r2
        L1b:
            int r0 = r4.A00
            if (r0 != r7) goto L26
            boolean r0 = r4.A04
            if (r0 != 0) goto L1a
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            goto L17
        L26:
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L15
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50868Mdz.A02(X.8Sf, float, float, int):boolean");
    }

    public static final boolean A03(AbstractC187378Sf abstractC187378Sf, List list) {
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!MSX.A0O(it).A0K) {
                if (!(abstractC187378Sf instanceof C187508Ss) && !(abstractC187378Sf instanceof C187518St) && !(abstractC187378Sf instanceof C187538Sv)) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public final int A0E() {
        List list = this.A0M;
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : list) {
            if ((obj instanceof C52426NHw) || (obj instanceof C52424NHu)) {
                A1E.add(obj);
            }
        }
        return A1E.size();
    }

    public final Boolean A0F(int i, int i2) {
        if (this.A0E.A0I(i) != null) {
            return Boolean.valueOf(AbstractC25230BEn.A1P((r0.intValue() > i2 ? 1 : (r0.intValue() == i2 ? 0 : -1))));
        }
        return null;
    }

    public final Integer A0G() {
        C8TF c8tf;
        AbstractC187378Sf A0E = this.A0F.A0E();
        if (!(A0E instanceof C8TF) || (c8tf = (C8TF) A0E) == null) {
            return null;
        }
        return Integer.valueOf(c8tf.A00);
    }

    public final void A0J() {
        C187358Sd c187358Sd = this.A0F;
        AbstractC187378Sf A0E = c187358Sd.A0E();
        if (((A0E instanceof C8TG) || (A0E instanceof C8TF) || (A0E instanceof C8T3) || (A0E instanceof C8T4) || (A0E instanceof C8TE) || (A0E instanceof C8T5) || (A0E instanceof C8T6) || (A0E instanceof C8T9)) && !A0W()) {
            MSZ.A1M(c187358Sd);
        }
    }

    public final void A0L() {
        int segmentIndex;
        C84B A0N;
        InterfaceC115495Kj A04;
        AbstractC187378Sf A0E = this.A0F.A0E();
        if (A0E instanceof C8TF) {
            segmentIndex = ((C8TF) A0E).A00;
        } else if (!(A0E instanceof AbstractC187488Sq)) {
            return;
        } else {
            segmentIndex = ((AbstractC187488Sq) A0E).getSegmentIndex();
        }
        if (segmentIndex != -1 && (A0N = MSY.A0N(this.A0E)) != null && (A04 = A0N.A04(segmentIndex)) != null) {
            C57171PZp.A03(A04, this, AbstractC141776au.A00(this), 16);
        }
    }

    public final void A0M(float f) {
        int A04;
        C84B A0N;
        C115475Kh A0V;
        AbstractC187378Sf A0E = this.A0F.A0E();
        boolean z = A0E instanceof C187528Su;
        ClipsCreationViewModel clipsCreationViewModel = this.A0E;
        if (z && (A0N = MSY.A0N(clipsCreationViewModel)) != null && (A0V = MSW.A0V(A0N, ((C187528Su) A0E).A00)) != null) {
            A04 = (MSW.A04(clipsCreationViewModel) - MSW.A05(A0V)) + AbstractC53904Nsd.A00(A0V, f);
        } else {
            A04 = MSW.A04(clipsCreationViewModel);
        }
        this.A0Z.Egh(new C51752Mtb(C05F.A0C, A04, MSW.A04(clipsCreationViewModel), 7));
    }

    public final void A0N(int i) {
        Object obj;
        C87H c87h = this.A0K;
        if (c87h.A0A.A02() != EnumC189218Zt.A05 && !A0Y() && !(this.A0F.A0E() instanceof C187538Sv)) {
            C05A c05a = this.A0c;
            C51745MtU c51745MtU = (C51745MtU) c05a.getValue();
            if (c51745MtU != null) {
                obj = c51745MtU.A01;
            } else {
                obj = null;
            }
            if (obj == C05F.A0C) {
                c05a.Egh(null);
            } else {
                c87h.A06(i);
            }
        }
    }

    public final void A0P(int i, int i2, int i3, boolean z) {
        C115475Kh A0V;
        int i4;
        int A04;
        int i5;
        int i6 = i3;
        if (z) {
            i6 = i2;
        }
        this.A01 = i6;
        if (!C14360o3.A0K(this.A0B.A02(), C193588hd.A00)) {
            if (!z) {
                this.A01--;
            }
            C84B A0N = MSY.A0N(this.A0E);
            if (A0N != null) {
                i5 = A0N.A01(i);
            } else {
                i5 = 0;
            }
            A0N(this.A01 + i5);
        }
        AbstractC166987dD.A1Z(new C57151PYd(this, (InterfaceC23621Ds) null, i3, i2, 4), AbstractC141776au.A00(this));
        ClipsCreationViewModel clipsCreationViewModel = this.A0E;
        C84B A0N2 = MSY.A0N(clipsCreationViewModel);
        if (A0N2 != null && (A0V = MSW.A0V(A0N2, i)) != null) {
            if (z) {
                i4 = A0V.A09 - i2;
            } else {
                i4 = i3 - A0V.A08;
            }
            C05A c05a = this.A0c;
            Integer num = C05F.A01;
            if (z) {
                A04 = i4;
            } else {
                A04 = MSW.A04(clipsCreationViewModel) + i4;
            }
            c05a.Egh(new C51745MtU(num, A04, z));
            this.A0H.A0P(i4, MSW.A04(clipsCreationViewModel), z);
            this.A0I.A0P(i4, MSW.A04(clipsCreationViewModel), z);
            this.A0J.A0V(i4, MSW.A04(clipsCreationViewModel), z, true, false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x009c, code lost:
    
        if (r0 != 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0123, code lost:
    
        if (java.lang.Float.valueOf(r8) == null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0214, code lost:
    
        if (java.lang.Float.valueOf(r7) == null) goto L93;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0Q(android.content.Context r44, X.AbstractC187378Sf r45, java.util.List r46, int r47, boolean r48, boolean r49) {
        /*
            Method dump skipped, instructions count: 718
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50868Mdz.A0Q(android.content.Context, X.8Sf, java.util.List, int, boolean, boolean):void");
    }

    public final void A0S(Integer num) {
        C05A c05a = this.A0Z;
        Integer num2 = C05F.A0N;
        ClipsCreationViewModel clipsCreationViewModel = this.A0E;
        c05a.Egh(new C51752Mtb(MSW.A04(clipsCreationViewModel), num2));
        if (num != null) {
            NIX nix = this.A0J;
            int A04 = MSW.A04(clipsCreationViewModel);
            int intValue = num.intValue();
            nix.A0V(A04 - intValue, intValue, false, false, true);
        }
    }

    public final void A0T(Integer num) {
        int i;
        C2GS c2gs = this.A0B;
        Object A02 = c2gs.A02();
        C193588hd c193588hd = C193588hd.A00;
        if (!C14360o3.A0K(A02, c193588hd)) {
            C87H c87h = this.A0K;
            c87h.A05();
            if (num != null) {
                i = num.intValue();
            } else {
                i = this.A01;
            }
            c87h.A07(i);
            C2GT c2gt = this.A0E.A0C;
            C14360o3.A0B(c2gt, 0);
            if (c87h.A00 != c2gt) {
                c87h.A09(c2gt);
            }
            c87h.A0A(new C56317Oze(this, num));
            c2gs.A0B(c193588hd);
            return;
        }
        A0N(this.A01);
    }

    public final void A0U(Integer num, Integer num2) {
        if (num != null) {
            this.A0M.set(0, new C52423NHt(null, num.intValue(), false));
        }
        if (num2 != null) {
            List list = this.A0M;
            list.set(AbstractC25226BEj.A05(list), new C52423NHt(null, num2.intValue(), false));
        }
        AbstractC25231BEo.A1H(this, AbstractC141776au.A00(this), 6);
    }

    public final boolean A0W() {
        Object obj;
        C05A c05a = this.A0c;
        C51745MtU c51745MtU = (C51745MtU) c05a.getValue();
        Object obj2 = null;
        if (c51745MtU != null) {
            obj = c51745MtU.A01;
        } else {
            obj = null;
        }
        if (obj != C05F.A01) {
            C51745MtU c51745MtU2 = (C51745MtU) c05a.getValue();
            if (c51745MtU2 != null) {
                obj2 = c51745MtU2.A01;
            }
            if (obj2 != C05F.A00 && this.A0J.A0E.getValue() != EnumC53130Nej.A04 && !this.A0I.A02 && !this.A0H.A02) {
                return false;
            }
        }
        return true;
    }

    public final boolean A0X() {
        Integer num;
        Integer num2;
        C05A c05a = this.A0e;
        C54631OBg c54631OBg = (C54631OBg) c05a.getValue();
        Integer num3 = null;
        if (c54631OBg != null) {
            num = c54631OBg.A03;
        } else {
            num = null;
        }
        if (num != C05F.A00) {
            C54631OBg c54631OBg2 = (C54631OBg) c05a.getValue();
            if (c54631OBg2 != null) {
                num2 = c54631OBg2.A03;
            } else {
                num2 = null;
            }
            if (num2 != C05F.A01) {
                C54631OBg c54631OBg3 = (C54631OBg) c05a.getValue();
                if (c54631OBg3 != null) {
                    num3 = c54631OBg3.A03;
                }
                if (num3 != C05F.A0C) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean A0Y() {
        Object obj;
        Object obj2;
        C05A c05a = this.A0Z;
        C51752Mtb c51752Mtb = (C51752Mtb) c05a.getValue();
        Object obj3 = null;
        if (c51752Mtb != null) {
            obj = c51752Mtb.A02;
        } else {
            obj = null;
        }
        if (obj != C05F.A00) {
            C51752Mtb c51752Mtb2 = (C51752Mtb) c05a.getValue();
            if (c51752Mtb2 != null) {
                obj2 = c51752Mtb2.A02;
            } else {
                obj2 = null;
            }
            if (obj2 != C05F.A01) {
                C51752Mtb c51752Mtb3 = (C51752Mtb) c05a.getValue();
                if (c51752Mtb3 != null) {
                    obj3 = c51752Mtb3.A02;
                }
                if (obj3 != C05F.A0C) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean A0Z() {
        Object obj;
        C05A c05a = this.A0c;
        C51745MtU c51745MtU = (C51745MtU) c05a.getValue();
        Object obj2 = null;
        if (c51745MtU != null) {
            obj = c51745MtU.A01;
        } else {
            obj = null;
        }
        if (obj != C05F.A00) {
            C51745MtU c51745MtU2 = (C51745MtU) c05a.getValue();
            if (c51745MtU2 != null) {
                obj2 = c51745MtU2.A01;
            }
            if (obj2 != C05F.A01) {
                return false;
            }
        }
        return true;
    }

    public final ArrayList A0H() {
        int i;
        int i2;
        ArrayList A1E = AbstractC166987dD.A1E();
        C58252li c58252li = this.A0E.A0F;
        C84B A0W = MSW.A0W(c58252li);
        if (A0W != null) {
            int A06 = MSW.A06(A0W);
            if (Integer.valueOf(A06) != null && A06 != 0) {
                for (int i3 = 0; i3 < A06; i3++) {
                    C84B A0W2 = MSW.A0W(c58252li);
                    if (A0W2 != null) {
                        i = A0W2.A01(i3);
                    } else {
                        i = 0;
                    }
                    C84B A0W3 = MSW.A0W(c58252li);
                    if (A0W3 != null) {
                        i2 = A0W3.A00(i3);
                    } else {
                        i2 = 0;
                    }
                    AbstractC166997dE.A1W(A1E, i);
                    AbstractC166997dE.A1W(A1E, i + i2);
                }
            }
        }
        return AbstractC001800i.A0S(this.A0I.A0E(), AbstractC001800i.A0S(this.A0H.A0E(), AbstractC001800i.A0S(this.A0J.A0E(), AbstractC001800i.A0W(A1E))));
    }

    public final void A0I() {
        C05A c05a;
        int i;
        Object c54631OBg;
        int A04;
        Boolean bool;
        int i2 = 0;
        boolean z = false;
        if (A0Z()) {
            c05a = this.A0c;
            C51745MtU c51745MtU = (C51745MtU) c05a.getValue();
            if (c51745MtU != null) {
                bool = Boolean.valueOf(c51745MtU.A02);
            } else {
                bool = null;
            }
            Integer num = C05F.A0C;
            int i3 = this.A01;
            if (bool != null) {
                z = bool.booleanValue();
            }
            c54631OBg = new C51745MtU(num, i3, z);
        } else {
            if (A0Y()) {
                C51752Mtb c51752Mtb = (C51752Mtb) this.A0Z.getValue();
                if (c51752Mtb != null) {
                    A04 = c51752Mtb.A00;
                } else {
                    A04 = MSW.A04(this.A0E);
                }
                A0S(Integer.valueOf(A04));
                return;
            }
            if (!A0X()) {
                return;
            }
            c05a = this.A0e;
            C54631OBg c54631OBg2 = (C54631OBg) c05a.getValue();
            if (c54631OBg2 != null) {
                i = c54631OBg2.A02;
            } else {
                i = 0;
            }
            C54631OBg c54631OBg3 = (C54631OBg) c05a.getValue();
            if (c54631OBg3 != null) {
                i2 = c54631OBg3.A01;
            }
            c54631OBg = new C54631OBg(C05F.A0N, i, i2, 0);
        }
        c05a.Egh(c54631OBg);
    }

    public final void A0K() {
        AbstractC25231BEo.A1H(this, AbstractC141776au.A00(this), 4);
    }

    public final void A0V(List list) {
        C57171PZp.A03(list, this, AbstractC141776au.A00(this), 15);
    }
}
