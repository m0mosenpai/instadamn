package X;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import androidx.paging.PagingDataAdapter;
import com.facebook.R;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class JnF extends PagingDataAdapter {
    public final Activity A00;
    public final C07T A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;
    public final C47942LFs A04;
    public final C44535Jmf A05;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public JnF(android.app.Activity r3, X.C07T r4, X.InterfaceC11380iw r5, com.instagram.common.session.UserSession r6, X.C47942LFs r7, X.C44535Jmf r8) {
        /*
            r2 = this;
            r0 = 2
            X.AbstractC25234BEr.A0j(r0, r6, r8, r7, r4)
            X.JnL r1 = X.JnL.A00
            X.12T r0 = X.C12P.A00
            X.137 r0 = X.AnonymousClass131.A00
            r2.<init>(r1, r0)
            r2.A02 = r5
            r2.A03 = r6
            r2.A05 = r8
            r2.A04 = r7
            r2.A01 = r4
            r2.A00 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JnF.<init>(android.app.Activity, X.07T, X.0iw, com.instagram.common.session.UserSession, X.LFs, X.Jmf):void");
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        View inflate = AbstractC31177DnL.A0E(viewGroup, 0).inflate(R.layout.clips_acr_browser_item_layout, viewGroup, false);
        int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
        InterfaceC11380iw interfaceC11380iw = this.A02;
        UserSession userSession = this.A03;
        C14360o3.A0A(inflate);
        C44535Jmf c44535Jmf = this.A05;
        C47942LFs c47942LFs = this.A04;
        return new C44767Jro(this.A00, inflate, this.A01, interfaceC11380iw, userSession, c47942LFs, c44535Jmf);
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        C44767Jro c44767Jro = (C44767Jro) c3oo;
        C14360o3.A0B(c44767Jro, 0);
        C45077Jx6 c45077Jx6 = (C45077Jx6) A02(i);
        if (c45077Jx6 != null) {
            c44767Jro.A01(c45077Jx6, i);
        }
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onViewRecycled(C3OO c3oo) {
        MediaComposition mediaComposition;
        C44767Jro c44767Jro = (C44767Jro) c3oo;
        C14360o3.A0B(c44767Jro, 0);
        C45077Jx6 c45077Jx6 = c44767Jro.A01;
        if (c45077Jx6 != null && (mediaComposition = c45077Jx6.A01) != null) {
            C47942LFs c47942LFs = c44767Jro.A0D;
            C55333Ogw c55333Ogw = (C55333Ogw) c47942LFs.A01.remove(mediaComposition);
            if (c55333Ogw != null) {
                c55333Ogw.isPlaying = false;
                c55333Ogw.A01.A07();
            }
            c47942LFs.A00 = -1;
        }
        c44767Jro.A01 = null;
    }
}
