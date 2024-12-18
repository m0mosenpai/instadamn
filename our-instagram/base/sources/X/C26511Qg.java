package X;

import com.google.common.base.Strings;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.1Qg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C26511Qg {
    public IOException A01;
    public String A02;
    public final InterfaceC26491Qe A04;
    public final C1QY A05;
    public EnumC26521Qh A00 = EnumC26521Qh.Init;
    public final ArrayList A03 = new ArrayList();

    public final void A00(C3JQ c3jq, C1QW c1qw) {
        EnumC26521Qh enumC26521Qh = this.A00;
        boolean z = false;
        if (enumC26521Qh == EnumC26521Qh.Init) {
            z = true;
        }
        C18C.A0B(enumC26521Qh, "Invalid State %s with response %s", z);
        this.A00 = EnumC26521Qh.HeaderReceived;
        ArrayList arrayList = this.A03;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((C19O) arrayList.get(size)).onResponseStarted(c1qw, this.A05, c3jq);
        }
        InterfaceC26491Qe interfaceC26491Qe = this.A04;
        if (interfaceC26491Qe != null) {
            interfaceC26491Qe.onResponseStarted(c3jq);
        }
    }

    public final void A01(C19O c19o) {
        if (c19o != null) {
            ArrayList arrayList = this.A03;
            if (!arrayList.contains(c19o)) {
                arrayList.add(c19o);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Interceptor ");
            sb.append(c19o);
            sb.append(" is already registered.");
            throw new IllegalStateException(sb.toString());
        }
        throw new IllegalArgumentException("The interceptor is null.");
    }

    public final void A02(C1QW c1qw) {
        Iterator it = this.A03.iterator();
        while (it.hasNext()) {
            ((C19O) it.next()).onRequestUploadAttemptStart(c1qw);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r2 == X.EnumC26521Qh.ReceivingData) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A03(X.C1QW r6) {
        /*
            r5 = this;
            X.1Qh r2 = r5.A00
            X.1Qh r0 = X.EnumC26521Qh.HeaderReceived
            r4 = 1
            if (r2 == r0) goto Lc
            X.1Qh r0 = X.EnumC26521Qh.ReceivingData
            r1 = 0
            if (r2 != r0) goto Ld
        Lc:
            r1 = 1
        Ld:
            java.lang.String r0 = "Invalid State %s"
            X.C18C.A0B(r2, r0, r1)
            X.1Qh r0 = X.EnumC26521Qh.Succeeded
            r5.A00 = r0
            java.util.ArrayList r3 = r5.A03
            int r1 = r3.size()
            int r1 = r1 - r4
        L1d:
            if (r1 < 0) goto L2b
            java.lang.Object r0 = r3.get(r1)
            X.19O r0 = (X.C19O) r0
            r0.onSucceeded(r6)
            int r1 = r1 + (-1)
            goto L1d
        L2b:
            X.1Qe r0 = r5.A04
            if (r0 == 0) goto L32
            r0.onComplete()
        L32:
            int r2 = r3.size()
            int r2 = r2 - r4
        L37:
            if (r2 < 0) goto L47
            java.lang.Object r1 = r3.get(r2)
            X.19O r1 = (X.C19O) r1
            X.1QY r0 = r5.A05
            r1.onRequestCallbackDone(r6, r0)
            int r2 = r2 + (-1)
            goto L37
        L47:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26511Qg.A03(X.1QW):void");
    }

    public final void A04(C1QW c1qw, IOException iOException) {
        IOException iOException2;
        EnumC26521Qh enumC26521Qh = this.A00;
        EnumC26521Qh enumC26521Qh2 = EnumC26521Qh.Failed;
        boolean z = false;
        if (enumC26521Qh == enumC26521Qh2 && this.A02 != null && (iOException2 = this.A01) != null) {
            C18C.A0J(false, "Invalid State %s with exception %s, prev exception %s, request %s, prev trace %s", enumC26521Qh, iOException, iOException2, c1qw.A09.toString(), this.A02);
            throw C00O.createAndThrow();
        }
        if (enumC26521Qh == EnumC26521Qh.Init || enumC26521Qh == EnumC26521Qh.HeaderReceived || enumC26521Qh == EnumC26521Qh.ReceivingData) {
            z = true;
        }
        if (z) {
            this.A00 = enumC26521Qh2;
            this.A01 = iOException;
            this.A02 = android.util.Log.getStackTraceString(iOException);
            ArrayList arrayList = this.A03;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((C19O) arrayList.get(size)).onFailed(c1qw, iOException);
            }
            InterfaceC26491Qe interfaceC26491Qe = this.A04;
            if (interfaceC26491Qe != null) {
                interfaceC26491Qe.onFailed(iOException);
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                ((C19O) arrayList.get(size2)).onRequestCallbackDone(c1qw, this.A05);
            }
            return;
        }
        throw new IllegalStateException(Strings.A00("Invalid State %s with exception %s", enumC26521Qh, iOException));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r2 == X.EnumC26521Qh.ReceivingData) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A05(X.C1QW r6, java.nio.ByteBuffer r7) {
        /*
            r5 = this;
            X.1Qh r2 = r5.A00
            X.1Qh r0 = X.EnumC26521Qh.HeaderReceived
            r4 = 1
            if (r2 == r0) goto Lc
            X.1Qh r0 = X.EnumC26521Qh.ReceivingData
            r1 = 0
            if (r2 != r0) goto Ld
        Lc:
            r1 = 1
        Ld:
            java.lang.String r0 = "Invalid State %s"
            X.C18C.A0B(r2, r0, r1)
            X.1Qh r0 = X.EnumC26521Qh.ReceivingData
            r5.A00 = r0
            java.util.ArrayList r3 = r5.A03
            int r2 = r3.size()
            int r2 = r2 - r4
        L1d:
            if (r2 < 0) goto L2d
            java.lang.Object r1 = r3.get(r2)
            X.19O r1 = (X.C19O) r1
            X.1QY r0 = r5.A05
            r1.onNewData(r6, r0, r7)
            int r2 = r2 + (-1)
            goto L1d
        L2d:
            X.1Qe r0 = r5.A04
            if (r0 == 0) goto L34
            r0.onNewData(r7)
        L34:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26511Qg.A05(X.1QW, java.nio.ByteBuffer):void");
    }

    public C26511Qg(InterfaceC26491Qe interfaceC26491Qe, C1QY c1qy) {
        this.A05 = c1qy;
        this.A04 = interfaceC26491Qe;
    }
}
