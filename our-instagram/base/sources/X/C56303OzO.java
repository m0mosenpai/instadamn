package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.AudioOverlayTrack;

/* renamed from: X.OzO, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56303OzO implements C8BK {
    public boolean A00;
    public final InterfaceC09390do A01;
    public final O6N A02;
    public final String A03;

    public C56303OzO(Context context, AbstractC59962oe abstractC59962oe, UserSession userSession, O6N o6n, String str) {
        C14360o3.A0B(userSession, 2);
        this.A02 = o6n;
        this.A01 = AbstractC09440dt.A01(new ME7(38, context, this, abstractC59962oe, userSession));
        this.A03 = str;
    }

    @Override // X.C8BK
    public final /* synthetic */ void DuZ(AudioOverlayTrack audioOverlayTrack) {
    }

    @Override // X.C8BK
    public final /* synthetic */ void Dub(AudioOverlayTrack audioOverlayTrack, boolean z) {
    }

    @Override // X.C8BK
    public final /* synthetic */ void Duc(AudioOverlayTrack audioOverlayTrack, AudioOverlayTrack audioOverlayTrack2) {
    }

    @Override // X.C8BK
    public final void Due(AudioOverlayTrack audioOverlayTrack) {
        C14360o3.A0B(audioOverlayTrack, 0);
        AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(this.A02.A00.A05);
        AbstractC166987dD.A1Z(new C57156PZa(A0Z, audioOverlayTrack, (InterfaceC23621Ds) null, 12), AbstractC141776au.A00(A0Z));
    }

    @Override // X.C8BK
    public final /* synthetic */ void Dui(AudioOverlayTrack audioOverlayTrack, Integer num) {
        AbstractC226899zl.A00(this, audioOverlayTrack);
    }

    @Override // X.AnonymousClass844
    public final String BVY() {
        return this.A03;
    }

    @Override // X.C8BK
    public final void DUX(boolean z) {
        boolean z2;
        C50870Me1 c50870Me1 = (C50870Me1) this.A02.A00.A06.getValue();
        if (z) {
            z2 = true;
        } else {
            z2 = false;
        }
        AbstractC166997dE.A1Y(c50870Me1.A0O, z2);
        this.A00 = z;
    }
}
