package X;

import com.facebook.minscript.compiler.interfaces.MinsCompilerResult;
import com.facebook.react.views.webview.ReactWebViewManager;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: X.6Fc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C136246Fc {
    public static final Charset A06 = Charset.forName(ReactWebViewManager.HTML_ENCODING);
    public final String A00;
    public final ByteBuffer A01;
    public final Map A02;
    public final C136236Fb[] A03;
    public final AtomicReferenceArray A04;
    public final AtomicReferenceArray A05;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [X.6Fb, java.lang.Object] */
    public static C136246Fc A00(MinsCompilerResult minsCompilerResult) {
        ByteBuffer byteBuffer = minsCompilerResult.byteBuffer;
        HashMap hashMap = minsCompilerResult.lispyOffsetMap;
        ByteBuffer slice = byteBuffer.slice();
        slice.order(byteBuffer.order());
        int capacity = byteBuffer.capacity();
        int i = slice.getInt();
        int i2 = slice.getShort() & 65535;
        int i3 = 65535 & slice.getShort();
        if (i == -1397639502 && i2 == 1 && i3 == 0) {
            int i4 = slice.getInt();
            int i5 = slice.getInt();
            int position = byteBuffer.position();
            if (i4 <= capacity) {
                if (i4 >= position) {
                    int i6 = position + (i5 * 16);
                    if (i6 <= i4) {
                        C136236Fb[] c136236FbArr = new C136236Fb[i5];
                        for (int i7 = 0; i7 < i5; i7++) {
                            ?? obj = new Object();
                            obj.A00 = slice.getInt();
                            obj.A02 = slice.getInt();
                            obj.A01 = slice.getInt();
                            slice.getInt();
                            int i8 = obj.A02;
                            if (i8 % 4 == 0) {
                                int i9 = obj.A01;
                                if (i6 <= i8 && i8 + i9 <= i4) {
                                    c136236FbArr[i7] = obj;
                                } else {
                                    throw new C6W5(String.format("section index %d kind %d invalid offset/size", Integer.valueOf(i7), Integer.valueOf(obj.A00)));
                                }
                            } else {
                                throw new C6W5(String.format("section index %d kind %d invalid alignment", Integer.valueOf(i7), Integer.valueOf(obj.A00)));
                            }
                        }
                        if (i5 >= 4) {
                            int i10 = 0;
                            while (c136236FbArr[i10].A00 == i10) {
                                i10++;
                                if (i10 >= 4) {
                                    AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(c136236FbArr[0].A01 / 16);
                                    AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(c136236FbArr[1].A01 / 16);
                                    String str = "";
                                    for (int i11 = 4; i11 < i5; i11++) {
                                        C136236Fb c136236Fb = c136236FbArr[i11];
                                        if (c136236Fb.A00 == 4) {
                                            ByteBuffer duplicate = slice.duplicate();
                                            duplicate.position(c136236Fb.A02);
                                            duplicate.limit(c136236Fb.A02 + c136236Fb.A01);
                                            byte[] bArr = new byte[duplicate.remaining()];
                                            duplicate.get(bArr);
                                            str = new String(bArr, A06);
                                        }
                                    }
                                    return new C136246Fc(str, slice, hashMap, atomicReferenceArray, atomicReferenceArray2, c136236FbArr);
                                }
                            }
                            throw new C6W5(AnonymousClass001.A0O("missing required section ", i10));
                        }
                        throw new C6W5("less than required number of sections");
                    }
                    throw new C6W5("encoded size not enough for section headers");
                }
                throw new C6W5("encoded size is too small");
            }
            StringBuilder sb = new StringBuilder();
            sb.append("buffer is smaller than encoded size ");
            sb.append(i4);
            sb.append(" ");
            sb.append(capacity);
            sb.append(" byteBuffer.order:");
            sb.append(byteBuffer.order());
            sb.append(" native order:");
            sb.append(ByteOrder.nativeOrder());
            throw new C6W5(sb.toString());
        }
        throw new C6W5("invalid magic or version");
    }

    public final C136256Fd A01(int i) {
        AtomicReferenceArray atomicReferenceArray = this.A04;
        C136256Fd c136256Fd = (C136256Fd) atomicReferenceArray.get(i);
        if (c136256Fd == null) {
            int i2 = this.A03[0].A02 + (i * 16);
            ByteBuffer byteBuffer = this.A01;
            int i3 = byteBuffer.getInt(i2);
            int i4 = byteBuffer.getInt(i2 + 4);
            short s = byteBuffer.getShort(i2 + 8);
            byteBuffer.getShort(i2 + 10);
            C136256Fd c136256Fd2 = new C136256Fd(this, i3, i4, s);
            if (!C1AM.A00(null, c136256Fd2, atomicReferenceArray, i)) {
                return (C136256Fd) atomicReferenceArray.get(i);
            }
            return c136256Fd2;
        }
        return c136256Fd;
    }

    public final Object A02(int i) {
        AtomicReferenceArray atomicReferenceArray = this.A05;
        Object obj = atomicReferenceArray.get(i);
        if (obj == null) {
            int i2 = this.A03[1].A02 + (i * 16);
            ByteBuffer byteBuffer = this.A01;
            int i3 = byteBuffer.getInt(i2);
            int i4 = byteBuffer.getInt(i2 + 4);
            byteBuffer.getInt(i2 + 8);
            byteBuffer.getInt();
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.position(i3);
            duplicate.limit(i3 + i4);
            byte[] bArr = new byte[duplicate.remaining()];
            duplicate.get(bArr);
            String str = new String(bArr, A06);
            if (!C1AM.A00(null, str, atomicReferenceArray, i)) {
                return atomicReferenceArray.get(i);
            }
            return str;
        }
        return obj;
    }

    public C136246Fc(String str, ByteBuffer byteBuffer, Map map, AtomicReferenceArray atomicReferenceArray, AtomicReferenceArray atomicReferenceArray2, C136236Fb[] c136236FbArr) {
        this.A01 = byteBuffer;
        this.A03 = c136236FbArr;
        this.A00 = str;
        this.A04 = atomicReferenceArray;
        this.A05 = atomicReferenceArray2;
        this.A02 = map;
    }
}
