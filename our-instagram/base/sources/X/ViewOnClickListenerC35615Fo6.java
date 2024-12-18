package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.MusicAssetModel;

/* renamed from: X.Fo6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35615Fo6 implements View.OnClickListener {
    public final /* synthetic */ AbstractC59962oe A00;
    public final /* synthetic */ InterfaceC11380iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ MusicAssetModel A03;
    public final /* synthetic */ InterfaceC678133v A04;

    public ViewOnClickListenerC35615Fo6(AbstractC59962oe abstractC59962oe, InterfaceC11380iw interfaceC11380iw, UserSession userSession, MusicAssetModel musicAssetModel, InterfaceC678133v interfaceC678133v) {
        this.A02 = userSession;
        this.A00 = abstractC59962oe;
        this.A03 = musicAssetModel;
        this.A04 = interfaceC678133v;
        this.A01 = interfaceC11380iw;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(361692194);
        String A0j = AbstractC167017dG.A0j();
        UserSession userSession = this.A02;
        AbstractC59962oe abstractC59962oe = this.A00;
        MusicAssetModel musicAssetModel = this.A03;
        C1567972f.A07(abstractC59962oe, userSession, musicAssetModel, this.A04);
        String moduleName = this.A01.getModuleName();
        String str = musicAssetModel.A0E;
        C14360o3.A07(str);
        long A0t = AbstractC25232BEp.A0t(AbstractC003100w.A0k(10, str));
        EnumC39652Hih enumC39652Hih = EnumC39652Hih.A0z;
        String A14 = AbstractC25225BEi.A14();
        C8JW c8jw = C8JW.A0Q;
        String str2 = musicAssetModel.A0B;
        C14360o3.A07(str2);
        IRT.A00(enumC39652Hih, c8jw, userSession, AbstractC003100w.A0k(10, str2), moduleName, A14, A0j, A0t);
        C0f9.A0C(150082162, A05);
    }
}
