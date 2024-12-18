package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.NXw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52787NXw extends AnonymousClass522 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ InterfaceC57943Pmn A02;
    public final /* synthetic */ C131965xW A03;
    public final /* synthetic */ String A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52787NXw(Context context, FragmentActivity fragmentActivity, InterfaceC57943Pmn interfaceC57943Pmn, C131965xW c131965xW, String str, int i) {
        super(Integer.valueOf(i));
        this.A03 = c131965xW;
        this.A01 = fragmentActivity;
        this.A00 = context;
        this.A04 = str;
        this.A02 = interfaceC57943Pmn;
    }

    @Override // X.AnonymousClass522, android.text.style.ClickableSpan
    public final void onClick(View view) {
        C131965xW c131965xW = this.A03;
        FragmentActivity fragmentActivity = this.A01;
        Context context = this.A00;
        String str = this.A04;
        InterfaceC57943Pmn interfaceC57943Pmn = this.A02;
        C131975xX c131975xX = C131965xW.A05;
        c131965xW.A06(context, fragmentActivity, c131965xW.A02, interfaceC57943Pmn, str);
    }
}
