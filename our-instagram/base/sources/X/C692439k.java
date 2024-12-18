package X;

import android.content.Context;
import android.view.View;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.litho.LithoView;
import com.instagram.common.session.UserSession;

/* renamed from: X.39k, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C692439k implements InterfaceC65652y1 {
    public final Context A00;
    public final C19260xA A01;
    public final UserSession A02;
    public final C65682y4 A03;
    public final C692339j A04;
    public final C691939f A05;
    public final InterfaceC60442pS A06;
    public final AnonymousClass398 A07;
    public final C33P A08;
    public final C1M1 A09;
    public final Integer A0A;
    public final String A0B;
    public final String A0C;
    public final InterfaceC16620sF A0D;
    public final boolean A0E;
    public final C62862tP A0F;
    public final C60972qL A0G;
    public final String A0H;

    public C692439k(C62862tP c62862tP, C19260xA c19260xA, C65682y4 c65682y4, C692339j c692339j, C691939f c691939f, C60972qL c60972qL, AnonymousClass398 anonymousClass398, C33P c33p, C1M1 c1m1, Integer num, String str, String str2, String str3, InterfaceC16620sF interfaceC16620sF, boolean z) {
        C14360o3.A0B(c60972qL, 2);
        C14360o3.A0B(c691939f, 3);
        C14360o3.A0B(c692339j, 4);
        this.A0H = str;
        this.A0G = c60972qL;
        this.A05 = c691939f;
        this.A04 = c692339j;
        this.A07 = anonymousClass398;
        this.A0F = c62862tP;
        this.A0E = z;
        this.A0D = interfaceC16620sF;
        this.A09 = c1m1;
        this.A08 = c33p;
        this.A0C = str2;
        this.A0A = num;
        this.A03 = c65682y4;
        this.A01 = c19260xA;
        this.A0B = str3;
        this.A00 = c60972qL.A00;
        this.A02 = c60972qL.A01;
        this.A06 = c60972qL.A02;
    }

    public final boolean A00(View view, EnumC65592xv enumC65592xv, C38321qM c38321qM, C75113Zb c75113Zb) {
        AbstractC65902yS abstractC65902yS;
        LithoView lithoView;
        String id;
        InterfaceC16820sZ d8m;
        InterfaceC16820sZ d8m2;
        InterfaceC16820sZ interfaceC16820sZ;
        C14360o3.A0B(enumC65592xv, 0);
        C14360o3.A0B(c38321qM, 2);
        C14360o3.A0B(c75113Zb, 3);
        switch (enumC65592xv.ordinal()) {
            case StringTreeSet.PAYLOAD_MASK /* 63 */:
                abstractC65902yS = (AbstractC65902yS) this.A07.A0r.getValue();
                lithoView = (LithoView) view;
                this.A05.A0d.getValue();
                id = c38321qM.getId();
                if (id != null) {
                    d8m = new D8M(38, c38321qM, this);
                    d8m2 = new ME4(44, c38321qM, this, view);
                    interfaceC16820sZ = C25055B7c.A00;
                    break;
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 94:
            default:
                return false;
            case 79:
                abstractC65902yS = (AbstractC65902yS) this.A07.A0E.getValue();
                lithoView = (LithoView) view;
                this.A05.A09.getValue();
                id = c38321qM.getId();
                if (id != null) {
                    d8m = new D8M(39, c38321qM, this);
                    d8m2 = new D8M(40, c38321qM, this);
                    interfaceC16820sZ = C25057B7e.A00;
                    break;
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            case 80:
                abstractC65902yS = (AbstractC65902yS) this.A07.A0l.getValue();
                lithoView = (LithoView) view;
                this.A05.A00();
                id = c38321qM.getId();
                if (id != null) {
                    d8m = new C9F4(31, c38321qM, this);
                    d8m2 = new C9FQ(29, c38321qM, this, c75113Zb);
                    interfaceC16820sZ = C99844e6.A00;
                    break;
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            case 81:
                abstractC65902yS = (AbstractC65902yS) this.A07.A0f.getValue();
                lithoView = (LithoView) view;
                this.A05.A01();
                id = C75563aN.A00(c38321qM);
                d8m = new C9FQ(36, c38321qM, this, c75113Zb);
                d8m2 = new C9FQ(37, c38321qM, this, c75113Zb);
                interfaceC16820sZ = new C9EE(this, 5);
                break;
            case 82:
                abstractC65902yS = (AbstractC65902yS) this.A07.A09.getValue();
                lithoView = (LithoView) view;
                this.A05.A0S.getValue();
                id = c38321qM.getId();
                if (id != null) {
                    d8m = B7Y.A00;
                    d8m2 = new C9FQ(30, c38321qM, this, c75113Zb);
                    interfaceC16820sZ = B7Z.A00;
                    break;
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            case 83:
                abstractC65902yS = (AbstractC65902yS) this.A07.A0L.getValue();
                lithoView = (LithoView) view;
                this.A05.A0F.getValue();
                id = c38321qM.getId();
                if (id != null) {
                    d8m = new C9FQ(24, c38321qM, this, c75113Zb);
                    d8m2 = new C9FY(32, view, this, c75113Zb, c38321qM);
                    interfaceC16820sZ = new C9EE(this, 2);
                    break;
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            case 84:
                abstractC65902yS = (AbstractC65902yS) this.A07.A0K.getValue();
                lithoView = (LithoView) view;
                this.A05.A0E.getValue();
                id = c38321qM.getId();
                if (id != null) {
                    d8m = new C9FQ(26, c38321qM, this, c75113Zb);
                    d8m2 = new C9FY(33, view, this, c75113Zb, c38321qM);
                    interfaceC16820sZ = new C9EE(this, 3);
                    break;
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            case 85:
                abstractC65902yS = (AbstractC65902yS) this.A07.A0J.getValue();
                lithoView = (LithoView) view;
                this.A05.A0D.getValue();
                id = c38321qM.getId();
                if (id != null) {
                    d8m = new C9FQ(27, c38321qM, this, c75113Zb);
                    d8m2 = new C9FQ(28, c38321qM, this, c75113Zb);
                    interfaceC16820sZ = C42K.A00;
                    break;
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            case 86:
                abstractC65902yS = (AbstractC65902yS) this.A07.A0p.getValue();
                lithoView = (LithoView) view;
                this.A05.A0c.getValue();
                id = c38321qM.getId();
                if (id == null) {
                    id = "";
                }
                d8m = new C9F4(29, c38321qM, this);
                d8m2 = new C9F4(30, c38321qM, this);
                interfaceC16820sZ = B7X.A00;
                break;
            case 87:
                abstractC65902yS = (AbstractC65902yS) this.A07.A0h.getValue();
                lithoView = (LithoView) view;
                id = String.valueOf(c38321qM.getId());
                d8m = new C9FQ(38, c38321qM, this, c75113Zb);
                d8m2 = new C9FY(34, view, this, c75113Zb, c38321qM);
                interfaceC16820sZ = C80133i2.A00;
                break;
            case 88:
                C97354Yu c97354Yu = (C97354Yu) this.A07.A0Y.getValue();
                C691939f c691939f = this.A05;
                C97404Za A01 = ((C96464Vf) c691939f.A0L.getValue()).A01(this.A00, c38321qM, this.A06, c75113Zb, this.A08);
                Object tag = view.getTag();
                C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.feed.adapter.row.feedfullheightmedia.viewholder.FeedFullHeightMediaViewHolder");
                C81463kG c81463kG = (C81463kG) tag;
                c691939f.A01();
                String A00 = C75563aN.A00(c38321qM);
                C9FQ c9fq = new C9FQ(25, c38321qM, this, c75113Zb);
                C9EE c9ee = new C9EE(this, 4);
                C9FQ c9fq2 = new C9FQ(33, c38321qM, this, c75113Zb);
                C14360o3.A0B(c81463kG, 1);
                c97354Yu.A00.A01(A01, c81463kG, c75113Zb);
                AbstractC81293jz abstractC81293jz = c81463kG.A05;
                if (!(abstractC81293jz instanceof C98924cC)) {
                    return true;
                }
                LithoView lithoView2 = ((C98924cC) abstractC81293jz).A00;
                c81463kG.A03.setVisibility(8);
                c97354Yu.A01.A05(lithoView2, A00, c9fq2, c9fq, c9ee);
                return true;
            case 89:
                abstractC65902yS = (AbstractC65902yS) this.A07.A0T.getValue();
                lithoView = (LithoView) view;
                this.A05.A0L.getValue();
                id = c38321qM.getId();
                if (id != null) {
                    d8m = new C9FQ(23, c38321qM, this, c75113Zb);
                    d8m2 = new C9FY(31, view, this, c75113Zb, c38321qM);
                    interfaceC16820sZ = C120765dM.A00;
                    break;
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            case 90:
                abstractC65902yS = (AbstractC65902yS) this.A07.A0y.getValue();
                lithoView = (LithoView) view;
                this.A05.A0g.getValue();
                id = c38321qM.getId();
                if (id != null) {
                    d8m = new D8M(37, c38321qM, this);
                    d8m2 = new ME4(43, c38321qM, this, c75113Zb);
                    interfaceC16820sZ = B7W.A00;
                    break;
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            case 91:
                abstractC65902yS = (AbstractC65902yS) this.A07.A0z.getValue();
                lithoView = (LithoView) view;
                this.A05.A0h.getValue();
                id = c38321qM.getId();
                if (id != null) {
                    d8m = new C9FQ(34, c38321qM, this, c75113Zb);
                    d8m2 = new C9FQ(35, c38321qM, this, c75113Zb);
                    interfaceC16820sZ = C25054B7b.A00;
                    break;
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            case 92:
                abstractC65902yS = (AbstractC65902yS) this.A07.A0w.getValue();
                lithoView = (LithoView) view;
                this.A05.A0e.getValue();
                id = c38321qM.getId();
                if (id != null) {
                    d8m = new C9FQ(31, c38321qM, this, c75113Zb);
                    d8m2 = new C9FQ(32, c38321qM, this, c75113Zb);
                    interfaceC16820sZ = C25053B7a.A00;
                    break;
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            case 93:
                abstractC65902yS = (AbstractC65902yS) this.A07.A0C.getValue();
                lithoView = (LithoView) view;
                this.A05.A08.getValue();
                id = c38321qM.getId();
                if (id != null) {
                    d8m = new ME4(45, c38321qM, this, c75113Zb);
                    d8m2 = new ME4(46, c38321qM, this, c75113Zb);
                    interfaceC16820sZ = C25056B7d.A00;
                    break;
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            case 95:
                abstractC65902yS = (AbstractC65902yS) this.A07.A0H.getValue();
                lithoView = (LithoView) view;
                id = String.valueOf(c38321qM.getId());
                d8m = new D8M(36, c38321qM, this);
                d8m2 = new C29901DGp(2, c38321qM, view, this, c75113Zb);
                interfaceC16820sZ = new J7S(this, 42);
                break;
        }
        InterfaceC16820sZ interfaceC16820sZ2 = d8m2;
        abstractC65902yS.A05(lithoView, id, d8m, interfaceC16820sZ2, interfaceC16820sZ);
        return true;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0028. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    @Override // X.InterfaceC65652y1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AHY(X.C38321qM r6, X.C75113Zb r7, int r8) {
        /*
            Method dump skipped, instructions count: 542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C692439k.AHY(X.1qM, X.3Zb, int):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x0049. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    @Override // X.InterfaceC65652y1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E5V(X.C38321qM r10, X.C75113Zb r11, java.lang.Integer r12, int r13) {
        /*
            Method dump skipped, instructions count: 932
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C692439k.E5V(X.1qM, X.3Zb, java.lang.Integer, int):void");
    }
}
