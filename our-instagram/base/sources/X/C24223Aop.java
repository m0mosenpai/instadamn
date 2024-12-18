package X;

import android.os.Bundle;
import java.util.List;

/* renamed from: X.Aop, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24223Aop implements BE4 {
    public int A00;
    public Integer A01;
    public Integer A02;
    public String A03;
    public boolean A04;
    public String[] A06 = new String[0];
    public String[] A05 = new String[0];

    @Override // X.BE4
    public final void CO6(AnonymousClass904 anonymousClass904) {
        AnonymousClass910 anonymousClass910;
        int i;
        String[] strArr;
        String[] strArr2;
        String str;
        Integer num;
        Integer num2;
        if (anonymousClass904 != null) {
            anonymousClass910 = anonymousClass904.A01;
        } else {
            anonymousClass910 = null;
        }
        boolean z = false;
        if (anonymousClass910 != null && (num2 = anonymousClass910.A01) != null) {
            i = AbstractC200588u1.A00(num2);
        } else {
            i = 0;
        }
        this.A00 = i;
        if (anonymousClass910 == null || (strArr = anonymousClass910.A06) == null) {
            strArr = new String[0];
        }
        this.A06 = strArr;
        if (anonymousClass910 != null) {
            strArr2 = anonymousClass910.A05;
        } else {
            strArr2 = new String[0];
        }
        this.A05 = strArr2;
        if (anonymousClass910 != null) {
            str = anonymousClass910.A04;
        } else {
            str = null;
        }
        this.A03 = str;
        if (anonymousClass910 != null) {
            z = anonymousClass910.A07;
        }
        this.A04 = z;
        if (anonymousClass910 != null) {
            num = anonymousClass910.A02;
        } else {
            num = null;
        }
        this.A01 = num;
        this.A02 = anonymousClass910 != null ? anonymousClass910.A03 : null;
    }

    @Override // X.BE4
    public final List Epn() {
        return null;
    }

    @Override // X.BE4
    public final void FB5(Bundle bundle) {
    }

    @Override // X.BE4
    public final Bundle BHd() {
        Bundle A00 = AbstractC61636Rr0.A00(AbstractC167007dF.A0o("serviceType", 24), AbstractC166987dD.A1L("executionMode", Integer.valueOf(this.A00)), AbstractC166987dD.A1L("modelFiles", this.A06), AbstractC166987dD.A1L("filePaths", this.A05), AbstractC166987dD.A1L("expressionFittingModelPath", this.A03), AbstractC166987dD.A1L("useRandomSampling", Boolean.valueOf(this.A04)));
        Integer num = this.A01;
        if (num != null) {
            A00.putInt("maxDetectionDim", num.intValue());
        }
        Integer num2 = this.A02;
        if (num2 != null) {
            A00.putInt("maxDetectionScales", num2.intValue());
        }
        return A00;
    }
}
