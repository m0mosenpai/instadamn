package X;

/* renamed from: X.3rj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC85543rj extends AbstractC85213rC {
    public int A00;
    public String A01;
    public boolean A02;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
    
        if (r1 != (-1)) goto L5;
     */
    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void updateDrawState(android.text.TextPaint r5) {
        /*
            r4 = this;
            r3 = 0
            X.C14360o3.A0B(r5, r3)
            int r0 = r4.A00
            if (r0 != 0) goto L3b
            int r1 = r5.linkColor
        La:
            r5.setColor(r1)
        Ld:
            boolean r0 = r4.A02
            if (r0 == 0) goto L24
            android.graphics.Typeface r1 = r5.getTypeface()
            r0 = 1
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r1, r0)
            r5.setTypeface(r0)
        L1d:
            int r0 = r5.getColor()
            r4.A00 = r0
            return
        L24:
            java.lang.String r1 = r4.A01
            java.lang.String r0 = ""
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 != 0) goto L1d
            android.graphics.Typeface r2 = android.graphics.Typeface.create(r1, r3)
            java.lang.Integer r1 = X.AbstractC14710oj.A05(r1, r3)
            r0 = 0
            X.AbstractC14710oj.A06(r0, r2, r5, r1)
            goto L1d
        L3b:
            int r1 = r4.A00
            r0 = -1
            if (r1 == r0) goto Ld
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC85543rj.updateDrawState(android.text.TextPaint):void");
    }

    public AbstractC85543rj(boolean z, int i) {
        this("", i, z);
    }

    public AbstractC85543rj(String str, int i, boolean z) {
        this.A02 = z;
        this.A00 = i;
        this.A01 = str;
    }

    public AbstractC85543rj() {
        this.A01 = "";
    }
}
