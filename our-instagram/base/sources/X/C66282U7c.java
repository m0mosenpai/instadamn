package X;

import com.facebook.quicklog.reliability.CancelReason;
import java.util.List;

/* renamed from: X.U7c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66282U7c implements XE9 {
    public final W54 A00;
    public final /* synthetic */ C70193WFw A01;

    public C66282U7c(W54 w54, C70193WFw c70193WFw) {
        this.A01 = c70193WFw;
        this.A00 = w54;
    }

    @Override // X.XE9
    public final /* bridge */ /* synthetic */ void D22(Object obj) {
        Exception exc = (Exception) obj;
        C14360o3.A0B(exc, 0);
        W54 w54 = this.A00;
        W54.A00(w54, null, "media_upload_cancel", null, w54.A02.now() - w54.A00);
        Long l = w54.A01;
        if (l != null) {
            long longValue = l.longValue();
            C68920VeK c68920VeK = w54.A03;
            if (c68920VeK != null) {
                c68920VeK.A01.flowEndCancel(longValue, CancelReason.USER_CANCELLED);
            }
        }
        C70193WFw c70193WFw = this.A01;
        synchronized (c70193WFw) {
            c70193WFw.A0M.D22(exc);
            c70193WFw.A0L.D1j(exc);
            c70193WFw.A0J.A00.set(null);
            C70193WFw.A01(c70193WFw);
        }
        OJE oje = c70193WFw.A0H.A0K;
        if (oje != null) {
            oje.A00("Cancelled upload");
        }
    }

    @Override // X.XE9
    public final /* bridge */ /* synthetic */ void DG3(Object obj) {
        Exception exc = (Exception) obj;
        C14360o3.A0B(exc, 0);
        this.A00.A02(exc);
        C70193WFw c70193WFw = this.A01;
        synchronized (c70193WFw) {
            List list = c70193WFw.A0O;
            int indexOf = list.indexOf(c70193WFw.A05) + 1;
            if (indexOf < list.size()) {
                c70193WFw.A05 = (XEJ) list.get(indexOf);
                c70193WFw.A00 = indexOf;
                C70193WFw.A03(c70193WFw);
                XEJ xej = c70193WFw.A05;
                if (xej != null) {
                    xej.FD9();
                } else {
                    throw AbstractC166997dE.A0g();
                }
            } else {
                C70193WFw.A04(c70193WFw, exc);
            }
        }
        OJE oje = c70193WFw.A0H.A0K;
        if (oje != null) {
            oje.A00("Failed upload");
        }
    }

    @Override // X.XE9
    public final void Dbk(float f) {
        C70193WFw c70193WFw = this.A01;
        synchronized (c70193WFw) {
            c70193WFw.A0M.Dbk(f);
        }
    }

    @Override // X.XE9
    public final void onStart() {
        this.A00.A01();
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x0188, code lost:
    
        if ("".equals(r10) != false) goto L69;
     */
    @Override // X.XE9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66282U7c.onSuccess(java.lang.Object):void");
    }
}
