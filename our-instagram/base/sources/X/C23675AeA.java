package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.instagram.creation.capture.quickcapture.thirdpartymedia.GiphyClipsBrowserFragment;

/* renamed from: X.AeA, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23675AeA implements InterfaceC25177BCa {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C23675AeA(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A03 = obj2;
        this.A02 = obj3;
        this.A01 = obj;
        this.A04 = obj4;
    }

    @Override // X.InterfaceC25177BCa
    public final void DQ0() {
        if (this.A00 != 0) {
            C44662Jq7 c44662Jq7 = (C44662Jq7) this.A04;
            int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
            GiphyClipsBrowserFragment giphyClipsBrowserFragment = c44662Jq7.A01;
            EnumC50631MWs enumC50631MWs = giphyClipsBrowserFragment.A00;
            if (enumC50631MWs != null) {
                C22C A01 = AnonymousClass229.A01(AbstractC166987dD.A0r(giphyClipsBrowserFragment.A09));
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(((C22F) A01).A01, MSV.A00(469));
                if (A0f.isSampled()) {
                    AbstractC166997dE.A1N(A0f, "event_type", 1);
                    AbstractC166997dE.A1N(A0f, "entity_type", 41);
                    AbstractC167007dF.A10(A0f, A01);
                    C22M c22m = ((C22F) A01).A04;
                    AbstractC166987dD.A1S(A0f, c22m.A0L);
                    A0f.A8R(C81X.A2v, "camera_tool");
                    A0f.AAP("composition_str_id", c22m.A0M);
                    A0f.A8R(AnonymousClass249.VIDEO, "composition_media_type");
                    A0f.A8R(enumC50631MWs, "surface");
                    A0f.AAP("module", "giphy_clips_grid");
                    AbstractC167017dG.A1C(A0f);
                }
            }
            ((View) this.A02).setVisibility(0);
            ((View) this.A01).setVisibility(0);
            return;
        }
        ((C5RP) this.A03).EFh(this);
        C210959Us c210959Us = (C210959Us) this.A02;
        AbstractC13880nE.A0q(c210959Us.A03, new RunnableC24751AxZ((Drawable) this.A01, c210959Us, (C148276lx) this.A04));
    }

    @Override // X.InterfaceC25177BCa
    public final void DZL() {
        if (this.A00 != 0) {
            ((View) this.A03).setVisibility(8);
        }
    }
}
