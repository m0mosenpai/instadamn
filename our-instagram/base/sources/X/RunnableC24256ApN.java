package X;

import com.facebook.cameracore.mediapipeline.services.instruction.InstructionServiceListenerWrapper;

/* renamed from: X.ApN, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24256ApN implements Runnable {
    public final /* synthetic */ InstructionServiceListenerWrapper A00;

    public RunnableC24256ApN(InstructionServiceListenerWrapper instructionServiceListenerWrapper) {
        this.A00 = instructionServiceListenerWrapper;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C83W c83w = this.A00.mListener;
        if (c83w != null) {
            c83w.CMb();
        }
    }
}
