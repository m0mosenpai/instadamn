package X;

import com.instagram.common.session.UserSession;
import com.instagram.monetization.repository.MonetizationRepository;
import com.instagram.user.model.UpcomingEvent;
import com.instagram.video.live.mvvm.model.repository.IgLiveSchedulingRepository;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* renamed from: X.MgH, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51010MgH extends AbstractC52922bZ {
    public final C2GT A00;
    public final C25671My A01;
    public final C171537kj A02;
    public final MonetizationRepository A03;
    public final C141986bH A04;
    public final UpcomingEvent A05;
    public final OUK A06;
    public final IgLiveSchedulingRepository A07;
    public final String A08;
    public final InterfaceC24731Iq A09;
    public final InterfaceC19390xP A0A;
    public final C05A A0B;
    public final C05A A0C;
    public final C05A A0D;
    public final C05A A0E;
    public final C05A A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final UserSession A0I;

    /* JADX WARN: Code restructure failed: missing block: B:43:0x004e, code lost:
    
        if (r17.A0H == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0055, code lost:
    
        if (r29 != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C51010MgH(X.C25671My r18, com.instagram.common.session.UserSession r19, X.C171537kj r20, com.instagram.monetization.repository.MonetizationRepository r21, X.C141986bH r22, com.instagram.user.model.UpcomingEvent r23, X.OUK r24, com.instagram.video.live.mvvm.model.repository.IgLiveSchedulingRepository r25, java.lang.String r26, boolean r27, boolean r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51010MgH.<init>(X.1My, com.instagram.common.session.UserSession, X.7kj, com.instagram.monetization.repository.MonetizationRepository, X.6bH, com.instagram.user.model.UpcomingEvent, X.OUK, com.instagram.video.live.mvvm.model.repository.IgLiveSchedulingRepository, java.lang.String, boolean, boolean, boolean):void");
    }

    public static final boolean A00(Date date) {
        if (date != null && date.getTime() >= System.currentTimeMillis() + AbstractC43593JPy.A09(TimeUnit.HOURS) && date.getTime() <= System.currentTimeMillis() + TimeUnit.DAYS.toMillis(90L)) {
            return true;
        }
        return false;
    }
}
