package X;

/* loaded from: classes5.dex */
public final class BUC implements InterfaceC14180ni, InterfaceC19960yQ {
    public final int A00;
    public final Object A01;

    public BUC(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x030c, code lost:
    
        if (((X.C28279CdO) ((X.AbstractC28375Cfd) r2).A03.getValue()).A09 != false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0179, code lost:
    
        if (r12.A02 == null) goto L10;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:145:0x0355. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03ec  */
    @Override // X.InterfaceC19960yQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object r29, X.InterfaceC23621Ds r30) {
        /*
            Method dump skipped, instructions count: 1234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BUC.emit(java.lang.Object, X.1Ds):java.lang.Object");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC19960yQ) || !(obj instanceof InterfaceC14180ni)) {
            return false;
        }
        return AbstractC167007dF.A1Y(obj, getFunctionDelegate());
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    @Override // X.InterfaceC14180ni
    public final InterfaceC09250da getFunctionDelegate() {
        Class cls;
        int i;
        String str;
        String str2;
        int i2 = this.A00;
        Object obj = this.A01;
        switch (i2) {
            case 0:
                cls = C32285EJx.class;
                i = 2;
                str = "handleAudioLevelEffect";
                str2 = "handleAudioLevelEffect(Lcom/meta/metaai/components/voice/uieffect/MetaAIVoiceAudioLevelEffect;)V";
                return new C06840Yb(i, obj, cls, str, str2, 4);
            case 1:
            case 2:
                return new C03E(2, obj, C0o2.class, "suspendConversion0", "invokeSuspend$suspendConversion0(Lkotlin/jvm/functions/Function1;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            case 3:
            case 4:
            default:
                cls = C27333C4o.class;
                i = 2;
                str = "handleNavigation";
                str2 = "handleNavigation(Lcom/meta/metaai/imagine/creation/impl/viewmodel/ImagineTopLevelNavigationState;)V";
                return new C06840Yb(i, obj, cls, str, str2, 4);
            case 5:
                cls = C27333C4o.class;
                i = 2;
                str = "handleCreationHeader";
                str2 = "handleCreationHeader(Lcom/meta/metaai/imagine/creation/impl/viewmodel/ImagineScreenNavigationState;)V";
                return new C06840Yb(i, obj, cls, str, str2, 4);
            case 6:
                cls = C27333C4o.class;
                i = 2;
                str = "handleFeedbackUiEffect";
                str2 = "handleFeedbackUiEffect(Lcom/meta/metaai/imagine/creation/impl/viewmodel/FeedbackUiEffect;)V";
                return new C06840Yb(i, obj, cls, str, str2, 4);
            case 7:
                cls = C27332C4n.class;
                i = 2;
                str = "handleNavigation";
                str2 = "handleNavigation(Lcom/meta/metaai/imagine/memu/impl/viewmodel/MEmuOnboardingNavigationState;)V";
                return new C06840Yb(i, obj, cls, str, str2, 4);
            case 8:
                cls = C27332C4n.class;
                i = 2;
                str = "handleBackgroundConfig";
                str2 = "handleBackgroundConfig(Lcom/meta/metaai/imagine/memu/impl/viewmodel/BackgroundConfig;)V";
                return new C06840Yb(i, obj, cls, str, str2, 4);
            case 9:
                cls = C27330C4l.class;
                i = 2;
                str = "updateBottomSheetConfig";
                str2 = "updateBottomSheetConfig(Lcom/meta/metaai/shared/litho/ui/bottomsheet/MetaAiBottomSheetConfig;)V";
                return new C06840Yb(i, obj, cls, str, str2, 4);
            case 10:
                cls = C27330C4l.class;
                i = 2;
                str = "handleUiUpdate";
                str2 = "handleUiUpdate(Lcom/meta/metaai/imagine/memu/impl/viewmodel/MEmuOnboardingUiState;)V";
                return new C06840Yb(i, obj, cls, str, str2, 4);
            case 11:
                cls = C27330C4l.class;
                i = 2;
                str = "handleBottomSheetAction";
                str2 = "handleBottomSheetAction(Lcom/meta/metaai/imagine/memu/impl/viewmodel/MEmuBottomSheetAction;)V";
                return new C06840Yb(i, obj, cls, str, str2, 4);
        }
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
