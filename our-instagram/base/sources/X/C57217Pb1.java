package X;

import java.util.Collection;
import java.util.List;

/* renamed from: X.Pb1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C57217Pb1 extends C03E implements InterfaceC16660sJ {
    public final /* synthetic */ C14510oO A00;
    public final /* synthetic */ C15370ps A01;
    public final /* synthetic */ C15370ps A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57217Pb1(C14510oO c14510oO, C15370ps c15370ps, C15370ps c15370ps2) {
        super(1, C0o2.class, "subscribe", "createStore$subscribe(Lkotlin/jvm/internal/Ref$BooleanRef;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/internal/Ref$ObjectRef;Lkotlin/jvm/functions/Function0;)Lkotlin/jvm/functions/Function0;", 0);
        this.A00 = c14510oO;
        this.A02 = c15370ps;
        this.A01 = c15370ps2;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [X.0oO, java.lang.Object] */
    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C14360o3.A0B(obj, 0);
        C14510oO c14510oO = this.A00;
        C15370ps c15370ps = this.A02;
        C15370ps c15370ps2 = this.A01;
        if (!c14510oO.A00) {
            ?? obj2 = new Object();
            obj2.A00 = true;
            Object obj3 = c15370ps.A00;
            Object obj4 = c15370ps2.A00;
            if (obj3 == obj4) {
                obj3 = AbstractC001800i.A0U((Collection) obj4);
                c15370ps.A00 = obj3;
            }
            ((List) obj3).add(obj);
            return new MEB(48, c15370ps2, c14510oO, c15370ps, obj, obj2);
        }
        throw AbstractC166987dD.A14("You may not call store.subscribe() while the reducer is executing.\nIf you would like to be notified after the store has been updated, \nsubscribe from a component and invoke store.getState() in the \ncallback to access the latest state. See \nhttps://www.reduxkotlin.org/api/store#subscribelistener-storesubscriber\nfor more details.\nYou may be seeing this due accessing the store from multiplethreads.\nTry createThreadSafeStore()\nhttps://reduxkotlin.org/introduction/threading");
    }
}
