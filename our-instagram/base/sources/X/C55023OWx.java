package X;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.OWx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55023OWx {
    public final Activity A00;
    public final View A01;
    public final ViewTreeObserver.OnScrollChangedListener A02;
    public final InterfaceC60152ox A03;
    public final C3I9 A04;
    public final ArrayList A05;

    public C55023OWx(Activity activity, View view) {
        C14360o3.A0B(view, 1);
        this.A01 = view;
        this.A00 = activity;
        this.A05 = AbstractC166987dD.A1E();
        this.A02 = new ViewTreeObserverOnScrollChangedListenerC55505Oky(this, 3);
        this.A04 = C3I7.A01(this, false, false);
        this.A03 = new C56177Owk(this, 13);
    }

    public static final void A00(C55023OWx c55023OWx) {
        View view = c55023OWx.A01;
        if (view.isShown() && view.getGlobalVisibleRect(AbstractC166987dD.A0U())) {
            ArrayList A1E = AbstractC166987dD.A1E();
            ArrayList arrayList = c55023OWx.A05;
            synchronized (arrayList) {
                A1E.addAll(arrayList);
            }
            Iterator A13 = AbstractC166997dE.A13(A1E);
            while (A13.hasNext()) {
                ((Runnable) AbstractC166997dE.A0l(A13)).run();
            }
        }
    }

    public final void A01() {
        ArrayList arrayList = this.A05;
        synchronized (arrayList) {
            arrayList.clear();
        }
        View view = this.A01;
        if (view.getViewTreeObserver().isAlive()) {
            view.getViewTreeObserver().removeOnScrollChangedListener(this.A02);
        }
        this.A04.EFx(this.A03);
    }

    public final void A02(Runnable runnable) {
        ArrayList arrayList = this.A05;
        synchronized (arrayList) {
            if (arrayList.isEmpty()) {
                this.A01.getViewTreeObserver().addOnScrollChangedListener(this.A02);
                C3I9 c3i9 = this.A04;
                c3i9.A9e(this.A03);
                c3i9.Dnr(this.A00);
            }
            arrayList.add(runnable);
        }
    }

    public final void A03(Runnable runnable) {
        ArrayList arrayList = this.A05;
        synchronized (arrayList) {
            C15500q5.A00(arrayList).remove(runnable);
            if (arrayList.isEmpty()) {
                A01();
            }
        }
    }
}
