package X;

import android.os.Handler;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;

/* renamed from: X.V0t, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC67886V0t extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "QuickPromotionIIGFullscreenBaseFragment";
    public View A00;
    public TextView A01;
    public TextView A02;
    public TextView A03;
    public TextView A04;
    public IgImageView A05;
    public QuickPromotionSlot A06;
    public C4NJ A07;
    public C64842wi A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final InterfaceC09390do A0E = AbstractC60492pY.A02(this);
    public final Handler A0D = AbstractC167007dF.A0J();

    public final void A02(C4NJ c4nj) {
        IgImageView igImageView;
        ImageUrl imageUrl;
        TextView textView;
        C14360o3.A0B(c4nj, 0);
        C64842wi c64842wi = this.A08;
        if (c64842wi != null) {
            c64842wi.Dcq(c4nj);
        }
        C4NM c4nm = c4nj.A08;
        TextView textView2 = this.A04;
        if (textView2 != null) {
            String str = c4nm.A09.A00;
            if (str == null) {
                str = "";
            }
            textView2.setText(str);
        }
        C117095Rs c117095Rs = c4nm.A03;
        if (c117095Rs != null && (textView = this.A01) != null) {
            String str2 = c117095Rs.A00;
            if (str2 == null) {
                str2 = "";
            }
            textView.setText(str2);
        }
        C4NV c4nv = c4nm.A01;
        if (c4nv != null) {
            TextView textView3 = this.A02;
            if (textView3 != null) {
                String str3 = c4nv.A00.A00;
                if (str3 == null) {
                    str3 = "";
                }
                textView3.setText(str3);
            }
            TextView textView4 = this.A02;
            if (textView4 != null) {
                WNP.A00(textView4, 58, c4nj, this);
            }
        }
        C4NV c4nv2 = c4nm.A02;
        if (c4nv2 != null) {
            TextView textView5 = this.A03;
            if (textView5 != null) {
                String str4 = c4nv2.A00.A00;
                if (str4 == null) {
                    str4 = "";
                }
                textView5.setText(str4);
            }
            TextView textView6 = this.A03;
            if (textView6 != null) {
                WNP.A00(textView6, 59, c4nj, this);
            }
        }
        C5Ry c5Ry = c4nm.A06;
        C5Ry c5Ry2 = c4nm.A07;
        if (AbstractC72723Nt.A00(requireContext()) && c5Ry != null) {
            igImageView = this.A05;
            if (igImageView != null) {
                imageUrl = c5Ry.A00;
            } else {
                return;
            }
        } else if (c5Ry2 == null || (igImageView = this.A05) == null) {
            return;
        } else {
            imageUrl = c5Ry2.A00;
        }
        igImageView.setUrl(imageUrl, this);
    }

    @Override // X.InterfaceC11380iw
    public String getModuleName() {
        return "quick promotion";
    }

    public final void A01() {
        AbstractC10360h2 abstractC10360h2 = this.mFragmentManager;
        if (abstractC10360h2 != null) {
            abstractC10360h2.A0b();
        }
        FragmentActivity activity = getActivity();
        if (this.A0C && activity != null) {
            activity.finish();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000f  */
    @Override // X.InterfaceC60122ou
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void configureActionBar(X.InterfaceC56362iU r4) {
        /*
            r3 = this;
            boolean r0 = r3 instanceof X.V9P
            r1 = 0
            if (r0 == 0) goto L13
            X.C14360o3.A0B(r4, r1)
        L8:
            r4.EkF(r1)
        Lb:
            android.view.View r0 = r3.mView
            if (r0 == 0) goto L12
            r0.requestLayout()
        L12:
            return
        L13:
            X.C14360o3.A0B(r4, r1)
            boolean r0 = r3.A0B
            if (r0 == 0) goto L8
            r0 = 1
            r4.EkF(r0)
            r4.EkS(r0)
            java.lang.Integer r0 = X.C05F.A00
            X.Fbz r1 = new X.Fbz
            r1.<init>(r0)
            r0 = -1
            r1.A02(r0)
            r0 = 2131239093(0x7f0820b5, float:1.8094483E38)
            r1.A02 = r0
            X.5Gm r0 = r1.A01()
            r4.Ehg(r0)
            android.view.View r2 = r3.A00
            if (r2 == 0) goto L50
            android.content.res.Resources r1 = X.AbstractC166997dE.A0N(r3)
            r0 = 2131165313(0x7f070081, float:1.794484E38)
            int r1 = r1.getDimensionPixelSize(r0)
            int r0 = r4.AYS()
            int r1 = r1 - r0
            X.AbstractC13880nE.A0f(r2, r1)
            goto Lb
        L50:
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC67886V0t.configureActionBar(X.2iU):void");
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return (AbstractC18680vv) this.A0E.getValue();
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        if (this instanceof V9R) {
            return false;
        }
        return !this.A0B;
    }

    public static View A00(View view, AbstractC67886V0t abstractC67886V0t) {
        abstractC67886V0t.A02 = (TextView) view.findViewById(R.id.primary_button);
        abstractC67886V0t.A03 = (TextView) view.findViewById(R.id.secondary_button);
        abstractC67886V0t.A01 = (TextView) view.findViewById(R.id.content);
        abstractC67886V0t.A04 = (TextView) view.findViewById(R.id.title);
        return view.findViewById(R.id.image);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0082, code lost:
    
        if (r1 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0044, code lost:
    
        if (r4.length() == 0) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.4NJ] */
    /* JADX WARN: Type inference failed for: r2v4, types: [X.2fr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r14) {
        /*
            r13 = this;
            r0 = 704059827(0x29f719b3, float:1.09734616E-13)
            int r3 = X.C0f9.A02(r0)
            r8 = r13
            super.onCreate(r14)
            androidx.fragment.app.FragmentActivity r1 = r13.getActivity()
            X.EVO r0 = new X.EVO
            r0.<init>(r1)
            r13.registerLifecycleListener(r0)
            android.os.Bundle r1 = r13.requireArguments()
            java.lang.String r6 = "QuickPromotionIIGFullscreenBaseFragment.KEY_PROMOTION_SLOT"
            java.lang.String r0 = X.AbstractC153636vY.A01(r1, r6)
            com.instagram.quickpromotion.intf.QuickPromotionSlot r0 = com.instagram.quickpromotion.intf.QuickPromotionSlot.valueOf(r0)
            r13.A06 = r0
            java.lang.String r0 = "QuickPromotionIIGFullscreenBaseFragment.KEY_FRAGMENT_TAG_LAUNCH_AS_MODAL"
            boolean r0 = r1.getBoolean(r0)
            r13.A0C = r0
            X.0do r7 = r13.A0E
            java.lang.Object r5 = r7.getValue()
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            java.lang.String r0 = "QuickPromotionIIGFullscreenBaseFragment.KEY_QUICK_PROMOTION"
            java.lang.String r4 = r1.getString(r0)
            if (r4 == 0) goto L46
            int r1 = r4.length()
            r0 = 0
            if (r1 != 0) goto L47
        L46:
            r0 = 1
        L47:
            r2 = 0
            if (r0 != 0) goto L5a
            X.16L r0 = X.C16V.A00(r4)     // Catch: java.io.IOException -> L53
            X.4NJ r2 = X.C4NI.parseFromJson(r0)     // Catch: java.io.IOException -> L53
            goto L5a
        L53:
            java.lang.Integer r1 = X.C05F.A0N
            java.lang.String r0 = "Error parsing fullscreen interstitial promotion"
            X.AbstractC31546DtW.A00(r5, r1, r0, r2)
        L5a:
            r13.A07 = r2
            boolean r0 = r13 instanceof X.V9R
            if (r0 == 0) goto L8e
            android.os.Bundle r1 = r13.requireArguments()
            X.09Y r0 = X.C023409i.A0A
            com.instagram.common.session.UserSession r2 = r0.A06(r1)
            java.lang.String r0 = X.AbstractC153636vY.A01(r1, r6)
            com.instagram.quickpromotion.intf.QuickPromotionSlot r1 = com.instagram.quickpromotion.intf.QuickPromotionSlot.valueOf(r0)
            X.V9N r0 = new X.V9N
            r0.<init>(r13, r13, r2, r1)
        L77:
            r13.A08 = r0
            X.4NJ r0 = r13.A07
            if (r0 == 0) goto L84
            X.4NM r0 = r0.A08
            X.4NV r1 = r0.A00
            r0 = 1
            if (r1 != 0) goto L85
        L84:
            r0 = 0
        L85:
            r13.A0B = r0
            r0 = -1555595260(0xffffffffa3478004, float:-1.081492E-17)
            X.C0f9.A09(r0, r3)
            return
        L8e:
            java.lang.Object r10 = r7.getValue()
            com.instagram.common.session.UserSession r10 = (com.instagram.common.session.UserSession) r10
            com.instagram.quickpromotion.intf.QuickPromotionSlot r12 = r13.A06
            if (r10 == 0) goto Lb8
            if (r12 == 0) goto Lb8
            X.1Xa r7 = X.AbstractC54912fq.A00()
            X.AbstractC54912fq.A00()
            X.2fr r2 = new X.2fr
            r2.<init>()
            r1 = 0
            X.Wlg r0 = new X.Wlg
            r0.<init>(r13, r1)
            r2.A08 = r0
            X.2fy r11 = r2.A00()
            r9 = r13
            X.2wi r0 = r7.A02(r8, r9, r10, r11, r12)
            goto L77
        Lb8:
            r0 = 0
            goto L77
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC67886V0t.onCreate(android.os.Bundle):void");
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onResume() {
        int A02 = C0f9.A02(-1387924602);
        super.onResume();
        C4NJ c4nj = this.A07;
        if (c4nj != null && !this.A0A) {
            A02(c4nj);
        } else {
            A01();
            this.A09 = true;
        }
        C0f9.A09(-499705806, A02);
    }
}
