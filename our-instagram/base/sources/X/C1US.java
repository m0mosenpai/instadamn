package X;

import com.facebook.react.views.webview.ReactWebViewManager;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Locale;

/* renamed from: X.1US, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1US extends C1UT {
    public static final Charset A05 = Charset.forName(ReactWebViewManager.HTML_ENCODING);
    public final int A00;
    public final ByteBuffer A01;
    public final int A02;
    public final String A03;
    public final java.util.Set A04;

    @Override // X.C1UT
    public final C79833hY A01(int i, int i2) {
        return null;
    }

    @Override // X.C1UT
    public final String[] A04(int i, int i2) {
        return null;
    }

    @Override // X.C1UT
    public final String A02(int i, int i2) {
        boolean equals = this.A03.equals(Locale.ENGLISH.getLanguage());
        if (i == 2131956536 && equals) {
            return "%1$s is having trouble with Google Play services. Please try again.";
        }
        int i3 = i & 65535;
        int i4 = this.A02 - 1;
        int i5 = 0;
        while (i5 <= i4) {
            int i6 = (i5 + i4) >> 1;
            int i7 = (i6 * 6) + 12;
            ByteBuffer byteBuffer = this.A01;
            int i8 = byteBuffer.getShort(i7) & 65535;
            int i9 = byteBuffer.getShort(i7 + 2) & 65535;
            int i10 = byteBuffer.getShort(i7 + 4) & 65535;
            if (i3 >= i8 && i3 < i9 + i8) {
                int i11 = byteBuffer.getInt(this.A00 + (((i3 - i8) + i10) * 4));
                int i12 = byteBuffer.getShort(i11) & 65535;
                int i13 = i11 + 2;
                if (byteBuffer.hasArray()) {
                    return new String(byteBuffer.array(), byteBuffer.arrayOffset() + i13, i12, A05);
                }
                byte[] bArr = new byte[i12];
                for (int i14 = 0; i14 < i12; i14++) {
                    bArr[i14] = byteBuffer.get(i13 + i14);
                }
                return new String(bArr, A05);
            }
            if (i3 < i8) {
                i4 = i6 - 1;
            } else {
                i5 = i6 + 1;
            }
        }
        if (equals) {
            java.util.Set set = this.A04;
            Integer valueOf = Integer.valueOf(i);
            if (!set.contains(valueOf)) {
                set.add(valueOf);
                C0K8.A0P("FrscLanguagePack", "FRSC English string not found for ID #0x%s", Integer.toHexString(i));
                return null;
            }
            return null;
        }
        return null;
    }

    public C1US(String str, ByteBuffer byteBuffer) {
        this.A03 = str;
        this.A01 = byteBuffer;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        int i = byteBuffer.getInt(0);
        if (i == 1129534022) {
            int i2 = byteBuffer.getInt(4);
            this.A02 = i2;
            if (i2 >= 0) {
                int i3 = byteBuffer.getInt(8);
                this.A00 = i3;
                if (i3 >= 12) {
                    this.A04 = new HashSet();
                    return;
                }
                throw new IllegalStateException();
            }
            throw new IllegalStateException();
        }
        throw new RuntimeException(AnonymousClass001.A0R("Invalid FRSC format. Incorrect magic number: 0x", Integer.toHexString(i)));
    }
}
