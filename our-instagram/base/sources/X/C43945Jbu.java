package X;

import android.app.Activity;
import android.graphics.RectF;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.reels.ReelViewerConfig;
import com.instagram.realtimeclient.RealtimeConstants;

/* renamed from: X.Jbu, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43945Jbu {
    public DirectThreadKey A00;
    public String A01;
    public final Activity A02;
    public final InterfaceC11380iw A03;
    public final UserSession A04;
    public final C28511Zm A05;
    public final C43931Jbg A06;
    public final InterfaceC1119353f A07;
    public final ReelViewerConfig A08;
    public final C1WZ A09;
    public final boolean A0A;

    public final void A00(RectF rectF, DirectThreadKey directThreadKey, boolean z) {
        Bundle A01 = this.A05.A01(rectF, directThreadKey, this.A08, null, null, null, null, this.A01, "inbox", null, null, z, false, false, this.A0A, true, false);
        UserSession userSession = this.A04;
        Activity activity = this.A02;
        C6XJ c6xj = new C6XJ(activity, A01, userSession, TransparentModalActivity.class, "direct_expiring_media_viewer");
        c6xj.A0E(this.A07);
        c6xj.A0J = ModalActivity.A08;
        c6xj.A0C(activity);
        activity.overridePendingTransition(0, 0);
        C1WZ c1wz = this.A09;
        c1wz.A02.A04(userSession, RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING, AbstractC162167Oa.A02(userSession.userId, directThreadKey.A00, "ds"));
    }

    public C43945Jbu(Activity activity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C28511Zm c28511Zm, C43931Jbg c43931Jbg, InterfaceC1119353f interfaceC1119353f, ReelViewerConfig reelViewerConfig, C1WZ c1wz, boolean z) {
        this.A04 = userSession;
        this.A02 = activity;
        this.A03 = interfaceC11380iw;
        this.A08 = reelViewerConfig;
        this.A07 = interfaceC1119353f;
        this.A05 = c28511Zm;
        this.A09 = c1wz;
        this.A0A = z;
        this.A06 = c43931Jbg;
    }
}
