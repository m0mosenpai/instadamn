package X;

import java.util.Map;

/* renamed from: X.Sd8, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63104Sd8 {
    public static final Map A01 = AbstractC166987dD.A1G();
    public static final Map A00 = AbstractC166987dD.A1G();

    public static Object A00(Class cls) {
        String name = cls.getName();
        try {
            return Class.forName(AnonymousClass001.A0R(name, "$$PropsSetter")).newInstance();
        } catch (ClassNotFoundException unused) {
            C0I2.A04("ViewManagerPropertyUpdater", AbstractC167017dG.A0n(cls, "Could not find generated setter for ", AbstractC166987dD.A1C()));
            return null;
        } catch (IllegalAccessException | InstantiationException e) {
            throw AbstractC58318PtA.A0e(AnonymousClass001.A0R("Unable to instantiate methods getter for ", name), e);
        }
    }
}
