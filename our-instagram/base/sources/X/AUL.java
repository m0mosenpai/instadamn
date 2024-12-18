package X;

/* loaded from: classes4.dex */
public final class AUL implements InterfaceC58362lv {
    public final /* synthetic */ ViewOnTouchListenerC1829389o A00;

    public AUL(ViewOnTouchListenerC1829389o viewOnTouchListenerC1829389o) {
        this.A00 = viewOnTouchListenerC1829389o;
    }

    @Override // X.InterfaceC58362lv
    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        String str;
        EnumC1829089l enumC1829089l = (EnumC1829089l) obj;
        if (enumC1829089l == EnumC1829089l.A04) {
            ViewOnTouchListenerC1829389o viewOnTouchListenerC1829389o = this.A00;
            AbstractC172157lk abstractC172157lk = viewOnTouchListenerC1829389o.A05;
            if (abstractC172157lk != null) {
                str = abstractC172157lk.getTypeName();
            } else {
                str = null;
            }
            if ("HIDDEN".equals(str) && AbstractC166987dD.A1a(AbstractC166987dD.A17(viewOnTouchListenerC1829389o.A0T))) {
                return;
            }
            viewOnTouchListenerC1829389o.A08(enumC1829089l);
        }
    }
}
