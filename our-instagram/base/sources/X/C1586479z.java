package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.79z, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1586479z implements C7QC {
    public long A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final InterfaceC164977Zm A03;
    public final AnonymousClass988 A04;
    public final C7A2 A05;
    public final C7A3 A06;
    public final C7A1 A07;
    public final C7EA A08;
    public final C162907Rb A09;
    public final InterfaceC09390do A0A;
    public final C7A0 A0B;

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ C7QD ANU(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C14360o3.A0B(viewGroup, 0);
        C14360o3.A0B(layoutInflater, 1);
        View inflate = layoutInflater.inflate(R.layout.direct_media_message, viewGroup, false);
        C14360o3.A0A(inflate);
        C7N9.A01(inflate);
        JUG jug = new JUG(inflate);
        Drawable indeterminateDrawable = jug.A0A.getIndeterminateDrawable();
        Context context = inflate.getContext();
        indeterminateDrawable.setColorFilter(context.getColor(AbstractC53242c7.A0H(context, R.attr.progressBar)), PorterDuff.Mode.SRC_IN);
        C162907Rb c162907Rb = this.A09;
        if (c162907Rb != null) {
            c162907Rb.A00(jug);
        }
        return jug;
    }

    public C1586479z(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC164977Zm interfaceC164977Zm, AnonymousClass988 anonymousClass988) {
        this.A02 = userSession;
        this.A03 = interfaceC164977Zm;
        this.A04 = anonymousClass988;
        this.A01 = interfaceC11380iw;
        InterfaceC165707ax interfaceC165707ax = (InterfaceC165707ax) interfaceC164977Zm;
        InterfaceC164957Zk interfaceC164957Zk = (InterfaceC164957Zk) interfaceC164977Zm;
        this.A0B = new C7A0(userSession, (InterfaceC164987Zn) interfaceC164977Zm, interfaceC165707ax, interfaceC164957Zk, (InterfaceC165717ay) interfaceC164977Zm, (InterfaceC164967Zl) interfaceC164977Zm, anonymousClass988);
        this.A0A = C1XM.A00(new C9FA(11, this, context));
        this.A07 = new C7A1(userSession, context);
        this.A05 = new C7A2(userSession);
        this.A06 = new C7A3(context);
        this.A08 = new C7EA(userSession, new C7E9(userSession));
        boolean z = anonymousClass988.A1U;
        C7AZ c7az = new C7AZ(z);
        C7Q6 c7q6 = new C7Q6() { // from class: X.7A4
            @Override // X.C7Q6
            public final /* bridge */ /* synthetic */ boolean DT4(MotionEvent motionEvent, Object obj, Object obj2) {
                JUe jUe = (JUe) obj;
                JUG jug = (JUG) obj2;
                C14360o3.A0B(jUe, 0);
                C14360o3.A0B(jug, 1);
                return C1586479z.A00(C1586479z.this, jug, jUe);
            }
        };
        C158657Ab c158657Ab = new C158657Ab((InterfaceC165247aD) interfaceC164977Zm, c7az.A00);
        C7Q9 c7q9 = new C7Q9((InterfaceC165307aJ) interfaceC164977Zm, z);
        this.A09 = new C162907Rb(AbstractC16960so.A1Q(new C1580177l(new C162897Ra((InterfaceC165207a9) interfaceC164977Zm), c7q6, c158657Ab, c7q9, (InterfaceC165507ad) interfaceC164977Zm, anonymousClass988, null, false), c7az));
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    @Override // X.C7QC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void ADy(X.C7QD r21, X.InterfaceC129555tK r22) {
        /*
            Method dump skipped, instructions count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1586479z.ADy(X.7QD, X.5tK):void");
    }

    @Override // X.C7QC
    public final /* bridge */ /* synthetic */ void F91(C7QD c7qd) {
        C47Z A03;
        JUG jug = (JUG) c7qd;
        C14360o3.A0B(jug, 0);
        C162907Rb c162907Rb = this.A09;
        if (c162907Rb != null) {
            c162907Rb.A01(jug);
        }
        jug.A06.A01();
        MRJ mrj = jug.A00;
        if (mrj != null) {
            mrj.DfP();
        }
        jug.A00 = null;
        C7A2 c7a2 = this.A05;
        C3AY c3ay = (C3AY) c7a2.A01.remove(jug);
        if (c3ay != null && (A03 = C25A.A00(c7a2.A00).A03((String) c3ay.A00)) != null) {
            Object obj = c3ay.A01;
            C14360o3.A06(obj);
            A03.A0X((InterfaceC65982ya) obj);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ed, code lost:
    
        if (r14 == X.C05F.A01) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A00(X.C1586479z r16, X.JUG r17, X.JUe r18) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1586479z.A00(X.79z, X.JUG, X.JUe):boolean");
    }
}
