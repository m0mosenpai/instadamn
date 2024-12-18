package X;

import android.os.Handler;
import android.os.Message;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: X.7sV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C176127sV implements Handler.Callback {
    public InterfaceC176037sM A00;
    public final Handler A01;
    public final /* synthetic */ C176117sU A02;

    private void A00(int i, String str, int i2) {
        if (i2 == 4) {
            this.A02.A04.A03.A02();
        }
        AbstractC223559ty abstractC223559ty = new AbstractC223559ty(i, String.format(null, "%s, msg %s", str, C176117sU.A00(i2)));
        C176097sS c176097sS = this.A02.A04;
        abstractC223559ty.A01(c176097sS.A03());
        c176097sS.A04(abstractC223559ty);
    }

    public C176127sV(Handler handler, InterfaceC176037sM interfaceC176037sM, C176117sU c176117sU) {
        this.A02 = c176117sU;
        this.A01 = handler;
        this.A00 = interfaceC176037sM;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        final int i = message.what;
        final Object obj = message.obj;
        final CountDownLatch countDownLatch = new CountDownLatch(2);
        final String A00 = C176117sU.A00(i);
        final InterfaceC25159BBe interfaceC25159BBe = new InterfaceC25159BBe() { // from class: X.9LV
            @Override // X.InterfaceC25159BBe
            public final void onFinished() {
                String.format(null, "[Executing Finished] %s", A00);
                countDownLatch.countDown();
            }
        };
        try {
            if (this.A01.post(new Runnable() { // from class: X.9LU
                @Override // java.lang.Runnable
                public final void run() {
                    C176097sS c176097sS;
                    List list;
                    AVV avv;
                    String str = A00;
                    String.format(null, "[Executing] %s", str);
                    countDownLatch.countDown();
                    try {
                        int i2 = i;
                        if (i2 != 4 && this.A02.A06.get()) {
                            interfaceC25159BBe.onFinished();
                            return;
                        }
                        C176117sU c176117sU = this.A02;
                        InterfaceC25159BBe interfaceC25159BBe2 = interfaceC25159BBe;
                        Object obj2 = obj;
                        if (i2 != 1) {
                            if (i2 != 2) {
                                if (i2 != 3) {
                                    if (i2 != 4) {
                                        if (i2 == 5) {
                                            c176117sU.A04.A06(interfaceC25159BBe2);
                                            return;
                                        }
                                        throw AbstractC166987dD.A18(AnonymousClass001.A0O("Unknown Recording Operation: ", i2));
                                    }
                                    c176117sU.A04.A07(interfaceC25159BBe2);
                                    c176117sU.A06.set(false);
                                    return;
                                }
                                Object[] objArr = (Object[]) obj2;
                                c176097sS = c176117sU.A04;
                                list = (List) objArr[0];
                                avv = new AVV(c176097sS.A02, new AVT((AGI) objArr[1], (InterfaceC25203BDb) objArr[2], interfaceC25159BBe2, c176097sS), null, c176097sS, list);
                            } else {
                                Object[] objArr2 = (Object[]) obj2;
                                c176117sU.A04.A05((AGI) objArr2[0], (InterfaceC25203BDb) objArr2[1], interfaceC25159BBe2);
                                return;
                            }
                        } else {
                            Object[] objArr3 = (Object[]) obj2;
                            c176097sS = c176117sU.A04;
                            list = (List) objArr3[0];
                            avv = new AVV((Handler) objArr3[2], (InterfaceC176207sd) objArr3[1], interfaceC25159BBe2, c176097sS, list);
                        }
                        C176097sS.A00(avv, c176097sS, list);
                    } catch (Exception e) {
                        C0K8.A0F("RecordingControllerImpl", String.format(null, "Exception during operation %s", str), e);
                        C176127sV c176127sV = this;
                        InterfaceC176037sM interfaceC176037sM = c176127sV.A00;
                        C176117sU c176117sU2 = c176127sV.A02;
                        long A0M = AbstractC166987dD.A0M(c176117sU2);
                        C176097sS c176097sS2 = c176117sU2.A04;
                        interfaceC176037sM.ClA(new C212409b9(e), "recording_controller_error", "RecordingControllerImpl", c176097sS2.A02(), "high", str, A0M);
                        if (i == 4) {
                            c176097sS2.A03.A02();
                        }
                        throw e;
                    }
                }
            })) {
                if (!countDownLatch.await(10L, TimeUnit.SECONDS)) {
                    if (countDownLatch.getCount() == 2) {
                        A00(20002, "Timeout while waiting for operation to start executing", i);
                    } else if (countDownLatch.getCount() == 1) {
                        A00(20001, "Timeout while waiting for operation to finish", i);
                    }
                }
            } else {
                A00(20003, "Couldn't pass operation to queue, most likely it is exiting", i);
            }
            if (i == 5) {
                C176117sU c176117sU = this.A02;
                C175907s4.A02(c176117sU.A00, false, true);
                C175907s4.A02(c176117sU.A01, false, true);
            }
            return true;
        } catch (InterruptedException e) {
            InterfaceC176037sM interfaceC176037sM = this.A00;
            C176117sU c176117sU2 = this.A02;
            interfaceC176037sM.ClA(new C212409b9(e), "recording_controller_error", "RecordingControllerImpl", c176117sU2.A04.A02(), "high", A00, c176117sU2.hashCode());
            throw new RuntimeException("Message thread was interrupted");
        }
    }
}
