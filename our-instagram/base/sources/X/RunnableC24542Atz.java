package X;

import com.facebook.cameracore.mediapipeline.services.instruction.InstructionServiceListenerWrapper;

/* renamed from: X.Atz, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24542Atz implements Runnable {
    public final /* synthetic */ InstructionServiceListenerWrapper A00;
    public final /* synthetic */ String A01;

    public RunnableC24542Atz(InstructionServiceListenerWrapper instructionServiceListenerWrapper, String str) {
        this.A00 = instructionServiceListenerWrapper;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C83W c83w = this.A00.mListener;
        if (c83w != null) {
            c83w.El0(this.A01);
        }
    }
}
