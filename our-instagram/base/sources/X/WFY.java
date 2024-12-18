package X;

import android.os.Bundle;
import android.util.SparseArray;
import androidx.fragment.app.Fragment;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.instagram.react.modules.base.IgReactQEModule;

/* loaded from: classes11.dex */
public final class WFY {
    public final QuickPerformanceLogger A00;
    public final C2GC A01;
    public final InterfaceC08830cm A02;
    public final InterfaceC08830cm A03;
    public final InterfaceC08830cm A04;
    public final InterfaceC08830cm A05;
    public final InterfaceC08830cm A06;
    public final InterfaceC08830cm A07;

    public WFY(QuickPerformanceLogger quickPerformanceLogger, C2GC c2gc, InterfaceC08830cm interfaceC08830cm, InterfaceC08830cm interfaceC08830cm2, InterfaceC08830cm interfaceC08830cm3, InterfaceC08830cm interfaceC08830cm4, InterfaceC08830cm interfaceC08830cm5, InterfaceC08830cm interfaceC08830cm6) {
        AbstractC167007dF.A1G(interfaceC08830cm2, 4, interfaceC08830cm3);
        this.A01 = c2gc;
        this.A00 = quickPerformanceLogger;
        this.A02 = interfaceC08830cm;
        this.A07 = interfaceC08830cm2;
        this.A06 = interfaceC08830cm3;
        this.A03 = interfaceC08830cm4;
        this.A05 = interfaceC08830cm5;
        this.A04 = interfaceC08830cm6;
    }

    public static Wb4 A00(int i) {
        Wb4 wb4 = new Wb4(i);
        C2FP.A02().A07();
        return wb4;
    }

    public static Wb5 A01(int i) {
        Wb5 wb5 = new Wb5(i);
        C2FP.A02().A07();
        return wb5;
    }

    public final Fragment A04(Bundle bundle, String str) {
        Fragment A01 = ((SNK) this.A02.get()).A01(bundle, str);
        if (A01 != null) {
            return A01;
        }
        throw AbstractC166997dE.A0g();
    }

    public final AbstractC52922bZ A05(InterfaceC018407e interfaceC018407e, int i) {
        Class cls;
        C52942bb c52942bb = new C52942bb(interfaceC018407e);
        this.A07.get();
        switch (i) {
            case 0:
                cls = C67680Uvx.class;
                break;
            case 1:
                cls = C67679Uvu.class;
                break;
            case 2:
                cls = Uvv.class;
                break;
            case 3:
            default:
                throw AbstractC25230BEn.A0n("MSCViewModelClassFactory does not support ViewModelId number ", i);
            case 4:
                cls = C67712Uwd.class;
                break;
            case 5:
                cls = Uvw.class;
                break;
            case 6:
                cls = C67714Uwf.class;
                break;
            case 7:
                cls = C67713Uwe.class;
                break;
            case 8:
                cls = C67681Uvy.class;
                break;
            case 9:
                cls = C67715Uwg.class;
                break;
            case 10:
                cls = C67716Uwh.class;
                break;
            case 11:
                cls = C67717Uwi.class;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                cls = C67709Uwa.class;
                break;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                cls = C67711Uwc.class;
                break;
        }
        return c52942bb.A00(cls);
    }

    public final InterfaceC71854X7m A06(Class cls) {
        InterfaceC71854X7m interfaceC71854X7m;
        C69419Vn4 c69419Vn4 = (C69419Vn4) this.A05.get();
        if (cls.equals(Wau.class)) {
            interfaceC71854X7m = (Wau) c69419Vn4.A02.getValue();
        } else if (cls.equals(War.class)) {
            interfaceC71854X7m = (War) c69419Vn4.A01.getValue();
        } else if (cls.equals(Waq.class)) {
            interfaceC71854X7m = (Waq) c69419Vn4.A00.getValue();
        } else if (cls.equals(Waw.class)) {
            interfaceC71854X7m = (Waw) c69419Vn4.A06.getValue();
        } else if (cls.equals(Wax.class)) {
            interfaceC71854X7m = (Wax) c69419Vn4.A07.getValue();
        } else if (cls.equals(Wat.class)) {
            interfaceC71854X7m = (Wat) c69419Vn4.A04.getValue();
        } else if (cls.equals(Way.class)) {
            interfaceC71854X7m = (Way) c69419Vn4.A08.getValue();
        } else if (cls.equals(Wav.class)) {
            interfaceC71854X7m = (Wav) c69419Vn4.A05.getValue();
        } else if (cls.equals(Was.class)) {
            interfaceC71854X7m = (Was) c69419Vn4.A03.getValue();
        } else {
            throw AbstractC37303Gc4.A0M(cls, "Input repository not implemented ", new StringBuilder());
        }
        C14360o3.A0C(interfaceC71854X7m, "null cannot be cast to non-null type T of com.facebookpay.msc.factoryimpl.BSCRepositoryFactory.getRepository");
        return interfaceC71854X7m;
    }

    public final C69509Vpi A07() {
        Object obj = this.A06.get();
        C14360o3.A07(obj);
        return (C69509Vpi) obj;
    }

    public final W1U A08() {
        Object obj = this.A04.get();
        C14360o3.A07(obj);
        return (W1U) obj;
    }

    public static void A02() {
        C2FP.A02().A07();
    }

    public static void A03(SparseArray sparseArray, Object obj, int i) {
        sparseArray.put(i, obj);
        C2FP.A02().A07();
    }
}
