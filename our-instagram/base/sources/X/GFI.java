package X;

/* loaded from: classes6.dex */
public final class GFI implements GZP {
    public final int A00;
    public final Object A01;

    public GFI(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00bd, code lost:
    
        if (X.AbstractC2056298m.A00(r0).A00.getInt("direct_collab_collection_feed_creation_nux_impression_count", 0) < 1) goto L21;
     */
    @Override // X.GZP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DGr(java.util.List r13, boolean r14) {
        /*
            r12 = this;
            int r0 = r12.A00
            if (r0 == 0) goto L18
            r0 = 1
            X.C14360o3.A0B(r13, r0)
            java.lang.Object r0 = r12.A01
            X.EM5 r0 = (X.EM5) r0
            X.Dzk r1 = r0.A00
            if (r1 != 0) goto Leb
            X.AbstractC31171DnF.A0t()
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L18:
            r7 = 1
            X.C14360o3.A0B(r13, r7)
            java.lang.Object r2 = r12.A01
            X.EMG r2 = (X.EMG) r2
            r2.A08 = r13
            X.0do r8 = r2.A0K
            X.1qM r4 = X.AbstractC25226BEj.A0z(r8)
            android.os.Bundle r3 = r2.requireArguments()
            r0 = 150(0x96, float:2.1E-43)
            java.lang.String r1 = X.AbstractC111324zv.A00(r0)
            int r3 = r3.getInt(r1)
            X.0do r6 = r2.A0M
            com.instagram.common.session.UserSession r0 = X.AbstractC166987dD.A0r(r6)
            boolean r0 = X.AbstractC35273Fh8.A08(r0)
            if (r0 == 0) goto L7e
            java.util.List r9 = r2.A08
            X.1qM r5 = X.AbstractC25226BEj.A0z(r8)
            android.os.Bundle r0 = r2.requireArguments()
            int r1 = r0.getInt(r1)
            com.instagram.common.session.UserSession r0 = X.AbstractC166987dD.A0r(r6)
            boolean r0 = X.AbstractC35273Fh8.A0B(r0, r5, r9, r1)
            if (r0 == 0) goto L7e
            android.content.Context r1 = r2.requireContext()
            java.util.List r0 = r2.A08
            java.util.ArrayList r11 = X.AbstractC001800i.A0U(r0)
            r10 = 0
            X.Epn r9 = X.EnumC33416Epn.A07
            java.lang.String r5 = r9.A01
            r0 = 2131956347(0x7f13127b, float:1.9549247E38)
            java.lang.String r1 = r1.getString(r0)
            com.instagram.save.model.SavedCollection r0 = new com.instagram.save.model.SavedCollection
            r0.<init>(r9, r5, r1)
            r11.add(r10, r0)
            java.util.List r0 = X.AbstractC001800i.A0a(r11)
            r2.A08 = r0
        L7e:
            java.util.List r0 = r2.A08
            boolean r0 = X.AbstractC166987dD.A1b(r0)
            if (r0 == 0) goto Lfb
            X.0do r0 = r2.A0F
            java.lang.Object r5 = r0.getValue()
            X.FQX r5 = (X.FQX) r5
            java.util.List r1 = r2.A08
            X.1qM r0 = X.AbstractC25226BEj.A0z(r8)
            r5.A00(r0, r1)
            X.0do r0 = r2.A0G
            com.instagram.direct.messagethread.collections.model.DirectCollectionArguments r0 = X.AbstractC31172DnG.A0f(r0)
            java.lang.Integer r1 = r0.A03
            java.lang.Integer r0 = X.C05F.A01
            if (r1 != r0) goto Le6
            boolean r0 = X.EMG.A07(r2)
            if (r0 != 0) goto Lbf
            com.instagram.common.session.UserSession r0 = X.AbstractC166987dD.A0r(r6)
            r5 = 0
            X.C14360o3.A0B(r0, r5)
            X.98n r0 = X.AbstractC2056298m.A00(r0)
            X.0xq r1 = r0.A00
            java.lang.String r0 = "direct_collab_collection_feed_creation_nux_impression_count"
            int r0 = r1.getInt(r0, r5)
            if (r0 >= r7) goto Le6
        Lbf:
            boolean r0 = X.EMG.A07(r2)
            X.EMG.A05(r2, r7, r0)
        Lc6:
            com.instagram.common.session.UserSession r0 = X.AbstractC166987dD.A0r(r6)
            boolean r0 = X.AbstractC35273Fh8.A08(r0)
            if (r0 == 0) goto Lfa
            if (r4 == 0) goto Lfa
            boolean r0 = X.AbstractC35273Fh8.A0C(r4, r3)
            if (r0 == 0) goto Lfa
            com.instagram.common.session.UserSession r1 = X.AbstractC166987dD.A0r(r6)
            X.0do r0 = r2.A0N
            java.lang.String r0 = X.AbstractC25225BEi.A15(r0)
            X.AbstractC35273Fh8.A04(r1, r4, r2, r0, r3)
            return
        Le6:
            r0 = 0
            X.EMG.A04(r2, r0)
            goto Lc6
        Leb:
            if (r14 == 0) goto Lf2
            java.util.List r0 = r1.A01
            r0.clear()
        Lf2:
            java.util.List r0 = r1.A01
            r0.addAll(r13)
            r1.notifyDataSetChanged()
        Lfa:
            return
        Lfb:
            r0 = 0
            X.EMG.A05(r2, r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GFI.DGr(java.util.List, boolean):void");
    }

    @Override // X.GZP
    public final void DGh(boolean z) {
    }
}
