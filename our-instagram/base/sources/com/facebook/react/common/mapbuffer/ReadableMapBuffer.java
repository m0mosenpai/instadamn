package com.facebook.react.common.mapbuffer;

import X.AbstractC001800i;
import X.AbstractC167027dH;
import X.AbstractC25230BEn;
import X.AbstractC43593JPy;
import X.AbstractC58318PtA;
import X.AbstractC58320PtC;
import X.AbstractC58322PtE;
import X.C14360o3;
import X.C15W;
import X.C62156S0d;
import X.C65044TcZ;
import X.EnumC61135Rfp;
import X.InterfaceC72045XLb;
import X.MSY;
import X.STW;
import X.TTC;
import com.facebook.jni.HybridData;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final class ReadableMapBuffer implements InterfaceC72045XLb {
    public static final C62156S0d Companion = new Object();
    public final ByteBuffer buffer;
    public int count;
    public final HybridData mHybridData;
    public final int offsetToMapBuffer;

    private final native ByteBuffer importByteBuffer();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.S0d] */
    static {
        STW.A00();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000b, code lost:
    
        if (r1 > r9) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int getBucketIndexForKey(int r9) {
        /*
            r8 = this;
            X.17u r0 = X.W11.A00
            int r1 = r0.A00
            int r0 = r0.A01
            r7 = 0
            r6 = 1
            if (r9 > r0) goto Ld
            r0 = 1
            if (r1 <= r9) goto Le
        Ld:
            r0 = 0
        Le:
            r5 = -1
            if (r0 == 0) goto L3b
            short r4 = (short) r9
            int r3 = r8.count
            int r3 = r3 - r6
        L15:
            if (r7 > r3) goto L3b
            int r2 = r7 + r3
            int r2 = r2 >>> r6
            int r0 = r8.offsetToMapBuffer
            int r1 = r0 + 8
            int r0 = r2 * 12
            int r1 = r1 + r0
            java.nio.ByteBuffer r0 = r8.buffer
            short r1 = r0.getShort(r1)
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r0
            r0 = r0 & r4
            int r0 = X.C14360o3.A00(r1, r0)
            if (r0 >= 0) goto L35
            int r7 = r2 + 1
            goto L15
        L35:
            if (r0 <= 0) goto L3a
            int r3 = r2 + (-1)
            goto L15
        L3a:
            return r2
        L3b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.common.mapbuffer.ReadableMapBuffer.getBucketIndexForKey(int):int");
    }

    private final void readHeader() {
        if (this.buffer.getShort() != 254) {
            this.buffer.order(ByteOrder.LITTLE_ENDIAN);
        }
        this.count = this.buffer.getShort(this.buffer.position()) & 65535;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String readStringValue(int i) {
        int i2 = this.offsetToMapBuffer + 8 + (this.count * 12) + this.buffer.getInt(i);
        int i3 = this.buffer.getInt(i2);
        byte[] bArr = new byte[i3];
        this.buffer.position(i2 + 4);
        this.buffer.get(bArr, 0, i3);
        return AbstractC58318PtA.A0m(C15W.A05, bArr);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ReadableMapBuffer)) {
            return false;
        }
        ByteBuffer byteBuffer = this.buffer;
        ByteBuffer byteBuffer2 = ((ReadableMapBuffer) obj).buffer;
        if (byteBuffer == byteBuffer2) {
            return true;
        }
        byteBuffer.rewind();
        byteBuffer2.rewind();
        return byteBuffer.equals(byteBuffer2);
    }

    @Override // X.InterfaceC72045XLb
    public boolean getBoolean(int i) {
        return AbstractC43593JPy.A1Y(this.buffer.getInt(getTypedValueOffsetForKey(i, EnumC61135Rfp.A02)));
    }

    @Override // X.InterfaceC72045XLb
    public int getCount() {
        return this.count;
    }

    @Override // X.InterfaceC72045XLb
    public double getDouble(int i) {
        return this.buffer.getDouble(getTypedValueOffsetForKey(i, EnumC61135Rfp.A03));
    }

    @Override // X.InterfaceC72045XLb
    public int getInt(int i) {
        return this.buffer.getInt(getTypedValueOffsetForKey(i, EnumC61135Rfp.A04));
    }

    @Override // X.InterfaceC72045XLb
    public /* bridge */ /* synthetic */ InterfaceC72045XLb getMapBuffer(int i) {
        int typedValueOffsetForKey = getTypedValueOffsetForKey(i, EnumC61135Rfp.A06);
        return new ReadableMapBuffer(this.buffer, this.offsetToMapBuffer + 8 + (this.count * 12) + this.buffer.getInt(typedValueOffsetForKey) + 4);
    }

    @Override // X.InterfaceC72045XLb
    public String getString(int i) {
        return readStringValue(getTypedValueOffsetForKey(i, EnumC61135Rfp.A07));
    }

    public int hashCode() {
        this.buffer.rewind();
        return this.buffer.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new TTC(this);
    }

    public ReadableMapBuffer(ByteBuffer byteBuffer, int i) {
        this.mHybridData = null;
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position(i);
        this.buffer = duplicate;
        this.offsetToMapBuffer = i;
        readHeader();
    }

    private final int getTypedValueOffsetForKey(int i, EnumC61135Rfp enumC61135Rfp) {
        int bucketIndexForKey = getBucketIndexForKey(i);
        if (bucketIndexForKey != -1) {
            int i2 = bucketIndexForKey * 12;
            EnumC61135Rfp enumC61135Rfp2 = EnumC61135Rfp.values()[this.buffer.getShort(this.offsetToMapBuffer + 8 + i2 + 2) & 65535];
            if (enumC61135Rfp2 == enumC61135Rfp) {
                return this.offsetToMapBuffer + 8 + i2 + 4;
            }
            StringBuilder A0t = AbstractC58322PtE.A0t();
            A0t.append(enumC61135Rfp);
            A0t.append(" for key: ");
            A0t.append(i);
            A0t.append(", found ");
            A0t.append(enumC61135Rfp2);
            throw AbstractC58320PtC.A0o(" instead.", A0t);
        }
        throw AbstractC25230BEn.A0n("Key not found: ", i);
    }

    @Override // X.InterfaceC72045XLb
    public boolean contains(int i) {
        return MSY.A1S(getBucketIndexForKey(i), -1);
    }

    public String toString() {
        StringBuilder A0s = AbstractC58318PtA.A0s("{");
        AbstractC001800i.A0q(A0s, ", ", "", "", this, C65044TcZ.A00);
        String A0R = AbstractC167027dH.A0R(A0s);
        C14360o3.A07(A0R);
        return A0R;
    }

    public ReadableMapBuffer(HybridData hybridData) {
        this.mHybridData = hybridData;
        this.buffer = importByteBuffer();
        this.offsetToMapBuffer = 0;
        readHeader();
    }
}
