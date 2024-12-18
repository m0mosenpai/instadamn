package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.instagram.common.session.UserSession;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: X.9Co, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C206579Co extends AbstractC23611Dp implements InterfaceC16620sF {
    public final int A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C206579Co(int i, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A00 = i;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        int i;
        switch (this.A00) {
            case 0:
                i = 0;
                break;
            case 1:
                i = 1;
                break;
            default:
                i = 2;
                break;
        }
        return new C206579Co(i, interfaceC23621Ds);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        InterfaceC23621Ds interfaceC23621Ds = (InterfaceC23621Ds) obj2;
        if (this.A00 != 0) {
            if (interfaceC23621Ds != null) {
                interfaceC23621Ds.getContext();
            }
            C0eB c0eB = C0eB.A00;
            AbstractC09560e7.A00(c0eB);
            return c0eB;
        }
        return ((C206579Co) create(obj, interfaceC23621Ds)).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        boolean bindService;
        if (this.A00 != 0) {
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            UserSession userSession = AnonymousClass942.A02;
            if (userSession != null) {
                C06090Tz c06090Tz = C06090Tz.A05;
                if (Boolean.valueOf(C18U.A06(c06090Tz, userSession, 36321361602553200L)).booleanValue()) {
                    Context context = AnonymousClass942.A00;
                    if (context != null) {
                        C006802i c006802i = C006802i.A0p;
                        C14360o3.A07(c006802i);
                        UserSession userSession2 = AnonymousClass942.A02;
                        if (userSession2 != null) {
                            C06090Tz c06090Tz2 = C06090Tz.A06;
                            boolean booleanValue = Boolean.valueOf(C18U.A06(c06090Tz2, userSession2, 2342164370815460711L)).booleanValue();
                            UserSession userSession3 = AnonymousClass942.A02;
                            if (userSession3 != null) {
                                if (AbstractC224429vT.A00(context, c006802i, booleanValue, Boolean.valueOf(C18U.A06(c06090Tz2, userSession3, 36321361602225516L)).booleanValue())) {
                                    C22935A9f c22935A9f = AnonymousClass942.A01;
                                    if (c22935A9f == null) {
                                        Context context2 = AnonymousClass942.A00;
                                        if (context2 != null) {
                                            C006802i c006802i2 = C006802i.A0p;
                                            C14360o3.A07(c006802i2);
                                            UserSession userSession4 = AnonymousClass942.A02;
                                            if (userSession4 != null) {
                                                c22935A9f = new C22935A9f(context2, AbstractC25061Kk.A00(), c006802i2, Boolean.valueOf(C18U.A06(c06090Tz, userSession4, 2342164370816378226L)).booleanValue());
                                                AnonymousClass942.A01 = c22935A9f;
                                            }
                                        }
                                    }
                                    CountDownLatch countDownLatch = new CountDownLatch(1);
                                    synchronized (c22935A9f.A02) {
                                        c22935A9f.A01.markerStart(47654742);
                                        ServiceConnectionC63443SkM serviceConnectionC63443SkM = new ServiceConnectionC63443SkM(0, c22935A9f, countDownLatch);
                                        Intent intent = new Intent();
                                        Context context3 = c22935A9f.A00;
                                        intent.setComponent(new ComponentName(context3, "com.facebook.browser.helium.preload.AppZygoteWarmerService"));
                                        bindService = context3.bindService(intent, serviceConnectionC63443SkM, 561);
                                        if (!bindService) {
                                            C0K8.A0C("AppZygoteWarmer", "Failed to bind service");
                                        }
                                    }
                                    if (bindService) {
                                        try {
                                            if (!countDownLatch.await(10000L, TimeUnit.MILLISECONDS)) {
                                                C0K8.A0D("AppZygoteWarmer", "Timed out waiting for zygote warmer service");
                                            }
                                        } catch (InterruptedException e) {
                                            C0K8.A0F("AppZygoteWarmer", "Interrupted waiting for zygote warmer service", e);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    C14360o3.A0F("appContext");
                    throw C00O.createAndThrow();
                }
            }
            C14360o3.A0F("userSession");
            throw C00O.createAndThrow();
        }
        return C0eB.A00;
    }
}
