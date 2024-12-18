package X;

import androidx.compose.ui.Modifier;
import com.facebook.R;

/* renamed from: X.Dc6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30523Dc6 extends C0YY implements InterfaceC16610sE {
    public final /* synthetic */ float A00;
    public final /* synthetic */ C6GC A01;
    public final /* synthetic */ boolean A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30523Dc6(C6GC c6gc, float f, boolean z) {
        super(3);
        this.A00 = f;
        this.A01 = c6gc;
        this.A02 = z;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C5Tl c5Tl = (C5Tl) obj2;
        if (AbstractC25228BEl.A0D(obj3) == 16 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-882345781, "com.instagram.compose.igds.components.button.IgdsButtonIcon.Chevron.inlineContent.<anonymous> (IgdsButton.kt:373)");
            }
            C5YS.A06(c5Tl, AbstractC25227BEk.A0K(AbstractC118185Wd.A0C(Modifier.A00, this.A00), 4.0f), AbstractC25227BEk.A0P(c5Tl, R.drawable.actionable_chevron_down), this.A01.AJo(this.A02));
            if (C0fH.A02()) {
                C0fH.A00(-1823661212);
            }
        }
        return C0eB.A00;
    }
}
