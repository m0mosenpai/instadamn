package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;

/* loaded from: classes9.dex */
public abstract class OP6 {
    public static final void A00(EnumC53347Nix enumC53347Nix, InterfaceC11380iw interfaceC11380iw, AbstractC12990ll abstractC12990ll, String str, String str2) {
        C14360o3.A0B(abstractC12990ll, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, abstractC12990ll), "ig_wearable_share_from_glasses");
        A0f.AAP(TraceFieldType.RequestID, str);
        A0f.A7v("is_success", AbstractC31173DnH.A0e(A0f, "event_type", "IPC_REQUEST_RECEIVED", true));
        A0f.AAP("ipc_action_type", str2);
        MSW.A1O(enumC53347Nix, A0f);
        A0f.Cht();
    }

    public static final void A01(EnumC53347Nix enumC53347Nix, InterfaceC11380iw interfaceC11380iw, AbstractC12990ll abstractC12990ll, String str, String str2, boolean z) {
        C14360o3.A0B(interfaceC11380iw, 1);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, abstractC12990ll), "ig_wearable_share_from_glasses");
        A0f.AAP(TraceFieldType.RequestID, str);
        A0f.A7v("is_success", AbstractC31173DnH.A0e(A0f, "event_type", "STORY_PUBLISH", z));
        MSW.A1O(enumC53347Nix, A0f);
        A0f.AAP(DevServerEntity.COLUMN_DESCRIPTION, str2);
        A0f.Cht();
    }
}
