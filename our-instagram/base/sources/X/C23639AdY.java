package X;

/* renamed from: X.AdY, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23639AdY implements AnonymousClass822 {
    public final /* synthetic */ ViewOnTouchListenerC1829389o A00;

    public C23639AdY(ViewOnTouchListenerC1829389o viewOnTouchListenerC1829389o) {
        this.A00 = viewOnTouchListenerC1829389o;
    }

    @Override // X.AnonymousClass822
    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        java.util.Set set = (java.util.Set) obj;
        C14360o3.A0B(set, 0);
        ViewOnTouchListenerC1829389o viewOnTouchListenerC1829389o = this.A00;
        if (!A0G.A00(viewOnTouchListenerC1829389o.A04, set)) {
            viewOnTouchListenerC1829389o.A07(viewOnTouchListenerC1829389o.A0K.A02());
        }
    }
}
