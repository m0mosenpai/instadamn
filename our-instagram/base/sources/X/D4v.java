package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;

/* loaded from: classes5.dex */
public final class D4v extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final int A01;
    public final Object A02;

    public static Object A01(Object obj, D4v d4v, InterfaceC15070pN interfaceC15070pN, int i) {
        BU4 bu4 = new BU4(obj, i);
        d4v.A00 = 1;
        return interfaceC15070pN.collect(bu4, d4v);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D4v(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A01 = i;
        this.A02 = obj;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        int i;
        int i2 = this.A01;
        Object obj2 = this.A02;
        switch (i2) {
            case 0:
                i = 0;
                break;
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                break;
            case 3:
                i = 3;
                break;
            case 4:
                i = 4;
                break;
            case 5:
                i = 5;
                break;
            case 6:
                i = 6;
                break;
            case 7:
                i = 7;
                break;
            case 8:
                i = 8;
                break;
            case 9:
                i = 9;
                break;
            case 10:
                i = 10;
                break;
            case 11:
                i = 11;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                i = 12;
                break;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                i = 13;
                break;
            case 14:
                i = 14;
                break;
            case Process.SIGTERM /* 15 */:
                i = 15;
                break;
            case 16:
                i = 16;
                break;
            case 17:
                i = 17;
                break;
            case 18:
                i = 18;
                break;
            case Process.SIGSTOP /* 19 */:
                i = 19;
                break;
            case 20:
                i = 20;
                break;
            case 21:
                i = 21;
                break;
            case 22:
                i = 22;
                break;
            case 23:
                i = 23;
                break;
            case 24:
                i = 24;
                break;
            case 25:
                i = 25;
                break;
            case 26:
                i = 26;
                break;
            case 27:
                i = 27;
                break;
            case 28:
                i = 28;
                break;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                i = 29;
                break;
            case 30:
                i = 30;
                break;
            case 31:
                i = 31;
                break;
            case 32:
                i = 32;
                break;
            case 33:
                i = 33;
                break;
            case 34:
                i = 34;
                break;
            case 35:
                i = 35;
                break;
            case 36:
                i = 36;
                break;
            case 37:
                i = 37;
                break;
            case 38:
                i = 38;
                break;
            case 39:
                i = 39;
                break;
            case 40:
                i = 40;
                break;
            case Seq.NULL_REFNUM /* 41 */:
                i = 41;
                break;
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                i = 42;
                break;
            case 43:
                i = 43;
                break;
            case 44:
                i = 44;
                break;
            case 45:
                i = 45;
                break;
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                i = 46;
                break;
            case 47:
                i = 47;
                break;
            case 48:
                i = 48;
                break;
            default:
                i = 49;
                break;
        }
        return new D4v(obj2, interfaceC23621Ds, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:249:0x0584, code lost:
    
        if (r7 != null) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:428:0x09ac, code lost:
    
        if (r9 != null) goto L422;
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x09ae, code lost:
    
        r2 = r0.getValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:430:0x09c5, code lost:
    
        if (r0.AIi(r2, X.C26065Bft.A00((X.C26065Bft) r2, null, null, r9, null, 214, false, true, false, false)) == false) goto L559;
     */
    /* JADX WARN: Code restructure failed: missing block: B:433:0x09fe, code lost:
    
        r4 = r0.getValue();
        r3 = (X.C26065Bft) r4;
        r8 = r3.A03;
        r11 = X.AbstractC25225BEi.A1a(r8, r2.A00);
        r7 = new java.lang.Integer(2131974295);
        r10 = r3.A07;
        r6 = (X.C6R) r3.A01;
        r12 = r3.A08;
        X.AbstractC167007dF.A1D(r8, 0, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:434:0x0a2c, code lost:
    
        if (r0.AIi(r4, new X.C26065Bft(r6, r7, r8, "bio_regen_error", r10, r11, r12, false)) == false) goto L561;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0997 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0693  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x06c8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:507:0x0bdd  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x0bf5  */
    /* JADX WARN: Type inference failed for: r7v35, types: [com.facebook.graphql.calls.GraphQlCallInput, X.Be9] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:289:0x06c6 -> B:282:0x0685). Please report as a decompilation issue!!! */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 3578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.D4v.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public static Object A00(Object obj, D4v d4v) {
        AbstractC09560e7.A00(obj);
        return d4v.A02;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((D4v) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
