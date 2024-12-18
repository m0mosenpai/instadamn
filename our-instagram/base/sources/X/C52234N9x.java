package X;

import com.instagram.creation.fragment.EditMediaInfoFragment;

/* renamed from: X.N9x, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52234N9x extends C1P1 {
    public final /* synthetic */ EditMediaInfoFragment A00;

    public C52234N9x(EditMediaInfoFragment editMediaInfoFragment) {
        this.A00 = editMediaInfoFragment;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(-1869858497);
        EditMediaInfoFragment editMediaInfoFragment = this.A00;
        editMediaInfoFragment.A0m = true;
        EditMediaInfoFragment.A0G(editMediaInfoFragment);
        C0f9.A0A(-1944712148, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(-2015224904);
        EditMediaInfoFragment editMediaInfoFragment = this.A00;
        EditMediaInfoFragment.A0L(editMediaInfoFragment, false);
        EditMediaInfoFragment.A0A(editMediaInfoFragment);
        C0f9.A0A(-275759939, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(-1167370846);
        EditMediaInfoFragment.A0L(this.A00, true);
        C0f9.A0A(-887607338, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(343838348);
        int A032 = C0f9.A03(689640781);
        EditMediaInfoFragment editMediaInfoFragment = this.A00;
        Object obj2 = ((C74293Vk) obj).A06.get(0);
        obj2.getClass();
        editMediaInfoFragment.A0I = (C38321qM) obj2;
        editMediaInfoFragment.A0m = false;
        EditMediaInfoFragment.A0G(editMediaInfoFragment);
        if (!editMediaInfoFragment.A0s) {
            EditMediaInfoFragment.A0C(editMediaInfoFragment);
        }
        if (!editMediaInfoFragment.A0h) {
            if (EditMediaInfoFragment.A0P(editMediaInfoFragment)) {
                editMediaInfoFragment.A0f = editMediaInfoFragment.A0I.A3W();
            } else if (editMediaInfoFragment.A0I.A0C.AXw() != null) {
                editMediaInfoFragment.A0U = editMediaInfoFragment.A0I.A0C.AXw();
            }
        }
        EditMediaInfoFragment.A04(editMediaInfoFragment);
        EditMediaInfoFragment.A0H(editMediaInfoFragment);
        EditMediaInfoFragment.A07(editMediaInfoFragment);
        EditMediaInfoFragment.A09(editMediaInfoFragment);
        if (editMediaInfoFragment.A0o) {
            EditMediaInfoFragment.A0J(editMediaInfoFragment, true);
        }
        C0f9.A0A(1995159946, A032);
        C0f9.A0A(2014373841, A03);
    }
}
