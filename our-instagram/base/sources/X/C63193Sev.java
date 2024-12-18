package X;

import java.util.ArrayList;

/* renamed from: X.Sev, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C63193Sev {
    public String A02;
    public String A03;
    public ArrayList A04;
    public int A00 = 0;
    public int A01 = 0;
    public boolean A05 = false;

    public static C63193Sev A02(String str) {
        if ("ACTION_LAUNCH_APP".equals(str)) {
            return new C58873QDw();
        }
        if ("CLEAR_DEBUG_OVERLAY".equals(str)) {
            return new C58872QDv();
        }
        if ("ACTION_REPORT".equals(str)) {
            return new C58874QDx();
        }
        if ("ACTION_BWP_MORE_INFO".equals(str)) {
            return new C58871QDu();
        }
        return new C63193Sev(str);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstInlineVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected instance arg in invoke
        	at jadx.core.dex.visitors.ConstInlineVisitor.addExplicitCast(ConstInlineVisitor.java:285)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceArg(ConstInlineVisitor.java:267)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceConst(ConstInlineVisitor.java:177)
        	at jadx.core.dex.visitors.ConstInlineVisitor.checkInsn(ConstInlineVisitor.java:110)
        	at jadx.core.dex.visitors.ConstInlineVisitor.process(ConstInlineVisitor.java:55)
        	at jadx.core.dex.visitors.ConstInlineVisitor.visit(ConstInlineVisitor.java:47)
        */
    public final void A03(android.content.Context r18, android.os.Bundle r19, X.InterfaceC172717mh r20, X.InterfaceC172727mi r21) {
        /*
            Method dump skipped, instructions count: 1196
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63193Sev.A03(android.content.Context, android.os.Bundle, X.7mh, X.7mi):void");
    }

    public final void A04(C63193Sev c63193Sev) {
        ArrayList arrayList = this.A04;
        if (arrayList == null) {
            arrayList = AbstractC166987dD.A1E();
            this.A04 = arrayList;
        }
        arrayList.add(c63193Sev);
    }

    public C63193Sev(String str) {
        this.A02 = str;
    }

    public C63193Sev() {
    }
}
