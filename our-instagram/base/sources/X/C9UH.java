package X;

import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.9UH, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9UH extends C2UU {
    public List A00;
    public final UserSession A01;
    public final InterfaceC186078Nb A02;

    @Override // X.C2UU
    public final void onBindViewHolder(C3OO c3oo, int i) {
        C14360o3.A0B(c3oo, 0);
        C148276lx c148276lx = (C148276lx) this.A00.get(i);
        ALo.A02(this.A01, null, this.A02, (C210959Us) c3oo, c148276lx, null);
    }

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C14360o3.A0B(viewGroup, 0);
        Object tag = ALo.A00(AbstractC166997dE.A0L(viewGroup), 1.0f, true).getTag();
        C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.creation.capture.assetpicker.StickerSheetItemViewBinder.Holder");
        return (C3OO) tag;
    }

    public C9UH(UserSession userSession, InterfaceC186078Nb interfaceC186078Nb) {
        AbstractC167017dG.A1P(userSession, interfaceC186078Nb);
        this.A01 = userSession;
        this.A02 = interfaceC186078Nb;
        this.A00 = AbstractC166987dD.A1E();
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(-178252134);
        int size = this.A00.size();
        C0f9.A0A(795157473, A03);
        return size;
    }
}
