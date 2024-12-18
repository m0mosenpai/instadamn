package X;

/* renamed from: X.3YW, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3YW {
    public static final boolean A00(C3XG c3xg) {
        if (c3xg == null) {
            return false;
        }
        C1XV c1xv = c3xg.A06;
        if (c1xv != C1XV.A0Y && c1xv != C1XV.A0l) {
            if (c1xv != C1XV.A0K && c1xv != C1XV.A0T) {
                return false;
            }
        } else {
            C38321qM A02 = C3XH.A02(c3xg.A05);
            if (A02 == null || !A02.CdW()) {
                return false;
            }
        }
        return true;
    }

    public static final boolean A02(C3XG c3xg) {
        C14360o3.A0B(c3xg, 0);
        return C3YV.A09(C3XH.A02(c3xg.A05));
    }

    public static final boolean A03(C3XG c3xg) {
        if (c3xg == null) {
            return false;
        }
        C1XV c1xv = c3xg.A06;
        if (c1xv == C1XV.A0m) {
            InterfaceC38381qS interfaceC38381qS = c3xg.A05;
            C14360o3.A0C(interfaceC38381qS, "null cannot be cast to non-null type com.instagram.feed.feeditem.StoriesNetegoItem");
            Boolean bool = ((C101274gj) interfaceC38381qS).A00.A03;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }
        if (c1xv == C1XV.A0C) {
            InterfaceC38381qS interfaceC38381qS2 = c3xg.A05;
            C14360o3.A0C(interfaceC38381qS2, "null cannot be cast to non-null type com.instagram.feed.feeditem.ClipsNetego");
            return ((C76403bk) interfaceC38381qS2).A0P;
        }
        if (c1xv != C1XV.A0v) {
            return (c3xg.A05 instanceof InterfaceC73233Pz) && c1xv != C1XV.A0K;
        }
        InterfaceC38381qS interfaceC38381qS3 = c3xg.A05;
        C14360o3.A0C(interfaceC38381qS3, "null cannot be cast to non-null type com.instagram.feed.su.model.SuggestedUsers");
        return !((C47K) interfaceC38381qS3).A09();
    }

    public static final boolean A04(C3XG c3xg) {
        C38321qM A02;
        C14360o3.A0B(c3xg, 0);
        if (c3xg.A06 == C1XV.A0Y && (A02 = C3XH.A02(c3xg.A05)) != null && !A02.CdW()) {
            return true;
        }
        return false;
    }

    public static final boolean A01(C3XG c3xg) {
        if (!A00(c3xg) && !A03(c3xg)) {
            return false;
        }
        return true;
    }
}
