package X;

import android.content.Context;
import com.instagram.api.schemas.MusicPageTabType;
import com.instagram.clips.audio.model.AudioPageAssetModel;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Imi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42196Imi implements C5R4, C5R6 {
    public static final long A05 = TimeUnit.MINUTES.toSeconds(60);
    public final int A00;
    public final MusicPageTabType A01;
    public final AudioPageAssetModel A02;
    public final boolean A03;
    public final boolean A04;

    @Override // X.C5R4
    public final void AHy(UserSession userSession) {
    }

    @Override // X.C5R4
    public final Integer AJT(UserSession userSession, AbstractC154286wd abstractC154286wd, C154796xU c154796xU) {
        boolean A06 = C18U.A06(AbstractC25225BEi.A0j(c154796xU, 1), userSession, 36316117446234112L);
        String str = this.A02.A02;
        long j = A05;
        if (A06) {
            return c154796xU.A02(abstractC154286wd, str, j, false, true);
        }
        return c154796xU.A01(abstractC154286wd, str, j, false);
    }

    @Override // X.C5R4
    public final void AQ9(Context context, UserSession userSession, String str, String str2, boolean z, boolean z2) {
        C42133Ilh c42133Ilh = new C42133Ilh(this, 1);
        C06090Tz c06090Tz = C06090Tz.A05;
        boolean A06 = C18U.A06(c06090Tz, userSession, 36316117446234112L);
        boolean z3 = this.A04;
        C41748IeM c41748IeM = C41748IeM.A00;
        AudioPageAssetModel audioPageAssetModel = this.A02;
        if (A06) {
            MusicPageTabType musicPageTabType = this.A01;
            C24531Hw A052 = c41748IeM.A05(musicPageTabType, audioPageAssetModel, userSession, null, true, true, C18U.A06(c06090Tz, userSession, 36316117446365186L), false);
            C1IA A00 = C1I9.A00(userSession);
            String str3 = audioPageAssetModel.A02;
            C14360o3.A0B(str3, 0);
            C24531Hw c24531Hw = null;
            long j = A05;
            if (z3) {
                C23711Eb c23711Eb = new C23711Eb(userSession, 27647154, 1, false);
                c23711Eb.A05();
                c23711Eb.A0B("clips/music/");
                c23711Eb.A08(C05F.A0C);
                c23711Eb.A0A = str3;
                c23711Eb.A01 = AbstractC37303Gc4.A0B(userSession, C41297IPm.class, false, true);
                C41748IeM.A01(c23711Eb, musicPageTabType, audioPageAssetModel, null);
                c24531Hw = c23711Eb.A0N();
            }
            C1IA.A00(A00, c42133Ilh, null, null, A052, c24531Hw, str3, j, false, false);
            return;
        }
        MusicPageTabType musicPageTabType2 = this.A01;
        C1ON A03 = c41748IeM.A03(musicPageTabType2, audioPageAssetModel, userSession, null, true, true);
        C1P3 A002 = C1P2.A00(userSession);
        String str4 = audioPageAssetModel.A02;
        C14360o3.A0B(str4, 0);
        C1ON c1on = null;
        long j2 = A05;
        if (z3) {
            C25621Ms A0c = AbstractC167017dG.A0c(userSession);
            A0c.A0B("clips/music/");
            A0c.A08(C05F.A0C);
            A0c.A0A = str4;
            AbstractC37302Gc3.A1M(A0c, userSession, C41297IPm.class);
            C41748IeM.A01(A0c, musicPageTabType2, audioPageAssetModel, null);
            c1on = A0c.A0N();
        }
        C1P3.A00(A002, c42133Ilh, null, null, A03, c1on, str4, j2, false, false);
    }

    @Override // X.C5R4
    public final boolean ARZ(UserSession userSession) {
        return false;
    }

    @Override // X.C5R4
    public final C38321qM B6c(UserSession userSession) {
        return null;
    }

    @Override // X.C5R5
    public final C1ON BDA(UserSession userSession, boolean z) {
        C14360o3.A0B(userSession, 0);
        return C41748IeM.A00.A03(this.A01, this.A02, userSession, null, z, false);
    }

    @Override // X.C5R4
    public final Integer BfR(UserSession userSession) {
        if (C18U.A06(AbstractC25225BEi.A0j(userSession, 0), userSession, 36316117446234112L)) {
            return C1I9.A00(userSession).A06(this.A02.A02, A05, false);
        }
        return C1P2.A00(userSession).A06(this.A02.A02, A05, false);
    }

    @Override // X.C5R5
    public final C1ON C57(UserSession userSession, String str) {
        C14360o3.A0B(userSession, 0);
        return C41748IeM.A00.A03(this.A01, this.A02, userSession, str, false, false);
    }

    @Override // X.C5R6
    public final C24531Hw Co7(Context context, UserSession userSession, Long l, String str, List list, boolean z, boolean z2, boolean z3) {
        AbstractC167007dF.A1E(userSession, 0, list);
        if (A00(userSession)) {
            return C41748IeM.A00.A05(this.A01, this.A02, userSession, null, z, false, C18U.A06(C06090Tz.A05, userSession, 36316117446365186L), true);
        }
        return null;
    }

    @Override // X.C5R6
    public final C24531Hw Co9(Context context, UserSession userSession, String str, List list, boolean z) {
        AbstractC167007dF.A1E(userSession, 0, list);
        if (A00(userSession)) {
            return C41748IeM.A00.A05(this.A01, this.A02, userSession, str, false, false, C18U.A06(C06090Tz.A05, userSession, 36316117446365186L), false);
        }
        return null;
    }

    @Override // X.C5R4
    public final /* synthetic */ void CoG(UserSession userSession, String str) {
    }

    @Override // X.C5R5
    public final /* synthetic */ void ERc(C37682GiJ c37682GiJ) {
    }

    @Override // X.C5R5
    public final /* synthetic */ void ES6(Context context) {
    }

    @Override // X.C5R5
    public final /* synthetic */ void EcO(String str) {
    }

    @Override // X.C5R5
    public final /* synthetic */ void Eee(InterfaceC120815dY interfaceC120815dY) {
    }

    private final boolean A00(UserSession userSession) {
        if (this.A01 != MusicPageTabType.A05) {
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 36316117446168575L) || C18U.A06(c06090Tz, userSession, 36316117446365186L)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C42196Imi(MusicPageTabType musicPageTabType, AudioPageAssetModel audioPageAssetModel, int i, boolean z, boolean z2) {
        this.A02 = audioPageAssetModel;
        this.A00 = i;
        this.A01 = musicPageTabType;
        this.A04 = z;
        this.A03 = z2;
    }

    @Override // X.C5R4
    public final String BfW() {
        throw C00O.createAndThrow();
    }

    @Override // X.C5R5
    public final /* synthetic */ boolean CUz(boolean z) {
        return false;
    }
}
