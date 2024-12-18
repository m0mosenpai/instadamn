package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* renamed from: X.OsT, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55937OsT implements InterfaceC26491Qe {
    public long A00;
    public long A01;
    public ByteArrayOutputStream A02;
    public FileOutputStream A03;
    public boolean A04;
    public final Context A05;
    public final AbstractC10360h2 A06;
    public final UserSession A07;
    public final C54798OJr A08;
    public final File A09;
    public final boolean A0A;
    public final boolean A0B;
    public final InterfaceC60442pS A0C;
    public final C75113Zb A0D;
    public final boolean A0E;
    public final boolean A0F;

    @Override // X.InterfaceC26491Qe
    public final void onFailed(IOException iOException) {
        this.A04 = true;
        boolean z = this.A0A;
        if (z) {
            try {
                FileOutputStream fileOutputStream = this.A03;
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                MSZ.A1N(this.A09);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        C54798OJr c54798OJr = this.A08;
        c54798OJr.A06.set(false);
        Iterator it = c54798OJr.A09.iterator();
        if (it.hasNext()) {
            it.next();
            throw AbstractC166987dD.A15("onDownloadingProgressChanged");
        }
        if (z) {
            AbstractC63248Sg4.A01(this.A06);
            AbstractC167007dF.A0J().post(new PP4(this));
        }
    }

    @Override // X.InterfaceC26491Qe
    public final void onNewData(ByteBuffer byteBuffer) {
        C14360o3.A0B(byteBuffer, 0);
        boolean z = this.A0A;
        if (z && this.A04) {
            return;
        }
        int remaining = byteBuffer.remaining();
        long j = this.A01 + remaining;
        this.A01 = j;
        long j2 = this.A00;
        if (j2 > 0) {
            this.A08.A00(j / j2);
        }
        int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
        if (z) {
            try {
                FileOutputStream fileOutputStream = this.A03;
                if (fileOutputStream == null) {
                    return;
                }
                fileOutputStream.write(byteBuffer.array(), arrayOffset, remaining);
                return;
            } catch (IOException e) {
                onFailed(e);
                e.printStackTrace();
                return;
            }
        }
        ByteArrayOutputStream byteArrayOutputStream = this.A02;
        if (byteArrayOutputStream == null) {
            return;
        }
        byteArrayOutputStream.write(byteBuffer.array(), arrayOffset, remaining);
    }

    @Override // X.InterfaceC26491Qe
    public final void onResponseStarted(C3JQ c3jq) {
        C14360o3.A0B(c3jq, 0);
        C23781El A00 = c3jq.A00("Content-Length");
        if (A00 != null) {
            try {
                String str = A00.A01;
                C14360o3.A06(str);
                this.A00 = Long.parseLong(str);
            } catch (NumberFormatException e) {
                C0K8.A0C("DownloadingMediaProgressCallback", e.getMessage());
            }
        }
        C54798OJr c54798OJr = this.A08;
        c54798OJr.A00(0.0d);
        c54798OJr.A06.set(true);
        Iterator it = c54798OJr.A09.iterator();
        if (it.hasNext()) {
            it.next();
            throw AbstractC166987dD.A15("onDownloadingProgressChanged");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0207, code lost:
    
        if (X.C18U.A06(r6, r4, 36326232094291720L) == false) goto L104;
     */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d4  */
    @Override // X.InterfaceC26491Qe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onComplete() {
        /*
            Method dump skipped, instructions count: 1338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55937OsT.onComplete():void");
    }

    public C55937OsT(Context context, AbstractC10360h2 abstractC10360h2, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C75113Zb c75113Zb, C54798OJr c54798OJr, File file, boolean z, boolean z2) {
        AbstractC167017dG.A1P(context, userSession);
        AbstractC167017dG.A1T(abstractC10360h2, interfaceC60442pS);
        C06090Tz A0j = AbstractC25225BEi.A0j(file, 9);
        boolean A06 = C18U.A06(A0j, userSession, 36323521970056511L);
        boolean A062 = C18U.A06(A0j, userSession, 36325695223248146L);
        this.A08 = c54798OJr;
        this.A09 = file;
        this.A0A = A06;
        this.A0B = A062;
        if (A06) {
            try {
                this.A03 = MSW.A0x(file);
            } catch (IOException e) {
                onFailed(e);
            }
        } else {
            this.A02 = new ByteArrayOutputStream();
        }
        this.A05 = context;
        this.A07 = userSession;
        this.A0E = z;
        this.A0F = z2;
        this.A06 = abstractC10360h2;
        this.A0C = interfaceC60442pS;
        this.A0D = c75113Zb;
    }
}
