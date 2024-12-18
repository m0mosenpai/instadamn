package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.fragment.app.Fragment;

/* loaded from: classes11.dex */
public final class UF3 extends C06K {
    public final int A00;
    public final Object A01;

    public UF3(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C06K
    public final void A00(Context context, Fragment fragment, AbstractC10360h2 abstractC10360h2) {
        if (this.A00 != 0) {
            super.A00(context, fragment, abstractC10360h2);
            return;
        }
        C14360o3.A0B(context, 2);
        if (!(fragment instanceof C67729Uwv)) {
            return;
        }
        ((C67729Uwv) fragment).A0K(((C69641Vsi) this.A01).A00);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C06K
    public final void A01(Bundle bundle, View view, Fragment fragment, AbstractC10360h2 abstractC10360h2) {
        ViewOnTouchListenerC60632pm BDY;
        if (2 - this.A00 != 0) {
            super.A01(bundle, view, fragment, abstractC10360h2);
            return;
        }
        if (!(fragment instanceof C38K)) {
            return;
        }
        V4U v4u = (V4U) this.A01;
        if (!fragment.equals(v4u.A01)) {
            return;
        }
        C38K c38k = (C38K) fragment;
        AbstractC05560Rg.A00(c38k);
        ListView listView = ((AbstractC05560Rg) c38k).A04;
        C14360o3.A07(listView);
        ListAdapter adapter = listView.getAdapter();
        if ((fragment instanceof InterfaceC60132ov) && (adapter instanceof InterfaceC65252xN) && (BDY = ((InterfaceC60132ov) fragment).BDY()) != null) {
            BDY.A06((InterfaceC65252xN) adapter, c38k.getScrollingViewProxy(), 0);
        }
        listView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC66229U4z(5, v4u, listView, view));
    }

    @Override // X.C06K
    public final void A02(Bundle bundle, Fragment fragment, AbstractC10360h2 abstractC10360h2) {
        if (1 - this.A00 != 0) {
            super.A02(bundle, fragment, abstractC10360h2);
        } else {
            Fragment fragment2 = (Fragment) this.A01;
            C06C.A01(fragment2, "key_result_funding", new C30480DbP(fragment2, 14));
        }
    }

    @Override // X.C06K
    public final void A04(Fragment fragment, AbstractC10360h2 abstractC10360h2) {
        switch (this.A00) {
            case 0:
                AbstractC167017dG.A1N(abstractC10360h2, fragment);
                if (!(fragment instanceof C67729Uwv)) {
                    return;
                }
                ((C69641Vsi) this.A01).A03.A0p(this);
                return;
            case 1:
                AbstractC167017dG.A1N(abstractC10360h2, fragment);
                ((Fragment) this.A01).getParentFragmentManager().A0w("key_result_funding");
                return;
            default:
                super.A04(fragment, abstractC10360h2);
                return;
        }
    }
}
