package X;

import java.util.function.BiConsumer;

/* renamed from: X.B1o, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24940B1o implements BiConsumer {
    public final int A00;
    public final Object A01;

    public C24940B1o(InterfaceC16620sF interfaceC16620sF, int i) {
        this.A00 = i;
        this.A01 = interfaceC16620sF;
    }

    @Override // java.util.function.BiConsumer
    public final /* synthetic */ void accept(Object obj, Object obj2) {
        ((InterfaceC16620sF) this.A01).invoke(obj, obj2);
    }
}
