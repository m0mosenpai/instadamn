package X;

import android.view.ViewTreeObserver;
import com.instagram.interactive.translations.TranslatedCaptionsStickerViewBinder$Holder;

/* renamed from: X.ATj, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC23274ATj implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ float A00;
    public final /* synthetic */ TranslatedCaptionsStickerViewBinder$Holder A01;
    public final /* synthetic */ C84823qW A02;

    public ViewTreeObserverOnGlobalLayoutListenerC23274ATj(TranslatedCaptionsStickerViewBinder$Holder translatedCaptionsStickerViewBinder$Holder, C84823qW c84823qW, float f) {
        this.A01 = translatedCaptionsStickerViewBinder$Holder;
        this.A02 = c84823qW;
        this.A00 = f;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        TranslatedCaptionsStickerViewBinder$Holder translatedCaptionsStickerViewBinder$Holder = this.A01;
        C4ZT A02 = TranslatedCaptionsStickerViewBinder$Holder.A02(translatedCaptionsStickerViewBinder$Holder);
        if (A02.A00()) {
            AbstractC166997dE.A1K(TranslatedCaptionsStickerViewBinder$Holder.A00(translatedCaptionsStickerViewBinder$Holder), this);
            TranslatedCaptionsStickerViewBinder$Holder.A04(A02, translatedCaptionsStickerViewBinder$Holder, this.A02, this.A00);
        }
    }
}
