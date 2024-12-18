package X;

import android.content.Intent;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.model.shopping.productfeed.ProductTile;
import com.instagram.model.upcomingeventsmetadata.UpcomingEventMedia;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerLinearLayout;
import com.instagram.user.model.Product;
import com.instagram.user.model.UnavailableProduct;
import com.instagram.user.model.UpcomingEvent;

/* renamed from: X.HCw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38947HCw extends AbstractC59962oe implements C51D, JPm {
    public static final String __redex_internal_original_name = "UpcomingEventBottomSheetFragment";
    public C57112jm A00;
    public C41168IKh A01;
    public InterfaceC43588JPt A02;
    public C41052IFv A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public CountDownTimer A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final InterfaceC60442pS A0C = AbstractC60952qJ.A01("upcoming_event_bottom_sheet", true, true);
    public final InterfaceC41501vz A0N = C37816GkW.A00(this, 45);
    public final InterfaceC09390do A0D = C1XM.A00(new C57239PbN(this, 49));
    public final InterfaceC09390do A0F = C1XM.A00(new C43204J8b(this, 1));
    public final InterfaceC09390do A0H = C1XM.A00(new C43204J8b(this, 3));
    public final InterfaceC09390do A0L = C1XM.A00(new C43204J8b(this, 6));
    public final InterfaceC09390do A0K = C1XM.A00(new C43204J8b(this, 5));
    public final InterfaceC09390do A0E = C1XM.A00(new C43204J8b(this, 0));
    public final InterfaceC09390do A0G = C1XM.A00(new C43204J8b(this, 2));
    public final InterfaceC41501vz A0M = C37816GkW.A00(this, 44);
    public final InterfaceC09390do A0J = C1XM.A00(new C43204J8b(this, 4));
    public final InterfaceC09390do A0I = AbstractC60492pY.A02(this);

    public final void A04() {
        String str;
        C38321qM A00 = A00(this);
        if (A00 != null) {
            InterfaceC09390do interfaceC09390do = this.A0I;
            UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
            C2Fb c2Fb = C2Fb.A4A;
            InterfaceC60442pS interfaceC60442pS = this.A0C;
            C37952Gmu c37952Gmu = new C37952Gmu(this, A0r, new C5SE(AbstractC166987dD.A0r(interfaceC09390do), A00), interfaceC60442pS, c2Fb);
            c37952Gmu.A0J = A00;
            int i = -1;
            if (A00.A5M()) {
                i = 0;
            }
            c37952Gmu.A09 = i;
            C37953Gmv.A02(c37952Gmu);
            UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
            String str2 = this.A05;
            if (str2 == null) {
                str = "priorModule";
            } else {
                C146076i5 c146076i5 = new C146076i5(interfaceC60442pS, A0r2, str2);
                C41052IFv c41052IFv = this.A03;
                if (c41052IFv == null) {
                    str = "viewModel";
                } else {
                    UpcomingEvent upcomingEvent = c41052IFv.A01.A00;
                    String id = A00.getId();
                    String str3 = this.A07;
                    if (str3 == null) {
                        str = "sourceOfAction";
                    } else {
                        c146076i5.A04(upcomingEvent, id, "offsite_link_click", str3);
                        return;
                    }
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    public final void A06() {
        String str;
        C38321qM A00 = A00(this);
        String str2 = this.A04;
        if (this.A0B) {
            FragmentActivity requireActivity = requireActivity();
            UserSession A0r = AbstractC166987dD.A0r(this.A0I);
            C41052IFv c41052IFv = this.A03;
            if (c41052IFv == null) {
                str = "viewModel";
            } else {
                AbstractC70058W0s.A00(requireActivity, this, C22P.A5O, A0r, c41052IFv.A01.A00);
                return;
            }
        } else {
            if (A00 == null) {
                if (str2 != null && str2.length() > 0) {
                    AbstractC35183Ffa.A03(requireActivity(), new RectF(0.0f, 0.0f, 0.0f, 0.0f), AbstractC166987dD.A0r(this.A0I), str2, this.A0C.getModuleName());
                    return;
                }
                return;
            }
            boolean Cff = A00.Cff();
            UserSession A0r2 = AbstractC166987dD.A0r(this.A0I);
            if (Cff) {
                C77453dV.A02(requireActivity(), this, C22P.A5O, A0r2, null, A00, null, false);
                return;
            }
            FragmentActivity requireActivity2 = requireActivity();
            RectF rectF = new RectF();
            RectF rectF2 = new RectF();
            String str3 = this.A07;
            if (str3 == null) {
                str = "sourceOfAction";
            } else {
                AbstractC35183Ffa.A02(requireActivity2, rectF, rectF2, A0r2, null, A00, str3, null, -1, false);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC43418JGi
    public final void D2v(String str, String str2, String str3, int i, int i2) {
    }

    @Override // X.JII
    public final void Db4(C38675GzG c38675GzG, Product product) {
    }

    @Override // X.JII
    public final /* synthetic */ void Db5(View view, C38675GzG c38675GzG, ProductFeedItem productFeedItem, int i, int i2) {
    }

    @Override // X.JII
    public final void Db6(View view, C38675GzG c38675GzG, ProductFeedItem productFeedItem, int i, int i2) {
        AbstractC167017dG.A1N(productFeedItem, view);
        ((C41646Ibe) this.A0F.getValue()).A02(c38675GzG, productFeedItem, null, null, null, i, i2);
    }

    @Override // X.JII
    public final /* synthetic */ void Db9(Product product, String str, String str2, int i, int i2) {
    }

    @Override // X.JII
    public final boolean DbA(ProductFeedItem productFeedItem, String str, int i, int i2, boolean z) {
        return false;
    }

    @Override // X.JII
    public final /* synthetic */ void DbB(String str, int i) {
    }

    @Override // X.JII
    public final void DbC(Product product, int i, int i2) {
    }

    @Override // X.JII
    public final void DbE(C38675GzG c38675GzG, ProductTile productTile, int i, int i2) {
        C14360o3.A0B(productTile, 0);
        String str = null;
        C41625IbF A01 = ((C64972wv) AbstractC166987dD.A17(this.A0H)).A01(null, productTile);
        if (c38675GzG != null) {
            str = c38675GzG.A04;
        }
        A01.A08 = str;
        A01.A00();
    }

    @Override // X.JII
    public final boolean DbG(MotionEvent motionEvent, View view, ProductFeedItem productFeedItem, String str, int i, int i2, boolean z) {
        return false;
    }

    @Override // X.JII
    public final void DbH(Product product) {
    }

    @Override // X.JII
    public final void DbI(Product product) {
    }

    @Override // X.JII
    public final /* synthetic */ void DbJ(String str) {
    }

    @Override // X.JII
    public final /* synthetic */ void DbK(Product product) {
    }

    @Override // X.JHT
    public final void Dw2(UnavailableProduct unavailableProduct, int i, int i2) {
    }

    @Override // X.JHT
    public final void Dw3(ProductFeedItem productFeedItem) {
    }

    @Override // X.C51D
    public final /* synthetic */ void configureElementAboveTitle(InterfaceC56392iX interfaceC56392iX) {
    }

    @Override // X.C51D
    public final void onBottomSheetClosed() {
    }

    @Override // X.C51D
    public final void onBottomSheetPositionChanged(int i, int i2) {
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ImageUrl imageUrl;
        ImageInfo BGx;
        Integer num;
        int i;
        String str;
        String string;
        String str2;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A01 = new C41168IKh(view);
        InterfaceC09390do interfaceC09390do = this.A0I;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        C41168IKh c41168IKh = this.A01;
        if (c41168IKh == null) {
            str2 = "viewHolder";
        } else {
            C41052IFv c41052IFv = this.A03;
            if (c41052IFv == null) {
                str2 = "viewModel";
            } else {
                C41631IbM c41631IbM = (C41631IbM) this.A0E.getValue();
                AbstractC167007dF.A1F(A0r, 0, c41631IbM);
                IKV ikv = c41052IFv.A01;
                C38947HCw c38947HCw = c41052IFv.A00;
                UpcomingEvent upcomingEvent = ikv.A00;
                C38321qM c38321qM = ikv.A01;
                RoundedCornerLinearLayout roundedCornerLinearLayout = c41168IKh.A0D;
                IgImageView igImageView = c41168IKh.A0C;
                IgFrameLayout igFrameLayout = c41168IKh.A09;
                IgSimpleImageView igSimpleImageView = c41168IKh.A0A;
                if (c38321qM == null || (imageUrl = c38321qM.A1S()) == null) {
                    UpcomingEventMedia BQO = upcomingEvent.BQO();
                    if (BQO != null && (BGx = BQO.BGx()) != null) {
                        imageUrl = AbstractC40161tk.A02(BGx);
                    } else {
                        imageUrl = null;
                    }
                }
                boolean z = true;
                if (c38321qM == null || !c38321qM.Cff()) {
                    z = false;
                }
                if (!z && imageUrl != null) {
                    igFrameLayout.setVisibility(8);
                    roundedCornerLinearLayout.setVisibility(0);
                    igImageView.setUrl(A0r, imageUrl, this);
                } else {
                    roundedCornerLinearLayout.setVisibility(8);
                    igFrameLayout.setVisibility(0);
                    igSimpleImageView.setImageResource(R.drawable.instagram_calendar_pano_outline_24);
                }
                TextView textView = c41168IKh.A07;
                if (AbstractC41774Ieq.A0B(upcomingEvent)) {
                    num = C05F.A01;
                } else if (!AbstractC41774Ieq.A0B(upcomingEvent)) {
                    num = C05F.A00;
                } else {
                    num = C05F.A0C;
                }
                if (num.intValue() == 1 && (string = textView.getContext().getString(2131976243)) != null) {
                    textView.setText(string);
                    i = 0;
                } else {
                    i = 8;
                }
                textView.setVisibility(i);
                c41168IKh.A06.setText(upcomingEvent.getTitle());
                TextView textView2 = c41168IKh.A05;
                textView2.setText(AbstractC54244NyP.A00(A0r, C13920nI.A00, upcomingEvent).A00(AbstractC166997dE.A0L(textView2), EnumC53260Ngy.A04));
                View view2 = c41168IKh.A00;
                IgImageView igImageView2 = c41168IKh.A0B;
                boolean z2 = ikv.A07;
                C43204J8b c43204J8b = new C43204J8b(c38947HCw, 7);
                if (z2) {
                    igImageView2.setVisibility(0);
                    ViewOnClickListenerC42035Ik4.A01(view2, 47, c43204J8b);
                } else {
                    igImageView2.setVisibility(8);
                }
                c41168IKh.A02.setVisibility(0);
                RecyclerView recyclerView = c41168IKh.A08;
                recyclerView.setAdapter(c41631IbM.A00);
                c41631IbM.A01(c41052IFv);
                C39171HLz c39171HLz = (C39171HLz) c38947HCw.A0G.getValue();
                recyclerView.A14(c39171HLz);
                c39171HLz.A00 = recyclerView;
                C41052IFv c41052IFv2 = this.A03;
                if (c41052IFv2 != null) {
                    UpcomingEvent upcomingEvent2 = c41052IFv2.A01.A00;
                    String id = upcomingEvent2.getId();
                    boolean A0B = AbstractC41774Ieq.A0B(upcomingEvent2);
                    C14360o3.A0B(interfaceC09390do.getValue(), 1);
                    boolean z3 = !AbstractC41774Ieq.A0D(upcomingEvent2, System.currentTimeMillis());
                    if (A0B && z3) {
                        AbstractC12990ll A0k = AbstractC25230BEn.A0k(interfaceC09390do, 0);
                        C14360o3.A0B(id, 1);
                        C25621Ms A0M = AbstractC31177DnL.A0M(A0k);
                        A0M.A0L("upcoming_events/info/%s/", id);
                        C1ON A0e = AbstractC25227BEk.A0e(A0M, C38897HAt.class, IRL.class);
                        C37484Gf2.A00(A0e, upcomingEvent2, this, 20);
                        C1GJ.A03(A0e);
                    }
                    C57112jm c57112jm = this.A00;
                    str = "viewpointManager";
                    if (c57112jm != null) {
                        AbstractC37301Gc2.A0v(view, c57112jm, this);
                        C41052IFv c41052IFv3 = this.A03;
                        if (c41052IFv3 != null) {
                            UpcomingEvent upcomingEvent3 = c41052IFv3.A01.A00;
                            String str3 = this.A04;
                            UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
                            String str4 = this.A05;
                            if (str4 == null) {
                                str = "priorModule";
                            } else {
                                String str5 = this.A07;
                                if (str5 == null) {
                                    str = "sourceOfAction";
                                } else {
                                    HK5 hk5 = new HK5(this, A0r2, upcomingEvent3, str3, str4, str5);
                                    String id2 = upcomingEvent3.getId();
                                    if (id2 == null) {
                                        id2 = "";
                                    }
                                    C59072n8 A00 = C59062n7.A00(upcomingEvent3, C0eB.A00, id2);
                                    A00.A00(hk5);
                                    C59062n7 A01 = A00.A01();
                                    C57112jm c57112jm2 = this.A00;
                                    if (c57112jm2 != null) {
                                        c57112jm2.A05(view, A01);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                str = "viewModel";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
        }
        C14360o3.A0F(str2);
        throw C00O.createAndThrow();
    }

    public static final C38321qM A00(C38947HCw c38947HCw) {
        String str = c38947HCw.A04;
        if (str != null && str.length() > 0) {
            return AbstractC31176DnK.A0Z(c38947HCw.A0I).A02(c38947HCw.A04);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
    
        if (X.AbstractC41774Ieq.A0D(r18, java.lang.System.currentTimeMillis()) != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C41052IFv A01(X.C38947HCw r17, com.instagram.user.model.UpcomingEvent r18) {
        /*
            r2 = r17
            X.0do r0 = r2.A0I
            com.instagram.common.session.UserSession r3 = X.AbstractC166987dD.A0r(r0)
            X.1qM r9 = A00(r2)
            boolean r4 = r2.A09
            r5 = 1
            X.C14360o3.A0B(r3, r5)
            r6 = r18
            X.IMc r1 = r6.AKp()
            X.6i4 r0 = new X.6i4
            r0.<init>(r3)
            boolean r0 = r0.A01(r6)
            r1.A0E = r0
            com.instagram.user.model.UpcomingEvent r10 = r1.A00()
            java.lang.String r1 = r3.userId
            if (r9 == 0) goto L9d
            com.instagram.user.model.User r0 = r9.A2E(r3)
            if (r0 == 0) goto L9d
            java.lang.String r0 = r0.getId()
        L35:
            boolean r12 = X.C14360o3.A0K(r1, r0)
            java.lang.String r8 = r3.userId
            com.instagram.user.model.User r0 = r6.Bah()
            r7 = 0
            if (r0 == 0) goto L4d
            java.lang.String r1 = r0.getId()
            int r0 = r1.length()
            if (r0 == 0) goto L4d
            r7 = r1
        L4d:
            boolean r13 = X.C14360o3.A0K(r8, r7)
            boolean r0 = X.AbstractC41774Ieq.A08(r6)
            if (r0 == 0) goto L62
            long r0 = java.lang.System.currentTimeMillis()
            boolean r0 = X.AbstractC41774Ieq.A0D(r6, r0)
            r14 = 1
            if (r0 == 0) goto L63
        L62:
            r14 = 0
        L63:
            boolean r15 = X.AbstractC41774Ieq.A07(r6)
            long r0 = java.lang.System.currentTimeMillis()
            boolean r16 = X.AbstractC41774Ieq.A0D(r6, r0)
            boolean r17 = X.AbstractC41774Ieq.A09(r6)
            if (r9 == 0) goto L9a
            java.util.ArrayList r11 = r9.A3S(r5)
            if (r11 == 0) goto L9a
        L7b:
            r18 = 0
            if (r4 != 0) goto L8f
            if (r9 == 0) goto L8f
            boolean r0 = X.C76253bV.A04(r3, r9)
            if (r0 == 0) goto L8f
            boolean r0 = X.C76253bV.A09(r9)
            if (r0 == 0) goto L8f
            r18 = 1
        L8f:
            X.IKV r8 = new X.IKV
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            X.IFv r0 = new X.IFv
            r0.<init>(r2, r8)
            return r0
        L9a:
            X.0sl r11 = X.C16930sl.A00
            goto L7b
        L9d:
            r0 = 0
            goto L35
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38947HCw.A01(X.HCw, com.instagram.user.model.UpcomingEvent):X.IFv");
    }

    private final void A02(View view) {
        InterfaceC09390do interfaceC09390do = this.A0I;
        C71313Hs.A00(AbstractC166987dD.A0o(interfaceC09390do)).A0A(view, new C79623hD(null, AbstractC166987dD.A0r(interfaceC09390do), A00(this), this.A0C));
    }

    public static final void A03(C38947HCw c38947HCw, UpcomingEvent upcomingEvent) {
        C41052IFv c41052IFv = c38947HCw.A03;
        if (c41052IFv == null) {
            C14360o3.A0F("viewModel");
            throw C00O.createAndThrow();
        }
        c41052IFv.A01.A00 = upcomingEvent;
        C38321qM A00 = A00(c38947HCw);
        if (A00 != null) {
            A00.AEH(AbstractC166987dD.A0o(c38947HCw.A0I));
        }
        InterfaceC43588JPt interfaceC43588JPt = c38947HCw.A02;
        if (interfaceC43588JPt != null) {
            interfaceC43588JPt.Dei();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A05() {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38947HCw.A05():void");
    }

    public final void A08(View view) {
        String str;
        C41052IFv c41052IFv = this.A03;
        String str2 = "viewModel";
        if (c41052IFv != null) {
            UpcomingEvent upcomingEvent = c41052IFv.A01.A00;
            UserSession A0r = AbstractC166987dD.A0r(this.A0I);
            String str3 = this.A05;
            if (str3 == null) {
                str2 = "priorModule";
            } else {
                C146076i5 c146076i5 = new C146076i5(this.A0C, A0r, str3);
                C41052IFv c41052IFv2 = this.A03;
                if (c41052IFv2 != null) {
                    String A0h = AbstractC37301Gc2.A0h(c41052IFv2.A01.A01);
                    if (upcomingEvent.getReminderEnabled()) {
                        str = "upcoming_event_bottom_sheet_cta_reminder_on_impression";
                    } else {
                        str = "upcoming_event_bottom_sheet_cta_remind_me_impression";
                    }
                    String str4 = this.A07;
                    if (str4 == null) {
                        str2 = "sourceOfAction";
                    } else {
                        c146076i5.A04(upcomingEvent, A0h, str, str4);
                        A02(view);
                        return;
                    }
                }
            }
        }
        C14360o3.A0F(str2);
        throw C00O.createAndThrow();
    }

    @Override // X.C51D
    public final /* synthetic */ EnumC27385C6o backPressDestination() {
        return EnumC27385C6o.A02;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotDismissOnDraggingDown() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotDragWhenDismissLocked() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean doNotFlingWhenDismissLocked() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ int dragLockBouncePx() {
        return 0;
    }

    @Override // X.C51E
    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    @Override // X.C51E
    public final /* synthetic */ int getExtraDragSpace() {
        return 0;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A0C.getModuleName();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0I);
    }

    @Override // X.C51E
    public final /* synthetic */ double getSwipeDownDistanceAdjustment() {
        return 0.5d;
    }

    @Override // X.C51E
    public final /* synthetic */ double getSwipeUpDistanceAdjustment() {
        return 0.0d;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean includeFragmentDragSpace() {
        return false;
    }

    @Override // X.C51D
    public final /* synthetic */ boolean isElementAboveTitleEnabled() {
        return false;
    }

    @Override // X.C51E
    public final /* synthetic */ boolean isScrolledToBottom() {
        return true;
    }

    @Override // X.C51D
    public final /* synthetic */ boolean isScrolledToTop() {
        return true;
    }

    @Override // X.C51D
    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public final void A07(View view) {
        String str;
        A02(view);
        InterfaceC09390do interfaceC09390do = this.A0I;
        C71313Hs.A00(AbstractC166987dD.A0o(interfaceC09390do)).A05(view, EnumC71343Hv.A0W);
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        String str2 = this.A05;
        if (str2 == null) {
            str = "priorModule";
        } else {
            C146076i5 c146076i5 = new C146076i5(this.A0C, A0r, str2);
            C41052IFv c41052IFv = this.A03;
            str = "viewModel";
            if (c41052IFv != null) {
                IKV ikv = c41052IFv.A01;
                UpcomingEvent upcomingEvent = ikv.A00;
                String A0h = AbstractC37301Gc2.A0h(ikv.A01);
                String str3 = this.A07;
                if (str3 == null) {
                    str = "sourceOfAction";
                } else {
                    c146076i5.A04(upcomingEvent, A0h, "upcoming_event_bottom_sheet_cta_offsite_link_impression", str3);
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    @Override // X.C51E
    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        C38321qM A00;
        super.onActivityResult(i, i2, intent);
        if (i == 0 && (A00 = A00(this)) != null) {
            C41052IFv c41052IFv = this.A03;
            if (c41052IFv != null) {
                String id = c41052IFv.A01.A00.getId();
                InterfaceC09390do interfaceC09390do = this.A0I;
                A00.A0C.EgV(AbstractC146056i3.A00(AbstractC166987dD.A0r(interfaceC09390do)).A00(id));
                AbstractC31176DnK.A0Z(interfaceC09390do).A03(A00);
                InterfaceC43588JPt interfaceC43588JPt = this.A02;
                if (interfaceC43588JPt != null) {
                    interfaceC43588JPt.Dei();
                }
            }
            C14360o3.A0F("viewModel");
            throw C00O.createAndThrow();
        }
        C41052IFv c41052IFv2 = this.A03;
        if (c41052IFv2 != null) {
            if (!c41052IFv2.A01.A02) {
                AbstractC167017dG.A0y(getActivity(), C3DN.A00);
                return;
            }
            return;
        }
        C14360o3.A0F("viewModel");
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        IllegalStateException A14;
        int i;
        int A02 = C0f9.A02(190793819);
        super.onCreate(bundle);
        this.A00 = C57112jm.A00();
        Bundle requireArguments = requireArguments();
        this.A04 = requireArguments.getString("media_pk");
        String string = requireArguments.getString("prior_module");
        if (string != null) {
            this.A05 = string;
            String string2 = requireArguments.getString("source_of_action");
            if (string2 != null) {
                this.A07 = string2;
                this.A0B = requireArguments.getBoolean("coming_from_sticker");
                this.A0A = requireArguments.getBoolean("disable_snackbar");
                this.A09 = requireArguments.getBoolean("disable_offsite_link");
                this.A06 = AbstractC61112qZ.A00(null);
                UpcomingEvent upcomingEvent = (UpcomingEvent) requireArguments().getParcelable("upcoming_event");
                if (upcomingEvent != null) {
                    this.A03 = A01(this, upcomingEvent);
                    InterfaceC09390do interfaceC09390do = this.A0D;
                    ((C25671My) interfaceC09390do.getValue()).A01(this.A0M, C3HW.class);
                    ((C25671My) interfaceC09390do.getValue()).A01(this.A0N, C42242InS.class);
                    C0f9.A09(-1886402127, A02);
                    return;
                }
                A14 = AbstractC166987dD.A14("event required");
                i = 898503260;
            } else {
                A14 = AbstractC166987dD.A14("action source required");
                i = -1033080867;
            }
        } else {
            A14 = AbstractC166987dD.A14("prior module required");
            i = 427867499;
        }
        C0f9.A09(i, A02);
        throw A14;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(510375862);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_upcoming_event_bottom_sheet, false);
        C0f9.A09(792212304, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-339900446);
        super.onDestroy();
        C39171HLz c39171HLz = (C39171HLz) this.A0G.getValue();
        RecyclerView recyclerView = (RecyclerView) c39171HLz.A00;
        if (recyclerView != null) {
            recyclerView.A15(c39171HLz);
        }
        CountDownTimer countDownTimer = this.A08;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.A08 = null;
        InterfaceC09390do interfaceC09390do = this.A0D;
        ((C25671My) interfaceC09390do.getValue()).A02(this.A0M, C3HW.class);
        ((C25671My) interfaceC09390do.getValue()).A02(this.A0N, C42242InS.class);
        C0f9.A09(-1274544286, A02);
    }
}
