package X;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.MusicAssetModel;

/* renamed from: X.Fnw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35605Fnw implements View.OnClickListener {
    public final /* synthetic */ AbstractC59962oe A00;
    public final /* synthetic */ InterfaceC11380iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ MusicAssetModel A03;

    public ViewOnClickListenerC35605Fnw(AbstractC59962oe abstractC59962oe, InterfaceC11380iw interfaceC11380iw, UserSession userSession, MusicAssetModel musicAssetModel) {
        this.A00 = abstractC59962oe;
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A03 = musicAssetModel;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(902212123);
        FragmentActivity requireActivity = this.A00.requireActivity();
        UserSession userSession = this.A02;
        C140966Yy A0r = AbstractC25225BEi.A0r(requireActivity, userSession);
        Bundle A052 = AbstractC31178DnM.A05(userSession);
        C45480KBs c45480KBs = new C45480KBs();
        c45480KBs.setArguments(A052);
        AbstractC31175DnJ.A0s(null, c45480KBs, A0r);
        String moduleName = this.A01.getModuleName();
        MusicAssetModel musicAssetModel = this.A03;
        String str = musicAssetModel.A0E;
        C14360o3.A07(str);
        long A0t = AbstractC25232BEp.A0t(AbstractC003100w.A0k(10, str));
        EnumC39652Hih enumC39652Hih = EnumC39652Hih.A06;
        String A14 = AbstractC25225BEi.A14();
        String str2 = musicAssetModel.A0B;
        C14360o3.A07(str2);
        IRT.A00(enumC39652Hih, null, userSession, AbstractC003100w.A0k(10, str2), moduleName, A14, null, A0t);
        C0f9.A0C(359928271, A05);
    }
}
