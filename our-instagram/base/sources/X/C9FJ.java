package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.9FJ, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9FJ extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9FJ(C7MW c7mw, InterfaceC09390do interfaceC09390do, InterfaceC09390do interfaceC09390do2, int i) {
        super(0);
        this.A00 = i;
        this.A03 = c7mw;
        switch (i) {
            case 2:
            case 3:
            case 7:
                this.A01 = interfaceC09390do;
                this.A02 = interfaceC09390do2;
                break;
            case 4:
            case 5:
            case 6:
            default:
                this.A02 = interfaceC09390do;
                this.A01 = interfaceC09390do2;
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x01e8, code lost:
    
        if (X.C79453gs.A01(r5, r3, false) != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x024b, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, (X.AbstractC12990ll) r15.A03, 36324269294104630L) == false) goto L50;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC16820sZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            Method dump skipped, instructions count: 2394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9FJ.invoke():java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9FJ(int i, Object obj, Object obj2, Object obj3) {
        super(0);
        this.A00 = i;
        this.A02 = obj;
        this.A03 = obj2;
        this.A01 = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9FJ(InterfaceC09390do interfaceC09390do, InterfaceC09390do interfaceC09390do2, InterfaceC09390do interfaceC09390do3, int i) {
        super(0);
        this.A00 = i;
        switch (i) {
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case 14:
                this.A02 = interfaceC09390do;
                this.A01 = interfaceC09390do2;
                this.A03 = interfaceC09390do3;
                break;
            case Process.SIGTERM /* 15 */:
            case 16:
            case 17:
            case 18:
            case Process.SIGSTOP /* 19 */:
            default:
                this.A01 = interfaceC09390do;
                this.A03 = interfaceC09390do2;
                this.A02 = interfaceC09390do3;
                break;
            case 20:
                this.A02 = interfaceC09390do;
                this.A03 = interfaceC09390do2;
                this.A01 = interfaceC09390do3;
                break;
        }
    }
}
