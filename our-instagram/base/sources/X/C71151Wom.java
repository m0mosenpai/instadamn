package X;

import android.content.Context;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Wom, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71151Wom implements InterfaceC58278PsW {
    public boolean A00;
    public InterfaceC71962XCo A01;
    public final InterfaceC11380iw A02;
    public final C69610VsD A03;
    public final C68856VdC A04;
    public final Context A05;

    @Override // X.InterfaceC58278PsW
    public final /* synthetic */ void CKD(X8Y x8y) {
    }

    @Override // X.InterfaceC58278PsW
    public final void CgY() {
        this.A00 = false;
        C68856VdC c68856VdC = this.A04;
        C69397Vmh c69397Vmh = c68856VdC.A00;
        VCQ vcq = c69397Vmh.A03;
        if (!(vcq instanceof VBf) && !(vcq instanceof C68102VBe)) {
            EnumC68136VCv enumC68136VCv = c69397Vmh.A01;
            Integer num = c69397Vmh.A04;
            String str = c69397Vmh.A06;
            C69397Vmh c69397Vmh2 = new C69397Vmh(c69397Vmh.A00, enumC68136VCv, EnumC68136VCv.A03, VCQ.A04, num, str, c69397Vmh.A05);
            c68856VdC.A00 = c69397Vmh2;
            this.A03.A00(this.A02, c69397Vmh2);
        }
    }

    @Override // X.InterfaceC58278PsW
    public final void CgZ() {
        this.A00 = true;
        hide();
    }

    @Override // X.InterfaceC58278PsW
    public final void EgJ(C54489O5r c54489O5r) {
        this.A03.A00 = c54489O5r;
    }

    @Override // X.InterfaceC58278PsW
    public final void ElL(ImageUrl imageUrl, String str, String str2, long j) {
        VCQ vcq;
        EnumC68136VCv enumC68136VCv = EnumC68136VCv.A04;
        C68856VdC c68856VdC = this.A04;
        EnumC68136VCv enumC68136VCv2 = EnumC68136VCv.A03;
        if (!this.A00) {
            vcq = VCQ.A05;
        } else {
            vcq = VCQ.A06;
        }
        if (str.length() == 0) {
            vcq = VCQ.A03;
        }
        C69397Vmh c69397Vmh = new C69397Vmh(imageUrl, enumC68136VCv, enumC68136VCv2, vcq, C05F.A01, str2, str);
        c68856VdC.A00 = c69397Vmh;
        this.A03.A00(this.A02, c69397Vmh);
    }

    @Override // X.InterfaceC58278PsW
    public final void ElM(long j, String str) {
        VCQ vcq;
        EnumC68136VCv enumC68136VCv = EnumC68136VCv.A04;
        C68856VdC c68856VdC = this.A04;
        EnumC68136VCv enumC68136VCv2 = EnumC68136VCv.A03;
        if (!this.A00) {
            vcq = VCQ.A05;
        } else {
            vcq = VCQ.A06;
        }
        if (str.length() == 0) {
            vcq = VCQ.A03;
        }
        C69397Vmh c69397Vmh = new C69397Vmh(null, enumC68136VCv, enumC68136VCv2, vcq, C05F.A00, AbstractC166997dE.A0p(this.A05, 2131964585), str);
        c68856VdC.A00 = c69397Vmh;
        this.A03.A00(this.A02, c69397Vmh);
    }

    @Override // X.InterfaceC58278PsW
    public final void hide() {
        C68856VdC c68856VdC = this.A04;
        C69397Vmh c69397Vmh = c68856VdC.A00;
        EnumC68136VCv enumC68136VCv = c69397Vmh.A01;
        Integer num = c69397Vmh.A04;
        String str = c69397Vmh.A06;
        ImageUrl imageUrl = c69397Vmh.A00;
        String str2 = c69397Vmh.A05;
        C69397Vmh c69397Vmh2 = new C69397Vmh(imageUrl, EnumC68136VCv.A03, enumC68136VCv, VCQ.A02, num, str, str2);
        c68856VdC.A00 = c69397Vmh2;
        this.A03.A00(this.A02, c69397Vmh2);
    }

    @Override // X.InterfaceC58278PsW
    public final void remove() {
        C68856VdC c68856VdC = this.A04;
        C69397Vmh c69397Vmh = c68856VdC.A00;
        EnumC68136VCv enumC68136VCv = c69397Vmh.A01;
        Integer num = c69397Vmh.A04;
        String str = c69397Vmh.A06;
        ImageUrl imageUrl = c69397Vmh.A00;
        String str2 = c69397Vmh.A05;
        C69397Vmh c69397Vmh2 = new C69397Vmh(imageUrl, EnumC68136VCv.A03, enumC68136VCv, VCQ.A03, num, str, str2);
        c68856VdC.A00 = c69397Vmh2;
        this.A03.A00(this.A02, c69397Vmh2);
        InterfaceC71962XCo interfaceC71962XCo = this.A01;
        if (interfaceC71962XCo != null) {
            interfaceC71962XCo.EPd(false);
        }
        InterfaceC71962XCo interfaceC71962XCo2 = this.A01;
        if (interfaceC71962XCo2 != null) {
            interfaceC71962XCo2.CtV();
        }
    }

    public C71151Wom(Context context, InterfaceC11380iw interfaceC11380iw, C69610VsD c69610VsD, C68856VdC c68856VdC) {
        this.A05 = context;
        this.A02 = interfaceC11380iw;
        this.A04 = c68856VdC;
        this.A03 = c69610VsD;
    }

    @Override // X.InterfaceC58278PsW
    public final void Ebz(InterfaceC71962XCo interfaceC71962XCo) {
        this.A01 = interfaceC71962XCo;
    }

    @Override // X.InterfaceC57923PmT
    public final void destroy() {
        remove();
    }
}
