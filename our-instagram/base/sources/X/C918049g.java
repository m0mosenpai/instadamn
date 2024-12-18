package X;

import com.google.common.collect.CompactHashMap;

/* renamed from: X.49g, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C918049g extends AbstractC918149h {
    public int A00;
    public final Object A01;
    public final /* synthetic */ CompactHashMap A02;

    public C918049g(final CompactHashMap this$0, int index) {
        this.A02 = this$0;
        Object[] objArr = this$0.keys;
        objArr.getClass();
        this.A01 = objArr[index];
        this.A00 = index;
    }

    public static void A00(C918049g c918049g) {
        int i = c918049g.A00;
        if (i != -1) {
            CompactHashMap compactHashMap = c918049g.A02;
            if (i < compactHashMap.size()) {
                Object obj = c918049g.A01;
                int i2 = c918049g.A00;
                Object[] objArr = compactHashMap.keys;
                objArr.getClass();
                if (AbstractC50102Ry.A00(obj, objArr[i2])) {
                    return;
                }
            }
        }
        c918049g.A00 = CompactHashMap.A00(c918049g.A02, c918049g.A01);
    }
}
