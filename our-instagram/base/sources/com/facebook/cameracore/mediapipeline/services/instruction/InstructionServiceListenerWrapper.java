package com.facebook.cameracore.mediapipeline.services.instruction;

import X.C83W;
import X.RunnableC24256ApN;
import X.RunnableC24542Atz;
import X.RunnableC24543Au0;
import X.RunnableC24856AzH;
import android.os.Handler;
import android.os.Looper;
import java.util.List;

/* loaded from: classes4.dex */
public class InstructionServiceListenerWrapper {
    public final C83W mListener;
    public final Handler mUIHandler = new Handler(Looper.getMainLooper());

    public void setVisibleAutomaticInstruction(int i, List list, List list2, List list3) {
        this.mUIHandler.post(new RunnableC24856AzH(this, list, list2, list3, i));
    }

    public void hideInstruction() {
        this.mUIHandler.post(new RunnableC24256ApN(this));
    }

    public void showInstructionForToken(String str) {
        this.mUIHandler.post(new RunnableC24542Atz(this, str));
    }

    public void showInstructionWithCustomText(String str) {
        this.mUIHandler.post(new RunnableC24543Au0(this, str));
    }

    public InstructionServiceListenerWrapper(C83W c83w) {
        this.mListener = c83w;
    }
}
