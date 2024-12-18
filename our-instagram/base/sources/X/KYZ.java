package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.facebook.R;
import com.facebook.android.maps.model.LatLng;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.inbox.notes.ui.NoteBubbleView;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes8.dex */
public final class KYZ extends ULQ implements InterfaceC65626Tpm, XD0 {
    public float A00;
    public long A01;
    public View A02;
    public NoteBubbleView A03;
    public AbstractC47672L3f A04;
    public C44197Jg0 A05;
    public KKZ A06;
    public C44201Jg4 A07;
    public C44201Jg4 A08;
    public boolean A09;
    public float A0A;
    public float A0B;
    public AnonymousClass195 A0C;
    public boolean A0D;
    public final Context A0E;
    public final Paint A0F;
    public final Path A0G;
    public final RectF A0H;
    public final RectF A0I;
    public final RectF A0J;
    public final RectF A0K;
    public final Drawable A0L;
    public final C71196Wpl A0M;
    public final U70 A0N;
    public final UserSession A0O;
    public final C45128JyU A0P;
    public final C47695L4c A0Q;
    public final User A0R;
    public final boolean A0S;
    public final boolean A0T;
    public final double A0U;
    public final double A0V;
    public final double A0W;
    public final float A0X;
    public final float A0Y;
    public final float A0Z;
    public final float A0a;
    public final int A0b;
    public final int A0c;
    public final int A0d;
    public final int A0e;
    public final int A0f;
    public final int A0g;
    public final C07T A0h;
    public final C70394WTw A0i;
    public final boolean A0j;

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0196, code lost:
    
        if (((X.C45128JyU) X.AbstractC001800i.A0I(r28.A0M.A04())).A0I == false) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0207 A[LOOP:2: B:43:0x0201->B:45:0x0207, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02a2 A[LOOP:4: B:71:0x029c->B:73:0x02a2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public KYZ(android.content.Context r29, X.C07T r30, X.C71196Wpl r31, X.C70394WTw r32, com.instagram.common.session.UserSession r33, X.C45128JyU r34, X.C47695L4c r35) {
        /*
            Method dump skipped, instructions count: 1022
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KYZ.<init>(android.content.Context, X.07T, X.Wpl, X.WTw, com.instagram.common.session.UserSession, X.JyU, X.L4c):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0031, code lost:
    
        if (r0 != null) goto L11;
     */
    @Override // X.AbstractC66278U6y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0D(android.graphics.Canvas r6) {
        /*
            r5 = this;
            r0 = 0
            X.C14360o3.A0B(r6, r0)
            A00(r5)
            r6.save()
            boolean r3 = r5.A0S
            if (r3 != 0) goto L1d
            float r2 = r5.A00
            android.graphics.RectF r0 = r5.A0K
            float r1 = r0.centerX()
            float r0 = r0.centerY()
            r6.rotate(r2, r1, r0)
        L1d:
            r6.save()
            android.graphics.RectF r0 = r5.A0J
            float r1 = r0.left
            float r0 = r0.top
            r6.translate(r1, r0)
            if (r3 == 0) goto L9e
            boolean r0 = r5.A09
            if (r0 != 0) goto L9e
            X.Jg0 r0 = r5.A05
            if (r0 == 0) goto L36
        L33:
            r0.draw(r6)
        L36:
            r6.restore()
            X.L3f r0 = r5.A04
            boolean r0 = r0.A03
            if (r0 == 0) goto L5f
            com.instagram.direct.inbox.notes.ui.NoteBubbleView r2 = r5.A03
            if (r2 == 0) goto L5f
            r6.save()
            android.graphics.RectF r0 = r5.A0K
            float r1 = r0.left
            float r0 = r0.top
            r6.translate(r1, r0)
            android.graphics.Path r1 = r5.A0G
            android.graphics.Paint r0 = r5.A0F
            r6.drawPath(r1, r0)
            X.JQ0.A0z(r2)
            r2.draw(r6)
            r6.restore()
        L5f:
            android.view.View r2 = r5.A02
            if (r2 == 0) goto L8a
            r6.save()
            android.graphics.RectF r0 = r5.A0H
            float r1 = r0.left
            float r0 = r0.top
            r6.translate(r1, r0)
            X.JQ0.A0z(r2)
            r2.draw(r6)
            r6.restore()
            android.graphics.RectF r4 = r5.A0I
            android.content.Context r2 = r5.A0E
            r1 = 2130970272(0x7f0406a0, float:1.754925E38)
            r0 = 1
            X.C14360o3.A0B(r2, r0)
            int r0 = X.AbstractC167007dF.A09(r2, r1)
            X.AbstractC66077TzE.A00(r6, r4, r0)
        L8a:
            X.L3f r0 = r5.A04
            boolean r0 = r0.A02
            if (r0 == 0) goto La8
            X.KKZ r0 = r5.A06
            if (r0 != 0) goto La5
            java.lang.String r0 = "namePlateDrawable"
        L96:
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L9e:
            X.Jg4 r0 = r5.A07
            if (r0 != 0) goto L33
            java.lang.String r0 = "pogDrawable"
            goto L96
        La5:
            r0.draw(r6)
        La8:
            X.L3f r0 = r5.A04
            boolean r0 = r0.A04
            if (r0 == 0) goto Lb5
            X.Jg4 r0 = r5.A08
            if (r0 == 0) goto Lb5
            r0.draw(r6)
        Lb5:
            boolean r0 = r5.A0T
            if (r0 == 0) goto Ld2
            if (r3 != 0) goto Ld2
            X.JyU r0 = r5.A0P
            boolean r0 = r0.A0F
            if (r0 == 0) goto Ld2
            X.L3f r0 = r5.A04
            boolean r0 = r0.A01
            if (r0 == 0) goto Ld2
            r6.save()
            android.graphics.drawable.Drawable r0 = r5.A0L
            r0.draw(r6)
            r6.restore()
        Ld2:
            r6.restore()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KYZ.A0D(android.graphics.Canvas):void");
    }

    @Override // X.ULQ
    public final void A0K(ImageUrl imageUrl, String str, String str2) {
    }

    @Override // X.ULQ
    public final void A0L(Integer num, boolean z) {
    }

    public final void A0N(String str) {
        C14360o3.A0B(str, 2);
        C15370ps A1F = AbstractC25225BEi.A1F();
        A1F.A00 = this.A0P;
        if (this.A0S) {
            for (Object obj : this.A0M.A04()) {
                if (C14360o3.A0K(((C45128JyU) obj).A0B, str)) {
                    A1F.A00 = obj;
                }
            }
            throw new NoSuchElementException(MSV.A00(1));
        }
        boolean A03 = A03();
        AbstractC166987dD.A1Z(new PZO(A1F, this, null, 16, A03), AbstractC57302k5.A00(this.A0h));
    }

    @Override // X.XD0
    public final void CwV(U70 u70) {
        this.A00 = 0.0f;
    }

    @Override // X.XD0
    public final void CwZ(U70 u70) {
        this.A00 = 0.0f;
    }

    @Override // X.XD0
    public final void Cwh(U70 u70) {
        this.A00 = 0.0f;
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onCreate(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onDestroy(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onStart(C07X c07x) {
    }

    @Override // X.InterfaceC65626Tpm
    public final /* synthetic */ void onStop(C07X c07x) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004f, code lost:
    
        if (java.lang.Integer.valueOf(r5) != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01ff, code lost:
    
        r0 = r3.getMeasuredWidth();
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01fd, code lost:
    
        if (r3 != null) goto L78;
     */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.graphics.Rect A00(X.KYZ r19) {
        /*
            Method dump skipped, instructions count: 583
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KYZ.A00(X.KYZ):android.graphics.Rect");
    }

    private final void A01() {
        C44197Jg0 c44197Jg0;
        if (this.A0S && (c44197Jg0 = this.A05) != null) {
            UserSession userSession = this.A0O;
            C06090Tz A0U = AbstractC166997dE.A0U(userSession);
            if (C18U.A06(A0U, userSession, 36321722381379337L)) {
                ArrayList A0S = AbstractC001800i.A0S(c44197Jg0.A0F, c44197Jg0.A0E);
                ArrayList A0q = AbstractC167017dG.A0q(A0S);
                Iterator it = A0S.iterator();
                while (it.hasNext()) {
                    Drawable drawable = ((C44202Jg5) it.next()).A02;
                    C14360o3.A0C(drawable, "null cannot be cast to non-null type com.instagram.friendmap.video.MapVideoAnnotation");
                    A0q.add(drawable);
                }
                ArrayList A1E = AbstractC166987dD.A1E();
                for (Object obj : A0q) {
                    if (((MQ8) obj).AkZ()) {
                        A1E.add(obj);
                    }
                }
                List A0d = AbstractC001800i.A0d(A1E, C17s.A05(new C17u(1, 5), AbstractC25225BEi.A07(A0U, userSession, 36603197358150554L)));
                if (A0d != null) {
                    Iterator it2 = A0d.iterator();
                    while (it2.hasNext()) {
                        A02((MQ8) it2.next());
                    }
                    return;
                }
                return;
            }
        }
        C44201Jg4 c44201Jg4 = this.A07;
        if (c44201Jg4 == null) {
            C14360o3.A0F("pogDrawable");
            throw C00O.createAndThrow();
        }
        A02(c44201Jg4);
    }

    private final boolean A03() {
        float f;
        C45128JyU c45128JyU = this.A0P;
        boolean z = c45128JyU.A0J;
        if (z) {
            f = this.A0a;
        } else {
            f = this.A0Z;
        }
        C47695L4c c47695L4c = this.A0Q;
        LatLng latLng = new LatLng(this.A0U + Math.toDegrees((-(f * this.A0W)) / 6371009.0d), this.A0V);
        String str = c45128JyU.A0B;
        C4F5 c4f5 = c45128JyU.A05;
        User user = c45128JyU.A06;
        long j = c45128JyU.A02;
        String str2 = c45128JyU.A0A;
        boolean z2 = c45128JyU.A0H;
        boolean z3 = c45128JyU.A0I;
        String str3 = c45128JyU.A09;
        boolean z4 = c45128JyU.A0C;
        boolean z5 = c45128JyU.A0E;
        int i = c45128JyU.A01;
        boolean z6 = c45128JyU.A0G;
        boolean z7 = c45128JyU.A0F;
        boolean z8 = c45128JyU.A0K;
        boolean z9 = c45128JyU.A00;
        boolean z10 = c45128JyU.A0D;
        String str4 = c45128JyU.A08;
        Integer num = c45128JyU.A07;
        AbstractC167007dF.A1E(str, 0, user);
        C14360o3.A0B(num, 19);
        C45128JyU c45128JyU2 = new C45128JyU(latLng, c4f5, user, num, str, str2, str3, str4, i, j, z2, z3, z, z4, z5, z6, z7, z8, z9, z10);
        C45999KXn c45999KXn = c47695L4c.A04;
        int A00 = AbstractC13890nF.A00(c47695L4c.A00.requireContext());
        C45999KXn.A05(c45128JyU2.A03, c45999KXn, 17.5f, 0L, true, false, false);
        AbstractC47032Kqp.A00(c45999KXn, new MCG(c45128JyU2, c45999KXn, (InterfaceC23621Ds) null, A00), 300L);
        return AbstractC25230BEn.A1P((this.A0i.A02().A02 > 17.5f ? 1 : (this.A0i.A02().A02 == 17.5f ? 0 : -1)));
    }

    private final boolean A04() {
        WFW wfw = this.A0i.A0J;
        C66356UBx c66356UBx = wfw.A00.A0I;
        LatLng A04 = wfw.A04(0.0f, c66356UBx.A0E);
        LatLng A042 = wfw.A04(c66356UBx.A0G, c66356UBx.A0E);
        LatLng A043 = wfw.A04(0.0f, 0.0f);
        LatLng A044 = wfw.A04(c66356UBx.A0G, 0.0f);
        W52 w52 = new W52();
        w52.A02(A04);
        w52.A02(A043);
        w52.A02(A042);
        w52.A02(A044);
        return w52.A01().A01(Bea());
    }

    @Override // X.AbstractC66278U6y
    public final int A0A(float f, float f2) {
        if (this.A0j) {
            if (this.A0K.contains(f, f2) || this.A0H.contains(f, f2)) {
                return 1;
            }
            return 0;
        }
        return 0;
    }

    @Override // X.AbstractC66278U6y
    public final void A0C(float f, float f2) {
        this.A0C = AbstractC25226BEj.A1L(new MBp(this, null, 38), AbstractC57302k5.A00(this.A0h));
    }

    @Override // X.AbstractC66278U6y
    public final boolean A0E(float f, float f2) {
        Object obj;
        C4F5 c4f5;
        List list;
        InterfaceC50424MOe interfaceC50424MOe;
        C6C9 BXJ;
        String str;
        Long A0j;
        if (!this.A0S) {
            C47695L4c c47695L4c = this.A0Q;
            String str2 = this.A0P.A0B;
            C14360o3.A0B(str2, 0);
            C45999KXn c45999KXn = c47695L4c.A04;
            Iterator A03 = C45293K2v.A03(c45999KXn);
            while (true) {
                if (A03.hasNext()) {
                    obj = A03.next();
                    if (C14360o3.A0K(((C45128JyU) obj).A0B, str2)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            C45128JyU c45128JyU = (C45128JyU) obj;
            if (c45128JyU != null && (c4f5 = c45128JyU.A05) != null && (list = c4f5.A0J) != null && (interfaceC50424MOe = (InterfaceC50424MOe) AbstractC001800i.A0J(list)) != null && (BXJ = interfaceC50424MOe.BXJ()) != null && (str = BXJ.A0H) != null && (A0j = AbstractC166997dE.A0j(str)) != null) {
                long longValue = A0j.longValue();
                if (!c45128JyU.A06(c45999KXn.A02)) {
                    c45999KXn.A0M(C49458LtW.A00);
                    c45999KXn.A0M(new C49440LtE(c45128JyU, new C9GY(longValue, c45999KXn, 2)));
                    return true;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    @Override // X.AbstractC66278U6y
    public final boolean A0F(float f, float f2) {
        Object obj;
        C4F5 c4f5;
        boolean z = false;
        if (!this.A0S) {
            z = true;
            this.A0D = true;
            C47695L4c c47695L4c = this.A0Q;
            String str = this.A0P.A0B;
            C14360o3.A0B(str, 0);
            C45999KXn c45999KXn = c47695L4c.A04;
            Iterator A03 = C45293K2v.A03(c45999KXn);
            while (true) {
                if (A03.hasNext()) {
                    obj = A03.next();
                    if (C14360o3.A0K(((C45128JyU) obj).A0B, str)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            C45128JyU c45128JyU = (C45128JyU) obj;
            if (c45128JyU != null && (c4f5 = c45128JyU.A05) != null) {
                c45999KXn.A0M(new C49460LtY(true, new ME1(48, c4f5, c45999KXn)));
            }
        }
        return z;
    }

    @Override // X.AbstractC66278U6y
    public final boolean A0G(float f, float f2) {
        if (this.A0D) {
            this.A0D = false;
            return false;
        }
        if (this.A0S) {
            C47695L4c c47695L4c = this.A0Q;
            C71196Wpl c71196Wpl = this.A0M;
            LinkedList A04 = c71196Wpl.A04();
            L95 l95 = c47695L4c.A03;
            ArrayList A0q = AbstractC167017dG.A0q(A04);
            Iterator it = A04.iterator();
            while (it.hasNext()) {
                A0q.add(AbstractC43592JPx.A0j(it).A04);
            }
            if (l95.A01(A0q, 40.0f, false)) {
                c47695L4c.A02.A0G(A04, false);
                return true;
            }
            LinkedList A042 = c71196Wpl.A04();
            c47695L4c.A02.A0G(A042, true);
            C45999KXn c45999KXn = c47695L4c.A04;
            c45999KXn.A0M(new C49460LtY(false, new ME1(46, A042, c45999KXn)));
            C45999KXn.A0C(new C46000KXo(C45293K2v.A00(c45999KXn)), c45999KXn);
            return true;
        }
        boolean A03 = A03();
        AbstractC166987dD.A1Z(new PZW(this, (InterfaceC23621Ds) null, 26, A03), AbstractC57302k5.A00(this.A0h));
        return true;
    }

    @Override // X.ULS
    public final void A0H(float f) {
        C44201Jg4 c44201Jg4 = this.A07;
        if (c44201Jg4 == null) {
            C14360o3.A0F("pogDrawable");
            throw C00O.createAndThrow();
        }
        float f2 = 255.0f * f;
        c44201Jg4.setAlpha(C1H4.A01(f2));
        C44197Jg0 c44197Jg0 = this.A05;
        if (c44197Jg0 != null) {
            c44197Jg0.setAlpha(C1H4.A01(f2));
        }
        NoteBubbleView noteBubbleView = this.A03;
        if (noteBubbleView != null) {
            noteBubbleView.setAlpha(f);
        }
        A05();
    }

    @Override // X.ULS
    public final void A0I(LatLng latLng) {
        super.A00 = WFW.A01(latLng.A01);
        super.A01 = WFW.A00(latLng.A00);
        A05();
    }

    public final void A0M(AbstractC47672L3f abstractC47672L3f, Long l) {
        if (!this.A0S && !C14360o3.A0K(this.A04, abstractC47672L3f)) {
            AnonymousClass195 anonymousClass195 = this.A0C;
            if (anonymousClass195 != null) {
                anonymousClass195.AGH(null);
            }
            this.A04 = abstractC47672L3f;
            C44201Jg4 c44201Jg4 = this.A07;
            if (c44201Jg4 == null) {
                C14360o3.A0F("pogDrawable");
                throw C00O.createAndThrow();
            }
            c44201Jg4.A04(abstractC47672L3f.A00, l, true);
            A05();
        }
    }

    @Override // X.AbstractC66278U6y, X.InterfaceC71945XBu
    public final String getId() {
        C45128JyU c45128JyU = this.A0P;
        if (c45128JyU.A05 != null) {
            String str = c45128JyU.A0A;
            if (str == null) {
                return "";
            }
            return str;
        }
        return C45128JyU.A00(c45128JyU);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        this.A0i.A0I.invalidate();
    }

    @Override // X.InterfaceC65626Tpm
    public final void onPause(C07X c07x) {
        C44201Jg4 c44201Jg4 = this.A07;
        if (c44201Jg4 == null) {
            C14360o3.A0F("pogDrawable");
            throw C00O.createAndThrow();
        }
        ValueAnimator valueAnimator = c44201Jg4.A0C;
        if (valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
    }

    private final void A02(MQ8 mq8) {
        InterfaceC16660sJ interfaceC16660sJ;
        if (mq8.AkZ() && A04()) {
            C47695L4c c47695L4c = this.A0Q;
            if (C18U.A06(C06090Tz.A05, c47695L4c.A01, 36321722378561256L)) {
                interfaceC16660sJ = c47695L4c.A05;
            } else {
                return;
            }
        } else if (((C44201Jg4) mq8).A0E.A00 == null) {
            return;
        } else {
            interfaceC16660sJ = this.A0Q.A06;
        }
        interfaceC16660sJ.invoke(mq8);
    }

    @Override // X.AbstractC66278U6y
    public final void A0B(float f, float f2) {
        this.A01 = System.currentTimeMillis();
        C45128JyU c45128JyU = this.A0P;
        C14360o3.A0B(c45128JyU, 1);
        boolean A05 = c45128JyU.A05();
        int i = R.dimen.abc_alert_dialog_button_dimen;
        if (A05) {
            i = R.dimen.abc_list_item_height_material;
        }
        A0M(new AbstractC47672L3f(new AbstractC44205Jg9(0.5f, 0.0f, i, 0, 0, 0, 1790, false, false, false), true, true, true, true), 250L);
    }

    @Override // X.ULQ
    public final String A0J() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append(this.A0U);
        A1C.append(this.A0V);
        return A1C.toString();
    }

    @Override // X.InterfaceC65626Tpm
    public final void onResume(C07X c07x) {
        A01();
    }
}
