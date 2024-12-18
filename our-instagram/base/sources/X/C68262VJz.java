package X;

import java.util.concurrent.ExecutorService;

/* renamed from: X.VJz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C68262VJz {
    public int A00;
    public InterfaceC58100PpP A01;
    public C69616VsJ A02;
    public C69492VoF A03;
    public ExecutorService A04;

    public final WGC A00(C69055Vgw c69055Vgw, MYB myb, XEJ xej, W2L w2l, C69275Vkj c69275Vkj, EnumC68130VCo enumC68130VCo) {
        C69616VsJ c69616VsJ = this.A02;
        int i = this.A00;
        C69492VoF c69492VoF = this.A03;
        C14360o3.A0B(c69492VoF, 0);
        C69204VjX c69204VjX = c69492VoF.A0L;
        C70502WZj c70502WZj = new C70502WZj(c69204VjX.A00, c69204VjX.A01, c69204VjX.A02, c69204VjX.A03);
        if (enumC68130VCo == EnumC68130VCo.A03 || enumC68130VCo == EnumC68130VCo.A02) {
            c70502WZj.A02 = true;
            c70502WZj.A01 = true;
            c70502WZj.A00 = true;
        }
        return new WGC(this.A01, myb, c69616VsJ, c69492VoF, c70502WZj, new C69276Vkk(c69055Vgw, xej, w2l, c69275Vkj, c69492VoF.A02), this.A04, i);
    }
}
