package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Lf1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48625Lf1 implements InterfaceC58283Psb, InterfaceC50521MRz {
    public View A00;
    public ViewPager A01;
    public C45494KCj A02;
    public C45494KCj A03;
    public C46080Kac A04;
    public final Context A05;
    public final FragmentActivity A06;
    public final AbstractC10360h2 A07;
    public final UserSession A08;
    public final InterfaceC16820sZ A09;
    public final boolean A0A;
    public final C87H A0B;

    /* JADX WARN: Code restructure failed: missing block: B:26:0x010f, code lost:
    
        X.C14360o3.A0F(r1);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [X.6cX, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View A00(android.view.ViewGroup r16) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48625Lf1.A00(android.view.ViewGroup):android.view.View");
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void ADK(View view) {
    }

    @Override // X.InterfaceC58283Psb
    public final void AJN() {
    }

    @Override // X.InterfaceC58283Psb
    public final int B91() {
        return 0;
    }

    @Override // X.InterfaceC58283Psb
    public final void COD(ViewGroup viewGroup) {
        viewGroup.removeAllViews();
        viewGroup.addView(A00(viewGroup));
        A02();
        C87H c87h = this.A0B;
        if (c87h != null) {
            c87h.A01();
            c87h.A06(0);
        }
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void D8S(View view) {
    }

    @Override // X.InterfaceC58283Psb
    public final void DhM() {
    }

    @Override // X.InterfaceC58283Psb
    public final void cancel() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onCreate() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onDestroy() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onDestroyView() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onPause() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onResume() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStart() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStop() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public final void A01() {
        EnumC46136Kba enumC46136Kba;
        C45494KCj c45494KCj;
        String str;
        C46080Kac c46080Kac = this.A04;
        if (c46080Kac != null && (enumC46136Kba = (EnumC46136Kba) c46080Kac.A05()) != null) {
            int ordinal = enumC46136Kba.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    c45494KCj = this.A02;
                    if (c45494KCj == null) {
                        str = "savedTabFragment";
                        C14360o3.A0F(str);
                        throw C00O.createAndThrow();
                    }
                    c45494KCj.A00();
                }
                return;
            }
            c45494KCj = this.A03;
            if (c45494KCj == null) {
                str = "trendingTabFragment";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            c45494KCj.A00();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02() {
        /*
            r2 = this;
            X.Kac r0 = r2.A04
            if (r0 == 0) goto L36
            java.lang.Object r0 = r0.A05()
            X.Kba r0 = (X.EnumC46136Kba) r0
            if (r0 == 0) goto L36
            int r1 = r0.ordinal()
            r0 = 0
            if (r1 == r0) goto L24
            r0 = 1
            if (r1 != r0) goto L36
            X.KCj r0 = r2.A02
            if (r0 != 0) goto L2b
            java.lang.String r0 = "savedTabFragment"
        L1c:
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L24:
            X.KCj r0 = r2.A03
            if (r0 != 0) goto L2b
            java.lang.String r0 = "trendingTabFragment"
            goto L1c
        L2b:
            X.JT7 r1 = r0.A00
            if (r1 == 0) goto L36
            r0 = 0
            r1.A06 = r0
            r0 = 0
            X.JT7.A00(r1, r0)
        L36:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48625Lf1.A02():void");
    }

    @Override // X.InterfaceC50521MRz
    public final /* bridge */ /* synthetic */ Fragment ALl(Object obj) {
        C45494KCj c45494KCj;
        String str;
        int A05 = AbstractC25227BEk.A05((EnumC46136Kba) obj, 0);
        if (A05 != 0) {
            if (A05 == 1) {
                c45494KCj = this.A02;
                if (c45494KCj == null) {
                    str = "savedTabFragment";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                return c45494KCj;
            }
            throw B4Z.A00();
        }
        c45494KCj = this.A03;
        if (c45494KCj == null) {
            str = "trendingTabFragment";
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        return c45494KCj;
    }

    @Override // X.InterfaceC50521MRz
    public final /* bridge */ /* synthetic */ L5P ANJ(Object obj) {
        int i;
        EnumC46136Kba enumC46136Kba = (EnumC46136Kba) obj;
        C14360o3.A0B(enumC46136Kba, 0);
        View inflate = LayoutInflater.from(this.A05).inflate(R.layout.clips_hub_tab_button_view, (ViewGroup) null);
        TextView A0N = AbstractC167007dF.A0N(inflate, R.id.tab_title_text);
        ImageView A0D = AbstractC31176DnK.A0D(inflate, R.id.tab_title_icon);
        int ordinal = enumC46136Kba.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                A0N.setText(2131955262);
                i = R.drawable.instagram_save_pano_filled_12;
            } else {
                throw B4Z.A00();
            }
        } else {
            A0N.setText(2131955264);
            i = R.drawable.instagram_arrow_up_right_pano_filled_12;
        }
        A0D.setImageResource(i);
        return new L5P(null, null, inflate, null, null, -1, -1, -1, -1, -1, -1, R.dimen.abc_button_padding_horizontal_material, R.dimen.ab_test_media_thumbnail_preview_item_internal_padding, -1, -1, -1);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    @Override // X.InterfaceC58283Psb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AQM(float r4) {
        /*
            r3 = this;
            X.Kac r0 = r3.A04
            if (r0 == 0) goto L38
            java.lang.Object r0 = r0.A05()
            X.Kba r0 = (X.EnumC46136Kba) r0
            if (r0 == 0) goto L38
            int r1 = r0.ordinal()
            r0 = 0
            if (r1 == r0) goto L24
            r0 = 1
            if (r1 != r0) goto L38
            X.KCj r0 = r3.A02
            if (r0 != 0) goto L2b
            java.lang.String r0 = "savedTabFragment"
        L1c:
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L24:
            X.KCj r0 = r3.A03
            if (r0 != 0) goto L2b
            java.lang.String r0 = "trendingTabFragment"
            goto L1c
        L2b:
            X.JT7 r0 = r0.A00
            if (r0 == 0) goto L38
            androidx.recyclerview.widget.RecyclerView r2 = r0.A01()
            int r1 = (int) r4
            r0 = 0
            r2.scrollBy(r0, r1)
        L38:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48625Lf1.AQM(float):void");
    }

    @Override // X.InterfaceC58283Psb
    public final List Ben() {
        return AbstractC166987dD.A1J(EnumC53256Ngu.A05);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a A[ORIG_RETURN, RETURN] */
    @Override // X.InterfaceC58283Psb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean CRk() {
        /*
            r3 = this;
            X.Kac r0 = r3.A04
            if (r0 == 0) goto L2b
            java.lang.Object r0 = r0.A05()
            X.Kba r0 = (X.EnumC46136Kba) r0
            if (r0 == 0) goto L2b
            int r0 = r0.ordinal()
        L10:
            r1 = 1
            r2 = 0
            if (r0 == r2) goto L24
            if (r0 != r1) goto L3b
            X.KCj r0 = r3.A02
            if (r0 != 0) goto L2d
            java.lang.String r0 = "savedTabFragment"
        L1c:
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L24:
            X.KCj r0 = r3.A03
            if (r0 != 0) goto L2d
            java.lang.String r0 = "trendingTabFragment"
            goto L1c
        L2b:
            r0 = -1
            goto L10
        L2d:
            X.JT7 r0 = r0.A00
            if (r0 == 0) goto L3a
            androidx.recyclerview.widget.RecyclerView r0 = r0.A01()
            boolean r1 = X.AbstractC110854yx.A04(r0)
            return r1
        L3a:
            r1 = 0
        L3b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48625Lf1.CRk():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a A[ORIG_RETURN, RETURN] */
    @Override // X.InterfaceC58283Psb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean CRl() {
        /*
            r3 = this;
            X.Kac r0 = r3.A04
            if (r0 == 0) goto L2b
            java.lang.Object r0 = r0.A05()
            X.Kba r0 = (X.EnumC46136Kba) r0
            if (r0 == 0) goto L2b
            int r0 = r0.ordinal()
        L10:
            r1 = 1
            r2 = 0
            if (r0 == r2) goto L24
            if (r0 != r1) goto L3b
            X.KCj r0 = r3.A02
            if (r0 != 0) goto L2d
            java.lang.String r0 = "savedTabFragment"
        L1c:
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L24:
            X.KCj r0 = r3.A03
            if (r0 != 0) goto L2d
            java.lang.String r0 = "trendingTabFragment"
            goto L1c
        L2b:
            r0 = -1
            goto L10
        L2d:
            X.JT7 r0 = r0.A00
            if (r0 == 0) goto L3a
            androidx.recyclerview.widget.RecyclerView r0 = r0.A01()
            boolean r1 = X.AbstractC110854yx.A05(r0)
            return r1
        L3a:
            r1 = 0
        L3b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48625Lf1.CRl():boolean");
    }

    @Override // X.InterfaceC58283Psb
    public final void D0G() {
        ViewGroup viewGroup;
        View view = this.A00;
        ViewParent viewParent = null;
        if (view != null) {
            viewParent = view.getParent();
        }
        if ((viewParent instanceof ViewGroup) && (viewGroup = (ViewGroup) viewParent) != null) {
            viewGroup.removeView(this.A00);
        }
        A01();
        C87H c87h = this.A0B;
        if (c87h != null) {
            c87h.A03();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    @Override // X.InterfaceC58283Psb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DHV(float r4, float r5) {
        /*
            r3 = this;
            X.Kac r0 = r3.A04
            if (r0 == 0) goto L38
            java.lang.Object r0 = r0.A05()
            X.Kba r0 = (X.EnumC46136Kba) r0
            if (r0 == 0) goto L38
            int r1 = r0.ordinal()
            r0 = 0
            if (r1 == r0) goto L24
            r0 = 1
            if (r1 != r0) goto L38
            X.KCj r0 = r3.A02
            if (r0 != 0) goto L2b
            java.lang.String r0 = "savedTabFragment"
        L1c:
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L24:
            X.KCj r0 = r3.A03
            if (r0 != 0) goto L2b
            java.lang.String r0 = "trendingTabFragment"
            goto L1c
        L2b:
            X.JT7 r0 = r0.A00
            if (r0 == 0) goto L38
            androidx.recyclerview.widget.RecyclerView r2 = r0.A01()
            r1 = 0
            int r0 = (int) r5
            r2.A1E(r1, r0)
        L38:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48625Lf1.DHV(float, float):void");
    }

    @Override // X.InterfaceC50521MRz
    public final /* bridge */ /* synthetic */ void Dru(Object obj) {
        int A05 = AbstractC25227BEk.A05((EnumC46136Kba) obj, 0);
        if (A05 != 0) {
            if (A05 == 1) {
                C45494KCj c45494KCj = this.A03;
                if (c45494KCj != null) {
                    c45494KCj.A00();
                    C45494KCj c45494KCj2 = this.A02;
                    if (c45494KCj2 != null) {
                        JT7 jt7 = c45494KCj2.A00;
                        if (jt7 != null) {
                            jt7.A06 = false;
                            JT7.A00(jt7, null);
                            return;
                        }
                        return;
                    }
                    C14360o3.A0F("savedTabFragment");
                }
                C14360o3.A0F("trendingTabFragment");
            } else {
                throw B4Z.A00();
            }
        } else {
            C45494KCj c45494KCj3 = this.A03;
            if (c45494KCj3 != null) {
                JT7 jt72 = c45494KCj3.A00;
                if (jt72 != null) {
                    jt72.A06 = false;
                    JT7.A00(jt72, null);
                }
                C45494KCj c45494KCj4 = this.A02;
                if (c45494KCj4 != null) {
                    c45494KCj4.A00();
                    return;
                }
                C14360o3.A0F("savedTabFragment");
            }
            C14360o3.A0F("trendingTabFragment");
        }
        throw C00O.createAndThrow();
    }

    public C48625Lf1(Context context, FragmentActivity fragmentActivity, AbstractC10360h2 abstractC10360h2, UserSession userSession, C87H c87h, InterfaceC16820sZ interfaceC16820sZ, boolean z) {
        AbstractC167017dG.A1Q(userSession, fragmentActivity);
        this.A08 = userSession;
        this.A05 = context;
        this.A06 = fragmentActivity;
        this.A07 = abstractC10360h2;
        this.A0A = z;
        this.A0B = c87h;
        this.A09 = interfaceC16820sZ;
    }
}
