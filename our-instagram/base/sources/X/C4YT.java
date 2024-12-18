package X;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: X.4YT, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C4YT implements C4YU {
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
    
        if (r2.arrayOffset() != 0) goto L8;
     */
    @Override // X.C4YU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.exoplayer2.metadata.Metadata ANl(X.C96304Uo r4) {
        /*
            r3 = this;
            java.nio.ByteBuffer r2 = r4.A02
            r2.getClass()
            int r0 = r2.position()
            if (r0 != 0) goto L18
            boolean r0 = r2.hasArray()
            if (r0 == 0) goto L18
            int r1 = r2.arrayOffset()
            r0 = 1
            if (r1 == 0) goto L19
        L18:
            r0 = 0
        L19:
            X.C4B8.A03(r0)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = r4.A00
            r0 = r0 & r1
            if (r0 != r1) goto L25
            r0 = 0
            return r0
        L25:
            com.google.android.exoplayer2.metadata.Metadata r0 = r3.A06(r4, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4YT.ANl(X.4Uo):com.google.android.exoplayer2.metadata.Metadata");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.4ac] */
    public Metadata A06(C96304Uo c96304Uo, ByteBuffer byteBuffer) {
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        ?? obj = new Object();
        obj.A02 = array;
        obj.A00 = limit;
        String A09 = obj.A09();
        A09.getClass();
        String A092 = obj.A09();
        A092.getClass();
        return new Metadata(new EventMessage(A09, A092, Arrays.copyOfRange(obj.A02, obj.A01, obj.A00), obj.A06(), obj.A06()));
    }
}
