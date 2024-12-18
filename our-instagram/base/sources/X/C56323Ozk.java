package X;

import com.instagram.reels.prompt.model.PromptStickerModel;
import instagram.features.stories.fragment.ReelViewerFragment;

/* renamed from: X.Ozk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56323Ozk implements MQS {
    public final /* synthetic */ C145826hf A00;
    public final /* synthetic */ InterfaceC1118853a A01;
    public final /* synthetic */ PromptStickerModel A02;

    public C56323Ozk(C145826hf c145826hf, InterfaceC1118853a interfaceC1118853a, PromptStickerModel promptStickerModel) {
        this.A01 = interfaceC1118853a;
        this.A02 = promptStickerModel;
        this.A00 = c145826hf;
    }

    @Override // X.MQS
    public final void CmB() {
        C41551w4 c41551w4;
        InterfaceC1118853a interfaceC1118853a = this.A01;
        if (interfaceC1118853a != null && (c41551w4 = ((ReelViewerFragment) interfaceC1118853a).A0a) != null) {
            PromptStickerModel promptStickerModel = this.A02;
            C145826hf c145826hf = this.A00;
            if (promptStickerModel.A0A && c145826hf != null) {
                c145826hf.A0O(c41551w4, "memu_bottom_sheet_create_new_button");
                c145826hf.A0O(c41551w4, "memu_bottom_sheet_add_yours_button");
            }
        }
    }

    @Override // X.MQS
    public final void CmC(boolean z) {
        C41551w4 c41551w4;
        String str;
        InterfaceC1118853a interfaceC1118853a = this.A01;
        if (interfaceC1118853a != null && (c41551w4 = ((ReelViewerFragment) interfaceC1118853a).A0a) != null) {
            PromptStickerModel promptStickerModel = this.A02;
            C145826hf c145826hf = this.A00;
            if (promptStickerModel.A0B) {
                if (z) {
                    str = "memu_bottom_sheet_create_new_button";
                } else {
                    str = "memu_bottom_sheet_add_yours_button";
                }
                if (c145826hf != null) {
                    c145826hf.A0Q(c41551w4, null, str, 0.0f, 0.0f);
                }
            }
        }
    }

    @Override // X.MQS
    public final void CmF() {
        C41551w4 c41551w4;
        C145826hf c145826hf;
        InterfaceC1118853a interfaceC1118853a = this.A01;
        if (interfaceC1118853a != null && (c41551w4 = ((ReelViewerFragment) interfaceC1118853a).A0a) != null && (c145826hf = this.A00) != null) {
            c145826hf.A0O(c41551w4, "imagine_feature_not_available_sheet");
        }
    }
}
