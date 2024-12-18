package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import com.instagram.common.typedurl.ImageUrl;
import java.util.HashSet;

/* loaded from: classes9.dex */
public final class P3S implements InterfaceC58191Pqx {
    public int A00;
    public C38321qM A01;
    public final Handler A02;
    public final C54798OJr A03;
    public final HashSet A04;
    public final Context A05;

    @Override // X.InterfaceC58191Pqx
    public final void DhE() {
    }

    @Override // X.InterfaceC58191Pqx
    public final void EDp(C3O0 c3o0) {
        C14360o3.A0B(c3o0, 0);
        this.A04.add(c3o0);
    }

    @Override // X.InterfaceC58191Pqx
    public final void F9j(C3O0 c3o0) {
        C14360o3.A0B(c3o0, 0);
        this.A04.remove(c3o0);
    }

    @Override // X.InterfaceC58191Pqx
    public final EnumC40111tc BRp() {
        return EnumC40111tc.A0a;
    }

    @Override // X.InterfaceC58191Pqx
    public final int BiJ() {
        return this.A00;
    }

    @Override // X.InterfaceC58191Pqx
    public final Integer C0L() {
        C47Z c47z;
        C54798OJr c54798OJr = this.A03;
        if (c54798OJr.A06.get() || (((c47z = c54798OJr.A03) != null && c47z.A0m()) || this.A00 != 100)) {
            return C05F.A00;
        }
        return C05F.A01;
    }

    @Override // X.InterfaceC58191Pqx
    public final C47981LJa C0N() {
        String A0P = AbstractC167027dH.A0P(this.A05, 2131955212);
        C14360o3.A07(A0P);
        return new C47981LJa(null, 8, null, A0P, null, null);
    }

    @Override // X.InterfaceC58191Pqx
    public final /* synthetic */ Drawable C7z() {
        return null;
    }

    @Override // X.InterfaceC58191Pqx
    public final String C81() {
        ImageUrl A1S = this.A01.A1S();
        if (A1S != null) {
            return A1S.getUrl();
        }
        return null;
    }

    public P3S(Context context, C38321qM c38321qM, C54798OJr c54798OJr) {
        AbstractC167017dG.A1R(c38321qM, c54798OJr);
        this.A05 = context;
        this.A01 = c38321qM;
        this.A03 = c54798OJr;
        this.A04 = AbstractC166987dD.A1H();
        this.A02 = new Handler();
        new PP3(this).run();
    }
}
