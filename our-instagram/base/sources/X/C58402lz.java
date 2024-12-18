package X;

/* renamed from: X.2lz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C58402lz extends C03E implements InterfaceC16660sJ {
    public C58402lz(Object obj) {
        super(1, obj, AbstractC58112lT.class, "onNextBadgeValue", "onNextBadgeValue(Ljava/lang/String;)V", 0);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str = (String) obj;
        C14360o3.A0B(str, 0);
        AbstractC58112lT abstractC58112lT = (AbstractC58112lT) this.receiver;
        abstractC58112lT.setBadgeValue(str);
        if (abstractC58112lT.isAttachedToWindow()) {
            abstractC58112lT.getViewModel().A03();
        }
        return C0eB.A00;
    }
}
