package X;

import com.instagram.igds.components.search.IgdsInlineSearchBox;

/* loaded from: classes8.dex */
public final class M34 implements Runnable {
    public final /* synthetic */ AbstractC45465KBa A00;
    public final /* synthetic */ IgdsInlineSearchBox A01;

    public M34(AbstractC45465KBa abstractC45465KBa, IgdsInlineSearchBox igdsInlineSearchBox) {
        this.A00 = abstractC45465KBa;
        this.A01 = igdsInlineSearchBox;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC45465KBa abstractC45465KBa = this.A00;
        if (abstractC45465KBa.getActivity() != null && abstractC45465KBa.isAdded()) {
            C5SU c5su = new C5SU(abstractC45465KBa.requireActivity(), new C149686oL(AnonymousClass001.A0C(abstractC45465KBa.getString(2131953488), '.')));
            c5su.A03(this.A01);
            c5su.A01();
            c5su.A0B = true;
            c5su.A00().A06();
            C44543Jmn A0K = AbstractC43593JPy.A0K(abstractC45465KBa);
            InterfaceC19610xo ARD = A0K.A0L.A00.ARD();
            ARD.E77("key_has_seen_avatar_mentions_tooltip_v4", true);
            ARD.apply();
            AbstractC34759FSy.A00(A0K.A0I, "Type @ to search friends' avatars");
        }
    }
}
