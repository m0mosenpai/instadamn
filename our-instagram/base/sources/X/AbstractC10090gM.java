package X;

/* renamed from: X.0gM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10090gM {
    public static final C01G A04(java.util.Set set) {
        C01G c01g = (C01G) set;
        C06860Yd c06860Yd = c01g.A00;
        c06860Yd.A05();
        c06860Yd.A08 = true;
        if (c06860Yd.size() <= 0) {
            C14360o3.A0C(C06860Yd.A0D, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        }
        if (c01g.size() <= 0) {
            return C01G.A01;
        }
        return c01g;
    }
}
