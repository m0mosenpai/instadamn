package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.Jcq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44003Jcq extends AbstractC66412zI {
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C44669JqE(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_general_folder_hmps_banner_v2, false));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0054, code lost:
    
        if (r1 == X.EnumC44025JdC.A0E) goto L13;
     */
    @Override // X.AbstractC66422zJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void bind(X.InterfaceC66482zP r6, X.C3OO r7) {
        /*
            r5 = this;
            X.KIq r6 = (X.C45653KIq) r6
            X.JqE r7 = (X.C44669JqE) r7
            X.AbstractC167017dG.A1N(r6, r7)
            r4 = 0
            com.instagram.igds.components.banner.IgdsBanner r3 = r7.A00
            int r0 = r6.A00
            r3.setIcon(r0)
            java.lang.String r2 = r6.A02
            r0 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            r3.setBody(r2, r1)
            boolean r1 = r6.A04
            r3.setDismissible(r1)
            boolean r1 = r6.A05
            if (r1 == 0) goto L24
            java.lang.String r0 = r6.A03
        L24:
            r3.setAction(r0)
            android.content.Context r1 = r3.getContext()
            int r0 = X.AbstractC53242c7.A0D(r1)
            X.AbstractC31172DnG.A1B(r1, r3, r0)
            X.Ltp r1 = r6.A01
            r3.A00 = r1
            r3.setVisibility(r4)
            java.lang.Object r0 = r1.A02
            X.JRj r0 = (X.C43626JRj) r0
            com.instagram.common.session.UserSession r4 = r0.A0B
            X.0iw r3 = r0.A05
            java.lang.Object r1 = r1.A01
            X.JdC r1 = (X.EnumC44025JdC) r1
            X.JdC r0 = X.EnumC44025JdC.A09
            if (r1 == r0) goto L63
            X.JdC r0 = X.EnumC44025JdC.A0C
            if (r1 == r0) goto L63
            X.JdC r0 = X.EnumC44025JdC.A0D
            if (r1 == r0) goto L56
            X.JdC r0 = X.EnumC44025JdC.A0E
            r2 = 2
            if (r1 != r0) goto L57
        L56:
            r2 = 1
        L57:
            boolean r0 = r1.A04
            java.lang.Boolean r1 = X.AbstractC31172DnG.A0s(r0)
            java.lang.String r0 = "business_inbox_hmps_banner_impression"
            X.C162337Ov.A0P(r3, r4, r1, r0, r2)
            return
        L63:
            r2 = 0
            goto L57
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44003Jcq.bind(X.2zP, X.3OO):void");
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C45653KIq.class;
    }
}
