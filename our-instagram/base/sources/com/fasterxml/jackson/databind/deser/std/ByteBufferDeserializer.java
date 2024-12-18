package com.fasterxml.jackson.databind.deser.std;

import X.AnonymousClass469;
import X.C05F;
import X.C16L;
import X.C45T;
import X.C61045ReH;
import X.C911944v;
import java.nio.ByteBuffer;

/* loaded from: classes10.dex */
public class ByteBufferDeserializer extends StdScalarDeserializer {
    public ByteBufferDeserializer() {
        super(ByteBuffer.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final /* bridge */ /* synthetic */ Object A0C(C16L c16l, AnonymousClass469 anonymousClass469, Object obj) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        C61045ReH c61045ReH = new C61045ReH(byteBuffer);
        c16l.A1F(((C45T) anonymousClass469.A02).A01.A00, c61045ReH);
        c61045ReH.close();
        return byteBuffer;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final /* bridge */ /* synthetic */ Object A0D(C16L c16l, AnonymousClass469 anonymousClass469) {
        return ByteBuffer.wrap(c16l.A1S(C911944v.A01));
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Integer A0I() {
        return C05F.A02;
    }
}
