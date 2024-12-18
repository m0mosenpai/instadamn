package X;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Space;
import com.facebook.common.messagingui.observableverticaloffsetlayout.observableverticaloffsetconstraintlayout.ObservableVerticalOffsetConstraintLayout;
import java.util.List;

/* renamed from: X.79p, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1585479p extends AbstractC1585579q implements InterfaceC161697Me, InterfaceC161707Mf, InterfaceC161737Mi {
    public final View A00;
    public final View A01;
    public final Space A02;
    public final ObservableVerticalOffsetConstraintLayout A03;
    public final C7SK A04;
    public final C7SB A05;
    public final C1585379o A06;
    public final C7SH A07;
    public final C7S4 A08;
    public final C7SI A09;
    public final C7S9 A0A;
    public final C7SA A0B;
    public final C7SE A0C;
    public final C162957Rg A0D;
    public final C7SL A0E;
    public final C162947Rf A0F;
    public final C7SC A0G;
    public final C7S6 A0H;
    public final C163047Rp A0I;
    public final C7S0 A0J;
    public final C7S3 A0K;
    public final C7SQ A0L;
    public final C7SR A0M;

    @Override // X.InterfaceC161707Mf
    public final void APo(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        this.A0L.APo(motionEvent);
    }

    @Override // X.InterfaceC161697Me
    public final void DCG(Canvas canvas, Integer num, float f) {
        C14360o3.A0B(num, 2);
        this.A0M.DCG(canvas, num, f);
    }

    @Override // X.InterfaceC161697Me
    public final void Drc(Integer num) {
        C14360o3.A0B(num, 0);
        this.A0M.Drc(num);
    }

    @Override // X.InterfaceC161707Mf
    public final boolean Eiq(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        return this.A0L.Eiq(motionEvent);
    }

    @Override // X.InterfaceC161697Me
    public final boolean AG9() {
        return this.A0M.AG9();
    }

    @Override // X.InterfaceC161697Me
    public final boolean AGA(MotionEvent motionEvent) {
        return this.A0M.AG9();
    }

    @Override // X.InterfaceC161737Mi
    public final C7S5 Bkh() {
        return this.A08;
    }

    @Override // X.InterfaceC161697Me
    public final Integer C4a() {
        return this.A0M.C4a();
    }

    @Override // X.InterfaceC161697Me
    public final float C4c() {
        return this.A0M.C4c();
    }

    @Override // X.InterfaceC161697Me
    public final List CGY() {
        return this.A0M.CGY();
    }

    @Override // X.InterfaceC161697Me
    public final List CGZ() {
        return this.A0M.CGZ();
    }

    @Override // X.InterfaceC161707Mf
    public final void DBy(float f, float f2) {
        this.A0L.DBy(f, f2);
    }

    @Override // X.InterfaceC161707Mf
    public final boolean Ej5() {
        return this.A0L.Ej5();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, X.7S4] */
    public C1585479p(View view, View view2, Space space, ObservableVerticalOffsetConstraintLayout observableVerticalOffsetConstraintLayout, C7SK c7sk, C7SB c7sb, C1585379o c1585379o, C7SH c7sh, C7SI c7si, C7S9 c7s9, C7SA c7sa, C7SE c7se, C162957Rg c162957Rg, C7SL c7sl, C162947Rf c162947Rf, C7SC c7sc, C7QD c7qd, C7QD c7qd2, C7S6 c7s6, C163047Rp c163047Rp, C7S0 c7s0, C7S3 c7s3) {
        super(observableVerticalOffsetConstraintLayout, c7qd, c7qd2);
        C14360o3.A0B(c162947Rf, 5);
        C14360o3.A0B(space, 19);
        this.A03 = observableVerticalOffsetConstraintLayout;
        this.A0D = c162957Rg;
        this.A0F = c162947Rf;
        this.A0I = c163047Rp;
        this.A0J = c7s0;
        this.A0K = c7s3;
        this.A0H = c7s6;
        this.A0A = c7s9;
        this.A07 = c7sh;
        this.A0C = c7se;
        this.A09 = c7si;
        this.A0B = c7sa;
        this.A05 = c7sb;
        this.A0G = c7sc;
        this.A04 = c7sk;
        this.A0E = c7sl;
        this.A02 = space;
        this.A06 = c1585379o;
        this.A00 = view;
        this.A01 = view2;
        this.A08 = new Object();
        this.A0L = new C7SQ(observableVerticalOffsetConstraintLayout, null, c162957Rg);
        Context context = this.itemView.getContext();
        C14360o3.A07(context);
        this.A0M = new C7SR(context, observableVerticalOffsetConstraintLayout, view, c7qd, c7qd2, c1585379o, c7s0, c163047Rp, c7s6, c7s9, c7sh, c7sa, c7sb, c7sc, null, c7se, c7si, c7sl, null);
    }
}
