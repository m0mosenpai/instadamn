package X;

import android.os.Bundle;
import com.facebook.cameracore.mediapipeline.services.instruction.InstructionServiceListenerWrapper;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Aoj, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24217Aoj implements BE4 {
    public InstructionServiceListenerWrapper A00;

    @Override // X.BE4
    public final void FB5(Bundle bundle) {
        String string;
        InstructionServiceListenerWrapper instructionServiceListenerWrapper;
        String string2;
        InstructionServiceListenerWrapper instructionServiceListenerWrapper2;
        ArrayList<Integer> arrayList;
        ArrayList<Integer> arrayList2;
        C14360o3.A0B(bundle, 0);
        if (this.A00 != null && bundle.containsKey("commandType")) {
            int i = bundle.getInt("commandType");
            if (i == 0) {
                if (bundle.containsKey("autoInstructionType")) {
                    int i2 = bundle.getInt("autoInstructionType");
                    if (bundle.containsKey(IgReactMediaPickerNativeModule.WIDTH)) {
                        arrayList = bundle.getIntegerArrayList(IgReactMediaPickerNativeModule.WIDTH);
                    } else {
                        arrayList = null;
                    }
                    if (bundle.containsKey(IgReactMediaPickerNativeModule.HEIGHT)) {
                        arrayList2 = bundle.getIntegerArrayList(IgReactMediaPickerNativeModule.HEIGHT);
                    } else {
                        arrayList2 = null;
                    }
                    InstructionServiceListenerWrapper instructionServiceListenerWrapper3 = this.A00;
                    if (instructionServiceListenerWrapper3 != null) {
                        instructionServiceListenerWrapper3.setVisibleAutomaticInstruction(i2, null, arrayList, arrayList2);
                        return;
                    }
                    return;
                }
                return;
            }
            if (i == 1) {
                InstructionServiceListenerWrapper instructionServiceListenerWrapper4 = this.A00;
                if (instructionServiceListenerWrapper4 == null) {
                    return;
                }
                instructionServiceListenerWrapper4.hideInstruction();
                return;
            }
            if (i == 2) {
                if (!bundle.containsKey("token") || (string2 = bundle.getString("token")) == null || (instructionServiceListenerWrapper2 = this.A00) == null) {
                    return;
                }
                instructionServiceListenerWrapper2.showInstructionForToken(string2);
                return;
            }
            if (i != 3 || !bundle.containsKey("text") || (string = bundle.getString("text")) == null || (instructionServiceListenerWrapper = this.A00) == null) {
                return;
            }
            instructionServiceListenerWrapper.showInstructionWithCustomText(string);
        }
    }

    @Override // X.BE4
    public final Bundle BHd() {
        return AbstractC167027dH.A08(38);
    }

    @Override // X.BE4
    public final void CO6(AnonymousClass904 anonymousClass904) {
        InstructionServiceListenerWrapper instructionServiceListenerWrapper;
        if (anonymousClass904 != null) {
            C203848zt c203848zt = AnonymousClass909.A01;
            if (AnonymousClass904.A01(anonymousClass904, c203848zt)) {
                AnonymousClass909 anonymousClass909 = (AnonymousClass909) anonymousClass904.A02(c203848zt);
                if (anonymousClass909 != null) {
                    instructionServiceListenerWrapper = anonymousClass909.A00;
                } else {
                    instructionServiceListenerWrapper = null;
                }
                this.A00 = instructionServiceListenerWrapper;
            }
        }
    }

    @Override // X.BE4
    public final List Epn() {
        return AbstractC166987dD.A1J(AbstractC167027dH.A08(38));
    }
}
