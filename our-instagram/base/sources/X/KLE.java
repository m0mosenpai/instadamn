package X;

import android.view.View;
import com.instagram.creation.capture.assetpicker.cutout.CutoutStickerCreationController$genericCutoutAiProcessorExceptionHandler$$inlined$CoroutineExceptionHandler$1;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes8.dex */
public final class KLE extends AbstractViewOnClickListenerC13340mK {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C48591LeT A01;
    public final /* synthetic */ IgdsMediaButton A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KLE(View view, C48591LeT c48591LeT, IgdsMediaButton igdsMediaButton) {
        super(500L);
        this.A02 = igdsMediaButton;
        this.A01 = c48591LeT;
        this.A00 = view;
    }

    @Override // X.AbstractViewOnClickListenerC13340mK
    public final void A00(View view) {
        this.A02.setEnabled(false);
        C48591LeT c48591LeT = this.A01;
        C48591LeT.A01(c48591LeT);
        if (c48591LeT.A0D != C05F.A15 && AbstractC31178DnM.A1a(c48591LeT.A0Y)) {
            C57312k6 c57312k6 = c48591LeT.A0N;
            AbstractC23641Du.A01(C05F.A00, new CutoutStickerCreationController$genericCutoutAiProcessorExceptionHandler$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key, c48591LeT, new MHQ(c48591LeT, 11)), new B5g(this.A00, c48591LeT, null, 11), c57312k6);
            return;
        }
        AbstractC23641Du.A05(new CutoutStickerCreationController$genericCutoutAiProcessorExceptionHandler$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key, c48591LeT, new MHQ(c48591LeT, 12)), new B5g(this.A00, c48591LeT, null, 12), c48591LeT.A0N);
    }
}
