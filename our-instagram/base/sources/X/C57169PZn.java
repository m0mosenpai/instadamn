package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;

/* renamed from: X.PZn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57169PZn extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57169PZn(CredentialRequest credentialRequest, RGP rgp, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A05 = 9;
        this.A01 = rgp;
        this.A02 = credentialRequest;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Object obj2;
        Object obj3;
        int i;
        Object obj4;
        Object obj5;
        int i2;
        Object obj6;
        Object obj7;
        Object obj8;
        int i3;
        Object obj9;
        Object obj10;
        Object obj11;
        int i4;
        Object obj12;
        Object obj13;
        Object obj14;
        Object obj15;
        int i5;
        switch (this.A05) {
            case 0:
                obj13 = this.A03;
                obj15 = this.A01;
                obj14 = this.A02;
                obj12 = this.A04;
                i5 = 0;
                return new C57169PZn(obj13, obj14, obj15, obj12, interfaceC23621Ds, i5);
            case 1:
                obj13 = this.A03;
                obj15 = this.A01;
                obj14 = this.A02;
                obj12 = this.A04;
                i5 = 1;
                return new C57169PZn(obj13, obj14, obj15, obj12, interfaceC23621Ds, i5);
            case 2:
                obj13 = this.A03;
                obj15 = this.A01;
                obj14 = this.A02;
                obj12 = this.A04;
                i5 = 2;
                return new C57169PZn(obj13, obj14, obj15, obj12, interfaceC23621Ds, i5);
            case 3:
                obj13 = this.A03;
                obj15 = this.A01;
                obj14 = this.A02;
                obj12 = this.A04;
                i5 = 3;
                return new C57169PZn(obj13, obj14, obj15, obj12, interfaceC23621Ds, i5);
            case 4:
                obj12 = this.A04;
                obj13 = this.A03;
                obj14 = this.A02;
                obj15 = this.A01;
                i5 = 4;
                return new C57169PZn(obj13, obj14, obj15, obj12, interfaceC23621Ds, i5);
            case 5:
                obj12 = this.A04;
                obj14 = this.A02;
                obj15 = this.A01;
                obj13 = this.A03;
                i5 = 5;
                return new C57169PZn(obj13, obj14, obj15, obj12, interfaceC23621Ds, i5);
            case 6:
                obj12 = this.A04;
                obj14 = this.A02;
                obj15 = this.A01;
                obj13 = this.A03;
                i5 = 6;
                return new C57169PZn(obj13, obj14, obj15, obj12, interfaceC23621Ds, i5);
            case 7:
                obj2 = this.A04;
                obj3 = this.A01;
                i = 7;
                C57169PZn c57169PZn = new C57169PZn(obj2, obj3, interfaceC23621Ds, i);
                c57169PZn.A02 = obj;
                return c57169PZn;
            case 8:
                obj2 = this.A04;
                obj3 = this.A01;
                i = 8;
                C57169PZn c57169PZn2 = new C57169PZn(obj2, obj3, interfaceC23621Ds, i);
                c57169PZn2.A02 = obj;
                return c57169PZn2;
            case 9:
                return new C57169PZn((CredentialRequest) this.A02, (RGP) this.A01, interfaceC23621Ds);
            case 10:
                obj10 = this.A04;
                obj9 = this.A01;
                obj11 = this.A02;
                i4 = 10;
                return new C57169PZn(interfaceC23621Ds, obj10, obj11, obj9, i4);
            case 11:
                obj7 = this.A02;
                obj6 = this.A04;
                obj8 = this.A01;
                i3 = 11;
                C57169PZn c57169PZn3 = new C57169PZn(interfaceC23621Ds, obj6, obj7, obj8, i3);
                c57169PZn3.A03 = obj;
                return c57169PZn3;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                Object obj16 = this.A01;
                C57169PZn c57169PZn4 = new C57169PZn(this.A03, this.A02, obj16, interfaceC23621Ds, 12);
                c57169PZn4.A04 = obj;
                return c57169PZn4;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                obj13 = this.A03;
                obj14 = this.A02;
                obj12 = this.A04;
                obj15 = this.A01;
                i5 = 13;
                return new C57169PZn(obj13, obj14, obj15, obj12, interfaceC23621Ds, i5);
            case 14:
                obj6 = this.A04;
                obj7 = this.A02;
                obj8 = this.A01;
                i3 = 14;
                C57169PZn c57169PZn32 = new C57169PZn(interfaceC23621Ds, obj6, obj7, obj8, i3);
                c57169PZn32.A03 = obj;
                return c57169PZn32;
            case Process.SIGTERM /* 15 */:
                obj13 = this.A03;
                obj15 = this.A01;
                obj12 = this.A04;
                obj14 = this.A02;
                i5 = 15;
                return new C57169PZn(obj13, obj14, obj15, obj12, interfaceC23621Ds, i5);
            case 16:
                obj2 = this.A04;
                obj3 = this.A01;
                i = 16;
                C57169PZn c57169PZn22 = new C57169PZn(obj2, obj3, interfaceC23621Ds, i);
                c57169PZn22.A02 = obj;
                return c57169PZn22;
            case 17:
                obj13 = this.A03;
                obj14 = this.A02;
                obj12 = this.A04;
                obj15 = this.A01;
                i5 = 17;
                return new C57169PZn(obj13, obj14, obj15, obj12, interfaceC23621Ds, i5);
            case 18:
                obj4 = this.A04;
                obj5 = this.A01;
                i2 = 18;
                return new C57169PZn(obj4, obj5, interfaceC23621Ds, i2);
            case Process.SIGSTOP /* 19 */:
                obj7 = this.A02;
                obj6 = this.A04;
                obj8 = this.A01;
                i3 = 19;
                C57169PZn c57169PZn322 = new C57169PZn(interfaceC23621Ds, obj6, obj7, obj8, i3);
                c57169PZn322.A03 = obj;
                return c57169PZn322;
            case 20:
                obj13 = this.A03;
                obj14 = this.A02;
                obj12 = this.A04;
                obj15 = this.A01;
                i5 = 20;
                return new C57169PZn(obj13, obj14, obj15, obj12, interfaceC23621Ds, i5);
            case 21:
                obj13 = this.A03;
                obj14 = this.A02;
                obj12 = this.A04;
                obj15 = this.A01;
                i5 = 21;
                return new C57169PZn(obj13, obj14, obj15, obj12, interfaceC23621Ds, i5);
            case 22:
                obj13 = this.A03;
                obj14 = this.A02;
                obj15 = this.A01;
                obj12 = this.A04;
                i5 = 22;
                return new C57169PZn(obj13, obj14, obj15, obj12, interfaceC23621Ds, i5);
            case 23:
                obj13 = this.A03;
                obj14 = this.A02;
                obj12 = this.A04;
                obj15 = this.A01;
                i5 = 23;
                return new C57169PZn(obj13, obj14, obj15, obj12, interfaceC23621Ds, i5);
            case 24:
                obj12 = this.A04;
                obj14 = this.A02;
                obj15 = this.A01;
                obj13 = this.A03;
                i5 = 24;
                return new C57169PZn(obj13, obj14, obj15, obj12, interfaceC23621Ds, i5);
            case 25:
                obj9 = this.A01;
                obj10 = this.A04;
                obj11 = this.A02;
                i4 = 25;
                return new C57169PZn(interfaceC23621Ds, obj10, obj11, obj9, i4);
            case 26:
                obj9 = this.A01;
                obj10 = this.A04;
                obj11 = this.A02;
                i4 = 26;
                return new C57169PZn(interfaceC23621Ds, obj10, obj11, obj9, i4);
            case 27:
                obj6 = this.A04;
                obj7 = this.A02;
                obj8 = this.A01;
                i3 = 27;
                C57169PZn c57169PZn3222 = new C57169PZn(interfaceC23621Ds, obj6, obj7, obj8, i3);
                c57169PZn3222.A03 = obj;
                return c57169PZn3222;
            case 28:
                obj12 = this.A04;
                obj13 = this.A03;
                obj14 = this.A02;
                obj15 = this.A01;
                i5 = 28;
                return new C57169PZn(obj13, obj14, obj15, obj12, interfaceC23621Ds, i5);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                obj12 = this.A04;
                obj13 = this.A03;
                obj14 = this.A02;
                obj15 = this.A01;
                i5 = 29;
                return new C57169PZn(obj13, obj14, obj15, obj12, interfaceC23621Ds, i5);
            case 30:
                obj12 = this.A04;
                obj14 = this.A02;
                obj13 = this.A03;
                obj15 = this.A01;
                i5 = 30;
                return new C57169PZn(obj13, obj14, obj15, obj12, interfaceC23621Ds, i5);
            case 31:
                obj13 = this.A03;
                obj14 = this.A02;
                obj12 = this.A04;
                obj15 = this.A01;
                i5 = 31;
                return new C57169PZn(obj13, obj14, obj15, obj12, interfaceC23621Ds, i5);
            case 32:
                obj13 = this.A03;
                obj15 = this.A01;
                obj12 = this.A04;
                obj14 = this.A02;
                i5 = 32;
                return new C57169PZn(obj13, obj14, obj15, obj12, interfaceC23621Ds, i5);
            case 33:
                obj13 = this.A03;
                obj14 = this.A02;
                obj12 = this.A04;
                obj15 = this.A01;
                i5 = 33;
                return new C57169PZn(obj13, obj14, obj15, obj12, interfaceC23621Ds, i5);
            case 34:
                obj13 = this.A03;
                obj14 = this.A02;
                obj12 = this.A04;
                obj15 = this.A01;
                i5 = 34;
                return new C57169PZn(obj13, obj14, obj15, obj12, interfaceC23621Ds, i5);
            case 35:
                obj14 = this.A02;
                obj15 = this.A01;
                obj12 = this.A04;
                obj13 = this.A03;
                i5 = 35;
                return new C57169PZn(obj13, obj14, obj15, obj12, interfaceC23621Ds, i5);
            case 36:
                obj14 = this.A02;
                obj15 = this.A01;
                obj12 = this.A04;
                obj13 = this.A03;
                i5 = 36;
                return new C57169PZn(obj13, obj14, obj15, obj12, interfaceC23621Ds, i5);
            case 37:
                obj13 = this.A03;
                obj14 = this.A02;
                obj12 = this.A04;
                obj15 = this.A01;
                i5 = 37;
                return new C57169PZn(obj13, obj14, obj15, obj12, interfaceC23621Ds, i5);
            case 38:
                obj13 = this.A03;
                obj14 = this.A02;
                obj12 = this.A04;
                obj15 = this.A01;
                i5 = 38;
                return new C57169PZn(obj13, obj14, obj15, obj12, interfaceC23621Ds, i5);
            case 39:
                C57169PZn c57169PZn5 = new C57169PZn((C51037Mgm) this.A04, interfaceC23621Ds);
                c57169PZn5.A01 = obj;
                return c57169PZn5;
            case 40:
                obj14 = this.A02;
                obj12 = this.A04;
                obj15 = this.A01;
                obj13 = this.A03;
                i5 = 40;
                return new C57169PZn(obj13, obj14, obj15, obj12, interfaceC23621Ds, i5);
            case Seq.NULL_REFNUM /* 41 */:
                return new C57169PZn(this.A04, this.A01, interfaceC23621Ds, 41);
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                obj4 = this.A04;
                obj5 = this.A01;
                i2 = 42;
                return new C57169PZn(obj4, obj5, interfaceC23621Ds, i2);
            case 43:
                obj2 = this.A04;
                obj3 = this.A01;
                i = 43;
                C57169PZn c57169PZn222 = new C57169PZn(obj2, obj3, interfaceC23621Ds, i);
                c57169PZn222.A02 = obj;
                return c57169PZn222;
            case 44:
                obj14 = this.A02;
                obj15 = this.A01;
                obj12 = this.A04;
                obj13 = this.A03;
                i5 = 44;
                return new C57169PZn(obj13, obj14, obj15, obj12, interfaceC23621Ds, i5);
            case 45:
                obj14 = this.A02;
                obj15 = this.A01;
                obj12 = this.A04;
                obj13 = this.A03;
                i5 = 45;
                return new C57169PZn(obj13, obj14, obj15, obj12, interfaceC23621Ds, i5);
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                obj14 = this.A02;
                obj15 = this.A01;
                obj12 = this.A04;
                obj13 = this.A03;
                i5 = 46;
                return new C57169PZn(obj13, obj14, obj15, obj12, interfaceC23621Ds, i5);
            case 47:
                obj12 = this.A04;
                obj13 = this.A03;
                obj14 = this.A02;
                obj15 = this.A01;
                i5 = 47;
                return new C57169PZn(obj13, obj14, obj15, obj12, interfaceC23621Ds, i5);
            case 48:
                return new C57169PZn(this.A03, this.A02, this.A01, interfaceC23621Ds, 48);
            default:
                obj13 = this.A03;
                obj15 = this.A01;
                obj14 = this.A02;
                obj12 = this.A04;
                i5 = 49;
                return new C57169PZn(obj13, obj14, obj15, obj12, interfaceC23621Ds, i5);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:779|(12:781|(2:783|(1:785))(1:858)|786|787|788|(1:790)(2:846|(3:848|(1:855)(1:852)|(1:854)))|(3:(10:793|(4:810|811|(2:816|(2:821|817))|814)(1:795)|796|(1:798)|799|(1:801)|802|(1:806)|807|(2:809|(0)))(10:826|(2:840|841)(1:828)|829|(1:831)|832|(1:834)|835|(1:839)|807|(0))|11|12)|845|807|(0)|11|12)|859|786|787|788|(0)(0)|(0)|845|807|(0)|11|12) */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x12de, code lost:
    
        if (r3 == r2) goto L737;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1061:0x184b, code lost:
    
        if (r2 == null) goto L950;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x03c2, code lost:
    
        if (r7.contains(r17) != false) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x0a76, code lost:
    
        if (X.AbstractC167007dF.A1W(r2.Beq()) != false) goto L860;
     */
    /* JADX WARN: Code restructure failed: missing block: B:444:0x163e, code lost:
    
        r3 = r3.A0G;
        r38.A00 = 5;
        r0 = r3.emit(r4, r38);
     */
    /* JADX WARN: Code restructure failed: missing block: B:714:0x0fcc, code lost:
    
        if (r3 == X.EnumC53317Nht.TOOLTIP) goto L595;
     */
    /* JADX WARN: Code restructure failed: missing block: B:856:0x121e, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:857:0x121f, code lost:
    
        X.C0K8.A0F("PendingMediaWorkerUtils", "Failed to create notification thumbnail bitmap", X.MSW.A1D(r2).A00);
     */
    /* JADX WARN: Code restructure failed: missing block: B:946:0x163c, code lost:
    
        if (X.AbstractC167007dF.A1W(r2.Beq()) != false) goto L860;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:1033:0x17aa. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:388:0x08d7. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0006. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:891:0x1459. Please report as an issue. */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 14, insn: 0x1679: INVOKE (r14 I:java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock) VIRTUAL call: java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock.unlock():void A[MD:():void (c)] (LINE:5753), block:B:1063:0x1679 */
    /* JADX WARN: Removed duplicated region for block: B:1039:0x17fc  */
    /* JADX WARN: Removed duplicated region for block: B:1051:0x1860  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x18e5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0728 A[LOOP:5: B:329:0x0722->B:331:0x0728, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0832  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0841  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0997  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x0a15 A[LOOP:10: B:423:0x0a13->B:424:0x0a15, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:430:0x0a28 A[Catch: all -> 0x0ad3, TryCatch #1 {all -> 0x0ad3, blocks: (B:428:0x0a1f, B:430:0x0a28, B:461:0x0a35, B:463:0x0a39, B:464:0x0a3d), top: B:427:0x0a1f }] */
    /* JADX WARN: Removed duplicated region for block: B:433:0x0a40 A[DONT_GENERATE, LOOP:11: B:432:0x0a3e->B:433:0x0a40, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:437:0x0a4b  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x0a6e  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x1649 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:447:0x0a7a  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x0a85  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x0a35 A[Catch: all -> 0x0ad3, TryCatch #1 {all -> 0x0ad3, blocks: (B:428:0x0a1f, B:430:0x0a28, B:461:0x0a35, B:463:0x0a39, B:464:0x0a3d), top: B:427:0x0a1f }] */
    /* JADX WARN: Removed duplicated region for block: B:471:0x09c3  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x145c  */
    /* JADX WARN: Removed duplicated region for block: B:501:0x144c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x1319  */
    /* JADX WARN: Removed duplicated region for block: B:790:0x1149 A[Catch: all -> 0x121e, TryCatch #9 {all -> 0x121e, blocks: (B:788:0x1143, B:790:0x1149, B:793:0x117d, B:796:0x11bf, B:798:0x11c5, B:799:0x11cc, B:802:0x11d1, B:804:0x11d5, B:806:0x11dd, B:825:0x11bb, B:826:0x11e6, B:829:0x11f7, B:831:0x11fd, B:832:0x1204, B:835:0x1209, B:837:0x120d, B:839:0x1215, B:844:0x11f3, B:846:0x1154, B:848:0x115a, B:850:0x1165, B:854:0x116f, B:841:0x11eb, B:811:0x1182, B:814:0x11ad, B:816:0x119e, B:817:0x11a2, B:819:0x11a6, B:821:0x11aa), top: B:787:0x1143, inners: #0, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:792:0x117b  */
    /* JADX WARN: Removed duplicated region for block: B:809:0x1235  */
    /* JADX WARN: Removed duplicated region for block: B:846:0x1154 A[Catch: all -> 0x121e, TryCatch #9 {all -> 0x121e, blocks: (B:788:0x1143, B:790:0x1149, B:793:0x117d, B:796:0x11bf, B:798:0x11c5, B:799:0x11cc, B:802:0x11d1, B:804:0x11d5, B:806:0x11dd, B:825:0x11bb, B:826:0x11e6, B:829:0x11f7, B:831:0x11fd, B:832:0x1204, B:835:0x1209, B:837:0x120d, B:839:0x1215, B:844:0x11f3, B:846:0x1154, B:848:0x115a, B:850:0x1165, B:854:0x116f, B:841:0x11eb, B:811:0x1182, B:814:0x11ad, B:816:0x119e, B:817:0x11a2, B:819:0x11a6, B:821:0x11aa), top: B:787:0x1143, inners: #0, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x13ae A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:921:0x1513  */
    /* JADX WARN: Removed duplicated region for block: B:927:0x1593 A[LOOP:31: B:926:0x1591->B:927:0x1593, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:933:0x15a6 A[Catch: all -> 0x1666, TryCatch #3 {all -> 0x1666, blocks: (B:931:0x159d, B:933:0x15a6, B:961:0x15b3, B:963:0x15b7, B:964:0x15bb), top: B:930:0x159d }] */
    /* JADX WARN: Removed duplicated region for block: B:936:0x15be A[LOOP:32: B:935:0x15bc->B:936:0x15be, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:940:0x15c9  */
    /* JADX WARN: Removed duplicated region for block: B:945:0x1634  */
    /* JADX WARN: Removed duplicated region for block: B:947:0x1656  */
    /* JADX WARN: Removed duplicated region for block: B:949:0x15d9  */
    /* JADX WARN: Removed duplicated region for block: B:961:0x15b3 A[Catch: all -> 0x1666, TryCatch #3 {all -> 0x1666, blocks: (B:931:0x159d, B:933:0x15a6, B:961:0x15b3, B:963:0x15b7, B:964:0x15bb), top: B:930:0x159d }] */
    /* JADX WARN: Removed duplicated region for block: B:969:0x153f  */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, X.RpY] */
    /* JADX WARN: Type inference failed for: r1v180, types: [java.lang.Object, X.1vN] */
    /* JADX WARN: Type inference failed for: r1v188, types: [java.lang.Object, X.1vN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:149:0x027c -> B:143:0x0242). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:151:0x028b -> B:143:0x0242). Please report as a decompilation issue!!! */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r39) {
        /*
            Method dump skipped, instructions count: 6542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57169PZn.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public static C07T A00(Object obj, C57169PZn c57169PZn) {
        AbstractC09560e7.A00(obj);
        return ((C07X) c57169PZn.A03).getLifecycle();
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C57169PZn) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57169PZn(C51037Mgm c51037Mgm, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A05 = 39;
        this.A04 = c51037Mgm;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57169PZn(Object obj, Object obj2, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A05 = i;
        this.A04 = obj;
        this.A01 = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57169PZn(InterfaceC23621Ds interfaceC23621Ds, Object obj, Object obj2, Object obj3, int i) {
        super(2, interfaceC23621Ds);
        this.A05 = i;
        this.A04 = obj;
        this.A02 = obj2;
        this.A01 = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57169PZn(Object obj, Object obj2, Object obj3, Object obj4, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A05 = i;
        this.A03 = obj;
        this.A02 = obj2;
        this.A01 = obj3;
        this.A04 = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57169PZn(Object obj, Object obj2, Object obj3, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A05 = i;
        this.A03 = obj;
        this.A02 = obj2;
        this.A01 = obj3;
    }
}
