package X;

import java.util.RandomAccess;

/* renamed from: X.09t, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C024509t extends AbstractC06990Yq<Byte> implements RandomAccess {
    public final /* synthetic */ byte[] A00;

    public C024509t(byte[] bArr) {
        this.A00 = bArr;
    }

    @Override // X.AbstractC17040sw
    public final int A08() {
        return this.A00.length;
    }

    @Override // X.AbstractC17040sw, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Byte) {
            byte byteValue = ((Number) obj).byteValue();
            byte[] bArr = this.A00;
            int length = bArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (byteValue == bArr[i]) {
                    if (i < 0) {
                        break;
                    }
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    @Override // X.AbstractC06990Yq, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return Byte.valueOf(this.A00[i]);
    }

    @Override // X.AbstractC06990Yq, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Byte) {
            byte byteValue = ((Number) obj).byteValue();
            byte[] bArr = this.A00;
            int length = bArr.length;
            for (int i = 0; i < length; i++) {
                if (byteValue == bArr[i]) {
                    return i;
                }
            }
        }
        return -1;
    }

    @Override // X.AbstractC17040sw, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        if (this.A00.length != 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (r2 >= 0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0011, code lost:
    
        r1 = r2 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        if (r4 == r3[r2]) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
    
        r2 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        if (r1 >= 0) goto L14;
     */
    @Override // X.AbstractC06990Yq, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ int lastIndexOf(java.lang.Object r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof java.lang.Byte
            if (r0 == 0) goto L1a
            java.lang.Number r6 = (java.lang.Number) r6
            byte r4 = r6.byteValue()
            byte[] r3 = r5.A00
            int r0 = r3.length
            int r2 = r0 + (-1)
            if (r2 < 0) goto L1a
        L11:
            int r1 = r2 + (-1)
            r0 = r3[r2]
            if (r4 == r0) goto L1b
            r2 = r1
            if (r1 >= 0) goto L11
        L1a:
            r2 = -1
        L1b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C024509t.lastIndexOf(java.lang.Object):int");
    }
}
