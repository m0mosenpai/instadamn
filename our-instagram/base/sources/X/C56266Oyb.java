package X;

import android.content.Context;
import android.view.Surface;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Oyb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56266Oyb implements InterfaceC58267PsB {
    public C55208OeM A00;
    public final int A01;
    public final int A02;
    public final Context A03;
    public final UserSession A04;

    @Override // X.InterfaceC58267PsB
    public final void ESu(C54671OCx c54671OCx, int i) {
        C55208OeM c55208OeM;
        MediaComposition mediaComposition = c54671OCx.A02;
        if (mediaComposition != null && (c55208OeM = this.A00) != null) {
            c55208OeM.A0A(mediaComposition, this.A02, this.A01, -1, -1, i, false);
        }
    }

    @Override // X.InterfaceC58267PsB
    public final void reset() {
        seekTo(0);
        pause();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [X.PzK, java.lang.Object] */
    @Override // X.InterfaceC58267PsB
    public final void setSurface(Surface surface) {
        UserSession userSession = this.A04;
        C06090Tz c06090Tz = C06090Tz.A05;
        int A07 = AbstractC25225BEi.A07(c06090Tz, userSession, 36601874506846589L);
        W5s A05 = AbstractC86593tX.A05(userSession, C18U.A06(c06090Tz, userSession, 36316018662510465L), false, false, false, false);
        Context context = this.A03;
        C52248NAm c52248NAm = new C52248NAm(surface);
        C23518AbY A00 = AbstractC224689vt.A00(context, null, null, false);
        C68920VeK A0P = AbstractC50522MSa.A0P(A05.A0q ? 1 : 0);
        C70477WYi c70477WYi = new C70477WYi(C18U.A06(c06090Tz, userSession, 36320399530205626L), Math.min(A07, this.A02));
        LinkedHashMap A002 = AbstractC53947NtK.A00("reels_review", null);
        this.A00 = new C55208OeM(context, null, c70477WYi, new Object(), C55768Opc.A00, A0P, 0 == true ? 1 : 0, A00, A05, c52248NAm, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, A002, 59048);
    }

    @Override // X.InterfaceC58267PsB
    public final void EYI(BDN bdn) {
        C55208OeM c55208OeM = this.A00;
        if (c55208OeM != null) {
            c55208OeM.A06 = new C23604Acy(bdn);
        }
    }

    @Override // X.InterfaceC58267PsB
    public final int getCurrentPosition() {
        long j;
        C55208OeM c55208OeM = this.A00;
        if (c55208OeM != null) {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            InterfaceC58201Pr7 interfaceC58201Pr7 = c55208OeM.A04;
            if (interfaceC58201Pr7 != null) {
                j = interfaceC58201Pr7.Aui();
            } else {
                j = 0;
            }
            return (int) timeUnit.toMillis(j);
        }
        return 0;
    }

    @Override // X.InterfaceC58267PsB
    public final boolean isPlaying() {
        InterfaceC58201Pr7 interfaceC58201Pr7;
        C55208OeM c55208OeM = this.A00;
        if (c55208OeM != null && (interfaceC58201Pr7 = c55208OeM.A04) != null) {
            return interfaceC58201Pr7.isPlaying();
        }
        return false;
    }

    @Override // X.InterfaceC58267PsB
    public final void pause() {
        C55208OeM c55208OeM = this.A00;
        if (c55208OeM != null) {
            c55208OeM.A05();
        }
    }

    @Override // X.InterfaceC58267PsB
    public final void release() {
        C55208OeM c55208OeM = this.A00;
        if (c55208OeM != null) {
            c55208OeM.A07();
        }
    }

    @Override // X.InterfaceC58267PsB
    public final void seekTo(int i) {
        C55208OeM c55208OeM = this.A00;
        if (c55208OeM != null) {
            c55208OeM.A09(i);
        }
    }

    @Override // X.InterfaceC58267PsB
    public final void start() {
        C55208OeM c55208OeM = this.A00;
        if (c55208OeM != null) {
            c55208OeM.A06();
        }
    }

    public C56266Oyb(Context context, UserSession userSession, int i, int i2) {
        this.A03 = context;
        this.A04 = userSession;
        this.A02 = i;
        this.A01 = i2;
    }
}
