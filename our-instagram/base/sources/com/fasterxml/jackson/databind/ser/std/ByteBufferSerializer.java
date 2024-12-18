package com.fasterxml.jackson.databind.ser.std;

import X.AbstractC913345m;
import X.AnonymousClass182;
import X.C61036Re8;
import X.C911944v;
import java.nio.ByteBuffer;

/* loaded from: classes10.dex */
public class ByteBufferSerializer extends StdScalarSerializer {
    public ByteBufferSerializer() {
        super(ByteBuffer.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final /* bridge */ /* synthetic */ void A0A(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, Object obj) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        if (byteBuffer.hasArray()) {
            int position = byteBuffer.position();
            anonymousClass182.A0j(C911944v.A01, byteBuffer.array(), byteBuffer.arrayOffset() + position, byteBuffer.limit() - position);
            return;
        }
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        if (asReadOnlyBuffer.position() > 0) {
            asReadOnlyBuffer.rewind();
        }
        C61036Re8 c61036Re8 = new C61036Re8(asReadOnlyBuffer);
        anonymousClass182.A0Y(C911944v.A01, c61036Re8, asReadOnlyBuffer.remaining());
        c61036Re8.close();
    }
}
