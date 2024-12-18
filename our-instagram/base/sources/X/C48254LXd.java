package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.LXd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48254LXd implements InterfaceC11380iw {
    public static final String __redex_internal_original_name = "TypeaheadStickerFalcoLogger";
    public final C18920wW A00;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "ig_typeahead_stickers";
    }

    public C48254LXd(UserSession userSession) {
        this.A00 = AbstractC12220kQ.A01(this, userSession);
    }

    public final void A00(String str, String str2, String str3, String str4, List list, List list2, boolean z) {
        String str5;
        AbstractC167017dG.A1P(str2, str3);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00, "avatar_stickers_measurement_typeahead_recommendations");
        if (A0f.isSampled()) {
            C0Zx c0Zx = new C0Zx();
            c0Zx.A05("result_size", AbstractC31171DnF.A0V(list.size()));
            c0Zx.A06("referrer_surface", "message_thread");
            c0Zx.A06("lexicon_version", str4);
            if (AbstractC166987dD.A1b(list2)) {
                list = C16930sl.A00;
            }
            c0Zx.A07("non_avatar_sticker_ids", list);
            if (z) {
                str5 = "raw";
            } else {
                str5 = "filtered";
            }
            c0Zx.A06("recommendation_type", str5);
            c0Zx.A06(AbstractC111324zv.A00(2172), str3);
            c0Zx.A06(AbstractC111324zv.A00(63), str2);
            c0Zx.A07("intent", list2);
            AbstractC43593JPy.A1G(A0f, c0Zx, str);
            AbstractC43593JPy.A1I(A0f, "typeahead");
        }
    }
}
