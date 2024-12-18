package X;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public abstract class LHJ {
    public static ArrayList A00() {
        Object AWi;
        AbstractC46392KgE abstractC46392KgE;
        C47472Ky1 A00 = C47472Ky1.A00();
        EnumC46119KbJ enumC46119KbJ = EnumC46119KbJ.A03;
        if (AbstractC166987dD.A1a(enumC46119KbJ.A01.A00()) && (AWi = enumC46119KbJ.A00.AWi(A00.A00.getString("cloud_account_user_map", null))) != null && (AWi instanceof AbstractC46392KgE) && (abstractC46392KgE = (AbstractC46392KgE) AWi) != null && (abstractC46392KgE instanceof C45461KAw)) {
            List list = ((C45461KAw) abstractC46392KgE).A00;
            if (list == null) {
                return AbstractC166987dD.A1E();
            }
            return AbstractC166987dD.A1F(list);
        }
        return AbstractC166987dD.A1E();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0037, code lost:
    
        A02(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
    
        return;
     */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.L8l, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A01(com.instagram.common.typedurl.ImageUrl r4, java.lang.String r5, java.lang.String r6) {
        /*
            java.util.ArrayList r3 = A00()
            java.util.Iterator r1 = r3.iterator()
        L8:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L3b
            java.lang.Object r2 = r1.next()
            X.L8l r2 = (X.L8l) r2
            java.lang.String r0 = r2.A00()
            if (r0 == 0) goto L8
            java.lang.String r0 = r2.A00()
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L8
            java.lang.String r1 = r4.getUrl()
            boolean r0 = android.webkit.URLUtil.isValidUrl(r1)
            if (r0 != 0) goto L2f
            r1 = 0
        L2f:
            r2.A00 = r1
            java.lang.String r0 = r2.A02
            if (r0 == 0) goto L5c
            r2.A02 = r6
        L37:
            A02(r3)
            return
        L3b:
            java.lang.String r2 = r4.getUrl()
            X.L8l r1 = new X.L8l
            r1.<init>()
            boolean r0 = android.text.TextUtils.isDigitsOnly(r5)
            if (r0 == 0) goto L61
            r1.A01 = r5
            r1.A02 = r6
            if (r2 == 0) goto L58
            boolean r0 = android.webkit.URLUtil.isValidUrl(r2)
            if (r0 == 0) goto L58
            r1.A00 = r2
        L58:
            r3.add(r1)
            goto L37
        L5c:
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()
            throw r0
        L61:
            java.lang.IllegalStateException r0 = X.AbstractC31172DnG.A0u()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LHJ.A01(com.instagram.common.typedurl.ImageUrl, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.KAw, java.lang.Object] */
    public static void A02(List list) {
        C47472Ky1 A00 = C47472Ky1.A00();
        EnumC46119KbJ enumC46119KbJ = EnumC46119KbJ.A03;
        ?? obj = new Object();
        obj.A00 = list;
        if (enumC46119KbJ.A02.isAssignableFrom(obj.getClass()) && AbstractC166987dD.A1a(enumC46119KbJ.A01.A00())) {
            InterfaceC19610xo ARD = A00.A00.ARD();
            ARD.E7K("cloud_account_user_map", enumC46119KbJ.A00.F7n(obj));
            ARD.apply();
        }
    }
}
