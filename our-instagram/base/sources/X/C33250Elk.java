package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.Elk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33250Elk extends AnonymousClass772 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C2Fb A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33250Elk(Context context, UserSession userSession, C2Fb c2Fb, Integer num, String str, String str2, String str3, String str4, int i) {
        super(Integer.valueOf(i));
        this.A03 = num;
        this.A01 = userSession;
        this.A06 = str;
        this.A07 = str2;
        this.A04 = str3;
        this.A00 = context;
        this.A05 = str4;
        this.A02 = c2Fb;
    }

    @Override // X.AnonymousClass772, android.text.style.ClickableSpan
    public final void onClick(View view) {
        Integer num = this.A03;
        if (num == C05F.A00) {
            new C7F3(this.A01).A09(this.A06);
        } else if (num == C05F.A01) {
            new C7F3(this.A01).A0A(this.A07, this.A04, this.A06);
        }
        AbstractC31177DnL.A0u(this.A00, this.A01, this.A02, this.A05);
    }
}
