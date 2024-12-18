package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.Locale;

/* renamed from: X.6ve, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C153696ve {
    public boolean A00 = true;
    public final C006802i A01;
    public final InterfaceC12060kA A02;

    public static final void A00(C153696ve c153696ve, Integer num) {
        String str;
        if (c153696ve.A00) {
            C006802i c006802i = c153696ve.A01;
            switch (num.intValue()) {
                case 0:
                    str = "PREFETCH_CACHE";
                    break;
                case 1:
                    str = "FLASH_CACHE";
                    break;
                default:
                    str = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                    break;
            }
            String lowerCase = str.toLowerCase(Locale.ROOT);
            C14360o3.A07(lowerCase);
            c006802i.markerAnnotate(749812461, "cache_hit", lowerCase);
            c006802i.markerEnd(749812461, (short) 2);
            c153696ve.A00 = false;
        }
    }

    public static final void A01(C153696ve c153696ve, Integer num) {
        if (c153696ve.A00) {
            String lowerCase = C9IP.A00(num).toLowerCase(Locale.ROOT);
            C14360o3.A07(lowerCase);
            String A0R = AnonymousClass001.A0R(lowerCase, "_end");
            c153696ve.A01.markerPoint(749812461, A0R);
            c153696ve.A02.Cna(A0R);
        }
    }

    public static final void A02(C153696ve c153696ve, Integer num) {
        if (c153696ve.A00) {
            if (num == C05F.A00) {
                C006802i c006802i = c153696ve.A01;
                c006802i.markerStart(749812461);
                c006802i.markerAnnotate(749812461, "logger_version", 2);
            }
            String lowerCase = C9IP.A00(num).toLowerCase(Locale.ROOT);
            C14360o3.A07(lowerCase);
            String A0R = AnonymousClass001.A0R(lowerCase, "_start");
            c153696ve.A01.markerPoint(749812461, A0R);
            c153696ve.A02.Cna(A0R);
        }
    }

    public final void A03() {
        if (this.A00) {
            C006802i c006802i = this.A01;
            Locale locale = Locale.ROOT;
            String lowerCase = "ON_RESPONSE_POINT".toLowerCase(locale);
            C14360o3.A07(lowerCase);
            c006802i.markerPoint(749812461, lowerCase);
            InterfaceC12060kA interfaceC12060kA = this.A02;
            String lowerCase2 = "ON_RESPONSE_POINT".toLowerCase(locale);
            C14360o3.A07(lowerCase2);
            interfaceC12060kA.Cna(lowerCase2);
        }
    }

    public C153696ve(C006802i c006802i, InterfaceC12060kA interfaceC12060kA) {
        this.A01 = c006802i;
        this.A02 = interfaceC12060kA;
    }
}
