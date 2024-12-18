package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.EPi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32407EPi extends C7E1 {
    public final ArrayList A00 = AbstractC166987dD.A1E();
    public final Context A01;
    public final ER2 A02;
    public final EQS A03;

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean isEmpty() {
        return this.A00.isEmpty();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.2y0, X.EQS] */
    public C32407EPi(Context context, C32373ENz c32373ENz, InterfaceC11380iw interfaceC11380iw) {
        this.A01 = context;
        ER2 er2 = new ER2(c32373ENz, interfaceC11380iw);
        this.A02 = er2;
        ?? obj = new Object();
        this.A03 = obj;
        A0B(obj, er2);
    }

    public static void A00(C32407EPi c32407EPi) {
        c32407EPi.A06();
        c32407EPi.A08(c32407EPi.A03, c32407EPi.A01.getString(2131952066));
        Iterator it = c32407EPi.A00.iterator();
        while (it.hasNext()) {
            c32407EPi.A08(c32407EPi.A02, it.next());
        }
        c32407EPi.A07();
    }
}
