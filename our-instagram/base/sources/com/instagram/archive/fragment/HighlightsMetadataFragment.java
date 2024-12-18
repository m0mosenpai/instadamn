package com.instagram.archive.fragment;

import X.AbstractC018607g;
import X.AbstractC10360h2;
import X.AbstractC13880nE;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC25225BEi;
import X.AbstractC31171DnF;
import X.AbstractC31176DnK;
import X.AbstractC50523MSb;
import X.AbstractC53792Nqi;
import X.C00O;
import X.C08790ch;
import X.C0f9;
import X.C14360o3;
import X.C18U;
import X.C3I7;
import X.C3I9;
import X.C3LO;
import X.C44376JjF;
import X.C52252NAr;
import X.C53Z;
import X.C54377O1j;
import X.C54662OCo;
import X.C55197Oe4;
import X.EnumC53243Ngg;
import X.InterfaceC56362iU;
import X.InterfaceC60122ou;
import X.InterfaceC60152ox;
import X.MSX;
import X.ViewOnClickListenerC55467OkM;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.io.Serializable;

/* loaded from: classes9.dex */
public final class HighlightsMetadataFragment extends C53Z implements InterfaceC60122ou, InterfaceC60152ox {
    public C52252NAr A00;
    public C55197Oe4 A01;
    public C44376JjF A02;
    public C3I9 A03;
    public IgSimpleImageView cardCoverView;
    public IgTextView editCoverImageButton;
    public IgImageView pogCoverImageView;
    public View rootView;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "reel_highlights_cover_title";
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0088, code lost:
    
        if (r0 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x008a, code lost:
    
        X.C0fQ.A00(r1, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x008d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e0, code lost:
    
        if (r0 != null) goto L17;
     */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r20, android.os.Bundle r21) {
        /*
            r19 = this;
            r10 = 0
            r1 = r20
            X.C14360o3.A0B(r1, r10)
            r2 = r19
            r0 = r21
            super.onViewCreated(r1, r0)
            X.3I9 r0 = r2.A03
            if (r0 == 0) goto L14
            r0.A9e(r2)
        L14:
            r2.rootView = r1
            r0 = 2131433972(0x7f0b19f4, float:1.8489745E38)
            com.instagram.common.ui.base.IgSimpleImageView r0 = X.AbstractC31176DnK.A0T(r1, r0)
            X.C14360o3.A0B(r0, r10)
            r2.cardCoverView = r0
            r0 = 2131433981(0x7f0b19fd, float:1.8489763E38)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = X.AbstractC167007dF.A0T(r1, r0)
            X.C14360o3.A0B(r0, r10)
            r2.pogCoverImageView = r0
            r0 = 2131432217(0x7f0b1319, float:1.8486185E38)
            com.instagram.common.ui.base.IgTextView r3 = X.AbstractC25231BEo.A0d(r1, r0)
            X.C14360o3.A0B(r3, r10)
            r2.editCoverImageButton = r3
            r0 = 15
            X.OkM r1 = new X.OkM
            r1.<init>(r2, r0)
            X.C0fQ.A00(r1, r3)
            com.instagram.common.ui.base.IgTextView r4 = r2.editCoverImageButton
            if (r4 == 0) goto Le6
            android.content.Context r3 = X.AbstractC166997dE.A0L(r4)
            int r0 = X.C1QI.A01(r3)
            X.AbstractC166987dD.A1O(r3, r4, r0)
            X.0cb r3 = X.C17060sy.A01
            com.instagram.common.session.UserSession r0 = r2.getSession()
            com.instagram.user.model.User r0 = r3.A01(r0)
            boolean r0 = r0.A2P()
            r6 = 8
            if (r0 != 0) goto L8e
            com.instagram.common.session.UserSession r5 = r2.getSession()
            X.0Tz r0 = X.AbstractC25225BEi.A0j(r5, r10)
            r3 = 36328925038853999(0x8110f700033f6f, double:3.037896707186207E-306)
            boolean r0 = X.C18U.A06(r0, r5, r3)
            if (r0 != 0) goto L8e
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r2.pogCoverImageView
            if (r0 == 0) goto Le3
            r0.setVisibility(r10)
            com.instagram.common.ui.base.IgSimpleImageView r0 = r2.cardCoverView
            if (r0 == 0) goto Le9
            r0.setVisibility(r6)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r2.pogCoverImageView
            if (r0 == 0) goto Le3
        L8a:
            X.C0fQ.A00(r1, r0)
            return
        L8e:
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r2.pogCoverImageView
            if (r0 == 0) goto Le3
            r0.setVisibility(r6)
            com.instagram.common.ui.base.IgSimpleImageView r0 = r2.cardCoverView
            if (r0 == 0) goto Le9
            r0.setVisibility(r10)
            android.content.Context r4 = r2.requireContext()
            r0 = 6
            X.AbstractC13880nE.A04(r4, r0)
            android.content.Context r3 = r2.requireContext()
            r0 = 1102577664(0x41b80000, float:23.0)
            float r7 = X.AbstractC13880nE.A00(r3, r0)
            android.content.Context r3 = r2.requireContext()
            android.content.Context r0 = r2.requireContext()
            int r0 = X.AbstractC53242c7.A04(r0)
            int r12 = r3.getColor(r0)
            r5 = 0
            r9 = 1058642330(0x3f19999a, float:0.6)
            r16 = 1
            r13 = 300(0x12c, double:1.48E-321)
            r8 = 1045220557(0x3e4ccccd, float:0.2)
            X.JjF r3 = new X.JjF
            r6 = r5
            r11 = r10
            r15 = r10
            r17 = r10
            r18 = r10
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r15, r16, r17, r18)
            r2.A02 = r3
            com.instagram.common.ui.base.IgSimpleImageView r0 = r2.cardCoverView
            if (r0 == 0) goto Le9
            r0.setImageDrawable(r3)
            com.instagram.common.ui.base.IgSimpleImageView r0 = r2.cardCoverView
            if (r0 == 0) goto Le9
            goto L8a
        Le3:
            java.lang.String r0 = "pogCoverImageView"
            goto Leb
        Le6:
            java.lang.String r0 = "editCoverImageButton"
            goto Leb
        Le9:
            java.lang.String r0 = "cardCoverView"
        Leb:
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.archive.fragment.HighlightsMetadataFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // X.InterfaceC60152ox
    public final void DOK(int i, boolean z) {
        if (z) {
            View view = this.rootView;
            if (view != null) {
                AbstractC13880nE.A0Y(view, i);
                return;
            }
        } else {
            View view2 = this.rootView;
            if (view2 != null) {
                AbstractC13880nE.A0Y(view2, 0);
                return;
            }
        }
        C14360o3.A0F("rootView");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        interfaceC56362iU.setTitle(AbstractC31176DnK.A05(this, interfaceC56362iU).getResources().getString(2131968156));
        interfaceC56362iU.EkS(AbstractC167007dF.A1O(AbstractC50523MSb.A01(this)));
        C3LO A0B = AbstractC31171DnF.A0B();
        A0B.A0K = AbstractC166997dE.A0N(this).getString(2131961124);
        AbstractC31176DnK.A1B(new ViewOnClickListenerC55467OkM(this, 14), A0B, interfaceC56362iU);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        int A02 = C0f9.A02(225840519);
        super.onCreate(bundle);
        C55197Oe4 A00 = C55197Oe4.A00(getSession());
        C14360o3.A07(A00);
        this.A01 = A00;
        UserSession session = getSession();
        FragmentActivity requireActivity = requireActivity();
        AbstractC10360h2 abstractC10360h2 = this.mFragmentManager;
        C08790ch A002 = AbstractC018607g.A00(this);
        C55197Oe4 c55197Oe4 = this.A01;
        if (c55197Oe4 == null) {
            str = "sessionController";
        } else {
            Serializable serializable = requireArguments().getSerializable("highlight_management_source");
            if (serializable != null) {
                this.A00 = new C52252NAr(requireActivity, abstractC10360h2, A002, c55197Oe4, new C54377O1j(this), (EnumC53243Ngg) serializable, session);
                UserSession session2 = getSession();
                if (C18U.A06(AbstractC25225BEi.A0j(session2, 0), session2, 36330896428647493L)) {
                    this.A03 = C3I7.A01(this, false, true);
                }
                C52252NAr c52252NAr = this.A00;
                if (c52252NAr == null) {
                    str = "controller";
                } else {
                    registerLifecycleListener(c52252NAr);
                    C0f9.A09(1006187721, A02);
                    return;
                }
            } else {
                IllegalStateException A0g = AbstractC166997dE.A0g();
                C0f9.A09(-2051257162, A02);
                throw A0g;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-674533194);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_highlights_metadata_fragment, viewGroup, false);
        C0f9.A09(-1354970823, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-35457122);
        super.onDestroy();
        C3I9 c3i9 = this.A03;
        if (c3i9 != null) {
            c3i9.onDestroy();
        }
        C0f9.A09(2091662622, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        ImageUrl A0t;
        int i;
        String str;
        int A02 = C0f9.A02(16514081);
        super.onResume();
        C3I9 c3i9 = this.A03;
        if (c3i9 != null) {
            MSX.A16(this, c3i9);
        }
        C55197Oe4 c55197Oe4 = this.A01;
        String str2 = "sessionController";
        if (c55197Oe4 != null) {
            if (C55197Oe4.A02(c55197Oe4).isEmpty()) {
                i = -1999090712;
            } else {
                C55197Oe4 c55197Oe42 = this.A01;
                if (c55197Oe42 != null) {
                    C54662OCo c54662OCo = c55197Oe42.A00;
                    if (c54662OCo == null || ((str = c54662OCo.A03) != null && !c55197Oe42.A05.containsKey(str))) {
                        C55197Oe4 c55197Oe43 = this.A01;
                        if (c55197Oe43 != null) {
                            c55197Oe43.A06(requireActivity());
                        }
                    }
                    FragmentActivity requireActivity = requireActivity();
                    UserSession session = getSession();
                    IgImageView igImageView = this.pogCoverImageView;
                    if (igImageView != null) {
                        IgSimpleImageView igSimpleImageView = this.cardCoverView;
                        if (igSimpleImageView != null) {
                            C44376JjF c44376JjF = this.A02;
                            C55197Oe4 c55197Oe44 = this.A01;
                            if (c55197Oe44 != null) {
                                C54662OCo c54662OCo2 = c55197Oe44.A00;
                                if (c54662OCo2 != null) {
                                    A0t = c54662OCo2.A02;
                                } else {
                                    A0t = AbstractC25225BEi.A0t("");
                                }
                                AbstractC53792Nqi.A00(requireActivity, igSimpleImageView, this, session, A0t, c44376JjF, igImageView);
                                i = 1982358324;
                            }
                        } else {
                            str2 = "cardCoverView";
                        }
                    } else {
                        str2 = "pogCoverImageView";
                    }
                }
            }
            C0f9.A09(i, A02);
            return;
        }
        C14360o3.A0F(str2);
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(1897230335);
        super.onStart();
        C3I9 c3i9 = this.A03;
        if (c3i9 != null) {
            MSX.A16(this, c3i9);
        }
        C0f9.A09(511076820, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(1590871123);
        super.onStop();
        C3I9 c3i9 = this.A03;
        if (c3i9 != null) {
            c3i9.onStop();
        }
        C0f9.A09(-1800755019, A02);
    }
}
