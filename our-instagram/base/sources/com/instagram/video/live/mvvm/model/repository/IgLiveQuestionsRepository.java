package com.instagram.video.live.mvvm.model.repository;

import X.C16930sl;
import X.EnumC223199sy;
import X.EnumC53318Nhu;
import X.OM6;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;
import com.instagram.video.live.mvvm.model.datasource.api.IgLiveQuestionsApi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class IgLiveQuestionsRepository {
    public int A00;
    public int A01;
    public Long A02;
    public List A03;
    public List A04;
    public int A05;
    public final UserSession A06;
    public final IgLiveQuestionsApi A07;
    public final HashMap A08;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A05(java.lang.String r7, X.InterfaceC23621Ds r8, long r9) {
        /*
            r6 = this;
            r3 = 0
            boolean r0 = r8 instanceof X.MAD
            if (r0 == 0) goto L7a
            r4 = r8
            X.MAD r4 = (X.MAD) r4
            int r0 = r4.A05
            if (r0 != r3) goto L7a
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7a
            int r2 = r2 - r1
            r4.A00 = r2
        L17:
            java.lang.Object r2 = r4.A03
            X.1JX r3 = X.C1JX.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L67
            if (r0 != r1) goto L92
            long r9 = r4.A01
            java.lang.Object r5 = r4.A02
            com.instagram.video.live.mvvm.model.repository.IgLiveQuestionsRepository r5 = (com.instagram.video.live.mvvm.model.repository.IgLiveQuestionsRepository) r5
            X.AbstractC09560e7.A00(r2)
        L2b:
            X.3NY r2 = (X.C3NY) r2
            boolean r0 = r2 instanceof X.C3NX
            if (r0 == 0) goto L80
            X.3NX r2 = (X.C3NX) r2
            java.lang.Object r3 = r2.A00
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r0 = r3.booleanValue()
            if (r0 == 0) goto L66
            java.lang.Long r4 = r5.A02
            if (r4 == 0) goto L5a
            long r1 = r4.longValue()
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 == 0) goto L66
            long r1 = r4.longValue()
            java.util.HashMap r0 = r5.A08
            java.lang.Object r0 = r0.get(r4)
            if (r0 == 0) goto L5a
            X.9sy r0 = X.EnumC223199sy.A04
            r5.A09(r0, r1)
        L5a:
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r9)
            r5.A02 = r0
            X.9sy r0 = X.EnumC223199sy.A05
            r5.A09(r0, r9)
        L66:
            return r3
        L67:
            X.AbstractC09560e7.A00(r2)
            com.instagram.video.live.mvvm.model.datasource.api.IgLiveQuestionsApi r0 = r6.A07
            r4.A02 = r6
            r4.A01 = r9
            r4.A00 = r1
            java.lang.Object r2 = r0.A05(r7, r4, r9)
            if (r2 == r3) goto L66
            r5 = r6
            goto L2b
        L7a:
            X.MAD r4 = new X.MAD
            r4.<init>(r6, r8, r3)
            goto L17
        L80:
            boolean r0 = r2 instanceof X.C194848jk
            if (r0 == 0) goto L8c
            java.lang.String r0 = "IG Live question network request failed"
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r0)
            throw r1
        L8c:
            X.B4Z r1 = new X.B4Z
            r1.<init>()
            throw r1
        L92:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.repository.IgLiveQuestionsRepository.A05(java.lang.String, X.1Ds, long):java.lang.Object");
    }

    public /* synthetic */ IgLiveQuestionsRepository(UserSession userSession) {
        IgLiveQuestionsApi igLiveQuestionsApi = new IgLiveQuestionsApi(userSession);
        this.A06 = userSession;
        this.A07 = igLiveQuestionsApi;
        this.A08 = new HashMap();
        C16930sl c16930sl = C16930sl.A00;
        this.A04 = c16930sl;
        this.A03 = c16930sl;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(java.lang.String r6, java.lang.String r7, X.InterfaceC23621Ds r8) {
        /*
            r5 = this;
            r3 = 30
            boolean r0 = X.PX4.A02(r8, r3)
            if (r0 == 0) goto L3d
            r4 = r8
            X.PX4 r4 = (X.PX4) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3d
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r3 = r4.A01
            X.1JX r2 = X.C1JX.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L2f
            if (r0 != r1) goto L57
            X.AbstractC09560e7.A00(r3)
        L24:
            X.3NY r3 = (X.C3NY) r3
            boolean r0 = r3 instanceof X.C3NX
            if (r0 == 0) goto L45
            X.3NX r3 = (X.C3NX) r3
            java.lang.Object r2 = r3.A00
            return r2
        L2f:
            X.AbstractC09560e7.A00(r3)
            com.instagram.video.live.mvvm.model.datasource.api.IgLiveQuestionsApi r0 = r5.A07
            r4.A00 = r1
            java.lang.Object r3 = r0.A00(r6, r7, r4)
            if (r3 != r2) goto L24
            return r2
        L3d:
            r0 = 42
            X.PX4 r4 = new X.PX4
            r4.<init>(r5, r8, r3, r0)
            goto L16
        L45:
            boolean r0 = r3 instanceof X.C194848jk
            if (r0 == 0) goto L51
            java.lang.String r0 = "IG Live question network request failed"
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r0)
            throw r1
        L51:
            X.B4Z r1 = new X.B4Z
            r1.<init>()
            throw r1
        L57:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.repository.IgLiveQuestionsRepository.A00(java.lang.String, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(java.lang.String r29, X.InterfaceC23621Ds r30) {
        /*
            Method dump skipped, instructions count: 594
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.repository.IgLiveQuestionsRepository.A01(java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A02(java.lang.String r6, X.InterfaceC23621Ds r7, long r8) {
        /*
            r5 = this;
            r3 = 28
            boolean r0 = X.PX4.A02(r7, r3)
            if (r0 == 0) goto L3d
            r4 = r7
            X.PX4 r4 = (X.PX4) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3d
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r3 = r4.A01
            X.1JX r2 = X.C1JX.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L2f
            if (r0 != r1) goto L57
            X.AbstractC09560e7.A00(r3)
        L24:
            X.3NY r3 = (X.C3NY) r3
            boolean r0 = r3 instanceof X.C3NX
            if (r0 == 0) goto L45
            X.3NX r3 = (X.C3NX) r3
            java.lang.Object r2 = r3.A00
            return r2
        L2f:
            X.AbstractC09560e7.A00(r3)
            com.instagram.video.live.mvvm.model.datasource.api.IgLiveQuestionsApi r0 = r5.A07
            r4.A00 = r1
            java.lang.Object r3 = r0.A02(r6, r4, r8)
            if (r3 != r2) goto L24
            return r2
        L3d:
            r0 = 42
            X.PX4 r4 = new X.PX4
            r4.<init>(r5, r7, r3, r0)
            goto L16
        L45:
            boolean r0 = r3 instanceof X.C194848jk
            if (r0 == 0) goto L51
            java.lang.String r0 = "IG Live question network request failed"
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r0)
            throw r1
        L51:
            X.B4Z r1 = new X.B4Z
            r1.<init>()
            throw r1
        L57:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.repository.IgLiveQuestionsRepository.A02(java.lang.String, X.1Ds, long):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A03(java.lang.String r7, X.InterfaceC23621Ds r8, long r9) {
        /*
            r6 = this;
            r4 = 24
            boolean r0 = X.C57146PWy.A01(r8, r4)
            if (r0 == 0) goto L64
            r3 = r8
            X.PWy r3 = (X.C57146PWy) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L64
            int r2 = r2 - r1
            r3.A00 = r2
        L16:
            java.lang.Object r2 = r3.A02
            X.1JX r4 = X.C1JX.A02
            int r0 = r3.A00
            r1 = 1
            if (r0 == 0) goto L53
            if (r0 != r1) goto L7c
            java.lang.Object r5 = r3.A01
            com.instagram.video.live.mvvm.model.repository.IgLiveQuestionsRepository r5 = (com.instagram.video.live.mvvm.model.repository.IgLiveQuestionsRepository) r5
            X.AbstractC09560e7.A00(r2)
        L28:
            X.3NY r2 = (X.C3NY) r2
            boolean r0 = r2 instanceof X.C3NX
            if (r0 == 0) goto L6a
            X.3NX r2 = (X.C3NX) r2
            java.lang.Object r4 = r2.A00
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r0 = r4.booleanValue()
            if (r0 == 0) goto L52
            java.lang.Long r3 = r5.A02
            if (r3 == 0) goto L4f
            long r1 = r3.longValue()
            java.util.HashMap r0 = r5.A08
            java.lang.Object r0 = r0.get(r3)
            if (r0 == 0) goto L4f
            X.9sy r0 = X.EnumC223199sy.A04
            r5.A09(r0, r1)
        L4f:
            r0 = 0
            r5.A02 = r0
        L52:
            return r4
        L53:
            X.AbstractC09560e7.A00(r2)
            com.instagram.video.live.mvvm.model.datasource.api.IgLiveQuestionsApi r0 = r6.A07
            r3.A01 = r6
            r3.A00 = r1
            java.lang.Object r2 = r0.A03(r7, r3, r9)
            if (r2 == r4) goto L52
            r5 = r6
            goto L28
        L64:
            X.PWy r3 = new X.PWy
            r3.<init>(r6, r8, r4)
            goto L16
        L6a:
            boolean r0 = r2 instanceof X.C194848jk
            if (r0 == 0) goto L76
            java.lang.String r0 = "IG Live question network request failed"
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r0)
            throw r1
        L76:
            X.B4Z r1 = new X.B4Z
            r1.<init>()
            throw r1
        L7c:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.repository.IgLiveQuestionsRepository.A03(java.lang.String, X.1Ds, long):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A04(java.lang.String r6, X.InterfaceC23621Ds r7, long r8) {
        /*
            r5 = this;
            r3 = 29
            boolean r0 = X.PX4.A02(r7, r3)
            if (r0 == 0) goto L3d
            r4 = r7
            X.PX4 r4 = (X.PX4) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3d
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r3 = r4.A01
            X.1JX r2 = X.C1JX.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L2f
            if (r0 != r1) goto L57
            X.AbstractC09560e7.A00(r3)
        L24:
            X.3NY r3 = (X.C3NY) r3
            boolean r0 = r3 instanceof X.C3NX
            if (r0 == 0) goto L45
            X.3NX r3 = (X.C3NX) r3
            java.lang.Object r2 = r3.A00
            return r2
        L2f:
            X.AbstractC09560e7.A00(r3)
            com.instagram.video.live.mvvm.model.datasource.api.IgLiveQuestionsApi r0 = r5.A07
            r4.A00 = r1
            java.lang.Object r3 = r0.A04(r6, r4, r8)
            if (r3 != r2) goto L24
            return r2
        L3d:
            r0 = 42
            X.PX4 r4 = new X.PX4
            r4.<init>(r5, r7, r3, r0)
            goto L16
        L45:
            boolean r0 = r3 instanceof X.C194848jk
            if (r0 == 0) goto L51
            java.lang.String r0 = "IG Live question network request failed"
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r0)
            throw r1
        L51:
            X.B4Z r1 = new X.B4Z
            r1.<init>()
            throw r1
        L57:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.repository.IgLiveQuestionsRepository.A04(java.lang.String, X.1Ds, long):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A06(java.lang.String r6, X.InterfaceC23621Ds r7, long r8) {
        /*
            r5 = this;
            r3 = 31
            boolean r0 = X.PX4.A02(r7, r3)
            if (r0 == 0) goto L3d
            r4 = r7
            X.PX4 r4 = (X.PX4) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3d
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r3 = r4.A01
            X.1JX r2 = X.C1JX.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L2f
            if (r0 != r1) goto L57
            X.AbstractC09560e7.A00(r3)
        L24:
            X.3NY r3 = (X.C3NY) r3
            boolean r0 = r3 instanceof X.C3NX
            if (r0 == 0) goto L45
            X.3NX r3 = (X.C3NX) r3
            java.lang.Object r2 = r3.A00
            return r2
        L2f:
            X.AbstractC09560e7.A00(r3)
            com.instagram.video.live.mvvm.model.datasource.api.IgLiveQuestionsApi r0 = r5.A07
            r4.A00 = r1
            java.lang.Object r3 = r0.A06(r6, r4, r8)
            if (r3 != r2) goto L24
            return r2
        L3d:
            r0 = 42
            X.PX4 r4 = new X.PX4
            r4.<init>(r5, r7, r3, r0)
            goto L16
        L45:
            boolean r0 = r3 instanceof X.C194848jk
            if (r0 == 0) goto L51
            java.lang.String r0 = "IG Live question network request failed"
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r0)
            throw r1
        L51:
            X.B4Z r1 = new X.B4Z
            r1.<init>()
            throw r1
        L57:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.repository.IgLiveQuestionsRepository.A06(java.lang.String, X.1Ds, long):java.lang.Object");
    }

    public final List A07() {
        List list = this.A03;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object obj = this.A08.get(Long.valueOf(((Number) it.next()).longValue()));
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final List A08() {
        List list = this.A04;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object obj = this.A08.get(Long.valueOf(((Number) it.next()).longValue()));
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void A09(EnumC223199sy enumC223199sy, long j) {
        HashMap hashMap = this.A08;
        Long valueOf = Long.valueOf(j);
        OM6 om6 = (OM6) hashMap.get(valueOf);
        if (om6 != null) {
            if (enumC223199sy != om6.A06) {
                long j2 = om6.A01;
                User user = om6.A04;
                ImageUrl imageUrl = om6.A03;
                String str = om6.A08;
                EnumC53318Nhu enumC53318Nhu = om6.A05;
                int i = om6.A00;
                boolean z = om6.A09;
                om6 = new OM6(om6.A02, imageUrl, user, enumC53318Nhu, enumC223199sy, om6.A07, str, i, j2, z);
            }
            hashMap.put(valueOf, om6);
        }
    }
}
