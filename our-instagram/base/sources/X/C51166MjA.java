package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.MjA, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51166MjA extends C2UU {
    public int A00;
    public int A01;
    public int A02;
    public C54390O1w A03;
    public C54391O1x A04;
    public boolean A05;
    public final List A06 = AbstractC166987dD.A1E();
    public final boolean A07;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006e  */
    @Override // X.C2UU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(X.C3OO r9, int r10) {
        /*
            r8 = this;
            r4 = 0
            X.C14360o3.A0B(r9, r4)
            boolean r0 = r9 instanceof X.C51224Mk9
            if (r0 == 0) goto Lb9
            java.util.List r0 = r8.A06
            java.lang.Object r1 = r0.get(r10)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.creation.album.listview.AlbumListContentType.ViewData"
            X.C14360o3.A0C(r1, r0)
            X.NHB r1 = (X.NHB) r1
            com.instagram.creation.base.MediaSession r5 = r1.A00
            r6 = r9
            X.Mk9 r6 = (X.C51224Mk9) r6
            java.lang.Integer r7 = r5.Btq()
            java.lang.Integer r2 = X.C05F.A01
            java.lang.String r0 = "renderControllerProvider"
            X.O1w r1 = r8.A03
            if (r7 != r2) goto L8b
            if (r1 == 0) goto Lb1
            android.view.View r2 = X.AbstractC31171DnF.A06(r9)
            X.NAu r1 = r1.A00
            X.8ae r0 = r1.A0X
            X.47Z r0 = X.MSY.A0U(r5, r0)
            if (r0 != 0) goto L86
            java.lang.String r3 = "pendingMedia is null and path for media type video mediasession, "
            java.lang.String r2 = r5.B6E()
            java.lang.String r1 = "pendingMediakey value "
            java.lang.String r0 = r5.BcD()
            java.lang.String r1 = X.AnonymousClass001.A0u(r3, r2, r1, r0)
            java.lang.String r0 = "AlbumRenderViewController"
            X.AbstractC12120kG.A01(r0, r1)
            r2 = 0
        L4c:
            r6.A00 = r2
            boolean r0 = r8.A07
            if (r0 == 0) goto L6a
            android.view.View r1 = r9.itemView
            r0 = 2131432885(0x7f0b15b5, float:1.848754E38)
            android.view.View r3 = X.AbstractC166997dE.A0S(r1, r0)
            r0 = 7
            X.ViewOnClickListenerC55459OkE.A01(r3, r9, r7, r8, r0)
            int r2 = r8.A01
            r1 = 2
            r0 = 8
            if (r2 <= r1) goto L67
            r0 = 0
        L67:
            r3.setVisibility(r0)
        L6a:
            X.Pr1 r0 = r6.A00
            if (r0 == 0) goto L74
            r0.EZa()
            r0.CoJ()
        L74:
            android.view.View r1 = r9.itemView
            r0 = 25
            X.ViewOnClickListenerC55464OkJ.A01(r1, r0, r8, r5)
            android.view.View r1 = r9.itemView
            X.OkX r0 = new X.OkX
            r0.<init>(r4, r9, r8)
            r1.setOnLongClickListener(r0)
            return
        L86:
            X.OxD r2 = X.C52254NAu.A01(r2, r1, r5, r0)
            goto L4c
        L8b:
            if (r1 == 0) goto Lb1
            android.view.View r0 = X.AbstractC31171DnF.A06(r9)
            X.NAu r3 = r1.A00
            X.MaS r2 = X.C52254NAu.A00(r0, r3, r5)
            com.instagram.common.session.UserSession r0 = r3.A0P
            boolean r0 = X.C2J9.A02(r0)
            if (r0 == 0) goto L4c
            com.instagram.creation.base.CreationSession r1 = r3.A0S
            java.lang.String r0 = r5.B6E()
            com.instagram.creation.base.PhotoSession r1 = r1.A03(r0)
            if (r1 == 0) goto L4c
            X.5L6 r0 = r3.A0D
            X.C52254NAu.A0E(r3, r0, r1, r4)
            goto L4c
        Lb1:
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        Lb9:
            android.view.View r1 = r9.itemView
            r0 = 26
            X.ViewOnClickListenerC55464OkJ.A01(r1, r0, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51166MjA.onBindViewHolder(X.3OO, int):void");
    }

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        Context A06 = AbstractC31173DnH.A06(viewGroup, 0);
        if (i != 2) {
            View A0C = AbstractC31173DnH.A0C(LayoutInflater.from(A06), viewGroup, R.layout.album_preview_view, false);
            View A0S = AbstractC166997dE.A0S(A0C, R.id.album_filter_view_container);
            A0S.getLayoutParams().width = this.A02;
            A0S.getLayoutParams().height = this.A00;
            return new C3OO(A0C);
        }
        LinearLayout linearLayout = new LinearLayout(A06);
        AbstractC43592JPx.A1H(linearLayout, -2, -1);
        linearLayout.setGravity(17);
        linearLayout.addView(LayoutInflater.from(A06).inflate(R.layout.album_add_item_view, viewGroup, false));
        return new C3OO(linearLayout);
    }

    @Override // X.C2UU
    public final void onViewRecycled(C3OO c3oo) {
        InterfaceC58195Pr1 interfaceC58195Pr1;
        C14360o3.A0B(c3oo, 0);
        if ((c3oo instanceof C51224Mk9) && (interfaceC58195Pr1 = ((C51224Mk9) c3oo).A00) != null) {
            interfaceC58195Pr1.cleanup();
        }
    }

    public static final void A00(C51166MjA c51166MjA, List list) {
        int size;
        if (c51166MjA.A05) {
            if (!(AbstractC001800i.A0L(list) instanceof NHC)) {
                c51166MjA.A01 = list.size();
                ArrayList A1F = AbstractC166987dD.A1F(list);
                A1F.add(NHC.A00);
                AbstractC31175DnJ.A0x(c51166MjA, A1F, c51166MjA.A06);
                return;
            }
            AbstractC31175DnJ.A0x(c51166MjA, list, c51166MjA.A06);
            size = AbstractC25226BEj.A05(list);
        } else {
            boolean z = AbstractC001800i.A0L(list) instanceof NHC;
            List list2 = list;
            if (z) {
                ArrayList A0U = AbstractC001800i.A0U(list);
                A0U.remove(A0U.size() - 1);
                list2 = A0U;
            }
            AbstractC31175DnJ.A0x(c51166MjA, list2, c51166MjA.A06);
            size = list2.size();
        }
        c51166MjA.A01 = size;
    }

    public C51166MjA(boolean z) {
        this.A07 = z;
        setHasStableIds(true);
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(1816689628);
        int size = this.A06.size();
        C0f9.A0A(-1557754336, A03);
        return size;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final long getItemId(int i) {
        long hashCode;
        int A03 = C0f9.A03(-32473002);
        List list = this.A06;
        if (list.get(i) instanceof NHC) {
            hashCode = 2;
        } else {
            Object obj = list.get(i);
            C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.creation.album.listview.AlbumListContentType.ViewData");
            hashCode = ((NHB) obj).A00.hashCode();
        }
        C0f9.A0A(1956033892, A03);
        return hashCode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        ?? r1;
        int A03 = C0f9.A03(-1669056644);
        List list = this.A06;
        if (list.get(i) instanceof NHC) {
            r1 = 2;
        } else {
            Object obj = list.get(i);
            C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.creation.album.listview.AlbumListContentType.ViewData");
            r1 = AbstractC167007dF.A1X(((NHB) obj).A00.Btq(), C05F.A01);
        }
        C0f9.A0A(2042577146, A03);
        return r1;
    }
}
