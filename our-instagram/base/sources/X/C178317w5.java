package X;

import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.7w5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C178317w5 extends C178327w6 implements InterfaceC178337w7 {
    public static final List A01 = Arrays.asList("instagram_media_composition_player", "instagram_reels_postcapture_player", "instagram_stories_postcapture_player", "instagram_stories_reel_memory_share", "instagram_stories_mention_reshare", "instagram_stories_shoutout_share", "instagram_stories_igtv_share", "instagram_stories_reels_reshare", "instagram_stories_photo_credit", "instagram_direct_postcapture_player");
    public final UserSession A00;

    @Override // X.C178327w6, X.InterfaceC178337w7
    public final int ArS(int i) {
        if (i != 1008) {
            return super.ArS(i);
        }
        if (!AbstractC177217uH.A00(AbstractC12290kX.A00)) {
            return 3000;
        }
        return 6000;
    }

    @Override // X.C178327w6, X.InterfaceC178337w7
    public final long B5H(int i) {
        UserSession userSession;
        C06090Tz c06090Tz;
        long j;
        if (i != 13) {
            switch (i) {
                case Process.SIGSTOP /* 19 */:
                case 20:
                    return 0L;
                case 21:
                    userSession = this.A00;
                    if (AbstractC195898lZ.A00(AbstractC12290kX.A00, userSession)) {
                        return 0L;
                    }
                    c06090Tz = C06090Tz.A05;
                    j = 36593293161923673L;
                    break;
                case 22:
                    userSession = this.A00;
                    if (AbstractC195898lZ.A00(AbstractC12290kX.A00, userSession)) {
                        return 0L;
                    }
                    c06090Tz = C06090Tz.A06;
                    j = 36593293162054746L;
                    break;
                default:
                    return super.B5H(i);
            }
            return Long.valueOf(C18U.A01(c06090Tz, userSession, j)).longValue();
        }
        return 40L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x010b, code lost:
    
        if (((X.InterfaceC178407wE) r6.A00.Aq1(X.InterfaceC178407wE.A00)).BhE().equals("instagram_note") == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x029f, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r6.A00, 36320597097063105L) == false) goto L103;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:26:0x0010. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x0013. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:28:0x0016. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:29:0x0019. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x001c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x000a. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x000d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:14:0x02c8 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    @Override // X.C178327w6, X.InterfaceC178337w7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean CUZ(int r7) {
        /*
            Method dump skipped, instructions count: 904
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C178317w5.CUZ(int):boolean");
    }

    public C178317w5(InterfaceC178207vu interfaceC178207vu) {
        super.A00 = interfaceC178207vu;
        this.A00 = (UserSession) A06(InterfaceC178047vd.A00);
    }

    @Deprecated
    public C178317w5(UserSession userSession) {
        this.A00 = userSession;
    }
}
