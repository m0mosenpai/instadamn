package X;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;
import java.util.UUID;

/* loaded from: classes11.dex */
public final class V7n extends V8M {
    public C69131ViM A00;
    public final Context A01;
    public final View.OnClickListener A02;
    public final AbstractC10360h2 A03;
    public final C70930WkZ A04;
    public final C53S A05;
    public final InterfaceC11380iw A06;
    public final C18920wW A07;
    public final UserSession A08;
    public final C70112W4k A09;
    public final AnonymousClass309 A0A;
    public final FRD A0B;
    public final InterfaceC63862v7 A0C;
    public final C63822v3 A0D;
    public final C70105W4c A0E;
    public final C69011Vfn A0F;
    public final C32968Eez A0G;
    public final C68810VcR A0H;
    public final C69534Vqy A0I;
    public final InterfaceC55362gb A0J;
    public final C64742wY A0K;
    public final C38E A0L;
    public final int A0M;
    public final RectF A0N;
    public final String A0O;
    public final String A0P;
    public final String A0Q;
    public final String A0R;

    public static C19260xA A00(V7n v7n) {
        C19260xA c19260xA = new C19260xA();
        C19260xA.A00(c19260xA, v7n.A0P, AbstractC111324zv.A00(2315));
        C19260xA.A00(c19260xA, v7n.A0Q, "entry_trigger");
        String str = v7n.A0O;
        if (str != null) {
            C19260xA.A00(c19260xA, str, "format");
        }
        String str2 = v7n.A0R;
        if (str2 != null) {
            C19260xA.A00(c19260xA, str2, AbstractC111324zv.A00(447));
        }
        return c19260xA;
    }

    public static void A01(V7n v7n) {
        if (!(!C06P.A01(v7n.A03))) {
            AbstractC31175DnJ.A0i(((V8M) v7n).A00.getActivity());
        }
    }

    public final void A03(Hashtag hashtag, boolean z) {
        C69534Vqy c69534Vqy = this.A0I;
        if (c69534Vqy.A00() != null) {
            C69730VuP c69730VuP = new C69730VuP(hashtag);
            Integer valueOf = Integer.valueOf(z ? 1 : 0);
            c69730VuP.A08 = valueOf;
            c69730VuP.A09 = valueOf;
            Hashtag A00 = c69730VuP.A00();
            C68247VJj A002 = c69534Vqy.A00();
            C14360o3.A0B(A00, 0);
            A002.A01 = A00;
        }
    }

    @Override // X.V8M, X.C1I2
    public final void onScroll(C3FQ c3fq, int i, int i2, int i3, int i4, int i5) {
        int i6;
        int A03 = C0f9.A03(633695091);
        if (!C06P.A01(this.A03)) {
            i6 = -1118459655;
        } else {
            C69131ViM c69131ViM = this.A00;
            if (c69131ViM != null) {
                View view = c69131ViM.A00;
                RectF rectF = this.A0N;
                AbstractC13880nE.A0M(rectF, view);
                float f = rectF.bottom;
                float f2 = this.A0M;
                C70105W4c c70105W4c = this.A0E;
                if (f <= f2) {
                    c70105W4c.A06.Egi(c70105W4c, false, C70105W4c.A07[0]);
                    FRD frd = this.A0B;
                    frd.A00 = EnumC155676yw.A02;
                    V1R.A03(frd.A04.A00);
                } else {
                    AbstractC167007dF.A1L(c70105W4c, c70105W4c.A06, C70105W4c.A07, 0, true);
                }
            }
            i6 = 1201133407;
        }
        C0f9.A0A(i6, A03);
    }

    public V7n(View.OnClickListener onClickListener, Fragment fragment, AbstractC10360h2 abstractC10360h2, C53S c53s, ViewOnTouchListenerC60632pm viewOnTouchListenerC60632pm, InterfaceC65252xN interfaceC65252xN, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C70112W4k c70112W4k, AnonymousClass309 anonymousClass309, FRD frd, C70105W4c c70105W4c, C32968Eez c32968Eez, C68810VcR c68810VcR, C69534Vqy c69534Vqy, InterfaceC60682pr interfaceC60682pr, InterfaceC55362gb interfaceC55362gb, C64742wY c64742wY, String str, String str2, String str3, String str4) {
        super(fragment, viewOnTouchListenerC60632pm, interfaceC65252xN, anonymousClass309, userSession, interfaceC60682pr, C3G2.A11);
        this.A04 = new C70930WkZ(this, 1);
        this.A0C = new C70925WkU(this, 0);
        this.A08 = userSession;
        this.A06 = interfaceC11380iw;
        this.A07 = AbstractC12220kQ.A01(anonymousClass309, userSession);
        this.A01 = fragment.requireContext();
        this.A03 = abstractC10360h2;
        this.A0A = anonymousClass309;
        this.A0I = c69534Vqy;
        this.A09 = c70112W4k;
        this.A0D = new C63822v3(fragment.requireContext(), AbstractC018607g.A00(fragment), anonymousClass309, userSession);
        this.A0J = interfaceC55362gb;
        this.A0K = c64742wY;
        this.A0B = frd;
        this.A0E = c70105W4c;
        this.A0F = new C69011Vfn(fragment.requireContext(), super.A04);
        this.A0L = new C38E(anonymousClass309, userSession, new C38C(fragment));
        UUID.randomUUID().toString();
        this.A0G = c32968Eez;
        this.A0H = c68810VcR;
        this.A0N = new RectF();
        this.A0M = AbstractC56402iY.A01(super.A00.requireActivity());
        this.A0P = str;
        this.A0Q = str2;
        this.A0R = str3;
        this.A0O = str4;
        this.A05 = c53s;
        this.A02 = onClickListener;
    }
}
