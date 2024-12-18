package X;

import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import com.facebook.cameracore.audiograph.AudioGraphClientProvider;
import com.facebook.cameracore.musiceffect.AudioServiceConfigurationAnnouncer;
import com.facebook.gputimer.GPUTimerImpl;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7qK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C174847qK implements InterfaceC174857qL {
    public final C178577wV A00;
    public final C178597wX A01;
    public final C174867qM A02;
    public final C174757qB A03;
    public final C174877qN A04;
    public final UserSession A05;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.7qM, java.lang.Object] */
    public C174847qK(View view, C178597wX c178597wX, C174757qB c174757qB, InterfaceC1813482m interfaceC1813482m, UserSession userSession, boolean z) {
        C14360o3.A0B(c174757qB, 2);
        C14360o3.A0B(interfaceC1813482m, 4);
        this.A05 = userSession;
        this.A03 = c174757qB;
        this.A01 = c178597wX;
        C178577wV c178577wV = c174757qB.A0G;
        C14360o3.A07(c178577wV);
        this.A00 = c178577wV;
        WeakReference weakReference = new WeakReference(view);
        ?? obj = new Object();
        obj.A00 = weakReference;
        this.A02 = obj;
        C174877qN c174877qN = new C174877qN(interfaceC1813482m, this);
        this.A04 = c174877qN;
        AbstractC177217uH.A02 = true;
        c174757qB.A07 = z;
        c174757qB.A0K.add(c174877qN);
    }

    @Override // X.InterfaceC174857qL
    public final void A9o(InterfaceC185788Ly interfaceC185788Ly) {
        C212519bK c212519bK;
        InterfaceC178817wt interfaceC178817wt;
        C178577wV c178577wV = this.A00;
        C179837yX c179837yX = BEU.A00;
        C178187vs c178187vs = (C178187vs) c178577wV.A00;
        C178187vs.A01(c178187vs);
        BEU beu = (BEU) ((InterfaceC179817yV) ((InterfaceC178077vg) c178187vs.A02.A01.get(c179837yX)));
        if (beu != null && (interfaceC178817wt = (c212519bK = (C212519bK) beu).A00) != null) {
            C197898p0 c197898p0 = new C197898p0(interfaceC185788Ly, interfaceC178817wt.Ac3());
            Object systemService = ((AbstractC179807yU) c212519bK).A00.getContext().getSystemService("window");
            C14360o3.A0C(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            int rotation = ((WindowManager) systemService).getDefaultDisplay().getRotation();
            int i = 0;
            if (rotation != 0) {
                if (rotation != 1) {
                    if (rotation != 2) {
                        if (rotation == 3) {
                            i = 270;
                        }
                    } else {
                        i = 180;
                    }
                } else {
                    i = 90;
                }
            }
            c197898p0.A00 = i;
            interfaceC178817wt.BQq().A8h(c197898p0, 0);
        }
    }

    @Override // X.InterfaceC174857qL
    public final GPUTimerImpl B9L() {
        return null;
    }

    @Override // X.InterfaceC174857qL
    public final InterfaceC175497rP C4Q() {
        return null;
    }

    @Override // X.InterfaceC174857qL
    public final boolean CMF(String str, String str2) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        InterfaceC179827yW A00 = A00(this);
        if (A00 != null) {
            return A00.CMF(str, str2);
        }
        return true;
    }

    @Override // X.InterfaceC174857qL
    public final boolean CUA(String str) {
        C14360o3.A0B(str, 0);
        return C179587y8.A01(str);
    }

    @Override // X.InterfaceC174857qL
    public final void E1D() {
    }

    @Override // X.InterfaceC174857qL
    public final void EG2(InterfaceC185788Ly interfaceC185788Ly) {
        InterfaceC178817wt interfaceC178817wt;
        C178577wV c178577wV = this.A00;
        C179837yX c179837yX = BEU.A00;
        C178187vs c178187vs = (C178187vs) c178577wV.A00;
        C178187vs.A01(c178187vs);
        BEU beu = (BEU) ((InterfaceC179817yV) ((InterfaceC178077vg) c178187vs.A02.A01.get(c179837yX)));
        if (beu != null && (interfaceC178817wt = ((C212519bK) beu).A00) != null) {
            interfaceC178817wt.BQq().EFO(0, interfaceC185788Ly);
        }
    }

    public static final InterfaceC179827yW A00(C174847qK c174847qK) {
        C178577wV c178577wV = c174847qK.A00;
        C179837yX c179837yX = InterfaceC179827yW.A00;
        C178187vs c178187vs = (C178187vs) c178577wV.A00;
        C178187vs.A01(c178187vs);
        return (InterfaceC179827yW) ((InterfaceC179817yV) ((InterfaceC178077vg) c178187vs.A02.A01.get(c179837yX)));
    }

    @Override // X.InterfaceC174857qL
    public final void AP0(boolean z) {
        this.A03.disconnect();
    }

    @Override // X.InterfaceC174857qL
    public final void ARX(boolean z) {
        throw new IllegalStateException();
    }

    @Override // X.InterfaceC174857qL
    public final void D1V() {
        this.A03.disconnect();
    }

    @Override // X.InterfaceC174857qL
    public final boolean Du7(MotionEvent motionEvent) {
        return this.A02.A02(motionEvent);
    }

    @Override // X.InterfaceC174857qL
    public final void EOE(AXC axc) {
        throw new IllegalStateException();
    }

    @Override // X.InterfaceC174857qL
    public final void Ehh(List list) {
        InterfaceC179497xz interfaceC179497xz;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C200598u2) it.next()).A05);
        }
        InterfaceC179827yW A00 = A00(this);
        if (A00 != null && (interfaceC179497xz = ((C179797yT) A00).A00) != null) {
            ((C179487xy) interfaceC179497xz).A03.A02(arrayList);
        }
        ENM(new C203818zp(this.A02));
    }

    @Override // X.InterfaceC174857qL
    public final void Epw(YRH yrh) {
        C178577wV c178577wV = this.A00;
        C175767rq c175767rq = InterfaceC179727yM.A00;
        C178187vs c178187vs = (C178187vs) c178577wV.A00;
        C178187vs.A01(c178187vs);
        InterfaceC179727yM interfaceC179727yM = (InterfaceC179727yM) ((InterfaceC179607yA) ((InterfaceC178077vg) c178187vs.A02.A01.get(c175767rq)));
        if (interfaceC179727yM != null) {
            C179717yL c179717yL = (C179717yL) interfaceC179727yM;
            InterfaceC178697wh interfaceC178697wh = c179717yL.A02;
            InterfaceC178407wE interfaceC178407wE = c179717yL.A00;
            AbstractC196588mo.A00(interfaceC178407wE, C05F.A00, "BasicPhotoCaptureCoordinator", c179717yL.hashCode());
            if (interfaceC178697wh != null) {
                yrh.D2R();
                ABD abd = new ABD(yrh, c179717yL);
                C178687wg c178687wg = (C178687wg) interfaceC178697wh;
                InterfaceC178817wt interfaceC178817wt = c178687wg.A05;
                if (interfaceC178817wt == null) {
                    abd.A00(new AbstractC223559ty(10015, "MediaGraphController is null."));
                    return;
                } else {
                    interfaceC178817wt.getHandler().post(new RunnableC24558AuF(abd, c178687wg));
                    return;
                }
            }
            AbstractC223559ty abstractC223559ty = new AbstractC223559ty(10015, "PhotoProcessorComponent is null");
            yrh.D2J(abstractC223559ty);
            AbstractC196788n8.A00(abstractC223559ty, interfaceC178407wE, "BasicPhotoCaptureCoordinator", "high", c179717yL.hashCode());
        }
    }

    @Override // X.InterfaceC174857qL
    public final AudioServiceConfigurationAnnouncer Adz() {
        InterfaceC179597y9 interfaceC179597y9;
        C175887s2 c175887s2;
        InterfaceC179827yW A00 = A00(this);
        if (A00 != null && (interfaceC179597y9 = ((C179797yT) A00).A01) != null && (c175887s2 = ((C179587y8) interfaceC179597y9).A02) != null) {
            AudioServiceConfigurationAnnouncer audioServiceConfigurationAnnouncer = c175887s2.A05;
            if (audioServiceConfigurationAnnouncer == null) {
                AudioServiceConfigurationAnnouncer audioServiceConfigurationAnnouncer2 = new AudioServiceConfigurationAnnouncer();
                c175887s2.A05 = audioServiceConfigurationAnnouncer2;
                return audioServiceConfigurationAnnouncer2;
            }
            return audioServiceConfigurationAnnouncer;
        }
        return null;
    }

    @Override // X.InterfaceC174857qL
    public final void ENM(InterfaceC179247xa interfaceC179247xa) {
        InterfaceC179497xz interfaceC179497xz;
        InterfaceC179827yW A00 = A00(this);
        if (A00 != null && (interfaceC179497xz = ((C179797yT) A00).A00) != null) {
            interfaceC179497xz.DfO(interfaceC179247xa);
        }
    }

    @Override // X.InterfaceC174857qL
    public final AudioGraphClientProvider getAudioGraphClientProvider() {
        InterfaceC179597y9 interfaceC179597y9;
        C175887s2 c175887s2;
        InterfaceC179827yW A00 = A00(this);
        if (A00 != null && (interfaceC179597y9 = ((C179797yT) A00).A01) != null && (c175887s2 = ((C179587y8) interfaceC179597y9).A02) != null) {
            return c175887s2.A02();
        }
        return null;
    }
}
