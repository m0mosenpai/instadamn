package X;

import android.content.Context;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes9.dex */
public final class OW6 {
    public Context A00;
    public XC1 A01;
    public XC9 A02;
    public C58647PzK A03;
    public X9T A04;
    public WG9 A05;
    public InterfaceC58019Po5 A06;
    public X9U A07;
    public X9V A08;
    public InterfaceC58105PpU A09;
    public InterfaceC71972XDf A0A;
    public XD9 A0B;
    public C69489VoC A0C;
    public InterfaceC71895X9c A0D;
    public ExecutorService A0E;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.PpU, X.WZ3, java.lang.Object] */
    public static void A00(Context context, OBZ obz, OW6 ow6, C69489VoC c69489VoC) {
        ow6.A0C = c69489VoC;
        ow6.A00 = context;
        ow6.A05 = null;
        ow6.A07 = obz.A00;
        ow6.A0E = Executors.newCachedThreadPool();
        ow6.A0A = obz.A03;
        ow6.A08 = obz.A01;
        C66014TyA c66014TyA = AbstractC66016TyE.A00;
        ?? obj = new Object();
        obj.A00 = c66014TyA;
        ow6.A09 = obj;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [X.PzK, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, X.WYz, X.XES] */
    /* JADX WARN: Type inference failed for: r0v24, types: [X.X9T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27, types: [X.XD9, java.lang.Object] */
    public final C54733OFk A01() {
        this.A00.getClass();
        this.A0C.getClass();
        this.A07.getClass();
        this.A0E.getClass();
        this.A0A.getClass();
        this.A08.getClass();
        if (this.A0B == null) {
            this.A0B = new Object();
        }
        if (this.A06 == null) {
            this.A06 = new C55771Opf(this.A00);
        }
        if (this.A02 == null) {
            this.A02 = VYA.A00;
        }
        if (this.A04 == null) {
            this.A04 = new Object();
        }
        if (this.A01 != null) {
            W3N w3n = new W3N(this.A0C);
            C69489VoC c69489VoC = this.A0C;
            XES xes = c69489VoC.A07;
            WDI wdi = c69489VoC.A06;
            XC1 xc1 = this.A01;
            HashMap hashMap = new HashMap(2);
            hashMap.put(AbstractC111324zv.A00(4470), "TranscodeUtilsParams");
            hashMap.put("waterfall_id", AbstractC166997dE.A0n());
            C69568VrX c69568VrX = new C69568VrX(xc1, wdi, hashMap);
            ?? obj = new Object();
            obj.A01 = xes;
            obj.A00 = c69568VrX;
            w3n.A07 = obj;
            this.A0C = new C69489VoC(w3n);
        }
        if (this.A0D == null) {
            this.A0D = new WZY(new U7T(), this.A0B);
        }
        if (this.A03 == null) {
            this.A03 = new Object();
        }
        return new C54733OFk(this);
    }
}
