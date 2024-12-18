package X;

import java.text.BreakIterator;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.2ue, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C63572ue {
    public InterfaceC63562ud A00;
    public C63502uX A01;
    public C63512uY A02;
    public final C63532ua A09;
    public final C63522uZ A0A;
    public final Map A08 = new HashMap();
    public final Map A06 = new HashMap();
    public final HashMap A03 = new HashMap();
    public final Map A07 = new HashMap();
    public final Map A04 = new HashMap();
    public final Map A05 = new HashMap();

    public final synchronized C82493mD A03(String str) {
        C82493mD c82493mD;
        C14360o3.A0B(str, 0);
        c82493mD = (C82493mD) this.A08.get(str);
        if (c82493mD == null) {
            c82493mD = new C82493mD(C82503mE.A00(str), C82503mE.A00(str));
        }
        return c82493mD;
    }

    private final boolean A01(InterfaceC82463mA interfaceC82463mA, C82493mD c82493mD) {
        List list = c82493mD.A01.A07;
        if ((!list.isEmpty()) && ((C82523mG) list.get(list.size() - 1)).A00 != -1) {
            return true;
        }
        if (!interfaceC82463mA.BWW() && interfaceC82463mA.C0M() == C05F.A01 && !c82493mD.A00.A00()) {
            return true;
        }
        return false;
    }

    public final synchronized C82543mI A02(InterfaceC82463mA interfaceC82463mA, InterfaceC82483mC interfaceC82483mC) {
        C82543mI c82543mI;
        String BK3 = interfaceC82463mA.BK3();
        C82493mD A04 = C82503mE.A00.A04(interfaceC82463mA, A03(BK3));
        Map map = this.A06;
        InterfaceC82423m6 DSw = this.A00.DSw((InterfaceC82423m6) map.get(BK3), new C206859Dq(interfaceC82463mA, 20));
        C14360o3.A0B(BK3, 0);
        Map map2 = this.A07;
        C82533mH c82533mH = (C82533mH) map2.get(BK3);
        if (c82533mH == null) {
            c82533mH = new C82533mH();
        }
        List<InterfaceC82443m8> Avb = interfaceC82463mA.Avb();
        C14360o3.A0B(Avb, 1);
        for (InterfaceC82443m8 interfaceC82443m8 : Avb) {
            C14360o3.A0B(interfaceC82443m8, 0);
            c82533mH.A00.put(interfaceC82443m8.Epo(), interfaceC82443m8);
        }
        map2.put(BK3, c82533mH);
        String str = "";
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText("");
        if (characterInstance.last() <= 0) {
            str = "Sessionless";
        }
        String BZh = interfaceC82463mA.BZh();
        if (BZh == null) {
            BZh = null;
        }
        List singletonList = Collections.singletonList(A04);
        C14360o3.A07(singletonList);
        A01(interfaceC82463mA, A04);
        c82543mI = new C82543mI(DSw, c82533mH, null, str, BK3, BZh, singletonList);
        if (BZh != null) {
            HashMap hashMap = this.A03;
            if (!hashMap.containsKey(BK3)) {
                hashMap.put(BK3, BZh);
            }
        }
        if (A01(interfaceC82463mA, A04)) {
            String str2 = (String) this.A03.get(BK3);
            if (str2 == null) {
                str2 = null;
            }
            interfaceC82483mC.E11(c82543mI, null, str2);
            this.A08.put(BK3, new C82493mD(C82503mE.A00(BK3), C82503mE.A00(BK3)));
            map.remove(BK3);
            map2.remove(BK3);
            this.A04.remove(BK3);
        } else {
            this.A08.put(BK3, A04);
            if (DSw != null) {
                map.put(BK3, DSw);
            }
        }
        String str3 = (String) this.A03.get(BK3);
        if (str3 == null) {
            str3 = null;
        }
        interfaceC82483mC.E11(c82543mI, false, str3);
        return c82543mI;
    }

    public C63572ue(C63532ua c63532ua, InterfaceC63562ud interfaceC63562ud, C63502uX c63502uX, C63522uZ c63522uZ, C63512uY c63512uY) {
        this.A01 = c63502uX;
        this.A02 = c63512uY;
        this.A0A = c63522uZ;
        this.A00 = interfaceC63562ud;
        this.A09 = c63532ua;
    }

    public static final void A00(List list, int i, int i2, long j) {
        C82523mG c82523mG = (C82523mG) AbstractC001800i.A0L(list);
        if (i2 >= i) {
            if (c82523mG == null || c82523mG.A00 != -1) {
                list.add(new C82523mG(j, -1L));
                return;
            }
            return;
        }
        if (c82523mG == null || c82523mG.A00 != -1) {
            return;
        }
        c82523mG.A00 = j;
    }
}
