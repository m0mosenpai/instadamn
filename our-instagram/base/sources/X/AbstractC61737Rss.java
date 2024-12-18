package X;

import java.io.ByteArrayOutputStream;

/* renamed from: X.Rss, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61737Rss {
    public static final byte[] A00(C63170SeV c63170SeV, C63170SeV c63170SeV2, C63170SeV c63170SeV3) {
        AbstractC167027dH.A12(c63170SeV, c63170SeV2, c63170SeV3);
        ByteArrayOutputStream A0U = AbstractC58318PtA.A0U();
        A0U.write(c63170SeV.A01());
        A0U.write(c63170SeV2.A01());
        A0U.write(c63170SeV3.A01());
        byte[] byteArray = A0U.toByteArray();
        C14360o3.A07(byteArray);
        return byteArray;
    }
}
