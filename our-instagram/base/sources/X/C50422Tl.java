package X;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.SparseIntArray;
import android.util.TypedValue;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: X.2Tl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50422Tl {
    public static int A06;
    public static final long[] A07 = new long[25];
    public int A00;
    public SparseIntArray A01;
    public SparseIntArray A02;
    public boolean A03;
    public final C5G8 A04;
    public final C2U0 A05;

    public static boolean A02(Resources resources, TypedValue typedValue, int i) {
        try {
            resources.getValue(i, typedValue, false);
            return true;
        } catch (Resources.NotFoundException e) {
            String A0R = AnonymousClass001.A0R("Unable to getValue for resource #0x", Integer.toHexString(i));
            C0I3 c0i3 = C0I2.A00;
            if (c0i3.isLoggable(6)) {
                c0i3.wtf(C50422Tl.class.getSimpleName(), A0R, e);
            }
            return false;
        }
    }

    public static int A00(Resources resources, Boolean bool) {
        Configuration configuration = resources.getConfiguration();
        int i = ((((((((527 + configuration.orientation) * 31) + configuration.screenLayout) * 31) + configuration.colorMode) * 31) + configuration.uiMode) * 31) + configuration.densityDpi;
        if (bool.booleanValue()) {
            return Math.abs((i * 31) + resources.hashCode());
        }
        return i;
    }

    private void A01(InputStream inputStream) {
        if (inputStream.available() >= 8) {
            byte[] bArr = new byte[8];
            inputStream.read(bArr);
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int i = wrap.getInt();
            int i2 = wrap.getInt();
            int i3 = (i + i2) * 8;
            byte[] A01 = C15V.A01(inputStream, i3);
            if (A01.length == i3) {
                ByteBuffer wrap2 = ByteBuffer.wrap(A01);
                SparseIntArray sparseIntArray = new SparseIntArray(i);
                for (int i4 = 0; i4 < i; i4++) {
                    sparseIntArray.append(wrap2.getInt(), wrap2.getInt());
                }
                this.A02 = sparseIntArray;
                SparseIntArray sparseIntArray2 = new SparseIntArray(i2);
                for (int i5 = 0; i5 < i2; i5++) {
                    sparseIntArray2.append(wrap2.getInt(), wrap2.getInt());
                }
                this.A01 = sparseIntArray2;
                return;
            }
            throw new IllegalStateException("Custom drawable file missing entries");
        }
        throw new IllegalStateException("Invalid custom drawables file");
    }

    /* JADX WARN: Code restructure failed: missing block: B:178:0x00e5, code lost:
    
        if (r1 != null) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:135:0x024c A[Catch: all -> 0x027c, LOOP:2: B:133:0x0246->B:135:0x024c, LOOP_END, TryCatch #5 {all -> 0x027c, blocks: (B:132:0x0231, B:133:0x0246, B:135:0x024c, B:137:0x025d, B:138:0x0260, B:140:0x0266), top: B:131:0x0231 }] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0266 A[Catch: all -> 0x027c, LOOP:3: B:138:0x0260->B:140:0x0266, LOOP_END, TRY_LEAVE, TryCatch #5 {all -> 0x027c, blocks: (B:132:0x0231, B:133:0x0246, B:135:0x024c, B:137:0x025d, B:138:0x0260, B:140:0x0266), top: B:131:0x0231 }] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x015a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C50422Tl(android.content.res.Resources r11, java.io.File r12, int[] r13) {
        /*
            Method dump skipped, instructions count: 742
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50422Tl.<init>(android.content.res.Resources, java.io.File, int[]):void");
    }
}
