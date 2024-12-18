package X;

import java.util.List;

/* renamed from: X.9IL, reason: invalid class name */
/* loaded from: classes4.dex */
public final /* synthetic */ class C9IL implements Runnable {
    public final /* synthetic */ List A00;

    public /* synthetic */ C9IL(List list) {
        this.A00 = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List list = this.A00;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((C124005jE) list.get(i)).A04();
        }
    }
}
