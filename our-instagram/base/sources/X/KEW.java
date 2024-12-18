package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class KEW extends AbstractC65632xz {
    public final Context A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final C1810981l A03;
    public final InterfaceC150196pR A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 3;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        Object obj3;
        String str;
        int A0G = AbstractC25231BEo.A0G(view, 74497940);
        C14360o3.A0B(obj, 2);
        UserSession userSession = this.A02;
        Object tag = view.getTag();
        if (tag != null) {
            C47535Kz2 c47535Kz2 = (C47535Kz2) tag;
            InterfaceC11380iw interfaceC11380iw = this.A01;
            C153126ug c153126ug = ((C47537Kz4) obj).A01;
            InterfaceC150196pR interfaceC150196pR = this.A04;
            C1810981l c1810981l = this.A03;
            boolean z = this.A07;
            String str2 = this.A05;
            AbstractC167017dG.A1N(userSession, c47535Kz2);
            C14360o3.A0B(interfaceC11380iw, 2);
            C14360o3.A0B(interfaceC150196pR, 4);
            View[] viewArr = c47535Kz2.A00;
            int length = viewArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                View view2 = viewArr[i2];
                if (view2 != null) {
                    obj3 = view2.getTag();
                } else {
                    obj3 = null;
                }
                C14360o3.A0C(obj3, AbstractC111324zv.A00(4977));
                LF3 lf3 = (LF3) obj3;
                InterfaceC148316m1 interfaceC148316m1 = (InterfaceC148316m1) AbstractC001800i.A0O(c153126ug.A01, c153126ug.A00 + i2);
                LFA lfa = AbstractC47148Ksh.A00;
                if (interfaceC148316m1 != null) {
                    lfa.A01(interfaceC11380iw, userSession, c1810981l, interfaceC150196pR, lf3, interfaceC148316m1);
                    C148276lx C0S = ((InterfaceC148316m1) c153126ug.A02(i2)).C0S();
                    if (z && C0S != null && str2 != null) {
                        C22C A01 = AnonymousClass229.A01(userSession);
                        if (AbstractC25226BEj.A1b(C0S.A01())) {
                            str = (String) C0S.A01().get(0);
                        } else {
                            str = C0S.A0Z;
                        }
                        A01.A1k(null, str, AHR.A02(C0S, false), AHR.A00(C0S));
                    }
                } else {
                    C14360o3.A0B(lf3, 0);
                    lf3.A08.A02();
                    lf3.A0A.setVisibility(4);
                    lf3.A0B.setVisibility(8);
                    lf3.A09.setVisibility(8);
                    lf3.A02 = null;
                    lf3.A01 = null;
                }
            }
            C0f9.A0A(1956288695, A0G);
            return;
        }
        IllegalStateException A0g = AbstractC166997dE.A0g();
        C0f9.A0A(-2109978883, A0G);
        throw A0g;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        C47537Kz4 c47537Kz4 = (C47537Kz4) obj;
        boolean A1R = AbstractC167007dF.A1R(0, anonymousClass306, c47537Kz4);
        int i = c47537Kz4.A00;
        if (i != 2) {
            if (i != 3) {
                anonymousClass306.A7a(A1R ? 1 : 0);
                return;
            } else {
                anonymousClass306.A7a(0);
                return;
            }
        }
        anonymousClass306.A7a(2);
    }

    public KEW(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C1810981l c1810981l, InterfaceC150196pR interfaceC150196pR, String str, boolean z, boolean z2) {
        this.A00 = context;
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A04 = interfaceC150196pR;
        this.A03 = c1810981l;
        this.A06 = z;
        this.A07 = z2;
        this.A05 = str;
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int i2;
        int A03 = C0f9.A03(-930672756);
        if (i != 0) {
            if (i != 1) {
                i2 = 2;
                if (i != 2) {
                    i2 = 0;
                }
            } else {
                i2 = 4;
            }
        } else {
            i2 = 3;
        }
        UserSession userSession = this.A02;
        InterfaceC11380iw interfaceC11380iw = this.A01;
        Context context = this.A00;
        boolean z = this.A06;
        AbstractC167017dG.A1N(userSession, interfaceC11380iw);
        C14360o3.A0B(context, 3);
        LinearLayout linearLayout = new LinearLayout(context);
        if (z) {
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2, 1.0f));
        }
        C47535Kz2 c47535Kz2 = new C47535Kz2(linearLayout, i2);
        linearLayout.setTag(c47535Kz2);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.ad4ad_button_bottom_margin);
        Resources resources = context.getResources();
        int i3 = R.dimen.abc_button_padding_horizontal_material;
        if (i2 != 2) {
            i3 = R.dimen.accent_edge_thickness;
        }
        int dimensionPixelSize2 = resources.getDimensionPixelSize(i3);
        linearLayout.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
        for (int i4 = 0; i4 < i2; i4++) {
            View[] viewArr = c47535Kz2.A00;
            viewArr[i4] = LFA.A00(linearLayout, interfaceC11380iw, userSession, AbstractC167007dF.A1Q(i4, i2 - 1), AbstractC167007dF.A1P(i2, 2));
            linearLayout.addView(viewArr[i4]);
        }
        C0f9.A0A(2128252680, A03);
        return linearLayout;
    }
}
