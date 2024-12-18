package X;

import com.instagram.creation.fragment.EditMediaInfoFragment;

/* renamed from: X.N9w, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52233N9w extends C1P1 {
    public final /* synthetic */ EditMediaInfoFragment A00;

    public C52233N9w(EditMediaInfoFragment editMediaInfoFragment) {
        this.A00 = editMediaInfoFragment;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(-1878576845);
        EditMediaInfoFragment editMediaInfoFragment = this.A00;
        editMediaInfoFragment.A0m = true;
        EditMediaInfoFragment.A0G(editMediaInfoFragment);
        C9GR.A08(editMediaInfoFragment.requireContext(), 2131956461, 0);
        C0f9.A0A(-238090546, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(1895222638);
        EditMediaInfoFragment.A0L(this.A00, false);
        C0f9.A0A(1055222040, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(-1610779065);
        EditMediaInfoFragment.A0L(this.A00, true);
        C0f9.A0A(809494555, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(727305849);
        int A032 = C0f9.A03(-235155324);
        EditMediaInfoFragment editMediaInfoFragment = this.A00;
        editMediaInfoFragment.A0m = false;
        EditMediaInfoFragment.A0G(editMediaInfoFragment);
        C38321qM c38321qM = editMediaInfoFragment.A0I;
        if (c38321qM != null) {
            EditMediaInfoFragment.A0I(editMediaInfoFragment, c38321qM);
        }
        C0f9.A0A(1076549203, A032);
        C0f9.A0A(-282507948, A03);
    }
}
