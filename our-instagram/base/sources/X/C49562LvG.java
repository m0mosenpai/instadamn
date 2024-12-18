package X;

import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.LvG, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49562LvG implements MPB {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C26086BgF A01;
    public final /* synthetic */ LZV A02;
    public final /* synthetic */ C44761Jri A03;
    public final /* synthetic */ C47927LEw A04;
    public final /* synthetic */ C45696KKz A05;

    public C49562LvG(C26086BgF c26086BgF, LZV lzv, C44761Jri c44761Jri, C47927LEw c47927LEw, C45696KKz c45696KKz, int i) {
        this.A05 = c45696KKz;
        this.A03 = c44761Jri;
        this.A04 = c47927LEw;
        this.A01 = c26086BgF;
        this.A02 = lzv;
        this.A00 = i;
    }

    @Override // X.MPB
    public final void D7M(boolean z) {
        C45696KKz c45696KKz = this.A05;
        c45696KKz.A04 = false;
        c45696KKz.A0I();
        c45696KKz.setVisibility(8);
        C44761Jri c44761Jri = this.A03;
        c44761Jri.A01.removeView(c45696KKz);
        C47927LEw c47927LEw = this.A04;
        C45510KCz c45510KCz = c47927LEw.A02;
        C26086BgF c26086BgF = this.A01;
        LZV lzv = this.A02;
        List list = lzv.A01;
        int i = this.A00;
        C26086BgF c26086BgF2 = (C26086BgF) AbstractC001800i.A0O(list, i + 1);
        boolean z2 = !z;
        C14360o3.A0B(c26086BgF, 0);
        C45510KCz.A03(c45510KCz).A03(c26086BgF2, (User) c26086BgF.A01);
        C3CY A03 = C45510KCz.A03(c45510KCz);
        String str = c26086BgF.A04;
        C14360o3.A0B(str, 0);
        A03.A04.A01.add(str);
        if (z2) {
            C191138dB.A02(EnumC46286KeI.TAP_NEXT_QUICKSNAP, A03.A03, null);
        }
        C47927LEw.A00(lzv, c44761Jri, c47927LEw, i + 3);
        c44761Jri.A01();
    }
}
