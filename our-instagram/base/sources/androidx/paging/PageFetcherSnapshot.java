package androidx.paging;

import X.AbstractC001800i;
import X.AbstractC011604e;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC23641Du;
import X.AbstractC25227BEk;
import X.AbstractC25233BEq;
import X.AbstractC37303Gc4;
import X.AbstractC53418Nk7;
import X.AbstractC53653Nny;
import X.AbstractC55021OWv;
import X.AnonymousClass058;
import X.AnonymousClass191;
import X.AnonymousClass197;
import X.B4Z;
import X.C05F;
import X.C0eB;
import X.C14360o3;
import X.C16400rl;
import X.C19L;
import X.C1JX;
import X.C30484DbT;
import X.C51058MhC;
import X.C51059MhD;
import X.C51060MhE;
import X.C51077MhX;
import X.C54653OCf;
import X.C54827OLm;
import X.C57172PZq;
import X.C57181PaA;
import X.EnumC53109NeM;
import X.InterfaceC16820sZ;
import X.InterfaceC19390xP;
import X.InterfaceC23621Ds;
import X.InterfaceC24731Iq;
import X.JTH;
import X.MCP;
import X.MSX;
import X.MY6;
import X.O1E;
import X.OGn;
import X.OM5;
import X.OMK;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes9.dex */
public final class PageFetcherSnapshot {
    public final OGn A00;
    public final PageFetcherSnapshotState$Holder A01;
    public final PagingConfig A02;
    public final PagingSource A03;
    public final C54827OLm A04;
    public final AtomicBoolean A05;
    public final InterfaceC16820sZ A06;
    public final AnonymousClass197 A07;
    public final InterfaceC24731Iq A08;
    public final InterfaceC19390xP A09;
    public final InterfaceC19390xP A0A;

    public PageFetcherSnapshot(PagingConfig pagingConfig, PagingSource pagingSource, C54827OLm c54827OLm, InterfaceC16820sZ interfaceC16820sZ, InterfaceC19390xP interfaceC19390xP) {
        AbstractC25233BEq.A0w(2, pagingSource, pagingConfig, interfaceC19390xP);
        this.A03 = pagingSource;
        this.A02 = pagingConfig;
        this.A0A = interfaceC19390xP;
        this.A04 = c54827OLm;
        this.A06 = interfaceC16820sZ;
        this.A00 = new OGn();
        this.A05 = new AtomicBoolean(false);
        this.A08 = MSX.A0q();
        this.A01 = new PageFetcherSnapshotState$Holder(pagingConfig);
        AnonymousClass197 anonymousClass197 = new AnonymousClass197(null);
        this.A07 = anonymousClass197;
        this.A09 = new C16400rl(new MCP(this, null, 7), AbstractC53653Nny.A00(new C57172PZq(new JTH(this, null), anonymousClass197, (InterfaceC23621Ds) null, 22)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x0475, code lost:
    
        if (r1.A02 == null) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x03df, code lost:
    
        if (X.MSW.A1a(2) != true) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0548, code lost:
    
        if (r0 == r10) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x042a, code lost:
    
        if (X.MSW.A1a(2) == true) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0114, code lost:
    
        if (X.AnonymousClass139.A00(r11, r3) == r10) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (((X.C57144PWw) r3).A0E != 1) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x02d4, code lost:
    
        if (X.MSW.A1a(3) == true) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x03c2, code lost:
    
        if (X.MSW.A1a(2) != true) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x044f, code lost:
    
        if (X.MSW.A1a(3) != true) goto L158;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x002b. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x04a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x04bd A[Catch: all -> 0x056c, TryCatch #5 {all -> 0x056c, blocks: (B:104:0x04a4, B:105:0x04aa, B:107:0x04bd, B:109:0x04c7, B:111:0x04cb, B:112:0x04cd, B:113:0x04e7, B:114:0x04d0, B:118:0x04f1, B:222:0x0253, B:224:0x0274), top: B:10:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x04fa A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0532 A[Catch: all -> 0x0560, TryCatch #0 {all -> 0x0560, blocks: (B:152:0x050b, B:155:0x0524, B:157:0x0532, B:161:0x0550, B:165:0x0545, B:219:0x054d), top: B:10:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x054c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x015d A[Catch: all -> 0x01a2, TryCatch #3 {all -> 0x01a2, blocks: (B:34:0x014a, B:36:0x015d, B:215:0x0190), top: B:10:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0447  */
    /* JADX WARN: Type inference failed for: r14v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v14, types: [X.Nk7] */
    /* JADX WARN: Type inference failed for: r14v16, types: [X.Nk7, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v2, types: [X.Nk7] */
    /* JADX WARN: Type inference failed for: r14v4, types: [X.Nk7] */
    /* JADX WARN: Type inference failed for: r14v6, types: [X.Nk7] */
    /* JADX WARN: Type inference failed for: r14v8, types: [X.Nk7] */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r1v17, types: [X.OMK] */
    /* JADX WARN: Type inference failed for: r2v44, types: [int] */
    /* JADX WARN: Type inference failed for: r2v45, types: [int] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.1Ds] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v14, types: [X.139] */
    /* JADX WARN: Type inference failed for: r3v2, types: [X.139] */
    /* JADX WARN: Type inference failed for: r3v24, types: [X.139] */
    /* JADX WARN: Type inference failed for: r3v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v26, types: [X.0oO, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v32, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v34, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v50 */
    /* JADX WARN: Type inference failed for: r3v51 */
    /* JADX WARN: Type inference failed for: r3v52 */
    /* JADX WARN: Type inference failed for: r3v53 */
    /* JADX WARN: Type inference failed for: r3v6, types: [X.0oO] */
    /* JADX WARN: Type inference failed for: r3v8, types: [X.0oO] */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v21, types: [java.lang.Object, X.NeM] */
    /* JADX WARN: Type inference failed for: r8v51 */
    /* JADX WARN: Type inference failed for: r8v52 */
    /* JADX WARN: Type inference failed for: r9v16, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(X.OLR r13, X.EnumC53109NeM r14, androidx.paging.PageFetcherSnapshot r15, X.InterfaceC23621Ds r16) {
        /*
            Method dump skipped, instructions count: 1430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcherSnapshot.A00(X.OLR, X.NeM, androidx.paging.PageFetcherSnapshot, X.1Ds):java.lang.Object");
    }

    public static final Object A03(EnumC53109NeM enumC53109NeM, PageFetcherSnapshot pageFetcherSnapshot, InterfaceC23621Ds interfaceC23621Ds, InterfaceC19390xP interfaceC19390xP) {
        InterfaceC19390xP A00 = AbstractC53653Nny.A00(new C57172PZq((InterfaceC23621Ds) null, new PageFetcherSnapshot$collectAsGenerationalViewportHints$$inlined$simpleFlatMapLatest$1(enumC53109NeM, pageFetcherSnapshot, null), interfaceC19390xP, 25));
        C57181PaA c57181PaA = new C57181PaA(enumC53109NeM, null);
        C14360o3.A0B(A00, 0);
        return AbstractC167017dG.A0i(interfaceC23621Ds, AbstractC011604e.A00(C05F.A00, new AnonymousClass058(new C57172PZq((InterfaceC23621Ds) null, c57181PaA, A00, 23)), -1), new MY6(0, enumC53109NeM, pageFetcherSnapshot));
    }

    private final Object A04(EnumC53109NeM enumC53109NeM, OM5 om5, int i, int i2) {
        int A05 = AbstractC25227BEk.A05(enumC53109NeM, 0);
        if (A05 != 0) {
            if (A05 != 1 && A05 != 2) {
                throw B4Z.A00();
            }
            if (i != 0 || (om5.A03.A00(enumC53109NeM) instanceof C51058MhC) || i2 >= this.A02.A02) {
                return null;
            }
            EnumC53109NeM enumC53109NeM2 = EnumC53109NeM.PREPEND;
            List list = om5.A06;
            if (enumC53109NeM == enumC53109NeM2) {
                return ((C51077MhX) AbstractC001800i.A0I(list)).A03;
            }
            return ((C51077MhX) AbstractC001800i.A0K(list)).A02;
        }
        throw AbstractC166987dD.A12("Cannot get loadId for loadType: REFRESH");
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0111, code lost:
    
        if (X.MSW.A1a(3) != true) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x01a0, code lost:
    
        if (X.AnonymousClass139.A00(r7, r9) == r6) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x027d, code lost:
    
        if (r0 == r6) goto L117;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0021. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0267 A[Catch: all -> 0x028d, TryCatch #5 {all -> 0x028d, blocks: (B:45:0x0242, B:47:0x0267, B:51:0x027a), top: B:44:0x0242 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0281 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x021f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01c6 A[Catch: all -> 0x023d, TryCatch #4 {all -> 0x023d, blocks: (B:60:0x01b0, B:62:0x01c6, B:63:0x01cd, B:65:0x01d1), top: B:59:0x01b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01d1 A[Catch: all -> 0x023d, TRY_LEAVE, TryCatch #4 {all -> 0x023d, blocks: (B:60:0x01b0, B:62:0x01c6, B:63:0x01cd, B:65:0x01d1), top: B:59:0x01b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v6, types: [X.139] */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Enum, X.139, X.NeM] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A05(androidx.paging.PageFetcherSnapshot r15, X.InterfaceC23621Ds r16) {
        /*
            Method dump skipped, instructions count: 726
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcherSnapshot.A05(androidx.paging.PageFetcherSnapshot, X.1Ds):java.lang.Object");
    }

    public static final void A07(PageFetcherSnapshot pageFetcherSnapshot, C19L c19l) {
        MCP mcp = new MCP(pageFetcherSnapshot, null, 8);
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        AbstractC23641Du.A05(anonymousClass191, mcp, c19l);
        AbstractC23641Du.A05(anonymousClass191, new MCP(pageFetcherSnapshot, null, 9), c19l);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A08(X.InterfaceC23621Ds r8) {
        /*
            r7 = this;
            r3 = 7
            boolean r0 = X.MAL.A01(r8, r3)
            if (r0 == 0) goto L31
            r6 = r8
            X.MAL r6 = (X.MAL) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L31
            int r2 = r2 - r1
            r6.A00 = r2
        L15:
            java.lang.Object r5 = r6.A04
            X.1JX r4 = X.C1JX.A02
            int r1 = r6.A00
            r3 = 0
            r0 = 1
            if (r1 == 0) goto L3c
            if (r1 != r0) goto L37
            java.lang.Object r2 = r6.A03
            X.139 r2 = (X.AnonymousClass139) r2
            java.lang.Object r1 = r6.A02
            androidx.paging.PageFetcherSnapshotState$Holder r1 = (androidx.paging.PageFetcherSnapshotState$Holder) r1
            java.lang.Object r0 = r6.A01
            androidx.paging.PageFetcherSnapshot r0 = (androidx.paging.PageFetcherSnapshot) r0
            X.AbstractC09560e7.A00(r5)
            goto L4d
        L31:
            X.MAL r6 = new X.MAL
            r6.<init>(r7, r8, r3)
            goto L15
        L37:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        L3c:
            X.AbstractC09560e7.A00(r5)
            androidx.paging.PageFetcherSnapshotState$Holder r1 = r7.A01
            X.139 r2 = r1.A01
            X.AbstractC25235BEs.A1J(r7, r1, r2, r6, r0)
            java.lang.Object r0 = X.AnonymousClass139.A00(r6, r2)
            if (r0 == r4) goto L62
            r0 = r7
        L4d:
            X.OM5 r1 = r1.A00     // Catch: java.lang.Throwable -> L5d
            X.OGn r0 = r0.A00     // Catch: java.lang.Throwable -> L5d
            X.OCf r0 = r0.A00     // Catch: java.lang.Throwable -> L5d
            X.Mhh r0 = r0.A00     // Catch: java.lang.Throwable -> L5d
            X.OLm r4 = r1.A01(r0)     // Catch: java.lang.Throwable -> L5d
            r2.A04(r3)
            return r4
        L5d:
            r0 = move-exception
            r2.A04(r3)
            throw r0
        L62:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcherSnapshot.A08(X.1Ds):java.lang.Object");
    }

    public static final Object A01(EnumC53109NeM enumC53109NeM, PageFetcherSnapshot pageFetcherSnapshot, OM5 om5, InterfaceC23621Ds interfaceC23621Ds) {
        OMK omk = om5.A03;
        O1E A00 = omk.A00(enumC53109NeM);
        C51059MhD c51059MhD = C51059MhD.A00;
        if (!C14360o3.A0K(A00, c51059MhD)) {
            omk.A02(c51059MhD, enumC53109NeM);
            Object EMz = pageFetcherSnapshot.A08.EMz(new C51060MhE(omk.A01(), null), interfaceC23621Ds);
            if (EMz == C1JX.A02) {
                return EMz;
            }
        }
        return C0eB.A00;
    }

    public static final String A06(EnumC53109NeM enumC53109NeM, AbstractC53418Nk7 abstractC53418Nk7, Object obj) {
        StringBuilder A11 = AbstractC166997dE.A11("End ");
        if (abstractC53418Nk7 == null) {
            A11.append(enumC53109NeM);
            A11.append(" with loadkey ");
            A11.append(obj);
            A11.append(". Load CANCELLED.");
        } else {
            A11.append(enumC53109NeM);
            A11.append(" with loadKey ");
            A11.append(obj);
            A11.append(". Returned ");
            A11.append(abstractC53418Nk7);
        }
        return A11.toString();
    }

    public static final Object A02(EnumC53109NeM enumC53109NeM, PageFetcherSnapshot pageFetcherSnapshot, AbstractC55021OWv abstractC55021OWv, InterfaceC23621Ds interfaceC23621Ds) {
        if (enumC53109NeM.ordinal() == 0) {
            Object A05 = A05(pageFetcherSnapshot, interfaceC23621Ds);
            if (A05 == C1JX.A02) {
                return A05;
            }
        } else if (abstractC55021OWv != null) {
            OGn oGn = pageFetcherSnapshot.A00;
            if (enumC53109NeM != EnumC53109NeM.PREPEND && enumC53109NeM != EnumC53109NeM.APPEND) {
                throw AbstractC37303Gc4.A0M(enumC53109NeM, "invalid load type for reset: ", AbstractC166987dD.A1C());
            }
            C54653OCf c54653OCf = oGn.A00;
            C30484DbT c30484DbT = new C30484DbT(9, enumC53109NeM, abstractC55021OWv);
            ReentrantLock reentrantLock = c54653OCf.A03;
            reentrantLock.lock();
            try {
                c30484DbT.invoke(c54653OCf.A02, c54653OCf.A01);
            } finally {
                reentrantLock.unlock();
            }
        } else {
            throw AbstractC166987dD.A14("Cannot retry APPEND / PREPEND load on PagingSource without ViewportHint");
        }
        return C0eB.A00;
    }
}
