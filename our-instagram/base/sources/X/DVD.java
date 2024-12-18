package X;

import android.content.Context;
import androidx.compose.ui.Modifier;
import com.facebook.R;
import com.facebook.common.dextricks.DalvikInternals;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class DVD extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;
    public final boolean A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DVD(Object obj, Object obj2, Object obj3, String str, int i, int i2, int i3, boolean z) {
        super(2);
        this.A00 = i3;
        this.A06 = str;
        this.A07 = z;
        this.A05 = obj;
        this.A03 = obj2;
        this.A04 = obj3;
        this.A01 = i;
        this.A02 = i2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i;
        String A17;
        switch (this.A00) {
            case 0:
                C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
                String str = this.A06;
                boolean z = this.A07;
                Number number = (Number) this.A05;
                Modifier modifier = (Modifier) this.A03;
                InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) this.A04;
                int A04 = AbstractC25225BEi.A04(this.A01);
                int i2 = this.A02;
                A0S.Enr(-1683480512);
                if ((i2 & 1) != 0) {
                    i = A04 | 6;
                } else if ((A04 & 6) == 0) {
                    i = AbstractC25232BEp.A0R(A0S, str) | A04;
                } else {
                    i = A04;
                }
                if ((i2 & 2) != 0) {
                    i |= 48;
                } else if ((A04 & 48) == 0) {
                    i |= AbstractC25232BEp.A0c(A0S, z);
                }
                if ((i2 & 4) != 0) {
                    i |= 384;
                } else if ((A04 & 384) == 0) {
                    i |= AbstractC25232BEp.A0T(A0S, number);
                }
                int i3 = i2 & 8;
                if (i3 != 0) {
                    i |= 3072;
                } else if ((A04 & 3072) == 0) {
                    i |= AbstractC25232BEp.A0U(A0S, modifier);
                }
                int i4 = i2 & 16;
                if (i4 != 0) {
                    i |= DalvikInternals.IOPRIO_BACKGROUND;
                } else if ((A04 & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
                    i |= AbstractC25232BEp.A0L(A0S, interfaceC16820sZ);
                }
                if ((i & 9363) == 9362 && A0S.Bxj()) {
                    A0S.Em9();
                } else {
                    if (i3 != 0) {
                        modifier = Modifier.A00;
                    }
                    if (i4 != 0) {
                        interfaceC16820sZ = null;
                    }
                    if (C0fH.A02()) {
                        C0fH.A01(-942383290, "com.instagram.barcelona.feed.post.ui.RepostedLabel (RepostedLabel.kt:19)");
                    }
                    Context A0K = AbstractC25228BEl.A0K(A0S);
                    if (z) {
                        A0S.Eno(693950215);
                        A17 = C5YD.A00(A0S, 2131953757);
                    } else {
                        A0S.Eno(694028769);
                        A17 = AbstractC25228BEl.A17(A0S, str, 2131953746);
                    }
                    AbstractC25225BEi.A1V(A0S, false);
                    if (number != null) {
                        long A0L = AbstractC166987dD.A0L(System.currentTimeMillis());
                        long longValue = number.longValue();
                        long j = A0L - longValue;
                        TimeUnit timeUnit = TimeUnit.SECONDS;
                        long minutes = timeUnit.toMinutes(j);
                        long hours = timeUnit.toHours(j);
                        if ((0 <= minutes && minutes < 60) || (1 <= hours && hours < 13)) {
                            C14360o3.A0B(A0K, 0);
                            A17 = AnonymousClass001.A0T(A17, C23831Eq.A0E(AbstractC166997dE.A0M(A0K), EnumC89613z1.A04, C05F.A01, longValue, false, false), ' ');
                        }
                    }
                    CEM.A00(A0S, modifier, A17, null, interfaceC16820sZ, null, null, R.drawable.instagram_reshare_pano_outline_24, (i & 7168) | (i & 57344), 100);
                    if (C0fH.A02()) {
                        C0fH.A00(-864920454);
                    }
                }
                C5UU ASZ = A0S.ASZ();
                if (ASZ != null) {
                    ASZ.A06 = new DVD(number, modifier, interfaceC16820sZ, str, A04, i2, 0, z);
                    break;
                }
                break;
            case 1:
                C5Tl A0S2 = AbstractC25226BEj.A0S(obj, obj2);
                InterfaceC16660sJ interfaceC16660sJ = (InterfaceC16660sJ) this.A04;
                AbstractC28035CXj.A01(A0S2, (Modifier) this.A03, (C44508JmE) this.A05, this.A06, interfaceC16660sJ, AbstractC25225BEi.A04(this.A01), this.A02, this.A07);
                break;
            default:
                C5Tl A0S3 = AbstractC25226BEj.A0S(obj, obj2);
                InterfaceC16820sZ interfaceC16820sZ2 = (InterfaceC16820sZ) this.A04;
                CGM.A00(A0S3, (Modifier) this.A03, (C6N) this.A05, this.A06, interfaceC16820sZ2, AbstractC25225BEi.A04(this.A01), this.A02, this.A07);
                break;
        }
        return C0eB.A00;
    }
}
