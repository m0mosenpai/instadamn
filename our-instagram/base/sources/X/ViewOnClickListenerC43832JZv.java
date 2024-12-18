package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.mediapicker.Folder;
import com.instagram.ui.widget.trianglespinner.TriangleSpinner;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.JZv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class ViewOnClickListenerC43832JZv extends LinearLayout implements View.OnClickListener, InterfaceC55932he, MQQ, MSG, AdapterView.OnItemSelectedListener {
    public BaseAdapter A00;
    public com.instagram.creation.base.ui.mediatabbar.Tab A01;
    public InterfaceC189668al A02;
    public MN8 A03;
    public InterfaceC189618ag A04;
    public boolean A05;
    public boolean A06;
    public final C55982hj A07;
    public final UserSession A08;
    public final TriangleSpinner A09;
    public final View A0A;
    public final ImageView A0B;
    public final TextView A0C;
    public final boolean A0D;
    public final Paint A0E;
    public final TextView A0F;
    public final TextView A0G;

    public ViewOnClickListenerC43832JZv(Context context, UserSession userSession, boolean z, boolean z2, boolean z3) {
        super(context, null, 0);
        ImageView imageView;
        int color;
        Integer num;
        Integer num2;
        this.A08 = userSession;
        LayoutInflater.from(context).inflate(R.layout.media_capture_action_bar, this);
        Context context2 = getContext();
        context2.getColor(R.color.badge_color);
        this.A0D = AbstractC13620mo.A02(context2);
        Paint A0R = AbstractC166987dD.A0R();
        this.A0E = A0R;
        A0R.setColor(AbstractC53242c7.A0F(context2, R.attr.creationDividerColor));
        AbstractC43592JPx.A1E(A0R);
        A0R.setStrokeWidth(1.0f);
        C55982hj A0R2 = AbstractC167007dF.A0R();
        A0R2.A0A(this);
        boolean z4 = true;
        A0R2.A06 = true;
        this.A07 = A0R2;
        ImageView A08 = AbstractC31171DnF.A08(this, R.id.action_bar_cancel);
        if (A08 != null) {
            A08.setImageResource(R.drawable.instagram_x_pano_outline_24);
            C0fQ.A00(this, A08);
            AbstractC31172DnG.A1E(context2.getResources(), A08, 2131954754);
        }
        A08.getClass();
        this.A0B = A08;
        this.A09 = (TriangleSpinner) requireViewById(R.id.gallery_folder_menu);
        this.A06 = false;
        TextView A0T = AbstractC166997dE.A0T(this, R.id.photo_title);
        this.A0F = A0T;
        setAccessibilityForHeading(A0T);
        TextView A0T2 = AbstractC166997dE.A0T(this, R.id.video_title);
        this.A0G = A0T2;
        setAccessibilityForHeading(A0T2);
        TextView A0T3 = AbstractC166997dE.A0T(this, R.id.new_post_title);
        this.A0C = A0T3;
        setAccessibilityForHeading(A0T3);
        if (z2) {
            AbstractC166987dD.A1P(C02G.A01(context2), A0T3, 2131968471);
        }
        if (userSession != null) {
            C06090Tz c06090Tz = C06090Tz.A05;
            if (!C18U.A06(c06090Tz, userSession, 36328946513624980L) && !C8SO.A00(userSession)) {
                z4 = false;
                if (z3 && C18U.A06(c06090Tz, userSession, 36328053160426559L)) {
                    num = C05F.A0j;
                } else {
                    if (z) {
                        num2 = C05F.A00;
                    } else {
                        num2 = C05F.A0Y;
                    }
                    Integer num3 = C05F.A0N;
                    if (num2 == num3) {
                        num = C05F.A0Y;
                    } else {
                        num = C05F.A0C;
                        if (num2 == num || num2 != (num3 = C05F.A01)) {
                            num = num3;
                        }
                    }
                }
            } else {
                num = C05F.A00;
            }
            View A00 = AbstractC43841Ja4.A00(this, this, num, false);
            this.A0A = A00;
            if (num == C05F.A00) {
                imageView = (ImageView) A00;
                if (z4) {
                    color = context.getColor(AbstractC53242c7.A08(context));
                    imageView.setColorFilter(color);
                }
            }
            AbstractC31174DnI.A1D(this, -1, C3HB.A00(context));
        }
        View A002 = AbstractC43841Ja4.A00(this, this, C05F.A00, false);
        this.A0A = A002;
        imageView = (ImageView) A002;
        color = context2.getColor(R.color.text_link_selector);
        imageView.setColorFilter(color);
        AbstractC31174DnI.A1D(this, -1, C3HB.A00(context));
    }

    public static void setAccessibilityForHeading(View view) {
        AbstractC56932jR.A04(view, 1);
        AbstractC56932jR.A03(view);
    }

    public final void A01() {
        int i;
        this.A05 = true;
        this.A01 = AbstractC43884Jap.A00;
        if (this.A0D) {
            i = (getChildCount() - 1) - this.A01.A00;
        } else {
            i = 0;
        }
        Drj(i, 0.0f);
        Drj(this.A01.A00, 0.0f);
        A00(true, true, false);
        this.A0B.setImageResource(R.drawable.instagram_arrow_back_24);
        TriangleSpinner triangleSpinner = this.A09;
        triangleSpinner.setVisibility(8);
        triangleSpinner.setEnabled(false);
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

    @Override // X.MQQ
    public final void Drj(float f, float f2) {
        TextView textView;
        float f3 = 1.0f;
        if (f <= 0.0f) {
            TriangleSpinner triangleSpinner = this.A09;
            triangleSpinner.setAlpha(1.0f);
            triangleSpinner.setEnabled(true);
            this.A0F.setAlpha(0.0f);
        } else if (f <= 1.0f) {
            TriangleSpinner triangleSpinner2 = this.A09;
            float f4 = 1.0f - f;
            triangleSpinner2.setAlpha(f4);
            triangleSpinner2.setEnabled(false);
            this.A0F.setAlpha(1.0f - f4);
        } else {
            if (f > 1.0f && f <= 2.0f) {
                TriangleSpinner triangleSpinner3 = this.A09;
                triangleSpinner3.setAlpha(0.0f);
                triangleSpinner3.setEnabled(false);
                float f5 = 2.0f - f;
                this.A0F.setAlpha(f5);
                textView = this.A0G;
                f3 = 1.0f - f5;
            } else {
                TriangleSpinner triangleSpinner4 = this.A09;
                triangleSpinner4.setAlpha(0.0f);
                triangleSpinner4.setEnabled(false);
                this.A0F.setAlpha(0.0f);
                textView = this.A0G;
            }
            textView.setAlpha(f3);
            A02();
        }
        this.A0G.setAlpha(0.0f);
        A02();
    }

    @Override // X.MQQ
    public final /* synthetic */ void Drl(com.instagram.creation.base.ui.mediatabbar.Tab tab) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float bottom = getBottom() - 1;
        canvas.drawLine(getLeft(), bottom, getRight(), bottom, this.A0E);
    }

    public int getTabCount() {
        return 1;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    public void setSelectedFolder(Folder folder) {
        for (int i = 0; i < getFolders().size(); i++) {
            if (((Folder) getFolders().get(i)).A02 == folder.A02) {
                this.A09.setSelection(i);
                return;
            }
        }
    }

    public void setSelectedMixedFolder(C8Z4 c8z4) {
        for (int i = 0; i < getCombinedFolders().size(); i++) {
            C8Z4 c8z42 = (C8Z4) getCombinedFolders().get(i);
            if (c8z42.CBv() == c8z4.CBv() && c8z42.BF3() == c8z4.BF3()) {
                this.A09.setSelection(i);
                return;
            }
        }
    }

    private void A00(boolean z, boolean z2, boolean z3) {
        C55982hj c55982hj = this.A07;
        if (c55982hj != null) {
            if (this.A05) {
                c55982hj.A02();
                return;
            }
            double d = z2 ? 1.0d : 0.0d;
            if (z3) {
                c55982hj.A06(d);
            } else {
                c55982hj.A08(d, true);
            }
            this.A0A.setEnabled(z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0026, code lost:
    
        if (((X.ViewOnClickListenerC44269JhH) r0).A0H != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02() {
        /*
            r4 = this;
            com.instagram.creation.base.ui.mediatabbar.Tab r1 = r4.A01
            r2 = 0
            if (r1 != 0) goto L9
            r4.A00(r2, r2, r2)
        L8:
            return
        L9:
            com.instagram.creation.base.ui.mediatabbar.Tab r0 = X.AbstractC43884Jap.A01
            r3 = 1
            if (r1 != r0) goto L12
            r4.A00(r2, r2, r3)
            return
        L12:
            com.instagram.creation.base.ui.mediatabbar.Tab r0 = X.AbstractC43884Jap.A02
            if (r1 != r0) goto L3f
            X.MN8 r0 = r4.A03
            if (r0 == 0) goto L28
            com.instagram.creation.capture.MediaCaptureFragment r0 = (com.instagram.creation.capture.MediaCaptureFragment) r0
            X.MSF r0 = r0.mCaptureProvider
            r0.getClass()
            X.JhH r0 = (X.ViewOnClickListenerC44269JhH) r0
            boolean r0 = r0.A0H
            r1 = 1
            if (r0 == 0) goto L29
        L28:
            r1 = 0
        L29:
            X.MN8 r0 = r4.A03
            if (r0 == 0) goto L3b
            com.instagram.creation.capture.MediaCaptureFragment r0 = (com.instagram.creation.capture.MediaCaptureFragment) r0
            X.MSF r0 = r0.mCaptureProvider
            r0.getClass()
            boolean r0 = r0.CKp()
            if (r0 == 0) goto L3b
            r2 = 1
        L3b:
            r4.A00(r1, r2, r3)
            return
        L3f:
            com.instagram.creation.base.ui.mediatabbar.Tab r0 = X.AbstractC43884Jap.A00
            if (r1 != r0) goto L8
            float r1 = X.AbstractC166987dD.A08(r4)
            float r0 = r4.getTranslationY()
            float r1 = r1 - r0
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            boolean r1 = X.AbstractC167007dF.A1O(r0)
            X.8ag r0 = r4.A04
            if (r0 == 0) goto L73
            boolean r0 = r0.CYC()
            if (r0 == 0) goto L73
            if (r1 != 0) goto L63
            boolean r0 = r4.A06
            if (r0 == 0) goto L73
        L63:
            r0 = 1
        L64:
            r4.A00(r3, r0, r3)
            android.widget.ImageView r1 = r4.A0B
            boolean r0 = r4.A05
            if (r0 == 0) goto L6f
            r2 = 8
        L6f:
            r1.setVisibility(r2)
            return
        L73:
            r0 = 0
            goto L64
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnClickListenerC43832JZv.A02():void");
    }

    @Override // X.InterfaceC55932he
    public final void Dnm(C55982hj c55982hj) {
        this.A0A.setAlpha((float) c55982hj.A09.A00);
    }

    @Override // X.MSG
    public List getCombinedFolders() {
        InterfaceC189618ag interfaceC189618ag = this.A04;
        if (interfaceC189618ag == null) {
            return new ArrayList();
        }
        return interfaceC189618ag.getCombinedFolders();
    }

    @Override // X.MSG
    public C8Z4 getCurrentMixedFolder() {
        InterfaceC189618ag interfaceC189618ag = this.A04;
        if (interfaceC189618ag == null) {
            return new Folder(getContext().getString(2131962670), null, -1, false);
        }
        return interfaceC189618ag.getCurrentMixedFolder();
    }

    public List getFolders() {
        InterfaceC189618ag interfaceC189618ag = this.A04;
        if (interfaceC189618ag == null) {
            return AbstractC166987dD.A1E();
        }
        return interfaceC189618ag.getFolders();
    }

    public void setBaseDelegate(InterfaceC189668al interfaceC189668al) {
        this.A02 = interfaceC189668al;
        if (interfaceC189668al != null) {
            A02();
        }
    }

    public void setFeedCaptureDelegate(MN8 mn8) {
        this.A03 = mn8;
        if (mn8 != null) {
            A02();
        }
    }

    public void setGalleryDelegate(InterfaceC189618ag interfaceC189618ag, InterfaceC195648l5 interfaceC195648l5) {
        this.A04 = interfaceC189618ag;
        C43831JZu c43831JZu = new C43831JZu(getResources(), this);
        this.A00 = c43831JZu;
        TriangleSpinner triangleSpinner = this.A09;
        triangleSpinner.setAdapter((SpinnerAdapter) c43831JZu);
        triangleSpinner.setOnItemSelectedListener(this);
        triangleSpinner.setOnTouchListener(new ViewOnTouchListenerC55488Okh(1, this, interfaceC189618ag, interfaceC195648l5));
        InterfaceC189618ag interfaceC189618ag2 = this.A04;
        if (interfaceC189618ag2 != null) {
            C43848JaC B7B = interfaceC189618ag2.B7B();
            if (B7B.A01 == null) {
                B7B.A01 = triangleSpinner;
                C43892Jaz c43892Jaz = new C43892Jaz(this, 0);
                C43849JaD c43849JaD = B7B.A04;
                c43849JaD.A00 = new C30485DbU(31, c43892Jaz, B7B);
                triangleSpinner.setBottomSheetBuilder(c43849JaD, B7B.A02.requireActivity(), new C43873Jad(B7B, new C44070Jdv(1, this, B7B)));
            }
            A02();
        }
    }

    public void setNextEnabledWithColor(boolean z) {
        this.A0A.setEnabled(z);
    }

    public void setUnifiedCameraGallery(boolean z) {
        this.A06 = z;
        TextView textView = this.A0C;
        if (z) {
            textView.setAlpha(1.0f);
            TriangleSpinner triangleSpinner = this.A09;
            triangleSpinner.setAlpha(0.0f);
            triangleSpinner.setEnabled(false);
            this.A0F.setAlpha(0.0f);
            textView = this.A0G;
        }
        textView.setAlpha(0.0f);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i;
        int A05 = C0f9.A05(566638010);
        if (this.A02 == null) {
            i = 821265007;
        } else {
            if (view == this.A0B) {
                UserSession userSession = this.A08;
                if (userSession != null) {
                    AbstractC155496ye.A00(userSession).A05("profile_picture_gallery_canceled");
                    AbstractC155496ye.A00(userSession).A04(AbstractC111324zv.A00(112));
                }
                this.A02.onCancel();
            } else if (view == this.A0A && this.A07.A01 == 1.0d) {
                UserSession userSession2 = this.A08;
                if (userSession2 != null) {
                    FA7.A00(userSession2).A00(EnumC33422Ept.A07, C05F.A0j);
                    AbstractC155496ye.A00(userSession2).A05("profile_picture_gallery_confirmed");
                }
                this.A02.DVn();
            }
            i = -1008830493;
        }
        C0f9.A0C(i, A05);
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        A02();
    }

    @Override // X.MQQ
    public final void Drk(com.instagram.creation.base.ui.mediatabbar.Tab tab, com.instagram.creation.base.ui.mediatabbar.Tab tab2) {
        this.A01 = tab2;
    }
}
