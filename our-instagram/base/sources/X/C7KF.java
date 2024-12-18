package X;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.direct.messagethread.store.intf.MessageListLayoutManager;
import com.instagram.model.reels.ReelViewerConfig;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.7KF, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7KF {
    public MessageListLayoutManager A00;
    public C83403nh A01;
    public List A02;
    public boolean A03;
    public L1Q A04;
    public final Activity A05;
    public final Handler A06;
    public final Fragment A07;
    public final UserSession A08;
    public final ReelViewerConfig A09;
    public final String A0A;
    public final HashSet A0B;
    public final InterfaceC16820sZ A0C;
    public final InterfaceC11380iw A0D;
    public final C7KG A0E;

    public C7KF(Activity activity, Fragment fragment, InterfaceC11380iw interfaceC11380iw, UserSession userSession, ReelViewerConfig reelViewerConfig, String str, InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(interfaceC11380iw, 4);
        C14360o3.A0B(str, 6);
        C14360o3.A0B(interfaceC16820sZ, 7);
        this.A05 = activity;
        this.A07 = fragment;
        this.A08 = userSession;
        this.A0D = interfaceC11380iw;
        this.A09 = reelViewerConfig;
        this.A0A = str;
        this.A0C = interfaceC16820sZ;
        this.A06 = new Handler(Looper.getMainLooper());
        this.A0B = new HashSet();
        this.A0E = new C7KG(activity, interfaceC11380iw, userSession);
    }

    public static final void A00(C7KF c7kf) {
        c7kf.A01 = null;
        c7kf.A02 = null;
        L1Q l1q = c7kf.A04;
        if (l1q != null) {
            l1q.A01.DQ6();
            l1q.A00.removeCallbacks(l1q.A02);
        }
        c7kf.A04 = null;
        C7KG c7kg = c7kf.A0E;
        InterfaceC09390do interfaceC09390do = c7kg.A02;
        if (interfaceC09390do.CWa()) {
            C43931Jbg c43931Jbg = ((C47755L7b) interfaceC09390do.getValue()).A03;
            c43931Jbg.A01 = null;
            c43931Jbg.A00 = null;
            c43931Jbg.A02 = null;
        }
        InterfaceC09390do interfaceC09390do2 = c7kg.A03;
        if (interfaceC09390do2.CWa()) {
            ((A7M) interfaceC09390do2.getValue()).A00.A01();
        }
    }

    public static final boolean A01(C7KF c7kf) {
        MessageListLayoutManager messageListLayoutManager;
        if (c7kf.A02 != null) {
            return true;
        }
        C83403nh c83403nh = c7kf.A01;
        if (c83403nh != null && (messageListLayoutManager = c7kf.A00) != null) {
            return ((C7U0) c7kf.A0C.invoke()).BT6().CYX(c83403nh.A0V(), messageListLayoutManager.A1a(), messageListLayoutManager.A1b());
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0080, code lost:
    
        if (X.LLT.A03(r0) != null) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(android.graphics.RectF r24, X.InterfaceC50477MQf r25, X.C83403nh r26, X.C2EC r27, X.C3o9 r28, java.lang.String r29, java.lang.String r30, java.util.List r31, java.util.List r32, boolean r33, boolean r34, boolean r35, boolean r36, boolean r37, boolean r38) {
        /*
            Method dump skipped, instructions count: 455
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7KF.A02(android.graphics.RectF, X.MQf, X.3nh, X.2EC, X.3o9, java.lang.String, java.lang.String, java.util.List, java.util.List, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }
}
