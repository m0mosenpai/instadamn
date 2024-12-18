package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import java.util.List;

/* loaded from: classes8.dex */
public final class KL5 extends C42H {
    public ReboundViewPager A00;
    public C44415JkA A01;
    public String A02;
    public boolean A03;

    @Override // X.C42H, X.InterfaceC62892tS
    public final void DXP(int i, int i2) {
        C44415JkA c44415JkA;
        String str;
        String A1A;
        if (!this.A03) {
            C44415JkA c44415JkA2 = this.A01;
            if (c44415JkA2 != null) {
                if (i == 0) {
                    L6X l6x = c44415JkA2.A00;
                    if (l6x != null) {
                        AbstractC43593JPy.A0e(l6x.A00).A0Z(false, null);
                    }
                    C14360o3.A0F("listener");
                    throw C00O.createAndThrow();
                }
                if (i <= 5) {
                    List list = c44415JkA2.A03;
                    String str2 = (String) AbstractC001800i.A0O(list, i);
                    String str3 = "";
                    if (str2 == null || (str = AbstractC25228BEl.A1A(str2)) == null) {
                        str = "";
                    }
                    c44415JkA2.A02.A0F(str, AbstractC16960so.A1Q("📍", "👀", "🔥", "🎉", "😴").contains(str), false);
                    L6X l6x2 = c44415JkA2.A00;
                    if (l6x2 != null) {
                        String str4 = (String) AbstractC001800i.A0O(list, i);
                        if (str4 != null && (A1A = AbstractC25228BEl.A1A(str4)) != null) {
                            str3 = A1A;
                        }
                        l6x2.A00(i, str3);
                    }
                    C14360o3.A0F("listener");
                    throw C00O.createAndThrow();
                }
                L6X l6x3 = c44415JkA2.A00;
                if (l6x3 != null) {
                    KCU kcu = l6x3.A00;
                    AbstractC43593JPy.A0e(kcu).A0W(AbstractC166997dE.A0q(AbstractC166997dE.A0N(kcu), 2131971253));
                }
                C14360o3.A0F("listener");
                throw C00O.createAndThrow();
            }
        } else if (i == 0) {
            String str5 = this.A02;
            if (str5 != null && (c44415JkA = this.A01) != null) {
                List list2 = c44415JkA.A03;
                if (list2.contains(str5)) {
                    list2.remove(str5);
                    list2.add(1, str5);
                    C23031Ai A00 = AbstractC23021Ah.A00(c44415JkA.A01);
                    List subList = list2.subList(1, 6);
                    C14360o3.A0B(subList, 0);
                    C23031Ai.A06(A00, "friend_map_recent_emoji_list", subList);
                } else {
                    list2.clear();
                    list2.add(str5);
                    UserSession userSession = c44415JkA.A01;
                    List A04 = C23031Ai.A04(AbstractC23021Ah.A00(userSession), "friend_map_recent_emoji_list");
                    if (A04.isEmpty()) {
                        A04 = AbstractC166987dD.A1E();
                    }
                    int i3 = 0;
                    do {
                        Object A0O = AbstractC001800i.A0O(A04, i3);
                        if (A0O == null) {
                            A0O = " ";
                        }
                        list2.add(A0O);
                        i3++;
                    } while (i3 < 4);
                    C23031Ai.A06(AbstractC23021Ah.A00(userSession), "friend_map_recent_emoji_list", list2);
                    list2.add(0, "placeHolderCreateNote");
                    list2.add("placeHolderCustomEmoji");
                }
                C0fA.A00(c44415JkA, -1825443904);
            }
            this.A02 = null;
            this.A03 = false;
        }
        ReboundViewPager reboundViewPager = this.A00;
        if (reboundViewPager != null) {
            reboundViewPager.performHapticFeedback(1);
        }
    }
}
