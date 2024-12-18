package X;

import java.util.regex.Pattern;

/* loaded from: classes11.dex */
public abstract class VKA {
    public int A00;
    public int A01;
    public String A02;

    public void A00(String str) {
        if (!(this instanceof C67669Uvh)) {
            if (this instanceof C67668Uvg) {
                ((C67668Uvg) this).A00 = Pattern.compile(str);
                return;
            }
            if (this instanceof C67667Uvf) {
                return;
            }
            if (this instanceof C67666Uve) {
                ((C67666Uve) this).A00 = Integer.parseInt(str);
            } else if (this instanceof C67665Uvd) {
                ((C67665Uvd) this).A00 = Integer.parseInt(str);
            } else {
                if (!(this instanceof Uvc)) {
                    return;
                }
                ((Uvc) this).A00 = Integer.parseInt(str);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b0, code lost:
    
        if (r9.length() == 0) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean A01(java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.VKA.A01(java.lang.String):boolean");
    }
}
