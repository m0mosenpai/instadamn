package X;

import android.view.View;
import java.io.PrintWriter;

/* loaded from: classes11.dex */
public final class WFE {
    public static final WFE A01 = new Object();
    public static final C02V A00 = new C02V();

    public static final String A00(CharSequence charSequence, int i) {
        if (charSequence != null && charSequence.length() != 0) {
            String A0d = AbstractC002300n.A0d(AbstractC002300n.A0d(charSequence.toString(), " \n", " ", false), "\n", " ", false);
            if (charSequence.length() > i) {
                return AnonymousClass001.A0R(AbstractC25227BEk.A0w(A0d, 0, i), "...");
            }
            return A0d;
        }
        return "";
    }

    /* JADX WARN: Can't wrap try/catch for region: R(53:6|(3:8|(2:10|(1:12)(1:160))(1:162)|161)(1:163)|13|(1:15)|16|(1:18)(1:159)|19|(1:21)|22|(1:24)|25|(1:27)(1:158)|28|(1:30)(1:157)|31|(1:33)|34|(1:36)(1:156)|37|(1:39)|40|(1:42)(1:155)|43|(1:45)|46|(2:47|48)|(2:50|(28:53|(2:55|(2:57|58)(1:150))(1:151)|59|60|61|62|(1:64)(2:116|(4:124|(6:126|(1:128)|129|130|(2:139|(3:144|145|146)(3:141|142|143))(2:132|(2:134|135)(1:137))|136)|147|138))|(1:68)|70|71|72|73|74|75|(1:77)|78|(2:81|79)|82|83|(1:85)|86|(1:88)|89|90|91|(3:93|94|95)|99|(1:109)(3:103|(1:104)|107)))|152|60|61|62|(0)(0)|(2:66|68)|70|71|72|73|74|75|(0)|78|(1:79)|82|83|(0)|86|(0)|89|90|91|(0)|99|(2:101|109)(1:110)) */
    /* JADX WARN: Can't wrap try/catch for region: R(54:6|(3:8|(2:10|(1:12)(1:160))(1:162)|161)(1:163)|13|(1:15)|16|(1:18)(1:159)|19|(1:21)|22|(1:24)|25|(1:27)(1:158)|28|(1:30)(1:157)|31|(1:33)|34|(1:36)(1:156)|37|(1:39)|40|(1:42)(1:155)|43|(1:45)|46|47|48|(2:50|(28:53|(2:55|(2:57|58)(1:150))(1:151)|59|60|61|62|(1:64)(2:116|(4:124|(6:126|(1:128)|129|130|(2:139|(3:144|145|146)(3:141|142|143))(2:132|(2:134|135)(1:137))|136)|147|138))|(1:68)|70|71|72|73|74|75|(1:77)|78|(2:81|79)|82|83|(1:85)|86|(1:88)|89|90|91|(3:93|94|95)|99|(1:109)(3:103|(1:104)|107)))|152|60|61|62|(0)(0)|(2:66|68)|70|71|72|73|74|75|(0)|78|(1:79)|82|83|(0)|86|(0)|89|90|91|(0)|99|(2:101|109)(1:110)) */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0384, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0385, code lost:
    
        r2.put("DUMP-ERROR", A00(r0.getMessage(), 50));
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x01e7, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x01e8, code lost:
    
        X.C0K8.A0F("ViewHierarchyDumper", "Failed to get view text", r2);
     */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0182 A[Catch: Exception -> 0x01e7, TryCatch #1 {Exception -> 0x01e7, blocks: (B:62:0x0172, B:64:0x0176, B:66:0x01cd, B:68:0x01d3, B:116:0x0182, B:118:0x0188, B:120:0x018e, B:122:0x0194, B:124:0x019a, B:129:0x01ab, B:138:0x01c7), top: B:61:0x0172 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0176 A[Catch: Exception -> 0x01e7, TryCatch #1 {Exception -> 0x01e7, blocks: (B:62:0x0172, B:64:0x0176, B:66:0x01cd, B:68:0x01d3, B:116:0x0182, B:118:0x0188, B:120:0x018e, B:122:0x0194, B:124:0x019a, B:129:0x01ab, B:138:0x01c7), top: B:61:0x0172 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0206 A[Catch: Exception -> 0x0384, TryCatch #3 {Exception -> 0x0384, blocks: (B:75:0x0202, B:77:0x0206, B:78:0x0244, B:79:0x0251, B:81:0x0257, B:83:0x026f, B:85:0x0275, B:86:0x027a, B:88:0x028c, B:89:0x0291), top: B:74:0x0202 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0257 A[Catch: Exception -> 0x0384, LOOP:0: B:79:0x0251->B:81:0x0257, LOOP_END, TryCatch #3 {Exception -> 0x0384, blocks: (B:75:0x0202, B:77:0x0206, B:78:0x0244, B:79:0x0251, B:81:0x0257, B:83:0x026f, B:85:0x0275, B:86:0x027a, B:88:0x028c, B:89:0x0291), top: B:74:0x0202 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0275 A[Catch: Exception -> 0x0384, TryCatch #3 {Exception -> 0x0384, blocks: (B:75:0x0202, B:77:0x0206, B:78:0x0244, B:79:0x0251, B:81:0x0257, B:83:0x026f, B:85:0x0275, B:86:0x027a, B:88:0x028c, B:89:0x0291), top: B:74:0x0202 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x028c A[Catch: Exception -> 0x0384, TryCatch #3 {Exception -> 0x0384, blocks: (B:75:0x0202, B:77:0x0206, B:78:0x0244, B:79:0x0251, B:81:0x0257, B:83:0x026f, B:85:0x0275, B:86:0x027a, B:88:0x028c, B:89:0x0291), top: B:74:0x0202 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x03b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(android.view.View r11, X.WFE r12, java.io.PrintWriter r13, int r14, int r15, int r16) {
        /*
            Method dump skipped, instructions count: 1015
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WFE.A01(android.view.View, X.WFE, java.io.PrintWriter, int, int, int):void");
    }

    private final void A02(View view, PrintWriter printWriter) {
        String str;
        Object tag = view.getTag();
        if ((tag instanceof String) && (str = (String) tag) != null && str.length() != 0) {
            printWriter.print(" app:tag/");
            printWriter.print(A00(str, 60));
        }
    }
}
