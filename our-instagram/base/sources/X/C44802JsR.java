package X;

import java.util.List;

/* renamed from: X.JsR, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44802JsR extends AbstractC08380c0 {
    public final /* synthetic */ K5O A00;

    public C44802JsR(K5O k5o) {
        this.A00 = k5o;
    }

    @Override // X.AbstractC08380c0, X.InterfaceC021908q
    public final void onPageSelected(int i) {
        K5O k5o = this.A00;
        List list = k5o.A05;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                List list2 = k5o.A05;
                C14360o3.A0A(list2);
                list2.get(i2);
            }
        }
    }
}
