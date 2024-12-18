package X;

import android.view.View;

/* renamed from: X.Apz, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24294Apz implements Runnable {
    public final /* synthetic */ C214619ez A00;

    public RunnableC24294Apz(C214619ez c214619ez) {
        this.A00 = c214619ez;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        C214619ez c214619ez = this.A00;
        if (c214619ez.A01 != null) {
            A83 a83 = c214619ez.A08;
            if (a83 == null) {
                str = "tooltipController";
            } else {
                View view = c214619ez.A00;
                if (view == null) {
                    str = "anchor";
                } else {
                    java.util.Set set = a83.A02;
                    if (!set.contains(view)) {
                        C5SU A0U = AbstractC167007dF.A0U(a83.A00, 2131975773);
                        A0U.A03(view);
                        A0U.A01();
                        A0U.A07(C5SV.A07);
                        A0U.A00 = 5000;
                        A0U.A00().A07(a83.A01);
                        set.add(view);
                        return;
                    }
                    return;
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }
}
