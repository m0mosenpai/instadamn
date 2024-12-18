package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;

/* renamed from: X.9g4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C215289g4 extends AbstractC65632xz {
    public final int A00;
    public final int A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;
    public final C7OC A04;

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        anonymousClass306.A7a(0);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public C215289g4(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C7OC c7oc, int i, int i2) {
        this.A03 = userSession;
        this.A02 = interfaceC11380iw;
        this.A04 = c7oc;
        this.A01 = i;
        this.A00 = i2;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(1908225761);
        Object tag = view.getTag();
        tag.getClass();
        C22888A7i c22888A7i = (C22888A7i) tag;
        UserSession userSession = this.A03;
        InterfaceC11380iw interfaceC11380iw = this.A02;
        C153126ug c153126ug = (C153126ug) obj;
        C7OC c7oc = this.A04;
        int i2 = 0;
        while (true) {
            View[] viewArr = c22888A7i.A01;
            if (i2 < viewArr.length) {
                Object tag2 = viewArr[i2].getTag();
                tag2.getClass();
                C168757g9 c168757g9 = (C168757g9) tag2;
                if (i2 < c153126ug.A01()) {
                    Object A02 = c153126ug.A02(i2);
                    A02.getClass();
                    AbstractC168777gB.A02(interfaceC11380iw, userSession, (C148336m3) A02, c7oc, c168757g9);
                } else {
                    AbstractC168777gB.A04(c168757g9);
                }
                i2++;
            } else {
                C0f9.A0A(384026622, A03);
                return;
            }
        }
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(-701085111);
        int i2 = this.A01;
        int i3 = this.A00;
        Context context = viewGroup.getContext();
        ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.layout_horizontal_container, viewGroup, false);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.ad4ad_button_bottom_margin);
        viewGroup2.setPadding(dimensionPixelSize, 0, dimensionPixelSize, AbstractC167017dG.A0A(context));
        C22888A7i c22888A7i = new C22888A7i(viewGroup2, i2);
        for (int i4 = 0; i4 < i2; i4++) {
            IgFrameLayout A01 = AbstractC168777gB.A01(context, i3, AbstractC167007dF.A1Q(i4, i2 - 1));
            c22888A7i.A01[i4] = A01;
            viewGroup2.addView(A01);
        }
        viewGroup2.setTag(c22888A7i);
        C0f9.A0A(60785046, A03);
        return viewGroup2;
    }
}
