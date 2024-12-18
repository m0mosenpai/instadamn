package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.TxZ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC65980TxZ {
    public static C65974TxR A00(UserSession userSession, C1GL c1gl, InterfaceC169457hL interfaceC169457hL, InterfaceC37294Gbv interfaceC37294Gbv, InterfaceC169497hP interfaceC169497hP, Integer num, long j, long j2, boolean z, boolean z2) {
        InterfaceC169457hL interfaceC169457hL2 = interfaceC169457hL;
        if (!(interfaceC169457hL instanceof InterfaceC169467hM)) {
            if (interfaceC37294Gbv == null) {
                C14360o3.A0F("listener");
                throw C00O.createAndThrow();
            }
            interfaceC169457hL2 = new C24034AlT(c1gl, interfaceC37294Gbv);
        }
        C14360o3.A0C(interfaceC169457hL2, "null cannot be cast to non-null type com.instagram.search.common.typeahead.manager.RequestTaskTypeaheadManagerResultProvider.Delegate<ValueType of com.instagram.search.common.typeahead.manager.QueuedTypeaheadManagerBuilder, ResponseType of com.instagram.search.common.typeahead.manager.QueuedTypeaheadManagerBuilder>");
        return new C65974TxR(userSession, interfaceC169457hL2, new C65979TxY((InterfaceC169467hM) interfaceC169457hL2), interfaceC169497hP, num, j2, j, z2, z);
    }

    public static C65974TxR A01(UserSession userSession, C1GL c1gl, InterfaceC169457hL interfaceC169457hL, InterfaceC37294Gbv interfaceC37294Gbv, InterfaceC169497hP interfaceC169497hP, Integer num, boolean z) {
        InterfaceC169457hL interfaceC169457hL2 = interfaceC169457hL;
        if (!(interfaceC169457hL instanceof InterfaceC169467hM)) {
            if (interfaceC37294Gbv == null) {
                C14360o3.A0F("listener");
                throw C00O.createAndThrow();
            }
            interfaceC169457hL2 = new C24034AlT(c1gl, interfaceC37294Gbv);
        }
        C14360o3.A0C(interfaceC169457hL2, "null cannot be cast to non-null type com.instagram.search.common.typeahead.manager.RequestTaskTypeaheadManagerResultProvider.Delegate<ValueType of com.instagram.search.common.typeahead.manager.QueuedTypeaheadManagerBuilder, ResponseType of com.instagram.search.common.typeahead.manager.QueuedTypeaheadManagerBuilder>");
        return new C65974TxR(userSession, interfaceC169457hL2, new C65979TxY((InterfaceC169467hM) interfaceC169457hL2), interfaceC169497hP, num, 200L, 0L, z, false);
    }
}
