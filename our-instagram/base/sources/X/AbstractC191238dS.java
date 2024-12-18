package X;

/* renamed from: X.8dS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC191238dS {
    public static final EnumC114925Hg A00(C55U c55u) {
        C14360o3.A0B(c55u, 0);
        if (c55u.equals(C81S.A00)) {
            return EnumC114925Hg.LIVE;
        }
        if (c55u.equals(C208509Kk.A00)) {
            return EnumC114925Hg.STORY;
        }
        if (c55u.equals(C81T.A00)) {
            return EnumC114925Hg.DIRECT_THREAD;
        }
        if (c55u instanceof C81V) {
            return EnumC114925Hg.CLIPS;
        }
        if (c55u.equals(C128535rM.A00)) {
            return EnumC114925Hg.FEED;
        }
        if (c55u.equals(C1811281o.A00)) {
            return EnumC114925Hg.IGTV;
        }
        if (c55u.equals(C1811381p.A00)) {
            return EnumC114925Hg.TEMPLATES;
        }
        if (c55u.equals(C1811481q.A00)) {
            return EnumC114925Hg.NOTE;
        }
        if (c55u.equals(C1811581r.A00)) {
            return EnumC114925Hg.PROFILE;
        }
        if (c55u.equals(C81Q.A00)) {
            return EnumC114925Hg.POTATO;
        }
        if (c55u.equals(C81R.A00)) {
            return EnumC114925Hg.QUICK_SNAP;
        }
        throw new RuntimeException();
    }

    public static final AnonymousClass859 A01(C55U c55u) {
        C14360o3.A0B(c55u, 0);
        if (c55u instanceof C81V) {
            return AnonymousClass859.A06;
        }
        if (c55u.equals(C81S.A00)) {
            return AnonymousClass859.A05;
        }
        if (c55u.equals(C81T.A00)) {
            return AnonymousClass859.A04;
        }
        return AnonymousClass859.A08;
    }
}
