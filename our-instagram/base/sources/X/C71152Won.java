package X;

import android.content.Context;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Won, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71152Won implements InterfaceC58278PsW {
    public InterfaceC71962XCo A00;
    public boolean A01;
    public final Context A02;
    public final InterfaceC11380iw A03;
    public final C69610VsD A04;
    public final C68856VdC A05;

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004c  */
    @Override // X.InterfaceC58278PsW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void CKD(X.X8Y r13) {
        /*
            r12 = this;
            r3 = 0
            boolean r0 = r13 instanceof X.C71149Wok
            if (r0 == 0) goto L60
            X.Wok r13 = (X.C71149Wok) r13
            X.VCv r6 = X.EnumC68136VCv.A04
            X.VdC r3 = r12.A05
            X.Vmh r0 = r3.A00
            X.VCv r7 = r0.A01
            r2 = 1
            java.lang.String r11 = r13.A04
            int r0 = r11.length()
            if (r0 != 0) goto L1a
            kotlin.enums.EnumEntries r0 = X.VCQ.A00
        L1a:
            X.Nhu r4 = r13.A03
            X.Nhu r0 = X.EnumC53318Nhu.A04
            android.content.Context r1 = r12.A02
            if (r4 != r0) goto L5a
            com.instagram.user.model.User r0 = r13.A02
            if (r0 != 0) goto L4f
            java.lang.Integer r9 = X.C05F.A0C
            r0 = 2131964584(0x7f1332a8, float:1.9565954E38)
        L2b:
            java.lang.String r10 = X.AbstractC166997dE.A0p(r1, r0)
            r5 = 0
        L30:
            boolean r0 = r12.A01
            if (r0 != 0) goto L4c
            X.VCQ r8 = X.VCQ.A05
        L36:
            X.Vmh r4 = new X.Vmh
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r3.A00 = r4
            X.VsD r1 = r12.A04
            X.0iw r0 = r12.A03
            r1.A00(r0, r4)
            X.XCo r0 = r12.A00
            if (r0 == 0) goto L4b
            r0.EPd(r2)
        L4b:
            return
        L4c:
            X.VCQ r8 = X.VCQ.A06
            goto L36
        L4f:
            java.lang.Integer r9 = X.C05F.A01
            java.lang.String r10 = r0.getUsername()
            com.instagram.common.typedurl.ImageUrl r5 = r0.Bhu()
            goto L30
        L5a:
            java.lang.Integer r9 = X.C05F.A00
            r0 = 2131964585(0x7f1332a9, float:1.9565956E38)
            goto L2b
        L60:
            boolean r0 = r13 instanceof X.C71148Woj
            if (r0 == 0) goto L4b
            X.VdC r2 = r12.A05
            X.Vmh r0 = r2.A00
            X.VCv r6 = r0.A02
            X.VCv r7 = r0.A01
            java.lang.Integer r9 = r0.A04
            java.lang.String r10 = r0.A06
            com.instagram.common.typedurl.ImageUrl r5 = r0.A00
            java.lang.String r11 = r0.A05
            X.VCQ r8 = X.VCQ.A03
            X.Vmh r4 = new X.Vmh
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            X.VsD r1 = r12.A04
            X.0iw r0 = r12.A03
            r1.A00(r0, r4)
            r2.A00 = r4
            X.XCo r0 = r12.A00
            if (r0 == 0) goto L4b
            r0.EPd(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71152Won.CKD(X.X8Y):void");
    }

    @Override // X.InterfaceC58278PsW
    public final void CgY() {
        this.A01 = false;
        C68856VdC c68856VdC = this.A05;
        C69397Vmh c69397Vmh = c68856VdC.A00;
        VCQ vcq = c69397Vmh.A03;
        if (!(vcq instanceof VBf) && !(vcq instanceof C68102VBe)) {
            Integer num = c69397Vmh.A04;
            String str = c69397Vmh.A06;
            ImageUrl imageUrl = c69397Vmh.A00;
            String str2 = c69397Vmh.A05;
            EnumC68136VCv enumC68136VCv = EnumC68136VCv.A03;
            C69397Vmh c69397Vmh2 = new C69397Vmh(imageUrl, enumC68136VCv, enumC68136VCv, VCQ.A04, num, str, str2);
            c68856VdC.A00 = c69397Vmh2;
            this.A04.A00(this.A03, c69397Vmh2);
        }
    }

    @Override // X.InterfaceC58278PsW
    public final void CgZ() {
        this.A01 = true;
        hide();
    }

    @Override // X.InterfaceC58278PsW
    public final void ElL(ImageUrl imageUrl, String str, String str2, long j) {
    }

    @Override // X.InterfaceC58278PsW
    public final void ElM(long j, String str) {
    }

    @Override // X.InterfaceC57923PmT
    public final void destroy() {
        this.A00 = null;
        remove();
    }

    @Override // X.InterfaceC58278PsW
    public final void EgJ(C54489O5r c54489O5r) {
        this.A04.A00 = c54489O5r;
    }

    @Override // X.InterfaceC58278PsW
    public final void hide() {
        C68856VdC c68856VdC = this.A05;
        C69397Vmh c69397Vmh = c68856VdC.A00;
        EnumC68136VCv enumC68136VCv = c69397Vmh.A01;
        Integer num = c69397Vmh.A04;
        String str = c69397Vmh.A06;
        ImageUrl imageUrl = c69397Vmh.A00;
        String str2 = c69397Vmh.A05;
        C69397Vmh c69397Vmh2 = new C69397Vmh(imageUrl, EnumC68136VCv.A03, enumC68136VCv, VCQ.A02, num, str, str2);
        c68856VdC.A00 = c69397Vmh2;
        this.A04.A00(this.A03, c69397Vmh2);
    }

    @Override // X.InterfaceC58278PsW
    public final void remove() {
        C68856VdC c68856VdC = this.A05;
        C69397Vmh c69397Vmh = c68856VdC.A00;
        EnumC68136VCv enumC68136VCv = c69397Vmh.A01;
        Integer num = c69397Vmh.A04;
        String str = c69397Vmh.A06;
        ImageUrl imageUrl = c69397Vmh.A00;
        String str2 = c69397Vmh.A05;
        C69397Vmh c69397Vmh2 = new C69397Vmh(imageUrl, EnumC68136VCv.A03, enumC68136VCv, VCQ.A03, num, str, str2);
        c68856VdC.A00 = c69397Vmh2;
        this.A04.A00(this.A03, c69397Vmh2);
        InterfaceC71962XCo interfaceC71962XCo = this.A00;
        if (interfaceC71962XCo != null) {
            interfaceC71962XCo.EPd(false);
        }
        InterfaceC71962XCo interfaceC71962XCo2 = this.A00;
        if (interfaceC71962XCo2 != null) {
            interfaceC71962XCo2.CtV();
        }
    }

    public C71152Won(Context context, InterfaceC11380iw interfaceC11380iw, C69610VsD c69610VsD, C68856VdC c68856VdC) {
        this.A02 = context;
        this.A03 = interfaceC11380iw;
        this.A05 = c68856VdC;
        this.A04 = c69610VsD;
    }

    @Override // X.InterfaceC58278PsW
    public final void Ebz(InterfaceC71962XCo interfaceC71962XCo) {
        this.A00 = interfaceC71962XCo;
    }
}
