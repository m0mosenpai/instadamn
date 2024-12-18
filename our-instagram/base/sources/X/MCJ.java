package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.brandedcontent.repository.BrandedContentApi;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;

/* loaded from: classes8.dex */
public final class MCJ extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public static Object A02(Object obj, MCJ mcj, InterfaceC15070pN interfaceC15070pN, int i) {
        C50093M9h c50093M9h = new C50093M9h(obj, i);
        mcj.A00 = 1;
        return interfaceC15070pN.collect(c50093M9h, mcj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MCJ(InterfaceC23621Ds interfaceC23621Ds, InterfaceC16660sJ interfaceC16660sJ) {
        super(2, interfaceC23621Ds);
        this.A03 = 19;
        this.A01 = interfaceC16660sJ;
    }

    public static C25245BFe A00(Object obj, MCJ mcj, int i, int i2, int i3) {
        C25245BFe c25245BFe = new C25245BFe(AbstractC25328BIx.A03, AbstractC50712Us.A01.A06(i, i2), 0);
        mcj.A01 = obj;
        mcj.A00 = i3;
        return c25245BFe;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Object obj2;
        Object obj3;
        int i;
        Object obj4;
        Object obj5;
        int i2;
        Object obj6;
        int i3;
        Object obj7;
        int i4;
        switch (this.A03) {
            case 0:
                obj7 = this.A02;
                i4 = 0;
                MCJ mcj = new MCJ(obj7, interfaceC23621Ds, i4);
                mcj.A01 = obj;
                return mcj;
            case 1:
                obj7 = this.A02;
                i4 = 1;
                MCJ mcj2 = new MCJ(obj7, interfaceC23621Ds, i4);
                mcj2.A01 = obj;
                return mcj2;
            case 2:
                obj4 = this.A02;
                obj5 = this.A01;
                i2 = 2;
                return new MCJ(obj5, obj4, interfaceC23621Ds, i2);
            case 3:
                obj7 = this.A02;
                i4 = 3;
                MCJ mcj22 = new MCJ(obj7, interfaceC23621Ds, i4);
                mcj22.A01 = obj;
                return mcj22;
            case 4:
                obj6 = this.A02;
                i3 = 4;
                return new MCJ(obj6, interfaceC23621Ds, i3);
            case 5:
                obj7 = this.A02;
                i4 = 5;
                MCJ mcj222 = new MCJ(obj7, interfaceC23621Ds, i4);
                mcj222.A01 = obj;
                return mcj222;
            case 6:
                obj4 = this.A02;
                obj5 = this.A01;
                i2 = 6;
                return new MCJ(obj5, obj4, interfaceC23621Ds, i2);
            case 7:
                obj4 = this.A02;
                obj5 = this.A01;
                i2 = 7;
                return new MCJ(obj5, obj4, interfaceC23621Ds, i2);
            case 8:
                obj7 = this.A02;
                i4 = 8;
                MCJ mcj2222 = new MCJ(obj7, interfaceC23621Ds, i4);
                mcj2222.A01 = obj;
                return mcj2222;
            case 9:
                obj7 = this.A02;
                i4 = 9;
                MCJ mcj22222 = new MCJ(obj7, interfaceC23621Ds, i4);
                mcj22222.A01 = obj;
                return mcj22222;
            case 10:
                obj7 = this.A02;
                i4 = 10;
                MCJ mcj222222 = new MCJ(obj7, interfaceC23621Ds, i4);
                mcj222222.A01 = obj;
                return mcj222222;
            case 11:
                obj7 = this.A02;
                i4 = 11;
                MCJ mcj2222222 = new MCJ(obj7, interfaceC23621Ds, i4);
                mcj2222222.A01 = obj;
                return mcj2222222;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                obj2 = this.A01;
                obj3 = this.A02;
                i = 12;
                return new MCJ(obj2, obj3, interfaceC23621Ds, i);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                obj7 = this.A02;
                i4 = 13;
                MCJ mcj22222222 = new MCJ(obj7, interfaceC23621Ds, i4);
                mcj22222222.A01 = obj;
                return mcj22222222;
            case 14:
                obj7 = this.A02;
                i4 = 14;
                MCJ mcj222222222 = new MCJ(obj7, interfaceC23621Ds, i4);
                mcj222222222.A01 = obj;
                return mcj222222222;
            case Process.SIGTERM /* 15 */:
                obj7 = this.A02;
                i4 = 15;
                MCJ mcj2222222222 = new MCJ(obj7, interfaceC23621Ds, i4);
                mcj2222222222.A01 = obj;
                return mcj2222222222;
            case 16:
                obj7 = this.A02;
                i4 = 16;
                MCJ mcj22222222222 = new MCJ(obj7, interfaceC23621Ds, i4);
                mcj22222222222.A01 = obj;
                return mcj22222222222;
            case 17:
                obj7 = this.A02;
                i4 = 17;
                MCJ mcj222222222222 = new MCJ(obj7, interfaceC23621Ds, i4);
                mcj222222222222.A01 = obj;
                return mcj222222222222;
            case 18:
                obj2 = this.A01;
                obj3 = this.A02;
                i = 18;
                return new MCJ(obj2, obj3, interfaceC23621Ds, i);
            case Process.SIGSTOP /* 19 */:
                MCJ mcj3 = new MCJ(interfaceC23621Ds, (InterfaceC16660sJ) this.A01);
                mcj3.A02 = obj;
                return mcj3;
            case 20:
                obj4 = this.A02;
                obj5 = this.A01;
                i2 = 20;
                return new MCJ(obj5, obj4, interfaceC23621Ds, i2);
            case 21:
                obj2 = this.A01;
                obj3 = this.A02;
                i = 21;
                return new MCJ(obj2, obj3, interfaceC23621Ds, i);
            case 22:
                obj4 = this.A02;
                obj5 = this.A01;
                i2 = 22;
                return new MCJ(obj5, obj4, interfaceC23621Ds, i2);
            case 23:
                obj4 = this.A02;
                obj5 = this.A01;
                i2 = 23;
                return new MCJ(obj5, obj4, interfaceC23621Ds, i2);
            case 24:
                obj4 = this.A02;
                obj5 = this.A01;
                i2 = 24;
                return new MCJ(obj5, obj4, interfaceC23621Ds, i2);
            case 25:
                obj2 = this.A01;
                obj3 = this.A02;
                i = 25;
                return new MCJ(obj2, obj3, interfaceC23621Ds, i);
            case 26:
                obj6 = this.A02;
                i3 = 26;
                return new MCJ(obj6, interfaceC23621Ds, i3);
            case 27:
                obj6 = this.A02;
                i3 = 27;
                return new MCJ(obj6, interfaceC23621Ds, i3);
            case 28:
                obj6 = this.A02;
                i3 = 28;
                return new MCJ(obj6, interfaceC23621Ds, i3);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                obj4 = this.A02;
                obj5 = this.A01;
                i2 = 29;
                return new MCJ(obj5, obj4, interfaceC23621Ds, i2);
            case 30:
                obj4 = this.A02;
                obj5 = this.A01;
                i2 = 30;
                return new MCJ(obj5, obj4, interfaceC23621Ds, i2);
            case 31:
                obj2 = this.A01;
                obj3 = this.A02;
                i = 31;
                return new MCJ(obj2, obj3, interfaceC23621Ds, i);
            case 32:
                obj4 = this.A02;
                obj5 = this.A01;
                i2 = 32;
                return new MCJ(obj5, obj4, interfaceC23621Ds, i2);
            case 33:
                obj4 = this.A02;
                obj5 = this.A01;
                i2 = 33;
                return new MCJ(obj5, obj4, interfaceC23621Ds, i2);
            case 34:
                obj4 = this.A02;
                obj5 = this.A01;
                i2 = 34;
                return new MCJ(obj5, obj4, interfaceC23621Ds, i2);
            case 35:
                obj4 = this.A02;
                obj5 = this.A01;
                i2 = 35;
                return new MCJ(obj5, obj4, interfaceC23621Ds, i2);
            case 36:
                obj7 = this.A02;
                i4 = 36;
                MCJ mcj2222222222222 = new MCJ(obj7, interfaceC23621Ds, i4);
                mcj2222222222222.A01 = obj;
                return mcj2222222222222;
            case 37:
                obj4 = this.A02;
                obj5 = this.A01;
                i2 = 37;
                return new MCJ(obj5, obj4, interfaceC23621Ds, i2);
            case 38:
                obj4 = this.A02;
                obj5 = this.A01;
                i2 = 38;
                return new MCJ(obj5, obj4, interfaceC23621Ds, i2);
            case 39:
                obj4 = this.A02;
                obj5 = this.A01;
                i2 = 39;
                return new MCJ(obj5, obj4, interfaceC23621Ds, i2);
            case 40:
                obj7 = this.A02;
                i4 = 40;
                MCJ mcj22222222222222 = new MCJ(obj7, interfaceC23621Ds, i4);
                mcj22222222222222.A01 = obj;
                return mcj22222222222222;
            case Seq.NULL_REFNUM /* 41 */:
                obj4 = this.A02;
                obj5 = this.A01;
                i2 = 41;
                return new MCJ(obj5, obj4, interfaceC23621Ds, i2);
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                obj4 = this.A02;
                obj5 = this.A01;
                i2 = 42;
                return new MCJ(obj5, obj4, interfaceC23621Ds, i2);
            case 43:
                obj4 = this.A02;
                obj5 = this.A01;
                i2 = 43;
                return new MCJ(obj5, obj4, interfaceC23621Ds, i2);
            case 44:
                obj7 = this.A02;
                i4 = 44;
                MCJ mcj222222222222222 = new MCJ(obj7, interfaceC23621Ds, i4);
                mcj222222222222222.A01 = obj;
                return mcj222222222222222;
            case 45:
                obj4 = this.A02;
                obj5 = this.A01;
                i2 = 45;
                return new MCJ(obj5, obj4, interfaceC23621Ds, i2);
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                obj4 = this.A02;
                obj5 = this.A01;
                i2 = 46;
                return new MCJ(obj5, obj4, interfaceC23621Ds, i2);
            case 47:
                obj4 = this.A02;
                obj5 = this.A01;
                i2 = 47;
                return new MCJ(obj5, obj4, interfaceC23621Ds, i2);
            case 48:
                obj2 = this.A01;
                obj3 = this.A02;
                i = 48;
                return new MCJ(obj2, obj3, interfaceC23621Ds, i);
            default:
                obj7 = this.A02;
                i4 = 49;
                MCJ mcj2222222222222222 = new MCJ(obj7, interfaceC23621Ds, i4);
                mcj2222222222222222.A01 = obj;
                return mcj2222222222222222;
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0f02 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:610:0x0c06 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:613:0x0c24 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:646:0x0d01 A[RETURN] */
    /* JADX WARN: Type inference failed for: r0v392, types: [X.KDk, X.Ja5] */
    /* JADX WARN: Type inference failed for: r0v406, types: [X.KDk, X.Ja5] */
    /* JADX WARN: Type inference failed for: r2v36, types: [X.N8G, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v38, types: [X.N8G] */
    /* JADX WARN: Type inference failed for: r2v69, types: [X.N4m] */
    /* JADX WARN: Type inference failed for: r2v73, types: [X.N8H] */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v27, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:575:0x0b80 -> B:571:0x0b4c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:590:0x0bd1 -> B:586:0x0b9d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:605:0x0c22 -> B:601:0x0bee). Please report as a decompilation issue!!! */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            Method dump skipped, instructions count: 4034
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MCJ.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public static BrandedContentApi A01(Object obj, MCJ mcj) {
        AbstractC09560e7.A00(obj);
        return new BrandedContentApi(((AbstractC52114N4m) mcj.A02).A05());
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MCJ) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MCJ(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A03 = i;
        this.A02 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MCJ(Object obj, Object obj2, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A03 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }
}
