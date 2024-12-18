package com.instagram.app;

import X.AbstractC12280kW;
import X.AbstractC20100yh;
import X.AnonymousClass001;
import X.C08x;
import X.C0J9;
import X.C0JA;
import X.C0JJ;
import X.C20150ym;
import X.InterfaceC07700am;
import X.InterfaceC07710an;
import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.Log;
import androidx.multidex.MultiDex;
import com.facebook.common.dextricks.DexLibLoader;
import com.facebook.common.dextricks.DexOptimization;
import com.facebook.common.dextricks.MultiDexClassLoaderLight;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

/* loaded from: classes.dex */
public class InstagramAppShell extends Application implements C08x, InterfaceC07700am {
    public C0JA A00;
    public AbstractC12280kW A06;
    public long A02 = -1;
    public long A04 = -1;
    public long A05 = -1;
    public long A03 = -1;
    public boolean A01 = false;
    public final Map A07 = new HashMap();
    public final Map A08 = new HashMap();
    public final Set A09 = Collections.synchronizedSet(new HashSet());

    /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008a  */
    @Override // android.content.ContextWrapper, android.content.Context
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.content.SharedPreferences getSharedPreferences(java.lang.String r8, int r9) {
        /*
            r7 = this;
            r6 = 0
            java.util.Set r4 = r7.A09     // Catch: java.lang.Throwable -> L72
            boolean r0 = r4.contains(r8)     // Catch: java.lang.Throwable -> L72
            if (r0 != 0) goto L4a
            java.lang.Thread r3 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L72
            int r5 = r3.getPriority()     // Catch: java.lang.Throwable -> L72
            X.0qm r0 = X.AbstractC15930qn.A02     // Catch: java.lang.Throwable -> L72
            X.0sZ r0 = r0.A0I     // Catch: java.lang.Throwable -> L72
            java.lang.Object r0 = r0.invoke()     // Catch: java.lang.Throwable -> L72
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L72
            int r1 = r0.intValue()     // Catch: java.lang.Throwable -> L72
            r0 = 1
            int r1 = java.lang.Math.max(r1, r0)     // Catch: java.lang.Throwable -> L72
            r0 = 10
            int r0 = java.lang.Math.min(r1, r0)     // Catch: java.lang.Throwable -> L72
            int r2 = java.lang.Math.max(r5, r0)     // Catch: java.lang.Throwable -> L72
            if (r5 >= r2) goto L4a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L72
            int r0 = android.os.Process.myTid()     // Catch: java.lang.Throwable -> L46
            int r0 = android.os.Process.getThreadPriority(r0)     // Catch: java.lang.Throwable -> L46
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L46
            r3.setPriority(r2)     // Catch: java.lang.Throwable -> L46
            r3 = r6
            r6 = r1
            goto L4b
        L46:
            r2 = move-exception
            r3 = r6
            r6 = r1
            goto L76
        L4a:
            r3 = r6
        L4b:
            X.0kW r0 = r7.A06     // Catch: java.lang.Throwable -> L75
            if (r0 == 0) goto L54
            android.content.SharedPreferences r2 = r0.getSharedPreferences(r8, r9)     // Catch: java.lang.Throwable -> L75
            goto L58
        L54:
            android.content.SharedPreferences r2 = super.getSharedPreferences(r8, r9)     // Catch: java.lang.Throwable -> L75
        L58:
            r4.add(r8)
            if (r6 == 0) goto L68
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            int r0 = r6.intValue()
            r1.setPriority(r0)
        L68:
            if (r3 == 0) goto L71
            int r0 = r3.intValue()
            android.os.Process.setThreadPriority(r0)
        L71:
            return r2
        L72:
            r2 = move-exception
            r3 = r6
            goto L76
        L75:
            r2 = move-exception
        L76:
            java.util.Set r0 = r7.A09
            r0.add(r8)
            if (r6 == 0) goto L88
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            int r0 = r6.intValue()
            r1.setPriority(r0)
        L88:
            if (r3 == 0) goto L91
            int r0 = r3.intValue()
            android.os.Process.setThreadPriority(r0)
        L91:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.app.InstagramAppShell.getSharedPreferences(java.lang.String, int):android.content.SharedPreferences");
    }

    private void A00(Context context) {
        C0J9 c0j9;
        String str;
        String str2;
        if (this.A01) {
            Log.w("InstagramAppShell", "We have already installed multidex successfully");
            return;
        }
        AwakeTimeSinceBootClock awakeTimeSinceBootClock = AwakeTimeSinceBootClock.INSTANCE;
        this.A05 = awakeTimeSinceBootClock.now();
        try {
            synchronized (this) {
            }
            if (C20150ym.A07(AbstractC20100yh.A00(36330913608582218L))) {
                if (MultiDexClassLoaderLight.install(context.getApplicationInfo(), context.getClassLoader())) {
                    Log.w("InstagramAppShell", "MultiDexClassLoaderLight installed");
                }
                Log.w("InstagramAppShell", "MultiDexClassLoaderLight installation failed");
            }
            if (C20150ym.A07(AbstractC20100yh.A00(36330913608516681L))) {
                Log.w("InstagramAppShell", "MultiDexClassLoaderJava installed");
            } else {
                C0JJ A00 = C0JJ.A00(this);
                if (!A00.A1D || (!A00.A1E && (c0j9 = C0JA.A00().A00) != null && (str = c0j9.A00) != null && !"".equals(str))) {
                    MultiDex.A01(this);
                }
            }
            C0J9 c0j92 = C0JA.A00().A00;
            if (c0j92 != null) {
                str2 = c0j92.A00;
            } else {
                str2 = null;
            }
            int i = 4;
            if (str2 != null && !"".equals(str2) && DexOptimization.PROCESS_NAME.equals(str2)) {
                i = 6;
            }
            if (this.A01) {
                Log.w("InstagramAppShell", "Have already loaded FB multidex");
            }
            DexLibLoader.loadAll(this, i, (LightweightQuickPerformanceLogger) null);
            this.A01 = true;
        } finally {
            this.A03 = awakeTimeSinceBootClock.now();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:394|395|(1:397)|398|(2:399|400)|(10:402|403|404|(1:408)|409|(1:411)|412|(12:414|415|416|417|418|(1:420)|421|(6:423|424|425|(1:427)|428|(1:(2:431|(1:433))))|439|440|441|(3:443|444|(9:446|447|448|449|450|451|452|453|435)(2:459|460))(2:471|472))|491|(1:493))|495|(1:497)|498|(1:500)(4:508|509|510|(6:515|516|(1:535)(3:519|(1:(1:522)(2:526|527))(1:528)|523)|524|503|504)(2:512|513))|501|502|503|504) */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x04ec, code lost:
    
        if (r11 > 0) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x0580, code lost:
    
        if (X.C0PD.A02 == false) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:434:0x0cc6, code lost:
    
        if ((!java.util.Arrays.equals(r4, r11)) == false) goto L426;
     */
    /* JADX WARN: Code restructure failed: missing block: B:506:0x0e6f, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:507:0x0e70, code lost:
    
        android.util.Log.w("FbSoLoader", "prepend SoSource lib-assets failed", r3);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0b47 A[Catch: all -> 0x0ed7, TRY_ENTER, TryCatch #18 {all -> 0x0ed7, blocks: (B:329:0x0a6a, B:331:0x0a87, B:332:0x0a8e, B:334:0x0a98, B:335:0x0aa1, B:337:0x0ac0, B:338:0x0ac9, B:343:0x0afe, B:344:0x0b01, B:351:0x0b32, B:354:0x0b47, B:356:0x0b56, B:357:0x0b5d, B:360:0x0b76, B:369:0x0ba4, B:370:0x0bb5, B:373:0x0bb8, B:374:0x0bb9, B:380:0x0bdc, B:381:0x0be2, B:556:0x0bc7, B:557:0x0bce, B:558:0x0bd5, B:561:0x0ebd, B:562:0x0ebe, B:565:0x0ec3, B:566:0x0ec6, B:569:0x0ec8, B:570:0x0ece, B:578:0x0ed0, B:579:0x0ed6, B:372:0x0bb6, B:362:0x0b81, B:364:0x0b92, B:366:0x0b98, B:359:0x0b65, B:346:0x0b09, B:348:0x0b15, B:571:0x0b1b, B:573:0x0b24, B:575:0x0b2d), top: B:328:0x0a6a, inners: #7, #9, #12, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0b92 A[Catch: all -> 0x0ebf, TryCatch #9 {all -> 0x0ebf, blocks: (B:362:0x0b81, B:364:0x0b92, B:366:0x0b98), top: B:361:0x0b81, outer: #18 }] */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0bb6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:632:0x00fe A[Catch: all -> 0x1079, TryCatch #37 {all -> 0x1079, blocks: (B:3:0x0008, B:4:0x0019, B:14:0x0024, B:15:0x0025, B:17:0x002b, B:20:0x0033, B:22:0x0052, B:23:0x0056, B:25:0x005c, B:28:0x0066, B:29:0x0068, B:31:0x0074, B:33:0x0094, B:35:0x009a, B:36:0x009c, B:38:0x00a0, B:39:0x00aa, B:41:0x00bb, B:42:0x00bf, B:44:0x00ca, B:46:0x00d9, B:48:0x00dd, B:50:0x0113, B:55:0x012f, B:56:0x0133, B:60:0x014d, B:66:0x0162, B:67:0x0163, B:69:0x0178, B:70:0x017e, B:219:0x0520, B:227:0x1057, B:670:0x1078, B:230:0x0521, B:232:0x0550, B:234:0x057d, B:236:0x0583, B:238:0x0587, B:241:0x0592, B:243:0x05a6, B:244:0x05c4, B:248:0x05d2, B:392:0x0f70, B:617:0x105a, B:626:0x1065, B:629:0x012a, B:630:0x00e6, B:632:0x00fe, B:633:0x0101, B:635:0x0107, B:636:0x0110, B:648:0x1019, B:649:0x101a, B:653:0x1037, B:659:0x1045, B:669:0x1071, B:674:0x0f7c, B:676:0x0f84, B:677:0x0f88, B:679:0x0f8e, B:682:0x0f98, B:718:0x0fe5, B:723:0x1068, B:729:0x106d, B:732:0x106f, B:651:0x1023, B:655:0x1034, B:72:0x017f, B:74:0x019b, B:77:0x01a4, B:80:0x01b6, B:82:0x01c9, B:84:0x01cd, B:85:0x01cf, B:87:0x01d6, B:88:0x0207, B:90:0x020d, B:91:0x0215, B:93:0x0223, B:94:0x022c, B:96:0x024a, B:98:0x0252, B:100:0x025b, B:101:0x0270, B:103:0x027e, B:104:0x0287, B:106:0x028d, B:108:0x0295, B:110:0x029e, B:111:0x02b3, B:113:0x02c7, B:171:0x0508, B:215:0x0515, B:218:0x0512, B:225:0x0517, B:250:0x05fb, B:254:0x060c, B:257:0x0617, B:260:0x0632, B:268:0x0767, B:270:0x079c, B:271:0x07a4, B:292:0x0810, B:294:0x087f, B:295:0x089a, B:297:0x0906, B:298:0x0911, B:300:0x091a, B:301:0x0926, B:303:0x092a, B:304:0x0936, B:306:0x093a, B:307:0x0946, B:309:0x094a, B:310:0x0956, B:312:0x095a, B:313:0x096a, B:315:0x096e, B:316:0x097c, B:318:0x0980, B:319:0x098e, B:320:0x0a2a, B:323:0x0a2d, B:324:0x0a2e, B:326:0x0a4c, B:327:0x0a54, B:382:0x0be7, B:383:0x0c09, B:390:0x0e82, B:391:0x0e83, B:554:0x0eba, B:555:0x0ebb, B:591:0x0f01, B:592:0x0f0e, B:595:0x0f10, B:596:0x0f11, B:598:0x0f13, B:599:0x0f19, B:602:0x0f1b, B:603:0x0f21, B:605:0x0f27, B:608:0x0f3d, B:610:0x0f48, B:612:0x0f5b, B:613:0x0f35, B:62:0x014e, B:64:0x0156, B:65:0x0160, B:6:0x001a, B:10:0x104e, B:11:0x1055, B:13:0x0022, B:642:0x1001, B:645:0x1007, B:647:0x1012), top: B:2:0x0008, inners: #10, #17, #22, #26, #32 }] */
    /* JADX WARN: Removed duplicated region for block: B:635:0x0107 A[Catch: all -> 0x1079, TryCatch #37 {all -> 0x1079, blocks: (B:3:0x0008, B:4:0x0019, B:14:0x0024, B:15:0x0025, B:17:0x002b, B:20:0x0033, B:22:0x0052, B:23:0x0056, B:25:0x005c, B:28:0x0066, B:29:0x0068, B:31:0x0074, B:33:0x0094, B:35:0x009a, B:36:0x009c, B:38:0x00a0, B:39:0x00aa, B:41:0x00bb, B:42:0x00bf, B:44:0x00ca, B:46:0x00d9, B:48:0x00dd, B:50:0x0113, B:55:0x012f, B:56:0x0133, B:60:0x014d, B:66:0x0162, B:67:0x0163, B:69:0x0178, B:70:0x017e, B:219:0x0520, B:227:0x1057, B:670:0x1078, B:230:0x0521, B:232:0x0550, B:234:0x057d, B:236:0x0583, B:238:0x0587, B:241:0x0592, B:243:0x05a6, B:244:0x05c4, B:248:0x05d2, B:392:0x0f70, B:617:0x105a, B:626:0x1065, B:629:0x012a, B:630:0x00e6, B:632:0x00fe, B:633:0x0101, B:635:0x0107, B:636:0x0110, B:648:0x1019, B:649:0x101a, B:653:0x1037, B:659:0x1045, B:669:0x1071, B:674:0x0f7c, B:676:0x0f84, B:677:0x0f88, B:679:0x0f8e, B:682:0x0f98, B:718:0x0fe5, B:723:0x1068, B:729:0x106d, B:732:0x106f, B:651:0x1023, B:655:0x1034, B:72:0x017f, B:74:0x019b, B:77:0x01a4, B:80:0x01b6, B:82:0x01c9, B:84:0x01cd, B:85:0x01cf, B:87:0x01d6, B:88:0x0207, B:90:0x020d, B:91:0x0215, B:93:0x0223, B:94:0x022c, B:96:0x024a, B:98:0x0252, B:100:0x025b, B:101:0x0270, B:103:0x027e, B:104:0x0287, B:106:0x028d, B:108:0x0295, B:110:0x029e, B:111:0x02b3, B:113:0x02c7, B:171:0x0508, B:215:0x0515, B:218:0x0512, B:225:0x0517, B:250:0x05fb, B:254:0x060c, B:257:0x0617, B:260:0x0632, B:268:0x0767, B:270:0x079c, B:271:0x07a4, B:292:0x0810, B:294:0x087f, B:295:0x089a, B:297:0x0906, B:298:0x0911, B:300:0x091a, B:301:0x0926, B:303:0x092a, B:304:0x0936, B:306:0x093a, B:307:0x0946, B:309:0x094a, B:310:0x0956, B:312:0x095a, B:313:0x096a, B:315:0x096e, B:316:0x097c, B:318:0x0980, B:319:0x098e, B:320:0x0a2a, B:323:0x0a2d, B:324:0x0a2e, B:326:0x0a4c, B:327:0x0a54, B:382:0x0be7, B:383:0x0c09, B:390:0x0e82, B:391:0x0e83, B:554:0x0eba, B:555:0x0ebb, B:591:0x0f01, B:592:0x0f0e, B:595:0x0f10, B:596:0x0f11, B:598:0x0f13, B:599:0x0f19, B:602:0x0f1b, B:603:0x0f21, B:605:0x0f27, B:608:0x0f3d, B:610:0x0f48, B:612:0x0f5b, B:613:0x0f35, B:62:0x014e, B:64:0x0156, B:65:0x0160, B:6:0x001a, B:10:0x104e, B:11:0x1055, B:13:0x0022, B:642:0x1001, B:645:0x1007, B:647:0x1012), top: B:2:0x0008, inners: #10, #17, #22, #26, #32 }] */
    /* JADX WARN: Removed duplicated region for block: B:669:0x1071 A[Catch: all -> 0x1079, TryCatch #37 {all -> 0x1079, blocks: (B:3:0x0008, B:4:0x0019, B:14:0x0024, B:15:0x0025, B:17:0x002b, B:20:0x0033, B:22:0x0052, B:23:0x0056, B:25:0x005c, B:28:0x0066, B:29:0x0068, B:31:0x0074, B:33:0x0094, B:35:0x009a, B:36:0x009c, B:38:0x00a0, B:39:0x00aa, B:41:0x00bb, B:42:0x00bf, B:44:0x00ca, B:46:0x00d9, B:48:0x00dd, B:50:0x0113, B:55:0x012f, B:56:0x0133, B:60:0x014d, B:66:0x0162, B:67:0x0163, B:69:0x0178, B:70:0x017e, B:219:0x0520, B:227:0x1057, B:670:0x1078, B:230:0x0521, B:232:0x0550, B:234:0x057d, B:236:0x0583, B:238:0x0587, B:241:0x0592, B:243:0x05a6, B:244:0x05c4, B:248:0x05d2, B:392:0x0f70, B:617:0x105a, B:626:0x1065, B:629:0x012a, B:630:0x00e6, B:632:0x00fe, B:633:0x0101, B:635:0x0107, B:636:0x0110, B:648:0x1019, B:649:0x101a, B:653:0x1037, B:659:0x1045, B:669:0x1071, B:674:0x0f7c, B:676:0x0f84, B:677:0x0f88, B:679:0x0f8e, B:682:0x0f98, B:718:0x0fe5, B:723:0x1068, B:729:0x106d, B:732:0x106f, B:651:0x1023, B:655:0x1034, B:72:0x017f, B:74:0x019b, B:77:0x01a4, B:80:0x01b6, B:82:0x01c9, B:84:0x01cd, B:85:0x01cf, B:87:0x01d6, B:88:0x0207, B:90:0x020d, B:91:0x0215, B:93:0x0223, B:94:0x022c, B:96:0x024a, B:98:0x0252, B:100:0x025b, B:101:0x0270, B:103:0x027e, B:104:0x0287, B:106:0x028d, B:108:0x0295, B:110:0x029e, B:111:0x02b3, B:113:0x02c7, B:171:0x0508, B:215:0x0515, B:218:0x0512, B:225:0x0517, B:250:0x05fb, B:254:0x060c, B:257:0x0617, B:260:0x0632, B:268:0x0767, B:270:0x079c, B:271:0x07a4, B:292:0x0810, B:294:0x087f, B:295:0x089a, B:297:0x0906, B:298:0x0911, B:300:0x091a, B:301:0x0926, B:303:0x092a, B:304:0x0936, B:306:0x093a, B:307:0x0946, B:309:0x094a, B:310:0x0956, B:312:0x095a, B:313:0x096a, B:315:0x096e, B:316:0x097c, B:318:0x0980, B:319:0x098e, B:320:0x0a2a, B:323:0x0a2d, B:324:0x0a2e, B:326:0x0a4c, B:327:0x0a54, B:382:0x0be7, B:383:0x0c09, B:390:0x0e82, B:391:0x0e83, B:554:0x0eba, B:555:0x0ebb, B:591:0x0f01, B:592:0x0f0e, B:595:0x0f10, B:596:0x0f11, B:598:0x0f13, B:599:0x0f19, B:602:0x0f1b, B:603:0x0f21, B:605:0x0f27, B:608:0x0f3d, B:610:0x0f48, B:612:0x0f5b, B:613:0x0f35, B:62:0x014e, B:64:0x0156, B:65:0x0160, B:6:0x001a, B:10:0x104e, B:11:0x1055, B:13:0x0022, B:642:0x1001, B:645:0x1007, B:647:0x1012), top: B:2:0x0008, inners: #10, #17, #22, #26, #32 }] */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.io.RandomAccessFile] */
    /* JADX WARN: Type inference failed for: r10v11, types: [java.io.RandomAccessFile] */
    /* JADX WARN: Type inference failed for: r10v12, types: [java.io.RandomAccessFile] */
    /* JADX WARN: Type inference failed for: r12v1, types: [X.0Kp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v9, types: [java.util.zip.ZipFile] */
    /* JADX WARN: Type inference failed for: r1v146, types: [java.lang.Object, java.util.Comparator] */
    /* JADX WARN: Type inference failed for: r1v199 */
    /* JADX WARN: Type inference failed for: r1v200 */
    /* JADX WARN: Type inference failed for: r28v3, types: [java.lang.Object, X.096] */
    /* JADX WARN: Type inference failed for: r3v225, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r3v227, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v229, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r3v232, types: [java.util.zip.ZipEntry] */
    /* JADX WARN: Type inference failed for: r3v241, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r3v243, types: [long] */
    /* JADX WARN: Type inference failed for: r3v248, types: [long] */
    /* JADX WARN: Type inference failed for: r3v250, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r3v258, types: [byte] */
    /* JADX WARN: Type inference failed for: r3v296, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v297, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v373 */
    /* JADX WARN: Type inference failed for: r4v82, types: [X.0vx, X.0Gv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r61v0, types: [android.content.Context, android.app.Application, com.instagram.app.InstagramAppShell, java.lang.Object, android.content.ContextWrapper] */
    /* JADX WARN: Type inference failed for: r6v30, types: [android.app.Application$ActivityLifecycleCallbacks, com.facebook.perf.background.BackgroundStartupDetector, android.os.Handler] */
    /* JADX WARN: Type inference failed for: r6v6, types: [X.0tg] */
    /* JADX WARN: Type inference failed for: r8v14, types: [X.0Kp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v24, types: [java.io.RandomAccessFile] */
    @Override // android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void attachBaseContext(android.content.Context r62) {
        /*
            Method dump skipped, instructions count: 4225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.app.InstagramAppShell.attachBaseContext(android.content.Context):void");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final File getCacheDir() {
        AbstractC12280kW abstractC12280kW = this.A06;
        File cacheDir = super.getCacheDir();
        if (abstractC12280kW != null) {
            return abstractC12280kW.getCacheDir(cacheDir);
        }
        return cacheDir;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final File getDir(String str, int i) {
        File dirOverride;
        AbstractC12280kW abstractC12280kW = this.A06;
        if (abstractC12280kW != null && (dirOverride = abstractC12280kW.getDirOverride(str, i)) != null) {
            return dirOverride;
        }
        return super.getDir(str, i);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        Object obj = this.A06;
        if (obj instanceof InterfaceC07710an) {
            if (this instanceof InterfaceC07700am) {
                Resources overridingResources = ((InterfaceC07710an) obj).getOverridingResources();
                if (overridingResources != null) {
                    return overridingResources;
                }
            } else {
                throw new IllegalStateException(AnonymousClass001.A0R(getClass().getName(), " illegally implements HasOverridingResources without HasBaseResourcesAccess."));
            }
        }
        return super.getResources();
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        AbstractC12280kW abstractC12280kW = this.A06;
        if (abstractC12280kW != null) {
            abstractC12280kW.onConfigurationChangedCallback(configuration);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x040f, code lost:
    
        if (r0 != false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x011a, code lost:
    
        if (X.C20150ym.A07(X.AbstractC20100yh.A00(r0)) != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0144, code lost:
    
        if (X.C0Sf.A00(r23, X.AnonymousClass001.A0R("classtracinglogger_enable_", r1)) != false) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [X.0e5] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v5, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v1, types: [X.0e5] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.util.AbstractCollection, java.util.ArrayList] */
    @Override // android.app.Application
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate() {
        /*
            Method dump skipped, instructions count: 1497
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.app.InstagramAppShell.onCreate():void");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final File getExternalFilesDir(String str) {
        File file;
        if (!C20150ym.A07(AbstractC20100yh.A00(36326906404026555L))) {
            return super.getExternalFilesDir(str);
        }
        Map map = this.A07;
        if (map.containsKey(str) && (file = (File) map.get(str)) != null && file.exists()) {
            return file;
        }
        File externalFilesDir = super.getExternalFilesDir(str);
        map.put(str, externalFilesDir);
        return externalFilesDir;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final File[] getExternalFilesDirs(String str) {
        File[] externalFilesDirs;
        if (!C20150ym.A07(AbstractC20100yh.A00(36326906404092092L))) {
            return super.getExternalFilesDirs(str);
        }
        Map map = this.A08;
        if (!map.containsKey(str) || (externalFilesDirs = (File[]) map.get(str)) == null || !Arrays.stream(externalFilesDirs).allMatch(new Predicate() { // from class: X.0gd
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((File) obj).exists();
            }
        })) {
            externalFilesDirs = super.getExternalFilesDirs(str);
            if (externalFilesDirs != null) {
                map.put(str, externalFilesDirs);
            } else {
                return null;
            }
        }
        return (File[]) Arrays.copyOf(externalFilesDirs, externalFilesDirs.length);
    }
}
