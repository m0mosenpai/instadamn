package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.google.common.collect.ImmutableList;
import com.instagram.react.modules.base.IgReactQEModule;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.UUID;

/* renamed from: X.WRo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70334WRo implements InterfaceC71836X6t {
    public static final int[] A02 = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};
    public static final C69538Vr2 A03 = new C69538Vr2(new InterfaceC71877X8k() { // from class: X.WRH
        @Override // X.InterfaceC71877X8k
        public final Constructor AqT() {
            if (!Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
                return null;
            }
            return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(XE1.class).getConstructor(Integer.TYPE);
        }
    });
    public static final C69538Vr2 A04 = new C69538Vr2(new InterfaceC71877X8k() { // from class: X.WRI
        @Override // X.InterfaceC71877X8k
        public final Constructor AqT() {
            return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(XE1.class).getConstructor(new Class[0]);
        }
    });
    public InterfaceC72027XFp A00 = new Object();
    public ImmutableList A01;

    public static void A00(C70334WRo c70334WRo, List list, int i) {
        Object A00;
        switch (i) {
            case 0:
                A00 = new WRP();
                break;
            case 1:
                A00 = new WRQ();
                break;
            case 2:
                A00 = new WRX(0);
                break;
            case 3:
                A00 = new C70322WRc(0);
                break;
            case 4:
                A00 = A03.A00(AbstractC25228BEl.A1Y(0));
                if (A00 == null) {
                    A00 = new C70321WRb(0);
                    break;
                }
                break;
            case 5:
                A00 = new WRZ();
                break;
            case 6:
                InterfaceC72027XFp interfaceC72027XFp = c70334WRo.A00;
                UUID uuid = C70325WRf.A0v;
                A00 = new C70325WRf(new WSE(), interfaceC72027XFp, 0);
                break;
            case 7:
                A00 = new C70323WRd(0);
                break;
            case 8:
                InterfaceC72027XFp interfaceC72027XFp2 = c70334WRo.A00;
                C70130W5r c70130W5r = C70324WRe.A0X;
                list.add(new C70324WRe(interfaceC72027XFp2, ImmutableList.of(), 0));
                A00 = new C70326WRg(interfaceC72027XFp2, 0);
                break;
            case 9:
                A00 = new Object();
                break;
            case 10:
                A00 = new WRU();
                break;
            case 11:
                if (c70334WRo.A01 == null) {
                    c70334WRo.A01 = ImmutableList.of();
                }
                A00 = new C70320WRa(new C69793VvZ(), c70334WRo.A00, new C70359WSn(c70334WRo.A01), 0);
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A00 = new WRS();
                break;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            default:
                return;
            case 14:
                A00 = new WRV(0);
                break;
            case Process.SIGTERM /* 15 */:
                A00 = A04.A00(new Object[0]);
                if (A00 == null) {
                    return;
                }
                break;
            case 16:
                A00 = new WRY(c70334WRo.A00, 0);
                break;
            case 17:
                A00 = new WRK();
                break;
            case 18:
                A00 = new WRN();
                break;
            case Process.SIGSTOP /* 19 */:
                A00 = new WRJ();
                break;
            case 20:
                A00 = new WRM();
                break;
            case 21:
                A00 = new WRL();
                break;
        }
        list.add(A00);
    }
}
