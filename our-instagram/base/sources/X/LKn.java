package X;

import com.facebook.msys.mca.MailboxFutureImpl;
import com.instagram.common.session.UserSession;
import com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes8.dex */
public final class LKn {
    public static final InterfaceC09390do A05 = AbstractC09440dt.A00(EnumC09460dv.A03, MF9.A00);
    public EnumC46172KcA A00;
    public final UserSession A01;
    public final C48517LdF A02;
    public final Map A03;
    public final ConcurrentHashMap A04;

    public LKn(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        LJJ ljj = C48517LdF.A08;
        this.A02 = LJJ.A01(userSession);
        this.A00 = EnumC46172KcA.A07;
        this.A03 = Collections.synchronizedMap(new M9t(1));
        this.A04 = new ConcurrentHashMap();
        if (AbstractC94034Kn.A00(userSession)) {
            AbstractC46742Klz.A00(userSession, C05F.A1F).A06(new C30190DRv(this, 16));
        }
    }

    public static final void A00(MPZ mpz, LKn lKn, String str) {
        CommonMediaTransport A03 = LLT.A03(str);
        if (A03 == null) {
            C0K8.A0C("ArmadilloExpressMediaStore", AnonymousClass001.A0R("Invalid uri to fetch: ", str));
            mpz.DEI("Invalid uri to fetch", 20002, "ArmadilloExpressMediaStore");
            return;
        }
        C53086Ndz A00 = C48517LdF.A00(lKn.A02, LJJ.A02(A03));
        if (A00.exists()) {
            mpz.DqE(AbstractC166987dD.A19(android.net.Uri.fromFile(A00)), true);
        } else {
            lKn.A02(A03, str, new C50365MLr(mpz, lKn, A03, str, 34));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x009c, code lost:
    
        if ((r16 / 1000000) <= (r14 - (r12 * com.instagram.debug.devoptions.sandboxselector.SandboxRepository.CACHE_TTL))) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A02(com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport r27, java.lang.String r28, X.InterfaceC16660sJ r29) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LKn.A02(com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport, java.lang.String, X.0sJ):void");
    }

    public final void A04(MPZ mpz, String str) {
        C14360o3.A0B(str, 0);
        if (C11T.A08()) {
            C14120nc.A00().ATO(new KMC(mpz, this, str));
        } else {
            A00(mpz, this, str);
        }
    }

    public final void A06(List list) {
        C14360o3.A0B(list, 0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A01(this, AbstractC166987dD.A1B(it), true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a1, code lost:
    
        if ((r16 + r17) > r1) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C44991Jvh A03(java.lang.String r14, java.util.List r15, int r16, int r17) {
        /*
            r13 = this;
            r12 = r17
            r0 = 0
            X.C14360o3.A0B(r14, r0)
            com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport r7 = X.LLT.A03(r14)
            r6 = 0
            java.lang.String r1 = "ArmadilloExpressMediaStore"
            if (r7 != 0) goto L23
            java.lang.StringBuilder r2 = X.AbstractC166987dD.A1C()
            java.lang.String r0 = "Invalid uri to stream: "
            r2.append(r0)
            r2.append(r14)
        L1b:
            java.lang.String r0 = r2.toString()
        L1f:
            X.C0K8.A0C(r1, r0)
            return r6
        L23:
            int r0 = r7.bitField0_
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L64
            java.lang.String r0 = r7.mimetype_
        L2b:
            java.lang.Integer r8 = X.LLT.A04(r0)
            java.lang.Integer r0 = X.C05F.A0N
            if (r8 == r0) goto L66
            java.lang.Integer r0 = X.C05F.A01
            if (r8 == r0) goto L66
            java.lang.Integer r0 = X.C05F.A0C
            if (r8 == r0) goto L66
            java.lang.Integer r0 = X.C05F.A00
            if (r8 == r0) goto L66
            java.lang.StringBuilder r2 = X.AbstractC166987dD.A1C()
            java.lang.String r0 = "Trying to stream non-streamable mediaType: "
            r2.append(r0)
            int r0 = r8.intValue()
            switch(r0) {
                case 0: goto L55;
                case 1: goto L58;
                case 2: goto L5b;
                case 3: goto L5e;
                case 4: goto L61;
                default: goto L4f;
            }
        L4f:
            java.lang.String r0 = "MEMMediaTypeSticker"
        L51:
            r2.append(r0)
            goto L1b
        L55:
            java.lang.String r0 = "MEMMediaTypeImage"
            goto L51
        L58:
            java.lang.String r0 = "MEMMediaTypePTT"
            goto L51
        L5b:
            java.lang.String r0 = "MEMMediaTypeAudio"
            goto L51
        L5e:
            java.lang.String r0 = "MEMMediaTypeVideo"
            goto L51
        L61:
            java.lang.String r0 = "MEMMediaTypeGIF"
            goto L51
        L64:
            r0 = 0
            goto L2b
        L66:
            int r0 = r7.bitField0_
            r0 = r0 & 64
            if (r0 == 0) goto Lae
            java.lang.String r9 = r7.sidecar_
            if (r9 == 0) goto Lae
            r5 = r13
            X.LdF r1 = r13.A02
            java.lang.String r0 = "dummy.tmp"
            X.Ndz r0 = X.C48517LdF.A00(r1, r0)
            android.net.Uri r4 = android.net.Uri.fromFile(r0)
            int r3 = r7.fileLength_
            X.0do r0 = X.LKn.A05
            java.lang.Object r0 = r0.getValue()
            X.1O3 r0 = (X.C1O3) r0
            X.Jvh r6 = new X.Jvh
            r6.<init>(r0, r3)
            java.lang.Integer r0 = X.C05F.A00
            r11 = r16
            if (r8 == r0) goto La4
            r0 = -1
            if (r12 == r0) goto La3
            r2 = 65536(0x10000, float:9.1835E-41)
            int r0 = r3 % r2
            int r1 = r3 - r0
            if (r0 != 0) goto L9f
            int r1 = r3 - r2
        L9f:
            int r0 = r16 + r17
            if (r0 <= r1) goto La4
        La3:
            r12 = 0
        La4:
            X.MIf r3 = new X.MIf
            r10 = r15
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.A02(r7, r14, r3)
            return r6
        Lae:
            java.lang.String r0 = "No sidecar for streaming"
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LKn.A03(java.lang.String, java.util.List, int, int):X.Jvh");
    }

    public final void A05(String str) {
        UserSession userSession = this.A01;
        K3X k3x = ((C47395Kwk) AbstractC43593JPy.A0b(userSession).A01(C47395Kwk.class, MHJ.A00(userSession, 7))).A00;
        LV9 lv9 = LV9.A00;
        InterfaceExecutorC135866Co A0H = AbstractC43593JPy.A0H(k3x);
        MailboxFutureImpl A0I = AbstractC43593JPy.A0I(A0H, lv9);
        AbstractC25231BEo.A1C(A0H, new LUF(k3x, A0I, str, 5), A0I);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002f, code lost:
    
        if (X.AbstractC002300n.A0h(r2, org.webrtc.MediaStreamTrack.VIDEO_TRACK_KIND, true) != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.LKn r5, java.lang.String r6, boolean r7) {
        /*
            com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport r4 = X.LLT.A03(r6)
            if (r4 != 0) goto L12
            java.lang.String r0 = "Invalid uri to delete: "
            java.lang.String r1 = X.AnonymousClass001.A0R(r0, r6)
            java.lang.String r0 = "ArmadilloExpressMediaStore"
            X.C0K8.A0C(r0, r1)
        L11:
            return
        L12:
            X.LdF r3 = r5.A02
            monitor-enter(r3)
            if (r7 != 0) goto L1c
            boolean r0 = r3.A01     // Catch: java.lang.Throwable -> L55
            if (r0 != 0) goto L1c
            goto L53
        L1c:
            monitor-exit(r3)
            int r0 = r4.bitField0_
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L31
            java.lang.String r2 = r4.mimetype_
            X.C14360o3.A07(r2)
            java.lang.String r1 = "video"
            r0 = 1
            boolean r0 = X.AbstractC002300n.A0h(r2, r1, r0)
            if (r0 == 0) goto L41
        L31:
            X.2QE r1 = r3.A02()
            java.lang.String r0 = r4.fileSha256_
            X.C14360o3.A07(r0)
            java.lang.String r0 = X.AbstractC62268S4n.A00(r0)
            r1.EGD(r0)
        L41:
            java.lang.String r0 = X.LJJ.A02(r4)
            X.Ndz r1 = X.C48517LdF.A00(r3, r0)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L11
            r1.delete()
            return
        L53:
            monitor-exit(r3)
            return
        L55:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LKn.A01(X.LKn, java.lang.String, boolean):void");
    }
}
