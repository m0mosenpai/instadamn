package X;

import android.content.Context;
import android.graphics.Typeface;
import com.facebook.endtoend.EndToEnd;
import java.io.File;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.0qs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15980qs {
    public static C15980qs A03;
    public final Context A00;
    public final Map A01;
    public final Map A02 = new ConcurrentHashMap(new EnumMap(EnumC15950qp.class));

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        if (r3 == 27) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Typeface A02(X.EnumC15950qp r7) {
        /*
            r6 = this;
            r0 = 0
            X.C14360o3.A0B(r7, r0)
            java.util.Map r5 = r6.A02
            java.lang.Object r0 = r5.get(r7)
            android.graphics.Typeface r0 = (android.graphics.Typeface) r0
            if (r0 != 0) goto L32
            java.lang.String r4 = r7.A02
            if (r4 == 0) goto L33
            int r3 = r7.ordinal()
            r2 = 2
            r1 = 24
            r0 = 22
            if (r3 == r0) goto L29
            if (r3 == r1) goto L28
            r0 = 20
            if (r3 == r0) goto L28
            r0 = 27
            r2 = 0
            if (r3 != r0) goto L29
        L28:
            r2 = 1
        L29:
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r4, r2)
        L2d:
            if (r0 == 0) goto L32
            r5.put(r7, r0)
        L32:
            return r0
        L33:
            java.lang.Integer r0 = r7.A01
            if (r0 == 0) goto L3c
            android.graphics.Typeface r0 = r6.A01(r7)
            goto L2d
        L3c:
            X.3LX r0 = r7.A00()
            if (r0 == 0) goto L47
            android.graphics.Typeface r0 = r6.A00(r7)
            goto L2d
        L47:
            java.lang.String r2 = "The requested font, "
            java.lang.String r1 = r7.name()
            java.lang.String r0 = ", does not have a backing source. You need to provide either a systemFontName, assetFontName, or a fileDescriptor."
            java.lang.String r1 = X.AnonymousClass001.A0g(r2, r1, r0)
            java.lang.String r0 = "TypefaceRepository"
            X.C0K8.A0C(r0, r1)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15980qs.A02(X.0qp):android.graphics.Typeface");
    }

    private final Typeface A00(EnumC15950qp enumC15950qp) {
        File file;
        Map map = this.A01;
        if (map.get(enumC15950qp) == null && AbstractC009903n.A0O(enumC15950qp, EnumC15950qp.values())) {
            A03();
        }
        C6VI c6vi = (C6VI) map.get(enumC15950qp);
        Typeface typeface = null;
        if (c6vi != null && (file = (File) c6vi.A00()) != null) {
            try {
                typeface = Typeface.createFromFile(file);
            } catch (RuntimeException e) {
                map.remove(enumC15950qp);
                C0K8.A0C("TypefaceRepository", e.getMessage());
            }
            String name = enumC15950qp.name();
            boolean z = false;
            if (typeface != null) {
                z = true;
            }
            C6QW.A03(name, z);
            return typeface;
        }
        C0K8.A0C("TypefaceRepository", AnonymousClass001.A0g("Requested font, ", enumC15950qp.name(), ", is a remote typeface and is not available."));
        return null;
    }

    private final Typeface A01(EnumC15950qp enumC15950qp) {
        Integer num = enumC15950qp.A01;
        if (num != null) {
            Typeface A02 = C3WY.A02(this.A00, num.intValue());
            if (A02 != null) {
                if (A02.equals(Typeface.DEFAULT)) {
                    C0w9.A03("TypefaceRepository", AnonymousClass001.A0g("Requested font, ", enumC15950qp.name(), ", is not supported by this device."));
                }
                C6QW.A01(enumC15950qp.name());
                return A02;
            }
        }
        C0w9.A03("TypefaceRepository", AnonymousClass001.A0g("Requested font, ", enumC15950qp.name(), ", is a resources typeface and is not available."));
        return null;
    }

    public C15980qs(Context context) {
        this.A00 = context;
        Map synchronizedMap = Collections.synchronizedMap(new EnumMap(EnumC15950qp.class));
        C14360o3.A07(synchronizedMap);
        this.A01 = synchronizedMap;
    }

    public final void A03() {
        for (EnumC15950qp enumC15950qp : EnumC15950qp.values()) {
            C3LX A00 = enumC15950qp.A00();
            if (A00 != null) {
                C6VI c6vi = new C6VI(new C6VF(this.A00, A00, InterfaceC58742mX.A00));
                c6vi.A00();
                this.A01.put(enumC15950qp, c6vi);
            }
            if (EndToEnd.isRunningEndToEndTest() || EndToEnd.A03()) {
                C6QW.A03(enumC15950qp.name(), true);
            }
        }
    }
}
