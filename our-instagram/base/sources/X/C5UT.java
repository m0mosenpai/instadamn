package X;

/* renamed from: X.5UT, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5UT {
    /* JADX WARN: Type inference failed for: r5v0, types: [X.5VS, X.5VR, java.util.Map] */
    public static final C59O A00(C59P c59p, C59P c59p2, C117685Ud[] c117685UdArr) {
        C59O c59o = C59O.A00;
        ?? c5vs = new C5VS(c59o);
        c5vs.A00 = c59o;
        for (C117685Ud c117685Ud : c117685UdArr) {
            C5UQ c5uq = c117685Ud.A01;
            C14360o3.A0C(c5uq, "null cannot be cast to non-null type androidx.compose.runtime.ProvidableCompositionLocal<kotlin.Any?>");
            if (!c117685Ud.A00) {
                C14360o3.A0C(c5uq, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
                if (c59p.containsKey(c5uq)) {
                }
            }
            c5vs.put(c5uq, c5uq.A01(c117685Ud, (C5US) c59p2.get(c5uq)));
        }
        return c5vs.A06();
    }

    public static final Object A01(C5UQ c5uq, C59P c59p) {
        C14360o3.A0C(c5uq, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        Object obj = c59p.get(c5uq);
        if (obj == null) {
            obj = c5uq.A00();
        }
        return ((C5US) obj).E8W(c59p);
    }
}
