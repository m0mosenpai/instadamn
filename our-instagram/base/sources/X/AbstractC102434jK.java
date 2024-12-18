package X;

import com.facebook.common.json.FbJsonDeserializer;
import com.facebook.common.json.UriDeserializer;
import com.fasterxml.jackson.databind.deser.std.JsonNodeDeserializer;
import com.fasterxml.jackson.databind.deser.std.StringDeserializer;
import com.fasterxml.jackson.databind.deser.std.TokenBufferDeserializer;
import com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.4jK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC102434jK {
    public static final FbJsonDeserializer A00;
    public static final ConcurrentMap A01;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.facebook.common.json.FbJsonDeserializer] */
    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        A01 = concurrentHashMap;
        A00 = new Object();
        concurrentHashMap.put(AbstractC911344p.class, JsonNodeDeserializer.A00);
        concurrentHashMap.put(String.class, StringDeserializer.A00);
        concurrentHashMap.put(Integer.class, C102454jT.A00(Integer.class, Integer.class.getName()));
        concurrentHashMap.put(Long.class, C102454jT.A00(Long.class, Long.class.getName()));
        concurrentHashMap.put(Boolean.class, C102454jT.A00(Boolean.class, Boolean.class.getName()));
        concurrentHashMap.put(Float.class, C102454jT.A00(Float.class, Float.class.getName()));
        concurrentHashMap.put(Double.class, C102454jT.A00(Double.class, Double.class.getName()));
        concurrentHashMap.put(android.net.Uri.class, new UriDeserializer());
        concurrentHashMap.put(C914146b.class, new TokenBufferDeserializer());
        concurrentHashMap.put(Object.class, new UntypedObjectDeserializer((AbstractC910944l) null, (AbstractC910944l) null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0060, code lost:
    
        if (r0 == null) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, com.facebook.common.json.TreeFragmentModelBase64Deserializer] */
    /* JADX WARN: Type inference failed for: r0v23, types: [com.facebook.common.json.FbJsonDeserializer] */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.fasterxml.jackson.databind.JsonDeserializer A00(java.lang.Class r5) {
        /*
            java.util.concurrent.ConcurrentMap r4 = X.AbstractC102434jK.A01
            java.lang.Object r0 = r4.get(r5)
            com.fasterxml.jackson.databind.JsonDeserializer r0 = (com.fasterxml.jackson.databind.JsonDeserializer) r0
            com.facebook.common.json.FbJsonDeserializer r3 = X.AbstractC102434jK.A00
            if (r0 != r3) goto Le
            r0 = 0
        Ld:
            return r0
        Le:
            if (r0 != 0) goto Ld
            java.lang.Class<X.4jg> r0 = X.InterfaceC102484jg.class
            boolean r0 = r0.isAssignableFrom(r5)
            if (r0 == 0) goto L26
            com.facebook.common.json.TypeModelBase64Deserializer r0 = new com.facebook.common.json.TypeModelBase64Deserializer
            r0.<init>()
        L1d:
            r0.A00 = r5
        L1f:
            if (r0 == 0) goto L22
            r3 = r0
        L22:
            r4.putIfAbsent(r5, r3)
            return r0
        L26:
            java.lang.Class<X.2JT> r0 = X.C2JT.class
            boolean r0 = r0.isAssignableFrom(r5)
            if (r0 == 0) goto L36
            com.facebook.common.json.TreeFragmentModelBase64Deserializer r0 = new com.facebook.common.json.TreeFragmentModelBase64Deserializer
            r0.<init>()
            r0.A00 = r5
            goto L1f
        L36:
            java.lang.Class<X.4jh> r0 = X.InterfaceC102494jh.class
            boolean r0 = r0.isAssignableFrom(r5)
            if (r0 == 0) goto L44
            com.facebook.common.json.FBJsonSelfDeserializer r0 = new com.facebook.common.json.FBJsonSelfDeserializer
            r0.<init>()
            goto L1d
        L44:
            java.lang.String r2 = r5.getName()
            r1 = 36
            r0 = 95
            java.lang.String r1 = r2.replace(r1, r0)
            java.lang.String r0 = "Deserializer"
            java.lang.String r0 = r1.concat(r0)
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L62
            java.lang.Object r0 = r0.newInstance()     // Catch: java.lang.Throwable -> L62
            com.fasterxml.jackson.databind.JsonDeserializer r0 = (com.fasterxml.jackson.databind.JsonDeserializer) r0     // Catch: java.lang.Throwable -> L62
            if (r0 != 0) goto L1f
        L62:
            java.lang.String r0 = "$Deserializer"
            java.lang.String r0 = r2.concat(r0)
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L73
            java.lang.Object r0 = r0.newInstance()     // Catch: java.lang.Throwable -> L73
            com.fasterxml.jackson.databind.JsonDeserializer r0 = (com.fasterxml.jackson.databind.JsonDeserializer) r0     // Catch: java.lang.Throwable -> L73
            goto L1f
        L73:
            r0 = 0
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC102434jK.A00(java.lang.Class):com.fasterxml.jackson.databind.JsonDeserializer");
    }
}
