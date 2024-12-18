package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.3VW, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3VW {
    public Integer A00;
    public final Context A01;
    public final UserSession A02;
    public final InterfaceC677433o A03;
    public final C3VU A04;
    public final C33P A05;
    public final FragmentActivity A06;
    public final InterfaceC60682pr A07;
    public final User A08;
    public final boolean A09;
    public final boolean A0A;

    public C3VW(Context context, FragmentActivity fragmentActivity, UserSession userSession, InterfaceC677433o interfaceC677433o, C3VU c3vu, C33P c33p, InterfaceC60682pr interfaceC60682pr, boolean z, boolean z2) {
        C14360o3.A0B(fragmentActivity, 1);
        C14360o3.A0B(context, 2);
        C14360o3.A0B(c33p, 4);
        C14360o3.A0B(interfaceC677433o, 5);
        C14360o3.A0B(c3vu, 6);
        C14360o3.A0B(userSession, 7);
        C14360o3.A0B(interfaceC60682pr, 9);
        this.A06 = fragmentActivity;
        this.A01 = context;
        this.A09 = z;
        this.A05 = c33p;
        this.A03 = interfaceC677433o;
        this.A04 = c3vu;
        this.A02 = userSession;
        this.A0A = z2;
        this.A07 = interfaceC60682pr;
        this.A08 = C08730cb.A00(userSession).A00();
        this.A00 = C05F.A0C;
    }

    public static final boolean A00(C3W3 c3w3) {
        Object obj;
        C3YH c3yh;
        View view = (View) AbstractC224517h.A01(new C011003y(c3w3.A09));
        if (view != null) {
            obj = view.getTag();
        } else {
            obj = null;
        }
        if (!(obj instanceof C905741s) || (c3yh = ((C905741s) obj).A0I.A04) == null) {
            return false;
        }
        return c3yh.A06;
    }

    public final C3W1 A01(Context context, ViewGroup viewGroup, InterfaceC11380iw interfaceC11380iw) {
        int A03 = C0f9.A03(-262495976);
        C14360o3.A0B(context, 0);
        C14360o3.A0B(interfaceC11380iw, 1);
        LayoutInflater from = LayoutInflater.from(context);
        C14360o3.A07(from);
        View A00 = C50802Vb.A00(from, new ViewGroup.LayoutParams(-1, -2), viewGroup, R.layout.row_feed_carousel_media_group, 0, false, true);
        C14360o3.A0B(A00, 1);
        C3W1 c3w1 = new C3W1(context, true);
        c3w1.addView(A00);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        c3w1.setLayoutParams(layoutParams);
        final C3W3 c3w3 = new C3W3(c3w1, interfaceC11380iw, this.A02);
        c3w3.A09.setPageSpacing(0.0f);
        c3w1.setTag(c3w3);
        c3w3.A08.A01();
        c3w1.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener(this) { // from class: X.3Wf
            public final /* synthetic */ C3VW A00;

            {
                this.A00 = this;
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View view) {
                C3W3 c3w32 = c3w3;
                C75113Zb c75113Zb = c3w32.A02;
                if ((c75113Zb != null && c75113Zb.A2i) || !c3w32.A05 || c75113Zb == null) {
                    return;
                }
                ((C125315ld) this.A00.A02.A01(C125315ld.class, C125305lc.A00)).A01(c75113Zb, c3w32.A00);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view) {
                C125315ld c125315ld = (C125315ld) this.A00.A02.A01(C125315ld.class, C125305lc.A00);
                C75113Zb c75113Zb = c3w3.A02;
                if (c75113Zb != null) {
                    c125315ld.A00(c75113Zb);
                }
            }
        });
        C0f9.A0A(-115922775, A03);
        return c3w1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00b7, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r0, 36327975850884114L) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0558, code lost:
    
        if (r10 != false) goto L72;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x055c  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0573  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x05ac  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0325  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(X.C62862tP r46, X.C41J r47, X.C41H r48, X.C3W3 r49, X.InterfaceC60442pS r50, X.C75113Zb r51) {
        /*
            Method dump skipped, instructions count: 1488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3VW.A02(X.2tP, X.41J, X.41H, X.3W3, X.2pS, X.3Zb):void");
    }
}
