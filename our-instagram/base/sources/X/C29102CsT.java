package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.user.model.User;

/* renamed from: X.CsT, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29102CsT implements GXC {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ C26743BrP A01;

    public C29102CsT(FragmentActivity fragmentActivity, C26743BrP c26743BrP) {
        this.A01 = c26743BrP;
        this.A00 = fragmentActivity;
    }

    @Override // X.GXC
    public final void DJM() {
        C26743BrP c26743BrP = this.A01;
        AbstractC151386rg.A05((InterfaceC11380iw) c26743BrP.A02.getValue(), AbstractC166987dD.A0r(c26743BrP.A05), "permalink", ((User) c26743BrP.A03.getValue()).getId(), AbstractC14490oL.A0A(this.A00));
    }
}
