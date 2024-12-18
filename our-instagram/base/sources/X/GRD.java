package X;

import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.direct.inbox.fragment.DirectSearchInboxSeeAllFragment;
import com.instagram.model.direct.DirectShareTarget;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes6.dex */
public final /* synthetic */ class GRD implements Runnable {
    public final /* synthetic */ DirectSearchInboxSeeAllFragment A00;

    public /* synthetic */ GRD(DirectSearchInboxSeeAllFragment directSearchInboxSeeAllFragment) {
        this.A00 = directSearchInboxSeeAllFragment;
    }

    public static void A00(ViewModelListUpdate viewModelListUpdate, Integer num) {
        viewModelListUpdate.A00(new C36216FyV(null, num, C05F.A0N, null));
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        EY0 ey0;
        DirectSearchInboxSeeAllFragment directSearchInboxSeeAllFragment = this.A00;
        ViewModelListUpdate A0E = AbstractC31171DnF.A0E();
        ArrayList arrayList = directSearchInboxSeeAllFragment.A0F;
        if (directSearchInboxSeeAllFragment.A0R && arrayList != null && !arrayList.isEmpty()) {
            A0E.A01(C36215FyU.A00(arrayList, 33, 0, directSearchInboxSeeAllFragment.A02, 0, false));
            arrayList.size();
        } else {
            ArrayList arrayList2 = directSearchInboxSeeAllFragment.A0G;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                A00(A0E, C05F.A0j);
                A0E.A01(F3Q.A00(directSearchInboxSeeAllFragment.A06, directSearchInboxSeeAllFragment.A09, arrayList2, 15, 0, directSearchInboxSeeAllFragment.A02, 0, false, false, false));
                i = arrayList2.size();
                i2 = 1;
            } else {
                i = 0;
                i2 = 0;
            }
            ArrayList arrayList3 = directSearchInboxSeeAllFragment.A0K;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int i5 = 16;
                if (directSearchInboxSeeAllFragment.A0S) {
                    i5 = 24;
                }
                A00(A0E, C05F.A1I);
                A0E.A01(C36215FyU.A00(arrayList3, i5, i, directSearchInboxSeeAllFragment.A02, i2, directSearchInboxSeeAllFragment.A0T));
                i += arrayList3.size();
                i2++;
            }
            ArrayList arrayList4 = directSearchInboxSeeAllFragment.A0H;
            if (arrayList4 != null && !arrayList4.isEmpty()) {
                A00(A0E, C05F.A03);
                A0E.A01(C36215FyU.A00(arrayList4, 17, i, directSearchInboxSeeAllFragment.A02, i2, false));
                i += arrayList4.size();
                i2++;
            }
            ArrayList arrayList5 = directSearchInboxSeeAllFragment.A0J;
            if (arrayList5 != null && !arrayList5.isEmpty()) {
                A00(A0E, C05F.A04);
                i3 = i2 + 1;
                A0E.A01(C36215FyU.A00(arrayList5, 22, i, directSearchInboxSeeAllFragment.A02, i2, directSearchInboxSeeAllFragment.A0T));
                i += arrayList5.size();
            } else {
                i3 = i2;
            }
            ArrayList arrayList6 = directSearchInboxSeeAllFragment.A0I;
            if (arrayList6 != null && !arrayList6.isEmpty()) {
                ArrayList A1E = AbstractC166987dD.A1E();
                ArrayList A1E2 = AbstractC166987dD.A1E();
                Iterator it = arrayList6.iterator();
                while (it.hasNext()) {
                    DirectShareTarget A0m = AbstractC31172DnG.A0m(it);
                    Boolean bool = A0m.A0C;
                    if (bool != null && bool.booleanValue()) {
                        A1E.add(A0m);
                    } else {
                        A1E2.add(A0m);
                    }
                }
                if (!A1E.isEmpty()) {
                    A00(A0E, C05F.A0H);
                    i4 = i3 + 1;
                    A0E.A01(F3Q.A00(directSearchInboxSeeAllFragment.A06, null, A1E, 37, i, directSearchInboxSeeAllFragment.A02, i3, false, false, directSearchInboxSeeAllFragment.A0U));
                    i += A1E.size();
                } else {
                    i4 = i3;
                }
                if (!A1E2.isEmpty()) {
                    A00(A0E, C05F.A0I);
                    i3 = i4 + 1;
                    A0E.A01(F3Q.A00(directSearchInboxSeeAllFragment.A06, null, A1E2, 37, i, directSearchInboxSeeAllFragment.A02, i4, false, false, directSearchInboxSeeAllFragment.A0U));
                    i += A1E2.size();
                } else {
                    i3 = i4;
                }
            }
            ArrayList arrayList7 = directSearchInboxSeeAllFragment.A0E;
            if (arrayList7 != null && !arrayList7.isEmpty()) {
                A0E.A01(C36215FyU.A00(arrayList7, 36, i, directSearchInboxSeeAllFragment.A02, i3, false));
            }
        }
        InterfaceC169517hR interfaceC169517hR = directSearchInboxSeeAllFragment.A0B;
        if (interfaceC169517hR != null) {
            if (interfaceC169517hR.isLoading()) {
                ey0 = new EY0(directSearchInboxSeeAllFragment.A04.getString(2131973064), directSearchInboxSeeAllFragment.A00, true);
            } else if (interfaceC169517hR.CUG()) {
                ey0 = new EY0(AbstractC167007dF.A0f(directSearchInboxSeeAllFragment.A04, directSearchInboxSeeAllFragment.A0D, 2131973013), directSearchInboxSeeAllFragment.A00, false);
            }
            A0E.A00(ey0);
        }
        directSearchInboxSeeAllFragment.A05.A05(A0E);
    }
}
