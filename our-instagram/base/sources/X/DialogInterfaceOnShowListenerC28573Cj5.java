package X;

import android.content.DialogInterface;
import com.instagram.common.session.UserSession;

/* renamed from: X.Cj5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class DialogInterfaceOnShowListenerC28573Cj5 implements DialogInterface.OnShowListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public DialogInterfaceOnShowListenerC28573Cj5(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
        this.A03 = str;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        if (this.A00 != 0) {
            C18920wW c18920wW = (C18920wW) this.A01;
            String str = ((UserSession) this.A02).userId;
            String str2 = this.A03;
            AbstractC167017dG.A1N(c18920wW, str);
            C41684IdD.A00(c18920wW, str, str2, AbstractC58317Pt9.A00(263));
            return;
        }
        UserSession userSession = (UserSession) this.A02;
        AbstractC208329Jr.A07((InterfaceC11380iw) this.A01, userSession, C05F.A00, this.A03);
        InterfaceC19630xq A0x = AbstractC166987dD.A0x(userSession);
        AbstractC167007dF.A18(A0x, "meta_gallery_recents_nux_impression_count", A0x.getInt("meta_gallery_recents_nux_impression_count", 0) + 1);
    }
}
