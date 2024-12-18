package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.7RA, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7RA implements C7QC {
    public final InterfaceC11380iw A00;
    public final C7RB A01;
    public final C7ZX A02;
    public final AnonymousClass988 A03;
    public final UserSession A04;

    public C7RA(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C7ZX c7zx, AnonymousClass988 anonymousClass988) {
        C14360o3.A0B(userSession, 4);
        this.A03 = anonymousClass988;
        this.A02 = c7zx;
        this.A00 = interfaceC11380iw;
        this.A04 = userSession;
        this.A01 = new C7RB(userSession);
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ C7QD ANU(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C14360o3.A0B(viewGroup, 0);
        C14360o3.A0B(layoutInflater, 1);
        View inflate = layoutInflater.inflate(R.layout.message_multiple_reaction_pills, viewGroup, false);
        C14360o3.A0A(inflate);
        AnonymousClass988 anonymousClass988 = this.A03;
        return new C163047Rp(inflate, this.A00, this.A01, this.A02, anonymousClass988);
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void ADy(C7QD c7qd, InterfaceC129555tK interfaceC129555tK) {
        C163047Rp c163047Rp = (C163047Rp) c7qd;
        AnonymousClass794 anonymousClass794 = (AnonymousClass794) interfaceC129555tK;
        C14360o3.A0B(c163047Rp, 0);
        if (anonymousClass794 != null) {
            c163047Rp.A01(anonymousClass794);
        }
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void F91(C7QD c7qd) {
        C163047Rp c163047Rp = (C163047Rp) c7qd;
        if (c163047Rp != null) {
            c163047Rp.A00();
        }
    }

    public final C163047Rp A00(View view) {
        View requireViewById = view.requireViewById(R.id.pills_view_container);
        C14360o3.A07(requireViewById);
        AnonymousClass988 anonymousClass988 = this.A03;
        return new C163047Rp(requireViewById, this.A00, this.A01, this.A02, anonymousClass988);
    }
}
