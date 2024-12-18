package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.google.android.material.tabs.TabLayout;

/* renamed from: X.Oq9, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55798Oq9 implements MO4 {
    public final int A00;
    public final Object A01;

    public C55798Oq9(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.MO4
    public final void D6s(C154306wf c154306wf, int i) {
        int i2;
        String string;
        Resources A0N;
        int i3;
        int i4;
        View view;
        View.OnClickListener viewOnClickListenerC48067LPs;
        Drawable drawable;
        String str;
        int i5;
        Drawable drawable2;
        switch (this.A00) {
            case 0:
                Fragment fragment = (Fragment) this.A01;
                if (1 - MSW.A07(C05F.A00(2), i) != 0) {
                    i2 = R.string.res_0x7f130072_name_removed;
                } else {
                    i2 = 2131962025;
                }
                string = fragment.getString(i2);
                c154306wf.A04(string);
                return;
            case 1:
                EnumC53213NgB enumC53213NgB = (EnumC53213NgB) AbstractC166997dE.A0m(EnumC53213NgB.A01, i);
                if (enumC53213NgB != null) {
                    int ordinal = enumC53213NgB.ordinal();
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            A0N = AbstractC166997dE.A0N((Fragment) this.A01);
                            i3 = 2131964276;
                        } else {
                            throw B4Z.A00();
                        }
                    } else {
                        A0N = AbstractC166997dE.A0N((Fragment) this.A01);
                        i3 = 2131964269;
                    }
                    string = A0N.getString(i3);
                    c154306wf.A04(string);
                    return;
                }
                throw AbstractC166987dD.A14(AnonymousClass001.A0c("IGTVCoverTabType: position ", " not found", i));
            case 2:
                N5W n5w = (N5W) this.A01;
                C51392Mmx c51392Mmx = n5w.A04;
                if (c51392Mmx != null) {
                    Ng1 ng1 = (Ng1) c51392Mmx.A00.get(i);
                    TabLayout tabLayout = n5w.A02;
                    if (tabLayout != null) {
                        InterfaceC154386wo A00 = AbstractC154376wm.A00(tabLayout, "text", n5w.requireContext().getColor(AbstractC53242c7.A07(n5w.getContext())));
                        if (ng1 == Ng1.A03) {
                            n5w.A06 = A00;
                        }
                        int ordinal2 = ng1.ordinal();
                        if (ordinal2 != 1) {
                            if (ordinal2 == 0) {
                                i4 = 2131966805;
                            } else {
                                throw B4Z.A00();
                            }
                        } else {
                            i4 = 2131966804;
                        }
                        A00.setTitle(AbstractC25227BEk.A0v(n5w, i4));
                        if (ordinal2 == 1 && (drawable = n5w.requireContext().getDrawable(R.drawable.instagram_chevron_down_pano_outline_12)) != null) {
                            A00.setTitleDrawable(drawable);
                        }
                        view = A00.getView();
                        viewOnClickListenerC48067LPs = new ViewOnClickListenerC48067LPs(i, 4, A00, n5w);
                        C0fQ.A00(viewOnClickListenerC48067LPs, view);
                        c154306wf.A03(view);
                        return;
                    }
                    str = "tabLayout";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                str = "tabPagerAdapter";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            default:
                N5H n5h = (N5H) this.A01;
                C51393Mmy c51393Mmy = n5h.A03;
                if (c51393Mmy != null) {
                    EnumC53206Ng4 enumC53206Ng4 = (EnumC53206Ng4) c51393Mmy.A00.get(i);
                    TabLayout tabLayout2 = n5h.A01;
                    if (tabLayout2 != null) {
                        InterfaceC154386wo A002 = AbstractC154376wm.A00(tabLayout2, "text", n5h.requireContext().getColor(AbstractC53242c7.A07(n5h.getContext())));
                        if (enumC53206Ng4 == EnumC53206Ng4.A03) {
                            n5h.A02 = A002;
                        }
                        int ordinal3 = enumC53206Ng4.ordinal();
                        if (ordinal3 != 1) {
                            if (ordinal3 == 0) {
                                i5 = 2131976968;
                            } else {
                                throw B4Z.A00();
                            }
                        } else {
                            i5 = 2131976967;
                        }
                        A002.setTitle(AbstractC25227BEk.A0v(n5h, i5));
                        if (ordinal3 == 1 && (drawable2 = n5h.requireContext().getDrawable(R.drawable.instagram_chevron_down_pano_outline_12)) != null) {
                            A002.setTitleDrawable(drawable2);
                        }
                        view = A002.getView();
                        viewOnClickListenerC48067LPs = new OkD(i, 18, A002, n5h);
                        C0fQ.A00(viewOnClickListenerC48067LPs, view);
                        c154306wf.A03(view);
                        return;
                    }
                    str = "tabLayout";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                str = "tabPagerAdapter";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
        }
    }
}
