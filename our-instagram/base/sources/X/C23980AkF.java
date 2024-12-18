package X;

import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.MusicAssetModel;

/* renamed from: X.AkF, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23980AkF implements JHD {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C9ZT A01;
    public final /* synthetic */ AC2 A02;
    public final /* synthetic */ C84L A03;

    @Override // X.JHD
    public final void DBj(MusicAssetModel musicAssetModel) {
        C14360o3.A0B(musicAssetModel, 0);
        AbstractC166987dD.A1Z(new MCP(this.A01, this.A02, this.A00, musicAssetModel, null, 47), this.A03.A01);
    }

    public C23980AkF(UserSession userSession, C9ZT c9zt, AC2 ac2, C84L c84l) {
        this.A03 = c84l;
        this.A01 = c9zt;
        this.A00 = userSession;
        this.A02 = ac2;
    }

    @Override // X.JHD
    public final void DBk() {
        AbstractC12120kG.A06("SFXAudioRepository", AnonymousClass001.A0g(MSV.A00(866), this.A01.A03, " sound effect for draft."), null);
    }
}
