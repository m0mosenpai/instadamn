package X;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.V0o, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67883V0o extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "QuickPromotionIIGFullscreenBulletListFragment";
    public TextView A00;
    public TextView A01;
    public TextView A02;
    public TextView A03;
    public TextView A04;
    public UserSession A05;
    public IgImageView A06;
    public QuickPromotionSlot A07;
    public C64842wi A08;
    public boolean A09;
    public boolean A0A;
    public View A0B;
    public C4NJ A0C;
    public boolean A0D;
    public final Handler A0E = AbstractC167007dF.A0J();
    public final List A0F = new ArrayList();

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.EkF(false);
        View view = this.mView;
        if (view != null) {
            view.requestLayout();
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "quick promotion";
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        UserSession userSession = this.A05;
        if (userSession == null) {
            C14360o3.A0F("userSession");
            throw C00O.createAndThrow();
        }
        return userSession;
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        return !this.A0D;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x008f, code lost:
    
        if (r1 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0036, code lost:
    
        if (r4.length() == 0) goto L8;
     */
    /* JADX WARN: Type inference failed for: r2v4, types: [X.2fr, java.lang.Object] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r11) {
        /*
            r10 = this;
            r0 = -1112479482(0xffffffffbdb0e906, float:-0.08638196)
            int r3 = X.C0f9.A02(r0)
            r5 = r10
            super.onCreate(r11)
            androidx.fragment.app.FragmentActivity r1 = r10.getActivity()
            X.EVO r0 = new X.EVO
            r0.<init>(r1)
            r10.registerLifecycleListener(r0)
            android.os.Bundle r1 = r10.requireArguments()
            java.lang.String r0 = "QuickPromotionIIGFullscreenBaseFragment.KEY_PROMOTION_SLOT"
            java.lang.String r0 = r1.getString(r0)
            if (r0 == 0) goto L9b
            com.instagram.quickpromotion.intf.QuickPromotionSlot r0 = com.instagram.quickpromotion.intf.QuickPromotionSlot.valueOf(r0)
            r10.A07 = r0
            java.lang.String r0 = "QuickPromotionIIGFullscreenBaseFragment.KEY_QUICK_PROMOTION"
            java.lang.String r4 = r1.getString(r0)
            if (r4 == 0) goto L38
            int r1 = r4.length()
            r0 = 0
            if (r1 != 0) goto L39
        L38:
            r0 = 1
        L39:
            r2 = 0
            if (r0 != 0) goto L4c
            X.16L r0 = X.C16V.A00(r4)     // Catch: java.io.IOException -> L45
            X.4NJ r2 = X.C4NI.parseFromJson(r0)     // Catch: java.io.IOException -> L45
            goto L4c
        L45:
            java.lang.String r1 = "IG-QP"
            java.lang.String r0 = "Error parsing fullscreen interstitial promotion"
            X.C0w9.A03(r1, r0)
        L4c:
            r10.A0C = r2
            com.instagram.common.session.UserSession r7 = X.AbstractC31176DnK.A0S(r10)
            r10.A05 = r7
            X.1Xa r4 = X.AbstractC54912fq.A00()
            if (r7 != 0) goto L64
            java.lang.String r0 = "userSession"
        L5c:
            X.C14360o3.A0F(r0)
            X.00O r1 = X.C00O.createAndThrow()
            throw r1
        L64:
            com.instagram.quickpromotion.intf.QuickPromotionSlot r9 = r10.A07
            if (r9 != 0) goto L6b
            java.lang.String r0 = "quickPromotionSlot"
            goto L5c
        L6b:
            X.AbstractC54912fq.A00()
            X.2fr r2 = new X.2fr
            r2.<init>()
            r1 = 1
            X.Wlg r0 = new X.Wlg
            r0.<init>(r10, r1)
            r2.A08 = r0
            X.2fy r8 = r2.A00()
            r6 = r10
            X.2wi r0 = r4.A02(r5, r6, r7, r8, r9)
            r10.A08 = r0
            X.4NJ r0 = r10.A0C
            if (r0 == 0) goto L91
            X.4NM r0 = r0.A08
            X.4NV r1 = r0.A00
            r0 = 1
            if (r1 != 0) goto L92
        L91:
            r0 = 0
        L92:
            r10.A0D = r0
            r0 = 1260330741(0x4b1f1ef5, float:1.0428149E7)
            X.C0f9.A09(r0, r3)
            return
        L9b:
            java.lang.IllegalStateException r1 = X.AbstractC166997dE.A0g()
            r0 = 16212264(0xf76128, float:2.271822E-38)
            X.C0f9.A09(r0, r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67883V0o.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(210068170);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.quick_promotion_fullscreen_bullet_list_fragment, viewGroup, false);
        this.A06 = (IgImageView) inflate.requireViewById(R.id.image);
        this.A02 = (TextView) inflate.requireViewById(R.id.primary_button);
        this.A03 = (TextView) inflate.requireViewById(R.id.secondary_button);
        this.A00 = (TextView) inflate.requireViewById(R.id.content);
        this.A01 = (TextView) inflate.findViewById(R.id.learn_more_link);
        this.A04 = AbstractC31180DnO.A06(inflate);
        this.A0B = inflate.requireViewById(R.id.content_container);
        List list = this.A0F;
        list.add(new C69145Via((IgLinearLayout) AbstractC166997dE.A0R(inflate, R.id.bullet_item_1), AbstractC25231BEo.A0d(inflate, R.id.bullet_item_text_1), AbstractC167007dF.A0T(inflate, R.id.bullet_item_icon_1)));
        list.add(new C69145Via((IgLinearLayout) AbstractC166997dE.A0R(inflate, R.id.bullet_item_2), AbstractC25231BEo.A0d(inflate, R.id.bullet_item_text_2), AbstractC167007dF.A0T(inflate, R.id.bullet_item_icon_2)));
        list.add(new C69145Via((IgLinearLayout) AbstractC166997dE.A0R(inflate, R.id.bullet_item_3), AbstractC25231BEo.A0d(inflate, R.id.bullet_item_text_3), AbstractC167007dF.A0T(inflate, R.id.bullet_item_icon_3)));
        list.add(new C69145Via((IgLinearLayout) AbstractC166997dE.A0R(inflate, R.id.bullet_item_4), AbstractC25231BEo.A0d(inflate, R.id.bullet_item_text_4), AbstractC167007dF.A0T(inflate, R.id.bullet_item_icon_4)));
        list.add(new C69145Via((IgLinearLayout) AbstractC166997dE.A0R(inflate, R.id.bullet_item_5), AbstractC25231BEo.A0d(inflate, R.id.bullet_item_text_5), AbstractC167007dF.A0T(inflate, R.id.bullet_item_icon_5)));
        list.add(new C69145Via((IgLinearLayout) AbstractC166997dE.A0R(inflate, R.id.bullet_item_6), AbstractC25231BEo.A0d(inflate, R.id.bullet_item_text_6), AbstractC167007dF.A0T(inflate, R.id.bullet_item_icon_6)));
        C0f9.A09(-333584571, A02);
        return inflate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        String str;
        IgImageView igImageView;
        ImageUrl imageUrl;
        ImmutableList copyOf;
        String str2;
        int A02 = C0f9.A02(1494957487);
        super.onResume();
        C4NJ c4nj = this.A0C;
        if (c4nj != null && !this.A0A) {
            C64842wi c64842wi = this.A08;
            if (c64842wi == null) {
                str = "_quickPromotionDelegate";
            } else {
                c64842wi.Dcq(c4nj);
                C4NM c4nm = c4nj.A08;
                C5Ry c5Ry = c4nm.A06;
                C5Ry c5Ry2 = c4nm.A07;
                str = "imageView";
                if (AbstractC72723Nt.A00(requireContext()) && c5Ry != null) {
                    igImageView = this.A06;
                    if (igImageView != null) {
                        imageUrl = c5Ry.A00;
                        igImageView.setUrl(imageUrl, this);
                    }
                } else if (c5Ry2 != null) {
                    igImageView = this.A06;
                    if (igImageView != null) {
                        imageUrl = c5Ry2.A00;
                        igImageView.setUrl(imageUrl, this);
                    }
                }
                C4NN c4nn = c4nm.A09;
                TextView textView = this.A04;
                if (textView == null) {
                    str = "titleText";
                } else {
                    String str3 = c4nn.A00;
                    if (str3 == null) {
                        str3 = "";
                    }
                    textView.setText(str3);
                    C117095Rs c117095Rs = c4nm.A03;
                    if (c117095Rs != null) {
                        TextView textView2 = this.A00;
                        if (textView2 == null) {
                            str = "contentText";
                        } else {
                            String str4 = c117095Rs.A00;
                            if (str4 == null) {
                                str4 = "";
                            }
                            textView2.setText(str4);
                        }
                    }
                    C4NV c4nv = c4nm.A02;
                    if (c4nv != null) {
                        String str5 = c4nv.A03;
                        TextView textView3 = this.A01;
                        TextView textView4 = this.A03;
                        if (str5 != null && textView3 != null) {
                            String str6 = c4nv.A00.A00;
                            if (str6 == null) {
                                str6 = "";
                            }
                            textView3.setText(str6);
                            C0fQ.A00(new WMS(str5, this, 7), textView3);
                            textView3.setVisibility(0);
                        } else if (textView4 != null) {
                            String str7 = c4nv.A00.A00;
                            if (str7 == null) {
                                str7 = "";
                            }
                            textView4.setText(str7);
                            WNP.A00(textView4, 60, c4nj, this);
                            textView4.setVisibility(0);
                        }
                    }
                    C4NV c4nv2 = c4nm.A01;
                    if (c4nv2 != null) {
                        TextView textView5 = this.A02;
                        str = "primaryButton";
                        if (textView5 != null) {
                            String str8 = c4nv2.A00.A00;
                            if (str8 == null) {
                                str8 = "";
                            }
                            textView5.setText(str8);
                            TextView textView6 = this.A02;
                            if (textView6 != null) {
                                WNX.A00(textView6, c4nv2, this, c4nj, 45);
                            }
                        }
                    }
                    List list = c4nm.A0A;
                    if (list != null && (copyOf = ImmutableList.copyOf((Collection) list)) != null && !copyOf.isEmpty()) {
                        int size = copyOf.size();
                        for (int i = 0; i < size; i++) {
                            C69144ViZ c69144ViZ = (C69144ViZ) copyOf.get(i);
                            List list2 = this.A0F;
                            ((C69145Via) list2.get(i)).A00.setVisibility(0);
                            C5Ry c5Ry3 = c69144ViZ.A00;
                            if (c5Ry3 != null) {
                                ((C69145Via) list2.get(i)).A02.setUrl(c5Ry3.A00, this);
                            }
                            IgTextView igTextView = ((C69145Via) list2.get(i)).A01;
                            String str9 = c69144ViZ.A02;
                            if (str9 != null && str9.length() != 0) {
                                str2 = c69144ViZ.A02;
                            } else {
                                String str10 = c69144ViZ.A01;
                                if (str10 != null && str10.length() != 0) {
                                    str2 = c69144ViZ.A01;
                                }
                            }
                            igTextView.setText(str2);
                        }
                    }
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        if (isVisible() && !this.A09) {
            AbstractC10360h2 abstractC10360h2 = this.mFragmentManager;
            if (abstractC10360h2 != null) {
                abstractC10360h2.A0b();
            } else {
                throw AbstractC166997dE.A0g();
            }
        } else {
            this.A0A = true;
        }
        this.A09 = true;
        C0f9.A09(1535727511, A02);
    }
}
