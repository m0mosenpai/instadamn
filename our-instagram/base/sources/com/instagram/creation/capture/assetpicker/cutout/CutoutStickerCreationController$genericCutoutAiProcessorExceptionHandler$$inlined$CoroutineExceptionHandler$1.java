package com.instagram.creation.capture.assetpicker.cutout;

import X.AbstractC166997dE;
import X.C12U;
import X.C12W;
import X.C3E9;
import X.C47806L9o;
import X.C48591LeT;
import X.InterfaceC16820sZ;
import X.LH3;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes8.dex */
public final class CutoutStickerCreationController$genericCutoutAiProcessorExceptionHandler$$inlined$CoroutineExceptionHandler$1 extends C12U implements CoroutineExceptionHandler {
    public final /* synthetic */ InterfaceC16820sZ $actionButtonHandler$inlined;
    public final /* synthetic */ C48591LeT this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CutoutStickerCreationController$genericCutoutAiProcessorExceptionHandler$$inlined$CoroutineExceptionHandler$1(C3E9 c3e9, C48591LeT c48591LeT, InterfaceC16820sZ interfaceC16820sZ) {
        super(c3e9);
        this.this$0 = c48591LeT;
        this.$actionButtonHandler$inlined = interfaceC16820sZ;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(C12W c12w, Throwable th) {
        IgdsMediaButton igdsMediaButton = this.this$0.A0C;
        if (igdsMediaButton != null) {
            igdsMediaButton.setEnabled(false);
        }
        IgdsMediaButton igdsMediaButton2 = this.this$0.A07;
        if (igdsMediaButton2 != null) {
            igdsMediaButton2.setEnabled(false);
        }
        C47806L9o c47806L9o = this.this$0.A05;
        if (c47806L9o != null) {
            c47806L9o.A01();
        }
        LH3.A01(this.this$0.A0I, AbstractC166997dE.A0y("CutoutStickerCreationController: error during image processing: cause ", th), "Error while ai processing", this.$actionButtonHandler$inlined, 2131972568);
    }
}
