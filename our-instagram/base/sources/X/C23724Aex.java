package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import com.instagram.common.session.UserSession;
import java.util.LinkedHashSet;

/* renamed from: X.Aex, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23724Aex implements MSD {
    public static final String __redex_internal_original_name = "ShoppingStickerCreationController";
    public View A00;
    public final ViewStub A01;
    public final UserSession A02;
    public final InterfaceC186188Nm A03;
    public final java.util.Set A04;
    public final Context A05;

    public C23724Aex(ViewStub viewStub, UserSession userSession, InterfaceC186188Nm interfaceC186188Nm) {
        C14360o3.A0B(viewStub, 2);
        this.A02 = userSession;
        this.A01 = viewStub;
        this.A03 = interfaceC186188Nm;
        this.A05 = viewStub.getContext();
        this.A04 = new LinkedHashSet();
    }

    @Override // X.MSD
    public final /* synthetic */ void CxN() {
    }

    @Override // X.MSD
    public final /* synthetic */ void DhN() {
    }

    @Override // X.MSD
    public final /* synthetic */ void close() {
    }

    @Override // X.MSD
    public final boolean isScrolledToBottom() {
        return true;
    }

    @Override // X.MSD
    public final boolean isScrolledToTop() {
        return true;
    }

    @Override // X.MSD
    public final java.util.Set Acr() {
        return this.A04;
    }

    @Override // X.MSD
    public final /* synthetic */ boolean CJQ() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x006e  */
    @Override // X.MSD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E2K() {
        /*
            r5 = this;
            android.view.View r0 = r5.A00
            if (r0 != 0) goto Lc4
            android.view.ViewStub r0 = r5.A01
            android.view.View r1 = r0.inflate()
            java.util.Set r0 = r5.A04
            X.C14360o3.A0A(r1)
            r0.add(r1)
            r5.A00 = r1
            X.C14360o3.A0A(r1)
            r0 = 2131429550(0x7f0b08ae, float:1.8480776E38)
            android.view.View r2 = r1.requireViewById(r0)
            r1 = 6
            X.Ik1 r0 = new X.Ik1
            r0.<init>(r5, r1)
            X.C0fQ.A00(r0, r2)
            com.instagram.common.session.UserSession r4 = r5.A02
            r2 = 0
            X.0cb r3 = X.C17060sy.A01
            com.instagram.user.model.User r0 = r3.A01(r4)
            java.util.List r1 = r0.A0T()
            X.8rY r0 = X.EnumC199318rY.A0B
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto Lc5
            android.view.View r1 = r5.A00
            X.C14360o3.A0A(r1)
            r0 = 2131436650(0x7f0b246a, float:1.8495176E38)
            android.view.View r2 = X.AbstractC167017dG.A0U(r1, r0)
            r0 = 2131435172(0x7f0b1ea4, float:1.8492179E38)
            android.widget.TextView r1 = X.AbstractC166997dE.A0T(r2, r0)
            r0 = 2131974032(0x7f135790, float:1.9585117E38)
            r1.setText(r0)
            r1 = 7
        L56:
            X.Ik1 r0 = new X.Ik1
            r0.<init>(r5, r1)
            X.C0fQ.A00(r0, r2)
        L5e:
            com.instagram.user.model.User r0 = r3.A01(r4)
            java.util.List r1 = r0.A0T()
            X.8rY r0 = X.EnumC199318rY.A0E
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L91
            android.view.View r1 = r5.A00
            X.C14360o3.A0A(r1)
            r0 = 2131438321(0x7f0b2af1, float:1.8498566E38)
            android.view.View r2 = X.AbstractC167017dG.A0U(r1, r0)
            r0 = 2131435172(0x7f0b1ea4, float:1.8492179E38)
            android.widget.TextView r1 = X.AbstractC166997dE.A0T(r2, r0)
            r0 = 2131974034(0x7f135792, float:1.958512E38)
            r1.setText(r0)
            r1 = 8
            X.Ik1 r0 = new X.Ik1
            r0.<init>(r5, r1)
            X.C0fQ.A00(r0, r2)
        L91:
            com.instagram.user.model.User r0 = r3.A01(r4)
            java.util.List r1 = r0.A0T()
            X.8rY r0 = X.EnumC199318rY.A0I
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto Lc4
            android.view.View r1 = r5.A00
            X.C14360o3.A0A(r1)
            r0 = 2131441906(0x7f0b38f2, float:1.8505837E38)
            android.view.View r2 = X.AbstractC167017dG.A0U(r1, r0)
            r0 = 2131435172(0x7f0b1ea4, float:1.8492179E38)
            android.widget.TextView r1 = X.AbstractC166997dE.A0T(r2, r0)
            r0 = 2131974036(0x7f135794, float:1.9585125E38)
            r1.setText(r0)
            r1 = 10
            X.Ik1 r0 = new X.Ik1
            r0.<init>(r5, r1)
            X.C0fQ.A00(r0, r2)
        Lc4:
            return
        Lc5:
            boolean r0 = X.AbstractC199308rX.A06(r4, r2)
            if (r0 == 0) goto L5e
            android.view.View r1 = r5.A00
            X.C14360o3.A0A(r1)
            r0 = 2131438348(0x7f0b2b0c, float:1.849862E38)
            android.view.View r2 = X.AbstractC167017dG.A0U(r1, r0)
            r0 = 2131435172(0x7f0b1ea4, float:1.8492179E38)
            android.widget.TextView r1 = X.AbstractC166997dE.A0T(r2, r0)
            r0 = 2131974035(0x7f135793, float:1.9585123E38)
            r1.setText(r0)
            r1 = 9
            goto L56
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23724Aex.E2K():void");
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "shopping_sticker_creation";
    }
}
