package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelViewerConfig;
import com.instagram.reels.ui.views.reelavatar.view.ReelAvatarWithBadgeView;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: X.3M4, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3M4 extends C3M5 implements InterfaceC55932he, C3M6, C3M7 {
    public static final Map A13;
    public int A00;
    public RectF A01;
    public RectF A02;
    public View A03;
    public View A04;
    public View A05;
    public View A06;
    public View A07;
    public View A08;
    public View A09;
    public View A0A;
    public C69433Ad A0B;
    public Reel A0C;
    public Reel A0D;
    public C41181vS A0E;
    public C3G2 A0G;
    public InterfaceC58124Ppn A0H;
    public InterfaceC58124Ppn A0I;
    public InterfaceC140686Xw A0J;
    public InterfaceC72953Ov A0K;
    public C138246Of A0L;
    public C143556du A0M;
    public C143556du A0N;
    public NSJ A0O;
    public C38080Gp9 A0P;
    public C140436Wx A0Q;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public float A0V;
    public float A0W;
    public float A0X;
    public int A0a;
    public RectF A0b;
    public RectF A0c;
    public View A0d;
    public View A0e;
    public C138246Of A0f;
    public C138376Ot A0g;
    public C38080Gp9 A0h;
    public C140436Wx A0i;
    public boolean A0j;
    public final int A0k;
    public final Activity A0l;
    public final Context A0m;
    public final View A0n;
    public final ViewGroup A0o;
    public final ViewGroup A0p;
    public final ViewGroup A0q;
    public final C65726Tt0 A0r;
    public final C55982hj A0s;
    public final InterfaceC62872tQ A0t;
    public final UserSession A0u;
    public final ReelAvatarWithBadgeView A0v;
    public final User A0w;
    public final String A0x;
    public final int A0y;
    public final int A0z;
    public final int A10;
    public final Resources A11;
    public final C69583As A12;
    public Integer A0R = C05F.A0j;
    public ReelViewerConfig A0F = ReelViewerConfig.A00();
    public float A0Y = 1.0f;
    public int A0Z = -1;

    public final void A0U(RectF rectF, RectF rectF2, InterfaceC11380iw interfaceC11380iw, Reel reel, C3G2 c3g2, InterfaceC140686Xw interfaceC140686Xw, int i) {
        A0W(rectF, rectF2, interfaceC11380iw, reel, c3g2, interfaceC140686Xw, null, null, Collections.emptySet(), 0.0f, i, false);
    }

    @Override // X.InterfaceC55932he
    public final void Dnl(C55982hj c55982hj) {
    }

    static {
        C18B c18b = new C18B();
        c18b.A03(64);
        c18b.A01();
        A13 = c18b.A00();
    }

    private View A00() {
        if (this.A0e == null) {
            ViewGroup A00 = C55162OdQ.A00(this.A0l, this.A0q, null, this.A0u, null, InterfaceC145396gy.A01);
            this.A0e = A00;
            A00.setBackgroundColor(-16777216);
        }
        return this.A0e;
    }

    private View A01() {
        if (this.A0d == null) {
            ViewGroup A00 = C55162OdQ.A00(this.A0l, this.A0q, null, this.A0u, null, InterfaceC145396gy.A01);
            this.A0d = A00;
            Context context = this.A0m;
            A00.setBackgroundColor(context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_text_on_white)));
        }
        return this.A0d;
    }

    private View A02() {
        Reel reel = this.A0D;
        if (reel != null) {
            if (reel.A0c()) {
                return A01();
            }
            if (reel.CdW()) {
                View view = this.A09;
                if (view != null) {
                    return view;
                }
                ViewGroup A00 = C6TR.A00(this.A0q, null, this.A0u, null, this.A0G);
                this.A09 = A00;
                return A00;
            }
            if (reel.A0m()) {
                View view2 = this.A06;
                if (view2 != null) {
                    return view2;
                }
                ViewGroup A002 = C6S6.A00(this.A0q, null, this.A0u, null);
                this.A06 = A002;
                return A002;
            }
        }
        View view3 = this.A07;
        if (view3 != null) {
            return view3;
        }
        ViewGroup A003 = C143546dt.A00(this.A0l, this.A0q, null, this.A0u, null, this.A0G, C05F.A00);
        this.A07 = A003;
        return A003;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0019, code lost:
    
        if (android.text.TextUtils.isEmpty(r0) == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.view.View A03() {
        /*
            r3 = this;
            com.instagram.model.reels.Reel r2 = r3.A0D
            r1 = 0
            if (r2 == 0) goto L5a
            boolean r0 = r2.A0d()
            if (r0 == 0) goto L29
            X.4pt r0 = r2.A0H
            if (r0 == 0) goto L1c
            java.lang.String r0 = r0.A0Y
            if (r0 != 0) goto L15
            java.lang.String r0 = ""
        L15:
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L1c
        L1b:
            return r1
        L1c:
            X.6Ot r0 = r3.A09()
            if (r0 == 0) goto L1b
            X.6Ot r0 = r3.A09()
            android.view.View r1 = r0.A0S
            return r1
        L29:
            boolean r0 = r2.A0c()
            if (r0 == 0) goto L45
            X.6Of r0 = r3.A07()
            if (r0 == 0) goto L1b
            X.6Of r0 = r3.A07()
            X.0do r0 = r0.A0D
            java.lang.Object r1 = r0.getValue()
            X.C14360o3.A07(r1)
            android.view.View r1 = (android.view.View) r1
            return r1
        L45:
            boolean r0 = r2.CdW()
            if (r0 == 0) goto L5a
            X.6Wx r0 = r3.A0D()
            if (r0 == 0) goto L1b
            X.6Wx r0 = r3.A0D()
            X.6Tl r0 = r0.A0Y
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r0.A0F
            return r1
        L5a:
            X.6du r0 = r3.A0M
            if (r0 == 0) goto L1b
            com.instagram.reels.ui.views.reelavatar.view.ReelAvatarWithBadgeView r1 = r0.A1V
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3M4.A03():android.view.View");
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, X.6gw] */
    public static View A04(C3M4 c3m4) {
        Reel reel = c3m4.A0D;
        if (reel != null) {
            if (reel.A0d()) {
                c3m4.A0K();
                if (c3m4.A03 == null) {
                    ViewGroup A00 = AbstractC50547MTc.A00(c3m4.A0q, null, c3m4.A0u, null, new Object());
                    c3m4.A03 = A00;
                    A00.setBackgroundColor(-16777216);
                }
                return c3m4.A03;
            }
            if (reel.A0c()) {
                return c3m4.A00();
            }
            if (reel.CdW()) {
                if (c3m4.A08 == null) {
                    ViewGroup A002 = C6TR.A00(c3m4.A0q, null, c3m4.A0u, null, c3m4.A0G);
                    c3m4.A08 = A002;
                    A002.setBackgroundColor(-16777216);
                }
                return c3m4.A08;
            }
            if (reel.A0m()) {
                if (c3m4.A05 == null) {
                    ViewGroup A003 = C6S6.A00(c3m4.A0q, null, c3m4.A0u, null);
                    c3m4.A05 = A003;
                    A003.setBackgroundColor(-16777216);
                }
                return c3m4.A05;
            }
            if (reel.A1W || AbstractC34287FAh.A00(c3m4.A0u, reel)) {
                View view = c3m4.A0A;
                if (view != null) {
                    return view;
                }
                ViewGroup A004 = AbstractC54895OPq.A00(c3m4.A0q, c3m4.A0u);
                c3m4.A0A = A004;
                return A004;
            }
        }
        if (c3m4.A04 == null) {
            ViewGroup A005 = C143546dt.A00(c3m4.A0l, c3m4.A0q, null, c3m4.A0u, null, c3m4.A0G, C05F.A00);
            c3m4.A04 = A005;
            c3m4.A0M = (C143556du) A005.getTag();
        }
        return c3m4.A04;
    }

    private C138246Of A07() {
        C138246Of c138246Of = this.A0f;
        if (c138246Of == null) {
            C138246Of c138246Of2 = (C138246Of) A00().getTag();
            this.A0f = c138246Of2;
            return c138246Of2;
        }
        return c138246Of;
    }

    private C138246Of A08() {
        C138246Of c138246Of = this.A0L;
        if (c138246Of == null) {
            C138246Of c138246Of2 = (C138246Of) A01().getTag();
            this.A0L = c138246Of2;
            return c138246Of2;
        }
        return c138246Of;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, X.6gw] */
    private C138376Ot A09() {
        C138376Ot c138376Ot = this.A0g;
        if (c138376Ot == null) {
            A0K();
            if (this.A03 == null) {
                ViewGroup A00 = AbstractC50547MTc.A00(this.A0q, null, this.A0u, null, new Object());
                this.A03 = A00;
                A00.setBackgroundColor(-16777216);
            }
            C138376Ot c138376Ot2 = (C138376Ot) this.A03.getTag();
            this.A0g = c138376Ot2;
            return c138376Ot2;
        }
        return c138376Ot;
    }

    private C143556du A0A() {
        C143556du c143556du = this.A0N;
        if (c143556du == null) {
            View view = this.A07;
            if (view == null) {
                view = C143546dt.A00(this.A0l, this.A0q, null, this.A0u, null, this.A0G, C05F.A00);
                this.A07 = view;
            }
            C143556du c143556du2 = (C143556du) view.getTag();
            this.A0N = c143556du2;
            return c143556du2;
        }
        return c143556du;
    }

    private C38080Gp9 A0B() {
        C38080Gp9 c38080Gp9 = this.A0h;
        if (c38080Gp9 == null) {
            if (this.A05 == null) {
                ViewGroup A00 = C6S6.A00(this.A0q, null, this.A0u, null);
                this.A05 = A00;
                A00.setBackgroundColor(-16777216);
            }
            C38080Gp9 c38080Gp92 = (C38080Gp9) this.A05.getTag();
            this.A0h = c38080Gp92;
            return c38080Gp92;
        }
        return c38080Gp9;
    }

    private C38080Gp9 A0C() {
        C38080Gp9 c38080Gp9 = this.A0P;
        if (c38080Gp9 == null) {
            View view = this.A06;
            if (view == null) {
                view = C6S6.A00(this.A0q, null, this.A0u, null);
                this.A06 = view;
            }
            C38080Gp9 c38080Gp92 = (C38080Gp9) view.getTag();
            this.A0P = c38080Gp92;
            return c38080Gp92;
        }
        return c38080Gp9;
    }

    private C140436Wx A0D() {
        C140436Wx c140436Wx = this.A0i;
        if (c140436Wx == null) {
            if (this.A08 == null) {
                ViewGroup A00 = C6TR.A00(this.A0q, null, this.A0u, null, this.A0G);
                this.A08 = A00;
                A00.setBackgroundColor(-16777216);
            }
            C140436Wx c140436Wx2 = (C140436Wx) this.A08.getTag();
            this.A0i = c140436Wx2;
            return c140436Wx2;
        }
        return c140436Wx;
    }

    private C140436Wx A0E() {
        C140436Wx c140436Wx = this.A0Q;
        if (c140436Wx == null) {
            View view = this.A09;
            if (view == null) {
                view = C6TR.A00(this.A0q, null, this.A0u, null, this.A0G);
                this.A09 = view;
            }
            C140436Wx c140436Wx2 = (C140436Wx) view.getTag();
            this.A0Q = c140436Wx2;
            return c140436Wx2;
        }
        return c140436Wx;
    }

    private void A0F() {
        View view = this.A0d;
        if (view != null) {
            view.setVisibility(8);
            view.setLayerType(0, null);
        }
        View view2 = this.A07;
        if (view2 != null) {
            view2.setVisibility(8);
            view2.setLayerType(0, null);
        }
        View view3 = this.A09;
        if (view3 != null) {
            view3.setVisibility(8);
            view3.setLayerType(0, null);
        }
        View view4 = this.A06;
        if (view4 != null) {
            view4.setVisibility(8);
            view4.setLayerType(0, null);
        }
    }

    private void A0G() {
        View view;
        if (C18U.A06(C06090Tz.A05, this.A0u, 36327271476836821L)) {
            View findViewById = A04(this).findViewById(R.id.reel_view_group);
            if (findViewById != null) {
                findViewById.setBackgroundColor(0);
            }
            C143556du c143556du = this.A0M;
            if (c143556du != null) {
                InterfaceC56392iX interfaceC56392iX = c143556du.A10;
                if (interfaceC56392iX.CWW() && (view = interfaceC56392iX.getView()) != null) {
                    view.setBackgroundColor(0);
                }
            }
        }
    }

    private void A0H() {
        String str;
        C3G2 c3g2;
        View view;
        if (this.A0R == C05F.A00) {
            this.A0R = C05F.A01;
            String str2 = null;
            A04(this).setLayerType(0, null);
            this.A0v.setLayerType(0, null);
            this.A0o.setLayerType(0, null);
            this.A0n.setLayerType(0, null);
            if (C18U.A06(C06090Tz.A05, this.A0u, 36327271476640211L)) {
                C65726Tt0 c65726Tt0 = this.A0r;
                ArrayList arrayList = c65726Tt0.A0A;
                int indexOf = arrayList.indexOf(this);
                if (indexOf >= 0) {
                    arrayList.set(indexOf, null);
                }
                ArrayList arrayList2 = c65726Tt0.A0B;
                int indexOf2 = arrayList2.indexOf(this);
                if (indexOf2 >= 0) {
                    arrayList2.set(indexOf2, null);
                }
                super.A00 = 0.0f;
            } else {
                C55982hj c55982hj = this.A0s;
                c55982hj.A0B(this);
                c55982hj.A08(0.0d, true);
            }
            InterfaceC140686Xw interfaceC140686Xw = this.A0J;
            if (interfaceC140686Xw != null) {
                Reel reel = this.A0D;
                if (reel != null) {
                    str2 = reel.getId();
                }
                interfaceC140686Xw.DhL(str2);
            }
            C143556du c143556du = this.A0M;
            if (c143556du != null && (view = c143556du.A1e.A11) != null) {
                view.setVisibility(0);
            }
        }
        if (this.A0R == C05F.A0Y) {
            boolean z = false;
            A04(this).setLayerType(0, null);
            this.A0v.setLayerType(0, null);
            this.A0o.setLayerType(0, null);
            this.A0n.setLayerType(0, null);
            InterfaceC58124Ppn interfaceC58124Ppn = this.A0I;
            if (interfaceC58124Ppn != null) {
                if (this.A0S && (c3g2 = this.A0G) != null && c3g2 == C3G2.A1L) {
                    z = true;
                }
                C41181vS c41181vS = this.A0E;
                if (c41181vS != null) {
                    str = c41181vS.A0k;
                } else {
                    str = null;
                }
                interfaceC58124Ppn.DKY(z, str);
                this.A0I = null;
            }
            A0J();
            A0F();
            C138246Of c138246Of = this.A0L;
            if (c138246Of != null) {
                c138246Of.A01();
            }
            C143556du c143556du2 = this.A0N;
            if (c143556du2 != null) {
                c143556du2.A00();
            }
            C140436Wx c140436Wx = this.A0Q;
            if (c140436Wx != null) {
                c140436Wx.A05();
            }
            C38080Gp9 c38080Gp9 = this.A0P;
            if (c38080Gp9 != null) {
                c38080Gp9.A06 = null;
                c38080Gp9.A08 = null;
                c38080Gp9.A0a.setProgress(0.0f);
                c38080Gp9.A07 = null;
            }
            ViewGroup viewGroup = this.A0q;
            viewGroup.setVisibility(8);
            this.A0p.removeView(viewGroup);
            this.A0R = C05F.A0j;
        }
    }

    private void A0J() {
        Reel reel = this.A0D;
        if (reel != null && reel.A0d() && A09() != null) {
            C138376Ot A09 = A09();
            A09.A02 = null;
            A09.A04 = null;
            A09.A03 = null;
            A09.A0b.getIgImageView().A09();
            A09.A0X.A09();
            return;
        }
        Reel reel2 = this.A0D;
        if (reel2 != null && reel2.A0c() && A07() != null) {
            A07().A01();
            return;
        }
        Reel reel3 = this.A0D;
        if (reel3 != null && reel3.CdW() && A0D() != null) {
            A0D().A05();
            return;
        }
        Reel reel4 = this.A0D;
        if (reel4 != null && reel4.A0m() && A0B() != null) {
            C38080Gp9 A0B = A0B();
            A0B.A06 = null;
            A0B.A08 = null;
            A0B.A0a.setProgress(0.0f);
            A0B.A07 = null;
            return;
        }
        C143556du c143556du = this.A0M;
        if (c143556du == null) {
            return;
        }
        c143556du.A00();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
    
        if (r0.size() <= 0) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0K() {
        /*
            r5 = this;
            android.content.res.Resources r2 = r5.A11
            r0 = 2131165193(0x7f070009, float:1.7944596E38)
            int r1 = r2.getDimensionPixelSize(r0)
            int r0 = r5.A0y
            int r1 = r1 - r0
            int r1 = r1 / 2
            r0 = 2131165190(0x7f070006, float:1.794459E38)
            int r0 = r2.getDimensionPixelSize(r0)
            int r1 = r1 + r0
            r5.A00 = r1
            com.instagram.model.reels.Reel r1 = r5.A0D
            if (r1 == 0) goto L31
            boolean r0 = r1.A0d()
            if (r0 == 0) goto L31
            X.4pt r0 = r1.A0H
            if (r0 == 0) goto L31
            java.util.Set r0 = r0.A0n
            if (r0 == 0) goto L31
            int r0 = r0.size()
            r1 = 1
            if (r0 > 0) goto L32
        L31:
            r1 = 0
        L32:
            int r4 = r5.A00
            android.content.Context r3 = r5.A0m
            r0 = 0
            X.C14360o3.A0B(r3, r0)
            if (r1 == 0) goto L61
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131165207(0x7f070017, float:1.7944625E38)
            int r0 = r1.getDimensionPixelSize(r0)
            int r1 = r0 * 2
        L49:
            int r2 = X.AbstractC13880nE.A09(r3)
            int r0 = X.AbstractC13880nE.A0A(r3)
            int r0 = r0 - r1
            float r1 = (float) r0
            r0 = 1058013184(0x3f100000, float:0.5625)
            float r1 = r1 / r0
            int r0 = (int) r1
            if (r0 <= r2) goto L5a
            r0 = r2
        L5a:
            int r2 = r2 - r0
            int r0 = r2 / 2
            int r4 = r4 + r0
            r5.A00 = r4
            return
        L61:
            r1 = 0
            goto L49
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3M4.A0K():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x01af, code lost:
    
        if (r0 != null) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0L(float r22) {
        /*
            Method dump skipped, instructions count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3M4.A0L(float):void");
    }

    private void A0N(RectF rectF, RectF rectF2, InterfaceC11380iw interfaceC11380iw, InterfaceC58124Ppn interfaceC58124Ppn) {
        int A02 = AbstractC84863qa.A02(this.A0m);
        this.A0a = A02;
        this.A01 = rectF;
        float f = A02;
        float width = this.A0p.getWidth();
        if (rectF2 == null) {
            rectF2 = new RectF(0.0f, f, width, 2.0f * f);
        }
        this.A02 = rectF2;
        this.A0I = interfaceC58124Ppn;
        if (rectF != null) {
            rectF.height();
        }
        A0O(interfaceC11380iw, null);
        this.A0R = C05F.A0Y;
        this.A0q.setVisibility(0);
        A04(this).setVisibility(0);
        A04(this).setAlpha(1.0f);
        if (A0R(this.A0D, this.A0G)) {
            A02().setVisibility(0);
            A02().setLayerType(2, null);
            A02().setAlpha(0.0f);
        }
        View view = this.A0n;
        view.setVisibility(8);
        view.setAlpha(1.0f);
        ReelAvatarWithBadgeView reelAvatarWithBadgeView = this.A0v;
        int i = 4;
        if (rectF != null) {
            i = 0;
        }
        reelAvatarWithBadgeView.setVisibility(i);
        this.A0o.setVisibility(4);
        if (C18U.A06(C06090Tz.A05, this.A0u, 36327271476640211L)) {
            A0L(1.0f);
            super.A00 = 1.0f;
            A0I();
            C65726Tt0 c65726Tt0 = this.A0r;
            c65726Tt0.A05(this);
            c65726Tt0.A06(this);
            c65726Tt0.A09(0.0f);
            return;
        }
        C55982hj c55982hj = this.A0s;
        c55982hj.A0B(this);
        A0L(1.0f);
        c55982hj.A06 = true;
        c55982hj.A08(1.0d, true);
        c55982hj.A0A(this);
        c55982hj.A07(0.0d);
        c55982hj.A06(0.0d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0101, code lost:
    
        if (r53 != false) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A0P(X.InterfaceC11380iw r48, X.C41181vS r49, X.C41551w4 r50, float r51, int r52, boolean r53) {
        /*
            Method dump skipped, instructions count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3M4.A0P(X.0iw, X.1vS, X.1w4, float, int, boolean):void");
    }

    public static void A0Q(InterfaceC11380iw interfaceC11380iw, InterfaceC58124Ppn interfaceC58124Ppn, C3M4 c3m4, InterfaceC72953Ov interfaceC72953Ov) {
        InterfaceC58124Ppn interfaceC58124Ppn2;
        RectF rectF;
        c3m4.A0K = interfaceC72953Ov;
        RectF rectF2 = null;
        if (interfaceC72953Ov != null) {
            rectF2 = interfaceC72953Ov.Ahl();
            rectF = new RectF(rectF2);
            rectF.inset(rectF.width() / 2.0f, rectF.height() / 2.0f);
            c3m4.A0K.CMM();
            interfaceC58124Ppn2 = new P8Y(interfaceC11380iw, interfaceC58124Ppn, c3m4);
        } else {
            interfaceC58124Ppn2 = interfaceC58124Ppn;
            rectF = null;
        }
        c3m4.A0N(rectF2, rectF, interfaceC11380iw, interfaceC58124Ppn2);
    }

    private boolean A0R(Reel reel, C3G2 c3g2) {
        if (reel != null && !reel.A15(this.A0u) && !reel.A0d() && c3g2 == C3G2.A1G) {
            return true;
        }
        return false;
    }

    public final void A0S() {
        Reel reel;
        Integer num = this.A0R;
        Integer num2 = C05F.A0C;
        if (num != num2) {
            A0J();
            A04(this).setAlpha(0.0f);
            this.A0n.setAlpha(0.0f);
            this.A0p.removeView(this.A0q);
            if (this.A0J != null) {
                this.A0J = null;
            }
            this.A0R = num2;
            C3G2 c3g2 = this.A0G;
            if (c3g2 != null) {
                UserSession userSession = this.A0u;
                if ((AbstractC145026gN.A01(userSession, c3g2) || ((reel = this.A0D) != null && reel.A0g())) && this.A0F.A0F) {
                    AbstractC145016gM.A04(this.A0l, userSession, !AbstractC13440mV.A07());
                }
            }
            C69593At c69593At = this.A12.A01;
            c69593At.A01.A05();
            C69613Av c69613Av = c69593At.A05;
            c69613Av.A08(null);
            if (c69593At.A00) {
                c69613Av.A05();
            }
        }
    }

    public final void A0T() {
        Integer num = this.A0R;
        Integer num2 = C05F.A00;
        if (num == num2 || A0a()) {
            A04(this).setLayerType(0, null);
            this.A0v.setLayerType(0, null);
            this.A0o.setLayerType(0, null);
            this.A0n.setLayerType(0, null);
            UserSession userSession = this.A0u;
            if (C18U.A06(C06090Tz.A05, userSession, 36327271476640211L)) {
                C65726Tt0 c65726Tt0 = this.A0r;
                ArrayList arrayList = c65726Tt0.A0B;
                int indexOf = arrayList.indexOf(this);
                if (indexOf >= 0) {
                    arrayList.set(indexOf, null);
                }
                ArrayList arrayList2 = c65726Tt0.A0A;
                int indexOf2 = arrayList2.indexOf(this);
                if (indexOf2 >= 0) {
                    arrayList2.set(indexOf2, null);
                }
                super.A00 = 0.0f;
            } else {
                C55982hj c55982hj = this.A0s;
                c55982hj.A0B(this);
                c55982hj.A08(0.0d, true);
            }
            A04(this).setAlpha(0.0f);
            A0F();
            this.A0p.removeView(this.A0q);
            InterfaceC140686Xw interfaceC140686Xw = this.A0J;
            if (interfaceC140686Xw != null && this.A0R == num2) {
                interfaceC140686Xw.onCancel();
            }
            this.A0J = null;
            AbstractC145016gM.A04(this.A0l, userSession, !AbstractC13440mV.A07());
        }
    }

    public final void A0X(RectF rectF, RectF rectF2, InterfaceC11380iw interfaceC11380iw, InterfaceC58124Ppn interfaceC58124Ppn) {
        this.A0H = interfaceC58124Ppn;
        A0N(rectF, rectF2, interfaceC11380iw, interfaceC58124Ppn);
    }

    public final void A0Y(InterfaceC11380iw interfaceC11380iw) {
        A0X(this.A01, this.A02, interfaceC11380iw, new P8W(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0254, code lost:
    
        if (X.AbstractC50102Ry.A00(r29.A0w, r9.CDj()) == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
    
        if (A0R(r9, r34) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0Z(X.InterfaceC11380iw r30, com.instagram.model.reels.Reel r31, X.C41181vS r32, X.C41551w4 r33, X.C3G2 r34, float r35, float r36, float r37, int r38, boolean r39, boolean r40) {
        /*
            Method dump skipped, instructions count: 677
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3M4.A0Z(X.0iw, com.instagram.model.reels.Reel, X.1vS, X.1w4, X.3G2, float, float, float, int, boolean, boolean):void");
    }

    public final boolean A0a() {
        if (this.A0R != C05F.A0N) {
            return false;
        }
        return true;
    }

    public final boolean A0b() {
        Integer num = this.A0R;
        if (num != C05F.A0C && num != C05F.A0j) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC55932he
    public final void Dnm(C55982hj c55982hj) {
        C13080lu A00 = AbstractC13090lv.A00("ReelViewerAnimator.onSpringUpdate");
        try {
            A0L((float) c55982hj.A09.A00);
            A00.close();
        } catch (Throwable th) {
            try {
                A00.close();
                throw th;
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v24, types: [X.2tQ, java.lang.Object, X.YER] */
    /* JADX WARN: Type inference failed for: r2v4, types: [X.Tt0, X.Tsp] */
    public C3M4(Activity activity, ViewGroup viewGroup, UserSession userSession, String str) {
        this.A0l = activity;
        this.A0x = str;
        Context context = viewGroup.getContext();
        this.A0m = context;
        this.A0u = userSession;
        this.A0w = C17060sy.A01.A01(userSession);
        InterfaceC09390do interfaceC09390do = C50802Vb.A0D;
        ViewGroup viewGroup2 = (ViewGroup) C50802Vb.A00(LayoutInflater.from(context), null, viewGroup, R.layout.layout_reel_viewer_animator, 0, false, false);
        this.A0q = viewGroup2;
        Resources resources = context.getResources();
        this.A11 = resources;
        this.A0z = resources.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
        this.A10 = resources.getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
        this.A0k = resources.getDimensionPixelSize(R.dimen.abc_dialog_padding_top_material);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(R.style.Avatar_IgLiveComment, new int[]{android.R.attr.layout_height});
        this.A0y = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.A12 = AbstractC69573Ar.A00(userSession);
        obtainStyledAttributes.recycle();
        A0K();
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout_reel_shadow_gradient, viewGroup, false);
        this.A0n = inflate;
        viewGroup2.addView(inflate);
        viewGroup2.bringChildToFront(inflate);
        ReelAvatarWithBadgeView reelAvatarWithBadgeView = (ReelAvatarWithBadgeView) viewGroup2.requireViewById(R.id.animated_profile_picture);
        this.A0v = reelAvatarWithBadgeView;
        reelAvatarWithBadgeView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.A0o = (ViewGroup) viewGroup2.requireViewById(R.id.animated_comment_bar);
        ?? obj = new Object();
        obj.A00 = userSession;
        this.A0t = obj;
        this.A0B = new C69433Ad();
        this.A0p = viewGroup;
        C55982hj A02 = AbstractC13560mi.A00().A02();
        A02.A09(AbstractC43599JQf.A00);
        this.A0s = A02;
        C06090Tz c06090Tz = C06090Tz.A05;
        float floatValue = Double.valueOf(C18U.A00(c06090Tz, userSession, 37171696406889005L)).floatValue();
        floatValue = floatValue <= 0.0f ? 1500.0f : floatValue;
        C65717Tsq c65717Tsq = new C65717Tsq();
        c65717Tsq.A01(Double.valueOf(C18U.A00(c06090Tz, userSession, 37171696406692396L)).floatValue());
        c65717Tsq.A02(floatValue);
        ?? abstractC65716Tsp = new AbstractC65716Tsp(this);
        abstractC65716Tsp.A01 = null;
        abstractC65716Tsp.A00 = Float.MAX_VALUE;
        abstractC65716Tsp.A02 = false;
        abstractC65716Tsp.A01 = c65717Tsq;
        abstractC65716Tsp.A01 = 0.0f;
        abstractC65716Tsp.A00 = 1.0f;
        abstractC65716Tsp.A02 = 0.01f;
        abstractC65716Tsp.A03(0.01f * 0.75f);
        this.A0r = abstractC65716Tsp;
    }

    public static C3M4 A05(Activity activity) {
        while (activity.getParent() != null) {
            activity = activity.getParent();
        }
        View findViewById = activity.findViewById(android.R.id.content);
        if (findViewById != null) {
            return (C3M4) findViewById.getTag(R.id.reel_viewer_animator);
        }
        return null;
    }

    public static C3M4 A06(Activity activity, ViewGroup viewGroup, UserSession userSession) {
        C3M4 c3m4 = (C3M4) viewGroup.getTag(R.id.reel_viewer_animator);
        if (c3m4 == null) {
            String obj = UUID.randomUUID().toString();
            C3M4 c3m42 = new C3M4(activity, viewGroup, userSession, obj);
            viewGroup.setTag(R.id.reel_viewer_animator, c3m42);
            A13.put(obj, c3m42);
            return c3m42;
        }
        return c3m4;
    }

    private void A0I() {
        View view;
        if (A03() != null) {
            View A03 = A03();
            int i = 0;
            if (this.A01 != null) {
                i = 4;
            }
            A03.setVisibility(i);
        }
        C143556du c143556du = this.A0M;
        if (c143556du != null && (view = c143556du.A1e.A11) != null) {
            view.setVisibility(0);
        }
    }

    private void A0M(float f, float f2, float f3, float f4) {
        View A04 = A04(this);
        A04.setScaleX(f);
        A04.setScaleY(f);
        A04.setTranslationX(f2);
        A04.setTranslationY(f3);
        A04.setAlpha(f4);
        View view = this.A0n;
        if (view.getVisibility() == 0) {
            view.setScaleX(f);
            view.setScaleY(f);
            view.setTranslationX(f2);
            view.setTranslationY(f3);
            view.setAlpha(1.0f);
        }
    }

    private void A0O(InterfaceC11380iw interfaceC11380iw, C41181vS c41181vS) {
        ImageUrl A07;
        C1NB c1nb;
        User CDj;
        if (A03() == null || (c41181vS != null && c41181vS.A1C())) {
            this.A0v.setVisibility(8);
            return;
        }
        RectF rectF = this.A01;
        ReelAvatarWithBadgeView reelAvatarWithBadgeView = this.A0v;
        if (rectF != null) {
            reelAvatarWithBadgeView.setLayoutParams(new FrameLayout.LayoutParams(Math.round(rectF.width()), Math.round(this.A01.height())));
            if (c41181vS != null) {
                Reel reel = this.A0D;
                if (reel != null && reel.A0g()) {
                    User user = c41181vS.A0i;
                    if (user != null) {
                        A07 = user.Bhu();
                    }
                } else if (c41181vS.A0B() == EnumC76383bi.A0C) {
                    A07 = new SimpleImageUrl("");
                    Reel reel2 = this.A0D;
                    if (reel2 != null && (c1nb = reel2.A0W) != null && (CDj = c1nb.CDj()) != null && CDj.A03.BYy() != null && this.A0D.A0W.CDj().A03.BYy().Bhz() != null) {
                        android.net.Uri A03 = AbstractC08820cl.A03(this.A0D.A0W.CDj().A03.BYy().Bhz());
                        C14360o3.A0B(A03, 0);
                        A07 = AbstractC81033jX.A00(A03, -1, -1);
                    }
                }
                reelAvatarWithBadgeView.A04(A07, interfaceC11380iw);
                reelAvatarWithBadgeView.setVisibility(0);
                return;
            }
            Reel reel3 = this.A0D;
            if (reel3 != null && !AbstractC34287FAh.A00(this.A0u, reel3) && this.A0D.A07() != null) {
                A07 = this.A0D.A07();
                reelAvatarWithBadgeView.A04(A07, interfaceC11380iw);
                reelAvatarWithBadgeView.setVisibility(0);
                return;
            }
        }
        reelAvatarWithBadgeView.setVisibility(4);
    }

    public final void A0V(RectF rectF, RectF rectF2, InterfaceC11380iw interfaceC11380iw, Reel reel, C3G2 c3g2, InterfaceC140686Xw interfaceC140686Xw, String str, List list, int i, boolean z) {
        A0W(rectF, rectF2, interfaceC11380iw, reel, c3g2, interfaceC140686Xw, str, list, Collections.emptySet(), 0.0f, i, z);
    }

    @Override // X.InterfaceC55932he
    public final void Dnj(C55982hj c55982hj) {
        A0I();
    }

    @Override // X.InterfaceC55932he
    public final void Dnk(C55982hj c55982hj) {
        A0H();
    }

    @Override // X.C3M7
    public final void Cwj(AbstractC65716Tsp abstractC65716Tsp, float f, float f2) {
        A0L(f);
    }

    @Override // X.C3M6
    public final void Cwa(AbstractC65716Tsp abstractC65716Tsp, float f, float f2, boolean z) {
        A0H();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004e, code lost:
    
        if (A0R(r29, r30) == false) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01bb A[Catch: all -> 0x0204, TryCatch #0 {all -> 0x0204, blocks: (B:3:0x0006, B:7:0x0012, B:8:0x001b, B:10:0x0047, B:12:0x0052, B:16:0x007f, B:17:0x008c, B:19:0x009c, B:20:0x00a6, B:23:0x00bf, B:25:0x00e8, B:27:0x00f9, B:28:0x0113, B:30:0x011e, B:31:0x0120, B:33:0x0124, B:34:0x0129, B:36:0x012d, B:38:0x0133, B:39:0x0135, B:41:0x0140, B:42:0x0149, B:44:0x0153, B:45:0x0156, B:47:0x0161, B:48:0x0174, B:50:0x0178, B:53:0x018e, B:55:0x01bb, B:56:0x01cb, B:60:0x01e3, B:62:0x01ee, B:63:0x01d4, B:66:0x0181, B:67:0x0189, B:68:0x00fd, B:70:0x010a, B:72:0x0089), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01ee A[Catch: all -> 0x0204, TRY_LEAVE, TryCatch #0 {all -> 0x0204, blocks: (B:3:0x0006, B:7:0x0012, B:8:0x001b, B:10:0x0047, B:12:0x0052, B:16:0x007f, B:17:0x008c, B:19:0x009c, B:20:0x00a6, B:23:0x00bf, B:25:0x00e8, B:27:0x00f9, B:28:0x0113, B:30:0x011e, B:31:0x0120, B:33:0x0124, B:34:0x0129, B:36:0x012d, B:38:0x0133, B:39:0x0135, B:41:0x0140, B:42:0x0149, B:44:0x0153, B:45:0x0156, B:47:0x0161, B:48:0x0174, B:50:0x0178, B:53:0x018e, B:55:0x01bb, B:56:0x01cb, B:60:0x01e3, B:62:0x01ee, B:63:0x01d4, B:66:0x0181, B:67:0x0189, B:68:0x00fd, B:70:0x010a, B:72:0x0089), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01d4 A[Catch: all -> 0x0204, TryCatch #0 {all -> 0x0204, blocks: (B:3:0x0006, B:7:0x0012, B:8:0x001b, B:10:0x0047, B:12:0x0052, B:16:0x007f, B:17:0x008c, B:19:0x009c, B:20:0x00a6, B:23:0x00bf, B:25:0x00e8, B:27:0x00f9, B:28:0x0113, B:30:0x011e, B:31:0x0120, B:33:0x0124, B:34:0x0129, B:36:0x012d, B:38:0x0133, B:39:0x0135, B:41:0x0140, B:42:0x0149, B:44:0x0153, B:45:0x0156, B:47:0x0161, B:48:0x0174, B:50:0x0178, B:53:0x018e, B:55:0x01bb, B:56:0x01cb, B:60:0x01e3, B:62:0x01ee, B:63:0x01d4, B:66:0x0181, B:67:0x0189, B:68:0x00fd, B:70:0x010a, B:72:0x0089), top: B:2:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0W(android.graphics.RectF r26, android.graphics.RectF r27, X.InterfaceC11380iw r28, com.instagram.model.reels.Reel r29, X.C3G2 r30, X.InterfaceC140686Xw r31, java.lang.String r32, java.util.List r33, java.util.Set r34, float r35, int r36, boolean r37) {
        /*
            Method dump skipped, instructions count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3M4.A0W(android.graphics.RectF, android.graphics.RectF, X.0iw, com.instagram.model.reels.Reel, X.3G2, X.6Xw, java.lang.String, java.util.List, java.util.Set, float, int, boolean):void");
    }
}
