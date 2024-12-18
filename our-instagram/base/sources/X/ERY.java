package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class ERY extends AbstractC65632xz {
    public final C35210Fg2 A00;
    public final InterfaceC11380iw A01;
    public final Integer A02;

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        anonymousClass306.A7a(0);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(528772473);
        C31972E3a c31972E3a = (C31972E3a) AbstractC31172DnG.A0x(view);
        C34710FQv c34710FQv = (C34710FQv) obj;
        FIL fil = (FIL) obj2;
        int i2 = fil.A00;
        String str = fil.A01;
        C35210Fg2 c35210Fg2 = this.A00;
        InterfaceC11380iw interfaceC11380iw = this.A01;
        C14360o3.A0B(c31972E3a, 0);
        AbstractC25233BEq.A0x(1, c34710FQv, c35210Fg2, interfaceC11380iw);
        User user = c34710FQv.A01;
        View view2 = c31972E3a.A01;
        int i3 = 0;
        view2.setPressed(false);
        GradientSpinnerAvatarView gradientSpinnerAvatarView = c31972E3a.A06;
        AbstractC31176DnK.A1U(interfaceC11380iw, gradientSpinnerAvatarView, user);
        gradientSpinnerAvatarView.setGradientSpinnerVisible(false);
        AbstractC31173DnH.A1F(c31972E3a.A05, user);
        c31972E3a.A04.setText(user.B8y());
        boolean z = c34710FQv.A00;
        ImageView imageView = c31972E3a.A03;
        AbstractC125325le A01 = AbstractC125325le.A01(imageView, 0);
        C14360o3.A07(A01);
        if (A01.A0W()) {
            A01.A0G();
            c31972E3a.A00.setEnabled(true);
            c31972E3a.A02.setEnabled(true);
        }
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
        int i4 = 8;
        imageView.setVisibility(8);
        View view3 = c31972E3a.A00;
        view3.setEnabled(true);
        View view4 = c31972E3a.A02;
        view4.setEnabled(true);
        view2.setActivated(z);
        if (c34710FQv.A00) {
            i4 = 0;
        }
        view4.setVisibility(i4);
        if (c34710FQv.A00) {
            i3 = 8;
        }
        view3.setVisibility(i3);
        AbstractC56952jT.A01(view4);
        AbstractC56952jT.A01(view3);
        ViewOnClickListenerC35683FpI.A00(view2, 22, c35210Fg2, c34710FQv);
        C0fQ.A00(new ViewOnClickListenerC35618Fo9(c35210Fg2, c31972E3a, c34710FQv, str, i2, 0), view3);
        C0fQ.A00(new ViewOnClickListenerC35618Fo9(c35210Fg2, c31972E3a, c34710FQv, str, i2, 1), view4);
        C0f9.A0A(1433930575, A03);
    }

    public ERY(C35210Fg2 c35210Fg2, InterfaceC11380iw interfaceC11380iw, Integer num) {
        this.A00 = c35210Fg2;
        this.A02 = num;
        this.A01 = interfaceC11380iw;
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(1116179326);
        Integer num = this.A02;
        Context A06 = AbstractC31173DnH.A06(viewGroup, 0);
        View A0D = AbstractC25227BEk.A0D(LayoutInflater.from(A06), viewGroup, R.layout.user_list_row_item, false);
        C14360o3.A0A(A06);
        A0D.setTag(new C31972E3a(A06, A0D, num));
        C0f9.A0A(-858582923, A03);
        return A0D;
    }
}
