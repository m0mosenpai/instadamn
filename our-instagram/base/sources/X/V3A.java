package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.user.model.User;

/* loaded from: classes11.dex */
public final class V3A extends AbstractC65632xz {
    public C38321qM A00;
    public final CST A01;
    public final InterfaceC11380iw A02;
    public final C57352kA A03;
    public final C69561VrQ A04;

    public V3A(Context context, CST cst, InterfaceC11380iw interfaceC11380iw, C57352kA c57352kA, InterfaceC71986XDx interfaceC71986XDx) {
        C14360o3.A0B(c57352kA, 3);
        this.A02 = interfaceC11380iw;
        this.A03 = c57352kA;
        this.A01 = cst;
        this.A04 = new C69561VrQ(context, interfaceC71986XDx);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 2;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int i2;
        float f;
        int A03 = C0f9.A03(-845572667);
        AbstractC167007dF.A1D(view, 1, obj);
        C14360o3.A0B(obj2, 3);
        C38321qM c38321qM = this.A00;
        if (c38321qM != null) {
            C84923qg c84923qg = (C84923qg) obj;
            c84923qg.A01(c38321qM);
            CST cst = this.A01;
            cst.A01.A05(view, cst.A02.A00(AnonymousClass001.A04(i, "::", c84923qg.A0G)));
        }
        if (i == 0 || i == 1) {
            C69561VrQ c69561VrQ = this.A04;
            Object tag = view.getTag();
            C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.wellbeing.limitedprofile.adapter.LimitedCommentRowViewBinder.Holder");
            C68252VJo c68252VJo = (C68252VJo) tag;
            C84923qg c84923qg2 = (C84923qg) obj;
            C68859VdF c68859VdF = (C68859VdF) obj2;
            C57352kA c57352kA = this.A03;
            InterfaceC11380iw interfaceC11380iw = this.A02;
            C14360o3.A0B(c68252VJo, 0);
            AbstractC167007dF.A1D(c84923qg2, 1, c68859VdF);
            AbstractC167007dF.A1F(c57352kA, 3, interfaceC11380iw);
            User user = c84923qg2.A08;
            c68252VJo.A08 = c84923qg2;
            c68252VJo.A09 = c68859VdF;
            Context context = c69561VrQ.A00;
            View view2 = c68252VJo.A01;
            if (c68859VdF.A00) {
                i2 = AbstractC53242c7.A0H(context, R.attr.selectedCommentBackground);
            } else {
                i2 = R.color.direct_widget_primary_background;
            }
            view2.setBackgroundResource(i2);
            IgTextView igTextView = c68252VJo.A06;
            User user2 = c84923qg2.A08;
            if (user2 != null) {
                igTextView.setContentDescription(AbstractC31174DnI.A0t(igTextView.getContext(), user2.getUsername(), c84923qg2.A0e, 2131972695));
            }
            AbstractC31176DnK.A1G(igTextView, c57352kA.A0D(igTextView.getContext(), new C85163r7(null, c84923qg2, null, null, null, null, null, null, null, null, false, true, false, false, true, false, false, false, false, false, false, false, false, false)));
            TextView textView = c68252VJo.A05;
            String str = C23831Eq.A07(context, c84923qg2.A03).toString();
            if (str.length() > 0) {
                textView.setText(str);
                textView.setVisibility(0);
                textView.setContentDescription(C23831Eq.A03(context, c84923qg2.A03));
            } else {
                textView.setVisibility(8);
            }
            if (user != null) {
                CircularImageView circularImageView = c68252VJo.A07;
                AbstractC31173DnH.A1T(interfaceC11380iw, circularImageView, user);
                AbstractC37302Gc3.A0o(context, circularImageView, user.getUsername(), 2131963268);
            }
            CircularImageView circularImageView2 = c68252VJo.A07;
            AbstractC56952jT.A01(circularImageView2);
            circularImageView2.setImportantForAccessibility(1);
            WNX.A00(circularImageView2, interfaceC11380iw, c69561VrQ, user, 62);
            View view3 = c68252VJo.A02;
            WO5.A00(view3, 18, new GestureDetector(view3.getContext(), new C9TH(3, c84923qg2, c69561VrQ)));
            if (c84923qg2.A0l && !c84923qg2.A0P) {
                TextView textView2 = c68252VJo.A03;
                textView2.setVisibility(0);
                WNW.A00(textView2, 27, c84923qg2, c69561VrQ);
                TextView textView3 = c68252VJo.A04;
                textView3.setVisibility(0);
                WNW.A00(textView3, 28, c84923qg2, c69561VrQ);
                f = 0.4f;
            } else {
                c68252VJo.A03.setVisibility(8);
                c68252VJo.A04.setVisibility(8);
                f = 1.0f;
            }
            CircularImageView circularImageView3 = c68252VJo.A07;
            if (f != circularImageView3.getAlpha() || f != c68252VJo.A06.getAlpha()) {
                circularImageView3.setAlpha(f);
                c68252VJo.A06.setAlpha(f);
            }
        }
        C0f9.A0A(-602288116, A03);
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        C84923qg c84923qg = (C84923qg) obj;
        AbstractC167017dG.A1N(anonymousClass306, c84923qg);
        boolean A1W = AbstractC167007dF.A1W(c84923qg.A0F);
        anonymousClass306.A7a(A1W ? 1 : 0);
        CST cst = this.A01;
        C68731VbA c68731VbA = new C68731VbA();
        String A04 = AnonymousClass001.A04(A1W ? 1 : 0, "::", c84923qg.A0G);
        C59072n8 A00 = C59062n7.A00(c84923qg, c68731VbA, A04);
        A00.A00(cst.A00);
        A00.A00(cst.A03);
        cst.A02.A01(A00.A01(), A04);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        View A00;
        int A03 = C0f9.A03(-2063441893);
        C14360o3.A0B(viewGroup, 1);
        if (i != 0) {
            if (i == 1) {
                A00 = this.A04.A00(viewGroup, true);
            } else {
                IllegalArgumentException A0n = AbstractC25230BEn.A0n(MSV.A00(27), i);
                C0f9.A0A(1418342512, A03);
                throw A0n;
            }
        } else {
            A00 = this.A04.A00(viewGroup, false);
        }
        C0f9.A0A(-1241442149, A03);
        return A00;
    }
}
