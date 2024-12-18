package X;

import com.facebook.R;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Ab4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23489Ab4 implements InterfaceC73611YPy {
    public int A00;
    public int A01;
    public C23017ACw A02;

    @Override // X.InterfaceC73611YPy
    public final EnumC200638u6 B7w() {
        return EnumC200638u6.LUM;
    }

    @Override // X.InterfaceC73611YPy
    public final boolean CLe() {
        return this.A02.A05(EnumC200638u6.LUM);
    }

    @Override // X.InterfaceC73611YPy
    public final boolean E6G(C201278vB c201278vB, boolean z) {
        C23017ACw c23017ACw = this.A02;
        if (!c23017ACw.A04(c201278vB, z)) {
            Iterator it = c23017ACw.A06.A00.iterator();
            while (it.hasNext()) {
                if (((C200608u3) it.next()).A02) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC73611YPy
    public final void ENR() {
        this.A02.A01();
    }

    @Override // X.InterfaceC73611YPy
    public final void EVx(boolean z) {
        this.A02.A04 = z;
    }

    @Override // X.InterfaceC73611YPy
    public final void EcA(List list) {
        this.A02.A03(this, list);
    }

    @Override // X.InterfaceC73611YPy
    public final void release() {
        this.A02.A00();
    }

    @Override // X.InterfaceC73611YPy
    public final void setSize(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        this.A02.A02(i, i2);
    }

    @Override // X.InterfaceC73611YPy
    public final void CNr(InterfaceC178897x1 interfaceC178897x1, C179877yd c179877yd) {
        release();
        setSize(this.A01, this.A00);
        C23017ACw c23017ACw = this.A02;
        AAP aap = new AAP(c179877yd, R.raw.lum_vs, R.raw.lum_fs, true);
        if (c23017ACw.A0B != null) {
            AAP aap2 = c23017ACw.A0B;
            C200688uB c200688uB = aap2.A02;
            if (c200688uB != null) {
                c200688uB.A01();
                aap2.A02 = null;
            }
            aap2.A03.A02();
        }
        c23017ACw.A0B = aap;
    }
}
