package X;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.function.Function;

/* renamed from: X.1UI, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1UI {
    public static final Map A07 = new ConcurrentHashMap();
    public final int A00;
    public final java.util.Set A03;
    public final Executor A04;
    public final InterfaceC08830cm A05;
    public final boolean A06;
    public final Map A02 = new ConcurrentHashMap();
    public final Map A01 = new HashMap();

    public final C1UM A00(final String str) {
        Map map = this.A02;
        C1UM c1um = (C1UM) map.get(str);
        if (c1um == null) {
            return (C1UM) map.computeIfAbsent(str, new Function() { // from class: X.1UN
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    final C1UI c1ui = C1UI.this;
                    final String str2 = str;
                    return new C1UP(str2, c1ui.A04, new InterfaceC08830cm() { // from class: X.1UO
                        public volatile File A00 = null;

                        /* JADX WARN: Removed duplicated region for block: B:51:0x00ed A[Catch: all -> 0x010d, TryCatch #1 {, blocks: (B:42:0x00bf, B:46:0x00cb, B:48:0x00d3, B:49:0x00e5, B:51:0x00ed, B:52:0x00f5, B:54:0x00fb, B:56:0x010b), top: B:41:0x00bf }] */
                        @Override // X.InterfaceC08830cm
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final /* bridge */ /* synthetic */ java.lang.Object get() {
                            /*
                                Method dump skipped, instructions count: 278
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C1UO.get():java.lang.Object");
                        }
                    }, c1ui.A00, c1ui.A06);
                }
            });
        }
        return c1um;
    }

    public C1UI(java.util.Set set, Executor executor, InterfaceC08830cm interfaceC08830cm, int i, boolean z) {
        this.A04 = executor;
        this.A05 = interfaceC08830cm;
        this.A00 = i;
        this.A03 = set;
        this.A06 = z;
    }
}
