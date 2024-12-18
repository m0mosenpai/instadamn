package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;

/* loaded from: classes8.dex */
public final class MCM extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;
    public final Object A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MCM(Object obj, Object obj2, Object obj3, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A04 = i;
        this.A03 = obj;
        this.A05 = obj2;
        this.A01 = obj3;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0003. Please report as an issue. */
    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Object obj2;
        Object obj3;
        Object obj4;
        int i;
        Object obj5;
        Object obj6;
        Object obj7;
        int i2;
        Object obj8;
        Object obj9;
        int i3;
        Object obj10;
        Object obj11;
        int i4;
        UserSession userSession;
        int i5;
        Object obj12;
        Object obj13;
        Object obj14;
        Object obj15;
        int i6;
        switch (this.A04) {
            case 0:
                obj6 = this.A01;
                obj7 = this.A05;
                obj5 = this.A03;
                i2 = 0;
                MCM mcm = new MCM(obj5, obj7, obj6, interfaceC23621Ds, i2);
                mcm.A02 = obj;
                return mcm;
            case 1:
                obj5 = this.A03;
                obj7 = this.A05;
                obj6 = this.A01;
                i2 = 1;
                MCM mcm2 = new MCM(obj5, obj7, obj6, interfaceC23621Ds, i2);
                mcm2.A02 = obj;
                return mcm2;
            case 2:
                obj8 = this.A05;
                obj9 = this.A03;
                i3 = 2;
                return new MCM(obj8, obj9, interfaceC23621Ds, i3);
            case 3:
                obj10 = this.A03;
                obj11 = this.A05;
                i4 = 3;
                return new MCM(obj11, obj10, interfaceC23621Ds, i4);
            case 4:
                obj13 = this.A02;
                obj14 = this.A01;
                obj12 = this.A03;
                obj15 = this.A05;
                i6 = 4;
                return new MCM(obj13, obj14, obj15, obj12, interfaceC23621Ds, i6);
            case 5:
                obj6 = this.A01;
                obj7 = this.A05;
                obj5 = this.A03;
                i2 = 5;
                MCM mcm22 = new MCM(obj5, obj7, obj6, interfaceC23621Ds, i2);
                mcm22.A02 = obj;
                return mcm22;
            case 6:
                obj7 = this.A05;
                obj5 = this.A03;
                obj6 = this.A01;
                i2 = 6;
                MCM mcm222 = new MCM(obj5, obj7, obj6, interfaceC23621Ds, i2);
                mcm222.A02 = obj;
                return mcm222;
            case 7:
                obj12 = this.A03;
                obj15 = this.A05;
                obj14 = this.A01;
                obj13 = this.A02;
                i6 = 7;
                return new MCM(obj13, obj14, obj15, obj12, interfaceC23621Ds, i6);
            case 8:
                obj12 = this.A03;
                obj14 = this.A01;
                obj15 = this.A05;
                obj13 = this.A02;
                i6 = 8;
                return new MCM(obj13, obj14, obj15, obj12, interfaceC23621Ds, i6);
            case 9:
                obj14 = this.A01;
                obj15 = this.A05;
                obj12 = this.A03;
                obj13 = this.A02;
                i6 = 9;
                return new MCM(obj13, obj14, obj15, obj12, interfaceC23621Ds, i6);
            case 10:
                obj14 = this.A01;
                obj15 = this.A05;
                obj12 = this.A03;
                obj13 = this.A02;
                i6 = 10;
                return new MCM(obj13, obj14, obj15, obj12, interfaceC23621Ds, i6);
            case 11:
                obj13 = this.A02;
                obj15 = this.A05;
                obj12 = this.A03;
                obj14 = this.A01;
                i6 = 11;
                return new MCM(obj13, obj14, obj15, obj12, interfaceC23621Ds, i6);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                obj14 = this.A01;
                obj15 = this.A05;
                obj12 = this.A03;
                obj13 = this.A02;
                i6 = 12;
                return new MCM(obj13, obj14, obj15, obj12, interfaceC23621Ds, i6);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                obj14 = this.A01;
                obj15 = this.A05;
                obj12 = this.A03;
                obj13 = this.A02;
                i6 = 13;
                return new MCM(obj13, obj14, obj15, obj12, interfaceC23621Ds, i6);
            case 14:
                obj13 = this.A02;
                obj14 = this.A01;
                obj15 = this.A05;
                obj12 = this.A03;
                i6 = 14;
                return new MCM(obj13, obj14, obj15, obj12, interfaceC23621Ds, i6);
            case Process.SIGTERM /* 15 */:
                obj6 = this.A01;
                obj7 = this.A05;
                obj5 = this.A03;
                i2 = 15;
                MCM mcm2222 = new MCM(obj5, obj7, obj6, interfaceC23621Ds, i2);
                mcm2222.A02 = obj;
                return mcm2222;
            case 16:
                obj13 = this.A02;
                obj14 = this.A01;
                obj15 = this.A05;
                obj12 = this.A03;
                i6 = 16;
                return new MCM(obj13, obj14, obj15, obj12, interfaceC23621Ds, i6);
            case 17:
                obj7 = this.A05;
                obj5 = this.A03;
                obj6 = this.A01;
                i2 = 17;
                MCM mcm22222 = new MCM(obj5, obj7, obj6, interfaceC23621Ds, i2);
                mcm22222.A02 = obj;
                return mcm22222;
            case 18:
                obj6 = this.A01;
                obj5 = this.A03;
                obj7 = this.A05;
                i2 = 18;
                MCM mcm222222 = new MCM(obj5, obj7, obj6, interfaceC23621Ds, i2);
                mcm222222.A02 = obj;
                return mcm222222;
            case Process.SIGSTOP /* 19 */:
                obj13 = this.A02;
                obj15 = this.A05;
                obj12 = this.A03;
                obj14 = this.A01;
                i6 = 19;
                return new MCM(obj13, obj14, obj15, obj12, interfaceC23621Ds, i6);
            case 20:
                obj13 = this.A02;
                obj14 = this.A01;
                obj12 = this.A03;
                obj15 = this.A05;
                i6 = 20;
                return new MCM(obj13, obj14, obj15, obj12, interfaceC23621Ds, i6);
            case 21:
                obj8 = this.A05;
                obj9 = this.A03;
                i3 = 21;
                return new MCM(obj8, obj9, interfaceC23621Ds, i3);
            case 22:
                obj12 = this.A03;
                obj13 = this.A02;
                obj14 = this.A01;
                obj15 = this.A05;
                i6 = 22;
                return new MCM(obj13, obj14, obj15, obj12, interfaceC23621Ds, i6);
            case 23:
                obj13 = this.A02;
                obj15 = this.A05;
                obj12 = this.A03;
                obj14 = this.A01;
                i6 = 23;
                return new MCM(obj13, obj14, obj15, obj12, interfaceC23621Ds, i6);
            case 24:
                obj13 = this.A02;
                obj14 = this.A01;
                obj12 = this.A03;
                obj15 = this.A05;
                i6 = 24;
                return new MCM(obj13, obj14, obj15, obj12, interfaceC23621Ds, i6);
            case 25:
                obj14 = this.A01;
                obj15 = this.A05;
                obj12 = this.A03;
                obj13 = this.A02;
                i6 = 25;
                return new MCM(obj13, obj14, obj15, obj12, interfaceC23621Ds, i6);
            case 26:
                obj14 = this.A01;
                obj15 = this.A05;
                obj12 = this.A03;
                obj13 = this.A02;
                i6 = 26;
                return new MCM(obj13, obj14, obj15, obj12, interfaceC23621Ds, i6);
            case 27:
                MCM mcm3 = new MCM(this.A05, this.A03, interfaceC23621Ds, 27);
                mcm3.A01 = obj;
                return mcm3;
            case 28:
                obj14 = this.A01;
                obj15 = this.A05;
                obj12 = this.A03;
                obj13 = this.A02;
                i6 = 28;
                return new MCM(obj13, obj14, obj15, obj12, interfaceC23621Ds, i6);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                obj15 = this.A05;
                obj13 = this.A02;
                obj12 = this.A03;
                obj14 = this.A01;
                i6 = 29;
                return new MCM(obj13, obj14, obj15, obj12, interfaceC23621Ds, i6);
            case 30:
                obj14 = this.A01;
                obj15 = this.A05;
                obj12 = this.A03;
                obj13 = this.A02;
                i6 = 30;
                return new MCM(obj13, obj14, obj15, obj12, interfaceC23621Ds, i6);
            case 31:
                obj14 = this.A01;
                obj15 = this.A05;
                obj12 = this.A03;
                obj13 = this.A02;
                i6 = 31;
                return new MCM(obj13, obj14, obj15, obj12, interfaceC23621Ds, i6);
            case 32:
                obj14 = this.A01;
                obj15 = this.A05;
                obj12 = this.A03;
                obj13 = this.A02;
                i6 = 32;
                return new MCM(obj13, obj14, obj15, obj12, interfaceC23621Ds, i6);
            case 33:
                obj14 = this.A01;
                obj15 = this.A05;
                obj12 = this.A03;
                obj13 = this.A02;
                i6 = 33;
                return new MCM(obj13, obj14, obj15, obj12, interfaceC23621Ds, i6);
            case 34:
                obj4 = this.A05;
                obj2 = this.A03;
                obj3 = this.A01;
                i = 34;
                return new MCM(obj2, obj4, obj3, interfaceC23621Ds, i);
            case 35:
                userSession = (UserSession) this.A05;
                i5 = 35;
                return new MCM(userSession, interfaceC23621Ds, i5);
            case 36:
                userSession = (UserSession) this.A05;
                i5 = 36;
                return new MCM(userSession, interfaceC23621Ds, i5);
            case 37:
                obj12 = this.A03;
                obj13 = this.A02;
                obj14 = this.A01;
                obj15 = this.A05;
                i6 = 37;
                return new MCM(obj13, obj14, obj15, obj12, interfaceC23621Ds, i6);
            case 38:
                obj14 = this.A01;
                obj15 = this.A05;
                obj12 = this.A03;
                obj13 = this.A02;
                i6 = 38;
                return new MCM(obj13, obj14, obj15, obj12, interfaceC23621Ds, i6);
            case 39:
                obj14 = this.A01;
                obj15 = this.A05;
                obj12 = this.A03;
                obj13 = this.A02;
                i6 = 39;
                return new MCM(obj13, obj14, obj15, obj12, interfaceC23621Ds, i6);
            case 40:
                obj5 = this.A03;
                obj7 = this.A05;
                obj6 = this.A01;
                i2 = 40;
                MCM mcm2222222 = new MCM(obj5, obj7, obj6, interfaceC23621Ds, i2);
                mcm2222222.A02 = obj;
                return mcm2222222;
            case Seq.NULL_REFNUM /* 41 */:
                obj10 = this.A03;
                obj11 = this.A05;
                i4 = 41;
                return new MCM(obj11, obj10, interfaceC23621Ds, i4);
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                obj13 = this.A02;
                obj15 = this.A05;
                obj12 = this.A03;
                obj14 = this.A01;
                i6 = 42;
                return new MCM(obj13, obj14, obj15, obj12, interfaceC23621Ds, i6);
            case 43:
                obj12 = this.A03;
                obj13 = this.A02;
                obj14 = this.A01;
                obj15 = this.A05;
                i6 = 43;
                return new MCM(obj13, obj14, obj15, obj12, interfaceC23621Ds, i6);
            case 44:
                obj8 = this.A05;
                obj9 = this.A03;
                i3 = 44;
                return new MCM(obj8, obj9, interfaceC23621Ds, i3);
            case 45:
                obj12 = this.A03;
                obj13 = this.A02;
                obj14 = this.A01;
                obj15 = this.A05;
                i6 = 45;
                return new MCM(obj13, obj14, obj15, obj12, interfaceC23621Ds, i6);
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                obj5 = this.A03;
                obj6 = this.A01;
                obj7 = this.A05;
                i2 = 46;
                MCM mcm22222222 = new MCM(obj5, obj7, obj6, interfaceC23621Ds, i2);
                mcm22222222.A02 = obj;
                return mcm22222222;
            case 47:
                obj5 = this.A03;
                obj6 = this.A01;
                obj7 = this.A05;
                i2 = 47;
                MCM mcm222222222 = new MCM(obj5, obj7, obj6, interfaceC23621Ds, i2);
                mcm222222222.A02 = obj;
                return mcm222222222;
            case 48:
                obj2 = this.A03;
                obj3 = this.A01;
                obj4 = this.A05;
                i = 48;
                return new MCM(obj2, obj4, obj3, interfaceC23621Ds, i);
            default:
                obj14 = this.A01;
                obj15 = this.A05;
                obj12 = this.A03;
                obj13 = this.A02;
                i6 = 49;
                return new MCM(obj13, obj14, obj15, obj12, interfaceC23621Ds, i6);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0f06 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x06f1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0732 A[Catch: all -> 0x07ba, TryCatch #1 {all -> 0x07ba, blocks: (B:315:0x0728, B:316:0x072b, B:318:0x0732, B:320:0x073c, B:321:0x071a, B:325:0x0751, B:327:0x0755, B:329:0x075d, B:331:0x0765, B:333:0x0769, B:345:0x07b5, B:336:0x076f, B:337:0x07a7, B:338:0x077d, B:340:0x0785, B:342:0x078f, B:343:0x0795, B:344:0x07b1, B:351:0x0716), top: B:311:0x06f7 }] */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0726  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x07b6  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x0b2d  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x0b39  */
    /* JADX WARN: Removed duplicated region for block: B:523:0x0be9  */
    /* JADX WARN: Removed duplicated region for block: B:524:0x0bef  */
    /* JADX WARN: Removed duplicated region for block: B:584:0x0ced  */
    /* JADX WARN: Removed duplicated region for block: B:683:0x0f22  */
    /* JADX WARN: Removed duplicated region for block: B:687:0x0fae  */
    /* JADX WARN: Removed duplicated region for block: B:714:0x0fe2  */
    /* JADX WARN: Removed duplicated region for block: B:718:0x1077  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x022c  */
    /* JADX WARN: Type inference failed for: r3v149, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r3v150, types: [java.util.List, java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v151, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v72, types: [java.lang.Iterable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:307:0x0724 -> B:301:0x072b). Please report as a decompilation issue!!! */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instructions count: 4486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MCM.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public static C07T A00(Object obj, MCM mcm) {
        AbstractC09560e7.A00(obj);
        return ((C07X) mcm.A02).getLifecycle();
    }

    public static C07T A01(Object obj, MCM mcm) {
        AbstractC09560e7.A00(obj);
        return ((C07X) mcm.A01).getLifecycle();
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MCM) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MCM(UserSession userSession, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A04 = i;
        this.A05 = userSession;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MCM(Object obj, Object obj2, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A04 = i;
        this.A05 = obj;
        this.A03 = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MCM(Object obj, Object obj2, Object obj3, Object obj4, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A04 = i;
        this.A02 = obj;
        this.A01 = obj2;
        this.A05 = obj3;
        this.A03 = obj4;
    }
}
