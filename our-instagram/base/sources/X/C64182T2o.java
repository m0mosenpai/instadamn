package X;

/* renamed from: X.T2o, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64182T2o implements TmN {
    public static final C64182T2o A00 = new Object();

    public final AbstractC910944l A00(C910844k c910844k) {
        Class<?> cls = getClass();
        AbstractC910944l A0B = c910844k.A09(cls).A0B(TmN.class);
        if (A0B != null && ((AbstractC911744t) A0B).A01.A01.length >= 2) {
            return A0B;
        }
        throw AbstractC31175DnJ.A0V("Cannot find OUT type parameter for Converter of type ", cls.getName());
    }

    @Override // X.TmN
    public final /* bridge */ /* synthetic */ Object AK2(Object obj) {
        return obj;
    }

    @Override // X.TmN
    public final AbstractC910944l BI9(C910844k c910844k) {
        return A00(c910844k).A07(0);
    }

    @Override // X.TmN
    public final AbstractC910944l BaK(C910844k c910844k) {
        return A00(c910844k).A07(1);
    }
}
