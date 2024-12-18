package X;

import X.AbstractC913345m;
import X.AnonymousClass182;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

/* renamed from: X.STj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62836STj {
    public static final JsonSerializer A00 = new StdSerializer() { // from class: com.fasterxml.jackson.databind.ser.std.StdKeySerializers$StringKeySerializer
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public final void A0A(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, Object obj) {
            anonymousClass182.A0r((String) obj);
        }
    };

    public AbstractC62836STj() {
        throw C00O.createAndThrow();
    }
}
