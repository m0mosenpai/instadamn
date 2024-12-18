package X;

import com.instagram.common.session.UserSession;
import com.instagram.profile.intf.UserDetailEntryInfo;
import com.instagram.user.model.User;
import java.util.Arrays;

/* renamed from: X.6z1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C155726z1 extends AbstractC65632xz {
    public final C155736z2 A00;

    public C155726z1(AbstractC59962oe abstractC59962oe, C62862tP c62862tP, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C57112jm c57112jm, C31363DqS c31363DqS, UserDetailEntryInfo userDetailEntryInfo, C31359DqO c31359DqO, C155536yi c155536yi, InterfaceC55362gb interfaceC55362gb, C64742wY c64742wY, User user, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(c31363DqS, 8);
        C14360o3.A0B(str2, 10);
        C14360o3.A0B(c155536yi, 16);
        C14360o3.A0B(c31359DqO, 17);
        C14360o3.A0B(c57112jm, 18);
        C14360o3.A0B(str5, 20);
        this.A00 = new C155736z2(abstractC59962oe, c62862tP, interfaceC11380iw, userSession, c57112jm, c31363DqS, userDetailEntryInfo, c31359DqO, c155536yi, interfaceC55362gb, c64742wY, user, str, str2, str3, str4, str5, z2, z3, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x0385, code lost:
    
        if (r11.A01(r6).A0H.A02.A0A.CX2() == false) goto L107;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:18:0x005a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:101:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0358 A[Catch: all -> 0x0b53, TryCatch #0 {all -> 0x0b53, blocks: (B:5:0x0037, B:14:0x004c, B:17:0x0052, B:18:0x005a, B:23:0x005f, B:25:0x0065, B:27:0x006b, B:29:0x00a0, B:30:0x00b0, B:32:0x00bc, B:33:0x00f4, B:35:0x0113, B:38:0x011f, B:39:0x00b6, B:40:0x0130, B:349:0x0b52, B:42:0x0137, B:44:0x013e, B:46:0x0144, B:48:0x0150, B:51:0x019d, B:53:0x01b3, B:59:0x021e, B:61:0x0224, B:62:0x022a, B:64:0x0234, B:66:0x0241, B:67:0x0245, B:69:0x0259, B:70:0x025d, B:75:0x0267, B:77:0x026d, B:318:0x08f9, B:80:0x0275, B:82:0x027c, B:84:0x0283, B:86:0x0289, B:88:0x0291, B:91:0x02b6, B:93:0x02ea, B:95:0x02f0, B:96:0x02fd, B:98:0x030b, B:99:0x0319, B:103:0x0326, B:105:0x0331, B:106:0x033a, B:109:0x0342, B:111:0x034d, B:113:0x0358, B:115:0x036c, B:117:0x0376, B:119:0x0388, B:121:0x03a7, B:123:0x03b1, B:125:0x03c1, B:127:0x03da, B:129:0x03de, B:132:0x03eb, B:136:0x0436, B:138:0x043d, B:140:0x0444, B:142:0x044a, B:144:0x045f, B:146:0x0475, B:147:0x04c7, B:149:0x04ce, B:151:0x04d5, B:153:0x04dc, B:155:0x04e0, B:157:0x04f3, B:161:0x04ff, B:163:0x0522, B:165:0x0529, B:167:0x052f, B:169:0x053f, B:171:0x0550, B:172:0x0552, B:174:0x0556, B:175:0x0558, B:177:0x0563, B:179:0x056e, B:182:0x0582, B:186:0x058d, B:192:0x066c, B:193:0x05a1, B:196:0x05a9, B:198:0x05b6, B:200:0x05c1, B:204:0x05d0, B:206:0x05db, B:208:0x05e3, B:212:0x05fa, B:214:0x0608, B:216:0x061c, B:218:0x0636, B:219:0x064b, B:222:0x065c, B:225:0x0662, B:226:0x0595, B:230:0x0567, B:232:0x056b, B:233:0x0676, B:235:0x057c, B:236:0x067d, B:238:0x0684, B:240:0x068b, B:242:0x0691, B:244:0x069b, B:245:0x06a2, B:247:0x06a9, B:249:0x06b0, B:251:0x06c9, B:253:0x06d5, B:254:0x06ff, B:256:0x0706, B:258:0x070d, B:260:0x0711, B:262:0x071b, B:264:0x075f, B:265:0x0794, B:266:0x0798, B:269:0x07be, B:271:0x07da, B:273:0x07de, B:274:0x07e1, B:275:0x07eb, B:277:0x07ef, B:278:0x08ef, B:279:0x0775, B:283:0x07f6, B:285:0x07fd, B:287:0x0801, B:289:0x0805, B:291:0x0813, B:294:0x0831, B:296:0x0859, B:297:0x0877, B:298:0x0883, B:300:0x088a, B:302:0x0891, B:304:0x0898, B:306:0x089c, B:308:0x08ac, B:310:0x08b0, B:312:0x08c5, B:314:0x08c9, B:315:0x08cc, B:316:0x08d3, B:317:0x08f4, B:319:0x08fa, B:321:0x08fe, B:323:0x0964, B:325:0x0968, B:327:0x096c, B:329:0x0970, B:330:0x0978, B:331:0x09a1, B:333:0x09a5, B:335:0x09a9, B:336:0x0a2b, B:337:0x09ad, B:339:0x09f1, B:340:0x0a24, B:342:0x0a32, B:343:0x0a53, B:345:0x0a64, B:347:0x0a7e, B:348:0x0b4d, B:350:0x0b19, B:352:0x0b1f, B:353:0x0b47, B:55:0x01bb, B:58:0x01d0, B:73:0x01c5), top: B:4:0x0037, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x05f6  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0608 A[Catch: all -> 0x0b53, TryCatch #0 {all -> 0x0b53, blocks: (B:5:0x0037, B:14:0x004c, B:17:0x0052, B:18:0x005a, B:23:0x005f, B:25:0x0065, B:27:0x006b, B:29:0x00a0, B:30:0x00b0, B:32:0x00bc, B:33:0x00f4, B:35:0x0113, B:38:0x011f, B:39:0x00b6, B:40:0x0130, B:349:0x0b52, B:42:0x0137, B:44:0x013e, B:46:0x0144, B:48:0x0150, B:51:0x019d, B:53:0x01b3, B:59:0x021e, B:61:0x0224, B:62:0x022a, B:64:0x0234, B:66:0x0241, B:67:0x0245, B:69:0x0259, B:70:0x025d, B:75:0x0267, B:77:0x026d, B:318:0x08f9, B:80:0x0275, B:82:0x027c, B:84:0x0283, B:86:0x0289, B:88:0x0291, B:91:0x02b6, B:93:0x02ea, B:95:0x02f0, B:96:0x02fd, B:98:0x030b, B:99:0x0319, B:103:0x0326, B:105:0x0331, B:106:0x033a, B:109:0x0342, B:111:0x034d, B:113:0x0358, B:115:0x036c, B:117:0x0376, B:119:0x0388, B:121:0x03a7, B:123:0x03b1, B:125:0x03c1, B:127:0x03da, B:129:0x03de, B:132:0x03eb, B:136:0x0436, B:138:0x043d, B:140:0x0444, B:142:0x044a, B:144:0x045f, B:146:0x0475, B:147:0x04c7, B:149:0x04ce, B:151:0x04d5, B:153:0x04dc, B:155:0x04e0, B:157:0x04f3, B:161:0x04ff, B:163:0x0522, B:165:0x0529, B:167:0x052f, B:169:0x053f, B:171:0x0550, B:172:0x0552, B:174:0x0556, B:175:0x0558, B:177:0x0563, B:179:0x056e, B:182:0x0582, B:186:0x058d, B:192:0x066c, B:193:0x05a1, B:196:0x05a9, B:198:0x05b6, B:200:0x05c1, B:204:0x05d0, B:206:0x05db, B:208:0x05e3, B:212:0x05fa, B:214:0x0608, B:216:0x061c, B:218:0x0636, B:219:0x064b, B:222:0x065c, B:225:0x0662, B:226:0x0595, B:230:0x0567, B:232:0x056b, B:233:0x0676, B:235:0x057c, B:236:0x067d, B:238:0x0684, B:240:0x068b, B:242:0x0691, B:244:0x069b, B:245:0x06a2, B:247:0x06a9, B:249:0x06b0, B:251:0x06c9, B:253:0x06d5, B:254:0x06ff, B:256:0x0706, B:258:0x070d, B:260:0x0711, B:262:0x071b, B:264:0x075f, B:265:0x0794, B:266:0x0798, B:269:0x07be, B:271:0x07da, B:273:0x07de, B:274:0x07e1, B:275:0x07eb, B:277:0x07ef, B:278:0x08ef, B:279:0x0775, B:283:0x07f6, B:285:0x07fd, B:287:0x0801, B:289:0x0805, B:291:0x0813, B:294:0x0831, B:296:0x0859, B:297:0x0877, B:298:0x0883, B:300:0x088a, B:302:0x0891, B:304:0x0898, B:306:0x089c, B:308:0x08ac, B:310:0x08b0, B:312:0x08c5, B:314:0x08c9, B:315:0x08cc, B:316:0x08d3, B:317:0x08f4, B:319:0x08fa, B:321:0x08fe, B:323:0x0964, B:325:0x0968, B:327:0x096c, B:329:0x0970, B:330:0x0978, B:331:0x09a1, B:333:0x09a5, B:335:0x09a9, B:336:0x0a2b, B:337:0x09ad, B:339:0x09f1, B:340:0x0a24, B:342:0x0a32, B:343:0x0a53, B:345:0x0a64, B:347:0x0a7e, B:348:0x0b4d, B:350:0x0b19, B:352:0x0b1f, B:353:0x0b47, B:55:0x01bb, B:58:0x01d0, B:73:0x01c5), top: B:4:0x0037, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x061a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0b38  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x07bd  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x07da A[Catch: all -> 0x0b53, TryCatch #0 {all -> 0x0b53, blocks: (B:5:0x0037, B:14:0x004c, B:17:0x0052, B:18:0x005a, B:23:0x005f, B:25:0x0065, B:27:0x006b, B:29:0x00a0, B:30:0x00b0, B:32:0x00bc, B:33:0x00f4, B:35:0x0113, B:38:0x011f, B:39:0x00b6, B:40:0x0130, B:349:0x0b52, B:42:0x0137, B:44:0x013e, B:46:0x0144, B:48:0x0150, B:51:0x019d, B:53:0x01b3, B:59:0x021e, B:61:0x0224, B:62:0x022a, B:64:0x0234, B:66:0x0241, B:67:0x0245, B:69:0x0259, B:70:0x025d, B:75:0x0267, B:77:0x026d, B:318:0x08f9, B:80:0x0275, B:82:0x027c, B:84:0x0283, B:86:0x0289, B:88:0x0291, B:91:0x02b6, B:93:0x02ea, B:95:0x02f0, B:96:0x02fd, B:98:0x030b, B:99:0x0319, B:103:0x0326, B:105:0x0331, B:106:0x033a, B:109:0x0342, B:111:0x034d, B:113:0x0358, B:115:0x036c, B:117:0x0376, B:119:0x0388, B:121:0x03a7, B:123:0x03b1, B:125:0x03c1, B:127:0x03da, B:129:0x03de, B:132:0x03eb, B:136:0x0436, B:138:0x043d, B:140:0x0444, B:142:0x044a, B:144:0x045f, B:146:0x0475, B:147:0x04c7, B:149:0x04ce, B:151:0x04d5, B:153:0x04dc, B:155:0x04e0, B:157:0x04f3, B:161:0x04ff, B:163:0x0522, B:165:0x0529, B:167:0x052f, B:169:0x053f, B:171:0x0550, B:172:0x0552, B:174:0x0556, B:175:0x0558, B:177:0x0563, B:179:0x056e, B:182:0x0582, B:186:0x058d, B:192:0x066c, B:193:0x05a1, B:196:0x05a9, B:198:0x05b6, B:200:0x05c1, B:204:0x05d0, B:206:0x05db, B:208:0x05e3, B:212:0x05fa, B:214:0x0608, B:216:0x061c, B:218:0x0636, B:219:0x064b, B:222:0x065c, B:225:0x0662, B:226:0x0595, B:230:0x0567, B:232:0x056b, B:233:0x0676, B:235:0x057c, B:236:0x067d, B:238:0x0684, B:240:0x068b, B:242:0x0691, B:244:0x069b, B:245:0x06a2, B:247:0x06a9, B:249:0x06b0, B:251:0x06c9, B:253:0x06d5, B:254:0x06ff, B:256:0x0706, B:258:0x070d, B:260:0x0711, B:262:0x071b, B:264:0x075f, B:265:0x0794, B:266:0x0798, B:269:0x07be, B:271:0x07da, B:273:0x07de, B:274:0x07e1, B:275:0x07eb, B:277:0x07ef, B:278:0x08ef, B:279:0x0775, B:283:0x07f6, B:285:0x07fd, B:287:0x0801, B:289:0x0805, B:291:0x0813, B:294:0x0831, B:296:0x0859, B:297:0x0877, B:298:0x0883, B:300:0x088a, B:302:0x0891, B:304:0x0898, B:306:0x089c, B:308:0x08ac, B:310:0x08b0, B:312:0x08c5, B:314:0x08c9, B:315:0x08cc, B:316:0x08d3, B:317:0x08f4, B:319:0x08fa, B:321:0x08fe, B:323:0x0964, B:325:0x0968, B:327:0x096c, B:329:0x0970, B:330:0x0978, B:331:0x09a1, B:333:0x09a5, B:335:0x09a9, B:336:0x0a2b, B:337:0x09ad, B:339:0x09f1, B:340:0x0a24, B:342:0x0a32, B:343:0x0a53, B:345:0x0a64, B:347:0x0a7e, B:348:0x0b4d, B:350:0x0b19, B:352:0x0b1f, B:353:0x0b47, B:55:0x01bb, B:58:0x01d0, B:73:0x01c5), top: B:4:0x0037, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:277:0x07ef A[Catch: all -> 0x0b53, TryCatch #0 {all -> 0x0b53, blocks: (B:5:0x0037, B:14:0x004c, B:17:0x0052, B:18:0x005a, B:23:0x005f, B:25:0x0065, B:27:0x006b, B:29:0x00a0, B:30:0x00b0, B:32:0x00bc, B:33:0x00f4, B:35:0x0113, B:38:0x011f, B:39:0x00b6, B:40:0x0130, B:349:0x0b52, B:42:0x0137, B:44:0x013e, B:46:0x0144, B:48:0x0150, B:51:0x019d, B:53:0x01b3, B:59:0x021e, B:61:0x0224, B:62:0x022a, B:64:0x0234, B:66:0x0241, B:67:0x0245, B:69:0x0259, B:70:0x025d, B:75:0x0267, B:77:0x026d, B:318:0x08f9, B:80:0x0275, B:82:0x027c, B:84:0x0283, B:86:0x0289, B:88:0x0291, B:91:0x02b6, B:93:0x02ea, B:95:0x02f0, B:96:0x02fd, B:98:0x030b, B:99:0x0319, B:103:0x0326, B:105:0x0331, B:106:0x033a, B:109:0x0342, B:111:0x034d, B:113:0x0358, B:115:0x036c, B:117:0x0376, B:119:0x0388, B:121:0x03a7, B:123:0x03b1, B:125:0x03c1, B:127:0x03da, B:129:0x03de, B:132:0x03eb, B:136:0x0436, B:138:0x043d, B:140:0x0444, B:142:0x044a, B:144:0x045f, B:146:0x0475, B:147:0x04c7, B:149:0x04ce, B:151:0x04d5, B:153:0x04dc, B:155:0x04e0, B:157:0x04f3, B:161:0x04ff, B:163:0x0522, B:165:0x0529, B:167:0x052f, B:169:0x053f, B:171:0x0550, B:172:0x0552, B:174:0x0556, B:175:0x0558, B:177:0x0563, B:179:0x056e, B:182:0x0582, B:186:0x058d, B:192:0x066c, B:193:0x05a1, B:196:0x05a9, B:198:0x05b6, B:200:0x05c1, B:204:0x05d0, B:206:0x05db, B:208:0x05e3, B:212:0x05fa, B:214:0x0608, B:216:0x061c, B:218:0x0636, B:219:0x064b, B:222:0x065c, B:225:0x0662, B:226:0x0595, B:230:0x0567, B:232:0x056b, B:233:0x0676, B:235:0x057c, B:236:0x067d, B:238:0x0684, B:240:0x068b, B:242:0x0691, B:244:0x069b, B:245:0x06a2, B:247:0x06a9, B:249:0x06b0, B:251:0x06c9, B:253:0x06d5, B:254:0x06ff, B:256:0x0706, B:258:0x070d, B:260:0x0711, B:262:0x071b, B:264:0x075f, B:265:0x0794, B:266:0x0798, B:269:0x07be, B:271:0x07da, B:273:0x07de, B:274:0x07e1, B:275:0x07eb, B:277:0x07ef, B:278:0x08ef, B:279:0x0775, B:283:0x07f6, B:285:0x07fd, B:287:0x0801, B:289:0x0805, B:291:0x0813, B:294:0x0831, B:296:0x0859, B:297:0x0877, B:298:0x0883, B:300:0x088a, B:302:0x0891, B:304:0x0898, B:306:0x089c, B:308:0x08ac, B:310:0x08b0, B:312:0x08c5, B:314:0x08c9, B:315:0x08cc, B:316:0x08d3, B:317:0x08f4, B:319:0x08fa, B:321:0x08fe, B:323:0x0964, B:325:0x0968, B:327:0x096c, B:329:0x0970, B:330:0x0978, B:331:0x09a1, B:333:0x09a5, B:335:0x09a9, B:336:0x0a2b, B:337:0x09ad, B:339:0x09f1, B:340:0x0a24, B:342:0x0a32, B:343:0x0a53, B:345:0x0a64, B:347:0x0a7e, B:348:0x0b4d, B:350:0x0b19, B:352:0x0b1f, B:353:0x0b47, B:55:0x01bb, B:58:0x01d0, B:73:0x01c5), top: B:4:0x0037, inners: #1 }] */
    @Override // X.InterfaceC65642y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void bindView(int r43, android.view.View r44, java.lang.Object r45, java.lang.Object r46) {
        /*
            Method dump skipped, instructions count: 2954
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C155726z1.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00dd, code lost:
    
        if (X.AbstractC25589BTc.A00(r1) == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00f8, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r6, 36328925038788462L) == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0133, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r6, 36329620823687620L) == false) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0142  */
    @Override // X.InterfaceC65642y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(X.AnonymousClass306 r10, java.lang.Object r11, java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C155726z1.buildRowViewTypes(X.306, java.lang.Object, java.lang.Object):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0161, code lost:
    
        if (r2 <= 99) goto L50;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0021. Please report as an issue. */
    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int getViewModelHash(int r14, java.lang.Object r15, java.lang.Object r16) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C155726z1.getViewModelHash(int, java.lang.Object, java.lang.Object):int");
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return EnumC155746z3.A02.length;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x01b7, code lost:
    
        if (r21 == X.EnumC155746z3.A0E.A00) goto L41;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0034. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:0x01b2 A[Catch: all -> 0x01db, TryCatch #0 {all -> 0x01db, blocks: (B:5:0x0021, B:6:0x0034, B:7:0x0037, B:8:0x003c, B:10:0x003d, B:11:0x01ac, B:13:0x01b2, B:16:0x01bc, B:23:0x0043, B:24:0x0069, B:25:0x0188, B:26:0x007e, B:27:0x0199, B:28:0x01a9, B:29:0x0087, B:30:0x0097, B:31:0x00b2, B:32:0x00b8, B:33:0x00c7, B:34:0x00cd, B:36:0x00e1, B:37:0x00fc, B:39:0x0107, B:40:0x010c, B:41:0x0115, B:42:0x0121, B:43:0x0127, B:44:0x0137, B:45:0x0145, B:46:0x0161, B:47:0x016f, B:48:0x018c, B:49:0x019e), top: B:4:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x01bc A[Catch: all -> 0x01db, TRY_LEAVE, TryCatch #0 {all -> 0x01db, blocks: (B:5:0x0021, B:6:0x0034, B:7:0x0037, B:8:0x003c, B:10:0x003d, B:11:0x01ac, B:13:0x01b2, B:16:0x01bc, B:23:0x0043, B:24:0x0069, B:25:0x0188, B:26:0x007e, B:27:0x0199, B:28:0x01a9, B:29:0x0087, B:30:0x0097, B:31:0x00b2, B:32:0x00b8, B:33:0x00c7, B:34:0x00cd, B:36:0x00e1, B:37:0x00fc, B:39:0x0107, B:40:0x010c, B:41:0x0115, B:42:0x0121, B:43:0x0127, B:44:0x0137, B:45:0x0145, B:46:0x0161, B:47:0x016f, B:48:0x018c, B:49:0x019e), top: B:4:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01ce  */
    @Override // X.InterfaceC65642y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View createView(int r21, android.view.ViewGroup r22) {
        /*
            Method dump skipped, instructions count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C155726z1.createView(int, android.view.ViewGroup):android.view.View");
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getIdentifier(int i, Object obj, Object obj2) {
        return Arrays.hashCode(new Object[]{Integer.valueOf(i)});
    }
}
