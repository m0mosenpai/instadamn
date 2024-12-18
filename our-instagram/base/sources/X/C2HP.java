package X;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/* renamed from: X.2HP, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2HP extends TypeAdapter {
    public static final InterfaceC47612Gm A02 = new C2HQ(EnumC47562Gh.A00);
    public final Gson A00;
    public final InterfaceC47572Gi A01;

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, Object obj) {
        if (obj == null) {
            jsonWriter.A0A();
            return;
        }
        TypeAdapter A03 = this.A00.A03(new TypeToken(obj.getClass()));
        if (A03 instanceof C2HP) {
            jsonWriter.A07();
            jsonWriter.A09();
        } else {
            A03.write(jsonWriter, obj);
        }
    }

    public C2HP(Gson gson, InterfaceC47572Gi interfaceC47572Gi) {
        this.A00 = gson;
        this.A01 = interfaceC47572Gi;
    }

    private Object A00(JsonReader jsonReader, Integer num) {
        int intValue = num.intValue();
        if (intValue != 5) {
            if (intValue != 6) {
                if (intValue != 7) {
                    if (intValue == 8) {
                        jsonReader.A0Q();
                        return null;
                    }
                    throw new IllegalStateException(AnonymousClass001.A0R("Unexpected token: ", SSW.A01(num)));
                }
                return Boolean.valueOf(jsonReader.A0T());
            }
            return this.A01.E8H(jsonReader);
        }
        return jsonReader.A0K();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0057 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0029 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x005c  */
    @Override // com.google.gson.TypeAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object read(com.google.gson.stream.JsonReader r8) {
        /*
            r7 = this;
            java.lang.Integer r2 = r8.A0G()
            int r1 = r2.intValue()
            r0 = 0
            if (r1 == r0) goto L1c
            r0 = 2
            if (r1 == r0) goto L13
            java.lang.Object r5 = r7.A00(r8, r2)
        L12:
            return r5
        L13:
            r8.A0N()
            X.5MT r5 = new X.5MT
            r5.<init>()
            goto L24
        L1c:
            r8.A0M()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
        L24:
            java.util.ArrayDeque r4 = new java.util.ArrayDeque
            r4.<init>()
        L29:
            boolean r0 = r8.A0S()
            if (r0 == 0) goto L76
            r6 = 0
            boolean r0 = r5 instanceof java.util.Map
            if (r0 == 0) goto L38
            java.lang.String r6 = r8.A0J()
        L38:
            java.lang.Integer r3 = r8.A0G()
            int r1 = r3.intValue()
            r0 = 0
            if (r1 == r0) goto L63
            r0 = 2
            if (r1 == r0) goto L6c
            r2 = 0
            java.lang.Object r0 = r7.A00(r8, r3)
        L4b:
            boolean r1 = r5 instanceof java.util.List
            if (r1 == 0) goto L5c
            r1 = r5
            java.util.List r1 = (java.util.List) r1
            r1.add(r0)
        L55:
            if (r2 == 0) goto L29
            r4.addLast(r5)
            r5 = r0
            goto L29
        L5c:
            r1 = r5
            java.util.Map r1 = (java.util.Map) r1
            r1.put(r6, r0)
            goto L55
        L63:
            r8.A0M()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            goto L74
        L6c:
            r8.A0N()
            X.5MT r0 = new X.5MT
            r0.<init>()
        L74:
            r2 = 1
            goto L4b
        L76:
            boolean r0 = r5 instanceof java.util.List
            if (r0 == 0) goto L88
            r8.A0O()
        L7d:
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L12
            java.lang.Object r5 = r4.removeLast()
            goto L29
        L88:
            r8.A0P()
            goto L7d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2HP.read(com.google.gson.stream.JsonReader):java.lang.Object");
    }
}
