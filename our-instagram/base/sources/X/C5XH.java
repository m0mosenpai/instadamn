package X;

/* renamed from: X.5XH, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5XH extends C5Ti {
    public static final C5XH A00 = new C5XH();

    public C5XH() {
        super(1, 2);
    }

    @Override // X.C5Ti
    public final String A00(int i) {
        if (i == 0) {
            return "insertIndex";
        }
        return AnonymousClass001.A0I("IntParameter(", ')', i);
    }

    @Override // X.C5Ti
    public final String A01(int i) {
        if (i == 0) {
            return "factory";
        }
        if (i == 1) {
            return "groupAnchor";
        }
        return AnonymousClass001.A0I("ObjectParameter(", ')', i);
    }
}
