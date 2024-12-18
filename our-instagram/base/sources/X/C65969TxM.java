package X;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.TxM, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65969TxM {
    public InterfaceC09670ek A00;
    public AbstractC65392xb A01;
    public AbstractC65852TvD A02;
    public ViewPager2 A03;
    public long A04 = -1;
    public final /* synthetic */ AbstractC65952Twx A05;

    public C65969TxM(AbstractC65952Twx abstractC65952Twx) {
        this.A05 = abstractC65952Twx;
    }

    public final void A00(boolean z) {
        int i;
        Fragment fragment;
        AbstractC65952Twx abstractC65952Twx = this.A05;
        AbstractC10360h2 abstractC10360h2 = abstractC65952Twx.A07;
        if (!abstractC10360h2.A11() && this.A03.A08.A02 == 0) {
            C003501a c003501a = abstractC65952Twx.A04;
            if (c003501a.A00() != 0 && abstractC65952Twx.getItemCount() != 0 && (i = this.A03.A00) < abstractC65952Twx.getItemCount()) {
                long itemId = abstractC65952Twx.getItemId(i);
                if ((itemId == this.A04 && !z) || (fragment = (Fragment) c003501a.A05(itemId)) == null || !fragment.isAdded()) {
                    return;
                }
                this.A04 = itemId;
                C14240no c14240no = new C14240no(abstractC10360h2);
                Fragment fragment2 = null;
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < c003501a.A00(); i2++) {
                    long A02 = c003501a.A02(i2);
                    Fragment fragment3 = (Fragment) c003501a.A04(i2);
                    if (fragment3.isAdded()) {
                        if (A02 != this.A04) {
                            c14240no.A04(fragment3, C07S.STARTED);
                            C65972TxP c65972TxP = abstractC65952Twx.A00;
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it = c65972TxP.A00.iterator();
                            if (it.hasNext()) {
                                it.next();
                                throw new NullPointerException("onFragmentMaxLifecyclePreUpdated");
                            }
                            arrayList.add(arrayList2);
                        } else {
                            fragment2 = fragment3;
                        }
                        boolean z2 = false;
                        if (A02 == this.A04) {
                            z2 = true;
                        }
                        fragment3.setMenuVisibility(z2);
                    }
                }
                if (fragment2 != null) {
                    c14240no.A04(fragment2, C07S.RESUMED);
                    C65972TxP c65972TxP2 = abstractC65952Twx.A00;
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it2 = c65972TxP2.A00.iterator();
                    if (it2.hasNext()) {
                        it2.next();
                        throw new NullPointerException("onFragmentMaxLifecyclePreUpdated");
                    }
                    arrayList.add(arrayList3);
                }
                if (c14240no.A0B.isEmpty()) {
                    return;
                }
                c14240no.A0K();
                Collections.reverse(arrayList);
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    C65972TxP.A00((List) it3.next());
                }
            }
        }
    }
}
