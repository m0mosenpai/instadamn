package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class KLX extends AbstractRunnableC14200nk {
    public final /* synthetic */ UserSession A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KLX(UserSession userSession) {
        super(1765280269, 3, false, false);
        this.A00 = userSession;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0156, code lost:
    
        if (X.C11T.A08() != false) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x023d A[Catch: all -> 0x057d, TryCatch #3 {, blocks: (B:4:0x000d, B:6:0x002c, B:7:0x0030, B:34:0x010c, B:35:0x011a, B:37:0x0120, B:40:0x014b, B:42:0x0151, B:44:0x0159, B:46:0x018a, B:47:0x0192, B:49:0x0198, B:52:0x01a8, B:55:0x01ac, B:58:0x01b4, B:61:0x01b8, B:64:0x01bc, B:65:0x01c4, B:67:0x01ca, B:72:0x01d4, B:78:0x01d8, B:79:0x01e4, B:81:0x01ea, B:84:0x01f4, B:87:0x01fe, B:93:0x0210, B:102:0x0215, B:103:0x0224, B:105:0x021b, B:106:0x0235, B:108:0x023d, B:109:0x0245, B:111:0x024b, B:122:0x026e, B:123:0x0273, B:125:0x0279, B:127:0x028c, B:128:0x029f, B:130:0x02bf, B:133:0x02c3, B:136:0x02c7, B:147:0x02d1, B:151:0x02e0, B:153:0x02e4, B:155:0x02ea, B:157:0x02f5, B:158:0x02fe, B:161:0x0310, B:162:0x031c, B:164:0x0322, B:166:0x0332, B:118:0x0337, B:244:0x057c, B:175:0x03b2, B:176:0x03c0, B:178:0x03c6, B:179:0x0416, B:181:0x041c, B:183:0x0426, B:186:0x0430, B:187:0x0468, B:189:0x046e, B:191:0x0478, B:193:0x0481, B:195:0x048a, B:197:0x04a6, B:201:0x04ac, B:206:0x04b6, B:207:0x04ba, B:209:0x04bf, B:210:0x04c2, B:218:0x04ee, B:220:0x04f7, B:222:0x04fd, B:224:0x0517, B:228:0x0525, B:230:0x0532, B:233:0x053a, B:235:0x054e, B:238:0x055a, B:243:0x0576, B:246:0x022a, B:248:0x0230, B:249:0x0340, B:250:0x036b, B:252:0x0371, B:254:0x0387, B:255:0x038f, B:257:0x0395, B:259:0x0220, B:264:0x056e, B:212:0x04da, B:214:0x04e0, B:216:0x04e8, B:185:0x0429, B:192:0x047b, B:9:0x0059, B:10:0x009f, B:12:0x00a5, B:15:0x00ca, B:17:0x00d2, B:20:0x00e7, B:23:0x00f4, B:27:0x0101, B:28:0x00fd, B:30:0x00f0, B:31:0x00e3, B:32:0x00c6), top: B:3:0x000d, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03c6 A[Catch: all -> 0x057d, TryCatch #3 {, blocks: (B:4:0x000d, B:6:0x002c, B:7:0x0030, B:34:0x010c, B:35:0x011a, B:37:0x0120, B:40:0x014b, B:42:0x0151, B:44:0x0159, B:46:0x018a, B:47:0x0192, B:49:0x0198, B:52:0x01a8, B:55:0x01ac, B:58:0x01b4, B:61:0x01b8, B:64:0x01bc, B:65:0x01c4, B:67:0x01ca, B:72:0x01d4, B:78:0x01d8, B:79:0x01e4, B:81:0x01ea, B:84:0x01f4, B:87:0x01fe, B:93:0x0210, B:102:0x0215, B:103:0x0224, B:105:0x021b, B:106:0x0235, B:108:0x023d, B:109:0x0245, B:111:0x024b, B:122:0x026e, B:123:0x0273, B:125:0x0279, B:127:0x028c, B:128:0x029f, B:130:0x02bf, B:133:0x02c3, B:136:0x02c7, B:147:0x02d1, B:151:0x02e0, B:153:0x02e4, B:155:0x02ea, B:157:0x02f5, B:158:0x02fe, B:161:0x0310, B:162:0x031c, B:164:0x0322, B:166:0x0332, B:118:0x0337, B:244:0x057c, B:175:0x03b2, B:176:0x03c0, B:178:0x03c6, B:179:0x0416, B:181:0x041c, B:183:0x0426, B:186:0x0430, B:187:0x0468, B:189:0x046e, B:191:0x0478, B:193:0x0481, B:195:0x048a, B:197:0x04a6, B:201:0x04ac, B:206:0x04b6, B:207:0x04ba, B:209:0x04bf, B:210:0x04c2, B:218:0x04ee, B:220:0x04f7, B:222:0x04fd, B:224:0x0517, B:228:0x0525, B:230:0x0532, B:233:0x053a, B:235:0x054e, B:238:0x055a, B:243:0x0576, B:246:0x022a, B:248:0x0230, B:249:0x0340, B:250:0x036b, B:252:0x0371, B:254:0x0387, B:255:0x038f, B:257:0x0395, B:259:0x0220, B:264:0x056e, B:212:0x04da, B:214:0x04e0, B:216:0x04e8, B:185:0x0429, B:192:0x047b, B:9:0x0059, B:10:0x009f, B:12:0x00a5, B:15:0x00ca, B:17:0x00d2, B:20:0x00e7, B:23:0x00f4, B:27:0x0101, B:28:0x00fd, B:30:0x00f0, B:31:0x00e3, B:32:0x00c6), top: B:3:0x000d, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x04bf A[Catch: all -> 0x057d, TryCatch #3 {, blocks: (B:4:0x000d, B:6:0x002c, B:7:0x0030, B:34:0x010c, B:35:0x011a, B:37:0x0120, B:40:0x014b, B:42:0x0151, B:44:0x0159, B:46:0x018a, B:47:0x0192, B:49:0x0198, B:52:0x01a8, B:55:0x01ac, B:58:0x01b4, B:61:0x01b8, B:64:0x01bc, B:65:0x01c4, B:67:0x01ca, B:72:0x01d4, B:78:0x01d8, B:79:0x01e4, B:81:0x01ea, B:84:0x01f4, B:87:0x01fe, B:93:0x0210, B:102:0x0215, B:103:0x0224, B:105:0x021b, B:106:0x0235, B:108:0x023d, B:109:0x0245, B:111:0x024b, B:122:0x026e, B:123:0x0273, B:125:0x0279, B:127:0x028c, B:128:0x029f, B:130:0x02bf, B:133:0x02c3, B:136:0x02c7, B:147:0x02d1, B:151:0x02e0, B:153:0x02e4, B:155:0x02ea, B:157:0x02f5, B:158:0x02fe, B:161:0x0310, B:162:0x031c, B:164:0x0322, B:166:0x0332, B:118:0x0337, B:244:0x057c, B:175:0x03b2, B:176:0x03c0, B:178:0x03c6, B:179:0x0416, B:181:0x041c, B:183:0x0426, B:186:0x0430, B:187:0x0468, B:189:0x046e, B:191:0x0478, B:193:0x0481, B:195:0x048a, B:197:0x04a6, B:201:0x04ac, B:206:0x04b6, B:207:0x04ba, B:209:0x04bf, B:210:0x04c2, B:218:0x04ee, B:220:0x04f7, B:222:0x04fd, B:224:0x0517, B:228:0x0525, B:230:0x0532, B:233:0x053a, B:235:0x054e, B:238:0x055a, B:243:0x0576, B:246:0x022a, B:248:0x0230, B:249:0x0340, B:250:0x036b, B:252:0x0371, B:254:0x0387, B:255:0x038f, B:257:0x0395, B:259:0x0220, B:264:0x056e, B:212:0x04da, B:214:0x04e0, B:216:0x04e8, B:185:0x0429, B:192:0x047b, B:9:0x0059, B:10:0x009f, B:12:0x00a5, B:15:0x00ca, B:17:0x00d2, B:20:0x00e7, B:23:0x00f4, B:27:0x0101, B:28:0x00fd, B:30:0x00f0, B:31:0x00e3, B:32:0x00c6), top: B:3:0x000d, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x04f7 A[Catch: all -> 0x057d, TryCatch #3 {, blocks: (B:4:0x000d, B:6:0x002c, B:7:0x0030, B:34:0x010c, B:35:0x011a, B:37:0x0120, B:40:0x014b, B:42:0x0151, B:44:0x0159, B:46:0x018a, B:47:0x0192, B:49:0x0198, B:52:0x01a8, B:55:0x01ac, B:58:0x01b4, B:61:0x01b8, B:64:0x01bc, B:65:0x01c4, B:67:0x01ca, B:72:0x01d4, B:78:0x01d8, B:79:0x01e4, B:81:0x01ea, B:84:0x01f4, B:87:0x01fe, B:93:0x0210, B:102:0x0215, B:103:0x0224, B:105:0x021b, B:106:0x0235, B:108:0x023d, B:109:0x0245, B:111:0x024b, B:122:0x026e, B:123:0x0273, B:125:0x0279, B:127:0x028c, B:128:0x029f, B:130:0x02bf, B:133:0x02c3, B:136:0x02c7, B:147:0x02d1, B:151:0x02e0, B:153:0x02e4, B:155:0x02ea, B:157:0x02f5, B:158:0x02fe, B:161:0x0310, B:162:0x031c, B:164:0x0322, B:166:0x0332, B:118:0x0337, B:244:0x057c, B:175:0x03b2, B:176:0x03c0, B:178:0x03c6, B:179:0x0416, B:181:0x041c, B:183:0x0426, B:186:0x0430, B:187:0x0468, B:189:0x046e, B:191:0x0478, B:193:0x0481, B:195:0x048a, B:197:0x04a6, B:201:0x04ac, B:206:0x04b6, B:207:0x04ba, B:209:0x04bf, B:210:0x04c2, B:218:0x04ee, B:220:0x04f7, B:222:0x04fd, B:224:0x0517, B:228:0x0525, B:230:0x0532, B:233:0x053a, B:235:0x054e, B:238:0x055a, B:243:0x0576, B:246:0x022a, B:248:0x0230, B:249:0x0340, B:250:0x036b, B:252:0x0371, B:254:0x0387, B:255:0x038f, B:257:0x0395, B:259:0x0220, B:264:0x056e, B:212:0x04da, B:214:0x04e0, B:216:0x04e8, B:185:0x0429, B:192:0x047b, B:9:0x0059, B:10:0x009f, B:12:0x00a5, B:15:0x00ca, B:17:0x00d2, B:20:0x00e7, B:23:0x00f4, B:27:0x0101, B:28:0x00fd, B:30:0x00f0, B:31:0x00e3, B:32:0x00c6), top: B:3:0x000d, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0532 A[Catch: all -> 0x057d, TryCatch #3 {, blocks: (B:4:0x000d, B:6:0x002c, B:7:0x0030, B:34:0x010c, B:35:0x011a, B:37:0x0120, B:40:0x014b, B:42:0x0151, B:44:0x0159, B:46:0x018a, B:47:0x0192, B:49:0x0198, B:52:0x01a8, B:55:0x01ac, B:58:0x01b4, B:61:0x01b8, B:64:0x01bc, B:65:0x01c4, B:67:0x01ca, B:72:0x01d4, B:78:0x01d8, B:79:0x01e4, B:81:0x01ea, B:84:0x01f4, B:87:0x01fe, B:93:0x0210, B:102:0x0215, B:103:0x0224, B:105:0x021b, B:106:0x0235, B:108:0x023d, B:109:0x0245, B:111:0x024b, B:122:0x026e, B:123:0x0273, B:125:0x0279, B:127:0x028c, B:128:0x029f, B:130:0x02bf, B:133:0x02c3, B:136:0x02c7, B:147:0x02d1, B:151:0x02e0, B:153:0x02e4, B:155:0x02ea, B:157:0x02f5, B:158:0x02fe, B:161:0x0310, B:162:0x031c, B:164:0x0322, B:166:0x0332, B:118:0x0337, B:244:0x057c, B:175:0x03b2, B:176:0x03c0, B:178:0x03c6, B:179:0x0416, B:181:0x041c, B:183:0x0426, B:186:0x0430, B:187:0x0468, B:189:0x046e, B:191:0x0478, B:193:0x0481, B:195:0x048a, B:197:0x04a6, B:201:0x04ac, B:206:0x04b6, B:207:0x04ba, B:209:0x04bf, B:210:0x04c2, B:218:0x04ee, B:220:0x04f7, B:222:0x04fd, B:224:0x0517, B:228:0x0525, B:230:0x0532, B:233:0x053a, B:235:0x054e, B:238:0x055a, B:243:0x0576, B:246:0x022a, B:248:0x0230, B:249:0x0340, B:250:0x036b, B:252:0x0371, B:254:0x0387, B:255:0x038f, B:257:0x0395, B:259:0x0220, B:264:0x056e, B:212:0x04da, B:214:0x04e0, B:216:0x04e8, B:185:0x0429, B:192:0x047b, B:9:0x0059, B:10:0x009f, B:12:0x00a5, B:15:0x00ca, B:17:0x00d2, B:20:0x00e7, B:23:0x00f4, B:27:0x0101, B:28:0x00fd, B:30:0x00f0, B:31:0x00e3, B:32:0x00c6), top: B:3:0x000d, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x054e A[Catch: all -> 0x057d, TryCatch #3 {, blocks: (B:4:0x000d, B:6:0x002c, B:7:0x0030, B:34:0x010c, B:35:0x011a, B:37:0x0120, B:40:0x014b, B:42:0x0151, B:44:0x0159, B:46:0x018a, B:47:0x0192, B:49:0x0198, B:52:0x01a8, B:55:0x01ac, B:58:0x01b4, B:61:0x01b8, B:64:0x01bc, B:65:0x01c4, B:67:0x01ca, B:72:0x01d4, B:78:0x01d8, B:79:0x01e4, B:81:0x01ea, B:84:0x01f4, B:87:0x01fe, B:93:0x0210, B:102:0x0215, B:103:0x0224, B:105:0x021b, B:106:0x0235, B:108:0x023d, B:109:0x0245, B:111:0x024b, B:122:0x026e, B:123:0x0273, B:125:0x0279, B:127:0x028c, B:128:0x029f, B:130:0x02bf, B:133:0x02c3, B:136:0x02c7, B:147:0x02d1, B:151:0x02e0, B:153:0x02e4, B:155:0x02ea, B:157:0x02f5, B:158:0x02fe, B:161:0x0310, B:162:0x031c, B:164:0x0322, B:166:0x0332, B:118:0x0337, B:244:0x057c, B:175:0x03b2, B:176:0x03c0, B:178:0x03c6, B:179:0x0416, B:181:0x041c, B:183:0x0426, B:186:0x0430, B:187:0x0468, B:189:0x046e, B:191:0x0478, B:193:0x0481, B:195:0x048a, B:197:0x04a6, B:201:0x04ac, B:206:0x04b6, B:207:0x04ba, B:209:0x04bf, B:210:0x04c2, B:218:0x04ee, B:220:0x04f7, B:222:0x04fd, B:224:0x0517, B:228:0x0525, B:230:0x0532, B:233:0x053a, B:235:0x054e, B:238:0x055a, B:243:0x0576, B:246:0x022a, B:248:0x0230, B:249:0x0340, B:250:0x036b, B:252:0x0371, B:254:0x0387, B:255:0x038f, B:257:0x0395, B:259:0x0220, B:264:0x056e, B:212:0x04da, B:214:0x04e0, B:216:0x04e8, B:185:0x0429, B:192:0x047b, B:9:0x0059, B:10:0x009f, B:12:0x00a5, B:15:0x00ca, B:17:0x00d2, B:20:0x00e7, B:23:0x00f4, B:27:0x0101, B:28:0x00fd, B:30:0x00f0, B:31:0x00e3, B:32:0x00c6), top: B:3:0x000d, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:241:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x04b4  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 1408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KLX.run():void");
    }
}