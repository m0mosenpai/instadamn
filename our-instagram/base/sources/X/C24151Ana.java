package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.creation.capture.quickcapture.storiestemplates.footer.PinnablesFooterHorizontalScrollView;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* renamed from: X.Ana, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24151Ana implements InterfaceC1829489p, C8BD {
    public AGD A00;
    public AnonymousClass195 A01;
    public final Activity A02;
    public final ColorDrawable A03;
    public final View A04;
    public final ConstraintLayout A05;
    public final C55982hj A06;
    public final C55982hj A07;
    public final AbstractC59962oe A08;
    public final C44358Jix A09;
    public final C44358Jix A0A;
    public final UserSession A0B;
    public final InterfaceC56392iX A0C;
    public final InterfaceC143326dX A0D;
    public final C8AD A0E;
    public final C1810281e A0F;
    public final C8FC A0G;
    public final InteractiveDrawableContainer A0H;
    public final InterfaceC09390do A0I;
    public final InterfaceC09390do A0J;
    public final InterfaceC09390do A0K;
    public final InterfaceC09390do A0L;
    public final InterfaceC09390do A0M;
    public final InterfaceC09390do A0N;
    public final InterfaceC09390do A0O;
    public final InterfaceC09390do A0P;
    public final InterfaceC09390do A0Q;

    public C24151Ana(Activity activity, View view, AbstractC59962oe abstractC59962oe, UserSession userSession, InterfaceC143326dX interfaceC143326dX, C8AD c8ad, C1810281e c1810281e, InteractiveDrawableContainer interactiveDrawableContainer, boolean z) {
        float f;
        float f2;
        int A06 = AbstractC167007dF.A06(1, activity, view);
        C14360o3.A0B(userSession, 3);
        C14360o3.A0B(abstractC59962oe, 4);
        AbstractC167017dG.A1U(c1810281e, interactiveDrawableContainer);
        C14360o3.A0B(c8ad, 9);
        this.A02 = activity;
        this.A0B = userSession;
        this.A08 = abstractC59962oe;
        this.A0D = interfaceC143326dX;
        this.A0F = c1810281e;
        this.A0H = interactiveDrawableContainer;
        this.A0E = c8ad;
        B8Q b8q = new B8Q(this, 48);
        B8Q b8q2 = new B8Q(abstractC59962oe, 41);
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        InterfaceC09390do A00 = AbstractC09440dt.A00(enumC09460dv, new B8Q(b8q2, 42));
        this.A0P = new C60842q8(new B8Q(A00, 43), b8q, new C57256Pbe(3, null, A00), new C0YZ(C183828Di.class));
        B8Q b8q3 = new B8Q(this, 49);
        InterfaceC09390do A002 = AbstractC09440dt.A00(enumC09460dv, new B8Q(new B8Q(abstractC59962oe, 44), 45));
        this.A0Q = new C60842q8(new B8Q(A002, 46), b8q3, new C57256Pbe(4, null, A002), new C0YZ(C9U3.class));
        B8Q b8q4 = new B8Q(this, 47);
        InterfaceC09390do A003 = AbstractC09440dt.A00(enumC09460dv, new B8Q(new B8Q(abstractC59962oe, 38), 39));
        this.A0O = new C60842q8(new B8Q(A003, 40), b8q4, new C57256Pbe(A06, null, A003), new C0YZ(C8OD.class));
        ColorDrawable colorDrawable = new ColorDrawable(interactiveDrawableContainer.getContext().getColor(R.color.black_60_transparent));
        colorDrawable.setBounds(new Rect(0, 0, interactiveDrawableContainer.getWidth(), interactiveDrawableContainer.getHeight()));
        this.A03 = colorDrawable;
        Integer num = C05F.A00;
        this.A0G = new C8FC((C8D0) new C221619qQ(colorDrawable.getBounds()), (C8FD) null, (C89G) null, num, (Integer) null, (Integer) null, (Object) null, (String) null, (List) null, -1.0f, -1.0f, -1.0f, -1.0f, -1.0f, 8, false, false, false, false, false, false, false, true, true, true, true, true, false, false);
        View A0U = AbstractC167017dG.A0U(view, R.id.stories_template_editor_stub);
        C14360o3.A07(A0U);
        this.A04 = A0U;
        this.A05 = (ConstraintLayout) AbstractC166997dE.A0R(A0U, R.id.stories_template_footer_view_group);
        this.A0J = B8Q.A00(this, 33);
        this.A0C = AbstractC56372iV.A01(A0U.requireViewById(R.id.stories_template_music_only_button_view_stub), false, false);
        this.A0L = B8Q.A00(this, 35);
        this.A0M = B8Q.A00(this, 36);
        this.A0K = B8Q.A00(this, 34);
        Context A0L = AbstractC166997dE.A0L(view);
        if (z) {
            f = AbstractC167017dG.A08(A0L);
        } else {
            f = 0.0f;
        }
        this.A09 = new C44358Jix(A0L, C05F.A01, num, f, 10.0f, true, false, true);
        C55982hj A0R = AbstractC167007dF.A0R();
        A0R.A06 = true;
        A0R.A0A(new C214039e2(this, 0));
        this.A06 = A0R;
        if (z) {
            f2 = AbstractC167017dG.A08(A0L);
        } else {
            f2 = 0.0f;
        }
        this.A0A = new C44358Jix(A0L, num, num, f2, 10.0f, false, C18U.A06(C06090Tz.A05, userSession, 2342162919118020441L), false);
        C55982hj A0R2 = AbstractC167007dF.A0R();
        A0R2.A06 = true;
        A0R2.A0A(new C214039e2(this, 1));
        this.A07 = A0R2;
        this.A0I = B8Q.A00(this, 32);
        this.A0N = B8Q.A00(this, 37);
        View requireViewById = A0U.requireViewById(R.id.stories_template_next_button);
        C14360o3.A0A(requireViewById);
        C3P9 A0s = AbstractC166987dD.A0s(requireViewById);
        A0s.A06 = false;
        C216559iC.A02(A0s, this, 31);
        C3P9 A0s2 = AbstractC166987dD.A0s(AbstractC166997dE.A0S(A0U, R.id.stories_template_cancel_button));
        A0s2.A06 = false;
        C216559iC.A02(A0s2, this, 32);
        C57312k6 A004 = AbstractC57302k5.A00(abstractC59962oe.getLifecycle());
        AbstractC23641Du.A03(num, AnonymousClass191.A00, new C25024B5f(this, null, 31), A004);
        B5g.A01(this, A004, A00(this).A06, 47);
        B5g.A01(this, A004, ((C8OD) this.A0O.getValue()).A08, 48);
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void Cud(Drawable drawable) {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void Cuq() {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void Cur() {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void Cvp(Drawable drawable, int i) {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void DCJ(Drawable drawable, int i) {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void DCK(float f, float f2) {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void DCL(Drawable drawable) {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void DQa(Drawable drawable, int i, float f, float f2) {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void DQk() {
    }

    @Override // X.InterfaceC1829489p
    public final void Dep(Drawable drawable, int i, boolean z) {
        C14360o3.A0B(drawable, 1);
        C183828Di.A02(new C219099mJ(drawable, i, z), (C183828Di) this.A0P.getValue());
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void Din(Drawable drawable, float f, float f2, float f3, float f4) {
    }

    @Override // X.InterfaceC1829489p
    public final void Dmk(Drawable drawable, int i, float f, float f2) {
        C14360o3.A0B(drawable, 1);
        A00(this).A03(drawable, i);
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void DuD() {
    }

    public static final C9U3 A00(C24151Ana c24151Ana) {
        return (C9U3) c24151Ana.A0Q.getValue();
    }

    public static final void A01(C24151Ana c24151Ana) {
        BEc A09;
        UserSession userSession = c24151Ana.A0B;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36319909902360382L)) {
            InteractiveDrawableContainer interactiveDrawableContainer = c24151Ana.A0H;
            ArrayList A0S = interactiveDrawableContainer.A0S(new InterfaceC28041Xi() { // from class: X.Abu
                @Override // X.InterfaceC28041Xi
                public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
                    Drawable drawable = (Drawable) obj;
                    C14360o3.A0B(drawable, 0);
                    return AbstractC101614hW.A0C(drawable);
                }
            });
            C14360o3.A0B(A0S, 0);
            C09530e4 c09530e4 = (C09530e4) AbstractC001800i.A0J(A0S);
            boolean A06 = C18U.A06(c06090Tz, userSession, 36319909904064341L);
            int i = 0;
            if (A06) {
                PinnablesFooterHorizontalScrollView pinnablesFooterHorizontalScrollView = (PinnablesFooterHorizontalScrollView) AbstractC167017dG.A0V(c24151Ana.A0N);
                if (c09530e4 == null) {
                    i = 8;
                }
                pinnablesFooterHorizontalScrollView.A00("music_only", i);
                return;
            }
            if (c09530e4 == null || (A09 = AbstractC101614hW.A09((Drawable) c09530e4.A01)) == null) {
                return;
            }
            c24151Ana.A0C.setVisibility(0);
            C210429Sh c210429Sh = new C210429Sh(AbstractC166997dE.A0L(interactiveDrawableContainer), userSession, MusicAssetModel.A03(A09.BVf()));
            if (!c210429Sh.A00) {
                c210429Sh.A00 = true;
                c210429Sh.A0C.A01();
                c210429Sh.invalidateSelf();
            }
            IgSimpleImageView igSimpleImageView = (IgSimpleImageView) AbstractC166987dD.A17(c24151Ana.A0L);
            int i2 = c210429Sh.A04;
            AbstractC13880nE.A0W(igSimpleImageView, c210429Sh.A0A.A05.A06 + i2);
            igSimpleImageView.post(new RunnableC24656Avq(igSimpleImageView, c210429Sh));
            View A0L = AbstractC167007dF.A0L(c24151Ana.A0M);
            AbstractC13880nE.A0W(A0L, i2);
            AbstractC13880nE.A0g(A0L, c210429Sh.getIntrinsicWidth());
            ViewOnClickListenerC23248ASj.A00(A0L, 15, c09530e4, c24151Ana);
        }
    }

    public static final void A02(C24151Ana c24151Ana, List list) {
        InterfaceC56392iX interfaceC56392iX = c24151Ana.A0C;
        if (interfaceC56392iX.CWW()) {
            interfaceC56392iX.setVisibility(8);
            AbstractC167007dF.A0L(c24151Ana.A0M).setOnClickListener(null);
        }
        InteractiveDrawableContainer interactiveDrawableContainer = c24151Ana.A0H;
        interactiveDrawableContainer.A0s(C23541Abv.A00);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C211739Zk c211739Zk = (C211739Zk) it.next();
            C5NL c5nl = (C5NL) c211739Zk.A04;
            AA2 aa2 = (AA2) c211739Zk.A01;
            C8FC c8fc = (C8FC) c211739Zk.A00;
            C202278x7 c202278x7 = (C202278x7) c211739Zk.A05;
            Drawable A01 = AMH.A01(AbstractC166997dE.A0L(interactiveDrawableContainer), c24151Ana.A0B, c5nl, "");
            if (c8fc == null) {
                if (aa2 != null) {
                    C23108AGw A00 = AbstractC23125AKj.A00(aa2);
                    A00.A05 = 9;
                    A00.A0Q = true;
                    A00.A0R = true;
                    A00.A0C = "STORY_SUGGESTED_TEMPLATE";
                    c8fc = new C8FC(A00);
                } else {
                    c8fc = null;
                }
            }
            int A0I = interactiveDrawableContainer.A0I(A01, c8fc);
            if (c202278x7 != null) {
                AHh.A01(c202278x7, InteractiveDrawableContainer.A00(A01, interactiveDrawableContainer));
            }
            C183828Di c183828Di = (C183828Di) c24151Ana.A0P.getValue();
            C5NG BlQ = c5nl.BlQ();
            AbstractC167017dG.A1P(A01, BlQ);
            C183828Di.A02(new C219089mI(A01, BlQ, A0I), c183828Di);
            if (AbstractC101614hW.A0C(A01)) {
                A01(c24151Ana);
            }
            if (c211739Zk.A02) {
                linkedHashSet.add(Integer.valueOf(A0I));
            }
        }
        ((C183828Di) c24151Ana.A0P.getValue()).A06(linkedHashSet);
    }

    public static final void A03(C24151Ana c24151Ana, Map map) {
        c24151Ana.A0H.A0X(map.keySet()).forEach(new C24940B1o(new C30485DbU(33, map, c24151Ana), 0));
    }

    public static final void A04(C24151Ana c24151Ana, boolean z) {
        EnumC222699sA enumC222699sA;
        C5NL A00;
        C8FC c8fc;
        InteractiveDrawableContainer interactiveDrawableContainer = c24151Ana.A0H;
        if (interactiveDrawableContainer.getChildCount() != 0) {
            ArrayList A1E = AbstractC166987dD.A1E();
            for (BD4 bd4 : interactiveDrawableContainer.getInteractiveDrawables()) {
                C9LJ c9lj = (C9LJ) bd4;
                Drawable drawable = c9lj.A0B;
                if (!(drawable instanceof C8P7) && (A00 = A07.A00(drawable)) != null) {
                    Object C4x = bd4.C4x();
                    if (C4x instanceof C8FC) {
                        c8fc = (C8FC) C4x;
                    } else {
                        c8fc = null;
                    }
                    int i = c9lj.A0f;
                    A1E.add(new C211739Zk(null, A00, c8fc, interactiveDrawableContainer.A0L(i), 2, AbstractC001800i.A0k(((C183828Di) c24151Ana.A0P.getValue()).A00).contains(Integer.valueOf(i))));
                }
            }
            C8OD c8od = (C8OD) c24151Ana.A0O.getValue();
            if (z) {
                enumC222699sA = EnumC222699sA.A04;
            } else {
                enumC222699sA = EnumC222699sA.A03;
            }
            C09530e4 A1L = AbstractC166987dD.A1L(enumC222699sA, AbstractC001800i.A0a(A1E));
            c8od.A06.set(0, A1L);
            if (A1L.A00 == EnumC222699sA.A04) {
                c8od.A01 = (List) A1L.A01;
            }
        }
    }

    @Override // X.InterfaceC1829489p
    public final void Dmm(Drawable drawable, float f, float f2, float f3, float f4, int i) {
        AbstractC223859uU abstractC223859uU;
        UserSession userSession = this.A0B;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36319909902819140L) && !C18U.A06(c06090Tz, userSession, 36319909904064341L)) {
            C9U3 A00 = A00(this);
            Integer num = ((A8G) A00.A07.getValue()).A00;
            if (num != null) {
                int intValue = num.intValue();
                if (intValue != 0) {
                    if (intValue != 1) {
                        if (intValue == 2) {
                            abstractC223859uU = C219289mc.A00;
                        }
                    } else {
                        abstractC223859uU = C219279mb.A00;
                    }
                } else {
                    abstractC223859uU = C219269ma.A00;
                }
                C9U3.A01(abstractC223859uU, A00);
                return;
            }
            A00.A03.A03();
        }
    }

    @Override // X.C8BD
    public final boolean onBackPressed() {
        A00(this).A02();
        return true;
    }
}
