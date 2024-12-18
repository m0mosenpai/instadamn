package X;

import com.facebook.browser.lite.extensions.autofill.model.AutofillSettings;
import com.facebook.browser.lite.pixelrequestbuffer.igpixelrequestbuffer.IGPixelRequestBuffer;
import com.instagram.common.session.UserSession;

/* renamed from: X.RbH, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60902RbH extends C1P1 {
    public final int A00;
    public final Object A01;

    public C60902RbH(UserSession userSession, int i) {
        this.A00 = i;
        this.A01 = userSession;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03;
        int i;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(551161975);
                ((IGPixelRequestBuffer) this.A01).mResponse = AbstractC61741Rsw.A00("Not Found", abstractC115105If.toString(), 404);
                i = 1845049417;
                break;
            case 1:
                A03 = C0f9.A03(1679314668);
                i = -129999981;
                break;
            case 2:
                A03 = C0f9.A03(1616280986);
                i = 362097144;
                break;
            case 3:
                A03 = C0f9.A03(-886213665);
                ((SF1) this.A01).A00.A0A(new AutofillSettings("CONTROL", "CONTROL", 0, 0, 15, false, false, false, true));
                i = -2036623666;
                break;
            case 4:
                A03 = AbstractC167017dG.A0N(abstractC115105If, 96466836);
                Throwable A01 = abstractC115105If.A01();
                if (A01 != null) {
                    A01.getMessage();
                }
                i = 285681291;
                break;
            case 5:
                A03 = C0f9.A03(-236470850);
                i = 1595282256;
                break;
            case 6:
                A03 = AbstractC167017dG.A0N(abstractC115105If, 58167610);
                super.onFail(abstractC115105If);
                i = -278486241;
                break;
            default:
                A03 = AbstractC167017dG.A0N(abstractC115105If, -1278010133);
                super.onFail(abstractC115105If);
                SXD sxd = (SXD) this.A01;
                sxd.A01.post(new RunnableC64612TLy(sxd));
                i = -1055505646;
                break;
        }
        C0f9.A0A(i, A03);
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x01d0, code lost:
    
        if (r7 != null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01d5, code lost:
    
        r0 = r4.A02("autofill_qrt_experiment_versions", X.QHX.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01dd, code lost:
    
        if (r0 == null) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01df, code lost:
    
        r10 = X.AbstractC62278S4x.A00(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01e3, code lost:
    
        ((X.SF1) r15.A01).A00.A0A(new com.facebook.browser.lite.extensions.autofill.model.AutofillSettings(r6, r7, r8, r9, r10, r11, r12, r13, r14));
        X.C0f9.A0A(840327906, r1);
        r0 = 1131219648;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01fc, code lost:
    
        r10 = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01d3, code lost:
    
        if (r4 != null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01bf, code lost:
    
        if (r4 == null) goto L70;
     */
    @Override // X.C1P1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r16) {
        /*
            Method dump skipped, instructions count: 864
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60902RbH.onSuccess(java.lang.Object):void");
    }

    public C60902RbH(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
