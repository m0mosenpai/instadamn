package X;

import android.content.Context;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.common.api.base.CacheBehaviorLogger;
import java.io.File;
import java.io.IOException;

/* renamed from: X.1Gp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C24201Gp implements C1G4 {
    public C1H7 A00;
    public final Context A01;
    public final C1C1 A02;
    public final CacheBehaviorLogger A03;
    public final C1G4 A04;
    public final boolean A05;

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, X.1H3] */
    public static final synchronized C1H7 A00(C24201Gp c24201Gp) {
        C1H7 c1h7;
        C24301Gz c24301Gz;
        synchronized (c24201Gp) {
            c1h7 = c24201Gp.A00;
            if (c1h7 == null) {
                C24211Gq c24211Gq = null;
                try {
                    final C24211Gq c24211Gq2 = new C24211Gq(AbstractC23881Ey.A00().CHo(null, 1557477396), "api", 20);
                    C24231Gs.A00().A01(new InterfaceC13060ls() { // from class: X.1Gt
                        @Override // X.InterfaceC13060ls
                        public final void Cww(AbstractC12990ll abstractC12990ll) {
                            C14360o3.A0B(abstractC12990ll, 0);
                            try {
                                C24211Gq.this.A01(abstractC12990ll);
                            } catch (IOException e) {
                                String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("Could not report logs. %s", e.getLocalizedMessage());
                                C14360o3.A07(formatStrLocaleSafe);
                                C0w9.A03("ig_cache_logger", formatStrLocaleSafe);
                            }
                        }

                        @Override // X.InterfaceC13060ls
                        public final void Cwy(AbstractC12990ll abstractC12990ll) {
                        }
                    });
                    c24211Gq = c24211Gq2;
                } catch (IOException e) {
                    String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("Could not initialize logger. %s", e.getLocalizedMessage());
                    C14360o3.A07(formatStrLocaleSafe);
                    C0w9.A03("ig_cache_logger", formatStrLocaleSafe);
                }
                if (c24201Gp.A05) {
                    File A00 = AbstractC25541Mj.A00(c24201Gp.A01, "http_responses_blocker_journal", false);
                    if (A00 != null) {
                        C29620D2v c29620D2v = new C29620D2v(A00);
                        if (C29620D2v.A01 == null) {
                            C29620D2v.A01 = c29620D2v;
                            C24251Gu A002 = C24251Gu.A00(1557477396);
                            A002.A04 = C29620D2v.A01;
                            C0o0 A003 = AbstractC14350nz.A00();
                            A003.A01 = C24301Gz.class.getName();
                            A002.A02 = new C18240vB(A003);
                            c24301Gz = new C24301Gz(A002.A01(), c24211Gq);
                        } else {
                            throw new IllegalStateException("HttpStoreBlockerManager instance already exists");
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    C24251Gu A004 = C24251Gu.A00(1557477396);
                    C0o0 A005 = AbstractC14350nz.A00();
                    A005.A01 = C24301Gz.class.getName();
                    A004.A02 = new C18240vB(A005);
                    c24301Gz = new C24301Gz(A004.A01(), c24211Gq);
                }
                C24301Gz.A05 = c24301Gz;
                C1G4 c1g4 = c24201Gp.A04;
                ?? obj = new Object();
                C14270nr A006 = C14270nr.A00();
                CacheBehaviorLogger cacheBehaviorLogger = c24201Gp.A03;
                C1C1 c1c1 = c24201Gp.A02;
                c1h7 = new C1H7(obj, cacheBehaviorLogger, c1g4, A006, c24211Gq, c1c1.A04, c1c1.A05);
                c24201Gp.A00 = c1h7;
            }
        }
        return c1h7;
    }

    @Override // X.C1G4
    public final InterfaceC27191Tt startRequest(C1QW c1qw, C1QY c1qy, C26511Qg c26511Qg) {
        C14360o3.A0B(c1qw, 0);
        C14360o3.A0B(c1qy, 1);
        C14360o3.A0B(c26511Qg, 2);
        InterfaceC27191Tt startRequest = A00(this).startRequest(c1qw, c1qy, c26511Qg);
        C14360o3.A07(startRequest);
        return startRequest;
    }

    public C24201Gp(Context context, C1C1 c1c1, CacheBehaviorLogger cacheBehaviorLogger, C1G4 c1g4, boolean z) {
        this.A01 = context;
        this.A02 = c1c1;
        this.A04 = c1g4;
        this.A03 = cacheBehaviorLogger;
        this.A05 = z;
        if (C11T.A08()) {
            C14120nc.A00().ATO(new V63(this));
        } else {
            A00(this);
        }
    }
}
