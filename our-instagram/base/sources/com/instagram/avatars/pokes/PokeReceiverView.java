package com.instagram.avatars.pokes;

import X.AbstractC125325le;
import X.AbstractC23641Du;
import X.AnonymousClass191;
import X.AnonymousClass195;
import X.C008102v;
import X.C07S;
import X.C07X;
import X.C07Y;
import X.C0f9;
import X.C14360o3;
import X.C23671Dx;
import X.C44398Jjb;
import X.C44518JmO;
import X.C55942hf;
import X.C57312k6;
import X.C5SW;
import X.InterfaceC11380iw;
import X.L62;
import X.MCQ;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class PokeReceiverView extends IgLinearLayout implements InterfaceC11380iw {
    public Fragment A00;
    public C44518JmO A01;
    public UserSession A02;
    public IgImageView A03;
    public C5SW A04;
    public AnonymousClass195 A05;
    public AnonymousClass195 A06;
    public final C008102v A07;
    public final L62 A08;
    public final AtomicBoolean A09;
    public final String A0A;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PokeReceiverView(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }

    public static final void A00(PokeReceiverView pokeReceiverView) {
        Fragment fragment = pokeReceiverView.A00;
        C23671Dx c23671Dx = null;
        if (fragment != null) {
            C07S c07s = C07S.RESUMED;
            C07X viewLifecycleOwner = fragment.getViewLifecycleOwner();
            C57312k6 A00 = C07Y.A00(viewLifecycleOwner);
            c23671Dx = AbstractC23641Du.A04(AnonymousClass191.A00, new MCQ(viewLifecycleOwner, c07s, pokeReceiverView, null, 37), A00);
        }
        pokeReceiverView.A05 = c23671Dx;
    }

    @Override // X.InterfaceC11380iw
    public String getModuleName() {
        return this.A0A;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        float f;
        int A05 = C0f9.A05(-638373174);
        if (motionEvent != null) {
            int action = motionEvent.getAction();
            if (Integer.valueOf(action) != null) {
                if (action == 0) {
                    f = 0.8f;
                } else if (action == 3 || action == 1) {
                    f = 1.0f;
                }
                AbstractC125325le A00 = AbstractC125325le.A00(this);
                A00.A0G();
                AbstractC125325le A0E = A00.A0E(C55942hf.A02(10.0d));
                A0E.A0P(f, -1.0f);
                A0E.A0Q(f, -1.0f);
                A0E.A0H();
            }
            z = this.A07.A00.onTouchEvent(motionEvent);
        } else {
            z = false;
        }
        C0f9.A0C(-114563569, A05);
        return z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PokeReceiverView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A08 = new L62(context);
        this.A0A = "PokeReceiverView";
        this.A07 = new C008102v(context, new C44398Jjb(this));
        this.A09 = new AtomicBoolean(false);
    }

    public /* synthetic */ PokeReceiverView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PokeReceiverView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }
}
