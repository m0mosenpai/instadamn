package X;

import android.content.Context;
import com.instagram.unifiedfilter.UnifiedFilterManager;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: X.9Mv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C209139Mv implements YPq {
    public final C209149Mw A00;
    public final java.util.Set A04 = AbstractC166987dD.A1H();
    public final java.util.Set A06 = AbstractC166987dD.A1H();
    public final java.util.Set A07 = AbstractC166987dD.A1H();
    public final Map A03 = AbstractC166987dD.A1G();
    public final Map A02 = AbstractC166987dD.A1G();
    public final java.util.Set A05 = AbstractC166987dD.A1H();
    public final StringBuilder A01 = AbstractC166987dD.A1C();

    @Override // X.YPq
    public final void AHS(BCA bca) {
        this.A00.A00(bca);
        this.A06.remove(bca);
        java.util.Set set = this.A04;
        if (set.contains(bca)) {
            bca.AHR(this);
        }
        set.remove(bca);
    }

    @Override // X.YPq
    public final boolean Bod(BCA bca) {
        return this.A04.contains(bca);
    }

    @Override // X.YPq
    public final UnifiedFilterManager CCZ() {
        throw new UnsupportedOperationException();
    }

    @Override // X.YPq
    public final void Cn8(BCA bca) {
        this.A04.add(bca);
    }

    @Override // X.YPq
    public final XOI Cto(int i, int i2) {
        XOI xoi;
        C209149Mw c209149Mw = this.A00;
        synchronized (c209149Mw) {
            StringBuilder sb = c209149Mw.A01;
            sb.setLength(0);
            sb.append(i);
            sb.append("x");
            sb.append(i2);
            String A19 = AbstractC166987dD.A19(sb);
            Map map = c209149Mw.A03;
            if (map.get(A19) == null) {
                map.put(A19, new LinkedList());
            }
            Object obj = map.get(A19);
            if (obj != null) {
                if (((List) obj).isEmpty()) {
                    xoi = new XOI(i, i2);
                } else {
                    Object obj2 = map.get(A19);
                    if (obj2 != null) {
                        xoi = (XOI) ((List) obj2).remove(0);
                    } else {
                        throw AbstractC166997dE.A0g();
                    }
                }
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        this.A07.add(xoi);
        StringBuilder sb2 = this.A01;
        sb2.setLength(0);
        sb2.append(i);
        sb2.append("x");
        sb2.append(i2);
        String A192 = AbstractC166987dD.A19(sb2);
        this.A02.put(A192, Integer.valueOf(Math.max(AbstractC167017dG.A0K((Number) r1.get(A192)) - 1, 0)));
        return xoi;
    }

    @Override // X.YPq
    public final void ECh(BCA bca, InterfaceC199658sH interfaceC199658sH) {
        int i;
        int i2;
        int i3 = 0;
        if (C15500q5.A00(this.A07).remove(interfaceC199658sH)) {
            C14360o3.A0C(interfaceC199658sH, "null cannot be cast to non-null type com.instagram.filterkit.surface.IntermediateSurface");
            XOI xoi = (XOI) interfaceC199658sH;
            C209149Mw c209149Mw = this.A00;
            synchronized (c209149Mw) {
                C14360o3.A0B(xoi, 0);
                i = xoi.A03;
                i2 = xoi.A01;
                StringBuilder sb = c209149Mw.A01;
                sb.setLength(0);
                sb.append(i);
                sb.append("x");
                sb.append(i2);
                String obj = sb.toString();
                C14360o3.A07(obj);
                Object obj2 = c209149Mw.A03.get(obj);
                if (obj2 != null) {
                    ((List) obj2).add(xoi);
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            StringBuilder sb2 = this.A01;
            sb2.setLength(0);
            sb2.append(i);
            sb2.append("x");
            sb2.append(i2);
            String obj3 = sb2.toString();
            C14360o3.A07(obj3);
            Map map = this.A02;
            Number number = (Number) map.get(obj3);
            if (number != null) {
                i3 = number.intValue();
            }
            map.put(obj3, Integer.valueOf(i3 + 1));
            this.A05.add(obj3);
        }
    }

    public C209139Mv(Context context) {
        this.A00 = new C209149Mw(context);
    }
}
