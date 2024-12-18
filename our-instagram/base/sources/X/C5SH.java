package X;

/* renamed from: X.5SH, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5SH {
    public static final C3YP A00(InterfaceC11380iw interfaceC11380iw) {
        if (AbstractC002300n.A0h(interfaceC11380iw.getModuleName(), "feed_timeline", false)) {
            return C3YP.A05;
        }
        if (AbstractC002300n.A0h(interfaceC11380iw.getModuleName(), "feed_contextual_", false)) {
            return C3YP.A03;
        }
        if (C14360o3.A0K(interfaceC11380iw.getModuleName(), "explore_popular")) {
            return C3YP.A04;
        }
        if (!AbstractC002300n.A0h(interfaceC11380iw.getModuleName(), "clips_", false)) {
            return null;
        }
        return C3YP.A06;
    }
}
