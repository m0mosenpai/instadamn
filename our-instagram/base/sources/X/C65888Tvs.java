package X;

import android.util.SparseBooleanArray;
import java.util.List;
import java.util.Map;

/* renamed from: X.Tvs, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65888Tvs {
    public static final InterfaceC71841X6z A05 = new Tw8();
    public final C65890Tvu A01;
    public final List A02;
    public final List A03;
    public final SparseBooleanArray A00 = new SparseBooleanArray();
    public final Map A04 = new C005001p(0);

    public final int A00(int i) {
        C65890Tvu c65890Tvu = (C65890Tvu) this.A04.get(C65902Tw7.A08);
        if (c65890Tvu != null) {
            return c65890Tvu.A05;
        }
        return i;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.01p, java.util.Map] */
    public C65888Tvs(List list, List list2) {
        this.A02 = list;
        this.A03 = list2;
        List list3 = this.A02;
        int size = list3.size();
        int i = Integer.MIN_VALUE;
        C65890Tvu c65890Tvu = null;
        for (int i2 = 0; i2 < size; i2++) {
            C65890Tvu c65890Tvu2 = (C65890Tvu) list3.get(i2);
            if (c65890Tvu2.A04 > i) {
                i = c65890Tvu2.A04;
                c65890Tvu = c65890Tvu2;
            }
        }
        this.A01 = c65890Tvu;
    }
}
