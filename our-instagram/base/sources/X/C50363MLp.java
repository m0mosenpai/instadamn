package X;

import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.List;

/* renamed from: X.MLp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C50363MLp extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50363MLp(int i, Object obj, Object obj2) {
        super(1);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:155:0x0591, code lost:
    
        if (r4 != X.C81613kW.A07) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e6, code lost:
    
        if (((X.C49593Lvm) r18.A02).A0Q.get() == false) goto L51;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x06d7  */
    /* JADX WARN: Type inference failed for: r12v3, types: [com.facebook.msys.mca.MailboxFeature, X.66g] */
    @Override // X.InterfaceC16660sJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 2028
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50363MLp.invoke(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50363MLp(int i, List list, InterfaceC16660sJ interfaceC16660sJ) {
        super(1);
        this.A00 = i;
        switch (i) {
            case 1:
            case 10:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case Process.SIGSTOP /* 19 */:
                this.A02 = interfaceC16660sJ;
                this.A01 = list;
                break;
            default:
                this.A01 = interfaceC16660sJ;
                this.A02 = list;
                break;
        }
    }
}
