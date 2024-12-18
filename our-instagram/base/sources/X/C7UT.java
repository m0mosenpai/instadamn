package X;

/* renamed from: X.7UT, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7UT {
    public final C7UV[] A00 = {new Object(), new Object()};

    public final String A00(String str) {
        C7UV[] c7uvArr = this.A00;
        int i = 0;
        do {
            C7UV c7uv = c7uvArr[i];
            if (c7uv.Cni(str)) {
                String hexString = Integer.toHexString(c7uv.ELX(str).hashCode());
                C14360o3.A07(hexString);
                return hexString;
            }
            i++;
        } while (i < 2);
        throw new IllegalArgumentException(AnonymousClass001.A0R("Cannot find Sanitizer for url=", str));
    }
}
