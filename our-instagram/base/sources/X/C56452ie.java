package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.LruCache;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: X.2ie, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C56452ie {
    public static final C02Q A05 = new C12550kz(2);
    public final Context A00;
    public final int[] A01;
    public final int[] A04;
    public final LruCache A03 = new LruCache(16);
    public final LruCache A02 = new LruCache() { // from class: X.2if
        {
            super(16);
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x01b1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r0v42, types: [X.2iy, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r5v7, types: [X.2ir, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, X.2it] */
        @Override // android.util.LruCache
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final /* bridge */ /* synthetic */ java.lang.Object create(java.lang.Object r17) {
            /*
                Method dump skipped, instructions count: 454
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C56462if.create(java.lang.Object):java.lang.Object");
        }
    };

    public final Drawable.ConstantState A00(int i, int i2) {
        if (i2 < 0) {
            return null;
        }
        int[] iArr = this.A01;
        if (i2 >= iArr.length) {
            return null;
        }
        int i3 = iArr[i2];
        if ((i3 & Integer.MIN_VALUE) != 0) {
            i2 = i3 ^ Integer.MIN_VALUE;
        }
        LruCache lruCache = this.A03;
        Integer valueOf = Integer.valueOf((i << 24) ^ i2);
        Drawable.ConstantState constantState = (Drawable.ConstantState) lruCache.get(valueOf);
        if (constantState != null) {
            return constantState;
        }
        AbstractC56582ir abstractC56582ir = (AbstractC56582ir) this.A02.get(Integer.valueOf(i2));
        if (abstractC56582ir == null) {
            return null;
        }
        C56672j0 c56672j0 = new C56672j0(null, null, PorterDuff.Mode.SRC_IN, new C56662iz(abstractC56582ir, i, i), 255, 119);
        lruCache.put(valueOf, c56672j0);
        return c56672j0;
    }

    public C56452ie(Context context, boolean z) {
        int[][] iArr;
        int[] iArr2;
        InputStream open;
        Context applicationContext = context.getApplicationContext();
        this.A00 = applicationContext;
        try {
            open = applicationContext.getResources().getAssets().open("igic.bin");
            try {
            } finally {
            }
        } catch (IOException unused) {
            iArr = null;
        }
        if (open.available() >= 4) {
            byte[] bArr = new byte[4];
            if (open.read(bArr, 0, 4) == 4) {
                ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, 4);
                int i = wrap.getChar();
                int i2 = wrap.getChar();
                int i3 = i * 4;
                int i4 = i2 * 2;
                byte[] bArr2 = new byte[Math.max(i3, i4)];
                if (open.read(bArr2, 0, i3) == i3) {
                    int[] iArr3 = new int[i];
                    ByteBuffer.wrap(bArr2, 0, i3).asIntBuffer().get(iArr3);
                    if (open.read(bArr2, 0, i4) == i4) {
                        char[] cArr = new char[i2];
                        ByteBuffer.wrap(bArr2, 0, i4).asCharBuffer().get(cArr);
                        int[] iArr4 = new int[i2 + 1];
                        int i5 = i3 + 4 + i4;
                        for (int i6 = 0; i6 < i2; i6++) {
                            char c = cArr[i6];
                            if ((c & 32768) != 0) {
                                iArr4[i6] = (c ^ 32768) | Integer.MIN_VALUE;
                            } else {
                                iArr4[i6] = i5;
                                i5 += c;
                            }
                        }
                        iArr4[i2] = i5;
                        iArr = new int[][]{iArr3, iArr4};
                        open.close();
                        if (iArr == null) {
                            iArr2 = new int[0];
                            this.A04 = iArr2;
                        } else {
                            this.A04 = iArr[0];
                            iArr2 = iArr[1];
                        }
                        this.A01 = iArr2;
                        if (z) {
                            Paint paint = new Paint();
                            paint.setColor(1073807359);
                            C56792jC.A07 = paint;
                            return;
                        }
                        return;
                    }
                    throw new RuntimeException("Unable to read icon length data");
                }
                throw new RuntimeException("Unable to read hashes");
            }
        }
    }
}
