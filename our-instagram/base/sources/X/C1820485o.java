package X;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.85o, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1820485o implements InterfaceC1810781j {
    public int A01;
    public ImageView A03;
    public ImageView A04;
    public TextView A05;
    public IgFrameLayout A06;
    public UserSession A08;
    public final int A09;
    public final View A0A;
    public final ViewStub A0B;
    public final ViewStub A0C;
    public final C1815383g A0E;
    public final C25671My A0F;
    public final ViewStub A0L;
    public final java.util.Set A0K = new HashSet();
    public final List A0J = new ArrayList();
    public int A02 = 0;
    public boolean A07 = false;
    public float A00 = 1.0f;
    public final Runnable A0I = new Runnable() { // from class: X.85p
        @Override // java.lang.Runnable
        public final void run() {
            C1820485o.this.A06(true);
        }
    };
    public final Runnable A0H = new Runnable() { // from class: X.85q
        @Override // java.lang.Runnable
        public final void run() {
            C1820485o.this.A05(true);
        }
    };
    public final InterfaceC41501vz A0G = new InterfaceC41501vz() { // from class: X.85r
        @Override // X.InterfaceC41501vz
        public final void onEvent(Object obj) {
            Map A0E;
            C1820485o c1820485o = C1820485o.this;
            C191228dL c191228dL = (C191228dL) obj;
            int intValue = c191228dL.A01.intValue();
            if (intValue != 0) {
                if (intValue != 1) {
                    if (intValue != 3) {
                        C1820485o.A01(c1820485o);
                        if (c1820485o.A06 == null) {
                            IgFrameLayout igFrameLayout = (IgFrameLayout) c1820485o.A0B.inflate();
                            c1820485o.A06 = igFrameLayout;
                            int paddingLeft = igFrameLayout.getPaddingLeft();
                            int i = c1820485o.A09;
                            igFrameLayout.setPadding(paddingLeft + i, c1820485o.A06.getPaddingTop(), c1820485o.A06.getPaddingRight() + i, c1820485o.A06.getPaddingBottom());
                            c1820485o.A03 = (ImageView) c1820485o.A06.findViewById(R.id.ar_effect_instruction_image);
                        }
                        c1820485o.A03.getClass();
                        AbstractC125325le.A01(c1820485o.A03, 0).A0G();
                        List list = c191228dL.A04;
                        list.getClass();
                        List list2 = c191228dL.A06;
                        list2.getClass();
                        List list3 = c191228dL.A05;
                        list3.getClass();
                        C14120nc.A00().ATO(new C68017V6j(c1820485o, c191228dL.A02, list, list2, list3));
                        return;
                    }
                    c1820485o.A05(true);
                    c1820485o.A06(true);
                    return;
                }
                c1820485o.A07 = true;
                ImageView imageView = c1820485o.A03;
                if (imageView != null) {
                    AbstractC125325le.A01(imageView, 0).A0G();
                }
                ViewStub viewStub = c1820485o.A0B;
                if (viewStub != null) {
                    viewStub.setVisibility(8);
                }
                c1820485o.A05(false);
                String str = c191228dL.A03;
                CameraAREffect cameraAREffect = c1820485o.A0E.A05.A09;
                if (cameraAREffect != null) {
                    A0E = cameraAREffect.A0F();
                } else {
                    A0E = AbstractC06930Yk.A0E();
                }
                C173027nG c173027nG = (C173027nG) A0E.get(str);
                if (c173027nG == null) {
                    return;
                }
                C1820485o.A02(c1820485o, c173027nG.A01, true);
                return;
            }
            c1820485o.A07 = true;
            ImageView imageView2 = c1820485o.A03;
            if (imageView2 != null) {
                AbstractC125325le.A01(imageView2, 0).A0G();
            }
            ViewStub viewStub2 = c1820485o.A0B;
            if (viewStub2 != null) {
                viewStub2.setVisibility(8);
            }
            c1820485o.A05(false);
            c1820485o.A04(c191228dL.A02, c191228dL.A00);
        }
    };
    public final C83N A0D = new C83N() { // from class: X.85s
        @Override // X.C83N
        public final void DD7(CameraAREffect cameraAREffect, CameraAREffect cameraAREffect2) {
            C1820485o c1820485o = C1820485o.this;
            if (cameraAREffect != null && cameraAREffect.A0X.isEmpty()) {
                c1820485o.A06(true);
                c1820485o.A05(true);
            }
        }
    };

    public final void A04(String str, long j) {
        A02(this, str, true);
        if (j > 0) {
            View view = this.A0A;
            Runnable runnable = this.A0I;
            view.removeCallbacks(runnable);
            view.postDelayed(runnable, j);
        }
    }

    public final void A05(boolean z) {
        this.A07 = true;
        this.A0A.removeCallbacks(this.A0H);
        ImageView imageView = this.A03;
        if (imageView != null) {
            if (z) {
                AbstractC125325le A00 = AbstractC125325le.A00(imageView);
                A00.A0I(0.0f);
                A00.A05 = new InterfaceC125355lh() { // from class: X.AmH
                    @Override // X.InterfaceC125355lh
                    public final void onFinish() {
                        ImageView imageView2 = C1820485o.this.A03;
                        if (imageView2 != null) {
                            imageView2.setVisibility(4);
                        }
                    }
                };
                A00.A0H();
                return;
            }
            imageView.setVisibility(4);
        }
    }

    public static void A00(C1820485o c1820485o) {
        List list = c1820485o.A0J;
        synchronized (list) {
            ImageView imageView = c1820485o.A03;
            if (imageView != null && !c1820485o.A07) {
                imageView.setImageBitmap((Bitmap) list.get(c1820485o.A02));
                AbstractC125325le.A01(c1820485o.A03, 0).A0G();
                c1820485o.A0B.setVisibility(0);
                c1820485o.A03.setVisibility(0);
                c1820485o.A03.setBackgroundColor(0);
                c1820485o.A03.getClass();
                AbstractC125325le A01 = AbstractC125325le.A01(c1820485o.A03, 0);
                A01.A0M(0.0f, 0.5f);
                A01.A05 = new C24074AmI(c1820485o);
                A01.A0H();
                return;
            }
            c1820485o.A02 = 0;
        }
    }

    public static void A01(C1820485o c1820485o) {
        if (c1820485o.A05 == null) {
            TextView textView = (TextView) c1820485o.A0L.inflate();
            c1820485o.A05 = textView;
            c1820485o.A01 = Color.alpha(textView.getShadowColor());
            TextView textView2 = c1820485o.A05;
            int paddingLeft = textView2.getPaddingLeft();
            int i = c1820485o.A09;
            textView2.setPadding(paddingLeft + i, c1820485o.A05.getPaddingTop(), c1820485o.A05.getPaddingRight() + i, c1820485o.A05.getPaddingBottom());
        }
    }

    public final void A03() {
        this.A0F.A02(this.A0G, C191228dL.class);
        this.A0E.A09(this.A0D);
    }

    public final void A06(boolean z) {
        this.A0A.removeCallbacks(this.A0I);
        TextView textView = this.A05;
        if (textView != null) {
            if (z) {
                AbstractC125325le A01 = AbstractC125325le.A01(textView, 0);
                A01.A06 = new C195848lS(this);
                A01.A0I(0.0f);
                A01.A05 = new InterfaceC125355lh() { // from class: X.8kd
                    @Override // X.InterfaceC125355lh
                    public final void onFinish() {
                        TextView textView2 = C1820485o.this.A05;
                        if (textView2 != null) {
                            textView2.setVisibility(4);
                        }
                    }
                };
                A01.A0H();
            } else {
                textView.setVisibility(4);
            }
        }
        Iterator it = this.A0K.iterator();
        while (it.hasNext()) {
            View view = ((C1828889j) it.next()).A05.A04;
            if (view != null) {
                AbstractC125325le A012 = AbstractC125325le.A01(view, 0);
                A012.A0G();
                A012.A0I(1.0f);
                A012.A0H();
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
    }

    @Override // X.InterfaceC1810781j
    public final /* bridge */ /* synthetic */ void DoV(Object obj, Object obj2, Object obj3) {
        int ordinal = ((EnumC1810181d) obj2).ordinal();
        if (ordinal != 2) {
            if (ordinal != 11 && ordinal != 0) {
                return;
            }
            A03();
            return;
        }
        this.A0F.A01(this.A0G, C191228dL.class);
        this.A0E.A08(this.A0D);
    }

    public C1820485o(View view, C07X c07x, C1815383g c1815383g, UserSession userSession, AnonymousClass825 anonymousClass825) {
        this.A09 = (int) view.getResources().getDimension(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size);
        this.A0F = AbstractC25651Mw.A00(userSession);
        this.A08 = userSession;
        this.A0A = view;
        this.A0L = (ViewStub) view.requireViewById(R.id.ar_effect_instruction_text_stub);
        this.A0B = (ViewStub) view.requireViewById(R.id.ar_effect_instruction_image_stub);
        this.A0C = (ViewStub) view.requireViewById(R.id.camera_instruction_keyframe_stub);
        this.A0E = c1815383g;
        if (anonymousClass825 != null && c07x != null) {
            C75M.A00(AbstractC58232lf.A00(AnonymousClass191.A00, new C1820985t(anonymousClass825, anonymousClass825.A0B))).A06(c07x, new InterfaceC58362lv() { // from class: X.85u
                @Override // X.InterfaceC58362lv
                public final void onChanged(Object obj) {
                    Object obj2;
                    Object obj3;
                    Object obj4;
                    Object obj5;
                    C1820485o c1820485o = C1820485o.this;
                    C3AY c3ay = (C3AY) obj;
                    C1820485o.A01(c1820485o);
                    TextView textView = c1820485o.A05;
                    if (textView != null && (obj4 = c3ay.A00) != null && (obj5 = c3ay.A01) != null) {
                        textView.setTranslationY((-((Number) obj4).intValue()) / 2.0f);
                        TextView textView2 = c1820485o.A05;
                        float floatValue = ((Number) obj5).floatValue();
                        textView2.setScaleX(floatValue);
                        c1820485o.A05.setScaleY(floatValue);
                    }
                    ImageView imageView = c1820485o.A03;
                    if (imageView != null && (obj2 = c3ay.A00) != null && (obj3 = c3ay.A01) != null) {
                        imageView.setTranslationY((-((Number) obj2).intValue()) / 2.0f);
                        ImageView imageView2 = c1820485o.A03;
                        float floatValue2 = ((Number) obj3).floatValue();
                        imageView2.setScaleX(floatValue2);
                        c1820485o.A03.setScaleY(floatValue2);
                    }
                }
            });
        }
    }

    public static void A02(C1820485o c1820485o, String str, boolean z) {
        float height;
        A01(c1820485o);
        TextView textView = c1820485o.A05;
        textView.getClass();
        textView.setText(str);
        Iterator it = c1820485o.A0K.iterator();
        while (it.hasNext()) {
            View view = ((C1828889j) it.next()).A05.A04;
            if (view != null) {
                AbstractC125325le A00 = AbstractC125325le.A00(view);
                A00.A0G();
                A00.A0I(0.0f);
                A00.A0H();
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        float scaleX = c1820485o.A05.getScaleX();
        float f = c1820485o.A00;
        if (scaleX != f) {
            TextView textView2 = c1820485o.A05;
            int height2 = c1820485o.A0A.getHeight();
            if (f != 1.0f) {
                height = (int) ((height2 * 0.25d) - (c1820485o.A05.getHeight() * 0.5f));
            } else {
                height = (height2 - c1820485o.A05.getHeight()) * 0.5f;
            }
            textView2.setY(height);
            c1820485o.A05.setScaleX(c1820485o.A00);
            c1820485o.A05.setScaleY(c1820485o.A00);
        }
        TextView textView3 = c1820485o.A05;
        textView3.getClass();
        textView3.setVisibility(0);
        TextView textView4 = c1820485o.A05;
        textView4.getClass();
        AbstractC125325le.A01(textView4, 0).A0G();
        TextView textView5 = c1820485o.A05;
        if (z) {
            textView5.getClass();
            AbstractC125325le A01 = AbstractC125325le.A01(c1820485o.A05, 0);
            A01.A06 = new C195848lS(c1820485o);
            A01.A0M(0.0f, 1.0f);
            A01.A0H();
            return;
        }
        textView5.getClass();
        textView5.setAlpha(1.0f);
        TextView textView6 = c1820485o.A05;
        if (textView6 == null) {
            return;
        }
        C13680mu.A04(c1820485o.A05, (int) (textView6.getAlpha() * c1820485o.A01));
    }
}
