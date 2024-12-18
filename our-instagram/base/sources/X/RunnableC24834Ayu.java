package X;

import androidx.fragment.app.FragmentActivity;

/* renamed from: X.Ayu, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24834Ayu implements Runnable {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ C26025BfE A01;
    public final /* synthetic */ C166627cY A02;
    public final /* synthetic */ InterfaceC16820sZ A03;

    public RunnableC24834Ayu(FragmentActivity fragmentActivity, C26025BfE c26025BfE, C166627cY c166627cY, InterfaceC16820sZ interfaceC16820sZ) {
        this.A00 = fragmentActivity;
        this.A02 = c166627cY;
        this.A01 = c26025BfE;
        this.A03 = interfaceC16820sZ;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FragmentActivity fragmentActivity = this.A00;
        C166627cY c166627cY = this.A02;
        C26025BfE c26025BfE = this.A01;
        InterfaceC16820sZ interfaceC16820sZ = this.A03;
        if (c26025BfE.A0e) {
            c166627cY.A01.post(new RunnableC24744AxS(fragmentActivity, c166627cY, interfaceC16820sZ));
        }
    }
}
