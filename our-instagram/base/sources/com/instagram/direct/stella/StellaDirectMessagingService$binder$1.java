package com.instagram.direct.stella;

import X.AbstractC12990ll;
import X.AbstractC53964Ntb;
import X.AbstractC53966Ntd;
import X.C0K8;
import X.C0f9;
import X.C55055OaA;
import X.EnumC53275NhD;
import X.MSW;
import X.OVP;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.instagram.direct.stella.api.ISendDirectMessageCallback;
import com.instagram.direct.stella.api.IStellaDirectMessagingService;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class StellaDirectMessagingService$binder$1 extends Binder implements IStellaDirectMessagingService {
    public final /* synthetic */ StellaDirectMessagingService A00;

    public static String A00() {
        return new C55055OaA(3, "payload is empty").A01();
    }

    public static void A01(Object obj, JSONObject jSONObject) {
        jSONObject.put("success", true);
        jSONObject.putOpt("result", obj);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StellaDirectMessagingService$binder$1(StellaDirectMessagingService stellaDirectMessagingService) {
        this();
        this.A00 = stellaDirectMessagingService;
        C0f9.A0A(85231848, C0f9.A03(-1135217224));
    }

    public static boolean A02(AbstractC12990ll abstractC12990ll) {
        return AbstractC53964Ntb.A00(abstractC12990ll).booleanValue();
    }

    @Override // com.instagram.direct.stella.api.IStellaDirectMessagingService
    public final void ED8(ISendDirectMessageCallback iSendDirectMessageCallback) {
        int i;
        int A03 = C0f9.A03(2003985676);
        OVP ovp = OVP.A00;
        StellaDirectMessagingService stellaDirectMessagingService = this.A00;
        if (ovp.A00(stellaDirectMessagingService, null, stellaDirectMessagingService.A01) != EnumC53275NhD.A0N) {
            C0K8.A0D("StellaDirectMessagingService", "Failed to register callback");
            i = -606075514;
        } else {
            stellaDirectMessagingService.A00 = iSendDirectMessageCallback;
            AbstractC53966Ntd.A00(MSW.A0Q(stellaDirectMessagingService)).A00(stellaDirectMessagingService.A00);
            i = -1350835582;
        }
        C0f9.A0A(i, A03);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:365|(1:367)(1:471)|368|(1:370)|371|(4:377|(2:379|380)|381|(1:383))|384|(1:(8:470|393|(7:396|397|398|400|(6:405|406|(2:408|(1:410))(2:447|(2:449|(1:451)(1:452)))|411|(4:414|(11:424|425|426|(1:428)|429|(1:431)|432|(1:434)(1:440)|(1:436)|437|438)|439|412)|445)|446|394)|458|459|460|461|462)(1:469))(1:388)|389|(1:391)|392|393|(1:394)|458|459|460|461|462) */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02e8, code lost:
    
        if (r33 != null) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x035f, code lost:
    
        if (X.AbstractC001900j.A0T(r6) != false) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x046d, code lost:
    
        if (r6 != null) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x069a, code lost:
    
        if (X.AbstractC001900j.A0T(r11) != false) goto L298;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x065f, code lost:
    
        if (X.AbstractC001900j.A0T(r7) != false) goto L282;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x0679, code lost:
    
        if (X.AbstractC001900j.A0T(r7) != false) goto L290;
     */
    /* JADX WARN: Code restructure failed: missing block: B:464:0x0a4d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:465:0x0a4e, code lost:
    
        X.MSX.A1P(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:396:0x093f A[Catch: IllegalArgumentException -> 0x0d3b, JSONException -> 0x0d4f, Exception -> 0x0d77, TRY_LEAVE, TryCatch #17 {IllegalArgumentException -> 0x0d3b, blocks: (B:81:0x0216, B:82:0x0230, B:83:0x0233, B:84:0x0237, B:85:0x0238, B:86:0x023a, B:91:0x0d39, B:162:0x03b9, B:165:0x03bc, B:167:0x03d2, B:169:0x03d9, B:171:0x03e3, B:173:0x03e0, B:174:0x03e9, B:176:0x03f1, B:177:0x03f8, B:181:0x0407, B:183:0x040f, B:184:0x0413, B:186:0x041b, B:187:0x041f, B:189:0x0427, B:190:0x042a, B:192:0x0432, B:193:0x0436, B:195:0x043e, B:197:0x0444, B:199:0x044a, B:202:0x0454, B:207:0x045b, B:209:0x046f, B:211:0x0475, B:213:0x04e4, B:215:0x04ea, B:217:0x053b, B:219:0x04f2, B:221:0x04f8, B:223:0x0541, B:224:0x054b, B:227:0x0548, B:229:0x0534, B:230:0x0480, B:232:0x0463, B:241:0x0551, B:243:0x0555, B:244:0x055b, B:246:0x0570, B:247:0x057a, B:250:0x0577, B:251:0x0580, B:253:0x0584, B:254:0x058a, B:255:0x0599, B:257:0x059f, B:260:0x05a5, B:262:0x05a9, B:264:0x05e9, B:265:0x068d, B:267:0x0695, B:271:0x06a3, B:272:0x06a5, B:275:0x06ba, B:276:0x06bc, B:278:0x06c4, B:280:0x06ce, B:282:0x0826, B:283:0x06d5, B:285:0x06dc, B:293:0x0703, B:297:0x072a, B:298:0x0788, B:302:0x07be, B:303:0x0791, B:304:0x0795, B:305:0x0796, B:306:0x0712, B:307:0x0812, B:309:0x0816, B:310:0x0820, B:313:0x081d, B:288:0x06e7, B:315:0x06b7, B:316:0x06a0, B:318:0x05f5, B:320:0x05fd, B:324:0x0628, B:326:0x065a, B:330:0x0670, B:332:0x0674, B:335:0x067e, B:336:0x0687, B:338:0x0667, B:341:0x0835, B:345:0x084f, B:348:0x0874, B:353:0x0884, B:355:0x0895, B:356:0x089f, B:359:0x089c, B:360:0x08a5, B:362:0x08ad, B:364:0x08b7, B:365:0x08bd, B:367:0x08c6, B:368:0x08ca, B:370:0x08d2, B:371:0x08d6, B:373:0x08de, B:375:0x08e4, B:377:0x08ea, B:381:0x08f6, B:384:0x08fb, B:386:0x0901, B:388:0x0907, B:389:0x090c, B:391:0x0918, B:392:0x0921, B:393:0x0928, B:394:0x0939, B:396:0x093f, B:398:0x094d, B:403:0x0953, B:406:0x0959, B:408:0x0963, B:410:0x0969, B:411:0x0971, B:412:0x0975, B:414:0x097b, B:417:0x0991, B:422:0x0999, B:425:0x099d, B:429:0x09a7, B:432:0x09b3, B:434:0x09bd, B:437:0x09c5, B:447:0x0a07, B:449:0x0a11, B:451:0x0a19, B:456:0x0a23, B:459:0x0a45, B:461:0x0a49, B:462:0x0a51, B:465:0x0a4e, B:467:0x0a2e, B:469:0x0a34, B:470:0x0a3f, B:472:0x0a57, B:474:0x0a5f, B:476:0x0a69, B:477:0x0a6f, B:479:0x0a89, B:481:0x0a8f, B:483:0x0a95, B:486:0x0a9f, B:494:0x0aaf, B:496:0x0ac9, B:497:0x0ad3, B:500:0x0ad0, B:501:0x0ad9, B:503:0x0adf, B:504:0x0ae7, B:506:0x0af6, B:507:0x0afe, B:510:0x0afb, B:511:0x0b04, B:513:0x0b0a, B:514:0x0b11, B:515:0x0b17, B:517:0x0b1f, B:518:0x0b29, B:521:0x0b3f, B:523:0x0b43, B:525:0x0b4b, B:528:0x0b56, B:530:0x0b5a, B:531:0x0b5c, B:532:0x0b49, B:533:0x0b78, B:535:0x0b7e, B:536:0x0b86, B:539:0x0b83, B:540:0x0b8c, B:542:0x0b92, B:543:0x0b9a, B:545:0x0ba7, B:546:0x0baf, B:549:0x0bac, B:550:0x0bb5, B:557:0x0bf4, B:559:0x0c0a, B:560:0x0c0e, B:563:0x0c1a, B:566:0x0c47, B:567:0x0c50, B:569:0x0c56, B:570:0x0c59, B:572:0x0c68, B:575:0x0c4c, B:576:0x0c31, B:578:0x0c61, B:579:0x0c6f, B:581:0x0c73, B:582:0x0c7b, B:585:0x0c78, B:586:0x0bc6, B:588:0x0bc9, B:591:0x0bea, B:592:0x0c81, B:594:0x0c91, B:595:0x0c9b, B:598:0x0c98, B:599:0x0ca1, B:601:0x0ca7, B:602:0x0ca9, B:603:0x0caf, B:605:0x0cb3, B:607:0x0cb9, B:609:0x0cc6, B:611:0x0cd5, B:614:0x0d1f, B:616:0x0d2c, B:617:0x0d34, B:620:0x0d31, B:621:0x0d1c, B:624:0x0ce0, B:626:0x0d01, B:629:0x0d0b, B:631:0x0d13), top: B:80:0x0216 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0216 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.NnP, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v15, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    /* JADX WARN: Type inference failed for: r14v10, types: [X.1Ke, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r30v8, types: [X.0oO, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v21, types: [X.0bW, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3, types: [X.1Ke, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7, types: [X.1Ke, java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    @Override // com.instagram.direct.stella.api.IStellaDirectMessagingService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String EIw(java.lang.String r76) {
        /*
            Method dump skipped, instructions count: 3642
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.stella.StellaDirectMessagingService$binder$1.EIw(java.lang.String):java.lang.String");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        C0f9.A0A(-1384374591, C0f9.A03(833994989));
        return this;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.instagram.direct.stella.api.ISendDirectMessageCallback$Stub$Proxy, java.lang.Object] */
    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        ISendDirectMessageCallback iSendDirectMessageCallback;
        int A03 = C0f9.A03(1236982173);
        if (i >= 1) {
            if (i <= 16777215) {
                parcel.enforceInterface("com.instagram.direct.stella.api.IStellaDirectMessagingService");
                if (i != 1) {
                    if (i == 2) {
                        String EIw = EIw(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeString(EIw);
                    }
                } else {
                    IBinder readStrongBinder = parcel.readStrongBinder();
                    if (readStrongBinder == null) {
                        iSendDirectMessageCallback = null;
                    } else {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.instagram.direct.stella.api.ISendDirectMessageCallback");
                        if (queryLocalInterface != null && (queryLocalInterface instanceof ISendDirectMessageCallback)) {
                            iSendDirectMessageCallback = (ISendDirectMessageCallback) queryLocalInterface;
                        } else {
                            ?? obj = new Object();
                            int A032 = C0f9.A03(-1184040099);
                            obj.A00 = readStrongBinder;
                            C0f9.A0A(1877711693, A032);
                            iSendDirectMessageCallback = obj;
                        }
                    }
                    ED8(iSendDirectMessageCallback);
                    parcel2.writeNoException();
                }
                i3 = 1749529690;
                C0f9.A0A(i3, A03);
                return true;
            }
            if (i == 1598968902) {
                parcel2.writeString("com.instagram.direct.stella.api.IStellaDirectMessagingService");
                i3 = -2122839959;
                C0f9.A0A(i3, A03);
                return true;
            }
        }
        boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
        C0f9.A0A(141195160, A03);
        return onTransact;
    }

    public StellaDirectMessagingService$binder$1() {
        int A03 = C0f9.A03(-1284992723);
        attachInterface(this, "com.instagram.direct.stella.api.IStellaDirectMessagingService");
        C0f9.A0A(-718171360, A03);
    }
}
