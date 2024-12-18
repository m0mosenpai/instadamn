package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager2.widget.ViewPager2;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.GhC, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37617GhC extends AbstractC37623GhI implements C38Y {
    public C3FQ A00;
    public final int A01;
    public final Activity A02;
    public final ViewOnTouchListenerC60632pm A03;
    public final C37643Ghc A04;
    public final C37618GhD A05;
    public final List A06;
    public final boolean A07;

    /* JADX WARN: Type inference failed for: r0v10, types: [X.Ghc, java.lang.Object] */
    public C37617GhC(Activity activity, Context context, UserSession userSession, List list, boolean z, boolean z2) {
        Float f;
        View view;
        float f2;
        C06090Tz c06090Tz;
        long j;
        AbstractC37302Gc3.A1U(userSession, list);
        this.A02 = activity;
        this.A07 = z2;
        boolean z3 = false;
        if (list.containsAll(AbstractC16960so.A1Q(EnumC37736GjB.A08, EnumC37736GjB.A09))) {
            if ((AbstractC37826Gkg.A00(userSession).booleanValue() && C18U.A06(C06090Tz.A05, userSession, 36318488268511456L)) || (AbstractC37832Gkm.A00(userSession).booleanValue() && C18U.A06(C06090Tz.A05, userSession, 36320098881052733L))) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        if (z3) {
            if (AbstractC37826Gkg.A00(userSession).booleanValue()) {
                c06090Tz = C06090Tz.A05;
                if (C18U.A06(c06090Tz, userSession, 36318488268511456L)) {
                    j = 37162913198440702L;
                    f2 = (AbstractC13890nF.A00(context) - context.getResources().getDimensionPixelOffset(R.dimen.tab_bar_height_panorama)) * ((float) C18U.A00(c06090Tz, userSession, j));
                    f = Float.valueOf(f2);
                }
            }
            if (AbstractC37832Gkm.A00(userSession).booleanValue()) {
                c06090Tz = C06090Tz.A05;
                if (C18U.A06(c06090Tz, userSession, 36320098881052733L)) {
                    j = 37164523811045710L;
                    f2 = (AbstractC13890nF.A00(context) - context.getResources().getDimensionPixelOffset(R.dimen.tab_bar_height_panorama)) * ((float) C18U.A00(c06090Tz, userSession, j));
                    f = Float.valueOf(f2);
                }
            }
            f2 = 0.0f;
            f = Float.valueOf(f2);
        } else {
            f = null;
        }
        int i = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        this.A03 = AbstractC60622pl.A00(context, f, true);
        this.A01 = C3HB.A00(context);
        this.A05 = new C37618GhD(z);
        C56352iT A00 = C56342iS.A00(activity);
        if (A00 != null) {
            C56352iT.A0F(A00);
            view = A00.A0U.getView();
        } else {
            view = null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        C56352iT A002 = C56342iS.A00(activity);
        this.A06 = AbstractC16960so.A1R(viewGroup, A002 != null ? A002.A0Q : null);
        this.A04 = new Object();
    }

    @Override // X.C38Y
    public final /* synthetic */ void DXR(int i) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DXS(int i) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DXa(int i, int i2) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DXc(int i, int i2) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DY0() {
    }

    @Override // X.C38Y
    public final /* synthetic */ void Dim(float f, float f2) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DrV() {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DrY(C120985dq c120985dq, int i) {
    }

    @Override // X.C38Y
    public final void Dj0(Integer num) {
        ViewPager2 viewPager2;
        ViewOnTouchListenerC60632pm viewOnTouchListenerC60632pm = this.A03;
        C37556GgC c37556GgC = super.A02;
        boolean z = false;
        if (c37556GgC != null && (viewPager2 = c37556GgC.A00) != null && viewPager2.A06.A06.A07) {
            z = true;
        }
        viewOnTouchListenerC60632pm.A0B = !z;
    }

    @Override // X.AbstractC37623GhI, X.InterfaceC60602pj
    public final void onDestroyView() {
        C3FQ c3fq = this.A00;
        if (c3fq != null) {
            c3fq.AI0();
        }
        this.A00 = null;
    }
}
