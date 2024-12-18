package X;

import android.text.Spannable;
import android.text.style.StyleSpan;
import java.util.Iterator;

/* renamed from: X.KLu, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45717KLu extends AbstractRunnableC14200nk {
    public final /* synthetic */ CharSequence A00;
    public final /* synthetic */ InterfaceC16660sJ A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45717KLu(CharSequence charSequence, InterfaceC16660sJ interfaceC16660sJ) {
        super(1175515869, 3, false, true);
        this.A00 = charSequence;
        this.A01 = interfaceC16660sJ;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Spannable.Factory factory = Spannable.Factory.getInstance();
        CharSequence charSequence = this.A00;
        Spannable newSpannable = factory.newSpannable(charSequence);
        String A0h = AbstractC167007dF.A0h(charSequence.toString());
        Iterator it = JUD.A00(AbstractC001800i.A0a(AbstractC23085AFr.A02), 32).iterator();
        boolean z = false;
        while (it.hasNext()) {
            String A1B = AbstractC166987dD.A1B(it);
            int A08 = AbstractC001900j.A08(A0h, A1B, 0, false);
            while (A08 != -1) {
                StyleSpan styleSpan = new StyleSpan(1);
                int length = A1B.length() + A08;
                newSpannable.setSpan(styleSpan, A08, length, 33);
                A08 = AbstractC001900j.A08(A0h, A1B, length, false);
                z = true;
            }
            if (z) {
                break;
            }
        }
        AbstractC167007dF.A0J().post(new M4D(newSpannable, this.A01));
    }
}
