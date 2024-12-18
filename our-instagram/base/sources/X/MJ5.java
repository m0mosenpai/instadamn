package X;

/* loaded from: classes8.dex */
public final class MJ5 extends C0YY implements InterfaceC16660sJ {
    public static final MJ5 A00 = new MJ5();

    public MJ5() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object A002 = AbstractC46599Kjc.A00(AbstractC25228BEl.A0R(obj), "mOnTouchListener");
        if (A002 instanceof ViewOnTouchListenerC51412Xo) {
            ViewOnTouchListenerC51412Xo viewOnTouchListenerC51412Xo = (ViewOnTouchListenerC51412Xo) A002;
            if (viewOnTouchListenerC51412Xo.A00 == null) {
                return null;
            }
            return viewOnTouchListenerC51412Xo;
        }
        return A002;
    }
}
