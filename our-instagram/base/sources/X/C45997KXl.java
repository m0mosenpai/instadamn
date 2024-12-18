package X;

import com.instagram.friendmap.data.FriendMapAudienceListRepository;

/* renamed from: X.KXl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45997KXl extends JQC {
    public AnonymousClass195 A00;
    public final FriendMapAudienceListRepository A01;

    public C45997KXl(FriendMapAudienceListRepository friendMapAudienceListRepository) {
        super(new C45291K2t("", C16930sl.A00, true, false, false, false, false, false, false, false));
        this.A01 = friendMapAudienceListRepository;
        C141796aw A00 = AbstractC141776au.A00(this);
        MBp mBp = new MBp(this, null, 39);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        AbstractC23641Du.A05(anonymousClass191, new MBp(this, null, 40), AbstractC25235BEs.A0W(this, anonymousClass191, mBp, A00));
    }

    public final void A0P(String str) {
        A0O(new C50361MLn(str, 34));
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            int i2 = length;
            if (!z) {
                i2 = i;
            }
            boolean A19 = AbstractC167027dH.A19(str, i2);
            if (!z) {
                if (!A19) {
                    z = true;
                } else {
                    i++;
                }
            } else if (!A19) {
                break;
            } else {
                length--;
            }
        }
        if (AbstractC31177DnL.A0g(str, length, i).length() == 0) {
            A00(this, "");
            return;
        }
        AnonymousClass195 anonymousClass195 = this.A00;
        if (anonymousClass195 != null) {
            anonymousClass195.AGH(null);
        }
        this.A00 = AbstractC25226BEj.A1L(new MBp(this, null, 42), AbstractC141776au.A00(this));
    }

    public static final void A00(C45997KXl c45997KXl, String str) {
        AbstractC166987dD.A1Z(new PYc(c45997KXl, str, null, 44), AbstractC141776au.A00(c45997KXl));
    }
}
