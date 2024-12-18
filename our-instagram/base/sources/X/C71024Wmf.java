package X;

import android.widget.TextView;
import com.instagram.model.hashtag.HashtagImpl;

/* renamed from: X.Wmf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71024Wmf implements XLQ {
    public final /* synthetic */ WFL A00;

    @Override // X.XBC
    public final void DAv(InterfaceC11380iw interfaceC11380iw, AbstractC65924TwV abstractC65924TwV, Tx0 tx0) {
    }

    @Override // X.XLQ
    public final void DK6(C68090V9z c68090V9z, Tx0 tx0) {
        HashtagImpl hashtagImpl = c68090V9z.A00;
        String str = hashtagImpl.A0C;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String str3 = hashtagImpl.A0D;
        if (str3 != null) {
            str2 = str3;
        }
        int i = tx0.A00;
        WFL wfl = this.A00;
        C67910V2a c67910V2a = wfl.A00;
        if (c67910V2a == null) {
            C14360o3.A0F("suggestionsAdapter");
            throw C00O.createAndThrow();
        }
        String str4 = c67910V2a.A00;
        InterfaceC11380iw interfaceC11380iw = wfl.A0A;
        AbstractC19330xH A00 = AbstractC11060iN.A00(wfl.A0D);
        C19280xC A002 = C19280xC.A00(interfaceC11380iw, "profile_tagging_search_result_click");
        A002.A0C("link_type", "hashtag");
        A002.A08(Integer.valueOf(i), "position");
        A002.A0C("link_id", str);
        A002.A0C("link_text", str2);
        if (str4 != null) {
            A002.A0C("rank_token", str4);
        }
        A00.EHW(A002);
        C7OR.A00(wfl.A06, wfl.A0F, str2, false);
        TextView textView = wfl.A07;
        if (textView != null) {
            textView.setClickable(true);
            textView.setSelected(false);
        }
    }

    public C71024Wmf(WFL wfl) {
        this.A00 = wfl;
    }
}
