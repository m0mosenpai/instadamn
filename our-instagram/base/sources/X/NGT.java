package X;

import android.content.Context;

/* loaded from: classes9.dex */
public final class NGT extends AbstractRunnableC14200nk {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ OD6 A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NGT(Context context, OD6 od6) {
        super(470, 3, false, false);
        this.A01 = od6;
        this.A00 = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0088, code lost:
    
        if (r5.equals(".jpg") == false) goto L25;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r19 = this;
            r3 = r19
            X.OD6 r2 = r3.A01
            java.util.ArrayList r0 = r2.A03
            java.util.Iterator r7 = r0.iterator()
        La:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto Laf
            java.lang.String r0 = X.AbstractC166987dD.A1B(r7)
            if (r0 == 0) goto La
            r9 = 0
            android.net.Uri r4 = X.AbstractC25227BEk.A0B(r0)
            X.OMr r1 = new X.OMr     // Catch: java.lang.IllegalArgumentException -> L9f java.io.IOException -> La5
            r1.<init>()     // Catch: java.lang.IllegalArgumentException -> L9f java.io.IOException -> La5
            android.content.Context r0 = r3.A00     // Catch: java.lang.IllegalArgumentException -> L9f java.io.IOException -> La5
            r1.A02(r0, r4, r9, r9)     // Catch: java.lang.IllegalArgumentException -> L9f java.io.IOException -> La5
            X.Ndz r0 = r1.A00()     // Catch: java.lang.IllegalArgumentException -> L9f java.io.IOException -> La5
            java.lang.String r10 = r0.getCanonicalPath()     // Catch: java.lang.IllegalArgumentException -> L9f java.io.IOException -> La5
            r0 = 0
            X.2q2 r4 = new X.2q2     // Catch: java.lang.IllegalArgumentException -> L9f java.io.IOException -> La5
            r4.<init>(r10)     // Catch: java.lang.IllegalArgumentException -> L9f java.io.IOException -> La5
            int r13 = X.C197098ne.A00(r4)     // Catch: java.lang.IllegalArgumentException -> L9f java.io.IOException -> La5
            long r17 = X.C197098ne.A02(r4)     // Catch: java.lang.IllegalArgumentException -> L9f java.io.IOException -> La5
            X.C14360o3.A0A(r10)     // Catch: java.lang.IllegalArgumentException -> L9f java.io.IOException -> La5
            r11 = 0
            int r4 = X.AbstractC50522MSa.A0A(r10)     // Catch: java.lang.IllegalArgumentException -> L9f java.io.IOException -> La5
            java.lang.String r5 = X.AbstractC43592JPx.A0z(r10, r4)     // Catch: java.lang.IllegalArgumentException -> L9f java.io.IOException -> La5
            int r6 = r5.hashCode()     // Catch: java.lang.IllegalArgumentException -> L9f java.io.IOException -> La5
            r4 = 1475827(0x1684f3, float:2.068074E-39)
            if (r6 == r4) goto L82
            r4 = 1478659(0x169003, float:2.072043E-39)
            if (r6 == r4) goto L64
            r4 = 3268712(0x31e068, float:4.580441E-39)
            if (r6 != r4) goto L8a
            java.lang.String r4 = "jpeg"
            boolean r4 = r5.equals(r4)     // Catch: java.lang.IllegalArgumentException -> L9f java.io.IOException -> La5
            if (r4 == 0) goto L8a
            goto L8c
        L64:
            java.lang.String r4 = ".mp4"
            boolean r4 = r5.equals(r4)     // Catch: java.lang.IllegalArgumentException -> L9f java.io.IOException -> La5
            if (r4 == 0) goto L8a
            android.media.MediaMetadataRetriever r5 = new android.media.MediaMetadataRetriever     // Catch: java.lang.IllegalArgumentException -> L9f java.io.IOException -> La5
            r5.<init>()     // Catch: java.lang.IllegalArgumentException -> L9f java.io.IOException -> La5
            r5.setDataSource(r10)     // Catch: java.lang.IllegalArgumentException -> L9f java.io.IOException -> La5
            r4 = 9
            java.lang.String r4 = r5.extractMetadata(r4)     // Catch: java.lang.IllegalArgumentException -> L9f java.io.IOException -> La5
            if (r4 == 0) goto L80
            long r0 = java.lang.Long.parseLong(r4)     // Catch: java.lang.IllegalArgumentException -> L9f java.io.IOException -> La5
        L80:
            r12 = 3
            goto L8d
        L82:
            java.lang.String r4 = ".jpg"
            boolean r4 = r5.equals(r4)     // Catch: java.lang.IllegalArgumentException -> L9f java.io.IOException -> La5
            if (r4 != 0) goto L8c
        L8a:
            r12 = 0
            goto L8d
        L8c:
            r12 = 1
        L8d:
            int r14 = (int) r0     // Catch: java.lang.IllegalArgumentException -> L9f java.io.IOException -> La5
            long r15 = X.AbstractC31177DnL.A06()     // Catch: java.lang.IllegalArgumentException -> L9f java.io.IOException -> La5
            com.instagram.common.gallery.Medium r8 = new com.instagram.common.gallery.Medium     // Catch: java.lang.IllegalArgumentException -> L9f java.io.IOException -> La5
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r17)     // Catch: java.lang.IllegalArgumentException -> L9f java.io.IOException -> La5
            com.instagram.common.gallery.metadata.MediaUploadMetadata r1 = r8.A0G     // Catch: java.lang.IllegalArgumentException -> L9f java.io.IOException -> La5
            java.lang.String r0 = r2.A02     // Catch: java.lang.IllegalArgumentException -> L9f java.io.IOException -> La5
            r1.A03 = r0     // Catch: java.lang.IllegalArgumentException -> L9f java.io.IOException -> La5
            goto La
        L9f:
            r4 = move-exception
            java.lang.String r1 = "StellaRequestHandler"
            java.lang.String r0 = "cannot retrieve media info based on uri"
            goto Laa
        La5:
            r4 = move-exception
            java.lang.String r1 = "StellaRequestHandler"
            java.lang.String r0 = "cannot create medium object based on uri"
        Laa:
            X.C0K8.A0F(r1, r0, r4)
            goto La
        Laf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NGT.run():void");
    }
}
