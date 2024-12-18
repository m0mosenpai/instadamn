package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.06G, reason: invalid class name */
/* loaded from: classes.dex */
public final class C06G {
    public final CopyOnWriteArrayList A00 = new CopyOnWriteArrayList();
    public final AbstractC10360h2 A01;

    public final void A00(Bundle bundle, View view, Fragment fragment, boolean z) {
        C14360o3.A0B(view, 1);
        AbstractC10360h2 abstractC10360h2 = this.A01;
        Fragment fragment2 = abstractC10360h2.A06;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().A0T.A00(bundle, view, fragment, true);
        }
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            C06F c06f = (C06F) it.next();
            if (!z || c06f.A01) {
                c06f.A00.A01(bundle, view, fragment, abstractC10360h2);
            }
        }
    }

    public final void A04(Bundle bundle, Fragment fragment, boolean z) {
        AbstractC10360h2 abstractC10360h2 = this.A01;
        Fragment fragment2 = abstractC10360h2.A06;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().A0T.A04(bundle, fragment, true);
        }
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            C06F c06f = (C06F) it.next();
            if (!z || c06f.A01) {
                c06f.A00.A03(bundle, fragment, abstractC10360h2);
            }
        }
    }

    public final void A01(Bundle bundle, Fragment fragment) {
        Fragment fragment2 = this.A01.A06;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().A0T.A01(bundle, fragment);
        }
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void A02(Bundle bundle, Fragment fragment) {
        Fragment fragment2 = this.A01.A06;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().A0T.A02(bundle, fragment);
        }
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void A03(Bundle bundle, Fragment fragment, boolean z) {
        AbstractC10360h2 abstractC10360h2 = this.A01;
        Fragment fragment2 = abstractC10360h2.A06;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().A0T.A03(bundle, fragment, true);
        }
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            C06F c06f = (C06F) it.next();
            if (!z || c06f.A01) {
                c06f.A00.A02(bundle, fragment, abstractC10360h2);
            }
        }
    }

    public final void A05(Fragment fragment) {
        Fragment fragment2 = this.A01.A06;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().A0T.A05(fragment);
        }
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void A06(Fragment fragment) {
        Fragment fragment2 = this.A01.A06;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().A0T.A06(fragment);
        }
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void A07(Fragment fragment, boolean z) {
        AbstractC10360h2 abstractC10360h2 = this.A01;
        Context context = abstractC10360h2.A0A.A01;
        Fragment fragment2 = abstractC10360h2.A06;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().A0T.A07(fragment, true);
        }
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            C06F c06f = (C06F) it.next();
            if (!z || c06f.A01) {
                c06f.A00.A00(context, fragment, abstractC10360h2);
            }
        }
    }

    public final void A08(Fragment fragment, boolean z) {
        AbstractC10360h2 abstractC10360h2 = this.A01;
        Fragment fragment2 = abstractC10360h2.A06;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().A0T.A08(fragment, true);
        }
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            C06F c06f = (C06F) it.next();
            if (!z || c06f.A01) {
                c06f.A00.A04(fragment, abstractC10360h2);
            }
        }
    }

    public final void A09(Fragment fragment, boolean z) {
        AbstractC10360h2 abstractC10360h2 = this.A01;
        Fragment fragment2 = abstractC10360h2.A06;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().A0T.A09(fragment, true);
        }
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            C06F c06f = (C06F) it.next();
            if (!z || c06f.A01) {
                c06f.A00.A05(fragment, abstractC10360h2);
            }
        }
    }

    public final void A0A(Fragment fragment, boolean z) {
        AbstractC10360h2 abstractC10360h2 = this.A01;
        Fragment fragment2 = abstractC10360h2.A06;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().A0T.A0A(fragment, true);
        }
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            C06F c06f = (C06F) it.next();
            if (!z || c06f.A01) {
                c06f.A00.A06(fragment, abstractC10360h2);
            }
        }
    }

    public final void A0B(Fragment fragment, boolean z) {
        AbstractC10360h2 abstractC10360h2 = this.A01;
        Fragment fragment2 = abstractC10360h2.A06;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().A0T.A0B(fragment, true);
        }
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            C06F c06f = (C06F) it.next();
            if (!z || c06f.A01) {
                c06f.A00.A07(fragment, abstractC10360h2);
            }
        }
    }

    public final void A0C(Fragment fragment, boolean z) {
        AbstractC10360h2 abstractC10360h2 = this.A01;
        Fragment fragment2 = abstractC10360h2.A06;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().A0T.A0C(fragment, true);
        }
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            C06F c06f = (C06F) it.next();
            if (!z || c06f.A01) {
                c06f.A00.A08(fragment, abstractC10360h2);
            }
        }
    }

    public final void A0D(Fragment fragment, boolean z) {
        AbstractC10360h2 abstractC10360h2 = this.A01;
        Fragment fragment2 = abstractC10360h2.A06;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().A0T.A0D(fragment, true);
        }
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            C06F c06f = (C06F) it.next();
            if (!z || c06f.A01) {
                c06f.A00.A09(fragment, abstractC10360h2);
            }
        }
    }

    public C06G(AbstractC10360h2 abstractC10360h2) {
        this.A01 = abstractC10360h2;
    }
}
