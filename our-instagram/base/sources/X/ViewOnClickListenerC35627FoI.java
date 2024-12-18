package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.user.model.User;

/* renamed from: X.FoI, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35627FoI implements View.OnClickListener {
    public final /* synthetic */ InterfaceC11380iw A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ MusicAssetModel A02;
    public final /* synthetic */ InterfaceC678133v A03;
    public final /* synthetic */ C72q A04;
    public final /* synthetic */ User A05;

    public ViewOnClickListenerC35627FoI(InterfaceC11380iw interfaceC11380iw, UserSession userSession, MusicAssetModel musicAssetModel, InterfaceC678133v interfaceC678133v, C72q c72q, User user) {
        this.A03 = interfaceC678133v;
        this.A04 = c72q;
        this.A05 = user;
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
        this.A02 = musicAssetModel;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-255766113);
        InterfaceC678133v interfaceC678133v = this.A03;
        if (interfaceC678133v != null && interfaceC678133v.isPlaying()) {
            interfaceC678133v.pause();
        }
        C72q c72q = this.A04;
        User user = this.A05;
        C155476ya c155476ya = c72q.A05;
        AbstractC166987dD.A1Z(new PZW((Object) c155476ya, (InterfaceC23621Ds) null, 30, false), AbstractC141776au.A00(c155476ya));
        user.A03.EVU(false);
        AbstractC25651Mw.A00(c72q.A03).E4s(new C2AS(user));
        UserSession userSession = this.A01;
        String moduleName = this.A00.getModuleName();
        MusicAssetModel musicAssetModel = this.A02;
        String str = musicAssetModel.A0E;
        C14360o3.A07(str);
        long A0t = AbstractC25232BEp.A0t(AbstractC003100w.A0k(10, str));
        EnumC39652Hih enumC39652Hih = EnumC39652Hih.A0u;
        String A14 = AbstractC25225BEi.A14();
        String str2 = musicAssetModel.A0B;
        C14360o3.A07(str2);
        IRT.A00(enumC39652Hih, null, userSession, AbstractC003100w.A0k(10, str2), moduleName, A14, null, A0t);
        C0f9.A0C(-384158121, A05);
    }
}
