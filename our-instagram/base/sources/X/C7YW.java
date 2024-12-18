package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* renamed from: X.7YW, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7YW extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C7XQ A01;
    public final /* synthetic */ String A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7YW(C7XQ c7xq, String str, int i) {
        super(0);
        this.A01 = c7xq;
        this.A00 = i;
        this.A02 = str;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        C7XQ c7xq = this.A01;
        AbstractC59962oe abstractC59962oe = c7xq.A0E;
        UserSession userSession = c7xq.A0G;
        C7WZ c7wz = c7xq.A0H;
        InterfaceC11380iw interfaceC11380iw = c7wz.A02;
        String str = c7wz.A09;
        String str2 = c7xq.A0K;
        int i = this.A00;
        EnumC92794Ds enumC92794Ds = c7wz.A07;
        String str3 = this.A02;
        InterfaceC16820sZ interfaceC16820sZ = c7xq.A0t;
        C41761wQ c41761wQ = c7xq.A0F;
        Bundle bundle = c7wz.A00;
        return new C7YX(abstractC59962oe, interfaceC11380iw, c41761wQ, userSession, enumC92794Ds, str, str2, str3, bundle.getString("direct_channel_creation_title", null), bundle.getString("DirectThreadFragment.DIRECT_THREAD_FRAGMENT_ARGUMENT_DISPLAY_LOCATION", null), bundle.getString("direct_story_creator_id", null), interfaceC16820sZ, i, bundle.getBoolean("direct_is_creating_social_channel", false));
    }
}
