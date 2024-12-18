package X;

import android.os.Bundle;
import com.instagram.debug.devoptions.signalsplayground.view.CreatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder;
import com.instagram.modal.ModalActivity;

/* renamed from: X.IqB, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42408IqB implements CreatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder.Delegate {
    public final /* synthetic */ C41161IKa A00;

    @Override // com.instagram.debug.devoptions.signalsplayground.view.CreatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder.Delegate
    public final void onViewAudioDetailsClick(HYM hym) {
        C14360o3.A0B(hym, 0);
        Bundle A02 = AbstractC86593tX.A02(null, null, hym.A00, AbstractC166997dE.A0n());
        C14360o3.A07(A02);
        C41161IKa c41161IKa = this.A00;
        AbstractC25228BEl.A1G(c41161IKa.A01, A02, c41161IKa.A04, ModalActivity.class, "audio_page");
    }

    public C42408IqB(C41161IKa c41161IKa) {
        this.A00 = c41161IKa;
    }
}
