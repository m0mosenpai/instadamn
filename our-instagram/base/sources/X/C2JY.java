package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.2JY, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2JY implements InterfaceC13050lr {
    public C48972Mq A00;
    public InterfaceC12870lZ A01;
    public final Context A02;
    public final UserSession A03;

    public static C48972Mq A00(C2JY c2jy) {
        Context context = c2jy.A02;
        C1UI A00 = C1U4.A00(context);
        UserSession userSession = c2jy.A03;
        return new C48972Mq(A00, (C1TY) userSession.A01(C1TY.class, new C48142Jb(context.getApplicationContext(), userSession)), new ExecutorC14040nU(C14120nc.A00(), 622, 3, true, false), AbstractC26751Re.A00(context));
    }

    @Override // X.InterfaceC13050lr
    public final void onUserSessionWillEnd(boolean z) {
        C218914p.A06(this.A01);
    }

    public C2JY(Context context, UserSession userSession) {
        this.A02 = context;
        this.A03 = userSession;
        if (C14120nc.A00() != null) {
            this.A00 = A00(this);
        }
        this.A01 = new InterfaceC12870lZ() { // from class: X.2Mr
            @Override // X.InterfaceC12870lZ
            public final void onAppBackgrounded() {
                C0f9.A0A(1152403984, C0f9.A03(-953998723));
            }

            @Override // X.InterfaceC12870lZ
            public final void onAppForegrounded() {
                int A03 = C0f9.A03(942392304);
                C2JY c2jy = C2JY.this;
                C48972Mq c48972Mq = c2jy.A00;
                if (c48972Mq == null) {
                    if (C14120nc.A00() != null) {
                        c48972Mq = C2JY.A00(c2jy);
                        c2jy.A00 = c48972Mq;
                    } else {
                        C0w9.A03("IgFallbackPrefetcher", "IgExecutor not set yet");
                        C0f9.A0A(768177711, A03);
                    }
                }
                if (c48972Mq.A04) {
                    C1UI c1ui = c48972Mq.A01;
                    if (c1ui.A00("AppModules::NeedToFallbackDownload").getBoolean("key::NeedFallback", false)) {
                        c48972Mq.A00 = false;
                        HashMap Aax = c1ui.A00("AppModules::PrevDownload").Aax();
                        HashSet hashSet = new HashSet();
                        for (String str : Aax.keySet()) {
                            if (Aax.get(str) instanceof Boolean) {
                                Boolean bool = (Boolean) Aax.get(str);
                                C14360o3.A0A(bool);
                                if (bool.booleanValue() && AbstractC09930fu.A00(str) != -1) {
                                    C14360o3.A0A(str);
                                    hashSet.add(str);
                                }
                            }
                        }
                        if (C0K8.A01.isLoggable(3)) {
                            Iterator it = hashSet.iterator();
                            boolean z = true;
                            while (it.hasNext()) {
                                it.next();
                                if (z) {
                                    z = false;
                                }
                            }
                        }
                        if (hashSet.isEmpty()) {
                            C48972Mq.A00(c48972Mq);
                        } else {
                            CountDownLatch countDownLatch = new CountDownLatch(1);
                            C58422Pv0 CsF = c48972Mq.A02.CsF(C05F.A0Y);
                            Iterator it2 = hashSet.iterator();
                            while (it2.hasNext()) {
                                String str2 = (String) it2.next();
                                if (str2 != null && !str2.startsWith("d_")) {
                                    CsF.A06.add(str2);
                                }
                            }
                            CsF.A01().A05(new C55788Opx(c48972Mq, hashSet, countDownLatch), c48972Mq.A03);
                        }
                    }
                }
                C0f9.A0A(768177711, A03);
            }
        };
    }
}
