package X;

import com.instagram.common.cache.base.CacheKeyGenerator;
import java.util.HashSet;

/* renamed from: X.16h, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C222816h implements InterfaceC222916i {
    public static CacheKeyGenerator A02;
    public static boolean A03;
    public static boolean A04;
    public static boolean A05;
    public final C223016j A00;
    public final Object A01;
    public static final C222816h A06 = new C222816h(true);
    public static final C222816h A07 = new C222816h(false);
    public static final String[] A09 = {"igcdn.com", "cdninstagram.com"};
    public static final java.util.Set A08 = new HashSet();

    @Override // X.InterfaceC222916i
    public final C2n4 E3L(String str) {
        return E3Q(null, str);
    }

    public static String A02(String str) {
        if (!A05) {
            return "";
        }
        int indexOf = str.indexOf(63);
        if (indexOf == -1) {
            return str;
        }
        return str.substring(0, indexOf);
    }

    @Override // X.InterfaceC222916i
    public final C2n4 E3Q(Boolean bool, String str) {
        C2n4 c2n4;
        Object obj = this.A01;
        C223016j c223016j = this.A00;
        if (c223016j != null && obj != null) {
            synchronized (obj) {
                c2n4 = (C2n4) c223016j.A02(str);
                if (c2n4 == null) {
                    c2n4 = A00(bool, str);
                    c223016j.A06(str, c2n4);
                }
            }
            return c2n4;
        }
        return A00(bool, str);
    }

    public C222816h(boolean z) {
        Object obj;
        if (z) {
            this.A00 = new C223016j(100);
            obj = new Object();
        } else {
            obj = null;
        }
        this.A01 = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x009c, code lost:
    
        if (r16.booleanValue() == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a3, code lost:
    
        if (r2 != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00a9, code lost:
    
        if (r2 == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00ad, code lost:
    
        if (r0 != false) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C2n4 A00(java.lang.Boolean r16, final java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C222816h.A00(java.lang.Boolean, java.lang.String):X.2n4");
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x00fe, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, X.2n3] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String A01(X.C2n2 r11, X.C58992mx r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C222816h.A01(X.2n2, X.2mx, java.lang.String):java.lang.String");
    }
}
