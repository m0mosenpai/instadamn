package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.98N, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C98N extends C98O {
    public static int A0E = 1;
    public Boolean A00;
    public Boolean A01;
    public final C69613Av A02;
    public final C69613Av A03;
    public final C69613Av A04;
    public final C69613Av A05;
    public final C69613Av A06;
    public final C69613Av A07;
    public final C69613Av A08;
    public final EnumC92794Ds A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC83713oG A0B;
    public final Boolean A0C;
    public final boolean A0D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C98N(UserSession userSession, EnumC92794Ds enumC92794Ds, InterfaceC83713oG interfaceC83713oG, Boolean bool, boolean z, boolean z2) {
        super(userSession, "messages", 31784972, z, true);
        C14360o3.A0B(enumC92794Ds, 4);
        this.A09 = enumC92794Ds;
        this.A0B = interfaceC83713oG;
        this.A0C = bool;
        this.A00 = null;
        this.A0D = z2;
        this.A02 = A02("inflate_composer");
        this.A05 = A02("on_create_direct_thread_toggle_fragment");
        this.A06 = A02("on_create_view_direct_thread_toggle_fragment");
        this.A04 = A02("on_create_direct_thread_data_view_model");
        this.A07 = A02("on_view_created_direct_thread_toggle_fragment");
        this.A08 = A02("thread_loaded");
        this.A03 = A02("initial_resnapshot");
        this.A0A = AbstractC09440dt.A00(EnumC09460dv.A02, new C9E3(this, 33));
    }

    @Override // X.C98O, X.AbstractC69603Au
    public final void A05() {
        super.A05();
        if (this.A09 == EnumC92794Ds.A04) {
            A0K("is_tangerine", this.A0D);
            A0K("has_linked_open_thread_id", false);
        }
        Boolean bool = this.A0C;
        if (bool != null) {
            A0K("has_instantiated", bool.booleanValue());
        }
        Boolean bool2 = this.A01;
        if (bool2 != null) {
            A0K(AbstractC111324zv.A00(2717), bool2.booleanValue());
        }
        Boolean bool3 = this.A00;
        if (bool3 != null) {
            A0K("is_group", bool3.booleanValue());
        }
        int i = A0E;
        A0E = i + 1;
        A0G("count_since_cold_start", i);
    }
}
