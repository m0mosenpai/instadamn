package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.NXj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52777NXj extends AbstractC33235ElU implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "SavingToGalleryFragment";
    public UserSession A00;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "saving_to_gallery";
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A00;
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131963156);
    }

    @Override // X.AbstractC33235ElU, X.AbstractC60672pq, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(956750143);
        super.onCreate(bundle);
        this.A00 = AbstractC31176DnK.A0S(this);
        C0f9.A09(907002040, A02);
    }

    @Override // X.AbstractC60672pq, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-1504446146);
        super.onResume();
        ArrayList A1E = AbstractC166987dD.A1E();
        C23031Ai A00 = AbstractC23021Ah.A00(this.A00);
        A1E.add(new C36731GHa(new C55516Ol9(6, C05F.A00, this, AbstractC23021Ah.A00(this.A00)), 2131972764, A00.A1x()));
        A1E.add(new C35246Fgf(getString(2131969273)));
        InterfaceC16530ry interfaceC16530ry = A00.A7G;
        C0YR[] c0yrArr = C23031Ai.A8c;
        A1E.add(new C36731GHa(new C55516Ol9(6, C05F.A01, this, AbstractC23021Ah.A00(this.A00)), 2131972770, AbstractC167017dG.A1b(A00, interfaceC16530ry, c0yrArr, 33)));
        A1E.add(new C36731GHa(new C55516Ol9(6, C05F.A0C, this, AbstractC23021Ah.A00(this.A00)), 2131972771, AbstractC167017dG.A1b(A00, A00.A7r, c0yrArr, 31)));
        A1E.add(new C35246Fgf(getString(2131976734)));
        setItems(A1E);
        C0f9.A09(-207396806, A02);
    }
}
