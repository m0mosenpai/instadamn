package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;

/* loaded from: classes8.dex */
public final class MC7 extends AbstractC23611Dp implements InterfaceC16620sF {
    public Object A00;
    public Object A01;
    public final int A02;
    public final Object A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MC7(Object obj, Object obj2, Object obj3, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A02 = i;
        this.A00 = obj;
        this.A03 = obj2;
        this.A01 = obj3;
    }

    public static C48591LeT A00(MC7 mc7, int i) {
        C48591LeT c48591LeT = (C48591LeT) mc7.A01;
        IgdsMediaButton igdsMediaButton = c48591LeT.A0A;
        if (igdsMediaButton != null) {
            igdsMediaButton.setVisibility(i);
        }
        return c48591LeT;
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
        int i2;
        MC7 mc7;
        Object obj7;
        Object obj8;
        int i3;
        Object obj9;
        Object obj10;
        int i4;
        Object obj11;
        Object obj12;
        int i5;
        MC7 mc72;
        switch (this.A02) {
            case 0:
                obj7 = this.A00;
                obj8 = this.A03;
                i3 = 0;
                mc7 = new MC7(obj8, obj7, interfaceC23621Ds, i3);
                mc7.A01 = obj;
                return mc7;
            case 1:
                obj9 = this.A01;
                obj10 = this.A03;
                i4 = 1;
                mc72 = new MC7(interfaceC23621Ds, obj9, obj10, i4);
                mc72.A00 = obj;
                return mc72;
            case 2:
                obj3 = this.A00;
                obj4 = this.A03;
                obj2 = this.A01;
                i = 2;
                return new MC7(obj3, obj4, obj2, interfaceC23621Ds, i);
            case 3:
                obj3 = this.A00;
                obj2 = this.A01;
                obj4 = this.A03;
                i = 3;
                return new MC7(obj3, obj4, obj2, interfaceC23621Ds, i);
            case 4:
                obj2 = this.A01;
                obj3 = this.A00;
                obj4 = this.A03;
                i = 4;
                return new MC7(obj3, obj4, obj2, interfaceC23621Ds, i);
            case 5:
                obj3 = this.A00;
                obj4 = this.A03;
                obj2 = this.A01;
                i = 5;
                return new MC7(obj3, obj4, obj2, interfaceC23621Ds, i);
            case 6:
                obj7 = this.A00;
                obj8 = this.A03;
                i3 = 6;
                mc7 = new MC7(obj8, obj7, interfaceC23621Ds, i3);
                mc7.A01 = obj;
                return mc7;
            case 7:
                obj9 = this.A01;
                obj10 = this.A03;
                i4 = 7;
                mc72 = new MC7(interfaceC23621Ds, obj9, obj10, i4);
                mc72.A00 = obj;
                return mc72;
            case 8:
                obj2 = this.A01;
                obj3 = this.A00;
                obj4 = this.A03;
                i = 8;
                return new MC7(obj3, obj4, obj2, interfaceC23621Ds, i);
            case 9:
                obj2 = this.A01;
                obj3 = this.A00;
                obj4 = this.A03;
                i = 9;
                return new MC7(obj3, obj4, obj2, interfaceC23621Ds, i);
            case 10:
                obj2 = this.A01;
                obj3 = this.A00;
                obj4 = this.A03;
                i = 10;
                return new MC7(obj3, obj4, obj2, interfaceC23621Ds, i);
            case 11:
                obj2 = this.A01;
                obj3 = this.A00;
                obj4 = this.A03;
                i = 11;
                return new MC7(obj3, obj4, obj2, interfaceC23621Ds, i);
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                obj9 = this.A01;
                obj10 = this.A03;
                i4 = 12;
                mc72 = new MC7(interfaceC23621Ds, obj9, obj10, i4);
                mc72.A00 = obj;
                return mc72;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                obj4 = this.A03;
                obj2 = this.A01;
                obj3 = this.A00;
                i = 13;
                return new MC7(obj3, obj4, obj2, interfaceC23621Ds, i);
            case 14:
                obj9 = this.A01;
                obj10 = this.A03;
                i4 = 14;
                mc72 = new MC7(interfaceC23621Ds, obj9, obj10, i4);
                mc72.A00 = obj;
                return mc72;
            case Process.SIGTERM /* 15 */:
                obj2 = this.A01;
                obj4 = this.A03;
                obj3 = this.A00;
                i = 15;
                return new MC7(obj3, obj4, obj2, interfaceC23621Ds, i);
            case 16:
                obj2 = this.A01;
                obj3 = this.A00;
                obj4 = this.A03;
                i = 16;
                return new MC7(obj3, obj4, obj2, interfaceC23621Ds, i);
            case 17:
                obj9 = this.A01;
                obj10 = this.A03;
                i4 = 17;
                mc72 = new MC7(interfaceC23621Ds, obj9, obj10, i4);
                mc72.A00 = obj;
                return mc72;
            case 18:
                obj11 = this.A03;
                obj12 = this.A01;
                i5 = 18;
                mc72 = new MC7(interfaceC23621Ds, obj12, obj11, i5);
                mc72.A00 = obj;
                return mc72;
            case Process.SIGSTOP /* 19 */:
                obj2 = this.A01;
                obj4 = this.A03;
                obj3 = this.A00;
                i = 19;
                return new MC7(obj3, obj4, obj2, interfaceC23621Ds, i);
            case 20:
                obj9 = this.A01;
                obj10 = this.A03;
                i4 = 20;
                mc72 = new MC7(interfaceC23621Ds, obj9, obj10, i4);
                mc72.A00 = obj;
                return mc72;
            case 21:
                obj2 = this.A01;
                obj3 = this.A00;
                obj4 = this.A03;
                i = 21;
                return new MC7(obj3, obj4, obj2, interfaceC23621Ds, i);
            case 22:
                obj5 = this.A03;
                obj6 = this.A00;
                i2 = 22;
                mc7 = new MC7(obj5, obj6, interfaceC23621Ds, i2);
                mc7.A01 = obj;
                return mc7;
            case 23:
                obj5 = this.A03;
                obj6 = this.A00;
                i2 = 23;
                mc7 = new MC7(obj5, obj6, interfaceC23621Ds, i2);
                mc7.A01 = obj;
                return mc7;
            case 24:
                obj9 = this.A01;
                obj10 = this.A03;
                i4 = 24;
                mc72 = new MC7(interfaceC23621Ds, obj9, obj10, i4);
                mc72.A00 = obj;
                return mc72;
            case 25:
                obj2 = this.A01;
                obj4 = this.A03;
                obj3 = this.A00;
                i = 25;
                return new MC7(obj3, obj4, obj2, interfaceC23621Ds, i);
            case 26:
                obj5 = this.A03;
                obj6 = this.A00;
                i2 = 26;
                mc7 = new MC7(obj5, obj6, interfaceC23621Ds, i2);
                mc7.A01 = obj;
                return mc7;
            case 27:
                obj4 = this.A03;
                obj2 = this.A01;
                obj3 = this.A00;
                i = 27;
                return new MC7(obj3, obj4, obj2, interfaceC23621Ds, i);
            case 28:
                obj2 = this.A01;
                obj3 = this.A00;
                obj4 = this.A03;
                i = 28;
                return new MC7(obj3, obj4, obj2, interfaceC23621Ds, i);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                obj2 = this.A01;
                obj4 = this.A03;
                obj3 = this.A00;
                i = 29;
                return new MC7(obj3, obj4, obj2, interfaceC23621Ds, i);
            case 30:
                obj2 = this.A01;
                obj4 = this.A03;
                obj3 = this.A00;
                i = 30;
                return new MC7(obj3, obj4, obj2, interfaceC23621Ds, i);
            case 31:
                obj2 = this.A01;
                obj4 = this.A03;
                obj3 = this.A00;
                i = 31;
                return new MC7(obj3, obj4, obj2, interfaceC23621Ds, i);
            case 32:
                obj3 = this.A00;
                obj2 = this.A01;
                obj4 = this.A03;
                i = 32;
                return new MC7(obj3, obj4, obj2, interfaceC23621Ds, i);
            case 33:
                obj4 = this.A03;
                obj2 = this.A01;
                obj3 = this.A00;
                i = 33;
                return new MC7(obj3, obj4, obj2, interfaceC23621Ds, i);
            case 34:
                obj2 = this.A01;
                obj3 = this.A00;
                obj4 = this.A03;
                i = 34;
                return new MC7(obj3, obj4, obj2, interfaceC23621Ds, i);
            case 35:
                obj9 = this.A01;
                obj10 = this.A03;
                i4 = 35;
                mc72 = new MC7(interfaceC23621Ds, obj9, obj10, i4);
                mc72.A00 = obj;
                return mc72;
            case 36:
                obj9 = this.A01;
                obj10 = this.A03;
                i4 = 36;
                mc72 = new MC7(interfaceC23621Ds, obj9, obj10, i4);
                mc72.A00 = obj;
                return mc72;
            case 37:
                obj9 = this.A01;
                obj10 = this.A03;
                i4 = 37;
                mc72 = new MC7(interfaceC23621Ds, obj9, obj10, i4);
                mc72.A00 = obj;
                return mc72;
            case 38:
                obj9 = this.A01;
                obj10 = this.A03;
                i4 = 38;
                mc72 = new MC7(interfaceC23621Ds, obj9, obj10, i4);
                mc72.A00 = obj;
                return mc72;
            case 39:
                obj4 = this.A03;
                obj3 = this.A00;
                obj2 = this.A01;
                i = 39;
                return new MC7(obj3, obj4, obj2, interfaceC23621Ds, i);
            case 40:
                obj3 = this.A00;
                obj2 = this.A01;
                obj4 = this.A03;
                i = 40;
                return new MC7(obj3, obj4, obj2, interfaceC23621Ds, i);
            case Seq.NULL_REFNUM /* 41 */:
                obj9 = this.A01;
                obj10 = this.A03;
                i4 = 41;
                mc72 = new MC7(interfaceC23621Ds, obj9, obj10, i4);
                mc72.A00 = obj;
                return mc72;
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                obj9 = this.A01;
                obj10 = this.A03;
                i4 = 42;
                mc72 = new MC7(interfaceC23621Ds, obj9, obj10, i4);
                mc72.A00 = obj;
                return mc72;
            case 43:
                obj9 = this.A01;
                obj10 = this.A03;
                i4 = 43;
                mc72 = new MC7(interfaceC23621Ds, obj9, obj10, i4);
                mc72.A00 = obj;
                return mc72;
            case 44:
                obj9 = this.A01;
                obj10 = this.A03;
                i4 = 44;
                mc72 = new MC7(interfaceC23621Ds, obj9, obj10, i4);
                mc72.A00 = obj;
                return mc72;
            case 45:
                obj3 = this.A00;
                obj4 = this.A03;
                obj2 = this.A01;
                i = 45;
                return new MC7(obj3, obj4, obj2, interfaceC23621Ds, i);
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                obj11 = this.A03;
                obj12 = this.A01;
                i5 = 46;
                mc72 = new MC7(interfaceC23621Ds, obj12, obj11, i5);
                mc72.A00 = obj;
                return mc72;
            case 47:
                obj9 = this.A01;
                obj10 = this.A03;
                i4 = 47;
                mc72 = new MC7(interfaceC23621Ds, obj9, obj10, i4);
                mc72.A00 = obj;
                return mc72;
            case 48:
                obj2 = this.A01;
                obj3 = this.A00;
                obj4 = this.A03;
                i = 48;
                return new MC7(obj3, obj4, obj2, interfaceC23621Ds, i);
            default:
                obj9 = this.A01;
                obj10 = this.A03;
                i4 = 49;
                mc72 = new MC7(interfaceC23621Ds, obj9, obj10, i4);
                mc72.A00 = obj;
                return mc72;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:420:0x08d1, code lost:
    
        if (X.C14360o3.A0K(r3, "270") != false) goto L401;
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x08f5, code lost:
    
        if (r11 == null) goto L409;
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x08f7, code lost:
    
        r4 = r9.getValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x0904, code lost:
    
        if (X.JQ0.A1X((X.C8OS) r4, X.C05F.A0u, r4, r9) == false) goto L800;
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x0906, code lost:
    
        r3 = r8.A00;
        r10 = r8.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:430:0x0912, code lost:
    
        if (((X.C8OS) r9.getValue()).A03 == null) goto L414;
     */
    /* JADX WARN: Code restructure failed: missing block: B:431:0x0914, code lost:
    
        r7.A06 = X.AbstractC23641Du.A02(X.AnonymousClass191.A00, new com.instagram.creation.capture.assetpicker.cutout.viewmodel.CutoutStickerViewModel$uploadTrimmedVideo$1(r6, r7, null, r1, r3, r10), X.AbstractC141776au.A00(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:432:0x092d, code lost:
    
        r2 = r7.A08;
     */
    /* JADX WARN: Code restructure failed: missing block: B:434:0x093b, code lost:
    
        if (r2.AIi(r2.getValue(), false) == false) goto L802;
     */
    /* JADX WARN: Code restructure failed: missing block: B:438:0x093f, code lost:
    
        r12 = r9.getValue();
        r13 = (X.C8OS) r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:439:0x0981, code lost:
    
        if (r9.AIi(r12, new X.C8OS(r13.A02, r11, r13.A01, new X.C45112Jxh(r11.getWidth(), r11.getHeight()), r13.A04, r13.A05, r13.A08, r13.A07, r13.A06)) == false) goto L804;
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x0983, code lost:
    
        r7.A0I(r11, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:662:0x102f, code lost:
    
        if (r7 != null) goto L617;
     */
    /* JADX WARN: Code restructure failed: missing block: B:670:0x1075, code lost:
    
        if (r1 == false) goto L626;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0792  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x055d  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0612  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x065f  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x06f7  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0737  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0797  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0804  */
    /* JADX WARN: Removed duplicated region for block: B:649:0x12a7  */
    /* JADX WARN: Type inference failed for: r6v37, types: [X.0pT, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v33, types: [X.0oO, java.lang.Object] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r30) {
        /*
            Method dump skipped, instructions count: 5426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MC7.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MC7) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MC7(InterfaceC23621Ds interfaceC23621Ds, Object obj, Object obj2, int i) {
        super(2, interfaceC23621Ds);
        this.A02 = i;
        this.A01 = obj;
        this.A03 = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MC7(Object obj, Object obj2, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A02 = i;
        this.A03 = obj;
        this.A00 = obj2;
    }
}
