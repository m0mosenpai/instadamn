package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.user.model.User;

/* renamed from: X.3sW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C85993sW extends AbstractC85803s9 {
    public C120435cm A00;
    public final Context A01;
    public final FragmentActivity A02;
    public final InterfaceC11380iw A03;
    public final UserSession A04;
    public final InterfaceC76043b9 A05;
    public final InterfaceC60682pr A06;
    public final User A07;
    public final boolean A08;
    public final boolean A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85993sW(Context context, FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC76043b9 interfaceC76043b9, InterfaceC60682pr interfaceC60682pr, boolean z, boolean z2) {
        super(context);
        C14360o3.A0B(context, 2);
        C14360o3.A0B(interfaceC11380iw, 4);
        C14360o3.A0B(interfaceC76043b9, 5);
        C14360o3.A0B(userSession, 6);
        User A00 = C08730cb.A00(userSession).A00();
        this.A02 = fragmentActivity;
        this.A01 = context;
        this.A08 = z;
        this.A03 = interfaceC11380iw;
        this.A05 = interfaceC76043b9;
        this.A04 = userSession;
        this.A07 = A00;
        this.A09 = z2;
        this.A00 = null;
        this.A06 = interfaceC60682pr;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0158  */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, X.3WA] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C81303k0 A06(android.view.View r67, X.InterfaceC11380iw r68) {
        /*
            Method dump skipped, instructions count: 639
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C85993sW.A06(android.view.View, X.0iw):X.3k0");
    }

    public static final void A00(final UserSession userSession, final InterfaceC60442pS interfaceC60442pS, final C86203sr c86203sr, final C79723hN c79723hN, final C85993sW c85993sW, final C81303k0 c81303k0, final C75113Zb c75113Zb) {
        boolean A0G = AbstractC75103Za.A0G(userSession, c79723hN.A08.A01, c75113Zb);
        C3YJ c3yj = c81303k0.A0Q;
        C3YD c3yd = c3yj.A01;
        if (c3yd != null) {
            if (A0G) {
                View view = c81303k0.itemView;
                C14360o3.A06(view);
                VTH.A00(new C100974gD(view));
            } else {
                C86013sY c86013sY = c81303k0.A0A;
                if (c86203sr.A03) {
                    c3yd.A0A();
                } else {
                    C79703hL c79703hL = c79723hN.A0A;
                    InterfaceC16620sF interfaceC16620sF = c79703hL.A0U;
                    Context context = c85993sW.A01;
                    InterfaceC86283sz interfaceC86283sz = (InterfaceC86283sz) interfaceC16620sF.invoke(context, c86013sY);
                    AbstractC86373tA.A00((View.OnClickListener) c79703hL.A0V.invoke(c3yd, true), c85993sW.A05.BRj(), (C3t9) c79703hL.A0a.invoke(context, null, true), interfaceC86283sz, c3yd);
                }
            }
        }
        IgProgressImageView igProgressImageView = c81303k0.A0N;
        boolean A0G2 = igProgressImageView.getIgImageView().A0G();
        igProgressImageView.A06(R.id.listener_id_for_media_tag_indicator);
        C3YI c3yi = c3yj.A05;
        if (c3yi != null) {
            c3yi.A00();
        }
        C3YG c3yg = c3yj.A00;
        if (c3yg != null) {
            C79703hL c79703hL2 = c79723hN.A0A;
            if (((Boolean) c79703hL2.A0G.invoke()).booleanValue()) {
                AbstractC86383tB.A01((C101734hi) c79703hL2.A05.invoke(), c3yg, A0G2);
            } else {
                AbstractC86383tB.A00(c75113Zb, c3yg, false);
            }
        }
        if (!A0G2) {
            if (c79723hN.A0T || A0G) {
                igProgressImageView.A0A(new InterfaceC80653iu() { // from class: X.5cT
                    @Override // X.InterfaceC80653iu
                    public final /* synthetic */ void DFp() {
                    }

                    @Override // X.InterfaceC80653iu
                    public final void DPX(C73083Pj c73083Pj) {
                        C85993sW c85993sW2 = c85993sW;
                        C81303k0 c81303k02 = c81303k0;
                        C79723hN c79723hN2 = c79723hN;
                        C75113Zb c75113Zb2 = c75113Zb;
                        C85993sW.A00(userSession, interfaceC60442pS, c86203sr, c79723hN2, c85993sW2, c81303k02, c75113Zb2);
                    }
                }, R.id.listener_id_for_media_tag_indicator);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0662, code lost:
    
        if (r4 != null) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x007f, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r8, 36327975850884114L) == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x068e, code lost:
    
        if (r4 != null) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x02c5, code lost:
    
        if (r4 != null) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x02c7, code lost:
    
        X.C0fQ.A00(r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0692, code lost:
    
        r12 = "onClick";
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A07(X.InterfaceC60442pS r44, X.C86203sr r45, final X.C79723hN r46, final X.C81303k0 r47, final int r48, boolean r49) {
        /*
            Method dump skipped, instructions count: 1896
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C85993sW.A07(X.2pS, X.3sr, X.3hN, X.3k0, int, boolean):void");
    }
}
