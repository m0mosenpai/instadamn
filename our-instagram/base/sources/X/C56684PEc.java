package X;

import com.facebook.rtc.views.omnigrid.GridItemSize;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.PEc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56684PEc implements XB0 {
    public final /* synthetic */ NXW A00;

    public C56684PEc(NXW nxw) {
        this.A00 = nxw;
    }

    @Override // X.XB0
    public final void Dzt(int i, int i2) {
        C51905Mwn c51905Mwn;
        NXW nxw = this.A00;
        C51681MsC c51681MsC = nxw.A00;
        if (c51681MsC != null) {
            O57 o57 = nxw.A05;
            String str = c51681MsC.A09;
            C14360o3.A0B(str, 0);
            LinkedHashMap A1I = AbstractC166987dD.A1I();
            C52690NTb c52690NTb = o57.A00;
            Map map = c52690NTb.A0D;
            A1I.putAll(map);
            boolean A06 = C52690NTb.A06(A1I);
            boolean A05 = C52690NTb.A05(A1I);
            A1I.put(AbstractC25228BEl.A13(str), new GridItemSize(i, i2));
            boolean A062 = C52690NTb.A06(A1I);
            boolean A052 = C52690NTb.A05(A1I);
            map.clear();
            map.putAll(A1I);
            if (A06 != A062 || A05 != A052) {
                C51905Mwn c51905Mwn2 = (C51905Mwn) ((AbstractC55206OeJ) c52690NTb).A01;
                if (c51905Mwn2 != null) {
                    c51905Mwn = C51905Mwn.A02(c51905Mwn2, null, AbstractC06930Yk.A0B(map), 130047);
                } else {
                    c51905Mwn = null;
                }
                c52690NTb.A0J(c51905Mwn);
            }
        }
    }
}
