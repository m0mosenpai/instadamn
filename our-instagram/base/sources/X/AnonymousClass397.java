package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;

/* renamed from: X.397, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass397 extends C1I2 implements InterfaceC60602pj {
    public boolean A00;
    public final Activity A01;
    public final Context A02;
    public final Fragment A03;
    public final C61792rg A04;
    public final UserSession A05;
    public final InterfaceC09390do A06;
    public final InterfaceC65282xQ A07;

    public AnonymousClass397(Fragment fragment, C61792rg c61792rg, UserSession userSession, InterfaceC65282xQ interfaceC65282xQ) {
        C14360o3.A0B(interfaceC65282xQ, 1);
        this.A07 = interfaceC65282xQ;
        this.A03 = fragment;
        this.A05 = userSession;
        this.A04 = c61792rg;
        this.A02 = fragment.getContext();
        this.A01 = fragment.getActivity();
        this.A06 = AbstractC09440dt.A01(new C206939Dy(this, 27));
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void ADK(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void D8S(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onCreate() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onDestroy() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onDestroyView() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStart() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStop() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final void onPause() {
        if (this.A00 && !C1H6.A03()) {
            ((ValueAnimator) this.A06.getValue()).setCurrentPlayTime(0L);
        }
    }

    @Override // X.InterfaceC60602pj
    public final void onResume() {
        if (this.A00 && !C1H6.A03()) {
            InterfaceC09390do interfaceC09390do = this.A06;
            ((ValueAnimator) interfaceC09390do.getValue()).setCurrentPlayTime(((Animator) interfaceC09390do.getValue()).getDuration());
        }
    }

    @Override // X.C1I2
    public final void onScroll(C3FQ c3fq, int i, int i2, int i3, int i4, int i5) {
        int i6;
        ValueAnimator valueAnimator;
        long duration;
        int A03 = C0f9.A03(-368588224);
        C14360o3.A0B(c3fq, 0);
        ViewGroup CFj = c3fq.CFj();
        C14360o3.A0C(CFj, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        RecyclerView recyclerView = (RecyclerView) CFj;
        AbstractC70663Fe abstractC70663Fe = recyclerView.A0D;
        if (abstractC70663Fe == null) {
            i6 = 2082667059;
        } else {
            C75113Zb c75113Zb = null;
            if (i == 0 && !C1H6.A03() && this.A00) {
                ((ValueAnimator) this.A06.getValue()).setCurrentPlayTime(0L);
                this.A04.A07(null);
                this.A00 = false;
                i6 = 1399832060;
            } else {
                InterfaceC65282xQ interfaceC65282xQ = this.A07;
                Object item = interfaceC65282xQ.getItem(i);
                if (item != null && (item instanceof InterfaceC38371qR)) {
                    c75113Zb = interfaceC65282xQ.BRZ(((InterfaceC38371qR) item).BQN());
                }
                int i7 = i2 + i;
                while (true) {
                    if (i >= i7) {
                        break;
                    }
                    if (abstractC70663Fe.A0d(i) == null) {
                        i6 = -1929158160;
                        break;
                    }
                    float height = (recyclerView.getHeight() - r6.getTop()) / r6.getHeight();
                    Object item2 = interfaceC65282xQ.getItem(i);
                    if (item2 != null && (item2 instanceof InterfaceC38371qR)) {
                        C75113Zb BRZ = interfaceC65282xQ.BRZ(((InterfaceC38371qR) item2).BQN());
                        if (BRZ.A2e) {
                            this.A00 = C14360o3.A0K(c75113Zb, BRZ);
                            if (height >= 0.85f) {
                                if (i5 > 0 && item != null) {
                                    this.A04.A07(recyclerView);
                                }
                            } else if (i5 < 0 && c75113Zb != null && !c75113Zb.A2e) {
                                this.A04.A07(null);
                            }
                            if (!C1H6.A03()) {
                                if (0.6f <= height && height <= 1.0f) {
                                    InterfaceC09390do interfaceC09390do = this.A06;
                                    valueAnimator = (ValueAnimator) interfaceC09390do.getValue();
                                    duration = ((height - 0.6f) / 0.39999998f) * ((float) ((Animator) interfaceC09390do.getValue()).getDuration());
                                } else {
                                    InterfaceC09390do interfaceC09390do2 = this.A06;
                                    valueAnimator = (ValueAnimator) interfaceC09390do2.getValue();
                                    if (height < 0.6f) {
                                        duration = 0;
                                    } else {
                                        duration = ((Animator) interfaceC09390do2.getValue()).getDuration();
                                    }
                                }
                                valueAnimator.setCurrentPlayTime(duration);
                            }
                        }
                    }
                    i++;
                }
                i6 = 836175539;
            }
        }
        C0f9.A0A(i6, A03);
    }

    @Override // X.C1I2
    public final void onScrollStateChanged(C3FQ c3fq, int i) {
        C0f9.A0A(-1811936554, C0f9.A03(-364103816));
    }
}
