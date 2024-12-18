package X;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Deprecated;

/* renamed from: X.SzL, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64104SzL implements InterfaceC65597Tng {
    public static final java.util.Set A05 = AbstractC16830sb.A07(6, 2, 12);
    public C63373Sif A00;
    public final Handler A01;
    public final C63222SfT A02;
    public final RunnableC64730TRm A03;
    public final ConcurrentLinkedQueue A04;

    @Override // X.InterfaceC65597Tng
    public final void A7G(InterfaceC65312Tho interfaceC65312Tho, String str, boolean z) {
        new C60515R1w(interfaceC65312Tho, new C64108SzP(3), this, str).A00();
    }

    @Override // X.InterfaceC65597Tng
    public final void AJc(InterfaceC65313Thp interfaceC65313Thp, String str, boolean z) {
        new R1y(interfaceC65313Thp, new C64108SzP(3), this, str).A00();
    }

    @Override // X.InterfaceC65597Tng
    public final void Cgj(Activity activity, C62598SIc c62598SIc, InterfaceC65344TiR interfaceC65344TiR) {
        new R23(activity, c62598SIc, interfaceC65344TiR, new C64108SzP(3), this).A00();
    }

    @Override // X.InterfaceC65597Tng
    public final void E7T(InterfaceC65314Thq interfaceC65314Thq, SAO sao, boolean z) {
        C14360o3.A0B(sao, 0);
        new C60517R1z(interfaceC65314Thq, sao, new C64108SzP(3), this).A00();
    }

    @Override // X.InterfaceC65597Tng
    @Deprecated(message = "See https://developer.android.com/google/play/billing/query-purchase-history for alternatives to use.")
    public final void E7U(InterfaceC65315Thr interfaceC65315Thr, String str, boolean z) {
        C14360o3.A0B(str, 0);
        new R20(interfaceC65315Thr, new C64108SzP(3), this, str).A00();
    }

    @Override // X.InterfaceC65597Tng
    @Deprecated(message = "use queryProductDetailsAsync as per Google API documentation")
    public final void E7W(SD8 sd8, InterfaceC65318Thu interfaceC65318Thu, boolean z) {
        C14360o3.A0B(sd8, 0);
        new R22(sd8, interfaceC65318Thu, new C64108SzP(3), this).A00();
    }

    @Override // X.InterfaceC65597Tng
    public final void EnA(InterfaceC65468Tkk interfaceC65468Tkk, boolean z) {
        C60516R1x c60516R1x = new C60516R1x(interfaceC65468Tkk, new C64108SzP(3), this);
        ((SPD) c60516R1x).A00 = false;
        c60516R1x.A00();
    }

    @Override // X.InterfaceC65597Tng
    public final void AST() {
        this.A00.A07();
    }

    @Override // X.InterfaceC65597Tng
    public final SYG CUc(String str) {
        SYG A052 = this.A00.A05();
        C14360o3.A07(A052);
        return A052;
    }

    @Override // X.InterfaceC65597Tng
    public final boolean CbZ() {
        return this.A00.A0F();
    }

    @Override // X.InterfaceC65597Tng
    public final void E7V(InterfaceC65316Ths interfaceC65316Ths, SAP sap, boolean z) {
        InterfaceC65573Tn7 c64108SzP;
        if (z) {
            c64108SzP = new C64107SzO(1000L, 4L, 16000L);
        } else {
            c64108SzP = new C64108SzP(3);
        }
        new R21(interfaceC65316Ths, sap, c64108SzP, this).A00();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.Rkm, java.lang.Object] */
    public C64104SzL(Context context, Handler handler, InterfaceC65317Tht interfaceC65317Tht, C63222SfT c63222SfT) {
        AbstractC37302Gc3.A1U(c63222SfT, handler);
        this.A02 = c63222SfT;
        this.A01 = handler;
        ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
        this.A04 = concurrentLinkedQueue;
        C63373Sif c63373Sif = new C63373Sif(context, interfaceC65317Tht, new Object());
        this.A00 = c63373Sif;
        this.A03 = new RunnableC64730TRm(c63373Sif, c63222SfT, this, concurrentLinkedQueue);
    }
}
