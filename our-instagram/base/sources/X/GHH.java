package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class GHH implements C7XU {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AbstractC59962oe A01;
    public final /* synthetic */ InterfaceC11380iw A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ MusicAssetModel A04;
    public final /* synthetic */ InterfaceC678133v A05;
    public final /* synthetic */ C72q A06;
    public final /* synthetic */ User A07;
    public final /* synthetic */ boolean A08;

    @Override // X.C7XU
    public final void DB3() {
    }

    public GHH(Context context, AbstractC59962oe abstractC59962oe, InterfaceC11380iw interfaceC11380iw, UserSession userSession, MusicAssetModel musicAssetModel, InterfaceC678133v interfaceC678133v, C72q c72q, User user, boolean z) {
        this.A05 = interfaceC678133v;
        this.A00 = context;
        this.A03 = userSession;
        this.A01 = abstractC59962oe;
        this.A07 = user;
        this.A08 = z;
        this.A04 = musicAssetModel;
        this.A02 = interfaceC11380iw;
        this.A06 = c72q;
    }

    @Override // X.C7XU
    public final void DAy() {
        InterfaceC678133v interfaceC678133v = this.A05;
        if (interfaceC678133v != null && interfaceC678133v.isPlaying()) {
            interfaceC678133v.pause();
        }
        Context context = this.A00;
        UserSession userSession = this.A03;
        AbstractC59962oe abstractC59962oe = this.A01;
        User user = this.A07;
        boolean z = this.A08;
        C1567972f.A02(context, abstractC59962oe, this.A02, userSession, this.A04, interfaceC678133v, this.A06, user, z);
    }
}
