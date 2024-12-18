package X;

import com.instagram.common.api.base.CacheBehaviorLogger;
import java.io.IOException;

/* renamed from: X.1H7, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1H7 implements C1G4 {
    public final C1H3 A00;
    public final CacheBehaviorLogger A01;
    public final C1G4 A02;
    public final InterfaceC14020nS A03;
    public final C14270nr A04;
    public final C24211Gq A05;
    public final boolean A06;
    public final boolean A07;

    public static void A00(C1QW c1qw, Integer num) {
        C226418s A01;
        String str;
        java.net.URI uri = c1qw.A09;
        if (uri.getPath() != null && uri.getPath().contains("/feed/timeline")) {
            int intValue = num.intValue();
            if (intValue != 0) {
                A01 = C226218q.A01(AbstractC12960li.A00);
                if (intValue != 1) {
                    str = "FEED_REQUEST_CACHE_LAYER_END";
                } else {
                    str = "FEED_REQUEST_CACHE_LAYER_TASK_START";
                }
            } else {
                A01 = C226218q.A01(AbstractC12960li.A00);
                str = "FEED_REQUEST_CACHE_LAYER_START";
            }
            A01.A0P(A01.A02, str);
        }
    }

    @Override // X.C1G4
    public final InterfaceC27191Tt startRequest(final C1QW c1qw, C1QY c1qy, final C26511Qg c26511Qg) {
        java.net.URI uri = c1qw.A09;
        C18C.A07(uri.getPath(), "require a valid url");
        Integer num = C05F.A00;
        A00(c1qw, num);
        CacheBehaviorLogger cacheBehaviorLogger = this.A01;
        cacheBehaviorLogger.markerStartWithAnnotations(c1qw, c1qy);
        Integer num2 = c1qy.A0C;
        String str = c1qy.A04;
        if (str != null && num2 != num && num2 != C05F.A0u) {
            Integer num3 = C05F.A0C;
            if ((num2 == num3 || num2 == C05F.A0Y || num2 == C05F.A0N || num2 == C05F.A0j) && C24301Gz.A05.A02(str)) {
                C24301Gz c24301Gz = C24301Gz.A05;
                C1Ef A00 = c1qy.A00();
                try {
                    C23781El A002 = new C3IK(str).A01(A00, c24301Gz.A00, c24301Gz.A01, false).A00();
                    if (A002 != null) {
                        long parseLong = Long.parseLong(A002.A01);
                        if (Long.valueOf(parseLong) != null) {
                            long j = c1qy.A01;
                            if (j == -1 || System.currentTimeMillis() - parseLong <= j) {
                                final RunnableC71403Id runnableC71403Id = new RunnableC71403Id(c26511Qg, c1qw, c1qy, this, parseLong);
                                if (this.A07) {
                                    runnableC71403Id.run();
                                } else {
                                    this.A03.ATO(new V6M(runnableC71403Id, this));
                                }
                                if (uri.getPath() != null) {
                                    String path = uri.getPath();
                                    C14360o3.A0B(path, 0);
                                    ((C1RV) C1RV.A01.getValue()).ClI(path, true);
                                }
                                return new InterfaceC27191Tt() { // from class: X.3L0
                                    @Override // X.InterfaceC27201Tu
                                    public final void FAL(C1Ef c1Ef) {
                                        RunnableC71403Id runnableC71403Id2 = runnableC71403Id;
                                        InterfaceC27191Tt interfaceC27191Tt = runnableC71403Id2.A01;
                                        if (interfaceC27191Tt != null) {
                                            interfaceC27191Tt.FAL(c1Ef);
                                        } else {
                                            runnableC71403Id2.A02 = c1Ef;
                                        }
                                    }

                                    @Override // X.InterfaceC27201Tu
                                    public final void cancel() {
                                        RunnableC71403Id runnableC71403Id2 = runnableC71403Id;
                                        InterfaceC27191Tt interfaceC27191Tt = runnableC71403Id2.A01;
                                        if (interfaceC27191Tt != null) {
                                            interfaceC27191Tt.cancel();
                                        } else {
                                            runnableC71403Id2.A04 = true;
                                        }
                                    }

                                    @Override // X.InterfaceC27201Tu
                                    public final int getRequestId() {
                                        return c1qw.A04;
                                    }
                                };
                            }
                        }
                    }
                } catch (IOException unused) {
                }
            }
            cacheBehaviorLogger.markerPoint(c1qw, CacheBehaviorLogger.CACHE_MISS);
            if (!this.A06 ? !(num2 != num3 || C24301Gz.A05.A02(str)) : num2 == num3) {
                this.A03.ATO(new AbstractRunnableC14200nk() { // from class: X.4pY
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(553);
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C26511Qg c26511Qg2 = c26511Qg;
                        C1QW c1qw2 = c1qw;
                        c26511Qg2.A04(c1qw2, new IOException("RequestCacheServiceLayer: no content"));
                        this.A01.markerEnd(c1qw2, (short) 3);
                    }
                });
                return new InterfaceC27191Tt() { // from class: X.4pZ
                    @Override // X.InterfaceC27201Tu
                    public final void FAL(C1Ef c1Ef) {
                    }

                    @Override // X.InterfaceC27201Tu
                    public final void cancel() {
                    }

                    @Override // X.InterfaceC27201Tu
                    public final int getRequestId() {
                        return c1qw.A04;
                    }
                };
            }
            C24301Gz.A05.A01(c26511Qg, c1qw, str);
            if (uri.getPath() != null) {
                String path2 = uri.getPath();
                C14360o3.A0B(path2, 0);
                ((C1RV) C1RV.A01.getValue()).ClI(path2, false);
            }
            A00(c1qw, num3);
        } else {
            A00(c1qw, C05F.A0C);
        }
        cacheBehaviorLogger.markerPoint(c1qw, CacheBehaviorLogger.PASS_TO_NEXT_LAYER);
        return this.A02.startRequest(c1qw, c1qy, c26511Qg);
    }

    public C1H7(C1H3 c1h3, CacheBehaviorLogger cacheBehaviorLogger, C1G4 c1g4, C14270nr c14270nr, C24211Gq c24211Gq, boolean z, boolean z2) {
        C0o0 A00 = AbstractC14350nz.A00();
        A00.A01 = "request_cache_layer";
        C18240vB c18240vB = new C18240vB(A00);
        this.A02 = c1g4;
        this.A03 = c18240vB;
        this.A00 = c1h3;
        this.A04 = c14270nr;
        this.A05 = c24211Gq;
        this.A01 = cacheBehaviorLogger;
        this.A06 = z;
        this.A07 = z2;
    }
}
