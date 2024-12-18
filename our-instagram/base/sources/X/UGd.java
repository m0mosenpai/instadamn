package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes11.dex */
public final class UGd extends C2UU {
    public List A00;
    public final Context A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;
    public final Integer A04;

    public UGd(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, Integer num) {
        C14360o3.A0B(num, 3);
        this.A01 = context;
        this.A03 = userSession;
        this.A04 = num;
        this.A02 = interfaceC11380iw;
        this.A00 = C16930sl.A00;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00a3 A[Catch: NotFoundException -> 0x001b, TryCatch #0 {NotFoundException -> 0x001b, blocks: (B:10:0x002b, B:12:0x0035, B:14:0x0062, B:16:0x0079, B:18:0x007d, B:19:0x009f, B:21:0x00a3, B:22:0x00a6, B:24:0x009c), top: B:9:0x002b }] */
    @Override // X.C2UU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(X.C3OO r11, int r12) {
        /*
            r10 = this;
            r2 = 0
            X.C14360o3.A0B(r11, r2)
            java.util.List r0 = r10.A00
            java.lang.Object r5 = r0.get(r12)
            X.XCL r5 = (X.XCL) r5
            boolean r0 = r5 instanceof X.WeH
            if (r0 == 0) goto L1c
            android.content.Context r1 = r10.A01
            X.UJO r11 = (X.UJO) r11
            X.WeH r5 = (X.WeH) r5
            X.0iw r0 = r10.A02
            X.AbstractC69894VxL.A01(r1, r11, r5, r0)
        L1b:
            return
        L1c:
            boolean r0 = r5 instanceof X.C70636WeG
            if (r0 == 0) goto L1b
            android.content.Context r8 = r10.A01
            X.UJN r11 = (X.UJN) r11
            X.WeG r5 = (X.C70636WeG) r5
            X.0iw r9 = r10.A02
            X.AbstractC167017dG.A1P(r11, r5)
            java.lang.Integer r0 = r5.A03     // Catch: android.content.res.Resources.NotFoundException -> L1b
            int r0 = r0.intValue()     // Catch: android.content.res.Resources.NotFoundException -> L1b
            r1 = 8
            if (r0 == r2) goto L62
            com.instagram.common.ui.base.IgTextView r0 = r11.A01     // Catch: android.content.res.Resources.NotFoundException -> L1b
            r0.setVisibility(r1)     // Catch: android.content.res.Resources.NotFoundException -> L1b
            com.instagram.common.ui.widget.imageview.RoundedCornerImageView r0 = r11.A03     // Catch: android.content.res.Resources.NotFoundException -> L1b
            r0.setVisibility(r1)     // Catch: android.content.res.Resources.NotFoundException -> L1b
            android.view.View r0 = r11.A00     // Catch: android.content.res.Resources.NotFoundException -> L1b
            r0.setVisibility(r2)     // Catch: android.content.res.Resources.NotFoundException -> L1b
            com.instagram.igds.components.button.IgdsButton r2 = r11.A04     // Catch: android.content.res.Resources.NotFoundException -> L1b
            android.content.res.Resources r1 = r8.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L1b
            r0 = 2131970337(0x7f134921, float:1.9577622E38)
            java.lang.String r0 = r1.getString(r0)     // Catch: android.content.res.Resources.NotFoundException -> L1b
            r2.setText(r0)     // Catch: android.content.res.Resources.NotFoundException -> L1b
            android.view.View$OnClickListener r0 = r5.A01     // Catch: android.content.res.Resources.NotFoundException -> L1b
            X.C0fQ.A00(r0, r2)     // Catch: android.content.res.Resources.NotFoundException -> L1b
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r11.A02     // Catch: android.content.res.Resources.NotFoundException -> L1b
            r0 = 2131237742(0x7f081b6e, float:1.8091743E38)
            X.AbstractC166997dE.A19(r8, r1, r0)     // Catch: android.content.res.Resources.NotFoundException -> L1b
            goto Lbc
        L62:
            android.view.View r0 = r11.A00     // Catch: android.content.res.Resources.NotFoundException -> L1b
            r0.setVisibility(r1)     // Catch: android.content.res.Resources.NotFoundException -> L1b
            com.instagram.common.ui.base.IgTextView r7 = r11.A01     // Catch: android.content.res.Resources.NotFoundException -> L1b
            r7.setVisibility(r2)     // Catch: android.content.res.Resources.NotFoundException -> L1b
            com.instagram.common.ui.widget.imageview.RoundedCornerImageView r6 = r11.A03     // Catch: android.content.res.Resources.NotFoundException -> L1b
            r6.setVisibility(r2)     // Catch: android.content.res.Resources.NotFoundException -> L1b
            java.lang.String r1 = r5.A05     // Catch: android.content.res.Resources.NotFoundException -> L1b
            int r0 = r1.length()     // Catch: android.content.res.Resources.NotFoundException -> L1b
            if (r0 > 0) goto L9c
            java.lang.Long r0 = r5.A04     // Catch: android.content.res.Resources.NotFoundException -> L1b
            if (r0 == 0) goto L9f
            long r1 = r0.longValue()     // Catch: android.content.res.Resources.NotFoundException -> L1b
            android.content.res.Resources r4 = r8.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L1b
            r3 = 2131970336(0x7f134920, float:1.957762E38)
            java.util.TimeZone r0 = X.MX0.A03     // Catch: android.content.res.Resources.NotFoundException -> L1b
            r0 = 163(0xa3, float:2.28E-43)
            java.lang.String r0 = X.MSV.A00(r0)     // Catch: android.content.res.Resources.NotFoundException -> L1b
            java.lang.String r0 = X.MX0.A04(r0, r1)     // Catch: android.content.res.Resources.NotFoundException -> L1b
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: android.content.res.Resources.NotFoundException -> L1b
            java.lang.String r1 = r4.getString(r3, r0)     // Catch: android.content.res.Resources.NotFoundException -> L1b
        L9c:
            r7.setText(r1)     // Catch: android.content.res.Resources.NotFoundException -> L1b
        L9f:
            com.instagram.common.typedurl.ImageUrl r0 = r5.A02     // Catch: android.content.res.Resources.NotFoundException -> L1b
            if (r0 == 0) goto La6
            r6.setUrl(r0, r9)     // Catch: android.content.res.Resources.NotFoundException -> L1b
        La6:
            com.instagram.igds.components.button.IgdsButton r2 = r11.A04     // Catch: android.content.res.Resources.NotFoundException -> L1b
            android.content.res.Resources r1 = r8.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L1b
            r0 = 2131970335(0x7f13491f, float:1.9577618E38)
            java.lang.String r0 = r1.getString(r0)     // Catch: android.content.res.Resources.NotFoundException -> L1b
            r2.setText(r0)     // Catch: android.content.res.Resources.NotFoundException -> L1b
            android.view.View$OnClickListener r0 = r5.A01     // Catch: android.content.res.Resources.NotFoundException -> L1b
            X.C0fQ.A00(r0, r2)     // Catch: android.content.res.Resources.NotFoundException -> L1b
            goto Lbd
        Lbc:
            return
        Lbd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UGd.onBindViewHolder(X.3OO, int):void");
    }

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        ViewGroup A00;
        C14360o3.A0B(viewGroup, 0);
        int intValue = this.A04.intValue();
        String A002 = AbstractC111324zv.A00(1135);
        if (intValue != 0) {
            if (intValue == 1) {
                A00 = (ViewGroup) AbstractC31175DnJ.A07(LayoutInflater.from(this.A01), viewGroup, R.layout.promote_ad_tools_multi_post_suggestions_card, false);
                A00.setTag(new UJN(A00));
            } else {
                throw new RuntimeException();
            }
        } else {
            A00 = AbstractC69894VxL.A00(this.A01, viewGroup);
        }
        Object tag = A00.getTag();
        C14360o3.A0C(tag, A002);
        return (C3OO) tag;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(1944561311);
        int size = this.A00.size();
        C0f9.A0A(-1322806782, A03);
        return size;
    }
}
