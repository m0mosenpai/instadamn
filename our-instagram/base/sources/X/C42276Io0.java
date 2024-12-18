package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.api.schemas.AudioFilterType;
import com.instagram.api.schemas.OriginalAudioSubtype;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Io0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42276Io0 implements InterfaceC60602pj {
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public ImageView A04;
    public TextView A05;
    public TextView A06;
    public TextView A07;
    public C57012jc A08;
    public C57012jc A09;
    public C57012jc A0A;
    public InterfaceC56392iX A0B;
    public InterfaceC56392iX A0C;
    public InterfaceC56392iX A0D;
    public InterfaceC56392iX A0E;
    public InterfaceC56392iX A0F;
    public InterfaceC56392iX A0G;
    public InterfaceC56392iX A0H;
    public C41697IdQ A0I;
    public boolean A0J;
    public boolean A0K;
    public final int A0L;
    public final long A0M;
    public final C8JW A0N;
    public final AudioFilterType A0O;
    public final N8L A0P;
    public final C153756vk A0Q;
    public final UserSession A0R;
    public final InterfaceC43497JJj A0S;
    public final EnumC39549HdL A0T;
    public final C38321GtG A0U;
    public final C38929HCc A0V;
    public final C40997IDs A0W;
    public final C38335GtV A0X;
    public final INT A0Y;
    public final String A0Z;
    public final String A0a;
    public final String A0b;
    public final String A0c;
    public final String A0d;
    public final boolean A0e;
    public final boolean A0f;
    public final boolean A0g;
    public final InterfaceC60442pS A0h;

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void ADK(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void D8S(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onCreate() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onDestroy() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onDestroyView() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onPause() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onResume() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStart() {
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onStop() {
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0171  */
    @Override // X.InterfaceC60602pj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r8, android.os.Bundle r9) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42276Io0.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0046, code lost:
    
        if (r2 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
    
        r0 = r3.A0A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0058, code lost:
    
        if (r0 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005a, code lost:
    
        r1 = (com.instagram.igds.components.button.IgdsButton) r0.A01();
        r0 = 2131976418;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0032, code lost:
    
        if (r4 != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C42276Io0 r3, boolean r4) {
        /*
            X.GtV r0 = r3.A0X
            X.Gyu r0 = X.C38335GtV.A00(r0)
            r1 = 0
            if (r0 == 0) goto L11
            X.3xD r0 = r0.A03
            if (r0 == 0) goto L11
            com.instagram.api.schemas.OriginalAudioSubtype r1 = r0.Ae4()
        L11:
            com.instagram.common.session.UserSession r0 = r3.A0R
            boolean r2 = X.AbstractC76643c9.A0B(r1, r0)
            java.lang.String r1 = "useAudioButtonViewStubHolder"
            if (r2 == 0) goto L32
            if (r4 == 0) goto L48
            boolean r0 = r3.A0e
            if (r0 == 0) goto L34
            X.2jc r0 = r3.A0A
            if (r0 == 0) goto L64
            android.view.View r1 = r0.A01()
            com.instagram.igds.components.button.IgdsButton r1 = (com.instagram.igds.components.button.IgdsButton) r1
            r0 = 2131976425(0x7f1360e9, float:1.958997E38)
        L2e:
            r1.setText(r0)
            return
        L32:
            if (r4 == 0) goto L56
        L34:
            boolean r0 = r3.A0e
            if (r0 == 0) goto L46
            X.2jc r0 = r3.A0A
            if (r0 == 0) goto L64
            android.view.View r1 = r0.A01()
            com.instagram.igds.components.button.IgdsButton r1 = (com.instagram.igds.components.button.IgdsButton) r1
            r0 = 2131976424(0x7f1360e8, float:1.9589968E38)
            goto L2e
        L46:
            if (r2 == 0) goto L56
        L48:
            X.2jc r0 = r3.A0A
            if (r0 == 0) goto L64
            android.view.View r1 = r0.A01()
            com.instagram.igds.components.button.IgdsButton r1 = (com.instagram.igds.components.button.IgdsButton) r1
            r0 = 2131976432(0x7f1360f0, float:1.9589984E38)
            goto L2e
        L56:
            X.2jc r0 = r3.A0A
            if (r0 == 0) goto L64
            android.view.View r1 = r0.A01()
            com.instagram.igds.components.button.IgdsButton r1 = (com.instagram.igds.components.button.IgdsButton) r1
            r0 = 2131976418(0x7f1360e2, float:1.9589956E38)
            goto L2e
        L64:
            X.C14360o3.A0F(r1)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42276Io0.A00(X.Io0, boolean):void");
    }

    public final void A01(View view) {
        View view2;
        C38653Gyu A00 = C38335GtV.A00(this.A0X);
        if (A00 != null && !A00.A08) {
            UserSession userSession = this.A0R;
            EnumC39595He5 enumC39595He5 = EnumC39595He5.A09;
            if (AbstractC40904IAc.A00(userSession, enumC39595He5) && (view2 = this.A0V.mView) != null) {
                C41697IdQ c41697IdQ = this.A0I;
                if (c41697IdQ == null) {
                    C14360o3.A0F("audioPageNuxUtil");
                    throw C00O.createAndThrow();
                }
                c41697IdQ.A01(view, view2, enumC39595He5);
            }
        }
    }

    public final void A02(OriginalAudioSubtype originalAudioSubtype, String str, List list, boolean z, boolean z2) {
        String str2;
        Drawable mutate;
        View view = this.A03;
        Drawable drawable = null;
        if (view == null) {
            str2 = "view";
        } else {
            TextView A0C = AbstractC31178DnM.A0C(view);
            C38929HCc c38929HCc = this.A0V;
            C38064Gos c38064Gos = new C38064Gos(A0C, c38929HCc.requireContext().getColor(AbstractC53242c7.A08(c38929HCc.requireContext())));
            if (originalAudioSubtype == OriginalAudioSubtype.A06) {
                INT r6 = this.A0Y;
                if (C18U.A06(C06090Tz.A06, r6.A02, 36321353011504468L)) {
                    drawable = null;
                } else {
                    Context context = r6.A00;
                    drawable = context.getDrawable(R.drawable.instagram_mix_pano_filled_12);
                    if (drawable != null && (mutate = drawable.mutate()) != null) {
                        mutate.setColorFilter(context.getColor(AbstractC53242c7.A08(r6.A01)), PorterDuff.Mode.SRC_IN);
                    }
                }
            }
            AbstractC38060Gon.A00(drawable, c38064Gos, str, z, false);
            InterfaceC56392iX interfaceC56392iX = this.A0D;
            str2 = "partialAttributionStub";
            if (interfaceC56392iX != null) {
                if (!interfaceC56392iX.CWW()) {
                    UserSession userSession = this.A0R;
                    OriginalAudioSubtype originalAudioSubtype2 = OriginalAudioSubtype.A04;
                    if ((originalAudioSubtype == originalAudioSubtype2 && C18U.A06(C06090Tz.A05, userSession, 36328680225586907L)) || list == null || !AbstractC166987dD.A1b(list) || originalAudioSubtype != originalAudioSubtype2) {
                        return;
                    }
                    EnumC39652Hih enumC39652Hih = EnumC39652Hih.A0X;
                    long j = this.A0M;
                    C153756vk c153756vk = this.A0Q;
                    InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(c38929HCc, userSession), "instagram_organic_partial_attribution_ufi_impression");
                    if (A0f.isSampled()) {
                        AbstractC37303Gc4.A0n(A0f, "audio_page", j);
                        AbstractC25225BEi.A1M(enumC39652Hih, A0f);
                        A0f.A9K("is_trending_label", Long.valueOf(AbstractC37302Gc3.A03(z2 ? 1 : 0)));
                        AbstractC37302Gc3.A0t(A0f);
                        AbstractC37303Gc4.A0e(A0f, c153756vk);
                        A0f.Cht();
                    }
                    InterfaceC56392iX interfaceC56392iX2 = this.A0D;
                    if (interfaceC56392iX2 != null) {
                        C0fQ.A00(new ViewOnClickListenerC41959Iiq(2, list, this, z2), interfaceC56392iX2.getView());
                        return;
                    }
                } else {
                    return;
                }
            }
        }
        C14360o3.A0F(str2);
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0092, code lost:
    
        if (X.C18U.A06(r2, r18, 36324557056913644L) == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C42276Io0(X.C8JW r14, com.instagram.api.schemas.AudioFilterType r15, X.N8L r16, X.C153756vk r17, com.instagram.common.session.UserSession r18, X.InterfaceC60442pS r19, X.InterfaceC43497JJj r20, X.EnumC39549HdL r21, X.C38321GtG r22, X.C38929HCc r23, X.C38335GtV r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, int r30, long r31, boolean r33, boolean r34) {
        /*
            r13 = this;
            r0 = 5
            r3 = r26
            r6 = r18
            r4 = r25
            X.AbstractC25233BEq.A0y(r0, r6, r4, r3)
            r13.<init>()
            r1 = r24
            r13.A0X = r1
            r0 = r20
            r13.A0S = r0
            r0 = r22
            r13.A0U = r0
            r2 = r23
            r13.A0V = r2
            r13.A0R = r6
            r13.A0N = r14
            r13.A0Z = r4
            r13.A0d = r3
            r11 = r31
            r13.A0M = r11
            r7 = r19
            r13.A0h = r7
            r8 = r27
            r13.A0b = r8
            r9 = r28
            r13.A0a = r9
            r10 = r29
            r13.A0c = r10
            r5 = r17
            r13.A0Q = r5
            r0 = r16
            r13.A0P = r0
            r13.A0O = r15
            r0 = r33
            r13.A0e = r0
            r0 = r30
            r13.A0L = r0
            r0 = r34
            r13.A0f = r0
            r0 = r21
            r13.A0T = r0
            X.IDs r0 = new X.IDs
            r0.<init>(r13)
            r13.A0W = r0
            androidx.fragment.app.FragmentActivity r3 = r2.requireActivity()
            android.content.Context r2 = r2.requireContext()
            X.Gyu r0 = X.C38335GtV.A00(r1)
            if (r0 == 0) goto L98
            X.3xD r0 = r0.A03
            if (r0 == 0) goto L98
            com.instagram.music.common.model.AudioType r0 = r0.Ae7()
        L70:
            X.HiR r4 = X.I4Y.A00(r0)
            X.INT r1 = new X.INT
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r13.A0Y = r1
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36318733081582008(0x8107b2000519b8, double:3.031451272367682E-306)
            boolean r0 = X.C18U.A06(r2, r6, r0)
            if (r0 == 0) goto L94
            r0 = 36324557056913644(0x810cfe000030ec, double:3.035134377818675E-306)
            boolean r1 = X.C18U.A06(r2, r6, r0)
            r0 = 1
            if (r1 != 0) goto L95
        L94:
            r0 = 0
        L95:
            r13.A0g = r0
            return
        L98:
            r0 = 0
            goto L70
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42276Io0.<init>(X.8JW, com.instagram.api.schemas.AudioFilterType, X.N8L, X.6vk, com.instagram.common.session.UserSession, X.2pS, X.JJj, X.HdL, X.GtG, X.HCc, X.GtV, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, long, boolean, boolean):void");
    }
}
