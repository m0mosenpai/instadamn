package X;

import android.app.Activity;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.messagethread.collections.model.DirectCollectionArguments;

/* renamed from: X.G4g, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36405G4g implements InterfaceC165817b8 {
    public final C7XS A00;
    public final Activity A01;
    public final UserSession A02;
    public final InterfaceC163877Vb A03;
    public final InterfaceC60442pS A04;

    public C36405G4g(Activity activity, UserSession userSession, C7XS c7xs, InterfaceC163877Vb interfaceC163877Vb, InterfaceC60442pS interfaceC60442pS) {
        AbstractC25233BEq.A0x(3, interfaceC60442pS, c7xs, interfaceC163877Vb);
        this.A01 = activity;
        this.A02 = userSession;
        this.A04 = interfaceC60442pS;
        this.A00 = c7xs;
        this.A03 = interfaceC163877Vb;
    }

    @Override // X.InterfaceC165817b8
    public final void Cgl(C76C c76c) {
        String str;
        this.A03.CMc();
        Bundle A0b = AbstractC166987dD.A0b();
        UserSession userSession = this.A02;
        AbstractC31173DnH.A1C(A0b, userSession);
        A0b.putBoolean("DirectSaveToCollectionFragment_show_pinned_save_row", false);
        String moduleName = this.A04.getModuleName();
        Integer num = C05F.A00;
        boolean A1V = AbstractC167007dF.A1V(moduleName);
        ImageUrl imageUrl = c76c.A01;
        boolean z = true;
        if (c76c.A00 != A1V) {
            z = false;
        }
        String str2 = null;
        if (c76c.A0A) {
            str = null;
            str2 = c76c.A03;
        } else {
            str = c76c.A03;
        }
        String str3 = str2;
        String str4 = str;
        A0b.putParcelable("direct_collection_arguments", new DirectCollectionArguments(imageUrl, c76c.A02, Boolean.valueOf(c76c.A08), num, moduleName, str4, str3, c76c.A05, c76c.A06, c76c.A04, c76c.A07, z));
        EMG emg = new EMG();
        C189448aO A0W = AbstractC31174DnI.A0W(A0b, emg, userSession);
        A0W.A0T = emg;
        A0W.A1G = A1V;
        AbstractC25225BEi.A1Q(A0W, A1V);
        Activity activity = this.A01;
        A0W.A03 = EMG.A0P.A00(activity, false) / AbstractC13880nE.A09(activity);
        A0W.A0U = new GH5(this, 10);
        AbstractC31173DnH.A0w(activity, emg, A0W);
        this.A00.D0E();
    }
}
