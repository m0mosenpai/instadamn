package X;

import com.facebook.msys.mci.TraceLogger;
import com.facebook.react.modules.appstate.AppStateModule;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.util.concurrent.TimeUnit;

/* renamed from: X.JVj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43724JVj {
    public final LKC A00;
    public final InterfaceC16820sZ A01;
    public final InterfaceC16660sJ A02;
    public final InterfaceC16620sF A03;
    public final C49245Lq0 A04;
    public final C49244Lpz A05;
    public final InterfaceC16820sZ A06;
    public final InterfaceC16660sJ A07;

    public C43724JVj(LKC lkc, C49245Lq0 c49245Lq0, C49244Lpz c49244Lpz, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, InterfaceC16620sF interfaceC16620sF) {
        AbstractC167027dH.A0a(1, interfaceC16820sZ, interfaceC16620sF, interfaceC16820sZ2, interfaceC16660sJ);
        C14360o3.A0B(interfaceC16660sJ2, 8);
        this.A06 = interfaceC16820sZ;
        this.A03 = interfaceC16620sF;
        this.A01 = interfaceC16820sZ2;
        this.A07 = interfaceC16660sJ;
        this.A05 = c49244Lpz;
        this.A04 = c49245Lq0;
        this.A00 = lkc;
        this.A02 = interfaceC16660sJ2;
    }

    public static final long A00(UserSession userSession, C43735JVu c43735JVu, C43724JVj c43724JVj) {
        Integer num;
        InterfaceC16660sJ interfaceC16660sJ = c43724JVj.A02;
        String str = c43735JVu.A0A;
        MRU mru = (MRU) interfaceC16660sJ.invoke(str);
        if (AbstractC43592JPx.A03(c43735JVu.A07, 0) != 0) {
            num = C05F.A0Y;
        } else {
            num = C05F.A0N;
        }
        long Enf = mru.Enf(num);
        String str2 = c43735JVu.A09;
        if (str2 != null) {
            mru.EZ8(str2, Enf);
        }
        C83403nh c83403nh = c43735JVu.A02;
        if (c83403nh != null) {
            mru.EZ7(Enf, TimeUnit.MICROSECONDS.toMillis(c83403nh.C8i()));
        }
        mru.EcB(str, Enf);
        DirectThreadKey directThreadKey = c43735JVu.A04;
        String str3 = directThreadKey.A00;
        if (str3 != null) {
            mru.ES0(str3, Enf);
        }
        C2ED c2ed = c43735JVu.A03;
        if (c2ed != null || (c2ed = AbstractC28761aE.A00(userSession).B3U(directThreadKey)) != null) {
            mru.Efm(Enf, c2ed.CVQ());
            mru.Efl(C4GR.A00(c2ed.C7g()), Enf);
        }
        String str4 = c43735JVu.A01;
        if (str4 != null) {
            mru.EaJ(str4, Enf);
        }
        String str5 = c43735JVu.A0B;
        if (str5 != null) {
            mru.Edf(str5, Enf);
        }
        mru.Cn5("sync_received", Enf);
        return Enf;
    }

    public static final void A01(C45113Jxi c45113Jxi, UserSession userSession, C43724JVj c43724JVj) {
        C43716JVb A00;
        String str;
        InterfaceC50471MPz interfaceC50471MPz;
        Long A002;
        Integer num;
        String str2;
        InterfaceC16660sJ interfaceC16660sJ = c43724JVj.A02;
        String str3 = c45113Jxi.A04;
        MRU mru = (MRU) interfaceC16660sJ.invoke(str3);
        C45090JxK c45090JxK = (C45090JxK) c45113Jxi.A02;
        if (c45090JxK != null) {
            InterfaceC16620sF interfaceC16620sF = c43724JVj.A03;
            String A02 = AbstractC46886KoT.A00(c45113Jxi, (C2EC) interfaceC16620sF.invoke(userSession, c45090JxK.A0A)).A02();
            if (A02 != null) {
                mru.EZj(A02, c45113Jxi.A00);
            }
            LKC lkc = c43724JVj.A00;
            C47950LGh c47950LGh = C43718JVd.A03;
            Integer num2 = C05F.A0C;
            C43718JVd A01 = c47950LGh.A01(c45113Jxi, num2);
            JQO jqo = A01.A01;
            boolean z = jqo.A0Q;
            if (z) {
                C43719JVe c43719JVe = A01.A02;
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(userSession), AbstractC111324zv.A00(4621));
                if (A0f.isSampled()) {
                    A0f.AAP("app_startup_type", C1CC.A09.toString());
                    if (C218914p.A08()) {
                        str2 = AppStateModule.APP_STATE_BACKGROUND;
                    } else {
                        str2 = "foreground";
                    }
                    A0f.AAP("app_state", str2);
                    String valueOf = String.valueOf(jqo.A03);
                    A0f.AAP("recipient_id", valueOf);
                    A0f.AAP("push_identifier", jqo.A0F);
                    A0f.AAP("push_type", jqo.A06.name());
                    AbstractC31171DnF.A1F(A0f, c43719JVe.A06);
                    A0f.A7v("is_vm_active", c43719JVe.A01);
                    AbstractC31175DnJ.A1A(A0f, z);
                    A0f.A7v("is_bg_account", Boolean.valueOf(C50C.A02(valueOf)));
                    int intValue = jqo.A07.intValue();
                    int i = 2;
                    if (intValue != 0) {
                        i = 4;
                        if (intValue != 1) {
                            i = Integer.MIN_VALUE;
                        }
                    }
                    if (i != Integer.MIN_VALUE) {
                        AbstractC166997dE.A1N(A0f, "render_target", i);
                    } else {
                        A0f.AAP("render_target", null);
                    }
                    A0f.AAk("feature_tags", jqo.A0N);
                    A0f.AAP("reason", c43719JVe.A03);
                    A0f.A7v("is_bg_account", Boolean.valueOf(C50C.A02(valueOf)));
                    A0f.Cht();
                }
                LKC.A01(userSession, lkc, A01, null, "ARMADILLO_NOTIFICATIONS_CLIENT_NOTIFICATION_CREATED");
            } else {
                LKC.A00(userSession, lkc, A01, null, 1);
            }
            C47668L3b c47668L3b = new C47668L3b((C13920nI) c43724JVj.A06.invoke(), c43724JVj.A07, interfaceC16620sF);
            C45090JxK c45090JxK2 = (C45090JxK) c45113Jxi.A02;
            if (c45090JxK2 != null && ((num = c45090JxK2.A04) == num2 || num == C05F.A0N)) {
                A00 = new C43716JVb(null);
            } else {
                A00 = AbstractC43717JVc.A00(userSession, c45113Jxi, AbstractC31171DnF.A0n(c47668L3b.A00));
                if (A00.A00 == null) {
                    Object obj = c45113Jxi.A02;
                    if (obj != null) {
                        A00 = AbstractC43717JVc.A00(userSession, obj, AbstractC31171DnF.A0n(c47668L3b.A01));
                    } else {
                        throw B4Z.A00();
                    }
                }
            }
            MQ0 mq0 = A00.A00;
            if (mq0 == null) {
                MRU mru2 = (MRU) interfaceC16660sJ.invoke(str3);
                long j = c45113Jxi.A00;
                mru2.Cn5("rendering_policy_checked", j);
                C14360o3.A07(C120005by.A00(userSession));
                C45090JxK c45090JxK3 = (C45090JxK) c45113Jxi.A02;
                if (c45090JxK3 != null) {
                    str = c45090JxK3.A07;
                } else {
                    str = c45113Jxi.A03;
                }
                String traceIdForAliasId = TraceLogger.getTraceIdForAliasId(14, str);
                if (traceIdForAliasId != null) {
                    C120005by.A03(traceIdForAliasId, null, 14, 237, 0);
                }
                if (AbstractC14480oK.A01(AbstractC25225BEi.A0F(userSession))) {
                    interfaceC50471MPz = c43724JVj.A05;
                } else {
                    interfaceC50471MPz = c43724JVj.A04;
                }
                InterfaceC50471MPz interfaceC50471MPz2 = interfaceC50471MPz;
                ((MRU) interfaceC16660sJ.invoke(str3)).Cn5("rendering_surface_checked", j);
                C43718JVd A012 = c47950LGh.A01(c45113Jxi, interfaceC50471MPz2.Bmf());
                JQO jqo2 = A012.A01;
                if (jqo2.A0Q) {
                    C43719JVe c43719JVe2 = A012.A02;
                    C132515ya c132515ya = (C132515ya) lkc.A03.invoke(userSession);
                    String str4 = c43719JVe2.A05;
                    String A003 = AbstractC44092JeH.A00(jqo2.A07);
                    C132545yd c132545yd = c132515ya.A01;
                    if (c132545yd.A01 && str4 != null && (A002 = C132545yd.A00(c132545yd, str4)) != null) {
                        c132545yd.A00.flowAnnotate(A002.longValue(), "rendering_surface", A003);
                    }
                }
                interfaceC50471MPz2.DAM(c45113Jxi, userSession);
                return;
            }
            lkc.A05(userSession, c47950LGh.A01(c45113Jxi, num2), AnonymousClass001.A0R("rendering eligibility policy failure: ", mq0.AUq(userSession)), 1024);
            return;
        }
        throw B4Z.A00();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x009b, code lost:
    
        if (r11.A2P != true) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ea, code lost:
    
        if (r1.equals(r0) == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x012d, code lost:
    
        r0 = X.C49243Lpy.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x012b, code lost:
    
        if (r1.equals("❤️") != false) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A03(com.instagram.common.session.UserSession r31, X.C47577Kzn r32, X.C43724JVj r33, java.lang.Integer r34) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43724JVj.A03(com.instagram.common.session.UserSession, X.Kzn, X.JVj, java.lang.Integer):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:273:0x03e1, code lost:
    
        if (r0.A0T == true) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x03e3, code lost:
    
        r3 = X.EnumC46179KcH.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x03f6, code lost:
    
        if (((X.C7Q5) r3).A01() != false) goto L230;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:21:0x0094. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:230:0x031d A[Catch: KfM -> 0x0809, TryCatch #0 {KfM -> 0x0809, blocks: (B:11:0x0074, B:13:0x007a, B:15:0x0080, B:17:0x0084, B:20:0x008c, B:21:0x0094, B:22:0x0097, B:23:0x0756, B:25:0x075a, B:27:0x0769, B:31:0x0792, B:32:0x07a0, B:34:0x07aa, B:35:0x07ac, B:37:0x07b0, B:39:0x07b6, B:40:0x07ba, B:54:0x07e5, B:57:0x00a9, B:59:0x00b1, B:60:0x00b8, B:61:0x00bc, B:63:0x00c8, B:65:0x00cc, B:66:0x00db, B:68:0x00e1, B:71:0x00e9, B:74:0x00ef, B:77:0x00f5, B:79:0x00fb, B:80:0x0109, B:82:0x010d, B:83:0x0110, B:85:0x011a, B:86:0x011c, B:89:0x0120, B:95:0x0125, B:97:0x012b, B:99:0x0138, B:100:0x013f, B:101:0x0146, B:103:0x0151, B:104:0x0255, B:107:0x015a, B:109:0x0166, B:110:0x016a, B:111:0x0182, B:112:0x0185, B:113:0x0188, B:114:0x018b, B:115:0x018e, B:116:0x016d, B:118:0x017b, B:125:0x0198, B:126:0x019b, B:127:0x019e, B:128:0x01a1, B:131:0x01a7, B:137:0x0201, B:139:0x0207, B:140:0x0209, B:141:0x0260, B:350:0x0808, B:143:0x01b7, B:145:0x01bb, B:147:0x01c1, B:149:0x01c5, B:151:0x01cb, B:153:0x01d3, B:156:0x01dc, B:159:0x01e1, B:160:0x01e9, B:163:0x01fc, B:164:0x01ef, B:167:0x01f4, B:168:0x021c, B:171:0x022a, B:172:0x022e, B:175:0x023b, B:176:0x0243, B:178:0x024d, B:181:0x0266, B:184:0x0269, B:187:0x026e, B:188:0x0272, B:190:0x0278, B:192:0x0286, B:193:0x028a, B:196:0x0294, B:200:0x029c, B:201:0x02b5, B:205:0x029f, B:209:0x02b3, B:212:0x02b0, B:215:0x02bd, B:218:0x02c0, B:220:0x02c6, B:222:0x02ce, B:224:0x02d4, B:225:0x02dd, B:226:0x02e7, B:227:0x030e, B:228:0x0310, B:230:0x031d, B:232:0x0321, B:234:0x0327, B:236:0x032d, B:238:0x0335, B:239:0x033c, B:240:0x030b, B:241:0x02eb, B:243:0x02ef, B:245:0x02f7, B:247:0x02fd, B:248:0x0342, B:251:0x0350, B:252:0x0354, B:255:0x035f, B:258:0x036b, B:262:0x03b4, B:263:0x03c7, B:264:0x0376, B:265:0x03a3, B:266:0x03cb, B:268:0x03d3, B:270:0x03d9, B:272:0x03df, B:274:0x03e3, B:275:0x03e5, B:276:0x03f8, B:277:0x03ec, B:279:0x03f0, B:281:0x03fb, B:284:0x0409, B:285:0x040d, B:288:0x0418, B:290:0x041e, B:292:0x0424, B:293:0x0426, B:294:0x042d, B:295:0x0430, B:298:0x043e, B:299:0x0442, B:302:0x044d, B:304:0x0454, B:306:0x0460, B:308:0x0466, B:310:0x046c, B:311:0x0472, B:313:0x047c, B:314:0x0480, B:315:0x04a2, B:317:0x0491, B:319:0x049b, B:321:0x049e, B:322:0x04aa, B:324:0x04b5, B:325:0x04b9, B:327:0x04c4, B:329:0x04ce, B:331:0x04d9, B:332:0x04dd, B:334:0x04e8, B:336:0x04f4, B:337:0x04f6, B:339:0x0504, B:340:0x0508, B:341:0x04ff, B:342:0x051b, B:344:0x0521, B:345:0x052a, B:348:0x07fb, B:349:0x07ff, B:352:0x053a, B:354:0x0540, B:356:0x0549, B:357:0x054b, B:359:0x0557, B:366:0x056a, B:367:0x057b, B:370:0x0584, B:371:0x059b, B:374:0x05a4, B:375:0x055d, B:376:0x05bc, B:379:0x05c6, B:380:0x05de, B:382:0x05ea, B:383:0x05ec, B:385:0x05f0, B:387:0x05f6, B:388:0x05f8, B:390:0x0605, B:392:0x060b, B:393:0x060d, B:396:0x0624, B:397:0x0627, B:399:0x0631, B:400:0x0633, B:402:0x0639, B:403:0x063b, B:405:0x0648, B:407:0x064e, B:408:0x0650, B:411:0x0667, B:412:0x066a, B:414:0x0670, B:415:0x0672, B:417:0x0689, B:419:0x0690, B:421:0x0694, B:423:0x069a, B:424:0x06a0, B:425:0x06a2, B:427:0x06a8, B:430:0x06b9, B:435:0x06c8, B:437:0x06ce, B:438:0x06d0, B:440:0x06e6, B:441:0x06fa, B:444:0x0700, B:445:0x0708, B:447:0x0712, B:449:0x0718, B:451:0x071e, B:452:0x0725, B:453:0x0728, B:454:0x0731, B:457:0x073f, B:458:0x0743, B:460:0x074e, B:461:0x07ed, B:463:0x07f4, B:183:0x0267), top: B:10:0x0074, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:427:0x06a8 A[Catch: KfM -> 0x0809, TryCatch #0 {KfM -> 0x0809, blocks: (B:11:0x0074, B:13:0x007a, B:15:0x0080, B:17:0x0084, B:20:0x008c, B:21:0x0094, B:22:0x0097, B:23:0x0756, B:25:0x075a, B:27:0x0769, B:31:0x0792, B:32:0x07a0, B:34:0x07aa, B:35:0x07ac, B:37:0x07b0, B:39:0x07b6, B:40:0x07ba, B:54:0x07e5, B:57:0x00a9, B:59:0x00b1, B:60:0x00b8, B:61:0x00bc, B:63:0x00c8, B:65:0x00cc, B:66:0x00db, B:68:0x00e1, B:71:0x00e9, B:74:0x00ef, B:77:0x00f5, B:79:0x00fb, B:80:0x0109, B:82:0x010d, B:83:0x0110, B:85:0x011a, B:86:0x011c, B:89:0x0120, B:95:0x0125, B:97:0x012b, B:99:0x0138, B:100:0x013f, B:101:0x0146, B:103:0x0151, B:104:0x0255, B:107:0x015a, B:109:0x0166, B:110:0x016a, B:111:0x0182, B:112:0x0185, B:113:0x0188, B:114:0x018b, B:115:0x018e, B:116:0x016d, B:118:0x017b, B:125:0x0198, B:126:0x019b, B:127:0x019e, B:128:0x01a1, B:131:0x01a7, B:137:0x0201, B:139:0x0207, B:140:0x0209, B:141:0x0260, B:350:0x0808, B:143:0x01b7, B:145:0x01bb, B:147:0x01c1, B:149:0x01c5, B:151:0x01cb, B:153:0x01d3, B:156:0x01dc, B:159:0x01e1, B:160:0x01e9, B:163:0x01fc, B:164:0x01ef, B:167:0x01f4, B:168:0x021c, B:171:0x022a, B:172:0x022e, B:175:0x023b, B:176:0x0243, B:178:0x024d, B:181:0x0266, B:184:0x0269, B:187:0x026e, B:188:0x0272, B:190:0x0278, B:192:0x0286, B:193:0x028a, B:196:0x0294, B:200:0x029c, B:201:0x02b5, B:205:0x029f, B:209:0x02b3, B:212:0x02b0, B:215:0x02bd, B:218:0x02c0, B:220:0x02c6, B:222:0x02ce, B:224:0x02d4, B:225:0x02dd, B:226:0x02e7, B:227:0x030e, B:228:0x0310, B:230:0x031d, B:232:0x0321, B:234:0x0327, B:236:0x032d, B:238:0x0335, B:239:0x033c, B:240:0x030b, B:241:0x02eb, B:243:0x02ef, B:245:0x02f7, B:247:0x02fd, B:248:0x0342, B:251:0x0350, B:252:0x0354, B:255:0x035f, B:258:0x036b, B:262:0x03b4, B:263:0x03c7, B:264:0x0376, B:265:0x03a3, B:266:0x03cb, B:268:0x03d3, B:270:0x03d9, B:272:0x03df, B:274:0x03e3, B:275:0x03e5, B:276:0x03f8, B:277:0x03ec, B:279:0x03f0, B:281:0x03fb, B:284:0x0409, B:285:0x040d, B:288:0x0418, B:290:0x041e, B:292:0x0424, B:293:0x0426, B:294:0x042d, B:295:0x0430, B:298:0x043e, B:299:0x0442, B:302:0x044d, B:304:0x0454, B:306:0x0460, B:308:0x0466, B:310:0x046c, B:311:0x0472, B:313:0x047c, B:314:0x0480, B:315:0x04a2, B:317:0x0491, B:319:0x049b, B:321:0x049e, B:322:0x04aa, B:324:0x04b5, B:325:0x04b9, B:327:0x04c4, B:329:0x04ce, B:331:0x04d9, B:332:0x04dd, B:334:0x04e8, B:336:0x04f4, B:337:0x04f6, B:339:0x0504, B:340:0x0508, B:341:0x04ff, B:342:0x051b, B:344:0x0521, B:345:0x052a, B:348:0x07fb, B:349:0x07ff, B:352:0x053a, B:354:0x0540, B:356:0x0549, B:357:0x054b, B:359:0x0557, B:366:0x056a, B:367:0x057b, B:370:0x0584, B:371:0x059b, B:374:0x05a4, B:375:0x055d, B:376:0x05bc, B:379:0x05c6, B:380:0x05de, B:382:0x05ea, B:383:0x05ec, B:385:0x05f0, B:387:0x05f6, B:388:0x05f8, B:390:0x0605, B:392:0x060b, B:393:0x060d, B:396:0x0624, B:397:0x0627, B:399:0x0631, B:400:0x0633, B:402:0x0639, B:403:0x063b, B:405:0x0648, B:407:0x064e, B:408:0x0650, B:411:0x0667, B:412:0x066a, B:414:0x0670, B:415:0x0672, B:417:0x0689, B:419:0x0690, B:421:0x0694, B:423:0x069a, B:424:0x06a0, B:425:0x06a2, B:427:0x06a8, B:430:0x06b9, B:435:0x06c8, B:437:0x06ce, B:438:0x06d0, B:440:0x06e6, B:441:0x06fa, B:444:0x0700, B:445:0x0708, B:447:0x0712, B:449:0x0718, B:451:0x071e, B:452:0x0725, B:453:0x0728, B:454:0x0731, B:457:0x073f, B:458:0x0743, B:460:0x074e, B:461:0x07ed, B:463:0x07f4, B:183:0x0267), top: B:10:0x0074, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(com.instagram.common.session.UserSession r34, X.C43735JVu r35, X.C43724JVj r36, java.lang.Integer r37) {
        /*
            Method dump skipped, instructions count: 2244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43724JVj.A02(com.instagram.common.session.UserSession, X.JVu, X.JVj, java.lang.Integer):void");
    }
}
