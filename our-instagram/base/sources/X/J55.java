package X;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes7.dex */
public final class J55 implements Runnable {
    public final /* synthetic */ C120985dq A00;
    public final /* synthetic */ C37562GgI A01;

    public J55(C120985dq c120985dq, C37562GgI c37562GgI) {
        this.A01 = c37562GgI;
        this.A00 = c120985dq;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        Boolean bool;
        String str2;
        C37562GgI c37562GgI = this.A01;
        C37561GgH c37561GgH = c37562GgI.A08;
        ConcurrentHashMap concurrentHashMap = c37562GgI.A0B;
        C120985dq c120985dq = this.A00;
        Long l = (Long) AbstractC37301Gc2.A0f(c120985dq, concurrentHashMap);
        ConcurrentHashMap concurrentHashMap2 = c37562GgI.A0A;
        C09530e4 c09530e4 = (C09530e4) AbstractC37301Gc2.A0f(c120985dq, concurrentHashMap2);
        if (c09530e4 != null) {
            str = (String) c09530e4.A00;
        } else {
            str = null;
        }
        C09530e4 c09530e42 = (C09530e4) AbstractC37301Gc2.A0f(c120985dq, concurrentHashMap2);
        if (c09530e42 != null) {
            bool = (Boolean) c09530e42.A01;
        } else {
            bool = null;
        }
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(c37561GgH.A00, c37561GgH.A01), "instagram_reels_auto_advance_countdown_canceled");
        if (A0f.isSampled()) {
            A0f.A9K("countdown_left", l);
            A0f.A7v("for_session", bool);
            String str3 = null;
            AbstractC37300Gc1.A0o(A0f, c120985dq.A0P);
            A0f.AAP("cancel_reason", str);
            if (c120985dq.CdW()) {
                str2 = AbstractC25226BEj.A1E(c120985dq);
            } else {
                str2 = null;
            }
            A0f.AAP("ad_id", str2);
            C38321qM c38321qM = c120985dq.A02;
            if (c38321qM != null) {
                str3 = c38321qM.getId();
            }
            A0f.AAP("media_id", str3);
            A0f.Cht();
        }
        concurrentHashMap2.put(c120985dq.getId(), new C09530e4(null, null));
    }
}
