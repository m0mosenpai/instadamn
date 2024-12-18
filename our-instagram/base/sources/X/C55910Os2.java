package X;

import com.instagram.common.session.UserSession;
import com.instagram.tagging.api.model.MediaSuggestedProductTag;
import com.instagram.user.model.Product;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Os2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55910Os2 implements InterfaceC11380iw, InterfaceC58083Pp8 {
    public static final String __redex_internal_original_name = "ProductTagSuggestionsRowDelegate";
    public final UserSession A00;
    public final AnonymousClass840 A01;
    public final AnonymousClass841 A02;
    public final C52458NJc A03;
    public final C55099ObA A04;
    public final String A05;
    public final InterfaceC16620sF A06;

    @Override // X.InterfaceC58083Pp8
    public final void D3O(MediaSuggestedProductTag mediaSuggestedProductTag, int i) {
        String str;
        String str2;
        ArrayList arrayList;
        InterfaceC16620sF interfaceC16620sF = this.A06;
        UserSession userSession = this.A00;
        Iterator A0n = MSX.A0n(this.A01.A00());
        loop0: while (true) {
            if (A0n.hasNext()) {
                C47Z A0b = AbstractC50522MSa.A0b(userSession, A0n);
                if (A0b != null && (arrayList = A0b.A43) != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (C14360o3.A0K(MSZ.A0v(it), mediaSuggestedProductTag.getId())) {
                            str = A0b.A3t;
                            break loop0;
                        }
                    }
                }
            } else {
                str = null;
                break;
            }
        }
        interfaceC16620sF.invoke(str, "product_suggestion_cell");
        Product A07 = mediaSuggestedProductTag.A07();
        if (A07 != null) {
            String str3 = this.A05;
            String str4 = A07.A0H;
            String A0t = AbstractC25231BEo.A0t(A07.A0B);
            Float A08 = mediaSuggestedProductTag.A08();
            if (AbstractC55108ObP.A02(userSession, this.A02, this.A03.A00, this.A04)) {
                str2 = "opt";
            } else {
                str2 = "seller";
            }
            AbstractC55216Oef.A07(this, userSession, A08, str3, str4, A0t, "feed", str2, i);
        }
    }

    @Override // X.InterfaceC58083Pp8
    public final void Dlv(boolean z, int i) {
        ArrayList arrayList = this.A03.A04().A43;
        if (arrayList != null && !arrayList.isEmpty()) {
            UserSession userSession = this.A00;
            String str = this.A05;
            AbstractC55216Oef.A06(AbstractC55216Oef.A00(arrayList), C56141Ow2.A04.A00(userSession).A00(str, str), this, userSession, str, i, this.A02.CPp(), z);
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "media_broadcast_share";
    }

    public C55910Os2(UserSession userSession, AnonymousClass840 anonymousClass840, AnonymousClass841 anonymousClass841, C52458NJc c52458NJc, C55099ObA c55099ObA, String str, InterfaceC16620sF interfaceC16620sF) {
        this.A03 = c52458NJc;
        this.A00 = userSession;
        this.A02 = anonymousClass841;
        this.A05 = str;
        this.A01 = anonymousClass840;
        this.A04 = c55099ObA;
        this.A06 = interfaceC16620sF;
    }
}
