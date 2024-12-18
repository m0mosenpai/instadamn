package X;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;

/* renamed from: X.2mR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC58682mR {
    InterfaceC58682mR A8x(Animator.AnimatorListener animatorListener);

    InterfaceC58682mR AAi(ValueAnimator.AnimatorUpdateListener animatorUpdateListener);

    InterfaceC58682mR ABF(boolean z);

    void ABL(float f);

    void APX();

    InterfaceC58682mR AWO(String str);

    float Aze();

    float BiI();

    int Bmx();

    C27859CPw CN4(String[] strArr, float f, float f2);

    void E4S();

    void EEv();

    void EFV(Animator.AnimatorListener animatorListener);

    InterfaceC58682mR EH0(int i);

    InterfaceC58682mR EH1();

    InterfaceC58682mR EMk(float f);

    InterfaceC58682mR EWJ(TimeInterpolator timeInterpolator);

    @Deprecated
    InterfaceC58682mR FEB(float f, float f2);

    boolean isFinished();

    boolean isPlaying();

    void pause();

    void stop();
}
