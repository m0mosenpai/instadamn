package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.List;

/* renamed from: X.9DH, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9DH extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9DH(Object obj, InterfaceC23621Ds interfaceC23621Ds, Object obj2, int i) {
        super(2, interfaceC23621Ds);
        this.A04 = i;
        this.A01 = obj;
        this.A03 = obj2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0003. Please report as an issue. */
    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Object obj2;
        Object obj3;
        int i;
        Object obj4;
        int i2;
        C9DH c9dh;
        Object obj5;
        Object obj6;
        int i3;
        C9DH c9dh2;
        Object obj7;
        Object obj8;
        Object obj9;
        int i4;
        switch (this.A04) {
            case 0:
                obj8 = this.A03;
                obj9 = this.A02;
                obj7 = this.A01;
                i4 = 0;
                return new C9DH(obj8, obj9, obj7, interfaceC23621Ds, i4);
            case 1:
                obj8 = this.A03;
                obj9 = this.A02;
                obj7 = this.A01;
                i4 = 1;
                return new C9DH(obj8, obj9, obj7, interfaceC23621Ds, i4);
            case 2:
                c9dh2 = new C9DH(this.A02, this.A01, interfaceC23621Ds, 2);
                c9dh2.A03 = obj;
                return c9dh2;
            case 3:
                obj2 = this.A03;
                obj3 = this.A01;
                i = 3;
                c9dh = new C9DH(obj3, interfaceC23621Ds, obj2, i);
                c9dh.A02 = obj;
                return c9dh;
            case 4:
                return new C9DH(interfaceC23621Ds, (InterfaceC24731Iq) this.A01);
            case 5:
                obj5 = this.A02;
                obj6 = this.A01;
                i3 = 5;
                c9dh2 = new C9DH(obj5, obj6, interfaceC23621Ds, i3);
                c9dh2.A03 = obj;
                return c9dh2;
            case 6:
                obj2 = this.A03;
                obj3 = this.A01;
                i = 6;
                c9dh = new C9DH(obj3, interfaceC23621Ds, obj2, i);
                c9dh.A02 = obj;
                return c9dh;
            case 7:
                obj8 = this.A03;
                obj9 = this.A02;
                obj7 = this.A01;
                i4 = 7;
                return new C9DH(obj8, obj9, obj7, interfaceC23621Ds, i4);
            case 8:
                obj5 = this.A02;
                obj6 = this.A01;
                i3 = 8;
                c9dh2 = new C9DH(obj5, obj6, interfaceC23621Ds, i3);
                c9dh2.A03 = obj;
                return c9dh2;
            case 9:
                obj2 = this.A03;
                obj3 = this.A01;
                i = 9;
                c9dh = new C9DH(obj3, interfaceC23621Ds, obj2, i);
                c9dh.A02 = obj;
                return c9dh;
            case 10:
                obj2 = this.A03;
                obj3 = this.A01;
                i = 10;
                c9dh = new C9DH(obj3, interfaceC23621Ds, obj2, i);
                c9dh.A02 = obj;
                return c9dh;
            case 11:
                obj2 = this.A03;
                obj3 = this.A01;
                i = 11;
                c9dh = new C9DH(obj3, interfaceC23621Ds, obj2, i);
                c9dh.A02 = obj;
                return c9dh;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                obj8 = this.A03;
                obj7 = this.A01;
                obj9 = this.A02;
                i4 = 12;
                return new C9DH(obj8, obj9, obj7, interfaceC23621Ds, i4);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                obj2 = this.A03;
                obj3 = this.A01;
                i = 13;
                c9dh = new C9DH(obj3, interfaceC23621Ds, obj2, i);
                c9dh.A02 = obj;
                return c9dh;
            case 14:
                obj2 = this.A03;
                obj3 = this.A01;
                i = 14;
                c9dh = new C9DH(obj3, interfaceC23621Ds, obj2, i);
                c9dh.A02 = obj;
                return c9dh;
            case Process.SIGTERM /* 15 */:
                obj2 = this.A03;
                obj3 = this.A01;
                i = 15;
                c9dh = new C9DH(obj3, interfaceC23621Ds, obj2, i);
                c9dh.A02 = obj;
                return c9dh;
            case 16:
                obj8 = this.A03;
                obj9 = this.A02;
                obj7 = this.A01;
                i4 = 16;
                return new C9DH(obj8, obj9, obj7, interfaceC23621Ds, i4);
            case 17:
                obj8 = this.A03;
                obj9 = this.A02;
                obj7 = this.A01;
                i4 = 17;
                return new C9DH(obj8, obj9, obj7, interfaceC23621Ds, i4);
            case 18:
                obj9 = this.A02;
                obj7 = this.A01;
                obj8 = this.A03;
                i4 = 18;
                return new C9DH(obj8, obj9, obj7, interfaceC23621Ds, i4);
            case Process.SIGSTOP /* 19 */:
                obj4 = this.A03;
                i2 = 19;
                return new C9DH(obj4, interfaceC23621Ds, i2);
            case 20:
                obj9 = this.A02;
                obj7 = this.A01;
                obj8 = this.A03;
                i4 = 20;
                return new C9DH(obj8, obj9, obj7, interfaceC23621Ds, i4);
            case 21:
                obj9 = this.A02;
                obj7 = this.A01;
                obj8 = this.A03;
                i4 = 21;
                return new C9DH(obj8, obj9, obj7, interfaceC23621Ds, i4);
            case 22:
                obj2 = this.A03;
                obj3 = this.A01;
                i = 22;
                c9dh = new C9DH(obj3, interfaceC23621Ds, obj2, i);
                c9dh.A02 = obj;
                return c9dh;
            case 23:
                obj2 = this.A03;
                obj3 = this.A01;
                i = 23;
                c9dh = new C9DH(obj3, interfaceC23621Ds, obj2, i);
                c9dh.A02 = obj;
                return c9dh;
            case 24:
                obj8 = this.A03;
                obj9 = this.A02;
                obj7 = this.A01;
                i4 = 24;
                return new C9DH(obj8, obj9, obj7, interfaceC23621Ds, i4);
            case 25:
                obj9 = this.A02;
                obj7 = this.A01;
                obj8 = this.A03;
                i4 = 25;
                return new C9DH(obj8, obj9, obj7, interfaceC23621Ds, i4);
            case 26:
                obj9 = this.A02;
                obj7 = this.A01;
                obj8 = this.A03;
                i4 = 26;
                return new C9DH(obj8, obj9, obj7, interfaceC23621Ds, i4);
            case 27:
                obj8 = this.A03;
                obj7 = this.A01;
                obj9 = this.A02;
                i4 = 27;
                return new C9DH(obj8, obj9, obj7, interfaceC23621Ds, i4);
            case 28:
                obj8 = this.A03;
                obj7 = this.A01;
                obj9 = this.A02;
                i4 = 28;
                return new C9DH(obj8, obj9, obj7, interfaceC23621Ds, i4);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                obj9 = this.A02;
                obj7 = this.A01;
                obj8 = this.A03;
                i4 = 29;
                return new C9DH(obj8, obj9, obj7, interfaceC23621Ds, i4);
            case 30:
                obj9 = this.A02;
                obj7 = this.A01;
                obj8 = this.A03;
                i4 = 30;
                return new C9DH(obj8, obj9, obj7, interfaceC23621Ds, i4);
            case 31:
                obj9 = this.A02;
                obj7 = this.A01;
                obj8 = this.A03;
                i4 = 31;
                return new C9DH(obj8, obj9, obj7, interfaceC23621Ds, i4);
            case 32:
                obj9 = this.A02;
                obj7 = this.A01;
                obj8 = this.A03;
                i4 = 32;
                return new C9DH(obj8, obj9, obj7, interfaceC23621Ds, i4);
            case 33:
                obj9 = this.A02;
                obj7 = this.A01;
                obj8 = this.A03;
                i4 = 33;
                return new C9DH(obj8, obj9, obj7, interfaceC23621Ds, i4);
            case 34:
                obj9 = this.A02;
                obj7 = this.A01;
                obj8 = this.A03;
                i4 = 34;
                return new C9DH(obj8, obj9, obj7, interfaceC23621Ds, i4);
            case 35:
                obj8 = this.A03;
                obj7 = this.A01;
                obj9 = this.A02;
                i4 = 35;
                return new C9DH(obj8, obj9, obj7, interfaceC23621Ds, i4);
            case 36:
                obj8 = this.A03;
                obj7 = this.A01;
                obj9 = this.A02;
                i4 = 36;
                return new C9DH(obj8, obj9, obj7, interfaceC23621Ds, i4);
            case 37:
                obj7 = this.A01;
                obj8 = this.A03;
                obj9 = this.A02;
                i4 = 37;
                return new C9DH(obj8, obj9, obj7, interfaceC23621Ds, i4);
            case 38:
                return new C9DH(this.A01, interfaceC23621Ds, this.A03, 38);
            case 39:
                c9dh = new C9DH(this.A01, interfaceC23621Ds, this.A03, 39);
                c9dh.A02 = obj;
                return c9dh;
            case 40:
                obj9 = this.A02;
                obj7 = this.A01;
                obj8 = this.A03;
                i4 = 40;
                return new C9DH(obj8, obj9, obj7, interfaceC23621Ds, i4);
            case Seq.NULL_REFNUM /* 41 */:
                C9DH c9dh3 = new C9DH(this.A03, interfaceC23621Ds, 41);
                c9dh3.A01 = obj;
                return c9dh3;
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                c9dh = new C9DH((C4AB) this.A03, (List) this.A01, interfaceC23621Ds, this.A00);
                c9dh.A02 = obj;
                return c9dh;
            case 43:
                obj4 = this.A03;
                i2 = 43;
                return new C9DH(obj4, interfaceC23621Ds, i2);
            case 44:
                obj4 = this.A03;
                i2 = 44;
                return new C9DH(obj4, interfaceC23621Ds, i2);
            case 45:
                obj4 = this.A03;
                i2 = 45;
                return new C9DH(obj4, interfaceC23621Ds, i2);
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                obj4 = this.A03;
                i2 = 46;
                return new C9DH(obj4, interfaceC23621Ds, i2);
            case 47:
                obj7 = this.A01;
                obj8 = this.A03;
                obj9 = this.A02;
                i4 = 47;
                return new C9DH(obj8, obj9, obj7, interfaceC23621Ds, i4);
            case 48:
                obj2 = this.A03;
                obj3 = this.A01;
                i = 48;
                c9dh = new C9DH(obj3, interfaceC23621Ds, obj2, i);
                c9dh.A02 = obj;
                return c9dh;
            default:
                obj8 = this.A03;
                obj9 = this.A02;
                obj7 = this.A01;
                i4 = 49;
                return new C9DH(obj8, obj9, obj7, interfaceC23621Ds, i4);
        }
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C9DH) create(obj, (InterfaceC23621Ds) obj2)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:344:0x0756, code lost:
    
        if (r1 != false) goto L306;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x07c6, code lost:
    
        if (r1 == r2) goto L328;
     */
    /* JADX WARN: Code restructure failed: missing block: B:527:0x0c4f, code lost:
    
        if (X.AnonymousClass139.A00(r22, r7) == r3) goto L519;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0304 A[Catch: IOException -> 0x0396, TryCatch #5 {IOException -> 0x0396, blocks: (B:159:0x02ea, B:160:0x02ed, B:161:0x02fe, B:163:0x0304, B:165:0x031c, B:166:0x0321, B:168:0x0325, B:169:0x032a, B:171:0x032e, B:172:0x0337, B:174:0x033b, B:175:0x0348, B:177:0x034c, B:178:0x0351, B:180:0x0355, B:181:0x035a, B:183:0x035e, B:184:0x0363, B:186:0x0367, B:187:0x036c, B:189:0x0370, B:191:0x0379, B:194:0x0388, B:198:0x02d0, B:199:0x02d3, B:204:0x02c0), top: B:154:0x02b2 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x09b3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:309:0x08b7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0687 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0105 A[Catch: all -> 0x0df7, TryCatch #7 {all -> 0x0df7, blocks: (B:37:0x00f5, B:38:0x00ff, B:40:0x0105, B:41:0x0111, B:43:0x0117, B:46:0x0121), top: B:36:0x00f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:479:0x0aa1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:514:0x0c7c A[Catch: all -> 0x0c90, LOOP:7: B:512:0x0c76->B:514:0x0c7c, LOOP_END, TryCatch #1 {all -> 0x0c90, blocks: (B:510:0x0c6d, B:511:0x0c70, B:512:0x0c76, B:514:0x0c7c, B:516:0x0c8a, B:523:0x0c52), top: B:505:0x0adc }] */
    /* JADX WARN: Removed duplicated region for block: B:645:0x0d9e A[Catch: all -> 0x0db2, TryCatch #2 {all -> 0x0db2, blocks: (B:642:0x0d92, B:643:0x0d95, B:645:0x0d9e, B:646:0x0d85, B:650:0x0dac, B:657:0x0d81), top: B:638:0x0d65 }] */
    /* JADX WARN: Removed duplicated region for block: B:648:0x0d91  */
    /* JADX WARN: Removed duplicated region for block: B:650:0x0dac A[Catch: all -> 0x0db2, TRY_LEAVE, TryCatch #2 {all -> 0x0db2, blocks: (B:642:0x0d92, B:643:0x0d95, B:645:0x0d9e, B:646:0x0d85, B:650:0x0dac, B:657:0x0d81), top: B:638:0x0d65 }] */
    /* JADX WARN: Type inference failed for: r3v101 */
    /* JADX WARN: Type inference failed for: r3v102 */
    /* JADX WARN: Type inference failed for: r3v28, types: [int] */
    /* JADX WARN: Type inference failed for: r3v33, types: [X.46r] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:612:0x0d8f -> B:608:0x0d95). Please report as a decompilation issue!!! */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 3758
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9DH.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9DH(Object obj, Object obj2, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A04 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9DH(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A04 = i;
        this.A03 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9DH(C4AB c4ab, List list, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A04 = 42;
        this.A01 = list;
        this.A00 = i;
        this.A03 = c4ab;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9DH(Object obj, Object obj2, Object obj3, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A04 = i;
        this.A03 = obj;
        this.A02 = obj2;
        this.A01 = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9DH(InterfaceC23621Ds interfaceC23621Ds, InterfaceC24731Iq interfaceC24731Iq) {
        super(2, interfaceC23621Ds);
        this.A04 = 4;
        this.A01 = interfaceC24731Iq;
    }
}
