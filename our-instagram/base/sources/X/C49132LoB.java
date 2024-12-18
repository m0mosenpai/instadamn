package X;

import android.content.res.Resources;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.List;

/* renamed from: X.LoB, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49132LoB implements C7QC {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final C75Y A02;
    public final InterfaceC164977Zm A03;
    public final C7T8 A04;
    public final C7TY A05;
    public final C162907Rb A06;
    public final C7QB A07;
    public final boolean A08;

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r0 == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A04(android.view.View r6, X.InterfaceC56392iX r7, X.KTK r8, int r9) {
        /*
            r5 = this;
            r4 = 0
            r0 = 2
            if (r9 != r0) goto L20
            boolean r0 = X.LKY.A04(r8)
            if (r0 != 0) goto L20
            com.instagram.common.session.UserSession r3 = r5.A01
            boolean r0 = X.LKY.A03(r3, r8)
            if (r0 == 0) goto L20
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36330063205188244(0x81120000034294, double:3.038616488159011E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            r3 = 1
            if (r0 != 0) goto L21
        L20:
            r3 = 0
        L21:
            com.instagram.common.session.UserSession r0 = r5.A01
            boolean r2 = X.LC3.A01(r0)
            if (r2 == 0) goto L32
            if (r3 != 0) goto L32
            boolean r0 = r7.CWW()
            if (r0 != 0) goto L32
            return
        L32:
            android.view.View r1 = r7.getView()
            if (r2 != 0) goto L42
            r0 = 2131431696(0x7f0b1110, float:1.8485128E38)
            android.view.View r0 = r6.requireViewById(r0)
            X.AbstractC56372iV.A01(r0, r4, r4)
        L42:
            if (r3 != 0) goto L46
            r4 = 8
        L46:
            r1.setVisibility(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49132LoB.A04(android.view.View, X.2iX, X.KTK, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0009, code lost:
    
        if (X.LKY.A04(r9) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A05(android.view.View r7, X.InterfaceC56392iX r8, X.KTK r9, int r10) {
        /*
            r6 = this;
            r5 = 0
            r0 = 2
            if (r10 != r0) goto Lb
            boolean r0 = X.LKY.A04(r9)
            r4 = 1
            if (r0 != 0) goto Lc
        Lb:
            r4 = 0
        Lc:
            com.instagram.common.session.UserSession r0 = r6.A01
            boolean r1 = X.LC3.A01(r0)
            if (r1 == 0) goto L1d
            if (r4 != 0) goto L1d
            boolean r0 = r8.CWW()
            if (r0 != 0) goto L1d
            return
        L1d:
            android.view.View r3 = r8.getView()
            if (r1 != 0) goto L2d
            r0 = 2131431697(0x7f0b1111, float:1.848513E38)
            android.view.View r0 = r7.requireViewById(r0)
            X.AbstractC56372iV.A01(r0, r5, r5)
        L2d:
            android.content.res.Resources r2 = r3.getResources()
            boolean r1 = r6.A08
            r0 = 2131165250(0x7f070042, float:1.7944712E38)
            if (r1 == 0) goto L3b
            r0 = 2131165248(0x7f070040, float:1.7944708E38)
        L3b:
            int r0 = r2.getDimensionPixelSize(r0)
            X.AbstractC43592JPx.A1G(r3, r0)
            X.AbstractC43592JPx.A1F(r3, r0)
            if (r4 != 0) goto L49
            r5 = 8
        L49:
            r3.setVisibility(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49132LoB.A05(android.view.View, X.2iX, X.KTK, int):void");
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ C7QD ANU(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        UserSession userSession = this.A01;
        boolean A01 = LC3.A01(userSession);
        int i = R.layout.direct_multi_media_message_legacy_layout;
        if (A01) {
            i = R.layout.direct_multi_media_message;
        }
        C49164Loh c49164Loh = new C49164Loh(AbstractC31173DnH.A0C(layoutInflater, viewGroup, i, false), userSession);
        this.A06.A00(c49164Loh);
        return c49164Loh;
    }

    private final Size A00(View view, boolean z) {
        boolean z2 = this.A08;
        Resources resources = view.getResources();
        int i = R.dimen.direct_multi_media_message_fixed_height;
        if (z2) {
            i = R.dimen.audio_dubbing_gen_ai_gif_size;
        }
        int dimensionPixelSize = resources.getDimensionPixelSize(i);
        int i2 = (int) (dimensionPixelSize * 0.75f);
        if (z) {
            dimensionPixelSize = (int) (i2 * 0.75f);
        }
        Size size = new Size(i2, dimensionPixelSize);
        view.getLayoutParams().height = size.getHeight();
        view.getLayoutParams().width = size.getWidth();
        return size;
    }

    private final AnonymousClass791 A01(IgImageView igImageView) {
        C74843Xy c74843Xy = new C74843Xy();
        Resources resources = igImageView.getResources();
        boolean z = this.A08;
        int i = R.dimen.ab_test_media_thumbnail_preview_item_internal_padding;
        if (z) {
            i = R.dimen.abc_edit_text_inset_top_material;
        }
        float A04 = AbstractC166987dD.A04(resources, i);
        c74843Xy.A07(A04, A04, A04, A04);
        return AbstractC1580577p.A04(c74843Xy, igImageView);
    }

    private final void A02(View view, IgFrameLayout igFrameLayout, IgImageView igImageView, InterfaceC56392iX interfaceC56392iX, InterfaceC56392iX interfaceC56392iX2, InterfaceC56392iX interfaceC56392iX3, InterfaceC56392iX interfaceC56392iX4, C49164Loh c49164Loh, C7SZ c7sz, int i, int i2) {
        List list = c7sz.A04;
        KTK ktk = (KTK) list.get(i);
        boolean A07 = A07(ktk);
        int i3 = c7sz.A00;
        A05(igFrameLayout, interfaceC56392iX, ktk, i3);
        A04(igFrameLayout, interfaceC56392iX4, ktk, i3);
        Size A00 = A00(igFrameLayout, A07);
        float f = i2;
        float f2 = 0.65f;
        if (A07) {
            f2 = 0.8f;
        }
        AbstractC13880nE.A0f(igFrameLayout, (int) (f * f2));
        if (i == 0 || i == 2) {
            AbstractC13880nE.A0e(igFrameLayout, (int) (igFrameLayout.getLayoutParams().width * 0.35f));
        }
        float f3 = -4.0f;
        if (i % 2 == 0) {
            f3 = 4.0f;
        }
        igFrameLayout.setRotation(f3);
        C7QL c7ql = KTK.A01(list, 0).A0C;
        AnonymousClass791 A01 = A01(igImageView);
        C17050sx A002 = MHU.A00(igImageView, c7ql, 16);
        InterfaceC11380iw interfaceC11380iw = this.A00;
        UserSession userSession = this.A01;
        LKY.A01(A00, interfaceC11380iw, userSession, igImageView, A01, ktk, this.A03.Arw());
        LKY.A02(view, userSession, igImageView, A01, interfaceC56392iX2, ktk, c7sz, A002, LKY.A04(ktk));
        this.A04.A02(igImageView, AbstractC1580577p.A04((C74843Xy) A002.getValue(), igImageView), interfaceC56392iX3, AbstractC46820KnF.A00(userSession, ktk), c49164Loh, A002);
        igFrameLayout.setVisibility(0);
    }

    private final void A03(View view, IgFrameLayout igFrameLayout, IgImageView igImageView, InterfaceC56392iX interfaceC56392iX, InterfaceC56392iX interfaceC56392iX2, InterfaceC56392iX interfaceC56392iX3, InterfaceC56392iX interfaceC56392iX4, C49164Loh c49164Loh, C7SZ c7sz, int i, int i2) {
        List list = c7sz.A04;
        KTK ktk = (KTK) list.get(i);
        boolean A07 = A07(ktk);
        int i3 = c7sz.A00;
        A05(igFrameLayout, interfaceC56392iX, ktk, i3);
        A04(igFrameLayout, interfaceC56392iX4, ktk, i3);
        Size A00 = A00(igFrameLayout, A07);
        float f = i2;
        float f2 = 0.75f;
        if (A07) {
            f2 = 0.8f;
        }
        AbstractC13880nE.A0f(igFrameLayout, (int) (f * f2));
        if (i == 1) {
            AbstractC13880nE.A0e(igFrameLayout, (int) (igFrameLayout.getLayoutParams().width * 0.35f));
        }
        float f3 = 4.0f;
        if (i % 2 == 0) {
            f3 = -4.0f;
        }
        igFrameLayout.setRotation(f3);
        C7QL c7ql = KTK.A01(list, 0).A0C;
        AnonymousClass791 A01 = A01(igImageView);
        C17050sx A002 = MHU.A00(igImageView, c7ql, 17);
        InterfaceC11380iw interfaceC11380iw = this.A00;
        UserSession userSession = this.A01;
        LKY.A01(A00, interfaceC11380iw, userSession, igImageView, A01, ktk, this.A03.Arw());
        LKY.A02(view, userSession, igImageView, A01, interfaceC56392iX2, ktk, c7sz, A002, LKY.A04(ktk));
        this.A04.A02(igImageView, AbstractC1580577p.A04((C74843Xy) A002.getValue(), igImageView), interfaceC56392iX3, AbstractC46820KnF.A00(userSession, ktk), c49164Loh, A002);
        igFrameLayout.setVisibility(0);
    }

    public static final boolean A07(KTK ktk) {
        C7Q4 c7q4;
        Float f;
        float floatValue;
        AbstractC1583778x abstractC1583778x = ktk.A02.A0F;
        C158797Aq c158797Aq = ktk.A01;
        if (c158797Aq != null) {
            c7q4 = c158797Aq.A0F;
        } else {
            c7q4 = null;
        }
        if (c7q4 != null) {
            floatValue = c7q4.A01();
        } else if ((abstractC1583778x instanceof C158737Aj) && (f = ((C158737Aj) abstractC1583778x).A02) != null) {
            floatValue = f.floatValue();
        } else {
            return false;
        }
        if (floatValue > 1.0f) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ca, code lost:
    
        if (java.lang.Boolean.valueOf(r13) == null) goto L22;
     */
    @Override // X.C7QC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void ADy(X.C7QD r32, X.InterfaceC129555tK r33) {
        /*
            Method dump skipped, instructions count: 586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49132LoB.ADy(X.7QD, X.5tK):void");
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void F91(C7QD c7qd) {
        C49164Loh c49164Loh = (C49164Loh) c7qd;
        C14360o3.A0B(c49164Loh, 0);
        C47718L4z c47718L4z = c49164Loh.A03;
        A06(c47718L4z.A00, AbstractC43592JPx.A0V(c47718L4z.A07));
        C47718L4z c47718L4z2 = c49164Loh.A04;
        A06(c47718L4z2.A00, AbstractC43592JPx.A0V(c47718L4z2.A07));
        C47718L4z c47718L4z3 = c49164Loh.A05;
        A06(c47718L4z3.A00, AbstractC43592JPx.A0V(c47718L4z3.A07));
        this.A04.A03(c49164Loh);
        this.A06.A01(c49164Loh);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.7Ax, java.lang.Object] */
    public C49132LoB(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C75Y c75y, InterfaceC164977Zm interfaceC164977Zm, AnonymousClass988 anonymousClass988, C7TY c7ty, C7QB c7qb, boolean z) {
        this.A03 = interfaceC164977Zm;
        this.A00 = interfaceC11380iw;
        this.A01 = userSession;
        this.A02 = c75y;
        this.A07 = c7qb;
        this.A05 = c7ty;
        this.A08 = z;
        C7T8 c7t8 = new C7T8(userSession, new Object());
        this.A04 = c7t8;
        boolean z2 = anonymousClass988.A1U;
        C7AZ c7az = new C7AZ(z2);
        C49028LmG c49028LmG = new C49028LmG(interfaceC11380iw, userSession, (InterfaceC164987Zn) interfaceC164977Zm, c7t8);
        C158657Ab A00 = c7az.A00((InterfaceC165247aD) interfaceC164977Zm);
        C7Q9 c7q9 = new C7Q9((InterfaceC165307aJ) interfaceC164977Zm, z2);
        this.A06 = AbstractC43594JPz.A0b(new C1580177l(new C162897Ra((InterfaceC165207a9) interfaceC164977Zm), c49028LmG, A00, c7q9, (InterfaceC165507ad) interfaceC164977Zm, anonymousClass988, null, false), c7az);
    }

    public static final void A06(IgFrameLayout igFrameLayout, IgImageView igImageView) {
        igImageView.A09();
        igFrameLayout.getLayoutParams().height = 0;
        AbstractC43592JPx.A1G(igFrameLayout, 0);
        AbstractC13880nE.A0f(igFrameLayout, 0);
        AbstractC13880nE.A0e(igFrameLayout, 0);
        igFrameLayout.setRotation(0.0f);
    }
}
