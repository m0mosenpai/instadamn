package X;

import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxNullable;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import java.util.concurrent.Executor;

/* renamed from: X.5yZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C132505yZ {
    public final C1345666g A00;
    public final UserSession A01;
    public final C132595yi A02;
    public final C132585yh A03;
    public final C60H A04;
    public final C132605yj A05;
    public final C60L A06;
    public final C132515ya A07;
    public final Executor A08;

    /* JADX WARN: Type inference failed for: r3v0, types: [X.5yi] */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.5yh] */
    public C132505yZ(C132465yV c132465yV, C1345666g c1345666g, final UserSession userSession) {
        ExecutorC14040nU executorC14040nU = new ExecutorC14040nU(C14120nc.A00(), 874464186, 2, false, true);
        C60H c60h = new C60H(userSession);
        C132515ya A00 = C60J.A00(userSession);
        final C132565yf c132565yf = new C132565yf(c132465yV);
        ?? r4 = new MailboxCallback(userSession, c132565yf) { // from class: X.5yh
            public final UserSession A00;
            public final C132565yf A01;
            public final C60H A02;
            public final C132495yY A03;
            public final C132515ya A04;
            public final C23031Ai A05;

            {
                C60H c60h2 = new C60H(userSession);
                C132515ya A002 = C60J.A00(userSession);
                C23031Ai A003 = AbstractC23021Ah.A00(userSession);
                C132495yY c132495yY = new C132495yY(C13920nI.A00, A003);
                C14360o3.A0B(A002, 4);
                C14360o3.A0B(A003, 5);
                this.A00 = userSession;
                this.A01 = c132565yf;
                this.A02 = c60h2;
                this.A04 = A002;
                this.A05 = A003;
                this.A03 = c132495yY;
            }

            /* JADX WARN: Removed duplicated region for block: B:102:0x03ad  */
            /* JADX WARN: Removed duplicated region for block: B:13:0x006c  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x008b  */
            /* JADX WARN: Removed duplicated region for block: B:19:0x00ca  */
            /* JADX WARN: Type inference failed for: r25v0, types: [java.lang.Object, X.50B] */
            @Override // com.facebook.msys.mca.MailboxCallback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final /* bridge */ /* synthetic */ void onCompletion(java.lang.Object r49) {
                /*
                    Method dump skipped, instructions count: 994
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C132585yh.onCompletion(java.lang.Object):void");
            }
        };
        final C132565yf c132565yf2 = new C132565yf(c132465yV);
        ?? r3 = new MailboxCallback(userSession, c132565yf2) { // from class: X.5yi
            public final UserSession A00;
            public final C132565yf A01;
            public final C60H A02;

            {
                C60H c60h2 = new C60H(userSession);
                this.A00 = userSession;
                this.A01 = c132565yf2;
                this.A02 = c60h2;
            }

            @Override // com.facebook.msys.mca.MailboxCallback
            public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
                MailboxNullable mailboxNullable = (MailboxNullable) obj;
                C14360o3.A0B(mailboxNullable, 0);
                AbstractC1351869s abstractC1351869s = (AbstractC1351869s) mailboxNullable.value;
                if (abstractC1351869s != null) {
                    int count = abstractC1351869s.mResultSet.getCount();
                    for (int i = 0; i < count; i++) {
                        C132565yf c132565yf3 = this.A01;
                        UserSession userSession2 = this.A00;
                        Long nullableLong = abstractC1351869s.mResultSet.getNullableLong(i, 8);
                        Long nullableLong2 = abstractC1351869s.mResultSet.getNullableLong(i, 9);
                        int integer = abstractC1351869s.mResultSet.getInteger(i, 13);
                        int integer2 = abstractC1351869s.mResultSet.getInteger(i, 11);
                        if (nullableLong != null && (nullableLong2 != null || (integer2 == 18 && integer == 10))) {
                            String string = abstractC1351869s.mResultSet.getString(i, 15);
                            if (string != null) {
                                LIY.A02.A00().A00(C132565yf.A00(userSession2, new SimpleImageUrl(abstractC1351869s.mResultSet.getString(i, 22)), c132565yf3, nullableLong2, abstractC1351869s.mResultSet.getString(i, 4), abstractC1351869s.mResultSet.getString(i, 3), abstractC1351869s.mResultSet.getString(i, 5), string, String.valueOf(abstractC1351869s.mResultSet.getString(i, 25)), String.valueOf(abstractC1351869s.mResultSet.getLong(i, 2)), abstractC1351869s.mResultSet.getString(i, 18), abstractC1351869s.mResultSet.getString(i, 17), integer2, integer, nullableLong.longValue()), userSession2);
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        } else {
                            C0w9.A04("notification_threadPk_null_or_messagePK_null", "No group invite notification should be rendered", 1);
                            C60H c60h2 = this.A02;
                            C54s c54s = new C54s(C913045j.A00);
                            c54s.A0G("is_bg_account", false);
                            c54s.A0G("skips_sync", false);
                            C60H.A01(c60h2, null, null, "ARMADILLO_NOTIFICATIONS_PRESENT_CLIENT_NOTIFICATION_ERROR", null, null, c54s.toString(), null);
                        }
                    }
                }
            }
        };
        C60L A002 = C60K.A00(userSession);
        C132605yj c132605yj = (C132605yj) userSession.A01(C132605yj.class, new MHJ(userSession, 27));
        C14360o3.A0B(A00, 5);
        C14360o3.A0B(c132605yj, 9);
        this.A01 = userSession;
        this.A00 = c1345666g;
        this.A08 = executorC14040nU;
        this.A04 = c60h;
        this.A07 = A00;
        this.A03 = r4;
        this.A02 = r3;
        this.A06 = A002;
        this.A05 = c132605yj;
    }
}
