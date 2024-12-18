package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.Elw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33262Elw extends AnonymousClass522 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ InterfaceC11380iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ String A04;

    @Override // X.AnonymousClass522, android.text.style.ClickableSpan
    public final void onClick(View view) {
        String A00;
        String A002;
        C14360o3.A0B(view, 0);
        UserSession userSession = this.A02;
        Integer num = this.A03;
        InterfaceC11380iw interfaceC11380iw = this.A01;
        String str = userSession.userId;
        C14360o3.A0B(str, 0);
        long A03 = AbstractC167027dH.A03(str);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "ig_nme_benefits");
        if (num.intValue() != 0) {
            A00 = "BIZ_MULTIPLE_ADDRESSES";
            A002 = "ig_profile_edit_address_list_page";
        } else {
            A00 = AbstractC111324zv.A00(3582);
            A002 = AbstractC111324zv.A00(997);
        }
        if (A0f.isSampled()) {
            A0f.AAP("event_type", "click");
            A0f.AAP("benefit_type", A00);
            A0f.AAP("subject_type", "subscriber");
            AbstractC31178DnM.A1B(A0f, "benefit_usage_attribution_entrypoint", A03);
            AbstractC31171DnF.A1E(A0f, A002);
            A0f.Cht();
        }
        new C63397SjR(this.A00, userSession, C2Fb.A1W, this.A04, false).A0A();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33262Elw(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, Integer num, String str, int i) {
        super(Integer.valueOf(i));
        this.A02 = userSession;
        this.A03 = num;
        this.A01 = interfaceC11380iw;
        this.A00 = context;
        this.A04 = str;
    }
}
