package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.user.model.User;
import java.util.ArrayList;

/* renamed from: X.Drc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31432Drc implements C73R, CallerContextable {
    public static final String __redex_internal_original_name = "ProfileContactActionButton";
    public final Context A00;
    public final InterfaceC151446rm A01;
    public final C73S A02;
    public final User A03;
    public final ArrayList A04;

    public C31432Drc(Context context, InterfaceC151446rm interfaceC151446rm, User user, ArrayList arrayList) {
        C14360o3.A0B(interfaceC151446rm, 3);
        this.A00 = context;
        this.A04 = arrayList;
        this.A01 = interfaceC151446rm;
        this.A03 = user;
        if (AbstractC25226BEj.A1b(arrayList)) {
            if (user.A1a()) {
                interfaceC151446rm.FAm(C31432Drc.class, user.getId());
            }
            this.A02 = C73S.A06;
            return;
        }
        throw AbstractC166987dD.A14("Cannot create a bundled action button without Business actions to bundle");
    }

    @Override // X.C73R
    public final String AjD() {
        return "generic";
    }

    @Override // X.C73R
    public final /* synthetic */ Integer BEt() {
        return null;
    }

    @Override // X.C73R
    public final /* synthetic */ boolean DQZ() {
        return false;
    }

    @Override // X.C73R
    public final String Aj7() {
        return AbstractC166997dE.A0p(this.A00, 2131956642);
    }

    @Override // X.C73R
    public final void onClick() {
        this.A01.D0o(this.A04);
    }

    @Override // X.C73R
    public final C73S AjB() {
        return this.A02;
    }
}
