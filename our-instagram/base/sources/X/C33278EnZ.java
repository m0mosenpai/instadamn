package X;

import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import com.instagram.user.model.User;

/* renamed from: X.EnZ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33278EnZ extends ETP {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ GG0 A01;
    public final /* synthetic */ InterfaceC03960Jm A02;
    public final /* synthetic */ ProgressButton A03;
    public final /* synthetic */ User A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33278EnZ(UserSession userSession, UserSession userSession2, GG0 gg0, InterfaceC03960Jm interfaceC03960Jm, ProgressButton progressButton, User user, User user2) {
        super(userSession, null, user, "create", true);
        this.A01 = gg0;
        this.A03 = progressButton;
        this.A02 = interfaceC03960Jm;
        this.A04 = user2;
        this.A00 = userSession2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.Et3, java.lang.Object] */
    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(466735621);
        super.onFail(abstractC115105If);
        this.A03.setShowProgressBar(false);
        InterfaceC03960Jm interfaceC03960Jm = this.A02;
        EnumC33354Eon enumC33354Eon = EnumC33354Eon.A02;
        ?? obj = new Object();
        obj.A00 = enumC33354Eon;
        interfaceC03960Jm.AIn(obj);
        C0f9.A0A(1773368722, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(1410035177);
        super.onStart();
        ProgressButton progressButton = this.A03;
        progressButton.setShowProgressBar(true);
        progressButton.setEnabled(false);
        C0f9.A0A(-2071507073, A03);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.Et3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.Et3, java.lang.Object] */
    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(2011116256);
        EDR edr = (EDR) obj;
        int A032 = C0f9.A03(475154728);
        super.onSuccess(edr);
        this.A03.setShowProgressBar(false);
        boolean z = edr.A00().A0E;
        InterfaceC03960Jm interfaceC03960Jm = this.A02;
        if (z) {
            EnumC33354Eon enumC33354Eon = EnumC33354Eon.A03;
            ?? obj2 = new Object();
            obj2.A00 = enumC33354Eon;
            interfaceC03960Jm.AIn(obj2);
            if (!edr.A07) {
                User user = this.A04;
                UserSession userSession = this.A00;
                user.A0f(userSession);
                AbstractC166987dD.A10(userSession).A0g(userSession);
            }
        } else {
            EnumC33354Eon enumC33354Eon2 = EnumC33354Eon.A05;
            ?? obj3 = new Object();
            obj3.A00 = enumC33354Eon2;
            interfaceC03960Jm.AIn(obj3);
        }
        C0f9.A0A(1238472609, A032);
        C0f9.A0A(-2083657021, A03);
    }
}
