package X;

/* renamed from: X.Pav, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C57211Pav extends C03E implements InterfaceC16820sZ {
    public final /* synthetic */ C14510oO A00;
    public final /* synthetic */ C15370ps A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57211Pav(C14510oO c14510oO, C15370ps c15370ps) {
        super(0, C0o2.class, "getState", "createStore$getState(Lkotlin/jvm/internal/Ref$BooleanRef;Lkotlin/jvm/internal/Ref$ObjectRef;)Ljava/lang/Object;", 0);
        this.A00 = c14510oO;
        this.A01 = c15370ps;
    }

    @Override // X.InterfaceC16820sZ
    public final Object invoke() {
        C14510oO c14510oO = this.A00;
        C15370ps c15370ps = this.A01;
        if (!c14510oO.A00) {
            return c15370ps.A00;
        }
        throw AbstractC166987dD.A14("You may not call store.getState() while the reducer is executing.\nThe reducer has already received the state as an argument.\nPass it down from the top reducer instead of reading it from the \nstore.\nYou may be accessing getState while dispatching from another\nthread.  Try createThreadSafeStore().\nhttps://reduxkotlin.org/introduction/threading");
    }
}
