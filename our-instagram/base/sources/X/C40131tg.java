package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.constants.ShareType;
import com.instagram.pendingmedia.service.impl.NetworkRetryWorker;
import com.instagram.pendingmedia.service.impl.PendingMediaWorker;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1tg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C40131tg {
    public final synchronized C40121td A01(Context context, UserSession userSession) {
        C14360o3.A0B(context, 0);
        C14360o3.A0B(userSession, 1);
        return (C40121td) userSession.A01(C40121td.class, new C9F9(46, context.getApplicationContext(), userSession));
    }

    public final void A02(C2L1 c2l1, C45107Jxb c45107Jxb) {
        C14360o3.A0B(c2l1, 0);
        String str = c45107Jxb.A04;
        String A0R = AnonymousClass001.A0R("PENDING_MEDIA_NETWORK-", str);
        Integer num = C05F.A01;
        AbstractC48382Kf abstractC48382Kf = new AbstractC48382Kf(NetworkRetryWorker.class);
        abstractC48382Kf.A05(str);
        abstractC48382Kf.A05("PENDING_MEDIA_NETWORK");
        abstractC48382Kf.A00.A0C = c45107Jxb.A00();
        C48362Kd c48362Kd = new C48362Kd();
        c48362Kd.A01(num);
        abstractC48382Kf.A03(c48362Kd.A00());
        c2l1.A02((QA7) abstractC48382Kf.A00(), num, A0R);
    }

    public final void A03(C2L1 c2l1, C45107Jxb c45107Jxb, Integer num, boolean z, boolean z2) {
        C14360o3.A0B(c2l1, 0);
        String str = c45107Jxb.A04;
        String A0R = AnonymousClass001.A0R("PENDING_MEDIA_UPLOAD-", str);
        StringBuilder sb = new StringBuilder();
        sb.append("PENDING_MEDIA_UPLOAD-");
        ShareType shareType = c45107Jxb.A03;
        C14360o3.A0B(shareType, 0);
        AbstractC54098Nvw abstractC54098Nvw = AbstractC54098Nvw.$redex_init_class;
        switch (shareType.ordinal()) {
            case 0:
            case 7:
            case 8:
                shareType = ShareType.A0H;
                break;
            case 1:
            case 3:
                shareType = ShareType.A0E;
                break;
            case 2:
            case 4:
                shareType = ShareType.A0V;
                break;
            case 9:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                shareType = ShareType.A08;
                break;
        }
        sb.append(shareType);
        List singletonList = Collections.singletonList(sb.toString());
        C14360o3.A07(singletonList);
        AbstractC48382Kf abstractC48382Kf = new AbstractC48382Kf(PendingMediaWorker.class);
        abstractC48382Kf.A05(str);
        abstractC48382Kf.A05("PENDING_MEDIA_UPLOAD");
        Iterator it = singletonList.iterator();
        while (it.hasNext()) {
            abstractC48382Kf.A05((String) it.next());
        }
        if (z) {
            Integer num2 = C05F.A00;
            C48412Ki c48412Ki = abstractC48382Kf.A00;
            c48412Ki.A0J = true;
            c48412Ki.A0G = num2;
        }
        abstractC48382Kf.A00.A0C = c45107Jxb.A00();
        abstractC48382Kf.A04(C05F.A01, TimeUnit.MILLISECONDS, 10000L);
        QA7 qa7 = (QA7) abstractC48382Kf.A00();
        C48412Ki c48412Ki2 = qa7.A00;
        c48412Ki2.A02 = Math.max(c45107Jxb.A00, 0);
        if (z2) {
            c48412Ki2.A02 = 0;
        }
        C14360o3.A07(c2l1.A02(qa7, num, A0R));
    }

    public static final void A00(Context context) {
        try {
            C2L1 A00 = C2L1.A00(context);
            C14360o3.A07(A00);
            A00.A04("PENDING_MEDIA_UPLOAD");
            A00.A04("PENDING_MEDIA_NETWORK");
        } catch (IllegalStateException e) {
            C0K8.A0F("PendingMediaManager", "This shouldn't happen in production", e);
        }
    }
}
