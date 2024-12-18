package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import com.instagram.model.mediasize.GifUrlImpl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerMediaFrameLayout;
import java.util.List;

/* renamed from: X.77b, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1579277b implements C7QC {
    public boolean A00;
    public AnonymousClass988 A01;
    public Integer A02;
    public InterfaceC08830cm A03;
    public final InterfaceC11380iw A04;
    public final UserSession A05;
    public final C7ZZ A06;
    public final C162907Rb A07;
    public final C137096In A08;
    public final C7DK A09;
    public final boolean A0A;
    public final boolean A0B;

    private C74P A00(View view, ImageUrl imageUrl, float f, float f2) {
        C74V A00;
        if (imageUrl != null && f > 0.0f) {
            GifUrlImpl gifUrlImpl = new GifUrlImpl(imageUrl.getUrl(), f, f2);
            float min = Math.min(f, f2);
            Context context = view.getContext();
            UserSession userSession = this.A05;
            float f3 = f / f2;
            int i = (int) min;
            float f4 = i;
            if (f3 < 1.0f) {
                A00 = C74U.A00(f3, (int) (f4 * f3), i, -1);
            } else {
                A00 = C74U.A00(f3, i, (int) (f4 / f3), -1);
            }
            return new C74P(context, userSession, A00, gifUrlImpl, gifUrlImpl, C05F.A00, "", 1.0f, context.getColor(AbstractC53242c7.A0H(context, R.attr.stickerLoadingStartColor)), context.getColor(AbstractC53242c7.A0H(context, R.attr.stickerLoadingEndColor)), true);
        }
        return null;
    }

    private void A01(TextView textView) {
        Integer num = this.A02;
        if (this.A0B && num != null) {
            textView.setTextColor(num.intValue());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x00b1, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r16.A05, 36321202687517905L) != false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A02(X.InterfaceC11380iw r14, com.instagram.common.typedurl.ImageUrl r15, X.C1579277b r16, X.C158737Aj r17, com.instagram.feed.widget.IgProgressImageView r18, com.instagram.model.direct.messageid.DirectMessageIdentifier r19, boolean r20, boolean r21, boolean r22) {
        /*
            r6 = r19
            X.2EY r1 = r6.A01
            X.2EY r0 = X.C2EY.A0J
            r5 = 0
            r4 = r18
            r8 = r16
            if (r1 == r0) goto Lf
            if (r22 == 0) goto La2
        Lf:
            X.988 r0 = r8.A01
            X.0do r0 = r0.A0N
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto La2
        L1f:
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r4.getIgImageView()
            android.graphics.drawable.Drawable r1 = r0.getDrawable()
            boolean r0 = r1 instanceof X.C74P
            if (r0 == 0) goto L37
            X.74P r1 = (X.C74P) r1
            java.lang.String r1 = r1.A0k
            java.lang.String r0 = r6.A00
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L8d
        L37:
            r2 = r17
            java.lang.Integer r0 = r2.A07
            if (r0 == 0) goto L9f
            android.content.Context r1 = r4.getContext()
            int r0 = r0.intValue()
            float r0 = X.AbstractC13880nE.A04(r1, r0)
            int r3 = (int) r0
        L4a:
            java.lang.Integer r0 = r2.A04
            if (r0 == 0) goto L9c
            android.content.Context r1 = r4.getContext()
            int r0 = r0.intValue()
            float r0 = X.AbstractC13880nE.A04(r1, r0)
            int r2 = (int) r0
        L5b:
            android.content.Context r9 = r4.getContext()
            com.instagram.common.session.UserSession r10 = r8.A05
            java.lang.String r12 = r15.getUrl()
            r11 = 0
            java.lang.String r14 = r6.A00
            X.C14360o3.A0B(r9, r5)
            r1 = 1
            X.C14360o3.A0B(r10, r1)
            r0 = 2
            X.C14360o3.A0B(r12, r0)
            r18 = r20
            r13 = r11
            r15 = r11
            r21 = r1
            r22 = r5
            r17 = r3
            r19 = r1
            r20 = r5
            r16 = r2
            android.graphics.drawable.Drawable r0 = X.C74N.A01(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r4.setEnableProgressBar(r5)
            r4.setImageDrawable(r0)
        L8d:
            android.content.Context r1 = r4.getContext()
            r0 = 2131958749(0x7f131bdd, float:1.9554119E38)
            java.lang.String r0 = r1.getString(r0)
            r4.setContentDescription(r0)
            return
        L9c:
            r2 = 330(0x14a, float:4.62E-43)
            goto L5b
        L9f:
            r3 = 330(0x14a, float:4.62E-43)
            goto L4a
        La2:
            if (r21 == 0) goto Lb5
            com.instagram.common.session.UserSession r3 = r8.A05
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36321202687517905(0x8109f1000124d1, double:3.033013061105848E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto Lb5
            goto L1f
        Lb5:
            r4.setUrl(r15, r14)
            goto L8d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1579277b.A02(X.0iw, com.instagram.common.typedurl.ImageUrl, X.77b, X.7Aj, com.instagram.feed.widget.IgProgressImageView, com.instagram.model.direct.messageid.DirectMessageIdentifier, boolean, boolean, boolean):void");
    }

    private void A03(final InterfaceC11380iw interfaceC11380iw, AnonymousClass791 anonymousClass791, C7ZZ c7zz, AnonymousClass988 anonymousClass988, C1579477e c1579477e, C158737Aj c158737Aj, DirectMessageIdentifier directMessageIdentifier, ImageInfo imageInfo, String str, boolean z, boolean z2, boolean z3, final boolean z4, final boolean z5) {
        float max;
        int i;
        C74P A00;
        Drawable drawable;
        int i2;
        int i3;
        MediaFrameLayout mediaFrameLayout = (MediaFrameLayout) c1579477e.A0G.A01();
        View findViewById = mediaFrameLayout.findViewById(R.id.horizontal_separate_line);
        int i4 = 0;
        if (findViewById != null) {
            if (!z4) {
                i4 = 4;
            }
            findViewById.setVisibility(i4);
        }
        C1576976d A03 = c1579477e.A03();
        final IgProgressImageView igProgressImageView = A03.A04;
        final CircularImageView circularImageView = A03.A00;
        final IgProgressImageView igProgressImageView2 = A03.A05;
        igProgressImageView.setVisibility(8);
        circularImageView.setVisibility(8);
        igProgressImageView2.setVisibility(8);
        View BKF = c1579477e.BKF();
        ViewGroup.LayoutParams layoutParams = BKF.getLayoutParams();
        final ViewGroup.LayoutParams layoutParams2 = mediaFrameLayout.getLayoutParams();
        if (layoutParams != null && layoutParams2 != null) {
            if (Boolean.TRUE.equals(c158737Aj.A01)) {
                layoutParams.width = -2;
                Integer num = c158737Aj.A07;
                if (num != null) {
                    layoutParams2.width = (int) AbstractC13880nE.A04(mediaFrameLayout.getContext(), num.intValue());
                }
                Integer num2 = c158737Aj.A04;
                if (num2 != null) {
                    i3 = (int) AbstractC13880nE.A04(mediaFrameLayout.getContext(), num2.intValue());
                }
            } else {
                layoutParams2.width = layoutParams.width;
                i3 = layoutParams.height;
            }
            layoutParams2.height = i3;
        }
        if (z4) {
            RoundedCornerMediaFrameLayout roundedCornerMediaFrameLayout = c1579477e.A03().A06;
            roundedCornerMediaFrameLayout.getLayoutParams().width = -1;
            if (roundedCornerMediaFrameLayout.getLayoutParams() instanceof LinearLayout.LayoutParams) {
                ((LinearLayout.LayoutParams) roundedCornerMediaFrameLayout.getLayoutParams()).weight = 1.0f;
            }
            max = -1.0f;
        } else {
            Float f = c158737Aj.A02;
            float f2 = 1.91f;
            if (f != null) {
                f2 = Math.min(1.91f, f.floatValue());
            }
            max = Math.max(0.8f, f2);
        }
        mediaFrameLayout.A00 = max;
        ImageUrl imageUrl = c158737Aj.A00;
        if (imageInfo != null && ((Boolean) anonymousClass988.A0w.getValue()).booleanValue()) {
            ImageUrl A04 = AbstractC40161tk.A04(imageInfo, C05F.A00, layoutParams2.width);
            if (A04 != null) {
                imageUrl = A04;
            }
        }
        if (!AbstractC81033jX.A03(imageUrl)) {
            if (z4) {
                circularImageView.setVisibility(0);
            } else if (z5) {
                igProgressImageView2.setVisibility(0);
                AMo.A06(igProgressImageView2, layoutParams2.width);
            } else {
                igProgressImageView.setVisibility(0);
                igProgressImageView.setAspectRatio(max);
                C2EY c2ey = directMessageIdentifier.A01;
                if ((c2ey == C2EY.A1x || c2ey == C2EY.A1u || c2ey == C2EY.A1G) && ((Boolean) anonymousClass988.A0j.getValue()).booleanValue()) {
                    C162247Oj c162247Oj = anonymousClass791.A04;
                    Context context = igProgressImageView.getContext();
                    c162247Oj.A02(context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_stroke)), 2.0f, false);
                    anonymousClass791.A03 = false;
                }
                igProgressImageView.setPostProcessor(anonymousClass791);
            }
            String url = imageUrl.getUrl();
            if (!URLUtil.isContentUrl(url) && !URLUtil.isFileUrl(url) && !A06(directMessageIdentifier.A01, Boolean.valueOf(z3))) {
                if (z && url.contains(".webp")) {
                    if (z4) {
                        drawable = circularImageView.getDrawable();
                    } else {
                        drawable = igProgressImageView.getIgImageView().getDrawable();
                    }
                    if (!(drawable instanceof C74P)) {
                        Context context2 = BKF.getContext();
                        UserSession userSession = this.A05;
                        Integer num3 = c158737Aj.A07;
                        int i5 = 124;
                        if (num3 != null) {
                            i2 = num3.intValue();
                        } else {
                            i2 = 124;
                        }
                        Integer num4 = c158737Aj.A04;
                        if (num4 != null) {
                            i5 = num4.intValue();
                        }
                        A00 = AbstractC34110F3m.A00(context2, userSession, str, url, i2, i5);
                        if (!z4) {
                            igProgressImageView.setEnableProgressBar(false);
                            igProgressImageView.setImageDrawable(A00);
                        }
                        circularImageView.setImageDrawable(A00);
                    }
                } else {
                    String str2 = c158737Aj.A08;
                    if (str2 != null && str2.contains("webp")) {
                        if (z4) {
                            if (!(circularImageView.getDrawable() instanceof C74P)) {
                                circularImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                A00 = A00(circularImageView, imageUrl, imageUrl.getWidth(), imageUrl.getHeight());
                                circularImageView.setImageDrawable(A00);
                            }
                        } else {
                            if (z5) {
                                igProgressImageView = igProgressImageView2;
                            }
                            if (!(igProgressImageView.getIgImageView().getDrawable() instanceof C74P)) {
                                igProgressImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                igProgressImageView.setImageDrawable(A00(igProgressImageView, imageUrl, imageUrl.getWidth(), imageUrl.getHeight()));
                                igProgressImageView.setEnableProgressBar(false);
                            }
                        }
                    } else if (z4) {
                        circularImageView.setUrl(imageUrl, interfaceC11380iw);
                    } else {
                        UserSession userSession2 = this.A05;
                        if (z5) {
                            igProgressImageView2.setUrl(userSession2, imageUrl, interfaceC11380iw);
                        } else {
                            igProgressImageView.setUrl(userSession2, imageUrl, interfaceC11380iw);
                        }
                    }
                }
            } else if (A06(directMessageIdentifier.A01, Boolean.valueOf(z3))) {
                boolean A09 = LLT.A09(url);
                circularImageView.setVisibility(8);
                igProgressImageView2.setVisibility(8);
                if (A09) {
                    igProgressImageView.setVisibility(0);
                    c1579477e.A00 = ((InterfaceC165027Zr) c7zz).ChN(new C49057Lmj(interfaceC11380iw, this, c1579477e, c158737Aj, igProgressImageView, directMessageIdentifier, z2), url);
                } else {
                    igProgressImageView.setVisibility(0);
                    A02(interfaceC11380iw, imageUrl, this, c158737Aj, igProgressImageView, directMessageIdentifier, false, z2, z3);
                }
            } else {
                C137096In c137096In = this.A08;
                String A002 = c137096In.A00(url);
                if (A002 != null) {
                    if (z4) {
                        igProgressImageView.setVisibility(8);
                        igProgressImageView2.setVisibility(8);
                        circularImageView.setVisibility(0);
                        circularImageView.setUrl(new SimpleImageUrl(A002), interfaceC11380iw);
                    } else if (z5) {
                        igProgressImageView.setVisibility(8);
                        circularImageView.setVisibility(8);
                        igProgressImageView2.setVisibility(0);
                        igProgressImageView2.setUrl(new SimpleImageUrl(A002), interfaceC11380iw);
                        AMo.A06(igProgressImageView2, layoutParams2.width);
                    } else {
                        circularImageView.setVisibility(8);
                        igProgressImageView2.setVisibility(8);
                        igProgressImageView.setVisibility(0);
                        igProgressImageView.setUrl(new SimpleImageUrl(A002), interfaceC11380iw);
                    }
                } else if (!c137096In.A02(url)) {
                    c137096In.A01(url);
                    i = 0;
                    c7zz.ChZ(new InterfaceC50432MOm() { // from class: X.Lmv
                        @Override // X.InterfaceC50432MOm
                        public final void D6U(Object obj) {
                            boolean z6 = z4;
                            IgProgressImageView igProgressImageView3 = igProgressImageView;
                            IgProgressImageView igProgressImageView4 = igProgressImageView2;
                            CircularImageView circularImageView2 = circularImageView;
                            InterfaceC11380iw interfaceC11380iw2 = interfaceC11380iw;
                            boolean z7 = z5;
                            ViewGroup.LayoutParams layoutParams3 = layoutParams2;
                            if (z6) {
                                igProgressImageView3.setVisibility(8);
                                igProgressImageView4.setVisibility(8);
                                circularImageView2.setVisibility(0);
                                AbstractC25235BEs.A1I(interfaceC11380iw2, circularImageView2, (String) obj);
                                return;
                            }
                            if (z7) {
                                igProgressImageView3.setVisibility(8);
                                circularImageView2.setVisibility(8);
                                igProgressImageView4.setVisibility(0);
                                igProgressImageView4.setUrl(AbstractC25225BEi.A0t((String) obj), interfaceC11380iw2);
                                AMo.A06(igProgressImageView4, layoutParams3.width);
                                return;
                            }
                            circularImageView2.setVisibility(8);
                            igProgressImageView4.setVisibility(8);
                            igProgressImageView3.setVisibility(0);
                            igProgressImageView3.setUrl(AbstractC25225BEi.A0t((String) obj), interfaceC11380iw2);
                        }
                    }, url);
                }
            }
            i = 0;
        } else {
            i = 0;
            circularImageView.setVisibility(8);
            igProgressImageView.setVisibility(8);
            igProgressImageView2.setVisibility(8);
        }
        Integer num5 = c158737Aj.A03;
        InterfaceC56392iX interfaceC56392iX = A03.A03;
        if (num5 != null) {
            interfaceC56392iX.setVisibility(i);
            ((ImageView) A03.A07.getValue()).setImageResource(num5.intValue());
        } else {
            interfaceC56392iX.setVisibility(8);
        }
    }

    private void A05(AbstractC1576876c abstractC1576876c, C7QY c7qy) {
        String str;
        C7DK c7dk = this.A09;
        if (c7dk != null) {
            IgImageView igImageView = abstractC1576876c.A00;
            C9C3 c9c3 = c7qy.A05;
            if (c9c3 != null && (str = c9c3.A01) != null && (!c7qy.A0g || str.matches("^https://p.scdn.co/mp3-preview/.*$"))) {
                LKJ A00 = LKJ.A0C.A00(igImageView);
                igImageView.setVisibility(0);
                DirectMessageIdentifier directMessageIdentifier = c7qy.A0L;
                float f = 0.0f;
                if (((C72495Xf8) c7dk.A0C.A01(directMessageIdentifier)) != null) {
                    f = r6.A00 / r6.A01;
                }
                A00.A01.cancel();
                LKJ.A01(A00, f);
                if (c7dk.A0D(directMessageIdentifier)) {
                    A00.A04();
                } else {
                    A00.A03();
                }
                C7IM c7im = c7qy.A0C.A03;
                C14360o3.A0B(c7im, 0);
                int[] iArr = c7im.A06.A0B;
                float dimension = A00.A06.getResources().getDimension(R.dimen.afi_indicator_arrow_margin_top);
                int length = iArr.length;
                ShapeDrawable shapeDrawable = A00.A07;
                if (length > 1) {
                    AbstractC148406mA.A01(null, Paint.Cap.ROUND, Paint.Style.STROKE, shapeDrawable, shapeDrawable.getShape(), iArr, new C7F8(r6).A00(), dimension);
                    A00.A02 = true;
                } else {
                    AbstractC148406mA.A02(Paint.Style.STROKE, shapeDrawable, shapeDrawable.getShape(), dimension, iArr[0]);
                    A00.A02 = false;
                }
                C0fQ.A00(new LP3(this, abstractC1576876c, c7qy), igImageView);
                c7dk.A08(abstractC1576876c, directMessageIdentifier, null);
                return;
            }
            igImageView.setVisibility(8);
        }
    }

    public static boolean A06(C2EY c2ey, Boolean bool) {
        if (c2ey != C2EY.A0O && c2ey != C2EY.A0J) {
            if (c2ey == C2EY.A0m && bool.booleanValue()) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // X.C7QC
    /* renamed from: A07, reason: merged with bridge method [inline-methods] */
    public final C1579477e ANU(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        boolean booleanValue = ((Boolean) this.A03.get()).booleanValue();
        int i = R.layout.direct_generic_xma_message;
        if (booleanValue) {
            i = R.layout.direct_generic_xma_message_optimized;
        }
        C1579477e c1579477e = new C1579477e(layoutInflater.inflate(i, viewGroup, false), booleanValue);
        this.A07.A00(c1579477e);
        return c1579477e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01d5  */
    /* JADX WARN: Type inference failed for: r13v0, types: [X.77b] */
    /* JADX WARN: Type inference failed for: r6v8, types: [com.instagram.common.ui.widget.imageview.IgImageView, android.view.View] */
    /* JADX WARN: Type inference failed for: r6v9, types: [com.instagram.common.ui.widget.imageview.RoundedCornerImageView, android.view.View] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A08(android.content.Context r14, X.InterfaceC11380iw r15, X.C1579477e r16, X.C7QY r17) {
        /*
            Method dump skipped, instructions count: 724
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1579277b.A08(android.content.Context, X.0iw, X.77e, X.7QY):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x02cf, code lost:
    
        if (r0.isEmpty() != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x02d7, code lost:
    
        if (r7 != false) goto L110;
     */
    /* JADX WARN: Type inference failed for: r4v23, types: [X.7Ze, X.7ZZ] */
    @Override // X.C7QC
    /* renamed from: A09, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ADy(X.C1579477e r49, final X.C7QY r50) {
        /*
            Method dump skipped, instructions count: 2922
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1579277b.ADy(X.77e, X.7QY):void");
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void F91(C7QD c7qd) {
        IgdsButton igdsButton;
        C57112jm A00;
        C1579477e c1579477e = (C1579477e) c7qd;
        c1579477e.A05 = null;
        this.A07.A01(c1579477e);
        C7DK c7dk = this.A09;
        if (c7dk != null) {
            c7dk.A06(c1579477e.A01());
            c7dk.A06(c1579477e.A02());
        }
        c1579477e.A03().A04.A04();
        c1579477e.A0A.setVisibility(8);
        CircularImageView circularImageView = c1579477e.A02().A03;
        circularImageView.setBackground(null);
        circularImageView.setPadding(0, 0, 0, 0);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) circularImageView.getLayoutParams();
        if (marginLayoutParams != null) {
            marginLayoutParams.setMargins(0, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
        FGC fgc = c1579477e.A03;
        if (fgc != null && (A00 = AbstractC58982mw.A00((igdsButton = fgc.A00))) != null) {
            A00.A04(igdsButton);
        }
        C1576776b c1576776b = c1579477e.A02;
        if (c1576776b != null) {
            L7B l7b = c1576776b.A00;
            if (l7b != null) {
                l7b.A00();
            }
            c1576776b.A00 = null;
        }
        C47349Kvy c47349Kvy = c1579477e.A00;
        if (c47349Kvy != null) {
            c47349Kvy.A00.set(true);
        }
        c1579477e.A00 = null;
    }

    public C1579277b(InterfaceC11380iw interfaceC11380iw, final UserSession userSession, C7ZZ c7zz, AnonymousClass988 anonymousClass988, C7DK c7dk, List list, boolean z, boolean z2) {
        this.A05 = userSession;
        this.A04 = interfaceC11380iw;
        this.A07 = new C162907Rb(list);
        this.A06 = c7zz;
        this.A09 = c7dk;
        this.A01 = anonymousClass988;
        this.A08 = AbstractC137166Iv.A00(userSession);
        this.A03 = new InterfaceC08830cm() { // from class: X.77c
            /* JADX WARN: Code restructure failed: missing block: B:4:0x0014, code lost:
            
                if (X.C18U.A06(X.C06090Tz.A05, r3, 36319098154064828L) == false) goto L6;
             */
            @Override // X.InterfaceC08830cm
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object get() {
                /*
                    r4 = this;
                    com.instagram.common.session.UserSession r3 = com.instagram.common.session.UserSession.this
                    boolean r0 = X.C11T.A08()
                    if (r0 != 0) goto L16
                    X.0Tz r2 = X.C06090Tz.A05
                    r0 = 36319098154064828(0x81080700091bbc, double:3.031682145675846E-306)
                    boolean r1 = X.C18U.A06(r2, r3, r0)
                    r0 = 1
                    if (r1 != 0) goto L17
                L16:
                    r0 = 0
                L17:
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1579377c.get():java.lang.Object");
            }
        };
        this.A0A = z;
        this.A0B = z2;
    }

    private void A04(IgImageView igImageView, List list, int i, int i2, int i3) {
        int i4;
        if (!list.isEmpty()) {
            Context context = igImageView.getContext();
            if (i > list.size()) {
                i4 = i - Math.min(list.size(), 3);
            } else {
                i4 = 0;
            }
            igImageView.setVisibility(0);
            L9I l9i = new L9I(context, this.A04.getModuleName(), list, i3);
            l9i.A0B = true;
            l9i.A0F = false;
            l9i.A07 = C05F.A00;
            l9i.A00 = 0.3f;
            l9i.A01(6);
            l9i.A0G = true;
            l9i.A02 = i4;
            l9i.A05 = Integer.valueOf(context.getColor(AbstractC53242c7.A07(context)));
            l9i.A08 = Integer.valueOf(i2);
            l9i.A01 = 3;
            l9i.A04 = Integer.valueOf(context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_stroke)));
            l9i.A0A = true;
            igImageView.setImageDrawable(l9i.A00());
        }
    }
}
