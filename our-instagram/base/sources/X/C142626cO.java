package X;

import android.os.Looper;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import java.util.HashSet;

/* renamed from: X.6cO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C142626cO {
    public final C142636cP A00;
    public final InterfaceC149836oc A01;
    public final java.util.Set A02 = new HashSet();

    public final boolean A01(UserSession userSession) {
        String str;
        C14360o3.A0B(userSession, 0);
        C142636cP c142636cP = this.A00;
        if (c142636cP.A01 == null) {
            InterfaceC149836oc interfaceC149836oc = c142636cP.A02;
            if (!(interfaceC149836oc instanceof C149846od)) {
                if (interfaceC149836oc instanceof C149826ob) {
                    C149826ob c149826ob = (C149826ob) interfaceC149836oc;
                    if (c149826ob.A07 != null) {
                        if (c149826ob.A07 != null) {
                            interfaceC149836oc = c149826ob.A07;
                        } else {
                            throw new RuntimeException("delegate is null!");
                        }
                    } else {
                        str = "canShowEffectPicker() mEffectManager delegate is null";
                    }
                } else {
                    str = "canShowEffectPicker() mEffectManager not instance of InternalIgEffectManager";
                }
                AbstractC12120kG.A07("EffectPickerRenderHelper", str, null);
            }
            C14360o3.A0C(interfaceC149836oc, "null cannot be cast to non-null type com.instagram.camera.effect.mq.InternalIgEffectManager");
            final C149846od c149846od = (C149846od) interfaceC149836oc;
            final C199878sr c199878sr = c142636cP.A00;
            if (c199878sr == null) {
                c199878sr = new C199878sr(c142636cP, userSession);
                c142636cP.A00 = c199878sr;
            }
            Boolean bool = c149846od.A0I;
            if (bool != null) {
                c199878sr.A00(bool.booleanValue());
            }
            c149846od.A05.ATO(new AbstractRunnableC14200nk() { // from class: X.8ss
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(28);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C199878sr c199878sr2 = c199878sr;
                    C149846od c149846od2 = c149846od;
                    if (c149846od2.A0I == null) {
                        synchronized (c149846od2.A06) {
                            if (c149846od2.A0I == null) {
                                if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                                    AbstractC12120kG.A01(AbstractC111324zv.A00(3647), "hasSufficientStorage() executed in UI thread");
                                }
                                boolean z = true;
                                if (C0JK.A01().A09() && C0JK.A01().A0A()) {
                                    z = false;
                                }
                                c149846od2.A0I = Boolean.valueOf(z);
                            }
                        }
                    }
                    c199878sr2.A00(Boolean.TRUE.equals(c149846od2.A0I));
                }
            });
        }
        Boolean bool2 = c142636cP.A01;
        if (bool2 != null) {
            return bool2.booleanValue();
        }
        return false;
    }

    public static final boolean A00(CameraAREffect cameraAREffect, C142626cO c142626cO) {
        java.util.Set set = c142626cO.A02;
        if (!set.contains(cameraAREffect)) {
            if (c142626cO.A01.CSw(cameraAREffect)) {
                set.add(cameraAREffect);
            } else {
                return false;
            }
        }
        return true;
    }

    public C142626cO(InterfaceC149836oc interfaceC149836oc) {
        this.A01 = interfaceC149836oc;
        this.A00 = new C142636cP(interfaceC149836oc);
    }
}
