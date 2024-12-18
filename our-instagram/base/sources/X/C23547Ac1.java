package X;

import com.facebook.proxygen.LigerSamplePolicy;
import com.google.common.collect.EvictingQueue;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Ac1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23547Ac1 implements C2JL {
    public final /* synthetic */ C3VR A00;

    public C23547Ac1(C3VR c3vr) {
        this.A00 = c3vr;
    }

    @Override // X.C2JL
    public final void onFailure(Throwable th) {
        this.A00.A01 = null;
    }

    @Override // X.C2JL
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C202098wp c202098wp = (C202098wp) obj;
        final C3VR c3vr = this.A00;
        synchronized (c3vr) {
            c3vr.A01 = null;
        }
        if (c202098wp != null) {
            if ((c202098wp.A02 != null || c202098wp.A0N != null || c202098wp.A03 != null || c202098wp.A0I != null) && c3vr.A03) {
                c3vr.A06.add(c202098wp);
                c3vr.A07.A09().schedule(new Runnable() { // from class: X.8wq
                    @Override // java.lang.Runnable
                    public final void run() {
                        final C3VR c3vr2 = C3VR.this;
                        if (c3vr2.A02 == null) {
                            C0K8.A0C("ForegroundLocation", "Can't upload locations without a user session");
                            return;
                        }
                        EvictingQueue evictingQueue = c3vr2.A06;
                        if (evictingQueue.isEmpty()) {
                            return;
                        }
                        try {
                            if (!AbstractC15820qc.A0E(c3vr2.A04)) {
                                return;
                            }
                            ArrayList arrayList = new ArrayList(evictingQueue);
                            evictingQueue.clear();
                            final int size = arrayList.size();
                            Integer num = C05F.A00;
                            C127625pm A00 = C127625pm.A00(null, num, c3vr2.A08, c3vr2.A09, arrayList, null);
                            UserSession userSession = c3vr2.A02;
                            C14360o3.A0B(userSession, 0);
                            C907542o c907542o = new C907542o(userSession);
                            c907542o.A09(A00);
                            C1ON A07 = c907542o.A07(num);
                            A07.A00 = new C1P1() { // from class: X.8v0
                                @Override // X.C1P1
                                public final void onFail(AbstractC115105If abstractC115105If) {
                                    Throwable A01;
                                    int A03 = C0f9.A03(-781819262);
                                    if (abstractC115105If != null && (A01 = abstractC115105If.A01()) != null) {
                                        C0K8.A0L("ForegroundLocation", "LocationUpdateMutation error (discarding %d locations)", A01, Integer.valueOf(size));
                                        C0w9.A06("ForegroundLocation", "LocationUpdateMutation error", A01);
                                    }
                                    C0f9.A0A(1182316232, A03);
                                }

                                @Override // X.C1P1
                                public final /* bridge */ /* synthetic */ void onSuccess(Object obj2) {
                                    int A03 = C0f9.A03(-2055933243);
                                    C0f9.A0A(-1986668818, C0f9.A03(-755614562));
                                    C0f9.A0A(-2048142037, A03);
                                }
                            };
                            C1GJ.A03(A07);
                        } catch (Exception e) {
                            C0w9.A06("ForegroundLocation", "location-upload", e);
                        }
                    }
                }, LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT, TimeUnit.MILLISECONDS);
            }
        }
    }
}
