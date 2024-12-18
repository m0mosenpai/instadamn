package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.direct.securityalert.data.SecurityAlertLocalDataSource;
import com.instagram.react.modules.base.IgReactQEModule;

/* loaded from: classes8.dex */
public final class MBs extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public long A01;
    public final int A02;
    public final Object A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MBs(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A02 = i;
        this.A03 = obj;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Object obj2;
        int i;
        Object obj3;
        long j;
        int i2;
        switch (this.A02) {
            case 0:
                obj3 = this.A03;
                j = this.A01;
                i2 = 0;
                return new MBs(obj3, interfaceC23621Ds, i2, j);
            case 1:
                obj3 = this.A03;
                j = this.A01;
                i2 = 1;
                return new MBs(obj3, interfaceC23621Ds, i2, j);
            case 2:
                obj3 = this.A03;
                j = this.A01;
                i2 = 2;
                return new MBs(obj3, interfaceC23621Ds, i2, j);
            case 3:
                obj3 = this.A03;
                j = this.A01;
                i2 = 3;
                return new MBs(obj3, interfaceC23621Ds, i2, j);
            case 4:
                j = this.A01;
                obj3 = this.A03;
                i2 = 4;
                return new MBs(obj3, interfaceC23621Ds, i2, j);
            case 5:
                j = this.A01;
                obj3 = this.A03;
                i2 = 5;
                return new MBs(obj3, interfaceC23621Ds, i2, j);
            case 6:
                j = this.A01;
                obj3 = this.A03;
                i2 = 6;
                return new MBs(obj3, interfaceC23621Ds, i2, j);
            case 7:
                obj3 = this.A03;
                j = this.A01;
                i2 = 7;
                return new MBs(obj3, interfaceC23621Ds, i2, j);
            case 8:
                obj3 = this.A03;
                j = this.A01;
                i2 = 8;
                return new MBs(obj3, interfaceC23621Ds, i2, j);
            case 9:
                j = this.A01;
                obj3 = this.A03;
                i2 = 9;
                return new MBs(obj3, interfaceC23621Ds, i2, j);
            case 10:
                obj3 = this.A03;
                j = this.A01;
                i2 = 10;
                return new MBs(obj3, interfaceC23621Ds, i2, j);
            case 11:
                obj2 = this.A03;
                i = 11;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                j = this.A01;
                obj3 = this.A03;
                i2 = 12;
                return new MBs(obj3, interfaceC23621Ds, i2, j);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                j = this.A01;
                obj3 = this.A03;
                i2 = 13;
                return new MBs(obj3, interfaceC23621Ds, i2, j);
            case 14:
                j = this.A01;
                obj3 = this.A03;
                i2 = 14;
                return new MBs(obj3, interfaceC23621Ds, i2, j);
            case Process.SIGTERM /* 15 */:
                obj2 = this.A03;
                i = 15;
                break;
            case 16:
                obj3 = this.A03;
                j = this.A01;
                i2 = 16;
                return new MBs(obj3, interfaceC23621Ds, i2, j);
            case 17:
                obj3 = this.A03;
                j = this.A01;
                i2 = 17;
                return new MBs(obj3, interfaceC23621Ds, i2, j);
            case 18:
                return new MBs((SecurityAlertLocalDataSource) this.A03, interfaceC23621Ds, this.A00, this.A01);
            case Process.SIGSTOP /* 19 */:
                obj2 = this.A03;
                i = 19;
                break;
            case 20:
                obj3 = this.A03;
                j = this.A01;
                i2 = 20;
                return new MBs(obj3, interfaceC23621Ds, i2, j);
            case 21:
                obj3 = this.A03;
                j = this.A01;
                i2 = 21;
                return new MBs(obj3, interfaceC23621Ds, i2, j);
            case 22:
                j = this.A01;
                obj3 = this.A03;
                i2 = 22;
                return new MBs(obj3, interfaceC23621Ds, i2, j);
            case 23:
                j = this.A01;
                obj3 = this.A03;
                i2 = 23;
                return new MBs(obj3, interfaceC23621Ds, i2, j);
            case 24:
                obj3 = this.A03;
                j = this.A01;
                i2 = 24;
                return new MBs(obj3, interfaceC23621Ds, i2, j);
            case 25:
                obj3 = this.A03;
                j = this.A01;
                i2 = 25;
                return new MBs(obj3, interfaceC23621Ds, i2, j);
            default:
                obj3 = this.A03;
                j = this.A01;
                i2 = 26;
                return new MBs(obj3, interfaceC23621Ds, i2, j);
        }
        return new MBs(obj2, interfaceC23621Ds, i);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:261:0x057b A[RETURN] */
    /* JADX WARN: Type inference failed for: r5v17, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:193:0x045c -> B:187:0x03fb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:231:0x051b -> B:229:0x04fa). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:252:0x0579 -> B:250:0x056c). Please report as a decompilation issue!!! */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r36) {
        /*
            Method dump skipped, instructions count: 1760
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MBs.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MBs) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MBs(SecurityAlertLocalDataSource securityAlertLocalDataSource, InterfaceC23621Ds interfaceC23621Ds, int i, long j) {
        super(2, interfaceC23621Ds);
        this.A02 = 18;
        this.A03 = securityAlertLocalDataSource;
        this.A01 = j;
        this.A00 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MBs(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i, long j) {
        super(2, interfaceC23621Ds);
        this.A02 = i;
        this.A01 = j;
        this.A03 = obj;
    }
}
