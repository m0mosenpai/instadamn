package com.instagram.creation.capture.quickcapture.sundial.edit;

import X.AbstractC001800i;
import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC31172DnG;
import X.AbstractC31173DnH;
import X.AbstractC37302Gc3;
import X.AbstractC50524MSc;
import X.AbstractC70163Da;
import X.C00O;
import X.C06090Tz;
import X.C14360o3;
import X.C16930sl;
import X.C185278Js;
import X.C187358Sd;
import X.C18U;
import X.C50865Mdw;
import X.C55982hj;
import X.C56280Oyr;
import X.C56302iJ;
import X.EnumC53256Ngu;
import X.InterfaceC55932he;
import X.InterfaceC57816Pki;
import X.InterfaceC58283Psb;
import X.InterfaceC60602pj;
import X.ViewOnClickListenerC55460OkF;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import java.util.List;

/* loaded from: classes9.dex */
public final class ClipsTimelineBottomSheetViewController implements InterfaceC60602pj, InterfaceC55932he {
    public float A00;
    public float A01;
    public float A02;
    public ViewGroup A03;
    public ViewGroup A04;
    public C55982hj A05;
    public IgTextView A06;
    public InterfaceC58283Psb A07;
    public List A08;
    public boolean A09;
    public boolean A0A;
    public final Context A0B;
    public final ViewGroup A0C;
    public final UserSession A0D;
    public final C185278Js A0E;
    public final C50865Mdw A0F;
    public final C187358Sd A0G;
    public final boolean A0H;
    public final InterfaceC57816Pki A0I;
    public IgTextView bottomSheetCancelButton;
    public ViewGroup bottomSheetContentContainer;
    public IgTextView bottomSheetDoneButton;

    public final void A03(boolean z) {
        A02(this, false);
        ViewGroup viewGroup = this.A04;
        if (viewGroup != null && viewGroup.getVisibility() == 0) {
            A01(this, 0.0f, z);
        }
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void ADK(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void D8S(View view) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnj(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnk(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnl(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onCreate() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onDestroy() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onDestroyView() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStart() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStop() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r0.contains(r5) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.EnumC53256Ngu A00(com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineBottomSheetViewController r6, float r7) {
        /*
            java.util.List r0 = r6.A08
            int r0 = r0.size()
            r1 = 1
            if (r0 != r1) goto L14
            java.util.List r0 = r6.A08
            X.Ngu r5 = X.EnumC53256Ngu.A07
            boolean r0 = r0.contains(r5)
            if (r0 == 0) goto L14
        L13:
            return r5
        L14:
            java.util.List r0 = r6.A08
            int r0 = r0.size()
            if (r0 != r1) goto L27
            java.util.List r0 = r6.A08
            X.Ngu r5 = X.EnumC53256Ngu.A05
            boolean r0 = r0.contains(r5)
            if (r0 == 0) goto L27
            return r5
        L27:
            X.Ngu r5 = X.EnumC53256Ngu.A08
            boolean r4 = r6.A0H
            r3 = 1053961486(0x3ed22d0e, float:0.4105)
            if (r4 == 0) goto L33
            r3 = 1050924810(0x3ea3d70a, float:0.32)
        L33:
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 <= 0) goto L13
            X.Ngu r2 = X.EnumC53256Ngu.A09
            r1 = 1057565232(0x3f092a30, float:0.5358)
            if (r4 == 0) goto L41
            r1 = 1053961486(0x3ed22d0e, float:0.4105)
        L41:
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 < 0) goto L46
            return r2
        L46:
            float r1 = r1 + r3
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r0
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 < 0) goto L13
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineBottomSheetViewController.A00(com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineBottomSheetViewController, float):X.Ngu");
    }

    public static final void A01(ClipsTimelineBottomSheetViewController clipsTimelineBottomSheetViewController, float f, boolean z) {
        C55982hj c55982hj = clipsTimelineBottomSheetViewController.A05;
        if (z) {
            c55982hj.A06 = AbstractC167007dF.A1N((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1)));
            c55982hj.A06(f);
        } else {
            c55982hj.A08(f, true);
        }
    }

    public static final void A02(ClipsTimelineBottomSheetViewController clipsTimelineBottomSheetViewController, boolean z) {
        ViewGroup viewGroup;
        ClipsTimelineBottomSheetView clipsTimelineBottomSheetView;
        if (!clipsTimelineBottomSheetViewController.A09) {
            ViewGroup viewGroup2 = clipsTimelineBottomSheetViewController.A0C;
            if (viewGroup2.findViewById(R.id.stacked_timeline_bottom_sheet) != null) {
                clipsTimelineBottomSheetViewController.A04 = AbstractC31173DnH.A0F(viewGroup2, R.id.stacked_timeline_bottom_sheet);
            } else {
                LayoutInflater from = LayoutInflater.from(clipsTimelineBottomSheetViewController.A0B);
                C14360o3.A07(from);
                View inflate = from.inflate(R.layout.stacked_timeline_bottom_sheet, viewGroup2, false);
                if (inflate instanceof ViewGroup) {
                    viewGroup = (ViewGroup) inflate;
                } else {
                    viewGroup = null;
                }
                clipsTimelineBottomSheetViewController.A04 = viewGroup;
                viewGroup2.addView(viewGroup);
            }
            ViewGroup viewGroup3 = clipsTimelineBottomSheetViewController.A04;
            if ((viewGroup3 instanceof ClipsTimelineBottomSheetView) && (clipsTimelineBottomSheetView = (ClipsTimelineBottomSheetView) viewGroup3) != null) {
                clipsTimelineBottomSheetView.A05 = clipsTimelineBottomSheetViewController.A0I;
            }
            ViewGroup A0F = AbstractC31173DnH.A0F(viewGroup2, R.id.stacked_timeline_bottom_sheet_content_container);
            C14360o3.A0B(A0F, 0);
            clipsTimelineBottomSheetViewController.bottomSheetContentContainer = A0F;
            clipsTimelineBottomSheetViewController.A03 = AbstractC31173DnH.A0F(viewGroup2, R.id.stacked_timeline_bottom_sheet_content_view);
            IgTextView A0X = AbstractC31172DnG.A0X(viewGroup2, R.id.stacked_timeline_bottom_sheet_cancel_button);
            C14360o3.A0B(A0X, 0);
            clipsTimelineBottomSheetViewController.bottomSheetCancelButton = A0X;
            A0X.setMaxLines(1);
            CharSequence text = A0X.getContext().getText(2131954754);
            TextView.BufferType bufferType = TextView.BufferType.NORMAL;
            A0X.setText(text, bufferType);
            ViewOnClickListenerC55460OkF.A00(A0X, 5, clipsTimelineBottomSheetViewController);
            A0X.setVisibility(0);
            IgTextView A0X2 = AbstractC31172DnG.A0X(viewGroup2, R.id.stacked_timeline_bottom_sheet_done_button);
            C14360o3.A0B(A0X2, 0);
            clipsTimelineBottomSheetViewController.bottomSheetDoneButton = A0X2;
            A0X2.setMaxLines(1);
            A0X2.setText(A0X2.getContext().getText(2131961124), bufferType);
            ViewOnClickListenerC55460OkF.A00(A0X2, 6, clipsTimelineBottomSheetViewController);
            A0X2.setVisibility(0);
            clipsTimelineBottomSheetViewController.A06 = AbstractC31172DnG.A0X(viewGroup2, R.id.stacked_timeline_bottom_sheet_title);
            clipsTimelineBottomSheetViewController.A09 = true;
            if (!z) {
                clipsTimelineBottomSheetViewController.A03(false);
            }
        }
    }

    @Override // X.InterfaceC55932he
    public final void Dnm(C55982hj c55982hj) {
        ViewGroup viewGroup;
        float f;
        if (this.A09 && (viewGroup = this.A04) != null) {
            double d = this.A05.A09.A00;
            int i = 0;
            if (d == 0.0d) {
                i = 4;
            }
            viewGroup.setVisibility(i);
            ViewGroup viewGroup2 = this.A0C;
            float A02 = (float) AbstractC70163Da.A02(d, viewGroup2.getHeight());
            int dimensionPixelSize = this.A0B.getResources().getDimensionPixelSize(R.dimen.alert_dialog_button_cell_height);
            int height = (int) ((viewGroup2.getHeight() * d) - dimensionPixelSize);
            EnumC53256Ngu enumC53256Ngu = (EnumC53256Ngu) AbstractC001800i.A0J(this.A08);
            if (enumC53256Ngu != null) {
                float A08 = AbstractC166987dD.A08(viewGroup2);
                if (this.A0H) {
                    f = enumC53256Ngu.A01;
                } else {
                    f = enumC53256Ngu.A00;
                }
                int i2 = (int) ((A08 * f) - dimensionPixelSize);
                if (height < i2) {
                    height = i2;
                }
            }
            C56302iJ c56302iJ = new C56302iJ(-1, height);
            ViewGroup viewGroup3 = this.bottomSheetContentContainer;
            if (viewGroup3 != null) {
                viewGroup3.setLayoutParams(c56302iJ);
                ViewGroup viewGroup4 = this.A04;
                if (viewGroup4 != null) {
                    viewGroup4.setTranslationY((int) A02);
                }
                if (d == 0.0d) {
                    InterfaceC58283Psb interfaceC58283Psb = this.A07;
                    if (interfaceC58283Psb != null) {
                        interfaceC58283Psb.D0G();
                    }
                    this.A0F.A0E();
                    return;
                }
                return;
            }
            C14360o3.A0F("bottomSheetContentContainer");
            throw C00O.createAndThrow();
        }
    }

    @Override // X.InterfaceC60602pj
    public final void onPause() {
        InterfaceC58283Psb interfaceC58283Psb = this.A07;
        if (interfaceC58283Psb != null) {
            interfaceC58283Psb.onPause();
        }
    }

    @Override // X.InterfaceC60602pj
    public final void onResume() {
        InterfaceC58283Psb interfaceC58283Psb = this.A07;
        if (interfaceC58283Psb != null) {
            interfaceC58283Psb.onResume();
        }
    }

    public ClipsTimelineBottomSheetViewController(Context context, ViewGroup viewGroup, UserSession userSession, C185278Js c185278Js, C50865Mdw c50865Mdw, C187358Sd c187358Sd) {
        AbstractC37302Gc3.A1U(userSession, c50865Mdw);
        this.A0B = context;
        this.A0C = viewGroup;
        this.A0D = userSession;
        this.A0F = c50865Mdw;
        this.A0G = c187358Sd;
        this.A0E = c185278Js;
        this.A0I = new C56280Oyr(this);
        this.A0H = C18U.A06(C06090Tz.A06, userSession, 36320012982230947L);
        C55982hj A0R = AbstractC167007dF.A0R();
        AbstractC50524MSc.A0I(A0R, this);
        this.A05 = A0R;
        this.A08 = C16930sl.A00;
    }
}
