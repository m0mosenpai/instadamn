package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.fragment.app.FragmentActivity;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ggu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37599Ggu implements InterfaceC685936w {
    public final Context A00;
    public final FragmentActivity A01;
    public final AbstractC59962oe A02;
    public final InterfaceC116925Qy A03;
    public final ClipsViewerConfig A04;
    public final InterfaceC41501vz A05;
    public final UserSession A06;
    public final C79993ho A07;
    public final InterfaceC60442pS A08;
    public final MVO A09;
    public final AnonymousClass388 A0A;
    public final C688938a A0B;
    public final InterfaceC43589JPu A0C;
    public final ILW A0D;
    public final JI8 A0E;
    public final C26914BuH A0F;
    public final IG5 A0G;
    public final C37671Gi4 A0H;

    public final void A02(View view, C120985dq c120985dq) {
        C38321qM c38321qM;
        if (view != null && (c38321qM = c120985dq.A02) != null) {
            UserSession userSession = this.A06;
            if (C18U.A06(C06090Tz.A05, userSession, 2342162545453833712L)) {
                long currentTimeMillis = System.currentTimeMillis() - ViewConfiguration.getLongPressTimeout();
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                int i = iArr[0];
                int i2 = iArr[1];
                Rect rect = new Rect(i, i2, view.getWidth() + i, view.getHeight() + i2);
                C79993ho c79993ho = this.A07;
                FragmentActivity fragmentActivity = this.A01;
                Integer num = C05F.A0N;
                InterfaceC60442pS interfaceC60442pS = this.A08;
                ViewParent parent = view.getParent();
                C14360o3.A07(parent);
                c79993ho.A00(rect, parent, fragmentActivity, this.A02, interfaceC60442pS, userSession, c38321qM, interfaceC60442pS, C2EY.A0W, num, 0, currentTimeMillis);
                C23031Ai A00 = AbstractC23021Ah.A00(userSession);
                AbstractC167007dF.A1L(A00, A00.A2n, C23031Ai.A8c, 84, true);
            }
        }
    }

    public final void A03(View view, C120985dq c120985dq, C37644Ghd c37644Ghd, String str, boolean z, boolean z2) {
        C38321qM c38321qM;
        InterfaceC39681sr BuT;
        String AgQ;
        boolean A1R = AbstractC167007dF.A1R(0, c120985dq, c37644Ghd);
        if (z) {
            A02(view, c120985dq);
            return;
        }
        if (z2) {
            UserSession userSession = this.A06;
            if (C18U.A06(C06090Tz.A05, userSession, 36320618574127849L)) {
                C26867BtT.A08.A00(this.A01, EnumC25577BSp.NEW_TOOLTIP, userSession, new C23719Aes(A1R ? 1 : 0, view, c120985dq, c37644Ghd, this), c120985dq.A0D(), this.A08.getModuleName(), null, false, A1R);
                return;
            }
        }
        if (c120985dq.A01 == EnumC129395t1.A03) {
            return;
        }
        AbstractC37300Gc1.A11(this.A03, AnonymousClass317.A0P, c120985dq, c37644Ghd);
        C38321qM c38321qM2 = c120985dq.A02;
        if (c38321qM2 != null && c38321qM2.A57() == A1R && (c38321qM = c120985dq.A02) != null && (BuT = c38321qM.A0C.BuT()) != null && (AgQ = BuT.AgQ()) != null && AgQ.length() != 0) {
            this.A0B.A00(this.A02, new C42566Isk(view, c120985dq, c37644Ghd, this, str), null, AgQ, AbstractC41653Ibl.A00(c120985dq.A02, this.A08.getModuleName()));
        } else {
            A00(view, c120985dq, c37644Ghd, this, str);
        }
    }

    @Override // X.InterfaceC685936w
    public final void DiB(C38321qM c38321qM, C75113Zb c75113Zb, int i) {
        C14360o3.A0B(c38321qM, 0);
        if (c75113Zb != null) {
            AnonymousClass388 anonymousClass388 = this.A0A;
            anonymousClass388.Di3(c38321qM, c75113Zb, anonymousClass388.CCt(), i);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.3ho, java.lang.Object] */
    public /* synthetic */ C37599Ggu(Context context, FragmentActivity fragmentActivity, AbstractC59962oe abstractC59962oe, InterfaceC116925Qy interfaceC116925Qy, ClipsViewerConfig clipsViewerConfig, InterfaceC41501vz interfaceC41501vz, UserSession userSession, InterfaceC60442pS interfaceC60442pS, MVO mvo, InterfaceC43589JPu interfaceC43589JPu, ILW ilw, JI8 ji8, C26914BuH c26914BuH, IG5 ig5, C37671Gi4 c37671Gi4) {
        C688938a c688938a = new C688938a(userSession);
        ?? obj = new Object();
        C37600Ggv c37600Ggv = new C37600Ggv(abstractC59962oe, userSession, interfaceC60442pS, clipsViewerConfig.A0S, interfaceC43589JPu, ilw, String.valueOf(clipsViewerConfig.A0h), clipsViewerConfig.A0q);
        C14360o3.A0B(interfaceC60442pS, 7);
        AbstractC25234BEr.A0l(8, ilw, interfaceC116925Qy, interfaceC43589JPu, c37671Gi4);
        AbstractC25234BEr.A1Q(mvo, ig5, userSession);
        this.A01 = fragmentActivity;
        this.A05 = interfaceC41501vz;
        this.A0E = ji8;
        this.A00 = context;
        this.A0F = c26914BuH;
        this.A02 = abstractC59962oe;
        this.A08 = interfaceC60442pS;
        this.A0D = ilw;
        this.A03 = interfaceC116925Qy;
        this.A0C = interfaceC43589JPu;
        this.A0H = c37671Gi4;
        this.A09 = mvo;
        this.A0G = ig5;
        this.A06 = userSession;
        this.A04 = clipsViewerConfig;
        this.A0B = c688938a;
        this.A07 = obj;
        this.A0A = c37600Ggv;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00f4, code lost:
    
        if (X.C18U.A06(r11, r1, 36326081770436233L) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0109, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0113, code lost:
    
        if (X.C18U.A06(r11, r1, 36326081770370696L) != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0107, code lost:
    
        if (X.C18U.A06(r11, r1, 36326081770501770L) != false) goto L33;
     */
    /* JADX WARN: Type inference failed for: r0v65, types: [java.lang.Object, X.IBq] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(android.view.View r27, X.C120985dq r28, X.C37644Ghd r29, X.C37599Ggu r30, java.lang.String r31) {
        /*
            Method dump skipped, instructions count: 676
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37599Ggu.A00(android.view.View, X.5dq, X.Ghd, X.Ggu, java.lang.String):void");
    }

    public final void A01(MotionEvent motionEvent, String str) {
        AbstractC167017dG.A1N(motionEvent, str);
        if (C18U.A06(C06090Tz.A05, this.A06, 2342162545453833712L)) {
            this.A07.A01(motionEvent, str);
        }
    }
}
