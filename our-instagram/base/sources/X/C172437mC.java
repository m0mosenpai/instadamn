package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.creation.capture.quickcapture.actionbar.CreationActionBar;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7mC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C172437mC implements C8Q5 {
    public Drawable A00;
    public C199028r5 A01;
    public Integer A02;
    public boolean A03;
    public C172547mO A04;
    public Boolean A05;
    public String A06;
    public List A07;
    public final Activity A08;
    public final Context A09;
    public final C9BW A0A;
    public final InterfaceC11380iw A0B;
    public final UserSession A0C;
    public final InterfaceC56392iX A0D;
    public final C8Q4 A0E;
    public final C8DN A0F;
    public final CreationActionBar A0G;
    public final C1816783z A0H;
    public final C81K A0I;
    public final C172517mL A0J;
    public final C172517mL A0K;
    public final InterfaceC172477mG A0L;
    public final InterfaceC172477mG A0M;
    public final AnonymousClass856 A0N;
    public final C183608Cl A0O;
    public final IgdsMediaButton A0P;
    public final User A0Q;
    public final InterfaceC09390do A0R;
    public final InterfaceC09390do A0S;
    public final InterfaceC09390do A0T;
    public final InterfaceC09390do A0U;
    public final InterfaceC09390do A0V;
    public final InterfaceC09390do A0W;
    public final InterfaceC09390do A0X;
    public final InterfaceC09390do A0Y;
    public final boolean A0Z;
    public final boolean A0a;
    public final CallerContext A0b = CallerContext.A01("DefaultPostCaptureButtonController");
    public final InterfaceC172477mG A0c;
    public final InterfaceC172477mG A0d;
    public final InterfaceC172477mG A0e;
    public final InterfaceC172477mG A0f;
    public final InterfaceC172477mG A0g;
    public final InterfaceC172477mG A0h;
    public final InterfaceC172477mG A0i;
    public final InterfaceC172477mG A0j;
    public final boolean A0k;

    private final InterfaceC172477mG A01(final EnumC142706cW enumC142706cW) {
        InterfaceC172477mG c23814AgP;
        boolean A0E = A0E(false);
        if ((A0A() || A0D(false) || A09()) && !A0E) {
            c23814AgP = new C23814AgP(this.A09, (ViewGroup) this.A0D.getView());
        } else {
            final UserSession userSession = this.A0C;
            final Context context = this.A09;
            c23814AgP = new InterfaceC172477mG(context, userSession, enumC142706cW) { // from class: X.7mF
                public final int A00;
                public final IgdsMediaButton A01;

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v1, types: [X.6cX, java.lang.Object] */
                @Override // X.InterfaceC172477mG
                public final void EVs(Drawable drawable, String str) {
                    C14360o3.A0B(drawable, 0);
                    IgdsMediaButton igdsMediaButton = this.A01;
                    ?? obj = new Object();
                    obj.A01 = drawable;
                    igdsMediaButton.setStartAddOn(obj, str);
                }

                @Override // X.InterfaceC172477mG
                public final void EYm(EnumC151046r5 enumC151046r5) {
                    C14360o3.A0B(enumC151046r5, 0);
                    this.A01.A01 = enumC151046r5;
                }

                @Override // X.InterfaceC172477mG
                public final void EhO(EnumC142696cV enumC142696cV) {
                    C14360o3.A0B(enumC142696cV, 0);
                    this.A01.setWidthMode(enumC142696cV);
                }

                @Override // X.InterfaceC172477mG
                public final void A8Q(EnumC53232NgU enumC53232NgU) {
                    this.A01.setEndAddOn(EnumC53232NgU.A07);
                }

                @Override // X.InterfaceC172477mG
                public final IgdsMediaButton ACf() {
                    return this.A01;
                }

                @Override // X.InterfaceC172477mG
                public final View ACo() {
                    return this.A01;
                }

                @Override // X.InterfaceC172477mG
                public final int BEn() {
                    return this.A00;
                }

                @Override // X.InterfaceC172477mG
                public final int BF0() {
                    int ordinal = this.A01.A01.ordinal();
                    if (ordinal != 3) {
                        if (ordinal == 1 || ordinal != 4) {
                            return 24;
                        }
                        return 20;
                    }
                    return 38;
                }

                @Override // X.InterfaceC172477mG
                public final void ERQ(InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2) {
                    C8QC.A02(this.A01, interfaceC16660sJ, interfaceC16660sJ2);
                }

                @Override // X.InterfaceC172477mG
                public final void setEnabled(boolean z) {
                    this.A01.setEnabled(z);
                }

                @Override // X.InterfaceC172477mG
                public final void setLabel(String str) {
                    this.A01.setLabel(str);
                }

                @Override // X.InterfaceC172477mG
                public final void setVisibility(int i) {
                    this.A01.setVisibility(i);
                }

                {
                    IgdsMediaButton A00 = AbstractC186988Qr.A00(context, null);
                    if (enumC142706cW != null && C18U.A06(C06090Tz.A05, userSession, 36319871247654617L)) {
                        A00.setSegmentedButtonStyle(enumC142706cW);
                    }
                    C06090Tz c06090Tz = C06090Tz.A05;
                    if (C18U.A06(c06090Tz, userSession, 36319871247654617L) && C18U.A06(c06090Tz, userSession, 36319871248506593L)) {
                        A00.setSize(EnumC151046r5.A05);
                    }
                    this.A01 = A00;
                    this.A00 = A00.A01 == EnumC151046r5.A05 ? 20 : 24;
                }
            };
        }
        return c23814AgP;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001d, code lost:
    
        if (r1 == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean A0E(boolean r6) {
        /*
            r5 = this;
            r4 = 0
            boolean r0 = r5.A0D(r4)
            if (r0 == 0) goto L1f
            com.instagram.common.session.UserSession r3 = r5.A0C
            if (r6 == 0) goto L2d
            X.0Tz r2 = X.C06090Tz.A05
        Ld:
            r0 = 36314871907945348(0x81042f00230b84, double:3.02900945061216E-306)
            boolean r1 = X.C18U.A06(r2, r3, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            X.C14360o3.A0A(r0)
            if (r1 != 0) goto L2b
        L1f:
            boolean r0 = r5.A0A()
            if (r0 != 0) goto L2b
            boolean r0 = r5.A09()
            if (r0 == 0) goto L2c
        L2b:
            r4 = 1
        L2c:
            return r4
        L2d:
            X.0Tz r2 = X.C06090Tz.A06
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C172437mC.A0E(boolean):boolean");
    }

    @Override // X.C8Q5
    public final boolean D8c(View view, MotionEvent motionEvent) {
        C14360o3.A0B(view, 0);
        C14360o3.A0B(motionEvent, 1);
        RecyclerView recyclerView = ((C8Q6) this.A0V.getValue()).A00;
        if (recyclerView != null) {
            return recyclerView.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // X.C8Q5
    public final void ERk(GradientDrawable.Orientation orientation, int[] iArr, int i) {
        C14360o3.A0B(orientation, 0);
        C14360o3.A0B(iArr, 1);
        ((C8Q6) this.A0V.getValue()).A0t.A02(orientation, iArr, i);
    }

    @Override // X.C8Q5
    public final /* synthetic */ void EYd(boolean z) {
    }

    private final InterfaceC172477mG A00() {
        UserSession userSession = this.A0C;
        if (C18U.A06(C06090Tz.A05, userSession, 36318217685178403L)) {
            return this.A0d;
        }
        if (this.A0I == C81K.A05 && this.A0Q != null) {
            return this.A0i;
        }
        if (AbstractC63292u7.A00(userSession)) {
            return this.A0e;
        }
        return this.A0L;
    }

    private final void A02() {
        InterfaceC172477mG interfaceC172477mG = this.A0h;
        if (interfaceC172477mG != null) {
            interfaceC172477mG.setVisibility(8);
        }
        InterfaceC172477mG interfaceC172477mG2 = this.A0M;
        if (interfaceC172477mG2 != null) {
            interfaceC172477mG2.setVisibility(8);
        }
        InterfaceC172477mG interfaceC172477mG3 = this.A0L;
        if (interfaceC172477mG3 != null) {
            interfaceC172477mG3.setVisibility(8);
        }
        InterfaceC172477mG interfaceC172477mG4 = this.A0j;
        if (interfaceC172477mG4 != null) {
            interfaceC172477mG4.setVisibility(8);
        }
        InterfaceC172477mG interfaceC172477mG5 = this.A0g;
        if (interfaceC172477mG5 != null) {
            interfaceC172477mG5.setVisibility(8);
        }
        InterfaceC172477mG interfaceC172477mG6 = this.A0f;
        if (interfaceC172477mG6 != null) {
            interfaceC172477mG6.setVisibility(8);
        }
        InterfaceC172477mG interfaceC172477mG7 = this.A0e;
        if (interfaceC172477mG7 != null) {
            interfaceC172477mG7.setVisibility(8);
        }
        InterfaceC172477mG interfaceC172477mG8 = this.A0i;
        if (interfaceC172477mG8 != null) {
            interfaceC172477mG8.setVisibility(8);
        }
        InterfaceC172477mG interfaceC172477mG9 = this.A0d;
        if (interfaceC172477mG9 != null) {
            interfaceC172477mG9.setVisibility(8);
        }
        Object value = this.A0R.getValue();
        C14360o3.A07(value);
        ((View) value).setVisibility(8);
        ((View) this.A0T.getValue()).setVisibility(8);
        InterfaceC172477mG interfaceC172477mG10 = this.A0c;
        if (interfaceC172477mG10 != null) {
            interfaceC172477mG10.setVisibility(8);
        }
    }

    public static final void A03(Drawable drawable, final C172437mC c172437mC) {
        EnumC151046r5 enumC151046r5;
        final int i;
        int i2;
        Drawable drawable2;
        int i3;
        Drawable drawable3 = drawable;
        UserSession userSession = c172437mC.A0C;
        if (AbstractC172457mE.A00(userSession).booleanValue() && C18U.A06(C06090Tz.A05, userSession, 36319871248506593L)) {
            enumC151046r5 = EnumC151046r5.A05;
        } else {
            enumC151046r5 = EnumC151046r5.A04;
        }
        InterfaceC172477mG interfaceC172477mG = c172437mC.A0h;
        if (interfaceC172477mG != null) {
            interfaceC172477mG.EYm(enumC151046r5);
            if (c172437mC.A03) {
                Context context = c172437mC.A09;
                C14360o3.A0B(drawable3, 1);
                Drawable drawable4 = context.getDrawable(R.drawable.instagram_facebook_circle_filled_16);
                if (drawable4 != null) {
                    drawable4.setTint(context.getColor(R.color.igds_facebook_blue));
                }
                ShapeDrawable A05 = AbstractC172497mJ.A05(-1);
                drawable3.setBounds(0, 0, 84, 84);
                int width = drawable3.getBounds().width();
                if (width == 0) {
                    width = drawable3.getIntrinsicWidth();
                }
                if (drawable4 != null) {
                    i3 = drawable4.getIntrinsicWidth();
                } else {
                    i3 = 0;
                }
                int i4 = width - i3;
                int A04 = (int) AbstractC13880nE.A04(context, 1);
                LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable3, A05, drawable4});
                layerDrawable.setLayerInset(1, i4, i4, 0, 0);
                int i5 = i4 + A04;
                layerDrawable.setLayerInset(2, i5, i5, A04, A04);
                i = 2131977190;
                i2 = 2131977191;
                drawable2 = layerDrawable;
            } else {
                i = 2131977192;
                i2 = 2131977193;
                drawable2 = drawable3;
            }
            Context context2 = c172437mC.A09;
            interfaceC172477mG.EVs(AbstractC172527mM.A00(context2, drawable2, interfaceC172477mG.BF0(), interfaceC172477mG.BEn()), context2.getString(i));
            interfaceC172477mG.setLabel(context2.getString(i2));
            AbstractC010103p.A0B(interfaceC172477mG.ACo(), new C02V() { // from class: X.7mN
                @Override // X.C02V
                public final void A0Y(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                    C14360o3.A0B(view, 0);
                    C14360o3.A0B(accessibilityNodeInfoCompat, 1);
                    super.A0Y(view, accessibilityNodeInfoCompat);
                    AbstractC56952jT.A05(accessibilityNodeInfoCompat, C05F.A01);
                    C012804r c012804r = C012804r.A08;
                    Context context3 = C172437mC.this.A09;
                    C012804r c012804r2 = new C012804r(16, C02G.A01(context3).getString(i));
                    C012804r c012804r3 = new C012804r(32, C02G.A01(context3).getString(2131977196));
                    accessibilityNodeInfoCompat.addAction(c012804r2);
                    accessibilityNodeInfoCompat.addAction(c012804r3);
                }
            });
        }
    }

    public static final void A04(Drawable drawable, C172437mC c172437mC) {
        InterfaceC172477mG interfaceC172477mG = c172437mC.A0i;
        if (interfaceC172477mG != null) {
            Context context = c172437mC.A09;
            BitmapDrawable A00 = AbstractC172527mM.A00(context, drawable, interfaceC172477mG.BF0(), interfaceC172477mG.BEn());
            User user = c172437mC.A0Q;
            if (user != null) {
                String string = context.getString(2131963379, user.getUsername());
                C14360o3.A07(string);
                interfaceC172477mG.EVs(A00, string);
                interfaceC172477mG.setLabel(string);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public static final void A05(C187018Qu c187018Qu, C172437mC c172437mC, InterfaceC172477mG interfaceC172477mG) {
        String string;
        if (c187018Qu.A05) {
            string = c187018Qu.A02;
        } else {
            string = c172437mC.A09.getString(2131953287, Integer.valueOf(c187018Qu.A00));
            C14360o3.A07(string);
        }
        interfaceC172477mG.EVs(c172437mC.A00, string);
        interfaceC172477mG.setLabel(string);
        interfaceC172477mG.ERQ(new BAO(34, c187018Qu, c172437mC), new BAO(35, c187018Qu, c172437mC));
    }

    private final void A06(InterfaceC172477mG interfaceC172477mG) {
        UserSession userSession = this.A0C;
        C187018Qu c187018Qu = AbstractC186998Qs.A00(userSession).A02;
        if (c187018Qu != null && !c187018Qu.A04 && AbstractC172457mE.A00(userSession).booleanValue() && !C18U.A06(C06090Tz.A05, userSession, 36319871248047837L)) {
            List list = c187018Qu.A03;
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new SimpleImageUrl((String) it.next()));
            }
            if (!C14360o3.A0K(this.A07, arrayList) || !C14360o3.A0K(this.A05, Boolean.valueOf(c187018Qu.A05)) || !C14360o3.A0K(this.A06, c187018Qu.A02)) {
                boolean z = !C14360o3.A0K(this.A07, arrayList);
                this.A07 = arrayList;
                this.A05 = Boolean.valueOf(c187018Qu.A05);
                this.A06 = c187018Qu.A02;
                if (z) {
                    new C23598Acs(this.A0B.getModuleName(), arrayList, new C30172DRc(23, interfaceC172477mG, c187018Qu, this));
                }
                A05(c187018Qu, this, interfaceC172477mG);
                return;
            }
            return;
        }
        Context context = this.A09;
        LayerDrawable A03 = AbstractC172497mJ.A03(context, R.drawable.instagram_circle_star_pano_filled_24, 1);
        InterfaceC172477mG interfaceC172477mG2 = this.A0L;
        if (interfaceC172477mG2 != null) {
            interfaceC172477mG2.EVs(AbstractC172527mM.A00(context, A03, interfaceC172477mG2.BF0(), interfaceC172477mG2.BEn()), context.getString(2131977194));
        }
        String string = context.getString(2131977194);
        C14360o3.A07(string);
        interfaceC172477mG.setLabel(string);
        interfaceC172477mG.ERQ(new C206899Du(this, 13), new C207189Ex(5, this, c187018Qu));
        AbstractC010103p.A0B(interfaceC172477mG.ACo(), new C02V() { // from class: X.7mK
            @Override // X.C02V
            public final void A0Y(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                C14360o3.A0B(view, 0);
                C14360o3.A0B(accessibilityNodeInfoCompat, 1);
                super.A0Y(view, accessibilityNodeInfoCompat);
                AbstractC56952jT.A05(accessibilityNodeInfoCompat, C05F.A01);
                C012804r c012804r = C012804r.A08;
                Context context2 = C172437mC.this.A09;
                C012804r c012804r2 = new C012804r(16, C02G.A01(context2).getString(2131956240));
                C012804r c012804r3 = new C012804r(32, C02G.A01(context2).getString(2131961589));
                accessibilityNodeInfoCompat.addAction(c012804r2);
                accessibilityNodeInfoCompat.addAction(c012804r3);
            }
        });
    }

    private final void A07(IgdsMediaButton igdsMediaButton) {
        C81K c81k = this.A0I;
        if (c81k != C81K.A04 && c81k != C81K.A06) {
            C8QC.A02(igdsMediaButton, new C206899Du(this, 14), C172677mc.A00);
        } else {
            igdsMediaButton.setAlpha(0.5f);
        }
    }

    private final void A08(String str) {
        IgdsMediaButton igdsMediaButton = this.A0P;
        igdsMediaButton.setLabel(str);
        igdsMediaButton.A05();
        TextView textView = igdsMediaButton.A00;
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(textView.getCompoundDrawablesRelative()[0], (Drawable) null, (Drawable) null, (Drawable) null);
        textView.setGravity(17);
        IgdsMediaButton.A01(igdsMediaButton);
    }

    private final boolean A0A() {
        UserSession userSession = this.A0C;
        if (AbstractC172457mE.A00(userSession).booleanValue() || AbstractC63292u7.A00(userSession) || this.A0E.A02() || (A09() && this.A0I != C81K.A06)) {
            return false;
        }
        return A0C(this);
    }

    public static final boolean A0C(C172437mC c172437mC) {
        UserSession userSession = c172437mC.A0C;
        if (!C3DL.A01(userSession, true) || !C18U.A06(C06090Tz.A05, userSession, 36320279270007027L)) {
            return false;
        }
        return true;
    }

    private final boolean A0D(boolean z) {
        C06090Tz c06090Tz;
        C06090Tz c06090Tz2;
        UserSession userSession = this.A0C;
        if (!AbstractC172457mE.A00(userSession).booleanValue() && !A0C(this) && ((this.A0I != C81K.A05 || this.A0Q == null) && !AbstractC63292u7.A00(userSession) && !this.A0E.A02() && !A0A() && !A09())) {
            Boolean BBo = C17060sy.A01.A01(userSession).A03.BBo();
            if (BBo != null && BBo.booleanValue()) {
                if (z) {
                    c06090Tz2 = C06090Tz.A05;
                } else {
                    c06090Tz2 = C06090Tz.A06;
                }
                boolean A06 = C18U.A06(c06090Tz2, userSession, 36314871907355520L);
                C14360o3.A0A(Boolean.valueOf(A06));
                if (A06) {
                    return true;
                }
            }
            if (z) {
                c06090Tz = C06090Tz.A05;
            } else {
                c06090Tz = C06090Tz.A06;
            }
            boolean A062 = C18U.A06(c06090Tz, userSession, 36314871907486593L);
            C14360o3.A0A(Boolean.valueOf(A062));
            if (A062) {
                return true;
            }
        }
        return false;
    }

    @Override // X.C8Q5
    public final C8DO Auk() {
        C199028r5 c199028r5 = this.A01;
        if (c199028r5 != null) {
            return c199028r5.A00;
        }
        return (C8DO) this.A0A.A01;
    }

    @Override // X.C8Q5
    public final int Bu5() {
        int i;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup viewGroup = ((C8Q6) this.A0V.getValue()).A0Q;
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            i = marginLayoutParams.bottomMargin;
        } else {
            i = 0;
        }
        return i + viewGroup.getHeight();
    }

    @Override // X.C8Q5
    public final ArrayList CGj() {
        C8Q6 c8q6 = (C8Q6) this.A0V.getValue();
        ArrayList arrayList = new ArrayList();
        if (c8q6.A0U.getVisibility() == 0) {
            arrayList.add(EnumC172737mj.MUSIC_SELECTOR);
        }
        if (c8q6.A0N.getVisibility() == 0) {
            arrayList.add(EnumC172737mj.SAVE_TO_CAMERA_ROLL);
        }
        if (c8q6.A0k.CGb() == 0) {
            arrayList.add(EnumC172737mj.EFFECT_SELECTOR);
        }
        if (c8q6.A0J.getVisibility() == 0) {
            arrayList.add(EnumC172737mj.DOODLE);
        }
        if (c8q6.A0H.getVisibility() == 0) {
            arrayList.add(EnumC172737mj.STICKER);
        }
        ImageView imageView = c8q6.A0b;
        if (imageView != null && imageView.getVisibility() == 0) {
            arrayList.add(EnumC172737mj.TEXT);
        }
        if (((View) c8q6.A12.getValue()).getVisibility() == 0) {
            arrayList.add(EnumC172737mj.AI_MAGICMOD);
        }
        if (((View) c8q6.A14.getValue()).getVisibility() == 0) {
            arrayList.add(EnumC172737mj.AI_MAGICMOD_RESTYLE);
        }
        if (((View) c8q6.A11.getValue()).getVisibility() == 0) {
            arrayList.add(EnumC172737mj.AI_MAGICMOD_BACKDROP);
        }
        return arrayList;
    }

    @Override // X.C8Q5
    public final void Cp2() {
        C8Q6 c8q6 = (C8Q6) this.A0V.getValue();
        UserSession userSession = c8q6.A0f;
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        ImageView imageView = c8q6.A0b;
        if (imageView != null && imageView.getVisibility() == 0 && C14360o3.A0K(c8q6.A0r.A00(), C208509Kk.A00)) {
            InterfaceC19630xq interfaceC19630xq = A00.A01;
            if (interfaceC19630xq.getInt("stories_halloween_text_tool_nux_trigger_count", 0) < 6 && C18U.A06(C06090Tz.A05, userSession, 36331046752699536L)) {
                if (interfaceC19630xq.getInt("stories_halloween_text_tool_nux_trigger_count", 0) % 2 == 0) {
                    imageView.setBackground(null);
                    imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    AnonymousClass693 anonymousClass693 = c8q6.A0e;
                    imageView.setImageDrawable(anonymousClass693);
                    if (anonymousClass693 != null) {
                        anonymousClass693.A8x(new C23134AMw(c8q6));
                        anonymousClass693.E4S();
                    }
                }
                int i = interfaceC19630xq.getInt("stories_halloween_text_tool_nux_trigger_count", 0) + 1;
                InterfaceC19610xo ARD = interfaceC19630xq.ARD();
                ARD.E7D("stories_halloween_text_tool_nux_trigger_count", i);
                ARD.apply();
            }
        }
    }

    @Override // X.C8Q5
    public final void D2U(boolean z) {
        C195918ld c195918ld;
        C1809080s A00;
        ViewGroup viewGroup;
        EnumC199188rL enumC199188rL;
        EnumC199188rL enumC199188rL2;
        ((C8Q6) this.A0V.getValue()).A0Q(z);
        if (this.A0E.A01() && this.A0k && z) {
            InterfaceC172477mG interfaceC172477mG = this.A0L;
            if (interfaceC172477mG != null) {
                C8DN c8dn = this.A0F;
                View ACo = interfaceC172477mG.ACo();
                C8Y8 c8y8 = (C8Y8) c8dn.A00.A1z.get();
                if (c8y8 != null && c8y8.A0I.Cae()) {
                    AnonymousClass856 anonymousClass856 = c8y8.A0J;
                    if (!anonymousClass856.A00().A01) {
                        Object obj = c8y8.A0K.get();
                        C22P c22p = C22P.A2f;
                        C1809080s A002 = anonymousClass856.A00();
                        ViewGroup viewGroup2 = c8y8.A01;
                        if (obj == c22p) {
                            enumC199188rL2 = EnumC199188rL.A0M;
                        } else if (c8y8.A0E.A02.A01() == EnumC198268pb.A04) {
                            enumC199188rL2 = EnumC199188rL.A0N;
                        } else {
                            enumC199188rL2 = EnumC199188rL.A0O;
                        }
                        A002.A01(viewGroup2, ACo, enumC199188rL2);
                    }
                }
            }
            InterfaceC172477mG interfaceC172477mG2 = this.A0h;
            if (interfaceC172477mG2 != null) {
                C8DN c8dn2 = this.A0F;
                View ACo2 = interfaceC172477mG2.ACo();
                boolean z2 = this.A03;
                C8Y8 c8y82 = (C8Y8) c8dn2.A00.A1z.get();
                if (c8y82 != null) {
                    C196188m9 c196188m9 = ((C173037nH) c8y82.A0L.getValue()).A01;
                    if (c196188m9 != null) {
                        c195918ld = c196188m9.A03;
                    } else {
                        c195918ld = null;
                    }
                    if (c8y82.A0I.Cae()) {
                        AnonymousClass856 anonymousClass8562 = c8y82.A0J;
                        if (!anonymousClass8562.A00().A01 && c195918ld != null) {
                            if (z2) {
                                A00 = anonymousClass8562.A00();
                                viewGroup = c8y82.A01;
                                enumC199188rL = EnumC199188rL.A0R;
                            } else if (!C183688Ct.A0M(c8y82.A0A)) {
                                A00 = anonymousClass8562.A00();
                                viewGroup = c8y82.A01;
                                enumC199188rL = EnumC199188rL.A17;
                            }
                            A00.A03(viewGroup, ACo2, enumC199188rL, false);
                        }
                    }
                }
            }
            CallerContext callerContext = this.A0b;
            UserSession userSession = this.A0C;
            if (AbstractC200008t4.A01(this.A09, callerContext, userSession) && C18U.A06(C06090Tz.A05, userSession, 36329629413491148L)) {
                C196068lw.A00(userSession).A01(callerContext, new InterfaceC196338mP() { // from class: X.92b
                    @Override // X.InterfaceC196338mP
                    public final /* synthetic */ void DeN() {
                    }

                    @Override // X.InterfaceC196338mP
                    public final void DeO() {
                        AbstractC132005xa.A00(C172437mC.this.A0C).A01(null);
                    }
                }, "story_composer");
            } else {
                AbstractC132005xa.A00(userSession).A01(null);
            }
        }
    }

    @Override // X.C8Q5
    public final void DLm(boolean z) {
        ((C8Q6) this.A0V.getValue()).A0R(z);
    }

    @Override // X.C8Q5
    public final void EJi() {
        ((C8Q6) this.A0V.getValue()).A06 = false;
    }

    @Override // X.C8Q5
    public final void EJw() {
        ((C8Q6) this.A0V.getValue()).A0B = true;
    }

    @Override // X.C8Q5
    public final void EQA(boolean z) {
        C8Q6 c8q6 = (C8Q6) this.A0V.getValue();
        if (z || c8q6.A0g.CWW()) {
            C8QC.A05(new View[]{c8q6.A0g.getView()}, z);
        }
    }

    @Override // X.C8Q5
    public final void ERl(String str) {
        C184698Hk c184698Hk = ((C8Q6) this.A0V.getValue()).A0t;
        if (str != null) {
            Bitmap decodeFile = BitmapFactory.decodeFile(str);
            int i = (int) c184698Hk.A01;
            Bitmap A09 = C1NC.A09(decodeFile, i, i, 0, false);
            C14360o3.A07(A09);
            View view = c184698Hk.A02;
            C8FY c8fy = new C8FY(view.getContext().getResources(), A09);
            c8fy.A00();
            Drawable background = view.getBackground();
            if (background != null) {
                LayerDrawable layerDrawable = (LayerDrawable) background;
                layerDrawable.setDrawableByLayerId(R.id.fill, c8fy);
                layerDrawable.invalidateSelf();
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    @Override // X.C8Q5
    public final void EaK(String str, Integer num) {
        InterfaceC172477mG interfaceC172477mG = this.A0d;
        if (interfaceC172477mG != null) {
            interfaceC172477mG.setLabel(str);
        }
    }

    @Override // X.C8Q5
    public final void Eey(boolean z) {
        if (this.A03 != z) {
            this.A03 = z;
            A03(this.A0J.A00, this);
        }
        InterfaceC172477mG interfaceC172477mG = this.A0L;
        if (interfaceC172477mG != null) {
            A06(interfaceC172477mG);
        }
    }

    @Override // X.C8Q5
    public final boolean Ej6(float f, float f2) {
        C8Q6 c8q6 = (C8Q6) this.A0V.getValue();
        Rect rect = new Rect();
        RecyclerView recyclerView = c8q6.A00;
        if (recyclerView != null) {
            RectF rectF = AbstractC13880nE.A01;
            AbstractC13880nE.A0M(rectF, recyclerView);
            rectF.round(rect);
        }
        rect.top -= 50;
        rect.bottom += 50;
        if (recyclerView != null && recyclerView.getVisibility() == 0 && rect.contains((int) f, (int) f2)) {
            return true;
        }
        return false;
    }

    private final boolean A09() {
        if (AbstractC151756sL.A01()) {
            C37351oY A00 = AbstractC151756sL.A00();
            UserSession userSession = this.A0C;
            if (A00.A05(userSession) && AbstractC151756sL.A01()) {
                AbstractC151756sL.A00();
                if (C18U.A06(C06090Tz.A05, userSession, 36321043775300713L) && C37351oY.A00(userSession)) {
                    return true;
                }
            }
        }
        return false;
    }

    private final boolean A0B() {
        if (AbstractC151756sL.A01()) {
            AbstractC151756sL.A00();
            UserSession userSession = this.A0C;
            if (C18U.A06(C06090Tz.A05, userSession, 36321043775366250L) && C37351oY.A00(userSession)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:142:0x05d5, code lost:
    
        if (A09() == false) goto L144;
     */
    /* JADX WARN: Removed duplicated region for block: B:128:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x069e  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x06a4  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x06ae  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x06b2  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x06c5  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x06c9  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x06cf  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x06db  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x06df  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x06e5  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x06f3  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x06f7  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x06fd  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0703  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0709  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x070f  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0725  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x07c0  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x07c4  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x07c8  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x07cc  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x07d0  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x07d4  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x07d8  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x07dc  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x07e0  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x07e4  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x07e8  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x07ec  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0635  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0638  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C172437mC(android.app.Activity r51, android.content.Context r52, android.view.View r53, android.view.ViewStub r54, X.C9BW r55, X.AbstractC59962oe r56, X.C1819485e r57, X.InterfaceC11380iw r58, com.instagram.common.session.UserSession r59, X.C1810981l r60, X.C8Q4 r61, X.C8DN r62, com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r63, X.AnonymousClass840 r64, X.C81K r65, X.C172427mB r66, X.AnonymousClass856 r67, X.C183608Cl r68, X.C1828989k r69, boolean r70, boolean r71, boolean r72) {
        /*
            Method dump skipped, instructions count: 2044
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C172437mC.<init>(android.app.Activity, android.content.Context, android.view.View, android.view.ViewStub, X.9BW, X.2oe, X.85e, X.0iw, com.instagram.common.session.UserSession, X.81l, X.8Q4, X.8DN, com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider, X.840, X.81K, X.7mB, X.856, X.8Cl, X.89k, boolean, boolean, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x02ff, code lost:
    
        if (r1 != false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0412, code lost:
    
        if (r9 == X.C81K.A09) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x04e0, code lost:
    
        if (r13 != false) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0507, code lost:
    
        if (r12 != null) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0587, code lost:
    
        r8 = r12.A04.getValue();
        X.C14360o3.A07(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0596, code lost:
    
        if (((android.view.View) r8).getVisibility() != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x0598, code lost:
    
        r9 = r32.A0R.getValue();
        X.C14360o3.A07(r9);
        r8 = r32.A0S.getValue();
        X.C14360o3.A07(r8);
        r8 = new android.view.View[]{(android.view.View) r9, (android.view.View) r8};
        X.C14360o3.A0B(r8, 3);
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x05b6, code lost:
    
        r1 = r8[r9];
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x05b8, code lost:
    
        if (r1 == null) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x05ba, code lost:
    
        X.AbstractC125325le.A06(new android.view.View[]{r1}, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x05c1, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x05c3, code lost:
    
        if (r9 >= 2) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x0585, code lost:
    
        if (((android.view.View) r8).getVisibility() == 0) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0570, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r32.A0C, 36320180485300346L) == false) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0177, code lost:
    
        if (r43 != false) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01e6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0244  */
    /* JADX WARN: Type inference failed for: r12v4, types: [X.6cX, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v41, types: [X.6cX, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v47, types: [X.6cX, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v19, types: [X.6cX, java.lang.Object] */
    @Override // X.C8Q5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void FAQ(android.text.Spannable r33, X.AnonymousClass840 r34, X.EnumC1810181d r35, X.EnumC1810381f r36, java.lang.Integer r37, boolean r38, boolean r39, boolean r40, boolean r41, boolean r42, boolean r43, boolean r44, boolean r45, final boolean r46, boolean r47, boolean r48, boolean r49, boolean r50, boolean r51, boolean r52) {
        /*
            Method dump skipped, instructions count: 1564
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C172437mC.FAQ(android.text.Spannable, X.840, X.81d, X.81f, java.lang.Integer, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }
}
