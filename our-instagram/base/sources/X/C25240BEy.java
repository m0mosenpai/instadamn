package X;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.BEy, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25240BEy implements InterfaceC118965aD {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C25240BEy(InterfaceC09670ek interfaceC09670ek, C07X c07x, int i) {
        this.A00 = i;
        if (10 - i != 0) {
            this.A02 = c07x;
            this.A01 = interfaceC09670ek;
        } else {
            this.A01 = c07x;
            this.A02 = interfaceC09670ek;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC118965aD
    public final void dispose() {
        BTO bto;
        Object obj;
        C6MK c6mk;
        Context applicationContext;
        ComponentCallbacks componentCallbacks;
        C07T c07t;
        Object obj2;
        switch (this.A00) {
            case 0:
                ((BH5) this.A01).A03.A0B(this.A02);
                return;
            case 1:
                BTO bto2 = (BTO) this.A01;
                obj = this.A02;
                c6mk = bto2.A0A;
                c6mk.remove(obj);
                return;
            case 2:
                bto = (BTO) this.A02;
                C28793CnP c28793CnP = (C28793CnP) ((CU1) this.A01).A00.getValue();
                if (c28793CnP == null) {
                    return;
                }
                obj = c28793CnP.A02;
                c6mk = bto.A09;
                c6mk.remove(obj);
                return;
            case 3:
                bto = (BTO) this.A01;
                obj = this.A02;
                c6mk = bto.A09;
                c6mk.remove(obj);
                return;
            case 4:
                C28428Cga c28428Cga = (C28428Cga) this.A01;
                View view = (View) this.A02;
                int i = c28428Cga.A00 - 1;
                c28428Cga.A00 = i;
                if (i != 0) {
                    return;
                }
                AbstractC008903d.A00(view, null);
                C04U.A01(view, null);
                view.removeOnAttachStateChangeListener(c28428Cga.A06);
                return;
            case 5:
                ((C6N1) this.A02).A02.add(this.A01);
                return;
            case 6:
                InterfaceC74953Yl interfaceC74953Yl = (InterfaceC74953Yl) this.A02;
                C28734CmS c28734CmS = (C28734CmS) interfaceC74953Yl.getValue();
                if (c28734CmS == null) {
                    return;
                }
                C28737CmV c28737CmV = new C28737CmV(c28734CmS);
                C5XO c5xo = (C5XO) this.A01;
                if (c5xo != null) {
                    ((C5XN) c5xo).A00.F8m(c28737CmV);
                }
                interfaceC74953Yl.Egh(null);
                return;
            case 7:
                ((C28210Cc8) this.A02).A02.remove(this.A01);
                return;
            case 8:
                applicationContext = ((Context) this.A02).getApplicationContext();
                componentCallbacks = (ComponentCallbacks2C117895Uz) this.A01;
                applicationContext.unregisterComponentCallbacks(componentCallbacks);
                return;
            case 9:
                applicationContext = ((Context) this.A02).getApplicationContext();
                componentCallbacks = (C5V1) this.A01;
                applicationContext.unregisterComponentCallbacks(componentCallbacks);
                return;
            case 10:
                c07t = ((C07X) this.A01).getLifecycle();
                obj2 = this.A02;
                c07t.A0A((C07W) obj2);
                return;
            case 11:
                ((AccessibilityManager) this.A01).removeTouchExplorationStateChangeListener((AccessibilityManager.TouchExplorationStateChangeListener) this.A02);
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                c07t = (C07T) this.A01;
                obj2 = this.A02;
                c07t.A0A((C07W) obj2);
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                ((C3I9) this.A01).EFx(new D37((InterfaceC16620sF) this.A02));
                return;
            case 14:
                ((C29271CvS) this.A02).A00 = null;
                ((C162987Rj) this.A01).A01();
                return;
            case Process.SIGTERM /* 15 */:
                ((C85233rE) this.A02).A09.A0M((C33R) this.A01, null, true);
                return;
            default:
                c07t = ((C07X) this.A02).getLifecycle();
                obj2 = this.A01;
                c07t.A0A((C07W) obj2);
                return;
        }
    }

    public C25240BEy(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }
}
