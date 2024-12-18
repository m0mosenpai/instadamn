package X;

import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ser.std.BooleanSerializer;
import com.fasterxml.jackson.databind.ser.std.CalendarSerializer;
import com.fasterxml.jackson.databind.ser.std.ClassSerializer;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;
import com.fasterxml.jackson.databind.ser.std.FileSerializer;
import com.fasterxml.jackson.databind.ser.std.JsonValueSerializer;
import com.fasterxml.jackson.databind.ser.std.NullSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializers$FloatSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializers$IntLikeSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializers$ShortSerializer;
import com.fasterxml.jackson.databind.ser.std.SerializableSerializer;
import com.fasterxml.jackson.databind.ser.std.StdJdkSerializers$AtomicBooleanSerializer;
import com.fasterxml.jackson.databind.ser.std.StdJdkSerializers$AtomicIntegerSerializer;
import com.fasterxml.jackson.databind.ser.std.StdJdkSerializers$AtomicLongSerializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.fasterxml.jackson.databind.ser.std.StringSerializer;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer;
import com.fasterxml.jackson.databind.ser.std.UUIDSerializer;
import java.io.File;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* renamed from: X.46C, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C46C extends C46D implements Serializable {
    public static final HashMap A01;
    public static final HashMap A02;
    public final C914246d A00;

    /* JADX WARN: Type inference failed for: r1v5, types: [X.46C, X.46B] */
    public final C46B A05(C914246d c914246d) {
        C46B c46b = (C46B) this;
        if (c46b.A00 != c914246d) {
            Class<?> cls = c46b.getClass();
            if (cls == C46B.class) {
                return new C46C(c914246d);
            }
            throw new IllegalStateException(AnonymousClass001.A0g("Subtype of BeanSerializerFactory (", cls.getName(), ") has not properly overridden method 'withAdditionalSerializers': cannot instantiate subtype with additional serializer definitions"));
        }
        return c46b;
    }

    static {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put(String.class.getName(), new StringSerializer());
        ToStringSerializer toStringSerializer = ToStringSerializer.A00;
        hashMap2.put(StringBuffer.class.getName(), toStringSerializer);
        hashMap2.put(StringBuilder.class.getName(), toStringSerializer);
        hashMap2.put(Character.class.getName(), toStringSerializer);
        hashMap2.put(Character.TYPE.getName(), toStringSerializer);
        hashMap2.put(Integer.class.getName(), new StdSerializer(Integer.class));
        Class cls = Integer.TYPE;
        hashMap2.put(cls.getName(), new StdSerializer(cls));
        hashMap2.put(Long.class.getName(), new StdSerializer(Long.class));
        Class cls2 = Long.TYPE;
        hashMap2.put(cls2.getName(), new StdSerializer(cls2));
        String name = Byte.class.getName();
        NumberSerializers$IntLikeSerializer numberSerializers$IntLikeSerializer = NumberSerializers$IntLikeSerializer.A00;
        hashMap2.put(name, numberSerializers$IntLikeSerializer);
        hashMap2.put(Byte.TYPE.getName(), numberSerializers$IntLikeSerializer);
        String name2 = Short.class.getName();
        NumberSerializers$ShortSerializer numberSerializers$ShortSerializer = NumberSerializers$ShortSerializer.A00;
        hashMap2.put(name2, numberSerializers$ShortSerializer);
        hashMap2.put(Short.TYPE.getName(), numberSerializers$ShortSerializer);
        hashMap2.put(Double.class.getName(), new StdSerializer(Double.class));
        Class cls3 = Double.TYPE;
        hashMap2.put(cls3.getName(), new StdSerializer(cls3));
        String name3 = Float.class.getName();
        NumberSerializers$FloatSerializer numberSerializers$FloatSerializer = NumberSerializers$FloatSerializer.A00;
        hashMap2.put(name3, numberSerializers$FloatSerializer);
        hashMap2.put(Float.TYPE.getName(), numberSerializers$FloatSerializer);
        hashMap2.put(Boolean.TYPE.getName(), new BooleanSerializer(true));
        hashMap2.put(Boolean.class.getName(), new BooleanSerializer(false));
        hashMap2.put(BigInteger.class.getName(), new StdSerializer(BigInteger.class));
        hashMap2.put(BigDecimal.class.getName(), new StdSerializer(BigDecimal.class));
        hashMap2.put(Calendar.class.getName(), CalendarSerializer.A00);
        hashMap2.put(Date.class.getName(), DateSerializer.A00);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(java.net.URL.class, new StdSerializer(java.net.URL.class, false));
        hashMap3.put(java.net.URI.class, new StdSerializer(java.net.URI.class, false));
        hashMap3.put(Currency.class, new StdSerializer(Currency.class, false));
        hashMap3.put(UUID.class, new UUIDSerializer(null));
        hashMap3.put(Pattern.class, new StdSerializer(Pattern.class, false));
        hashMap3.put(Locale.class, new StdSerializer(Locale.class, false));
        hashMap3.put(AtomicBoolean.class, StdJdkSerializers$AtomicBooleanSerializer.class);
        hashMap3.put(AtomicInteger.class, StdJdkSerializers$AtomicIntegerSerializer.class);
        hashMap3.put(AtomicLong.class, StdJdkSerializers$AtomicLongSerializer.class);
        hashMap3.put(File.class, FileSerializer.class);
        hashMap3.put(Class.class, ClassSerializer.class);
        NullSerializer nullSerializer = NullSerializer.A00;
        hashMap3.put(Void.class, nullSerializer);
        hashMap3.put(Void.TYPE, nullSerializer);
        for (Map.Entry entry : hashMap3.entrySet()) {
            Object value = entry.getValue();
            boolean z = value instanceof JsonSerializer;
            String name4 = ((Class) entry.getKey()).getName();
            if (z) {
                hashMap2.put(name4, value);
            } else {
                hashMap.put(name4, value);
            }
        }
        hashMap.put(C914146b.class.getName(), TokenBufferSerializer.class);
        A01 = hashMap2;
        A02 = hashMap;
    }

    public final JsonSerializer A03(AbstractC910944l abstractC910944l, AbstractC913345m abstractC913345m, C45B c45b) {
        if (InterfaceC911544r.class.isAssignableFrom(abstractC910944l.A00)) {
            return SerializableSerializer.A00;
        }
        RBL A012 = c45b.A01();
        if (A012 != null) {
            C45R c45r = abstractC913345m.A05;
            if (c45r.A05()) {
                C914045z.A0H(A012.A0C(), c45r.A07());
            }
            AbstractC910944l A03 = A012.A03();
            JsonSerializer A04 = A04(abstractC913345m, A012);
            if (A04 == null) {
                A04 = (JsonSerializer) A03.A02;
            }
            AbstractC63023Sar abstractC63023Sar = (AbstractC63023Sar) A03.A01;
            if (abstractC63023Sar == null) {
                abstractC63023Sar = A02(A03, c45r);
            }
            return new JsonValueSerializer(A04, A012, abstractC63023Sar);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001c, code lost:
    
        if (r2 == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.fasterxml.jackson.databind.JsonSerializer A04(X.AbstractC913345m r6, X.AnonymousClass455 r7) {
        /*
            r5 = this;
            X.45R r0 = r6.A05
            X.44W r4 = r0.A00()
            boolean r0 = r4 instanceof X.C44V
            if (r0 == 0) goto L1e
            java.lang.Class<com.fasterxml.jackson.databind.annotation.JsonSerialize> r0 = com.fasterxml.jackson.databind.annotation.JsonSerialize.class
            java.lang.annotation.Annotation r0 = r7.A06(r0)
            com.fasterxml.jackson.databind.annotation.JsonSerialize r0 = (com.fasterxml.jackson.databind.annotation.JsonSerialize) r0
            if (r0 == 0) goto L20
            java.lang.Class r2 = r0.using()
            java.lang.Class<com.fasterxml.jackson.databind.JsonSerializer$None> r0 = com.fasterxml.jackson.databind.JsonSerializer.None.class
            if (r2 == r0) goto L20
            if (r2 != 0) goto L3a
        L1e:
            r3 = 0
        L1f:
            return r3
        L20:
            java.lang.Class<com.fasterxml.jackson.annotation.JsonRawValue> r0 = com.fasterxml.jackson.annotation.JsonRawValue.class
            java.lang.annotation.Annotation r0 = r7.A06(r0)
            com.fasterxml.jackson.annotation.JsonRawValue r0 = (com.fasterxml.jackson.annotation.JsonRawValue) r0
            if (r0 == 0) goto L1e
            boolean r0 = r0.value()
            if (r0 == 0) goto L1e
            java.lang.Class r1 = r7.A04()
            r0 = 0
            com.fasterxml.jackson.databind.ser.std.RawSerializer r2 = new com.fasterxml.jackson.databind.ser.std.RawSerializer
            r2.<init>(r1, r0)
        L3a:
            com.fasterxml.jackson.databind.JsonSerializer r3 = r6.A0M(r7, r2)
            java.lang.Object r0 = r4.A0d(r7)
            if (r0 == 0) goto L1f
            X.TmN r2 = r6.A06(r0)
            if (r2 == 0) goto L1f
            X.44k r0 = r6.A05()
            X.44l r1 = r2.BaK(r0)
            com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer r0 = new com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer
            r0.<init>(r1, r3, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46C.A04(X.45m, X.455):com.fasterxml.jackson.databind.JsonSerializer");
    }

    public C46C(C914246d c914246d) {
        this.A00 = c914246d == null ? new C914246d() : c914246d;
    }
}
