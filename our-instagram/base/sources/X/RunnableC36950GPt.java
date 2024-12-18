package X;

import android.widget.EditText;
import com.instagram.user.model.User;

/* renamed from: X.GPt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36950GPt implements Runnable {
    public C0SG A00;
    public ED3 A01;
    public final /* synthetic */ EUE A02;

    public RunnableC36950GPt(C0SG c0sg, EUE eue, ED3 ed3) {
        this.A02 = eue;
        this.A01 = ed3;
        this.A00 = c0sg;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, X.1vN] */
    @Override // java.lang.Runnable
    public final void run() {
        C0SG c0sg = this.A00;
        if (c0sg != null) {
            c0sg.A0B(AbstractC31174DnI.A0I(this.A02.A00), "feedbackDialog");
        }
        if (this.A01.A02) {
            EK2 ek2 = this.A02.A00;
            User A10 = AbstractC166987dD.A10(ek2.A01);
            A10.A0Y();
            AbstractC31172DnG.A1R(ek2.A01, A10);
            AbstractC25651Mw.A00(ek2.A01).E4s(new Object());
            C25671My A00 = AbstractC25651Mw.A00(ek2.A01);
            String id = A10.getId();
            EditText editText = ek2.A00;
            editText.getClass();
            A00.E4s(new C36100Fwa(id, AbstractC167007dF.A0g(editText)));
            AbstractC25226BEj.A1Q(ek2);
        }
    }
}
