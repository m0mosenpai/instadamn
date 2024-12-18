package X;

/* renamed from: X.IbZ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41643IbZ {
    public IIS A00;
    public String A01;
    public String A02;
    public String A03;

    public final IIS A01() {
        IIS iis = this.A00;
        if (iis != null) {
            return iis;
        }
        C14360o3.A0F("layoutContent");
        throw C00O.createAndThrow();
    }

    public final String A02() {
        String str = this.A02;
        if (str != null) {
            return str;
        }
        C14360o3.A0F("sectionId");
        throw C00O.createAndThrow();
    }

    public final String A03() {
        String str = this.A03;
        if (str != null) {
            return str;
        }
        C14360o3.A0F("sectionType");
        throw C00O.createAndThrow();
    }

    public static boolean A00(C41643IbZ c41643IbZ, java.util.Set set) {
        return set.contains(c41643IbZ.A02());
    }
}
