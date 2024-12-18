package X;

import android.content.Context;
import java.io.File;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0gI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10050gI {
    public static C10050gI A03;
    public static final AtomicInteger A04 = new AtomicInteger();
    public final Context A00;
    public final C19490xZ A01;
    public final C09970fz A02;

    public final synchronized void A03(String str) {
        A04(str);
    }

    @Deprecated
    public static synchronized C10050gI A00(Context context, C19490xZ c19490xZ, C09970fz c09970fz) {
        C10050gI c10050gI;
        synchronized (C10050gI.class) {
            c10050gI = A03;
            if (c10050gI != null) {
                if (c10050gI.A01 != c19490xZ) {
                    throw new RuntimeException("Different VoltronModuleLoaders detected!");
                }
            } else {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                c10050gI = new C10050gI(context, c19490xZ, c09970fz);
                A03 = c10050gI;
            }
        }
        return c10050gI;
    }

    public final File A01(String str) {
        File A00;
        Context context = this.A00;
        if (AbstractC10000gD.A01(context, str) && (A00 = AbstractC10000gD.A00(context, str)) != null) {
            return A00;
        }
        if (C09890fq.A00(context) && AbstractC09930fu.A01(str) == C05F.A0N) {
            String A02 = A02(str);
            if (A02 == null) {
                C0K8.A0P("VoltronModuleManager", "Hash not found for module %s", str);
                return null;
            }
            return this.A02.A03(str, A02);
        }
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:167|(2:169|170)(2:282|(7:284|172|(5:177|178|179|181|182)(4:270|271|(1:276)|218)|183|35e|(5:210|211|444|216|217)(1:224)|218))|171|172|(2:174|176)(1:281)|177|178|179|181|182|183|35e|165) */
    /* JADX WARN: Can't wrap try/catch for region: R(27:58|(1:60)|132|62|(1:64)|(2:66|67)(2:129|(1:131))|68|(1:70)(1:128)|71|(14:73|(3:76|(1:78)(1:119)|74)|120|91|(2:92|(1:94)(1:95))|96|(2:99|97)|100|101|(2:104|102)|105|106|(3:108|(2:110|111)(1:113)|112)|114)(15:121|122|123|(1:125)|91|(3:92|(0)(0)|94)|96|(1:97)|100|101|(1:102)|105|106|(0)|114)|79|80|81|82|(3:84|(2:86|87)(1:89)|88)|90|91|(3:92|(0)(0)|94)|96|(1:97)|100|101|(1:102)|105|106|(0)|114) */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0166, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0167, code lost:
    
        X.C0K8.A0G("FbVoltronModuleLoader", "cannot read base.apk element from ClassLoader", r13);
        r10.clear();
        r9.clear();
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x039c, code lost:
    
        if (r13 == null) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x039e, code lost:
    
        r1 = X.C09340dj.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x03a0, code lost:
    
        if (r1 != null) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x03d9, code lost:
    
        r2 = new X.C0Q9(X.C09340dj.A00, r1, r7, r9, r10, X.AnonymousClass001.A0g(r13, "libs", r1.A01), X.AnonymousClass001.A0R(r13, "libs.txt"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x03f7, code lost:
    
        r11.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x041c, code lost:
    
        if (X.C09340dj.A00 == null) goto L301;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0424, code lost:
    
        if (X.C09340dj.A02.contains(r10) != false) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x0426, code lost:
    
        X.C09170dP.A08(r2);
        X.C09340dj.A02.add(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x042e, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0467, code lost:
    
        throw new java.lang.RuntimeException(X.AnonymousClass001.A0R("FbSoLoader.init() was not called prior to loading additional asset: ", r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x03a2, code lost:
    
        r14 = X.EnumC09360dl.values();
        r0 = r14.length;
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x03ac, code lost:
    
        if (r2 >= r0) goto L314;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x03ae, code lost:
    
        r1 = r14[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x03bd, code lost:
    
        if (r11.getEntry(X.AnonymousClass001.A0g(r13, "libs", r1.A01)) != null) goto L315;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x03bf, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x03d4, code lost:
    
        X.C09340dj.A01 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x03d6, code lost:
    
        if (r1 != null) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x03fb, code lost:
    
        r11.close();
        android.util.Log.e("SoLoader", X.AnonymousClass001.A0g("Superpack compression type null for ", r10, ", will fallback to PlainAssetSoSource."));
        r2 = new X.C0QB(X.C09340dj.A00, r7, r9, X.AnonymousClass001.A0g("^assets/(", r10, "/)?([^/]+)/([^/]+\\.so)$"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x03c2, code lost:
    
        android.util.Log.e("FbSoLoader", X.AnonymousClass001.A0u("Metadata file libs.txt exists but couldn't find any compressed native lib file (libs.xxx) in path = ", r13, " for zipFile = ", r11.getName()));
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x02d5, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00c9, code lost:
    
        if (r9.exists() == false) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01e0 A[Catch: all -> 0x04e7, LOOP:5: B:102:0x01da->B:104:0x01e0, LOOP_END, TryCatch #6 {all -> 0x04e7, blocks: (B:13:0x0037, B:15:0x0049, B:17:0x0051, B:20:0x0057, B:22:0x005d, B:26:0x0479, B:27:0x047d, B:28:0x048a, B:30:0x006d, B:31:0x0077, B:33:0x007d, B:36:0x0089, B:39:0x008f, B:41:0x0099, B:43:0x00a1, B:46:0x00a7, B:48:0x00ad, B:54:0x0207, B:55:0x020b, B:58:0x00b7, B:60:0x00c4, B:62:0x00cc, B:64:0x00d4, B:67:0x00fa, B:70:0x0101, B:71:0x0108, B:73:0x010f, B:74:0x0115, B:76:0x011b, B:79:0x012b, B:81:0x0156, B:82:0x0172, B:84:0x019a, B:86:0x01a2, B:88:0x01a7, B:118:0x0167, B:91:0x01aa, B:92:0x01b0, B:94:0x01b6, B:96:0x01bc, B:97:0x01c0, B:99:0x01c6, B:101:0x01d0, B:102:0x01da, B:104:0x01e0, B:108:0x01ec, B:110:0x01f9, B:112:0x01fe, B:121:0x0136, B:123:0x013c, B:125:0x014a, B:128:0x014e, B:129:0x00e4, B:131:0x00f6, B:136:0x021a, B:138:0x0220, B:140:0x0253, B:142:0x0262, B:143:0x0275, B:145:0x0281, B:147:0x028a, B:148:0x0295, B:150:0x029b, B:151:0x02a7, B:153:0x02ad, B:155:0x02b3, B:156:0x02b7, B:158:0x02bd, B:161:0x02c8, B:163:0x02ce, B:164:0x02d1, B:165:0x02d5, B:167:0x02db, B:172:0x0303, B:174:0x030b, B:274:0x0315, B:183:0x033f, B:184:0x035e, B:208:0x043d, B:211:0x0440, B:212:0x0444, B:215:0x044a, B:221:0x0450, B:266:0x0477, B:177:0x031c, B:179:0x0322, B:182:0x0332, B:282:0x02ea, B:284:0x02fd, B:287:0x048d, B:186:0x035f, B:262:0x046a, B:263:0x0475, B:214:0x0445), top: B:12:0x0037, outer: #9, inners: #4, #8, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01ec A[Catch: all -> 0x04e7, TryCatch #6 {all -> 0x04e7, blocks: (B:13:0x0037, B:15:0x0049, B:17:0x0051, B:20:0x0057, B:22:0x005d, B:26:0x0479, B:27:0x047d, B:28:0x048a, B:30:0x006d, B:31:0x0077, B:33:0x007d, B:36:0x0089, B:39:0x008f, B:41:0x0099, B:43:0x00a1, B:46:0x00a7, B:48:0x00ad, B:54:0x0207, B:55:0x020b, B:58:0x00b7, B:60:0x00c4, B:62:0x00cc, B:64:0x00d4, B:67:0x00fa, B:70:0x0101, B:71:0x0108, B:73:0x010f, B:74:0x0115, B:76:0x011b, B:79:0x012b, B:81:0x0156, B:82:0x0172, B:84:0x019a, B:86:0x01a2, B:88:0x01a7, B:118:0x0167, B:91:0x01aa, B:92:0x01b0, B:94:0x01b6, B:96:0x01bc, B:97:0x01c0, B:99:0x01c6, B:101:0x01d0, B:102:0x01da, B:104:0x01e0, B:108:0x01ec, B:110:0x01f9, B:112:0x01fe, B:121:0x0136, B:123:0x013c, B:125:0x014a, B:128:0x014e, B:129:0x00e4, B:131:0x00f6, B:136:0x021a, B:138:0x0220, B:140:0x0253, B:142:0x0262, B:143:0x0275, B:145:0x0281, B:147:0x028a, B:148:0x0295, B:150:0x029b, B:151:0x02a7, B:153:0x02ad, B:155:0x02b3, B:156:0x02b7, B:158:0x02bd, B:161:0x02c8, B:163:0x02ce, B:164:0x02d1, B:165:0x02d5, B:167:0x02db, B:172:0x0303, B:174:0x030b, B:274:0x0315, B:183:0x033f, B:184:0x035e, B:208:0x043d, B:211:0x0440, B:212:0x0444, B:215:0x044a, B:221:0x0450, B:266:0x0477, B:177:0x031c, B:179:0x0322, B:182:0x0332, B:282:0x02ea, B:284:0x02fd, B:287:0x048d, B:186:0x035f, B:262:0x046a, B:263:0x0475, B:214:0x0445), top: B:12:0x0037, outer: #9, inners: #4, #8, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x035f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01b6 A[Catch: all -> 0x04e7, LOOP:3: B:92:0x01b0->B:94:0x01b6, LOOP_END, TryCatch #6 {all -> 0x04e7, blocks: (B:13:0x0037, B:15:0x0049, B:17:0x0051, B:20:0x0057, B:22:0x005d, B:26:0x0479, B:27:0x047d, B:28:0x048a, B:30:0x006d, B:31:0x0077, B:33:0x007d, B:36:0x0089, B:39:0x008f, B:41:0x0099, B:43:0x00a1, B:46:0x00a7, B:48:0x00ad, B:54:0x0207, B:55:0x020b, B:58:0x00b7, B:60:0x00c4, B:62:0x00cc, B:64:0x00d4, B:67:0x00fa, B:70:0x0101, B:71:0x0108, B:73:0x010f, B:74:0x0115, B:76:0x011b, B:79:0x012b, B:81:0x0156, B:82:0x0172, B:84:0x019a, B:86:0x01a2, B:88:0x01a7, B:118:0x0167, B:91:0x01aa, B:92:0x01b0, B:94:0x01b6, B:96:0x01bc, B:97:0x01c0, B:99:0x01c6, B:101:0x01d0, B:102:0x01da, B:104:0x01e0, B:108:0x01ec, B:110:0x01f9, B:112:0x01fe, B:121:0x0136, B:123:0x013c, B:125:0x014a, B:128:0x014e, B:129:0x00e4, B:131:0x00f6, B:136:0x021a, B:138:0x0220, B:140:0x0253, B:142:0x0262, B:143:0x0275, B:145:0x0281, B:147:0x028a, B:148:0x0295, B:150:0x029b, B:151:0x02a7, B:153:0x02ad, B:155:0x02b3, B:156:0x02b7, B:158:0x02bd, B:161:0x02c8, B:163:0x02ce, B:164:0x02d1, B:165:0x02d5, B:167:0x02db, B:172:0x0303, B:174:0x030b, B:274:0x0315, B:183:0x033f, B:184:0x035e, B:208:0x043d, B:211:0x0440, B:212:0x0444, B:215:0x044a, B:221:0x0450, B:266:0x0477, B:177:0x031c, B:179:0x0322, B:182:0x0332, B:282:0x02ea, B:284:0x02fd, B:287:0x048d, B:186:0x035f, B:262:0x046a, B:263:0x0475, B:214:0x0445), top: B:12:0x0037, outer: #9, inners: #4, #8, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01bc A[EDGE_INSN: B:95:0x01bc->B:96:0x01bc BREAK  A[LOOP:3: B:92:0x01b0->B:94:0x01b6], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01c6 A[Catch: all -> 0x04e7, LOOP:4: B:97:0x01c0->B:99:0x01c6, LOOP_END, TryCatch #6 {all -> 0x04e7, blocks: (B:13:0x0037, B:15:0x0049, B:17:0x0051, B:20:0x0057, B:22:0x005d, B:26:0x0479, B:27:0x047d, B:28:0x048a, B:30:0x006d, B:31:0x0077, B:33:0x007d, B:36:0x0089, B:39:0x008f, B:41:0x0099, B:43:0x00a1, B:46:0x00a7, B:48:0x00ad, B:54:0x0207, B:55:0x020b, B:58:0x00b7, B:60:0x00c4, B:62:0x00cc, B:64:0x00d4, B:67:0x00fa, B:70:0x0101, B:71:0x0108, B:73:0x010f, B:74:0x0115, B:76:0x011b, B:79:0x012b, B:81:0x0156, B:82:0x0172, B:84:0x019a, B:86:0x01a2, B:88:0x01a7, B:118:0x0167, B:91:0x01aa, B:92:0x01b0, B:94:0x01b6, B:96:0x01bc, B:97:0x01c0, B:99:0x01c6, B:101:0x01d0, B:102:0x01da, B:104:0x01e0, B:108:0x01ec, B:110:0x01f9, B:112:0x01fe, B:121:0x0136, B:123:0x013c, B:125:0x014a, B:128:0x014e, B:129:0x00e4, B:131:0x00f6, B:136:0x021a, B:138:0x0220, B:140:0x0253, B:142:0x0262, B:143:0x0275, B:145:0x0281, B:147:0x028a, B:148:0x0295, B:150:0x029b, B:151:0x02a7, B:153:0x02ad, B:155:0x02b3, B:156:0x02b7, B:158:0x02bd, B:161:0x02c8, B:163:0x02ce, B:164:0x02d1, B:165:0x02d5, B:167:0x02db, B:172:0x0303, B:174:0x030b, B:274:0x0315, B:183:0x033f, B:184:0x035e, B:208:0x043d, B:211:0x0440, B:212:0x0444, B:215:0x044a, B:221:0x0450, B:266:0x0477, B:177:0x031c, B:179:0x0322, B:182:0x0332, B:282:0x02ea, B:284:0x02fd, B:287:0x048d, B:186:0x035f, B:262:0x046a, B:263:0x0475, B:214:0x0445), top: B:12:0x0037, outer: #9, inners: #4, #8, #11 }] */
    /* JADX WARN: Type inference failed for: r18v1, types: [java.lang.Object, X.0fs] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void A04(java.lang.String r32) {
        /*
            Method dump skipped, instructions count: 1278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10050gI.A04(java.lang.String):void");
    }

    public C10050gI(Context context, C19490xZ c19490xZ, C09970fz c09970fz) {
        this.A00 = context;
        this.A01 = c19490xZ;
        this.A02 = c09970fz;
    }

    public final String A02(String str) {
        if (AbstractC09930fu.A01(str) != C05F.A0N) {
            return null;
        }
        C0g3.A00().A06(this.A00);
        return C0g3.A00().A02(str);
    }
}
