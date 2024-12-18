package X;

/* renamed from: X.Wps, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71203Wps implements Runnable {
    /* JADX WARN: Code restructure failed: missing block: B:100:0x021a, code lost:
    
        r0 = ((kotlinx.serialization.json.JsonPrimitive) r1).A00();
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0220, code lost:
    
        r12.put(r2, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0224, code lost:
    
        r0 = r1.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0229, code lost:
    
        r12 = X.AbstractC06930Yk.A0E();
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x01db, code lost:
    
        r2 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x02c0, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x016d, code lost:
    
        r0 = r2.A06;
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0170, code lost:
    
        if (r0 == null) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0172, code lost:
    
        r2 = r0.E2i();
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0176, code lost:
    
        r0 = X.AbstractC38581qm.A00(new java.io.InputStreamReader(r2, "utf-8"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0181, code lost:
    
        if (r2 == null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0183, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0186, code lost:
    
        r2 = java.net.URLDecoder.decode(r0);
        X.C14360o3.A0B(r2, 0);
        r12 = X.AbstractC001900j.A0Q(r2, new char[]{'&'}, 0).iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01a0, code lost:
    
        if (r12.hasNext() == false) goto L311;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01a2, code lost:
    
        r2 = X.AbstractC001900j.A0Q((java.lang.String) r12.next(), new char[]{'='}, 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01bd, code lost:
    
        if ("signed_body".equals(r2.get(0)) == false) goto L313;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01bf, code lost:
    
        r2 = ((java.lang.String) r2.get(1)).substring(X.AbstractC001900j.A04((java.lang.CharSequence) r2.get(1), '.', 0) + 1);
        X.C14360o3.A07(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01dd, code lost:
    
        r1 = X.AbstractC100754fe.A03((kotlinx.serialization.json.JsonElement) X.AbstractC73763Sg.A03.A00(r2, kotlinx.serialization.json.JsonElementSerializer.A00));
        r12 = new java.util.LinkedHashMap(X.AbstractC16850sd.A0L(r1.size()));
        r13 = r1.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0204, code lost:
    
        if (r13.hasNext() == false) goto L314;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0206, code lost:
    
        r0 = r13.next();
        r2 = r0.getKey();
        r1 = r0.getValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0218, code lost:
    
        if ((r1 instanceof kotlinx.serialization.json.JsonPrimitive) == false) goto L76;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:293:0x05c1  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x05ed  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x064a A[LOOP:23: B:314:0x0644->B:316:0x064a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0667  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x067c  */
    /* JADX WARN: Type inference failed for: r11v3, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v11, types: [X.0sk] */
    /* JADX WARN: Type inference failed for: r12v12, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r12v15, types: [java.util.LinkedHashMap, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.List, java.util.Collection] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 2113
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC71203Wps.run():void");
    }
}
