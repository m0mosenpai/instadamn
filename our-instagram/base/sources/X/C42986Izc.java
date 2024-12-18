package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;

/* renamed from: X.Izc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42986Izc implements C5KF {
    public final C006802i A00;
    public final UserSession A01;
    public final AtomicInteger A02;

    @Override // X.C5KF
    public final void DFH(EnumC64222vh enumC64222vh, Map map) {
        C14360o3.A0B(enumC64222vh, 1);
        C14360o3.A0B(map, 0);
        String A0f = AbstractC37302Gc3.A0f(map);
        HashMap A1G = AbstractC166987dD.A1G();
        LinkedHashSet A0l = AbstractC31171DnF.A0l();
        LinkedHashSet A0l2 = AbstractC31171DnF.A0l();
        A00("ad_and_netego_realtime_information", map, A0l2);
        A00("seen_sponsored_reels", map, A0l2);
        A00("organic_realtime_information", map, A0l);
        A00("seen_organic_reels", map, A0l);
        EnumC64262vl enumC64262vl = EnumC64262vl.A04;
        A1G.put(enumC64262vl.toString(), A0l);
        EnumC64262vl enumC64262vl2 = EnumC64262vl.A05;
        String obj = enumC64262vl2.toString();
        A1G.put(obj, A0l2);
        UserSession userSession = this.A01;
        C34E A00 = C34C.A00(userSession);
        AnonymousClass317 anonymousClass317 = AnonymousClass317.A0M;
        java.util.Set AUW = A00.AUW(enumC64262vl2, anonymousClass317, enumC64222vh);
        java.util.Set AUW2 = C34C.A00(userSession).AUW(EnumC64262vl.A03, anonymousClass317, enumC64222vh);
        C34C.A00(userSession).AUW(enumC64262vl, anonymousClass317, enumC64222vh);
        this.A02.getAndIncrement();
        LinkedHashSet A002 = AnonymousClass090.A00(AUW2, AUW);
        java.util.Set set = (java.util.Set) A1G.get(obj);
        if (set == null) {
            set = C16910sj.A00;
        }
        InterfaceC25441Ly interfaceC25441Ly = ((C25381Ls) C25361Lq.A00(userSession)).A00;
        List AbA = interfaceC25441Ly.AbA();
        ArrayList A12 = AbstractC166997dE.A12(AbA, 0);
        for (Object obj2 : AbA) {
            C9C7 c9c7 = (C9C7) ((C9BW) obj2).A01;
            if (c9c7.A04 == anonymousClass317 && c9c7.A05 == enumC64222vh) {
                A12.add(obj2);
            }
        }
        AnonymousClass317 anonymousClass3172 = AnonymousClass317.A0N;
        List AbA2 = interfaceC25441Ly.AbA();
        ArrayList A122 = AbstractC166997dE.A12(AbA2, 0);
        for (Object obj3 : AbA2) {
            C9C7 c9c72 = (C9C7) ((C9BW) obj3).A01;
            if (c9c72.A04 == anonymousClass3172 && c9c72.A05 == enumC64222vh) {
                A122.add(obj3);
            }
        }
        HashMap A02 = AbstractC06930Yk.A02(AbstractC166987dD.A1L("surface_type", enumC64222vh.toString()), AbstractC166987dD.A1L("signal_type", anonymousClass317.toString()), AbstractC166987dD.A1L("sponsored_second_channel_ids", A002.toString()), AbstractC166987dD.A1L("sponsored_second_channel_ids_count", String.valueOf(A002.size())), AbstractC166987dD.A1L("sponsored_second_channel_only_ids", AbstractC001800i.A0m(A002, set).toString()), AbstractC166987dD.A1L("sponsored_realtime_signal_ids", set.toString()), AbstractC166987dD.A1L("sponsored_realtime_signal_ids_count", String.valueOf(set.size())), AbstractC166987dD.A1L("sponsored_realtime_signal_only_ids", AbstractC001800i.A0m(set, A002).toString()), AbstractC166987dD.A1L("sponsored_realtime_signals_remain_in_memory", A12.toString()), AbstractC166987dD.A1L("realtime_history", A122.toString()));
        InterfaceC02590Ai A0f2 = AbstractC166987dD.A0f(AbstractC12220kQ.A02(userSession), "instagram_ad_realtime_diversity_debug");
        if (A0f2.isSampled()) {
            A0f2.AAP(AbstractC111324zv.A00(164), "client_ad_request");
            A0f2.AAP("join_id", A0f);
            A0f2.A9M("extra_info_map", A02);
            A0f2.A7v("is_from_client", true);
            A0f2.Cht();
        }
    }

    public /* synthetic */ C42986Izc(UserSession userSession) {
        C006802i c006802i = C006802i.A0p;
        AtomicInteger atomicInteger = new AtomicInteger(1);
        C14360o3.A0B(c006802i, 2);
        this.A01 = userSession;
        this.A00 = c006802i;
        this.A02 = atomicInteger;
    }

    public static final void A00(String str, Map map, java.util.Set set) {
        String A1A = AbstractC166987dD.A1A(str, map);
        if (A1A != null) {
            JSONArray jSONArray = new JSONArray(A1A);
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                String string = jSONArray.getJSONObject(i).getString("item_id");
                if (string != null) {
                    set.add(string);
                }
            }
        }
    }
}
