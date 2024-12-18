package X;

import android.graphics.Bitmap;

/* renamed from: X.8XT, reason: invalid class name */
/* loaded from: classes4.dex */
public final /* synthetic */ class C8XT implements InterfaceC14180ni, InterfaceC58362lv {
    public final /* synthetic */ C8XH A00;

    public C8XT(C8XH c8xh) {
        this.A00 = c8xh;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof InterfaceC58362lv) && (obj instanceof InterfaceC14180ni)) {
            return C14360o3.A0K(getFunctionDelegate(), ((InterfaceC14180ni) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // X.InterfaceC14180ni
    public final InterfaceC09250da getFunctionDelegate() {
        return new C03E(1, this.A00, C8XH.class, "openStoryPostCapFromDraftSubFragment", "openStoryPostCapFromDraftSubFragment(Lcom/instagram/reels/draft/util/StoryDraftOpenConfig;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // X.InterfaceC58362lv
    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        C193838i4 c193838i4;
        C206409Bx c206409Bx = (C206409Bx) obj;
        C14360o3.A0B(c206409Bx, 0);
        C8XH c8xh = this.A00;
        C8XG c8xg = c8xh.A05;
        String str = c206409Bx.A01;
        if (str.isEmpty()) {
            AbstractC12120kG.A01("QccState", "Invalid Activity result from StoryDraftFragment draft selection");
        } else {
            C188798Xv c188798Xv = c8xg.A00.A1M;
            if (c188798Xv != null && (c193838i4 = c188798Xv.A00().A02) != null) {
                c193838i4.DpK((Bitmap) c206409Bx.A00, str);
            }
        }
        c8xh.A00 = C8XI.A06;
        c8xh.A04.A01.A0V = false;
        c8xh.A03.A0x("QuickCaptureSubFragmentManager", 1);
    }
}
