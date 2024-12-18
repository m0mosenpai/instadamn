package X;

import com.instagram.common.typedurl.SimpleImageUrl;

/* renamed from: X.AjS, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23933AjS implements C74M {
    public final /* synthetic */ C8NW A00;
    public final /* synthetic */ Runnable A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    @Override // X.C74M
    public final /* synthetic */ void DIW(InterfaceC71992XEf interfaceC71992XEf, String str, String str2) {
    }

    @Override // X.C74M
    public final /* synthetic */ void DQ4(XEC xec, String str, String str2, String str3) {
    }

    @Override // X.C74M
    public final void Dbm(String str, float f) {
    }

    public C23933AjS(C8NW c8nw, Runnable runnable, String str, String str2) {
        this.A01 = runnable;
        this.A03 = str;
        this.A00 = c8nw;
        this.A02 = str2;
    }

    @Override // X.C74M
    public final /* synthetic */ boolean EiZ() {
        return false;
    }

    @Override // X.C74M
    public final void onError(String str) {
        this.A01.run();
        AbstractC12120kG.A0E("StickerOverlayController", AnonymousClass001.A0R("failed to import gif ", this.A02), null);
        C9GR.A0A(this.A00.A0f, "failed_to_import_gif");
    }

    @Override // X.C74M
    public final void DQ3(XEC xec, String str, String str2) {
        AbstractC167017dG.A1N(str, xec);
        this.A01.run();
        float width = xec.getWidth();
        float height = xec.getHeight();
        String str3 = this.A03;
        C148286ly A00 = C148286ly.A00(new SimpleImageUrl(str), str3, str3, width, height, 0.6f);
        C148276lx c148276lx = C148276lx.A0a;
        C148276lx A05 = AbstractC148296lz.A05(A00, str3);
        C8NW c8nw = this.A00;
        C11T.A02(new RunnableC24775Axx(C194808jg.A01(c8nw.A0f, c8nw.A0r, A05), A05, c8nw));
    }
}
