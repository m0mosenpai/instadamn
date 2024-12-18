package com.instagram.debug.devoptions.signalsplayground.viewmodel;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C19L;
import X.C1JX;
import X.InterfaceC06180Ui;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel$performFeedbackButtonAction$2", f = "CreatorInspirationSignalsPlaygroundRecommendationsViewModel.kt", i = {}, l = {151}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
public final class CreatorInspirationSignalsPlaygroundRecommendationsViewModel$performFeedbackButtonAction$2 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int label;
    public final /* synthetic */ CreatorInspirationSignalsPlaygroundRecommendationsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreatorInspirationSignalsPlaygroundRecommendationsViewModel$performFeedbackButtonAction$2(CreatorInspirationSignalsPlaygroundRecommendationsViewModel creatorInspirationSignalsPlaygroundRecommendationsViewModel, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.this$0 = creatorInspirationSignalsPlaygroundRecommendationsViewModel;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        return new CreatorInspirationSignalsPlaygroundRecommendationsViewModel$performFeedbackButtonAction$2(this.this$0, interfaceC23621Ds);
    }

    @Override // X.InterfaceC16620sF
    public final Object invoke(C19L c19l, InterfaceC23621Ds interfaceC23621Ds) {
        return new CreatorInspirationSignalsPlaygroundRecommendationsViewModel$performFeedbackButtonAction$2(this.this$0, interfaceC23621Ds).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C1JX c1jx = C1JX.A02;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                AbstractC09560e7.A00(obj);
            } else {
                throw AbstractC166987dD.A13();
            }
        } else {
            AbstractC09560e7.A00(obj);
            InterfaceC06180Ui interfaceC06180Ui = this.this$0._viewEffect;
            CreatorInspirationSignalsPlaygroundRecommendationsViewModel.ViewEffect.FeedbackComplete feedbackComplete = CreatorInspirationSignalsPlaygroundRecommendationsViewModel.ViewEffect.FeedbackComplete.INSTANCE;
            this.label = 1;
            if (interfaceC06180Ui.emit(feedbackComplete, this) == c1jx) {
                return c1jx;
            }
        }
        return C0eB.A00;
    }
}
