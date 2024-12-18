package X;

import android.os.Bundle;
import android.view.View;
import com.instagram.modal.ModalActivity;

/* renamed from: X.Rd6, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60978Rd6 extends AnonymousClass522 {
    public final /* synthetic */ QE8 A00;
    public final /* synthetic */ boolean A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C60978Rd6(QE8 qe8, Integer num, boolean z) {
        super(num);
        this.A00 = qe8;
        this.A01 = z;
    }

    @Override // X.AnonymousClass522, android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putBoolean("is_payment_enabled", this.A01);
        A0b.putBoolean("is_reconsent_enabled", false);
        C6XJ.A06(this.A00.requireActivity(), A0b, ModalActivity.class, "save_autofill_learn_more");
    }
}
