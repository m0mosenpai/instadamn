package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.util.ArrayMap;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.clips.model.LayoutTransform;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.ui.widget.filmstriptimeline.FilmstripTimelineView;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Mj4, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51161Mj4 extends C2UU {
    public int A00;
    public InterfaceC58200Pr6 A01;
    public List A02;
    public InterfaceC16620sF A03;
    public boolean A04;
    public final ArrayMap A05;
    public final ClipsCreationViewModel A06;
    public final C187358Sd A07;
    public final C183298Bb A08;
    public final InterfaceC16820sZ A09;
    public final int A0A;
    public final UserSession A0B;
    public final InterfaceC16820sZ A0C;

    public C51161Mj4(UserSession userSession, ClipsCreationViewModel clipsCreationViewModel, C187358Sd c187358Sd, C183298Bb c183298Bb, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, int i) {
        C14360o3.A0B(userSession, 1);
        this.A0B = userSession;
        this.A08 = c183298Bb;
        this.A06 = clipsCreationViewModel;
        this.A07 = c187358Sd;
        this.A0A = i;
        this.A0C = interfaceC16820sZ;
        this.A09 = interfaceC16820sZ2;
        this.A02 = C16930sl.A00;
        this.A00 = 500;
        this.A05 = new ArrayMap();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0043, code lost:
    
        if (X.C18U.A06(r2, r3, 36318136080996315L) == false) goto L12;
     */
    @Override // X.C2UU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C3OO onCreateViewHolder(android.view.ViewGroup r10, int r11) {
        /*
            r9 = this;
            r3 = 0
            X.C14360o3.A0B(r10, r3)
            if (r11 != r3) goto L1f
            int r0 = X.C3OO.FLAG_ADAPTER_FULLUPDATE
            android.view.LayoutInflater r1 = X.AbstractC25228BEl.A0P(r10)
            r0 = 2131627382(0x7f0e0d76, float:1.8882027E38)
            android.view.View r2 = X.AbstractC25226BEj.A0R(r1, r10, r0, r3)
            int r0 = r9.A0A
            int r1 = r0 / 2
            X.0sZ r0 = r9.A0C
            X.Mkx r3 = new X.Mkx
            r3.<init>(r2, r0, r1)
            return r3
        L1f:
            r8 = 1
            if (r11 != r8) goto L4c
            int r0 = X.C3OO.FLAG_ADAPTER_FULLUPDATE
            android.content.Context r5 = X.AbstractC166997dE.A0L(r10)
            X.Pr6 r4 = r9.A01
            com.instagram.common.session.UserSession r3 = r9.A0B
            X.0Tz r2 = X.C06090Tz.A06
            r0 = 36318136080799705(0x810727000017d9, double:3.031073726669024E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L45
            r0 = 36318136080996315(0x810727000317db, double:3.031073726793361E-306)
            boolean r1 = X.C18U.A06(r2, r3, r0)
            r0 = 1
            if (r1 != 0) goto L46
        L45:
            r0 = 0
        L46:
            X.NIC r3 = new X.NIC
            r3.<init>(r5, r4, r0)
            return r3
        L4c:
            r0 = 2
            if (r11 != r0) goto L7c
            android.content.Context r4 = r10.getContext()
            int r0 = X.AbstractC167017dG.A06(r4)
            int r1 = r0 * 2
            int r2 = r9.A0A
            X.8Bb r0 = r9.A08
            X.8Ba r0 = r0.A00()
            int r0 = r0.A02
            int r0 = r0 * 2
            int r2 = r2 - r0
            int r2 = r2 - r1
            int r0 = X.C3OO.FLAG_ADAPTER_FULLUPDATE
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r4)
            r0 = 2131627500(0x7f0e0dec, float:1.8882266E38)
            android.view.View r1 = X.AbstractC25226BEj.A0R(r1, r10, r0, r3)
            com.instagram.common.session.UserSession r0 = r9.A0B
            X.9Uz r3 = new X.9Uz
            r3.<init>(r1, r0, r2)
            return r3
        L7c:
            int r0 = X.C3OO.FLAG_ADAPTER_FULLUPDATE
            android.view.LayoutInflater r1 = X.AbstractC25228BEl.A0P(r10)
            r0 = 2131627483(0x7f0e0ddb, float:1.8882232E38)
            android.view.View r4 = X.AbstractC25226BEj.A0R(r1, r10, r0, r3)
            X.8Bb r0 = r9.A08
            X.8Ba r7 = r0.A00()
            r5 = 0
            X.O27 r6 = new X.O27
            r6.<init>(r5)
            X.MmU r3 = new X.MmU
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51161Mj4.onCreateViewHolder(android.view.ViewGroup, int):X.3OO");
    }

    @Override // X.C2UU
    public final void onViewRecycled(C3OO c3oo) {
        C211029Uz c211029Uz;
        ValueAnimator valueAnimator;
        C14360o3.A0B(c3oo, 0);
        if ((c3oo instanceof C211029Uz) && (c211029Uz = (C211029Uz) c3oo) != null && (valueAnimator = c211029Uz.A00) != null) {
            valueAnimator.cancel();
        }
    }

    @Override // X.C2UU
    public final void onBindViewHolder(C3OO c3oo, int i) {
        C52423NHt c52423NHt;
        C52426NHw c52426NHw;
        boolean z;
        ViewGroup viewGroup;
        FilmstripTimelineView filmstripTimelineView;
        float f;
        C52424NHu c52424NHu;
        C52425NHv c52425NHv;
        ImageView.ScaleType scaleType;
        boolean z2;
        C14360o3.A0B(c3oo, 0);
        if (c3oo instanceof C211029Uz) {
            C211029Uz c211029Uz = (C211029Uz) c3oo;
            O29 o29 = (O29) AbstractC001800i.A0O(this.A02, i);
            if ((o29 instanceof C52425NHv) && (c52425NHv = (C52425NHv) o29) != null) {
                Context A05 = AbstractC31172DnG.A05(c211029Uz);
                int i2 = ((i - 1) / 2) - 1;
                if (c52425NHv.A03) {
                    C14360o3.A0A(A05);
                    int i3 = this.A08.A00().A02;
                    C14360o3.A0B(A05, 0);
                    int A00 = (C8BW.A00(A05, i3) + (AbstractC167017dG.A06(A05) * 3)) - AbstractC167017dG.A04(A05);
                    int i4 = 0;
                    if (i == 0) {
                        i4 = A00;
                    }
                    if (i != getItemCount() - 1) {
                        A00 = 0;
                    }
                    AbstractC13880nE.A0i(AbstractC31171DnF.A06(c211029Uz), i4, A00);
                    int i5 = c52425NHv.A00;
                    C57766Pjt c57766Pjt = new C57766Pjt(i2, 0, A05, this);
                    c211029Uz.A03 = true;
                    c211029Uz.A02 = c57766Pjt;
                    c211029Uz.A00();
                    c211029Uz.A06.setVisibility(8);
                    InterfaceC09390do interfaceC09390do = c211029Uz.A09;
                    if (((InterfaceC56392iX) interfaceC09390do.getValue()).CGb() == 8) {
                        ((InterfaceC56392iX) interfaceC09390do.getValue()).setVisibility(0);
                        c211029Uz.itemView.post(new Aw2(c211029Uz, i5));
                    }
                    AbstractC13880nE.A0e(AbstractC31171DnF.A06(c211029Uz), 0);
                    AbstractC13880nE.A0V(AbstractC31171DnF.A06(c211029Uz), 0);
                    return;
                }
                int i6 = c52425NHv.A02;
                int i7 = c52425NHv.A01;
                int i8 = c52425NHv.A00;
                boolean z3 = c52425NHv.A04;
                c211029Uz.A03 = z3;
                c211029Uz.A02 = null;
                C14360o3.A07(A05);
                float A04 = AbstractC13880nE.A04(A05, 20);
                RoundedCornerImageView roundedCornerImageView = c211029Uz.A06;
                int i9 = (int) A04;
                AbstractC13880nE.A0g(roundedCornerImageView, i9);
                AbstractC13880nE.A0W(roundedCornerImageView, i9);
                float f2 = A04 / 2.0f;
                AbstractC13880nE.A0e(AbstractC31171DnF.A06(c211029Uz), -((int) (i6 + f2)));
                AbstractC13880nE.A0V(AbstractC31171DnF.A06(c211029Uz), -((int) (f2 + i7)));
                AbstractC13880nE.A0i(AbstractC31171DnF.A06(c211029Uz), i6, i7);
                ((InterfaceC56392iX) c211029Uz.A09.getValue()).setVisibility(8);
                roundedCornerImageView.setVisibility(0);
                Context context = roundedCornerImageView.getContext();
                AbstractC31173DnH.A0z(context, roundedCornerImageView, R.drawable.stacked_timeline_transition_button_background);
                if (i8 <= 0) {
                    AbstractC166997dE.A19(context, roundedCornerImageView, R.drawable.stacked_timeline_transition_empty_state);
                    scaleType = ImageView.ScaleType.CENTER;
                } else {
                    AbstractC166997dE.A19(context, roundedCornerImageView, ((EnumC223059sk) AbstractC22785A3d.A00.get(i8 - 1)).A00);
                    scaleType = ImageView.ScaleType.FIT_CENTER;
                }
                roundedCornerImageView.setScaleType(scaleType);
                roundedCornerImageView.setEnabled(z3);
                ArrayMap arrayMap = this.A05;
                Integer valueOf = Integer.valueOf(i);
                Boolean bool = (Boolean) arrayMap.get(valueOf);
                if (bool != null) {
                    z2 = c52425NHv.A05;
                    if (!bool.equals(Boolean.valueOf(z2)) && c52425NHv.A06) {
                        boolean booleanValue = bool.booleanValue();
                        c211029Uz.itemView.setVisibility(0);
                        ValueAnimator valueAnimator = c211029Uz.A00;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        float f3 = 1.0f;
                        float A01 = AbstractC25230BEn.A01(z2 ? 1 : 0);
                        float[] fArr = new float[2];
                        if (!booleanValue) {
                            f3 = 0.0f;
                        }
                        fArr[0] = f3;
                        fArr[1] = A01;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                        ofFloat.addUpdateListener(new C55236Of8(0, c211029Uz, z2));
                        ofFloat.setDuration(150L);
                        c211029Uz.A00 = ofFloat;
                        ofFloat.start();
                        arrayMap.put(valueOf, Boolean.valueOf(z2));
                        return;
                    }
                }
                z2 = c52425NHv.A05;
                ValueAnimator valueAnimator2 = c211029Uz.A00;
                int i10 = 0;
                if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                    View view = c211029Uz.itemView;
                    if (!z2) {
                        i10 = 8;
                    }
                    view.setVisibility(i10);
                    float f4 = 1.0f;
                    roundedCornerImageView.setAlpha(AbstractC25230BEn.A01(z2 ? 1 : 0));
                    float f5 = 0.8f;
                    if (z2) {
                        f5 = 1.0f;
                    }
                    roundedCornerImageView.setScaleX(f5);
                    if (!z2) {
                        f4 = 0.8f;
                    }
                    roundedCornerImageView.setScaleY(f4);
                }
                arrayMap.put(valueOf, Boolean.valueOf(z2));
                return;
            }
            return;
        }
        if (c3oo instanceof C51369MmU) {
            C51369MmU c51369MmU = (C51369MmU) c3oo;
            O29 o292 = (O29) AbstractC001800i.A0O(this.A02, i);
            int i11 = (i / 2) - 1;
            if (this.A04 && i11 == 0) {
                filmstripTimelineView = c51369MmU.A09;
                f = 0.5f;
            } else {
                filmstripTimelineView = c51369MmU.A09;
                f = 1.0f;
            }
            filmstripTimelineView.setAlpha(f);
            View view2 = c51369MmU.A04;
            int i12 = i11 + 1;
            view2.setContentDescription(AnonymousClass001.A0G(AbstractC31172DnG.A05(c51369MmU).getString(2131955419), ' ', i12));
            filmstripTimelineView.setContentDescription(AnonymousClass001.A0G(AbstractC31172DnG.A05(c51369MmU).getString(2131955504), ' ', i12));
            if (!(o292 instanceof C52424NHu) || (c52424NHu = (C52424NHu) o292) == null) {
                return;
            }
            Context A052 = AbstractC31172DnG.A05(c51369MmU);
            Resources resources = A052.getResources();
            int i13 = R.dimen.abc_button_padding_horizontal_material;
            AbstractC13880nE.A0e(filmstripTimelineView, resources.getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material));
            TextView textView = c51369MmU.A06;
            Resources resources2 = A052.getResources();
            if (!c52424NHu.A02) {
                i13 = R.dimen.abc_edit_text_inset_top_material;
            }
            AbstractC13880nE.A0Y(textView, resources2.getDimensionPixelSize(i13));
            AbstractC13880nE.A0a(textView, AbstractC167017dG.A04(A052));
            InterfaceC115505Kk interfaceC115505Kk = c52424NHu.A00;
            this.A08.A01(interfaceC115505Kk, new DUL(i11, 2, this, A052, c51369MmU, c52424NHu, interfaceC115505Kk));
            long A053 = MSW.A05((C115475Kh) interfaceC115505Kk);
            String A0t = AbstractC31174DnI.A0t(A052, Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(A053)), Long.valueOf((A053 % 1000) / 100), 2131955500);
            C14360o3.A07(A0t);
            textView.setText(A0t);
            int i14 = 0;
            textView.setVisibility(0);
            if (!c52424NHu.A01) {
                i14 = 4;
            }
            view2.setVisibility(i14);
            C0fQ.A00(new ViewOnClickListenerC55405OjG(this, i11, i, 0), view2);
            C8BW.A01(AbstractC31171DnF.A06(c51369MmU)).start();
            return;
        }
        if (c3oo instanceof NIC) {
            NIC nic = (NIC) c3oo;
            O29 o293 = (O29) AbstractC001800i.A0O(this.A02, i);
            LayoutTransform layoutTransform = null;
            if (!(o293 instanceof C52426NHw) || (c52426NHw = (C52426NHw) o293) == null) {
                return;
            }
            boolean z4 = c52426NHw.A0C;
            boolean z5 = c52426NHw.A09;
            int i15 = this.A00;
            boolean z6 = c52426NHw.A0B;
            if (z6) {
                z = false;
            } else {
                z = c52426NHw.A0D;
            }
            boolean z7 = c52426NHw.A0A;
            C50809McW c50809McW = nic.A01;
            c50809McW.setEnableTrim(z4);
            c50809McW.A0M = z5;
            c50809McW.setThumbnailSampleRateMs(i15);
            ViewParent viewParent = null;
            if (z && !z7) {
                ImageView imageView = nic.A00;
                if (imageView == null || imageView.getParent() == null) {
                    c50809McW.addView(imageView);
                }
            } else {
                ImageView imageView2 = nic.A00;
                if (imageView2 != null) {
                    viewParent = imageView2.getParent();
                }
                if ((viewParent instanceof ViewGroup) && (viewGroup = (ViewGroup) viewParent) != null) {
                    viewGroup.removeView(imageView2);
                }
            }
            int i16 = c52426NHw.A04;
            int i17 = c52426NHw.A03;
            int i18 = c52426NHw.A01;
            ClipsCreationViewModel clipsCreationViewModel = this.A06;
            int A0E = (clipsCreationViewModel.A0E() - MSW.A04(clipsCreationViewModel)) + c52426NHw.A02;
            c50809McW.A0H = i16;
            c50809McW.A0G = i17;
            c50809McW.A0C = i18;
            c50809McW.A0D = A0E;
            c50809McW.A08();
            c50809McW.setMinStartTimeMs(AbstractC167017dG.A0K(c52426NHw.A07));
            c50809McW.A0e.A00 = new BigDecimal(c52426NHw.A00).setScale(1, RoundingMode.HALF_UP).floatValue();
            c50809McW.setIsInVideoAdjustMode(z7);
            c50809McW.setTargetBitmapAspectRatio(c52426NHw.A06);
            c50809McW.setFetchBitmapDelegateV2(c52426NHw.A08);
            c50809McW.setIsPhoto(z6);
            C9ZU c9zu = c52426NHw.A05;
            if (c9zu != null) {
                layoutTransform = new LayoutTransform(C05F.A00, c9zu.A02, c9zu.A00, c9zu.A03, -c9zu.A01, 0, 0, false);
            }
            c50809McW.setLayoutTransform(layoutTransform);
            c50809McW.setDimView(false);
            return;
        }
        if (!(c3oo instanceof C51274Mkx)) {
            return;
        }
        C51274Mkx c51274Mkx = (C51274Mkx) c3oo;
        O29 o294 = (O29) AbstractC001800i.A0O(this.A02, i);
        if (!(o294 instanceof C52423NHt) || (c52423NHt = (C52423NHt) o294) == null) {
            return;
        }
        AbstractC13880nE.A0g(AbstractC31171DnF.A06(c51274Mkx), c52423NHt.A00);
        boolean z8 = c52423NHt.A02;
        InterfaceC16820sZ interfaceC16820sZ = this.A09;
        Boolean bool2 = c52423NHt.A01;
        C14360o3.A0B(interfaceC16820sZ, 1);
        if (z8 && bool2 != null) {
            IgLinearLayout igLinearLayout = c51274Mkx.A00;
            igLinearLayout.setVisibility(0);
            ViewOnClickListenerC55460OkF.A00(igLinearLayout, 21, interfaceC16820sZ);
            IgImageView igImageView = c51274Mkx.A01;
            boolean booleanValue2 = bool2.booleanValue();
            int i19 = R.drawable.instagram_volume_pano_outline_16;
            if (booleanValue2) {
                i19 = R.drawable.instagram_volume_none_pano_outline_16;
            }
            igImageView.setImageResource(i19);
            AbstractC13880nE.A0o(igLinearLayout, AbstractC31171DnF.A06(c51274Mkx), R.dimen.abc_edit_text_inset_top_material);
            return;
        }
        c51274Mkx.A00.setVisibility(8);
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(32991567);
        int size = this.A02.size();
        C0f9.A0A(1004981119, A03);
        return size;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        Integer num;
        int i2;
        int A03 = C0f9.A03(45972371);
        O29 o29 = (O29) AbstractC001800i.A0O(this.A02, i);
        if (o29 != null) {
            num = o29.A00;
        } else {
            num = C05F.A00;
        }
        switch (num.intValue()) {
            case 0:
                i2 = 0;
                break;
            case 1:
                i2 = 1;
                break;
            case 2:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        C0f9.A0A(-2101789065, A03);
        return i2;
    }
}
