package com.fasterxml.jackson.databind.deser.std;

import X.AbstractC166997dE;
import X.AbstractC911344p;
import X.AnonymousClass469;
import X.C00O;
import X.C16L;
import X.C16R;
import X.C54s;
import X.C54t;
import X.C55B;
import X.C913045j;

/* loaded from: classes2.dex */
public class JsonNodeDeserializer extends BaseNodeDeserializer {
    public static final JsonNodeDeserializer A00 = new JsonNodeDeserializer();

    /* loaded from: classes10.dex */
    public final class ArrayDeserializer extends BaseNodeDeserializer {
        public static final ArrayDeserializer A00 = new ArrayDeserializer();

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, X.SLp] */
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public final /* bridge */ /* synthetic */ Object A0C(C16L c16l, AnonymousClass469 anonymousClass469, Object obj) {
            C54t c54t = (C54t) obj;
            if (c16l.A16()) {
                A11(c16l, anonymousClass469, new Object(), c54t, anonymousClass469.A02.A07);
                return c54t;
            }
            anonymousClass469.A0T(c16l, C55B.class);
            throw C00O.createAndThrow();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, X.SLp] */
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public final /* bridge */ /* synthetic */ Object A0D(C16L c16l, AnonymousClass469 anonymousClass469) {
            if (c16l.A16()) {
                C913045j c913045j = anonymousClass469.A02.A07;
                C55B c55b = new C55B(c913045j);
                A11(c16l, anonymousClass469, new Object(), c55b, c913045j);
                return c55b;
            }
            anonymousClass469.A0T(c16l, C55B.class);
            throw C00O.createAndThrow();
        }

        public ArrayDeserializer() {
            super(AbstractC166997dE.A0b(), C55B.class);
        }
    }

    /* loaded from: classes10.dex */
    public final class ObjectDeserializer extends BaseNodeDeserializer {
        public static final ObjectDeserializer A00 = new ObjectDeserializer();

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, X.SLp] */
        /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, X.SLp] */
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public final /* bridge */ /* synthetic */ Object A0D(C16L c16l, AnonymousClass469 anonymousClass469) {
            C913045j c913045j = anonymousClass469.A02.A07;
            if (c16l.A17()) {
                C54s c54s = new C54s(c913045j);
                A11(c16l, anonymousClass469, new Object(), c54s, c913045j);
                return c54s;
            }
            if (c16l.A19(C16R.A0A)) {
                return A10(c16l, anonymousClass469, new Object(), c913045j);
            }
            if (c16l.A19(C16R.A09)) {
                return new C54s(c913045j);
            }
            anonymousClass469.A0T(c16l, C54s.class);
            throw C00O.createAndThrow();
        }

        public ObjectDeserializer() {
            super(AbstractC166997dE.A0b(), C54s.class);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.SLp] */
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public final /* bridge */ /* synthetic */ Object A0C(C16L c16l, AnonymousClass469 anonymousClass469, Object obj) {
            C54s c54s = (C54s) obj;
            if (!c16l.A17() && !c16l.A19(C16R.A0A)) {
                anonymousClass469.A0T(c16l, C54s.class);
                throw C00O.createAndThrow();
            }
            return A0z(c16l, anonymousClass469, new Object(), c54s);
        }
    }

    public JsonNodeDeserializer() {
        super(null, AbstractC911344p.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, X.SLp] */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final /* bridge */ /* synthetic */ Object A0D(C16L c16l, AnonymousClass469 anonymousClass469) {
        C54t c54s;
        ?? obj = new Object();
        C913045j c913045j = anonymousClass469.A02.A07;
        int A0x = c16l.A0x();
        if (A0x != 1) {
            if (A0x != 2) {
                if (A0x != 3) {
                    if (A0x != 5) {
                        return A0x(c16l, anonymousClass469);
                    }
                    return A10(c16l, anonymousClass469, obj, c913045j);
                }
                c54s = new C55B(c913045j);
            } else {
                return new C54s(c913045j);
            }
        } else {
            c54s = new C54s(c913045j);
        }
        A11(c16l, anonymousClass469, obj, c54s, c913045j);
        return c54s;
    }
}
