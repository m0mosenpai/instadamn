package com.instagram.creation.capture.quickcapture.sundial.remix.repository;

import X.AbstractC167017dG;
import X.AbstractC37591ow;
import X.C12T;
import X.C2PZ;
import X.C2Q9;
import X.C37581ov;
import X.C48k;
import X.C53906Nsf;
import X.InterfaceC23621Ds;
import X.PUL;
import android.content.Context;
import android.os.CancellationSignal;
import com.instagram.common.session.UserSession;
import java.util.TreeMap;

/* loaded from: classes9.dex */
public final class ClipsRemixOriginalMediaRepository {
    public static final Companion A06 = new Object();
    public final Context A00;
    public final UserSession A01;
    public final C2PZ A02;
    public final C48k A03;
    public final C53906Nsf A04;
    public final C12T A05;

    /* loaded from: classes9.dex */
    public final class Companion {
        public static Object A00(C2PZ c2pz, String str, InterfaceC23621Ds interfaceC23621Ds, int i) {
            TreeMap treeMap = C37581ov.A08;
            return C2Q9.A00(new CancellationSignal(), c2pz.A01, new PUL(i, c2pz, AbstractC37591ow.A00(str, 0)), interfaceC23621Ds, false);
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x00d6, code lost:
        
            if (r2 != r4) goto L14;
         */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00c8  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0086  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object A01(X.C2PZ r15, X.InterfaceC23621Ds r16, int r17) {
            /*
                Method dump skipped, instructions count: 232
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.remix.repository.ClipsRemixOriginalMediaRepository.Companion.A01(X.2PZ, X.1Ds, int):java.lang.Object");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(java.lang.String r13, java.lang.String r14, X.InterfaceC23621Ds r15) {
        /*
            r12 = this;
            r9 = r13
            r8 = r14
            r3 = 32
            boolean r0 = X.MAL.A01(r15, r3)
            if (r0 == 0) goto L9b
            r6 = r15
            X.MAL r6 = (X.MAL) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L9b
            int r2 = r2 - r1
            r6.A00 = r2
        L18:
            java.lang.Object r0 = r6.A04
            X.1JX r11 = X.C1JX.A02
            int r1 = r6.A00
            r3 = 2
            r7 = 1
            if (r1 == 0) goto L4d
            if (r1 == r7) goto L3d
            if (r1 != r3) goto La2
            java.lang.Object r5 = r6.A01
            X.Mqv r5 = (X.C51603Mqv) r5
            X.AbstractC09560e7.A00(r0)
        L2d:
            java.lang.String r0 = r5.A02
            java.io.File r1 = X.AbstractC166987dD.A11(r0)
            X.8ZT r0 = new X.8ZT
            r0.<init>(r1)
            X.02u r11 = X.AbstractC25225BEi.A1H(r0)
        L3c:
            return r11
        L3d:
            java.lang.Object r8 = r6.A03
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r6.A02
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r7 = r6.A01
            com.instagram.creation.capture.quickcapture.sundial.remix.repository.ClipsRemixOriginalMediaRepository r7 = (com.instagram.creation.capture.quickcapture.sundial.remix.repository.ClipsRemixOriginalMediaRepository) r7
            X.AbstractC09560e7.A00(r0)
            goto L74
        L4d:
            X.AbstractC09560e7.A00(r0)
            X.2PZ r5 = r12.A02
            X.AbstractC25235BEs.A1J(r12, r13, r14, r6, r7)
            java.lang.String r1 = "SELECT * FROM clips_remix_original_media WHERE media_id = ?"
            java.util.TreeMap r0 = X.C37581ov.A08
            X.1ov r0 = X.AbstractC37591ow.A00(r1, r7)
            r0.ADp(r7, r13)
            android.os.CancellationSignal r4 = new android.os.CancellationSignal
            r4.<init>()
            X.1YP r2 = r5.A01
            X.PUL r1 = new X.PUL
            r1.<init>(r7, r5, r0)
            r0 = 0
            java.lang.Object r0 = X.C2Q9.A00(r4, r2, r1, r6, r0)
            if (r0 == r11) goto L3c
            r7 = r12
        L74:
            r5 = r0
            X.Mqv r5 = (X.C51603Mqv) r5
            if (r5 == 0) goto Lb2
            java.lang.String r1 = r5.A02
            boolean r0 = X.MSY.A1Z(r1)
            r2 = 0
            if (r0 == 0) goto La7
            X.2PZ r4 = r7.A02
            long r1 = java.lang.System.currentTimeMillis()
            X.MSW.A1Z(r5, r6)
            r6.A00 = r3
            X.1YP r3 = r4.A01
            X.PUM r0 = new X.PUM
            r0.<init>(r4, r9, r1)
            java.lang.Object r0 = X.C2Q9.A01(r3, r0, r6)
            if (r0 != r11) goto L2d
            return r11
        L9b:
            X.MAL r6 = new X.MAL
            r6.<init>(r12, r15, r3)
            goto L18
        La2:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        La7:
            java.lang.String r0 = "File deleted. File path: "
            java.lang.String r1 = X.AnonymousClass001.A0R(r0, r1)
            java.lang.String r0 = "ClipsRemixOriginalMediaRepository"
            X.AbstractC12120kG.A07(r0, r1, r2)
        Lb2:
            X.12T r0 = r7.A05
            X.19K r1 = X.AnonymousClass194.A02(r0)
            X.8hd r0 = X.C193588hd.A00
            X.02u r11 = X.C10E.A00(r0)
            r10 = 0
            X.PZ9 r6 = new X.PZ9
            r6.<init>(r7, r8, r9, r10, r11)
            X.AbstractC166987dD.A1Z(r6, r1)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.remix.repository.ClipsRemixOriginalMediaRepository.A00(java.lang.String, java.lang.String, X.1Ds):java.lang.Object");
    }

    public ClipsRemixOriginalMediaRepository(Context context, UserSession userSession, C53906Nsf c53906Nsf, C2PZ c2pz, C48k c48k, C12T c12t) {
        AbstractC167017dG.A1Q(context, c2pz);
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = c2pz;
        this.A04 = c53906Nsf;
        this.A05 = c12t;
        this.A03 = c48k;
    }
}
