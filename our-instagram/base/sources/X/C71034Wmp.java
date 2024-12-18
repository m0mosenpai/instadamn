package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Wmp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71034Wmp implements InterfaceC673231x {
    public final InterfaceC43071ya A00;
    public final InterfaceC43071ya A01;

    @Override // X.InterfaceC673231x
    public final void ABh(C59072n8 c59072n8) {
    }

    @Override // X.InterfaceC673231x
    public final void ABj(C59072n8 c59072n8) {
        C14360o3.A0B(c59072n8, 0);
        c59072n8.A00(this.A00);
    }

    @Override // X.InterfaceC673231x
    public final void ABm(C59072n8 c59072n8) {
        C14360o3.A0B(c59072n8, 0);
        c59072n8.A00(this.A01);
    }

    public C71034Wmp(UserSession userSession, InterfaceC146336iW interfaceC146336iW) {
        C146736jB c146736jB = C142196bc.A08;
        this.A01 = c146736jB.A00(userSession, interfaceC146336iW, C05F.A00);
        this.A00 = c146736jB.A00(userSession, interfaceC146336iW, C05F.A01);
    }
}
