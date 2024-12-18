package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.KaF, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46058KaF extends AnonymousClass772 {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ L8C A01;
    public final /* synthetic */ String A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46058KaF(FragmentActivity fragmentActivity, L8C l8c, String str, int i) {
        super(Integer.valueOf(i));
        this.A01 = l8c;
        this.A00 = fragmentActivity;
        this.A02 = str;
    }

    @Override // X.AnonymousClass772, android.text.style.ClickableSpan
    public final void onClick(View view) {
        L8C l8c = this.A01;
        LKo.A01(this.A00, null, l8c.A07, null, l8c.A09, this.A02, false);
    }
}
