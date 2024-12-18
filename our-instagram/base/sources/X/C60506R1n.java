package X;

/* renamed from: X.R1n, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60506R1n extends C2JS implements XIQ {
    @Override // X.XIQ
    public final boolean BJu() {
        return getCoercedBooleanField(0, "is_synced");
    }

    @Override // X.XIQ
    public final boolean BvN() {
        return getCoercedBooleanField(1, "should_remind");
    }

    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        C95124Py c95124Py = C95124Py.A00;
        return AbstractC167017dG.A0Y(c95124Py, AbstractC166987dD.A0i(c95124Py, "is_synced"), "should_remind");
    }

    public C60506R1n(int i) {
        super(i);
    }

    public C60506R1n() {
        super(1272976757);
    }
}
