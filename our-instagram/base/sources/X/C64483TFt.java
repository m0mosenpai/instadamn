package X;

import android.app.Activity;
import android.content.Context;
import android.util.Pair;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.TFt, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64483TFt implements InterfaceC23471Cj {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C64483TFt(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A02 = obj3;
        this.A04 = obj4;
        this.A03 = obj2;
        this.A01 = obj;
    }

    @Override // X.InterfaceC23471Cj
    public final void DYE(Map map) {
        C4IC c4ic;
        C4IC c4ic2;
        Object obj;
        Object obj2;
        switch (this.A00) {
            case 0:
                obj = map.get("android.permission.READ_EXTERNAL_STORAGE");
                if (obj == EnumC172127lh.A05) {
                    Context context = (Context) this.A03;
                    C6FQ c6fq = (C6FQ) this.A04;
                    C6FW c6fw = (C6FW) this.A02;
                    C14360o3.A0A(c6fw);
                    AbstractC63326Sha.A01(context, c6fq, c6fw);
                    return;
                }
                break;
            case 1:
                Object obj3 = map.get("android.permission.CAMERA");
                if (obj3 == EnumC172127lh.A05) {
                    AbstractC63088ScB.A01((Context) this.A03, (C6FQ) this.A04, (C6FW) this.A02);
                    return;
                } else {
                    if (obj3 != EnumC172127lh.A04) {
                        return;
                    }
                    WGH.A03((Activity) this.A01, 2131954587);
                    return;
                }
            case 2:
                C14360o3.A0B(map, 0);
                Context context2 = (Context) this.A03;
                obj = map.get(AbstractC63088ScB.A00(context2));
                if (obj == EnumC172127lh.A05) {
                    AbstractC63088ScB.A02(context2, (C6FQ) this.A04, (C6FW) this.A02);
                    return;
                }
                break;
            case 3:
                C14360o3.A0B(map, 0);
                if (map.get(AbstractC43591JPw.A00(2)) == EnumC172127lh.A05) {
                    C63158SeF.A00((Fragment) this.A03, (C6FG) this.A01, (C6FQ) this.A02, (InterfaceC103384lE) this.A04);
                    return;
                }
                C6BQ.A0E((C6FQ) this.A02, (InterfaceC103384lE) this.A04, (C6FG) this.A01, false);
                return;
            case 4:
                C14360o3.A0A(map);
                ArrayList A0k = MSY.A0k(map);
                Iterator A15 = AbstractC166997dE.A15(map);
                while (A15.hasNext()) {
                    Map.Entry A1K = AbstractC166987dD.A1K(A15);
                    Object key = A1K.getKey();
                    EnumC172127lh enumC172127lh = (EnumC172127lh) A1K.getValue();
                    C14360o3.A0A(enumC172127lh);
                    int ordinal = enumC172127lh.ordinal();
                    if (ordinal != 1) {
                        if (ordinal != 0) {
                            if (ordinal == 2) {
                                c4ic = C4IC.A08;
                            } else {
                                throw B4Z.A00();
                            }
                        } else {
                            c4ic = C4IC.A06;
                        }
                    } else {
                        c4ic = C4IC.A05;
                    }
                    AbstractC166997dE.A1R(key, c4ic, A0k);
                }
                ((X9O) this.A02).DYF(((C69686VtW) this.A01).A00(AbstractC06930Yk.A08(A0k)), (Integer) this.A03);
                return;
            case 5:
                C14360o3.A0A(map);
                C63318ShQ c63318ShQ = (C63318ShQ) this.A04;
                ArrayList A0k2 = MSY.A0k(map);
                Iterator A152 = AbstractC166997dE.A15(map);
                while (A152.hasNext()) {
                    Map.Entry A1K2 = AbstractC166987dD.A1K(A152);
                    Object key2 = A1K2.getKey();
                    EnumC172127lh enumC172127lh2 = (EnumC172127lh) A1K2.getValue();
                    C14360o3.A0A(enumC172127lh2);
                    int ordinal2 = enumC172127lh2.ordinal();
                    if (ordinal2 != 1) {
                        if (ordinal2 != 0) {
                            if (ordinal2 == 2) {
                                c4ic2 = C4IC.A08;
                            } else {
                                throw B4Z.A00();
                            }
                        } else {
                            c4ic2 = C4IC.A06;
                        }
                    } else {
                        c4ic2 = C4IC.A05;
                    }
                    AbstractC166997dE.A1R(key2, c4ic2, A0k2);
                }
                Map A08 = AbstractC06930Yk.A08(A0k2);
                C62560SGl c62560SGl = (C62560SGl) this.A02;
                C51760Mtj c51760Mtj = (C51760Mtj) this.A03;
                C14360o3.A07(((Context) this.A01).getApplicationContext());
                Map A01 = C63318ShQ.A01(c51760Mtj, c63318ShQ, A08);
                LinkedHashMap A1I = AbstractC166987dD.A1I();
                Iterator A12 = AbstractC43593JPy.A12(A01);
                while (A12.hasNext()) {
                    Object next = A12.next();
                    Object obj4 = A01.get(next);
                    if (obj4 != null) {
                        if (c62560SGl.A02 && obj4 == C4IC.A08) {
                            obj4 = C4IC.A05;
                        }
                        A1I.put(next, obj4);
                    }
                }
                C131845xK.A00(c62560SGl.A00, AbstractC31179DnN.A0I(A1I).A00(), c62560SGl.A01);
                return;
            default:
                EnumC172127lh A012 = AbstractC23451Ch.A01(map, (String[]) this.A02);
                C14360o3.A07(A012);
                EnumC172127lh enumC172127lh3 = EnumC172127lh.A05;
                C62571SGw c62571SGw = (C62571SGw) this.A01;
                if (A012 == enumC172127lh3) {
                    c62571SGw.A00.A05.DYH();
                } else {
                    List list = c62571SGw.A01;
                    C63002SaQ c63002SaQ = c62571SGw.A00;
                    ArrayList A1E = AbstractC166987dD.A1E();
                    for (Object obj5 : list) {
                        InterfaceC65553TmW interfaceC65553TmW = (InterfaceC65553TmW) obj5;
                        String BcU = interfaceC65553TmW.BcU();
                        SM4 sm4 = c63002SaQ.A04;
                        C14360o3.A0B(BcU, 0);
                        if (!AbstractC23451Ch.A07(sm4.A01, BcU) && interfaceC65553TmW.Cbx()) {
                            A1E.add(obj5);
                        }
                    }
                    if (A1E.isEmpty()) {
                        c63002SaQ.A05.DYH();
                    } else {
                        Iterator it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj2 = it.next();
                                String BcU2 = ((InterfaceC65553TmW) obj2).BcU();
                                SM4 sm42 = c63002SaQ.A04;
                                C14360o3.A0B(BcU2, 0);
                                if (!AbstractC23451Ch.A07(sm42.A01, BcU2)) {
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                        InterfaceC65553TmW interfaceC65553TmW2 = (InterfaceC65553TmW) obj2;
                        if (interfaceC65553TmW2 != null) {
                            if (!interfaceC65553TmW2.Cbx()) {
                                C63002SaQ.A00(c63002SaQ, A1E, c62571SGw.A02);
                            } else if ((interfaceC65553TmW2 instanceof QJX) || (interfaceC65553TmW2 instanceof QJY)) {
                                c63002SaQ.A05.DYG();
                                c63002SaQ.A04.A00(c63002SaQ.A03, interfaceC65553TmW2.BcV());
                            }
                        }
                    }
                    Map map2 = ((SM4) this.A04).A02;
                    map2.clear();
                    C14360o3.A0A(map);
                    map2.putAll(map);
                }
                C4IA c4ia = C4IA.A05;
                C4IB c4ib = C4IB.A0C;
                List A1Q = AbstractC16960so.A1Q(new Pair(c4ia, c4ib), new Pair(C4IA.A09, c4ib));
                UserSession userSession = (UserSession) this.A03;
                C14360o3.A0A(map);
                new C4I7(new C19270xB("RtcCallPermissionsManager"), userSession).A01(C4I8.A00(userSession), "RTC_CALL_PERMISSIONS_MANAGER", A1Q, AbstractC166987dD.A1J(C4I9.UNKNOWN), map);
                return;
        }
        if (obj != EnumC172127lh.A04) {
            return;
        }
        WGH.A01((Activity) this.A01);
    }
}
