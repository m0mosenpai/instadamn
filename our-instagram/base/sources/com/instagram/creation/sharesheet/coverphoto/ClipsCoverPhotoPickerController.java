package com.instagram.creation.sharesheet.coverphoto;

import X.AbstractC09440dt;
import X.AbstractC13880nE;
import X.AbstractC25226BEj;
import X.AbstractC25228BEl;
import X.AbstractC43593JPy;
import X.AbstractC52142N5r;
import X.AbstractC53937NtA;
import X.AbstractC59962oe;
import X.AbstractC60592pi;
import X.C00O;
import X.C06090Tz;
import X.C07X;
import X.C11T;
import X.C14360o3;
import X.C18U;
import X.C47Z;
import X.C50743Max;
import X.C50982Mfp;
import X.C51012MgJ;
import X.C51758Mth;
import X.C55186Odr;
import X.C57525Pfz;
import X.C57749Pjc;
import X.InterfaceC58130Ppt;
import X.InterfaceC58280PsY;
import X.MSW;
import X.MWT;
import X.NXZ;
import X.O7Z;
import X.OS6;
import X.P1J;
import X.PMZ;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.io.File;

/* loaded from: classes9.dex */
public final class ClipsCoverPhotoPickerController extends AbstractC60592pi implements InterfaceC58130Ppt {
    public C50743Max A00;
    public InterfaceC58280PsY A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final Context A06;
    public final C07X A07;
    public final AbstractC59962oe A08;
    public final UserSession A09;
    public final AbstractC52142N5r A0A;
    public final C51012MgJ A0B;
    public final C47Z A0C;
    public final C50982Mfp A0D;
    public final String A0E;
    public final boolean A0F;
    public final boolean A0G;
    public View addFromGalleryButton;
    public View addTextView;
    public FrameLayout coverPhotoContainer;
    public FrameLayout coverPhotoContainerVideoPreview;
    public IgImageView currentCoverPhotoImage;
    public LinearLayout filmStripFramesContainer;
    public View playCountContainer;
    public SeekBar seekBar;
    public IgImageView textEditingImageView;

    public ClipsCoverPhotoPickerController(Context context, C07X c07x, AbstractC59962oe abstractC59962oe, UserSession userSession, AbstractC52142N5r abstractC52142N5r, C51012MgJ c51012MgJ, C47Z c47z, C50982Mfp c50982Mfp, String str, boolean z, boolean z2) {
        C14360o3.A0B(userSession, 2);
        this.A06 = context;
        this.A09 = userSession;
        this.A0A = abstractC52142N5r;
        this.A0D = c50982Mfp;
        this.A0B = c51012MgJ;
        this.A07 = c07x;
        this.A0G = z;
        this.A08 = abstractC59962oe;
        this.A0C = c47z;
        this.A0E = str;
        this.A0F = z2;
        this.A03 = AbstractC13880nE.A0A(context) / 2;
        this.A02 = MSW.A02(AbstractC13880nE.A0A(context) / 2, 0.5625f);
        this.A04 = context.getResources().getDimensionPixelOffset(R.dimen.activation_card_icon_container_width);
        Context context2 = this.A06;
        Resources resources = context2.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.audio_page_audio_filter_tooltip_vertical_offset);
        int A07 = AbstractC13880nE.A07(context2) - (resources.getDimensionPixelOffset(R.dimen.abc_edit_text_inset_top_material) * 2);
        this.A05 = A07 / Math.round(A07 / dimensionPixelOffset);
        AbstractC43593JPy.A1E(c07x, c50982Mfp.A09, new C57749Pjc(this, 3), 23);
    }

    @Override // X.InterfaceC58130Ppt
    public final void DoA() {
    }

    @Override // X.InterfaceC58130Ppt
    public final void Dp1() {
        A01(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0090, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r32.A09, 36330398212440927L) == false) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01ed  */
    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r33, android.os.Bundle r34) {
        /*
            Method dump skipped, instructions count: 658
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.sharesheet.coverphoto.ClipsCoverPhotoPickerController.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(com.instagram.creation.sharesheet.coverphoto.ClipsCoverPhotoPickerController r3, X.AbstractC53540Nm7 r4) {
        /*
            boolean r2 = r4 instanceof X.NXX
            if (r2 == 0) goto L28
            r0 = r4
            X.NXX r0 = (X.NXX) r0
            java.lang.String r0 = r0.A00
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r3.currentCoverPhotoImage
            if (r1 == 0) goto L39
            android.net.Uri r0 = X.AbstractC08820cl.A03(r0)
            r1.setImageURI(r0)
            r0 = 1
        L15:
            r3.A01(r0)
        L18:
            r1 = 1056964608(0x3f000000, float:0.5)
            if (r2 != 0) goto L20
            boolean r0 = r4 instanceof X.NXZ
            if (r0 == 0) goto L27
        L20:
            android.widget.LinearLayout r0 = r3.filmStripFramesContainer
            if (r0 == 0) goto L36
            r0.setAlpha(r1)
        L27:
            return
        L28:
            boolean r0 = r4 instanceof X.NXZ
            if (r0 == 0) goto L18
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r3.currentCoverPhotoImage
            if (r1 == 0) goto L39
            r0 = 0
            r1.setImageBitmap(r0)
            r0 = 0
            goto L15
        L36:
            java.lang.String r0 = "filmStripFramesContainer"
            goto L3b
        L39:
            java.lang.String r0 = "currentCoverPhotoImage"
        L3b:
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.sharesheet.coverphoto.ClipsCoverPhotoPickerController.A00(com.instagram.creation.sharesheet.coverphoto.ClipsCoverPhotoPickerController, X.Nm7):void");
    }

    private final void A01(boolean z) {
        String str;
        if (this.A0F) {
            View view = this.addTextView;
            if (z) {
                if (view != null) {
                    if (view.getVisibility() == 8) {
                        if (C18U.A06(C06090Tz.A05, this.A09, 36330398212440927L)) {
                            View view2 = this.addTextView;
                            if (view2 != null) {
                                view2.setVisibility(0);
                                IgImageView igImageView = this.textEditingImageView;
                                if (igImageView != null) {
                                    igImageView.setVisibility(0);
                                    View view3 = this.playCountContainer;
                                    if (view3 != null) {
                                        view3.setVisibility(8);
                                        return;
                                    }
                                    str = "playCountContainer";
                                }
                                str = "textEditingImageView";
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                str = "addTextView";
            } else {
                if (view != null) {
                    if (view.getVisibility() != 0) {
                        return;
                    }
                    View view4 = this.addTextView;
                    if (view4 != null) {
                        view4.setVisibility(8);
                        IgImageView igImageView2 = this.textEditingImageView;
                        if (igImageView2 != null) {
                            igImageView2.setVisibility(8);
                            IgImageView igImageView3 = this.textEditingImageView;
                            if (igImageView3 != null) {
                                igImageView3.setImageBitmap(null);
                                this.A0B.A00.Egh(new MWT());
                                View view5 = this.playCountContainer;
                                if (view5 != null) {
                                    view5.setVisibility(0);
                                    return;
                                }
                                str = "playCountContainer";
                            }
                        }
                        str = "textEditingImageView";
                    }
                }
                str = "addTextView";
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    public final void A02() {
        C51012MgJ c51012MgJ = this.A0B;
        Bitmap bitmap = (Bitmap) ((MWT) c51012MgJ.A01.getValue()).A01;
        if (bitmap != null) {
            C47Z c47z = this.A0C;
            if (c47z != null) {
                c47z.A5M = true;
            }
            IgImageView igImageView = this.textEditingImageView;
            if (igImageView != null) {
                igImageView.setImageBitmap(bitmap);
                IgImageView igImageView2 = this.textEditingImageView;
                if (igImageView2 != null) {
                    igImageView2.setVisibility(0);
                    c51012MgJ.A01(OS6.A00);
                    return;
                }
            }
            C14360o3.A0F("textEditingImageView");
            throw C00O.createAndThrow();
        }
    }

    public final void A03(boolean z) {
        C50982Mfp c50982Mfp = this.A0D;
        C51758Mth c51758Mth = (C51758Mth) c50982Mfp.A09.A02();
        Object obj = null;
        if (c51758Mth != null) {
            obj = c51758Mth.A00;
        }
        float f = 0.5625f;
        if (obj instanceof NXZ) {
            InterfaceC58280PsY interfaceC58280PsY = this.A01;
            if (interfaceC58280PsY == null) {
                C14360o3.A0F("scrubberController");
                throw C00O.createAndThrow();
            }
            C47Z c47z = this.A0C;
            if (c47z != null) {
                f = c47z.A02;
            }
            interfaceC58280PsY.ELc(z, f);
        } else {
            C51012MgJ c51012MgJ = this.A0B;
            if (AbstractC25228BEl.A1X(((MWT) c51012MgJ.A00.getValue()).A02)) {
                Context context = this.A06;
                UserSession userSession = this.A09;
                Bitmap decodeFile = BitmapFactory.decodeFile((String) c50982Mfp.A07.A02());
                Bitmap bitmap = (Bitmap) ((MWT) c51012MgJ.A01.getValue()).A01;
                C47Z c47z2 = this.A0C;
                if (c47z2 != null) {
                    f = c47z2.A02;
                }
                int i = this.A03;
                int i2 = this.A02;
                C55186Odr.A01(context, decodeFile, bitmap, userSession, new P1J(this, 0), (File) AbstractC09440dt.A01(C57525Pfz.A00(this, 26)).getValue(), f, i, i2);
            }
            AbstractC52142N5r abstractC52142N5r = this.A0A;
            abstractC52142N5r.A02();
            AbstractC25226BEj.A1P(abstractC52142N5r);
        }
        O7Z A00 = AbstractC53937NtA.A00(this.A09);
        A00.A01.flowMarkPoint(A00.A00, "COVER_PHOTO_SAVED");
    }

    @Override // X.InterfaceC58130Ppt
    public final void D7v(String str) {
        C11T.A02(new PMZ(this));
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onPause() {
        InterfaceC58280PsY interfaceC58280PsY = this.A01;
        if (interfaceC58280PsY == null) {
            C14360o3.A0F("scrubberController");
            throw C00O.createAndThrow();
        }
        interfaceC58280PsY.onPause();
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onResume() {
        InterfaceC58280PsY interfaceC58280PsY = this.A01;
        if (interfaceC58280PsY == null) {
            C14360o3.A0F("scrubberController");
            throw C00O.createAndThrow();
        }
        interfaceC58280PsY.onResume();
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onDestroyView() {
        ClipsCoverPhotoPickerControllerLifecycleUtil.cleanupReferences(this);
    }
}
