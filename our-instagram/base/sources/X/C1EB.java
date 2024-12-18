package X;

/* renamed from: X.1EB, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1EB extends C0YY implements InterfaceC16620sF {
    public static final C1EB A00 = new C1EB();

    public C1EB() {
        super(2);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C4HU c4hu = (C4HU) obj;
        C12V c12v = (C12V) obj2;
        if (c12v instanceof C1EC) {
            C1EC c1ec = (C1EC) c12v;
            C4HS c4hs = (C4HS) c1ec;
            ThreadLocal threadLocal = c4hs.A01;
            Object obj3 = threadLocal.get();
            threadLocal.set(c4hs.A00);
            Object[] objArr = c4hu.A02;
            int i = c4hu.A00;
            objArr[i] = obj3;
            C1EC[] c1ecArr = c4hu.A03;
            c4hu.A00 = i + 1;
            c1ecArr[i] = c1ec;
        }
        return c4hu;
    }
}
