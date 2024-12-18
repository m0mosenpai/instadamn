package X;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* renamed from: X.2GB, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2GB implements C2GC {
    public static final java.util.Set A03;
    public final InterfaceC02550Ad A00;
    public final Map A01;
    public final C0JM A02;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x0073. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:110:0x066a  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x06d2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x06e3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x06f4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0701  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0716  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x024f  */
    @Override // X.C2GC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Chz(java.lang.String r23, java.util.Map r24) {
        /*
            Method dump skipped, instructions count: 1918
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2GB.Chz(java.lang.String, java.util.Map):void");
    }

    static {
        HashSet hashSet = new HashSet();
        A03 = hashSet;
        hashSet.add("payflows_back_click");
        hashSet.add("payflows_cancel");
        hashSet.add("payflows_click");
        hashSet.add("payflows_custom");
        hashSet.add("payflows_done_click");
        hashSet.add("payflows_fail");
        hashSet.add("payflows_field_focus");
        hashSet.add("payflows_init");
        hashSet.add("payflows_display");
        hashSet.add("payflows_api_init");
        hashSet.add("payflows_redirect");
        hashSet.add("payflows_save_click");
        hashSet.add("payflows_success");
        hashSet.add("payflows_terms_click");
        hashSet.add("payflows_timeout");
    }

    public C2GB(InterfaceC02550Ad interfaceC02550Ad) {
        this.A00 = interfaceC02550Ad;
        C03250Di c03250Di = C03250Di.A00;
        C14360o3.A07(c03250Di);
        this.A02 = c03250Di;
        this.A01 = Collections.synchronizedMap(new HashMap());
    }
}
