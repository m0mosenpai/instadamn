package X;

/* renamed from: X.Unn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67549Unn extends C2JS implements C2JT {
    public final C67055Ufg A0E() {
        return (C67055Ufg) getOptionalTreeField(3, "time_spent", C67055Ufg.class, -1536523719);
    }

    public final C67056Ufh A0F() {
        return (C67056Ufh) getOptionalTreeField(5, "viewable_time_spent", C67056Ufh.class, -8193099);
    }

    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        C95124Py c95124Py = C95124Py.A00;
        return new C4OU(new C4OM[]{new C4OW(c95124Py, "is_snapl_session_found"), new C4OW(c95124Py, "is_legacy_session_found"), AbstractC166997dE.A0V(C94754Oe.A00), new C4OK(C67055Ufg.class, "time_spent", -1536523719), new C4OK(C67054Uff.class, "play_count", 851574623), new C4OK(C67056Ufh.class, "viewable_time_spent", -8193099)});
    }

    public C67549Unn(int i) {
        super(i);
    }

    public C67549Unn() {
        super(514366707);
    }
}
