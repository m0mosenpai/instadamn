package X;

import com.instagram.common.session.UserSession;
import java.util.List;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Nhx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class EnumC53321Nhx {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC53321Nhx[] A02;
    public static final EnumC53321Nhx A03;
    public static final EnumC53321Nhx A04;
    public static final EnumC53321Nhx A05;
    public static final EnumC53321Nhx A06;
    public static final EnumC53321Nhx A07;
    public static final EnumC53321Nhx A08;
    public static final EnumC53321Nhx A09;
    public static final EnumC53321Nhx A0A;
    public static final EnumC53321Nhx A0B;
    public static final EnumC53321Nhx A0C;
    public static final EnumC53321Nhx A0D;
    public static final EnumC53321Nhx A0E;
    public static final EnumC53321Nhx A0F;
    public static final EnumC53321Nhx A0G;
    public static final EnumC53321Nhx A0H;
    public static final EnumC53321Nhx A0I;
    public static final EnumC53321Nhx A0J;
    public static final EnumC53321Nhx A0K;
    public static final EnumC53321Nhx A0L;
    public static final EnumC53321Nhx A0M;
    public final EnumC46582Bw A00;

    static {
        NWQ nwq = new NWQ();
        A0I = nwq;
        NWR nwr = new NWR();
        A0J = nwr;
        NWS nws = new NWS();
        A0K = nws;
        NWT nwt = new NWT();
        A0L = nwt;
        NWU nwu = new NWU();
        A0M = nwu;
        EnumC53321Nhx enumC53321Nhx = new EnumC53321Nhx() { // from class: X.NWA
            {
                EnumC46582Bw enumC46582Bw = EnumC46582Bw.A04;
            }
        };
        A03 = enumC53321Nhx;
        NWM nwm = new NWM();
        A0E = nwm;
        NWG nwg = new NWG();
        A08 = nwg;
        NWH nwh = new NWH();
        A09 = nwh;
        NWI nwi = new NWI();
        A0A = nwi;
        NWJ nwj = new NWJ();
        A0B = nwj;
        NWL nwl = new NWL();
        A0D = nwl;
        NWC nwc = new NWC();
        A05 = nwc;
        NWP nwp = new NWP();
        A0H = nwp;
        NWO nwo = new NWO();
        A0G = nwo;
        NWB nwb = new NWB();
        A04 = nwb;
        NWK nwk = new NWK();
        A0C = nwk;
        NWN nwn = new NWN();
        A0F = nwn;
        NWD nwd = new NWD();
        A06 = nwd;
        NWE nwe = new NWE();
        A07 = nwe;
        EnumC53321Nhx[] enumC53321NhxArr = {nwq, nwr, nws, nwt, nwu, enumC53321Nhx, nwm, nwg, nwh, nwi, nwj, nwl, nwc, nwp, nwo, nwb, nwk, nwn, nwd, nwe, new NWF()};
        A02 = enumC53321NhxArr;
        A01 = AbstractC12190kN.A00(enumC53321NhxArr);
    }

    public static EnumC53321Nhx[] values() {
        return (EnumC53321Nhx[]) A02.clone();
    }

    public final OMW A01(UserSession userSession, String str, List list) {
        if (this instanceof NWQ) {
            C14360o3.A0B(list, 1);
            return new C52754NWe(list);
        }
        if (this instanceof NWU) {
            C14360o3.A0B(list, 1);
            return new C52765NWp(list, str);
        }
        if (this instanceof NWT) {
            C14360o3.A0B(list, 1);
            return new C52764NWo(list, str);
        }
        if (this instanceof NWS) {
            C14360o3.A0B(list, 1);
            return new C52763NWn(list, str);
        }
        if (this instanceof NWR) {
            C14360o3.A0B(list, 1);
            return new C52755NWf(list);
        }
        if (this instanceof NWP) {
            AbstractC167017dG.A1N(userSession, list);
            return new NWY(A00(userSession, list));
        }
        if (this instanceof NWO) {
            AbstractC167017dG.A1N(userSession, list);
            return new NWX(A00(userSession, list));
        }
        if (this instanceof NWN) {
            C14360o3.A0B(list, 1);
            return new C52760NWk(list);
        }
        if (this instanceof NWM) {
            AbstractC167017dG.A1N(userSession, list);
            return new C52759NWj(A00(userSession, list));
        }
        if (this instanceof NWL) {
            C14360o3.A0B(list, 1);
            return new C52758NWi(list);
        }
        if (this instanceof NWK) {
            AbstractC167017dG.A1N(userSession, list);
            return new C52757NWh(A00(userSession, list));
        }
        if (this instanceof NWJ) {
            C14360o3.A0B(list, 1);
            return new C52753NWd(list);
        }
        if (this instanceof NWI) {
            C14360o3.A0B(list, 1);
            return new C52752NWc(list);
        }
        if (this instanceof NWH) {
            AbstractC167017dG.A1N(userSession, list);
            return new C52751NWb(A00(userSession, list));
        }
        if (this instanceof NWG) {
            AbstractC167017dG.A1N(userSession, list);
            return new C52750NWa(A00(userSession, list));
        }
        if (this instanceof NWF) {
            C14360o3.A0B(list, 1);
            return new C52762NWm(C82H.A0E, list);
        }
        if (this instanceof NWE) {
            return new NWW();
        }
        if (this instanceof NWD) {
            return new NWV();
        }
        if (this instanceof NWC) {
            C14360o3.A0B(list, 1);
            return new NWZ(list);
        }
        if (this instanceof NWB) {
            AbstractC167017dG.A1N(userSession, list);
            return new C52756NWg(A00(userSession, list));
        }
        C14360o3.A0B(list, 1);
        return new C52761NWl(list);
    }

    public EnumC53321Nhx(EnumC46582Bw enumC46582Bw, String str, int i) {
        this.A00 = enumC46582Bw;
    }

    public static List A00(AbstractC12990ll abstractC12990ll, List list) {
        if (!AbstractC54220Nxy.A00(abstractC12990ll).booleanValue()) {
            return null;
        }
        return list;
    }
}
