package X;

import android.text.Layout;
import android.text.TextPaint;
import java.text.BreakIterator;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

/* renamed from: X.5gt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C122585gt implements InterfaceC122595gu {
    public ABI A00;
    public final int A01;
    public final C118125Vw A02;
    public final C122725h8 A03;
    public final C5DD A04;
    public final C122605gv A05;
    public final CharSequence A06;
    public final InterfaceC1128957x A07;
    public final String A08;
    public final List A09;
    public final List A0A;
    public final boolean A0B;

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0289, code lost:
    
        if (X.AbstractC118155Vz.A02(r4.A04) != false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0162, code lost:
    
        if (r1 == 1) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x021b, code lost:
    
        if (X.C118135Vx.A00(r1) != 0.0f) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0229, code lost:
    
        if (r3 == X.C1132359l.A07) goto L103;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0623  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0680  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0571  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0713  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0718  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x074d  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0778  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0065  */
    /* JADX WARN: Type inference failed for: r18v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r18v1, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r18v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v46, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r1v48, types: [android.text.Spanned, java.lang.CharSequence, android.text.Spannable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v50, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r1v93 */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.5gv, android.text.TextPaint, android.graphics.Paint] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C122585gt(X.C118125Vw r40, X.C5DD r41, X.InterfaceC1128957x r42, java.lang.String r43, java.util.List r44, java.util.List r45) {
        /*
            Method dump skipped, instructions count: 1918
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C122585gt.<init>(X.5Vw, X.5DD, X.57x, java.lang.String, java.util.List, java.util.List):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // X.InterfaceC122595gu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean BCg() {
        /*
            r3 = this;
            X.ABI r0 = r3.A00
            r2 = 0
            if (r0 == 0) goto Lb
            boolean r0 = r0.A00()
            if (r0 != 0) goto L30
        Lb:
            boolean r0 = r3.A0B
            if (r0 != 0) goto L31
            X.5gx r1 = X.AbstractC122615gw.A00
            X.5gy r1 = (X.C122635gy) r1
            X.3Ym r0 = r1.A00
            if (r0 != 0) goto L21
            X.Ptc r0 = X.C58341Ptc.A09
            if (r0 == 0) goto L32
            X.3Ym r0 = X.C122635gy.A00(r1)
            r1.A00 = r0
        L21:
            X.C14360o3.A0A(r0)
        L24:
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L31
        L30:
            r2 = 1
        L31:
            return r2
        L32:
            X.5gz r0 = X.AbstractC68620VXw.A00
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C122585gt.BCg():boolean");
    }

    @Override // X.InterfaceC122595gu
    public final float BPq() {
        return this.A03.A00();
    }

    @Override // X.InterfaceC122595gu
    public final float BTs() {
        C122725h8 c122725h8 = this.A03;
        float f = c122725h8.A00;
        if (Float.isNaN(f)) {
            CharSequence charSequence = c122725h8.A06;
            TextPaint textPaint = c122725h8.A05;
            BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
            lineInstance.setText(new TS6(charSequence, charSequence.length()));
            PriorityQueue priorityQueue = new PriorityQueue(10, new Comparator() { // from class: X.B0F
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    C09530e4 c09530e4 = (C09530e4) obj;
                    C09530e4 c09530e42 = (C09530e4) obj2;
                    return (AbstractC166987dD.A0H(c09530e4.A01) - AbstractC166987dD.A0H(c09530e4.A00)) - (AbstractC166987dD.A0H(c09530e42.A01) - AbstractC166987dD.A0H(c09530e42.A00));
                }
            });
            int next = lineInstance.next();
            int i = next;
            int i2 = 0;
            while (next != -1) {
                if (priorityQueue.size() >= 10) {
                    C09530e4 c09530e4 = (C09530e4) priorityQueue.peek();
                    if (c09530e4 != null && ((Number) c09530e4.A01).intValue() - ((Number) c09530e4.A00).intValue() < next - i2) {
                        priorityQueue.poll();
                    }
                    next = lineInstance.next();
                    i2 = i;
                    i = next;
                }
                priorityQueue.add(new C09530e4(Integer.valueOf(i2), Integer.valueOf(next)));
                next = lineInstance.next();
                i2 = i;
                i = next;
            }
            f = 0.0f;
            Iterator it = priorityQueue.iterator();
            while (it.hasNext()) {
                C09530e4 c09530e42 = (C09530e4) it.next();
                f = Math.max(f, Layout.getDesiredWidth(charSequence, ((Number) c09530e42.A00).intValue(), ((Number) c09530e42.A01).intValue(), textPaint));
            }
            c122725h8.A00 = f;
        }
        return f;
    }
}
