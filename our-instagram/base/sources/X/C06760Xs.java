package X;

import com.facebook.common.dextricks.JITProfilePQR;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__CollectKt$launchIn$1", f = "Collect.kt", i = {}, l = {JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.0Xs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C06760Xs extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final /* synthetic */ InterfaceC19390xP A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06760Xs(InterfaceC23621Ds interfaceC23621Ds, InterfaceC19390xP interfaceC19390xP) {
        super(2, interfaceC23621Ds);
        this.A01 = interfaceC19390xP;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        return new C06760Xs(interfaceC23621Ds, this.A01);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C06760Xs) create(obj, (InterfaceC23621Ds) obj2)).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C1JX c1jx = C1JX.A02;
        if (this.A00 != 0) {
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            InterfaceC19390xP interfaceC19390xP = this.A01;
            this.A00 = 1;
            if (AbstractC18560vj.A01(this, interfaceC19390xP) == c1jx) {
                return c1jx;
            }
        }
        return C0eB.A00;
    }
}
