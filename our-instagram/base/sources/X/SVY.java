package X;

import kotlin.enums.EnumEntries;

/* loaded from: classes10.dex */
public abstract class SVY {
    public final int A00;

    static {
        EnumEntries enumEntries = EnumC61186Rgm.A04;
    }

    public SVY(int i) {
        if (i != 16 && i != 32) {
            throw new Exception(AnonymousClass001.A0O("Unsupported key length: ", i));
        }
        this.A00 = i;
    }
}
