package X;

import android.content.Context;
import android.os.Handler;
import com.instagram.common.session.UserSession;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;

/* renamed from: X.Oop, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55723Oop implements InterfaceC197408oB {
    public final UserSession A00;
    public final C54777OIr A01;
    public final InterfaceC58147PqC A02;
    public final C55006OVn A03;
    public final Context A04;
    public final Handler A05;
    public final OA8 A06;
    public final O7U A07;
    public final C197328o3 A08;
    public final FilterGroupModel A09;
    public final InterfaceC197178nn A0A;
    public final EnumC53116NeT[] A0B;

    public C55723Oop(Context context, UserSession userSession, C197328o3 c197328o3, InterfaceC58147PqC interfaceC58147PqC, FilterGroupModel filterGroupModel, InterfaceC197178nn interfaceC197178nn, EnumC53116NeT[] enumC53116NeTArr) {
        AbstractC37302Gc3.A1U(interfaceC197178nn, c197328o3);
        this.A04 = context;
        this.A00 = userSession;
        this.A0A = interfaceC197178nn;
        this.A08 = c197328o3;
        this.A09 = filterGroupModel;
        this.A0B = enumC53116NeTArr;
        this.A02 = interfaceC58147PqC;
        this.A05 = AbstractC167007dF.A0J();
        C54777OIr c54777OIr = new C54777OIr(userSession, interfaceC197178nn, C05F.A01);
        this.A01 = c54777OIr;
        boolean z = c54777OIr.A02;
        this.A06 = new OA8(userSession, true, z);
        this.A07 = new O7U(userSession, z);
        this.A03 = new C55006OVn(context, userSession, interfaceC58147PqC, null);
    }

    @Override // X.InterfaceC197408oB
    public final /* synthetic */ void CNl(C197368o7 c197368o7) {
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x01dc A[Catch: all -> 0x0273, TryCatch #0 {all -> 0x0273, blocks: (B:31:0x00e3, B:33:0x00eb, B:34:0x00fb, B:39:0x0128, B:43:0x0135, B:45:0x0158, B:46:0x01c3, B:48:0x01dc, B:49:0x01f4, B:52:0x022a, B:54:0x0239, B:55:0x023d, B:57:0x024f, B:58:0x025c, B:59:0x0272, B:62:0x0255, B:65:0x011d), top: B:30:0x00e3, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x022a A[Catch: all -> 0x0273, TryCatch #0 {all -> 0x0273, blocks: (B:31:0x00e3, B:33:0x00eb, B:34:0x00fb, B:39:0x0128, B:43:0x0135, B:45:0x0158, B:46:0x01c3, B:48:0x01dc, B:49:0x01f4, B:52:0x022a, B:54:0x0239, B:55:0x023d, B:57:0x024f, B:58:0x025c, B:59:0x0272, B:62:0x0255, B:65:0x011d), top: B:30:0x00e3, outer: #1 }] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, com.instagram.creation.photo.edit.surfacecropfilter.SurfaceCropFilter] */
    @Override // X.InterfaceC197408oB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void EGX(X.C197368o7 r31) {
        /*
            Method dump skipped, instructions count: 795
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55723Oop.EGX(X.8o7):void");
    }

    @Override // X.InterfaceC197408oB
    public final void cancel() {
        this.A05.post(new RunnableC56862PLh(this));
    }
}
