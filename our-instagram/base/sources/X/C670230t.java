package X;

import com.instagram.common.session.UserSession;
import instagram.features.feed.fragment.ContextualFeedFragment;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.30t, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C670230t {
    public long A00;
    public C1P1 A01;
    public C670030r A02;
    public boolean A03;
    public final UserSession A04;
    public final C64042vP A05;
    public final Integer A06;
    public final ContextualFeedFragment A07;

    public C670230t(UserSession userSession, C670030r c670030r, C64042vP c64042vP, ContextualFeedFragment contextualFeedFragment, Integer num) {
        C14360o3.A0B(num, 3);
        C14360o3.A0B(c64042vP, 4);
        this.A02 = c670030r;
        this.A04 = userSession;
        this.A06 = num;
        this.A05 = c64042vP;
        this.A07 = contextualFeedFragment;
        this.A03 = true;
    }

    public final ArrayList A00(HBC hbc) {
        int i;
        ContextualFeedFragment contextualFeedFragment = this.A07;
        if (contextualFeedFragment != null) {
            i = contextualFeedFragment.A04();
        } else {
            i = 0;
        }
        List<IL5> list = hbc.A0B;
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
        for (IL5 il5 : list) {
            C37468Gem c37468Gem = new C37468Gem();
            c37468Gem.A0L = il5.A00();
            if (this.A06.intValue() != 0) {
                C671831j c671831j = new C671831j(null, null, null, 0, 0, 0, 0, 0, 16383, false, false, false, false);
                c671831j.A0B(i);
                c37468Gem.A00 = c671831j;
                i++;
            } else {
                c37468Gem.A00 = C671831j.A0D;
            }
            arrayList.add(c37468Gem.A01());
        }
        return arrayList;
    }
}
