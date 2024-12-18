package X;

import android.content.Context;
import android.os.Handler;
import com.instagram.common.session.UserSession;
import com.instagram.jobscheduler.bgfetch.IgBgFetchJob;
import com.instagram.jobscheduler.bgfetch.IgBgFetchJobRun;
import com.instagram.jobscheduler.bgfetch.IgBgFetchMetadata;
import com.instagram.jobscheduler.bgfetch.IgBgFetchPendingJob;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.OaV, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55075OaV {
    public C107224sT A00;
    public List A01;
    public boolean A02;
    public boolean A03;
    public final long A04;
    public final Context A05;
    public final Handler A06;
    public final UserSession A07;
    public final IgBgFetchJobRun A08;
    public final IgBgFetchMetadata A09;
    public final IgBgFetchPendingJob A0A;
    public final LG1 A0B;
    public final List A0C;
    public final List A0D;
    public final C19L A0E;
    public final L21 A0F;

    public C55075OaV(Context context, UserSession userSession, IgBgFetchMetadata igBgFetchMetadata, IgBgFetchPendingJob igBgFetchPendingJob, L21 l21, LG1 lg1, List list, C19L c19l, long j) {
        AbstractC167007dF.A1I(lg1, 5, c19l);
        this.A05 = context;
        this.A09 = igBgFetchMetadata;
        this.A0A = igBgFetchPendingJob;
        this.A07 = userSession;
        this.A0B = lg1;
        this.A0F = l21;
        this.A0D = list;
        this.A0E = c19l;
        this.A04 = j;
        this.A08 = new IgBgFetchJobRun(igBgFetchPendingJob.A01.A00, igBgFetchPendingJob.A00);
        this.A06 = AbstractC167007dF.A0J();
        this.A0C = AbstractC166987dD.A1E();
    }

    private final void A00() {
        if (!this.A03) {
            this.A03 = true;
            IgBgFetchJobRun igBgFetchJobRun = this.A08;
            igBgFetchJobRun.A00 = System.currentTimeMillis();
            C107224sT c107224sT = this.A00;
            if (c107224sT != null) {
                List list = this.A01;
                if (list == null) {
                    list = C16930sl.A00;
                }
                List list2 = c107224sT.A06;
                OAO oao = (OAO) AbstractC001800i.A0J(list2);
                if (oao != null) {
                    list2.remove(0);
                    if (oao.A00 != igBgFetchJobRun.A02) {
                        C0w9.A03("IgBgFetchScheduler", "Missmatch of the job id in the queue");
                    }
                    oao.A02.invoke();
                } else {
                    C0w9.A03("IgBgFetchScheduler", "Complited run for job not in the queue");
                }
                c107224sT.A00 = null;
                long currentTimeMillis = System.currentTimeMillis();
                C107224sT.A04(c107224sT, list);
                IgBgFetchMetadata A00 = C107224sT.A00(c107224sT);
                ArrayList A0q = AbstractC167017dG.A0q(list);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    A0q.add(new IgBgFetchPendingJob((IgBgFetchJob) it.next(), currentTimeMillis));
                }
                C107224sT.A01(new IgBgFetchMetadata(AbstractC001800i.A0T(igBgFetchJobRun, A00.A01), AbstractC001800i.A0S(A0q, A00.A02), A00.A00), c107224sT);
                OAO oao2 = (OAO) AbstractC001800i.A0J(list2);
                if (oao2 != null) {
                    list2.remove(0);
                    C107224sT.A02(oao2, c107224sT);
                }
            }
        }
    }

    public static final void A01(C55075OaV c55075OaV) {
        if (c55075OaV.A02 && c55075OaV.A0C.isEmpty() && c55075OaV.A01 != null) {
            c55075OaV.A00();
        }
    }

    public final void A02() {
        for (OIT oit : this.A0C) {
            if (!oit.A02) {
                oit.A02 = true;
                InterfaceC16820sZ interfaceC16820sZ = oit.A01;
                if (interfaceC16820sZ != null) {
                    interfaceC16820sZ.invoke();
                }
            }
        }
        A00();
    }
}
