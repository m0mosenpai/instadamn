package X;

/* loaded from: classes9.dex */
public final class MU4 implements InterfaceC14180ni, InterfaceC19960yQ {
    public final int A00;
    public final Object A01;

    public MU4(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x0315, code lost:
    
        if (X.C6XB.A00.A00(r14, r2) == false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00af, code lost:
    
        if (r5 > r8.length()) goto L29;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // X.InterfaceC19960yQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object r59, X.InterfaceC23621Ds r60) {
        /*
            Method dump skipped, instructions count: 2336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MU4.emit(java.lang.Object, X.1Ds):java.lang.Object");
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
                return new C03E(2, obj, InterfaceC58316Pt8.class, "send", "send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            case 1:
                cls = C148446mE.class;
                i = 2;
                str = "updateView";
                str2 = "updateView(Lcom/instagram/reels/comments/viewmodel/StoryCommentsViewModel$ViewState;)V";
                return new C06840Yb(i, obj, cls, str, str2, 4);
            case 2:
                cls = C148446mE.class;
                i = 2;
                str = "handleViewEffect";
                str2 = "handleViewEffect(Lcom/instagram/reels/comments/viewmodel/StoryCommentsViewModel$ViewEffect;)V";
                return new C06840Yb(i, obj, cls, str, str2, 4);
            case 3:
                cls = C54704OEg.class;
                i = 2;
                str = "updateState";
                str2 = "updateState(Lcom/instagram/stories/header/domain/StoriesHeaderViewModel$UiState;)V";
                return new C06840Yb(i, obj, cls, str, str2, 4);
            case 4:
                cls = OUU.class;
                i = 2;
                str = "updateState";
                str2 = "updateState(Lcom/instagram/stories/messagecomposer/domain/StoriesMessageComposerViewModel$UiState;)V";
                return new C06840Yb(i, obj, cls, str, str2, 4);
            case 5:
                cls = OUU.class;
                i = 2;
                str = "handleViewEffect";
                str2 = "handleViewEffect(Lcom/instagram/stories/messagecomposer/domain/StoriesMessageComposerViewModel$UiEffect;)V";
                return new C06840Yb(i, obj, cls, str, str2, 4);
            case 6:
                cls = OCM.class;
                i = 2;
                str = "updateState";
                str2 = "updateState(Lcom/instagram/stories/messagecomposer/domain/StoriesMessageComposerViewModel$UiState;)V";
                return new C06840Yb(i, obj, cls, str, str2, 4);
            case 7:
                cls = N5B.class;
                i = 2;
                str = "updateView";
                str2 = "updateView(Linstagram/features/stories/fragment/userlist/comments/viewmodel/StoryCommentLikesViewModel$ViewState;)V";
                return new C06840Yb(i, obj, cls, str, str2, 4);
            case 8:
                cls = N5B.class;
                i = 2;
                str = "handleViewEffect";
                str2 = "handleViewEffect(Linstagram/features/stories/fragment/userlist/comments/viewmodel/StoryCommentLikesViewModel$ViewEffect;)V";
                return new C06840Yb(i, obj, cls, str, str2, 4);
            case 9:
                cls = C52170N6z.class;
                i = 2;
                str = "updateView";
                str2 = "updateView(Linstagram/features/stories/fragment/userlist/comments/viewmodel/StoryCommentsDashboardViewModel$ViewState;)V";
                return new C06840Yb(i, obj, cls, str, str2, 4);
            default:
                cls = C52170N6z.class;
                i = 2;
                str = "handleViewEffect";
                str2 = "handleViewEffect(Linstagram/features/stories/fragment/userlist/comments/viewmodel/StoryCommentsDashboardViewModel$ViewEffect;)V";
                return new C06840Yb(i, obj, cls, str, str2, 4);
        }
    }

    public static C145006gL A00(C148446mE c148446mE) {
        return (C145006gL) C148446mE.A00(c148446mE).A0D.getValue();
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
