package X;

/* renamed from: X.GRx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C37005GRx implements InterfaceC14180ni, InterfaceC19960yQ {
    public final int A00;
    public final Object A01;

    public C37005GRx(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:147:0x01e5, code lost:
    
        if (r1 == 2) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x0375, code lost:
    
        if (r0 != false) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x024f, code lost:
    
        if (r12.A05 == null) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0242, code lost:
    
        if (r9.getVisibility() != 4) goto L150;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0205 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0226  */
    @Override // X.InterfaceC19960yQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object r12, X.InterfaceC23621Ds r13) {
        /*
            Method dump skipped, instructions count: 926
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37005GRx.emit(java.lang.Object, X.1Ds):java.lang.Object");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC19960yQ) || !(obj instanceof InterfaceC14180ni)) {
            return false;
        }
        return C14360o3.A0K(getFunctionDelegate(), ((InterfaceC14180ni) obj).getFunctionDelegate());
    }

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
                cls = C34630FNn.class;
                i = 2;
                str = "updateState";
                str2 = "updateState(Lcom/instagram/direct/fragment/sharesheet/viewmodel/ShareSheetMessageComposerViewModel$UiState;)V";
                break;
            case 1:
                cls = C34630FNn.class;
                i = 2;
                str = "updateSendButton";
                str2 = "updateSendButton(Lcom/instagram/direct/fragment/sharesheet/viewmodel/ShareSheetMessageComposerViewModel$UiState$SendButtonState;)V";
                break;
            case 2:
                cls = C34630FNn.class;
                i = 2;
                str = "updateSuggestedPrompts";
                str2 = "updateSuggestedPrompts(Lcom/instagram/direct/fragment/sharesheet/viewmodel/ShareSheetMessageComposerViewModel$UiState$SuggestedPromptState;)V";
                break;
            case 3:
                cls = C32285EJx.class;
                i = 2;
                str = "updateUiState";
                str2 = "updateUiState(Lcom/meta/metaai/components/voice/uistate/MetaAiVoiceSessionUiState;)V";
                break;
            default:
                cls = C32285EJx.class;
                i = 2;
                str = AbstractC43591JPw.A00(1018);
                str2 = "handleUiEffect(Lcom/meta/metaai/components/voice/uieffect/MetaAIMultimodalComponentUIEffect;)V";
                break;
        }
        return new C06840Yb(i, obj, cls, str, str2, 4);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
