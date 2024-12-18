package X;

import android.view.LayoutInflater;
import android.view.View;

/* renamed from: X.Mkp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51266Mkp extends C3OO {
    public final C51384Mmk A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.2zJ, java.lang.Object] */
    public C51266Mkp(LayoutInflater layoutInflater, View view, C65921TwS c65921TwS, InterfaceC72020XFi interfaceC72020XFi) {
        super(view);
        AbstractC37302Gc3.A1U(c65921TwS, interfaceC72020XFi);
        C51384Mmk c51384Mmk = (C51384Mmk) view;
        this.A00 = c51384Mmk;
        if (c51384Mmk != null) {
            C66392zG c66392zG = new C66392zG(layoutInflater);
            c66392zG.A01(new NFB(c65921TwS, interfaceC72020XFi));
            c51384Mmk.setAdapter(AbstractC31173DnH.A0R(c66392zG, new Object()));
        }
    }
}
