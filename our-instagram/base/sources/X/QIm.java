package X;

import android.content.Context;
import com.facebook.pushlite.model.PushInfraMetaData;

/* loaded from: classes10.dex */
public final class QIm extends C0T6 {
    public Integer A00;
    public boolean A01;
    public boolean A02;
    public final Context A03;
    public final PushInfraMetaData A04;
    public final InterfaceC65492TlE A05;
    public final InterfaceC65492TlE A06;
    public final String A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof QIm) {
                QIm qIm = (QIm) obj;
                if (!C14360o3.A0K(this.A03, qIm.A03) || !C14360o3.A0K(this.A06, qIm.A06) || !C14360o3.A0K(this.A05, qIm.A05) || !C14360o3.A0K(this.A04, qIm.A04) || !C14360o3.A0K(this.A07, qIm.A07) || !C14360o3.A0K(this.A00, qIm.A00) || this.A02 != qIm.A02 || this.A01 != qIm.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0D = AbstractC167007dF.A0D(this.A02, (AbstractC166997dE.A0K(this.A07, AbstractC166997dE.A0J(this.A04, (((AbstractC166987dD.A0G(this.A03) + AbstractC167017dG.A0M(this.A06)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31)) + AbstractC166997dE.A0I(this.A00)) * 31);
        int i = 1237;
        if (this.A01) {
            i = 1231;
        }
        return A0D + i;
    }

    public QIm(Context context, PushInfraMetaData pushInfraMetaData, InterfaceC65492TlE interfaceC65492TlE, InterfaceC65492TlE interfaceC65492TlE2, Integer num, String str, boolean z, boolean z2) {
        this.A03 = context;
        this.A06 = interfaceC65492TlE;
        this.A05 = interfaceC65492TlE2;
        this.A04 = pushInfraMetaData;
        this.A07 = str;
        this.A00 = num;
        this.A02 = z;
        this.A01 = z2;
    }
}
