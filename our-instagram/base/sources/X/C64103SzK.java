package X;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import kotlin.Deprecated;

/* renamed from: X.SzK, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64103SzK implements InterfaceC65597Tng {
    public long A00;
    public C63373Sif A01;
    public final Handler A02;
    public final C63222SfT A03;
    public final AbstractC61290Rl1 A04;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.Rkm, java.lang.Object] */
    public C64103SzK(Context context, Handler handler, InterfaceC65317Tht interfaceC65317Tht, C63222SfT c63222SfT, AbstractC61290Rl1 abstractC61290Rl1) {
        AbstractC25233BEq.A0x(3, abstractC61290Rl1, c63222SfT, handler);
        this.A04 = abstractC61290Rl1;
        this.A03 = c63222SfT;
        this.A02 = handler;
        this.A00 = 1000L;
        this.A01 = new C63373Sif(context, interfaceC65317Tht, new Object());
    }

    @Override // X.InterfaceC65597Tng
    public final void E7T(InterfaceC65314Thq interfaceC65314Thq, SAO sao, boolean z) {
        C14360o3.A0B(sao, 0);
        this.A01.A0B(interfaceC65314Thq, sao);
    }

    @Override // X.InterfaceC65597Tng
    @Deprecated(message = "See https://developer.android.com/google/play/billing/query-purchase-history for alternatives to use.")
    public final void E7U(InterfaceC65315Thr interfaceC65315Thr, String str, boolean z) {
        C14360o3.A0B(str, 0);
        this.A01.A0C(interfaceC65315Thr, str);
    }

    @Override // X.InterfaceC65597Tng
    @Deprecated(message = "use queryProductDetailsAsync as per Google API documentation")
    public final void E7W(SD8 sd8, InterfaceC65318Thu interfaceC65318Thu, boolean z) {
        C14360o3.A0B(sd8, 0);
        this.A01.A0E(sd8, interfaceC65318Thu);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.SAL, java.lang.Object] */
    @Override // X.InterfaceC65597Tng
    public final void A7G(InterfaceC65312Tho interfaceC65312Tho, String str, boolean z) {
        ?? obj = new Object();
        obj.A00 = str;
        this.A01.A08(obj, interfaceC65312Tho);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.SAM, java.lang.Object] */
    @Override // X.InterfaceC65597Tng
    public final void AJc(InterfaceC65313Thp interfaceC65313Thp, String str, boolean z) {
        ?? obj = new Object();
        obj.A00 = str;
        this.A01.A0A(obj, interfaceC65313Thp);
    }

    @Override // X.InterfaceC65597Tng
    public final void AST() {
        this.A01.A07();
    }

    @Override // X.InterfaceC65597Tng
    public final SYG CUc(String str) {
        SYG A05 = this.A01.A05();
        C14360o3.A07(A05);
        return A05;
    }

    @Override // X.InterfaceC65597Tng
    public final boolean CbZ() {
        return this.A01.A0F();
    }

    @Override // X.InterfaceC65597Tng
    public final void Cgj(Activity activity, C62598SIc c62598SIc, InterfaceC65344TiR interfaceC65344TiR) {
        SYG A06 = this.A01.A06(activity, c62598SIc);
        C14360o3.A07(A06);
        interfaceC65344TiR.DOT(A06);
    }

    @Override // X.InterfaceC65597Tng
    public final void E7V(InterfaceC65316Ths interfaceC65316Ths, SAP sap, boolean z) {
        this.A01.A0D(interfaceC65316Ths, sap);
    }

    @Override // X.InterfaceC65597Tng
    public final void EnA(InterfaceC65468Tkk interfaceC65468Tkk, boolean z) {
        this.A03.A00.Ci3(null, null, "client_init_iap_store_connection_init");
        C0K8.A0C("DCP", "Starting in-app billing connection.");
        this.A01.A09(new C63703SsH(0, interfaceC65468Tkk, this));
    }
}
