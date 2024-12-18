package X;

/* loaded from: classes10.dex */
public final class TEE implements InterfaceC65440TkC {
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        if (java.lang.Boolean.valueOf(r1) == null) goto L14;
     */
    @Override // X.InterfaceC65440TkC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object deserialize(com.google.gson.JsonElement r9, java.lang.reflect.Type r10, X.InterfaceC65286ThJ r11) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.google.gson.JsonObject
            r3 = 0
            r7 = 0
            if (r0 != 0) goto Ld
            X.QIe r0 = new X.QIe
            r0.<init>(r7, r7, r3)
            return r0
        Ld:
            com.google.gson.JsonObject r9 = (com.google.gson.JsonObject) r9
            java.lang.String r5 = "isGoodSwipe"
            com.google.gson.JsonElement r2 = r9.get(r5)
            if (r2 == 0) goto L2e
            boolean r0 = r2 instanceof com.google.gson.JsonPrimitive
            if (r0 == 0) goto L7f
            r1 = r2
            com.google.gson.JsonPrimitive r1 = (com.google.gson.JsonPrimitive) r1
            java.lang.Object r0 = r1.value
            boolean r0 = r0 instanceof java.lang.Boolean
            if (r0 == 0) goto L7f
            boolean r1 = r1.getAsBoolean()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            if (r0 != 0) goto L2f
        L2e:
            r1 = 0
        L2f:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r1)
            java.lang.String r5 = "dwellTime"
            com.google.gson.JsonElement r2 = r9.get(r5)
            if (r2 == 0) goto L50
            boolean r0 = r2 instanceof com.google.gson.JsonPrimitive
            if (r0 == 0) goto L7b
            r1 = r2
            com.google.gson.JsonPrimitive r1 = (com.google.gson.JsonPrimitive) r1
            java.lang.Object r0 = r1.value
            boolean r0 = r0 instanceof java.lang.Number
            if (r0 == 0) goto L7b
            long r0 = r1.getAsLong()
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
        L50:
            java.lang.String r5 = "timeStamp"
            com.google.gson.JsonElement r2 = r9.get(r5)
            if (r2 == 0) goto L71
            boolean r0 = r2 instanceof com.google.gson.JsonPrimitive
            if (r0 == 0) goto L77
            r1 = r2
            com.google.gson.JsonPrimitive r1 = (com.google.gson.JsonPrimitive) r1
            java.lang.Object r0 = r1.value
            boolean r0 = r0 instanceof java.lang.Number
            if (r0 == 0) goto L77
            long r1 = r1.getAsLong()
            java.lang.Long r0 = java.lang.Long.valueOf(r1)
            if (r0 == 0) goto L71
            r3 = r1
        L71:
            X.QIe r0 = new X.QIe
            r0.<init>(r6, r7, r3)
            return r0
        L77:
            X.S5Z.A00(r5, r2)
            goto L71
        L7b:
            X.S5Z.A00(r5, r2)
            goto L50
        L7f:
            X.S5Z.A00(r5, r2)
            goto L2e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TEE.deserialize(com.google.gson.JsonElement, java.lang.reflect.Type, X.ThJ):java.lang.Object");
    }
}
