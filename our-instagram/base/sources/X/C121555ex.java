package X;

import X.AbstractC121565f4;
import X.AbstractC913345m;
import X.AnonymousClass181;
import X.AnonymousClass182;
import X.C16L;
import X.C17z;
import X.C222015v;
import X.C2JT;
import X.C63117SdL;
import X.InterfaceC911544r;
import android.util.Base64;
import com.facebook.flatbuffers.Flattenable;
import com.facebook.graphservice.interfaces.Tree;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ser.std.BooleanSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializers$FloatSerializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.fasterxml.jackson.databind.ser.std.StringSerializer;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.5ex, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C121555ex extends AbstractC913245l {
    public static boolean A02;
    public JsonSerializer A00;
    public final C102304j5 A01;
    public static final ConcurrentMap A08 = new ConcurrentHashMap();
    public static JsonSerializer A05 = new JsonSerializer() { // from class: com.facebook.common.json.FbSerializerProvider$2
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public final /* bridge */ /* synthetic */ void A0A(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, Object obj) {
            ((InterfaceC911544r) obj).EOr(anonymousClass182, abstractC913345m);
        }
    };
    public static JsonSerializer A07 = new JsonSerializer() { // from class: com.facebook.common.json.FbSerializerProvider$3
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public final /* bridge */ /* synthetic */ void A0A(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, Object obj) {
            throw new NullPointerException("getTypeTag");
        }
    };
    public static JsonSerializer A04 = new JsonSerializer() { // from class: com.facebook.common.json.FbSerializerProvider$4
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public final /* bridge */ /* synthetic */ void A0A(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, Object obj) {
            ByteBuffer serializeTreeToByteBuffer = C63117SdL.A00().serializeTreeToByteBuffer((Tree) ((C2JT) obj));
            byte[] bArr = new byte[serializeTreeToByteBuffer.limit()];
            serializeTreeToByteBuffer.get(bArr);
            anonymousClass182.A0u(Base64.encodeToString(bArr, 2));
        }
    };
    public static JsonSerializer A03 = new JsonSerializer() { // from class: com.facebook.common.json.FbSerializerProvider$5
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public final /* bridge */ /* synthetic */ void A0A(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, Object obj) {
            anonymousClass182.A0u(((Enum) obj).name());
        }
    };
    public static JsonSerializer A06 = new JsonSerializer() { // from class: com.facebook.common.json.FbSerializerProvider$6
        /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Throwable, X.400, X.R8i, java.io.IOException] */
        /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Throwable, X.400, X.R8i, java.io.IOException] */
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public final /* bridge */ /* synthetic */ void A0A(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, Object obj) {
            String A1O;
            Map map = (Map) obj;
            anonymousClass182.A0d();
            for (Object obj2 : map.keySet()) {
                if (obj2 instanceof String) {
                    A1O = (String) obj2;
                } else if (obj2 instanceof Enum) {
                    C222015v A032 = anonymousClass182.A0D().A03();
                    StringWriter stringWriter = new StringWriter();
                    C17z A0A = A032.A0A(stringWriter);
                    ((AnonymousClass181) A0A).A01 = anonymousClass182.A0D();
                    A0A.A0J(obj2);
                    A0A.flush();
                    C16L A033 = A032.A03(stringWriter.toString());
                    A1O = A033.A1O();
                    if (A1O == null || A033.A1J() != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Tried to use json as map key, but it is not a string: ");
                        sb.append(stringWriter);
                        ?? iOException = new IOException(sb.toString(), null);
                        iOException.A00 = null;
                        iOException.A00 = null;
                        throw iOException;
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Non-string, non-enum key (");
                    sb2.append(obj2.getClass());
                    sb2.append(") found in map.");
                    ?? iOException2 = new IOException(sb2.toString(), null);
                    iOException2.A00 = null;
                    iOException2.A00 = null;
                    throw iOException2;
                }
                anonymousClass182.A0r(A1O);
                anonymousClass182.A0J(map.get(obj2));
            }
            anonymousClass182.A0a();
        }
    };

    @Override // X.AbstractC913345m
    public final JsonSerializer A0J(InterfaceC65620ToB interfaceC65620ToB, Class cls, boolean z) {
        JsonSerializer A0O;
        ConcurrentMap concurrentMap = A08;
        JsonSerializer jsonSerializer = (JsonSerializer) concurrentMap.get(cls);
        if (jsonSerializer == null) {
            if (InterfaceC102484jg.class.isAssignableFrom(cls)) {
                jsonSerializer = A07;
            } else {
                if (C2JT.class.isAssignableFrom(cls)) {
                    return A04;
                }
                if (InterfaceC911544r.class.isAssignableFrom(cls)) {
                    jsonSerializer = A05;
                } else if (cls.isEnum()) {
                    jsonSerializer = A03;
                } else if (Collection.class.isAssignableFrom(cls)) {
                    jsonSerializer = this.A00;
                } else if (Map.class.isAssignableFrom(cls)) {
                    jsonSerializer = A06;
                } else {
                    try {
                        try {
                            Class.forName(AnonymousClass001.A0R(cls.getName().replace('$', '_'), "Serializer"));
                        } catch (ClassNotFoundException unused) {
                        }
                    } catch (ClassNotFoundException unused2) {
                        Class.forName(cls.getName().concat("$Serializer"));
                    }
                    jsonSerializer = (JsonSerializer) concurrentMap.get(cls);
                    if (jsonSerializer == null) {
                        if (Flattenable.class.isAssignableFrom(cls)) {
                            C0K8.A0B(C121555ex.class, "Serializing a FlatBuffer based object to Json: %s", cls.toString());
                        }
                        try {
                            A0O = super.A0J(null, cls, true);
                        } catch (NoClassDefFoundError unused3) {
                            A0O = A0O(cls);
                        }
                        concurrentMap.put(cls, A0O);
                        if (this.A01 != null) {
                            cls.toString();
                        }
                        return A0O;
                    }
                }
            }
            concurrentMap.put(cls, jsonSerializer);
        }
        return jsonSerializer;
    }

    @Override // X.AbstractC913245l
    public final /* bridge */ /* synthetic */ AbstractC913245l A0W(C45R c45r, C46D c46d) {
        return new C121555ex(this.A01, c45r, this, c46d);
    }

    public C121555ex(C102304j5 c102304j5, C45R c45r, AbstractC913345m abstractC913345m, C46D c46d) {
        super(c45r, abstractC913345m, c46d);
        this.A00 = new JsonSerializer() { // from class: com.facebook.common.json.FbSerializerProvider$1
            @Override // com.fasterxml.jackson.databind.JsonSerializer
            public final /* bridge */ /* synthetic */ void A0A(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m2, Object obj) {
                AbstractC121565f4.A01(anonymousClass182, abstractC913345m2, (Collection) obj);
            }
        };
        this.A01 = c102304j5;
        if (!A02) {
            ConcurrentMap concurrentMap = A08;
            concurrentMap.put(String.class, new StringSerializer());
            concurrentMap.put(Integer.class, new StdSerializer(Integer.class));
            concurrentMap.put(Long.class, new StdSerializer(Long.class));
            concurrentMap.put(Boolean.class, new BooleanSerializer(false));
            concurrentMap.put(Float.class, new NumberSerializers$FloatSerializer());
            concurrentMap.put(Double.class, new StdSerializer(Double.class));
            A02 = true;
        }
    }
}
