package X;

import android.view.View;
import java.util.Collections;
import java.util.List;

/* renamed from: X.2n7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C59062n7 {
    public static final C59062n7 A07 = new C59062n7(null, null, null, "empty", "empty", Collections.emptyList());
    public String A00;
    public boolean A01;
    public final C59062n7 A02;
    public final Object A03;
    public final Object A04;
    public final String A05;
    public final List A06;

    public C59062n7(C59062n7 c59062n7, Object obj, Object obj2, String str, List list) {
        this(c59062n7, obj, obj2, str, str, list == null ? Collections.emptyList() : list);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C59062n7(X.C59072n8 r8) {
        /*
            r7 = this;
            java.lang.Object r2 = r8.A02
            java.lang.Object r3 = r8.A03
            java.lang.String r4 = r8.A04
            java.util.List r6 = r8.A01
            if (r6 != 0) goto Le
            java.util.List r6 = java.util.Collections.emptyList()
        Le:
            X.2n7 r1 = r8.A00
            r0 = r7
            r5 = r4
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59062n7.<init>(X.2n8):void");
    }

    public static C59072n8 A00(Object obj, Object obj2, String str) {
        return new C59072n8(obj, obj2, str);
    }

    public void A01(InterfaceC57162jr interfaceC57162jr) {
        for (InterfaceC43071ya interfaceC43071ya : this.A06) {
            C2UE c2ue = C2UE.A01;
            int En1 = c2ue.A00.En1(interfaceC43071ya.getClass());
            interfaceC43071ya.ATP(this, interfaceC57162jr);
            c2ue.A00.ASP(En1);
        }
        if (interfaceC57162jr.CFq(this) == C05F.A00) {
            this.A01 = true;
        }
    }

    public C59062n7(C59062n7 c59062n7, Object obj, Object obj2, String str, String str2, List list) {
        if (!(obj instanceof View)) {
            this.A03 = obj;
            this.A04 = obj2;
            this.A05 = str;
            this.A00 = str2;
            this.A02 = c59062n7;
            this.A01 = false;
            this.A06 = list;
            return;
        }
        throw new IllegalArgumentException("ViewpointData should not contain a view as model");
    }
}
