package X;

import com.facebook.R;

/* renamed from: X.G4u, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36419G4u implements InterfaceC37161GYy {
    public final C7U0 A00;

    @Override // X.InterfaceC37161GYy
    public final boolean isEnabled() {
        InterfaceC163837Ux C7r = this.A00.C7r();
        if (C7r instanceof C163827Uw) {
            C14360o3.A0C(C7r, AbstractC111324zv.A00(485));
            C2EC c2ec = ((C163827Uw) C7r).A07;
            c2ec.getClass();
            return c2ec.CVT();
        }
        return false;
    }

    public C36419G4u(C7U0 c7u0) {
        this.A00 = c7u0;
    }

    @Override // X.InterfaceC37161GYy
    public final C32073E6z BXV() {
        return C32073E6z.A00(this, 23, R.drawable.instagram_link_pano_outline_24, 2131968877);
    }
}
