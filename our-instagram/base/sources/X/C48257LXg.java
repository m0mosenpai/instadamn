package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.util.List;

/* renamed from: X.LXg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48257LXg implements InterfaceC11380iw {
    public static final String __redex_internal_original_name = "PinnedMessageBannerController";
    public int A00;
    public InterfaceC56392iX A01;
    public L4Z A02;
    public final Context A03;
    public final UserSession A04;
    public final C7U0 A05;
    public final List A06 = AbstractC166987dD.A1E();
    public final InterfaceC09390do A07 = AbstractC09440dt.A01(new C37052GUi(this, 2));
    public final View A08;

    public final void A01(C7IM c7im, String str, List list) {
        String str2;
        int i;
        C14360o3.A0B(str, 1);
        Context context = this.A03;
        View view = this.A08;
        if (!list.isEmpty()) {
            UserSession userSession = this.A04;
            if (C18U.A06(C06090Tz.A05, userSession, 36329603643490729L)) {
                InterfaceC09390do interfaceC09390do = this.A07;
                C81663kb C76 = ((C2DS) interfaceC09390do.getValue()).C76(str);
                if (C76 != null) {
                    C15370ps A1F = AbstractC25225BEi.A1F();
                    C2DS c2ds = (C2DS) interfaceC09390do.getValue();
                    DirectThreadKey BKb = C76.BKb();
                    L4Z l4z = this.A02;
                    C2EY c2ey = null;
                    if (l4z != null) {
                        str2 = l4z.A02;
                    } else {
                        str2 = null;
                    }
                    A1F.A00 = c2ds.BSh(BKb, String.valueOf(str2));
                    if (this.A01 == null) {
                        this.A01 = AbstractC31173DnH.A0U(view, R.id.pinned_message_container_stub);
                        try {
                            this.A02 = (L4Z) AbstractC001800i.A0O(list, this.A00);
                        } catch (IndexOutOfBoundsException unused) {
                            AbstractC166987dD.A1T(C18950wb.A01, "pinnedMessageBannerController highlighted message is out of bounds.", 20134884);
                        }
                        C48256LXf A00 = AbstractC46705KlO.A00(userSession);
                        C83403nh c83403nh = (C83403nh) A1F.A00;
                        if (c83403nh != null) {
                            c2ey = c83403nh.A10;
                        }
                        String valueOf = String.valueOf(c2ey);
                        long j = this.A00;
                        C14360o3.A0B(valueOf, 1);
                        InterfaceC02590Ai A0H = JQ0.A0H(A00.A00, "direct_pinned_messages_banner_impression", str, valueOf);
                        A0H.A9K("position_index", Long.valueOf(j));
                        A0H.Cht();
                    }
                    InterfaceC56392iX interfaceC56392iX = this.A01;
                    if (interfaceC56392iX != null) {
                        View view2 = interfaceC56392iX.getView();
                        int i2 = this.A00;
                        Integer valueOf2 = Integer.valueOf(i2);
                        if (i2 < list.size()) {
                            i = valueOf2.intValue();
                        } else {
                            i = 0;
                        }
                        this.A00 = i;
                        A00(context, view2, this, list);
                        if (c7im != null) {
                            int i3 = c7im.A04.A0H;
                            if (Integer.valueOf(i3) != null) {
                                view2.setBackgroundColor(i3);
                            }
                        }
                        view2.setVisibility(0);
                        C0fQ.A00(new LPS(view2, this, C76, list, A1F, str, 1), view2);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        InterfaceC56392iX interfaceC56392iX2 = this.A01;
        if (interfaceC56392iX2 != null) {
            interfaceC56392iX2.setVisibility(8);
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public static final void A00(Context context, View view, C48257LXg c48257LXg, List list) {
        CharSequence text;
        String str;
        try {
            c48257LXg.A02 = (L4Z) AbstractC001800i.A0O(list, c48257LXg.A00);
        } catch (IndexOutOfBoundsException unused) {
            AbstractC166987dD.A1T(C18950wb.A01, "pinnedMessageBannerController highlighted message is out of bounds.", 20134884);
        }
        if (c48257LXg.A02 == null) {
            InterfaceC56392iX interfaceC56392iX = c48257LXg.A01;
            if (interfaceC56392iX != null) {
                interfaceC56392iX.setVisibility(8);
                return;
            }
            return;
        }
        TextView A0N = AbstractC167007dF.A0N(view, R.id.pinned_message_title);
        TextView A0N2 = AbstractC167007dF.A0N(view, R.id.pinned_message_subtitle);
        L4Z l4z = c48257LXg.A02;
        if (l4z == null || (text = l4z.A06) == null) {
            text = context.getText(2131959904);
            C14360o3.A07(text);
        }
        A0N.setText(text);
        L4Z l4z2 = c48257LXg.A02;
        String str2 = null;
        if (l4z2 != null && (str = l4z2.A05) != null && str.length() != 0) {
            A0N2.setText(str);
            A0N2.setVisibility(0);
        } else {
            A0N2.setVisibility(8);
        }
        L4Z l4z3 = c48257LXg.A02;
        if (l4z3 != null) {
            str2 = l4z3.A04;
        }
        View requireViewById = view.requireViewById(R.id.default_pin_icon);
        C14360o3.A07(requireViewById);
        View A0S = AbstractC166997dE.A0S(view, R.id.preview_rounded_corner_container);
        if (str2 != null && str2.length() != 0) {
            AbstractC167007dF.A0T(view, R.id.pinned_message_preview).setUrl(AbstractC81033jX.A00(AbstractC25227BEk.A0B(str2), -1, -1), c48257LXg);
            A0S.setVisibility(0);
            requireViewById.setVisibility(8);
        } else {
            requireViewById.setVisibility(0);
            A0S.setVisibility(8);
        }
        LinearLayout linearLayout = (LinearLayout) AbstractC166997dE.A0R(view, R.id.lines_container);
        int size = list.size();
        if (size != 1 && size <= 3) {
            linearLayout.setVisibility(0);
            while (linearLayout.getChildCount() > size) {
                View childAt = linearLayout.getChildAt(linearLayout.getChildCount() - 1);
                List list2 = c48257LXg.A06;
                C14360o3.A0A(childAt);
                list2.add(childAt);
                linearLayout.removeView(childAt);
                linearLayout.setGravity(16);
            }
            while (linearLayout.getChildCount() < size) {
                List list3 = c48257LXg.A06;
                if (!AbstractC166987dD.A1b(list3)) {
                    break;
                } else {
                    linearLayout.addView((View) list3.remove(0));
                }
            }
            int childCount = linearLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt2 = linearLayout.getChildAt(i);
                int i2 = c48257LXg.A00;
                int i3 = R.color.igds_prism_gray_03;
                if (i == i2) {
                    i3 = R.color.black;
                }
                AbstractC31172DnG.A1B(context, childAt2, i3);
            }
            return;
        }
        linearLayout.setVisibility(8);
    }

    public C48257LXg(Context context, View view, UserSession userSession, C7U0 c7u0) {
        this.A03 = context;
        this.A08 = view;
        this.A05 = c7u0;
        this.A04 = userSession;
    }
}
