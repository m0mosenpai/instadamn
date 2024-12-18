package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.3BC, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3BC extends AbstractC60592pi {
    public final C3BD A00;
    public final C60882qC A01;

    public C3BC(Context context, View.OnClickListener onClickListener, C60882qC c60882qC, int i) {
        this.A01 = c60882qC;
        this.A00 = new C3BD(context, onClickListener, context.getString(i), -1, true);
    }

    public final void A00() {
        View view;
        View AnW;
        C60882qC c60882qC = this.A01;
        if (c60882qC != null) {
            C3BD c3bd = this.A00;
            C56342iS c56342iS = C56352iT.A0t;
            C60662pp c60662pp = c60882qC.A00;
            int measuredHeight = c56342iS.A03(c60662pp.getActivity()).A0S.getMeasuredHeight();
            if (c60662pp.mView != null) {
                int i = measuredHeight / 2;
                int A03 = measuredHeight + C81203jp.A03(c60662pp.getScrollingViewProxy(), measuredHeight, i);
                C3FQ scrollingViewProxy = c60662pp.getScrollingViewProxy();
                EnumC81483kI enumC81483kI = EnumC81483kI.A0I;
                int i2 = 0;
                if (C81203jp.A02(enumC81483kI, scrollingViewProxy) != -1 && (AnW = scrollingViewProxy.AnW(C81203jp.A02(enumC81483kI, scrollingViewProxy))) != null && A03 - AnW.getBottom() <= i) {
                    i2 = (AnW.getBottom() - A03) + i;
                }
                measuredHeight = A03 + i2;
            }
            C3HC c3hc = c60662pp.A0E;
            if (c3hc != null && (view = c3hc.A02) != null) {
                int height = view.getHeight();
                if (Integer.valueOf(height) != null) {
                    measuredHeight += height;
                }
            }
            if (measuredHeight < 0) {
                measuredHeight = 0;
            }
            c3bd.A03(measuredHeight);
        }
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onDestroyView() {
        this.A00.A01();
    }
}
