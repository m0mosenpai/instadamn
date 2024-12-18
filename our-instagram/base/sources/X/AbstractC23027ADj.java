package X;

import android.content.Context;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.ADj, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC23027ADj {
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        if (r3 == null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        r21 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009f, code lost:
    
        if (r3 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a1, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a1 A[EDGE_INSN: B:38:0x00a1->B:31:0x00a1 BREAK  A[LOOP:1: B:21:0x0085->B:36:0x0085], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C195868lW A01(X.C84B r21, X.C49602Pt r22) {
        /*
            r15 = 0
            r4 = r21
            r7 = r22
            boolean r2 = X.AbstractC167007dF.A1R(r15, r4, r7)
            long r16 = java.lang.System.currentTimeMillis()
            java.util.ArrayList r8 = r4.A05()
            java.util.Iterator r5 = r8.iterator()
        L15:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L32
            java.lang.Object r3 = r5.next()
            r1 = r3
            X.5Ki r1 = (X.AbstractC115485Ki) r1
            boolean r0 = r1 instanceof X.C115475Kh
            if (r0 == 0) goto L15
            X.5Kh r1 = (X.C115475Kh) r1
            X.5Km r0 = r1.A0G
            int r0 = r0.A08
            if (r0 != 0) goto L15
            r21 = 0
            if (r3 != 0) goto L34
        L32:
            r21 = 1
        L34:
            java.util.List r0 = r4.A01
            int r0 = r0.size()
            if (r0 != r2) goto La7
            X.5Kj r1 = r4.A04(r15)
            boolean r0 = r1 instanceof X.C115475Kh
            if (r0 == 0) goto La7
            X.5Kh r1 = (X.C115475Kh) r1
            if (r1 == 0) goto La7
            X.5Km r0 = r1.A0G
            int r3 = r0.A09
            int r1 = r0.A05
        L4e:
            r12 = 0
            java.lang.String r6 = "virtual_stitched_video"
            java.lang.String r5 = ".mp4"
            java.io.File r0 = r7.C5c()
            java.io.File r10 = java.io.File.createTempFile(r6, r5, r0)
            X.C14360o3.A07(r10)
            int r0 = r4.hashCode()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)
            r13 = 1080(0x438, float:1.513E-42)
            r14 = 1920(0x780, float:2.69E-42)
            X.8lW r9 = new X.8lW
            r18 = r16
            r20 = r15
            r22 = r2
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r18, r20, r21, r22)
            r9.A0B = r3
            r9.A0A = r1
            int r0 = r4.A00
            r9.A07 = r0
            r9.A0H = r15
            r9.A06 = r0
            java.util.Iterator r4 = r8.iterator()
        L85:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto La1
            java.lang.Object r3 = r4.next()
            r1 = r3
            X.5Ki r1 = (X.AbstractC115485Ki) r1
            boolean r0 = r1 instanceof X.C115475Kh
            if (r0 == 0) goto L85
            X.5Kh r1 = (X.C115475Kh) r1
            X.5Km r0 = r1.A0G
            boolean r0 = r0.A0K
            if (r0 == 0) goto L85
            r0 = 1
            if (r3 != 0) goto La2
        La1:
            r0 = 0
        La2:
            r9.A1L = r0
            r9.A19 = r2
            return r9
        La7:
            r3 = 0
            r1 = 0
            goto L4e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC23027ADj.A01(X.84B, X.2Pt):X.8lW");
    }

    public static final MediaComposition A00(Context context, C190168ba c190168ba, UserSession userSession, C84B c84b, C47v c47v, List list, List list2, float f) {
        ImmutableList of;
        ArrayList A05 = c84b.A05();
        C06090Tz c06090Tz = C06090Tz.A05;
        boolean A06 = C18U.A06(c06090Tz, userSession, 36316233410285758L);
        ImmutableList A02 = AbstractC115515Kl.A02(A05, true);
        if (c47v != null) {
            of = AbstractC23119AKd.A02(c47v);
        } else {
            of = ImmutableList.of();
            C14360o3.A07(of);
        }
        ImmutableList A00 = AbstractC115515Kl.A00(C198548q3.A00(context, A06), new C199518rz(false), A05);
        C14360o3.A0B(A02, 1);
        B9T b9t = B9T.A00;
        C198548q3 A002 = C198548q3.A00(context, true);
        C199518rz c199518rz = new C199518rz(false);
        boolean A062 = C18U.A06(c06090Tz, userSession, 36327469044742745L);
        C14360o3.A0B(b9t, 2);
        return new MediaComposition(AbstractC23120AKe.A00(A002, c199518rz, of, A02, A00, c190168ba, list, list2, b9t, f, 0.5625f, 0, true, A062));
    }
}
