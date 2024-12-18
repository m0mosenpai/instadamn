package com.instagram.creation.fragment;

import X.AbstractC018607g;
import X.AbstractC12220kQ;
import X.AbstractC13880nE;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC18680vv;
import X.AbstractC31171DnF;
import X.AbstractC31172DnG;
import X.AbstractC31173DnH;
import X.AbstractC31174DnI;
import X.AbstractC31175DnJ;
import X.AbstractC31176DnK;
import X.AbstractC31178DnM;
import X.AbstractC31179DnN;
import X.AbstractC43592JPx;
import X.AbstractC50523MSb;
import X.AbstractC53242c7;
import X.AbstractC54198Nxc;
import X.AbstractC59962oe;
import X.AbstractC917648y;
import X.C00O;
import X.C06090Tz;
import X.C0f9;
import X.C130135uJ;
import X.C131965xW;
import X.C131975xX;
import X.C13400mQ;
import X.C14360o3;
import X.C168607fu;
import X.C168617fv;
import X.C180377zR;
import X.C1YB;
import X.C200018t5;
import X.C31722DwR;
import X.C34679FPo;
import X.C50689MZh;
import X.C50808McV;
import X.C55346Oi6;
import X.C55621On6;
import X.C56725PFt;
import X.C56814PJk;
import X.C61972ry;
import X.C8YB;
import X.C8YD;
import X.C8YE;
import X.EnumC200038t7;
import X.EnumC40111tc;
import X.EnumC53382NjX;
import X.GZR;
import X.InterfaceC02590Ai;
import X.InterfaceC11380iw;
import X.InterfaceC196338mP;
import X.InterfaceC56362iU;
import X.InterfaceC58001Pnl;
import X.InterfaceC60122ou;
import X.MSX;
import X.P1O;
import X.PIF;
import X.ViewOnClickListenerC55460OkF;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.facebook.R;
import com.facebook.common.callercontext.CallerContext;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.model.sharelater.ShareLaterMedia;
import com.instagram.ui.widget.textview.IgAutoCompleteTextView;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.enums.EnumEntries;

/* loaded from: classes9.dex */
public final class ShareLaterFragment extends AbstractC59962oe implements InterfaceC11380iw, InterfaceC60122ou, InterfaceC58001Pnl {
    public static final CallerContext A0I = CallerContext.A01("ShareLaterFragment");
    public UserSession A00;
    public C13400mQ A01;
    public C34679FPo A03;
    public ShareLaterMedia A04;
    public IgAutoCompleteTextView A05;
    public C8YE A06;
    public String A07;
    public List A08;
    public AtomicBoolean A09;
    public int A0A;
    public View A0B;
    public GZR A0C;
    public C200018t5 A0D;
    public boolean A0E;
    public C50808McV appShareTable;
    public final Handler A0F = new Handler();
    public final TextWatcher A0H = new C55346Oi6(this, 6);
    public InterfaceC196338mP A02 = new P1O(this, 0);
    public final C50689MZh A0G = new C50689MZh(this, 7);

    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    @Override // X.InterfaceC58001Pnl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Cx3(X.EnumC53382NjX r15) {
        /*
            r14 = this;
            r13 = 0
            r6 = r15
            X.C14360o3.A0B(r15, r13)
            X.NjX r3 = X.EnumC53382NjX.A05
            java.lang.String r5 = "userSession"
            r11 = 0
            r7 = r14
            if (r15 != r3) goto L69
            X.OZu r2 = X.OZu.A00
            com.instagram.common.session.UserSession r1 = r14.A00
            if (r1 == 0) goto L2f
            com.instagram.model.sharelater.ShareLaterMedia r0 = r14.A04
            boolean r0 = r2.A01(r1, r0)
        L19:
            if (r0 == 0) goto L8e
            com.instagram.model.sharelater.ShareLaterMedia r0 = r14.A04
            java.lang.String r4 = "Required value was null."
            if (r0 == 0) goto L79
            boolean r0 = r15.A0A(r0)
            if (r0 != 0) goto L58
            if (r15 != r3) goto L58
            X.8t5 r3 = r14.A0D
            if (r3 != 0) goto L37
            java.lang.String r5 = "noticeManager"
        L2f:
            X.C14360o3.A0F(r5)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L37:
            androidx.fragment.app.FragmentActivity r2 = r14.requireActivity()
            com.instagram.common.session.UserSession r1 = r14.A00
            if (r1 == 0) goto L2f
            X.82G r0 = X.C82G.A0H
            X.OJy r1 = X.AbstractC54221Nxz.A00(r2, r0, r1)
            com.instagram.model.sharelater.ShareLaterMedia r0 = r14.A04
            if (r0 == 0) goto L67
            java.lang.String r0 = r0.A05
        L4b:
            r1.A08 = r0
            android.content.Context r0 = r14.getContext()
            r1.A00 = r0
            X.PGV r0 = X.PGV.A00
            r3.A01(r11, r1, r0)
        L58:
            com.instagram.model.sharelater.ShareLaterMedia r9 = r14.A04
            if (r9 == 0) goto L74
            com.instagram.common.session.UserSession r8 = r14.A00
            if (r8 == 0) goto L2f
            X.GZR r10 = r14.A0C
            if (r10 != 0) goto L7e
            java.lang.String r5 = "authorizeListener"
            goto L2f
        L67:
            r0 = r11
            goto L4b
        L69:
            com.instagram.common.session.UserSession r0 = r14.A00
            if (r0 == 0) goto L2f
            com.instagram.model.sharelater.ShareLaterMedia r0 = r14.A04
            boolean r0 = X.EnumC53382NjX.A01(r0)
            goto L19
        L74:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r4)
            throw r0
        L79:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r4)
            throw r0
        L7e:
            r12 = r11
            r6.A05(r7, r8, r9, r10, r11, r12, r13)
            X.McV r1 = r14.appShareTable
            if (r1 == 0) goto L8b
            com.instagram.model.sharelater.ShareLaterMedia r0 = r14.A04
            r1.A06(r0)
        L8b:
            A00(r14)
        L8e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.fragment.ShareLaterFragment.Cx3(X.NjX):void");
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        IgAutoCompleteTextView igAutoCompleteTextView = (IgAutoCompleteTextView) view.requireViewById(R.id.caption_text_view);
        this.A05 = igAutoCompleteTextView;
        C14360o3.A0A(igAutoCompleteTextView);
        ShareLaterMedia shareLaterMedia = this.A04;
        C14360o3.A0A(shareLaterMedia);
        igAutoCompleteTextView.setText(shareLaterMedia.A04);
        int dimensionPixelSize = AbstractC166997dE.A0N(this).getDimensionPixelSize(R.dimen.asset_picker_redesign_sticker_height);
        IgAutoCompleteTextView igAutoCompleteTextView2 = this.A05;
        C14360o3.A0A(igAutoCompleteTextView2);
        igAutoCompleteTextView2.A00 = 2.5f;
        igAutoCompleteTextView2.A01 = dimensionPixelSize;
        Context requireContext = requireContext();
        IgAutoCompleteTextView igAutoCompleteTextView3 = this.A05;
        if (igAutoCompleteTextView3 != null) {
            C168617fv c168617fv = C168607fu.A0I;
            UserSession userSession = this.A00;
            if (userSession == null) {
                str = "userSession";
            } else {
                igAutoCompleteTextView3.setAdapter(c168617fv.A01(requireContext, this, new C61972ry(requireContext, AbstractC018607g.A00(this), null), userSession, null, "share_post_page", false));
                IgAutoCompleteTextView igAutoCompleteTextView4 = this.A05;
                C14360o3.A0A(igAutoCompleteTextView4);
                igAutoCompleteTextView4.A07 = true;
                ShareLaterMedia shareLaterMedia2 = this.A04;
                C14360o3.A0A(shareLaterMedia2);
                if (shareLaterMedia2.A02 == EnumC40111tc.A0a) {
                    AbstractC31172DnG.A1J(view, R.id.caption_video_overlay, 0);
                }
                ViewGroup A0C = AbstractC31176DnK.A0C(view, R.id.share_later_content);
                if (AbstractC50523MSb.A09(requireContext()).isEnabled()) {
                    AbstractC167007dF.A0N(A0C, R.id.caption_text_view).setHintTextColor(requireContext().getColor(AbstractC53242c7.A09(requireContext())));
                }
                EnumEntries enumEntries = EnumC53382NjX.A03;
                UserSession userSession2 = this.A00;
                str = "userSession";
                if (userSession2 != null) {
                    this.A08 = AbstractC54198Nxc.A00(userSession2);
                    Context requireContext2 = requireContext();
                    List list = this.A08;
                    UserSession userSession3 = this.A00;
                    if (userSession3 != null) {
                        C50808McV c50808McV = new C50808McV(requireContext2, view, this, userSession3, this.A04, new PIF(this), "share_later", list, null);
                        this.appShareTable = c50808McV;
                        c50808McV.A07 = this;
                        int A03 = AbstractC167017dG.A03(requireContext());
                        C50808McV c50808McV2 = this.appShareTable;
                        C14360o3.A0A(c50808McV2);
                        c50808McV2.setPadding(A03, 0, A03, A03);
                        C50808McV c50808McV3 = this.appShareTable;
                        C14360o3.A0A(c50808McV3);
                        c50808McV3.A06(this.A04);
                        A0C.addView(this.appShareTable);
                        AbstractC31179DnN.A1J(this, 8);
                        C1YB A00 = C8YB.A00();
                        UserSession userSession4 = this.A00;
                        if (userSession4 != null) {
                            this.A06 = A00.A00(AbstractC31173DnH.A0G(view, R.id.warning_nudge), this, userSession4, C8YB.A00().A01(), new C56814PJk(this, 2));
                            C8YD A01 = C8YB.A00().A01();
                            UserSession userSession5 = this.A00;
                            if (userSession5 != null) {
                                if (A01.Ej9(userSession5)) {
                                    IgAutoCompleteTextView igAutoCompleteTextView5 = this.A05;
                                    if (igAutoCompleteTextView5 != null) {
                                        igAutoCompleteTextView5.addTextChangedListener(this.A0H);
                                        IgAutoCompleteTextView igAutoCompleteTextView6 = this.A05;
                                        if (igAutoCompleteTextView6 != null) {
                                            String A0g = AbstractC167007dF.A0g(igAutoCompleteTextView6);
                                            if (A0g != null && A0g.length() != 0) {
                                                C8YE c8ye = this.A06;
                                                C14360o3.A0A(c8ye);
                                                c8ye.A07(AbstractC166987dD.A1J(A0g));
                                            }
                                        } else {
                                            throw AbstractC166987dD.A14("Required value was null.");
                                        }
                                    } else {
                                        throw AbstractC166987dD.A14("Required value was null.");
                                    }
                                }
                                UserSession userSession6 = this.A00;
                                if (userSession6 != null) {
                                    if (AbstractC31178DnM.A1X(C06090Tz.A05, userSession6, 36318441025902737L)) {
                                        UserSession userSession7 = this.A00;
                                        if (userSession7 != null) {
                                            C200018t5 c200018t5 = new C200018t5(userSession7);
                                            Context requireContext3 = requireContext();
                                            UserSession userSession8 = this.A00;
                                            if (userSession8 != null) {
                                                c200018t5.A00(requireContext3, userSession8, EnumC200038t7.A04);
                                                return;
                                            }
                                        }
                                    } else {
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        throw AbstractC166997dE.A0g();
    }

    public static final void A00(ShareLaterFragment shareLaterFragment) {
        boolean z;
        if (shareLaterFragment.A0B != null) {
            List<EnumC53382NjX> list = shareLaterFragment.A08;
            if (list != null) {
                for (EnumC53382NjX enumC53382NjX : list) {
                    ShareLaterMedia shareLaterMedia = shareLaterFragment.A04;
                    if (shareLaterMedia != null) {
                        if (enumC53382NjX.A0A(shareLaterMedia)) {
                            z = true;
                            break;
                        }
                    } else {
                        throw AbstractC166997dE.A0g();
                    }
                }
            }
            z = false;
            View view = shareLaterFragment.A0B;
            C14360o3.A0A(view);
            view.setEnabled(z);
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "share_later";
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        UserSession userSession = this.A00;
        if (userSession == null) {
            AbstractC31171DnF.A0y();
            throw C00O.createAndThrow();
        }
        return userSession;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.Ffp, java.lang.Object] */
    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        String A0q = AbstractC166997dE.A0q(AbstractC31176DnK.A05(this, interfaceC56362iU).getResources(), 2131973639);
        ?? obj = new Object();
        obj.A02 = A0q;
        this.A0B = C31722DwR.A00(new ViewOnClickListenerC55460OkF(this, 60), interfaceC56362iU, obj);
        A00(this);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        EnumC53382NjX enumC53382NjX;
        super.onActivityResult(i, i2, intent);
        if (this.A00 == null) {
            AbstractC31171DnF.A0y();
            throw C00O.createAndThrow();
        }
        ShareLaterMedia shareLaterMedia = this.A04;
        if (shareLaterMedia != null) {
            CallerContext callerContext = C55621On6.A00;
            if (i == 64206) {
                enumC53382NjX = EnumC53382NjX.A05;
            } else {
                enumC53382NjX = null;
            }
            if (i2 == -1 && enumC53382NjX != null && enumC53382NjX != EnumC53382NjX.A05 && !(!enumC53382NjX.A09(r3))) {
                enumC53382NjX.A08(shareLaterMedia, true);
            }
            C50808McV c50808McV = this.appShareTable;
            if (c50808McV != null) {
                c50808McV.A06(this.A04);
            }
            A00(this);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        List list;
        ShareLaterMedia shareLaterMedia;
        List list2;
        ImmutableList copyOf;
        int A02 = C0f9.A02(-707099283);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        UserSession A0S = AbstractC31176DnK.A0S(this);
        this.A00 = A0S;
        if (A0S != null) {
            this.A0D = new C200018t5(A0S);
            Parcelable parcelable = requireArguments.getParcelable("ShareLaterMedia.SHARE_LATER_MEDIA");
            if (parcelable != null) {
                ShareLaterMedia shareLaterMedia2 = (ShareLaterMedia) parcelable;
                this.A04 = shareLaterMedia2;
                this.A0C = new C56725PFt(this, 0);
                if (shareLaterMedia2 == null || (list = shareLaterMedia2.A06) == null || ImmutableList.copyOf((Collection) list) == null || (shareLaterMedia = this.A04) == null || (list2 = shareLaterMedia.A06) == null || (copyOf = ImmutableList.copyOf((Collection) list2)) == null || !copyOf.contains("FB")) {
                    UserSession userSession = this.A00;
                    if (userSession != null) {
                        C180377zR.A07(userSession);
                    }
                }
                UserSession userSession2 = this.A00;
                if (userSession2 != null) {
                    ShareLaterMedia shareLaterMedia3 = this.A04;
                    if (shareLaterMedia3 == null || (str = shareLaterMedia3.A05) == null) {
                        str = "";
                    }
                    InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(this, userSession2), "external_share_view_impression");
                    if (A0f.isSampled()) {
                        AbstractC31175DnJ.A14(A0f, this);
                        A0f.AAP("share_location", "share_later_view");
                        A0f.AAP("media_id", str);
                        A0f.Cht();
                    }
                    UserSession userSession3 = this.A00;
                    if (userSession3 != null) {
                        if (!AbstractC31178DnM.A1X(C06090Tz.A05, userSession3, 2342156184607262523L)) {
                            C34679FPo c34679FPo = this.A03;
                            if (c34679FPo == null) {
                                UserSession userSession4 = this.A00;
                                if (userSession4 != null) {
                                    c34679FPo = new C34679FPo(userSession4);
                                    this.A03 = c34679FPo;
                                }
                            }
                            c34679FPo.A00();
                        }
                        C0f9.A09(977559693, A02);
                        return;
                    }
                }
            } else {
                IllegalStateException A0g = AbstractC166997dE.A0g();
                C0f9.A09(-201413691, A02);
                throw A0g;
            }
        }
        C14360o3.A0F("userSession");
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1093815926);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.share_later, viewGroup, false);
        C0f9.A09(1127471542, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(2057362160);
        super.onDestroy();
        this.A02 = null;
        C0f9.A09(1698922519, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-791657412);
        super.onDestroyView();
        this.A05 = null;
        this.A0B = null;
        this.appShareTable = null;
        C8YE c8ye = this.A06;
        if (c8ye != null) {
            c8ye.A05();
            this.A06 = null;
        }
        AbstractC31179DnN.A1J(this, 0);
        C0f9.A09(-1011879891, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-534038520);
        super.onPause();
        AbstractC13880nE.A0O(this.A05);
        AbstractC917648y.A00(requireActivity(), this.A0A);
        Window A0H = AbstractC31174DnI.A0H(this);
        if (A0H != null) {
            A0H.setSoftInputMode(48);
            C0f9.A09(1353401139, A02);
        } else {
            IllegalStateException A0g = AbstractC166997dE.A0g();
            C0f9.A09(-1299283131, A02);
            throw A0g;
        }
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(345812117);
        super.onResume();
        C50808McV c50808McV = this.appShareTable;
        if (c50808McV != null) {
            c50808McV.A06(this.A04);
            C50808McV c50808McV2 = this.appShareTable;
            if (c50808McV2 != null) {
                c50808McV2.setEnabled(true);
                C50808McV c50808McV3 = this.appShareTable;
                C14360o3.A0A(c50808McV3);
                Iterator it = c50808McV3.A0O.iterator();
                while (it.hasNext()) {
                    AbstractC43592JPx.A09(it).setAlpha(1.0f);
                }
            }
        }
        A00(this);
        C131975xX c131975xX = C131965xW.A05;
        UserSession userSession = this.A00;
        if (userSession != null) {
            C131975xX.A00(userSession).A08(null);
            this.A0A = requireActivity().getRequestedOrientation();
            AbstractC917648y.A00(requireActivity(), -1);
            Window A0H = AbstractC31174DnI.A0H(this);
            if (A0H != null) {
                A0H.setSoftInputMode(16);
                UserSession userSession2 = this.A00;
                if (userSession2 != null) {
                    C130135uJ A0Q = MSX.A0Q(userSession2);
                    if (!this.A0E && A0Q != null && C131975xX.A02(A0Q)) {
                        UserSession userSession3 = this.A00;
                        if (userSession3 != null) {
                            if (C131975xX.A01(userSession3) && !A0Q.A00 && A0Q.A05) {
                                C50808McV c50808McV4 = this.appShareTable;
                                C14360o3.A0A(c50808McV4);
                                requireContext();
                                UserSession userSession4 = this.A00;
                                if (userSession4 != null) {
                                    C131975xX.A00(userSession4);
                                    c50808McV4.A05(A0Q, null, null, "share_later", false);
                                    this.A0E = true;
                                }
                            }
                        }
                    }
                    C0f9.A09(1674476790, A02);
                    return;
                }
            } else {
                IllegalStateException A0g = AbstractC166997dE.A0g();
                C0f9.A09(114832037, A02);
                throw A0g;
            }
        }
        C14360o3.A0F("userSession");
        throw C00O.createAndThrow();
    }
}
