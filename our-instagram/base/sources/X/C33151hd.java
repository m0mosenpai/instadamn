package X;

import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.model.direct.DirectThreadKey;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1hd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33151hd extends AbstractC29011ae implements InterfaceC29171au {
    public static final C1OZ A04 = new C1OZ() { // from class: X.1he
        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C33151hd c33151hd = (C33151hd) obj;
            anonymousClass182.A0d();
            if (c33151hd.A00 != null) {
                anonymousClass182.A0r("optimistic_data");
                L4D l4d = c33151hd.A00;
                anonymousClass182.A0d();
                String str = l4d.A03;
                if (str != null) {
                    anonymousClass182.A0S("poll_id", str);
                }
                String str2 = l4d.A04;
                if (str2 != null) {
                    anonymousClass182.A0S("poll_question", str2);
                }
                if (l4d.A00 != null) {
                    anonymousClass182.A0r("poll_author_picture");
                    AbstractC222616c.A01(anonymousClass182, l4d.A00);
                }
                C16V.A03(anonymousClass182, "poll_options");
                for (L1X l1x : l4d.A05) {
                    if (l1x != null) {
                        anonymousClass182.A0d();
                        String str3 = l1x.A02;
                        if (str3 != null) {
                            anonymousClass182.A0S("option_text", str3);
                        }
                        anonymousClass182.A0Q("option_percentage", l1x.A00);
                        anonymousClass182.A0Q("option_vote_count", l1x.A01);
                        anonymousClass182.A0a();
                    }
                }
                anonymousClass182.A0Z();
                String str4 = l4d.A02;
                if (str4 != null) {
                    anonymousClass182.A0S(DevServerEntity.COLUMN_DESCRIPTION, str4);
                }
                anonymousClass182.A0S("action_log", l4d.A01);
                anonymousClass182.A0a();
            }
            String str5 = c33151hd.A01;
            if (str5 != null) {
                anonymousClass182.A0S("question_text", str5);
            }
            if (c33151hd.A02 != null) {
                C16V.A03(anonymousClass182, "options");
                for (String str6 : c33151hd.A02) {
                    if (str6 != null) {
                        anonymousClass182.A0u(str6);
                    }
                }
                anonymousClass182.A0Z();
            }
            anonymousClass182.A0T("is_xac_thread", c33151hd.A03);
            AbstractC47856LCb.A00(anonymousClass182, c33151hd);
            anonymousClass182.A0a();
        }

        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            return AbstractC46968Kpn.parseFromJson(c16l);
        }
    };
    public L4D A00;
    public String A01;
    public List A02;
    public boolean A03;

    @Override // X.C1OW
    public final String A02() {
        return "send_poll_message";
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, X.3nw] */
    @Override // X.AbstractC29011ae
    public final /* bridge */ /* synthetic */ Object A05() {
        L4D l4d = this.A00;
        C14360o3.A0B(l4d, 0);
        C910143t c910143t = new C910143t();
        String str = l4d.A03;
        if (str != null) {
            c910143t.A0D = Long.parseLong(str);
        }
        c910143t.A0N = l4d.A00;
        c910143t.A19 = l4d.A04;
        c910143t.A1A = l4d.A02;
        ?? obj = new Object();
        obj.A03 = l4d.A01;
        c910143t.A0O = obj;
        List list = l4d.A05;
        L1X l1x = (L1X) AbstractC001800i.A0O(list, 0);
        if (l1x != null) {
            c910143t.A1B = l1x.A02;
            c910143t.A03 = l1x.A00;
            c910143t.A0H = l1x.A01;
        }
        L1X l1x2 = (L1X) AbstractC001800i.A0O(list, 1);
        if (l1x2 != null) {
            c910143t.A1C = l1x2.A02;
            c910143t.A04 = l1x2.A00;
            c910143t.A0I = l1x2.A01;
        }
        L1X l1x3 = (L1X) AbstractC001800i.A0O(list, 2);
        if (l1x3 != null) {
            c910143t.A1D = l1x3.A02;
            c910143t.A05 = l1x3.A00;
            c910143t.A0J = l1x3.A01;
        }
        List singletonList = Collections.singletonList(c910143t);
        C14360o3.A07(singletonList);
        return singletonList;
    }

    @Override // X.InterfaceC29021af
    public final C2EY Ar9() {
        return C2EY.A0k;
    }

    @Override // X.InterfaceC29171au
    public final DirectThreadKey C7Q() {
        return (DirectThreadKey) C7R().get(0);
    }
}
