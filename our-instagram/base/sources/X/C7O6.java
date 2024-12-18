package X;

import android.app.Activity;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.UUID;

/* renamed from: X.7O6, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7O6 {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final C46512KiB A02;
    public final C7O5 A03;
    public final InterfaceC160027Fo A04;
    public final List A05;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.fragment.app.Fragment, X.KBQ, X.2oe] */
    public final void A00(Activity activity) {
        Bundle bundle = new Bundle();
        UserSession userSession = this.A01;
        C46512KiB c46512KiB = this.A02;
        String str = c46512KiB.A01;
        C14360o3.A07(str);
        String str2 = c46512KiB.A02;
        C14360o3.A07(str2);
        List list = this.A05;
        C19280xC A01 = C162337Ov.A01(this.A00, "thread_reply_tap", str, str2);
        A01.A0D("recipient_ids", list);
        AbstractC11060iN.A00(userSession).EHW(A01);
        c46512KiB.A00(bundle);
        AbstractC03240Dh.A00(bundle, userSession);
        C48778Lhl c48778Lhl = new C48778Lhl(this);
        ?? abstractC59962oe = new AbstractC59962oe();
        abstractC59962oe.A02 = c48778Lhl;
        abstractC59962oe.setArguments(bundle);
        C189448aO c189448aO = new C189448aO(userSession);
        c189448aO.A0a = true;
        c189448aO.A03 = 0.6f;
        c189448aO.A0U = new C49621LwE(abstractC59962oe, this);
        c189448aO.A00().A02(activity, abstractC59962oe);
        this.A03.A00.A19();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.KiB, java.lang.Object] */
    public C7O6(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C7O5 c7o5, InterfaceC160027Fo interfaceC160027Fo, List list) {
        this.A01 = userSession;
        this.A03 = c7o5;
        this.A05 = list;
        this.A00 = interfaceC11380iw;
        this.A04 = interfaceC160027Fo;
        String obj = UUID.randomUUID().toString();
        ?? obj2 = new Object();
        obj2.A01 = "direct_thread";
        obj2.A02 = obj;
        obj2.A00 = null;
        this.A02 = obj2;
    }
}
