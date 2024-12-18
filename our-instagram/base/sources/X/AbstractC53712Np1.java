package X;

/* renamed from: X.Np1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53712Np1 {
    /* JADX WARN: Code restructure failed: missing block: B:200:0x02e9, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x02ef, code lost:
    
        throw new java.lang.RuntimeException(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f9, code lost:
    
        r8 = java.lang.Integer.toString(r40);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0101, code lost:
    
        if (r5.containsKey(r8) == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0103, code lost:
    
        r9 = X.MSW.A18(r8, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0107, code lost:
    
        if (r9 == null) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x010d, code lost:
    
        if (r9.isEmpty() != false) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x010f, code lost:
    
        r12 = ((X.C5NW) r9.get(0)).A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x02de, code lost:
    
        throw X.MSY.A0d("could not find key in configs ", r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x011d, code lost:
    
        if (r4.containsKey(r2) == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x011f, code lost:
    
        r8 = X.MSW.A18(r2, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0123, code lost:
    
        if (r8 == null) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0129, code lost:
    
        if (r8.isEmpty() != false) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x012b, code lost:
    
        r12 = ((X.C5NW) r8.get(0)).A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:?, code lost:
    
        throw X.MSY.A0d("could not find configName in configs ", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0135, code lost:
    
        r18 = r18 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0137, code lost:
    
        if (r40 != 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0139, code lost:
    
        r8 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x013a, code lost:
    
        r5.put(r8, X.AbstractC166987dD.A1H());
        r4.put(r8, X.AbstractC166987dD.A1E());
        r24.put(java.lang.Integer.valueOf(r18), r8);
     */
    /* JADX WARN: Removed duplicated region for block: B:141:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0258 A[Catch: all -> 0x02df, TryCatch #2 {all -> 0x02df, blocks: (B:21:0x007e, B:24:0x0088, B:26:0x0092, B:28:0x00a4, B:30:0x00ac, B:32:0x00b5, B:34:0x00bd, B:36:0x00c5, B:39:0x00d0, B:41:0x00d8, B:43:0x00e3, B:45:0x00eb, B:52:0x00f9, B:54:0x0103, B:56:0x0109, B:58:0x010f, B:61:0x02d8, B:62:0x02de, B:65:0x0119, B:67:0x011f, B:69:0x0125, B:71:0x012b, B:74:0x02ca, B:78:0x0135, B:81:0x013a, B:84:0x02b0, B:88:0x0153, B:95:0x0162, B:98:0x0179, B:104:0x0182, B:107:0x018c, B:109:0x0198, B:110:0x019e, B:112:0x01a2, B:114:0x01b0, B:116:0x01bf, B:118:0x01c5, B:127:0x01d6, B:129:0x01b7, B:132:0x01dc, B:134:0x01e4, B:137:0x01f9, B:138:0x020e, B:142:0x0221, B:148:0x0231, B:152:0x0249, B:153:0x024d, B:159:0x0258, B:161:0x0200, B:163:0x0208, B:166:0x02d1, B:168:0x025e, B:171:0x0273, B:173:0x0276, B:175:0x027e, B:176:0x0284, B:178:0x02a9), top: B:20:0x007e, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0200 A[Catch: all -> 0x02df, TryCatch #2 {all -> 0x02df, blocks: (B:21:0x007e, B:24:0x0088, B:26:0x0092, B:28:0x00a4, B:30:0x00ac, B:32:0x00b5, B:34:0x00bd, B:36:0x00c5, B:39:0x00d0, B:41:0x00d8, B:43:0x00e3, B:45:0x00eb, B:52:0x00f9, B:54:0x0103, B:56:0x0109, B:58:0x010f, B:61:0x02d8, B:62:0x02de, B:65:0x0119, B:67:0x011f, B:69:0x0125, B:71:0x012b, B:74:0x02ca, B:78:0x0135, B:81:0x013a, B:84:0x02b0, B:88:0x0153, B:95:0x0162, B:98:0x0179, B:104:0x0182, B:107:0x018c, B:109:0x0198, B:110:0x019e, B:112:0x01a2, B:114:0x01b0, B:116:0x01bf, B:118:0x01c5, B:127:0x01d6, B:129:0x01b7, B:132:0x01dc, B:134:0x01e4, B:137:0x01f9, B:138:0x020e, B:142:0x0221, B:148:0x0231, B:152:0x0249, B:153:0x024d, B:159:0x0258, B:161:0x0200, B:163:0x0208, B:166:0x02d1, B:168:0x025e, B:171:0x0273, B:173:0x0276, B:175:0x027e, B:176:0x0284, B:178:0x02a9), top: B:20:0x007e, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d0 A[Catch: all -> 0x02df, TryCatch #2 {all -> 0x02df, blocks: (B:21:0x007e, B:24:0x0088, B:26:0x0092, B:28:0x00a4, B:30:0x00ac, B:32:0x00b5, B:34:0x00bd, B:36:0x00c5, B:39:0x00d0, B:41:0x00d8, B:43:0x00e3, B:45:0x00eb, B:52:0x00f9, B:54:0x0103, B:56:0x0109, B:58:0x010f, B:61:0x02d8, B:62:0x02de, B:65:0x0119, B:67:0x011f, B:69:0x0125, B:71:0x012b, B:74:0x02ca, B:78:0x0135, B:81:0x013a, B:84:0x02b0, B:88:0x0153, B:95:0x0162, B:98:0x0179, B:104:0x0182, B:107:0x018c, B:109:0x0198, B:110:0x019e, B:112:0x01a2, B:114:0x01b0, B:116:0x01bf, B:118:0x01c5, B:127:0x01d6, B:129:0x01b7, B:132:0x01dc, B:134:0x01e4, B:137:0x01f9, B:138:0x020e, B:142:0x0221, B:148:0x0231, B:152:0x0249, B:153:0x024d, B:159:0x0258, B:161:0x0200, B:163:0x0208, B:166:0x02d1, B:168:0x025e, B:171:0x0273, B:173:0x0276, B:175:0x027e, B:176:0x0284, B:178:0x02a9), top: B:20:0x007e, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e3 A[Catch: all -> 0x02df, TryCatch #2 {all -> 0x02df, blocks: (B:21:0x007e, B:24:0x0088, B:26:0x0092, B:28:0x00a4, B:30:0x00ac, B:32:0x00b5, B:34:0x00bd, B:36:0x00c5, B:39:0x00d0, B:41:0x00d8, B:43:0x00e3, B:45:0x00eb, B:52:0x00f9, B:54:0x0103, B:56:0x0109, B:58:0x010f, B:61:0x02d8, B:62:0x02de, B:65:0x0119, B:67:0x011f, B:69:0x0125, B:71:0x012b, B:74:0x02ca, B:78:0x0135, B:81:0x013a, B:84:0x02b0, B:88:0x0153, B:95:0x0162, B:98:0x0179, B:104:0x0182, B:107:0x018c, B:109:0x0198, B:110:0x019e, B:112:0x01a2, B:114:0x01b0, B:116:0x01bf, B:118:0x01c5, B:127:0x01d6, B:129:0x01b7, B:132:0x01dc, B:134:0x01e4, B:137:0x01f9, B:138:0x020e, B:142:0x0221, B:148:0x0231, B:152:0x0249, B:153:0x024d, B:159:0x0258, B:161:0x0200, B:163:0x0208, B:166:0x02d1, B:168:0x025e, B:171:0x0273, B:173:0x0276, B:175:0x027e, B:176:0x0284, B:178:0x02a9), top: B:20:0x007e, outer: #0 }] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, X.5NV] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C5NV A00(java.lang.String r43, boolean r44) {
        /*
            Method dump skipped, instructions count: 828
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC53712Np1.A00(java.lang.String, boolean):X.5NV");
    }
}
