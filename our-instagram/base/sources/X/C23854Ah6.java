package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.reels.musicpick.model.MusicPickReelTag;
import com.instagram.reels.musicpick.model.MusicPickStickerModel;

/* renamed from: X.Ah6, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23854Ah6 implements InterfaceC25184BCh, InterfaceC25183BCg {
    public MusicAssetModel A00;
    public MusicPickReelTag A01;
    public MusicPickStickerModel A02;
    public final Context A03;
    public final View A04;
    public final ViewGroup A05;
    public final AbstractC59962oe A06;
    public final UserSession A07;
    public final AnonymousClass877 A08;
    public final C8NX A09;
    public final C138586Po A0A;
    public final String A0B;
    public final String A0C;
    public final InterfaceC09390do A0D;
    public final InterfaceC09390do A0E;
    public final InterfaceC09390do A0F;
    public final InterfaceC09390do A0G;
    public final InterfaceC09390do A0H;
    public final InterfaceC09390do A0I;
    public final InterfaceC09390do A0J;
    public final InterfaceC09390do A0K;
    public final InterfaceC09390do A0L;
    public final InterfaceC09390do A0M;
    public final InterfaceC09390do A0N;
    public final InterfaceC09390do A0O;
    public final InterfaceC09390do A0P;
    public final InterfaceC09390do A0Q;
    public final InterfaceC09390do A0R;
    public final InterfaceC09390do A0S;
    public final boolean A0T;
    public final C8O8 A0U;

    public C23854Ah6(View view, ViewGroup viewGroup, AbstractC59962oe abstractC59962oe, UserSession userSession, C8O8 c8o8, AnonymousClass877 anonymousClass877, C8NX c8nx, String str) {
        AbstractC167007dF.A1F(viewGroup, 2, str);
        AbstractC167017dG.A1U(c8o8, anonymousClass877);
        this.A04 = view;
        this.A05 = viewGroup;
        this.A07 = userSession;
        this.A0B = str;
        this.A06 = abstractC59962oe;
        this.A0U = c8o8;
        this.A08 = anonymousClass877;
        this.A09 = c8nx;
        Context context = view.getContext();
        this.A03 = context;
        this.A0T = AbstractC166997dE.A1Z(AbstractC166987dD.A10(userSession).A0J(), true);
        this.A0E = B8R.A01(this, 25);
        this.A0L = B8R.A01(this, 32);
        this.A0M = B8R.A01(this, 33);
        this.A0N = B8R.A01(this, 34);
        this.A0Q = B8R.A01(this, 37);
        this.A0R = B8R.A01(this, 38);
        this.A0H = B8R.A01(this, 28);
        this.A0D = B8R.A01(this, 24);
        this.A0K = B8R.A01(this, 31);
        this.A0O = B8R.A01(this, 35);
        this.A0G = B8R.A01(this, 27);
        this.A0J = B8R.A01(this, 30);
        this.A0I = B8R.A01(this, 29);
        this.A0S = B8R.A01(this, 39);
        this.A0F = B8R.A01(this, 26);
        this.A0C = AbstractC167017dG.A0j();
        this.A0P = B8R.A01(this, 36);
        C14360o3.A07(context);
        C138586Po A00 = AbstractC138576Pn.A00(1.0f, AbstractC167017dG.A0G(context), false);
        A00.A0A.setColor(context.getColor(R.color.igds_icon_on_color));
        this.A0A = A00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x014b, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r10.A07, 36323238501952604L) != false) goto L49;
     */
    @Override // X.InterfaceC25184BCh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DDv(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23854Ah6.DDv(java.lang.Object):void");
    }

    public static final void A00(C23854Ah6 c23854Ah6) {
        AbstractC167007dF.A0L(c23854Ah6.A0D).setVisibility(8);
        AbstractC167007dF.A0L(c23854Ah6.A0K).setVisibility(0);
        c23854Ah6.A00 = null;
        c23854Ah6.A08.A02().pause();
        A01(c23854Ah6, null);
    }

    public static final void A01(C23854Ah6 c23854Ah6, Boolean bool) {
        boolean A1W;
        InterfaceC09390do interfaceC09390do = c23854Ah6.A0F;
        View A0d = AbstractC166987dD.A0d(interfaceC09390do);
        boolean z = true;
        if (bool != null) {
            A1W = bool.booleanValue();
        } else {
            A1W = AbstractC167007dF.A1W(c23854Ah6.A00);
        }
        A0d.setEnabled(A1W);
        View A0d2 = AbstractC166987dD.A0d(interfaceC09390do);
        if (bool != null) {
            z = bool.booleanValue();
        } else if (c23854Ah6.A00 == null) {
            z = false;
        }
        AJq.A01(A0d2, z);
    }

    @Override // X.InterfaceC25183BCg
    public final View B0N() {
        return AbstractC167007dF.A0L(this.A0N);
    }

    @Override // X.InterfaceC25183BCg
    public final Class C0Y() {
        return C194788je.class;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008c  */
    @Override // X.InterfaceC25184BCh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DEy() {
        /*
            Method dump skipped, instructions count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23854Ah6.DEy():void");
    }
}
