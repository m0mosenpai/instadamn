package com.instagram.creation.fragment;

import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC25225BEi;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC43593JPy;
import X.AbstractC47113Ks8;
import X.AnonymousClass840;
import X.C00O;
import X.C0f9;
import X.C0fQ;
import X.C14360o3;
import X.C43904JbF;
import X.C50166MDt;
import X.C53Z;
import X.DH0;
import X.InterfaceC09390do;
import X.KEC;
import X.ViewOnClickListenerC48063LPo;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes8.dex */
public final class ManageDraftsFragment extends C53Z {
    public KEC A00;
    public AnonymousClass840 A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final InterfaceC09390do A05 = AbstractC25225BEi.A0a(new C50166MDt(this, 37), new C50166MDt(this, 36), new DH0(0, null, this), AbstractC25225BEi.A1D(C43904JbF.class));
    public final String A06 = "manage_drafts";
    public View actionButton;
    public View cancelButton;
    public TextView titleView;

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        View view2;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        GridView gridView = (GridView) AbstractC166997dE.A0R(view, R.id.drafts_grid);
        KEC kec = this.A00;
        if (kec == null) {
            AbstractC31171DnF.A0t();
            throw C00O.createAndThrow();
        }
        gridView.setAdapter((ListAdapter) kec);
        gridView.setNumColumns(3);
        AnonymousClass840 anonymousClass840 = this.A01;
        if (anonymousClass840 != null && AbstractC43593JPy.A0R(anonymousClass840).A0M) {
            View inflate = AbstractC167007dF.A0M(view, R.id.action_bar).inflate();
            if (this.A04 || this.A03) {
                C14360o3.A0A(inflate);
                view = inflate;
            }
            View requireViewById = view.requireViewById(R.id.next_button_imageview);
            this.actionButton = requireViewById;
            if (requireViewById != null) {
                requireViewById.setVisibility(0);
            }
            TextView A0T = AbstractC166997dE.A0T(view, R.id.action_bar_textview_title);
            this.titleView = A0T;
            if (A0T != null) {
                A0T.setAccessibilityHeading(true);
            }
            TextView textView = this.titleView;
            if (textView != null) {
                textView.setVisibility(0);
            }
            ViewOnClickListenerC48063LPo viewOnClickListenerC48063LPo = new ViewOnClickListenerC48063LPo(this, 40);
            ImageView A08 = AbstractC31171DnF.A08(view, R.id.action_bar_cancel);
            view2 = A08;
            if (A08 != null) {
                Context context = view.getContext();
                A08.setImageResource(R.drawable.instagram_x_pano_outline_24);
                C0fQ.A00(viewOnClickListenerC48063LPo, A08);
                AbstractC31172DnG.A1E(context.getResources(), A08, 2131954754);
                view2 = A08;
            }
        } else {
            this.actionButton = requireActivity().requireViewById(R.id.next_button_imageview);
            TextView textView2 = (TextView) requireActivity().requireViewById(R.id.action_bar_textview_title);
            this.titleView = textView2;
            if (textView2 != null) {
                textView2.setAccessibilityHeading(true);
            }
            view2 = requireActivity().requireViewById(R.id.button_back);
        }
        this.cancelButton = view2;
        View view3 = this.actionButton;
        if (view3 != null) {
            ViewOnClickListenerC48063LPo.A00(view3, 41, this);
        }
        A00(this);
    }

    public static final void A00(ManageDraftsFragment manageDraftsFragment) {
        ImageView imageView;
        int i = 2131961169;
        if (manageDraftsFragment.A02) {
            i = 2131958587;
        }
        TextView textView = manageDraftsFragment.titleView;
        if (textView != null) {
            textView.setText(i);
        }
        View view = manageDraftsFragment.actionButton;
        if ((view instanceof ImageView) && (imageView = (ImageView) view) != null) {
            boolean z = manageDraftsFragment.A02;
            int i2 = R.drawable.instagram_edit_pano_outline_24;
            if (z) {
                i2 = R.drawable.instagram_check_pano_filled_24;
            }
            imageView.setImageResource(i2);
        }
        View view2 = manageDraftsFragment.actionButton;
        if (view2 != null) {
            int i3 = 2131961561;
            if (manageDraftsFragment.A02) {
                i3 = 2131972699;
            }
            view2.setContentDescription(manageDraftsFragment.getString(i3));
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A06;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0088, code lost:
    
        if (r4 != null) goto L8;
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r35) {
        /*
            r34 = this;
            r0 = 2027553342(0x78da023e, float:3.5373944E34)
            int r2 = X.C0f9.A02(r0)
            r3 = r34
            r0 = r35
            super.onCreate(r0)
            android.content.res.Resources r0 = X.AbstractC166997dE.A0N(r3)
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.widthPixels
            int r0 = r0 / 3
            float r0 = (float) r0
            int r5 = X.C1H4.A01(r0)
            android.os.Bundle r1 = r3.requireArguments()
            java.lang.String r0 = "is_navigating_from_content_management"
            boolean r0 = r1.getBoolean(r0)
            r3.A04 = r0
            android.os.Bundle r1 = r3.requireArguments()
            java.lang.String r0 = "is_navigating_from_opal"
            boolean r0 = r1.getBoolean(r0)
            r3.A03 = r0
            android.content.Context r4 = r3.requireContext()
            com.instagram.common.session.UserSession r1 = r3.getSession()
            X.8Yt r0 = new X.8Yt
            r0.<init>(r1, r5)
            X.KEC r5 = new X.KEC
            r5.<init>(r4, r0, r3)
            r3.A00 = r5
            com.instagram.common.session.UserSession r0 = r3.getSession()
            java.util.ArrayList r4 = X.AbstractC43876Jag.A00(r0)
            java.util.ArrayList r1 = r5.A01
            r1.clear()
            java.util.ArrayList r0 = r5.A02
            r0.clear()
            r1.addAll(r4)
            X.KEC.A00(r5)
            android.os.Bundle r1 = r3.requireArguments()
            java.lang.String r0 = "previousCreationSession"
            android.os.Parcelable r4 = r1.getParcelable(r0)
            com.instagram.creation.base.CreationSession r4 = (com.instagram.creation.base.CreationSession) r4
            if (r4 != 0) goto L8a
            android.content.Context r0 = r3.requireContext()
            boolean r0 = r0 instanceof X.InterfaceC189628ah
            if (r0 == 0) goto Ld0
            android.content.Context r1 = r3.requireContext()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.creation.base.SessionProvider"
            X.C14360o3.A0C(r1, r0)
            X.8ah r1 = (X.InterfaceC189628ah) r1
            com.instagram.creation.base.CreationSession r4 = r1.Asi()
            if (r4 == 0) goto Le1
        L8a:
            com.instagram.common.session.UserSession r1 = r3.getSession()
            X.22P r0 = X.C22P.A5N
            r6 = 0
            r26 = 0
            r29 = 1
            X.83h r5 = new X.83h
            r7 = r6
            r8 = r6
            r9 = r6
            r10 = r6
            r11 = r6
            r12 = r6
            r13 = r6
            r14 = r6
            r15 = r6
            r16 = r6
            r17 = r6
            r18 = r6
            r19 = r6
            r20 = r6
            r21 = r6
            r22 = r6
            r23 = r6
            r24 = r6
            r25 = r6
            r27 = r26
            r28 = r26
            r30 = r26
            r31 = r26
            r32 = r26
            r33 = r26
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            X.840 r0 = X.MX9.A00(r0, r1, r4, r5)
            r3.A01 = r0
            r0 = -672196466(0xffffffffd7ef188e, float:-5.2577748E14)
            X.C0f9.A09(r0, r2)
            return
        Ld0:
            boolean r0 = r3.A04
            if (r0 == 0) goto Le1
            com.instagram.creation.base.CreationSession r4 = new com.instagram.creation.base.CreationSession
            r4.<init>()
            X.3Ch r0 = X.EnumC69983Ch.A02
            r4.A0A = r0
            r0 = 1
            r4.A0M = r0
            goto L8a
        Le1:
            java.lang.IllegalStateException r1 = X.AbstractC166997dE.A0g()
            r0 = 639969163(0x2625278b, float:5.7299465E-16)
            X.C0f9.A09(r0, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.fragment.ManageDraftsFragment.onCreate(android.os.Bundle):void");
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        return AbstractC47113Ks8.A00(this, i2, z);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(703151268);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_drafts_grid, viewGroup, false);
        C0f9.A09(-561857714, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-581468953);
        super.onDestroyView();
        ManageDraftsFragmentLifecycleUtil.cleanupReferences(this);
        C0f9.A09(-430434364, A02);
    }
}
