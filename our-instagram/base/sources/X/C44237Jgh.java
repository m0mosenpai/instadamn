package X;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: X.Jgh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44237Jgh {
    public final C51756Mtf A00;
    public final String A01;
    public final List A02;
    public final Map A03;
    public final byte[] A04;

    public C44237Jgh(C51756Mtf c51756Mtf, String str, List list, Map map, byte[] bArr) {
        C14360o3.A0B(bArr, 2);
        this.A01 = str;
        this.A04 = bArr;
        this.A03 = map;
        this.A02 = list;
        this.A00 = c51756Mtf;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ShowreelNativeRenderableDocument{name='");
        A1C.append(this.A01);
        A1C.append("', document=");
        String arrays = Arrays.toString(this.A04);
        C14360o3.A07(arrays);
        A1C.append(arrays);
        A1C.append(", bitmaps=");
        A1C.append(this.A03);
        A1C.append(", states=");
        A1C.append(this.A02);
        A1C.append(", metadata=");
        A1C.append(this.A00);
        return AbstractC167027dH.A0R(A1C);
    }
}
