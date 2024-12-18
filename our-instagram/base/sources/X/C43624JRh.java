package X;

import com.google.common.util.concurrent.ListenableFuture;

/* renamed from: X.JRh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43624JRh implements InterfaceC133315zy {
    public final int A00;
    public final Object A01;

    public C43624JRh(int i, InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = i;
        this.A01 = interfaceC16660sJ;
    }

    @Override // X.InterfaceC133315zy
    public final /* synthetic */ ListenableFuture ABq(Object obj) {
        return (ListenableFuture) ((InterfaceC16660sJ) this.A01).invoke(obj);
    }
}
