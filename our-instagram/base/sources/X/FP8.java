package X;

import com.instagram.direct.fragment.icebreaker.ImportMsgrIceBreakersFragment;

/* loaded from: classes6.dex */
public final class FP8 {
    public final /* synthetic */ ImportMsgrIceBreakersFragment A00;

    public FP8(ImportMsgrIceBreakersFragment importMsgrIceBreakersFragment) {
        this.A00 = importMsgrIceBreakersFragment;
    }

    public final void A00(String str, boolean z) {
        C33628Ete c33628Ete;
        boolean z2;
        ImportMsgrIceBreakersFragment importMsgrIceBreakersFragment = this.A00;
        if (!importMsgrIceBreakersFragment.getRecyclerView().A1D()) {
            java.util.Set set = importMsgrIceBreakersFragment.A0A;
            if (!z) {
                if (set.contains(str)) {
                    set.remove(str);
                }
            } else {
                set.add(str);
            }
            for (int i = 0; i < importMsgrIceBreakersFragment.A05.size(); i++) {
                ((C33627Etd) importMsgrIceBreakersFragment.A05.get(i)).A00.A01.getClass();
                if (((C33627Etd) importMsgrIceBreakersFragment.A05.get(i)).A00.A01.equals(str)) {
                    ((C33627Etd) importMsgrIceBreakersFragment.A05.get(i)).A01.A01 = z;
                }
                int size = set.size();
                if (z) {
                    if (size == 4 && !set.contains(((C33627Etd) importMsgrIceBreakersFragment.A05.get(i)).A00.A01)) {
                        c33628Ete = ((C33627Etd) importMsgrIceBreakersFragment.A05.get(i)).A01;
                        z2 = false;
                        c33628Ete.A00 = z2;
                    }
                } else if (size == 3) {
                    c33628Ete = ((C33627Etd) importMsgrIceBreakersFragment.A05.get(i)).A01;
                    z2 = true;
                    c33628Ete.A00 = z2;
                }
            }
            importMsgrIceBreakersFragment.A03();
            importMsgrIceBreakersFragment.A02.A00(importMsgrIceBreakersFragment.A05);
        }
    }
}
