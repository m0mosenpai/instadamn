package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.litho.LithoView;
import java.lang.ref.WeakReference;

/* renamed from: X.HLy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39170HLy extends C1I2 {
    public final int A00;
    public final Object A01;

    public C39170HLy(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v2 */
    @Override // X.C1I2
    public final void onScroll(C3FQ c3fq, int i, int i2, int i3, int i4, int i5) {
        int A03;
        int i6;
        View.OnClickListener A00;
        ?? r9;
        int i7;
        String string;
        if (this.A00 != 0) {
            A03 = C0f9.A03(500527686);
            V1R v1r = (V1R) this.A01;
            if (V1R.A01(v1r).A02 == null && V1R.A01(v1r).A03 == null) {
                i6 = -440585398;
            } else {
                if (i > 3) {
                    if (v1r.mView != null) {
                        if (v1r.A0K == null) {
                            C41057IGa c41057IGa = V1R.A01(v1r).A03;
                            Context requireContext = v1r.requireContext();
                            if (c41057IGa != null) {
                                string = c41057IGa.A01;
                                A00 = new ViewOnClickListenerC42034Ik3(24, c41057IGa, v1r);
                                r9 = 1;
                                i7 = -1;
                            } else {
                                A00 = ViewOnClickListenerC42032Ik1.A00(v1r, 37);
                                r9 = 1;
                                i7 = -1;
                                string = requireContext.getString(2131962827);
                            }
                            C3BD c3bd = new C3BD(requireContext, A00, string, i7, r9);
                            v1r.A0K = c3bd;
                            View view = v1r.mView;
                            C14360o3.A0C(view, AbstractC111324zv.A00(r9));
                            c3bd.A07((FrameLayout) view);
                            C3BD c3bd2 = v1r.A0K;
                            if (c3bd2 != null) {
                                c3bd2.A03(C1H4.A01(AbstractC13880nE.A04(v1r.requireContext(), 60)));
                            }
                            C3BD c3bd3 = v1r.A0K;
                            if (c3bd3 != null) {
                                c3bd3.A02(81);
                            }
                        }
                        C3BD c3bd4 = v1r.A0K;
                        if (c3bd4 != null) {
                            c3bd4.A06(c3bd4.A03);
                        }
                    }
                } else {
                    C3BD c3bd5 = v1r.A0K;
                    if (c3bd5 != null) {
                        c3bd5.A05(c3bd5.A04);
                    }
                }
                i6 = -521507153;
            }
        } else {
            A03 = C0f9.A03(-1876737694);
            C14360o3.A0B(c3fq, 0);
            View AnU = c3fq.AnU(i2 - 1);
            if (AnU == null) {
                i6 = -455417659;
            } else {
                WeakReference weakReference = CNZ.A01;
                if (weakReference.get() == null && ((AnU instanceof C3W1) || (AnU instanceof LithoView))) {
                    weakReference = AbstractC25225BEi.A16(AnU);
                    CNZ.A01 = weakReference;
                }
                if (weakReference.get() != null && AnU.equals(weakReference.get())) {
                    int height = AnU.getHeight();
                    Rect rect = new Rect(0, 0, 0, 0);
                    AnU.getGlobalVisibleRect(rect);
                    int i8 = height - (rect.bottom - rect.top);
                    C27824COn c27824COn = (C27824COn) this.A01;
                    Context context = c3fq.getContext();
                    C14360o3.A07(context);
                    c27824COn.A00.A01(Float.valueOf(AbstractC13880nE.A01(context, i8)));
                }
                i6 = -1509820900;
            }
        }
        C0f9.A0A(i6, A03);
    }

    @Override // X.C1I2
    public final void onScrollStateChanged(C3FQ c3fq, int i) {
        int A03;
        int i2;
        if (this.A00 != 0) {
            A03 = C0f9.A03(-330091911);
            i2 = -969087203;
        } else {
            A03 = C0f9.A03(59644987);
            i2 = -1059621423;
        }
        C0f9.A0A(i2, A03);
    }
}
