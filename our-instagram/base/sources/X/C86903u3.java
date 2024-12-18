package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.common.session.UserSession;

/* renamed from: X.3u3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C86903u3 implements InterfaceC86813tt {
    public final Context A00;
    public final UserSession A01;
    public final C38321qM A02;
    public final C86103sh A03;
    public final C86883u1 A04;
    public final C75113Zb A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final InterfaceC60442pS A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;

    public C86903u3(Context context, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C86103sh c86103sh, C86883u1 c86883u1, C75113Zb c75113Zb, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        C38321qM c38321qM;
        C14360o3.A0B(c86103sh, 1);
        C14360o3.A0B(c86883u1, 2);
        this.A03 = c86103sh;
        this.A04 = c86883u1;
        this.A05 = c75113Zb;
        this.A0A = interfaceC60442pS;
        this.A01 = userSession;
        this.A00 = context;
        this.A0C = z;
        this.A0E = z2;
        this.A0B = z3;
        this.A06 = z4;
        this.A0D = z5;
        this.A08 = z6;
        this.A07 = z7;
        this.A09 = z8;
        if (z2) {
            c38321qM = AbstractC86593tX.A08(interfaceC60442pS, userSession);
        } else {
            c38321qM = null;
        }
        this.A02 = c38321qM;
    }

    public static final void A05(View view) {
        view.setAlpha(0.0f);
        view.setVisibility(0);
        view.animate().alpha(1.0f).setStartDelay(200L).setDuration(400L);
    }

    private final Drawable A00() {
        InterfaceC09390do interfaceC09390do;
        C86883u1 c86883u1 = this.A04;
        if (c86883u1.A04 || this.A05.A0o == AnonymousClass341.A0O) {
            return null;
        }
        if (this.A0D) {
            boolean z = this.A09;
            C86103sh c86103sh = this.A03;
            if (z) {
                interfaceC09390do = c86103sh.A0G;
            } else {
                interfaceC09390do = c86103sh.A0F;
            }
        } else {
            if (!c86883u1.A02 && !c86883u1.A03) {
                return null;
            }
            interfaceC09390do = this.A03.A0H;
        }
        return (Drawable) interfaceC09390do.getValue();
    }

    private final View A01() {
        C38321qM c38321qM = this.A02;
        C86103sh c86103sh = this.A03;
        if (c38321qM != null) {
            c86103sh.A01().setVisibility(8);
            InterfaceC56392iX interfaceC56392iX = c86103sh.A0B;
            if (interfaceC56392iX != null) {
                return interfaceC56392iX.getView();
            }
            throw new IllegalStateException("Required value was null.");
        }
        ViewGroup viewGroup = c86103sh.A04;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        return c86103sh.A01();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
    
        if (r6 != false) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:69:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A03() {
        /*
            Method dump skipped, instructions count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86903u3.A03():void");
    }

    private final boolean A06() {
        if (!this.A0E && this.A04.A02) {
            if (C18U.A06(C06090Tz.A05, this.A01, 36325334445995009L)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC86813tt
    public final void ABN() {
        View view;
        this.A05.A0g(true);
        C86103sh c86103sh = this.A03;
        View view2 = c86103sh.A0E.getView();
        View A01 = A01();
        View A00 = c86103sh.A00();
        if (this.A09) {
            TextView textView = c86103sh.A08;
            if (textView != null) {
                textView.setVisibility(8);
            }
            TextView textView2 = c86103sh.A05;
            if (textView2 != null) {
                textView2.setVisibility(8);
                InterfaceC56392iX interfaceC56392iX = c86103sh.A0D;
                if (interfaceC56392iX != null) {
                    view = interfaceC56392iX.getView();
                } else {
                    view = null;
                }
            } else {
                C14360o3.A0F("feedPreviewOverlayTextView");
                throw C00O.createAndThrow();
            }
        } else {
            InterfaceC56392iX interfaceC56392iX2 = c86103sh.A0D;
            if (interfaceC56392iX2 != null) {
                interfaceC56392iX2.setVisibility(8);
            }
            InterfaceC56392iX interfaceC56392iX3 = c86103sh.A0C;
            if (interfaceC56392iX3 != null) {
                interfaceC56392iX3.setVisibility(8);
            }
            view = c86103sh.A08;
        }
        TextView textView3 = c86103sh.A07;
        ViewGroup viewGroup = c86103sh.A03;
        ViewGroup viewGroup2 = c86103sh.A01;
        view2.setVisibility(0);
        A01.setVisibility(0);
        A05(A01);
        if (view != null) {
            if (this.A0C && !this.A0B) {
                A05(view);
            } else {
                view.setVisibility(8);
            }
        }
        if (textView3 != null) {
            if (this.A0B) {
                A05(textView3);
            } else {
                textView3.setVisibility(8);
            }
        }
        if (viewGroup != null) {
            if (A06()) {
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(8);
                }
                A05(viewGroup);
                A00.setAlpha(0.0f);
                A00.animate().alpha(1.0f).setDuration(400L);
                A03();
                A02();
            }
            viewGroup.setVisibility(8);
        }
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(0);
        }
        A00.setAlpha(0.0f);
        A00.animate().alpha(1.0f).setDuration(400L);
        A03();
        A02();
    }

    @Override // X.InterfaceC86813tt
    public final void Ekx() {
        this.A05.A0g(true);
        this.A03.A0E.setVisibility(0);
        A01().setVisibility(0);
        A03();
        A02();
    }

    @Override // X.InterfaceC86813tt
    public final void hide() {
        C86103sh c86103sh = this.A03;
        c86103sh.A02(this.A05);
        c86103sh.A0E.setVisibility(8);
    }

    private final void A02() {
        View view;
        InterfaceC56392iX interfaceC56392iX;
        ViewGroup viewGroup;
        boolean A06 = A06();
        C86103sh c86103sh = this.A03;
        ViewGroup A01 = c86103sh.A01();
        YGY ygy = new YGY(this);
        boolean z = this.A0D;
        A01.setOnTouchListener(new ATS(A01, ygy, z, A06, true));
        ViewGroup viewGroup2 = c86103sh.A04;
        if (viewGroup2 != null) {
            C3P9 c3p9 = new C3P9(viewGroup2);
            c3p9.A02 = 0.95f;
            c3p9.A04 = new XZH(this);
            c86103sh.A09 = c3p9.A00();
        }
        if (A06 && (viewGroup = c86103sh.A03) != null) {
            viewGroup.setOnTouchListener(new ATS(viewGroup, new YGZ(this), z, true, false));
        }
        View.OnClickListener y8i = new Y8I(this);
        View.OnClickListener y8h = new Y8H(this);
        View.OnClickListener y8g = new Y8G(this);
        if (this.A06) {
            y8h = y8g;
        } else {
            if (this.A08 || this.A09) {
                y8i = y8g;
            }
            if (this.A07) {
                y8h = y8g;
            }
            y8g = y8i;
        }
        if (!this.A09 ? (view = c86103sh.A08) != null : !((interfaceC56392iX = c86103sh.A0D) == null || (view = interfaceC56392iX.getView()) == null)) {
            C0fQ.A00(y8g, view);
        }
        C0fQ.A00(y8h, c86103sh.A00());
        TextView textView = c86103sh.A07;
        if (textView != null) {
            C0fQ.A00(new Y8F(this), textView);
        }
    }

    public static final void A04(Context context, Drawable drawable, TextView textView) {
        if (AbstractC13620mo.A02(context)) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        } else {
            textView.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }
}
