package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7oU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C173767oU implements C86I {
    public final EnumC190378bv A00;
    public final C1824487j A01;
    public final C86G A02;
    public final C86H A03;
    public final UserSession A04;

    public C173767oU(C1824487j c1824487j, C86G c86g, C86H c86h, EnumC190378bv enumC190378bv, UserSession userSession) {
        C14360o3.A0B(c1824487j, 1);
        C14360o3.A0B(c86g, 2);
        this.A01 = c1824487j;
        this.A02 = c86g;
        this.A03 = c86h;
        this.A00 = enumC190378bv;
        this.A04 = userSession;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0059, code lost:
    
        if (r1 != null) goto L11;
     */
    @Override // X.C86I
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Cnh(com.instagram.camera.effect.models.CameraAREffect r7) {
        /*
            r6 = this;
            r0 = 0
            X.C14360o3.A0B(r7, r0)
            X.8bv r2 = r6.A00
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.Set r0 = r7.A0b
            java.util.Iterator r5 = r0.iterator()
        L11:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L5e
            java.lang.Object r4 = r5.next()
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L5c
            java.util.Map r1 = X.EnumC190378bv.A01
            java.util.Locale r0 = java.util.Locale.getDefault()
            X.C14360o3.A07(r0)
            java.lang.String r0 = r4.toLowerCase(r0)
            X.C14360o3.A07(r0)
            java.lang.Object r1 = r1.get(r0)
        L33:
            X.8bv r0 = X.EnumC190378bv.A08
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L4e
            X.8bv r1 = X.EnumC190378bv.A07
        L3d:
            r3.add(r1)
        L40:
            X.8bv r0 = X.EnumC190378bv.A04
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L11
            X.8bv r0 = X.EnumC190378bv.A09
            r3.add(r0)
            goto L11
        L4e:
            X.8bv r0 = X.EnumC190378bv.A06
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L59
            X.8bv r1 = X.EnumC190378bv.A05
            goto L3d
        L59:
            if (r1 == 0) goto L40
            goto L3d
        L5c:
            r1 = 0
            goto L33
        L5e:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L6a
            boolean r0 = r3.contains(r2)
            if (r0 == 0) goto L9e
        L6a:
            r3 = 1
            r4 = 0
            java.lang.Integer r1 = r7.A09
            java.lang.Integer r0 = X.C05F.A01
            if (r1 == r0) goto L9e
            java.lang.String r1 = com.instagram.camera.effect.models.CameraAREffect.A00(r1)
            java.lang.String r0 = "SUPERZOOMV3"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L9e
            java.lang.Integer r0 = r7.A09
            java.lang.String r1 = com.instagram.camera.effect.models.CameraAREffect.A00(r0)
            java.lang.String r0 = "FOCUSV2"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L9e
            java.lang.String r1 = r7.A0K
            java.util.Set r0 = X.AbstractC173777oV.A00
            boolean r0 = X.AbstractC001800i.A0u(r0, r1)
            if (r0 != 0) goto L9e
            X.8bv r0 = X.EnumC190378bv.A04
            if (r2 != r0) goto La0
            boolean r0 = r7.A0f
            if (r0 == 0) goto La0
        L9e:
            r4 = 1
        L9f:
            return r4
        La0:
            X.87j r2 = r6.A01
            java.lang.String r1 = r7.A0K
            X.56E r0 = X.C56E.A06
            X.C56E.A00(r0, r3)
            boolean r0 = r0.A02
            if (r0 != 0) goto Lb6
            java.util.Set r0 = r2.A00
            boolean r0 = X.AbstractC001800i.A0u(r0, r1)
            if (r0 == 0) goto Lb6
            goto L9e
        Lb6:
            X.86H r0 = r6.A03
            if (r0 == 0) goto L9f
            boolean r0 = r0.Cnh(r7)
            if (r0 != r3) goto L9f
            goto L9e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C173767oU.Cnh(com.instagram.camera.effect.models.CameraAREffect):boolean");
    }
}
