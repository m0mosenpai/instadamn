package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.sfx.SfxNetworkSource;
import com.instagram.creation.capture.quickcapture.sundial.sfx.repository.SfxAudioRepository;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;

/* renamed from: X.Om5, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55569Om5 implements InterfaceC52932ba {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ InterfaceC49612Pu A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ C19L A04;

    @Override // X.InterfaceC52932ba
    public final /* synthetic */ AbstractC52922bZ create(InterfaceC16510rw interfaceC16510rw, AbstractC52972be abstractC52972be) {
        return AbstractC53002bh.A00(this, abstractC52972be, interfaceC16510rw);
    }

    public C55569Om5(FragmentActivity fragmentActivity, UserSession userSession, InterfaceC49612Pu interfaceC49612Pu, String str, C19L c19l) {
        this.A03 = str;
        this.A01 = userSession;
        this.A02 = interfaceC49612Pu;
        this.A04 = c19l;
        this.A00 = fragmentActivity;
    }

    @Override // X.InterfaceC52932ba
    public final AbstractC52922bZ create(Class cls) {
        String str = this.A03;
        if (str != null) {
            UserSession userSession = this.A01;
            SfxAudioRepository sfxAudioRepository = new SfxAudioRepository(userSession, new AC2(this.A02), new SfxNetworkSource(), str, this.A04);
            FragmentActivity fragmentActivity = this.A00;
            return new C51024MgX(sfxAudioRepository, AnonymousClass849.A00(MSX.A06(fragmentActivity), userSession).A00(((ClipsCreationViewModel) AbstractC50522MSa.A0L(fragmentActivity, userSession)).A0S).A01);
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC52932ba
    public final /* synthetic */ AbstractC52922bZ create(Class cls, AbstractC52972be abstractC52972be) {
        C14360o3.A0B(cls, 1);
        return create(cls);
    }
}
