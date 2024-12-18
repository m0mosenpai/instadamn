package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.location.surface.api.model.operationhours.LocationPageInfoPageOperationHourResponse;

/* renamed from: X.V2i, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67918V2i extends C7E1 implements InterfaceC65252xN {
    public VJG A00;
    public IC0 A01;
    public final C68824Vcf A02;
    public final Context A03;
    public final C65662y2 A04;
    public final UserSession A05;
    public final C66096TzX A06 = new C66096TzX();
    public final C67932V2x A07;
    public final V3N A08;
    public final V3R A09;
    public final C67845UzJ A0A;
    public final ES2 A0B;
    public final C32438EQq A0C;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.VJG, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v0, types: [X.2y2, java.lang.Object, X.2y0] */
    public C67918V2i(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C67845UzJ c67845UzJ, C68824Vcf c68824Vcf, W1V w1v) {
        C130455uq c130455uq;
        this.A03 = context;
        this.A05 = userSession;
        this.A0A = c67845UzJ;
        LocationPageInfoPageOperationHourResponse locationPageInfoPageOperationHourResponse = c67845UzJ.A01;
        ?? obj = new Object();
        obj.A00 = locationPageInfoPageOperationHourResponse;
        obj.A01 = false;
        this.A00 = obj;
        this.A02 = c68824Vcf;
        ?? obj2 = new Object();
        this.A04 = obj2;
        V3N v3n = new V3N(context, new C68823Vce(this));
        this.A08 = v3n;
        C67932V2x c67932V2x = new C67932V2x(context, new WNU(this, 51));
        this.A07 = c67932V2x;
        ES2 es2 = new ES2(context);
        this.A0B = es2;
        C69015Vfr c69015Vfr = c67845UzJ.A00;
        if (c69015Vfr != null && (c130455uq = c69015Vfr.A00) != null) {
            this.A01 = AbstractC40622Hzg.A00(c130455uq);
        }
        V3R v3r = new V3R(context, interfaceC11380iw, userSession, new C68758Vbb(), new C68822Vcd(this), w1v);
        this.A09 = v3r;
        C32438EQq c32438EQq = new C32438EQq(context);
        this.A0C = c32438EQq;
        A0B(obj2, v3n, c67932V2x, es2, v3r, c32438EQq);
    }

    @Override // X.InterfaceC65252xN
    public final void EVk(int i) {
        this.A04.A03 = i;
        A0C();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r2.A01 == null) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v6, types: [X.VJF, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0C() {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67918V2i.A0C():void");
    }
}
