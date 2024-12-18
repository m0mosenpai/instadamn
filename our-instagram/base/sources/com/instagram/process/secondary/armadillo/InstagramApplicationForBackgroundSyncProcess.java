package com.instagram.process.secondary.armadillo;

import X.AbstractC09440dt;
import X.AbstractC12290kX;
import X.AbstractC16960so;
import X.AbstractC211911v;
import X.AbstractC215513h;
import X.AbstractC25228BEl;
import X.AbstractC28481Zj;
import X.AnonymousClass129;
import X.AnonymousClass140;
import X.AnonymousClass143;
import X.C11X;
import X.C12A;
import X.C12D;
import X.C12H;
import X.C14360o3;
import X.C17090t4;
import X.C1RQ;
import X.C211011m;
import X.C211211o;
import X.C28441Zf;
import X.C28451Zg;
import X.C28461Zh;
import X.C28471Zi;
import X.C28551Zq;
import X.C2ZO;
import X.C54110Nw8;
import X.C57255Pbd;
import X.C57396Pdu;
import X.EnumC09460dv;
import X.GSw;
import X.InterfaceC07710an;
import X.InterfaceC09390do;
import android.content.Context;
import android.content.res.Resources;
import android.provider.Settings;
import com.instagram.direct.disappearingmode.impl.DisappearingModePluginImpl;
import com.instagram.process.secondary.InstagramApplicationForSecondaryProcess;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes9.dex */
public final class InstagramApplicationForBackgroundSyncProcess extends InstagramApplicationForSecondaryProcess implements InterfaceC07710an {
    public static final C54110Nw8 Companion = new Object();
    public static final String TAG = "InstagramApplicationForBackgroundSyncProcess";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstagramApplicationForBackgroundSyncProcess(Context context) {
        super(context);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, X.1Zf] */
    @Override // com.instagram.process.secondary.InstagramApplicationForSecondaryProcess, X.AbstractC12280kW
    public void onCreate(String str, long j, long j2, long j3, long j4) {
        C14360o3.A0B(str, 0);
        super.onCreate(str, j, j2, j3, j4);
        Context context = this.context;
        AbstractC12290kX.A00 = context;
        C1RQ.A03 = new C1RQ(context);
        C17090t4 c17090t4 = new C17090t4();
        C57255Pbd c57255Pbd = new C57255Pbd(44, c17090t4, this);
        C211011m c211011m = C211011m.A00;
        C211211o c211211o = new C211211o(c211011m, c57255Pbd, 5);
        AbstractC211911v A00 = c211211o.A00();
        C211211o c211211o2 = new C211211o(c211011m, new GSw(this, 21), 44);
        AbstractC211911v A002 = c211211o2.A00();
        C12H c12h = new C12H(this.context, c211211o, c211211o2, null, false);
        InterfaceC09390do A003 = AbstractC09440dt.A00(EnumC09460dv.A02, C57396Pdu.A00);
        C12A c12a = new C12A(this.context, c17090t4, A003);
        AnonymousClass129 anonymousClass129 = new AnonymousClass129(this.context, c211211o, A003);
        C12D c12d = new C12D(this.context, c211211o, null, A003);
        AbstractC215513h.A01();
        List A1Q = AbstractC16960so.A1Q(A00, A002, c12h, c12a, anonymousClass129, c12d, new AnonymousClass140(c211211o, AbstractC215513h.A00(this.context)), new AnonymousClass143(this.context, c211211o));
        C14360o3.A07(String.format(Locale.US, "Initialization %d initializers sequentially", Arrays.copyOf(AbstractC25228BEl.A1Y(A1Q.size()), 1)));
        Iterator it = A1Q.iterator();
        while (it.hasNext()) {
            ((AbstractC211911v) it.next()).A03();
        }
        C2ZO.A01.A00();
        C28441Zf.A00 = new Object();
        AbstractC28481Zj.A00 = new C28471Zi(C28461Zh.A00, C28451Zg.A00);
        C28551Zq.A00(this.context).A01(Settings.System.DEFAULT_NOTIFICATION_URI);
        try {
            Object newInstance = Class.forName("com.instagram.direct.disappearingmode.impl.DisappearingModePluginImpl").newInstance();
            C14360o3.A0C(newInstance, "null cannot be cast to non-null type com.instagram.direct.disappearingmode.intf.DisappearingModePlugin");
            DisappearingModePluginImpl disappearingModePluginImpl = (DisappearingModePluginImpl) newInstance;
            C14360o3.A0B(disappearingModePluginImpl, 0);
            DisappearingModePluginImpl.A01 = disappearingModePluginImpl;
        } catch (Exception unused) {
        }
    }

    @Override // X.InterfaceC07710an
    public Resources getOverridingResources() {
        if (C11X.A01) {
            return C11X.A00().A01();
        }
        return null;
    }
}
