package X;

/* renamed from: X.34s, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C680434s extends C0YY implements InterfaceC16620sF {
    public static final C680434s A00 = new C680434s();

    public C680434s() {
        super(2);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C38321qM c38321qM = (C38321qM) obj;
        C14360o3.A0B(c38321qM, 0);
        String id = c38321qM.getId();
        if (id != null) {
            return id;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
