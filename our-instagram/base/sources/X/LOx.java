package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.ui.widget.fixedtabbar.FixedTabBar;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public final class LOx implements View.OnClickListener {
    public final int A00;
    public final int A01;
    public final Object A02;

    public LOx(Object obj, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        int i;
        String str;
        Resources resources;
        String str2;
        Resources resources2;
        Resources resources3;
        String str3;
        switch (this.A00) {
            case 0:
                A05 = C0f9.A05(-1311964453);
                L3N l3n = (L3N) this.A02;
                int i2 = this.A01;
                C32073E6z c32073E6z = (C32073E6z) l3n.A03.get(i2);
                l3n.A02.A00(i2, true);
                l3n.A00 = i2;
                l3n.A04.invoke(c32073E6z.A05, c32073E6z.A04);
                i = 1569616463;
                C0f9.A0C(i, A05);
                return;
            case 1:
                A05 = C0f9.A05(-1209959485);
                LKK lkk = (LKK) this.A02;
                int i3 = this.A01;
                lkk.A0I.DDI(((C47660L2t) lkk.A0K.get(i3)).A00, i3);
                i = -2137357301;
                C0f9.A0C(i, A05);
                return;
            case 2:
                A05 = C0f9.A05(668059961);
                C44574Jnz c44574Jnz = (C44574Jnz) this.A02;
                C47404Kwt c47404Kwt = c44574Jnz.A00;
                List list = c44574Jnz.A01;
                int i4 = this.A01;
                Object obj = list.get(i4);
                C14360o3.A0B(obj, 0);
                KBX kbx = c47404Kwt.A00;
                Map map = kbx.A08;
                if (map == null) {
                    str = "selectedThreads";
                } else {
                    map.remove(obj);
                    str = "selectedThreads";
                    String str4 = null;
                    if (kbx.A08 != null) {
                        if (!r0.isEmpty()) {
                            Map map2 = kbx.A08;
                            if (map2 != null) {
                                if (map2.size() > 1) {
                                    IgTextView igTextView = kbx.A02;
                                    if (igTextView != null) {
                                        Context context = kbx.getContext();
                                        if (context != null && (resources3 = context.getResources()) != null) {
                                            str2 = AbstractC43594JPz.A0t(resources3, kbx.A00, 2131954394);
                                        } else {
                                            str2 = null;
                                        }
                                        igTextView.setText(str2);
                                        IgTextView igTextView2 = kbx.A02;
                                        if (igTextView2 != null) {
                                            igTextView2.setVisibility(0);
                                            IgTextView igTextView3 = kbx.A03;
                                            if (igTextView3 != null) {
                                                Context context2 = kbx.getContext();
                                                if (context2 != null && (resources2 = context2.getResources()) != null) {
                                                    Map map3 = kbx.A08;
                                                    if (map3 != null) {
                                                        str4 = AbstractC43594JPz.A0t(resources2, map3.size(), 2131954393);
                                                    }
                                                }
                                                igTextView3.setText(str4);
                                            }
                                        }
                                    }
                                    C14360o3.A0F(DevServerEntity.COLUMN_DESCRIPTION);
                                    throw C00O.createAndThrow();
                                }
                                IgTextView igTextView4 = kbx.A03;
                                if (igTextView4 != null) {
                                    Context context3 = kbx.getContext();
                                    if (context3 != null && (resources = context3.getResources()) != null) {
                                        str4 = resources.getString(2131954395);
                                    }
                                    igTextView4.setText(str4);
                                }
                                IgTextView igTextView5 = kbx.A02;
                                if (igTextView5 != null) {
                                    igTextView5.setVisibility(8);
                                }
                                C14360o3.A0F(DevServerEntity.COLUMN_DESCRIPTION);
                                throw C00O.createAndThrow();
                            }
                        } else {
                            C47623L1i c47623L1i = kbx.A05;
                            if (c47623L1i != null) {
                                c47623L1i.A01.A07();
                            }
                        }
                        list.remove(i4);
                        c44574Jnz.notifyItemRemoved(i4);
                        c44574Jnz.notifyItemRangeChanged(i4, AbstractC31172DnG.A03(list, i4));
                        i = -1180204792;
                        C0f9.A0C(i, A05);
                        return;
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 3:
                A05 = C0f9.A05(-1252043252);
                Jno jno = (Jno) this.A02;
                InterfaceC16620sF interfaceC16620sF = jno.A01;
                String[] strArr = jno.A02;
                int i5 = this.A01;
                interfaceC16620sF.invoke(strArr[i5], Integer.valueOf(i5));
                i = -824810537;
                C0f9.A0C(i, A05);
                return;
            case 4:
                A05 = C0f9.A05(1468581253);
                C44415JkA c44415JkA = (C44415JkA) this.A02;
                L6X l6x = c44415JkA.A00;
                if (l6x != null) {
                    int i6 = this.A01;
                    String str5 = (String) AbstractC001800i.A0O(c44415JkA.A03, i6);
                    if (str5 == null || (str3 = AbstractC25228BEl.A1A(str5)) == null) {
                        str3 = "";
                    }
                    l6x.A00(i6, str3);
                    i = -220780476;
                    C0f9.A0C(i, A05);
                    return;
                }
                str = "listener";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 5:
                A05 = C0f9.A05(2108026296);
                L6X l6x2 = ((C44415JkA) this.A02).A00;
                if (l6x2 != null) {
                    int i7 = this.A01;
                    KCU kcu = l6x2.A00;
                    KCU.A02(kcu, i7);
                    C45999KXn A0e = AbstractC43593JPy.A0e(kcu);
                    A0e.A0W(AbstractC166997dE.A0q(AbstractC166997dE.A0N(kcu), 2131971253));
                    A0e.A0M(new C49430Lt4(new C50355MLh(A0e, 47)));
                    i = 993030120;
                    C0f9.A0C(i, A05);
                    return;
                }
                str = "listener";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 6:
            case 7:
            default:
                FixedTabBar fixedTabBar = (FixedTabBar) this.A02;
                int i8 = this.A01;
                MPJ mpj = fixedTabBar.A06;
                mpj.getClass();
                if (fixedTabBar.A09) {
                    i8 = AbstractC25226BEj.A05(fixedTabBar.A07) - i8;
                }
                mpj.setMode(i8);
                return;
            case 8:
                A05 = C0f9.A05(-1307664449);
                ((C46079Kab) this.A02).A00.setCurrentItem(this.A01);
                i = -1223073541;
                C0f9.A0C(i, A05);
                return;
            case 9:
                C44251Jgv c44251Jgv = (C44251Jgv) this.A02;
                int i9 = this.A01;
                ReelDashboardFragment reelDashboardFragment = c44251Jgv.A05;
                reelDashboardFragment.mImageViewPager.A0K(i9);
                ReelDashboardFragment.A05(view, reelDashboardFragment);
                return;
            case 10:
                C44251Jgv c44251Jgv2 = (C44251Jgv) this.A02;
                int i10 = this.A01;
                ReelDashboardFragment reelDashboardFragment2 = c44251Jgv2.A05;
                ReboundViewPager reboundViewPager = reelDashboardFragment2.mImageViewPager;
                if (reboundViewPager.A08 != i10) {
                    reboundViewPager.A0L(i10, 0.0f);
                    return;
                } else {
                    ReelDashboardFragment.A0B(reelDashboardFragment2);
                    return;
                }
        }
    }
}
