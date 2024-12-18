package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.base.BoundedLinearLayout;

/* renamed from: X.77e, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1579477e extends C3OO implements C7QD, InterfaceC162347Ow, C7QE, InterfaceC1581778c, InterfaceC162937Re {
    public C47349Kvy A00;
    public FNT A01;
    public C1576776b A02;
    public FGC A03;
    public A7I A04;
    public C1577176f A05;
    public C158827Au A06;
    public C1577076e A07;
    public C1576976d A08;
    public C7QH A09;
    public final FrameLayout A0A;
    public final C57012jc A0B;
    public final C57012jc A0C;
    public final C57012jc A0D;
    public final C57012jc A0E;
    public final C57012jc A0F;
    public final C57012jc A0G;
    public final C57012jc A0H;
    public final BoundedLinearLayout A0I;
    public final ImageView A0J;

    public final C158827Au A00() {
        C158827Au c158827Au = this.A06;
        if (c158827Au == null) {
            C158827Au c158827Au2 = new C158827Au((ViewStub) this.A0G.A01().requireViewById(R.id.content_gating_stub));
            this.A06 = c158827Au2;
            return c158827Au2;
        }
        return c158827Au;
    }

    public final C1577076e A01() {
        C1577076e c1577076e = this.A07;
        if (c1577076e == null) {
            C1577076e c1577076e2 = new C1577076e(this.A0B.A01());
            this.A07 = c1577076e2;
            return c1577076e2;
        }
        return c1577076e;
    }

    public final C1576776b A02() {
        C1576776b c1576776b = this.A02;
        if (c1576776b == null) {
            C1576776b c1576776b2 = new C1576776b(this.A0D.A01());
            this.A02 = c1576776b2;
            return c1576776b2;
        }
        return c1576776b;
    }

    public final C1576976d A03() {
        C1576976d c1576976d = this.A08;
        if (c1576976d == null) {
            C1576976d c1576976d2 = new C1576976d(this.A0G.A01());
            this.A08 = c1576976d2;
            return c1576976d2;
        }
        return c1576976d;
    }

    @Override // X.InterfaceC162347Ow
    public final void AI4() {
        C1577176f c1577176f = this.A05;
        if (c1577176f != null) {
            c1577176f.AI4();
        }
    }

    @Override // X.InterfaceC1581778c
    public final ImageView Afy() {
        return this.A0J;
    }

    @Override // X.C7QD
    public final View BKF() {
        FrameLayout frameLayout = this.A0A;
        if (frameLayout == null) {
            return this.itemView;
        }
        return frameLayout;
    }

    @Override // X.InterfaceC162347Ow
    public final C74843Xy BLT() {
        C1577176f c1577176f = this.A05;
        if (c1577176f != null) {
            return c1577176f.A00.A08;
        }
        return C74843Xy.A02;
    }

    @Override // X.C7QE
    public final C7QH BYl() {
        return this.A09;
    }

    @Override // X.InterfaceC162347Ow
    public final C74843Xy C0D() {
        C1577176f c1577176f = this.A05;
        if (c1577176f != null) {
            return c1577176f.A00.A09;
        }
        return C74843Xy.A02;
    }

    @Override // X.InterfaceC162347Ow
    public final void Ctd(float f) {
        C1577176f c1577176f = this.A05;
        if (c1577176f != null) {
            c1577176f.Ctd(f);
        }
    }

    @Override // X.InterfaceC162347Ow
    public final void EJl() {
        C1577176f c1577176f = this.A05;
        if (c1577176f != null) {
            c1577176f.EJl();
        }
    }

    @Override // X.InterfaceC162347Ow
    public final void Ec3(C74843Xy c74843Xy) {
        C1577176f c1577176f = this.A05;
        if (c1577176f != null) {
            c1577176f.Ec3(c74843Xy);
        }
    }

    @Override // X.InterfaceC162937Re
    public final void F82(int i) {
        C1577076e c1577076e = this.A07;
        if (c1577076e != null && ((AbstractC1576876c) c1577076e).A00.getVisibility() == 0) {
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            this.A0A.getGlobalVisibleRect(rect);
            IgImageView igImageView = ((AbstractC1576876c) c1577076e).A00;
            igImageView.getGlobalVisibleRect(rect2);
            LKJ A00 = LKJ.A0C.A00(igImageView);
            int i2 = i + (rect2.top - rect.top);
            if (A00.A02) {
                C7MU.A00(A00.A07, i2);
            }
        }
    }

    @Override // X.InterfaceC162347Ow
    public final void FCi(C74843Xy c74843Xy, float f) {
        C1577176f c1577176f = this.A05;
        if (c1577176f != null) {
            c1577176f.FCi(c74843Xy, f);
        }
    }

    /* JADX WARN: Type inference failed for: r1v14, types: [X.2jc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15, types: [X.2jc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v16, types: [X.2jc, java.lang.Object] */
    public C1579477e(View view, boolean z) {
        super(view);
        C57012jc c57012jc;
        C57012jc c57012jc2;
        C57012jc c57012jc3;
        this.A0A = (FrameLayout) view.requireViewById(R.id.message_content_generic_xma_container);
        this.A0I = (BoundedLinearLayout) view.requireViewById(R.id.xma_bubble_container);
        if (z) {
            View requireViewById = view.requireViewById(R.id.header_container);
            ?? obj = new Object();
            obj.A00 = requireViewById;
            c57012jc = obj;
        } else {
            c57012jc = new C57012jc((ViewStub) view.requireViewById(R.id.header_stub));
        }
        this.A0D = c57012jc;
        if (z) {
            View requireViewById2 = view.requireViewById(R.id.media_container);
            ?? obj2 = new Object();
            obj2.A00 = requireViewById2;
            c57012jc2 = obj2;
        } else {
            c57012jc2 = new C57012jc((ViewStub) view.requireViewById(R.id.media_stub));
        }
        this.A0G = c57012jc2;
        this.A0H = new C57012jc((ViewStub) view.requireViewById(R.id.thumbnail_grid_stub));
        if (z) {
            View requireViewById3 = view.requireViewById(R.id.caption_container);
            ?? obj3 = new Object();
            obj3.A00 = requireViewById3;
            c57012jc3 = obj3;
        } else {
            c57012jc3 = new C57012jc((ViewStub) view.requireViewById(R.id.caption_stub));
        }
        this.A0B = c57012jc3;
        this.A0F = new C57012jc((ViewStub) view.requireViewById(R.id.iconic_entrypoints_world_info));
        this.A0E = new C57012jc((ViewStub) view.requireViewById(R.id.iconic_entrypoints_cta_button));
        this.A0C = new C57012jc((ViewStub) view.requireViewById(R.id.cta_list_stub));
        this.A0J = (ImageView) view.requireViewById(R.id.doubletap_heart);
        if (z) {
            A02();
            A03();
            A01();
        }
    }

    @Override // X.C7QE
    public final void EZu(C7QH c7qh) {
        this.A09 = c7qh;
    }
}
