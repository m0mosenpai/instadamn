package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.facebook.proxygen.LigerSamplePolicy;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: X.9Ey, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C207199Ey extends C0YY implements InterfaceC16660sJ {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C207199Ey(int i, Object obj, Object obj2) {
        super(1);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Integer num;
        switch (this.A00) {
            case 0:
                C138986Rf c138986Rf = (C138986Rf) obj;
                C14360o3.A0B(c138986Rf, 0);
                boolean z = false;
                if (((C138986Rf) this.A01).A00 - c138986Rf.A00 > LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1:
                C139006Rh.A03((C138636Pt) this.A01, (C139006Rh) this.A02, null);
                return C0eB.A00;
            case 2:
                C47Z c47z = (C47Z) obj;
                C14360o3.A0B(c47z, 0);
                C3I2 c3i2 = (C3I2) this.A01;
                C61222qk c61222qk = (C61222qk) this.A02;
                Context context = c61222qk.A1t;
                FragmentActivity requireActivity = c61222qk.A22.requireActivity();
                if (c47z.A1f == EnumC915447k.A02) {
                    if (!c3i2.A00) {
                        C3I2.A00(c47z, c3i2);
                    }
                    C38709H2v c38709H2v = c47z.A0v;
                    if (c38709H2v != null && (num = c38709H2v.A00) != null) {
                        C9GR.A03(requireActivity, context.getString(2131956773, new SimpleDateFormat(AbstractC43591JPw.A00(652), Locale.US).format(new Date(num.intValue() * 1000))), null, 1);
                    }
                }
                return C0eB.A00;
            case 3:
                ((AnonymousClass135) this.A02).A00.removeCallbacks((Runnable) this.A01);
                return C0eB.A00;
            case 4:
                ((AnonymousClass139) this.A01).A04(null);
                return C0eB.A00;
            default:
                AnonymousClass139 anonymousClass139 = (AnonymousClass139) this.A01;
                AnonymousClass139.A01.set(anonymousClass139, null);
                anonymousClass139.A04(null);
                return C0eB.A00;
        }
    }
}
