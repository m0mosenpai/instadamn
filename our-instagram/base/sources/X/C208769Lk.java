package X;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import com.facebook.R;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.camera.mpfacade.touch.TouchEventForwardingView;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.blur.BlurUtil;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.layout.MultiTouchRecyclerView;
import com.instagram.creation.photo.crop.LayoutImageView;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.ui.widget.shutterbutton.ShutterButton;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/* renamed from: X.9Lk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C208769Lk implements InterfaceC71977XDk, C8HK, InterfaceC1810781j {
    public static final C55942hf A0f = C55942hf.A03(4.0d, 15.0d);
    public AnonymousClass834 A00;
    public EnumC172837mv A01;
    public Integer A02;
    public boolean A03;
    public final double A04;
    public final float A05;
    public final float A06;
    public final int A07;
    public final Context A08;
    public final View A09;
    public final ImageView A0A;
    public final ConstraintLayout A0B;
    public final ConstraintLayout A0C;
    public final GridLayoutManager A0D;
    public final C174757qB A0E;
    public final C1815383g A0F;
    public final TouchEventForwardingView A0G;
    public final UserSession A0H;
    public final C1GL A0I;
    public final C1810981l A0J;
    public final TargetViewSizeProvider A0K;
    public final C8C0 A0L;
    public final C66017TyF A0M;
    public final MultiTouchRecyclerView A0N;
    public final MultiTouchRecyclerView A0O;
    public final C210089Qx A0P;
    public final C8IW A0Q;
    public final InterfaceC1810081c A0R;
    public final LayoutImageView A0S;
    public final ShutterButton A0T;
    public final String A0U;
    public final ArrayList A0V;
    public final Queue A0W;
    public final Queue A0X;
    public final InterfaceC09390do A0Y;
    public final View A0Z;
    public final View A0a;
    public final ViewStub A0b;
    public final C8SB A0c;
    public final C8HI A0d;
    public final AnonymousClass825 A0e;

    private final void A0H(EnumC172837mv enumC172837mv) {
        A0E(this, false);
        if (!A0J(this)) {
            A0C(this, enumC172837mv);
        }
        this.A01 = enumC172837mv;
        GridLayoutManager gridLayoutManager = this.A0D;
        gridLayoutManager.A1v(enumC172837mv.A00);
        AbstractC154146wP abstractC154146wP = this.A01.A04;
        if (abstractC154146wP == null) {
            abstractC154146wP = new AbstractC154146wP();
        }
        gridLayoutManager.A01 = abstractC154146wP;
        C22918A8o A01 = A01(this);
        if (A0J(this)) {
            A06(this);
            A0A(this, 0);
        } else {
            int i = (int) A01.A03;
            int i2 = (int) A01.A00;
            B8R b8r = new B8R(this, 13);
            this.A03 = false;
            A0G(this, false);
            A0B(this, i, i2);
            C11T.A04(new RunnableC208829Lq(this, b8r), 100L);
        }
        A0I(A01, A01, false);
    }

    private final AnonymousClass834 A00() {
        ViewStub viewStub;
        AnonymousClass834 anonymousClass834 = this.A00;
        if (anonymousClass834 == null) {
            View findViewById = this.A0a.findViewById(R.id.mid_capture_cancel_button);
            if (findViewById != null || ((viewStub = this.A0b) != null && (findViewById = viewStub.inflate()) != null)) {
                AnonymousClass834 anonymousClass8342 = new AnonymousClass834(findViewById);
                C184708Hl Csh = anonymousClass8342.Csh();
                Csh.A00 = new C23741AfE(this, 1);
                Csh.A00();
                this.A00 = anonymousClass8342;
                return anonymousClass8342;
            }
            throw AbstractC166997dE.A0g();
        }
        return anonymousClass834;
    }

    public static final C22918A8o A01(C208769Lk c208769Lk) {
        return c208769Lk.A0P.A04(c208769Lk.A01, c208769Lk.A0M.getItemCount());
    }

    public static final void A02(DialogInterface.OnClickListener onClickListener, C208769Lk c208769Lk) {
        C193328hC c193328hC = new C193328hC(c208769Lk.A08);
        c193328hC.A0A(2131964837);
        c193328hC.A09(2131964836);
        c193328hC.A0L(onClickListener, 2131964835);
        c193328hC.A0P(null, EnumC193348hE.A04, 2131964834);
        c193328hC.A04();
        AbstractC166987dD.A1W(c193328hC);
    }

    public static final void A03(Bitmap bitmap, C208769Lk c208769Lk, String str) {
        int i;
        CameraAREffect cameraAREffect;
        AbstractC224309vG A00;
        C66017TyF c66017TyF = c208769Lk.A0M;
        int itemCount = c66017TyF.getItemCount();
        C210089Qx c210089Qx = c208769Lk.A0P;
        C56302iJ A03 = c210089Qx.A03(c208769Lk.A01, itemCount);
        String str2 = null;
        if (A03 == null) {
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append("User imported single gallery photo but layoutParams is null. layoutConfiguration=");
            A1C.append(c208769Lk.A01.A05);
            A1C.append(" sectionIndex=");
            A1C.append(itemCount);
            A1C.append(" imagePreviewLayoutParamSize=");
            A1C.append(c210089Qx.A04.size());
            A1C.append(" cameraDestination=");
            C1810981l c1810981l = c208769Lk.A0J;
            A1C.append(C1810981l.A02(c1810981l).A02);
            A1C.append(" isVideoLayout=");
            A1C.append(C1810981l.A05(C81W.A0z, c1810981l));
            AbstractC12120kG.A07("LayoutCaptureController", A1C.toString(), null);
            return;
        }
        if (str != null && (A00 = AbstractC178007vZ.A00(null, c208769Lk.A0H, str, true)) != null) {
            str2 = A00.A02();
        }
        C22918A8o A01 = A01(c208769Lk);
        if (str == null) {
            i = 1;
            cameraAREffect = c208769Lk.A0F.A05.A09;
        } else {
            i = 0;
            cameraAREffect = null;
        }
        AAF aaf = new AAF(bitmap, null, A03, new C3AY(i, cameraAREffect), A01, null, str, str2);
        c66017TyF.A08.addLast(aaf);
        c66017TyF.notifyItemInserted(r0.size() - 1);
        A0D(c208769Lk, A01);
    }

    public static final void A04(View view, C3AY c3ay, C208769Lk c208769Lk) {
        Number number = (Number) c3ay.A00;
        if (AbstractC166987dD.A1a(c3ay.A01)) {
            AbstractC125325le A00 = AbstractC125325le.A00(view);
            A00.A0G();
            AbstractC125325le A0A = A00.A0A();
            C14360o3.A0A(number);
            float floatValue = number.floatValue();
            A0A.A0P(floatValue, AbstractC166987dD.A07(c208769Lk.A0Z) / 2.0f);
            A0A.A0Q(floatValue, 0.0f);
            A0A.A0H();
            return;
        }
        float floatValue2 = number.floatValue();
        view.setScaleX(floatValue2);
        view.setScaleY(floatValue2);
        view.setPivotX(AbstractC166987dD.A07(c208769Lk.A0Z) / 2.0f);
        view.setPivotY(0.0f);
    }

    public static final void A05(C81W c81w, C208769Lk c208769Lk, int i) {
        String str;
        C81W c81w2 = C81W.A10;
        if (c81w == c81w2) {
            if (!C1810981l.A05(C81W.A0z, c208769Lk.A0J)) {
                return;
            }
        }
        if (c81w == C81W.A0U) {
            if (!C1810981l.A05(C81W.A0T, c208769Lk.A0J)) {
                return;
            }
        }
        List list = c208769Lk.A0P.A01;
        if (list.size() <= i) {
            if (c81w == c81w2) {
                str = "video layout variants";
            } else {
                str = "layout variants";
            }
            AbstractC12120kG.A07("LayoutCaptureController.handleLayoutConfigurationChange", AnonymousClass001.A0y("Assign to ig_camera_experience_formats_android Oncall. cameraTool: ", str, ". index: ", ". getActiveLayoutConfigurations().size: ", i, list.size()), null);
            return;
        }
        EnumC172837mv enumC172837mv = (EnumC172837mv) list.get(i);
        if (enumC172837mv == c208769Lk.A01) {
            return;
        }
        C174757qB c174757qB = c208769Lk.A0E;
        if (c174757qB.CWZ()) {
            c174757qB.A07();
        }
        AnonymousClass229.A01(c208769Lk.A0H).A0I();
        c208769Lk.A0H(enumC172837mv);
    }

    public static final void A06(C208769Lk c208769Lk) {
        C210089Qx c210089Qx = c208769Lk.A0P;
        List A00 = C210089Qx.A00(c210089Qx, c208769Lk.A01);
        if (A00 != null) {
            int size = A00.size();
            for (int i = 0; i < size; i++) {
                LayoutInflater from = LayoutInflater.from(c208769Lk.A08);
                ConstraintLayout constraintLayout = c208769Lk.A0C;
                View inflate = from.inflate(R.layout.layout_flash_overlay, (ViewGroup) constraintLayout, false);
                C56302iJ A03 = c210089Qx.A03(c208769Lk.A01, i);
                if (A03 != null) {
                    inflate.setLayoutParams(A03);
                    inflate.setBackgroundColor(-1291845632);
                    inflate.setVisibility(0);
                    constraintLayout.addView(inflate);
                    c208769Lk.A0V.add(inflate);
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            }
            return;
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A07(X.C208769Lk r6) {
        /*
            X.TyF r2 = r6.A0M
            int r1 = r2.getItemCount()
            X.9Qx r5 = r6.A0P
            X.7mv r0 = r6.A01
            r3 = 0
            java.util.List r0 = X.C210089Qx.A00(r5, r0)
            if (r0 == 0) goto L7e
            int r0 = r0.size()
            r4 = 1
            if (r1 != r0) goto L6f
            X.7mv r1 = r6.A01
            int r0 = r2.getItemCount()
            int r0 = r0 - r4
            X.A8o r1 = r5.A04(r1, r0)
            boolean r0 = A0J(r6)
            if (r0 == 0) goto L31
            int r0 = r2.getItemCount()
            int r0 = r0 - r4
        L2e:
            A0A(r6, r0)
        L31:
            A0G(r6, r4)
            X.A8o r0 = A01(r6)
            r6.A0I(r1, r0, r4)
            int r0 = r2.getItemCount()
            if (r0 == 0) goto L4c
            int r1 = r2.getItemCount()
            X.7mv r0 = r6.A01
            int r0 = r0.A03
            int r0 = r0 - r4
            if (r1 != r0) goto L56
        L4c:
            X.81c r1 = r6.A0R
            X.8Tb r0 = new X.8Tb
            r0.<init>()
            r1.E4u(r0)
        L56:
            int r0 = r2.getItemCount()
            if (r0 != 0) goto L6b
            X.8IW r2 = r6.A0Q
            r0 = -1
            X.05A r1 = r2.A07
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.Egh(r0)
            r2.A01(r3)
        L6b:
            A09(r6)
            return
        L6f:
            X.A8o r1 = A01(r6)
            boolean r0 = A0J(r6)
            if (r0 == 0) goto L31
            int r0 = r2.getItemCount()
            goto L2e
        L7e:
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C208769Lk.A07(X.9Lk):void");
    }

    public static final void A08(C208769Lk c208769Lk) {
        c208769Lk.A0T.setVisibility(0);
        c208769Lk.A0C.setVisibility(8);
        c208769Lk.A0N.setVisibility(8);
        c208769Lk.A0B.setVisibility(8);
        c208769Lk.A0A.setVisibility(8);
        A0E(c208769Lk, false);
        AbstractC167027dH.A17(c208769Lk.A0Y);
    }

    public static final void A09(C208769Lk c208769Lk) {
        c208769Lk.A0T.setMultiCaptureProgress(c208769Lk.A0M.getItemCount() / c208769Lk.A01.A03);
    }

    public static final void A0A(C208769Lk c208769Lk, int i) {
        ArrayList arrayList = c208769Lk.A0V;
        int size = arrayList.size();
        for (int i2 = i + 1; i2 < size; i2++) {
            ((View) arrayList.get(i2)).setVisibility(0);
        }
        View view = (View) arrayList.get(i);
        if (view != null) {
            view.setVisibility(4);
        }
    }

    public static final void A0C(C208769Lk c208769Lk, EnumC172837mv enumC172837mv) {
        View inflate;
        C210089Qx c210089Qx = c208769Lk.A0P;
        C14360o3.A0B(enumC172837mv, 0);
        Object obj = c210089Qx.A03.get(enumC172837mv);
        if (obj != null) {
            for (ViewGroup.LayoutParams layoutParams : (List) obj) {
                Queue queue = c208769Lk.A0X;
                if (!queue.isEmpty()) {
                    inflate = (View) queue.poll();
                } else {
                    inflate = LayoutInflater.from(c208769Lk.A08).inflate(R.layout.layout_format_section_divider, (ViewGroup) c208769Lk.A0B, false);
                }
                if (inflate != null) {
                    inflate.setLayoutParams(layoutParams);
                    inflate.setAlpha(0.0f);
                    inflate.animate().alpha(1.0f).setDuration(500L);
                    c208769Lk.A0B.addView(inflate);
                }
            }
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public static final void A0D(C208769Lk c208769Lk, C22918A8o c22918A8o) {
        Object obj;
        C66017TyF c66017TyF = c208769Lk.A0M;
        int itemCount = c66017TyF.getItemCount();
        List A00 = C210089Qx.A00(c208769Lk.A0P, c208769Lk.A01);
        if (A00 != null) {
            int size = A00.size();
            boolean A0J = A0J(c208769Lk);
            if (itemCount < size) {
                if (A0J) {
                    A0A(c208769Lk, c66017TyF.getItemCount());
                }
                c208769Lk.A0I(c22918A8o, A01(c208769Lk), true);
            } else {
                if (A0J) {
                    Iterator A13 = AbstractC166997dE.A13(c208769Lk.A0V);
                    while (A13.hasNext()) {
                        ((View) AbstractC166997dE.A0l(A13)).setVisibility(4);
                    }
                }
                ConstraintLayout constraintLayout = c208769Lk.A0C;
                int childCount = constraintLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = constraintLayout.getChildAt(i);
                    if (childAt.getTag(320099960) != null) {
                        constraintLayout.removeView(childAt);
                    }
                }
                InterfaceC1810081c interfaceC1810081c = c208769Lk.A0R;
                if (C1810981l.A05(C81W.A0z, c208769Lk.A0J)) {
                    obj = new Object();
                } else {
                    obj = new Object();
                }
                interfaceC1810081c.E4u(obj);
                C23031Ai A002 = AbstractC23021Ah.A00(c208769Lk.A0H);
                InterfaceC16530ry interfaceC16530ry = A002.A3l;
                C0YR[] c0yrArr = C23031Ai.A8c;
                if (!AbstractC167017dG.A1b(A002, interfaceC16530ry, c0yrArr, 19)) {
                    AbstractC167007dF.A1L(A002, interfaceC16530ry, c0yrArr, 19, true);
                    Context context = c208769Lk.A08;
                    View inflate = LayoutInflater.from(context).inflate(R.layout.quick_capture_nux_message_box, (ViewGroup) constraintLayout, false);
                    C14360o3.A0C(inflate, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                    AbstractC13880nE.A0f(inflate, AbstractC166987dD.A0C(context, 52));
                    C0fQ.A00(new ViewOnClickListenerC48066LPr(35, inflate, c208769Lk), inflate.requireViewById(R.id.nux_ok_button));
                    AbstractC166987dD.A1P(context, AbstractC166997dE.A0T(inflate, R.id.nux_title), 2131964841);
                    AbstractC166987dD.A1P(context, AbstractC166997dE.A0T(inflate, R.id.nux_message), 2131964840);
                    constraintLayout.addView(inflate);
                    inflate.setAlpha(0.0f);
                    inflate.animate().alpha(1.0f).start();
                }
            }
            A09(c208769Lk);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public static final void A0E(C208769Lk c208769Lk, boolean z) {
        ConstraintLayout constraintLayout = c208769Lk.A0B;
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            c208769Lk.A0X.offer(constraintLayout.getChildAt(i));
        }
        constraintLayout.removeAllViews();
        c208769Lk.A0C.removeAllViews();
        c208769Lk.A0V.clear();
        C66017TyF c66017TyF = c208769Lk.A0M;
        c66017TyF.A09.clear();
        LinkedList linkedList = c66017TyF.A08;
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            Bitmap bitmap = ((AAF) it.next()).A00;
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
        linkedList.clear();
        c66017TyF.notifyDataSetChanged();
        C8IW c8iw = c208769Lk.A0Q;
        c8iw.A07.Egh(-1);
        c8iw.A01(false);
        C174757qB c174757qB = c208769Lk.A0E;
        if (z) {
            View view = c174757qB.A0F;
            C14360o3.A07(view);
            AbstractC185998Mt.A02(view, view.getWidth());
        } else {
            View view2 = c174757qB.A0F;
            C14360o3.A07(view2);
            AbstractC185998Mt.A00(view2);
        }
    }

    public static final void A0F(C208769Lk c208769Lk, boolean z) {
        c208769Lk.A01 = EnumC172837mv.A0I;
        ShutterButton shutterButton = c208769Lk.A0T;
        shutterButton.setMode(EnumC131445wb.A04);
        c208769Lk.A0C.setVisibility(8);
        c208769Lk.A0N.setVisibility(8);
        c208769Lk.A0B.setVisibility(8);
        c208769Lk.A0A.setVisibility(8);
        if (z) {
            AnonymousClass229.A01(c208769Lk.A0H).A0c();
        }
        shutterButton.setEnabled(true);
    }

    public static final void A0G(C208769Lk c208769Lk, boolean z) {
        View A00 = c208769Lk.A0E.A0H.A00();
        int i = 4;
        if (z) {
            i = 0;
        }
        A00.setVisibility(i);
    }

    private final void A0I(C22918A8o c22918A8o, C22918A8o c22918A8o2, boolean z) {
        float f;
        float f2;
        float f3 = c22918A8o2.A02;
        float f4 = c22918A8o.A03;
        Float valueOf = Float.valueOf(f4);
        float f5 = c22918A8o2.A03;
        Float valueOf2 = Float.valueOf(f5);
        float f6 = c22918A8o.A00;
        Float valueOf3 = Float.valueOf(f6);
        float f7 = c22918A8o2.A00;
        Float valueOf4 = Float.valueOf(f7);
        boolean A05 = C1810981l.A05(C81W.A0z, this.A0J);
        if (z) {
            if (!A05) {
                float f8 = f3 + f7;
                float f9 = this.A07;
                if (f8 < f9) {
                    f2 = 0.0f;
                } else {
                    f2 = f8 - f9;
                }
                f3 -= f2;
                C9M4.A01(this.A0C, this, f2);
            }
            if (!A0J(this)) {
                float f10 = c22918A8o2.A01;
                if (valueOf != null) {
                    if (valueOf3 != null) {
                        if (valueOf2 != null) {
                            if (valueOf4 != null) {
                                if (f4 / f6 != f5 / f7) {
                                    this.A0T.setEnabled(false);
                                }
                                AbstractC125325le A01 = AbstractC125325le.A01(this.A0E.A0F, 0);
                                A01.A0G();
                                AbstractC125325le A0A = A01.A0E(A0f).A0A();
                                A0A.A0R(f4, f5);
                                A0A.A0N(f6, f7);
                                A0A.A0J(f10);
                                A0A.A0K(f3);
                                A0A.A05 = new C44065Jdq(this, 7);
                                A0A.A0H();
                                TouchEventForwardingView touchEventForwardingView = this.A0G;
                                touchEventForwardingView.setTranslationX(f10);
                                touchEventForwardingView.setTranslationY(f3);
                                AbstractC13880nE.A0h(touchEventForwardingView, (int) f5, (int) f7);
                                return;
                            }
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            return;
        }
        if (!A05) {
            float f11 = f3 + f7;
            float f12 = this.A07;
            if (f11 < f12) {
                f = 0.0f;
            } else {
                f = f11 - f12;
            }
            f3 -= f;
            float f13 = -f;
            this.A0C.setTranslationY(f13);
            this.A0N.setTranslationY(f13);
            this.A0B.setTranslationY(f13);
            this.A0A.setTranslationY(f13);
        }
        if (A0J(this)) {
            return;
        }
        float f14 = c22918A8o2.A01;
        View view = this.A0E.A0F;
        view.setTranslationX(f14);
        view.setTranslationY(f3);
        TouchEventForwardingView touchEventForwardingView2 = this.A0G;
        touchEventForwardingView2.setTranslationX(f14);
        touchEventForwardingView2.setTranslationY(f3);
    }

    public static final boolean A0J(C208769Lk c208769Lk) {
        if (C1810981l.A05(C81W.A0z, c208769Lk.A0J) && c208769Lk.A02 == C05F.A01) {
            return true;
        }
        return false;
    }

    public final void A0K(boolean z) {
        C81W c81w;
        EnumC172837mv[] enumC172837mvArr;
        ImageView imageView;
        int i;
        Bitmap bitmap;
        C81W c81w2;
        EnumC172837mv[] enumC172837mvArr2;
        C210099Qy c210099Qy;
        EnumC172837mv enumC172837mv;
        if (z && this.A0M.getItemCount() != 0) {
            return;
        }
        C1810981l c1810981l = this.A0J;
        C81W c81w3 = C81W.A0z;
        if (C1810981l.A05(c81w3, c1810981l)) {
            c81w = C81W.A10;
        } else {
            c81w = C81W.A0U;
        }
        EnumC172837mv[] enumC172837mvArr3 = AbstractC172827mu.A00;
        ArrayList A1E = AbstractC166987dD.A1E();
        C81W c81w4 = C81W.A10;
        if (c81w == c81w4) {
            enumC172837mvArr = AbstractC172827mu.A03;
        } else {
            AnonymousClass016.A18(A1E, AbstractC172827mu.A01);
            enumC172837mvArr = AbstractC172827mu.A02;
        }
        AnonymousClass016.A18(A1E, enumC172837mvArr);
        int size = A1E.size();
        C210089Qx c210089Qx = this.A0P;
        List list = c210089Qx.A01;
        if (size != list.size()) {
            c210089Qx.A02.clear();
            c210089Qx.A03.clear();
            c210089Qx.A04.clear();
            list.clear();
            if (C1810981l.A05(c81w3, c1810981l)) {
                c81w2 = c81w4;
            } else {
                c81w2 = C81W.A0U;
            }
            ArrayList A1E2 = AbstractC166987dD.A1E();
            if (c81w2 == c81w4) {
                enumC172837mvArr2 = AbstractC172827mu.A03;
            } else {
                AnonymousClass016.A18(A1E2, AbstractC172827mu.A01);
                enumC172837mvArr2 = AbstractC172827mu.A02;
            }
            AnonymousClass016.A18(A1E2, enumC172837mvArr2);
            Iterator it = A1E2.iterator();
            while (it.hasNext()) {
                EnumC172837mv enumC172837mv2 = (EnumC172837mv) it.next();
                AbstractC202018wg abstractC202018wg = AbstractC202018wg.$redex_init_class;
                switch (enumC172837mv2.ordinal()) {
                    case 0:
                        c210089Qx.A07();
                        continue;
                    case 1:
                        c210099Qy = c210089Qx.A00;
                        enumC172837mv = EnumC172837mv.A0E;
                        break;
                    case 2:
                        c210089Qx.A06();
                        continue;
                    case 3:
                        c210099Qy = c210089Qx.A00;
                        enumC172837mv = EnumC172837mv.A0D;
                        break;
                    case 4:
                        c210089Qx.A09();
                        continue;
                    case 5:
                        c210099Qy = c210089Qx.A00;
                        enumC172837mv = EnumC172837mv.A0B;
                        break;
                    case 6:
                        c210089Qx.A05();
                        continue;
                    case 7:
                        c210099Qy = c210089Qx.A00;
                        enumC172837mv = EnumC172837mv.A0A;
                        break;
                    case 8:
                        c210089Qx.A08();
                        continue;
                    case 9:
                        c210099Qy = c210089Qx.A00;
                        enumC172837mv = EnumC172837mv.A0C;
                        break;
                    default:
                        AbstractC12120kG.A07("LayoutCaptureController", "Unsupported variant attempted to add", null);
                        continue;
                }
                C210089Qx.A01(c210089Qx, C210099Qy.A00(c210099Qy, enumC172837mv));
            }
        }
        this.A0C.setVisibility(0);
        this.A0N.setVisibility(0);
        this.A0B.setVisibility(0);
        C174757qB c174757qB = this.A0E;
        C174747qA c174747qA = c174757qB.A0H;
        boolean A1W = AbstractC167007dF.A1W(c174747qA.A00);
        int i2 = ((int) this.A06) / 10;
        int i3 = ((int) this.A05) / 10;
        if (A1W) {
            c174757qB.A0K(new C212659bY(this, 7), i2, i3);
        } else {
            TextureView textureView = c174747qA.A01;
            if (textureView != null && (bitmap = textureView.getBitmap(i2, i3)) != null) {
                BlurUtil.blurInPlace(bitmap, 6);
                imageView = this.A0A;
                imageView.setImageBitmap(bitmap);
                i = 0;
            } else {
                imageView = this.A0A;
                i = 8;
            }
            imageView.setVisibility(i);
        }
        EnumC172837mv enumC172837mv3 = this.A01;
        if (enumC172837mv3 != EnumC172837mv.A0I) {
            A0H(enumC172837mv3);
        }
        if (!C1810981l.A05(c81w3, c1810981l)) {
            c81w4 = C81W.A0U;
        }
        A05(c81w4, this, c1810981l.A06(c81w4));
        ShutterButton shutterButton = this.A0T;
        shutterButton.setMultiCaptureProgress(0.0f);
        shutterButton.setEnabled(true);
        if (!z) {
            return;
        }
        C448524p c448524p = AnonymousClass229.A01(this.A0H).A0D;
        InterfaceC02590Ai A0f2 = AbstractC166987dD.A0f(c448524p.A01, "ig_camera_start_session");
        if (!A0f2.isSampled()) {
            return;
        }
        A0f2.AAP("legacy_falco_event_name", "IG_CAMERA_START_LAYOUT_SESSION");
        A0f2.AAP("entity", "LAYOUT");
        C22M c22m = c448524p.A04;
        String str = c22m.A0L;
        if (str == null) {
            str = "";
        }
        AbstractC166987dD.A1S(A0f2, str);
        AbstractC166997dE.A1N(A0f2, "camera_position", AbstractC167017dG.A0I(c22m));
        AbstractC167007dF.A11(A0f2, c448524p);
        A0f2.A8R(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        AbstractC166997dE.A1N(A0f2, "event_type", 1);
        AbstractC167017dG.A1B(A0f2);
        A0f2.A8R(AnonymousClass249.PHOTO, "media_type");
        A0f2.AAP("search_session_id", c22m.A0P);
        AbstractC167027dH.A0s(EnumC50631MWs.A0J, A0f2, c22m, "surface");
        AbstractC167027dH.A0u(A0f2, "nav_chain", C1QM.A00.A02.A00);
    }

    @Override // X.C8HK
    public final C174757qB Ajx() {
        return this.A0d.A06;
    }

    @Override // X.InterfaceC71977XDk
    public final boolean CSU() {
        C1810981l c1810981l = this.A0J;
        if (C1810981l.A05(C81W.A0T, c1810981l)) {
            return true;
        }
        return C1810981l.A05(C81W.A0z, c1810981l);
    }

    @Override // X.InterfaceC71977XDk
    public final boolean CSk() {
        EnumC1810181d AuG = this.A0R.AuG();
        AbstractC202018wg abstractC202018wg = AbstractC202018wg.$redex_init_class;
        int ordinal = AuG.ordinal();
        if (ordinal != 48 && ordinal != 52 && ordinal != 8) {
            return false;
        }
        return true;
    }

    @Override // X.C8HK
    public final boolean CfS() {
        return this.A0d.CfS();
    }

    @Override // X.InterfaceC71977XDk
    public final void DDb() {
        this.A0N.A00 = false;
    }

    @Override // X.C8HK
    public final void DYP(String str) {
        C11T.A02(new RunnableC24378ArL(this));
    }

    @Override // X.C8HK
    public final void DYQ(C183978Ee c183978Ee) {
        this.A0d.DYQ(c183978Ee);
        C11T.A02(new RunnableC24379ArM(this));
    }

    @Override // X.InterfaceC71977XDk
    public final void Dnz(C3OO c3oo) {
        this.A0N.A00 = true;
        this.A0c.A07(c3oo);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
    
        if (r8 == r5) goto L12;
     */
    @Override // X.InterfaceC1810781j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void DoV(java.lang.Object r7, java.lang.Object r8, java.lang.Object r9) {
        /*
            r6 = this;
            X.81d r8 = (X.EnumC1810181d) r8
            r2 = 1
            X.C14360o3.A0B(r8, r2)
            X.81d r5 = X.EnumC1810181d.A0g
            r4 = 1
            r3 = 0
            r6.A03 = r2
            X.81d r0 = X.EnumC1810181d.A1N
            if (r8 == r0) goto L1f
            X.81d r0 = X.EnumC1810181d.A1P
            if (r8 == r0) goto L1f
            X.81d r0 = X.EnumC1810181d.A1O
            if (r8 == r0) goto L1f
            X.81d r0 = X.EnumC1810181d.A0f
            if (r8 == r0) goto L1f
            r1 = 0
            if (r8 != r5) goto L20
        L1f:
            r1 = 1
        L20:
            com.instagram.ui.widget.shutterbutton.ShutterButton r0 = r6.A0T
            r0.A0H = r1
            X.8wg r0 = X.AbstractC202018wg.$redex_init_class
            int r0 = r8.ordinal()
            switch(r0) {
                case 2: goto L6b;
                case 3: goto L6b;
                case 11: goto L85;
                case 47: goto L2e;
                case 48: goto L3e;
                case 50: goto L36;
                case 51: goto L36;
                case 52: goto L3e;
                default: goto L2d;
            }
        L2d:
            return
        L2e:
            X.834 r0 = r6.A00()
            r0.EhF(r2, r3)
            return
        L36:
            X.834 r0 = r6.A00()
            r0.EhF(r3, r3)
            return
        L3e:
            X.8C0 r0 = r6.A0L
            r0.A0B(r3)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r6.A0C
            r1 = 0
            X.C9M4.A01(r0, r6, r1)
            X.7qB r0 = r6.A0E
            android.view.View r0 = r0.A0F
            r0.setX(r1)
            r0.setY(r1)
            com.instagram.camera.mpfacade.touch.TouchEventForwardingView r0 = r6.A0G
            r0.setX(r1)
            r0.setY(r1)
            X.834 r1 = r6.A00()
            X.81d r0 = X.EnumC1810181d.A1O
            if (r8 != r0) goto L64
            r4 = 0
        L64:
            r1.EhF(r4, r3)
            A0G(r6, r3)
            return
        L6b:
            X.834 r0 = r6.A00()
            r0.EhF(r3, r3)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r6.A0B
            r0.setVisibility(r3)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r6.A0C
            r0.setVisibility(r3)
            com.instagram.creation.capture.quickcapture.layout.MultiTouchRecyclerView r0 = r6.A0N
            X.AbstractC167007dF.A0y(r0, r3)
            A0G(r6, r2)
            return
        L85:
            X.834 r0 = r6.A00()
            r0.EhF(r3, r3)
            float r0 = r6.A06
            int r1 = (int) r0
            float r0 = r6.A05
            int r0 = (int) r0
            A0B(r6, r1, r0)
            com.instagram.common.session.UserSession r0 = r6.A0H
            X.22C r0 = X.AnonymousClass229.A01(r0)
            r0.A0c()
            androidx.constraintlayout.widget.ConstraintLayout r0 = r6.A0B
            r1 = 8
            r0.setVisibility(r1)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r6.A0C
            r0.setVisibility(r1)
            com.instagram.creation.capture.quickcapture.layout.MultiTouchRecyclerView r0 = r6.A0N
            X.AbstractC166997dE.A1L(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C208769Lk.DoV(java.lang.Object, java.lang.Object, java.lang.Object):void");
    }

    public static final void A0B(C208769Lk c208769Lk, int i, int i2) {
        if (A0J(c208769Lk)) {
            i = (int) c208769Lk.A06;
            i2 = (int) c208769Lk.A05;
        }
        View view = c208769Lk.A0E.A0F;
        C14360o3.A07(view);
        AbstractC13880nE.A0h(view, i, i2);
        AbstractC13880nE.A0h(c208769Lk.A0G, i, i2);
    }

    public final void A0L(boolean z, boolean z2, boolean z3) {
        Bitmap bitmap;
        A0E(this, z3);
        ImageView imageView = this.A0A;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null && (drawable instanceof BitmapDrawable) && (bitmap = ((BitmapDrawable) drawable).getBitmap()) != null) {
            bitmap.recycle();
        }
        imageView.setImageBitmap(null);
        if (z2) {
            C9M4.A01(this.A0C, this, 0.0f);
            View view = this.A0E.A0F;
            view.setX(0.0f);
            view.setY(0.0f);
            TouchEventForwardingView touchEventForwardingView = this.A0G;
            touchEventForwardingView.setX(0.0f);
            touchEventForwardingView.setY(0.0f);
            int i = (int) this.A06;
            int i2 = (int) this.A05;
            C50168MDv c50168MDv = new C50168MDv(22, this, z);
            this.A03 = false;
            A0G(this, false);
            A0B(this, i, i2);
            C11T.A04(new RunnableC208829Lq(this, c50168MDv), 100L);
            return;
        }
        A0F(this, z);
    }

    public C208769Lk(Context context, View view, Fragment fragment, C174757qB c174757qB, C1815383g c1815383g, TouchEventForwardingView touchEventForwardingView, UserSession userSession, C1GL c1gl, C57012jc c57012jc, C1810981l c1810981l, TargetViewSizeProvider targetViewSizeProvider, C8HI c8hi, C8C0 c8c0, InterfaceC1810081c interfaceC1810081c, AnonymousClass825 anonymousClass825, ShutterButton shutterButton, String str) {
        C14360o3.A0B(userSession, 1);
        AbstractC167007dF.A1F(context, 2, interfaceC1810081c);
        AbstractC167007dF.A1I(c1815383g, 7, c8c0);
        C14360o3.A0B(c1810981l, 9);
        C14360o3.A0B(c1gl, 10);
        C14360o3.A0B(view, 11);
        C14360o3.A0B(touchEventForwardingView, 12);
        C14360o3.A0B(shutterButton, 13);
        C14360o3.A0B(anonymousClass825, 14);
        C14360o3.A0B(targetViewSizeProvider, 15);
        C14360o3.A0B(c57012jc, 16);
        C14360o3.A0B(fragment, 17);
        this.A0H = userSession;
        this.A08 = context;
        this.A0U = str;
        this.A0R = interfaceC1810081c;
        this.A0d = c8hi;
        this.A0E = c174757qB;
        this.A0F = c1815383g;
        this.A0L = c8c0;
        this.A0J = c1810981l;
        this.A0I = c1gl;
        this.A0a = view;
        this.A0G = touchEventForwardingView;
        this.A0T = shutterButton;
        this.A0e = anonymousClass825;
        this.A0K = targetViewSizeProvider;
        View A0U = AbstractC167017dG.A0U(view, R.id.layout_format_capture_container_stub);
        C14360o3.A0C(A0U, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        this.A0C = (ConstraintLayout) A0U;
        this.A0Y = AbstractC09440dt.A01(new B8R(this, 12));
        this.A0X = new LinkedList();
        this.A0W = new LinkedList();
        this.A0V = AbstractC166987dD.A1E();
        this.A01 = EnumC172837mv.A0I;
        this.A02 = C05F.A01;
        this.A03 = true;
        Context context2 = this.A08;
        C14360o3.A0C(context2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        C66017TyF c66017TyF = new C66017TyF(fragment, (FragmentActivity) context2, userSession, this, new C9GX(this, 0));
        this.A0M = c66017TyF;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(context, this.A01.A00);
        this.A0D = gridLayoutManager;
        MultiTouchRecyclerView multiTouchRecyclerView = (MultiTouchRecyclerView) c57012jc.A01();
        multiTouchRecyclerView.setLayoutManager(gridLayoutManager);
        multiTouchRecyclerView.setAdapter(c66017TyF);
        this.A0N = multiTouchRecyclerView;
        C8SB c8sb = new C8SB(new C210109Qz(c66017TyF));
        this.A0c = c8sb;
        c8sb.A0A(multiTouchRecyclerView);
        InterfaceC1812882f interfaceC1812882f = ((NineSixteenLayoutConfigImpl) targetViewSizeProvider).A0K;
        float height = interfaceC1812882f.getHeight();
        this.A05 = height;
        float width = interfaceC1812882f.getWidth();
        this.A06 = width;
        this.A04 = C04100Kb.A00(context) >= 2016 ? 1.0d : 1.333d;
        View inflate = ((ViewStub) view.findViewById(R.id.layout_camera_preview_animation_stub)).inflate();
        C14360o3.A0C(inflate, "null cannot be cast to non-null type com.instagram.creation.photo.crop.LayoutImageView");
        this.A0S = (LayoutImageView) inflate;
        this.A0b = (ViewStub) view.findViewById(R.id.layout_capture_cancel_button_stub);
        int[] iArr = new int[2];
        shutterButton.getLocationOnScreen(iArr);
        this.A07 = iArr[1];
        this.A0Z = view.requireViewById(R.id.camera_stub_constraint_layout);
        this.A0B = (ConstraintLayout) view.requireViewById(R.id.layout_format_divider_container);
        this.A09 = view.requireViewById(R.id.layout_format_capture_container);
        this.A0O = (MultiTouchRecyclerView) view.requireViewById(R.id.layout_format_capture_recycler_view);
        View inflate2 = ((ViewStub) view.findViewById(R.id.layout_format_capture_blurred_background_stub)).inflate();
        C14360o3.A0C(inflate2, "null cannot be cast to non-null type android.widget.ImageView");
        this.A0A = (ImageView) inflate2;
        this.A0P = new C210089Qx(context, width, height);
        C1810981l.A00(C81W.A0U, c1810981l).A00(new C208259Jk(this, 5));
        C1810981l.A00(C81W.A0q, c1810981l).A00(new C208259Jk(this, 6));
        C1810981l.A00(C81W.A10, c1810981l).A00(new C208259Jk(this, 7));
        interfaceC1810081c.A82(this);
        C8IW c8iw = (C8IW) new C52942bb(fragment).A00(C8IW.class);
        this.A0Q = c8iw;
        AbstractC18560vj.A03(C07Y.A00(fragment.getViewLifecycleOwner()), new C15340po(new B5g(this, null, 37), AbstractC07080Za.A03(c8iw.A04)));
        anonymousClass825.A03.A06(fragment, new BY8(4, new B8U(this, 24)));
        View view2 = c174757qB.A0F;
        C14360o3.A07(view2);
        view2.setOutlineProvider(null);
        view2.setClipToOutline(false);
    }
}
