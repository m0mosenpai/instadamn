package X;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class HEW extends C2US {
    public IFF A00;
    public CharSequence A01;
    public List A02;
    public final C39691HjN A03;
    public final C38995HEx A04;
    public final EQU A05;
    public final C38985HEn A06;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.EQU, X.2y0] */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.HEn, java.lang.Object, X.2y0] */
    public HEW(C39691HjN c39691HjN, HD9 hd9) {
        super(false);
        ?? obj = new Object();
        this.A06 = obj;
        C38995HEx c38995HEx = new C38995HEx(hd9);
        this.A04 = c38995HEx;
        ?? obj2 = new Object();
        this.A05 = obj2;
        init(obj, c38995HEx, obj2);
        this.A03 = c39691HjN;
        A00(this);
    }

    public static final void A00(HEW hew) {
        hew.clear();
        if (hew.A02 != null) {
            IFF iff = hew.A00;
            if (iff != null) {
                hew.addModel(iff, hew.A06);
            }
            List list = hew.A02;
            C14360o3.A0A(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                hew.addModel(it.next(), hew.A03, hew.A04);
            }
            hew.addModel(hew.A01, hew.A05);
        }
        hew.notifyDataSetChanged();
    }
}
