package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.R;
import com.instagram.api.schemas.HighlightReelTypeStr;
import com.instagram.api.schemas.ProfileGridItemTypeEnum;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.widget.imageview.ConstrainedImageView;
import com.instagram.igds.components.imagebutton.IgMultiImageButton;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes7.dex */
public final class HFU extends AbstractC65632xz {
    public InterfaceC152866uG A01;
    public InterfaceC152886uI A02;
    public boolean A03;
    public boolean A04;
    public final InterfaceC11380iw A05;
    public final UserSession A06;
    public final C53Q A07;
    public final C38N A08;
    public final JHJ A09;
    public final C38U A0A;
    public final String A0B;
    public final String A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final RunnableC152986uS A0F = new RunnableC152986uS();
    public float A00 = -1.0f;

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getIdentifier(int i, Object obj, Object obj2) {
        C14360o3.A0B(obj, 1);
        return AbstractC166997dE.A0u(obj).hashCode();
    }

    @Override // X.AbstractC65632xz, X.InterfaceC65642y0
    public final int getViewModelHash(int i, Object obj, Object obj2) {
        Reel reel;
        int hashCode;
        C14360o3.A0B(obj, 1);
        UserSession userSession = this.A06;
        C153126ug c153126ug = (C153126ug) obj;
        AbstractC25230BEn.A15(1, userSession, c153126ug);
        int[] iArr = new int[c153126ug.A01()];
        int A01 = c153126ug.A01();
        for (int i2 = 0; i2 < A01; i2++) {
            ProfileGridItemTypeEnum profileGridItemTypeEnum = ((IM8) c153126ug.A02(i2)).A01;
            if (profileGridItemTypeEnum == ProfileGridItemTypeEnum.A05) {
                C38321qM c38321qM = ((IM8) c153126ug.A02(i2)).A02;
                if (c38321qM != null) {
                    hashCode = AbstractC153386v7.A00(userSession, c38321qM);
                }
                hashCode = 0;
            } else {
                if (profileGridItemTypeEnum == ProfileGridItemTypeEnum.A04 && ((IM8) c153126ug.A02(i2)).A03 != null && (reel = ((IM8) c153126ug.A02(i2)).A03) != null) {
                    hashCode = reel.hashCode();
                }
                hashCode = 0;
            }
            iArr[i2] = hashCode;
        }
        return Arrays.hashCode(iArr);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        EnumC153466vG enumC153466vG;
        Number A0Q;
        int A03 = C0f9.A03(-710810086);
        AbstractC167027dH.A13(view, obj, obj2);
        C153126ug c153126ug = (C153126ug) obj;
        C153336v2 c153336v2 = (C153336v2) obj2;
        int A032 = C0f9.A03(1520804434);
        UserSession userSession = this.A06;
        Object tag = view.getTag();
        C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.feed.ui.rows.profilegrid.ProfileGridRowViewBinder.Holder");
        C38440GvN c38440GvN = (C38440GvN) tag;
        boolean z = c153336v2.A04;
        int i2 = c153336v2.A00;
        float f = this.A00;
        Map map = c153336v2.A02;
        C38N c38n = this.A08;
        C53Q c53q = this.A07;
        JHJ jhj = this.A09;
        InterfaceC152866uG interfaceC152866uG = this.A01;
        InterfaceC152886uI interfaceC152886uI = this.A02;
        InterfaceC11380iw interfaceC11380iw = this.A05;
        String str = this.A0B;
        boolean z2 = this.A04;
        boolean z3 = this.A03;
        String str2 = this.A0C;
        boolean z4 = this.A0E;
        boolean z5 = this.A0D;
        AbstractC167007dF.A1K(userSession, c38440GvN);
        AbstractC25229BEm.A1M(c153126ug, 2, interfaceC11380iw);
        View view2 = c38440GvN.A00;
        AbstractC13880nE.A0Y(view2, AbstractC37303Gc4.A01(view2, z ? 1 : 0));
        view2.setImportantForAccessibility(2);
        HJ3[] hj3Arr = c38440GvN.A01;
        int i3 = 0;
        do {
            HJ3 hj3 = hj3Arr[i3];
            if (hj3 != null) {
                IgMultiImageButton igMultiImageButton = hj3.A00;
                float f2 = 1.0f;
                if (z2) {
                    f2 = 0.75f;
                }
                ((ConstrainedImageView) igMultiImageButton).A00 = f2;
                if (z4) {
                    hj3.A00.setEnableTouchOverlay(false);
                }
                hj3.A01.setVisibility(8);
                if (i3 < c153126ug.A01()) {
                    IM8 im8 = (IM8) c153126ug.A02(i3);
                    int i4 = (i2 * 3) + i3;
                    if (im8.A01 == ProfileGridItemTypeEnum.A05) {
                        C38321qM c38321qM = im8.A02;
                        if (c38321qM != null) {
                            IgMultiImageButton igMultiImageButton2 = hj3.A00;
                            int i5 = 0;
                            AbstractC13880nE.A0Y(view2, AbstractC37303Gc4.A01(view2, z ? 1 : 0));
                            view2.setImportantForAccessibility(2);
                            if (c38321qM.A5M() && map != null && map.containsKey(c38321qM.getId()) && (A0Q = AbstractC37300Gc1.A0Q(c38321qM.getId(), map)) != null) {
                                i5 = A0Q.intValue();
                            }
                            igMultiImageButton2.setHighlightName(null);
                            AbstractC153416vB.A02(interfaceC11380iw, userSession, c38321qM, c53q, c38n, interfaceC152866uG, igMultiImageButton2, str, str2, f, i3, i2, i4, i5, true, z3, z2);
                        }
                    } else if (im8.A01 == ProfileGridItemTypeEnum.A04 && im8.A03 != null) {
                        Reel reel = im8.A03;
                        if (reel != null) {
                            IgMultiImageButton igMultiImageButton3 = hj3.A00;
                            boolean z6 = im8.A00;
                            SpinnerImageView spinnerImageView = hj3.A01;
                            AbstractC167007dF.A1J(igMultiImageButton3, 0, spinnerImageView);
                            ImageUrl A08 = reel.A08();
                            if (A08 != null || (A08 = reel.A07()) != null) {
                                igMultiImageButton3.setUrl(A08, interfaceC11380iw, false, false, C1WW.A03);
                            }
                            if (interfaceC152886uI != null) {
                                interfaceC152886uI.EDs(igMultiImageButton3, reel);
                            }
                            C0fQ.A00(new ViewOnClickListenerC41998IjT(reel, jhj, spinnerImageView, i4, i2, z4), igMultiImageButton3);
                            igMultiImageButton3.setOnLongClickListener(new ViewOnLongClickListenerC42043IkC(i4, 0, reel, jhj));
                            EnumC153476vH enumC153476vH = null;
                            igMultiImageButton3.setOnTouchListener(null);
                            if (z4) {
                                if (!z6) {
                                    enumC153476vH = EnumC153476vH.A04;
                                }
                                igMultiImageButton3.setMediaOverlay(enumC153476vH);
                            }
                            if (reel.A1D && z5) {
                                igMultiImageButton3.setMediaOverlay(EnumC153476vH.A03);
                                igMultiImageButton3.setSecondaryIcon(EnumC153466vG.A0A);
                            }
                            if (z4) {
                                if (z6) {
                                    enumC153466vG = EnumC153466vG.A0H;
                                } else {
                                    enumC153466vG = EnumC153466vG.A0I;
                                }
                            } else if (reel.A09 == HighlightReelTypeStr.A05) {
                                enumC153466vG = EnumC153466vG.A0E;
                            } else {
                                enumC153466vG = EnumC153466vG.A0F;
                            }
                            igMultiImageButton3.setIcon(enumC153466vG);
                            igMultiImageButton3.setHighlightName(reel.A0r);
                            igMultiImageButton3.setVisibility(0);
                        }
                    }
                }
                AbstractC153386v7.A04(hj3.A00);
            }
            i3++;
        } while (i3 < 3);
        C0f9.A0A(-1683280425, A032);
        C0f9.A0A(-1459267914, A03);
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        Reel reel;
        InterfaceC152886uI interfaceC152886uI;
        C38321qM c38321qM;
        InterfaceC152866uG interfaceC152866uG;
        C153126ug c153126ug = (C153126ug) obj;
        C153336v2 c153336v2 = (C153336v2) obj2;
        if (anonymousClass306 != null) {
            anonymousClass306.A7a(0);
        }
        Integer num = null;
        if (c153126ug != null) {
            num = Integer.valueOf(c153126ug.A01());
        }
        if (num != null) {
            int intValue = num.intValue();
            for (int i = 0; i < intValue; i++) {
                if (c153126ug != null) {
                    IM8 im8 = (IM8) c153126ug.A02(i);
                    if (im8 != null && (c38321qM = im8.A02) != null && (interfaceC152866uG = this.A01) != null) {
                        if (c153336v2 != null) {
                            int i2 = c153336v2.A00;
                            if (Integer.valueOf(i2) != null) {
                                interfaceC152866uG.AAn(c38321qM, (i2 * 3) + i);
                            }
                        }
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                    IM8 im82 = (IM8) c153126ug.A02(i);
                    if (im82 != null && (reel = im82.A03) != null && (interfaceC152886uI = this.A02) != null) {
                        if (c153336v2 != null) {
                            int i3 = c153336v2.A00;
                            if (Integer.valueOf(i3) != null) {
                                interfaceC152886uI.AAo(reel, (i3 * 3) + i);
                            }
                        }
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                }
            }
            return;
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    public HFU(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C53Q c53q, C38N c38n, JHJ jhj, C38U c38u, String str, String str2, boolean z, boolean z2) {
        this.A06 = userSession;
        this.A08 = c38n;
        this.A07 = c53q;
        this.A09 = jhj;
        this.A0A = c38u;
        this.A05 = interfaceC11380iw;
        this.A0B = str;
        this.A0C = str2;
        this.A0E = z;
        this.A0D = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [X.HJ3, android.view.View, android.view.ViewGroup, com.instagram.common.ui.base.IgFrameLayout] */
    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A0G = AbstractC25231BEo.A0G(viewGroup, -1102109932);
        Context A0L = AbstractC166997dE.A0L(viewGroup);
        RunnableC152986uS runnableC152986uS = this.A0F;
        View inflate = LayoutInflater.from(A0L).inflate(R.layout.grid_row_container, viewGroup, false);
        C14360o3.A0C(inflate, AbstractC111324zv.A00(4));
        ViewGroup viewGroup2 = (ViewGroup) inflate;
        C38440GvN c38440GvN = new C38440GvN(viewGroup2);
        viewGroup2.setId(R.id.media_set_row_content_identifier);
        int i2 = 0;
        while (true) {
            boolean z = true;
            do {
                ?? igFrameLayout = new IgFrameLayout(A0L, null, 0);
                View inflate2 = View.inflate(A0L, R.layout.profile_grid_item_view, igFrameLayout);
                C14360o3.A0C(inflate2, AbstractC111324zv.A00(48));
                igFrameLayout.A00 = (IgMultiImageButton) inflate2.findViewById(R.id.image_button);
                igFrameLayout.A01 = (SpinnerImageView) inflate2.findViewById(R.id.spinner);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
                if (z) {
                    layoutParams.setMarginEnd(A0L.getResources().getDimensionPixelSize(R.dimen.photo_grid_spacing));
                }
                igFrameLayout.setLayoutParams(layoutParams);
                if (runnableC152986uS != null) {
                    igFrameLayout.A00.setCoordinator(runnableC152986uS);
                }
                c38440GvN.A01[i2] = igFrameLayout;
                viewGroup2.addView(igFrameLayout);
                i2++;
                if (i2 < 3) {
                    z = false;
                } else {
                    viewGroup2.setTag(c38440GvN);
                    C0f9.A0A(871635694, A0G);
                    return viewGroup2;
                }
            } while (i2 >= 2);
        }
    }
}
