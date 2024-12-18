package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.api.schemas.CameraTool;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.sundial.bottomsheet.BottomSheetViewController;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.direct.perf.constants.ThreadFetchReason;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;
import com.instagram.ui.text.ConstrainedEditText;
import com.instagram.ui.text.fittingtextview.FittingTextView;
import com.instagram.ui.widget.drawing.EyedropperColorPickerTool;
import com.instagram.ui.widget.drawing.StrokeWidthTool;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.8bx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C190398bx implements C8NX, InterfaceC190408by, InterfaceC185958Mp, InterfaceC60152ox, C8PS, InterfaceC190418bz, InterfaceC190428c0 {
    public int A00;
    public int A01;
    public int A02;
    public Drawable A04;
    public View.OnTouchListener A05;
    public View A06;
    public View A07;
    public View A08;
    public View A09;
    public View A0A;
    public ImageView A0B;
    public ImageView A0C;
    public TextView A0D;
    public TextView A0E;
    public C55U A0F;
    public C55U A0G;
    public C194808jg A0H;
    public C190438c1 A0I;
    public InterfaceC143326dX A0J;
    public ClipsCreationViewModel A0K;
    public C6RB A0L;
    public C202278x7 A0M;
    public Boolean A0N;
    public Boolean A0O;
    public Integer A0P;
    public Integer A0Q;
    public Integer A0R;
    public Integer A0S;
    public List A0V;
    public List A0W;
    public java.util.Set A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public int A0g;
    public View A0h;
    public TextView A0i;
    public C2GT A0j;
    public Boolean A0k;
    public boolean A0l;
    public boolean A0m;
    public final float A0n;
    public final float A0o;
    public final int A0p;
    public final Context A0q;
    public final Resources A0r;
    public final Handler A0s;
    public final GestureDetector A0t;
    public final View A0u;
    public final View A0v;
    public final View A0w;
    public final View A0x;
    public final View A0y;
    public final View A0z;
    public final View A10;
    public final View A11;
    public final View A12;
    public final View A13;
    public final View A14;
    public final View A15;
    public final ViewGroup A16;
    public final ViewStub A17;
    public final ViewStub A18;
    public final ViewStub A19;
    public final ViewStub A1A;
    public final TextView A1B;
    public final TextView A1C;
    public final RecyclerView A1D;
    public final RecyclerView A1E;
    public final RecyclerView A1F;
    public final RecyclerView A1G;
    public final C22P A1H;
    public final AbstractC59962oe A1I;
    public final UserSession A1J;
    public final IgImageView A1K;
    public final C3I9 A1L;
    public final InterfaceC56392iX A1M;
    public final InterfaceC56392iX A1N;
    public final C8O8 A1O;
    public final TargetViewSizeProvider A1P;
    public final AnonymousClass840 A1Q;
    public final C8D9 A1R;
    public final AbstractC190598cH A1S;
    public final C190638cL A1T;
    public final C190448c2 A1U;
    public final C190458c3 A1V;
    public final InterfaceC1810081c A1W;
    public final C8NY A1X;
    public final C150286pc A1Y;
    public final C150286pc A1Z;
    public final C150286pc A1a;
    public final C150286pc A1b;
    public final C150286pc A1c;
    public final C150286pc A1d;
    public final C150286pc A1e;
    public final C150286pc A1f;
    public final C150286pc A1g;
    public final C150286pc A1h;
    public final C23031Ai A1i;
    public final ConstrainedEditText A1j;
    public final FittingTextView A1k;
    public final EyedropperColorPickerTool A1l;
    public final StrokeWidthTool A1m;
    public final InteractiveDrawableContainer A1n;
    public final String A1o;
    public final Drawable A1s;
    public final ViewStub A1t;
    public final ViewStub A1u;
    public final C8C0 A1v;
    public final C190498c7 A1w;
    public final C190698cR A1x;
    public final C190388bw A1y;
    public final boolean A1z;
    public Runnable A0T = null;
    public int A03 = 0;
    public final Map A1p = new HashMap();
    public final Map A1q = new C005001p(0);
    public final Map A1r = new C005001p(0);
    public String A0U = "";
    public boolean A0c = false;

    public static void A0C(C190398bx c190398bx) {
        c190398bx.A0e = false;
        A0A(c190398bx);
        c190398bx.A0W();
        ConstrainedEditText constrainedEditText = c190398bx.A1j;
        constrainedEditText.requestFocus();
        constrainedEditText.setOnFocusChangeListener(new ViewOnFocusChangeListenerC190838cf(c190398bx));
        AnonymousClass229.A01(c190398bx.A1J).A1d(C81W.A08, c190398bx.A0U);
    }

    public static void A0I(C190398bx c190398bx, String str, Map map, boolean z) {
        C81W c81w;
        CameraTool cameraTool;
        C81W c81w2;
        c190398bx.A0e = false;
        A0A(c190398bx);
        c190398bx.A0W();
        ConstrainedEditText constrainedEditText = c190398bx.A1j;
        constrainedEditText.requestFocus();
        constrainedEditText.setOnFocusChangeListener(new ViewOnFocusChangeListenerC190838cf(c190398bx));
        SpannableString spannableString = new SpannableString(constrainedEditText.getText());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        for (Object obj : spannableString.getSpans(0, spannableString.length(), Object.class)) {
            spannableStringBuilder.setSpan(obj, 0, str.length(), spannableString.getSpanFlags(obj));
        }
        constrainedEditText.setText(spannableStringBuilder);
        C1816783z c1816783z = c190398bx.A1Q.A02;
        C1810981l c1810981l = c1816783z.A01.A0Y;
        if (c1810981l != null) {
            java.util.Set set = (java.util.Set) c1810981l.A09.A00;
            if (z) {
                c81w2 = C81W.A0N;
            } else {
                c81w2 = C81W.A08;
            }
            set.add(c81w2);
        }
        C183978Ee c183978Ee = c1816783z.A00().A02;
        String str2 = (String) map.getOrDefault(MSV.A00(1699), "");
        String str3 = (String) map.getOrDefault(TraceFieldType.RequestID, "");
        String str4 = (String) map.getOrDefault(AbstractC111324zv.A00(1237), "");
        if (c183978Ee != null) {
            List list = c183978Ee.A0p;
            if (list == null) {
                list = new ArrayList();
                c183978Ee.A0p = list;
            }
            ArrayList arrayList = new ArrayList();
            if (list != null) {
                arrayList.addAll(list);
                Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((OTK) it.next()).A01.A08.equals(str2)) {
                            break;
                        }
                    } else {
                        if (z) {
                            cameraTool = CameraTool.A1E;
                        } else {
                            cameraTool = CameraTool.A0E;
                        }
                        arrayList.add(new OTK(cameraTool, new OUP("", "", str, "", "", str2, "", str3, str4)));
                    }
                }
                c183978Ee.A0p = arrayList;
            }
        }
        C195868lW c195868lW = c1816783z.A00().A03;
        if (c195868lW != null) {
            List list2 = c195868lW.A0x;
            if (list2 == null) {
                list2 = new ArrayList();
                c195868lW.A0x = list2;
            }
            ArrayList arrayList2 = new ArrayList();
            if (list2 != null) {
                arrayList2.addAll(list2);
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (((OTK) it2.next()).A01.A08.equals(str2)) {
                            break;
                        }
                    } else {
                        arrayList2.add(new OTK(CameraTool.A0E, new OUP("", "", str, "", "", str2, "", str3, str4)));
                        break;
                    }
                }
                c195868lW.A0x = arrayList2;
            }
        }
        C22C A01 = AnonymousClass229.A01(c190398bx.A1J);
        String str5 = c190398bx.A0U;
        if (z) {
            c81w = C81W.A0N;
        } else {
            c81w = C81W.A08;
        }
        A01.A1d(c81w, str5);
    }

    public final void A0a() {
        List list;
        this.A00 = -1;
        EyedropperColorPickerTool eyedropperColorPickerTool = this.A1l;
        if (eyedropperColorPickerTool != null) {
            eyedropperColorPickerTool.setColor(-1);
        }
        C8D9 c8d9 = this.A1R;
        if (C18U.A06(C06090Tz.A06, c8d9.A05, 36331046752502925L)) {
            list = C8DA.A04;
        } else {
            list = C8DA.A03;
        }
        c8d9.A01(list);
        C23031Ai c23031Ai = this.A1i;
        int i = this.A00;
        c23031Ai.A8E.Egi(c23031Ai, Integer.valueOf(i), C23031Ai.A8c[62]);
    }

    @Override // X.C8NX
    public final /* synthetic */ void D28(boolean z) {
    }

    @Override // X.InterfaceC185958Mp
    public final /* synthetic */ void DFI() {
    }

    @Override // X.InterfaceC185958Mp
    public final /* synthetic */ void DFM() {
    }

    @Override // X.InterfaceC60152ox
    public final void DOK(int i, boolean z) {
        int i2;
        int i3;
        int height;
        int i4;
        int i5;
        int i6;
        this.A0Z = true;
        if (!this.A0c && !this.A0e) {
            int i7 = 0;
            if (i > 0 && !this.A0a && !A0P()) {
                i2 = C1812982h.A00;
            } else {
                i2 = 0;
            }
            if (A0Q() && i > 0 && !A0O()) {
                i3 = this.A03;
            } else {
                i3 = 0;
            }
            C150286pc c150286pc = this.A1g;
            int height2 = ((C194918js) c150286pc.get()).A08.getHeight();
            if (A0P()) {
                height = 0;
            } else {
                height = this.A16.getHeight();
            }
            int max = Math.max(height2, height);
            EyedropperColorPickerTool eyedropperColorPickerTool = this.A1l;
            int height3 = eyedropperColorPickerTool.getHeight();
            C218269ky c218269ky = ((C194918js) c150286pc.get()).A02;
            if (c218269ky != null) {
                C8C0 c8c0 = ((C8J9) c218269ky).A01;
                int height4 = c8c0.A0P.getHeight();
                View view = c8c0.A0J;
                C14360o3.A07(view);
                i4 = height4 + AbstractC13880nE.A0D(view);
            } else {
                i4 = 0;
            }
            int max2 = Math.max(height3, i4) + i3;
            if (A0P()) {
                i5 = this.A16.getHeight();
            } else {
                i5 = 0;
            }
            int i8 = max2 + i5;
            if (z) {
                i7 = (-i) + i2;
            }
            this.A0g = i7;
            if (A0T(this)) {
                this.A16.setTranslationY(this.A0g - i3);
                this.A1G.setTranslationY(this.A0g - i3);
                this.A1E.setTranslationY(this.A0g - i3);
                this.A1F.setTranslationY(this.A0g - i3);
            }
            View view2 = this.A14;
            if (view2 != null && !A0O()) {
                view2.setTranslationY(this.A0g);
            }
            ConstrainedEditText constrainedEditText = this.A1j;
            float f = -i3;
            constrainedEditText.setTranslationY(f);
            constrainedEditText.DOK(-this.A0g, z);
            constrainedEditText.A01 = max;
            constrainedEditText.A00 = i8;
            ConstrainedEditText.A00(constrainedEditText);
            C150286pc c150286pc2 = this.A1d;
            if (c150286pc2 != null && A0R(this)) {
                C80L.A02((C80L) c150286pc2.get());
            } else {
                C150286pc c150286pc3 = this.A1a;
                if (c150286pc3 != null) {
                    C194818jh.A02((C194818jh) c150286pc3.get());
                }
            }
            this.A1v.A0J.setTranslationY(f);
            boolean A0T = A0T(this);
            int i9 = this.A0g;
            if (A0T) {
                i9 = (i9 - this.A0r.getDimensionPixelSize(R.dimen.ad4ad_button_bottom_margin)) - i3;
            }
            StrokeWidthTool strokeWidthTool = this.A1m;
            strokeWidthTool.setTranslationY(i9);
            boolean A0T2 = A0T(this);
            int i10 = this.A0g;
            if (A0T2) {
                int height5 = i10 - this.A16.getHeight();
                Resources resources = this.A0r;
                i10 = (height5 - resources.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap)) - resources.getDimensionPixelSize(R.dimen.account_recs_header_image_margin);
            }
            int i11 = i10 - i3;
            if (A0T(this)) {
                i6 = i11 - this.A0r.getDimensionPixelSize(R.dimen.audience_lists_text_in_badge_horizontal_margin_right);
            } else {
                i6 = i11;
            }
            C8D9 c8d9 = this.A1R;
            float f2 = i11;
            c8d9.A00.setTranslationY(f2);
            c8d9.A02.setTranslationY(i6);
            int i12 = i - i2;
            C218269ky c218269ky2 = ((C194918js) c150286pc.get()).A02;
            if (c218269ky2 != null) {
                View view3 = ((C8J9) c218269ky2).A01.A0J;
                C14360o3.A07(view3);
                if (!z) {
                    i12 = 0;
                }
                AbstractC13880nE.A0Y(view3, i12);
            }
            if (this.A1X.Ei9()) {
                int height6 = ((this.A15.getHeight() - i) / 2) - (strokeWidthTool.getTop() + (strokeWidthTool.getHeight() / 2));
                if (A0T(this)) {
                    height6 = (height6 - this.A0r.getDimensionPixelSize(R.dimen.ad4ad_button_bottom_margin)) - i3;
                }
                strokeWidthTool.setTranslationY(height6);
            } else {
                strokeWidthTool.setTranslationY(0.0f);
                f2 = i11 - this.A0g;
            }
            eyedropperColorPickerTool.setTranslationY(f2);
            View view4 = this.A0z;
            if (view4 != null) {
                view4.setTranslationY(this.A0g - i3);
            }
            C190698cR c190698cR = this.A1x;
            if (c190698cR != null) {
                int i13 = this.A0g;
                c190698cR.A00 = i13;
                C57012jc c57012jc = c190698cR.A02;
                if (c57012jc.A04()) {
                    c57012jc.A01().setTranslationY(i13);
                }
            }
            C150286pc c150286pc4 = this.A1Y;
            if (c150286pc4 != null && c150286pc4.A03) {
                ((C9NL) c150286pc4.get()).DOK(i + i3, z);
            }
        }
    }

    @Override // X.C8PS
    public final void Dsw() {
    }

    @Override // X.C8PS
    public final void Dsx(float f, float f2) {
    }

    private float A00() {
        double currentRatio = this.A1m.getCurrentRatio();
        C150286pc c150286pc = this.A1g;
        return (float) AbstractC70163Da.A04(currentRatio, 0.0d, 1.0d, ((C194918js) c150286pc.get()).A07().A06.A00 * 12.0f, ((C194918js) c150286pc.get()).A07().A06.A00 * 64.0f);
    }

    public static C55U A01(C190398bx c190398bx) {
        C1810981l c1810981l = c190398bx.A1Q.A02.A01.A0Y;
        c1810981l.getClass();
        return (C55U) c1810981l.A08.A00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
    
        if (r1 > 0) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.AbstractC202988yG A02(X.C190398bx r5, X.EnumC194908jr r6, X.C190888ck r7) {
        /*
            com.instagram.common.session.UserSession r2 = r5.A1J
            android.content.Context r1 = r5.A0q
            X.8cr r0 = r7.A06
            int r0 = r0.A00(r1)
            if (r6 == 0) goto L40
            X.8yG r4 = X.AbstractC23028ADk.A00(r1, r2, r6, r0)
        L10:
            r5.A0L(r4)
            boolean r0 = r4 instanceof X.V7K
            if (r0 == 0) goto L38
            X.55U r0 = A01(r5)
            boolean r0 = r0 instanceof X.C81V
            if (r0 == 0) goto L38
            android.graphics.drawable.Drawable r3 = r5.A04
            r2 = 0
            if (r3 == 0) goto L39
            boolean r0 = r3 instanceof X.C5RO
            if (r0 == 0) goto L39
            X.5RO r3 = (X.C5RO) r3
            int r1 = r3.B25()
            int r0 = r3.Bzk()
            int r1 = r1 - r0
            if (r1 <= 0) goto L39
        L35:
            r4.EUp(r2, r1)
        L38:
            return r4
        L39:
            X.8NY r0 = r5.A1X
            int r1 = r0.Aof()
            goto L35
        L40:
            X.8yG r4 = X.AbstractC23028ADk.A01(r1, r2, r7, r0)
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C190398bx.A02(X.8bx, X.8jr, X.8ck):X.8yG");
    }

    public static C6RB A03(C190398bx c190398bx, C190888ck c190888ck) {
        EnumC194908jr enumC194908jr;
        C150286pc c150286pc = c190398bx.A1b;
        if (c150286pc != null && A0R(c190398bx) && ((C80S) c150286pc.get()).A00 != 0) {
            enumC194908jr = ((C80S) c150286pc.get()).A00();
        } else {
            C150286pc c150286pc2 = c190398bx.A1a;
            if (c150286pc2 != null && !A0R(c190398bx) && ((C194818jh) c150286pc2.get()).A07()) {
                enumC194908jr = null;
            } else {
                C190958cr c190958cr = c190888ck.A06;
                UserSession userSession = c190398bx.A1J;
                Context context = c190398bx.A0q;
                C9PX c9px = new C9PX(context, userSession, c190958cr.A00(context));
                c190398bx.A0L(c9px);
                return c9px;
            }
        }
        return A02(c190398bx, enumC194908jr, c190888ck);
    }

    public static HashSet A04(C190398bx c190398bx, Boolean bool, Boolean bool2) {
        ArrayList arrayList;
        if (c190398bx.A1Q.A02.A01.A04 == null) {
            List BA2 = c190398bx.A1X.BA2();
            if (bool.booleanValue()) {
                arrayList = AbstractC209689Pe.A01(c190398bx.A1J, c190398bx.A1j.getText().toString());
            } else {
                arrayList = new ArrayList();
            }
            if (!bool2.booleanValue() || !arrayList.isEmpty()) {
                HashSet hashSet = new HashSet(BA2);
                hashSet.addAll(arrayList);
                return hashSet;
            }
        }
        return new HashSet();
    }

    private void A05() {
        View view;
        ImageView imageView = this.A0C;
        if (imageView != null && this.A0B != null) {
            imageView.setBackgroundDrawable(null);
            this.A0B.setBackgroundDrawable(null);
            InterfaceC56392iX interfaceC56392iX = this.A1M;
            if (interfaceC56392iX != null && interfaceC56392iX.CWW()) {
                interfaceC56392iX.getView().setBackgroundDrawable(null);
            }
            InterfaceC56392iX interfaceC56392iX2 = this.A1N;
            if (interfaceC56392iX2 != null && interfaceC56392iX2.CWW()) {
                interfaceC56392iX2.getView().setBackgroundDrawable(null);
            }
            if (A0T(this)) {
                Drawable drawable = this.A0r.getDrawable(R.drawable.text_tool_controls_menu_item_background_selected);
                int intValue = this.A0R.intValue();
                if (intValue != 2) {
                    if (intValue != 1) {
                        if (intValue != 3) {
                            if (intValue == 4 && interfaceC56392iX2 != null && interfaceC56392iX2.CWW()) {
                                view = interfaceC56392iX2.getView();
                            } else {
                                return;
                            }
                        } else if (interfaceC56392iX == null || !interfaceC56392iX.CWW()) {
                            return;
                        } else {
                            view = interfaceC56392iX.getView();
                        }
                    } else {
                        view = this.A0B;
                    }
                } else {
                    view = this.A0C;
                }
                view.setBackgroundDrawable(drawable);
            }
        }
    }

    private void A06(Spannable spannable, int i, int i2) {
        AbstractC190858ch.A03(this.A0q, spannable, i, i2, this.A00, AbstractC13950nL.A04(this.A00));
        int i3 = this.A00;
        this.A1m.setColour(i3);
        EyedropperColorPickerTool eyedropperColorPickerTool = this.A1l;
        if (eyedropperColorPickerTool != null) {
            eyedropperColorPickerTool.setColor(i3);
        }
    }

    public static void A07(final C190398bx c190398bx) {
        if (c190398bx.A0C == null && c190398bx.A0q != null) {
            ImageView imageView = (ImageView) c190398bx.A1A.inflate();
            c190398bx.A0C = imageView;
            C0fQ.A00(new View.OnClickListener() { // from class: X.AQa
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C190398bx c190398bx2 = C190398bx.this;
                    Integer num = C05F.A0C;
                    if (c190398bx2.A0R == num && C190398bx.A0T(c190398bx2)) {
                        num = C05F.A00;
                    }
                    C190398bx.A0H(c190398bx2, num);
                }
            }, imageView);
        }
        if (c190398bx.A0C != null && A0T(c190398bx)) {
            c190398bx.A0C.setVisibility(0);
            c190398bx.A0C.setAlpha(1.0f);
        }
    }

    public static void A08(final C190398bx c190398bx) {
        if (c190398bx.A0B == null) {
            ImageView imageView = (ImageView) c190398bx.A18.inflate();
            c190398bx.A0B = imageView;
            imageView.setImageResource(R.drawable.instagram_icons_exceptions_color_picker_filled_44);
            C0fQ.A00(new View.OnClickListener() { // from class: X.AQc
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C190398bx c190398bx2 = C190398bx.this;
                    Integer num = C05F.A01;
                    if (c190398bx2.A0R == num && C190398bx.A0T(c190398bx2)) {
                        num = C05F.A00;
                    }
                    C190398bx.A0H(c190398bx2, num);
                }
            }, c190398bx.A0B);
        }
        if (c190398bx.A0B != null && A0T(c190398bx)) {
            c190398bx.A0B.setVisibility(0);
            c190398bx.A0B.setAlpha(1.0f);
        }
    }

    public static void A0B(C190398bx c190398bx) {
        java.util.Set set = c190398bx.A0X;
        final C190638cL c190638cL = c190398bx.A1T;
        if (c190638cL != null && set.size() >= 2) {
            UserSession userSession = c190398bx.A1J;
            if (C18U.A06(C06090Tz.A05, userSession, 36321696608822971L)) {
                C23031Ai A00 = AbstractC23021Ah.A00(userSession);
                if (!((Boolean) A00.A5E.CES(A00, C23031Ai.A8c[235])).booleanValue()) {
                    ArrayList arrayList = new ArrayList(set);
                    Bundle bundle = new Bundle(0);
                    bundle.putParcelableArrayList("potential_thread_members", new ArrayList<>(arrayList));
                    AbstractC03240Dh.A00(bundle, userSession);
                    C214949fW c214949fW = new C214949fW();
                    c214949fW.setArguments(bundle);
                    C189448aO c189448aO = new C189448aO(userSession);
                    c189448aO.A0a = false;
                    c189448aO.A14 = false;
                    Resources resources = c190398bx.A0r;
                    c189448aO.A0g = resources.getString(2131966280);
                    c189448aO.A0h = resources.getString(2131966281);
                    c189448aO.A1J = true;
                    c189448aO.A1N = true;
                    c189448aO.A0V = new BCD() { // from class: X.An6
                        @Override // X.BCD
                        public final void Cz1() {
                            C190638cL.this.A00(false, true);
                        }
                    };
                    final C189478aR A002 = c189448aO.A00();
                    View.OnClickListener onClickListener = new View.OnClickListener() { // from class: X.ARU
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            C190638cL c190638cL2 = C190638cL.this;
                            C189478aR c189478aR = A002;
                            c190638cL2.A00(true, true);
                            c189478aR.A0L(null);
                        }
                    };
                    View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: X.ARV
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            C190638cL c190638cL2 = C190638cL.this;
                            C189478aR c189478aR = A002;
                            c190638cL2.A00(false, true);
                            c189478aR.A0L(null);
                        }
                    };
                    BottomSheetFragment bottomSheetFragment = A002.A03;
                    C189448aO c189448aO2 = bottomSheetFragment.A03;
                    if (c189448aO2 != null) {
                        c189448aO2.A0K = onClickListener;
                        c189448aO2.A0L = onClickListener2;
                    }
                    bottomSheetFragment.A0Q();
                    A002.A02(c190398bx.A1I.requireActivity(), c214949fW);
                    C18920wW c18920wW = c190398bx.A1w.A00;
                    InterfaceC02590Ai A003 = c18920wW.A00(c18920wW.A00, "direct_group_story_mention_nux_impression");
                    if (A003.isSampled()) {
                        A003.Cht();
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x023f, code lost:
    
        if (r26 == null) goto L107;
     */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0180  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A0D(X.C190398bx r28) {
        /*
            Method dump skipped, instructions count: 820
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C190398bx.A0D(X.8bx):void");
    }

    public static void A0E(C190398bx c190398bx) {
        float pivotX;
        float width;
        float f;
        IgImageView igImageView = c190398bx.A1K;
        if (igImageView != null && igImageView.getVisibility() == 0) {
            int width2 = (igImageView.getWidth() - ((igImageView.getHeight() * igImageView.A02) / igImageView.A01)) / 2;
            int intValue = ((C202968yE) c190398bx.A1Z.get()).A00.intValue();
            if (intValue != 1) {
                if (intValue != 0) {
                    if (intValue == 2) {
                        f = ((c190398bx.A1j.getRight() - c190398bx.A0q.getResources().getDimension(R.dimen.abc_dialog_padding_material)) - igImageView.getWidth()) + width2;
                        igImageView.setX(f);
                    }
                    return;
                }
                pivotX = c190398bx.A0q.getResources().getDimension(R.dimen.abc_dialog_padding_material);
                width = width2;
            } else {
                pivotX = c190398bx.A1j.getPivotX();
                width = igImageView.getWidth() / 2.0f;
            }
            f = pivotX - width;
            igImageView.setX(f);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00cf, code lost:
    
        if ((r4 instanceof X.C221479qC) == false) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A0F(X.C190398bx r7) {
        /*
            com.instagram.common.ui.widget.imageview.IgImageView r2 = r7.A1K
            if (r2 == 0) goto L90
            android.view.View r0 = r7.A0x
            int r1 = r0.getHeight()
            boolean r0 = r7.A0P()
            if (r0 == 0) goto Ldb
            r0 = 0
        L11:
            int r0 = java.lang.Math.max(r1, r0)
            com.instagram.ui.text.ConstrainedEditText r3 = r7.A1j
            float r1 = r3.getY()
            float r0 = (float) r0
            float r1 = java.lang.Math.max(r1, r0)
            int r0 = r3.getHeight()
            float r4 = (float) r0
            float r0 = r3.getScaleY()
            float r4 = r4 * r0
            float r1 = r1 + r4
            float r6 = r7.A00()
            android.text.Editable r4 = r3.getText()
            X.C14360o3.A07(r4)
            java.lang.Class<X.8ck> r0 = X.C190888ck.class
            java.lang.Object r0 = X.C4GL.A00(r4, r0)
            X.8ck r0 = (X.C190888ck) r0
            if (r0 != 0) goto L48
            java.lang.String r5 = "classic"
            r4 = 0
            r0 = 0
            X.8ck r0 = X.AbstractC190898cl.A01(r5, r4, r0)
        L48:
            X.8cs r4 = r0.A04
            if (r4 == 0) goto Ld9
            boolean r0 = r4 instanceof X.C194948jv
            if (r0 != 0) goto Ld5
            boolean r0 = r4 instanceof X.C194928jt
            if (r0 != 0) goto Ld1
            boolean r0 = r4 instanceof X.C195018k2
            if (r0 != 0) goto Lc1
            boolean r0 = r4 instanceof X.C194968jx
            if (r0 != 0) goto Ld5
            boolean r0 = r4 instanceof X.C194958jw
            if (r0 == 0) goto L91
            r0 = -1092196762(0xffffffffbee66666, float:-0.45)
        L63:
            float r6 = r6 * r0
        L64:
            float r1 = r1 + r6
            android.content.Context r5 = r7.A0q
            android.content.res.Resources r4 = r5.getResources()
            r0 = 2131165200(0x7f070010, float:1.794461E38)
            float r0 = r4.getDimension(r0)
            float r1 = r1 + r0
            android.content.res.Resources r4 = r5.getResources()
            r0 = 2131165203(0x7f070013, float:1.7944616E38)
            float r0 = r4.getDimension(r0)
            float r1 = r1 - r0
            r2.setY(r1)
            float r0 = r3.getScaleY()
            r2.setScaleY(r0)
            float r0 = r3.getScaleX()
            r2.setScaleX(r0)
        L90:
            return
        L91:
            boolean r0 = r4 instanceof X.C195008k1
            if (r0 != 0) goto Ld1
            boolean r0 = r4 instanceof X.C194978jy
            if (r0 == 0) goto L9d
            r0 = 1050253722(0x3e99999a, float:0.3)
            goto L63
        L9d:
            boolean r0 = r4 instanceof X.C194998k0
            if (r0 == 0) goto La5
            r0 = 1060320051(0x3f333333, float:0.7)
            goto L63
        La5:
            boolean r0 = r4 instanceof X.C8k4
            if (r0 != 0) goto Ld1
            boolean r0 = r4 instanceof X.C194988jz
            if (r0 == 0) goto Lb1
            r0 = 1063675494(0x3f666666, float:0.9)
            goto L63
        Lb1:
            boolean r0 = r4 instanceof X.C1808880q
            if (r0 != 0) goto Lc1
            boolean r0 = r4 instanceof X.C194938ju
            if (r0 != 0) goto Lc1
            boolean r0 = r4 instanceof X.C194898jq
            if (r0 == 0) goto Lc5
            r0 = 1045220557(0x3e4ccccd, float:0.2)
            goto L63
        Lc1:
            r0 = 1053609165(0x3ecccccd, float:0.4)
            goto L63
        Lc5:
            boolean r0 = r4 instanceof X.C1808780p
            if (r0 != 0) goto Ld1
            boolean r0 = r4 instanceof X.C1808680o
            if (r0 != 0) goto Ld1
            boolean r0 = r4 instanceof X.C221479qC
            if (r0 == 0) goto Ld9
        Ld1:
            r0 = 1028443341(0x3d4ccccd, float:0.05)
            goto L63
        Ld5:
            r0 = -1110651699(0xffffffffbdcccccd, float:-0.1)
            goto L63
        Ld9:
            r6 = 0
            goto L64
        Ldb:
            android.view.ViewGroup r0 = r7.A16
            int r0 = r0.getHeight()
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C190398bx.A0F(X.8bx):void");
    }

    public static void A0G(C190398bx c190398bx) {
        UserSession userSession = c190398bx.A1J;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36321696608822971L)) {
            if (!c190398bx.A0d) {
                HashSet A04 = A04(c190398bx, false, false);
                c190398bx.A0X = A04;
                if (A04.size() > 1) {
                    C190638cL c190638cL = c190398bx.A1T;
                    if (c190638cL != null) {
                        c190638cL.A00 = c190398bx.A0X.size();
                        View view = c190638cL.A02;
                        if (view.getVisibility() != 0) {
                            C18920wW c18920wW = c190638cL.A04.A00;
                            InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "direct_group_story_mention_toggle_impression");
                            if (A00.isSampled()) {
                                A00.Cht();
                            }
                        }
                        view.setVisibility(0);
                        if (C18U.A06(c06090Tz, userSession, 36321696609019582L) && !c190638cL.A01) {
                            HashSet hashSet = new HashSet();
                            Iterator it = A04.iterator();
                            while (it.hasNext()) {
                                hashSet.add(((User) it.next()).getId());
                            }
                            Boolean bool = (Boolean) c190398bx.A1p.get(hashSet);
                            if (bool == null) {
                                LL3.A04(userSession, ThreadFetchReason.UPDATE_STORY_MENTION_SETTINGS, new C23927Aix(c190638cL, c190398bx, hashSet), new ArrayList(hashSet), false, false);
                                return;
                            } else {
                                c190638cL.A00(bool.booleanValue(), false);
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
            }
            C190638cL c190638cL2 = c190398bx.A1T;
            if (c190638cL2 != null) {
                c190638cL2.A02.setVisibility(8);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A0H(final X.C190398bx r14, java.lang.Integer r15) {
        /*
            Method dump skipped, instructions count: 598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C190398bx.A0H(X.8bx, java.lang.Integer):void");
    }

    public static void A0J(C190398bx c190398bx, boolean z) {
        View[] viewArr;
        View view;
        C80T c80t;
        C150286pc c150286pc;
        int intValue = c190398bx.A0R.intValue();
        if (intValue != 2) {
            if (intValue != 1) {
                if (intValue != 3) {
                    if (intValue == 4 && (c150286pc = c190398bx.A1e) != null) {
                        c80t = ((C1807480c) c150286pc.get()).A05;
                        viewArr = new View[1];
                        view = c80t.A07;
                    }
                } else {
                    C150286pc c150286pc2 = c190398bx.A1b;
                    if (c150286pc2 != null) {
                        c80t = ((C80S) c150286pc2.get()).A07;
                        viewArr = new View[1];
                        view = c80t.A07;
                    }
                }
            } else {
                c190398bx.A1R.A02(z);
                viewArr = new View[1];
                view = c190398bx.A1l;
            }
            viewArr[0] = view;
            AbstractC125325le.A05(viewArr, z);
        } else {
            ((C194918js) c190398bx.A1g.get()).A0A(z);
        }
        A0K(c190398bx, false, z);
    }

    public static void A0K(C190398bx c190398bx, boolean z, boolean z2) {
        ViewGroup viewGroup;
        if (!c190398bx.A1z) {
            UserSession userSession = c190398bx.A1J;
            if (C18U.A06(C06090Tz.A05, userSession, 36321696609085119L) && z != c190398bx.A0m) {
                if (A0T(c190398bx) && ((viewGroup = c190398bx.A16) == null || viewGroup.getVisibility() != 0)) {
                    return;
                }
                if (A04(c190398bx, true, true).size() > 1 && z) {
                    if (c190398bx.A0h == null) {
                        c190398bx.A0h = c190398bx.A1u.inflate();
                    }
                    if (A0T(c190398bx)) {
                        C56302iJ c56302iJ = (C56302iJ) c190398bx.A0h.getLayoutParams();
                        ViewGroup viewGroup2 = c190398bx.A16;
                        c56302iJ.A0G = viewGroup2.getId();
                        ((ViewGroup.MarginLayoutParams) c56302iJ).bottomMargin = Math.round(viewGroup2.getTop() - viewGroup2.getY());
                        int dimensionPixelSize = c190398bx.A0r.getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material);
                        c190398bx.A0h.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
                        c190398bx.A0h.requestLayout();
                    }
                    c190398bx.A0m = true;
                    InterfaceC19630xq interfaceC19630xq = AbstractC23021Ah.A00(userSession).A01;
                    InterfaceC19610xo ARD = interfaceC19630xq.ARD();
                    ARD.E7D("preference_show_mention_thread_send_setting_helper_text_seen_count", interfaceC19630xq.getInt("preference_show_mention_thread_send_setting_helper_text_seen_count", 0) + 1);
                    ARD.apply();
                    return;
                }
                View view = c190398bx.A0h;
                if (view == null) {
                    return;
                }
                AbstractC125325le.A05(new View[]{view}, z2);
            }
        }
    }

    private void A0L(C6RB c6rb) {
        C150286pc c150286pc = this.A1c;
        if (c150286pc.A03 && ((ACN) c150286pc.get()).A01 == C05F.A00) {
            c6rb.A0D(this.A0o, 0.0f, this.A0n, this.A0p);
        } else {
            c6rb.A0K = null;
            c6rb.A0b.clearShadowLayer();
            c6rb.A0R();
        }
        c6rb.A0I(AbstractC15960qq.A00(this.A0q).A02(EnumC15950qp.A0z));
        c6rb.A09();
    }

    private void A0M(boolean z) {
        ConstrainedEditText constrainedEditText = this.A1j;
        int selectionStart = constrainedEditText.getSelectionStart();
        int selectionEnd = constrainedEditText.getSelectionEnd();
        A06(constrainedEditText.getText(), selectionStart, selectionEnd);
        constrainedEditText.setSelection(selectionStart, selectionEnd);
        this.A1X.FAV(z);
    }

    private boolean A0Q() {
        C1810981l c1810981l = this.A1Q.A02.A01.A0Y;
        c1810981l.getClass();
        if (c1810981l.A08.A00 == C208509Kk.A00 && !c1810981l.A0W(C81W.A0p) && !this.A0a) {
            return true;
        }
        return false;
    }

    public final C6S5 A0U() {
        Editable text = this.A1j.getText();
        C14360o3.A0B(text, 0);
        return AbstractC190978ct.A00(text, 0, text.length());
    }

    public final void A0V() {
        ConstrainedEditText constrainedEditText = this.A1j;
        if (constrainedEditText.hasFocus()) {
            constrainedEditText.clearFocus();
        }
    }

    public final void A0W() {
        Integer A00;
        ConstrainedEditText constrainedEditText = this.A1j;
        AbstractC13880nE.A0w(constrainedEditText, true);
        boolean z = false;
        this.A1U.A01 = false;
        C150286pc c150286pc = this.A1c;
        if (c150286pc.A03) {
            ACN acn = (ACN) c150286pc.get();
            C6RB c6rb = this.A0L;
            if (c6rb == null) {
                A00 = C05F.A00;
                z = true;
            } else {
                A00 = AbstractC139126Rt.A00(c6rb);
            }
            acn.A00(A00, z);
        }
        C150286pc c150286pc2 = this.A1Y;
        if (c150286pc2 != null) {
            C9NL c9nl = (C9NL) c150286pc2.get();
            Editable text = constrainedEditText.getText();
            c9nl.A00 = this.A1X.BA1();
            java.util.Set set = c9nl.A0L;
            set.clear();
            Collections.addAll(set, C4GL.A06(text, V78.class));
        }
    }

    public final void A0X() {
        C55041OZn c55041OZn;
        BottomSheetViewController bottomSheetViewController;
        if (!this.A1W.Cap()) {
            ((C202968yE) this.A1Z.get()).A00(C05F.A01);
        }
        C150286pc c150286pc = this.A1h;
        if (c150286pc != null && c150286pc.A03 && (bottomSheetViewController = (c55041OZn = (C55041OZn) c150286pc.get()).A01) != null) {
            c55041OZn.A02 = null;
            bottomSheetViewController.A03(true);
        }
    }

    public final void A0Y() {
        Drawable drawable = this.A04;
        if (drawable == null) {
            drawable = this.A0L;
        }
        int i = 0;
        if (drawable != null) {
            drawable.setVisible(false, false);
        }
        ConstrainedEditText constrainedEditText = this.A1j;
        for (int i2 = 0; i2 < ((AbstractC202868y4[]) C4GL.A06(constrainedEditText.getText(), AbstractC202868y4.class)).length; i2++) {
        }
        View view = this.A0w;
        AbstractC125325le.A04(null, new View[]{view, this.A16}, true);
        AbstractC125325le.A04(null, new View[]{constrainedEditText}, !(this.A0L instanceof AbstractC202988yG));
        view.setEnabled(true);
        if (!this.A1W.Cap()) {
            i = this.A15.getContext().getColor(R.color.direct_light_mode_sticker_loading_end_color);
        }
        view.setBackgroundColor(i);
        if (this.A0a) {
            constrainedEditText.setFocusableInTouchMode(true);
        }
        constrainedEditText.requestFocus();
    }

    public final void A0Z() {
        int i;
        ConstrainedEditText constrainedEditText = this.A1j;
        String obj = constrainedEditText.getText().toString();
        if (obj != null && obj.length() != 0) {
            constrainedEditText.setText("");
        }
        constrainedEditText.setTextColor(-1);
        constrainedEditText.setGravity(17);
        if (this.A0l) {
            i = this.A1i.A09();
        } else {
            i = -1;
        }
        A0b(i);
        C150286pc c150286pc = this.A1c;
        if (c150286pc.A03) {
            ((ACN) c150286pc.get()).A00(C05F.A00, true);
        }
        int i2 = this.A00;
        this.A1m.setColour(i2);
        EyedropperColorPickerTool eyedropperColorPickerTool = this.A1l;
        if (eyedropperColorPickerTool != null) {
            eyedropperColorPickerTool.setColor(i2);
        }
        this.A0L = null;
        this.A04 = null;
        AbstractC125325le.A05(new View[]{eyedropperColorPickerTool}, false);
        A0G(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A06, r8.A1J, 36323075293916074L) == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002e, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A06, r8.A1J, 36323075293326241L) == false) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0b(int r9) {
        /*
            r8 = this;
            r8.A00 = r9
            r3 = 1
            r8.A0M(r3)
            X.6pc r4 = r8.A1c
            boolean r0 = r4.A03
            if (r0 == 0) goto L14
            java.lang.Object r0 = r4.get()
            X.ACN r0 = (X.ACN) r0
            r0.A00 = r9
        L14:
            X.6pc r6 = r8.A1d
            if (r6 == 0) goto L93
            X.55U r0 = A01(r8)
            boolean r0 = r0 instanceof X.C81V
            if (r0 == 0) goto L30
            com.instagram.common.session.UserSession r5 = r8.A1J
            X.0Tz r2 = X.C06090Tz.A06
            r0 = 36323075293326241(0x810ba500022ba1, double:3.034197304559418E-306)
            boolean r0 = X.C18U.A06(r2, r5, r0)
            r7 = 1
            if (r0 != 0) goto L31
        L30:
            r7 = 0
        L31:
            X.55U r0 = A01(r8)
            boolean r0 = r0 instanceof X.C208509Kk
            if (r0 == 0) goto L49
            com.instagram.common.session.UserSession r5 = r8.A1J
            X.0Tz r2 = X.C06090Tz.A06
            r0 = 36323075293916074(0x810ba5000b2baa, double:3.034197304932431E-306)
            boolean r0 = X.C18U.A06(r2, r5, r0)
            r1 = 1
            if (r0 != 0) goto L4a
        L49:
            r1 = 0
        L4a:
            boolean r0 = r8.A0P()
            if (r0 == 0) goto L93
            if (r7 != 0) goto L54
            if (r1 == 0) goto L93
        L54:
            java.lang.Object r0 = r6.get()
            X.80L r0 = (X.C80L) r0
            r0.A03()
        L5d:
            com.instagram.ui.text.ConstrainedEditText r0 = r8.A1j
            boolean r0 = r0.hasSelection()
            if (r0 != 0) goto L72
            boolean r0 = r4.A03
            if (r0 == 0) goto L72
            java.lang.Object r0 = r4.get()
            X.ACN r0 = (X.ACN) r0
            r0.A01(r3)
        L72:
            com.instagram.ui.widget.drawing.EyedropperColorPickerTool r0 = r8.A1l
            if (r0 == 0) goto L79
            r0.setColor(r9)
        L79:
            X.1Ai r4 = r8.A1i
            int r0 = r4.A09()
            int r3 = r8.A00
            if (r0 == r3) goto L92
            X.0ry r2 = r4.A8E
            X.0YR[] r1 = X.C23031Ai.A8c
            r0 = 62
            r1 = r1[r0]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r2.Egi(r4, r0, r1)
        L92:
            return
        L93:
            X.6pc r0 = r8.A1a
            if (r0 == 0) goto L5d
            java.lang.Object r0 = r0.get()
            X.8jh r0 = (X.C194818jh) r0
            r0.A05()
            goto L5d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C190398bx.A0b(int):void");
    }

    public final void A0c(Drawable drawable) {
        if (!(drawable instanceof C6RB)) {
            if (drawable instanceof C5RM) {
                drawable = ((C5RM) drawable).A0A;
                if (!(drawable instanceof C6RB)) {
                    return;
                }
            } else {
                return;
            }
        }
        if (drawable != null) {
            this.A1r.put(drawable, Float.valueOf(1.0f));
            this.A1q.put(drawable, new PointF(0.5f, 0.5f));
        }
    }

    public final void A0d(EnumC194908jr enumC194908jr) {
        if (enumC194908jr != null) {
            AnonymousClass229.A01(this.A1J).A1w(enumC194908jr.A00);
        }
        C150286pc c150286pc = this.A1d;
        if (c150286pc != null) {
            C80L c80l = (C80L) c150286pc.get();
            if (c80l.A09.A0j()) {
                C80L.A01(c80l);
            } else {
                C80L.A00(c80l);
                c80l.A06.removeCallbacks(c80l.A0A);
            }
        }
    }

    public final void A0e(C6RC c6rc) {
        if (c6rc != null) {
            C448724r c448724r = AnonymousClass229.A01(this.A1J).A0F;
            String str = c6rc.A00;
            C14360o3.A0B(str, 0);
            C18920wW c18920wW = c448724r.A01;
            InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_ui_tool_click");
            if (A00.isSampled()) {
                A00.A8R(C81X.A2t, "tool_type");
                C22M c22m = c448724r.A04;
                String str2 = c22m.A0L;
                if (str2 == null) {
                    str2 = "";
                }
                A00.AAP("camera_session_id", str2);
                A00.AAP("text_graphic_effect", str);
                A00.A8p("event_type", 2);
                A00.A8R(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                A00.AAP("module", C22F.A08.getModuleName());
                A00.A8R(c22m.A0C, "surface");
                A00.A8R(c448724r.A0J(), "camera_destination");
                A00.AAP("composition_str_id", c22m.A0M);
                A00.A8R(c22m.A0A, "composition_media_type");
                A00.AAP("nav_chain", C1QM.A00.A02.A00);
                A00.Cht();
            }
        }
        C150286pc c150286pc = this.A1d;
        if (c150286pc != null && A0R(this)) {
            C80L c80l = (C80L) c150286pc.get();
            if (c80l.A09.A0j()) {
                C80L.A01(c80l);
            } else {
                C80L.A00(c80l);
                c80l.A06.removeCallbacks(c80l.A0A);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x007c, code lost:
    
        if (A0U() == X.C6S5.A07) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0f(X.C6RB r9) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C190398bx.A0f(X.6RB):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x063e, code lost:
    
        if (r8.A8F.CES(r8, X.C23031Ai.A8c[61]) == null) goto L220;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0723  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0661  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0713  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0560  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x05eb  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0731  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x072d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0g(java.lang.Integer r33) {
        /*
            Method dump skipped, instructions count: 2132
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C190398bx.A0g(java.lang.Integer):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x007b, code lost:
    
        if (r3.A0O != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007d, code lost:
    
        r1 = X.C05F.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b7, code lost:
    
        r1 = X.C05F.A0C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b5, code lost:
    
        if (r3.A0O != false) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0h(java.lang.Object r6) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C190398bx.A0h(java.lang.Object):void");
    }

    public final void A0i(boolean z) {
        int i;
        int i2;
        if (z) {
            ConstrainedEditText constrainedEditText = this.A1j;
            if (!TextUtils.isEmpty(constrainedEditText.getText())) {
                i = 0;
                i2 = 0;
                for (AbstractC202868y4 abstractC202868y4 : (AbstractC202868y4[]) C4GL.A06(constrainedEditText.getText(), AbstractC202868y4.class)) {
                    if (abstractC202868y4 instanceof C202858y3) {
                        i++;
                    }
                    if (abstractC202868y4 instanceof V78) {
                        i2++;
                    }
                }
            } else {
                i = 0;
                i2 = 0;
            }
            C22C A01 = AnonymousClass229.A01(this.A1J);
            int length = constrainedEditText.getText().length();
            C448024k c448024k = A01.A07;
            C18920wW c18920wW = c448024k.A01;
            InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_end_session");
            if (c448024k.A0P() && A00.isSampled()) {
                A00.AAP("entity", "TEXT");
                A00.AAP("legacy_falco_event_name", "IG_CAMERA_END_TEXT_SESSION");
                C22M c22m = c448024k.A04;
                String str = c22m.A0L;
                if (str == null) {
                    str = "";
                }
                A00.AAP("camera_session_id", str);
                A00.A8R(c448024k.A0J(), "camera_destination");
                int i3 = 2;
                if (c22m.A01 != 2) {
                    i3 = 1;
                }
                A00.A8p("camera_position", Integer.valueOf(i3));
                A00.A9K("capture_format_index", 0L);
                A00.A8R(c448024k.A0I(), "capture_type");
                A00.A8R(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                A00.A8p("event_type", 2);
                boolean z2 = false;
                if (length > 0) {
                    z2 = true;
                }
                A00.A7v("has_text", Boolean.valueOf(z2));
                A00.A8R(AnonymousClass249.OTHER, "media_type");
                A00.AAP("module", C22F.A08.getModuleName());
                A00.A9K("text_count", Long.valueOf(length));
                A00.A8R(c22m.A0C, "surface");
                A00.A9K("mention_count", Long.valueOf(i));
                A00.A9K("hashtag_count", Long.valueOf(i2));
                A00.AAP("discovery_session_id", c22m.A0O);
                A00.AAP("search_session_id", c22m.A0P);
                A00.AAP("composition_str_id", c22m.A0M);
                A00.A8R(c22m.A0A, "composition_media_type");
                A00.AAP("nav_chain", C1QM.A00.A02.A00);
                A00.AAP("device_aspect_ratio_category", AbstractC82663mU.A00);
                A00.AAP("device_fold_orientation", AbstractC82673mV.A00);
                A00.AAP("device_fold_state", AbstractC82683mW.A00);
                A00.A7v("device_is_in_multi_window_mode", AbstractC82693mX.A00);
                A00.Cht();
            }
        }
        C150286pc c150286pc = this.A1f;
        EditText editText = ((C202848y2) c150286pc.get()).A02;
        Editable text = editText.getText();
        C14360o3.A07(text);
        C6S0[] c6s0Arr = (C6S0[]) C4GL.A06(text, C6S0.class);
        ViewTreeObserver viewTreeObserver = editText.getViewTreeObserver();
        for (C6S0 c6s0 : c6s0Arr) {
            viewTreeObserver.removeOnPreDrawListener(c6s0);
        }
        ConstrainedEditText constrainedEditText2 = this.A1j;
        constrainedEditText2.A02 = false;
        constrainedEditText2.setFocusableInTouchMode(true);
        View view = this.A0w;
        view.setEnabled(false);
        View view2 = this.A14;
        if (view2 != null) {
            AbstractC125325le.A05(new View[]{view2}, true);
            this.A1v.A0J.setTranslationY(0.0f);
        }
        AbstractC125325le.A05(new View[]{view, this.A16}, true);
        A0J(this, false);
        ImageView imageView = this.A0B;
        if (imageView != null) {
            AbstractC125325le.A05(new View[]{imageView}, false);
        }
        ImageView imageView2 = this.A0C;
        if (imageView2 != null) {
            AbstractC125325le.A05(new View[]{imageView2}, false);
        }
        InterfaceC56392iX interfaceC56392iX = this.A1N;
        if (interfaceC56392iX != null) {
            AbstractC125325le.A05(new View[]{interfaceC56392iX.getView()}, false);
        }
        if (!this.A1W.Cap() || this.A0L != null) {
            AbstractC125325le.A05(new View[]{constrainedEditText2}, false);
        }
        AbstractC125325le.A05(new View[]{this.A1m}, false);
        AbstractC125325le.A05(new View[]{((C202968yE) this.A1Z.get()).A01}, false);
        C150286pc c150286pc2 = this.A1c;
        if (c150286pc2.A03) {
            AbstractC125325le.A05(new View[]{((ACN) c150286pc2.get()).A06}, false);
        }
        View view3 = this.A08;
        if (view3 != null) {
            view3.setVisibility(8);
        }
        AbstractC125325le.A05(new View[]{((C202848y2) c150286pc.get()).A01}, false);
        C150286pc c150286pc3 = this.A1a;
        if (c150286pc3 != null) {
            C194818jh c194818jh = (C194818jh) c150286pc3.get();
            InterfaceC56392iX interfaceC56392iX2 = c194818jh.A09;
            if (interfaceC56392iX2.CWW()) {
                AbstractC125325le.A05(new View[]{interfaceC56392iX2.getView()}, false);
                C3PF c3pf = c194818jh.A01;
                if (c3pf != null) {
                    c3pf.A03();
                }
            }
        }
        C194918js c194918js = (C194918js) this.A1g.get();
        if (c194918js.A0F) {
            C150956qv.A08(new View[]{c194918js.A08}, false);
        }
        View view4 = this.A0z;
        if (view4 != null) {
            AbstractC125325le.A05(new View[]{view4}, false);
        }
        C190698cR c190698cR = this.A1x;
        if (c190698cR != null) {
            C57012jc c57012jc = c190698cR.A02;
            if (c57012jc.A04()) {
                AbstractC125325le.A05(new View[]{c57012jc.A01()}, true);
            }
            c190698cR.A01 = false;
        }
        C150286pc c150286pc4 = this.A1Y;
        if (c150286pc4 != null && c150286pc4.A03) {
            ((C9NL) c150286pc4.get()).A02(false);
        }
        IgImageView igImageView = this.A1K;
        if (igImageView != null) {
            igImageView.setVisibility(8);
            igImageView.setImageDrawable(null);
        }
        View view5 = this.A0A;
        if (view5 != null) {
            view5.setVisibility(8);
        }
        C2GT c2gt = this.A0j;
        if (c2gt != null) {
            c2gt.A05(this.A1I.getViewLifecycleOwner());
            this.A0j = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (((X.C80S) r0.get()).A00 == 0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r1 == 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0j() {
        /*
            r4 = this;
            X.6pc r0 = r4.A1b
            r3 = 1
            if (r0 == 0) goto L10
            java.lang.Object r0 = r0.get()
            X.80S r0 = (X.C80S) r0
            int r0 = r0.A00
            r2 = 1
            if (r0 != 0) goto L11
        L10:
            r2 = 0
        L11:
            X.6pc r0 = r4.A1e
            if (r0 == 0) goto L20
            java.lang.Object r0 = r0.get()
            X.80c r0 = (X.C1807480c) r0
            int r1 = r0.A00
            r0 = 1
            if (r1 != 0) goto L21
        L20:
            r0 = 0
        L21:
            if (r2 != 0) goto L26
            if (r0 != 0) goto L26
            r3 = 0
        L26:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C190398bx.A0j():boolean");
    }

    @Override // X.C8NX
    public final boolean AG1() {
        if (this.A0Y && this.A1X.AG1()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC190408by
    public final int C6N() {
        return this.A1j.length();
    }

    @Override // X.C8NX
    public final void DBH() {
        this.A1X.DBH();
    }

    @Override // X.InterfaceC185958Mp
    public final void DFK(int i) {
        this.A1X.DFK(i);
    }

    @Override // X.InterfaceC185958Mp
    public final void DFL() {
        this.A1X.DFL();
        ConstrainedEditText constrainedEditText = this.A1j;
        AbstractC125325le.A05(new View[]{constrainedEditText}, false);
        constrainedEditText.setHint("");
        constrainedEditText.setOnTouchListener(this.A05);
    }

    @Override // X.InterfaceC185958Mp
    public final void DFN(int i) {
        if (this.A0L != null) {
            A0b(i);
            Spannable spannable = this.A0L.A0F;
            ViewTreeObserverOnPreDrawListenerC139186Rz[] viewTreeObserverOnPreDrawListenerC139186RzArr = (ViewTreeObserverOnPreDrawListenerC139186Rz[]) C4GL.A06(spannable, ViewTreeObserverOnPreDrawListenerC139186Rz.class);
            int length = viewTreeObserverOnPreDrawListenerC139186RzArr.length;
            int i2 = 0;
            if (length <= 0) {
                A06(spannable, 0, 0);
                this.A0L.A0R();
            }
            do {
                viewTreeObserverOnPreDrawListenerC139186RzArr[i2].ERf(i, i);
                i2++;
            } while (i2 < length);
            this.A0L.A0R();
        }
    }

    @Override // X.C8NX
    public final void DOI() {
        this.A1X.DOI();
    }

    @Override // X.C8NX
    public final void Dof() {
        this.A1X.Dof();
    }

    @Override // X.C8NX
    public final void Dog(C5NL c5nl, String str) {
        this.A1X.Dog(c5nl, str);
    }

    @Override // X.InterfaceC190418bz
    public final void Dsa(Integer num) {
        for (C202878y5 c202878y5 : (C202878y5[]) C4GL.A06(this.A1j.getText(), C202878y5.class)) {
            c202878y5.A00 = num;
        }
        this.A1q.remove(this.A0L);
        C150286pc c150286pc = this.A1c;
        if (c150286pc.A03) {
            ((ACN) c150286pc.get()).A01(false);
        }
        C150286pc c150286pc2 = this.A1d;
        if (c150286pc2 != null && A0R(this)) {
            ((C80L) c150286pc2.get()).A03();
        } else {
            C150286pc c150286pc3 = this.A1a;
            if (c150286pc3 != null) {
                ((C194818jh) c150286pc3.get()).A05();
            }
        }
        ((C202848y2) this.A1f.get()).A01(((C202968yE) this.A1Z.get()).A00);
        A0E(this);
        this.A0M = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004a, code lost:
    
        if (r1 != r14.getText().length()) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003c, code lost:
    
        if (r0 == r1) goto L11;
     */
    @Override // X.InterfaceC190428c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Dsc() {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C190398bx.Dsc():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x014b, code lost:
    
        if (r1.equals(r0) == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01e2, code lost:
    
        if (X.AbstractC62352S7x.A00.contains(r11.getLanguage()) == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01e4, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01d6, code lost:
    
        if (r1.equals("modern_v2") != false) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x024e  */
    @Override // X.InterfaceC190408by
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Dsd(X.C190888ck r24, java.lang.Integer r25) {
        /*
            Method dump skipped, instructions count: 615
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C190398bx.Dsd(X.8ck, java.lang.Integer):void");
    }

    @Override // X.C8PS
    public final void Dyc(float f, float f2) {
        C150286pc c150286pc = this.A1d;
        if (c150286pc != null && A0R(this)) {
            ((C80L) c150286pc.get()).A03();
        } else {
            C150286pc c150286pc2 = this.A1a;
            if (c150286pc2 != null) {
                ((C194818jh) c150286pc2.get()).A05();
            }
        }
        C6RB c6rb = this.A0L;
        AbstractC209689Pe.A07(this.A1j, ((C194918js) this.A1g.get()).A07(), c6rb, A00());
        C150286pc c150286pc3 = this.A1c;
        if (c150286pc3.A03) {
            ACN acn = (ACN) c150286pc3.get();
            acn.A07.post(acn.A08);
        }
        ((C202848y2) this.A1f.get()).A01(((C202968yE) this.A1Z.get()).A00);
        if (!C18U.A06(C06090Tz.A06, this.A1J, 36323964351491816L)) {
            C23031Ai c23031Ai = this.A1i;
            float currentRatio = this.A1m.getCurrentRatio();
            c23031Ai.A8H.Egi(c23031Ai, Float.valueOf(currentRatio), C23031Ai.A8c[63]);
        }
    }

    public static void A09(final C190398bx c190398bx) {
        View view;
        View view2;
        EnumC58132lV enumC58132lV;
        boolean z = false;
        if ((A01(c190398bx) instanceof C208509Kk) && c190398bx.A1Q.A02.A01() == EnumC198268pb.A04) {
            Boolean bool = c190398bx.A0N;
            if (bool == null) {
                bool = Boolean.valueOf(C18U.A06(C06090Tz.A05, c190398bx.A1J, 36324526992142558L));
                c190398bx.A0N = bool;
            }
            z = bool.booleanValue();
        }
        if (z && (view2 = c190398bx.A14) != null) {
            if (c190398bx.A06 == null) {
                c190398bx.A06 = view2.requireViewById(R.id.ai_filter_picker);
                c190398bx.A0D = (TextView) view2.requireViewById(R.id.ai_filter_picker_title);
                c190398bx.A07 = view2.requireViewById(R.id.ai_filter_image_view);
                C0fQ.A00(new View.OnClickListener() { // from class: X.AQd
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        String A0g;
                        C190398bx c190398bx2 = C190398bx.this;
                        if (C18U.A06(C06090Tz.A05, c190398bx2.A1J, 36324526992142558L) && (A0g = AbstractC167007dF.A0g(c190398bx2.A1j)) != null) {
                            c190398bx2.DBH();
                            c190398bx2.A1X.DsZ(A0g);
                        }
                    }
                }, c190398bx.A06);
            }
            ConstrainedEditText constrainedEditText = c190398bx.A1j;
            if (constrainedEditText.length() > 1 && constrainedEditText.length() < 20) {
                c190398bx.A06.getVisibility();
                c190398bx.A06.setVisibility(0);
                if (c190398bx.A0D != null) {
                    c190398bx.A0D.setText(c190398bx.A0r.getString(2131975406));
                }
                UserSession userSession = c190398bx.A1J;
                C23031Ai A00 = AbstractC23021Ah.A00(userSession);
                InterfaceC16530ry interfaceC16530ry = A00.A2E;
                C0YR[] c0yrArr = C23031Ai.A8c;
                if (!((Boolean) interfaceC16530ry.CES(A00, c0yrArr[75])).booleanValue()) {
                    C5SU c5su = new C5SU(c190398bx.A1I.requireActivity(), new C149686oL(c190398bx.A0r.getString(2131975409)));
                    if (c190398bx.A0O()) {
                        enumC58132lV = EnumC58132lV.A03;
                    } else {
                        enumC58132lV = EnumC58132lV.A02;
                    }
                    c5su.A05 = enumC58132lV;
                    c5su.A03(c190398bx.A06);
                    c5su.A0A = true;
                    c5su.A00().A06();
                    C23031Ai A002 = AbstractC23021Ah.A00(userSession);
                    A002.A2E.Egi(A002, true, c0yrArr[75]);
                    return;
                }
                return;
            }
            view = c190398bx.A06;
        } else {
            view = c190398bx.A06;
            if (view == null) {
                return;
            }
        }
        view.setVisibility(8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005a, code lost:
    
        if (r7.A0N() == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0093, code lost:
    
        if (r0.booleanValue() == false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A0A(final X.C190398bx r7) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C190398bx.A0A(X.8bx):void");
    }

    private boolean A0N() {
        if (!(A01(this) instanceof C208509Kk)) {
            return false;
        }
        Boolean bool = this.A0k;
        if (bool == null) {
            bool = Boolean.valueOf(C18U.A06(C06090Tz.A05, this.A1J, 36325046683316900L));
            this.A0k = bool;
        }
        return bool.booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r5.A1J, 36323075294702518L) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean A0O() {
        /*
            r5 = this;
            X.55U r0 = A01(r5)
            boolean r0 = r0 instanceof X.C208509Kk
            r4 = 1
            if (r0 == 0) goto L19
            com.instagram.common.session.UserSession r3 = r5.A1J
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36323075294702518(0x810ba500172bb6, double:3.034197305429781E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            r1 = 1
            if (r0 != 0) goto L1a
        L19:
            r1 = 0
        L1a:
            boolean r0 = A0T(r5)
            if (r0 == 0) goto L23
            if (r1 == 0) goto L23
            return r4
        L23:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C190398bx.A0O():boolean");
    }

    private boolean A0P() {
        if (!(A01(this) instanceof C81V) || !AbstractC185298Jv.A09(this.A1J)) {
            if (A01(this) instanceof C208509Kk) {
                if (C18U.A06(C06090Tz.A06, this.A1J, 36323075293719463L)) {
                    return true;
                }
            }
            if (A01(this) instanceof C128535rM) {
                if (C18U.A06(C06090Tz.A06, this.A1J, 36323075294768055L)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r6.A1J, 36323075293326241L) == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0030, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r6.A1J, 36323075293916074L) == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A0R(X.C190398bx r6) {
        /*
            X.55U r0 = A01(r6)
            boolean r0 = r0 instanceof X.C81V
            r5 = 1
            if (r0 == 0) goto L19
            com.instagram.common.session.UserSession r3 = r6.A1J
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36323075293326241(0x810ba500022ba1, double:3.034197304559418E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            r4 = 1
            if (r0 != 0) goto L1a
        L19:
            r4 = 0
        L1a:
            X.55U r0 = A01(r6)
            boolean r0 = r0 instanceof X.C208509Kk
            if (r0 == 0) goto L32
            com.instagram.common.session.UserSession r3 = r6.A1J
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36323075293916074(0x810ba5000b2baa, double:3.034197304932431E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            r1 = 1
            if (r0 != 0) goto L33
        L32:
            r1 = 0
        L33:
            boolean r0 = A0T(r6)
            if (r0 == 0) goto L3e
            if (r4 != 0) goto L3d
            if (r1 == 0) goto L3e
        L3d:
            return r5
        L3e:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C190398bx.A0R(X.8bx):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r6.A1J, 36323075293391778L) == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0030, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r6.A1J, 36323075293785000L) == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A0S(X.C190398bx r6) {
        /*
            X.55U r0 = A01(r6)
            boolean r0 = r0 instanceof X.C81V
            r5 = 1
            if (r0 == 0) goto L19
            com.instagram.common.session.UserSession r3 = r6.A1J
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36323075293391778(0x810ba500032ba2, double:3.034197304600864E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            r4 = 1
            if (r0 != 0) goto L1a
        L19:
            r4 = 0
        L1a:
            X.55U r0 = A01(r6)
            boolean r0 = r0 instanceof X.C208509Kk
            if (r0 == 0) goto L32
            com.instagram.common.session.UserSession r3 = r6.A1J
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36323075293785000(0x810ba500092ba8, double:3.034197304849539E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            r1 = 1
            if (r0 != 0) goto L33
        L32:
            r1 = 0
        L33:
            boolean r0 = A0R(r6)
            if (r0 == 0) goto L3e
            if (r4 != 0) goto L3d
            if (r1 == 0) goto L3e
        L3d:
            return r5
        L3e:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C190398bx.A0S(X.8bx):boolean");
    }

    public static boolean A0T(C190398bx c190398bx) {
        if (A01(c190398bx) instanceof C81V) {
            if (C18U.A06(C06090Tz.A05, c190398bx.A1J, 36323075293260704L)) {
                return true;
            }
        }
        if (A01(c190398bx) instanceof C208509Kk) {
            if (C18U.A06(C06090Tz.A05, c190398bx.A1J, 36323075293719463L)) {
                return true;
            }
        }
        if (A01(c190398bx) instanceof C128535rM) {
            if (C18U.A06(C06090Tz.A05, c190398bx.A1J, 36323075294768055L)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC190408by
    public final boolean CRN() {
        return A01(this) instanceof C81V;
    }

    @Override // X.InterfaceC190408by
    public final boolean CUe() {
        return A01(this) instanceof C128535rM;
    }

    @Override // X.InterfaceC190408by
    public final boolean Cdo() {
        return A01(this) instanceof C208509Kk;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x02b1, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A06, r24, 36319235592428647L) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0303, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r24, 36325197007041391L) == false) goto L41;
     */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.01p, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.01p, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C190398bx(android.content.Context r20, android.view.View r21, X.C22P r22, final X.AbstractC59962oe r23, final com.instagram.common.session.UserSession r24, X.C3I9 r25, X.C8O8 r26, com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r27, final X.AnonymousClass840 r28, X.C8D9 r29, final X.C8C0 r30, X.InterfaceC143326dX r31, X.InterfaceC1810081c r32, X.C8NY r33, X.C190388bw r34, X.InterfaceC169517hR r35, com.instagram.ui.widget.interactive.InteractiveDrawableContainer r36, java.lang.Integer r37, java.lang.String r38, java.util.List r39, boolean r40, boolean r41, boolean r42) {
        /*
            Method dump skipped, instructions count: 1326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C190398bx.<init>(android.content.Context, android.view.View, X.22P, X.2oe, com.instagram.common.session.UserSession, X.3I9, X.8O8, com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider, X.840, X.8D9, X.8C0, X.6dX, X.81c, X.8NY, X.8bw, X.7hR, com.instagram.ui.widget.interactive.InteractiveDrawableContainer, java.lang.Integer, java.lang.String, java.util.List, boolean, boolean, boolean):void");
    }
}
