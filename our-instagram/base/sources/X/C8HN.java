package X;

import android.content.Context;
import com.facebook.onecamera.outputcontrollers.camera.basic.BasicCameraOutputController;
import com.instagram.common.session.UserSession;

/* renamed from: X.8HN, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8HN {
    public boolean A00;
    public boolean A01;
    public final C07X A02;
    public final InterfaceC175167qq A03;
    public final C174757qB A04;
    public final UserSession A05;
    public final C1810981l A06;
    public final AnonymousClass835 A07;
    public final C1814382v A08;
    public final AnonymousClass825 A09;
    public final Context A0A;
    public final AbstractC184688Hj A0B;

    public C8HN(Context context, C07X c07x, C174757qB c174757qB, UserSession userSession, C1810981l c1810981l, C1814382v c1814382v, AnonymousClass825 anonymousClass825) {
        C14360o3.A0B(c1814382v, 1);
        C14360o3.A0B(context, 4);
        C14360o3.A0B(userSession, 5);
        C14360o3.A0B(c07x, 6);
        C14360o3.A0B(c174757qB, 7);
        this.A08 = c1814382v;
        this.A09 = anonymousClass825;
        this.A06 = c1810981l;
        this.A0A = context;
        this.A05 = userSession;
        this.A02 = c07x;
        this.A04 = c174757qB;
        this.A07 = c1814382v.A00().BPO();
        this.A03 = new C23436Aa9(this);
        this.A0B = new C198048pF(this);
    }

    public static final void A00(C8HN c8hn, int i) {
        C175007qa c175007qa;
        if (i != c8hn.A04.A09()) {
            AnonymousClass825 anonymousClass825 = c8hn.A09;
            AbstractC184688Hj abstractC184688Hj = c8hn.A0B;
            C14360o3.A0B(abstractC184688Hj, 1);
            C174757qB c174757qB = anonymousClass825.A01;
            if (c174757qB != null && (c175007qa = ((BasicCameraOutputController) C174757qB.A02(c174757qB)).A04) != null) {
                C176837tf c176837tf = new C176837tf();
                c176837tf.A01(AbstractC176797tb.A0e, Integer.valueOf(i));
                c175007qa.A0N.Cpo(abstractC184688Hj, c176837tf.A00());
                return;
            }
            return;
        }
        A01(c8hn, c8hn.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000b, code lost:
    
        if (r4 == 2) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.C8HN r6, boolean r7) {
        /*
            X.7qB r0 = r6.A04
            int r4 = r0.A09()
            r3 = 1
            if (r4 == r3) goto Ld
            r0 = 2
            r5 = 0
            if (r4 != r0) goto Le
        Ld:
            r5 = 1
        Le:
            X.825 r0 = r6.A09
            X.05A r1 = r0.A0A
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r1.Egh(r0)
            X.835 r2 = r6.A07
            android.content.Context r1 = r6.A0A
            r0 = 2131238580(0x7f081eb4, float:1.8093443E38)
            if (r5 == 0) goto L25
            r0 = 2131238579(0x7f081eb3, float:1.809344E38)
        L25:
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r0)
            r2.EW1(r0)
            android.content.res.Resources r1 = r1.getResources()
            r0 = 2131965804(0x7f13376c, float:1.9568428E38)
            if (r5 != r3) goto L38
            r0 = 2131965805(0x7f13376d, float:1.956843E38)
        L38:
            java.lang.String r1 = r1.getString(r0)
            X.C14360o3.A0A(r1)
            X.834 r2 = (X.AnonymousClass834) r2
            r0 = 0
            X.C14360o3.A0B(r1, r0)
            android.view.View r0 = r2.getView()
            r0.setContentDescription(r1)
            if (r4 == r3) goto L5a
            if (r7 != 0) goto L5a
            X.82v r0 = r6.A08
            X.832 r0 = r0.A00()
            r0.CMi()
            return
        L5a:
            X.82v r0 = r6.A08
            X.832 r0 = r0.A00()
            r0.El7()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8HN.A01(X.8HN, boolean):void");
    }

    public final void A02() {
        C174757qB c174757qB = this.A04;
        InterfaceC175167qq interfaceC175167qq = this.A03;
        C175007qa c175007qa = ((BasicCameraOutputController) C174757qB.A02(c174757qB)).A04;
        if (c175007qa != null) {
            c175007qa.A0N.EFi(interfaceC175167qq);
        }
        this.A08.A00().CMi();
        this.A09.A0A.Egh(false);
    }
}
