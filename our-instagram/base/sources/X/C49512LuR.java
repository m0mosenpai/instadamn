package X;

import android.view.LayoutInflater;

/* renamed from: X.LuR, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49512LuR implements InterfaceC65242xM {
    public final C66362zD A00;

    @Override // X.InterfaceC65242xM
    public final /* bridge */ /* synthetic */ Object getAdapter() {
        return this.A00;
    }

    @Override // X.InterfaceC65242xM
    public final int getCount() {
        return this.A00.getItemCount();
    }

    @Override // X.InterfaceC65242xM
    public final Object getItem(int i) {
        Object A04 = this.A00.A04(i);
        C14360o3.A07(A04);
        return A04;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.2zJ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.2zJ, java.lang.Object] */
    public C49512LuR(LayoutInflater layoutInflater, InterfaceC11380iw interfaceC11380iw, InterfaceC50466MPu interfaceC50466MPu) {
        AbstractC167017dG.A1R(interfaceC11380iw, interfaceC50466MPu);
        C66392zG c66392zG = new C66392zG(layoutInflater);
        c66392zG.A01(new Object());
        c66392zG.A01(new KJW(interfaceC11380iw, interfaceC50466MPu));
        this.A00 = AbstractC31173DnH.A0R(c66392zG, new Object());
    }
}
