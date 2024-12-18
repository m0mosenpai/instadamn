package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.ContentProvider;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.common.uigraph.UiGraph;
import com.instagram.compose.ui.gradientspinner.GradientSpinnerNode;
import com.instagram.direct.inbox.notes.NotesApi;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.ui.widget.slideouticon.SlideInAndOutIconView;
import go.Seq;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9E0, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9E0 extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9E0(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0004. Please report as an issue. */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        boolean isEmpty;
        View view;
        Object obj;
        Object obj2;
        C75113Zb c75113Zb;
        C38321qM A1e;
        java.util.Set keySet;
        Reference reference;
        Object obj3;
        String obj4;
        switch (this.A00) {
            case 0:
                android.net.Uri data = ((Intent) this.A01).getData();
                if (data != null && (obj4 = data.toString()) != null) {
                    return obj4;
                }
                return "";
            case 1:
                return new C1ZW(C18950wb.A01, (UserSession) this.A01);
            case 2:
                if (!C14360o3.A0K(C1XM.A00, Thread.currentThread())) {
                    throw new IllegalStateException("LazyUi block must be accessed only on UI thread.");
                }
                return ((InterfaceC16820sZ) this.A01).invoke();
            case 3:
                C62782tH c62782tH = (C62782tH) this.A01;
                synchronized (c62782tH.A02) {
                    if (!c62782tH.A03) {
                        c62782tH.A01.contains("dummy");
                        c62782tH.A03 = true;
                    }
                }
                return C0eB.A00;
            case 4:
                SlideInAndOutIconView slideInAndOutIconView = (SlideInAndOutIconView) ((C3W4) this.A01).A00().requireViewById(R.id.indicator);
                slideInAndOutIconView.A03 = C3WD.END;
                return slideInAndOutIconView;
            case 5:
                Object systemService = ((C2AV) this.A01).A02.getSystemService("sensor");
                C14360o3.A0C(systemService, AbstractC43591JPw.A00(432));
                return systemService;
            case 6:
                obj = C1MS.A0B;
                C23111Aq c23111Aq = ((C1B4) this.A01).A01;
                synchronized (obj) {
                    C14360o3.A0B(c23111Aq, 0);
                    Object obj5 = C1MS.A0A;
                    obj2 = obj5;
                    if (obj5 == null) {
                        C1MS c1ms = new C1MS(c23111Aq);
                        C1MS.A0A = c1ms;
                        C218914p.A05(c1ms);
                        obj2 = c1ms;
                        if (C1MY.A01()) {
                            C1MY.A00().EDD(c1ms);
                            obj2 = c1ms;
                        }
                    }
                    return obj2;
                }
            case 7:
                obj = C23485Ab0.A04;
                C23111Aq c23111Aq2 = ((C1B4) this.A01).A01;
                synchronized (obj) {
                    C14360o3.A0B(c23111Aq2, 0);
                    Object obj6 = C23485Ab0.A03;
                    obj2 = obj6;
                    if (obj6 == null) {
                        C23485Ab0 c23485Ab0 = new C23485Ab0(c23111Aq2);
                        C23485Ab0.A03 = c23485Ab0;
                        obj2 = c23485Ab0;
                    }
                    return obj2;
                }
            case 8:
                return new C23484Aaz(((C1B4) this.A01).A01);
            case 9:
                return C25481Mc.A01.A00(((C1B4) this.A01).A01);
            case 10:
                ((Handler) C11T.A02.getValue()).post((Runnable) this.A01);
                return C0eB.A00;
            case 11:
                ((IgImageView) this.A01).A0N = true;
                return C0eB.A00;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                ((IgImageView) this.A01).A0O = true;
                return C0eB.A00;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                ((IgImageView) this.A01).A0L = true;
                return C0eB.A00;
            case 14:
                final C3I8 c3i8 = (C3I8) this.A01;
                return new AbstractC18730w0() { // from class: X.9ga
                    @Override // X.AbstractC18730w0, X.InterfaceC12850lX
                    public final void Cuy(Activity activity) {
                        C14360o3.A0B(activity, 0);
                        C3I8 c3i82 = C3I8.this;
                        WeakReference weakReference = c3i82.A08;
                        if (weakReference != null) {
                            Object obj7 = weakReference.get();
                            if (obj7 == null || activity.equals(obj7)) {
                                c3i82.onDestroy();
                            }
                        }
                    }

                    @Override // X.AbstractC18730w0, X.InterfaceC12850lX
                    public final void Cv0(Activity activity) {
                        C14360o3.A0B(activity, 0);
                        C3I8 c3i82 = C3I8.this;
                        WeakReference weakReference = c3i82.A08;
                        if (weakReference != null) {
                            Object obj7 = weakReference.get();
                            if (obj7 == null || activity.equals(obj7)) {
                                c3i82.onStop();
                            }
                        }
                    }

                    @Override // X.AbstractC18730w0, X.InterfaceC12850lX
                    public final void Cv5(Activity activity) {
                        C14360o3.A0B(activity, 0);
                        C3I8 c3i82 = C3I8.this;
                        WeakReference weakReference = c3i82.A08;
                        if (weakReference != null) {
                            Activity activity2 = (Activity) weakReference.get();
                            if (activity.equals(activity2)) {
                                c3i82.Dnr(activity2);
                            }
                        }
                    }
                };
            case Process.SIGTERM /* 15 */:
                C55982hj A02 = AbstractC13560mi.A00().A02();
                ReboundViewPager reboundViewPager = (ReboundViewPager) this.A01;
                A02.A09((C55942hf) reboundViewPager.A0v.get(C3VY.A03));
                A02.A00 = 0.001d;
                A02.A02 = 0.005d;
                A02.A0A(reboundViewPager);
                return A02;
            case 16:
                C56382iW c56382iW = (C56382iW) this.A01;
                if (!c56382iW.A02 && !C14360o3.A0K(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                    throw new IllegalStateException("To use ViewStubber from a background thread, you must specify allowBackgroundThread=true.");
                }
                if (c56382iW.CWW()) {
                    View view2 = c56382iW.A00;
                    C14360o3.A0C(view2, "null cannot be cast to non-null type T of com.instagram.common.ui.widget.viewstubholder.ViewStubberImpl");
                    return view2;
                }
                ViewStub viewStub = c56382iW.A01;
                if (viewStub != null) {
                    view = viewStub.inflate();
                } else {
                    view = null;
                }
                C14360o3.A0C(view, "null cannot be cast to non-null type T of com.instagram.common.ui.widget.viewstubholder.ViewStubberImpl");
                c56382iW.A00 = view;
                c56382iW.A01 = null;
                return view;
            case 17:
                C3ZP c3zp = (C3ZP) this.A01;
                c3zp.A02.clear();
                c3zp.A00 = null;
                C3ZP.A01(c3zp);
                return C0eB.A00;
            case 18:
                C3ZP c3zp2 = (C3ZP) this.A01;
                if (c3zp2.A01.A03) {
                    C9BW c9bw = (C9BW) c3zp2.A03.getValue();
                    keySet = (java.util.Set) c9bw.A00;
                    reference = (Reference) c9bw.A01;
                } else {
                    keySet = c3zp2.A02.keySet();
                    reference = c3zp2.A00;
                }
                if (!keySet.isEmpty()) {
                    ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(keySet, 10));
                    Iterator it = keySet.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new C09530e4(it.next(), 0));
                    }
                    return arrayList;
                }
                if (reference != null && (obj3 = reference.get()) != null) {
                    List singletonList = Collections.singletonList(new C09530e4(obj3, 0));
                    C14360o3.A07(singletonList);
                    return singletonList;
                }
                return C16930sl.A00;
            case Process.SIGSTOP /* 19 */:
                C3ZP c3zp3 = (C3ZP) this.A01;
                boolean z = true;
                if (c3zp3.A01.A03) {
                    isEmpty = ((java.util.Set) ((C9BW) c3zp3.A03.getValue()).A00).isEmpty();
                } else {
                    isEmpty = c3zp3.A02.isEmpty();
                }
                if (isEmpty) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 20:
                UiGraph uiGraph = (UiGraph) this.A01;
                return AbstractC011604e.A00(C05F.A00, AnonymousClass111.A02(new MU8(uiGraph, (InterfaceC23621Ds) null, 10), ((C42981yQ) uiGraph).A01), -1);
            case 21:
                GradientSpinnerNode gradientSpinnerNode = (GradientSpinnerNode) this.A01;
                boolean booleanValue = ((Boolean) gradientSpinnerNode.A01.A09.getValue()).booleanValue();
                C23671Dx c23671Dx = null;
                AnonymousClass195 anonymousClass195 = gradientSpinnerNode.A05;
                if (booleanValue) {
                    if (anonymousClass195 == null) {
                        c23671Dx = AbstractC23641Du.A04(AnonymousClass191.A00, new MBT(gradientSpinnerNode, null, 33), gradientSpinnerNode.A05());
                    }
                    return C0eB.A00;
                }
                if (anonymousClass195 != null) {
                    anonymousClass195.AGH(null);
                }
                gradientSpinnerNode.A05 = c23671Dx;
                return C0eB.A00;
            case 22:
                UserSession userSession = (UserSession) this.A01;
                C14360o3.A0B(userSession, 0);
                return new C4F0(userSession, (C4F2) userSession.A01(C4F2.class, C4F1.A00));
            case 23:
                UserSession userSession2 = ((C4F0) this.A01).A00;
                return new NotesApi(userSession2, AbstractC40691uc.A01(userSession2));
            case 24:
                C79313gc c79313gc = (C79313gc) this.A01;
                if (!c79313gc.A06 || (c75113Zb = c79313gc.A01) == null || (A1e = c79313gc.A00.A1e(c75113Zb.A03)) == null) {
                    return null;
                }
                return A1e.getId();
            case 25:
                return new C84993qn((UserSession) this.A01);
            case 26:
                return AbstractC23021Ah.A00(((C84993qn) this.A01).A05);
            case 27:
                ((C75113Zb) this.A01).A3d.clear();
                return C0eB.A00;
            case 28:
                ContentProvider contentProvider = new ContentProvider();
                AbstractC58329PtM abstractC58329PtM = (AbstractC58329PtM) this.A01;
                contentProvider.attachInfo(abstractC58329PtM.getContext(), abstractC58329PtM.A02);
                return contentProvider;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                ContentProvider contentProvider2 = new ContentProvider();
                AbstractC58329PtM abstractC58329PtM2 = (AbstractC58329PtM) this.A01;
                contentProvider2.attachInfo(abstractC58329PtM2.getContext(), abstractC58329PtM2.A02);
                return contentProvider2;
            case 30:
                AbstractC193818i2 abstractC193818i2 = (AbstractC193818i2) this.A01;
                C47809L9r c47809L9r = new C47809L9r(abstractC193818i2.A01, abstractC193818i2.A03, new C47539Kz7(true, abstractC193818i2.A05));
                EnumC60792q3 enumC60792q3 = abstractC193818i2.A02;
                C14360o3.A0B(enumC60792q3, 0);
                c47809L9r.A00 = enumC60792q3;
                return c47809L9r;
            case 31:
                C189588ad c189588ad = (C189588ad) this.A01;
                return new C183538Cb(c189588ad.requireActivity(), c189588ad.getSession(), null);
            case 32:
            case 48:
                return this.A01;
            case 33:
            case 38:
            case 39:
            case 43:
            case 44:
            default:
                return ((InterfaceC16820sZ) this.A01).invoke();
            case 34:
                return ((InterfaceC018407e) ((InterfaceC09390do) this.A01).getValue()).getViewModelStore();
            case 35:
                return new C195448kk((UserSession) this.A01);
            case 36:
                View requireViewById = ((C8TT) this.A01).A03.requireViewById(R.id.camera_snack_bar_stub);
                C14360o3.A07(requireViewById);
                return new C3O0((ViewStub) requireViewById, false);
            case 37:
                return new C193288h8((UserSession) this.A01);
            case 40:
                AnimatorSet animatorSet = new AnimatorSet();
                final AnonymousClass808 anonymousClass808 = (AnonymousClass808) this.A01;
                final TextView textView = anonymousClass808.A09;
                final TextView textView2 = anonymousClass808.A08;
                final InterfaceC16820sZ interfaceC16820sZ = anonymousClass808.A0D;
                List singletonList2 = Collections.singletonList(new AbstractC87373uv() { // from class: X.9LM
                    @Override // X.AbstractC87373uv, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        TextView textView3 = textView2;
                        if (textView3 != null) {
                            textView3.setVisibility(4);
                        }
                    }

                    @Override // X.AbstractC87373uv, android.animation.Animator.AnimatorListener
                    public final void onAnimationStart(Animator animator) {
                        TextView textView3 = textView;
                        if (textView3 != null) {
                            ViewGroup.LayoutParams layoutParams = textView3.getLayoutParams();
                            C14360o3.A0C(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                            layoutParams.width = textView3.getMeasuredWidth();
                            layoutParams.height = textView3.getMeasuredHeight();
                            textView3.setLayoutParams(layoutParams);
                        }
                        TextView textView4 = textView2;
                        if (textView4 != null) {
                            ViewGroup.LayoutParams layoutParams2 = textView4.getLayoutParams();
                            C14360o3.A0C(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                            layoutParams2.width = textView4.getMeasuredWidth();
                            layoutParams2.height = textView4.getMeasuredHeight();
                            textView4.setLayoutParams(layoutParams2);
                        }
                        interfaceC16820sZ.invoke();
                    }
                });
                C14360o3.A07(singletonList2);
                final Drawable drawable = anonymousClass808.A06;
                final float f = anonymousClass808.A03;
                final float f2 = anonymousClass808.A02;
                final float f3 = anonymousClass808.A01;
                final TextView textView3 = null;
                final float f4 = 1.0f;
                final boolean z2 = true;
                final float f5 = 0.0f;
                long j = 100;
                ValueAnimator A00 = AnonymousClass808.A00(new ValueAnimator.AnimatorUpdateListener() { // from class: X.9LL
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        GradientDrawable gradientDrawable;
                        C14360o3.A0B(valueAnimator, 0);
                        Drawable drawable2 = drawable;
                        ImageView imageView = anonymousClass808.A07;
                        float f6 = f4;
                        boolean z3 = z2;
                        TextView textView4 = textView;
                        float f7 = f;
                        TextView textView5 = textView2;
                        float f8 = f2;
                        float f9 = f3;
                        float A002 = AbstractC167017dG.A00(valueAnimator);
                        C14360o3.A0B(drawable2, 0);
                        C9MO.A00(drawable2, imageView, A002, f6, z3);
                        if (textView4 != null) {
                            textView4.setTextSize(0, f7 * A002);
                        }
                        if (textView5 != null) {
                            textView5.setTextSize(0, f8 * A002);
                            Drawable background = textView5.getBackground();
                            Drawable drawable3 = null;
                            if (background != null) {
                                drawable3 = background.mutate();
                            }
                            if ((drawable3 instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) drawable3) != null) {
                                float f10 = (1.0f - A002) * 0.5f;
                                int measuredWidth = (int) (textView5.getMeasuredWidth() * f10);
                                int measuredHeight = (int) (f10 * textView5.getMeasuredHeight());
                                AbstractC166997dE.A1G(gradientDrawable, measuredWidth, measuredHeight, textView5.getMeasuredWidth() - measuredWidth, textView5.getMeasuredHeight() - measuredHeight);
                                gradientDrawable.setCornerRadius(A002 * f9);
                            }
                        }
                    }
                }, singletonList2, 1.0f, 0.0f, 100L, false);
                List singletonList3 = Collections.singletonList(new C46074KaV(textView2, 1));
                C14360o3.A07(singletonList3);
                ValueAnimator A002 = AnonymousClass808.A00(new ValueAnimator.AnimatorUpdateListener() { // from class: X.9LL
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        GradientDrawable gradientDrawable;
                        C14360o3.A0B(valueAnimator, 0);
                        Drawable drawable2 = drawable;
                        ImageView imageView = anonymousClass808.A07;
                        float f6 = f4;
                        boolean z3 = z2;
                        TextView textView4 = textView;
                        float f7 = f;
                        TextView textView5 = textView2;
                        float f8 = f2;
                        float f9 = f3;
                        float A0022 = AbstractC167017dG.A00(valueAnimator);
                        C14360o3.A0B(drawable2, 0);
                        C9MO.A00(drawable2, imageView, A0022, f6, z3);
                        if (textView4 != null) {
                            textView4.setTextSize(0, f7 * A0022);
                        }
                        if (textView5 != null) {
                            textView5.setTextSize(0, f8 * A0022);
                            Drawable background = textView5.getBackground();
                            Drawable drawable3 = null;
                            if (background != null) {
                                drawable3 = background.mutate();
                            }
                            if ((drawable3 instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) drawable3) != null) {
                                float f10 = (1.0f - A0022) * 0.5f;
                                int measuredWidth = (int) (textView5.getMeasuredWidth() * f10);
                                int measuredHeight = (int) (f10 * textView5.getMeasuredHeight());
                                AbstractC166997dE.A1G(gradientDrawable, measuredWidth, measuredHeight, textView5.getMeasuredWidth() - measuredWidth, textView5.getMeasuredHeight() - measuredHeight);
                                gradientDrawable.setCornerRadius(A0022 * f9);
                            }
                        }
                    }
                }, singletonList3, 0.0f, 1.0f, 100L, false);
                boolean z3 = anonymousClass808.A0E;
                List list = anonymousClass808.A0A;
                final Drawable drawable2 = anonymousClass808.A05;
                final float f6 = anonymousClass808.A00;
                final boolean z4 = anonymousClass808.A0F;
                ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: X.9LL
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        GradientDrawable gradientDrawable;
                        C14360o3.A0B(valueAnimator, 0);
                        Drawable drawable22 = drawable2;
                        ImageView imageView = anonymousClass808.A07;
                        float f62 = f6;
                        boolean z32 = z4;
                        TextView textView4 = textView3;
                        float f7 = f5;
                        TextView textView5 = textView3;
                        float f8 = f5;
                        float f9 = f5;
                        float A0022 = AbstractC167017dG.A00(valueAnimator);
                        C14360o3.A0B(drawable22, 0);
                        C9MO.A00(drawable22, imageView, A0022, f62, z32);
                        if (textView4 != null) {
                            textView4.setTextSize(0, f7 * A0022);
                        }
                        if (textView5 != null) {
                            textView5.setTextSize(0, f8 * A0022);
                            Drawable background = textView5.getBackground();
                            Drawable drawable3 = null;
                            if (background != null) {
                                drawable3 = background.mutate();
                            }
                            if ((drawable3 instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) drawable3) != null) {
                                float f10 = (1.0f - A0022) * 0.5f;
                                int measuredWidth = (int) (textView5.getMeasuredWidth() * f10);
                                int measuredHeight = (int) (f10 * textView5.getMeasuredHeight());
                                AbstractC166997dE.A1G(gradientDrawable, measuredWidth, measuredHeight, textView5.getMeasuredWidth() - measuredWidth, textView5.getMeasuredHeight() - measuredHeight);
                                gradientDrawable.setCornerRadius(A0022 * f9);
                            }
                        }
                    }
                };
                if (z3) {
                    j = 500;
                }
                ValueAnimator A003 = AnonymousClass808.A00(animatorUpdateListener, list, 0.0f, 1.0f, j, z3);
                ValueAnimator A004 = AnonymousClass808.A00(new ValueAnimator.AnimatorUpdateListener() { // from class: X.9LL
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        GradientDrawable gradientDrawable;
                        C14360o3.A0B(valueAnimator, 0);
                        Drawable drawable22 = drawable2;
                        ImageView imageView = anonymousClass808.A07;
                        float f62 = f6;
                        boolean z32 = z4;
                        TextView textView4 = textView3;
                        float f7 = f5;
                        TextView textView5 = textView3;
                        float f8 = f5;
                        float f9 = f5;
                        float A0022 = AbstractC167017dG.A00(valueAnimator);
                        C14360o3.A0B(drawable22, 0);
                        C9MO.A00(drawable22, imageView, A0022, f62, z32);
                        if (textView4 != null) {
                            textView4.setTextSize(0, f7 * A0022);
                        }
                        if (textView5 != null) {
                            textView5.setTextSize(0, f8 * A0022);
                            Drawable background = textView5.getBackground();
                            Drawable drawable3 = null;
                            if (background != null) {
                                drawable3 = background.mutate();
                            }
                            if ((drawable3 instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) drawable3) != null) {
                                float f10 = (1.0f - A0022) * 0.5f;
                                int measuredWidth = (int) (textView5.getMeasuredWidth() * f10);
                                int measuredHeight = (int) (f10 * textView5.getMeasuredHeight());
                                AbstractC166997dE.A1G(gradientDrawable, measuredWidth, measuredHeight, textView5.getMeasuredWidth() - measuredWidth, textView5.getMeasuredHeight() - measuredHeight);
                                gradientDrawable.setCornerRadius(A0022 * f9);
                            }
                        }
                    }
                }, anonymousClass808.A0B, 1.0f, 0.0f, 100L, false);
                animatorSet.play(A00).after(anonymousClass808.A04).before(A003);
                if (!anonymousClass808.A0G) {
                    return animatorSet;
                }
                animatorSet.play(A004).after(3000L).after(A003);
                animatorSet.play(A002).after(A004);
                return animatorSet;
            case Seq.NULL_REFNUM /* 41 */:
                return new C75B((UserSession) this.A01);
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                return Long.valueOf(C18U.A01(C06090Tz.A06, ((C75B) this.A01).A00, 36605215990420705L));
            case 45:
                return Integer.valueOf(((Context) this.A01).getColor(R.color.grey_5));
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return ((C183618Cm) this.A01).A00;
            case 47:
                return ((C183618Cm) this.A01).A02;
        }
    }
}
