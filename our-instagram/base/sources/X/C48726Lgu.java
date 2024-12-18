package X;

import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.pendingmedia.model.ClipInfo;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: X.Lgu, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48726Lgu implements C7FA {
    public final /* synthetic */ C44137Jf2 A00;

    @Override // X.C7FA
    public final void Dke(MessageIdentifier messageIdentifier, List list) {
    }

    @Override // X.C7FA
    public final void Dkg(C26086BgF c26086BgF, Long l, List list) {
    }

    @Override // X.C7FA
    public final void Dzc(C26086BgF c26086BgF, C211689Zc c211689Zc, ClipInfo clipInfo, C47Z c47z, Long l, String str, int i, boolean z) {
        C7TH c7th;
        C14360o3.A0B(clipInfo, 0);
        C44137Jf2 c44137Jf2 = this.A00;
        C31667DvX.A00(c44137Jf2.A0A, "bulk_reply_send", "message_clip");
        Iterator A15 = AbstractC166997dE.A15(c44137Jf2.A04);
        while (A15.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A15);
            if (A1K.getKey() instanceof MsysThreadId) {
                c7th = c44137Jf2.A0C;
            } else {
                c7th = c44137Jf2.A0B;
            }
            AbstractRunnableC133325zz.A02(new C44289Jhf(new C50261MHq(c44137Jf2, 9), 7), c7th.EOh(null, c26086BgF, null, null, (C3o9) A1K.getKey(), clipInfo, c47z, str, "from_bulk_reply", null, null, null, null, ((C31228DoB) A1K.getValue()).A09), new Executor() { // from class: X.M8G
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    C14360o3.A0B(runnable, 0);
                    C11T.A02(runnable);
                }
            });
        }
    }

    public C48726Lgu(C44137Jf2 c44137Jf2) {
        this.A00 = c44137Jf2;
    }

    @Override // X.C7FA
    public final boolean Ccl(int i) {
        C44137Jf2 c44137Jf2 = this.A00;
        Map map = c44137Jf2.A04;
        if (map.isEmpty()) {
            return true;
        }
        Iterator A15 = AbstractC166997dE.A15(map);
        while (A15.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A15);
            Object key = A1K.getKey();
            C31228DoB c31228DoB = (C31228DoB) A1K.getValue();
            if (!C7NG.A01(c44137Jf2.A06, c31228DoB.A01) || (key instanceof MsysThreadId) || c31228DoB.A0A || c31228DoB.A09) {
                return false;
            }
        }
        return true;
    }

    @Override // X.C7FA
    public final void DYV(C26086BgF c26086BgF, C211689Zc c211689Zc, C47Z c47z, C183978Ee c183978Ee, Long l, int i, boolean z) {
        C7TH c7th;
        C44137Jf2 c44137Jf2 = this.A00;
        C31667DvX.A00(c44137Jf2.A0A, "bulk_reply_send", "message_photo");
        Iterator A15 = AbstractC166997dE.A15(c44137Jf2.A04);
        while (A15.hasNext()) {
            Map.Entry A1K = AbstractC166987dD.A1K(A15);
            if (A1K.getKey() instanceof MsysThreadId) {
                c7th = c44137Jf2.A0C;
            } else {
                c7th = c44137Jf2.A0B;
            }
            AbstractRunnableC133325zz.A02(new C44289Jhf(new C50261MHq(c44137Jf2, 8), 7), c7th.ENz(null, c26086BgF, null, null, (C3o9) A1K.getKey(), c47z, c183978Ee, "from_bulk_reply", null, null, null, null, ((C31228DoB) A1K.getValue()).A09), new Executor() { // from class: X.M8F
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    C14360o3.A0B(runnable, 0);
                    C11T.A02(runnable);
                }
            });
        }
    }
}
