package X;

import com.facebook.systrace.Systrace;
import java.io.InputStream;

/* renamed from: X.1Eh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23751Eh implements InterfaceC23761Ei {
    public final C222015v A00;
    public final C1EY A01;
    public final Class A02;
    public final boolean A03;
    public final boolean A04;

    @Override // X.InterfaceC23761Ei
    public final InterfaceC40801un AWy(C3JY c3jy, InputStream inputStream) {
        C23781El A01;
        C14360o3.A0B(inputStream, 1);
        if (Systrace.A0E(1L)) {
            C0fO.A01("parseStreamingHttpResponse", -1380310888);
        }
        InterfaceC40801un A00 = C3L5.A00(this.A00, c3jy, this.A01, inputStream, this.A02, this.A04);
        if (Systrace.A0E(1L)) {
            C0fO.A00(806967281);
        }
        if (this.A03 && (A00 instanceof InterfaceC55612h1) && (A01 = c3jy.A01("X-IG-ANDROID-FROM-DISK-CACHE")) != null) {
            String str = A01.A01;
            C14360o3.A06(str);
            ((InterfaceC55612h1) A00).EQi(Long.parseLong(str));
        }
        return A00;
    }

    @Override // X.InterfaceC23761Ei
    public final void onStart() {
    }

    @Override // X.InterfaceC23761Ei
    public final void onFinish() {
        this.A01.onFinish();
    }

    public C23751Eh(C222015v c222015v, C1EY c1ey, Class cls, boolean z, boolean z2) {
        this.A02 = cls;
        this.A00 = c222015v;
        this.A04 = z;
        this.A03 = z2;
        this.A01 = c1ey;
    }
}
