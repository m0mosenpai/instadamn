package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.reboundhorizontalscrollview.ReboundHorizontalScrollView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.OeT, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55210OeT {
    public View.OnLayoutChangeListener A00;
    public C54463O4r A01;
    public EnumC53279NhH A02;
    public Integer A03;
    public List A04;
    public boolean A05;
    public final Context A06;
    public final View A07;
    public final UserSession A08;
    public final ReboundHorizontalScrollView A09;
    public final C8FP A0A;
    public final C23031Ai A0B;
    public final OI6 A0C;
    public final OHG A0D;
    public final List A0E;
    public final List A0F;
    public final List A0G;
    public final List A0H;
    public final Map A0I;
    public final Map A0J;
    public final java.util.Set A0K;

    public final void A07(C88X c88x, EnumC53279NhH enumC53279NhH) {
        EnumC53279NhH enumC53279NhH2;
        C14360o3.A0B(enumC53279NhH, 1);
        C88X c88x2 = C88X.A0T;
        if (!c88x.equals(c88x2) && enumC53279NhH != A01(c88x, this)) {
            C0w9.A03("RtcArEffectPickerTabController", "Element type doesn't match with tab type.");
            return;
        }
        Map map = this.A0I;
        if (C14360o3.A0K(map.get(enumC53279NhH), c88x)) {
            return;
        }
        map.put(enumC53279NhH, c88x);
        C8FP c8fp = this.A0A;
        if (!C14360o3.A0K(c8fp.Bsa(), c88x) && enumC53279NhH == this.A02) {
            c8fp.EmZ(c88x);
        }
        EnumC53279NhH enumC53279NhH3 = EnumC53279NhH.A05;
        if (enumC53279NhH == enumC53279NhH3 || enumC53279NhH == (enumC53279NhH2 = EnumC53279NhH.A03)) {
            return;
        }
        for (Object obj : this.A04) {
            if (obj != enumC53279NhH && obj != enumC53279NhH3 && obj != enumC53279NhH2) {
                C88X c88x3 = null;
                if (c88x.equals(c88x2)) {
                    c88x3 = c88x2;
                }
                map.put(obj, c88x3);
                EnumC53279NhH enumC53279NhH4 = this.A02;
                if (obj == enumC53279NhH4) {
                    if (map.get(enumC53279NhH4) == null) {
                        c8fp.EJg();
                    } else {
                        c8fp.EmZ((C88X) map.get(this.A02));
                    }
                }
            }
        }
    }

    private final IgTextView A00(int i) {
        View childAt = this.A09.getChildAt(i);
        if (!(childAt instanceof ViewGroup) || childAt == null) {
            return null;
        }
        return (IgTextView) childAt.findViewById(R.id.label_text);
    }

    public static final EnumC53279NhH A01(C88X c88x, C55210OeT c55210OeT) {
        C88Z c88z = c88x.A04;
        if (c88z == null) {
            c88z = C88Z.A0G;
        }
        if (c88z == C88Z.A0J) {
            return EnumC53279NhH.A05;
        }
        CameraAREffect A00 = c88x.A00();
        if (A00 != null && A00.A0N()) {
            Map map = c55210OeT.A0J;
            EnumC53279NhH enumC53279NhH = EnumC53279NhH.A06;
            List A12 = AbstractC43592JPx.A12(enumC53279NhH, map);
            if (A12 != null && A12.contains(c88x)) {
                return enumC53279NhH;
            }
        }
        C88Z c88z2 = c88x.A04;
        if (c88z2 != C88Z.A05 && c88z2 != C88Z.A0H) {
            if ((c88z2 == C88Z.A06 || c88z2 == C88Z.A07 || c88x.A00() != null) && c55210OeT.A05) {
                return EnumC53279NhH.A02;
            }
            Map map2 = c55210OeT.A0J;
            EnumC53279NhH enumC53279NhH2 = EnumC53279NhH.A07;
            List A122 = AbstractC43592JPx.A12(enumC53279NhH2, map2);
            if (A122 != null && A122.contains(c88x)) {
                return enumC53279NhH2;
            }
            return EnumC53279NhH.A04;
        }
        return EnumC53279NhH.A03;
    }

    public static final List A02(C55210OeT c55210OeT) {
        int intValue = c55210OeT.A03.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 3) {
                    if (intValue != 2) {
                        return c55210OeT.A0E;
                    }
                } else {
                    return c55210OeT.A0F;
                }
            } else {
                return c55210OeT.A0H;
            }
        }
        return c55210OeT.A0G;
    }

    public static final void A04(C55210OeT c55210OeT) {
        int i;
        int i2;
        ReboundHorizontalScrollView reboundHorizontalScrollView = c55210OeT.A09;
        reboundHorizontalScrollView.removeAllViews();
        for (EnumC53279NhH enumC53279NhH : A02(c55210OeT)) {
            Context context = c55210OeT.A06;
            View inflate = View.inflate(context, R.layout.ar_effect_picker_tab_label, null);
            AbstractC43592JPx.A1T(inflate);
            TextView A0e = AbstractC166987dD.A0e(inflate, R.id.label_text);
            View findViewById = inflate.findViewById(R.id.badge);
            switch (enumC53279NhH.ordinal()) {
                case 0:
                    i = 2131962783;
                    break;
                case 1:
                    i = 2131962599;
                    break;
                case 2:
                    i = 2131962782;
                    break;
                case 3:
                    i = 2131974292;
                    break;
                case 4:
                    i = 2131953572;
                    break;
                case 5:
                    i = 2131953443;
                    break;
                default:
                    throw AbstractC37303Gc4.A0M(enumC53279NhH, "Unknown tab type: ", AbstractC166987dD.A1C());
            }
            AbstractC31173DnH.A12(context, A0e, i);
            if (enumC53279NhH == EnumC53279NhH.A06) {
                C23031Ai c23031Ai = c55210OeT.A0B;
                i2 = 0;
                if (!AbstractC167017dG.A1b(c23031Ai, c23031Ai.A1X, C23031Ai.A8c, 238)) {
                    findViewById.setVisibility(i2);
                    reboundHorizontalScrollView.addView(inflate);
                }
            }
            i2 = 8;
            findViewById.setVisibility(i2);
            reboundHorizontalScrollView.addView(inflate);
        }
        AbstractC13880nE.A0r(c55210OeT.A07, new RunnableC56912PNf(c55210OeT));
    }

    public static final void A05(C55210OeT c55210OeT, int i, int i2) {
        if (i != i2) {
            IgTextView A00 = c55210OeT.A00(i2);
            if (A00 != null) {
                A00.post(new RunnableC57050PSp(c55210OeT, i, i2));
            }
            EnumC53279NhH enumC53279NhH = (EnumC53279NhH) A02(c55210OeT).get(i2);
            if (c55210OeT.A02 != enumC53279NhH) {
                c55210OeT.A02 = enumC53279NhH;
                C8FP c8fp = c55210OeT.A0A;
                c8fp.ECy();
                List A12 = AbstractC43592JPx.A12(enumC53279NhH, c55210OeT.A0J);
                if (A12 == null) {
                    A12 = C16930sl.A00;
                }
                c8fp.ETl(A12);
            }
        }
    }

    public static final void A06(C55210OeT c55210OeT, int i, int i2, boolean z) {
        EnumC53279NhH enumC53279NhH;
        View findViewById;
        if (!z) {
            c55210OeT.A09.A08(i2);
        }
        ReboundHorizontalScrollView reboundHorizontalScrollView = c55210OeT.A09;
        int childCount = reboundHorizontalScrollView.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            IgTextView A00 = c55210OeT.A00(i3);
            if (A00 != null) {
                A00.setAlpha(0.5f);
            }
        }
        IgTextView A002 = c55210OeT.A00(i2);
        if (A002 != null) {
            A002.setTypeface(null, 1);
            A002.setAlpha(1.0f);
        }
        IgTextView A003 = c55210OeT.A00(i);
        if (A003 != null) {
            A003.setTypeface(null, 0);
            A003.setAlpha(0.5f);
        }
        View childAt = reboundHorizontalScrollView.getChildAt(i2);
        if ((childAt instanceof ViewGroup) && childAt != null && (findViewById = childAt.findViewById(R.id.badge)) != null && findViewById.getVisibility() == 0) {
            C23031Ai c23031Ai = c55210OeT.A0B;
            AbstractC167007dF.A1L(c23031Ai, c23031Ai.A1X, C23031Ai.A8c, 238, true);
            View childAt2 = reboundHorizontalScrollView.getChildAt(i2);
            if ((childAt2 instanceof ViewGroup) && childAt2 != null) {
                AbstractC167007dF.A0x(childAt2.findViewById(R.id.badge));
            }
        }
        View childAt3 = reboundHorizontalScrollView.getChildAt(i);
        if ((childAt3 instanceof ViewGroup) && childAt3 != null) {
            childAt3.setSelected(false);
        }
        View childAt4 = reboundHorizontalScrollView.getChildAt(i2);
        if ((childAt4 instanceof ViewGroup) && childAt4 != null) {
            childAt4.setSelected(true);
        }
        if (i2 >= A02(c55210OeT).size()) {
            enumC53279NhH = AbstractC54166Nx2.A00(c55210OeT.A03);
        } else {
            enumC53279NhH = (EnumC53279NhH) A02(c55210OeT).get(i2);
        }
        if (c55210OeT.A02 != enumC53279NhH) {
            c55210OeT.A02 = enumC53279NhH;
            C8FP c8fp = c55210OeT.A0A;
            c8fp.ECy();
            List A12 = AbstractC43592JPx.A12(enumC53279NhH, c55210OeT.A0J);
            if (A12 == null) {
                A12 = C16930sl.A00;
            }
            c8fp.ETl(A12);
        }
        Map map = c55210OeT.A0I;
        Object obj = map.get(c55210OeT.A02);
        C8FP c8fp2 = c55210OeT.A0A;
        if (obj == null) {
            c8fp2.EJg();
        } else {
            c8fp2.EmZ((C88X) map.get(c55210OeT.A02));
        }
        C54463O4r c54463O4r = c55210OeT.A01;
        if (c54463O4r != null) {
            EnumC53279NhH enumC53279NhH2 = c55210OeT.A02;
            C14360o3.A0B(enumC53279NhH2, 0);
            C52692NTd c52692NTd = c54463O4r.A00;
            C52692NTd.A05(c52692NTd);
            if (c52692NTd.A03.A07 != enumC53279NhH2) {
                c52692NTd.A0H.A03(new C56702PEu(enumC53279NhH2));
                c52692NTd.A0G.A00(new C56568P9o(enumC53279NhH2.A00(c52692NTd.A06)));
                return;
            }
            return;
        }
        C14360o3.A0F("listener");
        throw C00O.createAndThrow();
    }

    public /* synthetic */ C55210OeT(Context context, View view, UserSession userSession, C8FP c8fp, OI6 oi6, OHG ohg, EnumC53279NhH enumC53279NhH, List list, List list2) {
        ReboundHorizontalScrollView reboundHorizontalScrollView = (ReboundHorizontalScrollView) view.findViewById(R.id.ar_effect_picker_tab_scroll_view);
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        AbstractC25234BEr.A0k(3, ohg, c8fp, enumC53279NhH, oi6);
        AbstractC25232BEp.A1P(reboundHorizontalScrollView, A00);
        this.A06 = context;
        this.A08 = userSession;
        this.A0D = ohg;
        this.A07 = view;
        this.A0A = c8fp;
        this.A0C = oi6;
        this.A0G = list;
        this.A0F = list2;
        this.A09 = reboundHorizontalScrollView;
        this.A0B = A00;
        this.A0J = AbstractC166987dD.A1I();
        this.A0I = AbstractC166987dD.A1I();
        C16930sl c16930sl = C16930sl.A00;
        this.A04 = c16930sl;
        this.A0H = AbstractC16960so.A1N(EnumC53279NhH.A05);
        this.A0E = AbstractC16960so.A1N(EnumC53279NhH.A03);
        this.A0K = AbstractC31171DnF.A0l();
        this.A03 = C05F.A00;
        this.A02 = enumC53279NhH;
        ArrayList A0S = AbstractC001800i.A0S(this.A0E, AbstractC001800i.A0S(this.A0F, AbstractC001800i.A0S(this.A0H, this.A0G)));
        this.A04 = A0S;
        Iterator it = A0S.iterator();
        while (it.hasNext()) {
            this.A0J.put(it.next(), c16930sl);
        }
        A04(this);
        this.A09.A0A(new C56182Owp(this));
        this.A09.setHorizontalFadingEdgeEnabled(true);
        this.A09.setFadingEdgeLength((int) this.A06.getResources().getDimension(R.dimen.abc_list_item_height_material));
    }

    public static final void A03(C55210OeT c55210OeT) {
        Rect A0U = AbstractC166987dD.A0U();
        ReboundHorizontalScrollView reboundHorizontalScrollView = c55210OeT.A09;
        reboundHorizontalScrollView.getGlobalVisibleRect(A0U);
        int size = A02(c55210OeT).size();
        for (int i = 0; i < size; i++) {
            View childAt = reboundHorizontalScrollView.getChildAt(i);
            if (childAt != null) {
                Rect A0U2 = AbstractC166987dD.A0U();
                childAt.getGlobalVisibleRect(A0U2);
                if (Math.max(A0U.left, A0U2.left) < Math.min(A0U.right, A0U2.right)) {
                    EnumC53238Ngb A00 = ((EnumC53279NhH) A02(c55210OeT).get(i)).A00(c55210OeT.A05);
                    java.util.Set set = c55210OeT.A0K;
                    if (!set.contains(A00)) {
                        c55210OeT.A0C.A00(new C56567P9n(A00));
                        set.add(A00);
                    }
                }
            } else {
                return;
            }
        }
    }
}
