package X;

import android.app.ActivityManager;
import com.instagram.autoplay.models.AutoplayConfigRoot;
import com.instagram.autoplay.models.AutoplayConfiguration;
import com.instagram.autoplay.models.AutoplayCustomization;
import com.instagram.autoplay.models.AutoplayGlobalConfig;
import com.instagram.autoplay.models.AutoplayLayout;
import com.instagram.autoplay.models.AutoplayWhichVideos;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.Tzr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66113Tzr extends C1P1 {
    public final C66107Tzi A00;
    public final C65865TvS A01;
    public final UserSession A02;
    public final InterfaceC09390do A03;

    public C66113Tzr(C66107Tzi c66107Tzi, C65865TvS c65865TvS, UserSession userSession) {
        int i;
        float f;
        this.A02 = userSession;
        this.A01 = c65865TvS;
        this.A00 = c66107Tzi;
        try {
            i = Runtime.getRuntime().availableProcessors();
        } catch (Exception e) {
            C0K8.A0F("Autoplay", "failed to get numberOfCores", e);
            i = -1;
        }
        Integer valueOf = Integer.valueOf(i);
        try {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            Object systemService = C0B4.A00().getSystemService("activity");
            C14360o3.A0C(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            ((ActivityManager) systemService).getMemoryInfo(memoryInfo);
            f = (float) (memoryInfo.totalMem / Math.pow(10.0d, 9.0d));
        } catch (Exception e2) {
            C0K8.A0F("Autoplay", "failed to get ramCount", e2);
            f = -1.0f;
        }
        Float valueOf2 = Float.valueOf(f);
        C25621Ms A0M = AbstractC31177DnL.A0M(userSession);
        A0M.A03();
        A0M.A0B("api/v1/clips/autoplay_configs/");
        A0M.A0R(C31687Dvs.class, C31684Dvp.class);
        if (valueOf2 != null) {
            A0M.A0C("ram_size_in_gb", f);
        }
        if (valueOf != null) {
            A0M.A0D("core_count", i);
        }
        C1ON A0N = A0M.A0N();
        C14360o3.A0C(A0N, "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.GetClipsAutoplayConfigsResponseIntf>, com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.GetClipsAutoplayConfigsResponseIntf>>");
        A0N.A00 = this;
        C1GJ.A06(A0N, 126117213, 4, true, false);
        this.A03 = AbstractC09440dt.A01(new C50162MDp(this, 38));
    }

    private final AutoplayConfiguration A00(AutoplayLayout autoplayLayout, List list) {
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C66126U0j c66126U0j = (C66126U0j) it.next();
            A0q.add(new AutoplayCustomization(c66126U0j.A03, c66126U0j.A01, c66126U0j.A00, c66126U0j.A02, AutoplayWhichVideos.Companion.valueOf(c66126U0j.A04)));
        }
        return new AutoplayConfiguration(autoplayLayout, AbstractC001800i.A0a(A0q), 0, 0);
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A0N = AbstractC167017dG.A0N(abstractC115105If, 1342790375);
        StringBuilder sb = new StringBuilder();
        sb.append("onFail: ");
        Throwable A01 = abstractC115105If.A01();
        C0K8.A0C("Autoplay", AbstractC166997dE.A0v(A01, sb));
        C0f5 AEp = ((C0f6) this.A03.getValue()).AEp("configOnFail", 126117213);
        AEp.ERI(A01);
        AEp.report();
        super.onFail(abstractC115105If);
        C0f9.A0A(471741230, A0N);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(1396610061);
        C3DC c3dc = (C3DC) obj;
        int A0N = AbstractC167017dG.A0N(c3dc, -1642545119);
        C66127U0k c66127U0k = (C66127U0k) ((XFJ) c3dc.F7f());
        C66125U0i c66125U0i = c66127U0k.A00;
        int i = c66125U0i.A06;
        int i2 = c66125U0i.A05;
        int i3 = c66125U0i.A03;
        boolean z = c66125U0i.A07;
        int i4 = c66125U0i.A02;
        int i5 = c66125U0i.A04;
        AutoplayConfigRoot autoplayConfigRoot = new AutoplayConfigRoot(new AutoplayGlobalConfig(i, i2, i3, z, c66125U0i.A01, c66125U0i.A00, i4, i5), AbstractC16960so.A1Q(A00(AutoplayLayout.EXPLORE_DIAGONAL, c66127U0k.A01), A00(AutoplayLayout.EXPLORE_LOW_DIAGONAL, c66127U0k.A02)));
        C65865TvS c65865TvS = this.A01;
        InterfaceC19630xq interfaceC19630xq = (InterfaceC19630xq) c65865TvS.A06.getValue();
        if (interfaceC19630xq != null) {
            ReentrantReadWriteLock reentrantReadWriteLock = c65865TvS.A05;
            reentrantReadWriteLock.writeLock().lock();
            try {
                try {
                    String A0B = c65865TvS.A02.A0B(autoplayConfigRoot);
                    InterfaceC19610xo ARD = interfaceC19630xq.ARD();
                    ARD.E7K("last_config_from_server", A0B);
                    ARD.apply();
                    c65865TvS.A00 = autoplayConfigRoot;
                } catch (Exception e) {
                    C0K8.A0F("Autoplay", "SharedPreferences exception", e);
                }
            } finally {
                AbstractC65702TsY.A1W(reentrantReadWriteLock);
            }
        }
        this.A00.A00();
        super.onSuccess(c3dc);
        C0f9.A0A(-587995184, A0N);
        C0f9.A0A(-1561799813, A03);
    }
}
