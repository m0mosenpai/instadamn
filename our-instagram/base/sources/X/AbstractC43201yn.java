package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: X.1yn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC43201yn extends FrameLayout {
    public static int A04 = -1;
    public static InterfaceC43011yU A05 = InterfaceC43011yU.A00;
    public static boolean A06;
    public InterfaceC11380iw A00;
    public C75363a3 A01;
    public final C5H5 A02;
    public final InterfaceC74633Wx A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC43201yn(Context context) {
        super(context);
        C5H5 c5h5;
        C14360o3.A0B(context, 1);
        this.A03 = InterfaceC74633Wx.A01;
        if (C3Q1.A04()) {
            Context context2 = getContext();
            C14360o3.A07(context2);
            c5h5 = new C5H5(context2, this);
        } else {
            c5h5 = null;
        }
        this.A02 = c5h5;
    }

    public void setVideoSource(InterfaceC38421qW interfaceC38421qW, InterfaceC11380iw interfaceC11380iw) {
        C75363a3 c75363a3;
        C14360o3.A0B(interfaceC38421qW, 0);
        C14360o3.A0B(interfaceC11380iw, 1);
        C5H5 c5h5 = this.A02;
        if (c5h5 != null) {
            c5h5.A02 = interfaceC38421qW.Cff();
            C5H5.A00(c5h5);
        }
        if (A06) {
            C75363a3 c75363a32 = this.A01;
            if (c75363a32 != null && (!interfaceC38421qW.Cff() || !c75363a32.equals(interfaceC38421qW.CFR()))) {
                A05.Dzy(this);
            }
            if (interfaceC38421qW.Cff()) {
                c75363a3 = interfaceC38421qW.CFR();
            } else {
                c75363a3 = null;
            }
            this.A01 = c75363a3;
            this.A00 = interfaceC11380iw;
            A05.Dzz(this, c75363a3, interfaceC11380iw.getModuleName());
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        super.addView(view, i);
        C75363a3 c75363a3 = this.A01;
        if (A06 && (view instanceof TextureView) && c75363a3 == null) {
            if (A04 > 0) {
                C0w9.A05("VideoViewsTrackerWithTrace", "Adding video view to container without calling setVideoSource() first!", A04, new Throwable("Adding video view to container without calling setVideoSource() first!"));
            }
            C0K8.A0C("VideoViewsTrackerWithTrace", "Adding video view to container without calling setVideoSource() first!");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int A062 = C0f9.A06(1327030736);
        super.onAttachedToWindow();
        C75363a3 c75363a3 = this.A01;
        if (A06 && c75363a3 != null) {
            InterfaceC11380iw interfaceC11380iw = this.A00;
            if (interfaceC11380iw != null) {
                A05.Cxd(this, c75363a3, interfaceC11380iw.getModuleName());
            } else {
                IllegalStateException illegalStateException = new IllegalStateException("Required value was null.");
                C0f9.A0D(521508098, A062);
                throw illegalStateException;
            }
        }
        C5H5 c5h5 = this.A02;
        if (c5h5 != null) {
            AnonymousClass195 anonymousClass195 = c5h5.A01;
            if (anonymousClass195 != null) {
                anonymousClass195.AGH(null);
            }
            C19K A00 = AbstractC24771Iv.A00();
            c5h5.A01 = AbstractC23641Du.A04(AnonymousClass191.A00, new PZE(c5h5, null, 18), A00);
            C5H5.A00(c5h5);
        }
        C0f9.A0D(-669635124, A062);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int A062 = C0f9.A06(1045857377);
        super.onDetachedFromWindow();
        if (A06) {
            A05.DA0(this);
        }
        C5H5 c5h5 = this.A02;
        if (c5h5 != null) {
            AnonymousClass195 anonymousClass195 = c5h5.A01;
            if (anonymousClass195 != null) {
                anonymousClass195.AGH(null);
            }
            View view = c5h5.A00;
            if (view.getParent() != null) {
                c5h5.A03.removeView(view);
            }
        }
        C0f9.A0D(-1411036388, A062);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC43201yn(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C5H5 c5h5;
        C14360o3.A0B(context, 1);
        this.A03 = InterfaceC74633Wx.A01;
        if (C3Q1.A04()) {
            Context context2 = getContext();
            C14360o3.A07(context2);
            c5h5 = new C5H5(context2, this);
        } else {
            c5h5 = null;
        }
        this.A02 = c5h5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC43201yn(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C5H5 c5h5;
        C14360o3.A0B(context, 1);
        this.A03 = InterfaceC74633Wx.A01;
        if (C3Q1.A04()) {
            Context context2 = getContext();
            C14360o3.A07(context2);
            c5h5 = new C5H5(context2, this);
        } else {
            c5h5 = null;
        }
        this.A02 = c5h5;
    }
}
