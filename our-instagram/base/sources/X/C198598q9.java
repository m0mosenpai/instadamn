package X;

import com.instagram.statemachine.ktx.StateMachineExtKt$asStatesExitedFlow$$inlined$filter$1$2;
import java.util.Collection;

/* renamed from: X.8q9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C198598q9 implements InterfaceC19390xP {
    public final /* synthetic */ Collection A00;
    public final /* synthetic */ InterfaceC19390xP A01;

    public C198598q9(Collection collection, InterfaceC19390xP interfaceC19390xP) {
        this.A01 = interfaceC19390xP;
        this.A00 = collection;
    }

    @Override // X.InterfaceC19390xP
    public final Object collect(InterfaceC19960yQ interfaceC19960yQ, InterfaceC23621Ds interfaceC23621Ds) {
        Object collect = this.A01.collect(new StateMachineExtKt$asStatesExitedFlow$$inlined$filter$1$2(this.A00, interfaceC19960yQ), interfaceC23621Ds);
        if (collect != C1JX.A02) {
            return C0eB.A00;
        }
        return collect;
    }
}
