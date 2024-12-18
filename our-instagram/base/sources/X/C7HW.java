package X;

import com.instagram.direct.avatar.stickers.suggestions.DirectStickerSuggestionsController;

/* renamed from: X.7HW, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7HW implements C7H3 {
    public final InterfaceC16660sJ A00;
    public final InterfaceC160017Fn A01;
    public final InterfaceC16820sZ A02;

    @Override // X.C7H3
    public final boolean Cp3(String str, boolean z, boolean z2, boolean z3, boolean z4) {
        DirectStickerSuggestionsController directStickerSuggestionsController;
        C9CH c9ch;
        C148286ly c148286ly;
        if (!z || z2 || !z3 || z4 || (directStickerSuggestionsController = (DirectStickerSuggestionsController) this.A02.invoke()) == null || (c9ch = directStickerSuggestionsController.A0S) == null || (c148286ly = (C148286ly) c9ch.A02) == null) {
            return false;
        }
        InterfaceC160017Fn interfaceC160017Fn = this.A01;
        interfaceC160017Fn.FCD(c9ch, c148286ly, directStickerSuggestionsController, new C50171MDy(4, c9ch, this));
        interfaceC160017Fn.Cnr(C05F.A0C, true);
        return true;
    }

    public C7HW(InterfaceC160017Fn interfaceC160017Fn, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ) {
        this.A02 = interfaceC16820sZ;
        this.A01 = interfaceC160017Fn;
        this.A00 = interfaceC16660sJ;
    }
}
