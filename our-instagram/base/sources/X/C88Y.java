package X;

import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.common.util.gradient.BackgroundGradientColors;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.88Y, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C88Y {
    public final /* synthetic */ C88E A00;

    public final void A0A(Drawable drawable, C5GJ c5gj, C148276lx c148276lx) {
        A0B(drawable, c5gj, c148276lx, null, true, true);
    }

    public C88Y(C88E c88e) {
        this.A00 = c88e;
    }

    public static void A01(Drawable drawable, C88Y c88y, C23108AGw c23108AGw, boolean z) {
        c88y.A0C(drawable, new C8FC(c23108AGw), z);
    }

    public final Drawable A02() {
        ArrayList A0T = this.A00.A01.A03.A1t.A0T(Drawable.class);
        if (AnonymousClass483.A04(A0T)) {
            return null;
        }
        return (Drawable) A0T.get(0);
    }

    public final C199008r1 A03(C195868lW c195868lW, String str) {
        C199008r1 c199008r1;
        C8RZ c8rz = this.A00.A01.A01;
        C191038cz A08 = c8rz.A08();
        if (c195868lW != null) {
            c8rz.A0G.A0A(c195868lW.A0K, c195868lW.A08, c195868lW.A09, "front".equals(c195868lW.A0f));
            FragmentActivity fragmentActivity = c8rz.A07;
            UserSession userSession = c8rz.A08;
            AnonymousClass840 anonymousClass840 = c8rz.A0F;
            InterfaceC1812882f interfaceC1812882f = ((NineSixteenLayoutConfigImpl) c8rz.A0E).A0K;
            int width = interfaceC1812882f.getWidth();
            int height = interfaceC1812882f.getHeight();
            C8r2 A00 = c8rz.A0D.A00();
            C55U A01 = C8RZ.A01(c8rz);
            String str2 = c8rz.A0J;
            C14360o3.A0B(anonymousClass840, 2);
            C14360o3.A0B(A01, 7);
            C198918qr c198918qr = C198908qq.A01;
            C1816783z c1816783z = anonymousClass840.A02;
            c199008r1 = new C199008r1(AbstractC198978qx.A00(fragmentActivity, null, userSession, A01, anonymousClass840, null, A08, c1816783z.A01.A02(), null, str2, width, height, true), null, A00, c198918qr.A00(c1816783z, A08.A01, false, false, false), true);
        } else {
            FragmentActivity fragmentActivity2 = c8rz.A07;
            UserSession userSession2 = c8rz.A08;
            AnonymousClass840 anonymousClass8402 = c8rz.A0F;
            InterfaceC1812882f interfaceC1812882f2 = ((NineSixteenLayoutConfigImpl) c8rz.A0E).A0K;
            int width2 = interfaceC1812882f2.getWidth();
            int height2 = interfaceC1812882f2.getHeight();
            C198998qz A0G = c8rz.A0A.A0G();
            C55U A012 = C8RZ.A01(c8rz);
            String str3 = c8rz.A0J;
            C14360o3.A0B(anonymousClass8402, 2);
            C14360o3.A0B(A012, 7);
            C198918qr c198918qr2 = C198908qq.A01;
            C1816783z c1816783z2 = anonymousClass8402.A02;
            c199008r1 = new C199008r1(AbstractC198978qx.A00(fragmentActivity2, null, userSession2, A012, anonymousClass8402, null, A08, c1816783z2.A01.A02(), null, str3, width2, height2, false), A0G, null, c198918qr2.A00(c1816783z2, A08.A01, false, false, false), true);
        }
        c8rz.A0L.put(str, C8RZ.A00(c8rz));
        c8rz.A0C(c199008r1, str);
        return c199008r1;
    }

    public final void A04() {
        C88R c88r = this.A00.A0F;
        c88r.A09.A03();
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = c88r.A04;
        touchInterceptorFrameLayout.getClass();
        touchInterceptorFrameLayout.setVisibility(0);
    }

    public final void A05() {
        C88E c88e = this.A00;
        if (c88e.A09()) {
            C88X A01 = c88e.A0H.A01();
            A01.getClass();
            if (c88e.A01(A01).A09()) {
                c88e.A0K.E4u(C8UR.A00);
            }
        }
    }

    public final void A06() {
        ((C8NW) this.A00.A01.A03.A1h.get()).A1Q(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
    
        if (r0 == null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A07() {
        /*
            r3 = this;
            X.88E r1 = r3.A00
            boolean r0 = r1.A09()
            if (r0 == 0) goto L29
            X.8TS r2 = r1.A01
            X.88M r0 = r1.A0H
            X.88X r0 = r0.A01()
            r0.getClass()
            X.ACt r1 = r1.A01(r0)
            boolean r0 = r1 instanceof X.C217999kX
            if (r0 == 0) goto L2a
            r1 = 1
        L1c:
            X.8Ct r0 = r2.A03
            X.6pc r0 = r0.A1h
            java.lang.Object r0 = r0.get()
            X.8NW r0 = (X.C8NW) r0
            r0.A1Q(r1)
        L29:
            return
        L2a:
            boolean r0 = r1 instanceof X.C218109ki
            if (r0 == 0) goto L3b
            X.9ki r1 = (X.C218109ki) r1
            com.instagram.user.model.User r0 = r1.A03
            if (r0 == 0) goto L39
            android.graphics.Bitmap r0 = r1.A01
            r1 = 1
            if (r0 != 0) goto L1c
        L39:
            r1 = 0
            goto L1c
        L3b:
            boolean r0 = r1 instanceof X.C218099kh
            if (r0 == 0) goto L48
            X.9kh r1 = (X.C218099kh) r1
            android.graphics.Bitmap r0 = r1.A00
            boolean r1 = X.AbstractC167007dF.A1W(r0)
            goto L1c
        L48:
            boolean r1 = r1.A09()
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C88Y.A07():void");
    }

    public final void A08(Drawable drawable) {
        if (drawable != null) {
            this.A00.A01.A03.A1t.A0Q(drawable);
        }
    }

    public final void A09(Drawable drawable) {
        C57012jc c57012jc = this.A00.A0F.A09.A05;
        c57012jc.getClass();
        View A01 = c57012jc.A01();
        A01.setBackground(drawable);
        View[] viewArr = {A01};
        C55942hf c55942hf = C150956qv.A02;
        AbstractC125325le.A04(null, viewArr, false);
    }

    public final void A0B(Drawable drawable, C5GJ c5gj, C148276lx c148276lx, C8FC c8fc, boolean z, boolean z2) {
        C88E c88e = this.A00;
        if (z2) {
            c88e.A01.A00();
        }
        if (drawable != null && c148276lx != null) {
            c88e.A01.A03.A0g(drawable, c5gj, c148276lx, c8fc, z);
        }
    }

    public final void A0C(Drawable drawable, C8FC c8fc, boolean z) {
        if (z) {
            this.A00.A01.A00();
        }
        C8TS c8ts = this.A00.A01;
        drawable.getClass();
        c8ts.A03.A0i(drawable, c8fc);
    }

    public final void A0D(C2UU c2uu, int i) {
        C88T c88t = this.A00.A0F.A09;
        boolean z = false;
        if (c2uu != null) {
            z = true;
        }
        c88t.A09 = z;
        C88T.A01(c88t);
        c88t.A00 = i;
        C57012jc c57012jc = c88t.A04;
        c57012jc.getClass();
        ((RecyclerView) c57012jc.A01()).setAdapter(c2uu);
    }

    public final void A0E(C88Z c88z, C38321qM c38321qM) {
        C1815783k c1815783k;
        C1815783k c1815783k2;
        C183688Ct c183688Ct = this.A00.A01.A03;
        int ordinal = c88z.ordinal();
        if (ordinal != 9) {
            if (ordinal == 19) {
                C1816783z c1816783z = c183688Ct.A15;
                UserSession userSession = c183688Ct.A0w;
                C14360o3.A0B(c1816783z, 0);
                C14360o3.A0B(userSession, 1);
                if (c38321qM == null) {
                    c1815783k2 = null;
                } else {
                    c1815783k2 = new C1815783k(userSession, c38321qM, null, false);
                }
                c1816783z.A01.A04 = c1815783k2;
                return;
            }
            return;
        }
        C1816783z c1816783z2 = c183688Ct.A15;
        UserSession userSession2 = c183688Ct.A0w;
        C14360o3.A0B(c1816783z2, 0);
        C14360o3.A0B(userSession2, 1);
        boolean z = true;
        if (c38321qM == null || !c38321qM.A63()) {
            z = false;
        }
        C1815483h c1815483h = c1816783z2.A01;
        c1815483h.A0K = z;
        if (c38321qM != null && c38321qM.A63()) {
            c1815783k = new C1815783k(userSession2, c38321qM, null, false);
        } else {
            c1815783k = null;
        }
        c1815483h.A04 = c1815783k;
        if (c38321qM == null) {
            return;
        }
        c1815483h.A08 = c38321qM;
    }

    public final void A0F(BackgroundGradientColors backgroundGradientColors) {
        C89E c89e = this.A00.A01.A07;
        C8LD A00 = c89e.A00();
        boolean z = false;
        if (backgroundGradientColors == null) {
            z = true;
        }
        AM2 am2 = A00.A0B;
        am2.getClass();
        am2.A05 = z;
        C8LD A002 = c89e.A00();
        if (A002.A0A != null) {
            AM2 am22 = A002.A0B;
            am22.getClass();
            am22.A04(backgroundGradientColors, A002.A0A.A07());
        }
    }

    public final void A0G(C191038cz c191038cz, List list) {
        C88E c88e = this.A00;
        if (c88e.A09()) {
            C88X A01 = c88e.A0H.A01();
            A01.getClass();
            if (c88e.A01(A01).A09()) {
                C8TS c8ts = c88e.A01;
                ArrayList arrayList = new ArrayList();
                c8ts.A07.A00().A0M(new C23904Ahx(c8ts, c191038cz, list, new ArrayList(), arrayList));
            }
        }
    }

    public final void A0H(CharSequence charSequence) {
        TextView textView = this.A00.A0F.A09.A02;
        textView.getClass();
        textView.setText(charSequence);
    }

    public final void A0I(CharSequence charSequence) {
        SearchEditText A00 = C88T.A00(this.A00.A0F.A09);
        A00.setText(charSequence);
        if (charSequence != null) {
            A00.setSelection(A00.getText().length());
        }
    }

    public final void A0J(String str) {
        this.A00.A0F.A09.A03.setText(str);
    }

    public final void A0K(String str, String str2) {
        C88T c88t = this.A00.A0F.A09;
        C88T.A00(c88t).setFilters(new InputFilter[0]);
        TextView textView = c88t.A02;
        textView.getClass();
        textView.setText(str);
        SearchEditText A00 = C88T.A00(c88t);
        A00.setText("");
        A00.setSelection(A00.getText().length());
        C88T.A00(c88t).setHint(str2);
        c88t.A03.setText((CharSequence) null);
    }

    public final boolean A0L(ACt aCt) {
        C88E c88e = this.A00;
        if (c88e.A09()) {
            C88X A01 = c88e.A0H.A01();
            A01.getClass();
            if (c88e.A01(A01).equals(aCt)) {
                return true;
            }
        }
        return false;
    }

    public static AA0 A00(C88Y c88y, C38321qM c38321qM) {
        String id = c38321qM.getId();
        id.getClass();
        return new AA0(c88y.A03(null, id), c38321qM.getId());
    }
}
