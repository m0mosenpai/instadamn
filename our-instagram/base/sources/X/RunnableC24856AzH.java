package X;

import com.facebook.cameracore.mediapipeline.services.instruction.InstructionServiceListenerWrapper;
import java.util.List;

/* renamed from: X.AzH, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24856AzH implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ InstructionServiceListenerWrapper A01;
    public final /* synthetic */ List A02;
    public final /* synthetic */ List A03;
    public final /* synthetic */ List A04;

    public RunnableC24856AzH(InstructionServiceListenerWrapper instructionServiceListenerWrapper, List list, List list2, List list3, int i) {
        this.A01 = instructionServiceListenerWrapper;
        this.A00 = i;
        this.A03 = list;
        this.A04 = list2;
        this.A02 = list3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C83X c83x;
        C83W c83w = this.A01.mListener;
        if (c83w != null) {
            int i = this.A00;
            if (i >= 0 && i < C83X.values().length) {
                c83x = C83X.values()[i];
            } else {
                c83x = C83X.None;
            }
            c83w.EhG(c83x, this.A03, this.A04, this.A02);
        }
    }
}
