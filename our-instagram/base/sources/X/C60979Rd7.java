package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.instagram.modal.ModalActivity;

/* renamed from: X.Rd7, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60979Rd7 extends AnonymousClass522 {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ Bundle A01;
    public final /* synthetic */ C5G6 A02;
    public final /* synthetic */ SZO A03;
    public final /* synthetic */ boolean A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C60979Rd7(Activity activity, Bundle bundle, C5G6 c5g6, SZO szo, Integer num, boolean z) {
        super(num);
        this.A04 = z;
        this.A00 = activity;
        this.A03 = szo;
        this.A01 = bundle;
        this.A02 = c5g6;
    }

    @Override // X.AnonymousClass522, android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putBoolean("is_payment_enabled", this.A04);
        A0b.putBoolean("is_reconsent_enabled", true);
        C6XJ.A06(this.A00, A0b, ModalActivity.class, "save_autofill_learn_more");
        SZO szo = this.A03;
        if (szo != null) {
            AbstractC63402SjX.A0A(this.A01, this.A02, szo);
        }
    }
}
