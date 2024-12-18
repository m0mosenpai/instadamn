package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.direct.disappearingmode.expiration.OpenDisappearingMessagesExpirationWorker;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* renamed from: X.4qa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C106204qa implements InterfaceC13000lm {
    public Long A00;
    public final C2L1 A01;
    public final C25671My A02;
    public final InterfaceC41501vz A03;
    public final InterfaceC12870lZ A04;
    public final UserSession A05;
    public final String A06;
    public final long A07;

    public C106204qa(Context context, UserSession userSession) {
        C14360o3.A0B(userSession, 2);
        this.A05 = userSession;
        this.A06 = AnonymousClass001.A0R("disMsgExpiration:", userSession.token);
        C2L1 A00 = C2L1.A00(context);
        C14360o3.A07(A00);
        this.A01 = A00;
        this.A07 = C18U.A01(C06090Tz.A05, userSession, 36607067121194529L);
        this.A02 = AbstractC25651Mw.A00(userSession);
        this.A03 = new InterfaceC41501vz() { // from class: X.4qb
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                Long valueOf;
                int i;
                Long valueOf2;
                int A03 = C0f9.A03(477862563);
                int A032 = C0f9.A03(-1308549522);
                C106204qa c106204qa = C106204qa.this;
                c106204qa.A02.A02(c106204qa.A03, C2Im.class);
                C218914p.A03(EnumC220415e.A03, c106204qa.A04);
                C2DU c2du = (C2DU) C2JD.A00(c106204qa.A05);
                synchronized (c2du) {
                    Iterator it = c2du.A0F.A08().iterator();
                    long j = Long.MAX_VALUE;
                    while (it.hasNext()) {
                        C4GV c4gv = (C4GV) ((Map.Entry) it.next()).getValue();
                        synchronized (c4gv) {
                            UserSession userSession2 = c4gv.A0H;
                            C14360o3.A0B(userSession2, 0);
                            C116345On c116345On = (C116345On) userSession2.A01(C116345On.class, new MHL(userSession2, 11));
                            Iterator it2 = c4gv.A0K.iterator();
                            long j2 = Long.MAX_VALUE;
                            while (it2.hasNext()) {
                                Long A002 = c116345On.A00((C83403nh) it2.next());
                                if (A002 != null) {
                                    long longValue = A002.longValue();
                                    if (longValue < j2) {
                                        j2 = longValue;
                                    }
                                }
                            }
                            if (j2 == Long.MAX_VALUE) {
                                valueOf2 = null;
                            } else {
                                valueOf2 = Long.valueOf(j2);
                            }
                        }
                        if (valueOf2 != null) {
                            long longValue2 = valueOf2.longValue();
                            if (longValue2 < j) {
                                j = longValue2;
                            }
                        }
                    }
                    if (j == Long.MAX_VALUE) {
                        valueOf = null;
                    } else {
                        valueOf = Long.valueOf(j);
                    }
                }
                if (valueOf != null) {
                    c106204qa.A01(valueOf.longValue());
                    i = 1533108185;
                } else {
                    i = -1616180216;
                }
                C0f9.A0A(i, A032);
                C0f9.A0A(-794575629, A03);
            }
        };
        this.A04 = new InterfaceC12870lZ() { // from class: X.4qc
            @Override // X.InterfaceC12870lZ
            public final void onAppBackgrounded() {
                int A03 = C0f9.A03(-184540720);
                C106204qa c106204qa = C106204qa.this;
                Long A002 = C106204qa.A00(c106204qa, System.currentTimeMillis());
                if (A002 != null) {
                    c106204qa.A00 = A002;
                    c106204qa.A01.A05(c106204qa.A06);
                }
                C0f9.A0A(1782762717, A03);
            }

            @Override // X.InterfaceC12870lZ
            public final void onAppForegrounded() {
                int A03 = C0f9.A03(-1430774845);
                C106204qa c106204qa = C106204qa.this;
                Long l = c106204qa.A00;
                if (l != null) {
                    c106204qa.A01(l.longValue());
                }
                c106204qa.A00 = null;
                C0f9.A0A(-312732452, A03);
            }
        };
    }

    public static final Long A00(C106204qa c106204qa, long j) {
        C2L1 c2l1 = c106204qa.A01;
        QAL qal = new QAL(c2l1, c106204qa.A06);
        ((C2LB) c2l1.A06).A01.execute(qal);
        C49182Nr c49182Nr = ((C3EH) qal).A00;
        C14360o3.A07(c49182Nr);
        try {
            Object obj = c49182Nr.get();
            C14360o3.A07(obj);
            SPO spo = (SPO) AbstractC001800i.A0J((List) obj);
            if (spo == null) {
                return Long.MAX_VALUE;
            }
            EnumC48482Kp enumC48482Kp = spo.A05;
            int ordinal = enumC48482Kp.ordinal();
            if (ordinal != 0 && ordinal != 2) {
                if (ordinal != 1) {
                    if (ordinal != 5) {
                        C18950wb c18950wb = C18950wb.A01;
                        StringBuilder sb = new StringBuilder();
                        sb.append("Unexpected WorkInfo.State status of expiration job:  ");
                        sb.append(enumC48482Kp);
                        c18950wb.AEp(sb.toString(), 601233463).report();
                        return null;
                    }
                    return Long.MAX_VALUE;
                }
                return Long.valueOf(j);
            }
            return Long.valueOf(spo.A02);
        } catch (InterruptedException | ExecutionException e) {
            C0f5 AEp = C18950wb.A01.AEp("Failed to fetch status of expiration job", 601233463);
            AEp.ERI(e);
            AEp.report();
            return null;
        }
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        this.A01.A05(this.A06);
        this.A02.A02(this.A03, C2Im.class);
        C218914p.A06(this.A04);
    }

    public final void A01(long j) {
        if (C218914p.A08()) {
            this.A00 = Long.valueOf(j);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        Long A00 = A00(this, currentTimeMillis);
        if (A00 != null) {
            long longValue = A00.longValue();
            if (longValue == currentTimeMillis) {
                long j2 = this.A07 + currentTimeMillis;
                if (j < j2) {
                    j = j2;
                }
            } else if (longValue <= j) {
                return;
            }
        }
        long j3 = j - currentTimeMillis;
        if (j3 < 0) {
            j3 = 0;
        }
        C2L1 c2l1 = this.A01;
        String str = this.A06;
        Integer num = C05F.A00;
        AbstractC48382Kf abstractC48382Kf = new AbstractC48382Kf(OpenDisappearingMessagesExpirationWorker.class);
        C48552Kx c48552Kx = new C48552Kx();
        String str2 = this.A05.token;
        c48552Kx.A00.put(AbstractC43591JPw.A00(464), str2);
        abstractC48382Kf.A00.A0C = c48552Kx.A00();
        abstractC48382Kf.A03(S81.A00);
        abstractC48382Kf.A02(j3, TimeUnit.MILLISECONDS);
        c2l1.A02((QA7) abstractC48382Kf.A00(), num, str);
    }
}
