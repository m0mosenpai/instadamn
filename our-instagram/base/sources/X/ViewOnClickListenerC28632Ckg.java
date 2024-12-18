package X;

import android.view.View;
import com.instagram.interactive.translations.TranslatedCaptionsStickerViewBinder$Holder;

/* renamed from: X.Ckg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ViewOnClickListenerC28632Ckg implements View.OnClickListener {
    public final /* synthetic */ TranslatedCaptionsStickerViewBinder$Holder A00;
    public final /* synthetic */ InterfaceC97454Zf A01;
    public final /* synthetic */ InterfaceC41201vU A02;

    public ViewOnClickListenerC28632Ckg(TranslatedCaptionsStickerViewBinder$Holder translatedCaptionsStickerViewBinder$Holder, InterfaceC97454Zf interfaceC97454Zf, InterfaceC41201vU interfaceC41201vU) {
        this.A01 = interfaceC97454Zf;
        this.A02 = interfaceC41201vU;
        this.A00 = translatedCaptionsStickerViewBinder$Holder;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(1916395680);
        InterfaceC97454Zf interfaceC97454Zf = this.A01;
        C14360o3.A0A(view);
        interfaceC97454Zf.DvW(view, this.A00, this.A02);
        C0f9.A0C(-1311104578, A05);
    }
}
