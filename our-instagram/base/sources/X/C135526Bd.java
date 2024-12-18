package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.widget.ImageView;
import com.facebook.R;
import com.facebook.common.callercontext.ContextChain;

/* renamed from: X.6Bd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C135526Bd extends C2WC implements InterfaceC50822Vd {
    public Rect A00;
    public C2nP A01;
    public final ContextChain A02;
    public final C6Bb A03;
    public final C5GG A04;
    public final C27771Wf A05;
    public final InterfaceC59172nI A06;
    public final Object A07;
    public final boolean A08;
    public final long A09;
    public final InterfaceC50822Vd A0A;
    public static final C135536Be A0D = new InterfaceC77833eB() { // from class: X.6Be
        @Override // X.InterfaceC77833eB
        public final /* bridge */ /* synthetic */ Object ADU(Context context, Object obj, Object obj2, Object obj3) {
            ImageView imageView = (ImageView) obj;
            C14360o3.A0B(imageView, 1);
            AbstractC131695x5.A00(imageView);
            return null;
        }

        @Override // X.InterfaceC77833eB
        public final /* bridge */ /* synthetic */ boolean Ek2(Object obj, Object obj2, Object obj3, Object obj4) {
            C135526Bd c135526Bd = (C135526Bd) obj;
            C135526Bd c135526Bd2 = (C135526Bd) obj2;
            C14360o3.A0B(c135526Bd, 0);
            C14360o3.A0B(c135526Bd2, 1);
            return C135526Bd.A00(c135526Bd, c135526Bd2);
        }

        @Override // X.InterfaceC77833eB
        public final /* bridge */ /* synthetic */ void F8z(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
            ImageView imageView = (ImageView) obj;
            C14360o3.A0B(imageView, 1);
            C59232nO.A00().EE1(AbstractC131695x5.A00(imageView));
        }

        @Override // X.InterfaceC77833eB
        public final String getDescription() {
            return "FrescoRenderUnit#mountUnmount";
        }

        @Override // X.InterfaceC77833eB
        public final /* synthetic */ Class CBk() {
            return getClass();
        }
    };
    public static final C135546Bf A0B = new InterfaceC77833eB() { // from class: X.6Bf
        @Override // X.InterfaceC77833eB
        public final /* bridge */ /* synthetic */ Object ADU(Context context, Object obj, Object obj2, Object obj3) {
            Rect rect;
            C27771Wf c27771Wf;
            C27771Wf c27771Wf2;
            C5FC c5fc;
            ImageView imageView = (ImageView) obj;
            C135526Bd c135526Bd = (C135526Bd) obj2;
            C14360o3.A0B(context, 0);
            C14360o3.A0B(imageView, 1);
            C14360o3.A0B(c135526Bd, 2);
            if (obj3 instanceof Rect) {
                rect = (Rect) obj3;
            } else {
                rect = null;
            }
            if (c135526Bd.A01 == null || !C14360o3.A0K(c135526Bd.A00, rect)) {
                if (rect != null && (c27771Wf2 = c135526Bd.A05) != null && ((c27771Wf2.A0Z && c27771Wf2.A0Y) || c27771Wf2.A0U)) {
                    C27811Wj c27811Wj = new C27811Wj(c27771Wf2);
                    int width = rect.width();
                    int height = rect.height();
                    if (width > 0 && height > 0) {
                        c5fc = new C5FC(width, height);
                    } else {
                        c5fc = null;
                    }
                    c27811Wj.A0L = c5fc;
                    c27771Wf = new C27771Wf(c27811Wj);
                } else {
                    c27771Wf = c135526Bd.A05;
                }
                C27651Vs A01 = C59232nO.A01();
                Resources resources = context.getResources();
                C14360o3.A07(resources);
                c135526Bd.A01 = A01.A02(resources, c27771Wf, c135526Bd.A06, c135526Bd.A08);
                c135526Bd.A00 = rect;
            }
            InterfaceC59242nQ A00 = AbstractC131695x5.A00(imageView);
            C1WN A002 = C59232nO.A00();
            C2nP c2nP = c135526Bd.A01;
            if (c2nP != null) {
                Object obj4 = c135526Bd.A07;
                A002.AUt(rect, c135526Bd.A02, c135526Bd.A03, null, A00, c2nP, null, c135526Bd.A04, obj4);
                imageView.setTag(R.id.fresco_vito_image_options_tag, c135526Bd.A05);
                imageView.setTag(R.id.fresco_vito_caller_context_tag, obj4);
                return null;
            }
            throw new IllegalStateException("renderUnit.cachedImageRequest is null");
        }

        @Override // X.InterfaceC77833eB
        public final /* bridge */ /* synthetic */ boolean Ek2(Object obj, Object obj2, Object obj3, Object obj4) {
            C135526Bd c135526Bd = (C135526Bd) obj;
            C135526Bd c135526Bd2 = (C135526Bd) obj2;
            C14360o3.A0B(c135526Bd, 0);
            C14360o3.A0B(c135526Bd2, 1);
            if (!C135526Bd.A00(c135526Bd, c135526Bd2) && C14360o3.A0K(obj3, obj4)) {
                return false;
            }
            return true;
        }

        @Override // X.InterfaceC77833eB
        public final /* bridge */ /* synthetic */ void F8z(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
            ImageView imageView = (ImageView) obj;
            C135526Bd c135526Bd = (C135526Bd) obj2;
            C14360o3.A0B(imageView, 1);
            C14360o3.A0B(c135526Bd, 2);
            InterfaceC59242nQ A00 = AbstractC131695x5.A00(imageView);
            Object AZ0 = A00.AZ0();
            C27771Wf c27771Wf = c135526Bd.A05;
            if ((c27771Wf == null || c27771Wf.A0T) && (AZ0 instanceof Animatable)) {
                ((Animatable) AZ0).stop();
            }
            C59232nO.A00().EEG(A00);
            imageView.setTag(R.id.fresco_vito_image_options_tag, null);
            imageView.setTag(R.id.fresco_vito_caller_context_tag, null);
        }

        @Override // X.InterfaceC77833eB
        public final String getDescription() {
            return "FrescoRenderUnit#attachDetach";
        }

        @Override // X.InterfaceC77833eB
        public final /* synthetic */ Class CBk() {
            return getClass();
        }
    };
    public static final C135556Bg A0C = new InterfaceC77833eB() { // from class: X.6Bg
        @Override // X.InterfaceC77833eB
        public final /* bridge */ /* synthetic */ void F8z(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
            ImageView imageView = (ImageView) obj;
            C14360o3.A0B(imageView, 1);
            C59232nO.A00().EEL(AbstractC131695x5.A00(imageView));
        }

        @Override // X.InterfaceC77833eB
        public final String getDescription() {
            return "FrescoRenderUnit#finalUnmount";
        }

        @Override // X.InterfaceC77833eB
        public final /* synthetic */ Class CBk() {
            return getClass();
        }

        @Override // X.InterfaceC77833eB
        public final /* bridge */ /* synthetic */ Object ADU(Context context, Object obj, Object obj2, Object obj3) {
            return null;
        }

        @Override // X.InterfaceC77833eB
        public final /* bridge */ /* synthetic */ boolean Ek2(Object obj, Object obj2, Object obj3, Object obj4) {
            return false;
        }
    };

    @Override // X.InterfaceC50822Vd
    public final /* bridge */ /* synthetic */ Object ALq(Context context) {
        C14360o3.A0B(context, 0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setImageDrawable(C59232nO.A00().AM5());
        return imageView;
    }

    @Override // X.InterfaceC50822Vd
    public final /* synthetic */ C2Wm D8D(int i) {
        return AbstractC79733hO.A00(this, i);
    }

    public C135526Bd(ContextChain contextChain, C6Bb c6Bb, C5GG c5gg, C27771Wf c27771Wf, InterfaceC59172nI interfaceC59172nI, Object obj, long j, boolean z) {
        super(C05F.A01);
        this.A09 = j;
        this.A06 = interfaceC59172nI;
        this.A04 = c5gg;
        this.A03 = c6Bb;
        this.A05 = c27771Wf;
        this.A08 = z;
        this.A07 = obj;
        this.A02 = contextChain;
        A0D(AbstractC78283eu.A00(A0C, this));
        A0D(AbstractC78283eu.A00(A0D, this));
        A0C(AbstractC78283eu.A00(A0B, this));
        this.A0A = this;
    }

    public static final boolean A00(C135526Bd c135526Bd, C135526Bd c135526Bd2) {
        if (C14360o3.A0K(c135526Bd.A06, c135526Bd2.A06) && C14360o3.A0K(c135526Bd.A05, c135526Bd2.A05) && c135526Bd.A08 == c135526Bd2.A08 && C14360o3.A0K(c135526Bd.A04, c135526Bd2.A04) && C14360o3.A0K(c135526Bd.A03, c135526Bd2.A03)) {
            return false;
        }
        return true;
    }

    @Override // X.C2WC
    public final long A0H() {
        return this.A09;
    }

    @Override // X.C2WC
    public final InterfaceC50822Vd A0I() {
        return this.A0A;
    }

    @Override // X.InterfaceC50822Vd
    public final /* synthetic */ boolean AFr() {
        return false;
    }

    @Override // X.InterfaceC50822Vd
    public final /* synthetic */ C2V6 BeU() {
        return C77603dk.A00;
    }

    @Override // X.InterfaceC50822Vd
    public final /* synthetic */ int E4c() {
        return 3;
    }

    @Override // X.InterfaceC50822Vd
    public final /* synthetic */ Object BeR() {
        return getClass();
    }
}
