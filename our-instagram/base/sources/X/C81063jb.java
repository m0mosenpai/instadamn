package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.CountDownTimer;
import android.provider.Settings;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.3jb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C81063jb extends C1I2 {
    public float A00;
    public int A01;
    public int A02;
    public ValueAnimator A03;
    public CountDownTimer A04;
    public C38321qM A05;
    public C60662pp A06;
    public String A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public final float A0G;
    public final Context A0H;
    public final UserSession A0I;
    public final C674832n A0J;
    public final C674932o A0K;
    public final C674732m A0L;
    public final C68084V9p A0M;
    public final ConcurrentHashMap A0N;
    public final ConcurrentHashMap A0O;
    public final InterfaceC65282xQ A0P;
    public final C27867CQe A0Q;

    public C81063jb(Context context, UserSession userSession, C674832n c674832n, C674932o c674932o, C674732m c674732m, InterfaceC65282xQ interfaceC65282xQ, C27867CQe c27867CQe) {
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(c674932o, 5);
        this.A0H = context;
        this.A0I = userSession;
        this.A0P = interfaceC65282xQ;
        this.A0Q = c27867CQe;
        this.A0K = c674932o;
        this.A0J = c674832n;
        this.A0L = c674732m;
        int A01 = (int) C18U.A01(C06090Tz.A06, userSession, 36606251077342601L);
        this.A02 = A01;
        this.A01 = A01;
        this.A03 = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.A00 = 1.0f;
        this.A0M = (C68084V9p) userSession.A01(C68084V9p.class, new X30(userSession, 24));
        this.A0N = new ConcurrentHashMap();
        this.A0O = new ConcurrentHashMap();
        this.A0G = Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
    }

    public static final void A01(C81063jb c81063jb, String str, boolean z) {
        Integer num;
        C75113Zb c75113Zb;
        View view;
        c81063jb.A0E = z;
        ConcurrentHashMap concurrentHashMap = c81063jb.A0O;
        if (!z) {
            concurrentHashMap.put(str, EnumC39544HdG.A05);
            C60662pp c60662pp = c81063jb.A06;
            if (c60662pp != null && (view = c60662pp.A01) != null) {
                view.setVisibility(0);
            }
            C60662pp c60662pp2 = c81063jb.A06;
            if (c60662pp2 != null) {
                IgSimpleImageView igSimpleImageView = c60662pp2.A03;
                if (igSimpleImageView != null) {
                    igSimpleImageView.setVisibility(8);
                }
                IgTextView igTextView = c60662pp2.A04;
                if (igTextView != null) {
                    igTextView.setVisibility(0);
                }
            }
        } else {
            concurrentHashMap.put(str, EnumC39544HdG.A03);
        }
        CountDownTimer countDownTimer = c81063jb.A04;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        float f = c81063jb.A00;
        int i = c81063jb.A02;
        float f2 = f * i * 1000.0f;
        int ceil = (int) Math.ceil(f2 / 1000.0f);
        c81063jb.A01 = ceil;
        if (ceil == i) {
            num = C05F.A0C;
        } else {
            num = C05F.A0Y;
        }
        A00(c81063jb, num, "unknown");
        C09530e4 c09530e4 = (C09530e4) c81063jb.A0N.get(str);
        if (c09530e4 != null) {
            c75113Zb = (C75113Zb) c09530e4.A01;
        } else {
            c75113Zb = null;
        }
        c81063jb.A04 = new CountDownTimerC38296Gsf(c75113Zb, c81063jb, str, f2).start();
        c81063jb.A03.cancel();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(c81063jb.A00, 0.0f);
        c81063jb.A03 = ofFloat;
        ofFloat.setDuration(((c81063jb.A00 * c81063jb.A02) * 1000.0f) / c81063jb.A0G);
        c81063jb.A03.setInterpolator(new LinearInterpolator());
        c81063jb.A03.addUpdateListener(new C41781Iex(c81063jb));
        c81063jb.A03.start();
    }

    public final void A05(C38321qM c38321qM) {
        C60662pp c60662pp;
        if (A08(c38321qM, false)) {
            String id = c38321qM.getId();
            if (id != null) {
                A01(this, id, true);
            }
            if (this.A0K.A00() && (c60662pp = this.A06) != null) {
                c60662pp.A0V(true);
            }
        }
    }

    public static final void A00(C81063jb c81063jb, Integer num, String str) {
        C38321qM c38321qM;
        String str2 = c81063jb.A07;
        if (str2 != null) {
            C27867CQe c27867CQe = c81063jb.A0Q;
            C09530e4 c09530e4 = (C09530e4) c81063jb.A0N.get(str2);
            if (c09530e4 != null) {
                c38321qM = (C38321qM) c09530e4.A00;
            } else {
                c38321qM = null;
            }
            int i = c81063jb.A01;
            if (c38321qM != null) {
                AbstractC40575Hyv.A00(c27867CQe.A00, c38321qM, c27867CQe.A01, num, str, i);
            }
        }
    }

    public static final boolean A02(C81063jb c81063jb) {
        String str = c81063jb.A07;
        if (str == null || c81063jb.A0O.get(str) == EnumC39544HdG.A02) {
            return false;
        }
        return true;
    }

    public final void A03() {
        View view;
        C75113Zb c75113Zb;
        String str = this.A07;
        if (str != null) {
            C09530e4 c09530e4 = (C09530e4) this.A0N.get(str);
            if (c09530e4 != null && (c75113Zb = (C75113Zb) c09530e4.A01) != null) {
                c75113Zb.A2b = true;
                c75113Zb.A3A = false;
            }
            this.A0O.put(str, EnumC39544HdG.A02);
            C60662pp c60662pp = this.A06;
            if (c60662pp != null && (view = c60662pp.A01) != null) {
                view.setVisibility(8);
            }
            C60662pp c60662pp2 = this.A06;
            if (c60662pp2 != null) {
                if (((C674932o) c60662pp2.A0n.getValue()).A00()) {
                    c60662pp2.A0V(true);
                    c60662pp2.A0A().A0J().A0B.A03 = 0;
                }
                C65192xH A0J = c60662pp2.A0A().A0J();
                MUW muw = C3ZD.A00;
                if (muw != null) {
                    List list = (List) muw.A00;
                    if (list != null && !list.isEmpty()) {
                        ((C65312xT) ((AbstractC65202xI) A0J).A00).A0G(A0J.A0T, muw.A03, (List) muw.A00, true);
                        A0J.A0A(-1);
                    } else {
                        A0J.A0b.Chd();
                    }
                }
                C3ZD.A00 = null;
                A0J.A0A.A03 = 0;
                c60662pp2.A0A().A0J().A0A(-1);
            }
            this.A01 = this.A02;
            CountDownTimer countDownTimer = this.A04;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            this.A03.cancel();
            this.A00 = 1.0f;
            this.A09 = false;
            AbstractC39681HjD.A00 = true;
            UserSession userSession = this.A0I;
            C14360o3.A0B(userSession, 0);
            if (C18U.A06(C06090Tz.A06, userSession, 36324776104309206L)) {
                this.A07 = null;
            }
            AbstractC39681HjD.A01 = null;
            this.A0A = false;
        }
    }

    public final void A04() {
        if (!this.A09) {
            if (!this.A0A) {
                this.A0F = true;
                return;
            }
            String str = this.A07;
            if (str == null) {
                return;
            }
            C60662pp c60662pp = this.A06;
            if (c60662pp != null) {
                c60662pp.getRecyclerView().suppressLayout(true);
                c60662pp.A0V(false);
                C65192xH A0J = c60662pp.A0A().A0J();
                try {
                    C3FQ scrollingViewProxy = A0J.A0Z.getScrollingViewProxy();
                    int B6q = scrollingViewProxy.B6q();
                    int BM3 = scrollingViewProxy.BM3();
                    if (B6q >= 0 && BM3 >= 0) {
                        int i = B6q;
                        while (true) {
                            if (i > BM3) {
                                break;
                            }
                            try {
                                Object item = A0J.getItem(i);
                                if (item != null && (item instanceof InterfaceC38371qR) && C14360o3.A0K(((InterfaceC38371qR) item).BQN().getId(), str)) {
                                    View AnW = scrollingViewProxy.AnW(i);
                                    if (AnW == null) {
                                        VVL.A00("Null view in getDelayedSkipMediaPositionInfo.", B6q, BM3, i, scrollingViewProxy.AnZ(), scrollingViewProxy.getCount(), true);
                                    } else {
                                        if (i < 0) {
                                            i = 0;
                                        }
                                        AnW.getTop();
                                        c60662pp.A0A().A0J().A0B.A03 = 150;
                                        c60662pp.A0A().A0J().A0A(-1);
                                        c60662pp.A00 = i;
                                        c60662pp.getScrollingViewProxy().EmE(i, -150);
                                    }
                                } else {
                                    i++;
                                }
                            } catch (IndexOutOfBoundsException unused) {
                                VVL.A00("IndexOutOfBounds in getDelayedSkipMediaPositionInfo.", B6q, BM3, i, scrollingViewProxy.AnZ(), scrollingViewProxy.getCount(), true);
                            }
                        }
                    }
                } catch (IllegalStateException e) {
                    C65192xH.A00(e);
                }
                c60662pp.getRecyclerView().suppressLayout(false);
            }
            this.A09 = true;
        }
    }

    public final void A07(boolean z) {
        String str;
        if (!this.A0E) {
            String str2 = this.A07;
            if (str2 != null) {
                ConcurrentHashMap concurrentHashMap = this.A0O;
                if (concurrentHashMap.get(str2) == EnumC39544HdG.A05) {
                    concurrentHashMap.put(str2, EnumC39544HdG.A04);
                    Integer num = C05F.A0N;
                    if (z) {
                        str = "scroll";
                    } else {
                        str = "navigation";
                    }
                    A00(this, num, str);
                    CountDownTimer countDownTimer = this.A04;
                    if (countDownTimer != null) {
                        countDownTimer.cancel();
                    }
                    this.A03.cancel();
                }
            }
            C60662pp c60662pp = this.A06;
            if (c60662pp != null) {
                IgSimpleImageView igSimpleImageView = c60662pp.A03;
                if (igSimpleImageView != null) {
                    igSimpleImageView.setVisibility(0);
                }
                IgTextView igTextView = c60662pp.A04;
                if (igTextView != null) {
                    igTextView.setVisibility(8);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        if (r1.equals(r7.getId()) == false) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A08(X.C38321qM r7, boolean r8) {
        /*
            r6 = this;
            X.32m r5 = r6.A0L
            boolean r0 = r5.A03()
            r3 = 1
            if (r0 == 0) goto L59
            if (r7 == 0) goto L59
            boolean r0 = r7.CdW()
            if (r0 != r3) goto L59
            java.lang.String r1 = r6.A07
            if (r1 == 0) goto L20
            java.lang.String r0 = r7.getId()
            boolean r0 = r1.equals(r0)
            r4 = 1
            if (r0 != 0) goto L21
        L20:
            r4 = 0
        L21:
            boolean r0 = r5.A03()
            r2 = 0
            if (r0 == 0) goto L70
            boolean r0 = r5.A05(r7)
            if (r0 == 0) goto L70
            X.32n r0 = r5.A03
            boolean r1 = r0.A01()
            boolean r0 = r5.A06(r7)
            if (r1 != 0) goto L6a
            if (r0 != 0) goto L6a
            if (r8 == 0) goto L42
            X.AbstractC39681HjD.A02 = r2
            X.AbstractC39681HjD.A03 = r2
        L42:
            X.1rF r0 = r7.A0C
            X.1sb r0 = r0.getInjected()
            if (r0 == 0) goto L68
            java.lang.String r0 = r0.AZE()
        L4e:
            X.AbstractC39681HjD.A01 = r0
            r1 = 1
        L51:
            if (r4 != 0) goto L65
            java.lang.String r0 = r6.A07
            if (r0 == 0) goto L5b
            X.AbstractC39681HjD.A04 = r3
        L59:
            r3 = 0
            return r3
        L5b:
            X.32n r0 = r6.A0J
            boolean r0 = r0.A01()
            if (r0 != 0) goto L59
            if (r1 == 0) goto L59
        L65:
            X.AbstractC39681HjD.A04 = r2
            return r3
        L68:
            r0 = 0
            goto L4e
        L6a:
            if (r8 == 0) goto L70
            X.AbstractC39681HjD.A02 = r1
            X.AbstractC39681HjD.A03 = r0
        L70:
            r1 = 0
            goto L51
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C81063jb.A08(X.1qM, boolean):boolean");
    }

    public final void A06(Integer num, boolean z, boolean z2) {
        C60662pp c60662pp;
        View view;
        if (A02(this)) {
            if (!this.A0K.A00() ? this.A08 || num != C05F.A01 || !z : !z) {
                if (!z2) {
                    return;
                }
            }
            C2UY.A01.A03();
            UserSession userSession = this.A0I;
            C14360o3.A0B(userSession, 0);
            if (!C18U.A06(C06090Tz.A06, userSession, 36324776104964570L) && (c60662pp = this.A06) != null && (view = c60662pp.A01) != null) {
                AbstractC46701KlK.A00(view, true).start();
            }
            if (z && num == C05F.A01) {
                this.A08 = true;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:154:0x006d, code lost:
    
        if (r6 != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (r28 >= 0) goto L6;
     */
    @Override // X.C1I2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onScroll(X.C3FQ r23, int r24, int r25, int r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 589
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C81063jb.onScroll(X.3FQ, int, int, int, int, int):void");
    }

    @Override // X.C1I2
    public final void onScrollStateChanged(C3FQ c3fq, int i) {
        int i2;
        C60662pp c60662pp;
        String str;
        int A03 = C0f9.A03(158193245);
        C14360o3.A0B(c3fq, 0);
        if (!A02(this)) {
            i2 = 577650554;
        } else {
            if (i == 0 && ((this.A0D || this.A0C) && (c60662pp = this.A06) != null && (str = this.A07) != null)) {
                C65192xH A0J = c60662pp.A0A().A0J();
                try {
                    C3FQ scrollingViewProxy = A0J.A0Z.getScrollingViewProxy();
                    int B6q = scrollingViewProxy.B6q();
                    int BM3 = scrollingViewProxy.BM3();
                    if (B6q >= 0 && BM3 >= 0) {
                        int i3 = B6q;
                        while (true) {
                            if (i3 > BM3) {
                                break;
                            }
                            try {
                                Object item = A0J.getItem(i3);
                                if (item != null && (item instanceof InterfaceC38371qR) && C14360o3.A0K(((InterfaceC38371qR) item).BQN().getId(), str)) {
                                    View AnW = scrollingViewProxy.AnW(i3);
                                    if (AnW == null) {
                                        VVL.A00("Null view in getDelayedSkipMediaPositionInfo.", B6q, BM3, i3, scrollingViewProxy.AnZ(), scrollingViewProxy.getCount(), true);
                                    } else {
                                        AnW.getTop();
                                    }
                                } else {
                                    i3++;
                                }
                            } catch (IndexOutOfBoundsException unused) {
                                VVL.A00("IndexOutOfBounds in getDelayedSkipMediaPositionInfo.", B6q, BM3, i3, scrollingViewProxy.AnZ(), scrollingViewProxy.getCount(), true);
                            }
                        }
                    }
                } catch (IllegalStateException e) {
                    C65192xH.A00(e);
                }
            }
            super.onScrollStateChanged(c3fq, i);
            i2 = 2062055975;
        }
        C0f9.A0A(i2, A03);
    }
}
